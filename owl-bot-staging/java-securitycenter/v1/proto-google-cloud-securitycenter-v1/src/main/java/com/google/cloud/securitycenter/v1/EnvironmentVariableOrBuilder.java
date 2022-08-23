// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/process.proto

package com.google.cloud.securitycenter.v1;

public interface EnvironmentVariableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.EnvironmentVariable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Environment variable name as a JSON encoded string.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Environment variable name as a JSON encoded string.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Environment variable value as a JSON encoded string.
   * </pre>
   *
   * <code>string val = 2;</code>
   * @return The val.
   */
  java.lang.String getVal();
  /**
   * <pre>
   * Environment variable value as a JSON encoded string.
   * </pre>
   *
   * <code>string val = 2;</code>
   * @return The bytes for val.
   */
  com.google.protobuf.ByteString
      getValBytes();
}
