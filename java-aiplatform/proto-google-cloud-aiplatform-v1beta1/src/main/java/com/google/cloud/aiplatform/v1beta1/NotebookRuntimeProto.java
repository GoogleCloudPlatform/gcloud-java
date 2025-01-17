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
// source: google/cloud/aiplatform/v1beta1/notebook_runtime.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public final class NotebookRuntimeProto {
  private NotebookRuntimeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/notebo"
          + "ok_runtime.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\0325google/cl"
          + "oud/aiplatform/v1beta1/encryption_spec.p"
          + "roto\0327google/cloud/aiplatform/v1beta1/ma"
          + "chine_resources.proto\0322google/cloud/aipl"
          + "atform/v1beta1/network_spec.proto\0329googl"
          + "e/cloud/aiplatform/v1beta1/notebook_euc_"
          + "config.proto\032Cgoogle/cloud/aiplatform/v1"
          + "beta1/notebook_idle_shutdown_config.prot"
          + "o\032Cgoogle/cloud/aiplatform/v1beta1/noteb"
          + "ook_runtime_template_ref.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\316\t\n\027NotebookRunt"
          + "imeTemplate\022\014\n\004name\030\001 \001(\t\022\031\n\014display_nam"
          + "e\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022\027\n\nis_"
          + "default\030\004 \001(\010B\003\340A\003\022J\n\014machine_spec\030\005 \001(\013"
          + "2,.google.cloud.aiplatform.v1beta1.Machi"
          + "neSpecB\006\340A\001\340A\005\022[\n\031data_persistent_disk_s"
          + "pec\030\010 \001(\01323.google.cloud.aiplatform.v1be"
          + "ta1.PersistentDiskSpecB\003\340A\001\022G\n\014network_s"
          + "pec\030\014 \001(\0132,.google.cloud.aiplatform.v1be"
          + "ta1.NetworkSpecB\003\340A\001\022\027\n\017service_account\030"
          + "\r \001(\t\022\014\n\004etag\030\016 \001(\t\022T\n\006labels\030\017 \003(\0132D.go"
          + "ogle.cloud.aiplatform.v1beta1.NotebookRu"
          + "ntimeTemplate.LabelsEntry\022Y\n\024idle_shutdo"
          + "wn_config\030\021 \001(\0132;.google.cloud.aiplatfor"
          + "m.v1beta1.NotebookIdleShutdownConfig\022F\n\n"
          + "euc_config\030\022 \001(\01322.google.cloud.aiplatfo"
          + "rm.v1beta1.NotebookEucConfig\0224\n\013create_t"
          + "ime\030\n \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\0224\n\013update_time\030\013 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003\022[\n\025notebook_runtime_typ"
          + "e\030\023 \001(\01624.google.cloud.aiplatform.v1beta"
          + "1.NotebookRuntimeTypeB\006\340A\001\340A\005\022U\n\022shielde"
          + "d_vm_config\030\024 \001(\01321.google.cloud.aiplatf"
          + "orm.v1beta1.ShieldedVmConfigB\006\340A\001\340A\005\022\031\n\014"
          + "network_tags\030\025 \003(\tB\003\340A\001\022H\n\017encryption_sp"
          + "ec\030\027 \001(\0132/.google.cloud.aiplatform.v1bet"
          + "a1.EncryptionSpec\032-\n\013LabelsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\225\001\352A\221\001\n1aiplatf"
          + "orm.googleapis.com/NotebookRuntimeTempla"
          + "te\022\\projects/{project}/locations/{locati"
          + "on}/notebookRuntimeTemplates/{notebook_r"
          + "untime_template}\"\325\013\n\017NotebookRuntime\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\003\022\031\n\014runtime_user\030\002 \001(\tB\003\340"
          + "A\002\022g\n\035notebook_runtime_template_ref\030\003 \001("
          + "\0132;.google.cloud.aiplatform.v1beta1.Note"
          + "bookRuntimeTemplateRefB\003\340A\003\022\026\n\tproxy_uri"
          + "\030\005 \001(\tB\003\340A\003\0224\n\013create_time\030\006 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\0224\n\013update_time"
          + "\030\007 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022"
          + "W\n\014health_state\030\010 \001(\0162<.google.cloud.aip"
          + "latform.v1beta1.NotebookRuntime.HealthSt"
          + "ateB\003\340A\003\022\031\n\014display_name\030\n \001(\tB\003\340A\002\022\023\n\013d"
          + "escription\030\013 \001(\t\022\034\n\017service_account\030\r \001("
          + "\tB\003\340A\003\022Y\n\rruntime_state\030\016 \001(\0162=.google.c"
          + "loud.aiplatform.v1beta1.NotebookRuntime."
          + "RuntimeStateB\003\340A\003\022\032\n\ris_upgradable\030\017 \001(\010"
          + "B\003\340A\003\022L\n\006labels\030\020 \003(\0132<.google.cloud.aip"
          + "latform.v1beta1.NotebookRuntime.LabelsEn"
          + "try\0228\n\017expiration_time\030\021 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\022\024\n\007version\030\022 \001(\tB\003"
          + "\340A\003\022X\n\025notebook_runtime_type\030\023 \001(\01624.goo"
          + "gle.cloud.aiplatform.v1beta1.NotebookRun"
          + "timeTypeB\003\340A\003\022^\n\024idle_shutdown_config\030\027 "
          + "\001(\0132;.google.cloud.aiplatform.v1beta1.No"
          + "tebookIdleShutdownConfigB\003\340A\003\022\031\n\014network"
          + "_tags\030\031 \003(\tB\003\340A\001\022M\n\017encryption_spec\030\034 \001("
          + "\0132/.google.cloud.aiplatform.v1beta1.Encr"
          + "yptionSpecB\003\340A\003\022\032\n\rsatisfies_pzs\030\035 \001(\010B\003"
          + "\340A\003\022\032\n\rsatisfies_pzi\030\036 \001(\010B\003\340A\003\032-\n\013Label"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"G"
          + "\n\013HealthState\022\034\n\030HEALTH_STATE_UNSPECIFIE"
          + "D\020\000\022\013\n\007HEALTHY\020\001\022\r\n\tUNHEALTHY\020\002\"\231\001\n\014Runt"
          + "imeState\022\035\n\031RUNTIME_STATE_UNSPECIFIED\020\000\022"
          + "\013\n\007RUNNING\020\001\022\021\n\rBEING_STARTED\020\002\022\021\n\rBEING"
          + "_STOPPED\020\003\022\013\n\007STOPPED\020\004\022\022\n\016BEING_UPGRADE"
          + "D\020\005\022\t\n\005ERROR\020d\022\013\n\007INVALID\020e:{\352Ax\n)aiplat"
          + "form.googleapis.com/NotebookRuntime\022Kpro"
          + "jects/{project}/locations/{location}/not"
          + "ebookRuntimes/{notebook_runtime}*]\n\023Note"
          + "bookRuntimeType\022%\n!NOTEBOOK_RUNTIME_TYPE"
          + "_UNSPECIFIED\020\000\022\020\n\014USER_DEFINED\020\001\022\r\n\tONE_"
          + "CLICK\020\002B\353\001\n#com.google.cloud.aiplatform."
          + "v1beta1B\024NotebookRuntimeProtoP\001ZCcloud.g"
          + "oogle.com/go/aiplatform/apiv1beta1/aipla"
          + "tformpb;aiplatformpb\252\002\037Google.Cloud.AIPl"
          + "atform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform"
          + "\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1"
          + "beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.NetworkSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.NotebookEucConfigProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.NotebookIdleShutdownConfigProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplateRefProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_descriptor,
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
    internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntimeTemplate_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_descriptor,
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
              "IdleShutdownConfig",
              "NetworkTags",
              "EncryptionSpec",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NotebookRuntime_LabelsEntry_descriptor,
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
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.NetworkSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.NotebookEucConfigProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.NotebookIdleShutdownConfigProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplateRefProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
