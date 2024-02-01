// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/entity_type.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class EntityTypeProto {
  private EntityTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_EntityType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_EntityType_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_EntityType_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1beta1/entity" +
      "_type.proto\022\037google.cloud.aiplatform.v1b" +
      "eta1\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\032=google/cloud/a" +
      "iplatform/v1beta1/featurestore_monitorin" +
      "g.proto\032\037google/protobuf/timestamp.proto" +
      "\"\320\004\n\nEntityType\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022\031\n\013d" +
      "escription\030\002 \001(\tB\004\342A\001\001\0225\n\013create_time\030\003 " +
      "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0225\n" +
      "\013update_time\030\004 \001(\0132\032.google.protobuf.Tim" +
      "estampB\004\342A\001\003\022M\n\006labels\030\006 \003(\01327.google.cl" +
      "oud.aiplatform.v1beta1.EntityType.Labels" +
      "EntryB\004\342A\001\001\022\022\n\004etag\030\007 \001(\tB\004\342A\001\001\022^\n\021monit" +
      "oring_config\030\010 \001(\0132=.google.cloud.aiplat" +
      "form.v1beta1.FeaturestoreMonitoringConfi" +
      "gB\004\342A\001\001\022&\n\030offline_storage_ttl_days\030\n \001(" +
      "\005B\004\342A\001\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v" +
      "alue\030\002 \001(\t:\0028\001:\212\001\352A\206\001\n$aiplatform.google" +
      "apis.com/EntityType\022^projects/{project}/" +
      "locations/{location}/featurestores/{feat" +
      "urestore}/entityTypes/{entity_type}B\346\001\n#" +
      "com.google.cloud.aiplatform.v1beta1B\017Ent" +
      "ityTypeProtoP\001ZCcloud.google.com/go/aipl" +
      "atform/apiv1beta1/aiplatformpb;aiplatfor" +
      "mpb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037" +
      "Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Google" +
      "::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_EntityType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_EntityType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_EntityType_descriptor,
        new java.lang.String[] { "Name", "Description", "CreateTime", "UpdateTime", "Labels", "Etag", "MonitoringConfig", "OfflineStorageTtlDays", });
    internal_static_google_cloud_aiplatform_v1beta1_EntityType_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_EntityType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_EntityType_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_EntityType_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
