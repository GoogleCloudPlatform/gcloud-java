// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/inventory/v1/key_tracking_service.proto

package com.google.cloud.kms.inventory.v1;

public interface GetProtectedResourcesSummaryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.inventory.v1.GetProtectedResourcesSummaryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
