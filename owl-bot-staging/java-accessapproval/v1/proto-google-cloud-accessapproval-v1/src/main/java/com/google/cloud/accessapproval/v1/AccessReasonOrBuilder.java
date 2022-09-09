// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

public interface AccessReasonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.accessapproval.v1.AccessReason)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of access justification.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessReason.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of access justification.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessReason.Type type = 1;</code>
   * @return The type.
   */
  com.google.cloud.accessapproval.v1.AccessReason.Type getType();

  /**
   * <pre>
   * More detail about certain reason types. See comments for each type above.
   * </pre>
   *
   * <code>string detail = 2;</code>
   * @return The detail.
   */
  java.lang.String getDetail();
  /**
   * <pre>
   * More detail about certain reason types. See comments for each type above.
   * </pre>
   *
   * <code>string detail = 2;</code>
   * @return The bytes for detail.
   */
  com.google.protobuf.ByteString
      getDetailBytes();
}
