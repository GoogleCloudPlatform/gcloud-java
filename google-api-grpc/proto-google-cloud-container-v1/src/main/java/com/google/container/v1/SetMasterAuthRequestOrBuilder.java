// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface SetMasterAuthRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.SetMasterAuthRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getClusterId();
  /**
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * The exact form of action to be taken on the master auth.
   * </pre>
   *
   * <code>.google.container.v1.SetMasterAuthRequest.Action action = 4;</code>
   */
  int getActionValue();
  /**
   * <pre>
   * The exact form of action to be taken on the master auth.
   * </pre>
   *
   * <code>.google.container.v1.SetMasterAuthRequest.Action action = 4;</code>
   */
  com.google.container.v1.SetMasterAuthRequest.Action getAction();

  /**
   * <pre>
   * A description of the update.
   * </pre>
   *
   * <code>.google.container.v1.MasterAuth update = 5;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * A description of the update.
   * </pre>
   *
   * <code>.google.container.v1.MasterAuth update = 5;</code>
   */
  com.google.container.v1.MasterAuth getUpdate();
  /**
   * <pre>
   * A description of the update.
   * </pre>
   *
   * <code>.google.container.v1.MasterAuth update = 5;</code>
   */
  com.google.container.v1.MasterAuthOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * The name (project, location, cluster) of the cluster to set auth.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string name = 7;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, cluster) of the cluster to set auth.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string name = 7;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
