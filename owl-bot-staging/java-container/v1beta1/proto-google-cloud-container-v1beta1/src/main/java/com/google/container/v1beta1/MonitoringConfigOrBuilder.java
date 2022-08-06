// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface MonitoringConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.MonitoringConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
   * @return Whether the componentConfig field is set.
   */
  boolean hasComponentConfig();
  /**
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
   * @return The componentConfig.
   */
  com.google.container.v1beta1.MonitoringComponentConfig getComponentConfig();
  /**
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
   */
  com.google.container.v1beta1.MonitoringComponentConfigOrBuilder getComponentConfigOrBuilder();

  /**
   * <pre>
   * Enable Google Cloud Managed Service for Prometheus
   * in the cluster.
   * </pre>
   *
   * <code>.google.container.v1beta1.ManagedPrometheusConfig managed_prometheus_config = 2;</code>
   * @return Whether the managedPrometheusConfig field is set.
   */
  boolean hasManagedPrometheusConfig();
  /**
   * <pre>
   * Enable Google Cloud Managed Service for Prometheus
   * in the cluster.
   * </pre>
   *
   * <code>.google.container.v1beta1.ManagedPrometheusConfig managed_prometheus_config = 2;</code>
   * @return The managedPrometheusConfig.
   */
  com.google.container.v1beta1.ManagedPrometheusConfig getManagedPrometheusConfig();
  /**
   * <pre>
   * Enable Google Cloud Managed Service for Prometheus
   * in the cluster.
   * </pre>
   *
   * <code>.google.container.v1beta1.ManagedPrometheusConfig managed_prometheus_config = 2;</code>
   */
  com.google.container.v1beta1.ManagedPrometheusConfigOrBuilder getManagedPrometheusConfigOrBuilder();
}
