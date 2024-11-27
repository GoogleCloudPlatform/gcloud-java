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
// source: google/cloud/aiplatform/v1beta1/reasoning_engine_execution_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface StreamQueryReasoningEngineRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.StreamQueryReasoningEngineRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the ReasoningEngine resource to use.
   * Format:
   * `projects/{project}/locations/{location}/reasoningEngines/{reasoning_engine}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the ReasoningEngine resource to use.
   * Format:
   * `projects/{project}/locations/{location}/reasoningEngines/{reasoning_engine}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Input content provided by users in JSON object format. Examples
   * include text query, function calling parameters, media bytes, etc.
   * </pre>
   *
   * <code>.google.protobuf.Struct input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   *
   *
   * <pre>
   * Optional. Input content provided by users in JSON object format. Examples
   * include text query, function calling parameters, media bytes, etc.
   * </pre>
   *
   * <code>.google.protobuf.Struct input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The input.
   */
  com.google.protobuf.Struct getInput();
  /**
   *
   *
   * <pre>
   * Optional. Input content provided by users in JSON object format. Examples
   * include text query, function calling parameters, media bytes, etc.
   * </pre>
   *
   * <code>.google.protobuf.Struct input = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StructOrBuilder getInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Class method to be used for the stream query.
   * It is optional and defaults to "stream_query" if unspecified.
   * </pre>
   *
   * <code>string class_method = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The classMethod.
   */
  java.lang.String getClassMethod();
  /**
   *
   *
   * <pre>
   * Optional. Class method to be used for the stream query.
   * It is optional and defaults to "stream_query" if unspecified.
   * </pre>
   *
   * <code>string class_method = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for classMethod.
   */
  com.google.protobuf.ByteString getClassMethodBytes();
}
