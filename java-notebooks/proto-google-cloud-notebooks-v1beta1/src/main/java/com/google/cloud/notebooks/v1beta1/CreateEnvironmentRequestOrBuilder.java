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
// source: google/cloud/notebooks/v1beta1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.notebooks.v1beta1;

public interface CreateEnvironmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1beta1.CreateEnvironmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Format: `projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Format: `projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. User-defined unique ID of this environment. The `environment_id` must
   * be 1 to 63 characters long and contain only lowercase letters,
   * numeric characters, and dashes. The first character must be a lowercase
   * letter and the last character cannot be a dash.
   * </pre>
   *
   * <code>string environment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   *
   *
   * <pre>
   * Required. User-defined unique ID of this environment. The `environment_id` must
   * be 1 to 63 characters long and contain only lowercase letters,
   * numeric characters, and dashes. The first character must be a lowercase
   * letter and the last character cannot be a dash.
   * </pre>
   *
   * <code>string environment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString getEnvironmentIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The environment to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Environment environment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   *
   *
   * <pre>
   * Required. The environment to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Environment environment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The environment.
   */
  com.google.cloud.notebooks.v1beta1.Environment getEnvironment();
  /**
   *
   *
   * <pre>
   * Required. The environment to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1beta1.Environment environment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.notebooks.v1beta1.EnvironmentOrBuilder getEnvironmentOrBuilder();
}
