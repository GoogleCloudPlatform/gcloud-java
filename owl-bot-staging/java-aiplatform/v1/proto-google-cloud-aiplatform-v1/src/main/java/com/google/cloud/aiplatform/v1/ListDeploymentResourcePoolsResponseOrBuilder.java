// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/deployment_resource_pool_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListDeploymentResourcePoolsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The DeploymentResourcePools from the specified location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.DeploymentResourcePool> 
      getDeploymentResourcePoolsList();
  /**
   * <pre>
   * The DeploymentResourcePools from the specified location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
   */
  com.google.cloud.aiplatform.v1.DeploymentResourcePool getDeploymentResourcePools(int index);
  /**
   * <pre>
   * The DeploymentResourcePools from the specified location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
   */
  int getDeploymentResourcePoolsCount();
  /**
   * <pre>
   * The DeploymentResourcePools from the specified location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.DeploymentResourcePoolOrBuilder> 
      getDeploymentResourcePoolsOrBuilderList();
  /**
   * <pre>
   * The DeploymentResourcePools from the specified location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
   */
  com.google.cloud.aiplatform.v1.DeploymentResourcePoolOrBuilder getDeploymentResourcePoolsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
