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
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

public interface GenerateExclusivityManifestRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Membership resource name in the format
   * `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
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
   * Required. The Membership resource name in the format
   * `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
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
   * Optional. The YAML manifest of the membership CRD retrieved by
   * `kubectl get customresourcedefinitions membership`.
   * Leave empty if the resource does not exist.
   * </pre>
   *
   * <code>string crd_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The crdManifest.
   */
  java.lang.String getCrdManifest();
  /**
   *
   *
   * <pre>
   * Optional. The YAML manifest of the membership CRD retrieved by
   * `kubectl get customresourcedefinitions membership`.
   * Leave empty if the resource does not exist.
   * </pre>
   *
   * <code>string crd_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for crdManifest.
   */
  com.google.protobuf.ByteString getCrdManifestBytes();

  /**
   *
   *
   * <pre>
   * Optional. The YAML manifest of the membership CR retrieved by
   * `kubectl get memberships membership`.
   * Leave empty if the resource does not exist.
   * </pre>
   *
   * <code>string cr_manifest = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The crManifest.
   */
  java.lang.String getCrManifest();
  /**
   *
   *
   * <pre>
   * Optional. The YAML manifest of the membership CR retrieved by
   * `kubectl get memberships membership`.
   * Leave empty if the resource does not exist.
   * </pre>
   *
   * <code>string cr_manifest = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for crManifest.
   */
  com.google.protobuf.ByteString getCrManifestBytes();
}
