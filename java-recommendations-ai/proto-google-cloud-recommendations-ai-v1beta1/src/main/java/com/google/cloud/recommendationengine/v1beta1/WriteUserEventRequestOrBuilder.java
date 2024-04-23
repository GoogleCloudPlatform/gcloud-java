/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.recommendationengine.v1beta1;

public interface WriteUserEventRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.WriteUserEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent eventStore resource name, such as
   * `projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent eventStore resource name, such as
   * `projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userEvent field is set.
   */
  boolean hasUserEvent();
  /**
   *
   *
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userEvent.
   */
  com.google.cloud.recommendationengine.v1beta1.UserEvent getUserEvent();
  /**
   *
   *
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder getUserEventOrBuilder();
}
