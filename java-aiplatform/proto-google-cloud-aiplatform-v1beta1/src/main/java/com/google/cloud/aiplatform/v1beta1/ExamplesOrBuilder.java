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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ExamplesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Examples)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Cloud Storage input instances.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Examples.ExampleGcsSource example_gcs_source = 5;</code>
   *
   * @return Whether the exampleGcsSource field is set.
   */
  boolean hasExampleGcsSource();
  /**
   *
   *
   * <pre>
   * The Cloud Storage input instances.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Examples.ExampleGcsSource example_gcs_source = 5;</code>
   *
   * @return The exampleGcsSource.
   */
  com.google.cloud.aiplatform.v1beta1.Examples.ExampleGcsSource getExampleGcsSource();
  /**
   *
   *
   * <pre>
   * The Cloud Storage input instances.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Examples.ExampleGcsSource example_gcs_source = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.Examples.ExampleGcsSourceOrBuilder
      getExampleGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The full configuration for the generated index, the semantics are the
   * same as [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and
   * should match
   * [NearestNeighborSearchConfig](https://cloud.google.com/vertex-ai/docs/explainable-ai/configuring-explanations-example-based#nearest-neighbor-search-config).
   * </pre>
   *
   * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
   *
   * @return Whether the nearestNeighborSearchConfig field is set.
   */
  boolean hasNearestNeighborSearchConfig();
  /**
   *
   *
   * <pre>
   * The full configuration for the generated index, the semantics are the
   * same as [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and
   * should match
   * [NearestNeighborSearchConfig](https://cloud.google.com/vertex-ai/docs/explainable-ai/configuring-explanations-example-based#nearest-neighbor-search-config).
   * </pre>
   *
   * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
   *
   * @return The nearestNeighborSearchConfig.
   */
  com.google.protobuf.Value getNearestNeighborSearchConfig();
  /**
   *
   *
   * <pre>
   * The full configuration for the generated index, the semantics are the
   * same as [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and
   * should match
   * [NearestNeighborSearchConfig](https://cloud.google.com/vertex-ai/docs/explainable-ai/configuring-explanations-example-based#nearest-neighbor-search-config).
   * </pre>
   *
   * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
   */
  com.google.protobuf.ValueOrBuilder getNearestNeighborSearchConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Simplified preset configuration, which automatically sets configuration
   * values based on the desired query speed-precision trade-off and modality.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Presets presets = 4;</code>
   *
   * @return Whether the presets field is set.
   */
  boolean hasPresets();
  /**
   *
   *
   * <pre>
   * Simplified preset configuration, which automatically sets configuration
   * values based on the desired query speed-precision trade-off and modality.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Presets presets = 4;</code>
   *
   * @return The presets.
   */
  com.google.cloud.aiplatform.v1beta1.Presets getPresets();
  /**
   *
   *
   * <pre>
   * Simplified preset configuration, which automatically sets configuration
   * values based on the desired query speed-precision trade-off and modality.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Presets presets = 4;</code>
   */
  com.google.cloud.aiplatform.v1beta1.PresetsOrBuilder getPresetsOrBuilder();

  /**
   *
   *
   * <pre>
   * The Cloud Storage locations that contain the instances to be
   * indexed for approximate nearest neighbor search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * The Cloud Storage locations that contain the instances to be
   * indexed for approximate nearest neighbor search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.aiplatform.v1beta1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * The Cloud Storage locations that contain the instances to be
   * indexed for approximate nearest neighbor search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The number of neighbors to return when querying for examples.
   * </pre>
   *
   * <code>int32 neighbor_count = 3;</code>
   *
   * @return The neighborCount.
   */
  int getNeighborCount();

  com.google.cloud.aiplatform.v1beta1.Examples.SourceCase getSourceCase();

  com.google.cloud.aiplatform.v1beta1.Examples.ConfigCase getConfigCase();
}
