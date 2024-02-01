// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/io.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface GcsSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.GcsSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
   * wildcards. For more information on wildcards, see
   * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the uris.
   */
  java.util.List<java.lang.String>
      getUrisList();
  /**
   * <pre>
   * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
   * wildcards. For more information on wildcards, see
   * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of uris.
   */
  int getUrisCount();
  /**
   * <pre>
   * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
   * wildcards. For more information on wildcards, see
   * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The uris at the given index.
   */
  java.lang.String getUris(int index);
  /**
   * <pre>
   * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
   * wildcards. For more information on wildcards, see
   * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the uris at the given index.
   */
  com.google.protobuf.ByteString
      getUrisBytes(int index);
}
