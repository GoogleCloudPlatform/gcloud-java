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
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataproc.v1;

public interface NodeGroupAffinityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.NodeGroupAffinity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The URI of a
   * sole-tenant [node group
   * resource](https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups)
   * that the cluster will be created on.
   *
   * A full URL, partial URI, or node group name are valid. Examples:
   *
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]/nodeGroups/node-group-1`
   * * `projects/[project_id]/zones/[zone]/nodeGroups/node-group-1`
   * * `node-group-1`
   * </pre>
   *
   * <code>string node_group_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The nodeGroupUri.
   */
  java.lang.String getNodeGroupUri();
  /**
   *
   *
   * <pre>
   * Required. The URI of a
   * sole-tenant [node group
   * resource](https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups)
   * that the cluster will be created on.
   *
   * A full URL, partial URI, or node group name are valid. Examples:
   *
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]/nodeGroups/node-group-1`
   * * `projects/[project_id]/zones/[zone]/nodeGroups/node-group-1`
   * * `node-group-1`
   * </pre>
   *
   * <code>string node_group_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for nodeGroupUri.
   */
  com.google.protobuf.ByteString getNodeGroupUriBytes();
}
