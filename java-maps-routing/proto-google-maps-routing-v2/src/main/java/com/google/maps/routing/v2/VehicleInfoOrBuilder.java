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
// source: google/maps/routing/v2/vehicle_info.proto

// Protobuf Java Version: 3.25.3
package com.google.maps.routing.v2;

public interface VehicleInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.VehicleInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Describes the vehicle's emission type.
   * Applies only to the `DRIVE`
   * [`RouteTravelMode`][google.maps.routing.v2.RouteTravelMode].
   * </pre>
   *
   * <code>.google.maps.routing.v2.VehicleEmissionType emission_type = 2;</code>
   *
   * @return The enum numeric value on the wire for emissionType.
   */
  int getEmissionTypeValue();
  /**
   *
   *
   * <pre>
   * Describes the vehicle's emission type.
   * Applies only to the `DRIVE`
   * [`RouteTravelMode`][google.maps.routing.v2.RouteTravelMode].
   * </pre>
   *
   * <code>.google.maps.routing.v2.VehicleEmissionType emission_type = 2;</code>
   *
   * @return The emissionType.
   */
  com.google.maps.routing.v2.VehicleEmissionType getEmissionType();
}
