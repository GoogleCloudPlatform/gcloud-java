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
      "otobuf/struct.proto\"\307\002\n\010Document\022.\n\013stru" +
      "ct_data\030\004 \001(\0132\027.google.protobuf.StructH\000" +
      "\022\023\n\tjson_data\030\005 \001(\tH\000\022\021\n\004name\030\001 \001(\tB\003\340A\005" +
      "\022\017\n\002id\030\002 \001(\tB\003\340A\005\022\026\n\tschema_id\030\003 \001(\tB\003\340A" +
      "\002\022\032\n\022parent_document_id\030\007 \001(\t:\225\001\352A\221\001\n\'di" +
      "scoveryengine.googleapis.com/Document\022fp" +
      "rojects/{project}/locations/{location}/d" +
      "ataStores/{data_store}/branches/{branch}" +
      "/documents/{document}B\006\n\004dataB\224\002\n\'com.go" +
      "ogle.cloud.discoveryengine.v1betaB\rDocum" +
      "entProtoP\001ZQcloud.google.com/go/discover" +
      "yengine/apiv1beta/discoveryenginepb;disc" +
      "overyenginepb\242\002\017DISCOVERYENGINE\252\002#Google" +
      ".Cloud.DiscoveryEngine.V1Beta\312\002#Google\\C" +
      "loud\\DiscoveryEngine\\V1beta\352\002&Google::Cl" +
      "oud::DiscoveryEngine::V1betab\006proto3"
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
        new java.lang.String[] { "StructData", "JsonData", "Name", "Id", "SchemaId", "ParentDocumentId", "Data", });
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
