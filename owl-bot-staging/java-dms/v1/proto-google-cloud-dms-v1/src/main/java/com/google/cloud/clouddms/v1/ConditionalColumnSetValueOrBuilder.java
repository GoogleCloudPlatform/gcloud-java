// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

package com.google.cloud.clouddms.v1;

public interface ConditionalColumnSetValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.ConditionalColumnSetValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Optional filter on source column length. Used for text based
   * data types like varchar.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SourceTextFilter source_text_filter = 100 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the sourceTextFilter field is set.
   */
  boolean hasSourceTextFilter();
  /**
   * <pre>
   * Optional. Optional filter on source column length. Used for text based
   * data types like varchar.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SourceTextFilter source_text_filter = 100 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sourceTextFilter.
   */
  com.google.cloud.clouddms.v1.SourceTextFilter getSourceTextFilter();
  /**
   * <pre>
   * Optional. Optional filter on source column length. Used for text based
   * data types like varchar.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SourceTextFilter source_text_filter = 100 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.clouddms.v1.SourceTextFilterOrBuilder getSourceTextFilterOrBuilder();

  /**
   * <pre>
   * Optional. Optional filter on source column precision and scale. Used for
   * fixed point numbers such as NUMERIC/NUMBER data types.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SourceNumericFilter source_numeric_filter = 101 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the sourceNumericFilter field is set.
   */
  boolean hasSourceNumericFilter();
  /**
   * <pre>
   * Optional. Optional filter on source column precision and scale. Used for
   * fixed point numbers such as NUMERIC/NUMBER data types.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SourceNumericFilter source_numeric_filter = 101 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sourceNumericFilter.
   */
  com.google.cloud.clouddms.v1.SourceNumericFilter getSourceNumericFilter();
  /**
   * <pre>
   * Optional. Optional filter on source column precision and scale. Used for
   * fixed point numbers such as NUMERIC/NUMBER data types.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SourceNumericFilter source_numeric_filter = 101 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.clouddms.v1.SourceNumericFilterOrBuilder getSourceNumericFilterOrBuilder();

  /**
   * <pre>
   * Required. Description of data transformation during migration.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.ValueTransformation value_transformation = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the valueTransformation field is set.
   */
  boolean hasValueTransformation();
  /**
   * <pre>
   * Required. Description of data transformation during migration.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.ValueTransformation value_transformation = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The valueTransformation.
   */
  com.google.cloud.clouddms.v1.ValueTransformation getValueTransformation();
  /**
   * <pre>
   * Required. Description of data transformation during migration.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.ValueTransformation value_transformation = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.clouddms.v1.ValueTransformationOrBuilder getValueTransformationOrBuilder();

  /**
   * <pre>
   * Optional. Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the customFeatures field is set.
   */
  boolean hasCustomFeatures();
  /**
   * <pre>
   * Optional. Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The customFeatures.
   */
  com.google.protobuf.Struct getCustomFeatures();
  /**
   * <pre>
   * Optional. Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StructOrBuilder getCustomFeaturesOrBuilder();

  com.google.cloud.clouddms.v1.ConditionalColumnSetValue.SourceFilterCase getSourceFilterCase();
}
