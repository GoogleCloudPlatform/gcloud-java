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
// source: google/cloud/dialogflow/cx/v3/session_entity_type.proto

package com.google.cloud.dialogflow.cx.v3;

public interface CreateSessionEntityTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The session to create a session entity type for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment.
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
   * Required. The session to create a session entity type for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment.
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
   * Required. The session entity type to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the sessionEntityType field is set.
   */
  boolean hasSessionEntityType();
  /**
   *
   *
   * <pre>
   * Required. The session entity type to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sessionEntityType.
   */
  com.google.cloud.dialogflow.cx.v3.SessionEntityType getSessionEntityType();
  /**
   *
   *
   * <pre>
   * Required. The session entity type to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.SessionEntityTypeOrBuilder getSessionEntityTypeOrBuilder();
}
