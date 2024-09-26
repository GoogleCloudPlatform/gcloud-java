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

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

public interface GenerateStatelessSuggestionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.GenerateStatelessSuggestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource to charge for the Suggestion's generation.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
   * Required. The parent resource to charge for the Suggestion's generation.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
   * Uncreated generator. It should be a complete generator that includes all
   * information about the generator.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Generator generator = 2;</code>
   *
   * @return Whether the generator field is set.
   */
  boolean hasGenerator();
  /**
   *
   *
   * <pre>
   * Uncreated generator. It should be a complete generator that includes all
   * information about the generator.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Generator generator = 2;</code>
   *
   * @return The generator.
   */
  com.google.cloud.dialogflow.v2.Generator getGenerator();
  /**
   *
   *
   * <pre>
   * Uncreated generator. It should be a complete generator that includes all
   * information about the generator.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Generator generator = 2;</code>
   */
  com.google.cloud.dialogflow.v2.GeneratorOrBuilder getGeneratorOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource name of the existing created generator. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/generators/&lt;Generator ID&gt;`
   * </pre>
   *
   * <code>string generator_name = 3;</code>
   *
   * @return Whether the generatorName field is set.
   */
  boolean hasGeneratorName();
  /**
   *
   *
   * <pre>
   * The resource name of the existing created generator. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/generators/&lt;Generator ID&gt;`
   * </pre>
   *
   * <code>string generator_name = 3;</code>
   *
   * @return The generatorName.
   */
  java.lang.String getGeneratorName();
  /**
   *
   *
   * <pre>
   * The resource name of the existing created generator. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/generators/&lt;Generator ID&gt;`
   * </pre>
   *
   * <code>string generator_name = 3;</code>
   *
   * @return The bytes for generatorName.
   */
  com.google.protobuf.ByteString getGeneratorNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Context of the conversation, including transcripts.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationContext conversation_context = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the conversationContext field is set.
   */
  boolean hasConversationContext();
  /**
   *
   *
   * <pre>
   * Optional. Context of the conversation, including transcripts.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationContext conversation_context = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The conversationContext.
   */
  com.google.cloud.dialogflow.v2.ConversationContext getConversationContext();
  /**
   *
   *
   * <pre>
   * Optional. Context of the conversation, including transcripts.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationContext conversation_context = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.ConversationContextOrBuilder getConversationContextOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A list of trigger events. Generator will be triggered only if
   * it's trigger event is included here.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.TriggerEvent trigger_events = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the triggerEvents.
   */
  java.util.List<com.google.cloud.dialogflow.v2.TriggerEvent> getTriggerEventsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of trigger events. Generator will be triggered only if
   * it's trigger event is included here.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.TriggerEvent trigger_events = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of triggerEvents.
   */
  int getTriggerEventsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of trigger events. Generator will be triggered only if
   * it's trigger event is included here.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.TriggerEvent trigger_events = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The triggerEvents at the given index.
   */
  com.google.cloud.dialogflow.v2.TriggerEvent getTriggerEvents(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of trigger events. Generator will be triggered only if
   * it's trigger event is included here.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.TriggerEvent trigger_events = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for triggerEvents.
   */
  java.util.List<java.lang.Integer> getTriggerEventsValueList();
  /**
   *
   *
   * <pre>
   * Optional. A list of trigger events. Generator will be triggered only if
   * it's trigger event is included here.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.TriggerEvent trigger_events = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of triggerEvents at the given index.
   */
  int getTriggerEventsValue(int index);

  com.google.cloud.dialogflow.v2.GenerateStatelessSuggestionRequest.GeneratorResourceCase
      getGeneratorResourceCase();
}
