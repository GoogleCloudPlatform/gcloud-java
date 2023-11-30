// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/mapsplatformdatasets/v1alpha/dataset.proto

package com.google.maps.mapsplatformdatasets.v1alpha;

public final class DatasetProto {
  private DatasetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_maps_mapsplatformdatasets_v1alpha_Dataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_mapsplatformdatasets_v1alpha_Dataset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/maps/mapsplatformdatasets/v1alp" +
      "ha/dataset.proto\022(google.maps.mapsplatfo" +
      "rmdatasets.v1alpha\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032:" +
      "google/maps/mapsplatformdatasets/v1alpha" +
      "/data_source.proto\032\037google/protobuf/time" +
      "stamp.proto\"\262\005\n\007Dataset\022\014\n\004name\030\001 \001(\t\022\024\n" +
      "\014display_name\030\002 \001(\t\022\023\n\013description\030\003 \001(\t" +
      "\022\022\n\nversion_id\030\004 \001(\t\022>\n\005usage\030\005 \003(\0162/.go" +
      "ogle.maps.mapsplatformdatasets.v1alpha.U" +
      "sage\022V\n\021local_file_source\030\006 \001(\01329.google" +
      ".maps.mapsplatformdatasets.v1alpha.Local" +
      "FileSourceH\000\022I\n\ngcs_source\030\007 \001(\01323.googl" +
      "e.maps.mapsplatformdatasets.v1alpha.GcsS" +
      "ourceH\000\022?\n\006status\030\014 \001(\0162/.google.maps.ma" +
      "psplatformdatasets.v1alpha.State\0225\n\013crea" +
      "te_time\030\010 \001(\0132\032.google.protobuf.Timestam" +
      "pB\004\342A\001\003\0225\n\013update_time\030\t \001(\0132\032.google.pr" +
      "otobuf.TimestampB\004\342A\001\003\022=\n\023version_create" +
      "_time\030\n \001(\0132\032.google.protobuf.TimestampB" +
      "\004\342A\001\003\022!\n\023version_description\030\013 \001(\tB\004\342A\001\003" +
      ":W\352AT\n+mapsplatformdatasets.googleapis.c" +
      "om/Dataset\022%projects/{project}/datasets/" +
      "{dataset}B\r\n\013data_source*u\n\005Usage\022\025\n\021USA" +
      "GE_UNSPECIFIED\020\000\022\035\n\031USAGE_DATA_DRIVEN_ST" +
      "YLING\020\001\022\032\n\026USAGE_AREA_AFFORDANCES\020\002\022\032\n\026U" +
      "SAGE_ASSISTED_DRIVING\020\003*h\n\005State\022\025\n\021STAT" +
      "E_UNSPECIFIED\020\000\022\023\n\017STATE_IMPORTING\020\001\022\032\n\026" +
      "STATE_IMPORT_SUCCEEDED\020\002\022\027\n\023STATE_IMPORT" +
      "_FAILED\020\003B\374\001\n,com.google.maps.mapsplatfo" +
      "rmdatasets.v1alphaB\014DatasetProtoP\001Zfclou" +
      "d.google.com/go/maps/mapsplatformdataset" +
      "s/apiv1alpha/mapsplatformdatasetspb;maps" +
      "platformdatasetspb\252\002(Google.Maps.MapsPla" +
      "tformDatasets.V1Alpha\312\002(Google\\Maps\\Maps" +
      "PlatformDatasets\\V1alphab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.maps.mapsplatformdatasets.v1alpha.DataSourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_maps_mapsplatformdatasets_v1alpha_Dataset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_mapsplatformdatasets_v1alpha_Dataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_maps_mapsplatformdatasets_v1alpha_Dataset_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "VersionId", "Usage", "LocalFileSource", "GcsSource", "Status", "CreateTime", "UpdateTime", "VersionCreateTime", "VersionDescription", "DataSource", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.maps.mapsplatformdatasets.v1alpha.DataSourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
