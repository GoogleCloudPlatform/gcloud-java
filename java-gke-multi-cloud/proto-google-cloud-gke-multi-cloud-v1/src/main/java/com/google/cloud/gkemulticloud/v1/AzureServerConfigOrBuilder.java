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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AzureServerConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The `AzureServerConfig` resource name.
   *
   * `AzureServerConfig` names are formatted as
   * `projects/&lt;project-number&gt;/locations/&lt;region&gt;/azureServerConfig`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud Platform resource names.
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
   * The `AzureServerConfig` resource name.
   *
   * `AzureServerConfig` names are formatted as
   * `projects/&lt;project-number&gt;/locations/&lt;region&gt;/azureServerConfig`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud Platform resource names.
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
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureK8sVersionInfo valid_versions = 2;</code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.AzureK8sVersionInfo> getValidVersionsList();
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
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureK8sVersionInfo valid_versions = 2;</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureK8sVersionInfo getValidVersions(int index);
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
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureK8sVersionInfo valid_versions = 2;</code>
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
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureK8sVersionInfo valid_versions = 2;</code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.AzureK8sVersionInfoOrBuilder>
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
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureK8sVersionInfo valid_versions = 2;</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureK8sVersionInfoOrBuilder getValidVersionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The list of supported Azure regions.
   * </pre>
   *
   * <code>repeated string supported_azure_regions = 3;</code>
   *
   * @return A list containing the supportedAzureRegions.
   */
  java.util.List<java.lang.String> getSupportedAzureRegionsList();
  /**
   *
   *
   * <pre>
   * The list of supported Azure regions.
   * </pre>
   *
   * <code>repeated string supported_azure_regions = 3;</code>
   *
   * @return The count of supportedAzureRegions.
   */
  int getSupportedAzureRegionsCount();
  /**
   *
   *
   * <pre>
   * The list of supported Azure regions.
   * </pre>
   *
   * <code>repeated string supported_azure_regions = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The supportedAzureRegions at the given index.
   */
  java.lang.String getSupportedAzureRegions(int index);
  /**
   *
   *
   * <pre>
   * The list of supported Azure regions.
   * </pre>
   *
   * <code>repeated string supported_azure_regions = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the supportedAzureRegions at the given index.
   */
  com.google.protobuf.ByteString getSupportedAzureRegionsBytes(int index);
}
