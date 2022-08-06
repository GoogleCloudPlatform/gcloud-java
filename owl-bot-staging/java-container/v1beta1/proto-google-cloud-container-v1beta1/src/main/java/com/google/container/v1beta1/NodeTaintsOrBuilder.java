// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface NodeTaintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NodeTaints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of node taints.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
   */
  java.util.List<com.google.container.v1beta1.NodeTaint> 
      getTaintsList();
  /**
   * <pre>
   * List of node taints.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
   */
  com.google.container.v1beta1.NodeTaint getTaints(int index);
  /**
   * <pre>
   * List of node taints.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
   */
  int getTaintsCount();
  /**
   * <pre>
   * List of node taints.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.NodeTaintOrBuilder> 
      getTaintsOrBuilderList();
  /**
   * <pre>
   * List of node taints.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 1;</code>
   */
  com.google.container.v1beta1.NodeTaintOrBuilder getTaintsOrBuilder(
      int index);
}
