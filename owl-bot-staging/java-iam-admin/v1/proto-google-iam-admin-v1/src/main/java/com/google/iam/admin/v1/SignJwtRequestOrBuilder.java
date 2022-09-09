// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface SignJwtRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.SignJwtRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>string name = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @deprecated google.iam.admin.v1.SignJwtRequest.name is deprecated.
   *     See google/iam/admin/v1/iam.proto;l=955
   * @return The name.
   */
  @java.lang.Deprecated java.lang.String getName();
  /**
   * <pre>
   * Required. Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>string name = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @deprecated google.iam.admin.v1.SignJwtRequest.name is deprecated.
   *     See google/iam/admin/v1/iam.proto;l=955
   * @return The bytes for name.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   * The JWT payload to sign. Must be a serialized JSON object that contains a
   * JWT Claims Set. For example: `{"sub": "user&#64;example.com", "iat": 313435}`
   * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be
   * an integer timestamp that is not in the past and no more than 1 hour in the
   * future.
   * If the JWT Claims Set does not contain an expiration time (`exp`) claim,
   * this claim is added automatically, with a timestamp that is 1 hour in the
   * future.
   * </pre>
   *
   * <code>string payload = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.iam.admin.v1.SignJwtRequest.payload is deprecated.
   *     See google/iam/admin/v1/iam.proto;l=976
   * @return The payload.
   */
  @java.lang.Deprecated java.lang.String getPayload();
  /**
   * <pre>
   * Required. Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   * The JWT payload to sign. Must be a serialized JSON object that contains a
   * JWT Claims Set. For example: `{"sub": "user&#64;example.com", "iat": 313435}`
   * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be
   * an integer timestamp that is not in the past and no more than 1 hour in the
   * future.
   * If the JWT Claims Set does not contain an expiration time (`exp`) claim,
   * this claim is added automatically, with a timestamp that is 1 hour in the
   * future.
   * </pre>
   *
   * <code>string payload = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.iam.admin.v1.SignJwtRequest.payload is deprecated.
   *     See google/iam/admin/v1/iam.proto;l=976
   * @return The bytes for payload.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getPayloadBytes();
}
