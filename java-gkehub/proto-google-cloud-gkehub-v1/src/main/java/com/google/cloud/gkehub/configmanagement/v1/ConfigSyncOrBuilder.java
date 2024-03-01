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
// source: google/cloud/gkehub/v1/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.configmanagement.v1;

public interface ConfigSyncOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1.ConfigSync)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Git repo configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.GitConfig git = 7;</code>
   *
   * @return Whether the git field is set.
   */
  boolean hasGit();
  /**
   *
   *
   * <pre>
   * Git repo configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.GitConfig git = 7;</code>
   *
   * @return The git.
   */
  com.google.cloud.gkehub.configmanagement.v1.GitConfig getGit();
  /**
   *
   *
   * <pre>
   * Git repo configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.GitConfig git = 7;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1.GitConfigOrBuilder getGitOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies whether the Config Sync Repo is
   * in “hierarchical” or “unstructured” mode.
   * </pre>
   *
   * <code>string source_format = 8;</code>
   *
   * @return The sourceFormat.
   */
  java.lang.String getSourceFormat();
  /**
   *
   *
   * <pre>
   * Specifies whether the Config Sync Repo is
   * in “hierarchical” or “unstructured” mode.
   * </pre>
   *
   * <code>string source_format = 8;</code>
   *
   * @return The bytes for sourceFormat.
   */
  com.google.protobuf.ByteString getSourceFormatBytes();
}
