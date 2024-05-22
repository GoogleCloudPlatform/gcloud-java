/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/backup_plan.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkebackup.v1;

public final class BackupPlanProto {
  private BackupPlanProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_BackupPlan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_BackupPlan_Schedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_BackupPlan_Schedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_BackupPlan_BackupConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_BackupPlan_BackupConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_BackupPlan_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_BackupPlan_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_RpoConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_RpoConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_ExclusionWindow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_ExclusionWindow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_ExclusionWindow_DayOfWeekList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_ExclusionWindow_DayOfWeekList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/gkebackup/v1/backup_plan."
          + "proto\022\031google.cloud.gkebackup.v1\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\032&google/cloud/gkebackup/v1/"
          + "common.proto\032\036google/protobuf/duration.p"
          + "roto\032\037google/protobuf/timestamp.proto\032\026g"
          + "oogle/type/date.proto\032\033google/type/dayof"
          + "week.proto\032\033google/type/timeofday.proto\""
          + "\324\r\n\nBackupPlan\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\020\n\003uid"
          + "\030\002 \001(\tB\003\340A\003\0224\n\013create_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\0224\n\013update_time"
          + "\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022"
          + "\030\n\013description\030\005 \001(\tB\003\340A\001\022<\n\007cluster\030\006 \001"
          + "(\tB+\340A\005\340A\002\372A\"\n container.googleapis.com/"
          + "Cluster\022T\n\020retention_policy\030\007 \001(\01325.goog"
          + "le.cloud.gkebackup.v1.BackupPlan.Retenti"
          + "onPolicyB\003\340A\001\022F\n\006labels\030\010 \003(\01321.google.c"
          + "loud.gkebackup.v1.BackupPlan.LabelsEntry"
          + "B\003\340A\001\022L\n\017backup_schedule\030\t \001(\0132..google."
          + "cloud.gkebackup.v1.BackupPlan.ScheduleB\003"
          + "\340A\001\022\021\n\004etag\030\n \001(\tB\003\340A\003\022\030\n\013deactivated\030\013 "
          + "\001(\010B\003\340A\001\022N\n\rbackup_config\030\014 \001(\01322.google"
          + ".cloud.gkebackup.v1.BackupPlan.BackupCon"
          + "figB\003\340A\001\022 \n\023protected_pod_count\030\r \001(\005B\003\340"
          + "A\003\022?\n\005state\030\016 \001(\0162+.google.cloud.gkeback"
          + "up.v1.BackupPlan.StateB\003\340A\003\022\031\n\014state_rea"
          + "son\030\017 \001(\tB\003\340A\003\022\033\n\016rpo_risk_level\030\020 \001(\005B\003"
          + "\340A\003\022\034\n\017rpo_risk_reason\030\021 \001(\tB\003\340A\003\032m\n\017Ret"
          + "entionPolicy\022$\n\027backup_delete_lock_days\030"
          + "\001 \001(\005B\003\340A\001\022\037\n\022backup_retain_days\030\002 \001(\005B\003"
          + "\340A\001\022\023\n\006locked\030\003 \001(\010B\003\340A\001\032\277\001\n\010Schedule\022\032\n"
          + "\rcron_schedule\030\001 \001(\tB\003\340A\001\022\023\n\006paused\030\002 \001("
          + "\010B\003\340A\001\022=\n\nrpo_config\030\003 \001(\0132$.google.clou"
          + "d.gkebackup.v1.RpoConfigB\003\340A\001\022C\n\032next_sc"
          + "heduled_backup_time\030\004 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\032\360\002\n\014BackupConfig\022\030\n\016a"
          + "ll_namespaces\030\001 \001(\010H\000\022D\n\023selected_namesp"
          + "aces\030\002 \001(\0132%.google.cloud.gkebackup.v1.N"
          + "amespacesH\000\022K\n\025selected_applications\030\003 \001"
          + "(\0132*.google.cloud.gkebackup.v1.Namespace"
          + "dNamesH\000\022 \n\023include_volume_data\030\004 \001(\010B\003\340"
          + "A\001\022\034\n\017include_secrets\030\005 \001(\010B\003\340A\001\022E\n\016encr"
          + "yption_key\030\006 \001(\0132(.google.cloud.gkebacku"
          + "p.v1.EncryptionKeyB\003\340A\001\022\034\n\017permissive_mo"
          + "de\030\007 \001(\010B\003\340A\001B\016\n\014backup_scope\032-\n\013LabelsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"{\n\005"
          + "State\022\025\n\021STATE_UNSPECIFIED\020\000\022\023\n\017CLUSTER_"
          + "PENDING\020\001\022\020\n\014PROVISIONING\020\002\022\t\n\005READY\020\003\022\n"
          + "\n\006FAILED\020\004\022\017\n\013DEACTIVATED\020\005\022\014\n\010DELETING\020"
          + "\006:k\352Ah\n#gkebackup.googleapis.com/BackupP"
          + "lan\022Aprojects/{project}/locations/{locat"
          + "ion}/backupPlans/{backup_plan}\"x\n\tRpoCon"
          + "fig\022\037\n\022target_rpo_minutes\030\001 \001(\005B\003\340A\002\022J\n\021"
          + "exclusion_windows\030\002 \003(\0132*.google.cloud.g"
          + "kebackup.v1.ExclusionWindowB\003\340A\001\"\336\002\n\017Exc"
          + "lusionWindow\022/\n\nstart_time\030\001 \001(\0132\026.googl"
          + "e.type.TimeOfDayB\003\340A\002\0220\n\010duration\030\002 \001(\0132"
          + "\031.google.protobuf.DurationB\003\340A\002\0223\n\026singl"
          + "e_occurrence_date\030\003 \001(\0132\021.google.type.Da"
          + "teH\000\022\017\n\005daily\030\004 \001(\010H\000\022P\n\014days_of_week\030\005 "
          + "\001(\01328.google.cloud.gkebackup.v1.Exclusio"
          + "nWindow.DayOfWeekListH\000\032B\n\rDayOfWeekList"
          + "\0221\n\014days_of_week\030\001 \003(\0162\026.google.type.Day"
          + "OfWeekB\003\340A\001B\014\n\nrecurrenceB\306\001\n\035com.google"
          + ".cloud.gkebackup.v1B\017BackupPlanProtoP\001Z;"
          + "cloud.google.com/go/gkebackup/apiv1/gkeb"
          + "ackuppb;gkebackuppb\252\002\031Google.Cloud.GkeBa"
          + "ckup.V1\312\002\031Google\\Cloud\\GkeBackup\\V1\352\002\034Go"
          + "ogle::Cloud::GkeBackup::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkebackup.v1.CommonProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
              com.google.type.DayOfWeekProto.getDescriptor(),
              com.google.type.TimeOfDayProto.getDescriptor(),
            });
    internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_BackupPlan_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Description",
              "Cluster",
              "RetentionPolicy",
              "Labels",
              "BackupSchedule",
              "Etag",
              "Deactivated",
              "BackupConfig",
              "ProtectedPodCount",
              "State",
              "StateReason",
              "RpoRiskLevel",
              "RpoRiskReason",
            });
    internal_static_google_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_descriptor =
        internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_descriptor,
            new java.lang.String[] {
              "BackupDeleteLockDays", "BackupRetainDays", "Locked",
            });
    internal_static_google_cloud_gkebackup_v1_BackupPlan_Schedule_descriptor =
        internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_BackupPlan_Schedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_BackupPlan_Schedule_descriptor,
            new java.lang.String[] {
              "CronSchedule", "Paused", "RpoConfig", "NextScheduledBackupTime",
            });
    internal_static_google_cloud_gkebackup_v1_BackupPlan_BackupConfig_descriptor =
        internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_gkebackup_v1_BackupPlan_BackupConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_BackupPlan_BackupConfig_descriptor,
            new java.lang.String[] {
              "AllNamespaces",
              "SelectedNamespaces",
              "SelectedApplications",
              "IncludeVolumeData",
              "IncludeSecrets",
              "EncryptionKey",
              "PermissiveMode",
              "BackupScope",
            });
    internal_static_google_cloud_gkebackup_v1_BackupPlan_LabelsEntry_descriptor =
        internal_static_google_cloud_gkebackup_v1_BackupPlan_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_gkebackup_v1_BackupPlan_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_BackupPlan_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkebackup_v1_RpoConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_RpoConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_RpoConfig_descriptor,
            new java.lang.String[] {
              "TargetRpoMinutes", "ExclusionWindows",
            });
    internal_static_google_cloud_gkebackup_v1_ExclusionWindow_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkebackup_v1_ExclusionWindow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_ExclusionWindow_descriptor,
            new java.lang.String[] {
              "StartTime", "Duration", "SingleOccurrenceDate", "Daily", "DaysOfWeek", "Recurrence",
            });
    internal_static_google_cloud_gkebackup_v1_ExclusionWindow_DayOfWeekList_descriptor =
        internal_static_google_cloud_gkebackup_v1_ExclusionWindow_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gkebackup_v1_ExclusionWindow_DayOfWeekList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_ExclusionWindow_DayOfWeekList_descriptor,
            new java.lang.String[] {
              "DaysOfWeek",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkebackup.v1.CommonProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.type.DayOfWeekProto.getDescriptor();
    com.google.type.TimeOfDayProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
