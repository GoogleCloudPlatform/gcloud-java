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
// source: google/maps/routing/v2/waypoint.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.routing.v2;

public final class WaypointProto {
  private WaypointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_Waypoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_Waypoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/maps/routing/v2/waypoint.proto\022"
          + "\026google.maps.routing.v2\032%google/maps/rou"
          + "ting/v2/location.proto\"\265\001\n\010Waypoint\0224\n\010l"
          + "ocation\030\001 \001(\0132 .google.maps.routing.v2.L"
          + "ocationH\000\022\022\n\010place_id\030\002 \001(\tH\000\022\021\n\007address"
          + "\030\007 \001(\tH\000\022\013\n\003via\030\003 \001(\010\022\030\n\020vehicle_stopove"
          + "r\030\004 \001(\010\022\024\n\014side_of_road\030\005 \001(\010B\017\n\rlocatio"
          + "n_typeB\277\001\n\032com.google.maps.routing.v2B\rW"
          + "aypointProtoP\001Z:cloud.google.com/go/maps"
          + "/routing/apiv2/routingpb;routingpb\242\002\005GMR"
          + "V2\252\002\026Google.Maps.Routing.V2\312\002\026Google\\Map"
          + "s\\Routing\\V2\352\002\031Google::Maps::Routing::V2"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.maps.routing.v2.LocationProto.getDescriptor(),
            });
    internal_static_google_maps_routing_v2_Waypoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_routing_v2_Waypoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_Waypoint_descriptor,
            new java.lang.String[] {
              "Location",
              "PlaceId",
              "Address",
              "Via",
              "VehicleStopover",
              "SideOfRoad",
              "LocationType",
            });
    com.google.maps.routing.v2.LocationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
