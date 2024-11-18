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
// source: google/cloud/dialogflow/cx/v3beta1/fulfillment.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface FulfillmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.Fulfillment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of rich message responses to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ResponseMessage messages = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage> getMessagesList();
  /**
   *
   *
   * <pre>
   * The list of rich message responses to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ResponseMessage messages = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage getMessages(int index);
  /**
   *
   *
   * <pre>
   * The list of rich message responses to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ResponseMessage messages = 1;</code>
   */
  int getMessagesCount();
  /**
   *
   *
   * <pre>
   * The list of rich message responses to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ResponseMessage messages = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ResponseMessageOrBuilder>
      getMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of rich message responses to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.ResponseMessage messages = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessageOrBuilder getMessagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The webhook to call.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/webhooks/&lt;WebhookID&gt;`.
   * </pre>
   *
   * <code>string webhook = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The webhook.
   */
  java.lang.String getWebhook();
  /**
   *
   *
   * <pre>
   * The webhook to call.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/webhooks/&lt;WebhookID&gt;`.
   * </pre>
   *
   * <code>string webhook = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for webhook.
   */
  com.google.protobuf.ByteString getWebhookBytes();

  /**
   *
   *
   * <pre>
   * Whether Dialogflow should return currently queued fulfillment response
   * messages in streaming APIs. If a webhook is specified, it happens before
   * Dialogflow invokes webhook.
   * Warning:
   * 1) This flag only affects streaming API. Responses are still queued
   * and returned once in non-streaming API.
   * 2) The flag can be enabled in any fulfillment but only the first 3 partial
   * responses will be returned. You may only want to apply it to fulfillments
   * that have slow webhooks.
   * </pre>
   *
   * <code>bool return_partial_responses = 8;</code>
   *
   * @return The returnPartialResponses.
   */
  boolean getReturnPartialResponses();

  /**
   *
   *
   * <pre>
   * The value of this field will be populated in the
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest]
   * `fulfillmentInfo.tag` field by Dialogflow when the associated webhook is
   * called.
   * The tag is typically used by the webhook service to identify which
   * fulfillment is being called, but it could be used for other purposes.
   * This field is required if `webhook` is specified.
   * </pre>
   *
   * <code>string tag = 3;</code>
   *
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   *
   *
   * <pre>
   * The value of this field will be populated in the
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest]
   * `fulfillmentInfo.tag` field by Dialogflow when the associated webhook is
   * called.
   * The tag is typically used by the webhook service to identify which
   * fulfillment is being called, but it could be used for other purposes.
   * This field is required if `webhook` is specified.
   * </pre>
   *
   * <code>string tag = 3;</code>
   *
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString getTagBytes();

  /**
   *
   *
   * <pre>
   * Set parameter values before executing the webhook.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Fulfillment.SetParameterAction set_parameter_actions = 4;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Fulfillment.SetParameterAction>
      getSetParameterActionsList();
  /**
   *
   *
   * <pre>
   * Set parameter values before executing the webhook.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Fulfillment.SetParameterAction set_parameter_actions = 4;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Fulfillment.SetParameterAction getSetParameterActions(
      int index);
  /**
   *
   *
   * <pre>
   * Set parameter values before executing the webhook.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Fulfillment.SetParameterAction set_parameter_actions = 4;
   * </code>
   */
  int getSetParameterActionsCount();
  /**
   *
   *
   * <pre>
   * Set parameter values before executing the webhook.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Fulfillment.SetParameterAction set_parameter_actions = 4;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.dialogflow.cx.v3beta1.Fulfillment.SetParameterActionOrBuilder>
      getSetParameterActionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Set parameter values before executing the webhook.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Fulfillment.SetParameterAction set_parameter_actions = 4;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Fulfillment.SetParameterActionOrBuilder
      getSetParameterActionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Conditional cases for this fulfillment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Fulfillment.ConditionalCases conditional_cases = 5;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Fulfillment.ConditionalCases>
      getConditionalCasesList();
  /**
   *
   *
   * <pre>
   * Conditional cases for this fulfillment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Fulfillment.ConditionalCases conditional_cases = 5;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Fulfillment.ConditionalCases getConditionalCases(
      int index);
  /**
   *
   *
   * <pre>
   * Conditional cases for this fulfillment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Fulfillment.ConditionalCases conditional_cases = 5;
   * </code>
   */
  int getConditionalCasesCount();
  /**
   *
   *
   * <pre>
   * Conditional cases for this fulfillment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Fulfillment.ConditionalCases conditional_cases = 5;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.dialogflow.cx.v3beta1.Fulfillment.ConditionalCasesOrBuilder>
      getConditionalCasesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Conditional cases for this fulfillment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Fulfillment.ConditionalCases conditional_cases = 5;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Fulfillment.ConditionalCasesOrBuilder
      getConditionalCasesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Hierarchical advanced settings for this fulfillment. The settings exposed
   * at the lower level overrides the settings exposed at the higher level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.AdvancedSettings advanced_settings = 7;</code>
   *
   * @return Whether the advancedSettings field is set.
   */
  boolean hasAdvancedSettings();
  /**
   *
   *
   * <pre>
   * Hierarchical advanced settings for this fulfillment. The settings exposed
   * at the lower level overrides the settings exposed at the higher level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.AdvancedSettings advanced_settings = 7;</code>
   *
   * @return The advancedSettings.
   */
  com.google.cloud.dialogflow.cx.v3beta1.AdvancedSettings getAdvancedSettings();
  /**
   *
   *
   * <pre>
   * Hierarchical advanced settings for this fulfillment. The settings exposed
   * at the lower level overrides the settings exposed at the higher level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.AdvancedSettings advanced_settings = 7;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.AdvancedSettingsOrBuilder getAdvancedSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * If the flag is true, the agent will utilize LLM to generate a text
   * response. If LLM generation fails, the defined
   * [responses][google.cloud.dialogflow.cx.v3beta1.Fulfillment.messages] in the
   * fulfillment will be respected. This flag is only useful for fulfillments
   * associated with no-match event handlers.
   * </pre>
   *
   * <code>bool enable_generative_fallback = 12;</code>
   *
   * @return The enableGenerativeFallback.
   */
  boolean getEnableGenerativeFallback();
}
