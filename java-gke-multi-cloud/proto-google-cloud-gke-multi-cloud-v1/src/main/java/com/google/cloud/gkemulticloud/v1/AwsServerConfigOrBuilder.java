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
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AwsServerConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AwsServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the config.
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
   * The resource name of the config.
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
   * List of all released Kubernetes versions, including ones which are end of
   * life and can no longer be used.  Filter by the `enabled`
   * property to limit to currently available versions.
   * Valid versions supported for both create and update operations
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsK8sVersionInfo valid_versions = 2;</code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.AwsK8sVersionInfo> getValidVersionsList();
  /**
   *
   *
   * <pre>
   * List of all released Kubernetes versions, including ones which are end of
   * life and can no longer be used.  Filter by the `enabled`
   * property to limit to currently available versions.
   * Valid versions supported for both create and update operations
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsK8sVersionInfo valid_versions = 2;</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsK8sVersionInfo getValidVersions(int index);
  /**
   *
   *
   * <pre>
   * List of all released Kubernetes versions, including ones which are end of
   * life and can no longer be used.  Filter by the `enabled`
   * property to limit to currently available versions.
   * Valid versions supported for both create and update operations
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsK8sVersionInfo valid_versions = 2;</code>
   */
  int getValidVersionsCount();
  /**
   *
   *
   * <pre>
   * List of all released Kubernetes versions, including ones which are end of
   * life and can no longer be used.  Filter by the `enabled`
   * property to limit to currently available versions.
   * Valid versions supported for both create and update operations
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsK8sVersionInfo valid_versions = 2;</code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.AwsK8sVersionInfoOrBuilder>
      getValidVersionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of all released Kubernetes versions, including ones which are end of
   * life and can no longer be used.  Filter by the `enabled`
   * property to limit to currently available versions.
   * Valid versions supported for both create and update operations
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsK8sVersionInfo valid_versions = 2;</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsK8sVersionInfoOrBuilder getValidVersionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The list of supported AWS regions.
   * </pre>
   *
   * <code>repeated string supported_aws_regions = 3;</code>
   *
   * @return A list containing the supportedAwsRegions.
   */
  java.util.List<java.lang.String> getSupportedAwsRegionsList();
  /**
   *
   *
   * <pre>
   * The list of supported AWS regions.
   * </pre>
   *
   * <code>repeated string supported_aws_regions = 3;</code>
   *
   * @return The count of supportedAwsRegions.
   */
  int getSupportedAwsRegionsCount();
  /**
   *
   *
   * <pre>
   * The list of supported AWS regions.
   * </pre>
   *
   * <code>repeated string supported_aws_regions = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The supportedAwsRegions at the given index.
   */
  java.lang.String getSupportedAwsRegions(int index);
  /**
   *
   *
   * <pre>
   * The list of supported AWS regions.
   * </pre>
   *
   * <code>repeated string supported_aws_regions = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the supportedAwsRegions at the given index.
   */
  com.google.protobuf.ByteString getSupportedAwsRegionsBytes(int index);
}
