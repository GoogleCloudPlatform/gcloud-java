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
// source: google/cloud/aiplatform/v1/accelerator_type.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class AcceleratorTypeProto {
  private AcceleratorTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/accelerator"
          + "_type.proto\022\032google.cloud.aiplatform.v1*"
          + "\233\002\n\017AcceleratorType\022 \n\034ACCELERATOR_TYPE_"
          + "UNSPECIFIED\020\000\022\024\n\020NVIDIA_TESLA_K80\020\001\022\025\n\021N"
          + "VIDIA_TESLA_P100\020\002\022\025\n\021NVIDIA_TESLA_V100\020"
          + "\003\022\023\n\017NVIDIA_TESLA_P4\020\004\022\023\n\017NVIDIA_TESLA_T"
          + "4\020\005\022\025\n\021NVIDIA_TESLA_A100\020\010\022\024\n\020NVIDIA_A10"
          + "0_80GB\020\t\022\r\n\tNVIDIA_L4\020\013\022\024\n\020NVIDIA_H100_8"
          + "0GB\020\r\022\n\n\006TPU_V2\020\006\022\n\n\006TPU_V3\020\007\022\016\n\nTPU_V4_"
          + "POD\020\nB\322\001\n\036com.google.cloud.aiplatform.v1"
          + "B\024AcceleratorTypeProtoP\001Z>cloud.google.c"
          + "om/go/aiplatform/apiv1/aiplatformpb;aipl"
          + "atformpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032"
          + "Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Clo"
          + "ud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
