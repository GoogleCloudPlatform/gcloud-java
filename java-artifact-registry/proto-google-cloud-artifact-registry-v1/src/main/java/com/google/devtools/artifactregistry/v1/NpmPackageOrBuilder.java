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
// source: google/devtools/artifactregistry/v1/artifact.proto

package com.google.devtools.artifactregistry.v1;

public interface NpmPackageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.NpmPackage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. registry_location, project_id, repository_name and npm_package
   * forms a unique package For example,
   * "projects/test-project/locations/us-west4/repositories/test-repo/npmPackages/
   * npm_test:1.0.0",
   * where "us-west4" is the registry_location, "test-project" is the
   * project_id, "test-repo" is the repository_name and
   * npm_test:1.0.0" is the npm package.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. registry_location, project_id, repository_name and npm_package
   * forms a unique package For example,
   * "projects/test-project/locations/us-west4/repositories/test-repo/npmPackages/
   * npm_test:1.0.0",
   * where "us-west4" is the registry_location, "test-project" is the
   * project_id, "test-repo" is the repository_name and
   * npm_test:1.0.0" is the npm package.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Package for the artifact.
   * </pre>
   *
   * <code>string package_name = 3;</code>
   *
   * @return The packageName.
   */
  java.lang.String getPackageName();
  /**
   *
   *
   * <pre>
   * Package for the artifact.
   * </pre>
   *
   * <code>string package_name = 3;</code>
   *
   * @return The bytes for packageName.
   */
  com.google.protobuf.ByteString getPackageNameBytes();

  /**
   *
   *
   * <pre>
   * Version of this package.
   * </pre>
   *
   * <code>string version = 4;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Version of this package.
   * </pre>
   *
   * <code>string version = 4;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Tags attached to this package.
   * </pre>
   *
   * <code>repeated string tags = 5;</code>
   *
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String> getTagsList();
  /**
   *
   *
   * <pre>
   * Tags attached to this package.
   * </pre>
   *
   * <code>repeated string tags = 5;</code>
   *
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * Tags attached to this package.
   * </pre>
   *
   * <code>repeated string tags = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   *
   *
   * <pre>
   * Tags attached to this package.
   * </pre>
   *
   * <code>repeated string tags = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString getTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Time the package was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the package was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the package was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time the package was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the package was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the package was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
