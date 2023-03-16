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
// source: google/cloud/gkemulticloud/v1/attached_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface GenerateAttachedClusterInstallManifestResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.GenerateAttachedClusterInstallManifestResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A set of Kubernetes resources (in YAML format) to be applied
   * to the cluster to be attached.
   * </pre>
   *
   * <code>string manifest = 1;</code>
   *
   * @return The manifest.
   */
  java.lang.String getManifest();
  /**
   *
   *
   * <pre>
   * A set of Kubernetes resources (in YAML format) to be applied
   * to the cluster to be attached.
   * </pre>
   *
   * <code>string manifest = 1;</code>
   *
   * @return The bytes for manifest.
   */
  com.google.protobuf.ByteString getManifestBytes();
}
