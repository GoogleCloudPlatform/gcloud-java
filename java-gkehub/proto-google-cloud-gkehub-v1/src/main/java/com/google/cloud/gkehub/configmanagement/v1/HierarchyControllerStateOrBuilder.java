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
// source: google/cloud/gkehub/v1/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.configmanagement.v1;

public interface HierarchyControllerStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1.HierarchyControllerState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The version for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * The version for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
   *
   * @return The version.
   */
  com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion getVersion();
  /**
   *
   *
   * <pre>
   * The version for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersionOrBuilder
      getVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * The deployment state for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;
   * </code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * The deployment state for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState getState();
  /**
   *
   *
   * <pre>
   * The deployment state for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;
   * </code>
   */
  com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentStateOrBuilder
      getStateOrBuilder();
}
