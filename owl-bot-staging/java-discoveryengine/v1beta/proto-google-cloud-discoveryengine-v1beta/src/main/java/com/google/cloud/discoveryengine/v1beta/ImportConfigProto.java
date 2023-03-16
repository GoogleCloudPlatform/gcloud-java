// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1beta/import_config.proto

package com.google.cloud.discoveryengine.v1beta;

public final class ImportConfigProto {
  private ImportConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_GcsSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_BigQuerySource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ImportErrorConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportErrorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_InlineSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_InlineSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/discoveryengine/v1beta/im" +
      "port_config.proto\022#google.cloud.discover" +
      "yengine.v1beta\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\0322goog" +
      "le/cloud/discoveryengine/v1beta/document" +
      ".proto\0324google/cloud/discoveryengine/v1b" +
      "eta/user_event.proto\032\037google/protobuf/ti" +
      "mestamp.proto\032\027google/rpc/status.proto\032\026" +
      "google/type/date.proto\"9\n\tGcsSource\022\027\n\ni" +
      "nput_uris\030\001 \003(\tB\003\340A\002\022\023\n\013data_schema\030\002 \001(" +
      "\t\"\274\001\n\016BigQuerySource\022+\n\016partition_date\030\005" +
      " \001(\0132\021.google.type.DateH\000\022\022\n\nproject_id\030" +
      "\001 \001(\t\022\027\n\ndataset_id\030\002 \001(\tB\003\340A\002\022\025\n\010table_" +
      "id\030\003 \001(\tB\003\340A\002\022\027\n\017gcs_staging_dir\030\004 \001(\t\022\023" +
      "\n\013data_schema\030\006 \001(\tB\013\n\tpartition\"8\n\021Impo" +
      "rtErrorConfig\022\024\n\ngcs_prefix\030\001 \001(\tH\000B\r\n\013d" +
      "estination\"\226\004\n\027ImportUserEventsRequest\022g" +
      "\n\rinline_source\030\002 \001(\0132I.google.cloud.dis" +
      "coveryengine.v1beta.ImportUserEventsRequ" +
      "est.InlineSourceB\003\340A\002H\000\022I\n\ngcs_source\030\003 " +
      "\001(\0132..google.cloud.discoveryengine.v1bet" +
      "a.GcsSourceB\003\340A\002H\000\022S\n\017bigquery_source\030\004 " +
      "\001(\01323.google.cloud.discoveryengine.v1bet" +
      "a.BigQuerySourceB\003\340A\002H\000\022@\n\006parent\030\001 \001(\tB" +
      "0\340A\002\372A*\n(discoveryengine.googleapis.com/" +
      "DataStore\022L\n\014error_config\030\005 \001(\01326.google" +
      ".cloud.discoveryengine.v1beta.ImportErro" +
      "rConfig\032X\n\014InlineSource\022H\n\013user_events\030\001" +
      " \003(\0132..google.cloud.discoveryengine.v1be" +
      "ta.UserEventB\003\340A\002B\010\n\006source\"\317\001\n\030ImportUs" +
      "erEventsResponse\022)\n\rerror_samples\030\001 \003(\0132" +
      "\022.google.rpc.Status\022L\n\014error_config\030\002 \001(" +
      "\01326.google.cloud.discoveryengine.v1beta." +
      "ImportErrorConfig\022\033\n\023joined_events_count" +
      "\030\003 \001(\003\022\035\n\025unjoined_events_count\030\004 \001(\003\"\252\001" +
      "\n\030ImportUserEventsMetadata\022/\n\013create_tim" +
      "e\030\001 \001(\0132\032.google.protobuf.Timestamp\022/\n\013u" +
      "pdate_time\030\002 \001(\0132\032.google.protobuf.Times" +
      "tamp\022\025\n\rsuccess_count\030\003 \001(\003\022\025\n\rfailure_c" +
      "ount\030\004 \001(\003\"\251\001\n\027ImportDocumentsMetadata\022/" +
      "\n\013create_time\030\001 \001(\0132\032.google.protobuf.Ti" +
      "mestamp\022/\n\013update_time\030\002 \001(\0132\032.google.pr" +
      "otobuf.Timestamp\022\025\n\rsuccess_count\030\003 \001(\003\022" +
      "\025\n\rfailure_count\030\004 \001(\003\"\302\005\n\026ImportDocumen" +
      "tsRequest\022a\n\rinline_source\030\002 \001(\0132H.googl" +
      "e.cloud.discoveryengine.v1beta.ImportDoc" +
      "umentsRequest.InlineSourceH\000\022D\n\ngcs_sour" +
      "ce\030\003 \001(\0132..google.cloud.discoveryengine." +
      "v1beta.GcsSourceH\000\022N\n\017bigquery_source\030\004 " +
      "\001(\01323.google.cloud.discoveryengine.v1bet" +
      "a.BigQuerySourceH\000\022=\n\006parent\030\001 \001(\tB-\340A\002\372" +
      "A\'\n%discoveryengine.googleapis.com/Branc" +
      "h\022L\n\014error_config\030\005 \001(\01326.google.cloud.d" +
      "iscoveryengine.v1beta.ImportErrorConfig\022" +
      "k\n\023reconciliation_mode\030\006 \001(\0162N.google.cl" +
      "oud.discoveryengine.v1beta.ImportDocumen" +
      "tsRequest.ReconciliationMode\032U\n\014InlineSo" +
      "urce\022E\n\tdocuments\030\001 \003(\0132-.google.cloud.d" +
      "iscoveryengine.v1beta.DocumentB\003\340A\002\"T\n\022R" +
      "econciliationMode\022#\n\037RECONCILIATION_MODE" +
      "_UNSPECIFIED\020\000\022\017\n\013INCREMENTAL\020\001\022\010\n\004FULL\020" +
      "\002B\010\n\006source\"\222\001\n\027ImportDocumentsResponse\022" +
      ")\n\rerror_samples\030\001 \003(\0132\022.google.rpc.Stat" +
      "us\022L\n\014error_config\030\002 \001(\01326.google.cloud." +
      "discoveryengine.v1beta.ImportErrorConfig" +
      "B\230\002\n\'com.google.cloud.discoveryengine.v1" +
      "betaB\021ImportConfigProtoP\001ZQcloud.google." +
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
          com.google.cloud.discoveryengine.v1beta.DocumentProto.getDescriptor(),
          com.google.cloud.discoveryengine.v1beta.UserEventProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.type.DateProto.getDescriptor(),
        });
    internal_static_google_cloud_discoveryengine_v1beta_GcsSource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_GcsSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_GcsSource_descriptor,
        new java.lang.String[] { "InputUris", "DataSchema", });
    internal_static_google_cloud_discoveryengine_v1beta_BigQuerySource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_BigQuerySource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_BigQuerySource_descriptor,
        new java.lang.String[] { "PartitionDate", "ProjectId", "DatasetId", "TableId", "GcsStagingDir", "DataSchema", "Partition", });
    internal_static_google_cloud_discoveryengine_v1beta_ImportErrorConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_ImportErrorConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ImportErrorConfig_descriptor,
        new java.lang.String[] { "GcsPrefix", "Destination", });
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_descriptor,
        new java.lang.String[] { "InlineSource", "GcsSource", "BigquerySource", "Parent", "ErrorConfig", "Source", });
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_InlineSource_descriptor =
      internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_InlineSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsRequest_InlineSource_descriptor,
        new java.lang.String[] { "UserEvents", });
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsResponse_descriptor,
        new java.lang.String[] { "ErrorSamples", "ErrorConfig", "JoinedEventsCount", "UnjoinedEventsCount", });
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ImportUserEventsMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "UpdateTime", "SuccessCount", "FailureCount", });
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "UpdateTime", "SuccessCount", "FailureCount", });
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_descriptor,
        new java.lang.String[] { "InlineSource", "GcsSource", "BigquerySource", "Parent", "ErrorConfig", "ReconciliationMode", "Source", });
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_InlineSource_descriptor =
      internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_InlineSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsRequest_InlineSource_descriptor,
        new java.lang.String[] { "Documents", });
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ImportDocumentsResponse_descriptor,
        new java.lang.String[] { "ErrorSamples", "ErrorConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.DocumentProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.UserEventProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
