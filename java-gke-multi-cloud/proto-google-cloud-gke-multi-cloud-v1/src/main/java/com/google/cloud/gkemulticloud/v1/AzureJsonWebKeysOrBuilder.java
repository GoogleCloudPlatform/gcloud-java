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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkemulticloud.v1;

public interface AzureJsonWebKeysOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureJsonWebKeys)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.Jwk keys = 1;</code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.Jwk> getKeysList();
  /**
   *
   *
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.Jwk keys = 1;</code>
   */
  com.google.cloud.gkemulticloud.v1.Jwk getKeys(int index);
  /**
   *
   *
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.Jwk keys = 1;</code>
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
   * <code>repeated .google.cloud.gkemulticloud.v1.Jwk keys = 1;</code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.JwkOrBuilder> getKeysOrBuilderList();
  /**
   *
   *
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.Jwk keys = 1;</code>
   */
  com.google.cloud.gkemulticloud.v1.JwkOrBuilder getKeysOrBuilder(int index);
}
