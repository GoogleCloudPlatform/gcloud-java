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
// source: google/cloud/aiplatform/v1/nas_job.proto

package com.google.cloud.aiplatform.v1;

public interface NasJobSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.NasJobSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The spec of multi-trial algorithms.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NasJobSpec.MultiTrialAlgorithmSpec multi_trial_algorithm_spec = 2;
   * </code>
   *
   * @return Whether the multiTrialAlgorithmSpec field is set.
   */
  boolean hasMultiTrialAlgorithmSpec();
  /**
   *
   *
   * <pre>
   * The spec of multi-trial algorithms.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NasJobSpec.MultiTrialAlgorithmSpec multi_trial_algorithm_spec = 2;
   * </code>
   *
   * @return The multiTrialAlgorithmSpec.
   */
  com.google.cloud.aiplatform.v1.NasJobSpec.MultiTrialAlgorithmSpec getMultiTrialAlgorithmSpec();
  /**
   *
   *
   * <pre>
   * The spec of multi-trial algorithms.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NasJobSpec.MultiTrialAlgorithmSpec multi_trial_algorithm_spec = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1.NasJobSpec.MultiTrialAlgorithmSpecOrBuilder
      getMultiTrialAlgorithmSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The ID of the existing NasJob in the same Project and Location
   * which will be used to resume search. search_space_spec and
   * nas_algorithm_spec are obtained from previous NasJob hence should not
   * provide them again for this NasJob.
   * </pre>
   *
   * <code>string resume_nas_job_id = 3;</code>
   *
   * @return The resumeNasJobId.
   */
  java.lang.String getResumeNasJobId();
  /**
   *
   *
   * <pre>
   * The ID of the existing NasJob in the same Project and Location
   * which will be used to resume search. search_space_spec and
   * nas_algorithm_spec are obtained from previous NasJob hence should not
   * provide them again for this NasJob.
   * </pre>
   *
   * <code>string resume_nas_job_id = 3;</code>
   *
   * @return The bytes for resumeNasJobId.
   */
  com.google.protobuf.ByteString getResumeNasJobIdBytes();

  /**
   *
   *
   * <pre>
   * It defines the search space for Neural Architecture Search (NAS).
   * </pre>
   *
   * <code>string search_space_spec = 1;</code>
   *
   * @return The searchSpaceSpec.
   */
  java.lang.String getSearchSpaceSpec();
  /**
   *
   *
   * <pre>
   * It defines the search space for Neural Architecture Search (NAS).
   * </pre>
   *
   * <code>string search_space_spec = 1;</code>
   *
   * @return The bytes for searchSpaceSpec.
   */
  com.google.protobuf.ByteString getSearchSpaceSpecBytes();

  com.google.cloud.aiplatform.v1.NasJobSpec.NasAlgorithmSpecCase getNasAlgorithmSpecCase();
}
