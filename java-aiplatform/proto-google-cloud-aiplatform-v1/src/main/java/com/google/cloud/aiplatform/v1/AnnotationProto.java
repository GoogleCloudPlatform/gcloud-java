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
// source: google/cloud/aiplatform/v1/annotation.proto

package com.google.cloud.aiplatform.v1;

public final class AnnotationProto {
  private AnnotationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Annotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Annotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Annotation_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Annotation_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1/annotation."
          + "proto\022\032google.cloud.aiplatform.v1\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\0326google/cloud/aiplatform/v"
          + "1/user_action_reference.proto\032\034google/pr"
          + "otobuf/struct.proto\032\037google/protobuf/tim"
          + "estamp.proto\"\316\004\n\nAnnotation\022\021\n\004name\030\001 \001("
          + "\tB\003\340A\003\022\037\n\022payload_schema_uri\030\002 \001(\tB\003\340A\002\022"
          + ",\n\007payload\030\003 \001(\0132\026.google.protobuf.Value"
          + "B\003\340A\002\0224\n\013create_time\030\004 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\0224\n\013update_time\030\007 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\022\021\n\004eta"
          + "g\030\010 \001(\tB\003\340A\001\022O\n\021annotation_source\030\005 \001(\0132"
          + "/.google.cloud.aiplatform.v1.UserActionR"
          + "eferenceB\003\340A\003\022G\n\006labels\030\006 \003(\01322.google.c"
          + "loud.aiplatform.v1.Annotation.LabelsEntr"
          + "yB\003\340A\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001:\225\001\352A\221\001\n$aiplatform.googlea"
          + "pis.com/Annotation\022iprojects/{project}/l"
          + "ocations/{location}/datasets/{dataset}/d"
          + "ataItems/{data_item}/annotations/{annota"
          + "tion}B\315\001\n\036com.google.cloud.aiplatform.v1"
          + "B\017AnnotationProtoP\001Z>cloud.google.com/go"
          + "/aiplatform/apiv1/aiplatformpb;aiplatfor"
          + "mpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Googl"
          + "e\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::A"
          + "IPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.UserActionReferenceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Annotation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Annotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Annotation_descriptor,
            new java.lang.String[] {
              "Name",
              "PayloadSchemaUri",
              "Payload",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "AnnotationSource",
              "Labels",
            });
    internal_static_google_cloud_aiplatform_v1_Annotation_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Annotation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Annotation_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Annotation_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.UserActionReferenceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
