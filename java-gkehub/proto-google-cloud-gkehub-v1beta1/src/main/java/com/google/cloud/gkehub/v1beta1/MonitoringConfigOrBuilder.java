/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/gkehub/v1beta1/membership.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.v1beta1;

public interface MonitoringConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.MonitoringConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Project used to report Metrics
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Immutable. Project used to report Metrics
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Location used to report Metrics
   * </pre>
   *
   * <code>string location = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Immutable. Location used to report Metrics
   * </pre>
   *
   * <code>string location = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Cluster name used to report metrics.
   * For Anthos on VMWare/Baremetal, it would be in format
   * `memberClusters/cluster_name`; And for Anthos on MultiCloud, it would be in
   * format
   * `{azureClusters, awsClusters}/cluster_name`.
   * </pre>
   *
   * <code>string cluster = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   *
   *
   * <pre>
   * Immutable. Cluster name used to report metrics.
   * For Anthos on VMWare/Baremetal, it would be in format
   * `memberClusters/cluster_name`; And for Anthos on MultiCloud, it would be in
   * format
   * `{azureClusters, awsClusters}/cluster_name`.
   * </pre>
   *
   * <code>string cluster = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString getClusterBytes();

  /**
   *
   *
   * <pre>
   * Kubernetes system metrics, if available, are written to this prefix.
   * This defaults to kubernetes.io for GKE, and kubernetes.io/anthos for Anthos
   * eventually. Noted: Anthos MultiCloud will have kubernetes.io prefix today
   * but will migration to be under kubernetes.io/anthos
   * </pre>
   *
   * <code>string kubernetes_metrics_prefix = 4;</code>
   *
   * @return The kubernetesMetricsPrefix.
   */
  java.lang.String getKubernetesMetricsPrefix();
  /**
   *
   *
   * <pre>
   * Kubernetes system metrics, if available, are written to this prefix.
   * This defaults to kubernetes.io for GKE, and kubernetes.io/anthos for Anthos
   * eventually. Noted: Anthos MultiCloud will have kubernetes.io prefix today
   * but will migration to be under kubernetes.io/anthos
   * </pre>
   *
   * <code>string kubernetes_metrics_prefix = 4;</code>
   *
   * @return The bytes for kubernetesMetricsPrefix.
   */
  com.google.protobuf.ByteString getKubernetesMetricsPrefixBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Cluster hash, this is a unique string generated by google code,
   * which does not contain any PII, which we can use to reference the cluster.
   * This is expected to be created by the monitoring stack and persisted into
   * the Cluster object as well as to GKE-Hub.
   * </pre>
   *
   * <code>string cluster_hash = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The clusterHash.
   */
  java.lang.String getClusterHash();
  /**
   *
   *
   * <pre>
   * Immutable. Cluster hash, this is a unique string generated by google code,
   * which does not contain any PII, which we can use to reference the cluster.
   * This is expected to be created by the monitoring stack and persisted into
   * the Cluster object as well as to GKE-Hub.
   * </pre>
   *
   * <code>string cluster_hash = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for clusterHash.
   */
  com.google.protobuf.ByteString getClusterHashBytes();
}
