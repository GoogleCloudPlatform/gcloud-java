// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

package com.google.cloud.clouddms.v1;

public interface IndexEntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.IndexEntity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the index.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the index.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Type of index, for example B-TREE.
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * Type of index, for example B-TREE.
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Table columns used as part of the Index, for example B-TREE index should
   * list the columns which constitutes the index.
   * </pre>
   *
   * <code>repeated string table_columns = 3;</code>
   * @return A list containing the tableColumns.
   */
  java.util.List<java.lang.String>
      getTableColumnsList();
  /**
   * <pre>
   * Table columns used as part of the Index, for example B-TREE index should
   * list the columns which constitutes the index.
   * </pre>
   *
   * <code>repeated string table_columns = 3;</code>
   * @return The count of tableColumns.
   */
  int getTableColumnsCount();
  /**
   * <pre>
   * Table columns used as part of the Index, for example B-TREE index should
   * list the columns which constitutes the index.
   * </pre>
   *
   * <code>repeated string table_columns = 3;</code>
   * @param index The index of the element to return.
   * @return The tableColumns at the given index.
   */
  java.lang.String getTableColumns(int index);
  /**
   * <pre>
   * Table columns used as part of the Index, for example B-TREE index should
   * list the columns which constitutes the index.
   * </pre>
   *
   * <code>repeated string table_columns = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tableColumns at the given index.
   */
  com.google.protobuf.ByteString
      getTableColumnsBytes(int index);

  /**
   * <pre>
   * Boolean value indicating whether the index is unique.
   * </pre>
   *
   * <code>bool unique = 4;</code>
   * @return The unique.
   */
  boolean getUnique();

  /**
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 5;</code>
   * @return Whether the customFeatures field is set.
   */
  boolean hasCustomFeatures();
  /**
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 5;</code>
   * @return The customFeatures.
   */
  com.google.protobuf.Struct getCustomFeatures();
  /**
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 5;</code>
   */
  com.google.protobuf.StructOrBuilder getCustomFeaturesOrBuilder();
}
