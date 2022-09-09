// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface OracleSourceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.OracleSourceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   * @return Whether the includeObjects field is set.
   */
  boolean hasIncludeObjects();
  /**
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   * @return The includeObjects.
   */
  com.google.cloud.datastream.v1.OracleRdbms getIncludeObjects();
  /**
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   */
  com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getIncludeObjectsOrBuilder();

  /**
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   * @return Whether the excludeObjects field is set.
   */
  boolean hasExcludeObjects();
  /**
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   * @return The excludeObjects.
   */
  com.google.cloud.datastream.v1.OracleRdbms getExcludeObjects();
  /**
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   */
  com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getExcludeObjectsOrBuilder();

  /**
   * <pre>
   * Maximum number of concurrent CDC tasks. The number should be non negative.
   * If not set (or set to 0), the system's default value will be used.
   * </pre>
   *
   * <code>int32 max_concurrent_cdc_tasks = 3;</code>
   * @return The maxConcurrentCdcTasks.
   */
  int getMaxConcurrentCdcTasks();

  /**
   * <pre>
   * Drop large object values.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleSourceConfig.DropLargeObjects drop_large_objects = 100;</code>
   * @return Whether the dropLargeObjects field is set.
   */
  boolean hasDropLargeObjects();
  /**
   * <pre>
   * Drop large object values.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleSourceConfig.DropLargeObjects drop_large_objects = 100;</code>
   * @return The dropLargeObjects.
   */
  com.google.cloud.datastream.v1.OracleSourceConfig.DropLargeObjects getDropLargeObjects();
  /**
   * <pre>
   * Drop large object values.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleSourceConfig.DropLargeObjects drop_large_objects = 100;</code>
   */
  com.google.cloud.datastream.v1.OracleSourceConfig.DropLargeObjectsOrBuilder getDropLargeObjectsOrBuilder();

  /**
   * <pre>
   * Stream large object values.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleSourceConfig.StreamLargeObjects stream_large_objects = 102;</code>
   * @return Whether the streamLargeObjects field is set.
   */
  boolean hasStreamLargeObjects();
  /**
   * <pre>
   * Stream large object values.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleSourceConfig.StreamLargeObjects stream_large_objects = 102;</code>
   * @return The streamLargeObjects.
   */
  com.google.cloud.datastream.v1.OracleSourceConfig.StreamLargeObjects getStreamLargeObjects();
  /**
   * <pre>
   * Stream large object values.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleSourceConfig.StreamLargeObjects stream_large_objects = 102;</code>
   */
  com.google.cloud.datastream.v1.OracleSourceConfig.StreamLargeObjectsOrBuilder getStreamLargeObjectsOrBuilder();

  public com.google.cloud.datastream.v1.OracleSourceConfig.LargeObjectsHandlingCase getLargeObjectsHandlingCase();
}
