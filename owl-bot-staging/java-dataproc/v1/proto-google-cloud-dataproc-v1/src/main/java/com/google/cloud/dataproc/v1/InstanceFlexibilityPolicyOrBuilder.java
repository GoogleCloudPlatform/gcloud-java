// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface InstanceFlexibilityPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.InstanceFlexibilityPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. List of instance selection options that the group will use when
   * creating new VMs.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection instance_selection_list = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection> 
      getInstanceSelectionListList();
  /**
   * <pre>
   * Optional. List of instance selection options that the group will use when
   * creating new VMs.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection instance_selection_list = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection getInstanceSelectionList(int index);
  /**
   * <pre>
   * Optional. List of instance selection options that the group will use when
   * creating new VMs.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection instance_selection_list = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getInstanceSelectionListCount();
  /**
   * <pre>
   * Optional. List of instance selection options that the group will use when
   * creating new VMs.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection instance_selection_list = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionOrBuilder> 
      getInstanceSelectionListOrBuilderList();
  /**
   * <pre>
   * Optional. List of instance selection options that the group will use when
   * creating new VMs.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelection instance_selection_list = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionOrBuilder getInstanceSelectionListOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. A list of instance selection results in the group.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult instance_selection_results = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult> 
      getInstanceSelectionResultsList();
  /**
   * <pre>
   * Output only. A list of instance selection results in the group.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult instance_selection_results = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult getInstanceSelectionResults(int index);
  /**
   * <pre>
   * Output only. A list of instance selection results in the group.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult instance_selection_results = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getInstanceSelectionResultsCount();
  /**
   * <pre>
   * Output only. A list of instance selection results in the group.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult instance_selection_results = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResultOrBuilder> 
      getInstanceSelectionResultsOrBuilderList();
  /**
   * <pre>
   * Output only. A list of instance selection results in the group.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResult instance_selection_results = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataproc.v1.InstanceFlexibilityPolicy.InstanceSelectionResultOrBuilder getInstanceSelectionResultsOrBuilder(
      int index);
}
