// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface ReviewDocumentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ReviewDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document inline_document = 4;</code>
   * @return Whether the inlineDocument field is set.
   */
  boolean hasInlineDocument();
  /**
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document inline_document = 4;</code>
   * @return The inlineDocument.
   */
  com.google.cloud.documentai.v1beta3.Document getInlineDocument();
  /**
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document inline_document = 4;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentOrBuilder getInlineDocumentOrBuilder();

  /**
   * <pre>
   * Required. The resource name of the
   * [HumanReviewConfig][google.cloud.documentai.v1beta3.HumanReviewConfig] that
   * the document will be reviewed with.
   * </pre>
   *
   * <code>string human_review_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The humanReviewConfig.
   */
  java.lang.String getHumanReviewConfig();
  /**
   * <pre>
   * Required. The resource name of the
   * [HumanReviewConfig][google.cloud.documentai.v1beta3.HumanReviewConfig] that
   * the document will be reviewed with.
   * </pre>
   *
   * <code>string human_review_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for humanReviewConfig.
   */
  com.google.protobuf.ByteString
      getHumanReviewConfigBytes();

  /**
   * <pre>
   * The document that needs human review.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2 [deprecated = true];</code>
   * @deprecated google.cloud.documentai.v1beta3.ReviewDocumentRequest.document is deprecated.
   *     See google/cloud/documentai/v1beta3/document_processor_service.proto;l=1099
   * @return Whether the document field is set.
   */
  @java.lang.Deprecated boolean hasDocument();
  /**
   * <pre>
   * The document that needs human review.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2 [deprecated = true];</code>
   * @deprecated google.cloud.documentai.v1beta3.ReviewDocumentRequest.document is deprecated.
   *     See google/cloud/documentai/v1beta3/document_processor_service.proto;l=1099
   * @return The document.
   */
  @java.lang.Deprecated com.google.cloud.documentai.v1beta3.Document getDocument();
  /**
   * <pre>
   * The document that needs human review.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.cloud.documentai.v1beta3.DocumentOrBuilder getDocumentOrBuilder();

  /**
   * <pre>
   * Whether the validation should be performed on the ad-hoc review request.
   * </pre>
   *
   * <code>bool enable_schema_validation = 3;</code>
   * @return The enableSchemaValidation.
   */
  boolean getEnableSchemaValidation();

  /**
   * <pre>
   * The priority of the human review task.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ReviewDocumentRequest.Priority priority = 5;</code>
   * @return The enum numeric value on the wire for priority.
   */
  int getPriorityValue();
  /**
   * <pre>
   * The priority of the human review task.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ReviewDocumentRequest.Priority priority = 5;</code>
   * @return The priority.
   */
  com.google.cloud.documentai.v1beta3.ReviewDocumentRequest.Priority getPriority();

  /**
   * <pre>
   * The document schema of the human review task.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentSchema document_schema = 6;</code>
   * @return Whether the documentSchema field is set.
   */
  boolean hasDocumentSchema();
  /**
   * <pre>
   * The document schema of the human review task.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentSchema document_schema = 6;</code>
   * @return The documentSchema.
   */
  com.google.cloud.documentai.v1beta3.DocumentSchema getDocumentSchema();
  /**
   * <pre>
   * The document schema of the human review task.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentSchema document_schema = 6;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentSchemaOrBuilder getDocumentSchemaOrBuilder();

  com.google.cloud.documentai.v1beta3.ReviewDocumentRequest.SourceCase getSourceCase();
}
