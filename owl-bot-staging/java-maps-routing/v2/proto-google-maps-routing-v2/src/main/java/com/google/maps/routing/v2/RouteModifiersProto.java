// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/route_modifiers.proto

package com.google.maps.routing.v2;

public final class RouteModifiersProto {
  private RouteModifiersProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_maps_routing_v2_RouteModifiers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_RouteModifiers_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/maps/routing/v2/route_modifiers" +
      ".proto\022\026google.maps.routing.v2\032(google/m" +
      "aps/routing/v2/toll_passes.proto\032)google" +
      "/maps/routing/v2/vehicle_info.proto\"\334\001\n\016" +
      "RouteModifiers\022\023\n\013avoid_tolls\030\001 \001(\010\022\026\n\016a" +
      "void_highways\030\002 \001(\010\022\025\n\ravoid_ferries\030\003 \001" +
      "(\010\022\024\n\014avoid_indoor\030\004 \001(\010\0229\n\014vehicle_info" +
      "\030\005 \001(\0132#.google.maps.routing.v2.VehicleI" +
      "nfo\0225\n\013toll_passes\030\006 \003(\0162 .google.maps.r" +
      "outing.v2.TollPassB\313\001\n\032com.google.maps.r" +
      "outing.v2B\023RouteModifiersProtoP\001Z=google" +
      ".golang.org/genproto/googleapis/maps/rou" +
      "ting/v2;routing\370\001\001\242\002\005GMRV2\252\002\026Google.Maps" +
      ".Routing.V2\312\002\026Google\\Maps\\Routing\\V2\352\002\031G" +
      "oogle::Maps::Routing::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.maps.routing.v2.TollPassesProto.getDescriptor(),
          com.google.maps.routing.v2.VehicleInfoProto.getDescriptor(),
        });
    internal_static_google_maps_routing_v2_RouteModifiers_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_routing_v2_RouteModifiers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_maps_routing_v2_RouteModifiers_descriptor,
        new java.lang.String[] { "AvoidTolls", "AvoidHighways", "AvoidFerries", "AvoidIndoor", "VehicleInfo", "TollPasses", });
    com.google.maps.routing.v2.TollPassesProto.getDescriptor();
    com.google.maps.routing.v2.VehicleInfoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
