// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/credentials/v1/common.proto

package com.google.cloud.iam.credentials.v1;

public interface SignBlobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.credentials.v1.SignBlobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   * @return A list containing the delegates.
   */
  java.util.List<java.lang.String>
      getDelegatesList();
  /**
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   * @return The count of delegates.
   */
  int getDelegatesCount();
  /**
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   * @param index The index of the element to return.
   * @return The delegates at the given index.
   */
  java.lang.String getDelegates(int index);
  /**
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the delegates at the given index.
   */
  com.google.protobuf.ByteString
      getDelegatesBytes(int index);

  /**
   * <pre>
   * Required. The bytes to sign.
   * </pre>
   *
   * <code>bytes payload = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}
