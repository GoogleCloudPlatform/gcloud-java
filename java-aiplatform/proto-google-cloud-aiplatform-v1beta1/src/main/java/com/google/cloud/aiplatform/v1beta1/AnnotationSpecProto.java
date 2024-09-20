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
// source: google/cloud/aiplatform/v1beta1/annotation_spec.proto

package com.google.cloud.aiplatform.v1beta1;

public final class AnnotationSpecProto {
  private AnnotationSpecProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_AnnotationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_AnnotationSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1beta1/annota"
          + "tion_spec.proto\022\037google.cloud.aiplatform"
          + ".v1beta1\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032\037google/pro"
          + "tobuf/timestamp.proto\"\314\002\n\016AnnotationSpec"
          + "\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001("
          + "\tB\003\340A\002\0224\n\013create_time\030\003 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\0224\n\013update_time\030\004 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\022\021\n\004et"
          + "ag\030\005 \001(\tB\003\340A\001:\214\001\352A\210\001\n(aiplatform.googlea"
          + "pis.com/AnnotationSpec\022\\projects/{projec"
          + "t}/locations/{location}/datasets/{datase"
          + "t}/annotationSpecs/{annotation_spec}B\352\001\n"
          + "#com.google.cloud.aiplatform.v1beta1B\023An"
          + "notationSpecProtoP\001ZCcloud.google.com/go"
          + "/aiplatform/apiv1beta1/aiplatformpb;aipl"
          + "atformpb\252\002\037Google.Cloud.AIPlatform.V1Bet"
          + "a1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"G"
          + "oogle::Cloud::AIPlatform::V1beta1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_AnnotationSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_AnnotationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_AnnotationSpec_descriptor,
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
