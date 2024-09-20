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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface SummarizationQualityResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SummarizationQualityResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Summarization Quality score.
   * </pre>
   *
   * <code>optional float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the score field is set.
   */
  boolean hasScore();
  /**
   *
   *
   * <pre>
   * Output only. Summarization Quality score.
   * </pre>
   *
   * <code>optional float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The score.
   */
  float getScore();

  /**
   *
   *
   * <pre>
   * Output only. Explanation for summarization quality score.
   * </pre>
   *
   * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The explanation.
   */
  java.lang.String getExplanation();
  /**
   *
   *
   * <pre>
   * Output only. Explanation for summarization quality score.
   * </pre>
   *
   * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for explanation.
   */
  com.google.protobuf.ByteString getExplanationBytes();

  /**
   *
   *
   * <pre>
   * Output only. Confidence for summarization quality score.
   * </pre>
   *
   * <code>optional float confidence = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the confidence field is set.
   */
  boolean hasConfidence();
  /**
   *
   *
   * <pre>
   * Output only. Confidence for summarization quality score.
   * </pre>
   *
   * <code>optional float confidence = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The confidence.
   */
  float getConfidence();
}
