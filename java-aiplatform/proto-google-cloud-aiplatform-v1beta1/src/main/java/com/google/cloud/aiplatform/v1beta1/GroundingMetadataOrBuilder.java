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
// source: google/cloud/aiplatform/v1beta1/content.proto

package com.google.cloud.aiplatform.v1beta1;

public interface GroundingMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.GroundingMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the webSearchQueries.
   */
  java.util.List<java.lang.String> getWebSearchQueriesList();
  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of webSearchQueries.
   */
  int getWebSearchQueriesCount();
  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The webSearchQueries at the given index.
   */
  java.lang.String getWebSearchQueries(int index);
  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the webSearchQueries at the given index.
   */
  com.google.protobuf.ByteString getWebSearchQueriesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Google search entry for the following-up web searches.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1beta1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the searchEntryPoint field is set.
   */
  boolean hasSearchEntryPoint();
  /**
   *
   *
   * <pre>
   * Optional. Google search entry for the following-up web searches.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1beta1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The searchEntryPoint.
   */
  com.google.cloud.aiplatform.v1beta1.SearchEntryPoint getSearchEntryPoint();
  /**
   *
   *
   * <pre>
   * Optional. Google search entry for the following-up web searches.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1beta1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.SearchEntryPointOrBuilder getSearchEntryPointOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Queries executed by the retrieval tools.
   * </pre>
   *
   * <code>repeated string retrieval_queries = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the retrievalQueries.
   */
  java.util.List<java.lang.String> getRetrievalQueriesList();
  /**
   *
   *
   * <pre>
   * Optional. Queries executed by the retrieval tools.
   * </pre>
   *
   * <code>repeated string retrieval_queries = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of retrievalQueries.
   */
  int getRetrievalQueriesCount();
  /**
   *
   *
   * <pre>
   * Optional. Queries executed by the retrieval tools.
   * </pre>
   *
   * <code>repeated string retrieval_queries = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The retrievalQueries at the given index.
   */
  java.lang.String getRetrievalQueries(int index);
  /**
   *
   *
   * <pre>
   * Optional. Queries executed by the retrieval tools.
   * </pre>
   *
   * <code>repeated string retrieval_queries = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the retrievalQueries at the given index.
   */
  com.google.protobuf.ByteString getRetrievalQueriesBytes(int index);

  /**
   *
   *
   * <pre>
   * List of supporting references retrieved from specified grounding source.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.GroundingChunk grounding_chunks = 5;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.GroundingChunk> getGroundingChunksList();
  /**
   *
   *
   * <pre>
   * List of supporting references retrieved from specified grounding source.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.GroundingChunk grounding_chunks = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GroundingChunk getGroundingChunks(int index);
  /**
   *
   *
   * <pre>
   * List of supporting references retrieved from specified grounding source.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.GroundingChunk grounding_chunks = 5;</code>
   */
  int getGroundingChunksCount();
  /**
   *
   *
   * <pre>
   * List of supporting references retrieved from specified grounding source.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.GroundingChunk grounding_chunks = 5;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.GroundingChunkOrBuilder>
      getGroundingChunksOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of supporting references retrieved from specified grounding source.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.GroundingChunk grounding_chunks = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GroundingChunkOrBuilder getGroundingChunksOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. List of grounding support.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.GroundingSupport grounding_supports = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.GroundingSupport> getGroundingSupportsList();
  /**
   *
   *
   * <pre>
   * Optional. List of grounding support.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.GroundingSupport grounding_supports = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.GroundingSupport getGroundingSupports(int index);
  /**
   *
   *
   * <pre>
   * Optional. List of grounding support.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.GroundingSupport grounding_supports = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getGroundingSupportsCount();
  /**
   *
   *
   * <pre>
   * Optional. List of grounding support.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.GroundingSupport grounding_supports = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.GroundingSupportOrBuilder>
      getGroundingSupportsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. List of grounding support.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.GroundingSupport grounding_supports = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.GroundingSupportOrBuilder getGroundingSupportsOrBuilder(
      int index);
}
