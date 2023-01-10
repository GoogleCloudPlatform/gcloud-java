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
// source: google/cloud/aiplatform/v1beta1/schema/predict/params/video_object_tracking.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.params;

public final class VideoObjectTrackingPredictionParamsProto {
  private VideoObjectTrackingPredictionParamsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoObjectTrackingPredictionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoObjectTrackingPredictionParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nQgoogle/cloud/aiplatform/v1beta1/schema"
          + "/predict/params/video_object_tracking.pr"
          + "oto\0225google.cloud.aiplatform.v1beta1.sch"
          + "ema.predict.params\"{\n#VideoObjectTrackin"
          + "gPredictionParams\022\034\n\024confidence_threshol"
          + "d\030\001 \001(\002\022\027\n\017max_predictions\030\002 \001(\005\022\035\n\025min_"
          + "bounding_box_size\030\003 \001(\002B\362\002\n9com.google.c"
          + "loud.aiplatform.v1beta1.schema.predict.p"
          + "aramsB(VideoObjectTrackingPredictionPara"
          + "msProtoP\001Z[google.golang.org/genproto/go"
          + "ogleapis/cloud/aiplatform/v1beta1/schema"
          + "/predict/params;params\252\0025Google.Cloud.AI"
          + "Platform.V1Beta1.Schema.Predict.Params\312\002"
          + "5Google\\Cloud\\AIPlatform\\V1beta1\\Schema\\"
          + "Predict\\Params\352\002;Google::Cloud::AIPlatfo"
          + "rm::V1beta1::Schema::Predict::Paramsb\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoObjectTrackingPredictionParams_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoObjectTrackingPredictionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoObjectTrackingPredictionParams_descriptor,
            new java.lang.String[] {
              "ConfidenceThreshold", "MaxPredictions", "MinBoundingBoxSize",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
