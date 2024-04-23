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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1beta1;

public interface AcceleratorConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.AcceleratorConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The number of the accelerator cards exposed to an instance.
   * </pre>
   *
   * <code>int64 accelerator_count = 1;</code>
   *
   * @return The acceleratorCount.
   */
  long getAcceleratorCount();

  /**
   *
   *
   * <pre>
   * The accelerator type resource name. List of supported accelerators
   * [here](https://cloud.google.com/compute/docs/gpus)
   * </pre>
   *
   * <code>string accelerator_type = 2;</code>
   *
   * @return The acceleratorType.
   */
  java.lang.String getAcceleratorType();
  /**
   *
   *
   * <pre>
   * The accelerator type resource name. List of supported accelerators
   * [here](https://cloud.google.com/compute/docs/gpus)
   * </pre>
   *
   * <code>string accelerator_type = 2;</code>
   *
   * @return The bytes for acceleratorType.
   */
  com.google.protobuf.ByteString getAcceleratorTypeBytes();

  /**
   *
   *
   * <pre>
   * Size of partitions to create on the GPU. Valid values are described in the
   * NVIDIA [mig user
   * guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
   * </pre>
   *
   * <code>string gpu_partition_size = 3;</code>
   *
   * @return The gpuPartitionSize.
   */
  java.lang.String getGpuPartitionSize();
  /**
   *
   *
   * <pre>
   * Size of partitions to create on the GPU. Valid values are described in the
   * NVIDIA [mig user
   * guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
   * </pre>
   *
   * <code>string gpu_partition_size = 3;</code>
   *
   * @return The bytes for gpuPartitionSize.
   */
  com.google.protobuf.ByteString getGpuPartitionSizeBytes();

  /**
   *
   *
   * <pre>
   * The number of time-shared GPU resources to expose for each physical GPU.
   * </pre>
   *
   * <code>int64 max_time_shared_clients_per_gpu = 4 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.AcceleratorConfig.max_time_shared_clients_per_gpu is
   *     deprecated. See google/container/v1beta1/cluster_service.proto;l=4668
   * @return The maxTimeSharedClientsPerGpu.
   */
  @java.lang.Deprecated
  long getMaxTimeSharedClientsPerGpu();

  /**
   *
   *
   * <pre>
   * The configuration for GPU sharing options.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.GPUSharingConfig gpu_sharing_config = 5;</code>
   *
   * @return Whether the gpuSharingConfig field is set.
   */
  boolean hasGpuSharingConfig();
  /**
   *
   *
   * <pre>
   * The configuration for GPU sharing options.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.GPUSharingConfig gpu_sharing_config = 5;</code>
   *
   * @return The gpuSharingConfig.
   */
  com.google.container.v1beta1.GPUSharingConfig getGpuSharingConfig();
  /**
   *
   *
   * <pre>
   * The configuration for GPU sharing options.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.GPUSharingConfig gpu_sharing_config = 5;</code>
   */
  com.google.container.v1beta1.GPUSharingConfigOrBuilder getGpuSharingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The configuration for auto installation of GPU driver.
   * </pre>
   *
   * <code>
   * optional .google.container.v1beta1.GPUDriverInstallationConfig gpu_driver_installation_config = 6;
   * </code>
   *
   * @return Whether the gpuDriverInstallationConfig field is set.
   */
  boolean hasGpuDriverInstallationConfig();
  /**
   *
   *
   * <pre>
   * The configuration for auto installation of GPU driver.
   * </pre>
   *
   * <code>
   * optional .google.container.v1beta1.GPUDriverInstallationConfig gpu_driver_installation_config = 6;
   * </code>
   *
   * @return The gpuDriverInstallationConfig.
   */
  com.google.container.v1beta1.GPUDriverInstallationConfig getGpuDriverInstallationConfig();
  /**
   *
   *
   * <pre>
   * The configuration for auto installation of GPU driver.
   * </pre>
   *
   * <code>
   * optional .google.container.v1beta1.GPUDriverInstallationConfig gpu_driver_installation_config = 6;
   * </code>
   */
  com.google.container.v1beta1.GPUDriverInstallationConfigOrBuilder
      getGpuDriverInstallationConfigOrBuilder();
}
