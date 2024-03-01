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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.2
package com.google.privacy.dlp.v2;

public interface DeidentifyDataSourceStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DeidentifyDataSourceStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Total size in bytes that were transformed in some way.
   * </pre>
   *
   * <code>int64 transformed_bytes = 1;</code>
   *
   * @return The transformedBytes.
   */
  long getTransformedBytes();

  /**
   *
   *
   * <pre>
   * Number of successfully applied transformations.
   * </pre>
   *
   * <code>int64 transformation_count = 2;</code>
   *
   * @return The transformationCount.
   */
  long getTransformationCount();

  /**
   *
   *
   * <pre>
   * Number of errors encountered while trying to apply transformations.
   * </pre>
   *
   * <code>int64 transformation_error_count = 3;</code>
   *
   * @return The transformationErrorCount.
   */
  long getTransformationErrorCount();
}
