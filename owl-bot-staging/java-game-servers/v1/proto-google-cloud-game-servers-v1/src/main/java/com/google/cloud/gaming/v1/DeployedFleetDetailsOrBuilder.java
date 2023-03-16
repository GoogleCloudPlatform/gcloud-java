// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/common.proto

package com.google.cloud.gaming.v1;

public interface DeployedFleetDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.DeployedFleetDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Information about the Agones fleet.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleet deployed_fleet = 1;</code>
   * @return Whether the deployedFleet field is set.
   */
  boolean hasDeployedFleet();
  /**
   * <pre>
   * Information about the Agones fleet.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleet deployed_fleet = 1;</code>
   * @return The deployedFleet.
   */
  com.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleet getDeployedFleet();
  /**
   * <pre>
   * Information about the Agones fleet.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleet deployed_fleet = 1;</code>
   */
  com.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleetOrBuilder getDeployedFleetOrBuilder();

  /**
   * <pre>
   * Information about the Agones autoscaler for that fleet.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleetAutoscaler deployed_autoscaler = 2;</code>
   * @return Whether the deployedAutoscaler field is set.
   */
  boolean hasDeployedAutoscaler();
  /**
   * <pre>
   * Information about the Agones autoscaler for that fleet.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleetAutoscaler deployed_autoscaler = 2;</code>
   * @return The deployedAutoscaler.
   */
  com.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleetAutoscaler getDeployedAutoscaler();
  /**
   * <pre>
   * Information about the Agones autoscaler for that fleet.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleetAutoscaler deployed_autoscaler = 2;</code>
   */
  com.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleetAutoscalerOrBuilder getDeployedAutoscalerOrBuilder();
}
