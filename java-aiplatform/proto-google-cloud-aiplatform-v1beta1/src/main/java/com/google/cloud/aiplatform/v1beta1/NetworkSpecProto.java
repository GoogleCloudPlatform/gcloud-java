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
// source: google/cloud/aiplatform/v1beta1/network_spec.proto

package com.google.cloud.aiplatform.v1beta1;

public final class NetworkSpecProto {
  private NetworkSpecProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NetworkSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NetworkSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1beta1/networ"
          + "k_spec.proto\022\037google.cloud.aiplatform.v1"
          + "beta1\032\031google/api/resource.proto\"\237\001\n\013Net"
          + "workSpec\022\036\n\026enable_internet_access\030\001 \001(\010"
          + "\0224\n\007network\030\002 \001(\tB#\372A \n\036compute.googleap"
          + "is.com/Network\022:\n\nsubnetwork\030\003 \001(\tB&\372A#\n"
          + "!compute.googleapis.com/SubnetworkB\313\002\n#c"
          + "om.google.cloud.aiplatform.v1beta1B\020Netw"
          + "orkSpecProtoP\001ZCcloud.google.com/go/aipl"
          + "atform/apiv1beta1/aiplatformpb;aiplatfor"
          + "mpb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037"
          + "Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Google"
          + "::Cloud::AIPlatform::V1beta1\352Aa\n!compute"
          + ".googleapis.com/Subnetwork\022<projects/{pr"
          + "oject}/regions/{region}/subnetworks/{sub"
          + "network}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_NetworkSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_NetworkSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NetworkSpec_descriptor,
            new java.lang.String[] {
              "EnableInternetAccess", "Network", "Subnetwork",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
