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
// source: google/cloud/aiplatform/v1beta1/persistent_resource.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface ResourceRuntimeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ResourceRuntime)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. URIs for user to connect to the Cluster.
   * Example:
   * {
   *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
   *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getAccessUrisCount();
  /**
   *
   *
   * <pre>
   * Output only. URIs for user to connect to the Cluster.
   * Example:
   * {
   *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
   *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsAccessUris(java.lang.String key);
  /** Use {@link #getAccessUrisMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAccessUris();
  /**
   *
   *
   * <pre>
   * Output only. URIs for user to connect to the Cluster.
   * Example:
   * {
   *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
   *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAccessUrisMap();
  /**
   *
   *
   * <pre>
   * Output only. URIs for user to connect to the Cluster.
   * Example:
   * {
   *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
   *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  java.lang.String getAccessUrisOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. URIs for user to connect to the Cluster.
   * Example:
   * {
   *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
   *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getAccessUrisOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The resource name of NotebookRuntimeTemplate for the RoV
   * Persistent Cluster The NotebokRuntimeTemplate is created in the same VPC
   * (if set), and with the same Ray and Python version as the Persistent
   * Cluster. Example:
   *   "projects/1000/locations/us-central1/notebookRuntimeTemplates/abc123"
   * </pre>
   *
   * <code>
   * string notebook_runtime_template = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1beta1.ResourceRuntime.notebook_runtime_template is
   *     deprecated. See google/cloud/aiplatform/v1beta1/persistent_resource.proto;l=290
   * @return The notebookRuntimeTemplate.
   */
  @java.lang.Deprecated
  java.lang.String getNotebookRuntimeTemplate();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of NotebookRuntimeTemplate for the RoV
   * Persistent Cluster The NotebokRuntimeTemplate is created in the same VPC
   * (if set), and with the same Ray and Python version as the Persistent
   * Cluster. Example:
   *   "projects/1000/locations/us-central1/notebookRuntimeTemplates/abc123"
   * </pre>
   *
   * <code>
   * string notebook_runtime_template = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1beta1.ResourceRuntime.notebook_runtime_template is
   *     deprecated. See google/cloud/aiplatform/v1beta1/persistent_resource.proto;l=290
   * @return The bytes for notebookRuntimeTemplate.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getNotebookRuntimeTemplateBytes();
}
