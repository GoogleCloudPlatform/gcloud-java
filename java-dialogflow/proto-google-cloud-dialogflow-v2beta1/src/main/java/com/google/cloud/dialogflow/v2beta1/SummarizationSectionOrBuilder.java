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
// source: google/cloud/dialogflow/v2beta1/generator.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface SummarizationSectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SummarizationSection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Name of the section, for example, "situation".
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * Optional. Name of the section, for example, "situation".
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. Definition of the section, for example, "what the customer needs
   * help with or has question about."
   * </pre>
   *
   * <code>string definition = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The definition.
   */
  java.lang.String getDefinition();
  /**
   *
   *
   * <pre>
   * Optional. Definition of the section, for example, "what the customer needs
   * help with or has question about."
   * </pre>
   *
   * <code>string definition = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for definition.
   */
  com.google.protobuf.ByteString getDefinitionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Type of the summarization section.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SummarizationSection.Type type = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. Type of the summarization section.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SummarizationSection.Type type = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.dialogflow.v2beta1.SummarizationSection.Type getType();
}
