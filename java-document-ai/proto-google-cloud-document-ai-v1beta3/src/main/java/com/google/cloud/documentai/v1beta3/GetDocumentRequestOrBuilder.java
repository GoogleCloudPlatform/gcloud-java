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

public interface GetDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.GetDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the dataset that the document belongs to .
   * Format:
   * projects/{project}/locations/{location}/processors/{processor}/dataset
   * </pre>
   *
   * <code>
   * string dataset = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The dataset.
   */
  java.lang.String getDataset();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the dataset that the document belongs to .
   * Format:
   * projects/{project}/locations/{location}/processors/{processor}/dataset
   * </pre>
   *
   * <code>
   * string dataset = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString getDatasetBytes();

  /**
   *
   *
   * <pre>
   * Required. Document identifier.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DocumentId document_id = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the documentId field is set.
   */
  boolean hasDocumentId();
  /**
   *
   *
   * <pre>
   * Required. Document identifier.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DocumentId document_id = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The documentId.
   */
  com.google.cloud.documentai.v1beta3.DocumentId getDocumentId();
  /**
   *
   *
   * <pre>
   * Required. Document identifier.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DocumentId document_id = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.documentai.v1beta3.DocumentIdOrBuilder getDocumentIdOrBuilder();

  /**
   *
   *
   * <pre>
   * If set, only fields listed here will be returned. Otherwise, all fields
   * will be returned by default.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 3;</code>
   *
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * If set, only fields listed here will be returned. Otherwise, all fields
   * will be returned by default.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 3;</code>
   *
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * If set, only fields listed here will be returned. Otherwise, all fields
   * will be returned by default.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * List of pages for which the fields specified in the `read_mask` must
   * be served.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentPageRange page_range = 4;</code>
   *
   * @return Whether the pageRange field is set.
   */
  boolean hasPageRange();
  /**
   *
   *
   * <pre>
   * List of pages for which the fields specified in the `read_mask` must
   * be served.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentPageRange page_range = 4;</code>
   *
   * @return The pageRange.
   */
  com.google.cloud.documentai.v1beta3.DocumentPageRange getPageRange();
  /**
   *
   *
   * <pre>
   * List of pages for which the fields specified in the `read_mask` must
   * be served.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentPageRange page_range = 4;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentPageRangeOrBuilder getPageRangeOrBuilder();
}
