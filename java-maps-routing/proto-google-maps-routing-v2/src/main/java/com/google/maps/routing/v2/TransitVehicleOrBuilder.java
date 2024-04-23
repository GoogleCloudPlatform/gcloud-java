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
// source: google/maps/routing/v2/transit.proto

// Protobuf Java Version: 3.25.3
package com.google.maps.routing.v2;

public interface TransitVehicleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.TransitVehicle)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of this vehicle, capitalized.
   * </pre>
   *
   * <code>.google.type.LocalizedText name = 1;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * The name of this vehicle, capitalized.
   * </pre>
   *
   * <code>.google.type.LocalizedText name = 1;</code>
   *
   * @return The name.
   */
  com.google.type.LocalizedText getName();
  /**
   *
   *
   * <pre>
   * The name of this vehicle, capitalized.
   * </pre>
   *
   * <code>.google.type.LocalizedText name = 1;</code>
   */
  com.google.type.LocalizedTextOrBuilder getNameOrBuilder();

  /**
   *
   *
   * <pre>
   * The type of vehicle used.
   * </pre>
   *
   * <code>.google.maps.routing.v2.TransitVehicle.TransitVehicleType type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of vehicle used.
   * </pre>
   *
   * <code>.google.maps.routing.v2.TransitVehicle.TransitVehicleType type = 2;</code>
   *
   * @return The type.
   */
  com.google.maps.routing.v2.TransitVehicle.TransitVehicleType getType();

  /**
   *
   *
   * <pre>
   * The URI for an icon associated with this vehicle type.
   * </pre>
   *
   * <code>string icon_uri = 3;</code>
   *
   * @return The iconUri.
   */
  java.lang.String getIconUri();
  /**
   *
   *
   * <pre>
   * The URI for an icon associated with this vehicle type.
   * </pre>
   *
   * <code>string icon_uri = 3;</code>
   *
   * @return The bytes for iconUri.
   */
  com.google.protobuf.ByteString getIconUriBytes();

  /**
   *
   *
   * <pre>
   * The URI for the icon associated with this vehicle type, based on the local
   * transport signage.
   * </pre>
   *
   * <code>string local_icon_uri = 4;</code>
   *
   * @return The localIconUri.
   */
  java.lang.String getLocalIconUri();
  /**
   *
   *
   * <pre>
   * The URI for the icon associated with this vehicle type, based on the local
   * transport signage.
   * </pre>
   *
   * <code>string local_icon_uri = 4;</code>
   *
   * @return The bytes for localIconUri.
   */
  com.google.protobuf.ByteString getLocalIconUriBytes();
}
