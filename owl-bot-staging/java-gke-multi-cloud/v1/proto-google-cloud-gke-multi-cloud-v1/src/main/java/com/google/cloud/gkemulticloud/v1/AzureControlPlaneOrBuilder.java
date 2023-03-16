// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AzureControlPlaneOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureControlPlane)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Kubernetes version to run on control plane replicas
   * (e.g. `1.19.10-gke.1000`).
   * You can list all supported versions on a given Google Cloud region by
   * calling
   * [GetAzureServerConfig][google.cloud.gkemulticloud.v1.AzureClusters.GetAzureServerConfig].
   * </pre>
   *
   * <code>string version = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Required. The Kubernetes version to run on control plane replicas
   * (e.g. `1.19.10-gke.1000`).
   * You can list all supported versions on a given Google Cloud region by
   * calling
   * [GetAzureServerConfig][google.cloud.gkemulticloud.v1.AzureClusters.GetAzureServerConfig].
   * </pre>
   *
   * <code>string version = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Optional. The ARM ID of the default subnet for the control plane. The
   * control plane VMs are deployed in this subnet, unless
   * `AzureControlPlane.replica_placements` is specified. This subnet will also
   * be used as default for `AzureControlPlane.endpoint_subnet_id` if
   * `AzureControlPlane.endpoint_subnet_id` is not specified. Similarly it will
   * be used as default for
   * `AzureClusterNetworking.service_load_balancer_subnet_id`.
   * Example:
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.Network/virtualNetworks/&lt;vnet-id&gt;/subnets/default`.
   * </pre>
   *
   * <code>string subnet_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The subnetId.
   */
  java.lang.String getSubnetId();
  /**
   * <pre>
   * Optional. The ARM ID of the default subnet for the control plane. The
   * control plane VMs are deployed in this subnet, unless
   * `AzureControlPlane.replica_placements` is specified. This subnet will also
   * be used as default for `AzureControlPlane.endpoint_subnet_id` if
   * `AzureControlPlane.endpoint_subnet_id` is not specified. Similarly it will
   * be used as default for
   * `AzureClusterNetworking.service_load_balancer_subnet_id`.
   * Example:
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.Network/virtualNetworks/&lt;vnet-id&gt;/subnets/default`.
   * </pre>
   *
   * <code>string subnet_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for subnetId.
   */
  com.google.protobuf.ByteString
      getSubnetIdBytes();

  /**
   * <pre>
   * Optional. The Azure VM size name. Example: `Standard_DS2_v2`.
   * For available VM sizes, see
   * https://docs.microsoft.com/en-us/azure/virtual-machines/vm-naming-conventions.
   * When unspecified, it defaults to `Standard_DS2_v2`.
   * </pre>
   *
   * <code>string vm_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The vmSize.
   */
  java.lang.String getVmSize();
  /**
   * <pre>
   * Optional. The Azure VM size name. Example: `Standard_DS2_v2`.
   * For available VM sizes, see
   * https://docs.microsoft.com/en-us/azure/virtual-machines/vm-naming-conventions.
   * When unspecified, it defaults to `Standard_DS2_v2`.
   * </pre>
   *
   * <code>string vm_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for vmSize.
   */
  com.google.protobuf.ByteString
      getVmSizeBytes();

  /**
   * <pre>
   * Required. SSH configuration for how to access the underlying control plane
   * machines.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureSshConfig ssh_config = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the sshConfig field is set.
   */
  boolean hasSshConfig();
  /**
   * <pre>
   * Required. SSH configuration for how to access the underlying control plane
   * machines.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureSshConfig ssh_config = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The sshConfig.
   */
  com.google.cloud.gkemulticloud.v1.AzureSshConfig getSshConfig();
  /**
   * <pre>
   * Required. SSH configuration for how to access the underlying control plane
   * machines.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureSshConfig ssh_config = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureSshConfigOrBuilder getSshConfigOrBuilder();

  /**
   * <pre>
   * Optional. Configuration related to the root volume provisioned for each
   * control plane replica.
   * When unspecified, it defaults to 32-GiB Azure Disk.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDiskTemplate root_volume = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the rootVolume field is set.
   */
  boolean hasRootVolume();
  /**
   * <pre>
   * Optional. Configuration related to the root volume provisioned for each
   * control plane replica.
   * When unspecified, it defaults to 32-GiB Azure Disk.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDiskTemplate root_volume = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The rootVolume.
   */
  com.google.cloud.gkemulticloud.v1.AzureDiskTemplate getRootVolume();
  /**
   * <pre>
   * Optional. Configuration related to the root volume provisioned for each
   * control plane replica.
   * When unspecified, it defaults to 32-GiB Azure Disk.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDiskTemplate root_volume = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureDiskTemplateOrBuilder getRootVolumeOrBuilder();

  /**
   * <pre>
   * Optional. Configuration related to the main volume provisioned for each
   * control plane replica.
   * The main volume is in charge of storing all of the cluster's etcd state.
   * When unspecified, it defaults to a 8-GiB Azure Disk.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDiskTemplate main_volume = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the mainVolume field is set.
   */
  boolean hasMainVolume();
  /**
   * <pre>
   * Optional. Configuration related to the main volume provisioned for each
   * control plane replica.
   * The main volume is in charge of storing all of the cluster's etcd state.
   * When unspecified, it defaults to a 8-GiB Azure Disk.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDiskTemplate main_volume = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The mainVolume.
   */
  com.google.cloud.gkemulticloud.v1.AzureDiskTemplate getMainVolume();
  /**
   * <pre>
   * Optional. Configuration related to the main volume provisioned for each
   * control plane replica.
   * The main volume is in charge of storing all of the cluster's etcd state.
   * When unspecified, it defaults to a 8-GiB Azure Disk.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDiskTemplate main_volume = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureDiskTemplateOrBuilder getMainVolumeOrBuilder();

  /**
   * <pre>
   * Optional. Configuration related to application-layer secrets encryption.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDatabaseEncryption database_encryption = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the databaseEncryption field is set.
   */
  boolean hasDatabaseEncryption();
  /**
   * <pre>
   * Optional. Configuration related to application-layer secrets encryption.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDatabaseEncryption database_encryption = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The databaseEncryption.
   */
  com.google.cloud.gkemulticloud.v1.AzureDatabaseEncryption getDatabaseEncryption();
  /**
   * <pre>
   * Optional. Configuration related to application-layer secrets encryption.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureDatabaseEncryption database_encryption = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureDatabaseEncryptionOrBuilder getDatabaseEncryptionOrBuilder();

  /**
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureProxyConfig proxy_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the proxyConfig field is set.
   */
  boolean hasProxyConfig();
  /**
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureProxyConfig proxy_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The proxyConfig.
   */
  com.google.cloud.gkemulticloud.v1.AzureProxyConfig getProxyConfig();
  /**
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureProxyConfig proxy_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureProxyConfigOrBuilder getProxyConfigOrBuilder();

  /**
   * <pre>
   * Optional. Configuration related to vm config encryption.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureConfigEncryption config_encryption = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the configEncryption field is set.
   */
  boolean hasConfigEncryption();
  /**
   * <pre>
   * Optional. Configuration related to vm config encryption.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureConfigEncryption config_encryption = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The configEncryption.
   */
  com.google.cloud.gkemulticloud.v1.AzureConfigEncryption getConfigEncryption();
  /**
   * <pre>
   * Optional. Configuration related to vm config encryption.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureConfigEncryption config_encryption = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureConfigEncryptionOrBuilder getConfigEncryptionOrBuilder();

  /**
   * <pre>
   * Optional. A set of tags to apply to all underlying control plane Azure
   * resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * Optional. A set of tags to apply to all underlying control plane Azure
   * resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <pre>
   * Optional. A set of tags to apply to all underlying control plane Azure
   * resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <pre>
   * Optional. A set of tags to apply to all underlying control plane Azure
   * resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. A set of tags to apply to all underlying control plane Azure
   * resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getTagsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. Configuration for where to place the control plane replicas.
   * Up to three replica placement instances can be specified. If
   * replica_placements is set, the replica placement instances will be applied
   * to the three control plane replicas as evenly as possible.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.ReplicaPlacement replica_placements = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.ReplicaPlacement> 
      getReplicaPlacementsList();
  /**
   * <pre>
   * Optional. Configuration for where to place the control plane replicas.
   * Up to three replica placement instances can be specified. If
   * replica_placements is set, the replica placement instances will be applied
   * to the three control plane replicas as evenly as possible.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.ReplicaPlacement replica_placements = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.ReplicaPlacement getReplicaPlacements(int index);
  /**
   * <pre>
   * Optional. Configuration for where to place the control plane replicas.
   * Up to three replica placement instances can be specified. If
   * replica_placements is set, the replica placement instances will be applied
   * to the three control plane replicas as evenly as possible.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.ReplicaPlacement replica_placements = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getReplicaPlacementsCount();
  /**
   * <pre>
   * Optional. Configuration for where to place the control plane replicas.
   * Up to three replica placement instances can be specified. If
   * replica_placements is set, the replica placement instances will be applied
   * to the three control plane replicas as evenly as possible.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.ReplicaPlacement replica_placements = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.ReplicaPlacementOrBuilder> 
      getReplicaPlacementsOrBuilderList();
  /**
   * <pre>
   * Optional. Configuration for where to place the control plane replicas.
   * Up to three replica placement instances can be specified. If
   * replica_placements is set, the replica placement instances will be applied
   * to the three control plane replicas as evenly as possible.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.ReplicaPlacement replica_placements = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.ReplicaPlacementOrBuilder getReplicaPlacementsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. The ARM ID of the subnet where the control plane load balancer is
   * deployed. When unspecified, it defaults to AzureControlPlane.subnet_id.
   * Example:
   * "/subscriptions/d00494d6-6f3c-4280-bbb2-899e163d1d30/resourceGroups/anthos_cluster_gkeust4/providers/Microsoft.Network/virtualNetworks/gke-vnet-gkeust4/subnets/subnetid123"
   * </pre>
   *
   * <code>string endpoint_subnet_id = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The endpointSubnetId.
   */
  java.lang.String getEndpointSubnetId();
  /**
   * <pre>
   * Optional. The ARM ID of the subnet where the control plane load balancer is
   * deployed. When unspecified, it defaults to AzureControlPlane.subnet_id.
   * Example:
   * "/subscriptions/d00494d6-6f3c-4280-bbb2-899e163d1d30/resourceGroups/anthos_cluster_gkeust4/providers/Microsoft.Network/virtualNetworks/gke-vnet-gkeust4/subnets/subnetid123"
   * </pre>
   *
   * <code>string endpoint_subnet_id = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for endpointSubnetId.
   */
  com.google.protobuf.ByteString
      getEndpointSubnetIdBytes();
}
