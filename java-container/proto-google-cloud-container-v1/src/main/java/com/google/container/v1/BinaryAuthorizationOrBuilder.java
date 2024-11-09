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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1;

public interface BinaryAuthorizationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.BinaryAuthorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This field is deprecated. Leave this unset and instead configure
   * BinaryAuthorization using evaluation_mode. If evaluation_mode is set to
   * anything other than EVALUATION_MODE_UNSPECIFIED, this field is ignored.
   * </pre>
   *
   * <code>bool enabled = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.BinaryAuthorization.enabled is deprecated. See
   *     google/container/v1/cluster_service.proto;l=1649
   * @return The enabled.
   */
  @java.lang.Deprecated
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Mode of operation for binauthz policy evaluation. If unspecified, defaults
   * to DISABLED.
   * </pre>
   *
   * <code>.google.container.v1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
   *
   * @return The enum numeric value on the wire for evaluationMode.
   */
  int getEvaluationModeValue();
  /**
   *
   *
   * <pre>
   * Mode of operation for binauthz policy evaluation. If unspecified, defaults
   * to DISABLED.
   * </pre>
   *
   * <code>.google.container.v1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
   *
   * @return The evaluationMode.
   */
  com.google.container.v1.BinaryAuthorization.EvaluationMode getEvaluationMode();
}
