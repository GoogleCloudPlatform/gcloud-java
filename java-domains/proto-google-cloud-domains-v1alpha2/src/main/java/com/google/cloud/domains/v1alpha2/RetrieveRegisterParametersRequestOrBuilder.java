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
// source: google/cloud/domains/v1alpha2/domains.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.domains.v1alpha2;

public interface RetrieveRegisterParametersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1alpha2.RetrieveRegisterParametersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The domain name. Unicode domain names must be expressed in Punycode format.
   * </pre>
   *
   * <code>string domain_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The domainName.
   */
  java.lang.String getDomainName();
  /**
   *
   *
   * <pre>
   * Required. The domain name. Unicode domain names must be expressed in Punycode format.
   * </pre>
   *
   * <code>string domain_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for domainName.
   */
  com.google.protobuf.ByteString getDomainNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();
}
