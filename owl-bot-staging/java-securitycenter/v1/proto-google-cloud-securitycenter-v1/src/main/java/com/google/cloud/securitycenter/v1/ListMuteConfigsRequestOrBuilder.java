// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface ListMuteConfigsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.ListMuteConfigsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent, which owns the collection of mute configs. Its format is
   * "organizations/[organization_id]", "folders/[folder_id]",
   * "projects/[project_id]".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent, which owns the collection of mute configs. Its format is
   * "organizations/[organization_id]", "folders/[folder_id]",
   * "projects/[project_id]".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of configs to return. The service may return fewer than
   * this value.
   * If unspecified, at most 10 configs will be returned.
   * The maximum value is 1000; values above 1000 will be coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous `ListMuteConfigs` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListMuteConfigs` must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token, received from a previous `ListMuteConfigs` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListMuteConfigs` must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
