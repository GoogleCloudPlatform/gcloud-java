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
// source: google/cloud/dialogflow/cx/v3/changelog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public interface ChangelogOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.Changelog)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the changelog.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/changelogs/&lt;ChangelogID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the changelog.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/changelogs/&lt;ChangelogID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Email address of the authenticated user.
   * </pre>
   *
   * <code>string user_email = 2;</code>
   *
   * @return The userEmail.
   */
  java.lang.String getUserEmail();
  /**
   *
   *
   * <pre>
   * Email address of the authenticated user.
   * </pre>
   *
   * <code>string user_email = 2;</code>
   *
   * @return The bytes for userEmail.
   */
  com.google.protobuf.ByteString getUserEmailBytes();

  /**
   *
   *
   * <pre>
   * The affected resource display name of the change.
   * </pre>
   *
   * <code>string display_name = 7;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The affected resource display name of the change.
   * </pre>
   *
   * <code>string display_name = 7;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The action of the change.
   * </pre>
   *
   * <code>string action = 11;</code>
   *
   * @return The action.
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * The action of the change.
   * </pre>
   *
   * <code>string action = 11;</code>
   *
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString getActionBytes();

  /**
   *
   *
   * <pre>
   * The affected resource type.
   * </pre>
   *
   * <code>string type = 8;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The affected resource type.
   * </pre>
   *
   * <code>string type = 8;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * The affected resource name of the change.
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * The affected resource name of the change.
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * The timestamp of the change.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The timestamp of the change.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The timestamp of the change.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The affected language code of the change.
   * </pre>
   *
   * <code>string language_code = 14;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The affected language code of the change.
   * </pre>
   *
   * <code>string language_code = 14;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
