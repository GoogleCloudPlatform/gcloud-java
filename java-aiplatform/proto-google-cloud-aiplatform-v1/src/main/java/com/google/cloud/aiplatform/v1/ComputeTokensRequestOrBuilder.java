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
// source: google/cloud/aiplatform/v1/llm_utility_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ComputeTokensRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ComputeTokensRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to get lists of tokens and
   * token ids.
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to get lists of tokens and
   * token ids.
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * Required. The instances that are the input to token computing API call.
   * Schema is identical to the prediction schema of the text model, even for
   * the non-text models, like chat models, or Codey models.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.protobuf.Value> getInstancesList();
  /**
   *
   *
   * <pre>
   * Required. The instances that are the input to token computing API call.
   * Schema is identical to the prediction schema of the text model, even for
   * the non-text models, like chat models, or Codey models.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.Value getInstances(int index);
  /**
   *
   *
   * <pre>
   * Required. The instances that are the input to token computing API call.
   * Schema is identical to the prediction schema of the text model, even for
   * the non-text models, like chat models, or Codey models.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getInstancesCount();
  /**
   *
   *
   * <pre>
   * Required. The instances that are the input to token computing API call.
   * Schema is identical to the prediction schema of the text model, even for
   * the non-text models, like chat models, or Codey models.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.protobuf.ValueOrBuilder> getInstancesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The instances that are the input to token computing API call.
   * Schema is identical to the prediction schema of the text model, even for
   * the non-text models, like chat models, or Codey models.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.ValueOrBuilder getInstancesOrBuilder(int index);
}
