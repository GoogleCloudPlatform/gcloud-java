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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.clouddms.v1;

public interface MultiColumnDatatypeChangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.MultiColumnDatatypeChange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Filter on source data type.
   * </pre>
   *
   * <code>string source_data_type_filter = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sourceDataTypeFilter.
   */
  java.lang.String getSourceDataTypeFilter();
  /**
   *
   *
   * <pre>
   * Required. Filter on source data type.
   * </pre>
   *
   * <code>string source_data_type_filter = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for sourceDataTypeFilter.
   */
  com.google.protobuf.ByteString getSourceDataTypeFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Filter for text-based data types like varchar.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SourceTextFilter source_text_filter = 100 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sourceTextFilter field is set.
   */
  boolean hasSourceTextFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filter for text-based data types like varchar.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SourceTextFilter source_text_filter = 100 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sourceTextFilter.
   */
  com.google.cloud.clouddms.v1.SourceTextFilter getSourceTextFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filter for text-based data types like varchar.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SourceTextFilter source_text_filter = 100 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.SourceTextFilterOrBuilder getSourceTextFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Filter for fixed point number data types such as
   * NUMERIC/NUMBER.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SourceNumericFilter source_numeric_filter = 101 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sourceNumericFilter field is set.
   */
  boolean hasSourceNumericFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filter for fixed point number data types such as
   * NUMERIC/NUMBER.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SourceNumericFilter source_numeric_filter = 101 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sourceNumericFilter.
   */
  com.google.cloud.clouddms.v1.SourceNumericFilter getSourceNumericFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filter for fixed point number data types such as
   * NUMERIC/NUMBER.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SourceNumericFilter source_numeric_filter = 101 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.SourceNumericFilterOrBuilder getSourceNumericFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. New data type.
   * </pre>
   *
   * <code>string new_data_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The newDataType.
   */
  java.lang.String getNewDataType();
  /**
   *
   *
   * <pre>
   * Required. New data type.
   * </pre>
   *
   * <code>string new_data_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for newDataType.
   */
  com.google.protobuf.ByteString getNewDataTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Column length - e.g. varchar (50) - if not specified and relevant
   * uses the source column length.
   * </pre>
   *
   * <code>int64 override_length = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The overrideLength.
   */
  long getOverrideLength();

  /**
   *
   *
   * <pre>
   * Optional. Column scale - when relevant - if not specified and relevant
   * uses the source column scale.
   * </pre>
   *
   * <code>int32 override_scale = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The overrideScale.
   */
  int getOverrideScale();

  /**
   *
   *
   * <pre>
   * Optional. Column precision - when relevant - if not specified and relevant
   * uses the source column precision.
   * </pre>
   *
   * <code>int32 override_precision = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The overridePrecision.
   */
  int getOverridePrecision();

  /**
   *
   *
   * <pre>
   * Optional. Column fractional seconds precision - used only for timestamp
   * based datatypes - if not specified and relevant uses the source column
   * fractional seconds precision.
   * </pre>
   *
   * <code>
   * int32 override_fractional_seconds_precision = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The overrideFractionalSecondsPrecision.
   */
  int getOverrideFractionalSecondsPrecision();

  /**
   *
   *
   * <pre>
   * Optional. Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the customFeatures field is set.
   */
  boolean hasCustomFeatures();
  /**
   *
   *
   * <pre>
   * Optional. Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The customFeatures.
   */
  com.google.protobuf.Struct getCustomFeatures();
  /**
   *
   *
   * <pre>
   * Optional. Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.StructOrBuilder getCustomFeaturesOrBuilder();

  com.google.cloud.clouddms.v1.MultiColumnDatatypeChange.SourceFilterCase getSourceFilterCase();
}
