/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1/index_endpoint.proto

package com.google.cloud.aiplatform.v1;

public interface DeployedIndexAuthConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.DeployedIndexAuthConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Defines the authentication provider that the DeployedIndex uses.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndexAuthConfig.AuthProvider auth_provider = 1;
   * </code>
   *
   * @return Whether the authProvider field is set.
   */
  boolean hasAuthProvider();
  /**
   *
   *
   * <pre>
   * Defines the authentication provider that the DeployedIndex uses.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndexAuthConfig.AuthProvider auth_provider = 1;
   * </code>
   *
   * @return The authProvider.
   */
  com.google.cloud.aiplatform.v1.DeployedIndexAuthConfig.AuthProvider getAuthProvider();
  /**
   *
   *
   * <pre>
   * Defines the authentication provider that the DeployedIndex uses.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndexAuthConfig.AuthProvider auth_provider = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.DeployedIndexAuthConfig.AuthProviderOrBuilder
      getAuthProviderOrBuilder();
}
