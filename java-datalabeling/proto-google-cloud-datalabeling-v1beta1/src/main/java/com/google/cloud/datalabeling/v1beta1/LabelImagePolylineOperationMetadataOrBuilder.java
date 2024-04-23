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
// source: google/cloud/datalabeling/v1beta1/operations.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datalabeling.v1beta1;

public interface LabelImagePolylineOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.LabelImagePolylineOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Basic human annotation config used in labeling request.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
   *
   * @return Whether the basicConfig field is set.
   */
  boolean hasBasicConfig();
  /**
   *
   *
   * <pre>
   * Basic human annotation config used in labeling request.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
   *
   * @return The basicConfig.
   */
  com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig getBasicConfig();
  /**
   *
   *
   * <pre>
   * Basic human annotation config used in labeling request.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder getBasicConfigOrBuilder();
}
