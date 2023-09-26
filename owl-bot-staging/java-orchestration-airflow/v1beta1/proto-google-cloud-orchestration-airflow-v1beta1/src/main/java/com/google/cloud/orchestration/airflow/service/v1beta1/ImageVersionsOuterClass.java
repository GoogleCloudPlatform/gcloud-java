// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1beta1/image_versions.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public final class ImageVersionsOuterClass {
  private ImageVersionsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_ImageVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orchestration_airflow_service_v1beta1_ImageVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/cloud/orchestration/airflow/ser" +
      "vice/v1beta1/image_versions.proto\0222googl" +
      "e.cloud.orchestration.airflow.service.v1" +
      "beta1\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032\026google/type/date.p" +
      "roto\"p\n\030ListImageVersionsRequest\022\016\n\006pare" +
      "nt\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_toke" +
      "n\030\003 \001(\t\022\035\n\025include_past_releases\030\004 \001(\010\"\216" +
      "\001\n\031ListImageVersionsResponse\022X\n\016image_ve" +
      "rsions\030\001 \003(\0132@.google.cloud.orchestratio" +
      "n.airflow.service.v1beta1.ImageVersion\022\027" +
      "\n\017next_page_token\030\002 \001(\t\"\275\001\n\014ImageVersion" +
      "\022\030\n\020image_version_id\030\001 \001(\t\022\022\n\nis_default" +
      "\030\002 \001(\010\022!\n\031supported_python_versions\030\003 \003(" +
      "\t\022\'\n\014release_date\030\004 \001(\0132\021.google.type.Da" +
      "te\022\031\n\021creation_disabled\030\005 \001(\010\022\030\n\020upgrade" +
      "_disabled\030\006 \001(\0102\330\002\n\rImageVersions\022\371\001\n\021Li" +
      "stImageVersions\022L.google.cloud.orchestra" +
      "tion.airflow.service.v1beta1.ListImageVe" +
      "rsionsRequest\032M.google.cloud.orchestrati" +
      "on.airflow.service.v1beta1.ListImageVers" +
      "ionsResponse\"G\332A\006parent\202\323\344\223\0028\0226/v1beta1/" +
      "{parent=projects/*/locations/*}/imageVer" +
      "sions\032K\312A\027composer.googleapis.com\322A.http" +
      "s://www.googleapis.com/auth/cloud-platfo" +
      "rmB\214\001\n6com.google.cloud.orchestration.ai" +
      "rflow.service.v1beta1P\001ZPcloud.google.co" +
      "m/go/orchestration/airflow/service/apiv1" +
      "beta1/servicepb;servicepbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.type.DateProto.getDescriptor(),
        });
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "IncludePastReleases", });
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsResponse_descriptor,
        new java.lang.String[] { "ImageVersions", "NextPageToken", });
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_ImageVersion_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_ImageVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orchestration_airflow_service_v1beta1_ImageVersion_descriptor,
        new java.lang.String[] { "ImageVersionId", "IsDefault", "SupportedPythonVersions", "ReleaseDate", "CreationDisabled", "UpgradeDisabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
