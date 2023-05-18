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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/export_evaluated_data_items_config.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class ExportEvaluatedDataItemsConfigProto {
  private ExportEvaluatedDataItemsConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_ExportEvaluatedDataItemsConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_ExportEvaluatedDataItemsConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nfgoogle/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/export_evaluated"
          + "_data_items_config.proto\022=google.cloud.a"
          + "iplatform.v1beta1.schema.trainingjob.def"
          + "inition\"c\n\036ExportEvaluatedDataItemsConfi"
          + "g\022 \n\030destination_bigquery_uri\030\001 \001(\t\022\037\n\027o"
          + "verride_existing_table\030\002 \001(\010B\223\003\nAcom.goo"
          + "gle.cloud.aiplatform.v1beta1.schema.trai"
          + "ningjob.definitionB#ExportEvaluatedDataI"
          + "temsConfigProtoP\001Zacloud.google.com/go/a"
          + "iplatform/apiv1beta1/schema/trainingjob/"
          + "definition/definitionpb;definitionpb\252\002=G"
          + "oogle.Cloud.AIPlatform.V1Beta1.Schema.Tr"
          + "ainingJob.Definition\312\002=Google\\Cloud\\AIPl"
          + "atform\\V1beta1\\Schema\\TrainingJob\\Defini"
          + "tion\352\002CGoogle::Cloud::AIPlatform::V1beta"
          + "1::Schema::TrainingJob::Definitionb\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_ExportEvaluatedDataItemsConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_ExportEvaluatedDataItemsConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_ExportEvaluatedDataItemsConfig_descriptor,
            new java.lang.String[] {
              "DestinationBigqueryUri", "OverrideExistingTable",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
