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
// source: google/cloud/aiplatform/v1beta1/index_endpoint.proto

package com.google.cloud.aiplatform.v1beta1;

public final class IndexEndpointProto {
  private IndexEndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/aiplatform/v1beta1/index_"
          + "endpoint.proto\022\037google.cloud.aiplatform."
          + "v1beta1\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\0325google/clou"
          + "d/aiplatform/v1beta1/encryption_spec.pro"
          + "to\0327google/cloud/aiplatform/v1beta1/mach"
          + "ine_resources.proto\0328google/cloud/aiplat"
          + "form/v1beta1/service_networking.proto\032\037g"
          + "oogle/protobuf/timestamp.proto\"\224\007\n\rIndex"
          + "Endpoint\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_n"
          + "ame\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022M\n\020d"
          + "eployed_indexes\030\004 \003(\0132..google.cloud.aip"
          + "latform.v1beta1.DeployedIndexB\003\340A\003\022\014\n\004et"
          + "ag\030\005 \001(\t\022J\n\006labels\030\006 \003(\0132:.google.cloud."
          + "aiplatform.v1beta1.IndexEndpoint.LabelsE"
          + "ntry\0224\n\013create_time\030\007 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\0224\n\013update_time\030\010 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\022\024\n\007netw"
          + "ork\030\t \001(\tB\003\340A\001\022-\n\036enable_private_service"
          + "_connect\030\n \001(\010B\005\030\001\340A\001\022i\n\036private_service"
          + "_connect_config\030\014 \001(\0132<.google.cloud.aip"
          + "latform.v1beta1.PrivateServiceConnectCon"
          + "figB\003\340A\001\022$\n\027public_endpoint_enabled\030\r \001("
          + "\010B\003\340A\001\022(\n\033public_endpoint_domain_name\030\016 "
          + "\001(\tB\003\340A\003\022M\n\017encryption_spec\030\017 \001(\0132/.goog"
          + "le.cloud.aiplatform.v1beta1.EncryptionSp"
          + "ecB\003\340A\005\022\032\n\rsatisfies_pzs\030\021 \001(\010B\003\340A\003\022\032\n\rs"
          + "atisfies_pzi\030\022 \001(\010B\003\340A\003\032-\n\013LabelsEntry\022\013"
          + "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:u\352Ar\n\'aip"
          + "latform.googleapis.com/IndexEndpoint\022Gpr"
          + "ojects/{project}/locations/{location}/in"
          + "dexEndpoints/{index_endpoint}\"\206\006\n\rDeploy"
          + "edIndex\022\017\n\002id\030\001 \001(\tB\003\340A\002\0226\n\005index\030\002 \001(\tB"
          + "\'\340A\002\372A!\n\037aiplatform.googleapis.com/Index"
          + "\022\024\n\014display_name\030\003 \001(\t\0224\n\013create_time\030\004 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\022V\n\021"
          + "private_endpoints\030\005 \001(\01326.google.cloud.a"
          + "iplatform.v1beta1.IndexPrivateEndpointsB"
          + "\003\340A\003\0228\n\017index_sync_time\030\006 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\022U\n\023automatic_reso"
          + "urces\030\007 \001(\01323.google.cloud.aiplatform.v1"
          + "beta1.AutomaticResourcesB\003\340A\001\022U\n\023dedicat"
          + "ed_resources\030\020 \001(\01323.google.cloud.aiplat"
          + "form.v1beta1.DedicatedResourcesB\003\340A\001\022\"\n\025"
          + "enable_access_logging\030\010 \001(\010B\003\340A\001\022a\n\032depl"
          + "oyed_index_auth_config\030\t \001(\01328.google.cl"
          + "oud.aiplatform.v1beta1.DeployedIndexAuth"
          + "ConfigB\003\340A\001\022\037\n\022reserved_ip_ranges\030\n \003(\tB"
          + "\003\340A\001\022\035\n\020deployment_group\030\013 \001(\tB\003\340A\001\022Y\n\026p"
          + "sc_automation_configs\030\023 \003(\01324.google.clo"
          + "ud.aiplatform.v1beta1.PSCAutomationConfi"
          + "gB\003\340A\001\"\263\001\n\027DeployedIndexAuthConfig\022\\\n\rau"
          + "th_provider\030\001 \001(\0132E.google.cloud.aiplatf"
          + "orm.v1beta1.DeployedIndexAuthConfig.Auth"
          + "Provider\032:\n\014AuthProvider\022\021\n\taudiences\030\001 "
          + "\003(\t\022\027\n\017allowed_issuers\030\002 \003(\t\"\267\001\n\025IndexPr"
          + "ivateEndpoints\022\037\n\022match_grpc_address\030\001 \001"
          + "(\tB\003\340A\003\022\037\n\022service_attachment\030\002 \001(\tB\003\340A\003"
          + "\022\\\n\027psc_automated_endpoints\030\003 \003(\01326.goog"
          + "le.cloud.aiplatform.v1beta1.PscAutomated"
          + "EndpointsB\003\340A\003B\351\001\n#com.google.cloud.aipl"
          + "atform.v1beta1B\022IndexEndpointProtoP\001ZCcl"
          + "oud.google.com/go/aiplatform/apiv1beta1/"
          + "aiplatformpb;aiplatformpb\252\002\037Google.Cloud"
          + ".AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPla"
          + "tform\\V1beta1\352\002\"Google::Cloud::AIPlatfor"
          + "m::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "DeployedIndexes",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "Network",
              "EnablePrivateServiceConnect",
              "PrivateServiceConnectConfig",
              "PublicEndpointEnabled",
              "PublicEndpointDomainName",
              "EncryptionSpec",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_descriptor,
            new java.lang.String[] {
              "Id",
              "Index",
              "DisplayName",
              "CreateTime",
              "PrivateEndpoints",
              "IndexSyncTime",
              "AutomaticResources",
              "DedicatedResources",
              "EnableAccessLogging",
              "DeployedIndexAuthConfig",
              "ReservedIpRanges",
              "DeploymentGroup",
              "PscAutomationConfigs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor,
            new java.lang.String[] {
              "AuthProvider",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_descriptor,
            new java.lang.String[] {
              "Audiences", "AllowedIssuers",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor,
            new java.lang.String[] {
              "MatchGrpcAddress", "ServiceAttachment", "PscAutomatedEndpoints",
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
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
