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
// source: google/cloud/gkebackup/v1/gkebackup.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkebackup.v1;

public interface UpdateBackupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.UpdateBackupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A new version of the Backup resource that contains updated
   * fields. This may be sparsely populated if an `update_mask` is provided.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the backup field is set.
   */
  boolean hasBackup();
  /**
   *
   *
   * <pre>
   * Required. A new version of the Backup resource that contains updated
   * fields. This may be sparsely populated if an `update_mask` is provided.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The backup.
   */
  com.google.cloud.gkebackup.v1.Backup getBackup();
  /**
   *
   *
   * <pre>
   * Required. A new version of the Backup resource that contains updated
   * fields. This may be sparsely populated if an `update_mask` is provided.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkebackup.v1.BackupOrBuilder getBackupOrBuilder();

  /**
   *
   *
   * <pre>
   * This is used to specify the fields to be overwritten in the
   * Backup targeted for update. The values for each of these
   * updated fields will be taken from the `backup_plan` provided
   * with this request. Field names are relative to the root of the resource.
   * If no `update_mask` is provided, all fields in `backup` will be
   * written to the target Backup resource.
   * Note that OUTPUT_ONLY and IMMUTABLE fields in `backup` are ignored
   * and are not used to update the target Backup.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * This is used to specify the fields to be overwritten in the
   * Backup targeted for update. The values for each of these
   * updated fields will be taken from the `backup_plan` provided
   * with this request. Field names are relative to the root of the resource.
   * If no `update_mask` is provided, all fields in `backup` will be
   * written to the target Backup resource.
   * Note that OUTPUT_ONLY and IMMUTABLE fields in `backup` are ignored
   * and are not used to update the target Backup.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * This is used to specify the fields to be overwritten in the
   * Backup targeted for update. The values for each of these
   * updated fields will be taken from the `backup_plan` provided
   * with this request. Field names are relative to the root of the resource.
   * If no `update_mask` is provided, all fields in `backup` will be
   * written to the target Backup resource.
   * Note that OUTPUT_ONLY and IMMUTABLE fields in `backup` are ignored
   * and are not used to update the target Backup.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
