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

package com.google.cloud.pubsub;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.ImmutableMap;

import org.junit.Test;

import java.util.Map;

public class PushConfigTest {

  private static final String ENDPOINT = "https://example.com/push";
  private static final Map<String, String> ATTRIBUTES =
      ImmutableMap.of("key1", "value1", "key2", "value2");
  private static final PushConfig PUSH_CONFIG = PushConfig.builder(ENDPOINT, ATTRIBUTES).build();

  @Test
  public void testToBuilder() {
    comparePushConfig(PUSH_CONFIG, PUSH_CONFIG.toBuilder().build());
    PushConfig pushConfig = PUSH_CONFIG.toBuilder()
        .endpoint("https://example2.com/push")
        .clearAttributes()
        .addAttribute("key1", "value1")
        .build();
    assertEquals("https://example2.com/push", pushConfig.endpoint());
    assertEquals(ImmutableMap.of("key1", "value1"), pushConfig.attributes());
    pushConfig = pushConfig.toBuilder()
        .endpoint(ENDPOINT)
        .removeAttribute("key1")
        .attributes(ATTRIBUTES)
        .build();
    comparePushConfig(PUSH_CONFIG, pushConfig);
  }

  @Test
  public void testBuilder() {
    assertEquals(ENDPOINT, PUSH_CONFIG.endpoint());
    assertEquals(ATTRIBUTES, PUSH_CONFIG.attributes());
    PushConfig pushConfig = PushConfig.builder("https://example2.com/push")
        .endpoint(ENDPOINT)
        .attributes(ATTRIBUTES)
        .clearAttributes()
        .addAttribute("key1", "value1")
        .addAttribute("key2", "value2")
        .build();
    assertEquals(ENDPOINT, pushConfig.endpoint());
    assertEquals(ATTRIBUTES, pushConfig.attributes());
    comparePushConfig(PUSH_CONFIG, pushConfig);
  }

  @Test
  public void testOf() {
    PushConfig pushConfig = PushConfig.of(ENDPOINT);
    assertEquals(ENDPOINT, pushConfig.endpoint());
    assertEquals(ImmutableMap.of(), pushConfig.attributes());
    pushConfig = PushConfig.of(ENDPOINT, ATTRIBUTES);
    assertEquals(ENDPOINT, pushConfig.endpoint());
    assertEquals(ATTRIBUTES, pushConfig.attributes());
    comparePushConfig(PUSH_CONFIG, pushConfig);
  }

  @Test
  public void testToAndFromPb() {
    comparePushConfig(PUSH_CONFIG, PushConfig.fromPb(PUSH_CONFIG.toPb()));
  }

  @Test
  public void testToAndFromPbIncomplete() {
    PushConfig pushConfig = PushConfig.of(ENDPOINT);
    comparePushConfig(pushConfig, PushConfig.fromPb(pushConfig.toPb()));
  }

  private void comparePushConfig(PushConfig expected, PushConfig value) {
    assertEquals(expected, value);
    assertEquals(expected.endpoint(), value.endpoint());
    assertEquals(expected.attributes(), value.attributes());
    assertEquals(expected.hashCode(), value.hashCode());
  }
}
