/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface StreamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.Stream)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The stream's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The stream's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation time of the stream.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time of the stream.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time of the stream.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update time of the stream.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update time of the stream.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update time of the stream.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
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
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Display name.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. Display name.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Source connection profile configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.SourceConfig source_config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the sourceConfig field is set.
   */
  boolean hasSourceConfig();
  /**
   *
   *
   * <pre>
   * Required. Source connection profile configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.SourceConfig source_config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sourceConfig.
   */
  com.google.cloud.datastream.v1.SourceConfig getSourceConfig();
  /**
   *
   *
   * <pre>
   * Required. Source connection profile configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.SourceConfig source_config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datastream.v1.SourceConfigOrBuilder getSourceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Destination connection profile configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.DestinationConfig destination_config = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the destinationConfig field is set.
   */
  boolean hasDestinationConfig();
  /**
   *
   *
   * <pre>
   * Required. Destination connection profile configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.DestinationConfig destination_config = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The destinationConfig.
   */
  com.google.cloud.datastream.v1.DestinationConfig getDestinationConfig();
  /**
   *
   *
   * <pre>
   * Required. Destination connection profile configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.DestinationConfig destination_config = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datastream.v1.DestinationConfigOrBuilder getDestinationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The state of the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.Stream.State state = 8;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.Stream.State state = 8;</code>
   *
   * @return The state.
   */
  com.google.cloud.datastream.v1.Stream.State getState();

  /**
   *
   *
   * <pre>
   * Automatically backfill objects included in the stream source
   * configuration. Specific objects can be excluded.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.Stream.BackfillAllStrategy backfill_all = 101;</code>
   *
   * @return Whether the backfillAll field is set.
   */
  boolean hasBackfillAll();
  /**
   *
   *
   * <pre>
   * Automatically backfill objects included in the stream source
   * configuration. Specific objects can be excluded.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.Stream.BackfillAllStrategy backfill_all = 101;</code>
   *
   * @return The backfillAll.
   */
  com.google.cloud.datastream.v1.Stream.BackfillAllStrategy getBackfillAll();
  /**
   *
   *
   * <pre>
   * Automatically backfill objects included in the stream source
   * configuration. Specific objects can be excluded.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.Stream.BackfillAllStrategy backfill_all = 101;</code>
   */
  com.google.cloud.datastream.v1.Stream.BackfillAllStrategyOrBuilder getBackfillAllOrBuilder();

  /**
   *
   *
   * <pre>
   * Do not automatically backfill any objects.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.Stream.BackfillNoneStrategy backfill_none = 102;</code>
   *
   * @return Whether the backfillNone field is set.
   */
  boolean hasBackfillNone();
  /**
   *
   *
   * <pre>
   * Do not automatically backfill any objects.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.Stream.BackfillNoneStrategy backfill_none = 102;</code>
   *
   * @return The backfillNone.
   */
  com.google.cloud.datastream.v1.Stream.BackfillNoneStrategy getBackfillNone();
  /**
   *
   *
   * <pre>
   * Do not automatically backfill any objects.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.Stream.BackfillNoneStrategy backfill_none = 102;</code>
   */
  com.google.cloud.datastream.v1.Stream.BackfillNoneStrategyOrBuilder getBackfillNoneOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Errors on the Stream.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datastream.v1.Error errors = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.datastream.v1.Error> getErrorsList();
  /**
   *
   *
   * <pre>
   * Output only. Errors on the Stream.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datastream.v1.Error errors = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datastream.v1.Error getErrors(int index);
  /**
   *
   *
   * <pre>
   * Output only. Errors on the Stream.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datastream.v1.Error errors = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Output only. Errors on the Stream.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datastream.v1.Error errors = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1.ErrorOrBuilder> getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Errors on the Stream.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datastream.v1.Error errors = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datastream.v1.ErrorOrBuilder getErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Immutable. A reference to a KMS encryption key.
   * If provided, it will be used to encrypt the data.
   * If left blank, data will be encrypted using an internal Stream-specific
   * encryption key provisioned through KMS.
   * </pre>
   *
   * <code>
   * optional string customer_managed_encryption_key = 10 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the customerManagedEncryptionKey field is set.
   */
  boolean hasCustomerManagedEncryptionKey();
  /**
   *
   *
   * <pre>
   * Immutable. A reference to a KMS encryption key.
   * If provided, it will be used to encrypt the data.
   * If left blank, data will be encrypted using an internal Stream-specific
   * encryption key provisioned through KMS.
   * </pre>
   *
   * <code>
   * optional string customer_managed_encryption_key = 10 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The customerManagedEncryptionKey.
   */
  java.lang.String getCustomerManagedEncryptionKey();
  /**
   *
   *
   * <pre>
   * Immutable. A reference to a KMS encryption key.
   * If provided, it will be used to encrypt the data.
   * If left blank, data will be encrypted using an internal Stream-specific
   * encryption key provisioned through KMS.
   * </pre>
   *
   * <code>
   * optional string customer_managed_encryption_key = 10 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for customerManagedEncryptionKey.
   */
  com.google.protobuf.ByteString getCustomerManagedEncryptionKeyBytes();

  public com.google.cloud.datastream.v1.Stream.BackfillStrategyCase getBackfillStrategyCase();
}
