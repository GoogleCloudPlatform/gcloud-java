// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface AsymmetricSignRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.AsymmetricSignRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for signing.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for signing.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The digest of the data to sign. The digest must be produced with
   * the same digest algorithm as specified by the key version's
   * [algorithm][google.cloud.kms.v1.CryptoKeyVersion.algorithm].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.Digest digest = 3;</code>
   */
  boolean hasDigest();
  /**
   * <pre>
   * Required. The digest of the data to sign. The digest must be produced with
   * the same digest algorithm as specified by the key version's
   * [algorithm][google.cloud.kms.v1.CryptoKeyVersion.algorithm].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.Digest digest = 3;</code>
   */
  com.google.cloud.kms.v1.Digest getDigest();
  /**
   * <pre>
   * Required. The digest of the data to sign. The digest must be produced with
   * the same digest algorithm as specified by the key version's
   * [algorithm][google.cloud.kms.v1.CryptoKeyVersion.algorithm].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.Digest digest = 3;</code>
   */
  com.google.cloud.kms.v1.DigestOrBuilder getDigestOrBuilder();
}
