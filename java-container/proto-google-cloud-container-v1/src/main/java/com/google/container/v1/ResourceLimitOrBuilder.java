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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1;

public interface ResourceLimitOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.ResourceLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name "cpu", "memory" or gpu-specific string.
   * </pre>
   *
   * <code>string resource_type = 1;</code>
   *
   * @return The resourceType.
   */
  java.lang.String getResourceType();
  /**
   *
   *
   * <pre>
   * Resource name "cpu", "memory" or gpu-specific string.
   * </pre>
   *
   * <code>string resource_type = 1;</code>
   *
   * @return The bytes for resourceType.
   */
  com.google.protobuf.ByteString getResourceTypeBytes();

  /**
   *
   *
   * <pre>
   * Minimum amount of the resource in the cluster.
   * </pre>
   *
   * <code>int64 minimum = 2;</code>
   *
   * @return The minimum.
   */
  long getMinimum();

  /**
   *
   *
   * <pre>
   * Maximum amount of the resource in the cluster.
   * </pre>
   *
   * <code>int64 maximum = 3;</code>
   *
   * @return The maximum.
   */
  long getMaximum();
}
