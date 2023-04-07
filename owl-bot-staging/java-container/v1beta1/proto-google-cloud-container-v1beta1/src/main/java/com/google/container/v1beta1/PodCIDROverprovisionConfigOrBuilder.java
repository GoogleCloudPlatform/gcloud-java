// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface PodCIDROverprovisionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.PodCIDROverprovisionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether Pod CIDR overprovisioning is disabled.
   * Note: Pod CIDR overprovisioning is enabled by default.
   * </pre>
   *
   * <code>bool disable = 1;</code>
   * @return The disable.
   */
  boolean getDisable();
}
