// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/backup_plan.proto

package com.google.cloud.gkebackup.v1;

public final class BackupPlanProto {
  private BackupPlanProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_BackupPlan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_BackupPlan_Schedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_BackupPlan_Schedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_BackupPlan_BackupConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_BackupPlan_BackupConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_BackupPlan_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_BackupPlan_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/gkebackup/v1/backup_plan." +
      "proto\022\031google.cloud.gkebackup.v1\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\032&google/cloud/gkebackup/v1/" +
      "common.proto\032\037google/protobuf/timestamp." +
      "proto\"\267\013\n\nBackupPlan\022\022\n\004name\030\001 \001(\tB\004\342A\001\003" +
      "\022\021\n\003uid\030\002 \001(\tB\004\342A\001\003\0225\n\013create_time\030\003 \001(\013" +
      "2\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013up" +
      "date_time\030\004 \001(\0132\032.google.protobuf.Timest" +
      "ampB\004\342A\001\003\022\023\n\013description\030\005 \001(\t\022;\n\007cluste" +
      "r\030\006 \001(\tB*\342A\002\005\002\372A\"\n container.googleapis." +
      "com/Cluster\022O\n\020retention_policy\030\007 \001(\01325." +
      "google.cloud.gkebackup.v1.BackupPlan.Ret" +
      "entionPolicy\022A\n\006labels\030\010 \003(\01321.google.cl" +
      "oud.gkebackup.v1.BackupPlan.LabelsEntry\022" +
      "G\n\017backup_schedule\030\t \001(\0132..google.cloud." +
      "gkebackup.v1.BackupPlan.Schedule\022\022\n\004etag" +
      "\030\n \001(\tB\004\342A\001\003\022\023\n\013deactivated\030\013 \001(\010\022I\n\rbac" +
      "kup_config\030\014 \001(\01322.google.cloud.gkebacku" +
      "p.v1.BackupPlan.BackupConfig\022!\n\023protecte" +
      "d_pod_count\030\r \001(\005B\004\342A\001\003\022@\n\005state\030\016 \001(\0162+" +
      ".google.cloud.gkebackup.v1.BackupPlan.St" +
      "ateB\004\342A\001\003\022\032\n\014state_reason\030\017 \001(\tB\004\342A\001\003\032^\n" +
      "\017RetentionPolicy\022\037\n\027backup_delete_lock_d" +
      "ays\030\001 \001(\005\022\032\n\022backup_retain_days\030\002 \001(\005\022\016\n" +
      "\006locked\030\003 \001(\010\0321\n\010Schedule\022\025\n\rcron_schedu" +
      "le\030\001 \001(\t\022\016\n\006paused\030\002 \001(\010\032\303\002\n\014BackupConfi" +
      "g\022\030\n\016all_namespaces\030\001 \001(\010H\000\022D\n\023selected_" +
      "namespaces\030\002 \001(\0132%.google.cloud.gkebacku" +
      "p.v1.NamespacesH\000\022K\n\025selected_applicatio" +
      "ns\030\003 \001(\0132*.google.cloud.gkebackup.v1.Nam" +
      "espacedNamesH\000\022\033\n\023include_volume_data\030\004 " +
      "\001(\010\022\027\n\017include_secrets\030\005 \001(\010\022@\n\016encrypti" +
      "on_key\030\006 \001(\0132(.google.cloud.gkebackup.v1" +
      ".EncryptionKeyB\016\n\014backup_scope\032-\n\013Labels" +
      "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"{\n" +
      "\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\023\n\017CLUSTER" +
      "_PENDING\020\001\022\020\n\014PROVISIONING\020\002\022\t\n\005READY\020\003\022" +
      "\n\n\006FAILED\020\004\022\017\n\013DEACTIVATED\020\005\022\014\n\010DELETING" +
      "\020\006:k\352Ah\n#gkebackup.googleapis.com/Backup" +
      "Plan\022Aprojects/{project}/locations/{loca" +
      "tion}/backupPlans/{backup_plan}B\306\001\n\035com." +
      "google.cloud.gkebackup.v1B\017BackupPlanPro" +
      "toP\001Z;cloud.google.com/go/gkebackup/apiv" +
      "1/gkebackuppb;gkebackuppb\252\002\031Google.Cloud" +
      ".GkeBackup.V1\312\002\031Google\\Cloud\\GkeBackup\\V" +
      "1\352\002\034Google::Cloud::GkeBackup::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.gkebackup.v1.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_BackupPlan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor,
        new java.lang.String[] { "Name", "Uid", "CreateTime", "UpdateTime", "Description", "Cluster", "RetentionPolicy", "Labels", "BackupSchedule", "Etag", "Deactivated", "BackupConfig", "ProtectedPodCount", "State", "StateReason", });
    internal_static_google_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_descriptor =
      internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_descriptor,
        new java.lang.String[] { "BackupDeleteLockDays", "BackupRetainDays", "Locked", });
    internal_static_google_cloud_gkebackup_v1_BackupPlan_Schedule_descriptor =
      internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_BackupPlan_Schedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_BackupPlan_Schedule_descriptor,
        new java.lang.String[] { "CronSchedule", "Paused", });
    internal_static_google_cloud_gkebackup_v1_BackupPlan_BackupConfig_descriptor =
      internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_gkebackup_v1_BackupPlan_BackupConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_BackupPlan_BackupConfig_descriptor,
        new java.lang.String[] { "AllNamespaces", "SelectedNamespaces", "SelectedApplications", "IncludeVolumeData", "IncludeSecrets", "EncryptionKey", "BackupScope", });
    internal_static_google_cloud_gkebackup_v1_BackupPlan_LabelsEntry_descriptor =
      internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_gkebackup_v1_BackupPlan_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_BackupPlan_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkebackup.v1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
