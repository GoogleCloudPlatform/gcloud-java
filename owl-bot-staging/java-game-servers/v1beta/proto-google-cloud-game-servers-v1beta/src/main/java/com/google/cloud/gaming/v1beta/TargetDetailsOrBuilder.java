// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/common.proto

package com.google.cloud.gaming.v1beta;

public interface TargetDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1beta.TargetDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The game server cluster name. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`.
   * </pre>
   *
   * <code>string game_server_cluster_name = 1;</code>
   * @return The gameServerClusterName.
   */
  java.lang.String getGameServerClusterName();
  /**
   * <pre>
   * The game server cluster name. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`.
   * </pre>
   *
   * <code>string game_server_cluster_name = 1;</code>
   * @return The bytes for gameServerClusterName.
   */
  com.google.protobuf.ByteString
      getGameServerClusterNameBytes();

  /**
   * <pre>
   * The game server deployment name. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}`.
   * </pre>
   *
   * <code>string game_server_deployment_name = 2;</code>
   * @return The gameServerDeploymentName.
   */
  java.lang.String getGameServerDeploymentName();
  /**
   * <pre>
   * The game server deployment name. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}`.
   * </pre>
   *
   * <code>string game_server_deployment_name = 2;</code>
   * @return The bytes for gameServerDeploymentName.
   */
  com.google.protobuf.ByteString
      getGameServerDeploymentNameBytes();

  /**
   * <pre>
   * Agones fleet details for game server clusters and game server deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.TargetDetails.TargetFleetDetails fleet_details = 3;</code>
   */
  java.util.List<com.google.cloud.gaming.v1beta.TargetDetails.TargetFleetDetails> 
      getFleetDetailsList();
  /**
   * <pre>
   * Agones fleet details for game server clusters and game server deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.TargetDetails.TargetFleetDetails fleet_details = 3;</code>
   */
  com.google.cloud.gaming.v1beta.TargetDetails.TargetFleetDetails getFleetDetails(int index);
  /**
   * <pre>
   * Agones fleet details for game server clusters and game server deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.TargetDetails.TargetFleetDetails fleet_details = 3;</code>
   */
  int getFleetDetailsCount();
  /**
   * <pre>
   * Agones fleet details for game server clusters and game server deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.TargetDetails.TargetFleetDetails fleet_details = 3;</code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1beta.TargetDetails.TargetFleetDetailsOrBuilder> 
      getFleetDetailsOrBuilderList();
  /**
   * <pre>
   * Agones fleet details for game server clusters and game server deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.TargetDetails.TargetFleetDetails fleet_details = 3;</code>
   */
  com.google.cloud.gaming.v1beta.TargetDetails.TargetFleetDetailsOrBuilder getFleetDetailsOrBuilder(
      int index);
}
