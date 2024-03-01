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
// source: google/cloud/documentai/v1beta3/document_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.documentai.v1beta3;

public interface ListDocumentsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ListDocumentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Document metadata corresponding to the listed documents.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.DocumentMetadata document_metadata = 1;</code>
   */
  java.util.List<com.google.cloud.documentai.v1beta3.DocumentMetadata> getDocumentMetadataList();
  /**
   *
   *
   * <pre>
   * Document metadata corresponding to the listed documents.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.DocumentMetadata document_metadata = 1;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentMetadata getDocumentMetadata(int index);
  /**
   *
   *
   * <pre>
   * Document metadata corresponding to the listed documents.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.DocumentMetadata document_metadata = 1;</code>
   */
  int getDocumentMetadataCount();
  /**
   *
   *
   * <pre>
   * Document metadata corresponding to the listed documents.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.DocumentMetadata document_metadata = 1;</code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta3.DocumentMetadataOrBuilder>
      getDocumentMetadataOrBuilderList();
  /**
   *
   *
   * <pre>
   * Document metadata corresponding to the listed documents.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.DocumentMetadata document_metadata = 1;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentMetadataOrBuilder getDocumentMetadataOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListDocumentsRequest.page_token][google.cloud.documentai.v1beta3.ListDocumentsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListDocumentsRequest.page_token][google.cloud.documentai.v1beta3.ListDocumentsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Total count of documents queried.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();
}
