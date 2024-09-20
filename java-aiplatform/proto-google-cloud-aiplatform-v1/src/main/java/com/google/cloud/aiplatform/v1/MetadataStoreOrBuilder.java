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
// source: google/cloud/aiplatform/v1/metadata_store.proto

package com.google.cloud.aiplatform.v1;

public interface MetadataStoreOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.MetadataStore)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the MetadataStore instance.
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
   * Output only. The resource name of the MetadataStore instance.
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
   * Output only. Timestamp when this MetadataStore was created.
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
   * Output only. Timestamp when this MetadataStore was created.
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
   * Output only. Timestamp when this MetadataStore was created.
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
   * Output only. Timestamp when this MetadataStore was last updated.
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
   * Output only. Timestamp when this MetadataStore was last updated.
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
   * Output only. Timestamp when this MetadataStore was last updated.
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
   * Customer-managed encryption key spec for a Metadata Store. If set, this
   * Metadata Store and all sub-resources of this Metadata Store are secured
   * using this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 5;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a Metadata Store. If set, this
   * Metadata Store and all sub-resources of this Metadata Store are secured
   * using this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 5;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1.EncryptionSpec getEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a Metadata Store. If set, this
   * Metadata Store and all sub-resources of this Metadata Store are secured
   * using this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 5;</code>
   */
  com.google.cloud.aiplatform.v1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Description of the MetadataStore.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the MetadataStore.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. State information of the MetadataStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.MetadataStore.MetadataStoreState state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * Output only. State information of the MetadataStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.MetadataStore.MetadataStoreState state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1.MetadataStore.MetadataStoreState getState();
  /**
   *
   *
   * <pre>
   * Output only. State information of the MetadataStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.MetadataStore.MetadataStoreState state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.MetadataStore.MetadataStoreStateOrBuilder getStateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Dataplex integration settings.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.MetadataStore.DataplexConfig dataplex_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the dataplexConfig field is set.
   */
  boolean hasDataplexConfig();
  /**
   *
   *
   * <pre>
   * Optional. Dataplex integration settings.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.MetadataStore.DataplexConfig dataplex_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataplexConfig.
   */
  com.google.cloud.aiplatform.v1.MetadataStore.DataplexConfig getDataplexConfig();
  /**
   *
   *
   * <pre>
   * Optional. Dataplex integration settings.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.MetadataStore.DataplexConfig dataplex_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.MetadataStore.DataplexConfigOrBuilder getDataplexConfigOrBuilder();
}
