// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

public interface HumanReviewStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.HumanReviewStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The state of human review on the processing request.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.HumanReviewStatus.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * The state of human review on the processing request.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.HumanReviewStatus.State state = 1;</code>
   * @return The state.
   */
  com.google.cloud.documentai.v1.HumanReviewStatus.State getState();

  /**
   * <pre>
   * A message providing more details about the human review state.
   * </pre>
   *
   * <code>string state_message = 2;</code>
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();
  /**
   * <pre>
   * A message providing more details about the human review state.
   * </pre>
   *
   * <code>string state_message = 2;</code>
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString
      getStateMessageBytes();

  /**
   * <pre>
   * The name of the operation triggered by the processed document. This field
   * is populated only when the
   * [state][google.cloud.documentai.v1.HumanReviewStatus.state] is
   * `HUMAN_REVIEW_IN_PROGRESS`. It has the same response type and metadata as
   * the long-running operation returned by
   * [ReviewDocument][google.cloud.documentai.v1.DocumentProcessorService.ReviewDocument].
   * </pre>
   *
   * <code>string human_review_operation = 3;</code>
   * @return The humanReviewOperation.
   */
  java.lang.String getHumanReviewOperation();
  /**
   * <pre>
   * The name of the operation triggered by the processed document. This field
   * is populated only when the
   * [state][google.cloud.documentai.v1.HumanReviewStatus.state] is
   * `HUMAN_REVIEW_IN_PROGRESS`. It has the same response type and metadata as
   * the long-running operation returned by
   * [ReviewDocument][google.cloud.documentai.v1.DocumentProcessorService.ReviewDocument].
   * </pre>
   *
   * <code>string human_review_operation = 3;</code>
   * @return The bytes for humanReviewOperation.
   */
  com.google.protobuf.ByteString
      getHumanReviewOperationBytes();
}
