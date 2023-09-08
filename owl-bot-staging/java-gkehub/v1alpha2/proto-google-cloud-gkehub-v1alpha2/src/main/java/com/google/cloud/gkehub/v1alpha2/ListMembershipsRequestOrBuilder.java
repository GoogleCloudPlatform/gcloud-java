// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha2/membership.proto

package com.google.cloud.gkehub.v1alpha2;

public interface ListMembershipsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1alpha2.ListMembershipsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent (project and location) where the Memberships will be listed.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent (project and location) where the Memberships will be listed.
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
   * Optional. When requesting a 'page' of resources, `page_size` specifies number of
   * resources to return. If unspecified or set to 0, all resources will
   * be returned.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. Token returned by previous call to `ListMemberships` which
   * specifies the position in the list from where to continue listing the
   * resources.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. Token returned by previous call to `ListMemberships` which
   * specifies the position in the list from where to continue listing the
   * resources.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. Lists Memberships that match the filter expression, following the syntax
   * outlined in https://google.aip.dev/160.
   *
   * Examples:
   *
   *   - Name is `bar` in project `foo-proj` and location `global`:
   *
   *       name = "projects/foo-proj/locations/global/membership/bar"
   *
   *   - Memberships that have a label called `foo`:
   *
   *       labels.foo:*
   *
   *   - Memberships that have a label called `foo` whose value is `bar`:
   *
   *       labels.foo = bar
   *
   *   - Memberships in the CREATING state:
   *
   *       state = CREATING
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. Lists Memberships that match the filter expression, following the syntax
   * outlined in https://google.aip.dev/160.
   *
   * Examples:
   *
   *   - Name is `bar` in project `foo-proj` and location `global`:
   *
   *       name = "projects/foo-proj/locations/global/membership/bar"
   *
   *   - Memberships that have a label called `foo`:
   *
   *       labels.foo:*
   *
   *   - Memberships that have a label called `foo` whose value is `bar`:
   *
   *       labels.foo = bar
   *
   *   - Memberships in the CREATING state:
   *
   *       state = CREATING
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Optional. One or more fields to compare and use to sort the output.
   * See https://google.aip.dev/132#ordering.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional. One or more fields to compare and use to sort the output.
   * See https://google.aip.dev/132#ordering.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();
}
