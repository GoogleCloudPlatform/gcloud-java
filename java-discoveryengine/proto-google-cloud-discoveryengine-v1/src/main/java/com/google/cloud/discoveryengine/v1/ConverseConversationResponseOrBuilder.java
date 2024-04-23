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
// source: google/cloud/discoveryengine/v1/conversational_search_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1;

public interface ConverseConversationResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.ConverseConversationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Answer to the current query.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Reply reply = 1;</code>
   *
   * @return Whether the reply field is set.
   */
  boolean hasReply();
  /**
   *
   *
   * <pre>
   * Answer to the current query.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Reply reply = 1;</code>
   *
   * @return The reply.
   */
  com.google.cloud.discoveryengine.v1.Reply getReply();
  /**
   *
   *
   * <pre>
   * Answer to the current query.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Reply reply = 1;</code>
   */
  com.google.cloud.discoveryengine.v1.ReplyOrBuilder getReplyOrBuilder();

  /**
   *
   *
   * <pre>
   * Updated conversation including the answer.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Conversation conversation = 2;</code>
   *
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   *
   *
   * <pre>
   * Updated conversation including the answer.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Conversation conversation = 2;</code>
   *
   * @return The conversation.
   */
  com.google.cloud.discoveryengine.v1.Conversation getConversation();
  /**
   *
   *
   * <pre>
   * Updated conversation including the answer.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Conversation conversation = 2;</code>
   */
  com.google.cloud.discoveryengine.v1.ConversationOrBuilder getConversationOrBuilder();

  /**
   *
   *
   * <pre>
   * Search Results.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult search_results = 3;
   * </code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1.SearchResponse.SearchResult>
      getSearchResultsList();
  /**
   *
   *
   * <pre>
   * Search Results.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult search_results = 3;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.SearchResult getSearchResults(int index);
  /**
   *
   *
   * <pre>
   * Search Results.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult search_results = 3;
   * </code>
   */
  int getSearchResultsCount();
  /**
   *
   *
   * <pre>
   * Search Results.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult search_results = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1.SearchResponse.SearchResultOrBuilder>
      getSearchResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Search Results.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchResponse.SearchResult search_results = 3;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.SearchResponse.SearchResultOrBuilder
      getSearchResultsOrBuilder(int index);
}
