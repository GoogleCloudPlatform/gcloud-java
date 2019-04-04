// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/detection.proto

package com.google.cloud.automl.v1beta1;

public interface ImageObjectDetectionAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ImageObjectDetectionAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only.
   * The rectangle representing the object location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
   */
  boolean hasBoundingBox();
  /**
   *
   *
   * <pre>
   * Output only.
   * The rectangle representing the object location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
   */
  com.google.cloud.automl.v1beta1.BoundingPoly getBoundingBox();
  /**
   *
   *
   * <pre>
   * Output only.
   * The rectangle representing the object location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 1;</code>
   */
  com.google.cloud.automl.v1beta1.BoundingPolyOrBuilder getBoundingBoxOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only.
   * The confidence that this annotation is positive for the parent example,
   * value in [0, 1], higher means higher positivity confidence.
   * </pre>
   *
   * <code>float score = 2;</code>
   */
  float getScore();
}
