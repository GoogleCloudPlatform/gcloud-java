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
// source: google/cloud/networksecurity/v1/server_tls_policy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networksecurity.v1;

public interface ListServerTlsPoliciesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of ServerTlsPolicy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;</code>
   */
  java.util.List<com.google.cloud.networksecurity.v1.ServerTlsPolicy> getServerTlsPoliciesList();
  /**
   *
   *
   * <pre>
   * List of ServerTlsPolicy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;</code>
   */
  com.google.cloud.networksecurity.v1.ServerTlsPolicy getServerTlsPolicies(int index);
  /**
   *
   *
   * <pre>
   * List of ServerTlsPolicy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;</code>
   */
  int getServerTlsPoliciesCount();
  /**
   *
   *
   * <pre>
   * List of ServerTlsPolicy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;</code>
   */
  java.util.List<? extends com.google.cloud.networksecurity.v1.ServerTlsPolicyOrBuilder>
      getServerTlsPoliciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of ServerTlsPolicy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;</code>
   */
  com.google.cloud.networksecurity.v1.ServerTlsPolicyOrBuilder getServerTlsPoliciesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `next_page_token` is included. To get the next set of results, call this
   * method again using the value of `next_page_token` as `page_token`.
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
   * If there might be more results than those appearing in this response, then
   * `next_page_token` is included. To get the next set of results, call this
   * method again using the value of `next_page_token` as `page_token`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
