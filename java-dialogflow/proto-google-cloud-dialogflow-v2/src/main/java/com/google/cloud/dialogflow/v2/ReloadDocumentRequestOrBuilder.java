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
// source: google/cloud/dialogflow/v2/document.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2;

public interface ReloadDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ReloadDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the document to reload.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the document to reload.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The path of gcs source file for reloading document content. For
   * now, only gcs uri is supported.
   *
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * </pre>
   *
   * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the contentUri field is set.
   */
  boolean hasContentUri();
  /**
   *
   *
   * <pre>
   * Optional. The path of gcs source file for reloading document content. For
   * now, only gcs uri is supported.
   *
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * </pre>
   *
   * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The contentUri.
   */
  java.lang.String getContentUri();
  /**
   *
   *
   * <pre>
   * Optional. The path of gcs source file for reloading document content. For
   * now, only gcs uri is supported.
   *
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * </pre>
   *
   * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for contentUri.
   */
  com.google.protobuf.ByteString getContentUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Whether to import custom metadata from Google Cloud Storage.
   * Only valid when the document source is Google Cloud Storage URI.
   * </pre>
   *
   * <code>bool import_gcs_custom_metadata = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The importGcsCustomMetadata.
   */
  boolean getImportGcsCustomMetadata();

  /**
   *
   *
   * <pre>
   * Optional. When enabled, the reload request is to apply partial update to
   * the smart messaging allowlist.
   * </pre>
   *
   * <code>bool smart_messaging_partial_update = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The smartMessagingPartialUpdate.
   */
  boolean getSmartMessagingPartialUpdate();

  com.google.cloud.dialogflow.v2.ReloadDocumentRequest.SourceCase getSourceCase();
}
