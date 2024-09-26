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
// source: google/cloud/dialogflow/v2beta1/encryption_spec.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface EncryptionSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.EncryptionSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the encryption key specification resource.
   * Format:
   * projects/{project}/locations/{location}/encryptionSpec
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the encryption key specification resource.
   * Format:
   * projects/{project}/locations/{location}/encryptionSpec
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of customer-managed encryption key that is used to
   * secure a resource and its sub-resources. If empty, the resource is secured
   * by the default Google encryption key. Only the key in the same location as
   * this resource is allowed to be used for encryption. Format:
   * `projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{key}`
   * </pre>
   *
   * <code>string kms_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The kmsKey.
   */
  java.lang.String getKmsKey();
  /**
   *
   *
   * <pre>
   * Required. The name of customer-managed encryption key that is used to
   * secure a resource and its sub-resources. If empty, the resource is secured
   * by the default Google encryption key. Only the key in the same location as
   * this resource is allowed to be used for encryption. Format:
   * `projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{key}`
   * </pre>
   *
   * <code>string kms_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for kmsKey.
   */
  com.google.protobuf.ByteString getKmsKeyBytes();
}
