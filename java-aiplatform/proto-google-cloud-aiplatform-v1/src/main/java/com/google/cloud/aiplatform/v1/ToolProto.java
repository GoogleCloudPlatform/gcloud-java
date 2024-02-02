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
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class ToolProto {
  private ToolProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Tool_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Tool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionCall_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/aiplatform/v1/tool.proto\022"
          + "\032google.cloud.aiplatform.v1\032\037google/api/"
          + "field_behavior.proto\032(google/cloud/aipla"
          + "tform/v1/openapi.proto\032\034google/protobuf/"
          + "struct.proto\"\\\n\004Tool\022T\n\025function_declara"
          + "tions\030\001 \003(\0132/.google.cloud.aiplatform.v1"
          + ".FunctionDeclarationB\004\342A\001\001\"\202\001\n\023FunctionD"
          + "eclaration\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\022\031\n\013descri"
          + "ption\030\002 \001(\tB\004\342A\001\001\022<\n\nparameters\030\003 \001(\0132\"."
          + "google.cloud.aiplatform.v1.SchemaB\004\342A\001\001\""
          + "O\n\014FunctionCall\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\022+\n\004a"
          + "rgs\030\002 \001(\0132\027.google.protobuf.StructB\004\342A\001\001"
          + "\"W\n\020FunctionResponse\022\022\n\004name\030\001 \001(\tB\004\342A\001\002"
          + "\022/\n\010response\030\002 \001(\0132\027.google.protobuf.Str"
          + "uctB\004\342A\001\002B\307\001\n\036com.google.cloud.aiplatfor"
          + "m.v1B\tToolProtoP\001Z>cloud.google.com/go/a"
          + "iplatform/apiv1/aiplatformpb;aiplatformp"
          + "b\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\"
          + "Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIP"
          + "latform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OpenApiProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Tool_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Tool_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Tool_descriptor,
            new java.lang.String[] {
              "FunctionDeclarations",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_descriptor,
            new java.lang.String[] {
              "Name", "Description", "Parameters",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_FunctionCall_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor,
            new java.lang.String[] {
              "Name", "Args",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_FunctionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionResponse_descriptor,
            new java.lang.String[] {
              "Name", "Response",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OpenApiProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
