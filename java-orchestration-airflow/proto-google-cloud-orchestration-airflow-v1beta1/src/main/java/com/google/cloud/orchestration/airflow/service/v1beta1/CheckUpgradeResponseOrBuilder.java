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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface CheckUpgradeResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Url for a docker build log of an upgraded image.
   * </pre>
   *
   * <code>string build_log_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The buildLogUri.
   */
  java.lang.String getBuildLogUri();
  /**
   *
   *
   * <pre>
   * Output only. Url for a docker build log of an upgraded image.
   * </pre>
   *
   * <code>string build_log_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for buildLogUri.
   */
  com.google.protobuf.ByteString getBuildLogUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Whether build has succeeded or failed on modules conflicts.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeResponse.ConflictResult contains_pypi_modules_conflict = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for containsPypiModulesConflict.
   */
  int getContainsPypiModulesConflictValue();
  /**
   *
   *
   * <pre>
   * Output only. Whether build has succeeded or failed on modules conflicts.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeResponse.ConflictResult contains_pypi_modules_conflict = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The containsPypiModulesConflict.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeResponse.ConflictResult
      getContainsPypiModulesConflict();

  /**
   *
   *
   * <pre>
   * Output only. Extract from a docker image build log containing information about pypi
   * modules conflicts.
   * </pre>
   *
   * <code>string pypi_conflict_build_log_extract = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pypiConflictBuildLogExtract.
   */
  java.lang.String getPypiConflictBuildLogExtract();
  /**
   *
   *
   * <pre>
   * Output only. Extract from a docker image build log containing information about pypi
   * modules conflicts.
   * </pre>
   *
   * <code>string pypi_conflict_build_log_extract = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for pypiConflictBuildLogExtract.
   */
  com.google.protobuf.ByteString getPypiConflictBuildLogExtractBytes();

  /**
   *
   *
   * <pre>
   * Composer image for which the build was happening.
   * </pre>
   *
   * <code>string image_version = 5;</code>
   *
   * @return The imageVersion.
   */
  java.lang.String getImageVersion();
  /**
   *
   *
   * <pre>
   * Composer image for which the build was happening.
   * </pre>
   *
   * <code>string image_version = 5;</code>
   *
   * @return The bytes for imageVersion.
   */
  com.google.protobuf.ByteString getImageVersionBytes();

  /**
   *
   *
   * <pre>
   * Pypi dependencies specified in the environment configuration, at the time
   * when the build was triggered.
   * </pre>
   *
   * <code>map&lt;string, string&gt; pypi_dependencies = 6;</code>
   */
  int getPypiDependenciesCount();
  /**
   *
   *
   * <pre>
   * Pypi dependencies specified in the environment configuration, at the time
   * when the build was triggered.
   * </pre>
   *
   * <code>map&lt;string, string&gt; pypi_dependencies = 6;</code>
   */
  boolean containsPypiDependencies(java.lang.String key);
  /** Use {@link #getPypiDependenciesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getPypiDependencies();
  /**
   *
   *
   * <pre>
   * Pypi dependencies specified in the environment configuration, at the time
   * when the build was triggered.
   * </pre>
   *
   * <code>map&lt;string, string&gt; pypi_dependencies = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getPypiDependenciesMap();
  /**
   *
   *
   * <pre>
   * Pypi dependencies specified in the environment configuration, at the time
   * when the build was triggered.
   * </pre>
   *
   * <code>map&lt;string, string&gt; pypi_dependencies = 6;</code>
   */

  /* nullable */
  java.lang.String getPypiDependenciesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Pypi dependencies specified in the environment configuration, at the time
   * when the build was triggered.
   * </pre>
   *
   * <code>map&lt;string, string&gt; pypi_dependencies = 6;</code>
   */
  java.lang.String getPypiDependenciesOrThrow(java.lang.String key);
}
