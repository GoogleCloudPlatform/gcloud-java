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
// source: google/devtools/cloudbuild/v2/repositories.proto

package google.devtools.cloudbuild.v2;

public interface ConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.Connection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the connection, in the format
   * `projects/{project}/locations/{location}/connections/{connection_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the connection, in the format
   * `projects/{project}/locations/{location}/connections/{connection_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server assigned timestamp for when the connection was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Server assigned timestamp for when the connection was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Server assigned timestamp for when the connection was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Server assigned timestamp for when the connection was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Server assigned timestamp for when the connection was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Server assigned timestamp for when the connection was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for connections to github.com.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.GitHubConfig github_config = 5;</code>
   *
   * @return Whether the githubConfig field is set.
   */
  boolean hasGithubConfig();
  /**
   *
   *
   * <pre>
   * Configuration for connections to github.com.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.GitHubConfig github_config = 5;</code>
   *
   * @return The githubConfig.
   */
  google.devtools.cloudbuild.v2.GitHubConfig getGithubConfig();
  /**
   *
   *
   * <pre>
   * Configuration for connections to github.com.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.GitHubConfig github_config = 5;</code>
   */
  google.devtools.cloudbuild.v2.GitHubConfigOrBuilder getGithubConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of GitHub Enterprise.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.GitHubEnterpriseConfig github_enterprise_config = 6;
   * </code>
   *
   * @return Whether the githubEnterpriseConfig field is set.
   */
  boolean hasGithubEnterpriseConfig();
  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of GitHub Enterprise.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.GitHubEnterpriseConfig github_enterprise_config = 6;
   * </code>
   *
   * @return The githubEnterpriseConfig.
   */
  google.devtools.cloudbuild.v2.GitHubEnterpriseConfig getGithubEnterpriseConfig();
  /**
   *
   *
   * <pre>
   * Configuration for connections to an instance of GitHub Enterprise.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.GitHubEnterpriseConfig github_enterprise_config = 6;
   * </code>
   */
  google.devtools.cloudbuild.v2.GitHubEnterpriseConfigOrBuilder
      getGithubEnterpriseConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Installation state of the Connection.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.InstallationState installation_state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the installationState field is set.
   */
  boolean hasInstallationState();
  /**
   *
   *
   * <pre>
   * Output only. Installation state of the Connection.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.InstallationState installation_state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The installationState.
   */
  google.devtools.cloudbuild.v2.InstallationState getInstallationState();
  /**
   *
   *
   * <pre>
   * Output only. Installation state of the Connection.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.InstallationState installation_state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  google.devtools.cloudbuild.v2.InstallationStateOrBuilder getInstallationStateOrBuilder();

  /**
   *
   *
   * <pre>
   * If disabled is set to true, functionality is disabled for this connection.
   * Repository based API methods and webhooks processing for repositories in
   * this connection will be disabled.
   * </pre>
   *
   * <code>bool disabled = 13;</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * Output only. Set to true when the connection is being set up or updated in
   * the background.
   * </pre>
   *
   * <code>bool reconciling = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 15;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 15;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 15;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 15;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 15;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 16;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 16;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  public google.devtools.cloudbuild.v2.Connection.ConnectionConfigCase getConnectionConfigCase();
}
