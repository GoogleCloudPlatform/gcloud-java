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
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface RetrievalOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Retrieval)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
   *
   * @return Whether the vertexAiSearch field is set.
   */
  boolean hasVertexAiSearch();
  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
   *
   * @return The vertexAiSearch.
   */
  com.google.cloud.aiplatform.v1.VertexAISearch getVertexAiSearch();
  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
   */
  com.google.cloud.aiplatform.v1.VertexAISearchOrBuilder getVertexAiSearchOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Deprecated. This option is no longer supported.
   * </pre>
   *
   * <code>
   * bool disable_attribution = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1.Retrieval.disable_attribution is deprecated. See
   *     google/cloud/aiplatform/v1/tool.proto;l=138
   * @return The disableAttribution.
   */
  @java.lang.Deprecated
  boolean getDisableAttribution();

  com.google.cloud.aiplatform.v1.Retrieval.SourceCase getSourceCase();
}
