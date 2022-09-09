// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/environment.proto

package com.google.cloud.notebooks.v1;

public interface ContainerImageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.ContainerImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The path to the container image repository. For example:
   * `gcr.io/{project_id}/{image_name}`
   * </pre>
   *
   * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The repository.
   */
  java.lang.String getRepository();
  /**
   * <pre>
   * Required. The path to the container image repository. For example:
   * `gcr.io/{project_id}/{image_name}`
   * </pre>
   *
   * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for repository.
   */
  com.google.protobuf.ByteString
      getRepositoryBytes();

  /**
   * <pre>
   * The tag of the container image. If not specified, this defaults
   * to the latest tag.
   * </pre>
   *
   * <code>string tag = 2;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * The tag of the container image. If not specified, this defaults
   * to the latest tag.
   * </pre>
   *
   * <code>string tag = 2;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();
}
