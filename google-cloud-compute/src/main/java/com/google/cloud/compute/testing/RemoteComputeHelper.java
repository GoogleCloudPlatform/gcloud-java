/*
 * Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.cloud.compute.testing;

import com.google.cloud.AuthCredentials;
import com.google.cloud.RetryParams;
import com.google.cloud.compute.ComputeOptions;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Utility to create a remote Compute configuration for testing. Compute options can be obtained
 * via the {@link #options()} method. Returned options have custom
 * {@link ComputeOptions#retryParams()}: {@link RetryParams#retryMaxAttempts()} is {@code 10},
 * {@link RetryParams#retryMinAttempts()} is {@code 6}, {@link RetryParams#maxRetryDelayMillis()} is
 * {@code 30000}, {@link RetryParams#totalRetryPeriodMillis()} is {@code 120000} and
 * {@link RetryParams#initialRetryDelayMillis()} is {@code 250}.
 * {@link ComputeOptions#connectTimeout()} and {@link ComputeOptions#readTimeout()} are both set to
 * {@code 60000}.
 */
public class RemoteComputeHelper {

  private static final Logger log = Logger.getLogger(RemoteComputeHelper.class.getName());
  private final ComputeOptions options;

  private RemoteComputeHelper(ComputeOptions options) {
    this.options = options;
  }

  /**
   * Returns a {@link ComputeOptions} object to be used for testing.
   */
  @Deprecated
  public ComputeOptions options() {
    return getOptions();
  }

  /**
   * Returns a {@link ComputeOptions} object to be used for testing.
   */
  public ComputeOptions getOptions() {
    return options;
  }

  /**
   * Returns a base name for testing resources generated using a random UUID. This base name can be
   * prepended to resource names to prevent name clashes. This method always returns a 30 characters
   * long prefix. Since Compute Engine resource names can be at most 63 characters long your suffix
   * should be no longer than 33 characters.
   */
  public static String baseResourceName() {
    return "test-" + UUID.randomUUID().toString().replace("-", "").substring(0, 24) + "-";
  }

  /**
   * Creates a {@code RemoteComputeHelper} object for the given project id and JSON key input
   * stream.
   *
   * @param projectId id of the project to be used for running the tests
   * @param keyStream input stream for a JSON key
   * @return A {@code RemoteComputeHelper} object for the provided options
   * @throws ComputeHelperException if {@code keyStream} is not a valid JSON key stream
   */
  public static RemoteComputeHelper create(String projectId, InputStream keyStream) {
    try {
      ComputeOptions computeOptions = ComputeOptions.builder()
          .authCredentials(AuthCredentials.createForJson(keyStream))
          .projectId(projectId)
          .retryParams(retryParams())
          .connectTimeout(60000)
          .readTimeout(60000)
          .build();
      return new RemoteComputeHelper(computeOptions);
    } catch (IOException ex) {
      if (log.isLoggable(Level.WARNING)) {
        log.log(Level.WARNING, ex.getMessage());
      }
      throw ComputeHelperException.translate(ex);
    }
  }

  /**
   * Creates a {@code RemoteComputeHelper} object using default project id and authentication
   * credentials.
   */
  public static RemoteComputeHelper create() {
    ComputeOptions computeOptions = ComputeOptions.builder()
        .retryParams(retryParams())
        .connectTimeout(60000)
        .readTimeout(60000)
        .build();
    return new RemoteComputeHelper(computeOptions);
  }

  private static RetryParams retryParams() {
    return RetryParams.builder()
        .retryMaxAttempts(10)
        .retryMinAttempts(6)
        .maxRetryDelayMillis(30000)
        .totalRetryPeriodMillis(120000)
        .initialRetryDelayMillis(250)
        .build();
  }

  public static class ComputeHelperException extends RuntimeException {

    private static final long serialVersionUID = -5747977015007639912L;

    public ComputeHelperException(String message, Throwable cause) {
      super(message, cause);
    }

    public static ComputeHelperException translate(Exception ex) {
      return new ComputeHelperException(ex.getMessage(), ex);
    }
  }
}
