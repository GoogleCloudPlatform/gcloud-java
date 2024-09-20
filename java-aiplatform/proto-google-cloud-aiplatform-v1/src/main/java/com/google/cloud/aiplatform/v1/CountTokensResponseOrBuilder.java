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
// source: google/cloud/aiplatform/v1/prediction_service.proto

package com.google.cloud.aiplatform.v1;

public interface CountTokensResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CountTokensResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The total number of tokens counted across all instances from the request.
   * </pre>
   *
   * <code>int32 total_tokens = 1;</code>
   *
   * @return The totalTokens.
   */
  int getTotalTokens();

  /**
   *
   *
   * <pre>
   * The total number of billable characters counted across all instances from
   * the request.
   * </pre>
   *
   * <code>int32 total_billable_characters = 2;</code>
   *
   * @return The totalBillableCharacters.
   */
  int getTotalBillableCharacters();
}
