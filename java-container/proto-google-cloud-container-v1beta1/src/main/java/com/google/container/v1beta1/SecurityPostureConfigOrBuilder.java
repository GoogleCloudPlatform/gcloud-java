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

public interface SecurityPostureConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.SecurityPostureConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Sets which mode to use for Security Posture features.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.SecurityPostureConfig.Mode mode = 1;</code>
   *
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   *
   *
   * <pre>
   * Sets which mode to use for Security Posture features.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.SecurityPostureConfig.Mode mode = 1;</code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   *
   *
   * <pre>
   * Sets which mode to use for Security Posture features.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.SecurityPostureConfig.Mode mode = 1;</code>
   *
   * @return The mode.
   */
  com.google.container.v1beta1.SecurityPostureConfig.Mode getMode();

  /**
   *
   *
   * <pre>
   * Sets which mode to use for vulnerability scanning.
   * </pre>
   *
   * <code>
   * optional .google.container.v1beta1.SecurityPostureConfig.VulnerabilityMode vulnerability_mode = 2;
   * </code>
   *
   * @return Whether the vulnerabilityMode field is set.
   */
  boolean hasVulnerabilityMode();
  /**
   *
   *
   * <pre>
   * Sets which mode to use for vulnerability scanning.
   * </pre>
   *
   * <code>
   * optional .google.container.v1beta1.SecurityPostureConfig.VulnerabilityMode vulnerability_mode = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for vulnerabilityMode.
   */
  int getVulnerabilityModeValue();
  /**
   *
   *
   * <pre>
   * Sets which mode to use for vulnerability scanning.
   * </pre>
   *
   * <code>
   * optional .google.container.v1beta1.SecurityPostureConfig.VulnerabilityMode vulnerability_mode = 2;
   * </code>
   *
   * @return The vulnerabilityMode.
   */
  com.google.container.v1beta1.SecurityPostureConfig.VulnerabilityMode getVulnerabilityMode();
}
