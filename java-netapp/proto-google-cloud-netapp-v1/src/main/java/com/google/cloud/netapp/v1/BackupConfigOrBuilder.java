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
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.netapp.v1;

public interface BackupConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.BackupConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. When specified, schedule backups will be created based on the
   * policy configuration.
   * </pre>
   *
   * <code>
   * repeated string backup_policies = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the backupPolicies.
   */
  java.util.List<java.lang.String> getBackupPoliciesList();
  /**
   *
   *
   * <pre>
   * Optional. When specified, schedule backups will be created based on the
   * policy configuration.
   * </pre>
   *
   * <code>
   * repeated string backup_policies = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of backupPolicies.
   */
  int getBackupPoliciesCount();
  /**
   *
   *
   * <pre>
   * Optional. When specified, schedule backups will be created based on the
   * policy configuration.
   * </pre>
   *
   * <code>
   * repeated string backup_policies = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The backupPolicies at the given index.
   */
  java.lang.String getBackupPolicies(int index);
  /**
   *
   *
   * <pre>
   * Optional. When specified, schedule backups will be created based on the
   * policy configuration.
   * </pre>
   *
   * <code>
   * repeated string backup_policies = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the backupPolicies at the given index.
   */
  com.google.protobuf.ByteString getBackupPoliciesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Name of backup vault.
   * Format:
   * projects/{project_id}/locations/{location}/backupVaults/{backup_vault_id}
   * </pre>
   *
   * <code>
   * string backup_vault = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The backupVault.
   */
  java.lang.String getBackupVault();
  /**
   *
   *
   * <pre>
   * Optional. Name of backup vault.
   * Format:
   * projects/{project_id}/locations/{location}/backupVaults/{backup_vault_id}
   * </pre>
   *
   * <code>
   * string backup_vault = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for backupVault.
   */
  com.google.protobuf.ByteString getBackupVaultBytes();

  /**
   *
   *
   * <pre>
   * Optional. When set to true, scheduled backup is enabled on the volume.
   * This field should be nil when there's no backup policy attached.
   * </pre>
   *
   * <code>optional bool scheduled_backup_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the scheduledBackupEnabled field is set.
   */
  boolean hasScheduledBackupEnabled();
  /**
   *
   *
   * <pre>
   * Optional. When set to true, scheduled backup is enabled on the volume.
   * This field should be nil when there's no backup policy attached.
   * </pre>
   *
   * <code>optional bool scheduled_backup_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The scheduledBackupEnabled.
   */
  boolean getScheduledBackupEnabled();
}
