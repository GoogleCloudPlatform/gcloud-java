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
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface BatchUpdateEntityTypesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the agent to update or create entity types in.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
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
   * Required. The name of the agent to update or create entity types in.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
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
   * The URI to a Google Cloud Storage file containing entity types to update
   * or create. The file format can either be a serialized proto (of
   * EntityBatch type) or a JSON object. Note: The URI must start with
   * "gs://".
   * </pre>
   *
   * <code>string entity_type_batch_uri = 2;</code>
   *
   * @return Whether the entityTypeBatchUri field is set.
   */
  boolean hasEntityTypeBatchUri();
  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing entity types to update
   * or create. The file format can either be a serialized proto (of
   * EntityBatch type) or a JSON object. Note: The URI must start with
   * "gs://".
   * </pre>
   *
   * <code>string entity_type_batch_uri = 2;</code>
   *
   * @return The entityTypeBatchUri.
   */
  java.lang.String getEntityTypeBatchUri();
  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing entity types to update
   * or create. The file format can either be a serialized proto (of
   * EntityBatch type) or a JSON object. Note: The URI must start with
   * "gs://".
   * </pre>
   *
   * <code>string entity_type_batch_uri = 2;</code>
   *
   * @return The bytes for entityTypeBatchUri.
   */
  com.google.protobuf.ByteString getEntityTypeBatchUriBytes();

  /**
   *
   *
   * <pre>
   * The collection of entity types to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EntityTypeBatch entity_type_batch_inline = 3;</code>
   *
   * @return Whether the entityTypeBatchInline field is set.
   */
  boolean hasEntityTypeBatchInline();
  /**
   *
   *
   * <pre>
   * The collection of entity types to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EntityTypeBatch entity_type_batch_inline = 3;</code>
   *
   * @return The entityTypeBatchInline.
   */
  com.google.cloud.dialogflow.v2beta1.EntityTypeBatch getEntityTypeBatchInline();
  /**
   *
   *
   * <pre>
   * The collection of entity types to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EntityTypeBatch entity_type_batch_inline = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EntityTypeBatchOrBuilder getEntityTypeBatchInlineOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.EntityTypeBatchCase
      getEntityTypeBatchCase();
}
