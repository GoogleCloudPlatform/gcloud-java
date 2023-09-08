// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha2/membership.proto

package com.google.cloud.gkehub.v1alpha2;

public interface MultiCloudClusterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1alpha2.MultiCloudCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For
   * example:
   *
   *  //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster
   *  //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The resourceLink.
   */
  java.lang.String getResourceLink();
  /**
   * <pre>
   * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For
   * example:
   *
   *  //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster
   *  //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for resourceLink.
   */
  com.google.protobuf.ByteString
      getResourceLinkBytes();

  /**
   * <pre>
   * Output only. If cluster_missing is set then it denotes that
   * API(gkemulticloud.googleapis.com) resource for this GKE Multi-Cloud cluster
   * no longer exists.
   * </pre>
   *
   * <code>bool cluster_missing = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The clusterMissing.
   */
  boolean getClusterMissing();
}
