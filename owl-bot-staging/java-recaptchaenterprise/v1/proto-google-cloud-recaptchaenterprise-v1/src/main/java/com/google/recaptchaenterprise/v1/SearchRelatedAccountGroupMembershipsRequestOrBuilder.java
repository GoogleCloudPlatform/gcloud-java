// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface SearchRelatedAccountGroupMembershipsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the project to search related account group
   * memberships from, in the format "projects/{project}".
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Required. The name of the project to search related account group
   * memberships from, in the format "projects/{project}".
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Optional. The unique stable hashed user identifier we should search
   * connections to. The identifier should correspond to a `hashed_account_id`
   * provided in a previous CreateAssessment or AnnotateAssessment call.
   * </pre>
   *
   * <code>bytes hashed_account_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The hashedAccountId.
   */
  com.google.protobuf.ByteString getHashedAccountId();

  /**
   * <pre>
   * Optional. The maximum number of groups to return. The service may return
   * fewer than this value. If unspecified, at most 50 groups will be returned.
   * The maximum value is 1000; values above 1000 will be coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. A page token, received from a previous
   * `SearchRelatedAccountGroupMemberships` call. Provide this to retrieve the
   * subsequent page.
   * When paginating, all other parameters provided to
   * `SearchRelatedAccountGroupMemberships` must match the call that provided
   * the page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A page token, received from a previous
   * `SearchRelatedAccountGroupMemberships` call. Provide this to retrieve the
   * subsequent page.
   * When paginating, all other parameters provided to
   * `SearchRelatedAccountGroupMemberships` must match the call that provided
   * the page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
