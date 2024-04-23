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

public interface AnalysisOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.Analysis)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the analysis.
   * Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the analysis.
   * Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the analysis was requested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the requestTime field is set.
   */
  boolean hasRequestTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the analysis was requested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The requestTime.
   */
  com.google.protobuf.Timestamp getRequestTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the analysis was requested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the analysis was created, which occurs when
   * the long-running operation completes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the analysis was created, which occurs when
   * the long-running operation completes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the analysis was created, which occurs when
   * the long-running operation completes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The result of the analysis, which is populated when the
   * analysis finishes.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.AnalysisResult analysis_result = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the analysisResult field is set.
   */
  boolean hasAnalysisResult();
  /**
   *
   *
   * <pre>
   * Output only. The result of the analysis, which is populated when the
   * analysis finishes.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.AnalysisResult analysis_result = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The analysisResult.
   */
  com.google.cloud.contactcenterinsights.v1.AnalysisResult getAnalysisResult();
  /**
   *
   *
   * <pre>
   * Output only. The result of the analysis, which is populated when the
   * analysis finishes.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.AnalysisResult analysis_result = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.AnalysisResultOrBuilder getAnalysisResultOrBuilder();

  /**
   *
   *
   * <pre>
   * To select the annotators to run and the phrase matchers to use
   * (if any). If not specified, all annotators will be run.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
   *
   * @return Whether the annotatorSelector field is set.
   */
  boolean hasAnnotatorSelector();
  /**
   *
   *
   * <pre>
   * To select the annotators to run and the phrase matchers to use
   * (if any). If not specified, all annotators will be run.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
   *
   * @return The annotatorSelector.
   */
  com.google.cloud.contactcenterinsights.v1.AnnotatorSelector getAnnotatorSelector();
  /**
   *
   *
   * <pre>
   * To select the annotators to run and the phrase matchers to use
   * (if any). If not specified, all annotators will be run.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
   */
  com.google.cloud.contactcenterinsights.v1.AnnotatorSelectorOrBuilder
      getAnnotatorSelectorOrBuilder();
}
