// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/dashboards_service.proto

package com.google.monitoring.dashboard.v1;

public final class DashboardsServiceProto {
  private DashboardsServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/monitoring/dashboard/v1/dashboa" +
      "rds_service.proto\022\036google.monitoring.das" +
      "hboard.v1\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\032.google/monitoring/dashboard/v1/das" +
      "hboard.proto\032\033google/protobuf/empty.prot" +
      "o\"\211\001\n\026CreateDashboardRequest\022\024\n\006parent\030\001" +
      " \001(\tB\004\342A\001\002\022B\n\tdashboard\030\002 \001(\0132).google.m" +
      "onitoring.dashboard.v1.DashboardB\004\342A\001\002\022\025" +
      "\n\rvalidate_only\030\003 \001(\010\"\204\001\n\025ListDashboards" +
      "Request\022D\n\006parent\030\001 \001(\tB4\342A\001\002\372A-\n+cloudr" +
      "esourcemanager.googleapis.com/Project\022\021\n" +
      "\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"p\n\026" +
      "ListDashboardsResponse\022=\n\ndashboards\030\001 \003" +
      "(\0132).google.monitoring.dashboard.v1.Dash" +
      "board\022\027\n\017next_page_token\030\002 \001(\t\"Q\n\023GetDas" +
      "hboardRequest\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%\n#mo" +
      "nitoring.googleapis.com/Dashboard\"T\n\026Del" +
      "eteDashboardRequest\022:\n\004name\030\001 \001(\tB,\342A\001\002\372" +
      "A%\n#monitoring.googleapis.com/Dashboard\"" +
      "s\n\026UpdateDashboardRequest\022B\n\tdashboard\030\001" +
      " \001(\0132).google.monitoring.dashboard.v1.Da" +
      "shboardB\004\342A\001\002\022\025\n\rvalidate_only\030\003 \001(\0102\261\010\n" +
      "\021DashboardsService\022\253\001\n\017CreateDashboard\0226" +
      ".google.monitoring.dashboard.v1.CreateDa" +
      "shboardRequest\032).google.monitoring.dashb" +
      "oard.v1.Dashboard\"5\202\323\344\223\002/\"\"/v1/{parent=p" +
      "rojects/*}/dashboards:\tdashboard\022\253\001\n\016Lis" +
      "tDashboards\0225.google.monitoring.dashboar" +
      "d.v1.ListDashboardsRequest\0326.google.moni" +
      "toring.dashboard.v1.ListDashboardsRespon" +
      "se\"*\202\323\344\223\002$\022\"/v1/{parent=projects/*}/dash" +
      "boards\022\232\001\n\014GetDashboard\0223.google.monitor" +
      "ing.dashboard.v1.GetDashboardRequest\032).g" +
      "oogle.monitoring.dashboard.v1.Dashboard\"" +
      "*\202\323\344\223\002$\022\"/v1/{name=projects/*/dashboards" +
      "/*}\022\215\001\n\017DeleteDashboard\0226.google.monitor" +
      "ing.dashboard.v1.DeleteDashboardRequest\032" +
      "\026.google.protobuf.Empty\"*\202\323\344\223\002$*\"/v1/{na" +
      "me=projects/*/dashboards/*}\022\265\001\n\017UpdateDa" +
      "shboard\0226.google.monitoring.dashboard.v1" +
      ".UpdateDashboardRequest\032).google.monitor" +
      "ing.dashboard.v1.Dashboard\"?\202\323\344\223\00292,/v1/" +
      "{dashboard.name=projects/*/dashboards/*}" +
      ":\tdashboard\032\332\001\312A\031monitoring.googleapis.c" +
      "om\322A\272\001https://www.googleapis.com/auth/cl" +
      "oud-platform,https://www.googleapis.com/" +
      "auth/monitoring,https://www.googleapis.c" +
      "om/auth/monitoring.read,https://www.goog" +
      "leapis.com/auth/monitoring.writeB\377\001\n\"com" +
      ".google.monitoring.dashboard.v1B\026Dashboa" +
      "rdsServiceProtoP\001ZFcloud.google.com/go/m" +
      "onitoring/dashboard/apiv1/dashboardpb;da" +
      "shboardpb\252\002$Google.Cloud.Monitoring.Dash" +
      "board.V1\312\002$Google\\Cloud\\Monitoring\\Dashb" +
      "oard\\V1\352\002(Google::Cloud::Monitoring::Das" +
      "hboard::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.monitoring.dashboard.v1.DashboardsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor,
        new java.lang.String[] { "Parent", "Dashboard", "ValidateOnly", });
    internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_descriptor,
        new java.lang.String[] { "Dashboards", "NextPageToken", });
    internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor,
        new java.lang.String[] { "Dashboard", "ValidateOnly", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.dashboard.v1.DashboardsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
