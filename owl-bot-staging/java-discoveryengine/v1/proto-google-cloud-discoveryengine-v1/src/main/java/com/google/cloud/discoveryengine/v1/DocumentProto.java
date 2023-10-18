// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1/document.proto

package com.google.cloud.discoveryengine.v1;

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
    internal_static_google_cloud_discoveryengine_v1_Document_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1_Document_Content_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Document_Content_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/discoveryengine/v1/docume" +
      "nt.proto\022\037google.cloud.discoveryengine.v" +
      "1\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032\034google/protobuf/s" +
      "truct.proto\"\222\005\n\010Document\022.\n\013struct_data\030" +
      "\004 \001(\0132\027.google.protobuf.StructH\000\022\023\n\tjson" +
      "_data\030\005 \001(\tH\000\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022\020\n\002id\030" +
      "\002 \001(\tB\004\342A\001\005\022\021\n\tschema_id\030\003 \001(\t\022B\n\007conten" +
      "t\030\n \001(\01321.google.cloud.discoveryengine.v" +
      "1.Document.Content\022\032\n\022parent_document_id" +
      "\030\007 \001(\t\022:\n\023derived_struct_data\030\006 \001(\0132\027.go" +
      "ogle.protobuf.StructB\004\342A\001\003\032K\n\007Content\022\023\n" +
      "\traw_bytes\030\002 \001(\014H\000\022\r\n\003uri\030\003 \001(\tH\000\022\021\n\tmim" +
      "e_type\030\001 \001(\tB\t\n\007content:\226\002\352A\222\002\n\'discover" +
      "yengine.googleapis.com/Document\022fproject" +
      "s/{project}/locations/{location}/dataSto" +
      "res/{data_store}/branches/{branch}/docum" +
      "ents/{document}\022\177projects/{project}/loca" +
      "tions/{location}/collections/{collection" +
      "}/dataStores/{data_store}/branches/{bran" +
      "ch}/documents/{document}B\006\n\004dataB\200\002\n#com" +
      ".google.cloud.discoveryengine.v1B\rDocume" +
      "ntProtoP\001ZMcloud.google.com/go/discovery" +
      "engine/apiv1/discoveryenginepb;discovery" +
      "enginepb\242\002\017DISCOVERYENGINE\252\002\037Google.Clou" +
      "d.DiscoveryEngine.V1\312\002\037Google\\Cloud\\Disc" +
      "overyEngine\\V1\352\002\"Google::Cloud::Discover" +
      "yEngine::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_discoveryengine_v1_Document_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1_Document_descriptor,
        new java.lang.String[] { "StructData", "JsonData", "Name", "Id", "SchemaId", "Content", "ParentDocumentId", "DerivedStructData", "Data", });
    internal_static_google_cloud_discoveryengine_v1_Document_Content_descriptor =
      internal_static_google_cloud_discoveryengine_v1_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Document_Content_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1_Document_Content_descriptor,
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
