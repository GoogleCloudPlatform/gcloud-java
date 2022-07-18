/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/game_server_deployments.proto

package com.google.cloud.gaming.v1;

public interface GameServerDeploymentRolloutOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.GameServerDeploymentRollout)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the game server deployment rollout, in the following
   * form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/rollout`.
   * For example,
   * `projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the game server deployment rollout, in the following
   * form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/rollout`.
   * For example,
   * `projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The default game server config is applied to all realms unless overridden
   * in the rollout. For example,
   * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
   * </pre>
   *
   * <code>string default_game_server_config = 4;</code>
   *
   * @return The defaultGameServerConfig.
   */
  java.lang.String getDefaultGameServerConfig();
  /**
   *
   *
   * <pre>
   * The default game server config is applied to all realms unless overridden
   * in the rollout. For example,
   * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
   * </pre>
   *
   * <code>string default_game_server_config = 4;</code>
   *
   * @return The bytes for defaultGameServerConfig.
   */
  com.google.protobuf.ByteString getDefaultGameServerConfigBytes();

  /**
   *
   *
   * <pre>
   * Contains the game server config rollout overrides. Overrides are processed
   * in the order they are listed. Once a match is found for a realm, the rest
   * of the list is not processed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1.GameServerConfigOverride game_server_config_overrides = 5;
   * </code>
   */
  java.util.List<com.google.cloud.gaming.v1.GameServerConfigOverride>
      getGameServerConfigOverridesList();
  /**
   *
   *
   * <pre>
   * Contains the game server config rollout overrides. Overrides are processed
   * in the order they are listed. Once a match is found for a realm, the rest
   * of the list is not processed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1.GameServerConfigOverride game_server_config_overrides = 5;
   * </code>
   */
  com.google.cloud.gaming.v1.GameServerConfigOverride getGameServerConfigOverrides(int index);
  /**
   *
   *
   * <pre>
   * Contains the game server config rollout overrides. Overrides are processed
   * in the order they are listed. Once a match is found for a realm, the rest
   * of the list is not processed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1.GameServerConfigOverride game_server_config_overrides = 5;
   * </code>
   */
  int getGameServerConfigOverridesCount();
  /**
   *
   *
   * <pre>
   * Contains the game server config rollout overrides. Overrides are processed
   * in the order they are listed. Once a match is found for a realm, the rest
   * of the list is not processed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1.GameServerConfigOverride game_server_config_overrides = 5;
   * </code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1.GameServerConfigOverrideOrBuilder>
      getGameServerConfigOverridesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contains the game server config rollout overrides. Overrides are processed
   * in the order they are listed. Once a match is found for a realm, the rest
   * of the list is not processed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1.GameServerConfigOverride game_server_config_overrides = 5;
   * </code>
   */
  com.google.cloud.gaming.v1.GameServerConfigOverrideOrBuilder
      getGameServerConfigOverridesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * ETag of the resource.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * ETag of the resource.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
