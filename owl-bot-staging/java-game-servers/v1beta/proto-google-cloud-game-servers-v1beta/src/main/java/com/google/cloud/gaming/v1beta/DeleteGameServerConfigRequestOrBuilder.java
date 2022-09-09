// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/game_server_configs.proto

package com.google.cloud.gaming.v1beta;

public interface DeleteGameServerConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1beta.DeleteGameServerConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the game server config to delete. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the game server config to delete. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
