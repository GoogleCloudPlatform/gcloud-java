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
// source: google/cloud/dialogflow/cx/v3beta1/version.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public interface CompareVersionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.CompareVersionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * JSON representation of the base version content.
   * </pre>
   *
   * <code>string base_version_content_json = 1;</code>
   *
   * @return The baseVersionContentJson.
   */
  java.lang.String getBaseVersionContentJson();
  /**
   *
   *
   * <pre>
   * JSON representation of the base version content.
   * </pre>
   *
   * <code>string base_version_content_json = 1;</code>
   *
   * @return The bytes for baseVersionContentJson.
   */
  com.google.protobuf.ByteString getBaseVersionContentJsonBytes();

  /**
   *
   *
   * <pre>
   * JSON representation of the target version content.
   * </pre>
   *
   * <code>string target_version_content_json = 2;</code>
   *
   * @return The targetVersionContentJson.
   */
  java.lang.String getTargetVersionContentJson();
  /**
   *
   *
   * <pre>
   * JSON representation of the target version content.
   * </pre>
   *
   * <code>string target_version_content_json = 2;</code>
   *
   * @return The bytes for targetVersionContentJson.
   */
  com.google.protobuf.ByteString getTargetVersionContentJsonBytes();

  /**
   *
   *
   * <pre>
   * The timestamp when the two version compares.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp compare_time = 3;</code>
   *
   * @return Whether the compareTime field is set.
   */
  boolean hasCompareTime();
  /**
   *
   *
   * <pre>
   * The timestamp when the two version compares.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp compare_time = 3;</code>
   *
   * @return The compareTime.
   */
  com.google.protobuf.Timestamp getCompareTime();
  /**
   *
   *
   * <pre>
   * The timestamp when the two version compares.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp compare_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCompareTimeOrBuilder();
}
