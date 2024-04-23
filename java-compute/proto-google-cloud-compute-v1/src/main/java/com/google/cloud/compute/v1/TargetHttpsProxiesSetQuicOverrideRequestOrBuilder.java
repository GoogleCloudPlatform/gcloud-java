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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface TargetHttpsProxiesSetQuicOverrideRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * QUIC policy for the TargetHttpsProxy resource.
   * Check the QuicOverride enum for the list of possible values.
   * </pre>
   *
   * <code>optional string quic_override = 456577197;</code>
   *
   * @return Whether the quicOverride field is set.
   */
  boolean hasQuicOverride();
  /**
   *
   *
   * <pre>
   * QUIC policy for the TargetHttpsProxy resource.
   * Check the QuicOverride enum for the list of possible values.
   * </pre>
   *
   * <code>optional string quic_override = 456577197;</code>
   *
   * @return The quicOverride.
   */
  java.lang.String getQuicOverride();
  /**
   *
   *
   * <pre>
   * QUIC policy for the TargetHttpsProxy resource.
   * Check the QuicOverride enum for the list of possible values.
   * </pre>
   *
   * <code>optional string quic_override = 456577197;</code>
   *
   * @return The bytes for quicOverride.
   */
  com.google.protobuf.ByteString getQuicOverrideBytes();
}
