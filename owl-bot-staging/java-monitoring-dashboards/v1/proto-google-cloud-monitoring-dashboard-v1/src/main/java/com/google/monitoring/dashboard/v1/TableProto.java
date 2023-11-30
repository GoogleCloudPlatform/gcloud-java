// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/table.proto

package com.google.monitoring.dashboard.v1;

public final class TableProto {
  private TableProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_TableDataSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_TableDataSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_ColumnSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_ColumnSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/monitoring/dashboard/v1/table.p" +
      "roto\022\036google.monitoring.dashboard.v1\032\037go" +
      "ogle/api/field_behavior.proto\032,google/mo" +
      "nitoring/dashboard/v1/metrics.proto\032:goo" +
      "gle/monitoring/dashboard/v1/table_displa" +
      "y_options.proto\032\036google/protobuf/duratio" +
      "n.proto\"\333\005\n\017TimeSeriesTable\022U\n\tdata_sets" +
      "\030\001 \003(\0132<.google.monitoring.dashboard.v1." +
      "TimeSeriesTable.TableDataSetB\004\342A\001\002\022g\n\024me" +
      "tric_visualization\030\002 \001(\0162C.google.monito" +
      "ring.dashboard.v1.TimeSeriesTable.Metric" +
      "VisualizationB\004\342A\001\001\022]\n\017column_settings\030\004" +
      " \003(\0132>.google.monitoring.dashboard.v1.Ti" +
      "meSeriesTable.ColumnSettingsB\004\342A\001\001\032\227\002\n\014T" +
      "ableDataSet\022P\n\021time_series_query\030\001 \001(\0132/" +
      ".google.monitoring.dashboard.v1.TimeSeri" +
      "esQueryB\004\342A\001\002\022\034\n\016table_template\030\002 \001(\tB\004\342" +
      "A\001\001\022=\n\024min_alignment_period\030\003 \001(\0132\031.goog" +
      "le.protobuf.DurationB\004\342A\001\001\022X\n\025table_disp" +
      "lay_options\030\004 \001(\01323.google.monitoring.da" +
      "shboard.v1.TableDisplayOptionsB\004\342A\001\001\032=\n\016" +
      "ColumnSettings\022\024\n\006column\030\001 \001(\tB\004\342A\001\002\022\025\n\007" +
      "visible\030\002 \001(\010B\004\342A\001\002\"P\n\023MetricVisualizati" +
      "on\022$\n METRIC_VISUALIZATION_UNSPECIFIED\020\000" +
      "\022\n\n\006NUMBER\020\001\022\007\n\003BAR\020\002B\363\001\n\"com.google.mon" +
      "itoring.dashboard.v1B\nTableProtoP\001ZFclou" +
      "d.google.com/go/monitoring/dashboard/api" +
      "v1/dashboardpb;dashboardpb\252\002$Google.Clou" +
      "d.Monitoring.Dashboard.V1\312\002$Google\\Cloud" +
      "\\Monitoring\\Dashboard\\V1\352\002(Google::Cloud" +
      "::Monitoring::Dashboard::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.monitoring.dashboard.v1.MetricsProto.getDescriptor(),
          com.google.monitoring.dashboard.v1.TableDisplayOptionsProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_descriptor,
        new java.lang.String[] { "DataSets", "MetricVisualization", "ColumnSettings", });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_TableDataSet_descriptor =
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_TableDataSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_TableDataSet_descriptor,
        new java.lang.String[] { "TimeSeriesQuery", "TableTemplate", "MinAlignmentPeriod", "TableDisplayOptions", });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_ColumnSettings_descriptor =
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_ColumnSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_ColumnSettings_descriptor,
        new java.lang.String[] { "Column", "Visible", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.monitoring.dashboard.v1.MetricsProto.getDescriptor();
    com.google.monitoring.dashboard.v1.TableDisplayOptionsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
