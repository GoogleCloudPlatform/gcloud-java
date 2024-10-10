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

public interface RBACBindingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.RBACBindingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Setting this to true will allow any ClusterRoleBinding and RoleBinding
   * with subjets system:anonymous or system:unauthenticated.
   * </pre>
   *
   * <code>optional bool enable_insecure_binding_system_unauthenticated = 1;</code>
   *
   * @return Whether the enableInsecureBindingSystemUnauthenticated field is set.
   */
  boolean hasEnableInsecureBindingSystemUnauthenticated();
  /**
   *
   *
   * <pre>
   * Setting this to true will allow any ClusterRoleBinding and RoleBinding
   * with subjets system:anonymous or system:unauthenticated.
   * </pre>
   *
   * <code>optional bool enable_insecure_binding_system_unauthenticated = 1;</code>
   *
   * @return The enableInsecureBindingSystemUnauthenticated.
   */
  boolean getEnableInsecureBindingSystemUnauthenticated();

  /**
   *
   *
   * <pre>
   * Setting this to true will allow any ClusterRoleBinding and RoleBinding
   * with subjects system:authenticated.
   * </pre>
   *
   * <code>optional bool enable_insecure_binding_system_authenticated = 2;</code>
   *
   * @return Whether the enableInsecureBindingSystemAuthenticated field is set.
   */
  boolean hasEnableInsecureBindingSystemAuthenticated();
  /**
   *
   *
   * <pre>
   * Setting this to true will allow any ClusterRoleBinding and RoleBinding
   * with subjects system:authenticated.
   * </pre>
   *
   * <code>optional bool enable_insecure_binding_system_authenticated = 2;</code>
   *
   * @return The enableInsecureBindingSystemAuthenticated.
   */
  boolean getEnableInsecureBindingSystemAuthenticated();
}
