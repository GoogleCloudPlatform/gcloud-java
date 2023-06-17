// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1/common.proto

package com.google.cloud.discoveryengine.v1;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1_CustomAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_CustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1_UserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_UserInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/discoveryengine/v1/common" +
      ".proto\022\037google.cloud.discoveryengine.v1\032" +
      "\031google/api/resource.proto\"0\n\017CustomAttr" +
      "ibute\022\014\n\004text\030\001 \003(\t\022\017\n\007numbers\030\002 \003(\001\"/\n\010" +
      "UserInfo\022\017\n\007user_id\030\001 \001(\t\022\022\n\nuser_agent\030" +
      "\002 \001(\tB\276\007\n#com.google.cloud.discoveryengi" +
      "ne.v1B\013CommonProtoP\001ZMcloud.google.com/g" +
      "o/discoveryengine/apiv1/discoveryenginep" +
      "b;discoveryenginepb\242\002\017DISCOVERYENGINE\252\002\037" +
      "Google.Cloud.DiscoveryEngine.V1\312\002\037Google" +
      "\\Cloud\\DiscoveryEngine\\V1\352\002\"Google::Clou" +
      "d::DiscoveryEngine::V1\352A\346\001\n%discoveryeng" +
      "ine.googleapis.com/Branch\022Qprojects/{pro" +
      "ject}/locations/{location}/dataStores/{d" +
      "ata_store}/branches/{branch}\022jprojects/{" +
      "project}/locations/{location}/collection" +
      "s/{collection}/dataStores/{data_store}/b" +
      "ranches/{branch}\352A\305\001\n(discoveryengine.go" +
      "ogleapis.com/DataStore\022?projects/{projec" +
      "t}/locations/{location}/dataStores/{data" +
      "_store}\022Xprojects/{project}/locations/{l" +
      "ocation}/collections/{collection}/dataSt" +
      "ores/{data_store}\352A\211\002\n,discoveryengine.g" +
      "oogleapis.com/ServingConfig\022_projects/{p" +
      "roject}/locations/{location}/dataStores/" +
      "{data_store}/servingConfigs/{serving_con" +
      "fig}\022xprojects/{project}/locations/{loca" +
      "tion}/collections/{collection}/dataStore" +
      "s/{data_store}/servingConfigs/{serving_c" +
      "onfig}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_discoveryengine_v1_CustomAttribute_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_CustomAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1_CustomAttribute_descriptor,
        new java.lang.String[] { "Text", "Numbers", });
    internal_static_google_cloud_discoveryengine_v1_UserInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1_UserInfo_descriptor,
        new java.lang.String[] { "UserId", "UserAgent", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
