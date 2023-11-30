// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface SignBlobResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.SignBlobResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The id of the key used to sign the blob.
   * </pre>
   *
   * <code>string key_id = 1 [deprecated = true];</code>
   * @deprecated google.iam.admin.v1.SignBlobResponse.key_id is deprecated.
   *     See google/iam/admin/v1/iam.proto;l=1001
   * @return The keyId.
   */
  @java.lang.Deprecated java.lang.String getKeyId();
  /**
   * <pre>
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The id of the key used to sign the blob.
   * </pre>
   *
   * <code>string key_id = 1 [deprecated = true];</code>
   * @deprecated google.iam.admin.v1.SignBlobResponse.key_id is deprecated.
   *     See google/iam/admin/v1/iam.proto;l=1001
   * @return The bytes for keyId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getKeyIdBytes();

  /**
   * <pre>
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The signed blob.
   * </pre>
   *
   * <code>bytes signature = 2 [deprecated = true];</code>
   * @deprecated google.iam.admin.v1.SignBlobResponse.signature is deprecated.
   *     See google/iam/admin/v1/iam.proto;l=1007
   * @return The signature.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString getSignature();
}
