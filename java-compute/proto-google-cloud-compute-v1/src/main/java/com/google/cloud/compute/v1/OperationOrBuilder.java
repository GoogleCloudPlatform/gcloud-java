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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface OperationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Operation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The value of `requestId` if you provided it in the request. Not present otherwise.
   * </pre>
   *
   * <code>optional string client_operation_id = 297240295;</code>
   *
   * @return Whether the clientOperationId field is set.
   */
  boolean hasClientOperationId();
  /**
   *
   *
   * <pre>
   * [Output Only] The value of `requestId` if you provided it in the request. Not present otherwise.
   * </pre>
   *
   * <code>optional string client_operation_id = 297240295;</code>
   *
   * @return The clientOperationId.
   */
  java.lang.String getClientOperationId();
  /**
   *
   *
   * <pre>
   * [Output Only] The value of `requestId` if you provided it in the request. Not present otherwise.
   * </pre>
   *
   * <code>optional string client_operation_id = 297240295;</code>
   *
   * @return The bytes for clientOperationId.
   */
  com.google.protobuf.ByteString getClientOperationIdBytes();

  /**
   *
   *
   * <pre>
   * [Deprecated] This field is deprecated.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Deprecated] This field is deprecated.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Deprecated] This field is deprecated.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] A textual description of the operation, which is set when the operation is created.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * [Output Only] A textual description of the operation, which is set when the operation is created.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * [Output Only] A textual description of the operation, which is set when the operation is created.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The time that this operation was completed. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string end_time = 114938801;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * [Output Only] The time that this operation was completed. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string end_time = 114938801;</code>
   *
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   *
   *
   * <pre>
   * [Output Only] The time that this operation was completed. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string end_time = 114938801;</code>
   *
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString getEndTimeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] If errors are generated during processing of the operation, this field will be populated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * [Output Only] If errors are generated during processing of the operation, this field will be populated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
   *
   * @return The error.
   */
  com.google.cloud.compute.v1.Error getError();
  /**
   *
   *
   * <pre>
   * [Output Only] If errors are generated during processing of the operation, this field will be populated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
   */
  com.google.cloud.compute.v1.ErrorOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] If the operation fails, this field contains the HTTP error message that was returned, such as `NOT FOUND`.
   * </pre>
   *
   * <code>
   * optional string http_error_message = 202521945 [(.google.cloud.operation_field) = ERROR_MESSAGE];
   * </code>
   *
   * @return Whether the httpErrorMessage field is set.
   */
  boolean hasHttpErrorMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] If the operation fails, this field contains the HTTP error message that was returned, such as `NOT FOUND`.
   * </pre>
   *
   * <code>
   * optional string http_error_message = 202521945 [(.google.cloud.operation_field) = ERROR_MESSAGE];
   * </code>
   *
   * @return The httpErrorMessage.
   */
  java.lang.String getHttpErrorMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] If the operation fails, this field contains the HTTP error message that was returned, such as `NOT FOUND`.
   * </pre>
   *
   * <code>
   * optional string http_error_message = 202521945 [(.google.cloud.operation_field) = ERROR_MESSAGE];
   * </code>
   *
   * @return The bytes for httpErrorMessage.
   */
  com.google.protobuf.ByteString getHttpErrorMessageBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] If the operation fails, this field contains the HTTP error status code that was returned. For example, a `404` means the resource was not found.
   * </pre>
   *
   * <code>
   * optional int32 http_error_status_code = 312345196 [(.google.cloud.operation_field) = ERROR_CODE];
   * </code>
   *
   * @return Whether the httpErrorStatusCode field is set.
   */
  boolean hasHttpErrorStatusCode();
  /**
   *
   *
   * <pre>
   * [Output Only] If the operation fails, this field contains the HTTP error status code that was returned. For example, a `404` means the resource was not found.
   * </pre>
   *
   * <code>
   * optional int32 http_error_status_code = 312345196 [(.google.cloud.operation_field) = ERROR_CODE];
   * </code>
   *
   * @return The httpErrorStatusCode.
   */
  int getHttpErrorStatusCode();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the operation. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the operation. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] The time that this operation was requested. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string insert_time = 433722515;</code>
   *
   * @return Whether the insertTime field is set.
   */
  boolean hasInsertTime();
  /**
   *
   *
   * <pre>
   * [Output Only] The time that this operation was requested. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string insert_time = 433722515;</code>
   *
   * @return The insertTime.
   */
  java.lang.String getInsertTime();
  /**
   *
   *
   * <pre>
   * [Output Only] The time that this operation was requested. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string insert_time = 433722515;</code>
   *
   * @return The bytes for insertTime.
   */
  com.google.protobuf.ByteString getInsertTimeBytes();

  /**
   * <code>
   * optional .google.cloud.compute.v1.InstancesBulkInsertOperationMetadata instances_bulk_insert_operation_metadata = 89146177;
   * </code>
   *
   * @return Whether the instancesBulkInsertOperationMetadata field is set.
   */
  boolean hasInstancesBulkInsertOperationMetadata();
  /**
   * <code>
   * optional .google.cloud.compute.v1.InstancesBulkInsertOperationMetadata instances_bulk_insert_operation_metadata = 89146177;
   * </code>
   *
   * @return The instancesBulkInsertOperationMetadata.
   */
  com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata
      getInstancesBulkInsertOperationMetadata();
  /**
   * <code>
   * optional .google.cloud.compute.v1.InstancesBulkInsertOperationMetadata instances_bulk_insert_operation_metadata = 89146177;
   * </code>
   */
  com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadataOrBuilder
      getInstancesBulkInsertOperationMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always `compute#operation` for Operation resources.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always `compute#operation` for Operation resources.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always `compute#operation` for Operation resources.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Name of the operation.
   * </pre>
   *
   * <code>optional string name = 3373707 [(.google.cloud.operation_field) = NAME];</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * [Output Only] Name of the operation.
   * </pre>
   *
   * <code>optional string name = 3373707 [(.google.cloud.operation_field) = NAME];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * [Output Only] Name of the operation.
   * </pre>
   *
   * <code>optional string name = 3373707 [(.google.cloud.operation_field) = NAME];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] An ID that represents a group of operations, such as when a group of operations results from a `bulkInsert` API request.
   * </pre>
   *
   * <code>optional string operation_group_id = 40171187;</code>
   *
   * @return Whether the operationGroupId field is set.
   */
  boolean hasOperationGroupId();
  /**
   *
   *
   * <pre>
   * [Output Only] An ID that represents a group of operations, such as when a group of operations results from a `bulkInsert` API request.
   * </pre>
   *
   * <code>optional string operation_group_id = 40171187;</code>
   *
   * @return The operationGroupId.
   */
  java.lang.String getOperationGroupId();
  /**
   *
   *
   * <pre>
   * [Output Only] An ID that represents a group of operations, such as when a group of operations results from a `bulkInsert` API request.
   * </pre>
   *
   * <code>optional string operation_group_id = 40171187;</code>
   *
   * @return The bytes for operationGroupId.
   */
  com.google.protobuf.ByteString getOperationGroupIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The type of operation, such as `insert`, `update`, or `delete`, and so on.
   * </pre>
   *
   * <code>optional string operation_type = 177650450;</code>
   *
   * @return Whether the operationType field is set.
   */
  boolean hasOperationType();
  /**
   *
   *
   * <pre>
   * [Output Only] The type of operation, such as `insert`, `update`, or `delete`, and so on.
   * </pre>
   *
   * <code>optional string operation_type = 177650450;</code>
   *
   * @return The operationType.
   */
  java.lang.String getOperationType();
  /**
   *
   *
   * <pre>
   * [Output Only] The type of operation, such as `insert`, `update`, or `delete`, and so on.
   * </pre>
   *
   * <code>optional string operation_type = 177650450;</code>
   *
   * @return The bytes for operationType.
   */
  com.google.protobuf.ByteString getOperationTypeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement that this be linear or support any granularity of operations. This should not be used to guess when the operation will be complete. This number should monotonically increase as the operation progresses.
   * </pre>
   *
   * <code>optional int32 progress = 72663597;</code>
   *
   * @return Whether the progress field is set.
   */
  boolean hasProgress();
  /**
   *
   *
   * <pre>
   * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement that this be linear or support any granularity of operations. This should not be used to guess when the operation will be complete. This number should monotonically increase as the operation progresses.
   * </pre>
   *
   * <code>optional int32 progress = 72663597;</code>
   *
   * @return The progress.
   */
  int getProgress();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the region where the operation resides. Only applicable when performing regional operations.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the region where the operation resides. Only applicable when performing regional operations.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the region where the operation resides. Only applicable when performing regional operations.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] If the operation is for projects.setCommonInstanceMetadata, this field will contain information on all underlying zonal actions and their state.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SetCommonInstanceMetadataOperationMetadata set_common_instance_metadata_operation_metadata = 490378980;
   * </code>
   *
   * @return Whether the setCommonInstanceMetadataOperationMetadata field is set.
   */
  boolean hasSetCommonInstanceMetadataOperationMetadata();
  /**
   *
   *
   * <pre>
   * [Output Only] If the operation is for projects.setCommonInstanceMetadata, this field will contain information on all underlying zonal actions and their state.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SetCommonInstanceMetadataOperationMetadata set_common_instance_metadata_operation_metadata = 490378980;
   * </code>
   *
   * @return The setCommonInstanceMetadataOperationMetadata.
   */
  com.google.cloud.compute.v1.SetCommonInstanceMetadataOperationMetadata
      getSetCommonInstanceMetadataOperationMetadata();
  /**
   *
   *
   * <pre>
   * [Output Only] If the operation is for projects.setCommonInstanceMetadata, this field will contain information on all underlying zonal actions and their state.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SetCommonInstanceMetadataOperationMetadata set_common_instance_metadata_operation_metadata = 490378980;
   * </code>
   */
  com.google.cloud.compute.v1.SetCommonInstanceMetadataOperationMetadataOrBuilder
      getSetCommonInstanceMetadataOperationMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The time that this operation was started by the server. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * [Output Only] The time that this operation was started by the server. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   *
   *
   * <pre>
   * [Output Only] The time that this operation was started by the server. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString getStartTimeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of the operation, which can be one of the following: `PENDING`, `RUNNING`, or `DONE`.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.Operation.Status status = 181260274 [(.google.cloud.operation_field) = STATUS];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the operation, which can be one of the following: `PENDING`, `RUNNING`, or `DONE`.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.Operation.Status status = 181260274 [(.google.cloud.operation_field) = STATUS];
   * </code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the operation, which can be one of the following: `PENDING`, `RUNNING`, or `DONE`.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.Operation.Status status = 181260274 [(.google.cloud.operation_field) = STATUS];
   * </code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.Operation.Status getStatus();

  /**
   *
   *
   * <pre>
   * [Output Only] An optional textual description of the current status of the operation.
   * </pre>
   *
   * <code>optional string status_message = 297428154;</code>
   *
   * @return Whether the statusMessage field is set.
   */
  boolean hasStatusMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] An optional textual description of the current status of the operation.
   * </pre>
   *
   * <code>optional string status_message = 297428154;</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] An optional textual description of the current status of the operation.
   * </pre>
   *
   * <code>optional string status_message = 297428154;</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique target ID, which identifies a specific incarnation of the target resource.
   * </pre>
   *
   * <code>optional uint64 target_id = 258165385;</code>
   *
   * @return Whether the targetId field is set.
   */
  boolean hasTargetId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique target ID, which identifies a specific incarnation of the target resource.
   * </pre>
   *
   * <code>optional uint64 target_id = 258165385;</code>
   *
   * @return The targetId.
   */
  long getTargetId();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the resource that the operation modifies. For operations related to creating a snapshot, this points to the persistent disk that the snapshot was created from.
   * </pre>
   *
   * <code>optional string target_link = 62671336;</code>
   *
   * @return Whether the targetLink field is set.
   */
  boolean hasTargetLink();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the resource that the operation modifies. For operations related to creating a snapshot, this points to the persistent disk that the snapshot was created from.
   * </pre>
   *
   * <code>optional string target_link = 62671336;</code>
   *
   * @return The targetLink.
   */
  java.lang.String getTargetLink();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the resource that the operation modifies. For operations related to creating a snapshot, this points to the persistent disk that the snapshot was created from.
   * </pre>
   *
   * <code>optional string target_link = 62671336;</code>
   *
   * @return The bytes for targetLink.
   */
  com.google.protobuf.ByteString getTargetLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] User who requested the operation, for example: `user&#64;example.com` or `alice_smith_identifier (global/workforcePools/example-com-us-employees)`.
   * </pre>
   *
   * <code>optional string user = 3599307;</code>
   *
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   *
   *
   * <pre>
   * [Output Only] User who requested the operation, for example: `user&#64;example.com` or `alice_smith_identifier (global/workforcePools/example-com-us-employees)`.
   * </pre>
   *
   * <code>optional string user = 3599307;</code>
   *
   * @return The user.
   */
  java.lang.String getUser();
  /**
   *
   *
   * <pre>
   * [Output Only] User who requested the operation, for example: `user&#64;example.com` or `alice_smith_identifier (global/workforcePools/example-com-us-employees)`.
   * </pre>
   *
   * <code>optional string user = 3599307;</code>
   *
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString getUserBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] If warning messages are generated during processing of the operation, this field will be populated.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Warnings> getWarningsList();
  /**
   *
   *
   * <pre>
   * [Output Only] If warning messages are generated during processing of the operation, this field will be populated.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  com.google.cloud.compute.v1.Warnings getWarnings(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] If warning messages are generated during processing of the operation, this field will be populated.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  int getWarningsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] If warning messages are generated during processing of the operation, this field will be populated.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.WarningsOrBuilder>
      getWarningsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] If warning messages are generated during processing of the operation, this field will be populated.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  com.google.cloud.compute.v1.WarningsOrBuilder getWarningsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the zone where the operation resides. Only applicable when performing per-zone operations.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return Whether the zone field is set.
   */
  boolean hasZone();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the zone where the operation resides. Only applicable when performing per-zone operations.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the zone where the operation resides. Only applicable when performing per-zone operations.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
