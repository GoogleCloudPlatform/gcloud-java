// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p1beta1/image_annotator.proto

package com.google.cloud.vision.v1p1beta1;

public interface FeatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p1beta1.Feature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The feature type.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.Feature.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The feature type.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.Feature.Type type = 1;</code>
   * @return The type.
   */
  com.google.cloud.vision.v1p1beta1.Feature.Type getType();

  /**
   * <pre>
   * Maximum number of results of this type.
   * </pre>
   *
   * <code>int32 max_results = 2;</code>
   * @return The maxResults.
   */
  int getMaxResults();

  /**
   * <pre>
   * Model to use for the feature.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 3;</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Model to use for the feature.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 3;</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();
}
