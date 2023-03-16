// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/edgecontainer/v1/service.proto

package com.google.cloud.edgecontainer.v1;

public interface ListClustersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.ListClustersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Clusters in the location.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Cluster clusters = 1;</code>
   */
  java.util.List<com.google.cloud.edgecontainer.v1.Cluster> 
      getClustersList();
  /**
   * <pre>
   * Clusters in the location.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Cluster clusters = 1;</code>
   */
  com.google.cloud.edgecontainer.v1.Cluster getClusters(int index);
  /**
   * <pre>
   * Clusters in the location.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Cluster clusters = 1;</code>
   */
  int getClustersCount();
  /**
   * <pre>
   * Clusters in the location.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Cluster clusters = 1;</code>
   */
  java.util.List<? extends com.google.cloud.edgecontainer.v1.ClusterOrBuilder> 
      getClustersOrBuilderList();
  /**
   * <pre>
   * Clusters in the location.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Cluster clusters = 1;</code>
   */
  com.google.cloud.edgecontainer.v1.ClusterOrBuilder getClustersOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
