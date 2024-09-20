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
// source: google/cloud/aiplatform/v1beta1/tool.proto

package com.google.cloud.aiplatform.v1beta1;

public interface FunctionCallOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FunctionCall)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the function to call.
   * Matches [FunctionDeclaration.name].
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the function to call.
   * Matches [FunctionDeclaration.name].
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Required. The function parameters and values in JSON object
   * format. See [FunctionDeclaration.parameters] for parameter details.
   * </pre>
   *
   * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the args field is set.
   */
  boolean hasArgs();
  /**
   *
   *
   * <pre>
   * Optional. Required. The function parameters and values in JSON object
   * format. See [FunctionDeclaration.parameters] for parameter details.
   * </pre>
   *
   * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The args.
   */
  com.google.protobuf.Struct getArgs();
  /**
   *
   *
   * <pre>
   * Optional. Required. The function parameters and values in JSON object
   * format. See [FunctionDeclaration.parameters] for parameter details.
   * </pre>
   *
   * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StructOrBuilder getArgsOrBuilder();
}
