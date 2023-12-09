// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/io.proto

package com.google.cloud.aiplatform.v1beta1;

public interface GcsDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.GcsDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Google Cloud Storage URI to output directory. If the uri doesn't
   * end with
   * '/', a '/' will be automatically appended. The directory is created if it
   * doesn't exist.
   * </pre>
   *
   * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputUriPrefix.
   */
  java.lang.String getOutputUriPrefix();
  /**
   * <pre>
   * Required. Google Cloud Storage URI to output directory. If the uri doesn't
   * end with
   * '/', a '/' will be automatically appended. The directory is created if it
   * doesn't exist.
   * </pre>
   *
   * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for outputUriPrefix.
   */
  com.google.protobuf.ByteString
      getOutputUriPrefixBytes();
}
