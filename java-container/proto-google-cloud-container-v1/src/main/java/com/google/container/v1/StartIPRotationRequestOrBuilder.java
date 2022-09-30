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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface StartIPRotationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.StartIPRotationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.StartIPRotationRequest.project_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3482
   * @return The projectId.
   */
  @java.lang.Deprecated
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.StartIPRotationRequest.project_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3482
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.StartIPRotationRequest.zone is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3488
   * @return The zone.
   */
  @java.lang.Deprecated
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.StartIPRotationRequest.zone is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3488
   * @return The bytes for zone.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.StartIPRotationRequest.cluster_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3492
   * @return The clusterId.
   */
  @java.lang.Deprecated
  java.lang.String getClusterId();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.StartIPRotationRequest.cluster_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3492
   * @return The bytes for clusterId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * The name (project, location, cluster name) of the cluster to start IP
   * rotation. Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string name = 6;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name (project, location, cluster name) of the cluster to start IP
   * rotation. Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string name = 6;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Whether to rotate credentials during IP rotation.
   * </pre>
   *
   * <code>bool rotate_credentials = 7;</code>
   *
   * @return The rotateCredentials.
   */
  boolean getRotateCredentials();
}
