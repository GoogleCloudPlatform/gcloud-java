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
// source: google/cloud/dataplex/v1/catalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public interface EntryGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.EntryGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the EntryGroup, of the form:
   * projects/{project_number}/locations/{location_id}/entryGroups/{entry_group_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the EntryGroup, of the form:
   * projects/{project_number}/locations/{location_id}/entryGroups/{entry_group_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. System generated globally unique ID for the EntryGroup. This
   * ID will be different if the EntryGroup is deleted and re-created with the
   * same name.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. System generated globally unique ID for the EntryGroup. This
   * ID will be different if the EntryGroup is deleted and re-created with the
   * same name.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the EntryGroup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the EntryGroup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the EntryGroup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the EntryGroup was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the EntryGroup was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the EntryGroup was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Description of the EntryGroup.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description of the EntryGroup.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. User friendly display name.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. User friendly display name.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for the EntryGroup.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for the EntryGroup.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for the EntryGroup.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for the EntryGroup.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for the EntryGroup.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 8;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 8;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. Denotes the transfer status of the Entry Group. It is
   * unspecified for Entry Group created from Dataplex API.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.TransferStatus transfer_status = 202 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for transferStatus.
   */
  int getTransferStatusValue();
  /**
   *
   *
   * <pre>
   * Output only. Denotes the transfer status of the Entry Group. It is
   * unspecified for Entry Group created from Dataplex API.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.TransferStatus transfer_status = 202 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The transferStatus.
   */
  com.google.cloud.dataplex.v1.TransferStatus getTransferStatus();
}
