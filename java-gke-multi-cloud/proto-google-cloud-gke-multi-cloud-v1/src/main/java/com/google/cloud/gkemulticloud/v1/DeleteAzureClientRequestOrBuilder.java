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
// source: google/cloud/gkemulticloud/v1/azure_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface DeleteAzureClientRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.DeleteAzureClientRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name the [AzureClient][google.cloud.gkemulticloud.v1.AzureClient] to delete.
   * [AzureClient][google.cloud.gkemulticloud.v1.AzureClient] names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/azureClients/&lt;client-id&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name the [AzureClient][google.cloud.gkemulticloud.v1.AzureClient] to delete.
   * [AzureClient][google.cloud.gkemulticloud.v1.AzureClient] names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/azureClients/&lt;client-id&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * If set to true, and the [AzureClient][google.cloud.gkemulticloud.v1.AzureClient] resource is not found,
   * the request will succeed but no action will be taken on the server and a
   * completed [Operation][google.longrunning.Operation] will be returned.
   * Useful for idempotent deletion.
   * </pre>
   *
   * <code>bool allow_missing = 2;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();

  /**
   *
   *
   * <pre>
   * If set, only validate the request, but do not actually delete the resource.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
