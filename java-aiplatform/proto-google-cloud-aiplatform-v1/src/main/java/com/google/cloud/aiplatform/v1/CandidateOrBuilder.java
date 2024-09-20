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

public interface CandidateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Candidate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Index of the candidate.
   * </pre>
   *
   * <code>int32 index = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * Output only. Content parts of the candidate.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Content content = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   *
   *
   * <pre>
   * Output only. Content parts of the candidate.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Content content = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The content.
   */
  com.google.cloud.aiplatform.v1.Content getContent();
  /**
   *
   *
   * <pre>
   * Output only. Content parts of the candidate.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Content content = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ContentOrBuilder getContentOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Confidence score of the candidate.
   * </pre>
   *
   * <code>double score = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The score.
   */
  double getScore();

  /**
   *
   *
   * <pre>
   * Output only. Average log probability score of the candidate.
   * </pre>
   *
   * <code>double avg_logprobs = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The avgLogprobs.
   */
  double getAvgLogprobs();

  /**
   *
   *
   * <pre>
   * Output only. Log-likelihood scores for the response tokens and top tokens
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.LogprobsResult logprobs_result = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the logprobsResult field is set.
   */
  boolean hasLogprobsResult();
  /**
   *
   *
   * <pre>
   * Output only. Log-likelihood scores for the response tokens and top tokens
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.LogprobsResult logprobs_result = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The logprobsResult.
   */
  com.google.cloud.aiplatform.v1.LogprobsResult getLogprobsResult();
  /**
   *
   *
   * <pre>
   * Output only. Log-likelihood scores for the response tokens and top tokens
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.LogprobsResult logprobs_result = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.LogprobsResultOrBuilder getLogprobsResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The reason why the model stopped generating tokens.
   * If empty, the model has not stopped generating the tokens.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Candidate.FinishReason finish_reason = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for finishReason.
   */
  int getFinishReasonValue();
  /**
   *
   *
   * <pre>
   * Output only. The reason why the model stopped generating tokens.
   * If empty, the model has not stopped generating the tokens.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Candidate.FinishReason finish_reason = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The finishReason.
   */
  com.google.cloud.aiplatform.v1.Candidate.FinishReason getFinishReason();

  /**
   *
   *
   * <pre>
   * Output only. List of ratings for the safety of a response candidate.
   *
   * There is at most one rating per category.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SafetyRating safety_ratings = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.SafetyRating> getSafetyRatingsList();
  /**
   *
   *
   * <pre>
   * Output only. List of ratings for the safety of a response candidate.
   *
   * There is at most one rating per category.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SafetyRating safety_ratings = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.SafetyRating getSafetyRatings(int index);
  /**
   *
   *
   * <pre>
   * Output only. List of ratings for the safety of a response candidate.
   *
   * There is at most one rating per category.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SafetyRating safety_ratings = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getSafetyRatingsCount();
  /**
   *
   *
   * <pre>
   * Output only. List of ratings for the safety of a response candidate.
   *
   * There is at most one rating per category.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SafetyRating safety_ratings = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.SafetyRatingOrBuilder>
      getSafetyRatingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. List of ratings for the safety of a response candidate.
   *
   * There is at most one rating per category.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SafetyRating safety_ratings = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.SafetyRatingOrBuilder getSafetyRatingsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Describes the reason the mode stopped generating tokens in
   * more detail. This is only filled when `finish_reason` is set.
   * </pre>
   *
   * <code>optional string finish_message = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the finishMessage field is set.
   */
  boolean hasFinishMessage();
  /**
   *
   *
   * <pre>
   * Output only. Describes the reason the mode stopped generating tokens in
   * more detail. This is only filled when `finish_reason` is set.
   * </pre>
   *
   * <code>optional string finish_message = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The finishMessage.
   */
  java.lang.String getFinishMessage();
  /**
   *
   *
   * <pre>
   * Output only. Describes the reason the mode stopped generating tokens in
   * more detail. This is only filled when `finish_reason` is set.
   * </pre>
   *
   * <code>optional string finish_message = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for finishMessage.
   */
  com.google.protobuf.ByteString getFinishMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. Source attribution of the generated content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.CitationMetadata citation_metadata = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the citationMetadata field is set.
   */
  boolean hasCitationMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Source attribution of the generated content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.CitationMetadata citation_metadata = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The citationMetadata.
   */
  com.google.cloud.aiplatform.v1.CitationMetadata getCitationMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Source attribution of the generated content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.CitationMetadata citation_metadata = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.CitationMetadataOrBuilder getCitationMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Metadata specifies sources used to ground generated content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.GroundingMetadata grounding_metadata = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the groundingMetadata field is set.
   */
  boolean hasGroundingMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata specifies sources used to ground generated content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.GroundingMetadata grounding_metadata = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The groundingMetadata.
   */
  com.google.cloud.aiplatform.v1.GroundingMetadata getGroundingMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata specifies sources used to ground generated content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.GroundingMetadata grounding_metadata = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.GroundingMetadataOrBuilder getGroundingMetadataOrBuilder();
}
