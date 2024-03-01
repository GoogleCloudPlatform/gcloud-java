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
// source: google/cloud/gkehub/v1alpha/servicemesh/servicemesh.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.servicemesh.v1alpha;

public final class ServiceMeshProto {
  private ServiceMeshProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_servicemesh_v1alpha_FeatureState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_servicemesh_v1alpha_FeatureState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_servicemesh_v1alpha_MembershipState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_servicemesh_v1alpha_MembershipState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_Type_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_Type_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/gkehub/v1alpha/servicemes"
          + "h/servicemesh.proto\022\'google.cloud.gkehub"
          + ".servicemesh.v1alpha\032\037google/api/field_b"
          + "ehavior.proto\032\034google/protobuf/struct.pr"
          + "oto\"h\n\014FeatureState\022X\n\021analysis_messages"
          + "\030\001 \003(\01328.google.cloud.gkehub.servicemesh"
          + ".v1alpha.AnalysisMessageB\003\340A\003\"k\n\017Members"
          + "hipState\022X\n\021analysis_messages\030\001 \003(\01328.go"
          + "ogle.cloud.gkehub.servicemesh.v1alpha.An"
          + "alysisMessageB\003\340A\003\"\302\002\n\023AnalysisMessageBa"
          + "se\022O\n\004type\030\001 \001(\0132A.google.cloud.gkehub.s"
          + "ervicemesh.v1alpha.AnalysisMessageBase.T"
          + "ype\022Q\n\005level\030\002 \001(\0162B.google.cloud.gkehub"
          + ".servicemesh.v1alpha.AnalysisMessageBase"
          + ".Level\022\031\n\021documentation_url\030\003 \001(\t\032*\n\004Typ"
          + "e\022\024\n\014display_name\030\001 \001(\t\022\014\n\004code\030\002 \001(\t\"@\n"
          + "\005Level\022\025\n\021LEVEL_UNSPECIFIED\020\000\022\t\n\005ERROR\020\003"
          + "\022\013\n\007WARNING\020\010\022\010\n\004INFO\020\014\"\271\001\n\017AnalysisMess"
          + "age\022R\n\014message_base\030\001 \001(\0132<.google.cloud"
          + ".gkehub.servicemesh.v1alpha.AnalysisMess"
          + "ageBase\022\023\n\013description\030\002 \001(\t\022\026\n\016resource"
          + "_paths\030\003 \003(\t\022%\n\004args\030\004 \001(\0132\027.google.prot"
          + "obuf.StructB\222\002\n+com.google.cloud.gkehub."
          + "servicemesh.v1alphaB\020ServiceMeshProtoP\001Z"
          + "Mcloud.google.com/go/gkehub/servicemesh/"
          + "apiv1alpha/servicemeshpb;servicemeshpb\252\002"
          + "\'Google.Cloud.GkeHub.ServiceMesh.V1Alpha"
          + "\312\002\'Google\\Cloud\\GkeHub\\ServiceMesh\\V1alp"
          + "ha\352\002+Google::Cloud::GkeHub::ServiceMesh:"
          + ":V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_gkehub_servicemesh_v1alpha_FeatureState_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_servicemesh_v1alpha_FeatureState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_servicemesh_v1alpha_FeatureState_descriptor,
            new java.lang.String[] {
              "AnalysisMessages",
            });
    internal_static_google_cloud_gkehub_servicemesh_v1alpha_MembershipState_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkehub_servicemesh_v1alpha_MembershipState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_servicemesh_v1alpha_MembershipState_descriptor,
            new java.lang.String[] {
              "AnalysisMessages",
            });
    internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_descriptor,
            new java.lang.String[] {
              "Type", "Level", "DocumentationUrl",
            });
    internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_Type_descriptor =
        internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_Type_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessageBase_Type_descriptor,
            new java.lang.String[] {
              "DisplayName", "Code",
            });
    internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessage_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_servicemesh_v1alpha_AnalysisMessage_descriptor,
            new java.lang.String[] {
              "MessageBase", "Description", "ResourcePaths", "Args",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
