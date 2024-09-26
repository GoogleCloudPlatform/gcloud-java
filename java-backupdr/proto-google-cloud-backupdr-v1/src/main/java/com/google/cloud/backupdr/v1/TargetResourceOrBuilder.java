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
// source: google/cloud/backupdr/v1/backupvault.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.backupdr.v1;

public interface TargetResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.backupdr.v1.TargetResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Details of the native Google Cloud resource created as part of restore.
   * </pre>
   *
   * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
   *
   * @return Whether the gcpResource field is set.
   */
  boolean hasGcpResource();
  /**
   *
   *
   * <pre>
   * Details of the native Google Cloud resource created as part of restore.
   * </pre>
   *
   * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
   *
   * @return The gcpResource.
   */
  com.google.cloud.backupdr.v1.GcpResource getGcpResource();
  /**
   *
   *
   * <pre>
   * Details of the native Google Cloud resource created as part of restore.
   * </pre>
   *
   * <code>.google.cloud.backupdr.v1.GcpResource gcp_resource = 1;</code>
   */
  com.google.cloud.backupdr.v1.GcpResourceOrBuilder getGcpResourceOrBuilder();

  com.google.cloud.backupdr.v1.TargetResource.TargetResourceInfoCase getTargetResourceInfoCase();
}
