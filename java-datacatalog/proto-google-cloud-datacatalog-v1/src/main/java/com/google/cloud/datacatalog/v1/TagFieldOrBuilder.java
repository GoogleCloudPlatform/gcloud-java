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
// source: google/cloud/datacatalog/v1/tags.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.v1;

public interface TagFieldOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.TagField)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The display name of this field.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The display name of this field.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The value of a tag field with a double type.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   *
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   *
   *
   * <pre>
   * The value of a tag field with a double type.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   *
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   *
   *
   * <pre>
   * The value of a tag field with a string type.
   *
   * The maximum length is 2000 UTF-8 characters.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   *
   *
   * <pre>
   * The value of a tag field with a string type.
   *
   * The maximum length is 2000 UTF-8 characters.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   *
   *
   * <pre>
   * The value of a tag field with a string type.
   *
   * The maximum length is 2000 UTF-8 characters.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString getStringValueBytes();

  /**
   *
   *
   * <pre>
   * The value of a tag field with a boolean type.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   *
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   *
   *
   * <pre>
   * The value of a tag field with a boolean type.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   *
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   *
   *
   * <pre>
   * The value of a tag field with a timestamp type.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 5;</code>
   *
   * @return Whether the timestampValue field is set.
   */
  boolean hasTimestampValue();
  /**
   *
   *
   * <pre>
   * The value of a tag field with a timestamp type.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 5;</code>
   *
   * @return The timestampValue.
   */
  com.google.protobuf.Timestamp getTimestampValue();
  /**
   *
   *
   * <pre>
   * The value of a tag field with a timestamp type.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampValueOrBuilder();

  /**
   *
   *
   * <pre>
   * The value of a tag field with an enum type.
   *
   * This value must be one of the allowed values listed in this enum.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagField.EnumValue enum_value = 6;</code>
   *
   * @return Whether the enumValue field is set.
   */
  boolean hasEnumValue();
  /**
   *
   *
   * <pre>
   * The value of a tag field with an enum type.
   *
   * This value must be one of the allowed values listed in this enum.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagField.EnumValue enum_value = 6;</code>
   *
   * @return The enumValue.
   */
  com.google.cloud.datacatalog.v1.TagField.EnumValue getEnumValue();
  /**
   *
   *
   * <pre>
   * The value of a tag field with an enum type.
   *
   * This value must be one of the allowed values listed in this enum.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagField.EnumValue enum_value = 6;</code>
   */
  com.google.cloud.datacatalog.v1.TagField.EnumValueOrBuilder getEnumValueOrBuilder();

  /**
   *
   *
   * <pre>
   * The value of a tag field with a rich text type.
   *
   * The maximum length is 10 MiB as this value holds HTML descriptions
   * including encoded images. The maximum length of the text without images
   * is 100 KiB.
   * </pre>
   *
   * <code>string richtext_value = 8;</code>
   *
   * @return Whether the richtextValue field is set.
   */
  boolean hasRichtextValue();
  /**
   *
   *
   * <pre>
   * The value of a tag field with a rich text type.
   *
   * The maximum length is 10 MiB as this value holds HTML descriptions
   * including encoded images. The maximum length of the text without images
   * is 100 KiB.
   * </pre>
   *
   * <code>string richtext_value = 8;</code>
   *
   * @return The richtextValue.
   */
  java.lang.String getRichtextValue();
  /**
   *
   *
   * <pre>
   * The value of a tag field with a rich text type.
   *
   * The maximum length is 10 MiB as this value holds HTML descriptions
   * including encoded images. The maximum length of the text without images
   * is 100 KiB.
   * </pre>
   *
   * <code>string richtext_value = 8;</code>
   *
   * @return The bytes for richtextValue.
   */
  com.google.protobuf.ByteString getRichtextValueBytes();

  /**
   *
   *
   * <pre>
   * Output only. The order of this field with respect to other fields in this
   * tag. Can be set by
   * [Tag][google.cloud.datacatalog.v1.TagTemplateField.order].
   *
   * For example, a higher value can indicate a more important field.
   * The value can be negative. Multiple fields can have the same order, and
   * field orders within a tag don't have to be sequential.
   * </pre>
   *
   * <code>int32 order = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The order.
   */
  int getOrder();

  com.google.cloud.datacatalog.v1.TagField.KindCase getKindCase();
}
