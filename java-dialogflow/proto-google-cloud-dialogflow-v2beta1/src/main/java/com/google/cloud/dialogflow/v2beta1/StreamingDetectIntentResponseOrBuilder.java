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
// source: google/cloud/dialogflow/v2beta1/session.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface StreamingDetectIntentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the response. It can be used to
   * locate a response in the training example set or for reporting issues.
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
   * The unique identifier of the response. It can be used to
   * locate a response in the training example set or for reporting issues.
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
   * The result of speech recognition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.StreamingRecognitionResult recognition_result = 2;
   * </code>
   *
   * @return Whether the recognitionResult field is set.
   */
  boolean hasRecognitionResult();
  /**
   *
   *
   * <pre>
   * The result of speech recognition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.StreamingRecognitionResult recognition_result = 2;
   * </code>
   *
   * @return The recognitionResult.
   */
  com.google.cloud.dialogflow.v2beta1.StreamingRecognitionResult getRecognitionResult();
  /**
   *
   *
   * <pre>
   * The result of speech recognition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.StreamingRecognitionResult recognition_result = 2;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.StreamingRecognitionResultOrBuilder
      getRecognitionResultOrBuilder();

  /**
   *
   *
   * <pre>
   * The selected results of the conversational query or event processing.
   * See `alternative_query_results` for additional potential results.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryResult query_result = 3;</code>
   *
   * @return Whether the queryResult field is set.
   */
  boolean hasQueryResult();
  /**
   *
   *
   * <pre>
   * The selected results of the conversational query or event processing.
   * See `alternative_query_results` for additional potential results.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryResult query_result = 3;</code>
   *
   * @return The queryResult.
   */
  com.google.cloud.dialogflow.v2beta1.QueryResult getQueryResult();
  /**
   *
   *
   * <pre>
   * The selected results of the conversational query or event processing.
   * See `alternative_query_results` for additional potential results.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryResult query_result = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryResultOrBuilder getQueryResultOrBuilder();

  /**
   *
   *
   * <pre>
   * If Knowledge Connectors are enabled, there could be more than one result
   * returned for a given query or event, and this field will contain all
   * results except for the top one, which is captured in query_result. The
   * alternative results are ordered by decreasing
   * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are
   * disabled, this field will be empty until multiple responses for regular
   * intents are supported, at which point those additional results will be
   * surfaced here.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.QueryResult alternative_query_results = 7;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.QueryResult> getAlternativeQueryResultsList();
  /**
   *
   *
   * <pre>
   * If Knowledge Connectors are enabled, there could be more than one result
   * returned for a given query or event, and this field will contain all
   * results except for the top one, which is captured in query_result. The
   * alternative results are ordered by decreasing
   * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are
   * disabled, this field will be empty until multiple responses for regular
   * intents are supported, at which point those additional results will be
   * surfaced here.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.QueryResult alternative_query_results = 7;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryResult getAlternativeQueryResults(int index);
  /**
   *
   *
   * <pre>
   * If Knowledge Connectors are enabled, there could be more than one result
   * returned for a given query or event, and this field will contain all
   * results except for the top one, which is captured in query_result. The
   * alternative results are ordered by decreasing
   * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are
   * disabled, this field will be empty until multiple responses for regular
   * intents are supported, at which point those additional results will be
   * surfaced here.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.QueryResult alternative_query_results = 7;
   * </code>
   */
  int getAlternativeQueryResultsCount();
  /**
   *
   *
   * <pre>
   * If Knowledge Connectors are enabled, there could be more than one result
   * returned for a given query or event, and this field will contain all
   * results except for the top one, which is captured in query_result. The
   * alternative results are ordered by decreasing
   * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are
   * disabled, this field will be empty until multiple responses for regular
   * intents are supported, at which point those additional results will be
   * surfaced here.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.QueryResult alternative_query_results = 7;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.QueryResultOrBuilder>
      getAlternativeQueryResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * If Knowledge Connectors are enabled, there could be more than one result
   * returned for a given query or event, and this field will contain all
   * results except for the top one, which is captured in query_result. The
   * alternative results are ordered by decreasing
   * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are
   * disabled, this field will be empty until multiple responses for regular
   * intents are supported, at which point those additional results will be
   * surfaced here.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.QueryResult alternative_query_results = 7;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryResultOrBuilder getAlternativeQueryResultsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Specifies the status of the webhook request.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 4;</code>
   *
   * @return Whether the webhookStatus field is set.
   */
  boolean hasWebhookStatus();
  /**
   *
   *
   * <pre>
   * Specifies the status of the webhook request.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 4;</code>
   *
   * @return The webhookStatus.
   */
  com.google.rpc.Status getWebhookStatus();
  /**
   *
   *
   * <pre>
   * Specifies the status of the webhook request.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 4;</code>
   */
  com.google.rpc.StatusOrBuilder getWebhookStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in the request.
   * Note: The output audio is generated based on the values of default platform
   * text responses found in the `query_result.fulfillment_messages` field. If
   * multiple default text responses exist, they will be concatenated when
   * generating audio. If no default platform text responses exist, the
   * generated audio content will be empty.
   *
   * In some scenarios, multiple output audio fields may be present in the
   * response structure. In these cases, only the top-most-level audio output
   * has content.
   * </pre>
   *
   * <code>bytes output_audio = 5;</code>
   *
   * @return The outputAudio.
   */
  com.google.protobuf.ByteString getOutputAudio();

  /**
   *
   *
   * <pre>
   * The config used by the speech synthesizer to generate the output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 6;</code>
   *
   * @return Whether the outputAudioConfig field is set.
   */
  boolean hasOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * The config used by the speech synthesizer to generate the output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 6;</code>
   *
   * @return The outputAudioConfig.
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfig getOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * The config used by the speech synthesizer to generate the output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 6;</code>
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Debugging info that would get populated when
   * `StreamingDetectIntentRequest.enable_debugging_info` is set to true.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.CloudConversationDebuggingInfo debugging_info = 8;
   * </code>
   *
   * @return Whether the debuggingInfo field is set.
   */
  boolean hasDebuggingInfo();
  /**
   *
   *
   * <pre>
   * Debugging info that would get populated when
   * `StreamingDetectIntentRequest.enable_debugging_info` is set to true.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.CloudConversationDebuggingInfo debugging_info = 8;
   * </code>
   *
   * @return The debuggingInfo.
   */
  com.google.cloud.dialogflow.v2beta1.CloudConversationDebuggingInfo getDebuggingInfo();
  /**
   *
   *
   * <pre>
   * Debugging info that would get populated when
   * `StreamingDetectIntentRequest.enable_debugging_info` is set to true.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.CloudConversationDebuggingInfo debugging_info = 8;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.CloudConversationDebuggingInfoOrBuilder
      getDebuggingInfoOrBuilder();
}
