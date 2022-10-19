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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetHealthTargetPoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetHealthTargetPoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceReference instance_reference_resource = 292926060 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the instanceReferenceResource field is set.
   */
  boolean hasInstanceReferenceResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceReference instance_reference_resource = 292926060 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The instanceReferenceResource.
   */
  com.google.cloud.compute.v1.InstanceReference getInstanceReferenceResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceReference instance_reference_resource = 292926060 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.compute.v1.InstanceReferenceOrBuilder getInstanceReferenceResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Name of the TargetPool resource to which the queried instance belongs.
   * </pre>
   *
   * <code>string target_pool = 62796298 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The targetPool.
   */
  java.lang.String getTargetPool();
  /**
   *
   *
   * <pre>
   * Name of the TargetPool resource to which the queried instance belongs.
   * </pre>
   *
   * <code>string target_pool = 62796298 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for targetPool.
   */
  com.google.protobuf.ByteString getTargetPoolBytes();
}
