// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1alpha;

public interface HierarchyControllerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether Hierarchy Controller is enabled in this cluster.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * Whether pod tree labels are enabled in this cluster.
   * </pre>
   *
   * <code>bool enable_pod_tree_labels = 2;</code>
   * @return The enablePodTreeLabels.
   */
  boolean getEnablePodTreeLabels();

  /**
   * <pre>
   * Whether hierarchical resource quota is enabled in this cluster.
   * </pre>
   *
   * <code>bool enable_hierarchical_resource_quota = 3;</code>
   * @return The enableHierarchicalResourceQuota.
   */
  boolean getEnableHierarchicalResourceQuota();
}
