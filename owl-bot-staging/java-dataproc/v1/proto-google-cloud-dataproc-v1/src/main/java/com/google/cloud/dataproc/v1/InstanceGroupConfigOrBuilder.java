// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface InstanceGroupConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.InstanceGroupConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The number of VM instances in the instance group.
   * For [HA
   * cluster](/dataproc/docs/concepts/configuring-clusters/high-availability)
   * [master_config](#FIELDS.master_config) groups, **must be set to 3**.
   * For standard cluster [master_config](#FIELDS.master_config) groups,
   * **must be set to 1**.
   * </pre>
   *
   * <code>int32 num_instances = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The numInstances.
   */
  int getNumInstances();

  /**
   * <pre>
   * Output only. The list of instance names. Dataproc derives the names
   * from `cluster_name`, `num_instances`, and the instance group.
   * </pre>
   *
   * <code>repeated string instance_names = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the instanceNames.
   */
  java.util.List<java.lang.String>
      getInstanceNamesList();
  /**
   * <pre>
   * Output only. The list of instance names. Dataproc derives the names
   * from `cluster_name`, `num_instances`, and the instance group.
   * </pre>
   *
   * <code>repeated string instance_names = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of instanceNames.
   */
  int getInstanceNamesCount();
  /**
   * <pre>
   * Output only. The list of instance names. Dataproc derives the names
   * from `cluster_name`, `num_instances`, and the instance group.
   * </pre>
   *
   * <code>repeated string instance_names = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The instanceNames at the given index.
   */
  java.lang.String getInstanceNames(int index);
  /**
   * <pre>
   * Output only. The list of instance names. Dataproc derives the names
   * from `cluster_name`, `num_instances`, and the instance group.
   * </pre>
   *
   * <code>repeated string instance_names = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the instanceNames at the given index.
   */
  com.google.protobuf.ByteString
      getInstanceNamesBytes(int index);

  /**
   * <pre>
   * Optional. The Compute Engine image resource used for cluster instances.
   * The URI can represent an image or image family.
   * Image examples:
   * * `https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id]`
   * * `projects/[project_id]/global/images/[image-id]`
   * * `image-id`
   * Image family examples. Dataproc will use the most recent
   * image from the family:
   * * `https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name]`
   * * `projects/[project_id]/global/images/family/[custom-image-family-name]`
   * If the URI is unspecified, it will be inferred from
   * `SoftwareConfig.image_version` or the system default.
   * </pre>
   *
   * <code>string image_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The imageUri.
   */
  java.lang.String getImageUri();
  /**
   * <pre>
   * Optional. The Compute Engine image resource used for cluster instances.
   * The URI can represent an image or image family.
   * Image examples:
   * * `https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id]`
   * * `projects/[project_id]/global/images/[image-id]`
   * * `image-id`
   * Image family examples. Dataproc will use the most recent
   * image from the family:
   * * `https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name]`
   * * `projects/[project_id]/global/images/family/[custom-image-family-name]`
   * If the URI is unspecified, it will be inferred from
   * `SoftwareConfig.image_version` or the system default.
   * </pre>
   *
   * <code>string image_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for imageUri.
   */
  com.google.protobuf.ByteString
      getImageUriBytes();

  /**
   * <pre>
   * Optional. The Compute Engine machine type used for cluster instances.
   * A full URL, partial URI, or short name are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2`
   * * `projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2`
   * * `n1-standard-2`
   * **Auto Zone Exception**: If you are using the Dataproc
   * [Auto Zone
   * Placement](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
   * feature, you must use the short name of the machine type
   * resource, for example, `n1-standard-2`.
   * </pre>
   *
   * <code>string machine_type_uri = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The machineTypeUri.
   */
  java.lang.String getMachineTypeUri();
  /**
   * <pre>
   * Optional. The Compute Engine machine type used for cluster instances.
   * A full URL, partial URI, or short name are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2`
   * * `projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2`
   * * `n1-standard-2`
   * **Auto Zone Exception**: If you are using the Dataproc
   * [Auto Zone
   * Placement](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
   * feature, you must use the short name of the machine type
   * resource, for example, `n1-standard-2`.
   * </pre>
   *
   * <code>string machine_type_uri = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for machineTypeUri.
   */
  com.google.protobuf.ByteString
      getMachineTypeUriBytes();

  /**
   * <pre>
   * Optional. Disk option config settings.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.DiskConfig disk_config = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the diskConfig field is set.
   */
  boolean hasDiskConfig();
  /**
   * <pre>
   * Optional. Disk option config settings.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.DiskConfig disk_config = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The diskConfig.
   */
  com.google.cloud.dataproc.v1.DiskConfig getDiskConfig();
  /**
   * <pre>
   * Optional. Disk option config settings.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.DiskConfig disk_config = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.DiskConfigOrBuilder getDiskConfigOrBuilder();

  /**
   * <pre>
   * Output only. Specifies that this instance group contains preemptible
   * instances.
   * </pre>
   *
   * <code>bool is_preemptible = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The isPreemptible.
   */
  boolean getIsPreemptible();

  /**
   * <pre>
   * Optional. Specifies the preemptibility of the instance group.
   * The default value for master and worker groups is
   * `NON_PREEMPTIBLE`. This default cannot be changed.
   * The default value for secondary instances is
   * `PREEMPTIBLE`.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig.Preemptibility preemptibility = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for preemptibility.
   */
  int getPreemptibilityValue();
  /**
   * <pre>
   * Optional. Specifies the preemptibility of the instance group.
   * The default value for master and worker groups is
   * `NON_PREEMPTIBLE`. This default cannot be changed.
   * The default value for secondary instances is
   * `PREEMPTIBLE`.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig.Preemptibility preemptibility = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The preemptibility.
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfig.Preemptibility getPreemptibility();

  /**
   * <pre>
   * Output only. The config for Compute Engine Instance Group
   * Manager that manages this group.
   * This is only used for preemptible instance groups.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ManagedGroupConfig managed_group_config = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the managedGroupConfig field is set.
   */
  boolean hasManagedGroupConfig();
  /**
   * <pre>
   * Output only. The config for Compute Engine Instance Group
   * Manager that manages this group.
   * This is only used for preemptible instance groups.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ManagedGroupConfig managed_group_config = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The managedGroupConfig.
   */
  com.google.cloud.dataproc.v1.ManagedGroupConfig getManagedGroupConfig();
  /**
   * <pre>
   * Output only. The config for Compute Engine Instance Group
   * Manager that manages this group.
   * This is only used for preemptible instance groups.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ManagedGroupConfig managed_group_config = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataproc.v1.ManagedGroupConfigOrBuilder getManagedGroupConfigOrBuilder();

  /**
   * <pre>
   * Optional. The Compute Engine accelerator configuration for these
   * instances.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AcceleratorConfig accelerators = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.dataproc.v1.AcceleratorConfig> 
      getAcceleratorsList();
  /**
   * <pre>
   * Optional. The Compute Engine accelerator configuration for these
   * instances.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AcceleratorConfig accelerators = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.AcceleratorConfig getAccelerators(int index);
  /**
   * <pre>
   * Optional. The Compute Engine accelerator configuration for these
   * instances.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AcceleratorConfig accelerators = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getAcceleratorsCount();
  /**
   * <pre>
   * Optional. The Compute Engine accelerator configuration for these
   * instances.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AcceleratorConfig accelerators = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.AcceleratorConfigOrBuilder> 
      getAcceleratorsOrBuilderList();
  /**
   * <pre>
   * Optional. The Compute Engine accelerator configuration for these
   * instances.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AcceleratorConfig accelerators = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.AcceleratorConfigOrBuilder getAcceleratorsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Specifies the minimum cpu platform for the Instance Group.
   * See [Dataproc -&gt; Minimum CPU
   * Platform](https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
   * </pre>
   *
   * <code>string min_cpu_platform = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The minCpuPlatform.
   */
  java.lang.String getMinCpuPlatform();
  /**
   * <pre>
   * Optional. Specifies the minimum cpu platform for the Instance Group.
   * See [Dataproc -&gt; Minimum CPU
   * Platform](https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
   * </pre>
   *
   * <code>string min_cpu_platform = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for minCpuPlatform.
   */
  com.google.protobuf.ByteString
      getMinCpuPlatformBytes();
}
