// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1beta1/environment.proto

package com.google.cloud.notebooks.v1beta1;

public interface VmImageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1beta1.VmImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Google Cloud project that this VM image belongs to.
   * Format: `projects/{project_id}`
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Required. The name of the Google Cloud project that this VM image belongs to.
   * Format: `projects/{project_id}`
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Use VM image name to find the image.
   * </pre>
   *
   * <code>string image_name = 2;</code>
   * @return Whether the imageName field is set.
   */
  boolean hasImageName();
  /**
   * <pre>
   * Use VM image name to find the image.
   * </pre>
   *
   * <code>string image_name = 2;</code>
   * @return The imageName.
   */
  java.lang.String getImageName();
  /**
   * <pre>
   * Use VM image name to find the image.
   * </pre>
   *
   * <code>string image_name = 2;</code>
   * @return The bytes for imageName.
   */
  com.google.protobuf.ByteString
      getImageNameBytes();

  /**
   * <pre>
   * Use this VM image family to find the image; the newest image in this
   * family will be used.
   * </pre>
   *
   * <code>string image_family = 3;</code>
   * @return Whether the imageFamily field is set.
   */
  boolean hasImageFamily();
  /**
   * <pre>
   * Use this VM image family to find the image; the newest image in this
   * family will be used.
   * </pre>
   *
   * <code>string image_family = 3;</code>
   * @return The imageFamily.
   */
  java.lang.String getImageFamily();
  /**
   * <pre>
   * Use this VM image family to find the image; the newest image in this
   * family will be used.
   * </pre>
   *
   * <code>string image_family = 3;</code>
   * @return The bytes for imageFamily.
   */
  com.google.protobuf.ByteString
      getImageFamilyBytes();

  com.google.cloud.notebooks.v1beta1.VmImage.ImageCase getImageCase();
}
