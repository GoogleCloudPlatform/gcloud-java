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
// source: google/cloud/backupdr/v1/backupdr.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.backupdr.v1;

public final class BackupDRProto {
  private BackupDRProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_NetworkConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_NetworkConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_ManagementURI_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_ManagementURI_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedManagementURI_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedManagementURI_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedOAuth2ClientID_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedOAuth2ClientID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_ManagementServer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_ManagementServer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_ManagementServer_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_ManagementServer_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_ListManagementServersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_ListManagementServersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_ListManagementServersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_ListManagementServersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_GetManagementServerRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_GetManagementServerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_CreateManagementServerRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_CreateManagementServerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_DeleteManagementServerRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_DeleteManagementServerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_backupdr_v1_OperationMetadata_AdditionalInfoEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_backupdr_v1_OperationMetadata_AdditionalInfoEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/backupdr/v1/backupdr.prot"
          + "o\022\030google.cloud.backupdr.v1\032\034google/api/"
          + "annotations.proto\032\027google/api/client.pro"
          + "to\032\037google/api/field_behavior.proto\032\033goo"
          + "gle/api/field_info.proto\032\031google/api/res"
          + "ource.proto\032)google/cloud/backupdr/v1/ba"
          + "ckupplan.proto\0324google/cloud/backupdr/v1"
          + "/backupplanassociation.proto\032*google/clo"
          + "ud/backupdr/v1/backupvault.proto\032\036google"
          + "/iam/v1/iam_policy.proto\032#google/longrun"
          + "ning/operations.proto\032\033google/protobuf/e"
          + "mpty.proto\032\037google/protobuf/timestamp.pr"
          + "oto\032\036google/protobuf/wrappers.proto\"\276\001\n\r"
          + "NetworkConfig\022\024\n\007network\030\001 \001(\tB\003\340A\001\022N\n\014p"
          + "eering_mode\030\002 \001(\01623.google.cloud.backupd"
          + "r.v1.NetworkConfig.PeeringModeB\003\340A\001\"G\n\013P"
          + "eeringMode\022\034\n\030PEERING_MODE_UNSPECIFIED\020\000"
          + "\022\032\n\026PRIVATE_SERVICE_ACCESS\020\001\"6\n\rManageme"
          + "ntURI\022\023\n\006web_ui\030\001 \001(\tB\003\340A\003\022\020\n\003api\030\002 \001(\tB"
          + "\003\340A\003\"w\n#WorkforceIdentityBasedManagement"
          + "URI\022\'\n\032first_party_management_uri\030\001 \001(\tB"
          + "\003\340A\003\022\'\n\032third_party_management_uri\030\002 \001(\t"
          + "B\003\340A\003\"|\n$WorkforceIdentityBasedOAuth2Cli"
          + "entID\022)\n\034first_party_oauth2_client_id\030\001 "
          + "\001(\tB\003\340A\003\022)\n\034third_party_oauth2_client_id"
          + "\030\002 \001(\tB\003\340A\003\"\321\n\n\020ManagementServer\022\024\n\004name"
          + "\030\001 \001(\tB\006\340A\003\340A\010\022\030\n\013description\030\t \001(\tB\003\340A\001"
          + "\022K\n\006labels\030\004 \003(\01326.google.cloud.backupdr"
          + ".v1.ManagementServer.LabelsEntryB\003\340A\001\0224\n"
          + "\013create_time\030\002 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\022J\n\004type\030\016 \001(\0162"
          + "7.google.cloud.backupdr.v1.ManagementSer"
          + "ver.InstanceTypeB\003\340A\001\022D\n\016management_uri\030"
          + "\013 \001(\0132\'.google.cloud.backupdr.v1.Managem"
          + "entURIB\003\340A\003\022s\n\'workforce_identity_based_"
          + "management_uri\030\020 \001(\0132=.google.cloud.back"
          + "updr.v1.WorkforceIdentityBasedManagement"
          + "URIB\003\340A\003\022L\n\005state\030\007 \001(\01628.google.cloud.b"
          + "ackupdr.v1.ManagementServer.InstanceStat"
          + "eB\003\340A\003\022>\n\010networks\030\010 \003(\0132\'.google.cloud."
          + "backupdr.v1.NetworkConfigB\003\340A\002\022\021\n\004etag\030\r"
          + " \001(\tB\003\340A\001\022\035\n\020oauth2_client_id\030\017 \001(\tB\003\340A\003"
          + "\022v\n)workforce_identity_based_oauth2_clie"
          + "nt_id\030\021 \001(\0132>.google.cloud.backupdr.v1.W"
          + "orkforceIdentityBasedOAuth2ClientIDB\003\340A\003"
          + "\022\031\n\014ba_proxy_uri\030\022 \003(\tB\003\340A\003\0226\n\rsatisfies"
          + "_pzs\030\023 \001(\0132\032.google.protobuf.BoolValueB\003"
          + "\340A\003\022\032\n\rsatisfies_pzi\030\024 \001(\010B\003\340A\003\032-\n\013Label"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"A"
          + "\n\014InstanceType\022\035\n\031INSTANCE_TYPE_UNSPECIF"
          + "IED\020\000\022\022\n\016BACKUP_RESTORE\020\001\"\217\001\n\rInstanceSt"
          + "ate\022\036\n\032INSTANCE_STATE_UNSPECIFIED\020\000\022\014\n\010C"
          + "REATING\020\001\022\t\n\005READY\020\002\022\014\n\010UPDATING\020\003\022\014\n\010DE"
          + "LETING\020\004\022\r\n\tREPAIRING\020\005\022\017\n\013MAINTENANCE\020\006"
          + "\022\t\n\005ERROR\020\007:\241\001\352A\235\001\n(backupdr.googleapis."
          + "com/ManagementServer\022Lprojects/{project}"
          + "/locations/{location}/managementServers/"
          + "{managementserver}*\021managementServers2\020m"
          + "anagementServer\"\337\001\n\034ListManagementServer"
          + "sRequest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\022(backup"
          + "dr.googleapis.com/ManagementServer\022\026\n\tpa"
          + "ge_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003"
          + "\340A\001\022\030\n\006filter\030\004 \001(\tB\003\340A\001H\000\210\001\001\022\032\n\010order_b"
          + "y\030\005 \001(\tB\003\340A\001H\001\210\001\001B\t\n\007_filterB\013\n\t_order_b"
          + "y\"\225\001\n\035ListManagementServersResponse\022F\n\022m"
          + "anagement_servers\030\001 \003(\0132*.google.cloud.b"
          + "ackupdr.v1.ManagementServer\022\027\n\017next_page"
          + "_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"\\\n\032Get"
          + "ManagementServerRequest\022>\n\004name\030\001 \001(\tB0\340"
          + "A\002\372A*\n(backupdr.googleapis.com/Managemen"
          + "tServer\"\351\001\n\035CreateManagementServerReques"
          + "t\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\022(backupdr.goog"
          + "leapis.com/ManagementServer\022!\n\024managemen"
          + "t_server_id\030\002 \001(\tB\003\340A\002\022J\n\021management_ser"
          + "ver\030\003 \001(\0132*.google.cloud.backupdr.v1.Man"
          + "agementServerB\003\340A\002\022\027\n\nrequest_id\030\004 \001(\tB\003"
          + "\340A\001\"x\n\035DeleteManagementServerRequest\022>\n\004"
          + "name\030\001 \001(\tB0\340A\002\372A*\n(backupdr.googleapis."
          + "com/ManagementServer\022\027\n\nrequest_id\030\002 \001(\t"
          + "B\003\340A\001\"\226\003\n\021OperationMetadata\0224\n\013create_ti"
          + "me\030\001 \001(\0132\032.google.protobuf.TimestampB\003\340A"
          + "\003\0221\n\010end_time\030\002 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003\340A\003\022\021\n\004ver"
          + "b\030\004 \001(\tB\003\340A\003\022\033\n\016status_message\030\005 \001(\tB\003\340A"
          + "\003\022#\n\026requested_cancellation\030\006 \001(\010B\003\340A\003\022\030"
          + "\n\013api_version\030\007 \001(\tB\003\340A\003\022]\n\017additional_i"
          + "nfo\030\010 \003(\0132?.google.cloud.backupdr.v1.Ope"
          + "rationMetadata.AdditionalInfoEntryB\003\340A\003\032"
          + "5\n\023AdditionalInfoEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v"
          + "alue\030\002 \001(\t:\0028\0012\337<\n\010BackupDR\022\320\001\n\025ListMana"
          + "gementServers\0226.google.cloud.backupdr.v1"
          + ".ListManagementServersRequest\0327.google.c"
          + "loud.backupdr.v1.ListManagementServersRe"
          + "sponse\"F\332A\006parent\202\323\344\223\0027\0225/v1/{parent=pro"
          + "jects/*/locations/*}/managementServers\022\275"
          + "\001\n\023GetManagementServer\0224.google.cloud.ba"
          + "ckupdr.v1.GetManagementServerRequest\032*.g"
          + "oogle.cloud.backupdr.v1.ManagementServer"
          + "\"D\332A\004name\202\323\344\223\0027\0225/v1/{name=projects/*/lo"
          + "cations/*/managementServers/*}\022\233\002\n\026Creat"
          + "eManagementServer\0227.google.cloud.backupd"
          + "r.v1.CreateManagementServerRequest\032\035.goo"
          + "gle.longrunning.Operation\"\250\001\312A%\n\020Managem"
          + "entServer\022\021OperationMetadata\332A-parent,ma"
          + "nagement_server,management_server_id\202\323\344\223"
          + "\002J\"5/v1/{parent=projects/*/locations/*}/"
          + "managementServers:\021management_server\022\343\001\n"
          + "\026DeleteManagementServer\0227.google.cloud.b"
          + "ackupdr.v1.DeleteManagementServerRequest"
          + "\032\035.google.longrunning.Operation\"q\312A*\n\025go"
          + "ogle.protobuf.Empty\022\021OperationMetadata\332A"
          + "\004name\202\323\344\223\0027*5/v1/{name=projects/*/locati"
          + "ons/*/managementServers/*}\022\370\001\n\021CreateBac"
          + "kupVault\0222.google.cloud.backupdr.v1.Crea"
          + "teBackupVaultRequest\032\035.google.longrunnin"
          + "g.Operation\"\217\001\312A \n\013BackupVault\022\021Operatio"
          + "nMetadata\332A#parent,backup_vault,backup_v"
          + "ault_id\202\323\344\223\002@\"0/v1/{parent=projects/*/lo"
          + "cations/*}/backupVaults:\014backup_vault\022\274\001"
          + "\n\020ListBackupVaults\0221.google.cloud.backup"
          + "dr.v1.ListBackupVaultsRequest\0322.google.c"
          + "loud.backupdr.v1.ListBackupVaultsRespons"
          + "e\"A\332A\006parent\202\323\344\223\0022\0220/v1/{parent=projects"
          + "/*/locations/*}/backupVaults\022\335\001\n\027FetchUs"
          + "ableBackupVaults\0228.google.cloud.backupdr"
          + ".v1.FetchUsableBackupVaultsRequest\0329.goo"
          + "gle.cloud.backupdr.v1.FetchUsableBackupV"
          + "aultsResponse\"M\332A\006parent\202\323\344\223\002>\022</v1/{par"
          + "ent=projects/*/locations/*}/backupVaults"
          + ":fetchUsable\022\251\001\n\016GetBackupVault\022/.google"
          + ".cloud.backupdr.v1.GetBackupVaultRequest"
          + "\032%.google.cloud.backupdr.v1.BackupVault\""
          + "?\332A\004name\202\323\344\223\0022\0220/v1/{name=projects/*/loc"
          + "ations/*/backupVaults/*}\022\372\001\n\021UpdateBacku"
          + "pVault\0222.google.cloud.backupdr.v1.Update"
          + "BackupVaultRequest\032\035.google.longrunning."
          + "Operation\"\221\001\312A \n\013BackupVault\022\021OperationM"
          + "etadata\332A\030backup_vault,update_mask\202\323\344\223\002M"
          + "2=/v1/{backup_vault.name=projects/*/loca"
          + "tions/*/backupVaults/*}:\014backup_vault\022\324\001"
          + "\n\021DeleteBackupVault\0222.google.cloud.backu"
          + "pdr.v1.DeleteBackupVaultRequest\032\035.google"
          + ".longrunning.Operation\"l\312A*\n\025google.prot"
          + "obuf.Empty\022\021OperationMetadata\332A\004name\202\323\344\223"
          + "\0022*0/v1/{name=projects/*/locations/*/bac"
          + "kupVaults/*}\022\325\001\n\022TestIamPermissions\022(.go"
          + "ogle.iam.v1.TestIamPermissionsRequest\032)."
          + "google.iam.v1.TestIamPermissionsResponse"
          + "\"j\332A\025resource, permissions\202\323\344\223\002L\"G/v1/{r"
          + "esource=projects/*/locations/*/backupVau"
          + "lts/*}:testIamPermissions:\001*\022\307\001\n\017ListDat"
          + "aSources\0220.google.cloud.backupdr.v1.List"
          + "DataSourcesRequest\0321.google.cloud.backup"
          + "dr.v1.ListDataSourcesResponse\"O\332A\006parent"
          + "\202\323\344\223\002@\022>/v1/{parent=projects/*/locations"
          + "/*/backupVaults/*}/dataSources\022\264\001\n\rGetDa"
          + "taSource\022..google.cloud.backupdr.v1.GetD"
          + "ataSourceRequest\032$.google.cloud.backupdr"
          + ".v1.DataSource\"M\332A\004name\202\323\344\223\002@\022>/v1/{name"
          + "=projects/*/locations/*/backupVaults/*/d"
          + "ataSources/*}\022\202\002\n\020UpdateDataSource\0221.goo"
          + "gle.cloud.backupdr.v1.UpdateDataSourceRe"
          + "quest\032\035.google.longrunning.Operation\"\233\001\312"
          + "A\037\n\nDataSource\022\021OperationMetadata\332A\027data"
          + "_source,update_mask\202\323\344\223\002Y2J/v1/{data_sou"
          + "rce.name=projects/*/locations/*/backupVa"
          + "ults/*/dataSources/*}:\013data_source\022\353\001\n\020R"
          + "emoveDataSource\0221.google.cloud.backupdr."
          + "v1.RemoveDataSourceRequest\032\035.google.long"
          + "running.Operation\"\204\001\312A*\n\025google.protobuf"
          + ".Empty\022\021OperationMetadata\332A\004name\202\323\344\223\002J\"E"
          + "/v1/{name=projects/*/locations/*/backupV"
          + "aults/*/dataSources/*}:remove:\001*\022\212\002\n\021Set"
          + "InternalStatus\0222.google.cloud.backupdr.v"
          + "1.SetInternalStatusRequest\032\035.google.long"
          + "running.Operation\"\241\001\312A.\n\031SetInternalStat"
          + "usResponse\022\021OperationMetadata\332A\013data_sou"
          + "rce\202\323\344\223\002\\\"W/v1/{data_source=projects/*/l"
          + "ocations/*/backupVaults/*/dataSources/*}"
          + ":setInternalStatus:\001*\022\342\001\n\016InitiateBackup"
          + "\022/.google.cloud.backupdr.v1.InitiateBack"
          + "upRequest\0320.google.cloud.backupdr.v1.Ini"
          + "tiateBackupResponse\"m\332A\013data_source\202\323\344\223\002"
          + "Y\"T/v1/{data_source=projects/*/locations"
          + "/*/backupVaults/*/dataSources/*}:initiat"
          + "eBackup:\001*\022\372\001\n\rAbandonBackup\022..google.cl"
          + "oud.backupdr.v1.AbandonBackupRequest\032\035.g"
          + "oogle.longrunning.Operation\"\231\001\312A*\n\025googl"
          + "e.protobuf.Empty\022\021OperationMetadata\332A\013da"
          + "ta_source\202\323\344\223\002X\"S/v1/{data_source=projec"
          + "ts/*/locations/*/backupVaults/*/dataSour"
          + "ces/*}:abandonBackup:\001*\022\356\001\n\016FinalizeBack"
          + "up\022/.google.cloud.backupdr.v1.FinalizeBa"
          + "ckupRequest\032\035.google.longrunning.Operati"
          + "on\"\213\001\312A\033\n\006Backup\022\021OperationMetadata\332A\013da"
          + "ta_source\202\323\344\223\002Y\"T/v1/{data_source=projec"
          + "ts/*/locations/*/backupVaults/*/dataSour"
          + "ces/*}:finalizeBackup:\001*\022\334\001\n\020FetchAccess"
          + "Token\0221.google.cloud.backupdr.v1.FetchAc"
          + "cessTokenRequest\0322.google.cloud.backupdr"
          + ".v1.FetchAccessTokenResponse\"a\332A\004name\202\323\344"
          + "\223\002T\"O/v1/{name=projects/*/locations/*/ba"
          + "ckupVaults/*/dataSources/*}:fetchAccessT"
          + "oken:\001*\022\305\001\n\013ListBackups\022,.google.cloud.b"
          + "ackupdr.v1.ListBackupsRequest\032-.google.c"
          + "loud.backupdr.v1.ListBackupsResponse\"Y\332A"
          + "\006parent\202\323\344\223\002J\022H/v1/{parent=projects/*/lo"
          + "cations/*/backupVaults/*/dataSources/*}/"
          + "backups\022\262\001\n\tGetBackup\022*.google.cloud.bac"
          + "kupdr.v1.GetBackupRequest\032 .google.cloud"
          + ".backupdr.v1.Backup\"W\332A\004name\202\323\344\223\002J\022H/v1/"
          + "{name=projects/*/locations/*/backupVault"
          + "s/*/dataSources/*/backups/*}\022\361\001\n\014UpdateB"
          + "ackup\022-.google.cloud.backupdr.v1.UpdateB"
          + "ackupRequest\032\035.google.longrunning.Operat"
          + "ion\"\222\001\312A\033\n\006Backup\022\021OperationMetadata\332A\022b"
          + "ackup,update_mask\202\323\344\223\002Y2O/v1/{backup.nam"
          + "e=projects/*/locations/*/backupVaults/*/"
          + "dataSources/*/backups/*}:\006backup\022\323\001\n\014Del"
          + "eteBackup\022-.google.cloud.backupdr.v1.Del"
          + "eteBackupRequest\032\035.google.longrunning.Op"
          + "eration\"u\312A\033\n\006Backup\022\021OperationMetadata\332"
          + "A\004name\202\323\344\223\002J*H/v1/{name=projects/*/locat"
          + "ions/*/backupVaults/*/dataSources/*/back"
          + "ups/*}\022\360\001\n\rRestoreBackup\022..google.cloud."
          + "backupdr.v1.RestoreBackupRequest\032\035.googl"
          + "e.longrunning.Operation\"\217\001\312A*\n\025RestoreBa"
          + "ckupResponse\022\021OperationMetadata\332A\004name\202\323"
          + "\344\223\002U\"P/v1/{name=projects/*/locations/*/b"
          + "ackupVaults/*/dataSources/*/backups/*}:r"
          + "estore:\001*\022\361\001\n\020CreateBackupPlan\0221.google."
          + "cloud.backupdr.v1.CreateBackupPlanReques"
          + "t\032\035.google.longrunning.Operation\"\212\001\312A\037\n\n"
          + "BackupPlan\022\021OperationMetadata\332A!parent,b"
          + "ackup_plan,backup_plan_id\202\323\344\223\002>\"//v1/{pa"
          + "rent=projects/*/locations/*}/backupPlans"
          + ":\013backup_plan\022\245\001\n\rGetBackupPlan\022..google"
          + ".cloud.backupdr.v1.GetBackupPlanRequest\032"
          + "$.google.cloud.backupdr.v1.BackupPlan\">\332"
          + "A\004name\202\323\344\223\0021\022//v1/{name=projects/*/locat"
          + "ions/*/backupPlans/*}\022\270\001\n\017ListBackupPlan"
          + "s\0220.google.cloud.backupdr.v1.ListBackupP"
          + "lansRequest\0321.google.cloud.backupdr.v1.L"
          + "istBackupPlansResponse\"@\332A\006parent\202\323\344\223\0021\022"
          + "//v1/{parent=projects/*/locations/*}/bac"
          + "kupPlans\022\321\001\n\020DeleteBackupPlan\0221.google.c"
          + "loud.backupdr.v1.DeleteBackupPlanRequest"
          + "\032\035.google.longrunning.Operation\"k\312A*\n\025go"
          + "ogle.protobuf.Empty\022\021OperationMetadata\332A"
          + "\004name\202\323\344\223\0021*//v1/{name=projects/*/locati"
          + "ons/*/backupPlans/*}\022\301\002\n\033CreateBackupPla"
          + "nAssociation\022<.google.cloud.backupdr.v1."
          + "CreateBackupPlanAssociationRequest\032\035.goo"
          + "gle.longrunning.Operation\"\304\001\312A*\n\025BackupP"
          + "lanAssociation\022\021OperationMetadata\332A9pare"
          + "nt,backup_plan_association,backup_plan_a"
          + "ssociation_id\202\323\344\223\002U\":/v1/{parent=project"
          + "s/*/locations/*}/backupPlanAssociations:"
          + "\027backup_plan_association\022\321\001\n\030GetBackupPl"
          + "anAssociation\0229.google.cloud.backupdr.v1"
          + ".GetBackupPlanAssociationRequest\032/.googl"
          + "e.cloud.backupdr.v1.BackupPlanAssociatio"
          + "n\"I\332A\004name\202\323\344\223\002<\022:/v1/{name=projects/*/l"
          + "ocations/*/backupPlanAssociations/*}\022\344\001\n"
          + "\032ListBackupPlanAssociations\022;.google.clo"
          + "ud.backupdr.v1.ListBackupPlanAssociation"
          + "sRequest\032<.google.cloud.backupdr.v1.List"
          + "BackupPlanAssociationsResponse\"K\332A\006paren"
          + "t\202\323\344\223\002<\022:/v1/{parent=projects/*/location"
          + "s/*}/backupPlanAssociations\022\362\001\n\033DeleteBa"
          + "ckupPlanAssociation\022<.google.cloud.backu"
          + "pdr.v1.DeleteBackupPlanAssociationReques"
          + "t\032\035.google.longrunning.Operation\"v\312A*\n\025g"
          + "oogle.protobuf.Empty\022\021OperationMetadata\332"
          + "A\004name\202\323\344\223\002<*:/v1/{name=projects/*/locat"
          + "ions/*/backupPlanAssociations/*}\022\360\001\n\rTri"
          + "ggerBackup\022..google.cloud.backupdr.v1.Tr"
          + "iggerBackupRequest\032\035.google.longrunning."
          + "Operation\"\217\001\312A*\n\025BackupPlanAssociation\022\021"
          + "OperationMetadata\332A\014name,rule_id\202\323\344\223\002M\"H"
          + "/v1/{name=projects/*/locations/*/backupP"
          + "lanAssociations/*}:triggerBackup:\001*\032K\312A\027"
          + "backupdr.googleapis.com\322A.https://www.go"
          + "ogleapis.com/auth/cloud-platformB\275\001\n\034com"
          + ".google.cloud.backupdr.v1B\rBackupDRProto"
          + "P\001Z8cloud.google.com/go/backupdr/apiv1/b"
          + "ackupdrpb;backupdrpb\252\002\030Google.Cloud.Back"
          + "upDR.V1\312\002\030Google\\Cloud\\BackupDR\\V1\352\002\033Goo"
          + "gle::Cloud::BackupDR::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.backupdr.v1.BackupPlanProto.getDescriptor(),
              com.google.cloud.backupdr.v1.BackupPlanAssociationProto.getDescriptor(),
              com.google.cloud.backupdr.v1.BackupVaultProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_cloud_backupdr_v1_NetworkConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_backupdr_v1_NetworkConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_NetworkConfig_descriptor,
            new java.lang.String[] {
              "Network", "PeeringMode",
            });
    internal_static_google_cloud_backupdr_v1_ManagementURI_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_backupdr_v1_ManagementURI_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_ManagementURI_descriptor,
            new java.lang.String[] {
              "WebUi", "Api",
            });
    internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedManagementURI_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedManagementURI_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedManagementURI_descriptor,
            new java.lang.String[] {
              "FirstPartyManagementUri", "ThirdPartyManagementUri",
            });
    internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedOAuth2ClientID_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedOAuth2ClientID_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedOAuth2ClientID_descriptor,
            new java.lang.String[] {
              "FirstPartyOauth2ClientId", "ThirdPartyOauth2ClientId",
            });
    internal_static_google_cloud_backupdr_v1_ManagementServer_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_backupdr_v1_ManagementServer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_ManagementServer_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "Type",
              "ManagementUri",
              "WorkforceIdentityBasedManagementUri",
              "State",
              "Networks",
              "Etag",
              "Oauth2ClientId",
              "WorkforceIdentityBasedOauth2ClientId",
              "BaProxyUri",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    internal_static_google_cloud_backupdr_v1_ManagementServer_LabelsEntry_descriptor =
        internal_static_google_cloud_backupdr_v1_ManagementServer_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_backupdr_v1_ManagementServer_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_ManagementServer_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_backupdr_v1_ListManagementServersRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_backupdr_v1_ListManagementServersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_ListManagementServersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_backupdr_v1_ListManagementServersResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_backupdr_v1_ListManagementServersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_ListManagementServersResponse_descriptor,
            new java.lang.String[] {
              "ManagementServers", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_backupdr_v1_GetManagementServerRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_backupdr_v1_GetManagementServerRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_GetManagementServerRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_backupdr_v1_CreateManagementServerRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_backupdr_v1_CreateManagementServerRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_CreateManagementServerRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ManagementServerId", "ManagementServer", "RequestId",
            });
    internal_static_google_cloud_backupdr_v1_DeleteManagementServerRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_backupdr_v1_DeleteManagementServerRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_DeleteManagementServerRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_backupdr_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_backupdr_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
              "AdditionalInfo",
            });
    internal_static_google_cloud_backupdr_v1_OperationMetadata_AdditionalInfoEntry_descriptor =
        internal_static_google_cloud_backupdr_v1_OperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_backupdr_v1_OperationMetadata_AdditionalInfoEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_backupdr_v1_OperationMetadata_AdditionalInfoEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.backupdr.v1.BackupPlanProto.getDescriptor();
    com.google.cloud.backupdr.v1.BackupPlanAssociationProto.getDescriptor();
    com.google.cloud.backupdr.v1.BackupVaultProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
