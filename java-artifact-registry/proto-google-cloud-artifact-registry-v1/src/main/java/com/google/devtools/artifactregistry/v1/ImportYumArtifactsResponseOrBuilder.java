/*
 * Copyright 2023 Google LLC
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
// source: google/devtools/artifactregistry/v1/yum_artifact.proto

package com.google.devtools.artifactregistry.v1;

public interface ImportYumArtifactsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.ImportYumArtifactsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The yum artifacts imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.YumArtifact yum_artifacts = 1;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1.YumArtifact> getYumArtifactsList();
  /**
   *
   *
   * <pre>
   * The yum artifacts imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.YumArtifact yum_artifacts = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.YumArtifact getYumArtifacts(int index);
  /**
   *
   *
   * <pre>
   * The yum artifacts imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.YumArtifact yum_artifacts = 1;</code>
   */
  int getYumArtifactsCount();
  /**
   *
   *
   * <pre>
   * The yum artifacts imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.YumArtifact yum_artifacts = 1;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1.YumArtifactOrBuilder>
      getYumArtifactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The yum artifacts imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.YumArtifact yum_artifacts = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.YumArtifactOrBuilder getYumArtifactsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Detailed error info for packages that were not imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo errors = 2;
   * </code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo>
      getErrorsList();
  /**
   *
   *
   * <pre>
   * Detailed error info for packages that were not imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo errors = 2;
   * </code>
   */
  com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo getErrors(int index);
  /**
   *
   *
   * <pre>
   * Detailed error info for packages that were not imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo errors = 2;
   * </code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Detailed error info for packages that were not imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo errors = 2;
   * </code>
   */
  java.util.List<
          ? extends com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfoOrBuilder>
      getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Detailed error info for packages that were not imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo errors = 2;
   * </code>
   */
  com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfoOrBuilder getErrorsOrBuilder(
      int index);
}
