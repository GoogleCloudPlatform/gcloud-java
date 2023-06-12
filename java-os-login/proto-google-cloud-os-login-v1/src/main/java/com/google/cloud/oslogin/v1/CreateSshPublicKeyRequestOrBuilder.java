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
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

public interface CreateSshPublicKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oslogin.v1.CreateSshPublicKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique ID for the user in format `users/{user}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The unique ID for the user in format `users/{user}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the sshPublicKey field is set.
   */
  boolean hasSshPublicKey();
  /**
   *
   *
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sshPublicKey.
   */
  com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey();
  /**
   *
   *
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder getSshPublicKeyOrBuilder();
}
