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
// source: google/cloud/dialogflow/v2beta1/webhook.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2beta1;

public interface WebhookRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.WebhookRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of detectIntent request session.
   * Can be used to identify end-user inside webhook implementation.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/sessions/&lt;Session
   *   ID&gt;`,
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *   ID&gt;/sessions/&lt;Session ID&gt;`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   *   ID&gt;`,
   * </pre>
   *
   * <code>string session = 4;</code>
   *
   * @return The session.
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * The unique identifier of detectIntent request session.
   * Can be used to identify end-user inside webhook implementation.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/sessions/&lt;Session
   *   ID&gt;`,
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *   ID&gt;/sessions/&lt;Session ID&gt;`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   *   ID&gt;`,
   * </pre>
   *
   * <code>string session = 4;</code>
   *
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * The unique identifier of the response. Contains the same value as
   * `[Streaming]DetectIntentResponse.response_id`.
   * </pre>
   *
   * <code>string response_id = 1;</code>
   *
   * @return The responseId.
   */
  java.lang.String getResponseId();
  /**
   *
   *
   * <pre>
   * The unique identifier of the response. Contains the same value as
   * `[Streaming]DetectIntentResponse.response_id`.
   * </pre>
   *
   * <code>string response_id = 1;</code>
   *
   * @return The bytes for responseId.
   */
  com.google.protobuf.ByteString getResponseIdBytes();

  /**
   *
   *
   * <pre>
   * The result of the conversational query or event processing. Contains the
   * same value as `[Streaming]DetectIntentResponse.query_result`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryResult query_result = 2;</code>
   *
   * @return Whether the queryResult field is set.
   */
  boolean hasQueryResult();
  /**
   *
   *
   * <pre>
   * The result of the conversational query or event processing. Contains the
   * same value as `[Streaming]DetectIntentResponse.query_result`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryResult query_result = 2;</code>
   *
   * @return The queryResult.
   */
  com.google.cloud.dialogflow.v2beta1.QueryResult getQueryResult();
  /**
   *
   *
   * <pre>
   * The result of the conversational query or event processing. Contains the
   * same value as `[Streaming]DetectIntentResponse.query_result`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryResult query_result = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryResultOrBuilder getQueryResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Alternative query results from KnowledgeService.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.QueryResult alternative_query_results = 5;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.QueryResult> getAlternativeQueryResultsList();
  /**
   *
   *
   * <pre>
   * Alternative query results from KnowledgeService.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.QueryResult alternative_query_results = 5;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryResult getAlternativeQueryResults(int index);
  /**
   *
   *
   * <pre>
   * Alternative query results from KnowledgeService.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.QueryResult alternative_query_results = 5;
   * </code>
   */
  int getAlternativeQueryResultsCount();
  /**
   *
   *
   * <pre>
   * Alternative query results from KnowledgeService.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.QueryResult alternative_query_results = 5;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.QueryResultOrBuilder>
      getAlternativeQueryResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Alternative query results from KnowledgeService.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.QueryResult alternative_query_results = 5;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryResultOrBuilder getAlternativeQueryResultsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. The contents of the original request that was passed to
   * `[Streaming]DetectIntent` call.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest original_detect_intent_request = 3;
   * </code>
   *
   * @return Whether the originalDetectIntentRequest field is set.
   */
  boolean hasOriginalDetectIntentRequest();
  /**
   *
   *
   * <pre>
   * Optional. The contents of the original request that was passed to
   * `[Streaming]DetectIntent` call.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest original_detect_intent_request = 3;
   * </code>
   *
   * @return The originalDetectIntentRequest.
   */
  com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest getOriginalDetectIntentRequest();
  /**
   *
   *
   * <pre>
   * Optional. The contents of the original request that was passed to
   * `[Streaming]DetectIntent` call.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest original_detect_intent_request = 3;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequestOrBuilder
      getOriginalDetectIntentRequestOrBuilder();
}
