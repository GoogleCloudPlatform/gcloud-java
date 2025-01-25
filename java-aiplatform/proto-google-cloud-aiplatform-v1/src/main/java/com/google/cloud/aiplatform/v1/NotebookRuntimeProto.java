/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/aiplatform/v1/notebook_runtime.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public final class NotebookRuntimeProto {
  private NotebookRuntimeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NotebookRuntime_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NotebookRuntime_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NotebookRuntime_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NotebookRuntime_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/notebook_ru"
          + "ntime.proto\022\032google.cloud.aiplatform.v1\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\0320google/cloud/aiplat"
          + "form/v1/encryption_spec.proto\0322google/cl"
          + "oud/aiplatform/v1/machine_resources.prot"
          + "o\032-google/cloud/aiplatform/v1/network_sp"
          + "ec.proto\0324google/cloud/aiplatform/v1/not"
          + "ebook_euc_config.proto\032>google/cloud/aip"
          + "latform/v1/notebook_idle_shutdown_config"
          + ".proto\032>google/cloud/aiplatform/v1/noteb"
          + "ook_runtime_template_ref.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\247\t\n\027NotebookRunt"
          + "imeTemplate\022\014\n\004name\030\001 \001(\t\022\031\n\014display_nam"
          + "e\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022\031\n\nis_"
          + "default\030\004 \001(\010B\005\030\001\340A\003\022E\n\014machine_spec\030\005 \001"
          + "(\0132\'.google.cloud.aiplatform.v1.MachineS"
          + "pecB\006\340A\001\340A\005\022V\n\031data_persistent_disk_spec"
          + "\030\010 \001(\0132..google.cloud.aiplatform.v1.Pers"
          + "istentDiskSpecB\003\340A\001\022B\n\014network_spec\030\014 \001("
          + "\0132\'.google.cloud.aiplatform.v1.NetworkSp"
          + "ecB\003\340A\001\022\033\n\017service_account\030\r \001(\tB\002\030\001\022\014\n\004"
          + "etag\030\016 \001(\t\022O\n\006labels\030\017 \003(\0132?.google.clou"
          + "d.aiplatform.v1.NotebookRuntimeTemplate."
          + "LabelsEntry\022T\n\024idle_shutdown_config\030\021 \001("
          + "\01326.google.cloud.aiplatform.v1.NotebookI"
          + "dleShutdownConfig\022A\n\neuc_config\030\022 \001(\0132-."
          + "google.cloud.aiplatform.v1.NotebookEucCo"
          + "nfig\0224\n\013create_time\030\n \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\0224\n\013update_time\030\013 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\022V\n\025note"
          + "book_runtime_type\030\023 \001(\0162/.google.cloud.a"
          + "iplatform.v1.NotebookRuntimeTypeB\006\340A\001\340A\005"
          + "\022P\n\022shielded_vm_config\030\024 \001(\0132,.google.cl"
          + "oud.aiplatform.v1.ShieldedVmConfigB\006\340A\001\340"
          + "A\005\022\031\n\014network_tags\030\025 \003(\tB\003\340A\001\022C\n\017encrypt"
          + "ion_spec\030\027 \001(\0132*.google.cloud.aiplatform"
          + ".v1.EncryptionSpec\032-\n\013LabelsEntry\022\013\n\003key"
          + "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\225\001\352A\221\001\n1aiplat"
          + "form.googleapis.com/NotebookRuntimeTempl"
          + "ate\022\\projects/{project}/locations/{locat"
          + "ion}/notebookRuntimeTemplates/{notebook_"
          + "runtime_template}\"\251\016\n\017NotebookRuntime\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022\031\n\014runtime_user\030\002 \001(\tB\003"
          + "\340A\002\022b\n\035notebook_runtime_template_ref\030\003 \001"
          + "(\01326.google.cloud.aiplatform.v1.Notebook"
          + "RuntimeTemplateRefB\003\340A\003\022\026\n\tproxy_uri\030\005 \001"
          + "(\tB\003\340A\003\0224\n\013create_time\030\006 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\0224\n\013update_time\030\007 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\022R\n\014h"
          + "ealth_state\030\010 \001(\01627.google.cloud.aiplatf"
          + "orm.v1.NotebookRuntime.HealthStateB\003\340A\003\022"
          + "\031\n\014display_name\030\n \001(\tB\003\340A\002\022\023\n\013descriptio"
          + "n\030\013 \001(\t\022\034\n\017service_account\030\r \001(\tB\003\340A\003\022T\n"
          + "\rruntime_state\030\016 \001(\01628.google.cloud.aipl"
          + "atform.v1.NotebookRuntime.RuntimeStateB\003"
          + "\340A\003\022\032\n\ris_upgradable\030\017 \001(\010B\003\340A\003\022G\n\006label"
          + "s\030\020 \003(\01327.google.cloud.aiplatform.v1.Not"
          + "ebookRuntime.LabelsEntry\0228\n\017expiration_t"
          + "ime\030\021 \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\022\024\n\007version\030\022 \001(\tB\003\340A\003\022S\n\025notebook_run"
          + "time_type\030\023 \001(\0162/.google.cloud.aiplatfor"
          + "m.v1.NotebookRuntimeTypeB\003\340A\003\022B\n\014machine"
          + "_spec\030\024 \001(\0132\'.google.cloud.aiplatform.v1"
          + ".MachineSpecB\003\340A\003\022V\n\031data_persistent_dis"
          + "k_spec\030\025 \001(\0132..google.cloud.aiplatform.v"
          + "1.PersistentDiskSpecB\003\340A\003\022B\n\014network_spe"
          + "c\030\026 \001(\0132\'.google.cloud.aiplatform.v1.Net"
          + "workSpecB\003\340A\003\022Y\n\024idle_shutdown_config\030\027 "
          + "\001(\01326.google.cloud.aiplatform.v1.Noteboo"
          + "kIdleShutdownConfigB\003\340A\003\022F\n\neuc_config\030\030"
          + " \001(\0132-.google.cloud.aiplatform.v1.Notebo"
          + "okEucConfigB\003\340A\003\022M\n\022shielded_vm_config\030 "
          + " \001(\0132,.google.cloud.aiplatform.v1.Shield"
          + "edVmConfigB\003\340A\003\022\031\n\014network_tags\030\031 \003(\tB\003\340"
          + "A\001\022H\n\017encryption_spec\030\034 \001(\0132*.google.clo"
          + "ud.aiplatform.v1.EncryptionSpecB\003\340A\003\022\032\n\r"
          + "satisfies_pzs\030\035 \001(\010B\003\340A\003\022\032\n\rsatisfies_pz"
          + "i\030\036 \001(\010B\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t"
          + "\022\r\n\005value\030\002 \001(\t:\0028\001\"G\n\013HealthState\022\034\n\030HE"
          + "ALTH_STATE_UNSPECIFIED\020\000\022\013\n\007HEALTHY\020\001\022\r\n"
          + "\tUNHEALTHY\020\002\"\231\001\n\014RuntimeState\022\035\n\031RUNTIME"
          + "_STATE_UNSPECIFIED\020\000\022\013\n\007RUNNING\020\001\022\021\n\rBEI"
          + "NG_STARTED\020\002\022\021\n\rBEING_STOPPED\020\003\022\013\n\007STOPP"
          + "ED\020\004\022\022\n\016BEING_UPGRADED\020\005\022\t\n\005ERROR\020d\022\013\n\007I"
          + "NVALID\020e:{\352Ax\n)aiplatform.googleapis.com"
          + "/NotebookRuntime\022Kprojects/{project}/loc"
          + "ations/{location}/notebookRuntimes/{note"
          + "book_runtime}*]\n\023NotebookRuntimeType\022%\n!"
          + "NOTEBOOK_RUNTIME_TYPE_UNSPECIFIED\020\000\022\020\n\014U"
          + "SER_DEFINED\020\001\022\r\n\tONE_CLICK\020\002B\322\001\n\036com.goo"
          + "gle.cloud.aiplatform.v1B\024NotebookRuntime"
          + "ProtoP\001Z>cloud.google.com/go/aiplatform/"
          + "apiv1/aiplatformpb;aiplatformpb\252\002\032Google"
          + ".Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPl"
          + "atform\\V1\352\002\035Google::Cloud::AIPlatform::V"
          + "1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.NetworkSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.NotebookEucConfigProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.NotebookIdleShutdownConfigProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.NotebookRuntimeTemplateRefProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "IsDefault",
              "MachineSpec",
              "DataPersistentDiskSpec",
              "NetworkSpec",
              "ServiceAccount",
              "Etag",
              "Labels",
              "IdleShutdownConfig",
              "EucConfig",
              "CreateTime",
              "UpdateTime",
              "NotebookRuntimeType",
              "ShieldedVmConfig",
              "NetworkTags",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NotebookRuntimeTemplate_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_NotebookRuntime_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_NotebookRuntime_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NotebookRuntime_descriptor,
            new java.lang.String[] {
              "Name",
              "RuntimeUser",
              "NotebookRuntimeTemplateRef",
              "ProxyUri",
              "CreateTime",
              "UpdateTime",
              "HealthState",
              "DisplayName",
              "Description",
              "ServiceAccount",
              "RuntimeState",
              "IsUpgradable",
              "Labels",
              "ExpirationTime",
              "Version",
              "NotebookRuntimeType",
              "MachineSpec",
              "DataPersistentDiskSpec",
              "NetworkSpec",
              "IdleShutdownConfig",
              "EucConfig",
              "ShieldedVmConfig",
              "NetworkTags",
              "EncryptionSpec",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    internal_static_google_cloud_aiplatform_v1_NotebookRuntime_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_NotebookRuntime_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_NotebookRuntime_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NotebookRuntime_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1.NetworkSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.NotebookEucConfigProto.getDescriptor();
    com.google.cloud.aiplatform.v1.NotebookIdleShutdownConfigProto.getDescriptor();
    com.google.cloud.aiplatform.v1.NotebookRuntimeTemplateRefProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
