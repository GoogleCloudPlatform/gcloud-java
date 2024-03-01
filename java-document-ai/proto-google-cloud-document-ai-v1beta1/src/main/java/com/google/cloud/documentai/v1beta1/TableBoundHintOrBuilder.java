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
// source: google/cloud/documentai/v1beta1/document_understanding.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.documentai.v1beta1;

public interface TableBoundHintOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta1.TableBoundHint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Page number for multi-paged inputs this hint applies to. If not
   * provided, this hint will apply to all pages by default. This value is
   * 1-based.
   * </pre>
   *
   * <code>int32 page_number = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageNumber.
   */
  int getPageNumber();

  /**
   *
   *
   * <pre>
   * Bounding box hint for a table on this page. The coordinates must be
   * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
   *
   * @return Whether the boundingBox field is set.
   */
  boolean hasBoundingBox();
  /**
   *
   *
   * <pre>
   * Bounding box hint for a table on this page. The coordinates must be
   * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
   *
   * @return The boundingBox.
   */
  com.google.cloud.documentai.v1beta1.BoundingPoly getBoundingBox();
  /**
   *
   *
   * <pre>
   * Bounding box hint for a table on this page. The coordinates must be
   * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
   */
  com.google.cloud.documentai.v1beta1.BoundingPolyOrBuilder getBoundingBoxOrBuilder();
}
