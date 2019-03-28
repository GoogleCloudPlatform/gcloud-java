/*
 * Copyright 2017 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spanner;

import static com.google.cloud.spanner.SpannerMatchers.isSpannerException;
import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.mock;

import com.google.api.gax.retrying.RetrySettings;
import com.google.cloud.NoCredentials;
import com.google.cloud.spanner.spi.v1.SpannerRpc;
import io.grpc.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.threeten.bp.Duration;

/** Unit tests for {@link SpannerImpl#runWithRetries}. */
@RunWith(JUnit4.class)
public class SpannerImplRetryTest {
  private static final String PROJECT_ID = "Test-Project";

  interface StringCallable extends Callable<String> {
    @Override
    String call();
  }

  static class RetryableException extends SpannerException {
    RetryableException(ErrorCode code, @Nullable String message) {
      // OK to instantiate SpannerException directly for this unit test.
      super(DoNotConstructDirectly.ALLOWED, code, true, message, null);
    }
  }

  static class NonRetryableException extends SpannerException {
    NonRetryableException(ErrorCode code, @Nullable String message) {
      super(DoNotConstructDirectly.ALLOWED, code, false, message, null);
    }
  }

  @Rule public ExpectedException expectedException = ExpectedException.none();
  SpannerImpl spanner;
  StringCallable callable;

  @Before
  public void setUp() {
    callable = Mockito.mock(StringCallable.class);
    SpannerOptions options =
        SpannerOptions.newBuilder()
            .setCredentials(NoCredentials.getInstance())
            .setProjectId(PROJECT_ID)
            .build();
    SpannerRpc rpc = mock(SpannerRpc.class);
    spanner = new SpannerImpl(rpc, options);
  }

  @Test
  public void ok() {
    Mockito.when(callable.call()).thenReturn("r");
    assertThat(spanner.runWithRetries(callable, SpannerImpl.DEFAULT_RETRY_ERROR_CODES))
        .isEqualTo("r");
  }

  @Test
  public void nonRetryableFailure() {
    Mockito.when(callable.call())
        .thenThrow(new NonRetryableException(ErrorCode.FAILED_PRECONDITION, "Failed by test"));
    expectedException.expect(isSpannerException(ErrorCode.FAILED_PRECONDITION));
    spanner.runWithRetries(callable, SpannerImpl.DEFAULT_RETRY_ERROR_CODES);
  }

  @Test
  public void retryableFailure() {
    Mockito.when(callable.call())
        .thenThrow(new RetryableException(ErrorCode.UNAVAILABLE, "Failure #1"))
        .thenThrow(new RetryableException(ErrorCode.UNAVAILABLE, "Failure #2"))
        .thenThrow(new RetryableException(ErrorCode.UNAVAILABLE, "Failure #3"))
        .thenReturn("r");
    assertThat(spanner.runWithRetries(callable, SpannerImpl.DEFAULT_RETRY_ERROR_CODES))
        .isEqualTo("r");
  }

  @Test
  public void retryableFailureFollowedByPermanentFailure() {
    Mockito.when(callable.call())
        .thenThrow(new RetryableException(ErrorCode.UNAVAILABLE, "Failure #1"))
        .thenThrow(new RetryableException(ErrorCode.UNAVAILABLE, "Failure #2"))
        .thenThrow(new RetryableException(ErrorCode.UNAVAILABLE, "Failure #3"))
        .thenThrow(new NonRetryableException(ErrorCode.FAILED_PRECONDITION, "Failed by test"));
    expectedException.expect(isSpannerException(ErrorCode.FAILED_PRECONDITION));
    spanner.runWithRetries(callable, SpannerImpl.DEFAULT_RETRY_ERROR_CODES);
  }

  @Test
  public void contextCancelled() {
    SpannerOptions options =
        SpannerOptions.newBuilder()
            .setCredentials(NoCredentials.getInstance())
            .setProjectId(PROJECT_ID)
            .setRetrySettings(
                RetrySettings.newBuilder().setTotalTimeout(Duration.ofMillis(5L)).build())
            .build();
    SpannerRpc rpc = mock(SpannerRpc.class);
    try (SpannerImpl contextSpanner = new SpannerImpl(rpc, options)) {
      Mockito.when(callable.call())
          .thenThrow(new RetryableException(ErrorCode.UNAVAILABLE, "Failure #1"));
      Context.CancellableContext context = Context.current().withCancellation();
      Runnable work =
          context.wrap(
              new Runnable() {
                @Override
                public void run() {
                  contextSpanner.runWithRetries(callable, SpannerImpl.DEFAULT_RETRY_ERROR_CODES);
                }
              });
      context.cancel(new RuntimeException("Cancelled by test"));
      expectedException.expect(isSpannerException(ErrorCode.CANCELLED));
      work.run();
    }
  }

  @Test
  public void contextDeadlineExceeded() {
    SpannerOptions options =
        SpannerOptions.newBuilder()
            .setCredentials(NoCredentials.getInstance())
            .setProjectId(PROJECT_ID)
            .setRetrySettings(
                RetrySettings.newBuilder().setTotalTimeout(Duration.ofMillis(5L)).build())
            .build();
    SpannerRpc rpc = mock(SpannerRpc.class);
    try (SpannerImpl contextSpanner = new SpannerImpl(rpc, options)) {
      ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
      Context.CancellableContext context =
          Context.current().withDeadlineAfter(10, TimeUnit.MILLISECONDS, executor);
      Mockito.when(callable.call())
          .thenThrow(new RetryableException(ErrorCode.UNAVAILABLE, "Failure #1"));
      Runnable work =
          context.wrap(
              new Runnable() {
                @Override
                public void run() {
                  contextSpanner.runWithRetries(callable, SpannerImpl.DEFAULT_RETRY_ERROR_CODES);
                }
              });
      expectedException.expect(isSpannerException(ErrorCode.DEADLINE_EXCEEDED));
      work.run();
    }
  }
}
