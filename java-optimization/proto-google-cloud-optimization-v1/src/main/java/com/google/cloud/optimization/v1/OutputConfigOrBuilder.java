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
// source: google/cloud/optimization/v1/async_model.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.optimization.v1;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output to.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output to.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.optimization.v1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output to.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.optimization.v1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * The output data format that used to store the results in Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.DataFormat data_format = 2;</code>
   *
   * @return The enum numeric value on the wire for dataFormat.
   */
  int getDataFormatValue();
  /**
   *
   *
   * <pre>
   * The output data format that used to store the results in Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.DataFormat data_format = 2;</code>
   *
   * @return The dataFormat.
   */
  com.google.cloud.optimization.v1.DataFormat getDataFormat();

  com.google.cloud.optimization.v1.OutputConfig.DestinationCase getDestinationCase();
}
