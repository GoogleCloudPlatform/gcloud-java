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

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface ExecutableCodeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ExecutableCode)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Programming language of the `code`.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExecutableCode.Language language = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for language.
   */
  int getLanguageValue();
  /**
   *
   *
   * <pre>
   * Required. Programming language of the `code`.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExecutableCode.Language language = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The language.
   */
  com.google.cloud.aiplatform.v1beta1.ExecutableCode.Language getLanguage();

  /**
   *
   *
   * <pre>
   * Required. The code to be executed.
   * </pre>
   *
   * <code>string code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The code.
   */
  java.lang.String getCode();
  /**
   *
   *
   * <pre>
   * Required. The code to be executed.
   * </pre>
   *
   * <code>string code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString getCodeBytes();
}
