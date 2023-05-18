/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/model_garden_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelGardenServiceProto {
  private ModelGardenServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/aiplatform/v1beta1/model_"
          + "garden_service.proto\022\037google.cloud.aipla"
          + "tform.v1beta1\032\034google/api/annotations.pr"
          + "oto\032\027google/api/client.proto\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0325google/cloud/aiplatform/v1beta"
          + "1/publisher_model.proto\"\276\001\n\030GetPublisher"
          + "ModelRequest\022>\n\004name\030\001 \001(\tB0\340A\002\372A*\n(aipl"
          + "atform.googleapis.com/PublisherModel\022\032\n\r"
          + "language_code\030\002 \001(\tB\003\340A\001\022F\n\004view\030\003 \001(\01623"
          + ".google.cloud.aiplatform.v1beta1.Publish"
          + "erModelViewB\003\340A\001*\241\001\n\022PublisherModelView\022"
          + "$\n PUBLISHER_MODEL_VIEW_UNSPECIFIED\020\000\022\036\n"
          + "\032PUBLISHER_MODEL_VIEW_BASIC\020\001\022\035\n\031PUBLISH"
          + "ER_MODEL_VIEW_FULL\020\002\022&\n\"PUBLISHER_MODEL_"
          + "VERSION_VIEW_BASIC\020\0032\233\002\n\022ModelGardenServ"
          + "ice\022\265\001\n\021GetPublisherModel\0229.google.cloud"
          + ".aiplatform.v1beta1.GetPublisherModelReq"
          + "uest\032/.google.cloud.aiplatform.v1beta1.P"
          + "ublisherModel\"4\202\323\344\223\002\'\022%/v1beta1/{name=pu"
          + "blishers/*/models/*}\332A\004name\032M\312A\031aiplatfo"
          + "rm.googleapis.com\322A.https://www.googleap"
          + "is.com/auth/cloud-platformB\356\001\n#com.googl"
          + "e.cloud.aiplatform.v1beta1B\027ModelGardenS"
          + "erviceProtoP\001ZCcloud.google.com/go/aipla"
          + "tform/apiv1beta1/aiplatformpb;aiplatform"
          + "pb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037G"
          + "oogle\\Cloud\\AIPlatform\\V1beta1\352\002\"Google:"
          + ":Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.PublisherModelProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode", "View",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.PublisherModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
