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
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.configmanagement.v1alpha;

public interface GroupVersionKindOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Kubernetes Group
   * </pre>
   *
   * <code>string group = 1;</code>
   *
   * @return The group.
   */
  java.lang.String getGroup();
  /**
   *
   *
   * <pre>
   * Kubernetes Group
   * </pre>
   *
   * <code>string group = 1;</code>
   *
   * @return The bytes for group.
   */
  com.google.protobuf.ByteString getGroupBytes();

  /**
   *
   *
   * <pre>
   * Kubernetes Version
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Kubernetes Version
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Kubernetes Kind
   * </pre>
   *
   * <code>string kind = 3;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * Kubernetes Kind
   * </pre>
   *
   * <code>string kind = 3;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();
}
