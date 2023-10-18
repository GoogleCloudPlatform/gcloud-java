// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1alpha/site_search_engine_service.proto

package com.google.cloud.discoveryengine.v1alpha;

public final class SiteSearchEngineServiceProto {
  private SiteSearchEngineServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_FailureReason_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_FailureReason_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/cloud/discoveryengine/v1alpha/s" +
      "ite_search_engine_service.proto\022$google." +
      "cloud.discoveryengine.v1alpha\032\034google/ap" +
      "i/annotations.proto\032\027google/api/client.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\032#google/longrun" +
      "ning/operations.proto\032\037google/protobuf/t" +
      "imestamp.proto\"~\n\022RecrawlUrisRequest\022T\n\022" +
      "site_search_engine\030\001 \001(\tB8\342A\001\002\372A1\n/disco" +
      "veryengine.googleapis.com/SiteSearchEngi" +
      "ne\022\022\n\004uris\030\002 \003(\tB\004\342A\001\002\"\367\003\n\023RecrawlUrisRe" +
      "sponse\022^\n\017failure_samples\030\001 \003(\0132E.google" +
      ".cloud.discoveryengine.v1alpha.RecrawlUr" +
      "isResponse.FailureInfo\022\023\n\013failed_uris\030\002 " +
      "\003(\t\032\352\002\n\013FailureInfo\022\013\n\003uri\030\001 \001(\t\022l\n\017fail" +
      "ure_reasons\030\002 \003(\0132S.google.cloud.discove" +
      "ryengine.v1alpha.RecrawlUrisResponse.Fai" +
      "lureInfo.FailureReason\032\337\001\n\rFailureReason" +
      "\022s\n\013corpus_type\030\001 \001(\0162^.google.cloud.dis" +
      "coveryengine.v1alpha.RecrawlUrisResponse" +
      ".FailureInfo.FailureReason.CorpusType\022\025\n" +
      "\rerror_message\030\002 \001(\t\"B\n\nCorpusType\022\033\n\027CO" +
      "RPUS_TYPE_UNSPECIFIED\020\000\022\013\n\007DESKTOP\020\001\022\n\n\006" +
      "MOBILE\020\002\"\363\001\n\023RecrawlUrisMetadata\022/\n\013crea" +
      "te_time\030\001 \001(\0132\032.google.protobuf.Timestam" +
      "p\022/\n\013update_time\030\002 \001(\0132\032.google.protobuf" +
      ".Timestamp\022\024\n\014invalid_uris\030\003 \003(\t\022\030\n\020vali" +
      "d_uris_count\030\004 \001(\005\022\025\n\rsuccess_count\030\005 \001(" +
      "\005\022\025\n\rpending_count\030\006 \001(\005\022\034\n\024quota_exceed" +
      "ed_count\030\007 \001(\0052\255\004\n\027SiteSearchEngineServi" +
      "ce\022\275\003\n\013RecrawlUris\0228.google.cloud.discov" +
      "eryengine.v1alpha.RecrawlUrisRequest\032\035.g" +
      "oogle.longrunning.Operation\"\324\002\312At\n8googl" +
      "e.cloud.discoveryengine.v1alpha.RecrawlU" +
      "risResponse\0228google.cloud.discoveryengin" +
      "e.v1alpha.RecrawlUrisMetadata\202\323\344\223\002\326\001\"^/v" +
      "1alpha/{site_search_engine=projects/*/lo" +
      "cations/*/dataStores/*/siteSearchEngine}" +
      ":recrawlUris:\001*Zq\"l/v1alpha/{site_search" +
      "_engine=projects/*/locations/*/collectio" +
      "ns/*/dataStores/*/siteSearchEngine}:recr" +
      "awlUris:\001*\032R\312A\036discoveryengine.googleapi" +
      "s.com\322A.https://www.googleapis.com/auth/" +
      "cloud-platformB\250\002\n(com.google.cloud.disc" +
      "overyengine.v1alphaB\034SiteSearchEngineSer" +
      "viceProtoP\001ZRcloud.google.com/go/discove" +
      "ryengine/apiv1alpha/discoveryenginepb;di" +
      "scoveryenginepb\242\002\017DISCOVERYENGINE\252\002$Goog" +
      "le.Cloud.DiscoveryEngine.V1Alpha\312\002$Googl" +
      "e\\Cloud\\DiscoveryEngine\\V1alpha\352\002\'Google" +
      "::Cloud::DiscoveryEngine::V1alphab\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisRequest_descriptor,
        new java.lang.String[] { "SiteSearchEngine", "Uris", });
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_descriptor,
        new java.lang.String[] { "FailureSamples", "FailedUris", });
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_descriptor =
      internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_descriptor,
        new java.lang.String[] { "Uri", "FailureReasons", });
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_FailureReason_descriptor =
      internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_FailureReason_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisResponse_FailureInfo_FailureReason_descriptor,
        new java.lang.String[] { "CorpusType", "ErrorMessage", });
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1alpha_RecrawlUrisMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "UpdateTime", "InvalidUris", "ValidUrisCount", "SuccessCount", "PendingCount", "QuotaExceededCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
