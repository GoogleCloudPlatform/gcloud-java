/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/discoveryengine/v1beta/conversational_search_service.proto

package com.google.cloud.discoveryengine.v1beta;

public interface CreateConversationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.CreateConversationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of parent data store. Format:
   * `projects/{project_number}/locations/{location_id}/collections/{collection}/dataStores/{data_store_id}`
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
   * Required. Full resource name of parent data store. Format:
   * `projects/{project_number}/locations/{location_id}/collections/{collection}/dataStores/{data_store_id}`
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
   * Required. The conversation to create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   *
   *
   * <pre>
   * Required. The conversation to create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversation.
   */
  com.google.cloud.discoveryengine.v1beta.Conversation getConversation();
  /**
   *
   *
   * <pre>
   * Required. The conversation to create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.ConversationOrBuilder getConversationOrBuilder();
}
