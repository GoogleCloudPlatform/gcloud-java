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
// source: google/cloud/asset/v1p5beta1/assets.proto

package com.google.cloud.asset.v1p5beta1;

public final class AssetProto {
  private AssetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p5beta1_Asset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p5beta1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p5beta1_Resource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p5beta1_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/asset/v1p5beta1/assets.pr"
          + "oto\022\034google.cloud.asset.v1p5beta1\032\031googl"
          + "e/api/resource.proto\032)google/cloud/orgpo"
          + "licy/v1/orgpolicy.proto\032\032google/iam/v1/p"
          + "olicy.proto\032:google/identity/accessconte"
          + "xtmanager/v1/access_level.proto\032;google/"
          + "identity/accesscontextmanager/v1/access_"
          + "policy.proto\032?google/identity/accesscont"
          + "extmanager/v1/service_perimeter.proto\032\034g"
          + "oogle/protobuf/struct.proto\"\220\004\n\005Asset\022\014\n"
          + "\004name\030\001 \001(\t\022\022\n\nasset_type\030\002 \001(\t\0228\n\010resou"
          + "rce\030\003 \001(\0132&.google.cloud.asset.v1p5beta1"
          + ".Resource\022)\n\niam_policy\030\004 \001(\0132\025.google.i"
          + "am.v1.Policy\0225\n\norg_policy\030\006 \003(\0132!.googl"
          + "e.cloud.orgpolicy.v1.Policy\022N\n\raccess_po"
          + "licy\030\007 \001(\01325.google.identity.accessconte"
          + "xtmanager.v1.AccessPolicyH\000\022L\n\014access_le"
          + "vel\030\010 \001(\01324.google.identity.accesscontex"
          + "tmanager.v1.AccessLevelH\000\022V\n\021service_per"
          + "imeter\030\t \001(\01329.google.identity.accesscon"
          + "textmanager.v1.ServicePerimeterH\000\022\021\n\tanc"
          + "estors\030\n \003(\t:\'\352A$\n\037cloudasset.googleapis"
          + ".com/Asset\022\001*B\027\n\025access_context_policy\"\240"
          + "\001\n\010Resource\022\017\n\007version\030\001 \001(\t\022\036\n\026discover"
          + "y_document_uri\030\002 \001(\t\022\026\n\016discovery_name\030\003"
          + " \001(\t\022\024\n\014resource_url\030\004 \001(\t\022\016\n\006parent\030\005 \001"
          + "(\t\022%\n\004data\030\006 \001(\0132\027.google.protobuf.Struc"
          + "tB\251\001\n com.google.cloud.asset.v1p5beta1B\n"
          + "AssetProtoP\001Z6cloud.google.com/go/asset/"
          + "apiv1p5beta1/assetpb;assetpb\370\001\001\252\002\034Google"
          + ".Cloud.Asset.V1p5Beta1\312\002\034Google\\Cloud\\As"
          + "set\\V1p5beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.orgpolicy.v1.OrgPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.identity.accesscontextmanager.v1.AccessLevelProto.getDescriptor(),
              com.google.identity.accesscontextmanager.v1.PolicyProto.getDescriptor(),
              com.google.identity.accesscontextmanager.v1.ServicePerimeterProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_asset_v1p5beta1_Asset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1p5beta1_Asset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p5beta1_Asset_descriptor,
            new java.lang.String[] {
              "Name",
              "AssetType",
              "Resource",
              "IamPolicy",
              "OrgPolicy",
              "AccessPolicy",
              "AccessLevel",
              "ServicePerimeter",
              "Ancestors",
              "AccessContextPolicy",
            });
    internal_static_google_cloud_asset_v1p5beta1_Resource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1p5beta1_Resource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p5beta1_Resource_descriptor,
            new java.lang.String[] {
              "Version", "DiscoveryDocumentUri", "DiscoveryName", "ResourceUrl", "Parent", "Data",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.orgpolicy.v1.OrgPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.AccessLevelProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.PolicyProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.ServicePerimeterProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
