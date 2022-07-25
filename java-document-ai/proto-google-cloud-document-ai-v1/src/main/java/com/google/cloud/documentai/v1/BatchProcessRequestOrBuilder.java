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
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

public interface BatchProcessRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.BatchProcessRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The processor resource name.
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
   * Required. The processor resource name.
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
   * The input documents for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.BatchDocumentsInputConfig input_documents = 5;</code>
   *
   * @return Whether the inputDocuments field is set.
   */
  boolean hasInputDocuments();
  /**
   *
   *
   * <pre>
   * The input documents for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.BatchDocumentsInputConfig input_documents = 5;</code>
   *
   * @return The inputDocuments.
   */
  com.google.cloud.documentai.v1.BatchDocumentsInputConfig getInputDocuments();
  /**
   *
   *
   * <pre>
   * The input documents for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.BatchDocumentsInputConfig input_documents = 5;</code>
   */
  com.google.cloud.documentai.v1.BatchDocumentsInputConfigOrBuilder getInputDocumentsOrBuilder();

  /**
   *
   *
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.DocumentOutputConfig document_output_config = 6;</code>
   *
   * @return Whether the documentOutputConfig field is set.
   */
  boolean hasDocumentOutputConfig();
  /**
   *
   *
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.DocumentOutputConfig document_output_config = 6;</code>
   *
   * @return The documentOutputConfig.
   */
  com.google.cloud.documentai.v1.DocumentOutputConfig getDocumentOutputConfig();
  /**
   *
   *
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.DocumentOutputConfig document_output_config = 6;</code>
   */
  com.google.cloud.documentai.v1.DocumentOutputConfigOrBuilder getDocumentOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether Human Review feature should be skipped for this request. Default to
   * false.
   * </pre>
   *
   * <code>bool skip_human_review = 4;</code>
   *
   * @return The skipHumanReview.
   */
  boolean getSkipHumanReview();
}
