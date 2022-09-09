// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/baremetalsolution/v2/network.proto

package com.google.cloud.baremetalsolution.v2;

public interface ListNetworkUsageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.ListNetworkUsageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  java.util.List<com.google.cloud.baremetalsolution.v2.NetworkUsage> 
      getNetworksList();
  /**
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  com.google.cloud.baremetalsolution.v2.NetworkUsage getNetworks(int index);
  /**
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  int getNetworksCount();
  /**
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  java.util.List<? extends com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder> 
      getNetworksOrBuilderList();
  /**
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder getNetworksOrBuilder(
      int index);
}
