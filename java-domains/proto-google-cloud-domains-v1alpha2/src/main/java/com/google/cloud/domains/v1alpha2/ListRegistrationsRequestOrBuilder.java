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

public interface ListRegistrationsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1alpha2.ListRegistrationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project and location from which to list `Registration`s, specified in
   * the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project and location from which to list `Registration`s, specified in
   * the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of results to return.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * When set to the `next_page_token` from a prior response, provides the next
   * page of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * When set to the `next_page_token` from a prior response, provides the next
   * page of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Filter expression to restrict the `Registration`s returned.
   *
   * The expression must specify the field name, a comparison operator, and the
   * value that you want to use for filtering. The value must be a string, a
   * number, a boolean, or an enum value. The comparison operator should be one
   * of =, !=, &gt;, &lt;, &gt;=, &lt;=, or : for prefix or wildcard matches.
   *
   * For example, to filter to a specific domain name, use an expression like
   * `domainName="example.com"`. You can also check for the existence of a
   * field; for example, to find domains using custom DNS settings, use an
   * expression like `dnsSettings.customDns:*`.
   *
   * You can also create compound filters by combining expressions with the
   * `AND` and `OR` operators. For example, to find domains that are suspended
   * or have specific issues flagged, use an expression like
   * `(state=SUSPENDED) OR (issue:*)`.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Filter expression to restrict the `Registration`s returned.
   *
   * The expression must specify the field name, a comparison operator, and the
   * value that you want to use for filtering. The value must be a string, a
   * number, a boolean, or an enum value. The comparison operator should be one
   * of =, !=, &gt;, &lt;, &gt;=, &lt;=, or : for prefix or wildcard matches.
   *
   * For example, to filter to a specific domain name, use an expression like
   * `domainName="example.com"`. You can also check for the existence of a
   * field; for example, to find domains using custom DNS settings, use an
   * expression like `dnsSettings.customDns:*`.
   *
   * You can also create compound filters by combining expressions with the
   * `AND` and `OR` operators. For example, to find domains that are suspended
   * or have specific issues flagged, use an expression like
   * `(state=SUSPENDED) OR (issue:*)`.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
