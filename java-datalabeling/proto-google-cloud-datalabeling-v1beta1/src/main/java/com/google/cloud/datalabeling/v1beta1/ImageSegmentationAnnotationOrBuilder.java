/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datalabeling.v1beta1;

public interface ImageSegmentationAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The mapping between rgb color and annotation spec. The key is the rgb
   * color represented in format of rgb(0, 0, 0). The value is the
   * AnnotationSpec.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
   * </code>
   */
  int getAnnotationColorsCount();
  /**
   *
   *
   * <pre>
   * The mapping between rgb color and annotation spec. The key is the rgb
   * color represented in format of rgb(0, 0, 0). The value is the
   * AnnotationSpec.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
   * </code>
   */
  boolean containsAnnotationColors(java.lang.String key);
  /** Use {@link #getAnnotationColorsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
      getAnnotationColors();
  /**
   *
   *
   * <pre>
   * The mapping between rgb color and annotation spec. The key is the rgb
   * color represented in format of rgb(0, 0, 0). The value is the
   * AnnotationSpec.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
      getAnnotationColorsMap();
  /**
   *
   *
   * <pre>
   * The mapping between rgb color and annotation spec. The key is the rgb
   * color represented in format of rgb(0, 0, 0). The value is the
   * AnnotationSpec.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
   * </code>
   */
  /* nullable */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationColorsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.datalabeling.v1beta1.AnnotationSpec defaultValue);
  /**
   *
   *
   * <pre>
   * The mapping between rgb color and annotation spec. The key is the rgb
   * color represented in format of rgb(0, 0, 0). The value is the
   * AnnotationSpec.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationColorsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Image format.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Image format.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * A byte string of a full image's color map.
   * </pre>
   *
   * <code>bytes image_bytes = 3;</code>
   *
   * @return The imageBytes.
   */
  com.google.protobuf.ByteString getImageBytes();
}
