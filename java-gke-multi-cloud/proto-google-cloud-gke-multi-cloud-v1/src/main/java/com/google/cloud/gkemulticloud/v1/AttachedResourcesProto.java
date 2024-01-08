/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/gkemulticloud/v1/attached_resources.proto

package com.google.cloud.gkemulticloud.v1;

public final class AttachedResourcesProto {
  private AttachedResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedClustersAuthorization_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedClustersAuthorization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedClusterUser_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedClusterUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedClusterGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedClusterGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedServerConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedServerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedPlatformVersionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedPlatformVersionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedClusterError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedClusterError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedProxyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedProxyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_KubernetesSecret_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_KubernetesSecret_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/gkemulticloud/v1/attached"
          + "_resources.proto\022\035google.cloud.gkemultic"
          + "loud.v1\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\0324google/clou"
          + "d/gkemulticloud/v1/common_resources.prot"
          + "o\032\037google/protobuf/timestamp.proto\"\206\014\n\017A"
          + "ttachedCluster\022\014\n\004name\030\001 \001(\t\022\031\n\013descript"
          + "ion\030\002 \001(\tB\004\342A\001\001\022L\n\013oidc_config\030\003 \001(\01321.g"
          + "oogle.cloud.gkemulticloud.v1.AttachedOid"
          + "cConfigB\004\342A\001\002\022\036\n\020platform_version\030\004 \001(\tB"
          + "\004\342A\001\002\022\032\n\014distribution\030\020 \001(\tB\004\342A\001\002\022\034\n\016clu"
          + "ster_region\030\026 \001(\tB\004\342A\001\003\0229\n\005fleet\030\005 \001(\0132$"
          + ".google.cloud.gkemulticloud.v1.FleetB\004\342A"
          + "\001\002\022I\n\005state\030\006 \001(\01624.google.cloud.gkemult"
          + "icloud.v1.AttachedCluster.StateB\004\342A\001\003\022\021\n"
          + "\003uid\030\007 \001(\tB\004\342A\001\003\022\031\n\013reconciling\030\010 \001(\010B\004\342"
          + "A\001\003\0225\n\013create_time\030\t \001(\0132\032.google.protob"
          + "uf.TimestampB\004\342A\001\003\0225\n\013update_time\030\n \001(\0132"
          + "\032.google.protobuf.TimestampB\004\342A\001\003\022\014\n\004eta"
          + "g\030\013 \001(\t\022 \n\022kubernetes_version\030\014 \001(\tB\004\342A\001"
          + "\003\022Z\n\013annotations\030\r \003(\0132?.google.cloud.gk"
          + "emulticloud.v1.AttachedCluster.Annotatio"
          + "nsEntryB\004\342A\001\001\022]\n\030workload_identity_confi"
          + "g\030\016 \001(\01325.google.cloud.gkemulticloud.v1."
          + "WorkloadIdentityConfigB\004\342A\001\003\022J\n\016logging_"
          + "config\030\017 \001(\0132,.google.cloud.gkemulticlou"
          + "d.v1.LoggingConfigB\004\342A\001\001\022I\n\006errors\030\024 \003(\013"
          + "23.google.cloud.gkemulticloud.v1.Attache"
          + "dClusterErrorB\004\342A\001\003\022Y\n\rauthorization\030\025 \001"
          + "(\0132<.google.cloud.gkemulticloud.v1.Attac"
          + "hedClustersAuthorizationB\004\342A\001\001\022P\n\021monito"
          + "ring_config\030\027 \001(\0132/.google.cloud.gkemult"
          + "icloud.v1.MonitoringConfigB\004\342A\001\001\022N\n\014prox"
          + "y_config\030\030 \001(\01322.google.cloud.gkemulticl"
          + "oud.v1.AttachedProxyConfigB\004\342A\001\001\022V\n\024bina"
          + "ry_authorization\030\031 \001(\01322.google.cloud.gk"
          + "emulticloud.v1.BinaryAuthorizationB\004\342A\001\001"
          + "\0322\n\020AnnotationsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val"
          + "ue\030\002 \001(\t:\0028\001\"u\n\005State\022\025\n\021STATE_UNSPECIFI"
          + "ED\020\000\022\020\n\014PROVISIONING\020\001\022\013\n\007RUNNING\020\002\022\017\n\013R"
          + "ECONCILING\020\003\022\014\n\010STOPPING\020\004\022\t\n\005ERROR\020\005\022\014\n"
          + "\010DEGRADED\020\006:~\352A{\n,gkemulticloud.googleap"
          + "is.com/AttachedCluster\022Kprojects/{projec"
          + "t}/locations/{location}/attachedClusters"
          + "/{attached_cluster}\"\277\001\n\035AttachedClusters"
          + "Authorization\022M\n\013admin_users\030\001 \003(\01322.goo"
          + "gle.cloud.gkemulticloud.v1.AttachedClust"
          + "erUserB\004\342A\001\001\022O\n\014admin_groups\030\002 \003(\01323.goo"
          + "gle.cloud.gkemulticloud.v1.AttachedClust"
          + "erGroupB\004\342A\001\001\"-\n\023AttachedClusterUser\022\026\n\010"
          + "username\030\001 \001(\tB\004\342A\001\002\"+\n\024AttachedClusterG"
          + "roup\022\023\n\005group\030\001 \001(\tB\004\342A\001\002\"<\n\022AttachedOid"
          + "cConfig\022\022\n\nissuer_url\030\001 \001(\t\022\022\n\004jwks\030\002 \001("
          + "\014B\004\342A\001\001\"\356\001\n\024AttachedServerConfig\022\014\n\004name"
          + "\030\001 \001(\t\022R\n\016valid_versions\030\002 \003(\0132:.google."
          + "cloud.gkemulticloud.v1.AttachedPlatformV"
          + "ersionInfo:t\352Aq\n1gkemulticloud.googleapi"
          + "s.com/AttachedServerConfig\022<projects/{pr"
          + "oject}/locations/{location}/attachedServ"
          + "erConfig\".\n\033AttachedPlatformVersionInfo\022"
          + "\017\n\007version\030\001 \001(\t\"\'\n\024AttachedClusterError"
          + "\022\017\n\007message\030\001 \001(\t\"a\n\023AttachedProxyConfig"
          + "\022J\n\021kubernetes_secret\030\001 \001(\0132/.google.clo"
          + "ud.gkemulticloud.v1.KubernetesSecret\"3\n\020"
          + "KubernetesSecret\022\014\n\004name\030\001 \001(\t\022\021\n\tnamesp"
          + "ace\030\002 \001(\tB\351\001\n!com.google.cloud.gkemultic"
          + "loud.v1B\026AttachedResourcesProtoP\001ZGcloud"
          + ".google.com/go/gkemulticloud/apiv1/gkemu"
          + "lticloudpb;gkemulticloudpb\252\002\035Google.Clou"
          + "d.GkeMultiCloud.V1\312\002\035Google\\Cloud\\GkeMul"
          + "tiCloud\\V1\352\002 Google::Cloud::GkeMultiClou"
          + "d::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkemulticloud.v1.CommonResourcesProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "OidcConfig",
              "PlatformVersion",
              "Distribution",
              "ClusterRegion",
              "Fleet",
              "State",
              "Uid",
              "Reconciling",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "KubernetesVersion",
              "Annotations",
              "WorkloadIdentityConfig",
              "LoggingConfig",
              "Errors",
              "Authorization",
              "MonitoringConfig",
              "ProxyConfig",
              "BinaryAuthorization",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_AnnotationsEntry_descriptor =
        internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedClustersAuthorization_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkemulticloud_v1_AttachedClustersAuthorization_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedClustersAuthorization_descriptor,
            new java.lang.String[] {
              "AdminUsers", "AdminGroups",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedClusterUser_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkemulticloud_v1_AttachedClusterUser_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedClusterUser_descriptor,
            new java.lang.String[] {
              "Username",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedClusterGroup_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkemulticloud_v1_AttachedClusterGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedClusterGroup_descriptor,
            new java.lang.String[] {
              "Group",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_descriptor,
            new java.lang.String[] {
              "IssuerUrl", "Jwks",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedServerConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkemulticloud_v1_AttachedServerConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedServerConfig_descriptor,
            new java.lang.String[] {
              "Name", "ValidVersions",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedPlatformVersionInfo_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkemulticloud_v1_AttachedPlatformVersionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedPlatformVersionInfo_descriptor,
            new java.lang.String[] {
              "Version",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedClusterError_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gkemulticloud_v1_AttachedClusterError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedClusterError_descriptor,
            new java.lang.String[] {
              "Message",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedProxyConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gkemulticloud_v1_AttachedProxyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedProxyConfig_descriptor,
            new java.lang.String[] {
              "KubernetesSecret",
            });
    internal_static_google_cloud_gkemulticloud_v1_KubernetesSecret_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_gkemulticloud_v1_KubernetesSecret_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_KubernetesSecret_descriptor,
            new java.lang.String[] {
              "Name", "Namespace",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkemulticloud.v1.CommonResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
