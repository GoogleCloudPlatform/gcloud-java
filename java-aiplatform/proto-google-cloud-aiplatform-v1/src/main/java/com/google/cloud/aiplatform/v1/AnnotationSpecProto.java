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
// source: google/cloud/aiplatform/v1/annotation_spec.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class AnnotationSpecProto {
  private AnnotationSpecProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_AnnotationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_AnnotationSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1/annotation_"
          + "spec.proto\022\032google.cloud.aiplatform.v1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032\037google/protobuf/time"
          + "stamp.proto\"\321\002\n\016AnnotationSpec\022\022\n\004name\030\001"
          + " \001(\tB\004\342A\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\0225"
          + "\n\013create_time\030\003 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\004\342A\001\003\0225\n\013update_time\030\004 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\004\342A\001\003\022\022\n\004etag\030\005 \001"
          + "(\tB\004\342A\001\001:\214\001\352A\210\001\n(aiplatform.googleapis.c"
          + "om/AnnotationSpec\022\\projects/{project}/lo"
          + "cations/{location}/datasets/{dataset}/an"
          + "notationSpecs/{annotation_spec}B\321\001\n\036com."
          + "google.cloud.aiplatform.v1B\023AnnotationSp"
          + "ecProtoP\001Z>cloud.google.com/go/aiplatfor"
          + "m/apiv1/aiplatformpb;aiplatformpb\252\002\032Goog"
          + "le.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AI"
          + "Platform\\V1\352\002\035Google::Cloud::AIPlatform:"
          + ":V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_AnnotationSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_AnnotationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_AnnotationSpec_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "CreateTime", "UpdateTime", "Etag",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
