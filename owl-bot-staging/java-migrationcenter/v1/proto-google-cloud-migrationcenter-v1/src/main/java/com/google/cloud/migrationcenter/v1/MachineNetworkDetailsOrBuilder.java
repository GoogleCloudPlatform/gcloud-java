// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface MachineNetworkDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.MachineNetworkDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The primary IP address of the machine.
   * </pre>
   *
   * <code>string primary_ip_address = 1;</code>
   * @return The primaryIpAddress.
   */
  java.lang.String getPrimaryIpAddress();
  /**
   * <pre>
   * The primary IP address of the machine.
   * </pre>
   *
   * <code>string primary_ip_address = 1;</code>
   * @return The bytes for primaryIpAddress.
   */
  com.google.protobuf.ByteString
      getPrimaryIpAddressBytes();

  /**
   * <pre>
   * The public IP address of the machine.
   * </pre>
   *
   * <code>string public_ip_address = 2;</code>
   * @return The publicIpAddress.
   */
  java.lang.String getPublicIpAddress();
  /**
   * <pre>
   * The public IP address of the machine.
   * </pre>
   *
   * <code>string public_ip_address = 2;</code>
   * @return The bytes for publicIpAddress.
   */
  com.google.protobuf.ByteString
      getPublicIpAddressBytes();

  /**
   * <pre>
   * MAC address of the machine.
   * This property is used to uniqly identify the machine.
   * </pre>
   *
   * <code>string primary_mac_address = 3;</code>
   * @return The primaryMacAddress.
   */
  java.lang.String getPrimaryMacAddress();
  /**
   * <pre>
   * MAC address of the machine.
   * This property is used to uniqly identify the machine.
   * </pre>
   *
   * <code>string primary_mac_address = 3;</code>
   * @return The bytes for primaryMacAddress.
   */
  com.google.protobuf.ByteString
      getPrimaryMacAddressBytes();

  /**
   * <pre>
   * List of network adapters.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NetworkAdapterList adapters = 4;</code>
   * @return Whether the adapters field is set.
   */
  boolean hasAdapters();
  /**
   * <pre>
   * List of network adapters.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NetworkAdapterList adapters = 4;</code>
   * @return The adapters.
   */
  com.google.cloud.migrationcenter.v1.NetworkAdapterList getAdapters();
  /**
   * <pre>
   * List of network adapters.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NetworkAdapterList adapters = 4;</code>
   */
  com.google.cloud.migrationcenter.v1.NetworkAdapterListOrBuilder getAdaptersOrBuilder();
}
