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
// source: google/identity/accesscontextmanager/v1/access_level.proto

// Protobuf Java Version: 3.25.3
package com.google.identity.accesscontextmanager.v1;

public final class AccessLevelProto {
  private AccessLevelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_identity_accesscontextmanager_v1_AccessLevel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_identity_accesscontextmanager_v1_AccessLevel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_identity_accesscontextmanager_v1_BasicLevel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_identity_accesscontextmanager_v1_BasicLevel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_identity_accesscontextmanager_v1_Condition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_identity_accesscontextmanager_v1_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_identity_accesscontextmanager_v1_CustomLevel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_identity_accesscontextmanager_v1_CustomLevel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_identity_accesscontextmanager_v1_DevicePolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_identity_accesscontextmanager_v1_DevicePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_identity_accesscontextmanager_v1_OsConstraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_identity_accesscontextmanager_v1_OsConstraint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/identity/accesscontextmanager/v"
          + "1/access_level.proto\022\'google.identity.ac"
          + "cesscontextmanager.v1\032\031google/api/resour"
          + "ce.proto\032@google/identity/accesscontextm"
          + "anager/type/device_resources.proto\032\037goog"
          + "le/protobuf/timestamp.proto\032\026google/type"
          + "/expr.proto\"\252\003\n\013AccessLevel\022\014\n\004name\030\001 \001("
          + "\t\022\r\n\005title\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022D\n"
          + "\005basic\030\004 \001(\01323.google.identity.accesscon"
          + "textmanager.v1.BasicLevelH\000\022F\n\006custom\030\005 "
          + "\001(\01324.google.identity.accesscontextmanag"
          + "er.v1.CustomLevelH\000\022/\n\013create_time\030\006 \001(\013"
          + "2\032.google.protobuf.Timestamp\022/\n\013update_t"
          + "ime\030\007 \001(\0132\032.google.protobuf.Timestamp:p\352"
          + "Am\n/accesscontextmanager.googleapis.com/"
          + "AccessLevel\022:accessPolicies/{access_poli"
          + "cy}/accessLevels/{access_level}B\007\n\005level"
          + "\"\357\001\n\nBasicLevel\022F\n\nconditions\030\001 \003(\01322.go"
          + "ogle.identity.accesscontextmanager.v1.Co"
          + "ndition\022j\n\022combining_function\030\002 \001(\0162N.go"
          + "ogle.identity.accesscontextmanager.v1.Ba"
          + "sicLevel.ConditionCombiningFunction\"-\n\032C"
          + "onditionCombiningFunction\022\007\n\003AND\020\000\022\006\n\002OR"
          + "\020\001\"\303\001\n\tCondition\022\026\n\016ip_subnetworks\030\001 \003(\t"
          + "\022L\n\rdevice_policy\030\002 \001(\01325.google.identit"
          + "y.accesscontextmanager.v1.DevicePolicy\022\036"
          + "\n\026required_access_levels\030\003 \003(\t\022\016\n\006negate"
          + "\030\005 \001(\010\022\017\n\007members\030\006 \003(\t\022\017\n\007regions\030\007 \003(\t"
          + "\".\n\013CustomLevel\022\037\n\004expr\030\001 \001(\0132\021.google.t"
          + "ype.Expr\"\211\003\n\014DevicePolicy\022\032\n\022require_scr"
          + "eenlock\030\001 \001(\010\022f\n\033allowed_encryption_stat"
          + "uses\030\002 \003(\0162A.google.identity.accessconte"
          + "xtmanager.type.DeviceEncryptionStatus\022M\n"
          + "\016os_constraints\030\003 \003(\01325.google.identity."
          + "accesscontextmanager.v1.OsConstraint\022j\n "
          + "allowed_device_management_levels\030\006 \003(\0162@"
          + ".google.identity.accesscontextmanager.ty"
          + "pe.DeviceManagementLevel\022\036\n\026require_admi"
          + "n_approval\030\007 \001(\010\022\032\n\022require_corp_owned\030\010"
          + " \001(\010\"\217\001\n\014OsConstraint\022B\n\007os_type\030\001 \001(\01621"
          + ".google.identity.accesscontextmanager.ty"
          + "pe.OsType\022\027\n\017minimum_version\030\002 \001(\t\022\"\n\032re"
          + "quire_verified_chrome_os\030\003 \001(\010B\247\002\n+com.g"
          + "oogle.identity.accesscontextmanager.v1B\020"
          + "AccessLevelProtoP\001Z\\cloud.google.com/go/"
          + "accesscontextmanager/apiv1/accesscontext"
          + "managerpb;accesscontextmanagerpb\242\002\004GACM\252"
          + "\002\'Google.Identity.AccessContextManager.V"
          + "1\312\002\'Google\\Identity\\AccessContextManager"
          + "\\V1\352\002*Google::Identity::AccessContextMan"
          + "ager::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.identity.accesscontextmanager.type.TypeProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.ExprProto.getDescriptor(),
            });
    internal_static_google_identity_accesscontextmanager_v1_AccessLevel_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_identity_accesscontextmanager_v1_AccessLevel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_identity_accesscontextmanager_v1_AccessLevel_descriptor,
            new java.lang.String[] {
              "Name",
              "Title",
              "Description",
              "Basic",
              "Custom",
              "CreateTime",
              "UpdateTime",
              "Level",
            });
    internal_static_google_identity_accesscontextmanager_v1_BasicLevel_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_identity_accesscontextmanager_v1_BasicLevel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_identity_accesscontextmanager_v1_BasicLevel_descriptor,
            new java.lang.String[] {
              "Conditions", "CombiningFunction",
            });
    internal_static_google_identity_accesscontextmanager_v1_Condition_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_identity_accesscontextmanager_v1_Condition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_identity_accesscontextmanager_v1_Condition_descriptor,
            new java.lang.String[] {
              "IpSubnetworks",
              "DevicePolicy",
              "RequiredAccessLevels",
              "Negate",
              "Members",
              "Regions",
            });
    internal_static_google_identity_accesscontextmanager_v1_CustomLevel_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_identity_accesscontextmanager_v1_CustomLevel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_identity_accesscontextmanager_v1_CustomLevel_descriptor,
            new java.lang.String[] {
              "Expr",
            });
    internal_static_google_identity_accesscontextmanager_v1_DevicePolicy_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_identity_accesscontextmanager_v1_DevicePolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_identity_accesscontextmanager_v1_DevicePolicy_descriptor,
            new java.lang.String[] {
              "RequireScreenlock",
              "AllowedEncryptionStatuses",
              "OsConstraints",
              "AllowedDeviceManagementLevels",
              "RequireAdminApproval",
              "RequireCorpOwned",
            });
    internal_static_google_identity_accesscontextmanager_v1_OsConstraint_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_identity_accesscontextmanager_v1_OsConstraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_identity_accesscontextmanager_v1_OsConstraint_descriptor,
            new java.lang.String[] {
              "OsType", "MinimumVersion", "RequireVerifiedChromeOs",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.identity.accesscontextmanager.type.TypeProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.ExprProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
