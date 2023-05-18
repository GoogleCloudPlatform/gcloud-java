/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/study.proto

package com.google.cloud.aiplatform.v1beta1;

public interface MeasurementOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Measurement)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Time that the Trial has been running at the point of this
   * Measurement.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration elapsed_duration = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the elapsedDuration field is set.
   */
  boolean hasElapsedDuration();
  /**
   *
   *
   * <pre>
   * Output only. Time that the Trial has been running at the point of this
   * Measurement.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration elapsed_duration = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The elapsedDuration.
   */
  com.google.protobuf.Duration getElapsedDuration();
  /**
   *
   *
   * <pre>
   * Output only. Time that the Trial has been running at the point of this
   * Measurement.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration elapsed_duration = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getElapsedDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The number of steps the machine learning model has been
   * trained for. Must be non-negative.
   * </pre>
   *
   * <code>int64 step_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stepCount.
   */
  long getStepCount();

  /**
   *
   *
   * <pre>
   * Output only. A list of metrics got by evaluating the objective functions
   * using suggested Parameter values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Measurement.Metric metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Measurement.Metric> getMetricsList();
  /**
   *
   *
   * <pre>
   * Output only. A list of metrics got by evaluating the objective functions
   * using suggested Parameter values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Measurement.Metric metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.Measurement.Metric getMetrics(int index);
  /**
   *
   *
   * <pre>
   * Output only. A list of metrics got by evaluating the objective functions
   * using suggested Parameter values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Measurement.Metric metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * Output only. A list of metrics got by evaluating the objective functions
   * using suggested Parameter values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Measurement.Metric metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.Measurement.MetricOrBuilder>
      getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A list of metrics got by evaluating the objective functions
   * using suggested Parameter values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Measurement.Metric metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.Measurement.MetricOrBuilder getMetricsOrBuilder(int index);
}
