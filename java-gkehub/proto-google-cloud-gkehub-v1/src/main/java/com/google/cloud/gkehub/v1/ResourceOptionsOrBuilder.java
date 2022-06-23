/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/gkehub/v1/membership.proto

package com.google.cloud.gkehub.v1;

public interface ResourceOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1.ResourceOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The Connect agent version to use for connect_resources. Defaults to the
   * latest GKE Connect version. The version must be a currently supported
   * version, obsolete versions will be rejected.
   * </pre>
   *
   * <code>string connect_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The connectVersion.
   */
  java.lang.String getConnectVersion();
  /**
   *
   *
   * <pre>
   * Optional. The Connect agent version to use for connect_resources. Defaults to the
   * latest GKE Connect version. The version must be a currently supported
   * version, obsolete versions will be rejected.
   * </pre>
   *
   * <code>string connect_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for connectVersion.
   */
  com.google.protobuf.ByteString getConnectVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for
   * CustomResourceDefinition resources.
   * This option should be set for clusters with Kubernetes apiserver versions
   * &lt;1.16.
   * </pre>
   *
   * <code>bool v1beta1_crd = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The v1beta1Crd.
   */
  boolean getV1Beta1Crd();

  /**
   *
   *
   * <pre>
   * Optional. Major version of the Kubernetes cluster. This is only used to determine
   * which version to use for the CustomResourceDefinition resources,
   * `apiextensions/v1beta1` or`apiextensions/v1`.
   * </pre>
   *
   * <code>string k8s_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The k8sVersion.
   */
  java.lang.String getK8SVersion();
  /**
   *
   *
   * <pre>
   * Optional. Major version of the Kubernetes cluster. This is only used to determine
   * which version to use for the CustomResourceDefinition resources,
   * `apiextensions/v1beta1` or`apiextensions/v1`.
   * </pre>
   *
   * <code>string k8s_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for k8sVersion.
   */
  com.google.protobuf.ByteString getK8SVersionBytes();
}
