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
// source: google/cloud/discoveryengine/v1alpha/document_processing_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1alpha;

public interface DocumentProcessingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full resource name of the Document Processing Config.
   * Format:
   * `projects/&#42;&#47;locations/&#42;&#47;collections/&#42;&#47;dataStores/&#42;&#47;documentProcessingConfig`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The full resource name of the Document Processing Config.
   * Format:
   * `projects/&#42;&#47;locations/&#42;&#47;collections/&#42;&#47;dataStores/&#42;&#47;documentProcessingConfig`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Whether chunking mode is enabled.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ChunkingConfig chunking_config = 3;
   * </code>
   *
   * @return Whether the chunkingConfig field is set.
   */
  boolean hasChunkingConfig();
  /**
   *
   *
   * <pre>
   * Whether chunking mode is enabled.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ChunkingConfig chunking_config = 3;
   * </code>
   *
   * @return The chunkingConfig.
   */
  com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ChunkingConfig
      getChunkingConfig();
  /**
   *
   *
   * <pre>
   * Whether chunking mode is enabled.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ChunkingConfig chunking_config = 3;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ChunkingConfigOrBuilder
      getChunkingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configurations for default Document parser.
   * If not specified, we will configure it as default DigitalParsingConfig, and
   * the default parsing config will be applied to all file types for Document
   * parsing.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig default_parsing_config = 4;
   * </code>
   *
   * @return Whether the defaultParsingConfig field is set.
   */
  boolean hasDefaultParsingConfig();
  /**
   *
   *
   * <pre>
   * Configurations for default Document parser.
   * If not specified, we will configure it as default DigitalParsingConfig, and
   * the default parsing config will be applied to all file types for Document
   * parsing.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig default_parsing_config = 4;
   * </code>
   *
   * @return The defaultParsingConfig.
   */
  com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig
      getDefaultParsingConfig();
  /**
   *
   *
   * <pre>
   * Configurations for default Document parser.
   * If not specified, we will configure it as default DigitalParsingConfig, and
   * the default parsing config will be applied to all file types for Document
   * parsing.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig default_parsing_config = 4;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfigOrBuilder
      getDefaultParsingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Map from file type to override the default parsing configuration based on
   * the file type. Supported keys:
   * * `pdf`: Override parsing config for PDF files, either digital parsing, ocr
   * parsing or layout parsing is supported.
   * * `html`: Override parsing config for HTML files, only digital parsing and
   * or layout parsing are supported.
   * * `docx`: Override parsing config for DOCX files, only digital parsing and
   * or layout parsing are supported.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig&gt; parsing_config_overrides = 5;
   * </code>
   */
  int getParsingConfigOverridesCount();
  /**
   *
   *
   * <pre>
   * Map from file type to override the default parsing configuration based on
   * the file type. Supported keys:
   * * `pdf`: Override parsing config for PDF files, either digital parsing, ocr
   * parsing or layout parsing is supported.
   * * `html`: Override parsing config for HTML files, only digital parsing and
   * or layout parsing are supported.
   * * `docx`: Override parsing config for DOCX files, only digital parsing and
   * or layout parsing are supported.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig&gt; parsing_config_overrides = 5;
   * </code>
   */
  boolean containsParsingConfigOverrides(java.lang.String key);
  /** Use {@link #getParsingConfigOverridesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig>
      getParsingConfigOverrides();
  /**
   *
   *
   * <pre>
   * Map from file type to override the default parsing configuration based on
   * the file type. Supported keys:
   * * `pdf`: Override parsing config for PDF files, either digital parsing, ocr
   * parsing or layout parsing is supported.
   * * `html`: Override parsing config for HTML files, only digital parsing and
   * or layout parsing are supported.
   * * `docx`: Override parsing config for DOCX files, only digital parsing and
   * or layout parsing are supported.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig&gt; parsing_config_overrides = 5;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig>
      getParsingConfigOverridesMap();
  /**
   *
   *
   * <pre>
   * Map from file type to override the default parsing configuration based on
   * the file type. Supported keys:
   * * `pdf`: Override parsing config for PDF files, either digital parsing, ocr
   * parsing or layout parsing is supported.
   * * `html`: Override parsing config for HTML files, only digital parsing and
   * or layout parsing are supported.
   * * `docx`: Override parsing config for DOCX files, only digital parsing and
   * or layout parsing are supported.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig&gt; parsing_config_overrides = 5;
   * </code>
   */
  /* nullable */
  com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig
      getParsingConfigOverridesOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig
              defaultValue);
  /**
   *
   *
   * <pre>
   * Map from file type to override the default parsing configuration based on
   * the file type. Supported keys:
   * * `pdf`: Override parsing config for PDF files, either digital parsing, ocr
   * parsing or layout parsing is supported.
   * * `html`: Override parsing config for HTML files, only digital parsing and
   * or layout parsing are supported.
   * * `docx`: Override parsing config for DOCX files, only digital parsing and
   * or layout parsing are supported.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig&gt; parsing_config_overrides = 5;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.ParsingConfig
      getParsingConfigOverridesOrThrow(java.lang.String key);
}
