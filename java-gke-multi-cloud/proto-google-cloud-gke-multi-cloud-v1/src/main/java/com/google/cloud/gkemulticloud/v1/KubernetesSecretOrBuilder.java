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
// source: google/cloud/gkemulticloud/v1/attached_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface KubernetesSecretOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.KubernetesSecret)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the kubernetes secret.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the kubernetes secret.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Namespace in which the kubernetes secret is stored.
   * </pre>
   *
   * <code>string namespace = 2;</code>
   *
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   *
   *
   * <pre>
   * Namespace in which the kubernetes secret is stored.
   * </pre>
   *
   * <code>string namespace = 2;</code>
   *
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString getNamespaceBytes();
}
