// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

public interface OracleRdbmsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.OracleRdbms)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Oracle schemas/databases in the database server.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleSchema oracle_schemas = 1;</code>
   */
  java.util.List<com.google.cloud.datastream.v1alpha1.OracleSchema> 
      getOracleSchemasList();
  /**
   * <pre>
   * Oracle schemas/databases in the database server.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleSchema oracle_schemas = 1;</code>
   */
  com.google.cloud.datastream.v1alpha1.OracleSchema getOracleSchemas(int index);
  /**
   * <pre>
   * Oracle schemas/databases in the database server.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleSchema oracle_schemas = 1;</code>
   */
  int getOracleSchemasCount();
  /**
   * <pre>
   * Oracle schemas/databases in the database server.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleSchema oracle_schemas = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1alpha1.OracleSchemaOrBuilder> 
      getOracleSchemasOrBuilderList();
  /**
   * <pre>
   * Oracle schemas/databases in the database server.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleSchema oracle_schemas = 1;</code>
   */
  com.google.cloud.datastream.v1alpha1.OracleSchemaOrBuilder getOracleSchemasOrBuilder(
      int index);
}
