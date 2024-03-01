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
// source: google/cloud/functions/v2beta/functions.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.functions.v2beta;

public interface LocationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2beta.LocationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
   *
   * @return A list containing the environments.
   */
  java.util.List<com.google.cloud.functions.v2beta.Environment> getEnvironmentsList();
  /**
   *
   *
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
   *
   * @return The count of environments.
   */
  int getEnvironmentsCount();
  /**
   *
   *
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The environments at the given index.
   */
  com.google.cloud.functions.v2beta.Environment getEnvironments(int index);
  /**
   *
   *
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
   *
   * @return A list containing the enum numeric values on the wire for environments.
   */
  java.util.List<java.lang.Integer> getEnvironmentsValueList();
  /**
   *
   *
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of environments at the given index.
   */
  int getEnvironmentsValue(int index);
}
