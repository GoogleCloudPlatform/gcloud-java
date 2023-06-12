/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

package com.google.cloud.assuredworkloads.v1;

public interface RestrictAllowedResourcesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Workload. This is the workloads's
   * relative path in the API, formatted as
   * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
   * For example,
   * "organizations/123/locations/us-east1/workloads/assured-workload-1".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Workload. This is the workloads's
   * relative path in the API, formatted as
   * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
   * For example,
   * "organizations/123/locations/us-east1/workloads/assured-workload-1".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The type of restriction for using gcp products in the Workload environment.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType restriction_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for restrictionType.
   */
  int getRestrictionTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The type of restriction for using gcp products in the Workload environment.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType restriction_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The restrictionType.
   */
  com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest.RestrictionType
      getRestrictionType();
}
