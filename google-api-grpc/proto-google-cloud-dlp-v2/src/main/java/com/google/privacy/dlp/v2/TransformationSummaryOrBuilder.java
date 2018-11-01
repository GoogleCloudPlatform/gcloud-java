// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface TransformationSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.TransformationSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Set if the transformation was limited to a specific info_type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   */
  boolean hasInfoType();
  /**
   * <pre>
   * Set if the transformation was limited to a specific info_type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoType getInfoType();
  /**
   * <pre>
   * Set if the transformation was limited to a specific info_type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder();

  /**
   * <pre>
   * Set if the transformation was limited to a specific FieldId.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
   */
  boolean hasField();
  /**
   * <pre>
   * Set if the transformation was limited to a specific FieldId.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
   */
  com.google.privacy.dlp.v2.FieldId getField();
  /**
   * <pre>
   * Set if the transformation was limited to a specific FieldId.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
   */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getFieldOrBuilder();

  /**
   * <pre>
   * The specific transformation these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrimitiveTransformation transformation = 3;</code>
   */
  boolean hasTransformation();
  /**
   * <pre>
   * The specific transformation these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrimitiveTransformation transformation = 3;</code>
   */
  com.google.privacy.dlp.v2.PrimitiveTransformation getTransformation();
  /**
   * <pre>
   * The specific transformation these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrimitiveTransformation transformation = 3;</code>
   */
  com.google.privacy.dlp.v2.PrimitiveTransformationOrBuilder getTransformationOrBuilder();

  /**
   * <pre>
   * The field transformation that was applied.
   * If multiple field transformations are requested for a single field,
   * this list will contain all of them; otherwise, only one is supplied.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldTransformation field_transformations = 5;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.FieldTransformation> 
      getFieldTransformationsList();
  /**
   * <pre>
   * The field transformation that was applied.
   * If multiple field transformations are requested for a single field,
   * this list will contain all of them; otherwise, only one is supplied.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldTransformation field_transformations = 5;</code>
   */
  com.google.privacy.dlp.v2.FieldTransformation getFieldTransformations(int index);
  /**
   * <pre>
   * The field transformation that was applied.
   * If multiple field transformations are requested for a single field,
   * this list will contain all of them; otherwise, only one is supplied.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldTransformation field_transformations = 5;</code>
   */
  int getFieldTransformationsCount();
  /**
   * <pre>
   * The field transformation that was applied.
   * If multiple field transformations are requested for a single field,
   * this list will contain all of them; otherwise, only one is supplied.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldTransformation field_transformations = 5;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.FieldTransformationOrBuilder> 
      getFieldTransformationsOrBuilderList();
  /**
   * <pre>
   * The field transformation that was applied.
   * If multiple field transformations are requested for a single field,
   * this list will contain all of them; otherwise, only one is supplied.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldTransformation field_transformations = 5;</code>
   */
  com.google.privacy.dlp.v2.FieldTransformationOrBuilder getFieldTransformationsOrBuilder(
      int index);

  /**
   * <pre>
   * The specific suppression option these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordSuppression record_suppress = 6;</code>
   */
  boolean hasRecordSuppress();
  /**
   * <pre>
   * The specific suppression option these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordSuppression record_suppress = 6;</code>
   */
  com.google.privacy.dlp.v2.RecordSuppression getRecordSuppress();
  /**
   * <pre>
   * The specific suppression option these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordSuppression record_suppress = 6;</code>
   */
  com.google.privacy.dlp.v2.RecordSuppressionOrBuilder getRecordSuppressOrBuilder();

  /**
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary.SummaryResult results = 4;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.TransformationSummary.SummaryResult> 
      getResultsList();
  /**
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary.SummaryResult results = 4;</code>
   */
  com.google.privacy.dlp.v2.TransformationSummary.SummaryResult getResults(int index);
  /**
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary.SummaryResult results = 4;</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary.SummaryResult results = 4;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.TransformationSummary.SummaryResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary.SummaryResult results = 4;</code>
   */
  com.google.privacy.dlp.v2.TransformationSummary.SummaryResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Total size in bytes that were transformed in some way.
   * </pre>
   *
   * <code>int64 transformed_bytes = 7;</code>
   */
  long getTransformedBytes();
}
