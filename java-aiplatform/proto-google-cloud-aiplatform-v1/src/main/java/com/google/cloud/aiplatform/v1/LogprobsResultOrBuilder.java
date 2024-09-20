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
// source: google/cloud/aiplatform/v1/content.proto

package com.google.cloud.aiplatform.v1;

public interface LogprobsResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.LogprobsResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Length = total number of decoding steps.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.LogprobsResult.TopCandidates top_candidates = 1;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.LogprobsResult.TopCandidates>
      getTopCandidatesList();
  /**
   *
   *
   * <pre>
   * Length = total number of decoding steps.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.LogprobsResult.TopCandidates top_candidates = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.LogprobsResult.TopCandidates getTopCandidates(int index);
  /**
   *
   *
   * <pre>
   * Length = total number of decoding steps.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.LogprobsResult.TopCandidates top_candidates = 1;
   * </code>
   */
  int getTopCandidatesCount();
  /**
   *
   *
   * <pre>
   * Length = total number of decoding steps.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.LogprobsResult.TopCandidates top_candidates = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.LogprobsResult.TopCandidatesOrBuilder>
      getTopCandidatesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Length = total number of decoding steps.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.LogprobsResult.TopCandidates top_candidates = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.LogprobsResult.TopCandidatesOrBuilder getTopCandidatesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Length = total number of decoding steps.
   * The chosen candidates may or may not be in top_candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.LogprobsResult.Candidate chosen_candidates = 2;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.LogprobsResult.Candidate> getChosenCandidatesList();
  /**
   *
   *
   * <pre>
   * Length = total number of decoding steps.
   * The chosen candidates may or may not be in top_candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.LogprobsResult.Candidate chosen_candidates = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1.LogprobsResult.Candidate getChosenCandidates(int index);
  /**
   *
   *
   * <pre>
   * Length = total number of decoding steps.
   * The chosen candidates may or may not be in top_candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.LogprobsResult.Candidate chosen_candidates = 2;
   * </code>
   */
  int getChosenCandidatesCount();
  /**
   *
   *
   * <pre>
   * Length = total number of decoding steps.
   * The chosen candidates may or may not be in top_candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.LogprobsResult.Candidate chosen_candidates = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.LogprobsResult.CandidateOrBuilder>
      getChosenCandidatesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Length = total number of decoding steps.
   * The chosen candidates may or may not be in top_candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.LogprobsResult.Candidate chosen_candidates = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1.LogprobsResult.CandidateOrBuilder getChosenCandidatesOrBuilder(
      int index);
}
