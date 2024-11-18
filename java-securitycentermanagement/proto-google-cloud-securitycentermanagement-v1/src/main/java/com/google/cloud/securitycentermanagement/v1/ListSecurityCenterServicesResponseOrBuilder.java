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
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycentermanagement.v1;

public interface ListSecurityCenterServicesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.ListSecurityCenterServicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of services.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycentermanagement.v1.SecurityCenterService security_center_services = 1;
   * </code>
   */
  java.util.List<com.google.cloud.securitycentermanagement.v1.SecurityCenterService>
      getSecurityCenterServicesList();
  /**
   *
   *
   * <pre>
   * The list of services.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycentermanagement.v1.SecurityCenterService security_center_services = 1;
   * </code>
   */
  com.google.cloud.securitycentermanagement.v1.SecurityCenterService getSecurityCenterServices(
      int index);
  /**
   *
   *
   * <pre>
   * The list of services.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycentermanagement.v1.SecurityCenterService security_center_services = 1;
   * </code>
   */
  int getSecurityCenterServicesCount();
  /**
   *
   *
   * <pre>
   * The list of services.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycentermanagement.v1.SecurityCenterService security_center_services = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.securitycentermanagement.v1.SecurityCenterServiceOrBuilder>
      getSecurityCenterServicesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of services.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycentermanagement.v1.SecurityCenterService security_center_services = 1;
   * </code>
   */
  com.google.cloud.securitycentermanagement.v1.SecurityCenterServiceOrBuilder
      getSecurityCenterServicesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A pagination token. To retrieve the next page of results, call the method
   * again with this token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A pagination token. To retrieve the next page of results, call the method
   * again with this token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
