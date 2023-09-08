// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/backup.proto

package com.google.cloud.gkebackup.v1;

public final class BackupProto {
  private BackupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_Backup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/gkebackup/v1/backup.proto" +
      "\022\031google.cloud.gkebackup.v1\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032&google/cloud/gkebackup/v1/commo" +
      "n.proto\032\037google/protobuf/timestamp.proto" +
      "\"\322\r\n\006Backup\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\021\n\003uid\030\002" +
      " \001(\tB\004\342A\001\003\0225\n\013create_time\030\003 \001(\0132\032.google" +
      ".protobuf.TimestampB\004\342A\001\003\0225\n\013update_time" +
      "\030\004 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003" +
      "\022\024\n\006manual\030\005 \001(\010B\004\342A\001\003\022=\n\006labels\030\006 \003(\0132-" +
      ".google.cloud.gkebackup.v1.Backup.Labels" +
      "Entry\022\030\n\020delete_lock_days\030\007 \001(\005\022A\n\027delet" +
      "e_lock_expire_time\030\010 \001(\0132\032.google.protob" +
      "uf.TimestampB\004\342A\001\003\022\023\n\013retain_days\030\t \001(\005\022" +
      "<\n\022retain_expire_time\030\n \001(\0132\032.google.pro" +
      "tobuf.TimestampB\004\342A\001\003\022F\n\016encryption_key\030" +
      "\013 \001(\0132(.google.cloud.gkebackup.v1.Encryp" +
      "tionKeyB\004\342A\001\003\022\036\n\016all_namespaces\030\014 \001(\010B\004\342" +
      "A\001\003H\000\022J\n\023selected_namespaces\030\r \001(\0132%.goo" +
      "gle.cloud.gkebackup.v1.NamespacesB\004\342A\001\003H" +
      "\000\022Q\n\025selected_applications\030\016 \001(\0132*.googl" +
      "e.cloud.gkebackup.v1.NamespacedNamesB\004\342A" +
      "\001\003H\000\022\"\n\024contains_volume_data\030\017 \001(\010B\004\342A\001\003" +
      "\022\036\n\020contains_secrets\030\020 \001(\010B\004\342A\001\003\022Q\n\020clus" +
      "ter_metadata\030\021 \001(\01321.google.cloud.gkebac" +
      "kup.v1.Backup.ClusterMetadataB\004\342A\001\003\022<\n\005s" +
      "tate\030\022 \001(\0162\'.google.cloud.gkebackup.v1.B" +
      "ackup.StateB\004\342A\001\003\022\032\n\014state_reason\030\023 \001(\tB" +
      "\004\342A\001\003\0227\n\rcomplete_time\030\024 \001(\0132\032.google.pr" +
      "otobuf.TimestampB\004\342A\001\003\022\034\n\016resource_count" +
      "\030\025 \001(\005B\004\342A\001\003\022\032\n\014volume_count\030\026 \001(\005B\004\342A\001\003" +
      "\022\030\n\nsize_bytes\030\027 \001(\003B\004\342A\001\003\022\022\n\004etag\030\030 \001(\t" +
      "B\004\342A\001\003\022\023\n\013description\030\031 \001(\t\022\027\n\tpod_count" +
      "\030\032 \001(\005B\004\342A\001\003\022&\n\030config_backup_size_bytes" +
      "\030\033 \001(\003B\004\342A\001\003\032\235\002\n\017ClusterMetadata\022\017\n\007clus" +
      "ter\030\001 \001(\t\022\023\n\013k8s_version\030\002 \001(\t\022e\n\023backup" +
      "_crd_versions\030\003 \003(\0132H.google.cloud.gkeba" +
      "ckup.v1.Backup.ClusterMetadata.BackupCrd" +
      "VersionsEntry\022\025\n\013gke_version\030\004 \001(\tH\000\022\030\n\016" +
      "anthos_version\030\005 \001(\tH\000\0328\n\026BackupCrdVersi" +
      "onsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      "B\022\n\020platform_version\032-\n\013LabelsEntry\022\013\n\003k" +
      "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"f\n\005State\022\025\n\021" +
      "STATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\017\n\013IN_" +
      "PROGRESS\020\002\022\r\n\tSUCCEEDED\020\003\022\n\n\006FAILED\020\004\022\014\n" +
      "\010DELETING\020\005:x\352Au\n\037gkebackup.googleapis.c" +
      "om/Backup\022Rprojects/{project}/locations/" +
      "{location}/backupPlans/{backup_plan}/bac" +
      "kups/{backup}B\016\n\014backup_scopeB\302\001\n\035com.go" +
      "ogle.cloud.gkebackup.v1B\013BackupProtoP\001Z;" +
      "cloud.google.com/go/gkebackup/apiv1/gkeb" +
      "ackuppb;gkebackuppb\252\002\031Google.Cloud.GkeBa" +
      "ckup.V1\312\002\031Google\\Cloud\\GkeBackup\\V1\352\002\034Go" +
      "ogle::Cloud::GkeBackup::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.gkebackup.v1.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_gkebackup_v1_Backup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Backup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_Backup_descriptor,
        new java.lang.String[] { "Name", "Uid", "CreateTime", "UpdateTime", "Manual", "Labels", "DeleteLockDays", "DeleteLockExpireTime", "RetainDays", "RetainExpireTime", "EncryptionKey", "AllNamespaces", "SelectedNamespaces", "SelectedApplications", "ContainsVolumeData", "ContainsSecrets", "ClusterMetadata", "State", "StateReason", "CompleteTime", "ResourceCount", "VolumeCount", "SizeBytes", "Etag", "Description", "PodCount", "ConfigBackupSizeBytes", "BackupScope", });
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor =
      internal_static_google_cloud_gkebackup_v1_Backup_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor,
        new java.lang.String[] { "Cluster", "K8SVersion", "BackupCrdVersions", "GkeVersion", "AnthosVersion", "PlatformVersion", });
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor =
      internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor =
      internal_static_google_cloud_gkebackup_v1_Backup_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkebackup.v1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
