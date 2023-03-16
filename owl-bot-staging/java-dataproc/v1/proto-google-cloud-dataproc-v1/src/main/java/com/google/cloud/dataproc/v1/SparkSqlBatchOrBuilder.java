// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/batches.proto

package com.google.cloud.dataproc.v1;

public interface SparkSqlBatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.SparkSqlBatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The HCFS URI of the script that contains Spark SQL queries to
   * execute.
   * </pre>
   *
   * <code>string query_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The queryFileUri.
   */
  java.lang.String getQueryFileUri();
  /**
   * <pre>
   * Required. The HCFS URI of the script that contains Spark SQL queries to
   * execute.
   * </pre>
   *
   * <code>string query_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for queryFileUri.
   */
  com.google.protobuf.ByteString
      getQueryFileUriBytes();

  /**
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Spark SQL command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getQueryVariablesCount();
  /**
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Spark SQL command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsQueryVariables(
      java.lang.String key);
  /**
   * Use {@link #getQueryVariablesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getQueryVariables();
  /**
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Spark SQL command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getQueryVariablesMap();
  /**
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Spark SQL command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getQueryVariablesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Spark SQL command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getQueryVariablesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the jarFileUris.
   */
  java.util.List<java.lang.String>
      getJarFileUrisList();
  /**
   * <pre>
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of jarFileUris.
   */
  int getJarFileUrisCount();
  /**
   * <pre>
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The jarFileUris at the given index.
   */
  java.lang.String getJarFileUris(int index);
  /**
   * <pre>
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the jarFileUris at the given index.
   */
  com.google.protobuf.ByteString
      getJarFileUrisBytes(int index);
}
