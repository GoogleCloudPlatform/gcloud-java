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
// source: google/cloud/aiplatform/v1/data_labeling_job.proto

package com.google.cloud.aiplatform.v1;

public interface SampleConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SampleConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The percentage of data needed to be labeled in the first batch.
   * </pre>
   *
   * <code>int32 initial_batch_sample_percentage = 1;</code>
   *
   * @return Whether the initialBatchSamplePercentage field is set.
   */
  boolean hasInitialBatchSamplePercentage();
  /**
   *
   *
   * <pre>
   * The percentage of data needed to be labeled in the first batch.
   * </pre>
   *
   * <code>int32 initial_batch_sample_percentage = 1;</code>
   *
   * @return The initialBatchSamplePercentage.
   */
  int getInitialBatchSamplePercentage();

  /**
   *
   *
   * <pre>
   * The percentage of data needed to be labeled in each following batch
   * (except the first batch).
   * </pre>
   *
   * <code>int32 following_batch_sample_percentage = 3;</code>
   *
   * @return Whether the followingBatchSamplePercentage field is set.
   */
  boolean hasFollowingBatchSamplePercentage();
  /**
   *
   *
   * <pre>
   * The percentage of data needed to be labeled in each following batch
   * (except the first batch).
   * </pre>
   *
   * <code>int32 following_batch_sample_percentage = 3;</code>
   *
   * @return The followingBatchSamplePercentage.
   */
  int getFollowingBatchSamplePercentage();

  /**
   *
   *
   * <pre>
   * Field to choose sampling strategy. Sampling strategy will decide which data
   * should be selected for human labeling in every batch.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy sample_strategy = 5;</code>
   *
   * @return The enum numeric value on the wire for sampleStrategy.
   */
  int getSampleStrategyValue();
  /**
   *
   *
   * <pre>
   * Field to choose sampling strategy. Sampling strategy will decide which data
   * should be selected for human labeling in every batch.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy sample_strategy = 5;</code>
   *
   * @return The sampleStrategy.
   */
  com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy getSampleStrategy();

  com.google.cloud.aiplatform.v1.SampleConfig.InitialBatchSampleSizeCase
      getInitialBatchSampleSizeCase();

  com.google.cloud.aiplatform.v1.SampleConfig.FollowingBatchSampleSizeCase
      getFollowingBatchSampleSizeCase();
}
