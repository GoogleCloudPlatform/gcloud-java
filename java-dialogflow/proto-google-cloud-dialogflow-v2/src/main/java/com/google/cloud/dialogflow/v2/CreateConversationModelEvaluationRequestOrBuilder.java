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
// source: google/cloud/dialogflow/v2/conversation_model.proto

package com.google.cloud.dialogflow.v2;

public interface CreateConversationModelEvaluationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The conversation model resource name. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
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
   * Required. The conversation model resource name. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
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
   * Required. The conversation model evaluation to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversationModelEvaluation field is set.
   */
  boolean hasConversationModelEvaluation();
  /**
   *
   *
   * <pre>
   * Required. The conversation model evaluation to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversationModelEvaluation.
   */
  com.google.cloud.dialogflow.v2.ConversationModelEvaluation getConversationModelEvaluation();
  /**
   *
   *
   * <pre>
   * Required. The conversation model evaluation to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.ConversationModelEvaluationOrBuilder
      getConversationModelEvaluationOrBuilder();
}
