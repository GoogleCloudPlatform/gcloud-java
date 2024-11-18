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
// source: google/cloud/gkehub/policycontroller/v1beta/policycontroller.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkehub.policycontroller.v1beta;

public interface OnClusterStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.policycontroller.v1beta.OnClusterState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The lifecycle state of this component.
   * </pre>
   *
   * <code>.google.cloud.gkehub.policycontroller.v1beta.MembershipState.LifecycleState state = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The lifecycle state of this component.
   * </pre>
   *
   * <code>.google.cloud.gkehub.policycontroller.v1beta.MembershipState.LifecycleState state = 1;
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkehub.policycontroller.v1beta.MembershipState.LifecycleState getState();

  /**
   *
   *
   * <pre>
   * Surface potential errors or information logs.
   * </pre>
   *
   * <code>string details = 2;</code>
   *
   * @return The details.
   */
  java.lang.String getDetails();
  /**
   *
   *
   * <pre>
   * Surface potential errors or information logs.
   * </pre>
   *
   * <code>string details = 2;</code>
   *
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString getDetailsBytes();
}
