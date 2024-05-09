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
// source: google/maps/routeoptimization/v1/route_optimization_service.proto

// Protobuf Java Version: 3.25.3
package com.google.maps.routeoptimization.v1;

public interface SkippedShipmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routeoptimization.v1.SkippedShipment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The index corresponds to the index of the shipment in the source
   * `ShipmentModel`.
   * </pre>
   *
   * <code>int32 index = 1;</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * Copy of the corresponding
   * [Shipment.label][google.maps.routeoptimization.v1.Shipment.label], if
   * specified in the `Shipment`.
   * </pre>
   *
   * <code>string label = 2;</code>
   *
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   *
   *
   * <pre>
   * Copy of the corresponding
   * [Shipment.label][google.maps.routeoptimization.v1.Shipment.label], if
   * specified in the `Shipment`.
   * </pre>
   *
   * <code>string label = 2;</code>
   *
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString getLabelBytes();

  /**
   *
   *
   * <pre>
   * A list of reasons that explain why the shipment was skipped. See comment
   * above `Reason`.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.SkippedShipment.Reason reasons = 3;</code>
   */
  java.util.List<com.google.maps.routeoptimization.v1.SkippedShipment.Reason> getReasonsList();
  /**
   *
   *
   * <pre>
   * A list of reasons that explain why the shipment was skipped. See comment
   * above `Reason`.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.SkippedShipment.Reason reasons = 3;</code>
   */
  com.google.maps.routeoptimization.v1.SkippedShipment.Reason getReasons(int index);
  /**
   *
   *
   * <pre>
   * A list of reasons that explain why the shipment was skipped. See comment
   * above `Reason`.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.SkippedShipment.Reason reasons = 3;</code>
   */
  int getReasonsCount();
  /**
   *
   *
   * <pre>
   * A list of reasons that explain why the shipment was skipped. See comment
   * above `Reason`.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.SkippedShipment.Reason reasons = 3;</code>
   */
  java.util.List<? extends com.google.maps.routeoptimization.v1.SkippedShipment.ReasonOrBuilder>
      getReasonsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of reasons that explain why the shipment was skipped. See comment
   * above `Reason`.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.SkippedShipment.Reason reasons = 3;</code>
   */
  com.google.maps.routeoptimization.v1.SkippedShipment.ReasonOrBuilder getReasonsOrBuilder(
      int index);
}
