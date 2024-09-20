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
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface UpdateRagCorpusRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdateRagCorpusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The RagCorpus which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagCorpus rag_corpus = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the ragCorpus field is set.
   */
  boolean hasRagCorpus();
  /**
   *
   *
   * <pre>
   * Required. The RagCorpus which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagCorpus rag_corpus = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The ragCorpus.
   */
  com.google.cloud.aiplatform.v1beta1.RagCorpus getRagCorpus();
  /**
   *
   *
   * <pre>
   * Required. The RagCorpus which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagCorpus rag_corpus = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.RagCorpusOrBuilder getRagCorpusOrBuilder();
}
