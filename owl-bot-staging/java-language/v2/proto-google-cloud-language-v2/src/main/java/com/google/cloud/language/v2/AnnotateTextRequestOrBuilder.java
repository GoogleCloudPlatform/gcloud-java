// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v2/language_service.proto

package com.google.cloud.language.v2;

public interface AnnotateTextRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v2.AnnotateTextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>.google.cloud.language.v2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>.google.cloud.language.v2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The document.
   */
  com.google.cloud.language.v2.Document getDocument();
  /**
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>.google.cloud.language.v2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.language.v2.DocumentOrBuilder getDocumentOrBuilder();

  /**
   * <pre>
   * Required. The enabled features.
   * </pre>
   *
   * <code>.google.cloud.language.v2.AnnotateTextRequest.Features features = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the features field is set.
   */
  boolean hasFeatures();
  /**
   * <pre>
   * Required. The enabled features.
   * </pre>
   *
   * <code>.google.cloud.language.v2.AnnotateTextRequest.Features features = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The features.
   */
  com.google.cloud.language.v2.AnnotateTextRequest.Features getFeatures();
  /**
   * <pre>
   * Required. The enabled features.
   * </pre>
   *
   * <code>.google.cloud.language.v2.AnnotateTextRequest.Features features = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.language.v2.AnnotateTextRequest.FeaturesOrBuilder getFeaturesOrBuilder();

  /**
   * <pre>
   * The encoding type used by the API to calculate offsets.
   * </pre>
   *
   * <code>.google.cloud.language.v2.EncodingType encoding_type = 3;</code>
   * @return The enum numeric value on the wire for encodingType.
   */
  int getEncodingTypeValue();
  /**
   * <pre>
   * The encoding type used by the API to calculate offsets.
   * </pre>
   *
   * <code>.google.cloud.language.v2.EncodingType encoding_type = 3;</code>
   * @return The encodingType.
   */
  com.google.cloud.language.v2.EncodingType getEncodingType();
}
