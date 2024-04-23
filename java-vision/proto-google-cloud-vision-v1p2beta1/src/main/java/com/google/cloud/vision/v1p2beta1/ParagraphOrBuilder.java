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
// source: google/cloud/vision/v1p2beta1/text_annotation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p2beta1;

public interface ParagraphOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.Paragraph)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Additional information detected for the paragraph.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.TextAnnotation.TextProperty property = 1;</code>
   *
   * @return Whether the property field is set.
   */
  boolean hasProperty();
  /**
   *
   *
   * <pre>
   * Additional information detected for the paragraph.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.TextAnnotation.TextProperty property = 1;</code>
   *
   * @return The property.
   */
  com.google.cloud.vision.v1p2beta1.TextAnnotation.TextProperty getProperty();
  /**
   *
   *
   * <pre>
   * Additional information detected for the paragraph.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.TextAnnotation.TextProperty property = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.TextAnnotation.TextPropertyOrBuilder getPropertyOrBuilder();

  /**
   *
   *
   * <pre>
   * The bounding box for the paragraph.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly bounding_box = 2;</code>
   *
   * @return Whether the boundingBox field is set.
   */
  boolean hasBoundingBox();
  /**
   *
   *
   * <pre>
   * The bounding box for the paragraph.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly bounding_box = 2;</code>
   *
   * @return The boundingBox.
   */
  com.google.cloud.vision.v1p2beta1.BoundingPoly getBoundingBox();
  /**
   *
   *
   * <pre>
   * The bounding box for the paragraph.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly bounding_box = 2;</code>
   */
  com.google.cloud.vision.v1p2beta1.BoundingPolyOrBuilder getBoundingBoxOrBuilder();

  /**
   *
   *
   * <pre>
   * List of words in this paragraph.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.Word words = 3;</code>
   */
  java.util.List<com.google.cloud.vision.v1p2beta1.Word> getWordsList();
  /**
   *
   *
   * <pre>
   * List of words in this paragraph.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.Word words = 3;</code>
   */
  com.google.cloud.vision.v1p2beta1.Word getWords(int index);
  /**
   *
   *
   * <pre>
   * List of words in this paragraph.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.Word words = 3;</code>
   */
  int getWordsCount();
  /**
   *
   *
   * <pre>
   * List of words in this paragraph.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.Word words = 3;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p2beta1.WordOrBuilder> getWordsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of words in this paragraph.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.Word words = 3;</code>
   */
  com.google.cloud.vision.v1p2beta1.WordOrBuilder getWordsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Confidence of the OCR results for the paragraph. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 4;</code>
   *
   * @return The confidence.
   */
  float getConfidence();
}
