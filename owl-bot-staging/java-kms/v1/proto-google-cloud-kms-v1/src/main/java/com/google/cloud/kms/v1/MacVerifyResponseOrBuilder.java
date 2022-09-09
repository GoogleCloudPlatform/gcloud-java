// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface MacVerifyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.MacVerifyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used for
   * verification. Check this field to verify that the intended resource was
   * used for verification.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used for
   * verification. Check this field to verify that the intended resource was
   * used for verification.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * This field indicates whether or not the verification operation for
   * [MacVerifyRequest.mac][google.cloud.kms.v1.MacVerifyRequest.mac] over
   * [MacVerifyRequest.data][google.cloud.kms.v1.MacVerifyRequest.data] was
   * successful.
   * </pre>
   *
   * <code>bool success = 2;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <pre>
   * Integrity verification field. A flag indicating whether
   * [MacVerifyRequest.data_crc32c][google.cloud.kms.v1.MacVerifyRequest.data_crc32c]
   * was received by
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] and used
   * for the integrity verification of the
   * [data][google.cloud.kms.v1.MacVerifyRequest.data]. A false value of this
   * field indicates either that
   * [MacVerifyRequest.data_crc32c][google.cloud.kms.v1.MacVerifyRequest.data_crc32c]
   * was left unset or that it was not delivered to
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService]. If you've
   * set
   * [MacVerifyRequest.data_crc32c][google.cloud.kms.v1.MacVerifyRequest.data_crc32c]
   * but this field is still false, discard the response and perform a limited
   * number of retries.
   * </pre>
   *
   * <code>bool verified_data_crc32c = 3;</code>
   * @return The verifiedDataCrc32c.
   */
  boolean getVerifiedDataCrc32C();

  /**
   * <pre>
   * Integrity verification field. A flag indicating whether
   * [MacVerifyRequest.mac_crc32c][google.cloud.kms.v1.MacVerifyRequest.mac_crc32c]
   * was received by
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService] and used
   * for the integrity verification of the
   * [data][google.cloud.kms.v1.MacVerifyRequest.mac]. A false value of this
   * field indicates either that
   * [MacVerifyRequest.mac_crc32c][google.cloud.kms.v1.MacVerifyRequest.mac_crc32c]
   * was left unset or that it was not delivered to
   * [KeyManagementService][google.cloud.kms.v1.KeyManagementService]. If you've
   * set
   * [MacVerifyRequest.mac_crc32c][google.cloud.kms.v1.MacVerifyRequest.mac_crc32c]
   * but this field is still false, discard the response and perform a limited
   * number of retries.
   * </pre>
   *
   * <code>bool verified_mac_crc32c = 4;</code>
   * @return The verifiedMacCrc32c.
   */
  boolean getVerifiedMacCrc32C();

  /**
   * <pre>
   * Integrity verification field. This value is used for the integrity
   * verification of [MacVerifyResponse.success]. If the value of this field
   * contradicts the value of [MacVerifyResponse.success], discard the response
   * and perform a limited number of retries.
   * </pre>
   *
   * <code>bool verified_success_integrity = 5;</code>
   * @return The verifiedSuccessIntegrity.
   */
  boolean getVerifiedSuccessIntegrity();

  /**
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used for
   * verification.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 6;</code>
   * @return The enum numeric value on the wire for protectionLevel.
   */
  int getProtectionLevelValue();
  /**
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used for
   * verification.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 6;</code>
   * @return The protectionLevel.
   */
  com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel();
}
