// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface RecordSuppressionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.RecordSuppression)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A condition that when it evaluates to true will result in the record being
   * evaluated to be suppressed from the transformed content.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
   */
  boolean hasCondition();
  /**
   *
   *
   * <pre>
   * A condition that when it evaluates to true will result in the record being
   * evaluated to be suppressed from the transformed content.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
   */
  com.google.privacy.dlp.v2.RecordCondition getCondition();
  /**
   *
   *
   * <pre>
   * A condition that when it evaluates to true will result in the record being
   * evaluated to be suppressed from the transformed content.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
   */
  com.google.privacy.dlp.v2.RecordConditionOrBuilder getConditionOrBuilder();
}
