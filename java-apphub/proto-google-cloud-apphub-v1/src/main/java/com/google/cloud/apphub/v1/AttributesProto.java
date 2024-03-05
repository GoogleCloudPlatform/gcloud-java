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
// source: google/cloud/apphub/v1/attributes.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.apphub.v1;

public final class AttributesProto {
  private AttributesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apphub_v1_Attributes_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apphub_v1_Attributes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apphub_v1_Criticality_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apphub_v1_Criticality_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apphub_v1_Environment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apphub_v1_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apphub_v1_ContactInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apphub_v1_ContactInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/apphub/v1/attributes.prot"
          + "o\022\026google.cloud.apphub.v1\032\037google/api/fi"
          + "eld_behavior.proto\"\324\002\n\nAttributes\022=\n\013cri"
          + "ticality\030\001 \001(\0132#.google.cloud.apphub.v1."
          + "CriticalityB\003\340A\001\022=\n\013environment\030\002 \001(\0132#."
          + "google.cloud.apphub.v1.EnvironmentB\003\340A\001\022"
          + "B\n\020developer_owners\030\003 \003(\0132#.google.cloud"
          + ".apphub.v1.ContactInfoB\003\340A\001\022A\n\017operator_"
          + "owners\030\004 \003(\0132#.google.cloud.apphub.v1.Co"
          + "ntactInfoB\003\340A\001\022A\n\017business_owners\030\005 \003(\0132"
          + "#.google.cloud.apphub.v1.ContactInfoB\003\340A"
          + "\001\"\235\001\n\013Criticality\022;\n\004type\030\003 \001(\0162(.google"
          + ".cloud.apphub.v1.Criticality.TypeB\003\340A\002\"Q"
          + "\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\024\n\020MISSION_"
          + "CRITICAL\020\001\022\010\n\004HIGH\020\002\022\n\n\006MEDIUM\020\003\022\007\n\003LOW\020"
          + "\004\"\240\001\n\013Environment\022;\n\004type\030\002 \001(\0162(.google"
          + ".cloud.apphub.v1.Environment.TypeB\003\340A\002\"T"
          + "\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\016\n\nPRODUCTI"
          + "ON\020\001\022\013\n\007STAGING\020\002\022\010\n\004TEST\020\003\022\017\n\013DEVELOPME"
          + "NT\020\004\"<\n\013ContactInfo\022\031\n\014display_name\030\001 \001("
          + "\tB\003\340A\001\022\022\n\005email\030\002 \001(\tB\003\340A\002B\261\001\n\032com.googl"
          + "e.cloud.apphub.v1B\017AttributesProtoP\001Z2cl"
          + "oud.google.com/go/apphub/apiv1/apphubpb;"
          + "apphubpb\252\002\026Google.Cloud.AppHub.V1\312\002\026Goog"
          + "le\\Cloud\\AppHub\\V1\352\002\031Google::Cloud::AppH"
          + "ub::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_apphub_v1_Attributes_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_apphub_v1_Attributes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apphub_v1_Attributes_descriptor,
            new java.lang.String[] {
              "Criticality", "Environment", "DeveloperOwners", "OperatorOwners", "BusinessOwners",
            });
    internal_static_google_cloud_apphub_v1_Criticality_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_apphub_v1_Criticality_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apphub_v1_Criticality_descriptor,
            new java.lang.String[] {
              "Type",
            });
    internal_static_google_cloud_apphub_v1_Environment_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_apphub_v1_Environment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apphub_v1_Environment_descriptor,
            new java.lang.String[] {
              "Type",
            });
    internal_static_google_cloud_apphub_v1_ContactInfo_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_apphub_v1_ContactInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apphub_v1_ContactInfo_descriptor,
            new java.lang.String[] {
              "DisplayName", "Email",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
