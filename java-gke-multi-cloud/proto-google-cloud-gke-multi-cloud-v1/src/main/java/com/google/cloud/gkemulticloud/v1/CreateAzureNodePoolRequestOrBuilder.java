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
// source: google/cloud/gkemulticloud/v1/azure_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface CreateAzureNodePoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.CreateAzureNodePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster]
   * resource where this node pool will be created.
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster]
   * resource where this node pool will be created.
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The specification of the
   * [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pool = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the azureNodePool field is set.
   */
  boolean hasAzureNodePool();
  /**
   *
   *
   * <pre>
   * Required. The specification of the
   * [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pool = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The azureNodePool.
   */
  com.google.cloud.gkemulticloud.v1.AzureNodePool getAzureNodePool();
  /**
   *
   *
   * <pre>
   * Required. The specification of the
   * [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pool = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureNodePoolOrBuilder getAzureNodePoolOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A client provided ID the resource. Must be unique within the
   * parent resource.
   * The provided ID will be part of the
   * [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool] resource name
   * formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/azureClusters/&lt;cluster-id&gt;/azureNodePools/&lt;node-pool-id&gt;`.
   * Valid characters are `/[a-z][0-9]-/`. Cannot be longer than 63 characters.
   * </pre>
   *
   * <code>string azure_node_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The azureNodePoolId.
   */
  java.lang.String getAzureNodePoolId();
  /**
   *
   *
   * <pre>
   * Required. A client provided ID the resource. Must be unique within the
   * parent resource.
   * The provided ID will be part of the
   * [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool] resource name
   * formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/azureClusters/&lt;cluster-id&gt;/azureNodePools/&lt;node-pool-id&gt;`.
   * Valid characters are `/[a-z][0-9]-/`. Cannot be longer than 63 characters.
   * </pre>
   *
   * <code>string azure_node_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for azureNodePoolId.
   */
  com.google.protobuf.ByteString getAzureNodePoolIdBytes();

  /**
   *
   *
   * <pre>
   * If set, only validate the request, but do not actually create the node
   * pool.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
