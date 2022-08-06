// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface NodeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NodeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of a Google Compute Engine [machine
   * type](https://cloud.google.com/compute/docs/machine-types).
   * If unspecified, the default machine type is
   * `e2-medium`.
   * </pre>
   *
   * <code>string machine_type = 1;</code>
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   * <pre>
   * The name of a Google Compute Engine [machine
   * type](https://cloud.google.com/compute/docs/machine-types).
   * If unspecified, the default machine type is
   * `e2-medium`.
   * </pre>
   *
   * <code>string machine_type = 1;</code>
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString
      getMachineTypeBytes();

  /**
   * <pre>
   * Size of the disk attached to each node, specified in GB.
   * The smallest allowed disk size is 10GB.
   * If unspecified, the default disk size is 100GB.
   * </pre>
   *
   * <code>int32 disk_size_gb = 2;</code>
   * @return The diskSizeGb.
   */
  int getDiskSizeGb();

  /**
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container
   * Registry](https://cloud.google.com/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 3;</code>
   * @return A list containing the oauthScopes.
   */
  java.util.List<java.lang.String>
      getOauthScopesList();
  /**
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container
   * Registry](https://cloud.google.com/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 3;</code>
   * @return The count of oauthScopes.
   */
  int getOauthScopesCount();
  /**
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container
   * Registry](https://cloud.google.com/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 3;</code>
   * @param index The index of the element to return.
   * @return The oauthScopes at the given index.
   */
  java.lang.String getOauthScopes(int index);
  /**
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container
   * Registry](https://cloud.google.com/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the oauthScopes at the given index.
   */
  com.google.protobuf.ByteString
      getOauthScopesBytes(int index);

  /**
   * <pre>
   * The Google Cloud Platform Service Account to be used by the node VMs.
   * Specify the email address of the Service Account; otherwise, if no Service
   * Account is specified, the "default" service account is used.
   * </pre>
   *
   * <code>string service_account = 9;</code>
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   * <pre>
   * The Google Cloud Platform Service Account to be used by the node VMs.
   * Specify the email address of the Service Account; otherwise, if no Service
   * Account is specified, the "default" service account is used.
   * </pre>
   *
   * <code>string service_account = 9;</code>
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString
      getServiceAccountBytes();

  /**
   * <pre>
   * The metadata key/value pairs assigned to instances in the cluster.
   * Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes
   * in length. These are reflected as part of a URL in the metadata server.
   * Additionally, to avoid ambiguity, keys must not conflict with any other
   * metadata keys for the project or be one of the reserved keys:
   *  - "cluster-location"
   *  - "cluster-name"
   *  - "cluster-uid"
   *  - "configure-sh"
   *  - "containerd-configure-sh"
   *  - "enable-oslogin"
   *  - "gci-ensure-gke-docker"
   *  - "gci-metrics-enabled"
   *  - "gci-update-strategy"
   *  - "instance-template"
   *  - "kube-env"
   *  - "startup-script"
   *  - "user-data"
   *  - "disable-address-manager"
   *  - "windows-startup-script-ps1"
   *  - "common-psm1"
   *  - "k8s-node-setup-psm1"
   *  - "install-ssh-psm1"
   *  - "user-profile-psm1"
   * Values are free-form strings, and only have meaning as interpreted by
   * the image running in the instance. The only restriction placed on them is
   * that each value's size must be less than or equal to 32 KB.
   * The total size of all keys and values must be less than 512 KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * The metadata key/value pairs assigned to instances in the cluster.
   * Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes
   * in length. These are reflected as part of a URL in the metadata server.
   * Additionally, to avoid ambiguity, keys must not conflict with any other
   * metadata keys for the project or be one of the reserved keys:
   *  - "cluster-location"
   *  - "cluster-name"
   *  - "cluster-uid"
   *  - "configure-sh"
   *  - "containerd-configure-sh"
   *  - "enable-oslogin"
   *  - "gci-ensure-gke-docker"
   *  - "gci-metrics-enabled"
   *  - "gci-update-strategy"
   *  - "instance-template"
   *  - "kube-env"
   *  - "startup-script"
   *  - "user-data"
   *  - "disable-address-manager"
   *  - "windows-startup-script-ps1"
   *  - "common-psm1"
   *  - "k8s-node-setup-psm1"
   *  - "install-ssh-psm1"
   *  - "user-profile-psm1"
   * Values are free-form strings, and only have meaning as interpreted by
   * the image running in the instance. The only restriction placed on them is
   * that each value's size must be less than or equal to 32 KB.
   * The total size of all keys and values must be less than 512 KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <pre>
   * The metadata key/value pairs assigned to instances in the cluster.
   * Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes
   * in length. These are reflected as part of a URL in the metadata server.
   * Additionally, to avoid ambiguity, keys must not conflict with any other
   * metadata keys for the project or be one of the reserved keys:
   *  - "cluster-location"
   *  - "cluster-name"
   *  - "cluster-uid"
   *  - "configure-sh"
   *  - "containerd-configure-sh"
   *  - "enable-oslogin"
   *  - "gci-ensure-gke-docker"
   *  - "gci-metrics-enabled"
   *  - "gci-update-strategy"
   *  - "instance-template"
   *  - "kube-env"
   *  - "startup-script"
   *  - "user-data"
   *  - "disable-address-manager"
   *  - "windows-startup-script-ps1"
   *  - "common-psm1"
   *  - "k8s-node-setup-psm1"
   *  - "install-ssh-psm1"
   *  - "user-profile-psm1"
   * Values are free-form strings, and only have meaning as interpreted by
   * the image running in the instance. The only restriction placed on them is
   * that each value's size must be less than or equal to 32 KB.
   * The total size of all keys and values must be less than 512 KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * The metadata key/value pairs assigned to instances in the cluster.
   * Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes
   * in length. These are reflected as part of a URL in the metadata server.
   * Additionally, to avoid ambiguity, keys must not conflict with any other
   * metadata keys for the project or be one of the reserved keys:
   *  - "cluster-location"
   *  - "cluster-name"
   *  - "cluster-uid"
   *  - "configure-sh"
   *  - "containerd-configure-sh"
   *  - "enable-oslogin"
   *  - "gci-ensure-gke-docker"
   *  - "gci-metrics-enabled"
   *  - "gci-update-strategy"
   *  - "instance-template"
   *  - "kube-env"
   *  - "startup-script"
   *  - "user-data"
   *  - "disable-address-manager"
   *  - "windows-startup-script-ps1"
   *  - "common-psm1"
   *  - "k8s-node-setup-psm1"
   *  - "install-ssh-psm1"
   *  - "user-profile-psm1"
   * Values are free-form strings, and only have meaning as interpreted by
   * the image running in the instance. The only restriction placed on them is
   * that each value's size must be less than or equal to 32 KB.
   * The total size of all keys and values must be less than 512 KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */

  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The metadata key/value pairs assigned to instances in the cluster.
   * Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes
   * in length. These are reflected as part of a URL in the metadata server.
   * Additionally, to avoid ambiguity, keys must not conflict with any other
   * metadata keys for the project or be one of the reserved keys:
   *  - "cluster-location"
   *  - "cluster-name"
   *  - "cluster-uid"
   *  - "configure-sh"
   *  - "containerd-configure-sh"
   *  - "enable-oslogin"
   *  - "gci-ensure-gke-docker"
   *  - "gci-metrics-enabled"
   *  - "gci-update-strategy"
   *  - "instance-template"
   *  - "kube-env"
   *  - "startup-script"
   *  - "user-data"
   *  - "disable-address-manager"
   *  - "windows-startup-script-ps1"
   *  - "common-psm1"
   *  - "k8s-node-setup-psm1"
   *  - "install-ssh-psm1"
   *  - "user-profile-psm1"
   * Values are free-form strings, and only have meaning as interpreted by
   * the image running in the instance. The only restriction placed on them is
   * that each value's size must be less than or equal to 32 KB.
   * The total size of all keys and values must be less than 512 KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */

  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The image type to use for this node. Note that for a given image type,
   * the latest version of it will be used.
   * </pre>
   *
   * <code>string image_type = 5;</code>
   * @return The imageType.
   */
  java.lang.String getImageType();
  /**
   * <pre>
   * The image type to use for this node. Note that for a given image type,
   * the latest version of it will be used.
   * </pre>
   *
   * <code>string image_type = 5;</code>
   * @return The bytes for imageType.
   */
  com.google.protobuf.ByteString
      getImageTypeBytes();

  /**
   * <pre>
   * The map of Kubernetes labels (key/value pairs) to be applied to each node.
   * These will added in addition to any default label(s) that
   * Kubernetes may apply to the node.
   * In case of conflict in label keys, the applied set may differ depending on
   * the Kubernetes version -- it's best to assume the behavior is undefined
   * and conflicts should be avoided.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The map of Kubernetes labels (key/value pairs) to be applied to each node.
   * These will added in addition to any default label(s) that
   * Kubernetes may apply to the node.
   * In case of conflict in label keys, the applied set may differ depending on
   * the Kubernetes version -- it's best to assume the behavior is undefined
   * and conflicts should be avoided.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * The map of Kubernetes labels (key/value pairs) to be applied to each node.
   * These will added in addition to any default label(s) that
   * Kubernetes may apply to the node.
   * In case of conflict in label keys, the applied set may differ depending on
   * the Kubernetes version -- it's best to assume the behavior is undefined
   * and conflicts should be avoided.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The map of Kubernetes labels (key/value pairs) to be applied to each node.
   * These will added in addition to any default label(s) that
   * Kubernetes may apply to the node.
   * In case of conflict in label keys, the applied set may differ depending on
   * the Kubernetes version -- it's best to assume the behavior is undefined
   * and conflicts should be avoided.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */

  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The map of Kubernetes labels (key/value pairs) to be applied to each node.
   * These will added in addition to any default label(s) that
   * Kubernetes may apply to the node.
   * In case of conflict in label keys, the applied set may differ depending on
   * the Kubernetes version -- it's best to assume the behavior is undefined
   * and conflicts should be avoided.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The number of local SSD disks to be attached to the node.
   * The limit for this value is dependent upon the maximum number of
   * disks available on a machine per zone. See:
   * https://cloud.google.com/compute/docs/disks/local-ssd
   * for more information.
   * </pre>
   *
   * <code>int32 local_ssd_count = 7;</code>
   * @return The localSsdCount.
   */
  int getLocalSsdCount();

  /**
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster or node pool creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster or node pool creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster or node pool creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster or node pool creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   * Whether the nodes are created as preemptible VM instances. See:
   * https://cloud.google.com/compute/docs/instances/preemptible for more
   * inforamtion about preemptible VM instances.
   * </pre>
   *
   * <code>bool preemptible = 10;</code>
   * @return The preemptible.
   */
  boolean getPreemptible();

  /**
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AcceleratorConfig accelerators = 11;</code>
   */
  java.util.List<com.google.container.v1beta1.AcceleratorConfig> 
      getAcceleratorsList();
  /**
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AcceleratorConfig accelerators = 11;</code>
   */
  com.google.container.v1beta1.AcceleratorConfig getAccelerators(int index);
  /**
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AcceleratorConfig accelerators = 11;</code>
   */
  int getAcceleratorsCount();
  /**
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AcceleratorConfig accelerators = 11;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.AcceleratorConfigOrBuilder> 
      getAcceleratorsOrBuilderList();
  /**
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AcceleratorConfig accelerators = 11;</code>
   */
  com.google.container.v1beta1.AcceleratorConfigOrBuilder getAcceleratorsOrBuilder(
      int index);

  /**
   * <pre>
   * Sandbox configuration for this node.
   * </pre>
   *
   * <code>.google.container.v1beta1.SandboxConfig sandbox_config = 17;</code>
   * @return Whether the sandboxConfig field is set.
   */
  boolean hasSandboxConfig();
  /**
   * <pre>
   * Sandbox configuration for this node.
   * </pre>
   *
   * <code>.google.container.v1beta1.SandboxConfig sandbox_config = 17;</code>
   * @return The sandboxConfig.
   */
  com.google.container.v1beta1.SandboxConfig getSandboxConfig();
  /**
   * <pre>
   * Sandbox configuration for this node.
   * </pre>
   *
   * <code>.google.container.v1beta1.SandboxConfig sandbox_config = 17;</code>
   */
  com.google.container.v1beta1.SandboxConfigOrBuilder getSandboxConfigOrBuilder();

  /**
   * <pre>
   * Setting this field will assign instances of this
   * pool to run on the specified node group. This is useful for running
   * workloads on [sole tenant
   * nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
   * </pre>
   *
   * <code>string node_group = 18;</code>
   * @return The nodeGroup.
   */
  java.lang.String getNodeGroup();
  /**
   * <pre>
   * Setting this field will assign instances of this
   * pool to run on the specified node group. This is useful for running
   * workloads on [sole tenant
   * nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
   * </pre>
   *
   * <code>string node_group = 18;</code>
   * @return The bytes for nodeGroup.
   */
  com.google.protobuf.ByteString
      getNodeGroupBytes();

  /**
   * <pre>
   * The optional reservation affinity. Setting this field will apply
   * the specified [Zonal Compute
   * Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
   * to this node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.ReservationAffinity reservation_affinity = 19;</code>
   * @return Whether the reservationAffinity field is set.
   */
  boolean hasReservationAffinity();
  /**
   * <pre>
   * The optional reservation affinity. Setting this field will apply
   * the specified [Zonal Compute
   * Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
   * to this node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.ReservationAffinity reservation_affinity = 19;</code>
   * @return The reservationAffinity.
   */
  com.google.container.v1beta1.ReservationAffinity getReservationAffinity();
  /**
   * <pre>
   * The optional reservation affinity. Setting this field will apply
   * the specified [Zonal Compute
   * Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
   * to this node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.ReservationAffinity reservation_affinity = 19;</code>
   */
  com.google.container.v1beta1.ReservationAffinityOrBuilder getReservationAffinityOrBuilder();

  /**
   * <pre>
   * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or
   * 'pd-balanced')
   * If unspecified, the default disk type is 'pd-standard'
   * </pre>
   *
   * <code>string disk_type = 12;</code>
   * @return The diskType.
   */
  java.lang.String getDiskType();
  /**
   * <pre>
   * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or
   * 'pd-balanced')
   * If unspecified, the default disk type is 'pd-standard'
   * </pre>
   *
   * <code>string disk_type = 12;</code>
   * @return The bytes for diskType.
   */
  com.google.protobuf.ByteString
      getDiskTypeBytes();

  /**
   * <pre>
   * Minimum CPU platform to be used by this instance. The instance may be
   * scheduled on the specified or newer CPU platform. Applicable values are the
   * friendly names of CPU platforms, such as
   * `minCpuPlatform: "Intel Haswell"` or
   * `minCpuPlatform: "Intel Sandy Bridge"`. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
   * </pre>
   *
   * <code>string min_cpu_platform = 13;</code>
   * @return The minCpuPlatform.
   */
  java.lang.String getMinCpuPlatform();
  /**
   * <pre>
   * Minimum CPU platform to be used by this instance. The instance may be
   * scheduled on the specified or newer CPU platform. Applicable values are the
   * friendly names of CPU platforms, such as
   * `minCpuPlatform: "Intel Haswell"` or
   * `minCpuPlatform: "Intel Sandy Bridge"`. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
   * </pre>
   *
   * <code>string min_cpu_platform = 13;</code>
   * @return The bytes for minCpuPlatform.
   */
  com.google.protobuf.ByteString
      getMinCpuPlatformBytes();

  /**
   * <pre>
   * The workload metadata configuration for this node.
   * </pre>
   *
   * <code>.google.container.v1beta1.WorkloadMetadataConfig workload_metadata_config = 14;</code>
   * @return Whether the workloadMetadataConfig field is set.
   */
  boolean hasWorkloadMetadataConfig();
  /**
   * <pre>
   * The workload metadata configuration for this node.
   * </pre>
   *
   * <code>.google.container.v1beta1.WorkloadMetadataConfig workload_metadata_config = 14;</code>
   * @return The workloadMetadataConfig.
   */
  com.google.container.v1beta1.WorkloadMetadataConfig getWorkloadMetadataConfig();
  /**
   * <pre>
   * The workload metadata configuration for this node.
   * </pre>
   *
   * <code>.google.container.v1beta1.WorkloadMetadataConfig workload_metadata_config = 14;</code>
   */
  com.google.container.v1beta1.WorkloadMetadataConfigOrBuilder getWorkloadMetadataConfigOrBuilder();

  /**
   * <pre>
   * List of kubernetes taints to be applied to each node.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 15;</code>
   */
  java.util.List<com.google.container.v1beta1.NodeTaint> 
      getTaintsList();
  /**
   * <pre>
   * List of kubernetes taints to be applied to each node.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 15;</code>
   */
  com.google.container.v1beta1.NodeTaint getTaints(int index);
  /**
   * <pre>
   * List of kubernetes taints to be applied to each node.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 15;</code>
   */
  int getTaintsCount();
  /**
   * <pre>
   * List of kubernetes taints to be applied to each node.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 15;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.NodeTaintOrBuilder> 
      getTaintsOrBuilderList();
  /**
   * <pre>
   * List of kubernetes taints to be applied to each node.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.NodeTaint taints = 15;</code>
   */
  com.google.container.v1beta1.NodeTaintOrBuilder getTaintsOrBuilder(
      int index);

  /**
   * <pre>
   * The Customer Managed Encryption Key used to encrypt the boot disk attached
   * to each node in the node pool. This should be of the form
   * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME].
   * For more information about protecting resources with Cloud KMS Keys please
   * see:
   * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
   * </pre>
   *
   * <code>string boot_disk_kms_key = 23;</code>
   * @return The bootDiskKmsKey.
   */
  java.lang.String getBootDiskKmsKey();
  /**
   * <pre>
   * The Customer Managed Encryption Key used to encrypt the boot disk attached
   * to each node in the node pool. This should be of the form
   * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME].
   * For more information about protecting resources with Cloud KMS Keys please
   * see:
   * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
   * </pre>
   *
   * <code>string boot_disk_kms_key = 23;</code>
   * @return The bytes for bootDiskKmsKey.
   */
  com.google.protobuf.ByteString
      getBootDiskKmsKeyBytes();

  /**
   * <pre>
   * Shielded Instance options.
   * </pre>
   *
   * <code>.google.container.v1beta1.ShieldedInstanceConfig shielded_instance_config = 20;</code>
   * @return Whether the shieldedInstanceConfig field is set.
   */
  boolean hasShieldedInstanceConfig();
  /**
   * <pre>
   * Shielded Instance options.
   * </pre>
   *
   * <code>.google.container.v1beta1.ShieldedInstanceConfig shielded_instance_config = 20;</code>
   * @return The shieldedInstanceConfig.
   */
  com.google.container.v1beta1.ShieldedInstanceConfig getShieldedInstanceConfig();
  /**
   * <pre>
   * Shielded Instance options.
   * </pre>
   *
   * <code>.google.container.v1beta1.ShieldedInstanceConfig shielded_instance_config = 20;</code>
   */
  com.google.container.v1beta1.ShieldedInstanceConfigOrBuilder getShieldedInstanceConfigOrBuilder();

  /**
   * <pre>
   * Parameters that can be configured on Linux nodes.
   * </pre>
   *
   * <code>.google.container.v1beta1.LinuxNodeConfig linux_node_config = 21;</code>
   * @return Whether the linuxNodeConfig field is set.
   */
  boolean hasLinuxNodeConfig();
  /**
   * <pre>
   * Parameters that can be configured on Linux nodes.
   * </pre>
   *
   * <code>.google.container.v1beta1.LinuxNodeConfig linux_node_config = 21;</code>
   * @return The linuxNodeConfig.
   */
  com.google.container.v1beta1.LinuxNodeConfig getLinuxNodeConfig();
  /**
   * <pre>
   * Parameters that can be configured on Linux nodes.
   * </pre>
   *
   * <code>.google.container.v1beta1.LinuxNodeConfig linux_node_config = 21;</code>
   */
  com.google.container.v1beta1.LinuxNodeConfigOrBuilder getLinuxNodeConfigOrBuilder();

  /**
   * <pre>
   * Node kubelet configs.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeKubeletConfig kubelet_config = 22;</code>
   * @return Whether the kubeletConfig field is set.
   */
  boolean hasKubeletConfig();
  /**
   * <pre>
   * Node kubelet configs.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeKubeletConfig kubelet_config = 22;</code>
   * @return The kubeletConfig.
   */
  com.google.container.v1beta1.NodeKubeletConfig getKubeletConfig();
  /**
   * <pre>
   * Node kubelet configs.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeKubeletConfig kubelet_config = 22;</code>
   */
  com.google.container.v1beta1.NodeKubeletConfigOrBuilder getKubeletConfigOrBuilder();

  /**
   * <pre>
   * Parameters for the ephemeral storage filesystem.
   * If unspecified, ephemeral storage is backed by the boot disk.
   * </pre>
   *
   * <code>.google.container.v1beta1.EphemeralStorageConfig ephemeral_storage_config = 24;</code>
   * @return Whether the ephemeralStorageConfig field is set.
   */
  boolean hasEphemeralStorageConfig();
  /**
   * <pre>
   * Parameters for the ephemeral storage filesystem.
   * If unspecified, ephemeral storage is backed by the boot disk.
   * </pre>
   *
   * <code>.google.container.v1beta1.EphemeralStorageConfig ephemeral_storage_config = 24;</code>
   * @return The ephemeralStorageConfig.
   */
  com.google.container.v1beta1.EphemeralStorageConfig getEphemeralStorageConfig();
  /**
   * <pre>
   * Parameters for the ephemeral storage filesystem.
   * If unspecified, ephemeral storage is backed by the boot disk.
   * </pre>
   *
   * <code>.google.container.v1beta1.EphemeralStorageConfig ephemeral_storage_config = 24;</code>
   */
  com.google.container.v1beta1.EphemeralStorageConfigOrBuilder getEphemeralStorageConfigOrBuilder();

  /**
   * <pre>
   * GCFS (Google Container File System) configs.
   * </pre>
   *
   * <code>.google.container.v1beta1.GcfsConfig gcfs_config = 25;</code>
   * @return Whether the gcfsConfig field is set.
   */
  boolean hasGcfsConfig();
  /**
   * <pre>
   * GCFS (Google Container File System) configs.
   * </pre>
   *
   * <code>.google.container.v1beta1.GcfsConfig gcfs_config = 25;</code>
   * @return The gcfsConfig.
   */
  com.google.container.v1beta1.GcfsConfig getGcfsConfig();
  /**
   * <pre>
   * GCFS (Google Container File System) configs.
   * </pre>
   *
   * <code>.google.container.v1beta1.GcfsConfig gcfs_config = 25;</code>
   */
  com.google.container.v1beta1.GcfsConfigOrBuilder getGcfsConfigOrBuilder();

  /**
   * <pre>
   * Advanced features for the Compute Engine VM.
   * </pre>
   *
   * <code>.google.container.v1beta1.AdvancedMachineFeatures advanced_machine_features = 26;</code>
   * @return Whether the advancedMachineFeatures field is set.
   */
  boolean hasAdvancedMachineFeatures();
  /**
   * <pre>
   * Advanced features for the Compute Engine VM.
   * </pre>
   *
   * <code>.google.container.v1beta1.AdvancedMachineFeatures advanced_machine_features = 26;</code>
   * @return The advancedMachineFeatures.
   */
  com.google.container.v1beta1.AdvancedMachineFeatures getAdvancedMachineFeatures();
  /**
   * <pre>
   * Advanced features for the Compute Engine VM.
   * </pre>
   *
   * <code>.google.container.v1beta1.AdvancedMachineFeatures advanced_machine_features = 26;</code>
   */
  com.google.container.v1beta1.AdvancedMachineFeaturesOrBuilder getAdvancedMachineFeaturesOrBuilder();

  /**
   * <pre>
   * Enable or disable gvnic on the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.VirtualNIC gvnic = 29;</code>
   * @return Whether the gvnic field is set.
   */
  boolean hasGvnic();
  /**
   * <pre>
   * Enable or disable gvnic on the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.VirtualNIC gvnic = 29;</code>
   * @return The gvnic.
   */
  com.google.container.v1beta1.VirtualNIC getGvnic();
  /**
   * <pre>
   * Enable or disable gvnic on the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.VirtualNIC gvnic = 29;</code>
   */
  com.google.container.v1beta1.VirtualNICOrBuilder getGvnicOrBuilder();

  /**
   * <pre>
   * Spot flag for enabling Spot VM, which is a rebrand of
   * the existing preemptible flag.
   * </pre>
   *
   * <code>bool spot = 32;</code>
   * @return The spot.
   */
  boolean getSpot();

  /**
   * <pre>
   * Confidential nodes config.
   * All the nodes in the node pool will be Confidential VM once enabled.
   * </pre>
   *
   * <code>.google.container.v1beta1.ConfidentialNodes confidential_nodes = 35;</code>
   * @return Whether the confidentialNodes field is set.
   */
  boolean hasConfidentialNodes();
  /**
   * <pre>
   * Confidential nodes config.
   * All the nodes in the node pool will be Confidential VM once enabled.
   * </pre>
   *
   * <code>.google.container.v1beta1.ConfidentialNodes confidential_nodes = 35;</code>
   * @return The confidentialNodes.
   */
  com.google.container.v1beta1.ConfidentialNodes getConfidentialNodes();
  /**
   * <pre>
   * Confidential nodes config.
   * All the nodes in the node pool will be Confidential VM once enabled.
   * </pre>
   *
   * <code>.google.container.v1beta1.ConfidentialNodes confidential_nodes = 35;</code>
   */
  com.google.container.v1beta1.ConfidentialNodesOrBuilder getConfidentialNodesOrBuilder();
}
