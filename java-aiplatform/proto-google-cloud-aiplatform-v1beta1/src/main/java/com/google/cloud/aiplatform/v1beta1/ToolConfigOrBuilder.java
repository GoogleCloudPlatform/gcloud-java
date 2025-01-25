/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/tool.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface ToolConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ToolConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Function calling config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FunctionCallingConfig function_calling_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the functionCallingConfig field is set.
   */
  boolean hasFunctionCallingConfig();
  /**
   *
   *
   * <pre>
   * Optional. Function calling config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FunctionCallingConfig function_calling_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The functionCallingConfig.
   */
  com.google.cloud.aiplatform.v1beta1.FunctionCallingConfig getFunctionCallingConfig();
  /**
   *
   *
   * <pre>
   * Optional. Function calling config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FunctionCallingConfig function_calling_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FunctionCallingConfigOrBuilder
      getFunctionCallingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Retrieval config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RetrievalConfig retrieval_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the retrievalConfig field is set.
   */
  boolean hasRetrievalConfig();
  /**
   *
   *
   * <pre>
   * Optional. Retrieval config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RetrievalConfig retrieval_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The retrievalConfig.
   */
  com.google.cloud.aiplatform.v1beta1.RetrievalConfig getRetrievalConfig();
  /**
   *
   *
   * <pre>
   * Optional. Retrieval config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RetrievalConfig retrieval_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.RetrievalConfigOrBuilder getRetrievalConfigOrBuilder();
}
