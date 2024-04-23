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
// source: google/cloud/aiplatform/v1/evaluated_annotation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class EvaluatedAnnotationProto {
  private EvaluatedAnnotationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_EvaluatedAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_EvaluatedAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_EvaluatedAnnotationExplanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_EvaluatedAnnotationExplanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_AttributedItem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_AttributedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1/evaluated_a"
          + "nnotation.proto\022\032google.cloud.aiplatform"
          + ".v1\032\037google/api/field_behavior.proto\032,go"
          + "ogle/cloud/aiplatform/v1/explanation.pro"
          + "to\032\034google/protobuf/struct.proto\"\345\004\n\023Eva"
          + "luatedAnnotation\022Z\n\004type\030\001 \001(\0162G.google."
          + "cloud.aiplatform.v1.EvaluatedAnnotation."
          + "EvaluatedAnnotationTypeB\003\340A\003\0220\n\013predicti"
          + "ons\030\002 \003(\0132\026.google.protobuf.ValueB\003\340A\003\0222"
          + "\n\rground_truths\030\003 \003(\0132\026.google.protobuf."
          + "ValueB\003\340A\003\0226\n\021data_item_payload\030\005 \001(\0132\026."
          + "google.protobuf.ValueB\003\340A\003\022(\n\033evaluated_"
          + "data_item_view_id\030\006 \001(\tB\003\340A\003\022P\n\014explanat"
          + "ions\030\010 \003(\0132:.google.cloud.aiplatform.v1."
          + "EvaluatedAnnotationExplanation\022W\n\032error_"
          + "analysis_annotations\030\t \003(\01323.google.clou"
          + "d.aiplatform.v1.ErrorAnalysisAnnotation\""
          + "\177\n\027EvaluatedAnnotationType\022)\n%EVALUATED_"
          + "ANNOTATION_TYPE_UNSPECIFIED\020\000\022\021\n\rTRUE_PO"
          + "SITIVE\020\001\022\022\n\016FALSE_POSITIVE\020\002\022\022\n\016FALSE_NE"
          + "GATIVE\020\003\"x\n\036EvaluatedAnnotationExplanati"
          + "on\022\030\n\020explanation_type\030\001 \001(\t\022<\n\013explanat"
          + "ion\030\002 \001(\0132\'.google.cloud.aiplatform.v1.E"
          + "xplanation\"\257\003\n\027ErrorAnalysisAnnotation\022\\"
          + "\n\020attributed_items\030\001 \003(\0132B.google.cloud."
          + "aiplatform.v1.ErrorAnalysisAnnotation.At"
          + "tributedItem\022Q\n\nquery_type\030\002 \001(\0162=.googl"
          + "e.cloud.aiplatform.v1.ErrorAnalysisAnnot"
          + "ation.QueryType\022\025\n\routlier_score\030\003 \001(\001\022\031"
          + "\n\021outlier_threshold\030\004 \001(\001\032D\n\016AttributedI"
          + "tem\022 \n\030annotation_resource_name\030\001 \001(\t\022\020\n"
          + "\010distance\030\002 \001(\001\"k\n\tQueryType\022\032\n\026QUERY_TY"
          + "PE_UNSPECIFIED\020\000\022\017\n\013ALL_SIMILAR\020\001\022\026\n\022SAM"
          + "E_CLASS_SIMILAR\020\002\022\031\n\025SAME_CLASS_DISSIMIL"
          + "AR\020\003B\326\001\n\036com.google.cloud.aiplatform.v1B"
          + "\030EvaluatedAnnotationProtoP\001Z>cloud.googl"
          + "e.com/go/aiplatform/apiv1/aiplatformpb;a"
          + "iplatformpb\252\002\032Google.Cloud.AIPlatform.V1"
          + "\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::"
          + "Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_EvaluatedAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_EvaluatedAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_EvaluatedAnnotation_descriptor,
            new java.lang.String[] {
              "Type",
              "Predictions",
              "GroundTruths",
              "DataItemPayload",
              "EvaluatedDataItemViewId",
              "Explanations",
              "ErrorAnalysisAnnotations",
            });
    internal_static_google_cloud_aiplatform_v1_EvaluatedAnnotationExplanation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_EvaluatedAnnotationExplanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_EvaluatedAnnotationExplanation_descriptor,
            new java.lang.String[] {
              "ExplanationType", "Explanation",
            });
    internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_descriptor,
            new java.lang.String[] {
              "AttributedItems", "QueryType", "OutlierScore", "OutlierThreshold",
            });
    internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_AttributedItem_descriptor =
        internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_AttributedItem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ErrorAnalysisAnnotation_AttributedItem_descriptor,
            new java.lang.String[] {
              "AnnotationResourceName", "Distance",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
