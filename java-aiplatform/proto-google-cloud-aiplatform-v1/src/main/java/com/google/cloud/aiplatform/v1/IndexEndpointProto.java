/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1/index_endpoint.proto

package com.google.cloud.aiplatform.v1;

public final class IndexEndpointProto {
  private IndexEndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexEndpoint_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexEndpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeployedIndex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployedIndex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_AuthProvider_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_AuthProvider_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexPrivateEndpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexPrivateEndpoints_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/aiplatform/v1/index_endpo"
          + "int.proto\022\032google.cloud.aiplatform.v1\032\037g"
          + "oogle/api/field_behavior.proto\032\031google/a"
          + "pi/resource.proto\0322google/cloud/aiplatfo"
          + "rm/v1/machine_resources.proto\0323google/cl"
          + "oud/aiplatform/v1/service_networking.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\376\005\n\r"
          + "IndexEndpoint\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014disp"
          + "lay_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t"
          + "\022H\n\020deployed_indexes\030\004 \003(\0132).google.clou"
          + "d.aiplatform.v1.DeployedIndexB\003\340A\003\022\014\n\004et"
          + "ag\030\005 \001(\t\022E\n\006labels\030\006 \003(\01325.google.cloud."
          + "aiplatform.v1.IndexEndpoint.LabelsEntry\022"
          + "4\n\013create_time\030\007 \001(\0132\032.google.protobuf.T"
          + "imestampB\003\340A\003\0224\n\013update_time\030\010 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\022\024\n\007network\030\t"
          + " \001(\tB\003\340A\001\022-\n\036enable_private_service_conn"
          + "ect\030\n \001(\010B\005\030\001\340A\001\022d\n\036private_service_conn"
          + "ect_config\030\014 \001(\01327.google.cloud.aiplatfo"
          + "rm.v1.PrivateServiceConnectConfigB\003\340A\001\022$"
          + "\n\027public_endpoint_enabled\030\r \001(\010B\003\340A\001\022(\n\033"
          + "public_endpoint_domain_name\030\016 \001(\tB\003\340A\003\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001:u\352Ar\n\'aiplatform.googleapis.com/In"
          + "dexEndpoint\022Gprojects/{project}/location"
          + "s/{location}/indexEndpoints/{index_endpo"
          + "int}\"\227\005\n\rDeployedIndex\022\017\n\002id\030\001 \001(\tB\003\340A\002\022"
          + "6\n\005index\030\002 \001(\tB\'\340A\002\372A!\n\037aiplatform.googl"
          + "eapis.com/Index\022\024\n\014display_name\030\003 \001(\t\0224\n"
          + "\013create_time\030\004 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\022Q\n\021private_endpoints\030\005 \001(\01321"
          + ".google.cloud.aiplatform.v1.IndexPrivate"
          + "EndpointsB\003\340A\003\0228\n\017index_sync_time\030\006 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\022P\n\023auto"
          + "matic_resources\030\007 \001(\0132..google.cloud.aip"
          + "latform.v1.AutomaticResourcesB\003\340A\001\022P\n\023de"
          + "dicated_resources\030\020 \001(\0132..google.cloud.a"
          + "iplatform.v1.DedicatedResourcesB\003\340A\001\022\"\n\025"
          + "enable_access_logging\030\010 \001(\010B\003\340A\001\022\\\n\032depl"
          + "oyed_index_auth_config\030\t \001(\01323.google.cl"
          + "oud.aiplatform.v1.DeployedIndexAuthConfi"
          + "gB\003\340A\001\022\037\n\022reserved_ip_ranges\030\n \003(\tB\003\340A\001\022"
          + "\035\n\020deployment_group\030\013 \001(\tB\003\340A\001\"\256\001\n\027Deplo"
          + "yedIndexAuthConfig\022W\n\rauth_provider\030\001 \001("
          + "\0132@.google.cloud.aiplatform.v1.DeployedI"
          + "ndexAuthConfig.AuthProvider\032:\n\014AuthProvi"
          + "der\022\021\n\taudiences\030\001 \003(\t\022\027\n\017allowed_issuer"
          + "s\030\002 \003(\t\"Y\n\025IndexPrivateEndpoints\022\037\n\022matc"
          + "h_grpc_address\030\001 \001(\tB\003\340A\003\022\037\n\022service_att"
          + "achment\030\002 \001(\tB\003\340A\003B\320\001\n\036com.google.cloud."
          + "aiplatform.v1B\022IndexEndpointProtoP\001Z>clo"
          + "ud.google.com/go/aiplatform/apiv1/aiplat"
          + "formpb;aiplatformpb\252\002\032Google.Cloud.AIPla"
          + "tform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035"
          + "Google::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ServiceNetworkingProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_IndexEndpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_IndexEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexEndpoint_descriptor,
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
            });
    internal_static_google_cloud_aiplatform_v1_IndexEndpoint_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_IndexEndpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_IndexEndpoint_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexEndpoint_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_DeployedIndex_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_DeployedIndex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeployedIndex_descriptor,
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
            });
    internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_descriptor,
            new java.lang.String[] {
              "AuthProvider",
            });
    internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_AuthProvider_descriptor =
        internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_AuthProvider_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_AuthProvider_descriptor,
            new java.lang.String[] {
              "Audiences", "AllowedIssuers",
            });
    internal_static_google_cloud_aiplatform_v1_IndexPrivateEndpoints_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_IndexPrivateEndpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexPrivateEndpoints_descriptor,
            new java.lang.String[] {
              "MatchGrpcAddress", "ServiceAttachment",
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
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ServiceNetworkingProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
