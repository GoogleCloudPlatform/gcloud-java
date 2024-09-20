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
// source: google/cloud/aiplatform/v1/openapi.proto

package com.google.cloud.aiplatform.v1;

public interface SchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The type of the data.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Type type = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The type of the data.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Type type = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.aiplatform.v1.Type getType();

  /**
   *
   *
   * <pre>
   * Optional. The format of the data.
   * Supported formats:
   *  for NUMBER type: "float", "double"
   *  for INTEGER type: "int32", "int64"
   *  for STRING type: "email", "byte", etc
   * </pre>
   *
   * <code>string format = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   *
   *
   * <pre>
   * Optional. The format of the data.
   * Supported formats:
   *  for NUMBER type: "float", "double"
   *  for INTEGER type: "int32", "int64"
   *  for STRING type: "email", "byte", etc
   * </pre>
   *
   * <code>string format = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString getFormatBytes();

  /**
   *
   *
   * <pre>
   * Optional. The title of the Schema.
   * </pre>
   *
   * <code>string title = 24 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * Optional. The title of the Schema.
   * </pre>
   *
   * <code>string title = 24 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Optional. The description of the data.
   * </pre>
   *
   * <code>string description = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description of the data.
   * </pre>
   *
   * <code>string description = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Indicates if the value may be null.
   * </pre>
   *
   * <code>bool nullable = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The nullable.
   */
  boolean getNullable();

  /**
   *
   *
   * <pre>
   * Optional. Default value of the data.
   * </pre>
   *
   * <code>.google.protobuf.Value default = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the default field is set.
   */
  boolean hasDefault();
  /**
   *
   *
   * <pre>
   * Optional. Default value of the data.
   * </pre>
   *
   * <code>.google.protobuf.Value default = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The default.
   */
  com.google.protobuf.Value getDefault();
  /**
   *
   *
   * <pre>
   * Optional. Default value of the data.
   * </pre>
   *
   * <code>.google.protobuf.Value default = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ValueOrBuilder getDefaultOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. SCHEMA FIELDS FOR TYPE ARRAY
   * Schema of the elements of Type.ARRAY.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Schema items = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the items field is set.
   */
  boolean hasItems();
  /**
   *
   *
   * <pre>
   * Optional. SCHEMA FIELDS FOR TYPE ARRAY
   * Schema of the elements of Type.ARRAY.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Schema items = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The items.
   */
  com.google.cloud.aiplatform.v1.Schema getItems();
  /**
   *
   *
   * <pre>
   * Optional. SCHEMA FIELDS FOR TYPE ARRAY
   * Schema of the elements of Type.ARRAY.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Schema items = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.SchemaOrBuilder getItemsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Minimum number of the elements for Type.ARRAY.
   * </pre>
   *
   * <code>int64 min_items = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The minItems.
   */
  long getMinItems();

  /**
   *
   *
   * <pre>
   * Optional. Maximum number of the elements for Type.ARRAY.
   * </pre>
   *
   * <code>int64 max_items = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxItems.
   */
  long getMaxItems();

  /**
   *
   *
   * <pre>
   * Optional. Possible values of the element of Type.STRING with enum format.
   * For example we can define an Enum Direction as :
   * {type:STRING, format:enum, enum:["EAST", NORTH", "SOUTH", "WEST"]}
   * </pre>
   *
   * <code>repeated string enum = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the enum.
   */
  java.util.List<java.lang.String> getEnumList();
  /**
   *
   *
   * <pre>
   * Optional. Possible values of the element of Type.STRING with enum format.
   * For example we can define an Enum Direction as :
   * {type:STRING, format:enum, enum:["EAST", NORTH", "SOUTH", "WEST"]}
   * </pre>
   *
   * <code>repeated string enum = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of enum.
   */
  int getEnumCount();
  /**
   *
   *
   * <pre>
   * Optional. Possible values of the element of Type.STRING with enum format.
   * For example we can define an Enum Direction as :
   * {type:STRING, format:enum, enum:["EAST", NORTH", "SOUTH", "WEST"]}
   * </pre>
   *
   * <code>repeated string enum = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The enum at the given index.
   */
  java.lang.String getEnum(int index);
  /**
   *
   *
   * <pre>
   * Optional. Possible values of the element of Type.STRING with enum format.
   * For example we can define an Enum Direction as :
   * {type:STRING, format:enum, enum:["EAST", NORTH", "SOUTH", "WEST"]}
   * </pre>
   *
   * <code>repeated string enum = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the enum at the given index.
   */
  com.google.protobuf.ByteString getEnumBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. SCHEMA FIELDS FOR TYPE OBJECT
   * Properties of Type.OBJECT.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1.Schema&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Optional. SCHEMA FIELDS FOR TYPE OBJECT
   * Properties of Type.OBJECT.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1.Schema&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1.Schema> getProperties();
  /**
   *
   *
   * <pre>
   * Optional. SCHEMA FIELDS FOR TYPE OBJECT
   * Properties of Type.OBJECT.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1.Schema&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1.Schema> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * Optional. SCHEMA FIELDS FOR TYPE OBJECT
   * Properties of Type.OBJECT.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1.Schema&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  com.google.cloud.aiplatform.v1.Schema getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.aiplatform.v1.Schema defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. SCHEMA FIELDS FOR TYPE OBJECT
   * Properties of Type.OBJECT.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1.Schema&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.Schema getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The order of the properties.
   * Not a standard field in open api spec. Only used to support the order of
   * the properties.
   * </pre>
   *
   * <code>repeated string property_ordering = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the propertyOrdering.
   */
  java.util.List<java.lang.String> getPropertyOrderingList();
  /**
   *
   *
   * <pre>
   * Optional. The order of the properties.
   * Not a standard field in open api spec. Only used to support the order of
   * the properties.
   * </pre>
   *
   * <code>repeated string property_ordering = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of propertyOrdering.
   */
  int getPropertyOrderingCount();
  /**
   *
   *
   * <pre>
   * Optional. The order of the properties.
   * Not a standard field in open api spec. Only used to support the order of
   * the properties.
   * </pre>
   *
   * <code>repeated string property_ordering = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The propertyOrdering at the given index.
   */
  java.lang.String getPropertyOrdering(int index);
  /**
   *
   *
   * <pre>
   * Optional. The order of the properties.
   * Not a standard field in open api spec. Only used to support the order of
   * the properties.
   * </pre>
   *
   * <code>repeated string property_ordering = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the propertyOrdering at the given index.
   */
  com.google.protobuf.ByteString getPropertyOrderingBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Required properties of Type.OBJECT.
   * </pre>
   *
   * <code>repeated string required = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the required.
   */
  java.util.List<java.lang.String> getRequiredList();
  /**
   *
   *
   * <pre>
   * Optional. Required properties of Type.OBJECT.
   * </pre>
   *
   * <code>repeated string required = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of required.
   */
  int getRequiredCount();
  /**
   *
   *
   * <pre>
   * Optional. Required properties of Type.OBJECT.
   * </pre>
   *
   * <code>repeated string required = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The required at the given index.
   */
  java.lang.String getRequired(int index);
  /**
   *
   *
   * <pre>
   * Optional. Required properties of Type.OBJECT.
   * </pre>
   *
   * <code>repeated string required = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the required at the given index.
   */
  com.google.protobuf.ByteString getRequiredBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Minimum number of the properties for Type.OBJECT.
   * </pre>
   *
   * <code>int64 min_properties = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The minProperties.
   */
  long getMinProperties();

  /**
   *
   *
   * <pre>
   * Optional. Maximum number of the properties for Type.OBJECT.
   * </pre>
   *
   * <code>int64 max_properties = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxProperties.
   */
  long getMaxProperties();

  /**
   *
   *
   * <pre>
   * Optional. SCHEMA FIELDS FOR TYPE INTEGER and NUMBER
   * Minimum value of the Type.INTEGER and Type.NUMBER
   * </pre>
   *
   * <code>double minimum = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The minimum.
   */
  double getMinimum();

  /**
   *
   *
   * <pre>
   * Optional. Maximum value of the Type.INTEGER and Type.NUMBER
   * </pre>
   *
   * <code>double maximum = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maximum.
   */
  double getMaximum();

  /**
   *
   *
   * <pre>
   * Optional. SCHEMA FIELDS FOR TYPE STRING
   * Minimum length of the Type.STRING
   * </pre>
   *
   * <code>int64 min_length = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The minLength.
   */
  long getMinLength();

  /**
   *
   *
   * <pre>
   * Optional. Maximum length of the Type.STRING
   * </pre>
   *
   * <code>int64 max_length = 19 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxLength.
   */
  long getMaxLength();

  /**
   *
   *
   * <pre>
   * Optional. Pattern of the Type.STRING to restrict a string to a regular
   * expression.
   * </pre>
   *
   * <code>string pattern = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pattern.
   */
  java.lang.String getPattern();
  /**
   *
   *
   * <pre>
   * Optional. Pattern of the Type.STRING to restrict a string to a regular
   * expression.
   * </pre>
   *
   * <code>string pattern = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pattern.
   */
  com.google.protobuf.ByteString getPatternBytes();

  /**
   *
   *
   * <pre>
   * Optional. Example of the object. Will only populated when the object is the
   * root.
   * </pre>
   *
   * <code>.google.protobuf.Value example = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the example field is set.
   */
  boolean hasExample();
  /**
   *
   *
   * <pre>
   * Optional. Example of the object. Will only populated when the object is the
   * root.
   * </pre>
   *
   * <code>.google.protobuf.Value example = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The example.
   */
  com.google.protobuf.Value getExample();
  /**
   *
   *
   * <pre>
   * Optional. Example of the object. Will only populated when the object is the
   * root.
   * </pre>
   *
   * <code>.google.protobuf.Value example = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ValueOrBuilder getExampleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The value should be validated against any (one or more) of the
   * subschemas in the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Schema any_of = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Schema> getAnyOfList();
  /**
   *
   *
   * <pre>
   * Optional. The value should be validated against any (one or more) of the
   * subschemas in the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Schema any_of = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.Schema getAnyOf(int index);
  /**
   *
   *
   * <pre>
   * Optional. The value should be validated against any (one or more) of the
   * subschemas in the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Schema any_of = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnyOfCount();
  /**
   *
   *
   * <pre>
   * Optional. The value should be validated against any (one or more) of the
   * subschemas in the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Schema any_of = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.SchemaOrBuilder> getAnyOfOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The value should be validated against any (one or more) of the
   * subschemas in the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Schema any_of = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.SchemaOrBuilder getAnyOfOrBuilder(int index);
}
