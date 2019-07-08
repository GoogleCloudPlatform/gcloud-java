// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

public interface InterviewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Interview)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The rating on this interview.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
   */
  boolean hasRating();
  /**
   *
   *
   * <pre>
   * Optional. The rating on this interview.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
   */
  com.google.cloud.talent.v4beta1.Rating getRating();
  /**
   *
   *
   * <pre>
   * Optional. The rating on this interview.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
   */
  com.google.cloud.talent.v4beta1.RatingOrBuilder getRatingOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The overall decision resulting from this interview (positive,
   * negative, nuetral).
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Outcome outcome = 7;</code>
   */
  int getOutcomeValue();
  /**
   *
   *
   * <pre>
   * Required. The overall decision resulting from this interview (positive,
   * negative, nuetral).
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Outcome outcome = 7;</code>
   */
  com.google.cloud.talent.v4beta1.Outcome getOutcome();
}
