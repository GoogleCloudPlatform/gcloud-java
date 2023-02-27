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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface ConversationParticipantOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.ConversationParticipant)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the participant provided by Dialogflow. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * </pre>
   *
   * <code>string dialogflow_participant_name = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the dialogflowParticipantName field is set.
   */
  boolean hasDialogflowParticipantName();
  /**
   *
   *
   * <pre>
   * The name of the participant provided by Dialogflow. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * </pre>
   *
   * <code>string dialogflow_participant_name = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The dialogflowParticipantName.
   */
  java.lang.String getDialogflowParticipantName();
  /**
   *
   *
   * <pre>
   * The name of the participant provided by Dialogflow. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * </pre>
   *
   * <code>string dialogflow_participant_name = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for dialogflowParticipantName.
   */
  com.google.protobuf.ByteString getDialogflowParticipantNameBytes();

  /**
   *
   *
   * <pre>
   * A user-specified ID representing the participant.
   * </pre>
   *
   * <code>string user_id = 6;</code>
   *
   * @return Whether the userId field is set.
   */
  boolean hasUserId();
  /**
   *
   *
   * <pre>
   * A user-specified ID representing the participant.
   * </pre>
   *
   * <code>string user_id = 6;</code>
   *
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   *
   *
   * <pre>
   * A user-specified ID representing the participant.
   * </pre>
   *
   * <code>string user_id = 6;</code>
   *
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString getUserIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. Use `dialogflow_participant_name` instead.
   * The name of the Dialogflow participant. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * </pre>
   *
   * <code>string dialogflow_participant = 1 [deprecated = true];</code>
   *
   * @deprecated
   *     google.cloud.contactcenterinsights.v1.ConversationParticipant.dialogflow_participant is
   *     deprecated. See google/cloud/contactcenterinsights/v1/resources.proto;l=1125
   * @return The dialogflowParticipant.
   */
  @java.lang.Deprecated
  java.lang.String getDialogflowParticipant();
  /**
   *
   *
   * <pre>
   * Deprecated. Use `dialogflow_participant_name` instead.
   * The name of the Dialogflow participant. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
   * </pre>
   *
   * <code>string dialogflow_participant = 1 [deprecated = true];</code>
   *
   * @deprecated
   *     google.cloud.contactcenterinsights.v1.ConversationParticipant.dialogflow_participant is
   *     deprecated. See google/cloud/contactcenterinsights/v1/resources.proto;l=1125
   * @return The bytes for dialogflowParticipant.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getDialogflowParticipantBytes();

  /**
   *
   *
   * <pre>
   * Obfuscated user ID from Dialogflow.
   * </pre>
   *
   * <code>string obfuscated_external_user_id = 3;</code>
   *
   * @return The obfuscatedExternalUserId.
   */
  java.lang.String getObfuscatedExternalUserId();
  /**
   *
   *
   * <pre>
   * Obfuscated user ID from Dialogflow.
   * </pre>
   *
   * <code>string obfuscated_external_user_id = 3;</code>
   *
   * @return The bytes for obfuscatedExternalUserId.
   */
  com.google.protobuf.ByteString getObfuscatedExternalUserIdBytes();

  /**
   *
   *
   * <pre>
   * The role of the participant.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ConversationParticipant.Role role = 2;</code>
   *
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   *
   *
   * <pre>
   * The role of the participant.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ConversationParticipant.Role role = 2;</code>
   *
   * @return The role.
   */
  com.google.cloud.contactcenterinsights.v1.ConversationParticipant.Role getRole();

  public com.google.cloud.contactcenterinsights.v1.ConversationParticipant.ParticipantCase
      getParticipantCase();
}
