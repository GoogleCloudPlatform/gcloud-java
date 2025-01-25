/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/tpu/v2/cloud_tpu.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tpu.v2;

public interface CreateQueuedResourceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.CreateQueuedResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name.
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
   * Required. The parent resource name.
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
   * Optional. The unqualified resource name. Should follow the
   * `^[A-Za-z0-9_.~+%-]+$` regex format.
   * </pre>
   *
   * <code>string queued_resource_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The queuedResourceId.
   */
  java.lang.String getQueuedResourceId();
  /**
   *
   *
   * <pre>
   * Optional. The unqualified resource name. Should follow the
   * `^[A-Za-z0-9_.~+%-]+$` regex format.
   * </pre>
   *
   * <code>string queued_resource_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for queuedResourceId.
   */
  com.google.protobuf.ByteString getQueuedResourceIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The queued resource.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the queuedResource field is set.
   */
  boolean hasQueuedResource();
  /**
   *
   *
   * <pre>
   * Required. The queued resource.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The queuedResource.
   */
  com.google.cloud.tpu.v2.QueuedResource getQueuedResource();
  /**
   *
   *
   * <pre>
   * Required. The queued resource.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.tpu.v2.QueuedResourceOrBuilder getQueuedResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
