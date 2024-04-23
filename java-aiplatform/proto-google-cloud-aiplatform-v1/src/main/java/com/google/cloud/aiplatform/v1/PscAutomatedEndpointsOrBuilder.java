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
// source: google/cloud/aiplatform/v1/service_networking.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface PscAutomatedEndpointsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.PscAutomatedEndpoints)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Corresponding project_id in pscAutomationConfigs
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Corresponding project_id in pscAutomationConfigs
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Corresponding network in pscAutomationConfigs.
   * </pre>
   *
   * <code>string network = 2;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Corresponding network in pscAutomationConfigs.
   * </pre>
   *
   * <code>string network = 2;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Ip Address created by the automated forwarding rule.
   * </pre>
   *
   * <code>string match_address = 3;</code>
   *
   * @return The matchAddress.
   */
  java.lang.String getMatchAddress();
  /**
   *
   *
   * <pre>
   * Ip Address created by the automated forwarding rule.
   * </pre>
   *
   * <code>string match_address = 3;</code>
   *
   * @return The bytes for matchAddress.
   */
  com.google.protobuf.ByteString getMatchAddressBytes();
}
