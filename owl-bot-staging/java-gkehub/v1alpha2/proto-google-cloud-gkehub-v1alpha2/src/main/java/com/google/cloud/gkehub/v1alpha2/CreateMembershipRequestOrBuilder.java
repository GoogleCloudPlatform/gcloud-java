// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha2/membership.proto

package com.google.cloud.gkehub.v1alpha2;

public interface CreateMembershipRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1alpha2.CreateMembershipRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent (project and location) where the Memberships will be created.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent (project and location) where the Memberships will be created.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
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
   * @return The membershipId.
   */
  java.lang.String getMembershipId();
  /**
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
   * @return The bytes for membershipId.
   */
  com.google.protobuf.ByteString
      getMembershipIdBytes();

  /**
   * <pre>
   * Required. The membership to create.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * Required. The membership to create.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resource.
   */
  com.google.cloud.gkehub.v1alpha2.Membership getResource();
  /**
   * <pre>
   * Required. The membership to create.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.gkehub.v1alpha2.MembershipOrBuilder getResourceOrBuilder();
}
