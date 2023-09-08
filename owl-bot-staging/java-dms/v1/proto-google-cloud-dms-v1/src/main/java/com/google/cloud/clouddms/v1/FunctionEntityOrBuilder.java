// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

package com.google.cloud.clouddms.v1;

public interface FunctionEntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.FunctionEntity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The SQL code which creates the function.
   * </pre>
   *
   * <code>string sql_code = 1;</code>
   * @return The sqlCode.
   */
  java.lang.String getSqlCode();
  /**
   * <pre>
   * The SQL code which creates the function.
   * </pre>
   *
   * <code>string sql_code = 1;</code>
   * @return The bytes for sqlCode.
   */
  com.google.protobuf.ByteString
      getSqlCodeBytes();

  /**
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 2;</code>
   * @return Whether the customFeatures field is set.
   */
  boolean hasCustomFeatures();
  /**
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 2;</code>
   * @return The customFeatures.
   */
  com.google.protobuf.Struct getCustomFeatures();
  /**
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getCustomFeaturesOrBuilder();
}
