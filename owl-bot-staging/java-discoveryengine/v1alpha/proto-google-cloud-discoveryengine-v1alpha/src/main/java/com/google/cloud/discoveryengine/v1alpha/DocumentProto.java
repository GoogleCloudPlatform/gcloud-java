// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1alpha/document.proto

package com.google.cloud.discoveryengine.v1alpha;

public final class DocumentProto {
  private DocumentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1alpha_Document_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1alpha_Document_Content_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Document_Content_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/discoveryengine/v1alpha/d" +
      "ocument.proto\022$google.cloud.discoveryeng" +
      "ine.v1alpha\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032\034google/" +
      "protobuf/struct.proto\"\227\005\n\010Document\022.\n\013st" +
      "ruct_data\030\004 \001(\0132\027.google.protobuf.Struct" +
      "H\000\022\023\n\tjson_data\030\005 \001(\tH\000\022\022\n\004name\030\001 \001(\tB\004\342" +
      "A\001\005\022\020\n\002id\030\002 \001(\tB\004\342A\001\005\022\021\n\tschema_id\030\003 \001(\t" +
      "\022G\n\007content\030\n \001(\01326.google.cloud.discove" +
      "ryengine.v1alpha.Document.Content\022\032\n\022par" +
      "ent_document_id\030\007 \001(\t\022:\n\023derived_struct_" +
      "data\030\006 \001(\0132\027.google.protobuf.StructB\004\342A\001" +
      "\003\032K\n\007Content\022\023\n\traw_bytes\030\002 \001(\014H\000\022\r\n\003uri" +
      "\030\003 \001(\tH\000\022\021\n\tmime_type\030\001 \001(\tB\t\n\007content:\226" +
      "\002\352A\222\002\n\'discoveryengine.googleapis.com/Do" +
      "cument\022fprojects/{project}/locations/{lo" +
      "cation}/dataStores/{data_store}/branches" +
      "/{branch}/documents/{document}\022\177projects" +
      "/{project}/locations/{location}/collecti" +
      "ons/{collection}/dataStores/{data_store}" +
      "/branches/{branch}/documents/{document}B" +
      "\006\n\004dataB\231\002\n(com.google.cloud.discoveryen" +
      "gine.v1alphaB\rDocumentProtoP\001ZRcloud.goo" +
      "gle.com/go/discoveryengine/apiv1alpha/di" +
      "scoveryenginepb;discoveryenginepb\242\002\017DISC" +
      "OVERYENGINE\252\002$Google.Cloud.DiscoveryEngi" +
      "ne.V1Alpha\312\002$Google\\Cloud\\DiscoveryEngin" +
      "e\\V1alpha\352\002\'Google::Cloud::DiscoveryEngi" +
      "ne::V1alphab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_discoveryengine_v1alpha_Document_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1alpha_Document_descriptor,
        new java.lang.String[] { "StructData", "JsonData", "Name", "Id", "SchemaId", "Content", "ParentDocumentId", "DerivedStructData", "Data", });
    internal_static_google_cloud_discoveryengine_v1alpha_Document_Content_descriptor =
      internal_static_google_cloud_discoveryengine_v1alpha_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Document_Content_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1alpha_Document_Content_descriptor,
        new java.lang.String[] { "RawBytes", "Uri", "MimeType", "Content", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
