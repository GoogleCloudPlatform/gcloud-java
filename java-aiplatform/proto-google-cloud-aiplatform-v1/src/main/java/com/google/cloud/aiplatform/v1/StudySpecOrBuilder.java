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
// source: google/cloud/aiplatform/v1/study.proto

package com.google.cloud.aiplatform.v1;

public interface StudySpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.StudySpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The automated early stopping spec using decay curve rule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.DecayCurveAutomatedStoppingSpec decay_curve_stopping_spec = 4;
   * </code>
   *
   * @return Whether the decayCurveStoppingSpec field is set.
   */
  boolean hasDecayCurveStoppingSpec();
  /**
   *
   *
   * <pre>
   * The automated early stopping spec using decay curve rule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.DecayCurveAutomatedStoppingSpec decay_curve_stopping_spec = 4;
   * </code>
   *
   * @return The decayCurveStoppingSpec.
   */
  com.google.cloud.aiplatform.v1.StudySpec.DecayCurveAutomatedStoppingSpec
      getDecayCurveStoppingSpec();
  /**
   *
   *
   * <pre>
   * The automated early stopping spec using decay curve rule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.DecayCurveAutomatedStoppingSpec decay_curve_stopping_spec = 4;
   * </code>
   */
  com.google.cloud.aiplatform.v1.StudySpec.DecayCurveAutomatedStoppingSpecOrBuilder
      getDecayCurveStoppingSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The automated early stopping spec using median rule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.MedianAutomatedStoppingSpec median_automated_stopping_spec = 5;
   * </code>
   *
   * @return Whether the medianAutomatedStoppingSpec field is set.
   */
  boolean hasMedianAutomatedStoppingSpec();
  /**
   *
   *
   * <pre>
   * The automated early stopping spec using median rule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.MedianAutomatedStoppingSpec median_automated_stopping_spec = 5;
   * </code>
   *
   * @return The medianAutomatedStoppingSpec.
   */
  com.google.cloud.aiplatform.v1.StudySpec.MedianAutomatedStoppingSpec
      getMedianAutomatedStoppingSpec();
  /**
   *
   *
   * <pre>
   * The automated early stopping spec using median rule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.MedianAutomatedStoppingSpec median_automated_stopping_spec = 5;
   * </code>
   */
  com.google.cloud.aiplatform.v1.StudySpec.MedianAutomatedStoppingSpecOrBuilder
      getMedianAutomatedStoppingSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The automated early stopping spec using convex stopping rule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.ConvexAutomatedStoppingSpec convex_automated_stopping_spec = 9;
   * </code>
   *
   * @return Whether the convexAutomatedStoppingSpec field is set.
   */
  boolean hasConvexAutomatedStoppingSpec();
  /**
   *
   *
   * <pre>
   * The automated early stopping spec using convex stopping rule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.ConvexAutomatedStoppingSpec convex_automated_stopping_spec = 9;
   * </code>
   *
   * @return The convexAutomatedStoppingSpec.
   */
  com.google.cloud.aiplatform.v1.StudySpec.ConvexAutomatedStoppingSpec
      getConvexAutomatedStoppingSpec();
  /**
   *
   *
   * <pre>
   * The automated early stopping spec using convex stopping rule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.ConvexAutomatedStoppingSpec convex_automated_stopping_spec = 9;
   * </code>
   */
  com.google.cloud.aiplatform.v1.StudySpec.ConvexAutomatedStoppingSpecOrBuilder
      getConvexAutomatedStoppingSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Metric specs for the Study.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.StudySpec.MetricSpec metrics = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.StudySpec.MetricSpec> getMetricsList();
  /**
   *
   *
   * <pre>
   * Required. Metric specs for the Study.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.StudySpec.MetricSpec metrics = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.StudySpec.MetricSpec getMetrics(int index);
  /**
   *
   *
   * <pre>
   * Required. Metric specs for the Study.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.StudySpec.MetricSpec metrics = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * Required. Metric specs for the Study.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.StudySpec.MetricSpec metrics = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.StudySpec.MetricSpecOrBuilder>
      getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Metric specs for the Study.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.StudySpec.MetricSpec metrics = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.StudySpec.MetricSpecOrBuilder getMetricsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Required. The set of parameters to tune.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.StudySpec.ParameterSpec parameters = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.StudySpec.ParameterSpec> getParametersList();
  /**
   *
   *
   * <pre>
   * Required. The set of parameters to tune.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.StudySpec.ParameterSpec parameters = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.StudySpec.ParameterSpec getParameters(int index);
  /**
   *
   *
   * <pre>
   * Required. The set of parameters to tune.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.StudySpec.ParameterSpec parameters = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * Required. The set of parameters to tune.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.StudySpec.ParameterSpec parameters = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.StudySpec.ParameterSpecOrBuilder>
      getParametersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The set of parameters to tune.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.StudySpec.ParameterSpec parameters = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.StudySpec.ParameterSpecOrBuilder getParametersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The search algorithm specified for the Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StudySpec.Algorithm algorithm = 3;</code>
   *
   * @return The enum numeric value on the wire for algorithm.
   */
  int getAlgorithmValue();
  /**
   *
   *
   * <pre>
   * The search algorithm specified for the Study.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StudySpec.Algorithm algorithm = 3;</code>
   *
   * @return The algorithm.
   */
  com.google.cloud.aiplatform.v1.StudySpec.Algorithm getAlgorithm();

  /**
   *
   *
   * <pre>
   * The observation noise level of the study.
   * Currently only supported by the Vertex AI Vizier service. Not supported by
   * HyperparameterTuningJob or TrainingPipeline.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StudySpec.ObservationNoise observation_noise = 6;</code>
   *
   * @return The enum numeric value on the wire for observationNoise.
   */
  int getObservationNoiseValue();
  /**
   *
   *
   * <pre>
   * The observation noise level of the study.
   * Currently only supported by the Vertex AI Vizier service. Not supported by
   * HyperparameterTuningJob or TrainingPipeline.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StudySpec.ObservationNoise observation_noise = 6;</code>
   *
   * @return The observationNoise.
   */
  com.google.cloud.aiplatform.v1.StudySpec.ObservationNoise getObservationNoise();

  /**
   *
   *
   * <pre>
   * Describe which measurement selection type will be used
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.MeasurementSelectionType measurement_selection_type = 7;
   * </code>
   *
   * @return The enum numeric value on the wire for measurementSelectionType.
   */
  int getMeasurementSelectionTypeValue();
  /**
   *
   *
   * <pre>
   * Describe which measurement selection type will be used
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.StudySpec.MeasurementSelectionType measurement_selection_type = 7;
   * </code>
   *
   * @return The measurementSelectionType.
   */
  com.google.cloud.aiplatform.v1.StudySpec.MeasurementSelectionType getMeasurementSelectionType();

  /**
   *
   *
   * <pre>
   * Conditions for automated stopping of a Study. Enable automated stopping by
   * configuring at least one condition.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.StudySpec.StudyStoppingConfig study_stopping_config = 11;
   * </code>
   *
   * @return Whether the studyStoppingConfig field is set.
   */
  boolean hasStudyStoppingConfig();
  /**
   *
   *
   * <pre>
   * Conditions for automated stopping of a Study. Enable automated stopping by
   * configuring at least one condition.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.StudySpec.StudyStoppingConfig study_stopping_config = 11;
   * </code>
   *
   * @return The studyStoppingConfig.
   */
  com.google.cloud.aiplatform.v1.StudySpec.StudyStoppingConfig getStudyStoppingConfig();
  /**
   *
   *
   * <pre>
   * Conditions for automated stopping of a Study. Enable automated stopping by
   * configuring at least one condition.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.StudySpec.StudyStoppingConfig study_stopping_config = 11;
   * </code>
   */
  com.google.cloud.aiplatform.v1.StudySpec.StudyStoppingConfigOrBuilder
      getStudyStoppingConfigOrBuilder();

  com.google.cloud.aiplatform.v1.StudySpec.AutomatedStoppingSpecCase getAutomatedStoppingSpecCase();
}
