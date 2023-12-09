// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/feature_online_store_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface NearestNeighborsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.NearestNeighbors)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All its neighbors.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NearestNeighbors.Neighbor neighbors = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.NearestNeighbors.Neighbor> 
      getNeighborsList();
  /**
   * <pre>
   * All its neighbors.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NearestNeighbors.Neighbor neighbors = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.NearestNeighbors.Neighbor getNeighbors(int index);
  /**
   * <pre>
   * All its neighbors.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NearestNeighbors.Neighbor neighbors = 1;</code>
   */
  int getNeighborsCount();
  /**
   * <pre>
   * All its neighbors.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NearestNeighbors.Neighbor neighbors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.NearestNeighbors.NeighborOrBuilder> 
      getNeighborsOrBuilderList();
  /**
   * <pre>
   * All its neighbors.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NearestNeighbors.Neighbor neighbors = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.NearestNeighbors.NeighborOrBuilder getNeighborsOrBuilder(
      int index);
}
