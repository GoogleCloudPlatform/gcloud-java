/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

package com.google.cloud.tasks.v2beta2;

public interface BufferTaskRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.BufferTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent queue name. For example:
   * projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   *
   * The queue must already exist.
   * </pre>
   *
   * <code>
   * string queue = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The queue.
   */
  java.lang.String getQueue();
  /**
   *
   *
   * <pre>
   * Required. The parent queue name. For example:
   * projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   *
   * The queue must already exist.
   * </pre>
   *
   * <code>
   * string queue = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for queue.
   */
  com.google.protobuf.ByteString getQueueBytes();

  /**
   *
   *
   * <pre>
   * Optional. Task ID for the task being created. If not provided, a random
   * task ID is assigned to the task.
   * </pre>
   *
   * <code>string task_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   *
   *
   * <pre>
   * Optional. Task ID for the task being created. If not provided, a random
   * task ID is assigned to the task.
   * </pre>
   *
   * <code>string task_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString getTaskIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Body of the HTTP request.
   *
   * The body can take any generic value. The value is written to the
   * [HttpRequest][payload] of the [Task].
   * </pre>
   *
   * <code>.google.api.HttpBody body = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the body field is set.
   */
  boolean hasBody();
  /**
   *
   *
   * <pre>
   * Optional. Body of the HTTP request.
   *
   * The body can take any generic value. The value is written to the
   * [HttpRequest][payload] of the [Task].
   * </pre>
   *
   * <code>.google.api.HttpBody body = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The body.
   */
  com.google.api.HttpBody getBody();
  /**
   *
   *
   * <pre>
   * Optional. Body of the HTTP request.
   *
   * The body can take any generic value. The value is written to the
   * [HttpRequest][payload] of the [Task].
   * </pre>
   *
   * <code>.google.api.HttpBody body = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.api.HttpBodyOrBuilder getBodyOrBuilder();
}
