// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/openapi.proto

package com.google.cloud.aiplatform.v1beta1;

public final class OpenApiProto {
  private OpenApiProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Schema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Schema_PropertiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Schema_PropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1beta1/openap" +
      "i.proto\022\037google.cloud.aiplatform.v1beta1" +
      "\032\037google/api/field_behavior.proto\032\034googl" +
      "e/protobuf/struct.proto\"\324\003\n\006Schema\0229\n\004ty" +
      "pe\030\001 \001(\0162%.google.cloud.aiplatform.v1bet" +
      "a1.TypeB\004\342A\001\001\022\024\n\006format\030\007 \001(\tB\004\342A\001\001\022\031\n\013d" +
      "escription\030\010 \001(\tB\004\342A\001\001\022\026\n\010nullable\030\006 \001(\010" +
      "B\004\342A\001\001\022<\n\005items\030\002 \001(\0132\'.google.cloud.aip" +
      "latform.v1beta1.SchemaB\004\342A\001\001\022\022\n\004enum\030\t \003" +
      "(\tB\004\342A\001\001\022Q\n\nproperties\030\003 \003(\01327.google.cl" +
      "oud.aiplatform.v1beta1.Schema.Properties" +
      "EntryB\004\342A\001\001\022\026\n\010required\030\005 \003(\tB\004\342A\001\001\022-\n\007e" +
      "xample\030\004 \001(\0132\026.google.protobuf.ValueB\004\342A" +
      "\001\001\032Z\n\017PropertiesEntry\022\013\n\003key\030\001 \001(\t\0226\n\005va" +
      "lue\030\002 \001(\0132\'.google.cloud.aiplatform.v1be" +
      "ta1.Schema:\0028\001*e\n\004Type\022\024\n\020TYPE_UNSPECIFI" +
      "ED\020\000\022\n\n\006STRING\020\001\022\n\n\006NUMBER\020\002\022\013\n\007INTEGER\020" +
      "\003\022\013\n\007BOOLEAN\020\004\022\t\n\005ARRAY\020\005\022\n\n\006OBJECT\020\006B\343\001" +
      "\n#com.google.cloud.aiplatform.v1beta1B\014O" +
      "penApiProtoP\001ZCcloud.google.com/go/aipla" +
      "tform/apiv1beta1/aiplatformpb;aiplatform" +
      "pb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037G" +
      "oogle\\Cloud\\AIPlatform\\V1beta1\352\002\"Google:" +
      ":Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_Schema_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Schema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Schema_descriptor,
        new java.lang.String[] { "Type", "Format", "Description", "Nullable", "Items", "Enum", "Properties", "Required", "Example", });
    internal_static_google_cloud_aiplatform_v1beta1_Schema_PropertiesEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Schema_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Schema_PropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Schema_PropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
