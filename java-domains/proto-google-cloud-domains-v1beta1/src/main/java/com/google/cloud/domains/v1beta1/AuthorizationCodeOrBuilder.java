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
// source: google/cloud/domains/v1beta1/domains.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.domains.v1beta1;

public interface AuthorizationCodeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1beta1.AuthorizationCode)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Authorization Code in ASCII. It can be used to transfer the domain
   * to or from another registrar.
   * </pre>
   *
   * <code>string code = 1;</code>
   *
   * @return The code.
   */
  java.lang.String getCode();
  /**
   *
   *
   * <pre>
   * The Authorization Code in ASCII. It can be used to transfer the domain
   * to or from another registrar.
   * </pre>
   *
   * <code>string code = 1;</code>
   *
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString getCodeBytes();
}
