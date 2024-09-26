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

public interface FinalizeBackupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.backupdr.v1.FinalizeBackupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the instance, in the format
   * 'projects/&#42;&#47;locations/&#42;&#47;backupVaults/&#42;&#47;dataSources/'.
   * </pre>
   *
   * <code>
   * string data_source = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The dataSource.
   */
  java.lang.String getDataSource();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the instance, in the format
   * 'projects/&#42;&#47;locations/&#42;&#47;backupVaults/&#42;&#47;dataSources/'.
   * </pre>
   *
   * <code>
   * string data_source = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for dataSource.
   */
  com.google.protobuf.ByteString getDataSourceBytes();

  /**
   *
   *
   * <pre>
   * This will be assigned to the description field of the newly created Backup.
   * </pre>
   *
   * <code>optional string description = 2;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * This will be assigned to the description field of the newly created Backup.
   * </pre>
   *
   * <code>optional string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * This will be assigned to the description field of the newly created Backup.
   * </pre>
   *
   * <code>optional string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The point in time when this backup was captured from the source.  This will
   * be assigned to the consistency_time field of the newly created Backup.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp consistency_time = 3;</code>
   *
   * @return Whether the consistencyTime field is set.
   */
  boolean hasConsistencyTime();
  /**
   *
   *
   * <pre>
   * The point in time when this backup was captured from the source.  This will
   * be assigned to the consistency_time field of the newly created Backup.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp consistency_time = 3;</code>
   *
   * @return The consistencyTime.
   */
  com.google.protobuf.Timestamp getConsistencyTime();
  /**
   *
   *
   * <pre>
   * The point in time when this backup was captured from the source.  This will
   * be assigned to the consistency_time field of the newly created Backup.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp consistency_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getConsistencyTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes after the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes after the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Resource ID of the Backup resource to be finalized.  This must be
   * the same backup_id that was used in the InitiateBackupRequest.
   * </pre>
   *
   * <code>string backup_id = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backupId.
   */
  java.lang.String getBackupId();
  /**
   *
   *
   * <pre>
   * Required. Resource ID of the Backup resource to be finalized.  This must be
   * the same backup_id that was used in the InitiateBackupRequest.
   * </pre>
   *
   * <code>string backup_id = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backupId.
   */
  com.google.protobuf.ByteString getBackupIdBytes();

  /**
   *
   *
   * <pre>
   * The earliest timestamp of data available in this Backup.  This will set on
   * the newly created Backup.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp recovery_range_start_time = 6;</code>
   *
   * @return Whether the recoveryRangeStartTime field is set.
   */
  boolean hasRecoveryRangeStartTime();
  /**
   *
   *
   * <pre>
   * The earliest timestamp of data available in this Backup.  This will set on
   * the newly created Backup.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp recovery_range_start_time = 6;</code>
   *
   * @return The recoveryRangeStartTime.
   */
  com.google.protobuf.Timestamp getRecoveryRangeStartTime();
  /**
   *
   *
   * <pre>
   * The earliest timestamp of data available in this Backup.  This will set on
   * the newly created Backup.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp recovery_range_start_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRecoveryRangeStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The latest timestamp of data available in this Backup.  This will be set on
   * the newly created Backup.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp recovery_range_end_time = 7;</code>
   *
   * @return Whether the recoveryRangeEndTime field is set.
   */
  boolean hasRecoveryRangeEndTime();
  /**
   *
   *
   * <pre>
   * The latest timestamp of data available in this Backup.  This will be set on
   * the newly created Backup.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp recovery_range_end_time = 7;</code>
   *
   * @return The recoveryRangeEndTime.
   */
  com.google.protobuf.Timestamp getRecoveryRangeEndTime();
  /**
   *
   *
   * <pre>
   * The latest timestamp of data available in this Backup.  This will be set on
   * the newly created Backup.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp recovery_range_end_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRecoveryRangeEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The ExpireTime on the backup will be set to FinalizeTime plus this
   * duration.  If the resulting ExpireTime is less than
   * EnforcedRetentionEndTime, then ExpireTime is set to
   * EnforcedRetentionEndTime.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration retention_duration = 9;</code>
   *
   * @return Whether the retentionDuration field is set.
   */
  boolean hasRetentionDuration();
  /**
   *
   *
   * <pre>
   * The ExpireTime on the backup will be set to FinalizeTime plus this
   * duration.  If the resulting ExpireTime is less than
   * EnforcedRetentionEndTime, then ExpireTime is set to
   * EnforcedRetentionEndTime.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration retention_duration = 9;</code>
   *
   * @return The retentionDuration.
   */
  com.google.protobuf.Duration getRetentionDuration();
  /**
   *
   *
   * <pre>
   * The ExpireTime on the backup will be set to FinalizeTime plus this
   * duration.  If the resulting ExpireTime is less than
   * EnforcedRetentionEndTime, then ExpireTime is set to
   * EnforcedRetentionEndTime.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration retention_duration = 9;</code>
   */
  com.google.protobuf.DurationOrBuilder getRetentionDurationOrBuilder();
}
