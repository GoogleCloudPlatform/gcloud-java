// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification.proto

package com.google.monitoring.v3;

public final class NotificationProto {
  private NotificationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannelDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_NotificationChannel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'google/monitoring/v3/notification.prot" +
      "o\022\024google.monitoring.v3\032\034google/api/anno" +
      "tations.proto\032\026google/api/label.proto\032!g" +
      "oogle/monitoring/v3/common.proto\032\036google" +
      "/protobuf/wrappers.proto\"\323\001\n\035Notificatio" +
      "nChannelDescriptor\022\014\n\004name\030\006 \001(\t\022\014\n\004type" +
      "\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013descript" +
      "ion\030\003 \001(\t\022+\n\006labels\030\004 \003(\0132\033.google.api.L" +
      "abelDescriptor\022>\n\017supported_tiers\030\005 \003(\0162" +
      "!.google.monitoring.v3.ServiceTierB\002\030\001\"\266",
      "\004\n\023NotificationChannel\022\014\n\004type\030\001 \001(\t\022\014\n\004" +
      "name\030\006 \001(\t\022\024\n\014display_name\030\003 \001(\t\022\023\n\013desc" +
      "ription\030\004 \001(\t\022E\n\006labels\030\005 \003(\01325.google.m" +
      "onitoring.v3.NotificationChannel.LabelsE" +
      "ntry\022N\n\013user_labels\030\010 \003(\01329.google.monit" +
      "oring.v3.NotificationChannel.UserLabelsE" +
      "ntry\022Y\n\023verification_status\030\t \001(\0162<.goog" +
      "le.monitoring.v3.NotificationChannel.Ver" +
      "ificationStatus\022+\n\007enabled\030\013 \001(\0132\032.googl" +
      "e.protobuf.BoolValue\032-\n\013LabelsEntry\022\013\n\003k",
      "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0321\n\017UserLabel" +
      "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"W" +
      "\n\022VerificationStatus\022#\n\037VERIFICATION_STA" +
      "TUS_UNSPECIFIED\020\000\022\016\n\nUNVERIFIED\020\001\022\014\n\010VER" +
      "IFIED\020\002B\251\001\n\030com.google.monitoring.v3B\021No" +
      "tificationProtoP\001Z>google.golang.org/gen" +
      "proto/googleapis/monitoring/v3;monitorin" +
      "g\252\002\032Google.Cloud.Monitoring.V3\312\002\032Google\\" +
      "Cloud\\Monitoring\\V3b\006proto3"
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
          com.google.api.LabelProto.getDescriptor(),
          com.google.monitoring.v3.CommonProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_NotificationChannelDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor,
        new java.lang.String[] { "Name", "Type", "DisplayName", "Description", "Labels", "SupportedTiers", });
    internal_static_google_monitoring_v3_NotificationChannel_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_NotificationChannel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_NotificationChannel_descriptor,
        new java.lang.String[] { "Type", "Name", "DisplayName", "Description", "Labels", "UserLabels", "VerificationStatus", "Enabled", });
    internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor =
      internal_static_google_monitoring_v3_NotificationChannel_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor =
      internal_static_google_monitoring_v3_NotificationChannel_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.LabelProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
