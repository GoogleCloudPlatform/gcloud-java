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
// source: google/appengine/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.appengine.v1;

public interface TrafficSplitOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.TrafficSplit)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Mechanism used to determine which version a request is sent to.
   * The traffic selection algorithm will
   * be stable for either type until allocations are changed.
   * </pre>
   *
   * <code>.google.appengine.v1.TrafficSplit.ShardBy shard_by = 1;</code>
   *
   * @return The enum numeric value on the wire for shardBy.
   */
  int getShardByValue();
  /**
   *
   *
   * <pre>
   * Mechanism used to determine which version a request is sent to.
   * The traffic selection algorithm will
   * be stable for either type until allocations are changed.
   * </pre>
   *
   * <code>.google.appengine.v1.TrafficSplit.ShardBy shard_by = 1;</code>
   *
   * @return The shardBy.
   */
  com.google.appengine.v1.TrafficSplit.ShardBy getShardBy();

  /**
   *
   *
   * <pre>
   * Mapping from version IDs within the service to fractional
   * (0.000, 1] allocations of traffic for that version. Each version can
   * be specified only once, but some versions in the service may not
   * have any traffic allocation. Services that have traffic allocated
   * cannot be deleted until either the service is deleted or
   * their traffic allocation is removed. Allocations must sum to 1.
   * Up to two decimal place precision is supported for IP-based splits and
   * up to three decimal places is supported for cookie-based splits.
   * </pre>
   *
   * <code>map&lt;string, double&gt; allocations = 2;</code>
   */
  int getAllocationsCount();
  /**
   *
   *
   * <pre>
   * Mapping from version IDs within the service to fractional
   * (0.000, 1] allocations of traffic for that version. Each version can
   * be specified only once, but some versions in the service may not
   * have any traffic allocation. Services that have traffic allocated
   * cannot be deleted until either the service is deleted or
   * their traffic allocation is removed. Allocations must sum to 1.
   * Up to two decimal place precision is supported for IP-based splits and
   * up to three decimal places is supported for cookie-based splits.
   * </pre>
   *
   * <code>map&lt;string, double&gt; allocations = 2;</code>
   */
  boolean containsAllocations(java.lang.String key);
  /** Use {@link #getAllocationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Double> getAllocations();
  /**
   *
   *
   * <pre>
   * Mapping from version IDs within the service to fractional
   * (0.000, 1] allocations of traffic for that version. Each version can
   * be specified only once, but some versions in the service may not
   * have any traffic allocation. Services that have traffic allocated
   * cannot be deleted until either the service is deleted or
   * their traffic allocation is removed. Allocations must sum to 1.
   * Up to two decimal place precision is supported for IP-based splits and
   * up to three decimal places is supported for cookie-based splits.
   * </pre>
   *
   * <code>map&lt;string, double&gt; allocations = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.Double> getAllocationsMap();
  /**
   *
   *
   * <pre>
   * Mapping from version IDs within the service to fractional
   * (0.000, 1] allocations of traffic for that version. Each version can
   * be specified only once, but some versions in the service may not
   * have any traffic allocation. Services that have traffic allocated
   * cannot be deleted until either the service is deleted or
   * their traffic allocation is removed. Allocations must sum to 1.
   * Up to two decimal place precision is supported for IP-based splits and
   * up to three decimal places is supported for cookie-based splits.
   * </pre>
   *
   * <code>map&lt;string, double&gt; allocations = 2;</code>
   */
  double getAllocationsOrDefault(java.lang.String key, double defaultValue);
  /**
   *
   *
   * <pre>
   * Mapping from version IDs within the service to fractional
   * (0.000, 1] allocations of traffic for that version. Each version can
   * be specified only once, but some versions in the service may not
   * have any traffic allocation. Services that have traffic allocated
   * cannot be deleted until either the service is deleted or
   * their traffic allocation is removed. Allocations must sum to 1.
   * Up to two decimal place precision is supported for IP-based splits and
   * up to three decimal places is supported for cookie-based splits.
   * </pre>
   *
   * <code>map&lt;string, double&gt; allocations = 2;</code>
   */
  double getAllocationsOrThrow(java.lang.String key);
}
