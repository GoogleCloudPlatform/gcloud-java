// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface UploadServiceAccountKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.UploadServiceAccountKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The public key to associate with the service account. Must be an RSA public
   * key that is wrapped in an X.509 v3 certificate. Include the first line,
   * `-----BEGIN CERTIFICATE-----`, and the last line,
   * `-----END CERTIFICATE-----`.
   * </pre>
   *
   * <code>bytes public_key_data = 2;</code>
   * @return The publicKeyData.
   */
  com.google.protobuf.ByteString getPublicKeyData();
}
