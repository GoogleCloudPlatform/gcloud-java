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
// source: google/cloud/dialogflow/v2beta1/agent.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface ExportAgentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ExportAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project that the agent to export is associated with.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
   * Required. The project that the agent to export is associated with.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
   * Optional. The
   * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
   * URI to export the agent to.
   * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * If left unspecified, the serialized agent is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return The agentUri.
   */
  java.lang.String getAgentUri();
  /**
   *
   *
   * <pre>
   * Optional. The
   * [Google Cloud Storage](https://cloud.google.com/storage/docs/)
   * URI to export the agent to.
   * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * If left unspecified, the serialized agent is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return The bytes for agentUri.
   */
  com.google.protobuf.ByteString getAgentUriBytes();
}
