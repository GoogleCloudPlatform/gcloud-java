// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface WaitRegionOperationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.WaitRegionOperationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the Operations resource to return.
   * </pre>
   *
   * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   * <pre>
   * Name of the Operations resource to return.
   * </pre>
   *
   * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString
      getOperationBytes();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();
}
