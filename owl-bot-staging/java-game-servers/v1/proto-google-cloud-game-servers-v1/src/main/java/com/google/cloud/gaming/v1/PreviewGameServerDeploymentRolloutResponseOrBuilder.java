// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/game_server_deployments.proto

package com.google.cloud.gaming.v1;

public interface PreviewGameServerDeploymentRolloutResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Locations that could not be reached on this request.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   * @return A list containing the unavailable.
   */
  java.util.List<java.lang.String>
      getUnavailableList();
  /**
   * <pre>
   * Locations that could not be reached on this request.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   * @return The count of unavailable.
   */
  int getUnavailableCount();
  /**
   * <pre>
   * Locations that could not be reached on this request.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   * @param index The index of the element to return.
   * @return The unavailable at the given index.
   */
  java.lang.String getUnavailable(int index);
  /**
   * <pre>
   * Locations that could not be reached on this request.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unavailable at the given index.
   */
  com.google.protobuf.ByteString
      getUnavailableBytes(int index);

  /**
   * <pre>
   * ETag of the game server deployment.
   * </pre>
   *
   * <code>string etag = 3;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * ETag of the game server deployment.
   * </pre>
   *
   * <code>string etag = 3;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 4;</code>
   * @return Whether the targetState field is set.
   */
  boolean hasTargetState();
  /**
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 4;</code>
   * @return The targetState.
   */
  com.google.cloud.gaming.v1.TargetState getTargetState();
  /**
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 4;</code>
   */
  com.google.cloud.gaming.v1.TargetStateOrBuilder getTargetStateOrBuilder();
}
