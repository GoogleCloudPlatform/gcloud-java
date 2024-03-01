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
// source: google/cloud/documentai/v1beta3/document_schema.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.documentai.v1beta3;

public interface FieldExtractionMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.FieldExtractionMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Summary options config.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
   *
   * @return Whether the summaryOptions field is set.
   */
  boolean hasSummaryOptions();
  /**
   *
   *
   * <pre>
   * Summary options config.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
   *
   * @return The summaryOptions.
   */
  com.google.cloud.documentai.v1beta3.SummaryOptions getSummaryOptions();
  /**
   *
   *
   * <pre>
   * Summary options config.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.SummaryOptions summary_options = 2;</code>
   */
  com.google.cloud.documentai.v1beta3.SummaryOptionsOrBuilder getSummaryOptionsOrBuilder();
}
