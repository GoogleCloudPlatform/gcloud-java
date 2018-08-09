// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

public final class MetricServiceProto {
  private MetricServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListTimeSeriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListTimeSeriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/monitoring/v3/metric_service.pr" +
      "oto\022\024google.monitoring.v3\032\034google/api/an" +
      "notations.proto\032\027google/api/metric.proto" +
      "\032#google/api/monitored_resource.proto\032!g" +
      "oogle/monitoring/v3/common.proto\032!google" +
      "/monitoring/v3/metric.proto\032\036google/prot" +
      "obuf/duration.proto\032\033google/protobuf/emp" +
      "ty.proto\032\027google/rpc/status.proto\"n\n\'Lis" +
      "tMonitoredResourceDescriptorsRequest\022\014\n\004" +
      "name\030\005 \001(\t\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030" +
      "\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"\212\001\n(ListMonito" +
      "redResourceDescriptorsResponse\022E\n\024resour" +
      "ce_descriptors\030\001 \003(\0132\'.google.api.Monito" +
      "redResourceDescriptor\022\027\n\017next_page_token" +
      "\030\002 \001(\t\"5\n%GetMonitoredResourceDescriptor" +
      "Request\022\014\n\004name\030\003 \001(\t\"c\n\034ListMetricDescr" +
      "iptorsRequest\022\014\n\004name\030\005 \001(\t\022\016\n\006filter\030\002 " +
      "\001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001" +
      "(\t\"r\n\035ListMetricDescriptorsResponse\0228\n\022m" +
      "etric_descriptors\030\001 \003(\0132\034.google.api.Met" +
      "ricDescriptor\022\027\n\017next_page_token\030\002 \001(\t\"*" +
      "\n\032GetMetricDescriptorRequest\022\014\n\004name\030\003 \001" +
      "(\t\"f\n\035CreateMetricDescriptorRequest\022\014\n\004n" +
      "ame\030\003 \001(\t\0227\n\021metric_descriptor\030\002 \001(\0132\034.g" +
      "oogle.api.MetricDescriptor\"-\n\035DeleteMetr" +
      "icDescriptorRequest\022\014\n\004name\030\003 \001(\t\"\317\002\n\025Li" +
      "stTimeSeriesRequest\022\014\n\004name\030\n \001(\t\022\016\n\006fil" +
      "ter\030\002 \001(\t\0224\n\010interval\030\004 \001(\0132\".google.mon" +
      "itoring.v3.TimeInterval\0226\n\013aggregation\030\005" +
      " \001(\0132!.google.monitoring.v3.Aggregation\022" +
      "\020\n\010order_by\030\006 \001(\t\022H\n\004view\030\007 \001(\0162:.google" +
      ".monitoring.v3.ListTimeSeriesRequest.Tim" +
      "eSeriesView\022\021\n\tpage_size\030\010 \001(\005\022\022\n\npage_t" +
      "oken\030\t \001(\t\"\'\n\016TimeSeriesView\022\010\n\004FULL\020\000\022\013" +
      "\n\007HEADERS\020\001\"\226\001\n\026ListTimeSeriesResponse\0225" +
      "\n\013time_series\030\001 \003(\0132 .google.monitoring." +
      "v3.TimeSeries\022\027\n\017next_page_token\030\002 \001(\t\022," +
      "\n\020execution_errors\030\003 \003(\0132\022.google.rpc.St" +
      "atus\"^\n\027CreateTimeSeriesRequest\022\014\n\004name\030" +
      "\003 \001(\t\0225\n\013time_series\030\002 \003(\0132 .google.moni" +
      "toring.v3.TimeSeries\"r\n\025CreateTimeSeries" +
      "Error\0225\n\013time_series\030\001 \001(\0132 .google.moni" +
      "toring.v3.TimeSeries\022\"\n\006status\030\002 \001(\0132\022.g" +
      "oogle.rpc.Status2\365\n\n\rMetricService\022\335\001\n L" +
      "istMonitoredResourceDescriptors\022=.google" +
      ".monitoring.v3.ListMonitoredResourceDesc" +
      "riptorsRequest\032>.google.monitoring.v3.Li" +
      "stMonitoredResourceDescriptorsResponse\":" +
      "\202\323\344\223\0024\0222/v3/{name=projects/*}/monitoredR" +
      "esourceDescriptors\022\304\001\n\036GetMonitoredResou" +
      "rceDescriptor\022;.google.monitoring.v3.Get" +
      "MonitoredResourceDescriptorRequest\032\'.goo" +
      "gle.api.MonitoredResourceDescriptor\"<\202\323\344" +
      "\223\0026\0224/v3/{name=projects/*/monitoredResou" +
      "rceDescriptors/*}\022\261\001\n\025ListMetricDescript" +
      "ors\0222.google.monitoring.v3.ListMetricDes" +
      "criptorsRequest\0323.google.monitoring.v3.L" +
      "istMetricDescriptorsResponse\"/\202\323\344\223\002)\022\'/v" +
      "3/{name=projects/*}/metricDescriptors\022\231\001" +
      "\n\023GetMetricDescriptor\0220.google.monitorin" +
      "g.v3.GetMetricDescriptorRequest\032\034.google" +
      ".api.MetricDescriptor\"2\202\323\344\223\002,\022*/v3/{name" +
      "=projects/*/metricDescriptors/**}\022\257\001\n\026Cr" +
      "eateMetricDescriptor\0223.google.monitoring" +
      ".v3.CreateMetricDescriptorRequest\032\034.goog" +
      "le.api.MetricDescriptor\"B\202\323\344\223\002<\"\'/v3/{na" +
      "me=projects/*}/metricDescriptors:\021metric" +
      "_descriptor\022\231\001\n\026DeleteMetricDescriptor\0223" +
      ".google.monitoring.v3.DeleteMetricDescri" +
      "ptorRequest\032\026.google.protobuf.Empty\"2\202\323\344" +
      "\223\002,**/v3/{name=projects/*/metricDescript" +
      "ors/**}\022\225\001\n\016ListTimeSeries\022+.google.moni" +
      "toring.v3.ListTimeSeriesRequest\032,.google" +
      ".monitoring.v3.ListTimeSeriesResponse\"(\202" +
      "\323\344\223\002\"\022 /v3/{name=projects/*}/timeSeries\022" +
      "\206\001\n\020CreateTimeSeries\022-.google.monitoring" +
      ".v3.CreateTimeSeriesRequest\032\026.google.pro" +
      "tobuf.Empty\"+\202\323\344\223\002%\" /v3/{name=projects/" +
      "*}/timeSeries:\001*B\252\001\n\030com.google.monitori" +
      "ng.v3B\022MetricServiceProtoP\001Z>google.gola" +
      "ng.org/genproto/googleapis/monitoring/v3" +
      ";monitoring\252\002\032Google.Cloud.Monitoring.V3" +
      "\312\002\032Google\\Cloud\\Monitoring\\V3b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.MetricProto.getDescriptor(),
          com.google.api.MonitoredResourceProto.getDescriptor(),
          com.google.monitoring.v3.CommonProto.getDescriptor(),
          com.google.monitoring.v3.MetricProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor,
        new java.lang.String[] { "Name", "Filter", "PageSize", "PageToken", });
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor,
        new java.lang.String[] { "ResourceDescriptors", "NextPageToken", });
    internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor,
        new java.lang.String[] { "Name", "Filter", "PageSize", "PageToken", });
    internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor,
        new java.lang.String[] { "MetricDescriptors", "NextPageToken", });
    internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_GetMetricDescriptorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor,
        new java.lang.String[] { "Name", "MetricDescriptor", });
    internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_ListTimeSeriesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor,
        new java.lang.String[] { "Name", "Filter", "Interval", "Aggregation", "OrderBy", "View", "PageSize", "PageToken", });
    internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_monitoring_v3_ListTimeSeriesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor,
        new java.lang.String[] { "TimeSeries", "NextPageToken", "ExecutionErrors", });
    internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_monitoring_v3_CreateTimeSeriesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor,
        new java.lang.String[] { "Name", "TimeSeries", });
    internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor,
        new java.lang.String[] { "TimeSeries", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.monitoring.v3.MetricProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
