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
// source: google/devtools/cloudbuild/v2/repositories.proto

package com.google.cloudbuild.v2;

public interface FetchReadWriteTokenResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.FetchReadWriteTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The token content.
   * </pre>
   *
   * <code>string token = 1;</code>
   *
   * @return The token.
   */
  java.lang.String getToken();
  /**
   *
   *
   * <pre>
   * The token content.
   * </pre>
   *
   * <code>string token = 1;</code>
   *
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString getTokenBytes();

  /**
   *
   *
   * <pre>
   * Expiration timestamp. Can be empty if unknown or non-expiring.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
   *
   * @return Whether the expirationTime field is set.
   */
  boolean hasExpirationTime();
  /**
   *
   *
   * <pre>
   * Expiration timestamp. Can be empty if unknown or non-expiring.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
   *
   * @return The expirationTime.
   */
  com.google.protobuf.Timestamp getExpirationTime();
  /**
   *
   *
   * <pre>
   * Expiration timestamp. Can be empty if unknown or non-expiring.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();
}
