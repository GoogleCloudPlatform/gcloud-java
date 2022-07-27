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
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

public interface CreateMembershipRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.CreateMembershipRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent (project and location) where the Memberships will be created.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
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
   * Required. The parent (project and location) where the Memberships will be created.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
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
   * Required. Client chosen ID for the membership. `membership_id` must be a valid RFC
   * 1123 compliant DNS label:
   *   1. At most 63 characters in length
   *   2. It must consist of lower case alphanumeric characters or `-`
   *   3. It must start and end with an alphanumeric character
   * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
   * with a maximum length of 63 characters.
   * </pre>
   *
   * <code>string membership_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The membershipId.
   */
  java.lang.String getMembershipId();
  /**
   *
   *
   * <pre>
   * Required. Client chosen ID for the membership. `membership_id` must be a valid RFC
   * 1123 compliant DNS label:
   *   1. At most 63 characters in length
   *   2. It must consist of lower case alphanumeric characters or `-`
   *   3. It must start and end with an alphanumeric character
   * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
   * with a maximum length of 63 characters.
   * </pre>
   *
   * <code>string membership_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for membershipId.
   */
  com.google.protobuf.ByteString getMembershipIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The membership to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1beta1.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   *
   *
   * <pre>
   * Required. The membership to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1beta1.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The resource.
   */
  com.google.cloud.gkehub.v1beta1.Membership getResource();
  /**
   *
   *
   * <pre>
   * Required. The membership to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1beta1.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkehub.v1beta1.MembershipOrBuilder getResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes after the first request.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes after the first request.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
