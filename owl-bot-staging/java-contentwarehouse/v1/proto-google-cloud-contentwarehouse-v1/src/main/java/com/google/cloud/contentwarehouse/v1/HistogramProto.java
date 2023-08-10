// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/histogram.proto

package com.google.cloud.contentwarehouse.v1;

public final class HistogramProto {
  private HistogramProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_HistogramQuery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_HistogramQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_HistogramQueryPropertyNameFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_HistogramQueryPropertyNameFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_HistogramEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_HistogramEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/contentwarehouse/v1/histo" +
      "gram.proto\022 google.cloud.contentwarehous" +
      "e.v1\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\"\251\001\n\016HistogramQu" +
      "ery\022\027\n\017histogram_query\030\001 \001(\t\022#\n\033require_" +
      "precise_result_size\030\002 \001(\010\022Y\n\007filters\030\003 \001" +
      "(\0132B.google.cloud.contentwarehouse.v1.Hi" +
      "stogramQueryPropertyNameFilterB\004\342A\001\001\"\272\002\n" +
      " HistogramQueryPropertyNameFilter\022M\n\020doc" +
      "ument_schemas\030\001 \003(\tB3\372A0\n.contentwarehou" +
      "se.googleapis.com/DocumentSchema\022\026\n\016prop" +
      "erty_names\030\002 \003(\t\022a\n\006y_axis\030\003 \001(\0162Q.googl" +
      "e.cloud.contentwarehouse.v1.HistogramQue" +
      "ryPropertyNameFilter.HistogramYAxis\"L\n\016H" +
      "istogramYAxis\022\034\n\030HISTOGRAM_YAXIS_DOCUMEN" +
      "T\020\000\022\034\n\030HISTOGRAM_YAXIS_PROPERTY\020\001\"\273\001\n\024Hi" +
      "stogramQueryResult\022\027\n\017histogram_query\030\001 " +
      "\001(\t\022X\n\thistogram\030\002 \003(\0132E.google.cloud.co" +
      "ntentwarehouse.v1.HistogramQueryResult.H" +
      "istogramEntry\0320\n\016HistogramEntry\022\013\n\003key\030\001" +
      " \001(\t\022\r\n\005value\030\002 \001(\003:\0028\001B\366\001\n$com.google.c" +
      "loud.contentwarehouse.v1B\016HistogramProto" +
      "P\001ZPcloud.google.com/go/contentwarehouse" +
      "/apiv1/contentwarehousepb;contentwarehou" +
      "sepb\252\002 Google.Cloud.ContentWarehouse.V1\312" +
      "\002 Google\\Cloud\\ContentWarehouse\\V1\352\002#Goo" +
      "gle::Cloud::ContentWarehouse::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_contentwarehouse_v1_HistogramQuery_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_HistogramQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_HistogramQuery_descriptor,
        new java.lang.String[] { "HistogramQuery", "RequirePreciseResultSize", "Filters", });
    internal_static_google_cloud_contentwarehouse_v1_HistogramQueryPropertyNameFilter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_contentwarehouse_v1_HistogramQueryPropertyNameFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_HistogramQueryPropertyNameFilter_descriptor,
        new java.lang.String[] { "DocumentSchemas", "PropertyNames", "YAxis", });
    internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_descriptor,
        new java.lang.String[] { "HistogramQuery", "Histogram", });
    internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_HistogramEntry_descriptor =
      internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_HistogramEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_HistogramQueryResult_HistogramEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
