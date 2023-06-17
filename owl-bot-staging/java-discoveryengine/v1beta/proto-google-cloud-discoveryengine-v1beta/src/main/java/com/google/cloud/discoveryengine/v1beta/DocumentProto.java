// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1beta/document.proto

package com.google.cloud.discoveryengine.v1beta;

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
    internal_static_google_cloud_discoveryengine_v1beta_Document_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_Document_Content_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Document_Content_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/discoveryengine/v1beta/do" +
      "cument.proto\022#google.cloud.discoveryengi" +
      "ne.v1beta\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032\034google/pr" +
      "otobuf/struct.proto\"\226\005\n\010Document\022.\n\013stru" +
      "ct_data\030\004 \001(\0132\027.google.protobuf.StructH\000" +
      "\022\023\n\tjson_data\030\005 \001(\tH\000\022\022\n\004name\030\001 \001(\tB\004\342A\001" +
      "\005\022\020\n\002id\030\002 \001(\tB\004\342A\001\005\022\021\n\tschema_id\030\003 \001(\t\022F" +
      "\n\007content\030\n \001(\01325.google.cloud.discovery" +
      "engine.v1beta.Document.Content\022\032\n\022parent" +
      "_document_id\030\007 \001(\t\022:\n\023derived_struct_dat" +
      "a\030\006 \001(\0132\027.google.protobuf.StructB\004\342A\001\003\032K" +
      "\n\007Content\022\023\n\traw_bytes\030\002 \001(\014H\000\022\r\n\003uri\030\003 " +
      "\001(\tH\000\022\021\n\tmime_type\030\001 \001(\tB\t\n\007content:\226\002\352A" +
      "\222\002\n\'discoveryengine.googleapis.com/Docum" +
      "ent\022fprojects/{project}/locations/{locat" +
      "ion}/dataStores/{data_store}/branches/{b" +
      "ranch}/documents/{document}\022\177projects/{p" +
      "roject}/locations/{location}/collections" +
      "/{collection}/dataStores/{data_store}/br" +
      "anches/{branch}/documents/{document}B\006\n\004" +
      "dataB\224\002\n\'com.google.cloud.discoveryengin" +
      "e.v1betaB\rDocumentProtoP\001ZQcloud.google." +
      "com/go/discoveryengine/apiv1beta/discove" +
      "ryenginepb;discoveryenginepb\242\002\017DISCOVERY" +
      "ENGINE\252\002#Google.Cloud.DiscoveryEngine.V1" +
      "Beta\312\002#Google\\Cloud\\DiscoveryEngine\\V1be" +
      "ta\352\002&Google::Cloud::DiscoveryEngine::V1b" +
      "etab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_discoveryengine_v1beta_Document_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_Document_descriptor,
        new java.lang.String[] { "StructData", "JsonData", "Name", "Id", "SchemaId", "Content", "ParentDocumentId", "DerivedStructData", "Data", });
    internal_static_google_cloud_discoveryengine_v1beta_Document_Content_descriptor =
      internal_static_google_cloud_discoveryengine_v1beta_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Document_Content_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_Document_Content_descriptor,
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
