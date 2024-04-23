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
// source: google/cloud/securitycenter/v1/database.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1;

public final class DatabaseProto {
  private DatabaseProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Database_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Database_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/securitycenter/v1/databas"
          + "e.proto\022\036google.cloud.securitycenter.v1\""
          + "s\n\010Database\022\014\n\004name\030\001 \001(\t\022\024\n\014display_nam"
          + "e\030\002 \001(\t\022\021\n\tuser_name\030\003 \001(\t\022\r\n\005query\030\004 \001("
          + "\t\022\020\n\010grantees\030\005 \003(\t\022\017\n\007version\030\006 \001(\tB\347\001\n"
          + "\"com.google.cloud.securitycenter.v1B\rDat"
          + "abaseProtoP\001ZJcloud.google.com/go/securi"
          + "tycenter/apiv1/securitycenterpb;security"
          + "centerpb\252\002\036Google.Cloud.SecurityCenter.V"
          + "1\312\002\036Google\\Cloud\\SecurityCenter\\V1\352\002!Goo"
          + "gle::Cloud::SecurityCenter::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_v1_Database_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Database_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Database_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "UserName", "Query", "Grantees", "Version",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
