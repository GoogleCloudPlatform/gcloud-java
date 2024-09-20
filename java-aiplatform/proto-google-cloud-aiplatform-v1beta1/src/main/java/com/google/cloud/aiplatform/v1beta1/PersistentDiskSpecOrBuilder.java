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
// source: google/cloud/aiplatform/v1beta1/machine_resources.proto

package com.google.cloud.aiplatform.v1beta1;

public interface PersistentDiskSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PersistentDiskSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of the disk (default is "pd-standard").
   * Valid values: "pd-ssd" (Persistent Disk Solid State Drive)
   * "pd-standard" (Persistent Disk Hard Disk Drive)
   * "pd-balanced" (Balanced Persistent Disk)
   * "pd-extreme" (Extreme Persistent Disk)
   * </pre>
   *
   * <code>string disk_type = 1;</code>
   *
   * @return The diskType.
   */
  java.lang.String getDiskType();
  /**
   *
   *
   * <pre>
   * Type of the disk (default is "pd-standard").
   * Valid values: "pd-ssd" (Persistent Disk Solid State Drive)
   * "pd-standard" (Persistent Disk Hard Disk Drive)
   * "pd-balanced" (Balanced Persistent Disk)
   * "pd-extreme" (Extreme Persistent Disk)
   * </pre>
   *
   * <code>string disk_type = 1;</code>
   *
   * @return The bytes for diskType.
   */
  com.google.protobuf.ByteString getDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * Size in GB of the disk (default is 100GB).
   * </pre>
   *
   * <code>int64 disk_size_gb = 2;</code>
   *
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();
}
