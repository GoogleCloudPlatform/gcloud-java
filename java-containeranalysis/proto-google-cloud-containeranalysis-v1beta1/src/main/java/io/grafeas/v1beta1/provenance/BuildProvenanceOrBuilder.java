/*
 * Copyright 2024 Google LLC
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
// source: google/devtools/containeranalysis/v1beta1/provenance/provenance.proto

// Protobuf Java Version: 3.25.4
package io.grafeas.v1beta1.provenance;

public interface BuildProvenanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.provenance.BuildProvenance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique identifier of the build.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Required. Unique identifier of the build.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * ID of the project.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * ID of the project.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Commands requested by the build.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Command commands = 3;</code>
   */
  java.util.List<io.grafeas.v1beta1.provenance.Command> getCommandsList();
  /**
   *
   *
   * <pre>
   * Commands requested by the build.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Command commands = 3;</code>
   */
  io.grafeas.v1beta1.provenance.Command getCommands(int index);
  /**
   *
   *
   * <pre>
   * Commands requested by the build.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Command commands = 3;</code>
   */
  int getCommandsCount();
  /**
   *
   *
   * <pre>
   * Commands requested by the build.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Command commands = 3;</code>
   */
  java.util.List<? extends io.grafeas.v1beta1.provenance.CommandOrBuilder>
      getCommandsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Commands requested by the build.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Command commands = 3;</code>
   */
  io.grafeas.v1beta1.provenance.CommandOrBuilder getCommandsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output of the build.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Artifact built_artifacts = 4;</code>
   */
  java.util.List<io.grafeas.v1beta1.provenance.Artifact> getBuiltArtifactsList();
  /**
   *
   *
   * <pre>
   * Output of the build.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Artifact built_artifacts = 4;</code>
   */
  io.grafeas.v1beta1.provenance.Artifact getBuiltArtifacts(int index);
  /**
   *
   *
   * <pre>
   * Output of the build.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Artifact built_artifacts = 4;</code>
   */
  int getBuiltArtifactsCount();
  /**
   *
   *
   * <pre>
   * Output of the build.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Artifact built_artifacts = 4;</code>
   */
  java.util.List<? extends io.grafeas.v1beta1.provenance.ArtifactOrBuilder>
      getBuiltArtifactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output of the build.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Artifact built_artifacts = 4;</code>
   */
  io.grafeas.v1beta1.provenance.ArtifactOrBuilder getBuiltArtifactsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Time at which the build was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Time at which the build was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Time at which the build was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Time at which execution of the build was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Time at which execution of the build was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Time at which execution of the build was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Time at which execution of the build was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Time at which execution of the build was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Time at which execution of the build was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * E-mail address of the user who initiated this build. Note that this was the
   * user's e-mail address at the time the build was initiated; this address may
   * not represent the same end-user for all time.
   * </pre>
   *
   * <code>string creator = 8;</code>
   *
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   *
   *
   * <pre>
   * E-mail address of the user who initiated this build. Note that this was the
   * user's e-mail address at the time the build was initiated; this address may
   * not represent the same end-user for all time.
   * </pre>
   *
   * <code>string creator = 8;</code>
   *
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString getCreatorBytes();

  /**
   *
   *
   * <pre>
   * URI where any logs for this provenance were written.
   * </pre>
   *
   * <code>string logs_uri = 9;</code>
   *
   * @return The logsUri.
   */
  java.lang.String getLogsUri();
  /**
   *
   *
   * <pre>
   * URI where any logs for this provenance were written.
   * </pre>
   *
   * <code>string logs_uri = 9;</code>
   *
   * @return The bytes for logsUri.
   */
  com.google.protobuf.ByteString getLogsUriBytes();

  /**
   *
   *
   * <pre>
   * Details of the Source input to the build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.provenance.Source source_provenance = 10;</code>
   *
   * @return Whether the sourceProvenance field is set.
   */
  boolean hasSourceProvenance();
  /**
   *
   *
   * <pre>
   * Details of the Source input to the build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.provenance.Source source_provenance = 10;</code>
   *
   * @return The sourceProvenance.
   */
  io.grafeas.v1beta1.provenance.Source getSourceProvenance();
  /**
   *
   *
   * <pre>
   * Details of the Source input to the build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.provenance.Source source_provenance = 10;</code>
   */
  io.grafeas.v1beta1.provenance.SourceOrBuilder getSourceProvenanceOrBuilder();

  /**
   *
   *
   * <pre>
   * Trigger identifier if the build was triggered automatically; empty if not.
   * </pre>
   *
   * <code>string trigger_id = 11;</code>
   *
   * @return The triggerId.
   */
  java.lang.String getTriggerId();
  /**
   *
   *
   * <pre>
   * Trigger identifier if the build was triggered automatically; empty if not.
   * </pre>
   *
   * <code>string trigger_id = 11;</code>
   *
   * @return The bytes for triggerId.
   */
  com.google.protobuf.ByteString getTriggerIdBytes();

  /**
   *
   *
   * <pre>
   * Special options applied to this build. This is a catch-all field where
   * build providers can enter any desired additional details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; build_options = 12;</code>
   */
  int getBuildOptionsCount();
  /**
   *
   *
   * <pre>
   * Special options applied to this build. This is a catch-all field where
   * build providers can enter any desired additional details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; build_options = 12;</code>
   */
  boolean containsBuildOptions(java.lang.String key);
  /** Use {@link #getBuildOptionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getBuildOptions();
  /**
   *
   *
   * <pre>
   * Special options applied to this build. This is a catch-all field where
   * build providers can enter any desired additional details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; build_options = 12;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getBuildOptionsMap();
  /**
   *
   *
   * <pre>
   * Special options applied to this build. This is a catch-all field where
   * build providers can enter any desired additional details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; build_options = 12;</code>
   */
  /* nullable */
  java.lang.String getBuildOptionsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Special options applied to this build. This is a catch-all field where
   * build providers can enter any desired additional details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; build_options = 12;</code>
   */
  java.lang.String getBuildOptionsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Version string of the builder at the time this build was executed.
   * </pre>
   *
   * <code>string builder_version = 13;</code>
   *
   * @return The builderVersion.
   */
  java.lang.String getBuilderVersion();
  /**
   *
   *
   * <pre>
   * Version string of the builder at the time this build was executed.
   * </pre>
   *
   * <code>string builder_version = 13;</code>
   *
   * @return The bytes for builderVersion.
   */
  com.google.protobuf.ByteString getBuilderVersionBytes();
}
