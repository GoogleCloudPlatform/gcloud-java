// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/feature_view_sync.proto

package com.google.cloud.aiplatform.v1;

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
    internal_static_google_cloud_aiplatform_v1_FeatureViewSync_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureViewSync_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1/feature_vie" +
      "w_sync.proto\022\032google.cloud.aiplatform.v1" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\037google/protobuf/ti" +
      "mestamp.proto\032\027google/rpc/status.proto\032\032" +
      "google/type/interval.proto\"\201\003\n\017FeatureVi" +
      "ewSync\022\022\n\004name\030\001 \001(\tB\004\342A\001\010\0225\n\013create_tim" +
      "e\030\002 \001(\0132\032.google.protobuf.TimestampB\004\342A\001" +
      "\003\022-\n\010run_time\030\005 \001(\0132\025.google.type.Interv" +
      "alB\004\342A\001\003\022.\n\014final_status\030\004 \001(\0132\022.google." +
      "rpc.StatusB\004\342A\001\003:\303\001\352A\277\001\n)aiplatform.goog" +
      "leapis.com/FeatureViewSync\022\221\001projects/{p" +
      "roject}/locations/{location}/featureOnli" +
      "neStores/{feature_online_store}/featureV" +
      "iews/{feature_view}/featureViewSyncs/fea" +
      "ture_view_syncB\322\001\n\036com.google.cloud.aipl" +
      "atform.v1B\024FeatureViewSyncProtoP\001Z>cloud" +
      ".google.com/go/aiplatform/apiv1/aiplatfo" +
      "rmpb;aiplatformpb\252\002\032Google.Cloud.AIPlatf" +
      "orm.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Go" +
      "ogle::Cloud::Aiplatform::V1b\006proto3"
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
    internal_static_google_cloud_aiplatform_v1_FeatureViewSync_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureViewSync_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_FeatureViewSync_descriptor,
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
