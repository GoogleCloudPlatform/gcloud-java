// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface SkaffoldVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.SkaffoldVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Release version number. For example, "1.20.3".
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Release version number. For example, "1.20.3".
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Date when this version is expected to no longer be supported.
   * </pre>
   *
   * <code>.google.type.Date support_end_date = 2;</code>
   * @return Whether the supportEndDate field is set.
   */
  boolean hasSupportEndDate();
  /**
   * <pre>
   * Date when this version is expected to no longer be supported.
   * </pre>
   *
   * <code>.google.type.Date support_end_date = 2;</code>
   * @return The supportEndDate.
   */
  com.google.type.Date getSupportEndDate();
  /**
   * <pre>
   * Date when this version is expected to no longer be supported.
   * </pre>
   *
   * <code>.google.type.Date support_end_date = 2;</code>
   */
  com.google.type.DateOrBuilder getSupportEndDateOrBuilder();
}
