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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1beta1;

public interface GetJSONWebKeysResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.GetJSONWebKeysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Jwk keys = 1;</code>
   */
  java.util.List<com.google.container.v1beta1.Jwk> getKeysList();
  /**
   *
   *
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Jwk keys = 1;</code>
   */
  com.google.container.v1beta1.Jwk getKeys(int index);
  /**
   *
   *
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Jwk keys = 1;</code>
   */
  int getKeysCount();
  /**
   *
   *
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Jwk keys = 1;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.JwkOrBuilder> getKeysOrBuilderList();
  /**
   *
   *
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Jwk keys = 1;</code>
   */
  com.google.container.v1beta1.JwkOrBuilder getKeysOrBuilder(int index);
}
