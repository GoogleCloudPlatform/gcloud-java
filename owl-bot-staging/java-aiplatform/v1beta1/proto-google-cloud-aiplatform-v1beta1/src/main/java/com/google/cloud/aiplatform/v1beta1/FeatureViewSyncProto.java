// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/feature_view_sync.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class FeatureViewSyncProto {
  private FeatureViewSyncProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1beta1/featur" +
      "e_view_sync.proto\022\037google.cloud.aiplatfo" +
      "rm.v1beta1\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\032\037google/p" +
      "rotobuf/timestamp.proto\032\027google/rpc/stat" +
      "us.proto\032\032google/type/interval.proto\"\201\003\n" +
      "\017FeatureViewSync\022\022\n\004name\030\001 \001(\tB\004\342A\001\010\0225\n\013" +
      "create_time\030\002 \001(\0132\032.google.protobuf.Time" +
      "stampB\004\342A\001\003\022-\n\010run_time\030\005 \001(\0132\025.google.t" +
      "ype.IntervalB\004\342A\001\003\022.\n\014final_status\030\004 \001(\013" +
      "2\022.google.rpc.StatusB\004\342A\001\003:\303\001\352A\277\001\n)aipla" +
      "tform.googleapis.com/FeatureViewSync\022\221\001p" +
      "rojects/{project}/locations/{location}/f" +
      "eatureOnlineStores/{feature_online_store" +
      "}/featureViews/{feature_view}/featureVie" +
      "wSyncs/feature_view_syncB\353\001\n#com.google." +
      "cloud.aiplatform.v1beta1B\024FeatureViewSyn" +
      "cProtoP\001ZCcloud.google.com/go/aiplatform" +
      "/apiv1beta1/aiplatformpb;aiplatformpb\252\002\037" +
      "Google.Cloud.AIPlatform.V1Beta1\312\002\037Google" +
      "\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::Clou" +
      "d::Aiplatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.type.IntervalProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "RunTime", "FinalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.IntervalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
