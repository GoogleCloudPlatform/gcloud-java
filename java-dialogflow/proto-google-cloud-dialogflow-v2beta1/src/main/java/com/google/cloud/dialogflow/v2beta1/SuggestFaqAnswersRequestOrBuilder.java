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
// source: google/cloud/dialogflow/v2beta1/participant.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2beta1;

public interface SuggestFaqAnswersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SuggestFaqAnswersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the participant to fetch suggestion for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the participant to fetch suggestion for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the latest conversation message to compile suggestion
   * for. If empty, it will be the latest message of the conversation.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>
   * string latest_message = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The latestMessage.
   */
  java.lang.String getLatestMessage();
  /**
   *
   *
   * <pre>
   * Optional. The name of the latest conversation message to compile suggestion
   * for. If empty, it will be the latest message of the conversation.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>
   * string latest_message = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for latestMessage.
   */
  com.google.protobuf.ByteString getLatestMessageBytes();

  /**
   *
   *
   * <pre>
   * Optional. Max number of messages prior to and including
   * [latest_message] to use as context when compiling the
   * suggestion. By default 20 and at most 50.
   * </pre>
   *
   * <code>int32 context_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The contextSize.
   */
  int getContextSize();

  /**
   *
   *
   * <pre>
   * Optional. Parameters for a human assist query.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AssistQueryParameters assist_query_params = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the assistQueryParams field is set.
   */
  boolean hasAssistQueryParams();
  /**
   *
   *
   * <pre>
   * Optional. Parameters for a human assist query.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AssistQueryParameters assist_query_params = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The assistQueryParams.
   */
  com.google.cloud.dialogflow.v2beta1.AssistQueryParameters getAssistQueryParams();
  /**
   *
   *
   * <pre>
   * Optional. Parameters for a human assist query.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AssistQueryParameters assist_query_params = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.AssistQueryParametersOrBuilder
      getAssistQueryParamsOrBuilder();
}
