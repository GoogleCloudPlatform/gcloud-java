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
// source: google/cloud/aiplatform/v1/service_networking.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class ServiceNetworkingProto {
  private ServiceNetworkingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PrivateServiceConnectConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PrivateServiceConnectConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/aiplatform/v1/service_net"
          + "working.proto\022\032google.cloud.aiplatform.v"
          + "1\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\"f\n\033PrivateServiceC"
          + "onnectConfig\022,\n\036enable_private_service_c"
          + "onnect\030\001 \001(\010B\004\342A\001\002\022\031\n\021project_allowlist\030"
          + "\002 \003(\tB\324\001\n\036com.google.cloud.aiplatform.v1"
          + "B\026ServiceNetworkingProtoP\001Z>cloud.google"
          + ".com/go/aiplatform/apiv1/aiplatformpb;ai"
          + "platformpb\252\002\032Google.Cloud.AIPlatform.V1\312"
          + "\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::C"
          + "loud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_PrivateServiceConnectConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PrivateServiceConnectConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PrivateServiceConnectConfig_descriptor,
            new java.lang.String[] {
              "EnablePrivateServiceConnect", "ProjectAllowlist",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
