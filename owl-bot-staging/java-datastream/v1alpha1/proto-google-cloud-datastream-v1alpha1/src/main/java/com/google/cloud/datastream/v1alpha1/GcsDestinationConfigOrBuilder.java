// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

public interface GcsDestinationConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.GcsDestinationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Path inside the Cloud Storage bucket to write data to.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Path inside the Cloud Storage bucket to write data to.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * File format that data should be written in.
   * Deprecated field - use file_format instead.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.GcsFileFormat gcs_file_format = 2 [deprecated = true];</code>
   * @deprecated google.cloud.datastream.v1alpha1.GcsDestinationConfig.gcs_file_format is deprecated.
   *     See google/cloud/datastream/v1alpha1/datastream_resources.proto;l=476
   * @return The enum numeric value on the wire for gcsFileFormat.
   */
  @java.lang.Deprecated int getGcsFileFormatValue();
  /**
   * <pre>
   * File format that data should be written in.
   * Deprecated field - use file_format instead.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.GcsFileFormat gcs_file_format = 2 [deprecated = true];</code>
   * @deprecated google.cloud.datastream.v1alpha1.GcsDestinationConfig.gcs_file_format is deprecated.
   *     See google/cloud/datastream/v1alpha1/datastream_resources.proto;l=476
   * @return The gcsFileFormat.
   */
  @java.lang.Deprecated com.google.cloud.datastream.v1alpha1.GcsFileFormat getGcsFileFormat();

  /**
   * <pre>
   * The maximum file size to be saved in the bucket.
   * </pre>
   *
   * <code>int32 file_rotation_mb = 3;</code>
   * @return The fileRotationMb.
   */
  int getFileRotationMb();

  /**
   * <pre>
   * The maximum duration for which new events are added before a file is
   * closed and a new file is created.
   * </pre>
   *
   * <code>.google.protobuf.Duration file_rotation_interval = 4;</code>
   * @return Whether the fileRotationInterval field is set.
   */
  boolean hasFileRotationInterval();
  /**
   * <pre>
   * The maximum duration for which new events are added before a file is
   * closed and a new file is created.
   * </pre>
   *
   * <code>.google.protobuf.Duration file_rotation_interval = 4;</code>
   * @return The fileRotationInterval.
   */
  com.google.protobuf.Duration getFileRotationInterval();
  /**
   * <pre>
   * The maximum duration for which new events are added before a file is
   * closed and a new file is created.
   * </pre>
   *
   * <code>.google.protobuf.Duration file_rotation_interval = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getFileRotationIntervalOrBuilder();

  /**
   * <pre>
   * AVRO file format configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.AvroFileFormat avro_file_format = 100;</code>
   * @return Whether the avroFileFormat field is set.
   */
  boolean hasAvroFileFormat();
  /**
   * <pre>
   * AVRO file format configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.AvroFileFormat avro_file_format = 100;</code>
   * @return The avroFileFormat.
   */
  com.google.cloud.datastream.v1alpha1.AvroFileFormat getAvroFileFormat();
  /**
   * <pre>
   * AVRO file format configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.AvroFileFormat avro_file_format = 100;</code>
   */
  com.google.cloud.datastream.v1alpha1.AvroFileFormatOrBuilder getAvroFileFormatOrBuilder();

  /**
   * <pre>
   * JSON file format configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat json_file_format = 101;</code>
   * @return Whether the jsonFileFormat field is set.
   */
  boolean hasJsonFileFormat();
  /**
   * <pre>
   * JSON file format configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat json_file_format = 101;</code>
   * @return The jsonFileFormat.
   */
  com.google.cloud.datastream.v1alpha1.JsonFileFormat getJsonFileFormat();
  /**
   * <pre>
   * JSON file format configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat json_file_format = 101;</code>
   */
  com.google.cloud.datastream.v1alpha1.JsonFileFormatOrBuilder getJsonFileFormatOrBuilder();

  public com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.FileFormatCase getFileFormatCase();
}
