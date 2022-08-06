// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface SetLabelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.SetLabelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.container.v1beta1.SetLabelsRequest.project_id is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=3953
   * @return The projectId.
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.container.v1beta1.SetLabelsRequest.project_id is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=3953
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.container.v1beta1.SetLabelsRequest.zone is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=3962
   * @return The zone.
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.container.v1beta1.SetLabelsRequest.zone is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=3962
   * @return The bytes for zone.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Required. Deprecated. The name of the cluster.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.container.v1beta1.SetLabelsRequest.cluster_id is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=3969
   * @return The clusterId.
   */
  @java.lang.Deprecated java.lang.String getClusterId();
  /**
   * <pre>
   * Required. Deprecated. The name of the cluster.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.container.v1beta1.SetLabelsRequest.cluster_id is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=3969
   * @return The bytes for clusterId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * Required. The labels to set for that cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getResourceLabelsCount();
  /**
   * <pre>
   * Required. The labels to set for that cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean containsResourceLabels(
      java.lang.String key);
  /**
   * Use {@link #getResourceLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getResourceLabels();
  /**
   * <pre>
   * Required. The labels to set for that cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getResourceLabelsMap();
  /**
   * <pre>
   * Required. The labels to set for that cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */

  /* nullable */
java.lang.String getResourceLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Required. The labels to set for that cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_labels = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */

  java.lang.String getResourceLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Required. The fingerprint of the previous set of labels for this resource,
   * used to detect conflicts. The fingerprint is initially generated by
   * Kubernetes Engine and changes after every request to modify or update
   * labels. You must always provide an up-to-date fingerprint hash when
   * updating or changing labels. Make a `get()` request to the
   * resource to get the latest fingerprint.
   * </pre>
   *
   * <code>string label_fingerprint = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The labelFingerprint.
   */
  java.lang.String getLabelFingerprint();
  /**
   * <pre>
   * Required. The fingerprint of the previous set of labels for this resource,
   * used to detect conflicts. The fingerprint is initially generated by
   * Kubernetes Engine and changes after every request to modify or update
   * labels. You must always provide an up-to-date fingerprint hash when
   * updating or changing labels. Make a `get()` request to the
   * resource to get the latest fingerprint.
   * </pre>
   *
   * <code>string label_fingerprint = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for labelFingerprint.
   */
  com.google.protobuf.ByteString
      getLabelFingerprintBytes();

  /**
   * <pre>
   * The name (project, location, cluster name) of the cluster to set labels.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, cluster name) of the cluster to set labels.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
