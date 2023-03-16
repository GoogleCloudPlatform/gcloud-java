/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dialogflow/v2/conversation_profile.proto

package com.google.cloud.dialogflow.v2;

public interface HumanAgentAssistantConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.HumanAgentAssistantConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Pub/Sub topic on which to publish new agent assistant events.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig notification_config = 2;</code>
   *
   * @return Whether the notificationConfig field is set.
   */
  boolean hasNotificationConfig();
  /**
   *
   *
   * <pre>
   * Pub/Sub topic on which to publish new agent assistant events.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig notification_config = 2;</code>
   *
   * @return The notificationConfig.
   */
  com.google.cloud.dialogflow.v2.NotificationConfig getNotificationConfig();
  /**
   *
   *
   * <pre>
   * Pub/Sub topic on which to publish new agent assistant events.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig notification_config = 2;</code>
   */
  com.google.cloud.dialogflow.v2.NotificationConfigOrBuilder getNotificationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for agent assistance of human agent participant.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig human_agent_suggestion_config = 3;
   * </code>
   *
   * @return Whether the humanAgentSuggestionConfig field is set.
   */
  boolean hasHumanAgentSuggestionConfig();
  /**
   *
   *
   * <pre>
   * Configuration for agent assistance of human agent participant.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig human_agent_suggestion_config = 3;
   * </code>
   *
   * @return The humanAgentSuggestionConfig.
   */
  com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig
      getHumanAgentSuggestionConfig();
  /**
   *
   *
   * <pre>
   * Configuration for agent assistance of human agent participant.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig human_agent_suggestion_config = 3;
   * </code>
   */
  com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfigOrBuilder
      getHumanAgentSuggestionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for agent assistance of end user participant.
   * Currently, this feature is not general available, please contact Google
   * to get access.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig end_user_suggestion_config = 4;
   * </code>
   *
   * @return Whether the endUserSuggestionConfig field is set.
   */
  boolean hasEndUserSuggestionConfig();
  /**
   *
   *
   * <pre>
   * Configuration for agent assistance of end user participant.
   * Currently, this feature is not general available, please contact Google
   * to get access.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig end_user_suggestion_config = 4;
   * </code>
   *
   * @return The endUserSuggestionConfig.
   */
  com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig
      getEndUserSuggestionConfig();
  /**
   *
   *
   * <pre>
   * Configuration for agent assistance of end user participant.
   * Currently, this feature is not general available, please contact Google
   * to get access.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig end_user_suggestion_config = 4;
   * </code>
   */
  com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfigOrBuilder
      getEndUserSuggestionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for message analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.HumanAgentAssistantConfig.MessageAnalysisConfig message_analysis_config = 5;
   * </code>
   *
   * @return Whether the messageAnalysisConfig field is set.
   */
  boolean hasMessageAnalysisConfig();
  /**
   *
   *
   * <pre>
   * Configuration for message analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.HumanAgentAssistantConfig.MessageAnalysisConfig message_analysis_config = 5;
   * </code>
   *
   * @return The messageAnalysisConfig.
   */
  com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.MessageAnalysisConfig
      getMessageAnalysisConfig();
  /**
   *
   *
   * <pre>
   * Configuration for message analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.HumanAgentAssistantConfig.MessageAnalysisConfig message_analysis_config = 5;
   * </code>
   */
  com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.MessageAnalysisConfigOrBuilder
      getMessageAnalysisConfigOrBuilder();
}
