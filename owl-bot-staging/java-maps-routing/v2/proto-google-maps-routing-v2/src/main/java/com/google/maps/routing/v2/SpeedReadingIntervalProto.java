// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/speed_reading_interval.proto

package com.google.maps.routing.v2;

public final class SpeedReadingIntervalProto {
  private SpeedReadingIntervalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_maps_routing_v2_SpeedReadingInterval_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_SpeedReadingInterval_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/maps/routing/v2/speed_reading_i" +
      "nterval.proto\022\026google.maps.routing.v2\"\274\002" +
      "\n\024SpeedReadingInterval\022\'\n\032start_polyline" +
      "_point_index\030\001 \001(\005H\001\210\001\001\022%\n\030end_polyline_" +
      "point_index\030\002 \001(\005H\002\210\001\001\022C\n\005speed\030\003 \001(\01622." +
      "google.maps.routing.v2.SpeedReadingInter" +
      "val.SpeedH\000\"E\n\005Speed\022\025\n\021SPEED_UNSPECIFIE" +
      "D\020\000\022\n\n\006NORMAL\020\001\022\010\n\004SLOW\020\002\022\017\n\013TRAFFIC_JAM" +
      "\020\003B\014\n\nspeed_typeB\035\n\033_start_polyline_poin" +
      "t_indexB\033\n\031_end_polyline_point_indexB\316\001\n" +
      "\032com.google.maps.routing.v2B\031SpeedReadin" +
      "gIntervalProtoP\001Z:cloud.google.com/go/ma" +
      "ps/routing/apiv2/routingpb;routingpb\370\001\001\242" +
      "\002\005GMRV2\252\002\026Google.Maps.Routing.V2\312\002\026Googl" +
      "e\\Maps\\Routing\\V2\352\002\031Google::Maps::Routin" +
      "g::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_maps_routing_v2_SpeedReadingInterval_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_routing_v2_SpeedReadingInterval_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_maps_routing_v2_SpeedReadingInterval_descriptor,
        new java.lang.String[] { "StartPolylinePointIndex", "EndPolylinePointIndex", "Speed", "SpeedType", "StartPolylinePointIndex", "EndPolylinePointIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
