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
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_text_sentiment.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLTextSentimentProto {
  private AutoMLTextSentimentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextSentiment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextSentiment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextSentimentInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextSentimentInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nYgoogle/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/automl_text_sent"
          + "iment.proto\022=google.cloud.aiplatform.v1b"
          + "eta1.schema.trainingjob.definition\"\177\n\023Au"
          + "toMlTextSentiment\022h\n\006inputs\030\001 \001(\0132X.goog"
          + "le.cloud.aiplatform.v1beta1.schema.train"
          + "ingjob.definition.AutoMlTextSentimentInp"
          + "uts\"2\n\031AutoMlTextSentimentInputs\022\025\n\rsent"
          + "iment_max\030\001 \001(\005B\210\003\nAcom.google.cloud.aip"
          + "latform.v1beta1.schema.trainingjob.defin"
          + "itionB\030AutoMLTextSentimentProtoP\001Zacloud"
          + ".google.com/go/aiplatform/apiv1beta1/sch"
          + "ema/trainingjob/definition/definitionpb;"
          + "definitionpb\252\002=Google.Cloud.AIPlatform.V"
          + "1Beta1.Schema.TrainingJob.Definition\312\002=G"
          + "oogle\\Cloud\\AIPlatform\\V1beta1\\Schema\\Tr"
          + "ainingJob\\Definition\352\002CGoogle::Cloud::AI"
          + "Platform::V1beta1::Schema::TrainingJob::"
          + "Definitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextSentiment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextSentiment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextSentiment_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextSentimentInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextSentimentInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextSentimentInputs_descriptor,
            new java.lang.String[] {
              "SentimentMax",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
