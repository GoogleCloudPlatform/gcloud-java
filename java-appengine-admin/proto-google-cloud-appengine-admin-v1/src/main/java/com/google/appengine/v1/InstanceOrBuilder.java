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
// source: google/appengine/v1/instance.proto

package com.google.appengine.v1;

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Full path to the Instance resource in the API.
   * Example: `apps/myapp/services/default/versions/v1/instances/instance-1`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Full path to the Instance resource in the API.
   * Example: `apps/myapp/services/default/versions/v1/instances/instance-1`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Relative name of the instance within the version.
   * Example: `instance-1`.
   * </pre>
   *
   * <code>string id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Output only. Relative name of the instance within the version.
   * Example: `instance-1`.
   * </pre>
   *
   * <code>string id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. App Engine release this instance is running on.
   * </pre>
   *
   * <code>string app_engine_release = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The appEngineRelease.
   */
  java.lang.String getAppEngineRelease();
  /**
   *
   *
   * <pre>
   * Output only. App Engine release this instance is running on.
   * </pre>
   *
   * <code>string app_engine_release = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for appEngineRelease.
   */
  com.google.protobuf.ByteString getAppEngineReleaseBytes();

  /**
   *
   *
   * <pre>
   * Output only. Availability of the instance.
   * </pre>
   *
   * <code>
   * .google.appengine.v1.Instance.Availability availability = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for availability.
   */
  int getAvailabilityValue();
  /**
   *
   *
   * <pre>
   * Output only. Availability of the instance.
   * </pre>
   *
   * <code>
   * .google.appengine.v1.Instance.Availability availability = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The availability.
   */
  com.google.appengine.v1.Instance.Availability getAvailability();

  /**
   *
   *
   * <pre>
   * Output only. Name of the virtual machine where this instance lives. Only applicable
   * for instances in App Engine flexible environment.
   * </pre>
   *
   * <code>string vm_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The vmName.
   */
  java.lang.String getVmName();
  /**
   *
   *
   * <pre>
   * Output only. Name of the virtual machine where this instance lives. Only applicable
   * for instances in App Engine flexible environment.
   * </pre>
   *
   * <code>string vm_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for vmName.
   */
  com.google.protobuf.ByteString getVmNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Zone where the virtual machine is located. Only applicable for instances
   * in App Engine flexible environment.
   * </pre>
   *
   * <code>string vm_zone_name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The vmZoneName.
   */
  java.lang.String getVmZoneName();
  /**
   *
   *
   * <pre>
   * Output only. Zone where the virtual machine is located. Only applicable for instances
   * in App Engine flexible environment.
   * </pre>
   *
   * <code>string vm_zone_name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for vmZoneName.
   */
  com.google.protobuf.ByteString getVmZoneNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Virtual machine ID of this instance. Only applicable for instances in
   * App Engine flexible environment.
   * </pre>
   *
   * <code>string vm_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The vmId.
   */
  java.lang.String getVmId();
  /**
   *
   *
   * <pre>
   * Output only. Virtual machine ID of this instance. Only applicable for instances in
   * App Engine flexible environment.
   * </pre>
   *
   * <code>string vm_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for vmId.
   */
  com.google.protobuf.ByteString getVmIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time that this instance was started.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time that this instance was started.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time that this instance was started.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Number of requests since this instance was started.
   * </pre>
   *
   * <code>int32 requests = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The requests.
   */
  int getRequests();

  /**
   *
   *
   * <pre>
   * Output only. Number of errors since this instance was started.
   * </pre>
   *
   * <code>int32 errors = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The errors.
   */
  int getErrors();

  /**
   *
   *
   * <pre>
   * Output only. Average queries per second (QPS) over the last minute.
   * </pre>
   *
   * <code>float qps = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The qps.
   */
  float getQps();

  /**
   *
   *
   * <pre>
   * Output only. Average latency (ms) over the last minute.
   * </pre>
   *
   * <code>int32 average_latency = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The averageLatency.
   */
  int getAverageLatency();

  /**
   *
   *
   * <pre>
   * Output only. Total memory in use (bytes).
   * </pre>
   *
   * <code>int64 memory_usage = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The memoryUsage.
   */
  long getMemoryUsage();

  /**
   *
   *
   * <pre>
   * Output only. Status of the virtual machine where this instance lives. Only applicable
   * for instances in App Engine flexible environment.
   * </pre>
   *
   * <code>string vm_status = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The vmStatus.
   */
  java.lang.String getVmStatus();
  /**
   *
   *
   * <pre>
   * Output only. Status of the virtual machine where this instance lives. Only applicable
   * for instances in App Engine flexible environment.
   * </pre>
   *
   * <code>string vm_status = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for vmStatus.
   */
  com.google.protobuf.ByteString getVmStatusBytes();

  /**
   *
   *
   * <pre>
   * Output only. Whether this instance is in debug mode. Only applicable for instances in
   * App Engine flexible environment.
   * </pre>
   *
   * <code>bool vm_debug_enabled = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The vmDebugEnabled.
   */
  boolean getVmDebugEnabled();

  /**
   *
   *
   * <pre>
   * Output only. The IP address of this instance. Only applicable for instances in App
   * Engine flexible environment.
   * </pre>
   *
   * <code>string vm_ip = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The vmIp.
   */
  java.lang.String getVmIp();
  /**
   *
   *
   * <pre>
   * Output only. The IP address of this instance. Only applicable for instances in App
   * Engine flexible environment.
   * </pre>
   *
   * <code>string vm_ip = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for vmIp.
   */
  com.google.protobuf.ByteString getVmIpBytes();

  /**
   *
   *
   * <pre>
   * Output only. The liveness health check of this instance. Only applicable for instances
   * in App Engine flexible environment.
   * </pre>
   *
   * <code>
   * .google.appengine.v1.Instance.Liveness.LivenessState vm_liveness = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for vmLiveness.
   */
  int getVmLivenessValue();
  /**
   *
   *
   * <pre>
   * Output only. The liveness health check of this instance. Only applicable for instances
   * in App Engine flexible environment.
   * </pre>
   *
   * <code>
   * .google.appengine.v1.Instance.Liveness.LivenessState vm_liveness = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The vmLiveness.
   */
  com.google.appengine.v1.Instance.Liveness.LivenessState getVmLiveness();
}
