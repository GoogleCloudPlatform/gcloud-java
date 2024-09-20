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
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data.proto

package com.google.cloud.aiplatform.v1beta1;

public interface UploadRagFileConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UploadRagFileConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the size and overlap of chunks after uploading RagFile.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig rag_file_chunking_config = 1;
   * </code>
   *
   * @return Whether the ragFileChunkingConfig field is set.
   */
  boolean hasRagFileChunkingConfig();
  /**
   *
   *
   * <pre>
   * Specifies the size and overlap of chunks after uploading RagFile.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig rag_file_chunking_config = 1;
   * </code>
   *
   * @return The ragFileChunkingConfig.
   */
  com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig getRagFileChunkingConfig();
  /**
   *
   *
   * <pre>
   * Specifies the size and overlap of chunks after uploading RagFile.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig rag_file_chunking_config = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfigOrBuilder
      getRagFileChunkingConfigOrBuilder();
}
