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
// source: google/cloud/gkemulticloud/v1/aws_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface ListAwsNodePoolsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
   * resources in the specified `AwsCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.AwsNodePool> getAwsNodePoolsList();
  /**
   *
   *
   * <pre>
   * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
   * resources in the specified `AwsCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsNodePool getAwsNodePools(int index);
  /**
   *
   *
   * <pre>
   * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
   * resources in the specified `AwsCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
   */
  int getAwsNodePoolsCount();
  /**
   *
   *
   * <pre>
   * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
   * resources in the specified `AwsCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.AwsNodePoolOrBuilder>
      getAwsNodePoolsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
   * resources in the specified `AwsCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsNodePoolOrBuilder getAwsNodePoolsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
