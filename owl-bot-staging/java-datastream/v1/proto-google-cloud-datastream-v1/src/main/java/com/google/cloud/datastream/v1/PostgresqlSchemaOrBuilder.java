// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface PostgresqlSchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.PostgresqlSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Schema name.
   * </pre>
   *
   * <code>string schema = 1;</code>
   * @return The schema.
   */
  java.lang.String getSchema();
  /**
   * <pre>
   * Schema name.
   * </pre>
   *
   * <code>string schema = 1;</code>
   * @return The bytes for schema.
   */
  com.google.protobuf.ByteString
      getSchemaBytes();

  /**
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;</code>
   */
  java.util.List<com.google.cloud.datastream.v1.PostgresqlTable> 
      getPostgresqlTablesList();
  /**
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;</code>
   */
  com.google.cloud.datastream.v1.PostgresqlTable getPostgresqlTables(int index);
  /**
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;</code>
   */
  int getPostgresqlTablesCount();
  /**
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1.PostgresqlTableOrBuilder> 
      getPostgresqlTablesOrBuilderList();
  /**
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;</code>
   */
  com.google.cloud.datastream.v1.PostgresqlTableOrBuilder getPostgresqlTablesOrBuilder(
      int index);
}
