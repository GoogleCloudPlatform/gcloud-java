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
// source: google/appengine/v1/deploy.proto

// Protobuf Java Version: 3.25.3
package com.google.appengine.v1;

public final class DeployProto {
  private DeployProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Deployment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Deployment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Deployment_FilesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Deployment_FilesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_FileInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_FileInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_ContainerInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ContainerInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_CloudBuildOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_CloudBuildOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_ZipInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ZipInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/appengine/v1/deploy.proto\022\023goog"
          + "le.appengine.v1\032\036google/protobuf/duratio"
          + "n.proto\"\273\002\n\nDeployment\0229\n\005files\030\001 \003(\0132*."
          + "google.appengine.v1.Deployment.FilesEntr"
          + "y\0225\n\tcontainer\030\002 \001(\0132\".google.appengine."
          + "v1.ContainerInfo\022)\n\003zip\030\003 \001(\0132\034.google.a"
          + "ppengine.v1.ZipInfo\022C\n\023cloud_build_optio"
          + "ns\030\006 \001(\0132&.google.appengine.v1.CloudBuil"
          + "dOptions\032K\n\nFilesEntry\022\013\n\003key\030\001 \001(\t\022,\n\005v"
          + "alue\030\002 \001(\0132\035.google.appengine.v1.FileInf"
          + "o:\0028\001\"C\n\010FileInfo\022\022\n\nsource_url\030\001 \001(\t\022\020\n"
          + "\010sha1_sum\030\002 \001(\t\022\021\n\tmime_type\030\003 \001(\t\"\036\n\rCo"
          + "ntainerInfo\022\r\n\005image\030\001 \001(\t\"b\n\021CloudBuild"
          + "Options\022\025\n\rapp_yaml_path\030\001 \001(\t\0226\n\023cloud_"
          + "build_timeout\030\002 \001(\0132\031.google.protobuf.Du"
          + "ration\"2\n\007ZipInfo\022\022\n\nsource_url\030\003 \001(\t\022\023\n"
          + "\013files_count\030\004 \001(\005B\274\001\n\027com.google.appeng"
          + "ine.v1B\013DeployProtoP\001Z;cloud.google.com/"
          + "go/appengine/apiv1/appenginepb;appengine"
          + "pb\252\002\031Google.Cloud.AppEngine.V1\312\002\031Google\\"
          + "Cloud\\AppEngine\\V1\352\002\034Google::Cloud::AppE"
          + "ngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_appengine_v1_Deployment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_Deployment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Deployment_descriptor,
            new java.lang.String[] {
              "Files", "Container", "Zip", "CloudBuildOptions",
            });
    internal_static_google_appengine_v1_Deployment_FilesEntry_descriptor =
        internal_static_google_appengine_v1_Deployment_descriptor.getNestedTypes().get(0);
    internal_static_google_appengine_v1_Deployment_FilesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Deployment_FilesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_appengine_v1_FileInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1_FileInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_FileInfo_descriptor,
            new java.lang.String[] {
              "SourceUrl", "Sha1Sum", "MimeType",
            });
    internal_static_google_appengine_v1_ContainerInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_appengine_v1_ContainerInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_ContainerInfo_descriptor,
            new java.lang.String[] {
              "Image",
            });
    internal_static_google_appengine_v1_CloudBuildOptions_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_appengine_v1_CloudBuildOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_CloudBuildOptions_descriptor,
            new java.lang.String[] {
              "AppYamlPath", "CloudBuildTimeout",
            });
    internal_static_google_appengine_v1_ZipInfo_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_appengine_v1_ZipInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_ZipInfo_descriptor,
            new java.lang.String[] {
              "SourceUrl", "FilesCount",
            });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
