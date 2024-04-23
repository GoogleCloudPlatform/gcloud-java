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
// source: google/cloud/vision/v1p2beta1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p2beta1;

public interface FeatureOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.Feature)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The feature type.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Feature.Type type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The feature type.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Feature.Type type = 1;</code>
   *
   * @return The type.
   */
  com.google.cloud.vision.v1p2beta1.Feature.Type getType();

  /**
   *
   *
   * <pre>
   * Maximum number of results of this type. Does not apply to
   * `TEXT_DETECTION`, `DOCUMENT_TEXT_DETECTION`, or `CROP_HINTS`.
   * </pre>
   *
   * <code>int32 max_results = 2;</code>
   *
   * @return The maxResults.
   */
  int getMaxResults();

  /**
   *
   *
   * <pre>
   * Model to use for the feature.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest". `DOCUMENT_TEXT_DETECTION` and `TEXT_DETECTION` also
   * support "builtin/weekly" for the bleeding edge release updated weekly.
   * </pre>
   *
   * <code>string model = 3;</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Model to use for the feature.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest". `DOCUMENT_TEXT_DETECTION` and `TEXT_DETECTION` also
   * support "builtin/weekly" for the bleeding edge release updated weekly.
   * </pre>
   *
   * <code>string model = 3;</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();
}
