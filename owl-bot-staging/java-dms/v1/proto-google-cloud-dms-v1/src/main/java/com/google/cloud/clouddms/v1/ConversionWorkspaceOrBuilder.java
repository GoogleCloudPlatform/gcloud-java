// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

package com.google.cloud.clouddms.v1;

public interface ConversionWorkspaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.ConversionWorkspace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Full name of the workspace resource, in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Full name of the workspace resource, in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The source engine details.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEngineInfo source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * Required. The source engine details.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEngineInfo source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The source.
   */
  com.google.cloud.clouddms.v1.DatabaseEngineInfo getSource();
  /**
   * <pre>
   * Required. The source engine details.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEngineInfo source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.clouddms.v1.DatabaseEngineInfoOrBuilder getSourceOrBuilder();

  /**
   * <pre>
   * Required. The destination engine details.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEngineInfo destination = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <pre>
   * Required. The destination engine details.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEngineInfo destination = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The destination.
   */
  com.google.cloud.clouddms.v1.DatabaseEngineInfo getDestination();
  /**
   * <pre>
   * Required. The destination engine details.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEngineInfo destination = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.clouddms.v1.DatabaseEngineInfoOrBuilder getDestinationOrBuilder();

  /**
   * <pre>
   * Optional. A generic list of settings for the workspace.
   * The settings are database pair dependant and can indicate default behavior
   * for the mapping rules engine or turn on or off specific features.
   * Such examples can be: convert_foreign_key_to_interleave=true,
   * skip_triggers=false, ignore_non_table_synonyms=true
   * </pre>
   *
   * <code>map&lt;string, string&gt; global_settings = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getGlobalSettingsCount();
  /**
   * <pre>
   * Optional. A generic list of settings for the workspace.
   * The settings are database pair dependant and can indicate default behavior
   * for the mapping rules engine or turn on or off specific features.
   * Such examples can be: convert_foreign_key_to_interleave=true,
   * skip_triggers=false, ignore_non_table_synonyms=true
   * </pre>
   *
   * <code>map&lt;string, string&gt; global_settings = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsGlobalSettings(
      java.lang.String key);
  /**
   * Use {@link #getGlobalSettingsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getGlobalSettings();
  /**
   * <pre>
   * Optional. A generic list of settings for the workspace.
   * The settings are database pair dependant and can indicate default behavior
   * for the mapping rules engine or turn on or off specific features.
   * Such examples can be: convert_foreign_key_to_interleave=true,
   * skip_triggers=false, ignore_non_table_synonyms=true
   * </pre>
   *
   * <code>map&lt;string, string&gt; global_settings = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getGlobalSettingsMap();
  /**
   * <pre>
   * Optional. A generic list of settings for the workspace.
   * The settings are database pair dependant and can indicate default behavior
   * for the mapping rules engine or turn on or off specific features.
   * Such examples can be: convert_foreign_key_to_interleave=true,
   * skip_triggers=false, ignore_non_table_synonyms=true
   * </pre>
   *
   * <code>map&lt;string, string&gt; global_settings = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getGlobalSettingsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. A generic list of settings for the workspace.
   * The settings are database pair dependant and can indicate default behavior
   * for the mapping rules engine or turn on or off specific features.
   * Such examples can be: convert_foreign_key_to_interleave=true,
   * skip_triggers=false, ignore_non_table_synonyms=true
   * </pre>
   *
   * <code>map&lt;string, string&gt; global_settings = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getGlobalSettingsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. Whether the workspace has uncommitted changes (changes which
   * were made after the workspace was committed).
   * </pre>
   *
   * <code>bool has_uncommitted_changes = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasUncommittedChanges.
   */
  boolean getHasUncommittedChanges();

  /**
   * <pre>
   * Output only. The latest commit ID.
   * </pre>
   *
   * <code>string latest_commit_id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The latestCommitId.
   */
  java.lang.String getLatestCommitId();
  /**
   * <pre>
   * Output only. The latest commit ID.
   * </pre>
   *
   * <code>string latest_commit_id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for latestCommitId.
   */
  com.google.protobuf.ByteString
      getLatestCommitIdBytes();

  /**
   * <pre>
   * Output only. The timestamp when the workspace was committed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp latest_commit_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the latestCommitTime field is set.
   */
  boolean hasLatestCommitTime();
  /**
   * <pre>
   * Output only. The timestamp when the workspace was committed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp latest_commit_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The latestCommitTime.
   */
  com.google.protobuf.Timestamp getLatestCommitTime();
  /**
   * <pre>
   * Output only. The timestamp when the workspace was committed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp latest_commit_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLatestCommitTimeOrBuilder();

  /**
   * <pre>
   * Output only. The timestamp when the workspace resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when the workspace resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when the workspace resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The timestamp when the workspace resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The timestamp when the workspace resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The timestamp when the workspace resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional. The display name for the workspace.
   * </pre>
   *
   * <code>string display_name = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Optional. The display name for the workspace.
   * </pre>
   *
   * <code>string display_name = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();
}
