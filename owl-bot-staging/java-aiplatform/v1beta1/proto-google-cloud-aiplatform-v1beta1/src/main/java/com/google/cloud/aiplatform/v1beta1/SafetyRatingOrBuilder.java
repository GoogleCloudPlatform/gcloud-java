// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/content.proto

package com.google.cloud.aiplatform.v1beta1;

public interface SafetyRatingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SafetyRating)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Harm category.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <pre>
   * Output only. Harm category.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The category.
   */
  com.google.cloud.aiplatform.v1beta1.HarmCategory getCategory();

  /**
   * <pre>
   * Output only. Harm probability levels in the content.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for probability.
   */
  int getProbabilityValue();
  /**
   * <pre>
   * Output only. Harm probability levels in the content.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The probability.
   */
  com.google.cloud.aiplatform.v1beta1.SafetyRating.HarmProbability getProbability();

  /**
   * <pre>
   * Output only. Indicates whether the content was filtered out because of this
   * rating.
   * </pre>
   *
   * <code>bool blocked = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The blocked.
   */
  boolean getBlocked();
}
