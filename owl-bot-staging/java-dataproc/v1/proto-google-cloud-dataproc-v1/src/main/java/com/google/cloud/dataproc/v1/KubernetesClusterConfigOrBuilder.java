// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

public interface KubernetesClusterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.KubernetesClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. A namespace within the Kubernetes cluster to deploy into. If this
   * namespace does not exist, it is created. If it exists, Dataproc verifies
   * that another Dataproc VirtualCluster is not installed into it. If not
   * specified, the name of the Dataproc Cluster is used.
   * </pre>
   *
   * <code>string kubernetes_namespace = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The kubernetesNamespace.
   */
  java.lang.String getKubernetesNamespace();
  /**
   * <pre>
   * Optional. A namespace within the Kubernetes cluster to deploy into. If this
   * namespace does not exist, it is created. If it exists, Dataproc verifies
   * that another Dataproc VirtualCluster is not installed into it. If not
   * specified, the name of the Dataproc Cluster is used.
   * </pre>
   *
   * <code>string kubernetes_namespace = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for kubernetesNamespace.
   */
  com.google.protobuf.ByteString
      getKubernetesNamespaceBytes();

  /**
   * <pre>
   * Required. The configuration for running the Dataproc cluster on GKE.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.GkeClusterConfig gke_cluster_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the gkeClusterConfig field is set.
   */
  boolean hasGkeClusterConfig();
  /**
   * <pre>
   * Required. The configuration for running the Dataproc cluster on GKE.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.GkeClusterConfig gke_cluster_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gkeClusterConfig.
   */
  com.google.cloud.dataproc.v1.GkeClusterConfig getGkeClusterConfig();
  /**
   * <pre>
   * Required. The configuration for running the Dataproc cluster on GKE.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.GkeClusterConfig gke_cluster_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataproc.v1.GkeClusterConfigOrBuilder getGkeClusterConfigOrBuilder();

  /**
   * <pre>
   * Optional. The software configuration for this Dataproc cluster running on
   * Kubernetes.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KubernetesSoftwareConfig kubernetes_software_config = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the kubernetesSoftwareConfig field is set.
   */
  boolean hasKubernetesSoftwareConfig();
  /**
   * <pre>
   * Optional. The software configuration for this Dataproc cluster running on
   * Kubernetes.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KubernetesSoftwareConfig kubernetes_software_config = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The kubernetesSoftwareConfig.
   */
  com.google.cloud.dataproc.v1.KubernetesSoftwareConfig getKubernetesSoftwareConfig();
  /**
   * <pre>
   * Optional. The software configuration for this Dataproc cluster running on
   * Kubernetes.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KubernetesSoftwareConfig kubernetes_software_config = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.KubernetesSoftwareConfigOrBuilder getKubernetesSoftwareConfigOrBuilder();

  public com.google.cloud.dataproc.v1.KubernetesClusterConfig.ConfigCase getConfigCase();
}
