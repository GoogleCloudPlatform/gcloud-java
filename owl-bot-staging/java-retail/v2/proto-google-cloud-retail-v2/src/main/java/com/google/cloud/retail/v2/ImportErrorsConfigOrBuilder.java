// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/import_config.proto

package com.google.cloud.retail.v2;

public interface ImportErrorsConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.ImportErrorsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Google Cloud Storage prefix for import errors. This must be an empty,
   * existing Cloud Storage directory. Import errors are written to
   * sharded files in this directory, one per line, as a JSON-encoded
   * `google.rpc.Status` message.
   * </pre>
   *
   * <code>string gcs_prefix = 1;</code>
   * @return Whether the gcsPrefix field is set.
   */
  boolean hasGcsPrefix();
  /**
   * <pre>
   * Google Cloud Storage prefix for import errors. This must be an empty,
   * existing Cloud Storage directory. Import errors are written to
   * sharded files in this directory, one per line, as a JSON-encoded
   * `google.rpc.Status` message.
   * </pre>
   *
   * <code>string gcs_prefix = 1;</code>
   * @return The gcsPrefix.
   */
  java.lang.String getGcsPrefix();
  /**
   * <pre>
   * Google Cloud Storage prefix for import errors. This must be an empty,
   * existing Cloud Storage directory. Import errors are written to
   * sharded files in this directory, one per line, as a JSON-encoded
   * `google.rpc.Status` message.
   * </pre>
   *
   * <code>string gcs_prefix = 1;</code>
   * @return The bytes for gcsPrefix.
   */
  com.google.protobuf.ByteString
      getGcsPrefixBytes();

  com.google.cloud.retail.v2.ImportErrorsConfig.DestinationCase getDestinationCase();
}
