// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/prediction_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface GenerateContentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.GenerateContentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Generated candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Candidate candidates = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Candidate> 
      getCandidatesList();
  /**
   * <pre>
   * Output only. Generated candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Candidate candidates = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.Candidate getCandidates(int index);
  /**
   * <pre>
   * Output only. Generated candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Candidate candidates = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getCandidatesCount();
  /**
   * <pre>
   * Output only. Generated candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Candidate candidates = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.CandidateOrBuilder> 
      getCandidatesOrBuilderList();
  /**
   * <pre>
   * Output only. Generated candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Candidate candidates = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.CandidateOrBuilder getCandidatesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Content filter results for a prompt sent in the request.
   * Note: Sent only in the first stream chunk.
   * Only happens when no candidates were generated due to content violations.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenerateContentResponse.PromptFeedback prompt_feedback = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the promptFeedback field is set.
   */
  boolean hasPromptFeedback();
  /**
   * <pre>
   * Output only. Content filter results for a prompt sent in the request.
   * Note: Sent only in the first stream chunk.
   * Only happens when no candidates were generated due to content violations.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenerateContentResponse.PromptFeedback prompt_feedback = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The promptFeedback.
   */
  com.google.cloud.aiplatform.v1beta1.GenerateContentResponse.PromptFeedback getPromptFeedback();
  /**
   * <pre>
   * Output only. Content filter results for a prompt sent in the request.
   * Note: Sent only in the first stream chunk.
   * Only happens when no candidates were generated due to content violations.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenerateContentResponse.PromptFeedback prompt_feedback = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.GenerateContentResponse.PromptFeedbackOrBuilder getPromptFeedbackOrBuilder();

  /**
   * <pre>
   * Usage metadata about the response(s).
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenerateContentResponse.UsageMetadata usage_metadata = 4;</code>
   * @return Whether the usageMetadata field is set.
   */
  boolean hasUsageMetadata();
  /**
   * <pre>
   * Usage metadata about the response(s).
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenerateContentResponse.UsageMetadata usage_metadata = 4;</code>
   * @return The usageMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.GenerateContentResponse.UsageMetadata getUsageMetadata();
  /**
   * <pre>
   * Usage metadata about the response(s).
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenerateContentResponse.UsageMetadata usage_metadata = 4;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GenerateContentResponse.UsageMetadataOrBuilder getUsageMetadataOrBuilder();
}
