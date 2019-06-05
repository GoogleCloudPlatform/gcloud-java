// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface DeleteScanConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * The resource name of the ScanConfig to be deleted. The name follows the
   * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required.
   * The resource name of the ScanConfig to be deleted. The name follows the
   * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
