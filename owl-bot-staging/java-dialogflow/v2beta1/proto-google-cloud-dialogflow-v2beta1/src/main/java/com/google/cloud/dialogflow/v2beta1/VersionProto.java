// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/version.proto

package com.google.cloud.dialogflow.v2beta1;

public final class VersionProto {
  private VersionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_Version_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListVersionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListVersionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_GetVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_CreateVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_UpdateVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DeleteVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2beta1/versio" +
      "n.proto\022\037google.cloud.dialogflow.v2beta1" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032\033goo" +
      "gle/protobuf/empty.proto\032 google/protobu" +
      "f/field_mask.proto\032\037google/protobuf/time" +
      "stamp.proto\"\310\003\n\007Version\022\021\n\004name\030\001 \001(\tB\003\340" +
      "A\003\022\030\n\013description\030\002 \001(\tB\003\340A\001\022\033\n\016version_" +
      "number\030\003 \001(\005B\003\340A\003\0224\n\013create_time\030\004 \001(\0132\032" +
      ".google.protobuf.TimestampB\003\340A\003\022K\n\006statu" +
      "s\030\006 \001(\01626.google.cloud.dialogflow.v2beta" +
      "1.Version.VersionStatusB\003\340A\003\"W\n\rVersionS" +
      "tatus\022\036\n\032VERSION_STATUS_UNSPECIFIED\020\000\022\017\n" +
      "\013IN_PROGRESS\020\001\022\t\n\005READY\020\002\022\n\n\006FAILED\020\003:\226\001" +
      "\352A\222\001\n!dialogflow.googleapis.com/Version\022" +
      "+projects/{project}/agent/versions/{vers" +
      "ion}\022@projects/{project}/locations/{loca" +
      "tion}/agent/versions/{version}\"\201\001\n\023ListV" +
      "ersionsRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!" +
      "dialogflow.googleapis.com/Version\022\026\n\tpag" +
      "e_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340" +
      "A\001\"k\n\024ListVersionsResponse\022:\n\010versions\030\001" +
      " \003(\0132(.google.cloud.dialogflow.v2beta1.V" +
      "ersion\022\027\n\017next_page_token\030\002 \001(\t\"L\n\021GetVe" +
      "rsionRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!dial" +
      "ogflow.googleapis.com/Version\"\221\001\n\024Create" +
      "VersionRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!" +
      "dialogflow.googleapis.com/Version\022>\n\007ver" +
      "sion\030\002 \001(\0132(.google.cloud.dialogflow.v2b" +
      "eta1.VersionB\003\340A\002\"\214\001\n\024UpdateVersionReque" +
      "st\022>\n\007version\030\001 \001(\0132(.google.cloud.dialo" +
      "gflow.v2beta1.VersionB\003\340A\002\0224\n\013update_mas" +
      "k\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002" +
      "\"O\n\024DeleteVersionRequest\0227\n\004name\030\001 \001(\tB)" +
      "\340A\002\372A#\n!dialogflow.googleapis.com/Versio" +
      "n2\333\n\n\010Versions\022\364\001\n\014ListVersions\0224.google" +
      ".cloud.dialogflow.v2beta1.ListVersionsRe" +
      "quest\0325.google.cloud.dialogflow.v2beta1." +
      "ListVersionsResponse\"w\202\323\344\223\002h\022+/v2beta1/{" +
      "parent=projects/*/agent}/versionsZ9\0227/v2" +
      "beta1/{parent=projects/*/locations/*/age" +
      "nt}/versions\332A\006parent\022\341\001\n\nGetVersion\0222.g" +
      "oogle.cloud.dialogflow.v2beta1.GetVersio" +
      "nRequest\032(.google.cloud.dialogflow.v2bet" +
      "a1.Version\"u\202\323\344\223\002h\022+/v2beta1/{name=proje" +
      "cts/*/agent/versions/*}Z9\0227/v2beta1/{nam" +
      "e=projects/*/locations/*/agent/versions/" +
      "*}\332A\004name\022\204\002\n\rCreateVersion\0225.google.clo" +
      "ud.dialogflow.v2beta1.CreateVersionReque" +
      "st\032(.google.cloud.dialogflow.v2beta1.Ver" +
      "sion\"\221\001\202\323\344\223\002z\"+/v2beta1/{parent=projects" +
      "/*/agent}/versions:\007versionZB\"7/v2beta1/" +
      "{parent=projects/*/locations/*/agent}/ve" +
      "rsions:\007version\332A\016parent,version\022\232\002\n\rUpd" +
      "ateVersion\0225.google.cloud.dialogflow.v2b" +
      "eta1.UpdateVersionRequest\032(.google.cloud" +
      ".dialogflow.v2beta1.Version\"\247\001\202\323\344\223\002\212\00123/" +
      "v2beta1/{version.name=projects/*/agent/v" +
      "ersions/*}:\007versionZJ2?/v2beta1/{version" +
      ".name=projects/*/locations/*/agent/versi" +
      "ons/*}:\007version\332A\023version,update_mask\022\325\001" +
      "\n\rDeleteVersion\0225.google.cloud.dialogflo" +
      "w.v2beta1.DeleteVersionRequest\032\026.google." +
      "protobuf.Empty\"u\202\323\344\223\002h*+/v2beta1/{name=p" +
      "rojects/*/agent/versions/*}Z9*7/v2beta1/" +
      "{name=projects/*/locations/*/agent/versi" +
      "ons/*}\332A\004name\032x\312A\031dialogflow.googleapis." +
      "com\322AYhttps://www.googleapis.com/auth/cl" +
      "oud-platform,https://www.googleapis.com/" +
      "auth/dialogflowB\244\001\n#com.google.cloud.dia" +
      "logflow.v2beta1B\014VersionProtoP\001ZCcloud.g" +
      "oogle.com/go/dialogflow/apiv2beta1/dialo" +
      "gflowpb;dialogflowpb\370\001\001\242\002\002DF\252\002\037Google.Cl" +
      "oud.Dialogflow.V2Beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2beta1_Version_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Version_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_Version_descriptor,
        new java.lang.String[] { "Name", "Description", "VersionNumber", "CreateTime", "Status", });
    internal_static_google_cloud_dialogflow_v2beta1_ListVersionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListVersionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListVersionsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_ListVersionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListVersionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListVersionsResponse_descriptor,
        new java.lang.String[] { "Versions", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_GetVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_GetVersionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_CreateVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_CreateVersionRequest_descriptor,
        new java.lang.String[] { "Parent", "Version", });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_UpdateVersionRequest_descriptor,
        new java.lang.String[] { "Version", "UpdateMask", });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DeleteVersionRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
