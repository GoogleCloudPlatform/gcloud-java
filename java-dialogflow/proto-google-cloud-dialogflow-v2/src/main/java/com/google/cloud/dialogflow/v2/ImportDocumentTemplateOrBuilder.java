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

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

public interface ImportDocumentTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ImportDocumentTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The MIME type of the document.
   * </pre>
   *
   * <code>string mime_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Required. The MIME type of the document.
   * </pre>
   *
   * <code>string mime_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Document.KnowledgeType knowledge_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the knowledgeTypes.
   */
  java.util.List<com.google.cloud.dialogflow.v2.Document.KnowledgeType> getKnowledgeTypesList();
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Document.KnowledgeType knowledge_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of knowledgeTypes.
   */
  int getKnowledgeTypesCount();
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Document.KnowledgeType knowledge_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The knowledgeTypes at the given index.
   */
  com.google.cloud.dialogflow.v2.Document.KnowledgeType getKnowledgeTypes(int index);
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Document.KnowledgeType knowledge_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for knowledgeTypes.
   */
  java.util.List<java.lang.Integer> getKnowledgeTypesValueList();
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Document.KnowledgeType knowledge_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of knowledgeTypes at the given index.
   */
  int getKnowledgeTypesValue(int index);

  /**
   *
   *
   * <pre>
   * Metadata for the document. The metadata supports arbitrary
   * key-value pairs. Suggested use cases include storing a document's title,
   * an external URL distinct from the document's content_uri, etc.
   * The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * Metadata for the document. The metadata supports arbitrary
   * key-value pairs. Suggested use cases include storing a document's title,
   * an external URL distinct from the document's content_uri, etc.
   * The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for the document. The metadata supports arbitrary
   * key-value pairs. Suggested use cases include storing a document's title,
   * an external URL distinct from the document's content_uri, etc.
   * The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * Metadata for the document. The metadata supports arbitrary
   * key-value pairs. Suggested use cases include storing a document's title,
   * an external URL distinct from the document's content_uri, etc.
   * The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Metadata for the document. The metadata supports arbitrary
   * key-value pairs. Suggested use cases include storing a document's title,
   * an external URL distinct from the document's content_uri, etc.
   * The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);
}
