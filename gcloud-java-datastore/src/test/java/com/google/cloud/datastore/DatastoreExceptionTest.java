/*
 * Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.cloud.datastore;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.cloud.BaseServiceException;
import com.google.cloud.RetryHelper;

import org.junit.Test;

import java.io.IOException;
import java.net.SocketTimeoutException;

public class DatastoreExceptionTest {

  @Test
  public void testDatastoreException() throws Exception {
    DatastoreException exception = new DatastoreException(10, "message", "ABORTED");
    assertEquals(10, exception.code());
    assertEquals("ABORTED", exception.reason());
    assertEquals("message", exception.getMessage());
    assertTrue(exception.retryable());
    assertTrue(exception.idempotent());

    exception = new DatastoreException(4, "message", "DEADLINE_EXCEEDED");
    assertEquals(4, exception.code());
    assertEquals("DEADLINE_EXCEEDED", exception.reason());
    assertEquals("message", exception.getMessage());
    assertTrue(exception.retryable());
    assertTrue(exception.idempotent());

    exception = new DatastoreException(14, "message", "UNAVAILABLE");
    assertEquals(14, exception.code());
    assertEquals("UNAVAILABLE", exception.reason());
    assertEquals("message", exception.getMessage());
    assertTrue(exception.retryable());
    assertTrue(exception.idempotent());

    exception = new DatastoreException(2, "message", "INTERNAL");
    assertEquals(2, exception.code());
    assertEquals("INTERNAL", exception.reason());
    assertEquals("message", exception.getMessage());
    assertFalse(exception.retryable());
    assertTrue(exception.idempotent());

    IOException cause = new SocketTimeoutException("socketTimeoutMessage");
    exception = new DatastoreException(cause);
    assertEquals(DatastoreException.UNKNOWN_CODE, exception.code());
    assertNull(exception.reason());
    assertEquals("socketTimeoutMessage", exception.getMessage());
    assertEquals(cause, exception.getCause());
    assertTrue(exception.retryable());
    assertTrue(exception.idempotent());
    assertSame(cause, exception.getCause());

    exception = new DatastoreException(2, "message", "INTERNAL", cause);
    assertEquals(2, exception.code());
    assertEquals("INTERNAL", exception.reason());
    assertEquals("message", exception.getMessage());
    assertFalse(exception.retryable());
    assertTrue(exception.idempotent());
    assertSame(cause, exception.getCause());
  }

  @Test
  public void testTranslateAndThrow() throws Exception {
    Exception cause = new DatastoreException(14, "message", "UNAVAILABLE");
    RetryHelper.RetryHelperException exceptionMock =
        createMock(RetryHelper.RetryHelperException.class);
    expect(exceptionMock.getCause()).andReturn(cause).times(2);
    replay(exceptionMock);
    try {
      DatastoreException.translateAndThrow(exceptionMock);
    } catch (BaseServiceException ex) {
      assertEquals(14, ex.code());
      assertEquals("message", ex.getMessage());
      assertTrue(ex.retryable());
      assertTrue(ex.idempotent());
    } finally {
      verify(exceptionMock);
    }
    cause = new IllegalArgumentException("message");
    exceptionMock = createMock(RetryHelper.RetryHelperException.class);
    expect(exceptionMock.getMessage()).andReturn("message").times(1);
    expect(exceptionMock.getCause()).andReturn(cause).times(2);
    replay(exceptionMock);
    try {
      DatastoreException.translateAndThrow(exceptionMock);
    } catch (BaseServiceException ex) {
      assertEquals(DatastoreException.UNKNOWN_CODE, ex.code());
      assertEquals("message", ex.getMessage());
      assertFalse(ex.retryable());
      assertTrue(ex.idempotent());
      assertSame(cause, ex.getCause());
    } finally {
      verify(exceptionMock);
    }
  }

  @Test
  public void testThrowInvalidRequest() throws Exception {
    try {
      DatastoreException.throwInvalidRequest("message %s %d", "a", 1);
      fail("Exception expected");
    } catch (DatastoreException ex) {
      assertEquals("FAILED_PRECONDITION", ex.reason());
      assertEquals("message a 1", ex.getMessage());
    }
  }
}
