// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1alpha/schema.proto

package com.google.cloud.discoveryengine.v1alpha;

public interface SchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The structured representation of the schema.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_schema = 2;</code>
   * @return Whether the structSchema field is set.
   */
  boolean hasStructSchema();
  /**
   * <pre>
   * The structured representation of the schema.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_schema = 2;</code>
   * @return The structSchema.
   */
  com.google.protobuf.Struct getStructSchema();
  /**
   * <pre>
   * The structured representation of the schema.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_schema = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getStructSchemaOrBuilder();

  /**
   * <pre>
   * The JSON representation of the schema.
   * </pre>
   *
   * <code>string json_schema = 3;</code>
   * @return Whether the jsonSchema field is set.
   */
  boolean hasJsonSchema();
  /**
   * <pre>
   * The JSON representation of the schema.
   * </pre>
   *
   * <code>string json_schema = 3;</code>
   * @return The jsonSchema.
   */
  java.lang.String getJsonSchema();
  /**
   * <pre>
   * The JSON representation of the schema.
   * </pre>
   *
   * <code>string json_schema = 3;</code>
   * @return The bytes for jsonSchema.
   */
  com.google.protobuf.ByteString
      getJsonSchemaBytes();

  /**
   * <pre>
   * Immutable. The full resource name of the schema, in the format of
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The full resource name of the schema, in the format of
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Configurations for fields of the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.FieldConfig field_configs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1alpha.FieldConfig> 
      getFieldConfigsList();
  /**
   * <pre>
   * Output only. Configurations for fields of the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.FieldConfig field_configs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.discoveryengine.v1alpha.FieldConfig getFieldConfigs(int index);
  /**
   * <pre>
   * Output only. Configurations for fields of the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.FieldConfig field_configs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getFieldConfigsCount();
  /**
   * <pre>
   * Output only. Configurations for fields of the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.FieldConfig field_configs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1alpha.FieldConfigOrBuilder> 
      getFieldConfigsOrBuilderList();
  /**
   * <pre>
   * Output only. Configurations for fields of the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.FieldConfig field_configs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.discoveryengine.v1alpha.FieldConfigOrBuilder getFieldConfigsOrBuilder(
      int index);

  com.google.cloud.discoveryengine.v1alpha.Schema.SchemaCase getSchemaCase();
}
