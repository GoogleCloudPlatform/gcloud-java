// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/ekm_service.proto

package com.google.cloud.kms.v1;

public interface VerifyConnectivityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.VerifyConnectivityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [name][google.cloud.kms.v1.EkmConnection.name] of the
   * [EkmConnection][google.cloud.kms.v1.EkmConnection] to verify.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The [name][google.cloud.kms.v1.EkmConnection.name] of the
   * [EkmConnection][google.cloud.kms.v1.EkmConnection] to verify.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
