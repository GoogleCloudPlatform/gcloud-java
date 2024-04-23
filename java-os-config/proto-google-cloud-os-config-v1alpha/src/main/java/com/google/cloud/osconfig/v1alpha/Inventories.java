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
// source: google/cloud/osconfig/v1alpha/inventory.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.osconfig.v1alpha;

public final class Inventories {
  private Inventories() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_OsInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_OsInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_Item_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_Item_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_SoftwarePackage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_SoftwarePackage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_VersionedPackage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_VersionedPackage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_ZypperPatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_ZypperPatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_WindowsUpdateCategory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_WindowsUpdateCategory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsQuickFixEngineeringPackage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsQuickFixEngineeringPackage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsApplication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsApplication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_Inventory_ItemsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_Inventory_ItemsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_GetInventoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_GetInventoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_ListInventoriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListInventoriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_ListInventoriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListInventoriesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/osconfig/v1alpha/inventor"
          + "y.proto\022\035google.cloud.osconfig.v1alpha\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032\037google/protobuf/time"
          + "stamp.proto\032\026google/type/date.proto\"\267\026\n\t"
          + "Inventory\022\021\n\004name\030\003 \001(\tB\003\340A\003\022E\n\007os_info\030"
          + "\001 \001(\0132/.google.cloud.osconfig.v1alpha.In"
          + "ventory.OsInfoB\003\340A\003\022G\n\005items\030\002 \003(\01323.goo"
          + "gle.cloud.osconfig.v1alpha.Inventory.Ite"
          + "msEntryB\003\340A\003\0224\n\013update_time\030\004 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\032\270\001\n\006OsInfo\022\020\n"
          + "\010hostname\030\t \001(\t\022\021\n\tlong_name\030\002 \001(\t\022\022\n\nsh"
          + "ort_name\030\003 \001(\t\022\017\n\007version\030\004 \001(\t\022\024\n\014archi"
          + "tecture\030\005 \001(\t\022\026\n\016kernel_version\030\006 \001(\t\022\026\n"
          + "\016kernel_release\030\007 \001(\t\022\036\n\026osconfig_agent_"
          + "version\030\010 \001(\t\032\313\004\n\004Item\022\n\n\002id\030\001 \001(\t\022M\n\013or"
          + "igin_type\030\002 \001(\01628.google.cloud.osconfig."
          + "v1alpha.Inventory.Item.OriginType\022/\n\013cre"
          + "ate_time\030\010 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022/\n\013update_time\030\t \001(\0132\032.google.protobu"
          + "f.Timestamp\022@\n\004type\030\005 \001(\01622.google.cloud"
          + ".osconfig.v1alpha.Inventory.Item.Type\022U\n"
          + "\021installed_package\030\006 \001(\01328.google.cloud."
          + "osconfig.v1alpha.Inventory.SoftwarePacka"
          + "geH\000\022U\n\021available_package\030\007 \001(\01328.google"
          + ".cloud.osconfig.v1alpha.Inventory.Softwa"
          + "rePackageH\000\"?\n\nOriginType\022\033\n\027ORIGIN_TYPE"
          + "_UNSPECIFIED\020\000\022\024\n\020INVENTORY_REPORT\020\001\"J\n\004"
          + "Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\025\n\021INSTALLED_"
          + "PACKAGE\020\001\022\025\n\021AVAILABLE_PACKAGE\020\002B\t\n\007deta"
          + "ils\032\237\006\n\017SoftwarePackage\022P\n\013yum_package\030\001"
          + " \001(\01329.google.cloud.osconfig.v1alpha.Inv"
          + "entory.VersionedPackageH\000\022P\n\013apt_package"
          + "\030\002 \001(\01329.google.cloud.osconfig.v1alpha.I"
          + "nventory.VersionedPackageH\000\022S\n\016zypper_pa"
          + "ckage\030\003 \001(\01329.google.cloud.osconfig.v1al"
          + "pha.Inventory.VersionedPackageH\000\022S\n\016goog"
          + "et_package\030\004 \001(\01329.google.cloud.osconfig"
          + ".v1alpha.Inventory.VersionedPackageH\000\022L\n"
          + "\014zypper_patch\030\005 \001(\01324.google.cloud.oscon"
          + "fig.v1alpha.Inventory.ZypperPatchH\000\022T\n\013w"
          + "ua_package\030\006 \001(\0132=.google.cloud.osconfig"
          + ".v1alpha.Inventory.WindowsUpdatePackageH"
          + "\000\022a\n\013qfe_package\030\007 \001(\0132J.google.cloud.os"
          + "config.v1alpha.Inventory.WindowsQuickFix"
          + "EngineeringPackageH\000\022P\n\013cos_package\030\010 \001("
          + "\01329.google.cloud.osconfig.v1alpha.Invent"
          + "ory.VersionedPackageH\000\022Z\n\023windows_applic"
          + "ation\030\t \001(\0132;.google.cloud.osconfig.v1al"
          + "pha.Inventory.WindowsApplicationH\000B\t\n\007de"
          + "tails\032O\n\020VersionedPackage\022\024\n\014package_nam"
          + "e\030\004 \001(\t\022\024\n\014architecture\030\002 \001(\t\022\017\n\007version"
          + "\030\003 \001(\t\032V\n\013ZypperPatch\022\022\n\npatch_name\030\005 \001("
          + "\t\022\020\n\010category\030\002 \001(\t\022\020\n\010severity\030\003 \001(\t\022\017\n"
          + "\007summary\030\004 \001(\t\032\210\003\n\024WindowsUpdatePackage\022"
          + "\r\n\005title\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022g\n\nc"
          + "ategories\030\003 \003(\0132S.google.cloud.osconfig."
          + "v1alpha.Inventory.WindowsUpdatePackage.W"
          + "indowsUpdateCategory\022\026\n\016kb_article_ids\030\004"
          + " \003(\t\022\023\n\013support_url\030\013 \001(\t\022\026\n\016more_info_u"
          + "rls\030\005 \003(\t\022\021\n\tupdate_id\030\006 \001(\t\022\027\n\017revision"
          + "_number\030\007 \001(\005\022?\n\033last_deployment_change_"
          + "time\030\n \001(\0132\032.google.protobuf.Timestamp\0321"
          + "\n\025WindowsUpdateCategory\022\n\n\002id\030\001 \001(\t\022\014\n\004n"
          + "ame\030\002 \001(\t\032\217\001\n!WindowsQuickFixEngineering"
          + "Package\022\017\n\007caption\030\001 \001(\t\022\023\n\013description\030"
          + "\002 \001(\t\022\022\n\nhot_fix_id\030\003 \001(\t\0220\n\014install_tim"
          + "e\030\005 \001(\0132\032.google.protobuf.Timestamp\032\222\001\n\022"
          + "WindowsApplication\022\024\n\014display_name\030\001 \001(\t"
          + "\022\027\n\017display_version\030\002 \001(\t\022\021\n\tpublisher\030\003"
          + " \001(\t\022\'\n\014install_date\030\004 \001(\0132\021.google.type"
          + ".Date\022\021\n\thelp_link\030\005 \001(\t\032[\n\nItemsEntry\022\013"
          + "\n\003key\030\001 \001(\t\022<\n\005value\030\002 \001(\0132-.google.clou"
          + "d.osconfig.v1alpha.Inventory.Item:\0028\001:n\352"
          + "Ak\n!osconfig.googleapis.com/Inventory\022Fp"
          + "rojects/{project}/locations/{location}/i"
          + "nstances/{instance}/inventory\"\212\001\n\023GetInv"
          + "entoryRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!osc"
          + "onfig.googleapis.com/Inventory\022:\n\004view\030\002"
          + " \001(\0162,.google.cloud.osconfig.v1alpha.Inv"
          + "entoryView\"\304\001\n\026ListInventoriesRequest\0227\n"
          + "\006parent\030\001 \001(\tB\'\340A\002\372A!\n\037compute.googleapi"
          + "s.com/Instance\022:\n\004view\030\002 \001(\0162,.google.cl"
          + "oud.osconfig.v1alpha.InventoryView\022\021\n\tpa"
          + "ge_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\022\016\n\006fil"
          + "ter\030\005 \001(\t\"q\n\027ListInventoriesResponse\022=\n\013"
          + "inventories\030\001 \003(\0132(.google.cloud.osconfi"
          + "g.v1alpha.Inventory\022\027\n\017next_page_token\030\002"
          + " \001(\t*D\n\rInventoryView\022\036\n\032INVENTORY_VIEW_"
          + "UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010\n\004FULL\020\002B\324\001\n!c"
          + "om.google.cloud.osconfig.v1alphaB\013Invent"
          + "oriesP\001Z=cloud.google.com/go/osconfig/ap"
          + "iv1alpha/osconfigpb;osconfigpb\252\002\035Google."
          + "Cloud.OsConfig.V1Alpha\312\002\035Google\\Cloud\\Os"
          + "Config\\V1alpha\352\002 Google::Cloud::OsConfig"
          + "::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor,
            new java.lang.String[] {
              "Name", "OsInfo", "Items", "UpdateTime",
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_OsInfo_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_OsInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_OsInfo_descriptor,
            new java.lang.String[] {
              "Hostname",
              "LongName",
              "ShortName",
              "Version",
              "Architecture",
              "KernelVersion",
              "KernelRelease",
              "OsconfigAgentVersion",
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_Item_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_Item_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_Item_descriptor,
            new java.lang.String[] {
              "Id",
              "OriginType",
              "CreateTime",
              "UpdateTime",
              "Type",
              "InstalledPackage",
              "AvailablePackage",
              "Details",
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_SoftwarePackage_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_SoftwarePackage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_SoftwarePackage_descriptor,
            new java.lang.String[] {
              "YumPackage",
              "AptPackage",
              "ZypperPackage",
              "GoogetPackage",
              "ZypperPatch",
              "WuaPackage",
              "QfePackage",
              "CosPackage",
              "WindowsApplication",
              "Details",
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_VersionedPackage_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_VersionedPackage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_VersionedPackage_descriptor,
            new java.lang.String[] {
              "PackageName", "Architecture", "Version",
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_ZypperPatch_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_ZypperPatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_ZypperPatch_descriptor,
            new java.lang.String[] {
              "PatchName", "Category", "Severity", "Summary",
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_descriptor,
            new java.lang.String[] {
              "Title",
              "Description",
              "Categories",
              "KbArticleIds",
              "SupportUrl",
              "MoreInfoUrls",
              "UpdateId",
              "RevisionNumber",
              "LastDeploymentChangeTime",
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_WindowsUpdateCategory_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_WindowsUpdateCategory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsUpdatePackage_WindowsUpdateCategory_descriptor,
            new java.lang.String[] {
              "Id", "Name",
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsQuickFixEngineeringPackage_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsQuickFixEngineeringPackage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsQuickFixEngineeringPackage_descriptor,
            new java.lang.String[] {
              "Caption", "Description", "HotFixId", "InstallTime",
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsApplication_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor.getNestedTypes().get(7);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsApplication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_WindowsApplication_descriptor,
            new java.lang.String[] {
              "DisplayName", "DisplayVersion", "Publisher", "InstallDate", "HelpLink",
            });
    internal_static_google_cloud_osconfig_v1alpha_Inventory_ItemsEntry_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_Inventory_descriptor.getNestedTypes().get(8);
    internal_static_google_cloud_osconfig_v1alpha_Inventory_ItemsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_Inventory_ItemsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_osconfig_v1alpha_GetInventoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_osconfig_v1alpha_GetInventoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_GetInventoryRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_cloud_osconfig_v1alpha_ListInventoriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_osconfig_v1alpha_ListInventoriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_ListInventoriesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "View", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_osconfig_v1alpha_ListInventoriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_osconfig_v1alpha_ListInventoriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_ListInventoriesResponse_descriptor,
            new java.lang.String[] {
              "Inventories", "NextPageToken",
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
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
