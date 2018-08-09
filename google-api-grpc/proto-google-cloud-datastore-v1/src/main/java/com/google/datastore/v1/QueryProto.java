// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/query.proto

package com.google.datastore.v1;

public final class QueryProto {
  private QueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_EntityResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_EntityResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_Query_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_Query_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_KindExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_KindExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_PropertyReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_PropertyReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_Projection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_Projection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_PropertyOrder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_PropertyOrder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_Filter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_Filter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_CompositeFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_CompositeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_PropertyFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_PropertyFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_GqlQuery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_GqlQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_GqlQuery_NamedBindingsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_GqlQuery_NamedBindingsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_GqlQueryParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_GqlQueryParameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_QueryResultBatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_QueryResultBatch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037google/datastore/v1/query.proto\022\023googl" +
      "e.datastore.v1\032\034google/api/annotations.p" +
      "roto\032 google/datastore/v1/entity.proto\032\036" +
      "google/protobuf/wrappers.proto\032\030google/t" +
      "ype/latlng.proto\"\257\001\n\014EntityResult\022+\n\006ent" +
      "ity\030\001 \001(\0132\033.google.datastore.v1.Entity\022\017" +
      "\n\007version\030\004 \001(\003\022\016\n\006cursor\030\003 \001(\014\"Q\n\nResul" +
      "tType\022\033\n\027RESULT_TYPE_UNSPECIFIED\020\000\022\010\n\004FU" +
      "LL\020\001\022\016\n\nPROJECTION\020\002\022\014\n\010KEY_ONLY\020\003\"\362\002\n\005Q" +
      "uery\0223\n\nprojection\030\002 \003(\0132\037.google.datast" +
      "ore.v1.Projection\0221\n\004kind\030\003 \003(\0132#.google" +
      ".datastore.v1.KindExpression\022+\n\006filter\030\004" +
      " \001(\0132\033.google.datastore.v1.Filter\0221\n\005ord" +
      "er\030\005 \003(\0132\".google.datastore.v1.PropertyO" +
      "rder\022;\n\013distinct_on\030\006 \003(\0132&.google.datas" +
      "tore.v1.PropertyReference\022\024\n\014start_curso" +
      "r\030\007 \001(\014\022\022\n\nend_cursor\030\010 \001(\014\022\016\n\006offset\030\n " +
      "\001(\005\022*\n\005limit\030\014 \001(\0132\033.google.protobuf.Int" +
      "32Value\"\036\n\016KindExpression\022\014\n\004name\030\001 \001(\t\"" +
      "!\n\021PropertyReference\022\014\n\004name\030\002 \001(\t\"F\n\nPr" +
      "ojection\0228\n\010property\030\001 \001(\0132&.google.data" +
      "store.v1.PropertyReference\"\321\001\n\rPropertyO" +
      "rder\0228\n\010property\030\001 \001(\0132&.google.datastor" +
      "e.v1.PropertyReference\022?\n\tdirection\030\002 \001(" +
      "\0162,.google.datastore.v1.PropertyOrder.Di" +
      "rection\"E\n\tDirection\022\031\n\025DIRECTION_UNSPEC" +
      "IFIED\020\000\022\r\n\tASCENDING\020\001\022\016\n\nDESCENDING\020\002\"\231" +
      "\001\n\006Filter\022@\n\020composite_filter\030\001 \001(\0132$.go" +
      "ogle.datastore.v1.CompositeFilterH\000\022>\n\017p" +
      "roperty_filter\030\002 \001(\0132#.google.datastore." +
      "v1.PropertyFilterH\000B\r\n\013filter_type\"\251\001\n\017C" +
      "ompositeFilter\0229\n\002op\030\001 \001(\0162-.google.data" +
      "store.v1.CompositeFilter.Operator\022,\n\007fil" +
      "ters\030\002 \003(\0132\033.google.datastore.v1.Filter\"" +
      "-\n\010Operator\022\030\n\024OPERATOR_UNSPECIFIED\020\000\022\007\n" +
      "\003AND\020\001\"\307\002\n\016PropertyFilter\0228\n\010property\030\001 " +
      "\001(\0132&.google.datastore.v1.PropertyRefere" +
      "nce\0228\n\002op\030\002 \001(\0162,.google.datastore.v1.Pr" +
      "opertyFilter.Operator\022)\n\005value\030\003 \001(\0132\032.g" +
      "oogle.datastore.v1.Value\"\225\001\n\010Operator\022\030\n" +
      "\024OPERATOR_UNSPECIFIED\020\000\022\r\n\tLESS_THAN\020\001\022\026" +
      "\n\022LESS_THAN_OR_EQUAL\020\002\022\020\n\014GREATER_THAN\020\003" +
      "\022\031\n\025GREATER_THAN_OR_EQUAL\020\004\022\t\n\005EQUAL\020\005\022\020" +
      "\n\014HAS_ANCESTOR\020\013\"\245\002\n\010GqlQuery\022\024\n\014query_s" +
      "tring\030\001 \001(\t\022\026\n\016allow_literals\030\002 \001(\010\022H\n\016n" +
      "amed_bindings\030\005 \003(\01320.google.datastore.v" +
      "1.GqlQuery.NamedBindingsEntry\022C\n\023positio" +
      "nal_bindings\030\004 \003(\0132&.google.datastore.v1" +
      ".GqlQueryParameter\032\\\n\022NamedBindingsEntry" +
      "\022\013\n\003key\030\001 \001(\t\0225\n\005value\030\002 \001(\0132&.google.da" +
      "tastore.v1.GqlQueryParameter:\0028\001\"d\n\021GqlQ" +
      "ueryParameter\022+\n\005value\030\002 \001(\0132\032.google.da" +
      "tastore.v1.ValueH\000\022\020\n\006cursor\030\003 \001(\014H\000B\020\n\016" +
      "parameter_type\"\336\003\n\020QueryResultBatch\022\027\n\017s" +
      "kipped_results\030\006 \001(\005\022\026\n\016skipped_cursor\030\003" +
      " \001(\014\022H\n\022entity_result_type\030\001 \001(\0162,.googl" +
      "e.datastore.v1.EntityResult.ResultType\0229" +
      "\n\016entity_results\030\002 \003(\0132!.google.datastor" +
      "e.v1.EntityResult\022\022\n\nend_cursor\030\004 \001(\014\022K\n" +
      "\014more_results\030\005 \001(\01625.google.datastore.v" +
      "1.QueryResultBatch.MoreResultsType\022\030\n\020sn" +
      "apshot_version\030\007 \001(\003\"\230\001\n\017MoreResultsType" +
      "\022!\n\035MORE_RESULTS_TYPE_UNSPECIFIED\020\000\022\020\n\014N" +
      "OT_FINISHED\020\001\022\034\n\030MORE_RESULTS_AFTER_LIMI" +
      "T\020\002\022\035\n\031MORE_RESULTS_AFTER_CURSOR\020\004\022\023\n\017NO" +
      "_MORE_RESULTS\020\003B\235\001\n\027com.google.datastore" +
      ".v1B\nQueryProtoP\001Z<google.golang.org/gen" +
      "proto/googleapis/datastore/v1;datastore\252" +
      "\002\031Google.Cloud.Datastore.V1\312\002\031Google\\Clo" +
      "ud\\Datastore\\V1b\006proto3"
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
          com.google.datastore.v1.EntityProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
        }, assigner);
    internal_static_google_datastore_v1_EntityResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_datastore_v1_EntityResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_EntityResult_descriptor,
        new java.lang.String[] { "Entity", "Version", "Cursor", });
    internal_static_google_datastore_v1_Query_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_datastore_v1_Query_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_Query_descriptor,
        new java.lang.String[] { "Projection", "Kind", "Filter", "Order", "DistinctOn", "StartCursor", "EndCursor", "Offset", "Limit", });
    internal_static_google_datastore_v1_KindExpression_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_datastore_v1_KindExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_KindExpression_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_datastore_v1_PropertyReference_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_datastore_v1_PropertyReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_PropertyReference_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_datastore_v1_Projection_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_datastore_v1_Projection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_Projection_descriptor,
        new java.lang.String[] { "Property", });
    internal_static_google_datastore_v1_PropertyOrder_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_datastore_v1_PropertyOrder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_PropertyOrder_descriptor,
        new java.lang.String[] { "Property", "Direction", });
    internal_static_google_datastore_v1_Filter_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_datastore_v1_Filter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_Filter_descriptor,
        new java.lang.String[] { "CompositeFilter", "PropertyFilter", "FilterType", });
    internal_static_google_datastore_v1_CompositeFilter_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_datastore_v1_CompositeFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_CompositeFilter_descriptor,
        new java.lang.String[] { "Op", "Filters", });
    internal_static_google_datastore_v1_PropertyFilter_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_datastore_v1_PropertyFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_PropertyFilter_descriptor,
        new java.lang.String[] { "Property", "Op", "Value", });
    internal_static_google_datastore_v1_GqlQuery_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_datastore_v1_GqlQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_GqlQuery_descriptor,
        new java.lang.String[] { "QueryString", "AllowLiterals", "NamedBindings", "PositionalBindings", });
    internal_static_google_datastore_v1_GqlQuery_NamedBindingsEntry_descriptor =
      internal_static_google_datastore_v1_GqlQuery_descriptor.getNestedTypes().get(0);
    internal_static_google_datastore_v1_GqlQuery_NamedBindingsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_GqlQuery_NamedBindingsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_datastore_v1_GqlQueryParameter_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_datastore_v1_GqlQueryParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_GqlQueryParameter_descriptor,
        new java.lang.String[] { "Value", "Cursor", "ParameterType", });
    internal_static_google_datastore_v1_QueryResultBatch_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_datastore_v1_QueryResultBatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_QueryResultBatch_descriptor,
        new java.lang.String[] { "SkippedResults", "SkippedCursor", "EntityResultType", "EntityResults", "EndCursor", "MoreResults", "SnapshotVersion", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.datastore.v1.EntityProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
