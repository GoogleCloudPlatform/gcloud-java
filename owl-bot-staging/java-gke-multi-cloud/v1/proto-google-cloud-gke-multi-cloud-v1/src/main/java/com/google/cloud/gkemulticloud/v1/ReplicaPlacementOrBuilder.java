// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface ReplicaPlacementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.ReplicaPlacement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. For a given replica, the ARM ID of the subnet where the control plane VM is
   * deployed. Make sure it's a subnet under the virtual network in the cluster
   * configuration.
   * </pre>
   *
   * <code>string subnet_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subnetId.
   */
  java.lang.String getSubnetId();
  /**
   * <pre>
   * Required. For a given replica, the ARM ID of the subnet where the control plane VM is
   * deployed. Make sure it's a subnet under the virtual network in the cluster
   * configuration.
   * </pre>
   *
   * <code>string subnet_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for subnetId.
   */
  com.google.protobuf.ByteString
      getSubnetIdBytes();

  /**
   * <pre>
   * Required. For a given replica, the Azure availability zone where to provision the
   * control plane VM and the ETCD disk.
   * </pre>
   *
   * <code>string azure_availability_zone = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The azureAvailabilityZone.
   */
  java.lang.String getAzureAvailabilityZone();
  /**
   * <pre>
   * Required. For a given replica, the Azure availability zone where to provision the
   * control plane VM and the ETCD disk.
   * </pre>
   *
   * <code>string azure_availability_zone = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for azureAvailabilityZone.
   */
  com.google.protobuf.ByteString
      getAzureAvailabilityZoneBytes();
}
