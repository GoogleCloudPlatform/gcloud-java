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
// source: google/cloud/aiplatform/v1beta1/tuning_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface DistillationHyperParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DistillationHyperParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Number of complete passes the model makes over the entire
   * training dataset during training.
   * </pre>
   *
   * <code>optional int64 epoch_count = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the epochCount field is set.
   */
  boolean hasEpochCount();
  /**
   *
   *
   * <pre>
   * Optional. Number of complete passes the model makes over the entire
   * training dataset during training.
   * </pre>
   *
   * <code>optional int64 epoch_count = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The epochCount.
   */
  long getEpochCount();

  /**
   *
   *
   * <pre>
   * Optional. Multiplier for adjusting the default learning rate.
   * </pre>
   *
   * <code>optional double learning_rate_multiplier = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the learningRateMultiplier field is set.
   */
  boolean hasLearningRateMultiplier();
  /**
   *
   *
   * <pre>
   * Optional. Multiplier for adjusting the default learning rate.
   * </pre>
   *
   * <code>optional double learning_rate_multiplier = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The learningRateMultiplier.
   */
  double getLearningRateMultiplier();

  /**
   *
   *
   * <pre>
   * Optional. Adapter size for distillation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for adapterSize.
   */
  int getAdapterSizeValue();
  /**
   *
   *
   * <pre>
   * Optional. Adapter size for distillation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The adapterSize.
   */
  com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize getAdapterSize();
}
