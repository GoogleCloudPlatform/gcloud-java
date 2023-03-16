// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/game_server_deployments.proto

package com.google.cloud.gaming.v1beta;

public interface ListGameServerDeploymentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1beta.ListGameServerDeploymentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of game server deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.GameServerDeployment game_server_deployments = 1;</code>
   */
  java.util.List<com.google.cloud.gaming.v1beta.GameServerDeployment> 
      getGameServerDeploymentsList();
  /**
   * <pre>
   * The list of game server deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.GameServerDeployment game_server_deployments = 1;</code>
   */
  com.google.cloud.gaming.v1beta.GameServerDeployment getGameServerDeployments(int index);
  /**
   * <pre>
   * The list of game server deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.GameServerDeployment game_server_deployments = 1;</code>
   */
  int getGameServerDeploymentsCount();
  /**
   * <pre>
   * The list of game server deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.GameServerDeployment game_server_deployments = 1;</code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1beta.GameServerDeploymentOrBuilder> 
      getGameServerDeploymentsOrBuilderList();
  /**
   * <pre>
   * The list of game server deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.GameServerDeployment game_server_deployments = 1;</code>
   */
  com.google.cloud.gaming.v1beta.GameServerDeploymentOrBuilder getGameServerDeploymentsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 4;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 4;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 4;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
