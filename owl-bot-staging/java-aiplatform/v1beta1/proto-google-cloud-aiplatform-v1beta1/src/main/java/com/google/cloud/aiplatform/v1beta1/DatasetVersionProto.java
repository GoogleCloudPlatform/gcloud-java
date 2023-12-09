// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/dataset_version.proto

package com.google.cloud.aiplatform.v1beta1;

public final class DatasetVersionProto {
  private DatasetVersionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DatasetVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DatasetVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1beta1/datase" +
      "t_version.proto\022\037google.cloud.aiplatform" +
      ".v1beta1\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\032\037google/pro" +
      "tobuf/timestamp.proto\"\325\002\n\016DatasetVersion" +
      "\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\0225\n\013create_time\030\002 \001(" +
      "\0132\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013u" +
      "pdate_time\030\006 \001(\0132\032.google.protobuf.Times" +
      "tampB\004\342A\001\003\022\014\n\004etag\030\003 \001(\t\022$\n\026big_query_da" +
      "taset_name\030\004 \001(\tB\004\342A\001\003:\214\001\352A\210\001\n(aiplatfor" +
      "m.googleapis.com/DatasetVersion\022\\project" +
      "s/{project}/locations/{location}/dataset" +
      "s/{dataset}/datasetVersions/{dataset_ver" +
      "sion}B\352\001\n#com.google.cloud.aiplatform.v1" +
      "beta1B\023DatasetVersionProtoP\001ZCcloud.goog" +
      "le.com/go/aiplatform/apiv1beta1/aiplatfo" +
      "rmpb;aiplatformpb\252\002\037Google.Cloud.AIPlatf" +
      "orm.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1" +
      "beta1\352\002\"Google::Cloud::AIPlatform::V1bet" +
      "a1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_DatasetVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DatasetVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DatasetVersion_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Etag", "BigQueryDatasetName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
