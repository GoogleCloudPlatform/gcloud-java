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
// source: google/cloud/aiplatform/v1/endpoint.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface SpeculativeDecodingSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SpeculativeDecodingSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * draft model speculation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SpeculativeDecodingSpec.DraftModelSpeculation draft_model_speculation = 2;
   * </code>
   *
   * @return Whether the draftModelSpeculation field is set.
   */
  boolean hasDraftModelSpeculation();
  /**
   *
   *
   * <pre>
   * draft model speculation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SpeculativeDecodingSpec.DraftModelSpeculation draft_model_speculation = 2;
   * </code>
   *
   * @return The draftModelSpeculation.
   */
  com.google.cloud.aiplatform.v1.SpeculativeDecodingSpec.DraftModelSpeculation
      getDraftModelSpeculation();
  /**
   *
   *
   * <pre>
   * draft model speculation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SpeculativeDecodingSpec.DraftModelSpeculation draft_model_speculation = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1.SpeculativeDecodingSpec.DraftModelSpeculationOrBuilder
      getDraftModelSpeculationOrBuilder();

  /**
   *
   *
   * <pre>
   * N-Gram speculation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SpeculativeDecodingSpec.NgramSpeculation ngram_speculation = 3;
   * </code>
   *
   * @return Whether the ngramSpeculation field is set.
   */
  boolean hasNgramSpeculation();
  /**
   *
   *
   * <pre>
   * N-Gram speculation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SpeculativeDecodingSpec.NgramSpeculation ngram_speculation = 3;
   * </code>
   *
   * @return The ngramSpeculation.
   */
  com.google.cloud.aiplatform.v1.SpeculativeDecodingSpec.NgramSpeculation getNgramSpeculation();
  /**
   *
   *
   * <pre>
   * N-Gram speculation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SpeculativeDecodingSpec.NgramSpeculation ngram_speculation = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1.SpeculativeDecodingSpec.NgramSpeculationOrBuilder
      getNgramSpeculationOrBuilder();

  /**
   *
   *
   * <pre>
   * The number of speculative tokens to generate at each step.
   * </pre>
   *
   * <code>int32 speculative_token_count = 1;</code>
   *
   * @return The speculativeTokenCount.
   */
  int getSpeculativeTokenCount();

  com.google.cloud.aiplatform.v1.SpeculativeDecodingSpec.SpeculationCase getSpeculationCase();
}
