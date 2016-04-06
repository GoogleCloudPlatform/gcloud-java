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

package com.google.gcloud;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class BatchResultTest {

  private BatchResult<Boolean, BaseServiceException> RESULT;

  @Before
  public void setUp() {
    RESULT = new BatchResult<Boolean, BaseServiceException>() {};
  }

  @Test
  public void testSuccess() {
    assertFalse(RESULT.submitted());
    try {
      RESULT.get();
      fail("This was not submitted yet.");
    } catch (IllegalStateException ex) {
      // expected
    }
    RESULT.success(true);
    assertTrue(RESULT.get());
  }

  @Test
  public void testError() {
    assertFalse(RESULT.submitted());
    try {
      RESULT.get();
      fail("This was not submitted yet.");
    } catch (IllegalStateException ex) {
      // expected
    }
    BaseServiceException ex = new BaseServiceException(0, "message", "reason", false);
    RESULT.error(ex);
    try {
      RESULT.get();
      fail("This is a failed operation and should have thrown a DnsException.");
    } catch (BaseServiceException real) {
      assertSame(ex, real);
    }
  }

  // todo(mderka) test notify when implemented

}
