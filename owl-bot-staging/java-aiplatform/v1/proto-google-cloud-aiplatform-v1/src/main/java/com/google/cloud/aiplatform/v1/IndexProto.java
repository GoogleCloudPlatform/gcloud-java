// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/index.proto

package com.google.cloud.aiplatform.v1;

public final class IndexProto {
  private IndexProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Index_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Index_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_IndexStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/aiplatform/v1/index.proto" +
      "\022\032google.cloud.aiplatform.v1\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\0323google/cloud/aiplatform/v1/dep" +
      "loyed_index_ref.proto\032\034google/protobuf/s" +
      "truct.proto\032\037google/protobuf/timestamp.p" +
      "roto\"\242\006\n\005Index\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014dis" +
      "play_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(" +
      "\t\022 \n\023metadata_schema_uri\030\004 \001(\tB\003\340A\005\022(\n\010m" +
      "etadata\030\006 \001(\0132\026.google.protobuf.Value\022K\n" +
      "\020deployed_indexes\030\007 \003(\0132,.google.cloud.a" +
      "iplatform.v1.DeployedIndexRefB\003\340A\003\022\014\n\004et" +
      "ag\030\010 \001(\t\022=\n\006labels\030\t \003(\0132-.google.cloud." +
      "aiplatform.v1.Index.LabelsEntry\0224\n\013creat" +
      "e_time\030\n \001(\0132\032.google.protobuf.Timestamp" +
      "B\003\340A\003\0224\n\013update_time\030\013 \001(\0132\032.google.prot" +
      "obuf.TimestampB\003\340A\003\022@\n\013index_stats\030\016 \001(\013" +
      "2&.google.cloud.aiplatform.v1.IndexStats" +
      "B\003\340A\003\022U\n\023index_update_method\030\020 \001(\01623.goo" +
      "gle.cloud.aiplatform.v1.Index.IndexUpdat" +
      "eMethodB\003\340A\005\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t" +
      "\022\r\n\005value\030\002 \001(\t:\0028\001\"]\n\021IndexUpdateMethod" +
      "\022#\n\037INDEX_UPDATE_METHOD_UNSPECIFIED\020\000\022\020\n" +
      "\014BATCH_UPDATE\020\001\022\021\n\rSTREAM_UPDATE\020\002:]\352AZ\n" +
      "\037aiplatform.googleapis.com/Index\0227projec" +
      "ts/{project}/locations/{location}/indexe" +
      "s/{index}\"\337\002\n\016IndexDatapoint\022\031\n\014datapoin" +
      "t_id\030\001 \001(\tB\003\340A\002\022\033\n\016feature_vector\030\002 \003(\002B" +
      "\003\340A\002\022N\n\trestricts\030\004 \003(\01326.google.cloud.a" +
      "iplatform.v1.IndexDatapoint.RestrictionB" +
      "\003\340A\001\022Q\n\014crowding_tag\030\005 \001(\01326.google.clou" +
      "d.aiplatform.v1.IndexDatapoint.CrowdingT" +
      "agB\003\340A\001\032G\n\013Restriction\022\021\n\tnamespace\030\001 \001(" +
      "\t\022\022\n\nallow_list\030\002 \003(\t\022\021\n\tdeny_list\030\003 \003(\t" +
      "\032)\n\013CrowdingTag\022\032\n\022crowding_attribute\030\001 " +
      "\001(\t\"C\n\nIndexStats\022\032\n\rvectors_count\030\001 \001(\003" +
      "B\003\340A\003\022\031\n\014shards_count\030\002 \001(\005B\003\340A\003B\316\001\n\036com" +
      ".google.cloud.aiplatform.v1B\nIndexProtoP" +
      "\001ZDgoogle.golang.org/genproto/googleapis" +
      "/cloud/aiplatform/v1;aiplatform\252\002\032Google" +
      ".Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPl" +
      "atform\\V1\352\002\035Google::Cloud::AIPlatform::V" +
      "1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.DeployedIndexRefProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_Index_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Index_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Index_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "MetadataSchemaUri", "Metadata", "DeployedIndexes", "Etag", "Labels", "CreateTime", "UpdateTime", "IndexStats", "IndexUpdateMethod", });
    internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_Index_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor,
        new java.lang.String[] { "DatapointId", "FeatureVector", "Restricts", "CrowdingTag", });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_descriptor =
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_descriptor,
        new java.lang.String[] { "Namespace", "AllowList", "DenyList", });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_descriptor =
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_descriptor,
        new java.lang.String[] { "CrowdingAttribute", });
    internal_static_google_cloud_aiplatform_v1_IndexStats_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_IndexStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_IndexStats_descriptor,
        new java.lang.String[] { "VectorsCount", "ShardsCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DeployedIndexRefProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
