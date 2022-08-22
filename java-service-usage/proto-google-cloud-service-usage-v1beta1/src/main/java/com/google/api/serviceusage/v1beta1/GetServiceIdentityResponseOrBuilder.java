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
// source: google/api/serviceusage/v1beta1/serviceusage.proto

package com.google.api.serviceusage.v1beta1;

public interface GetServiceIdentityResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.GetServiceIdentityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Service identity that service producer can use to access consumer
   * resources. If exists is true, it contains email and unique_id. If exists is
   * false, it contains pre-constructed email and empty unique_id.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.ServiceIdentity identity = 1;</code>
   *
   * @return Whether the identity field is set.
   */
  boolean hasIdentity();
  /**
   *
   *
   * <pre>
   * Service identity that service producer can use to access consumer
   * resources. If exists is true, it contains email and unique_id. If exists is
   * false, it contains pre-constructed email and empty unique_id.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.ServiceIdentity identity = 1;</code>
   *
   * @return The identity.
   */
  com.google.api.serviceusage.v1beta1.ServiceIdentity getIdentity();
  /**
   *
   *
   * <pre>
   * Service identity that service producer can use to access consumer
   * resources. If exists is true, it contains email and unique_id. If exists is
   * false, it contains pre-constructed email and empty unique_id.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.ServiceIdentity identity = 1;</code>
   */
  com.google.api.serviceusage.v1beta1.ServiceIdentityOrBuilder getIdentityOrBuilder();

  /**
   *
   *
   * <pre>
   * Service identity state.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.GetServiceIdentityResponse.IdentityState state = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Service identity state.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.GetServiceIdentityResponse.IdentityState state = 2;
   * </code>
   *
   * @return The state.
   */
  com.google.api.serviceusage.v1beta1.GetServiceIdentityResponse.IdentityState getState();
}
