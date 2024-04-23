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
// source: google/cloud/tpu/v2/cloud_tpu.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tpu.v2;

public interface AttachedDiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.AttachedDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the full path to an existing disk.
   * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
   * </pre>
   *
   * <code>string source_disk = 3;</code>
   *
   * @return The sourceDisk.
   */
  java.lang.String getSourceDisk();
  /**
   *
   *
   * <pre>
   * Specifies the full path to an existing disk.
   * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
   * </pre>
   *
   * <code>string source_disk = 3;</code>
   *
   * @return The bytes for sourceDisk.
   */
  com.google.protobuf.ByteString getSourceDiskBytes();

  /**
   *
   *
   * <pre>
   * The mode in which to attach this disk.
   * If not specified, the default is READ_WRITE mode.
   * Only applicable to data_disks.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   *
   *
   * <pre>
   * The mode in which to attach this disk.
   * If not specified, the default is READ_WRITE mode.
   * Only applicable to data_disks.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
   *
   * @return The mode.
   */
  com.google.cloud.tpu.v2.AttachedDisk.DiskMode getMode();
}
