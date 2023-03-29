/*
 * Copyright 2020 Google LLC
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
// source: google/dataflow/v1beta3/environment.proto

package com.google.dataflow.v1beta3;

public interface WorkerPoolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.WorkerPool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The kind of the worker pool; currently only `harness` and `shuffle`
   * are supported.
   * </pre>
   *
   * <code>string kind = 1;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * The kind of the worker pool; currently only `harness` and `shuffle`
   * are supported.
   * </pre>
   *
   * <code>string kind = 1;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Number of Google Compute Engine workers in this pool needed to
   * execute the job.  If zero or unspecified, the service will
   * attempt to choose a reasonable default.
   * </pre>
   *
   * <code>int32 num_workers = 2;</code>
   *
   * @return The numWorkers.
   */
  int getNumWorkers();

  /**
   *
   *
   * <pre>
   * Packages to be installed on workers.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Package packages = 3;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.Package> getPackagesList();
  /**
   *
   *
   * <pre>
   * Packages to be installed on workers.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Package packages = 3;</code>
   */
  com.google.dataflow.v1beta3.Package getPackages(int index);
  /**
   *
   *
   * <pre>
   * Packages to be installed on workers.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Package packages = 3;</code>
   */
  int getPackagesCount();
  /**
   *
   *
   * <pre>
   * Packages to be installed on workers.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Package packages = 3;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.PackageOrBuilder> getPackagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Packages to be installed on workers.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Package packages = 3;</code>
   */
  com.google.dataflow.v1beta3.PackageOrBuilder getPackagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The default package set to install.  This allows the service to
   * select a default set of packages which are useful to worker
   * harnesses written in a particular language.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.DefaultPackageSet default_package_set = 4;</code>
   *
   * @return The enum numeric value on the wire for defaultPackageSet.
   */
  int getDefaultPackageSetValue();
  /**
   *
   *
   * <pre>
   * The default package set to install.  This allows the service to
   * select a default set of packages which are useful to worker
   * harnesses written in a particular language.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.DefaultPackageSet default_package_set = 4;</code>
   *
   * @return The defaultPackageSet.
   */
  com.google.dataflow.v1beta3.DefaultPackageSet getDefaultPackageSet();

  /**
   *
   *
   * <pre>
   * Machine type (e.g. "n1-standard-1").  If empty or unspecified, the
   * service will attempt to choose a reasonable default.
   * </pre>
   *
   * <code>string machine_type = 5;</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Machine type (e.g. "n1-standard-1").  If empty or unspecified, the
   * service will attempt to choose a reasonable default.
   * </pre>
   *
   * <code>string machine_type = 5;</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * Sets the policy for determining when to turndown worker pool.
   * Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and
   * `TEARDOWN_NEVER`.
   * `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether
   * the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down
   * if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn
   * down.
   * If the workers are not torn down by the service, they will
   * continue to run and use Google Compute Engine VM resources in the
   * user's project until they are explicitly terminated by the user.
   * Because of this, Google recommends using the `TEARDOWN_ALWAYS`
   * policy except for small, manually supervised test jobs.
   * If unknown or unspecified, the service will attempt to choose a reasonable
   * default.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.TeardownPolicy teardown_policy = 6;</code>
   *
   * @return The enum numeric value on the wire for teardownPolicy.
   */
  int getTeardownPolicyValue();
  /**
   *
   *
   * <pre>
   * Sets the policy for determining when to turndown worker pool.
   * Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and
   * `TEARDOWN_NEVER`.
   * `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether
   * the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down
   * if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn
   * down.
   * If the workers are not torn down by the service, they will
   * continue to run and use Google Compute Engine VM resources in the
   * user's project until they are explicitly terminated by the user.
   * Because of this, Google recommends using the `TEARDOWN_ALWAYS`
   * policy except for small, manually supervised test jobs.
   * If unknown or unspecified, the service will attempt to choose a reasonable
   * default.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.TeardownPolicy teardown_policy = 6;</code>
   *
   * @return The teardownPolicy.
   */
  com.google.dataflow.v1beta3.TeardownPolicy getTeardownPolicy();

  /**
   *
   *
   * <pre>
   * Size of root disk for VMs, in GB.  If zero or unspecified, the service will
   * attempt to choose a reasonable default.
   * </pre>
   *
   * <code>int32 disk_size_gb = 7;</code>
   *
   * @return The diskSizeGb.
   */
  int getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Type of root disk for VMs.  If empty or unspecified, the service will
   * attempt to choose a reasonable default.
   * </pre>
   *
   * <code>string disk_type = 16;</code>
   *
   * @return The diskType.
   */
  java.lang.String getDiskType();
  /**
   *
   *
   * <pre>
   * Type of root disk for VMs.  If empty or unspecified, the service will
   * attempt to choose a reasonable default.
   * </pre>
   *
   * <code>string disk_type = 16;</code>
   *
   * @return The bytes for diskType.
   */
  com.google.protobuf.ByteString getDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * Fully qualified source image for disks.
   * </pre>
   *
   * <code>string disk_source_image = 8;</code>
   *
   * @return The diskSourceImage.
   */
  java.lang.String getDiskSourceImage();
  /**
   *
   *
   * <pre>
   * Fully qualified source image for disks.
   * </pre>
   *
   * <code>string disk_source_image = 8;</code>
   *
   * @return The bytes for diskSourceImage.
   */
  com.google.protobuf.ByteString getDiskSourceImageBytes();

  /**
   *
   *
   * <pre>
   * Zone to run the worker pools in.  If empty or unspecified, the service
   * will attempt to choose a reasonable default.
   * </pre>
   *
   * <code>string zone = 9;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Zone to run the worker pools in.  If empty or unspecified, the service
   * will attempt to choose a reasonable default.
   * </pre>
   *
   * <code>string zone = 9;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Settings passed through to Google Compute Engine workers when
   * using the standard Dataflow task runner.  Users should ignore
   * this field.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.TaskRunnerSettings taskrunner_settings = 10;</code>
   *
   * @return Whether the taskrunnerSettings field is set.
   */
  boolean hasTaskrunnerSettings();
  /**
   *
   *
   * <pre>
   * Settings passed through to Google Compute Engine workers when
   * using the standard Dataflow task runner.  Users should ignore
   * this field.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.TaskRunnerSettings taskrunner_settings = 10;</code>
   *
   * @return The taskrunnerSettings.
   */
  com.google.dataflow.v1beta3.TaskRunnerSettings getTaskrunnerSettings();
  /**
   *
   *
   * <pre>
   * Settings passed through to Google Compute Engine workers when
   * using the standard Dataflow task runner.  Users should ignore
   * this field.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.TaskRunnerSettings taskrunner_settings = 10;</code>
   */
  com.google.dataflow.v1beta3.TaskRunnerSettingsOrBuilder getTaskrunnerSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * The action to take on host maintenance, as defined by the Google
   * Compute Engine API.
   * </pre>
   *
   * <code>string on_host_maintenance = 11;</code>
   *
   * @return The onHostMaintenance.
   */
  java.lang.String getOnHostMaintenance();
  /**
   *
   *
   * <pre>
   * The action to take on host maintenance, as defined by the Google
   * Compute Engine API.
   * </pre>
   *
   * <code>string on_host_maintenance = 11;</code>
   *
   * @return The bytes for onHostMaintenance.
   */
  com.google.protobuf.ByteString getOnHostMaintenanceBytes();

  /**
   *
   *
   * <pre>
   * Data disks that are used by a VM in this workflow.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Disk data_disks = 12;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.Disk> getDataDisksList();
  /**
   *
   *
   * <pre>
   * Data disks that are used by a VM in this workflow.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Disk data_disks = 12;</code>
   */
  com.google.dataflow.v1beta3.Disk getDataDisks(int index);
  /**
   *
   *
   * <pre>
   * Data disks that are used by a VM in this workflow.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Disk data_disks = 12;</code>
   */
  int getDataDisksCount();
  /**
   *
   *
   * <pre>
   * Data disks that are used by a VM in this workflow.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Disk data_disks = 12;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.DiskOrBuilder> getDataDisksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Data disks that are used by a VM in this workflow.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Disk data_disks = 12;</code>
   */
  com.google.dataflow.v1beta3.DiskOrBuilder getDataDisksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Metadata to set on the Google Compute Engine VMs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 13;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * Metadata to set on the Google Compute Engine VMs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 13;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * Metadata to set on the Google Compute Engine VMs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 13;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * Metadata to set on the Google Compute Engine VMs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 13;</code>
   */
  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Metadata to set on the Google Compute Engine VMs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 13;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Settings for autoscaling of this WorkerPool.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.AutoscalingSettings autoscaling_settings = 14;</code>
   *
   * @return Whether the autoscalingSettings field is set.
   */
  boolean hasAutoscalingSettings();
  /**
   *
   *
   * <pre>
   * Settings for autoscaling of this WorkerPool.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.AutoscalingSettings autoscaling_settings = 14;</code>
   *
   * @return The autoscalingSettings.
   */
  com.google.dataflow.v1beta3.AutoscalingSettings getAutoscalingSettings();
  /**
   *
   *
   * <pre>
   * Settings for autoscaling of this WorkerPool.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.AutoscalingSettings autoscaling_settings = 14;</code>
   */
  com.google.dataflow.v1beta3.AutoscalingSettingsOrBuilder getAutoscalingSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Extra arguments for this worker pool.
   * </pre>
   *
   * <code>.google.protobuf.Any pool_args = 15;</code>
   *
   * @return Whether the poolArgs field is set.
   */
  boolean hasPoolArgs();
  /**
   *
   *
   * <pre>
   * Extra arguments for this worker pool.
   * </pre>
   *
   * <code>.google.protobuf.Any pool_args = 15;</code>
   *
   * @return The poolArgs.
   */
  com.google.protobuf.Any getPoolArgs();
  /**
   *
   *
   * <pre>
   * Extra arguments for this worker pool.
   * </pre>
   *
   * <code>.google.protobuf.Any pool_args = 15;</code>
   */
  com.google.protobuf.AnyOrBuilder getPoolArgsOrBuilder();

  /**
   *
   *
   * <pre>
   * Network to which VMs will be assigned.  If empty or unspecified,
   * the service will use the network "default".
   * </pre>
   *
   * <code>string network = 17;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Network to which VMs will be assigned.  If empty or unspecified,
   * the service will use the network "default".
   * </pre>
   *
   * <code>string network = 17;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Subnetwork to which VMs will be assigned, if desired.  Expected to be of
   * the form "regions/REGION/subnetworks/SUBNETWORK".
   * </pre>
   *
   * <code>string subnetwork = 19;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Subnetwork to which VMs will be assigned, if desired.  Expected to be of
   * the form "regions/REGION/subnetworks/SUBNETWORK".
   * </pre>
   *
   * <code>string subnetwork = 19;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * Required. Docker container image that executes the Cloud Dataflow worker
   * harness, residing in Google Container Registry.
   * Deprecated for the Fn API path. Use sdk_harness_container_images instead.
   * </pre>
   *
   * <code>string worker_harness_container_image = 18;</code>
   *
   * @return The workerHarnessContainerImage.
   */
  java.lang.String getWorkerHarnessContainerImage();
  /**
   *
   *
   * <pre>
   * Required. Docker container image that executes the Cloud Dataflow worker
   * harness, residing in Google Container Registry.
   * Deprecated for the Fn API path. Use sdk_harness_container_images instead.
   * </pre>
   *
   * <code>string worker_harness_container_image = 18;</code>
   *
   * @return The bytes for workerHarnessContainerImage.
   */
  com.google.protobuf.ByteString getWorkerHarnessContainerImageBytes();

  /**
   *
   *
   * <pre>
   * The number of threads per worker harness. If empty or unspecified, the
   * service will choose a number of threads (according to the number of cores
   * on the selected machine type for batch, or 1 by convention for streaming).
   * </pre>
   *
   * <code>int32 num_threads_per_worker = 20;</code>
   *
   * @return The numThreadsPerWorker.
   */
  int getNumThreadsPerWorker();

  /**
   *
   *
   * <pre>
   * Configuration for VM IPs.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.WorkerIPAddressConfiguration ip_configuration = 21;</code>
   *
   * @return The enum numeric value on the wire for ipConfiguration.
   */
  int getIpConfigurationValue();
  /**
   *
   *
   * <pre>
   * Configuration for VM IPs.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.WorkerIPAddressConfiguration ip_configuration = 21;</code>
   *
   * @return The ipConfiguration.
   */
  com.google.dataflow.v1beta3.WorkerIPAddressConfiguration getIpConfiguration();

  /**
   *
   *
   * <pre>
   * Set of SDK harness containers needed to execute this pipeline. This will
   * only be set in the Fn API path. For non-cross-language pipelines this
   * should have only one entry. Cross-language pipelines will have two or more
   * entries.
   * </pre>
   *
   * <code>
   * repeated .google.dataflow.v1beta3.SdkHarnessContainerImage sdk_harness_container_images = 22;
   * </code>
   */
  java.util.List<com.google.dataflow.v1beta3.SdkHarnessContainerImage>
      getSdkHarnessContainerImagesList();
  /**
   *
   *
   * <pre>
   * Set of SDK harness containers needed to execute this pipeline. This will
   * only be set in the Fn API path. For non-cross-language pipelines this
   * should have only one entry. Cross-language pipelines will have two or more
   * entries.
   * </pre>
   *
   * <code>
   * repeated .google.dataflow.v1beta3.SdkHarnessContainerImage sdk_harness_container_images = 22;
   * </code>
   */
  com.google.dataflow.v1beta3.SdkHarnessContainerImage getSdkHarnessContainerImages(int index);
  /**
   *
   *
   * <pre>
   * Set of SDK harness containers needed to execute this pipeline. This will
   * only be set in the Fn API path. For non-cross-language pipelines this
   * should have only one entry. Cross-language pipelines will have two or more
   * entries.
   * </pre>
   *
   * <code>
   * repeated .google.dataflow.v1beta3.SdkHarnessContainerImage sdk_harness_container_images = 22;
   * </code>
   */
  int getSdkHarnessContainerImagesCount();
  /**
   *
   *
   * <pre>
   * Set of SDK harness containers needed to execute this pipeline. This will
   * only be set in the Fn API path. For non-cross-language pipelines this
   * should have only one entry. Cross-language pipelines will have two or more
   * entries.
   * </pre>
   *
   * <code>
   * repeated .google.dataflow.v1beta3.SdkHarnessContainerImage sdk_harness_container_images = 22;
   * </code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.SdkHarnessContainerImageOrBuilder>
      getSdkHarnessContainerImagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Set of SDK harness containers needed to execute this pipeline. This will
   * only be set in the Fn API path. For non-cross-language pipelines this
   * should have only one entry. Cross-language pipelines will have two or more
   * entries.
   * </pre>
   *
   * <code>
   * repeated .google.dataflow.v1beta3.SdkHarnessContainerImage sdk_harness_container_images = 22;
   * </code>
   */
  com.google.dataflow.v1beta3.SdkHarnessContainerImageOrBuilder
      getSdkHarnessContainerImagesOrBuilder(int index);
}
