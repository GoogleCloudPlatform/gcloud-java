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
// source: google/cloud/documentai/v1/document_processor_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1;

public interface ProcessRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.ProcessRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document inline_document = 4;</code>
   *
   * @return Whether the inlineDocument field is set.
   */
  boolean hasInlineDocument();
  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document inline_document = 4;</code>
   *
   * @return The inlineDocument.
   */
  com.google.cloud.documentai.v1.Document getInlineDocument();
  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document inline_document = 4;</code>
   */
  com.google.cloud.documentai.v1.DocumentOrBuilder getInlineDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * A raw document content (bytes).
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.RawDocument raw_document = 5;</code>
   *
   * @return Whether the rawDocument field is set.
   */
  boolean hasRawDocument();
  /**
   *
   *
   * <pre>
   * A raw document content (bytes).
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.RawDocument raw_document = 5;</code>
   *
   * @return The rawDocument.
   */
  com.google.cloud.documentai.v1.RawDocument getRawDocument();
  /**
   *
   *
   * <pre>
   * A raw document content (bytes).
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.RawDocument raw_document = 5;</code>
   */
  com.google.cloud.documentai.v1.RawDocumentOrBuilder getRawDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * A raw document on Google Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.GcsDocument gcs_document = 8;</code>
   *
   * @return Whether the gcsDocument field is set.
   */
  boolean hasGcsDocument();
  /**
   *
   *
   * <pre>
   * A raw document on Google Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.GcsDocument gcs_document = 8;</code>
   *
   * @return The gcsDocument.
   */
  com.google.cloud.documentai.v1.GcsDocument getGcsDocument();
  /**
   *
   *
   * <pre>
   * A raw document on Google Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.GcsDocument gcs_document = 8;</code>
   */
  com.google.cloud.documentai.v1.GcsDocumentOrBuilder getGcsDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [Processor][google.cloud.documentai.v1.Processor] or
   * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion]
   * to use for processing. If a
   * [Processor][google.cloud.documentai.v1.Processor] is specified, the server
   * will use its [default
   * version][google.cloud.documentai.v1.Processor.default_processor_version].
   * Format: `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
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
   * Required. The resource name of the
   * [Processor][google.cloud.documentai.v1.Processor] or
   * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion]
   * to use for processing. If a
   * [Processor][google.cloud.documentai.v1.Processor] is specified, the server
   * will use its [default
   * version][google.cloud.documentai.v1.Processor.default_processor_version].
   * Format: `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
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
   * Whether human review should be skipped for this request. Default to
   * `false`.
   * </pre>
   *
   * <code>bool skip_human_review = 3;</code>
   *
   * @return The skipHumanReview.
   */
  boolean getSkipHumanReview();

  /**
   *
   *
   * <pre>
   * Specifies which fields to include in the
   * [ProcessResponse.document][google.cloud.documentai.v1.ProcessResponse.document]
   * output. Only supports top-level document and pages field, so it must be in
   * the form of `{document_field_name}` or `pages.{page_field_name}`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   *
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   *
   *
   * <pre>
   * Specifies which fields to include in the
   * [ProcessResponse.document][google.cloud.documentai.v1.ProcessResponse.document]
   * output. Only supports top-level document and pages field, so it must be in
   * the form of `{document_field_name}` or `pages.{page_field_name}`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   *
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   *
   *
   * <pre>
   * Specifies which fields to include in the
   * [ProcessResponse.document][google.cloud.documentai.v1.ProcessResponse.document]
   * output. Only supports top-level document and pages field, so it must be in
   * the form of `{document_field_name}` or `pages.{page_field_name}`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Inference-time options for the process API
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.ProcessOptions process_options = 7;</code>
   *
   * @return Whether the processOptions field is set.
   */
  boolean hasProcessOptions();
  /**
   *
   *
   * <pre>
   * Inference-time options for the process API
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.ProcessOptions process_options = 7;</code>
   *
   * @return The processOptions.
   */
  com.google.cloud.documentai.v1.ProcessOptions getProcessOptions();
  /**
   *
   *
   * <pre>
   * Inference-time options for the process API
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.ProcessOptions process_options = 7;</code>
   */
  com.google.cloud.documentai.v1.ProcessOptionsOrBuilder getProcessOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints) and can only contain lowercase letters, numeric
   * characters, underscores, and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints) and can only contain lowercase letters, numeric
   * characters, underscores, and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints) and can only contain lowercase letters, numeric
   * characters, underscores, and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints) and can only contain lowercase letters, numeric
   * characters, underscores, and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints) and can only contain lowercase letters, numeric
   * characters, underscores, and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  com.google.cloud.documentai.v1.ProcessRequest.SourceCase getSourceCase();
}
