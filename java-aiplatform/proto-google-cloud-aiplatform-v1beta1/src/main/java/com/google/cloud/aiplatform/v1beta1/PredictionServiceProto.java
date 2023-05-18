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
// source: google/cloud/aiplatform/v1beta1/prediction_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1beta1/predic"
          + "tion_service.proto\022\037google.cloud.aiplatf"
          + "orm.v1beta1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/httpbody"
          + ".proto\032\031google/api/resource.proto\0321googl"
          + "e/cloud/aiplatform/v1beta1/explanation.p"
          + "roto\032\034google/protobuf/struct.proto\"\252\001\n\016P"
          + "redictRequest\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n"
          + "\"aiplatform.googleapis.com/Endpoint\022.\n\ti"
          + "nstances\030\002 \003(\0132\026.google.protobuf.ValueB\003"
          + "\340A\002\022*\n\nparameters\030\003 \001(\0132\026.google.protobu"
          + "f.Value\"\321\001\n\017PredictResponse\022+\n\013predictio"
          + "ns\030\001 \003(\0132\026.google.protobuf.Value\022\031\n\021depl"
          + "oyed_model_id\030\002 \001(\t\0226\n\005model\030\003 \001(\tB\'\340A\003\372"
          + "A!\n\037aiplatform.googleapis.com/Model\022\035\n\020m"
          + "odel_version_id\030\005 \001(\tB\003\340A\003\022\037\n\022model_disp"
          + "lay_name\030\004 \001(\tB\003\340A\003\"z\n\021RawPredictRequest"
          + "\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform.g"
          + "oogleapis.com/Endpoint\022\'\n\thttp_body\030\002 \001("
          + "\0132\024.google.api.HttpBody\"\242\002\n\016ExplainReque"
          + "st\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform"
          + ".googleapis.com/Endpoint\022.\n\tinstances\030\002 "
          + "\003(\0132\026.google.protobuf.ValueB\003\340A\002\022*\n\npara"
          + "meters\030\004 \001(\0132\026.google.protobuf.Value\022[\n\031"
          + "explanation_spec_override\030\005 \001(\01328.google"
          + ".cloud.aiplatform.v1beta1.ExplanationSpe"
          + "cOverride\022\031\n\021deployed_model_id\030\003 \001(\t\"\235\001\n"
          + "\017ExplainResponse\022B\n\014explanations\030\001 \003(\0132,"
          + ".google.cloud.aiplatform.v1beta1.Explana"
          + "tion\022\031\n\021deployed_model_id\030\002 \001(\t\022+\n\013predi"
          + "ctions\030\003 \003(\0132\026.google.protobuf.Value2\211\007\n"
          + "\021PredictionService\022\250\002\n\007Predict\022/.google."
          + "cloud.aiplatform.v1beta1.PredictRequest\032"
          + "0.google.cloud.aiplatform.v1beta1.Predic"
          + "tResponse\"\271\001\202\323\344\223\002\222\001\">/v1beta1/{endpoint="
          + "projects/*/locations/*/endpoints/*}:pred"
          + "ict:\001*ZM\"H/v1beta1/{endpoint=projects/*/"
          + "locations/*/publishers/*/models/*}:predi"
          + "ct:\001*\332A\035endpoint,instances,parameters\022\215\002"
          + "\n\nRawPredict\0222.google.cloud.aiplatform.v"
          + "1beta1.RawPredictRequest\032\024.google.api.Ht"
          + "tpBody\"\264\001\202\323\344\223\002\230\001\"A/v1beta1/{endpoint=pro"
          + "jects/*/locations/*/endpoints/*}:rawPred"
          + "ict:\001*ZP\"K/v1beta1/{endpoint=projects/*/"
          + "locations/*/publishers/*/models/*}:rawPr"
          + "edict:\001*\332A\022endpoint,http_body\022\351\001\n\007Explai"
          + "n\022/.google.cloud.aiplatform.v1beta1.Expl"
          + "ainRequest\0320.google.cloud.aiplatform.v1b"
          + "eta1.ExplainResponse\"{\202\323\344\223\002C\">/v1beta1/{"
          + "endpoint=projects/*/locations/*/endpoint"
          + "s/*}:explain:\001*\332A/endpoint,instances,par"
          + "ameters,deployed_model_id\032M\312A\031aiplatform"
          + ".googleapis.com\322A.https://www.googleapis"
          + ".com/auth/cloud-platformB\355\001\n#com.google."
          + "cloud.aiplatform.v1beta1B\026PredictionServ"
          + "iceProtoP\001ZCcloud.google.com/go/aiplatfo"
          + "rm/apiv1beta1/aiplatformpb;aiplatformpb\252"
          + "\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Goog"
          + "le\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cl"
          + "oud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.HttpBodyProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "Instances", "Parameters",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor,
            new java.lang.String[] {
              "Predictions", "DeployedModelId", "Model", "ModelVersionId", "ModelDisplayName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "HttpBody",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "Instances", "Parameters", "ExplanationSpecOverride", "DeployedModelId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor,
            new java.lang.String[] {
              "Explanations", "DeployedModelId", "Predictions",
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
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
