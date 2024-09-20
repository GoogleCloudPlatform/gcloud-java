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
// source: google/cloud/aiplatform/v1beta1/model_monitor.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelMonitorProto {
  private ModelMonitorProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_VertexModelSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_VertexModelSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_FieldSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_FieldSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/aiplatform/v1beta1/model_"
          + "monitor.proto\022\037google.cloud.aiplatform.v"
          + "1beta1\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\0321google/cloud"
          + "/aiplatform/v1beta1/explanation.proto\032;g"
          + "oogle/cloud/aiplatform/v1beta1/model_mon"
          + "itoring_spec.proto\032\037google/protobuf/time"
          + "stamp.proto\"\322\t\n\014ModelMonitor\022k\n\021tabular_"
          + "objective\030\013 \001(\0132N.google.cloud.aiplatfor"
          + "m.v1beta1.ModelMonitoringObjectiveSpec.T"
          + "abularObjectiveH\000\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\024\n\014"
          + "display_name\030\002 \001(\t\022d\n\027model_monitoring_t"
          + "arget\030\003 \001(\0132C.google.cloud.aiplatform.v1"
          + "beta1.ModelMonitor.ModelMonitoringTarget"
          + "\022O\n\020training_dataset\030\n \001(\01325.google.clou"
          + "d.aiplatform.v1beta1.ModelMonitoringInpu"
          + "t\022[\n\021notification_spec\030\014 \001(\0132@.google.cl"
          + "oud.aiplatform.v1beta1.ModelMonitoringNo"
          + "tificationSpec\022O\n\013output_spec\030\r \001(\0132:.go"
          + "ogle.cloud.aiplatform.v1beta1.ModelMonit"
          + "oringOutputSpec\022J\n\020explanation_spec\030\020 \001("
          + "\01320.google.cloud.aiplatform.v1beta1.Expl"
          + "anationSpec\022W\n\027model_monitoring_schema\030\t"
          + " \001(\01326.google.cloud.aiplatform.v1beta1.M"
          + "odelMonitoringSchema\0224\n\013create_time\030\006 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013up"
          + "date_time\030\007 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022\032\n\rsatisfies_pzs\030\021 \001(\010B\003\340A\003\022\032\n\r"
          + "satisfies_pzi\030\022 \001(\010B\003\340A\003\032\364\001\n\025ModelMonito"
          + "ringTarget\022m\n\014vertex_model\030\001 \001(\0132U.googl"
          + "e.cloud.aiplatform.v1beta1.ModelMonitor."
          + "ModelMonitoringTarget.VertexModelSourceH"
          + "\000\032b\n\021VertexModelSource\0223\n\005model\030\001 \001(\tB$\372"
          + "A!\n\037aiplatform.googleapis.com/Model\022\030\n\020m"
          + "odel_version_id\030\002 \001(\tB\010\n\006source:r\352Ao\n&ai"
          + "platform.googleapis.com/ModelMonitor\022Epr"
          + "ojects/{project}/locations/{location}/mo"
          + "delMonitors/{model_monitor}B\023\n\021default_o"
          + "bjective\"\365\002\n\025ModelMonitoringSchema\022Z\n\016fe"
          + "ature_fields\030\001 \003(\0132B.google.cloud.aiplat"
          + "form.v1beta1.ModelMonitoringSchema.Field"
          + "Schema\022]\n\021prediction_fields\030\002 \003(\0132B.goog"
          + "le.cloud.aiplatform.v1beta1.ModelMonitor"
          + "ingSchema.FieldSchema\022_\n\023ground_truth_fi"
          + "elds\030\003 \003(\0132B.google.cloud.aiplatform.v1b"
          + "eta1.ModelMonitoringSchema.FieldSchema\032@"
          + "\n\013FieldSchema\022\014\n\004name\030\001 \001(\t\022\021\n\tdata_type"
          + "\030\002 \001(\t\022\020\n\010repeated\030\003 \001(\010B\350\001\n#com.google."
          + "cloud.aiplatform.v1beta1B\021ModelMonitorPr"
          + "otoP\001ZCcloud.google.com/go/aiplatform/ap"
          + "iv1beta1/aiplatformpb;aiplatformpb\252\002\037Goo"
          + "gle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cl"
          + "oud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::"
          + "AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelMonitoringSpecProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_descriptor,
            new java.lang.String[] {
              "TabularObjective",
              "Name",
              "DisplayName",
              "ModelMonitoringTarget",
              "TrainingDataset",
              "NotificationSpec",
              "OutputSpec",
              "ExplanationSpec",
              "ModelMonitoringSchema",
              "CreateTime",
              "UpdateTime",
              "SatisfiesPzs",
              "SatisfiesPzi",
              "DefaultObjective",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_descriptor,
            new java.lang.String[] {
              "VertexModel", "Source",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_VertexModelSource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_VertexModelSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitor_ModelMonitoringTarget_VertexModelSource_descriptor,
            new java.lang.String[] {
              "Model", "ModelVersionId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_descriptor,
            new java.lang.String[] {
              "FeatureFields", "PredictionFields", "GroundTruthFields",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_FieldSchema_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_FieldSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringSchema_FieldSchema_descriptor,
            new java.lang.String[] {
              "Name", "DataType", "Repeated",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelMonitoringSpecProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
