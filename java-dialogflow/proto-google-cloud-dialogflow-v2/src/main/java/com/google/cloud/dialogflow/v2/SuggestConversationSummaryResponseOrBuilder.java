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
// source: google/cloud/dialogflow/v2/conversation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

public interface SuggestConversationSummaryResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SuggestConversationSummaryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Generated summary.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SuggestConversationSummaryResponse.Summary summary = 1;
   * </code>
   *
   * @return Whether the summary field is set.
   */
  boolean hasSummary();
  /**
   *
   *
   * <pre>
   * Generated summary.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SuggestConversationSummaryResponse.Summary summary = 1;
   * </code>
   *
   * @return The summary.
   */
  com.google.cloud.dialogflow.v2.SuggestConversationSummaryResponse.Summary getSummary();
  /**
   *
   *
   * <pre>
   * Generated summary.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SuggestConversationSummaryResponse.Summary summary = 1;
   * </code>
   */
  com.google.cloud.dialogflow.v2.SuggestConversationSummaryResponse.SummaryOrBuilder
      getSummaryOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the latest conversation message used as context for
   * compiling suggestion.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The latestMessage.
   */
  java.lang.String getLatestMessage();
  /**
   *
   *
   * <pre>
   * The name of the latest conversation message used as context for
   * compiling suggestion.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for latestMessage.
   */
  com.google.protobuf.ByteString getLatestMessageBytes();

  /**
   *
   *
   * <pre>
   * Number of messages prior to and including
   * [last_conversation_message][] used to compile the suggestion. It may be
   * smaller than the [SuggestSummaryRequest.context_size][] field in the
   * request if there weren't that many messages in the conversation.
   * </pre>
   *
   * <code>int32 context_size = 3;</code>
   *
   * @return The contextSize.
   */
  int getContextSize();
}
