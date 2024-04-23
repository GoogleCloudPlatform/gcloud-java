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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_object_detection.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLImageObjectDetectionProto {
  private AutoMLImageObjectDetectionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nagoogle/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/automl_image_obj"
          + "ect_detection.proto\022=google.cloud.aiplat"
          + "form.v1beta1.schema.trainingjob.definiti"
          + "on\"\202\002\n\032AutoMlImageObjectDetection\022o\n\006inp"
          + "uts\030\001 \001(\0132_.google.cloud.aiplatform.v1be"
          + "ta1.schema.trainingjob.definition.AutoMl"
          + "ImageObjectDetectionInputs\022s\n\010metadata\030\002"
          + " \001(\0132a.google.cloud.aiplatform.v1beta1.s"
          + "chema.trainingjob.definition.AutoMlImage"
          + "ObjectDetectionMetadata\"\227\003\n AutoMlImageO"
          + "bjectDetectionInputs\022}\n\nmodel_type\030\001 \001(\016"
          + "2i.google.cloud.aiplatform.v1beta1.schem"
          + "a.trainingjob.definition.AutoMlImageObje"
          + "ctDetectionInputs.ModelType\022\037\n\027budget_mi"
          + "lli_node_hours\030\002 \001(\003\022\036\n\026disable_early_st"
          + "opping\030\003 \001(\010\"\262\001\n\tModelType\022\032\n\026MODEL_TYPE"
          + "_UNSPECIFIED\020\000\022\031\n\025CLOUD_HIGH_ACCURACY_1\020"
          + "\001\022\027\n\023CLOUD_LOW_LATENCY_1\020\002\022\033\n\027MOBILE_TF_"
          + "LOW_LATENCY_1\020\003\022\031\n\025MOBILE_TF_VERSATILE_1"
          + "\020\004\022\035\n\031MOBILE_TF_HIGH_ACCURACY_1\020\005\"\305\002\n\"Au"
          + "toMlImageObjectDetectionMetadata\022\035\n\025cost"
          + "_milli_node_hours\030\001 \001(\003\022\226\001\n\026successful_s"
          + "top_reason\030\002 \001(\0162v.google.cloud.aiplatfo"
          + "rm.v1beta1.schema.trainingjob.definition"
          + ".AutoMlImageObjectDetectionMetadata.Succ"
          + "essfulStopReason\"g\n\024SuccessfulStopReason"
          + "\022&\n\"SUCCESSFUL_STOP_REASON_UNSPECIFIED\020\000"
          + "\022\022\n\016BUDGET_REACHED\020\001\022\023\n\017MODEL_CONVERGED\020"
          + "\002B\217\003\nAcom.google.cloud.aiplatform.v1beta"
          + "1.schema.trainingjob.definitionB\037AutoMLI"
          + "mageObjectDetectionProtoP\001Zacloud.google"
          + ".com/go/aiplatform/apiv1beta1/schema/tra"
          + "iningjob/definition/definitionpb;definit"
          + "ionpb\252\002=Google.Cloud.AIPlatform.V1Beta1."
          + "Schema.TrainingJob.Definition\312\002=Google\\C"
          + "loud\\AIPlatform\\V1beta1\\Schema\\TrainingJ"
          + "ob\\Definition\352\002CGoogle::Cloud::AIPlatfor"
          + "m::V1beta1::Schema::TrainingJob::Definit"
          + "ionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor,
            new java.lang.String[] {
              "Inputs", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor,
            new java.lang.String[] {
              "ModelType", "BudgetMilliNodeHours", "DisableEarlyStopping",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_descriptor,
            new java.lang.String[] {
              "CostMilliNodeHours", "SuccessfulStopReason",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
