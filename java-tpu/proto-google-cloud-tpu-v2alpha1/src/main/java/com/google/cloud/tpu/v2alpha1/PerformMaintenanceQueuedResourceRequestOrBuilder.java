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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tpu.v2alpha1;

public interface PerformMaintenanceQueuedResourceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.PerformMaintenanceQueuedResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the QueuedResource which holds the nodes to perform
   * maintenance on.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the QueuedResource which holds the nodes to perform
   * maintenance on.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The names of the nodes to perform maintenance on.
   * </pre>
   *
   * <code>repeated string node_names = 2;</code>
   *
   * @return A list containing the nodeNames.
   */
  java.util.List<java.lang.String> getNodeNamesList();
  /**
   *
   *
   * <pre>
   * The names of the nodes to perform maintenance on.
   * </pre>
   *
   * <code>repeated string node_names = 2;</code>
   *
   * @return The count of nodeNames.
   */
  int getNodeNamesCount();
  /**
   *
   *
   * <pre>
   * The names of the nodes to perform maintenance on.
   * </pre>
   *
   * <code>repeated string node_names = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The nodeNames at the given index.
   */
  java.lang.String getNodeNames(int index);
  /**
   *
   *
   * <pre>
   * The names of the nodes to perform maintenance on.
   * </pre>
   *
   * <code>repeated string node_names = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the nodeNames at the given index.
   */
  com.google.protobuf.ByteString getNodeNamesBytes(int index);
}
