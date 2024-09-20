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
// source: google/cloud/aiplatform/v1/evaluation_service.proto

package com.google.cloud.aiplatform.v1;

public interface SummarizationVerbositySpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SummarizationVerbositySpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Whether to use instance.reference to compute summarization
   * verbosity.
   * </pre>
   *
   * <code>bool use_reference = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The useReference.
   */
  boolean getUseReference();

  /**
   *
   *
   * <pre>
   * Optional. Which version to use for evaluation.
   * </pre>
   *
   * <code>int32 version = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The version.
   */
  int getVersion();
}
