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
// source: google/cloud/automl/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.automl.v1;

public interface ImportDataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.ImportDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Dataset name. Dataset must already exist. All imported
   * annotations and examples will be added.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Dataset name. Dataset must already exist. All imported
   * annotations and examples will be added.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The desired input location and its domain specific semantics,
   * if any.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * Required. The desired input location and its domain specific semantics,
   * if any.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.automl.v1.InputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * Required. The desired input location and its domain specific semantics,
   * if any.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.automl.v1.InputConfigOrBuilder getInputConfigOrBuilder();
}
