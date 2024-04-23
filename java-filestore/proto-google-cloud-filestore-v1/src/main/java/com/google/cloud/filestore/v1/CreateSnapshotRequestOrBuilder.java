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
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.filestore.v1;

public interface CreateSnapshotRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1.CreateSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Filestore Instance to create the snapshots of, in the format
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
   * Required. The Filestore Instance to create the snapshots of, in the format
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
   * Required. The ID to use for the snapshot.
   * The ID must be unique within the specified instance.
   *
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The snapshotId.
   */
  java.lang.String getSnapshotId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the snapshot.
   * The ID must be unique within the specified instance.
   *
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for snapshotId.
   */
  com.google.protobuf.ByteString getSnapshotIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A snapshot resource.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the snapshot field is set.
   */
  boolean hasSnapshot();
  /**
   *
   *
   * <pre>
   * Required. A snapshot resource.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The snapshot.
   */
  com.google.cloud.filestore.v1.Snapshot getSnapshot();
  /**
   *
   *
   * <pre>
   * Required. A snapshot resource.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.filestore.v1.SnapshotOrBuilder getSnapshotOrBuilder();
}
