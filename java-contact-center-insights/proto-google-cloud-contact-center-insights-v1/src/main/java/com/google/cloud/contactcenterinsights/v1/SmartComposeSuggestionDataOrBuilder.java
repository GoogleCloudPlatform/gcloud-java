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
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contactcenterinsights.v1;

public interface SmartComposeSuggestionDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.SmartComposeSuggestionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The content of the suggestion.
   * </pre>
   *
   * <code>string suggestion = 1;</code>
   *
   * @return The suggestion.
   */
  java.lang.String getSuggestion();
  /**
   *
   *
   * <pre>
   * The content of the suggestion.
   * </pre>
   *
   * <code>string suggestion = 1;</code>
   *
   * @return The bytes for suggestion.
   */
  com.google.protobuf.ByteString getSuggestionBytes();

  /**
   *
   *
   * <pre>
   * The system's confidence score that this suggestion is a good match for this
   * conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely
   * certain).
   * </pre>
   *
   * <code>double confidence_score = 2;</code>
   *
   * @return The confidenceScore.
   */
  double getConfidenceScore();

  /**
   *
   *
   * <pre>
   * Map that contains metadata about the Smart Compose suggestion and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * Map that contains metadata about the Smart Compose suggestion and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * Map that contains metadata about the Smart Compose suggestion and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * Map that contains metadata about the Smart Compose suggestion and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Map that contains metadata about the Smart Compose suggestion and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The name of the answer record.
   * Format:
   * projects/{project}/locations/{location}/answerRecords/{answer_record}
   * </pre>
   *
   * <code>string query_record = 4;</code>
   *
   * @return The queryRecord.
   */
  java.lang.String getQueryRecord();
  /**
   *
   *
   * <pre>
   * The name of the answer record.
   * Format:
   * projects/{project}/locations/{location}/answerRecords/{answer_record}
   * </pre>
   *
   * <code>string query_record = 4;</code>
   *
   * @return The bytes for queryRecord.
   */
  com.google.protobuf.ByteString getQueryRecordBytes();
}
