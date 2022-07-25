// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/video_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class VideoClassificationPredictionResultProto {
  private VideoClassificationPredictionResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoClassificationPredictionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoClassificationPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nTgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/prediction/video_classification" +
      ".proto\0229google.cloud.aiplatform.v1beta1." +
      "schema.predict.prediction\032\036google/protob" +
      "uf/duration.proto\032\036google/protobuf/wrapp" +
      "ers.proto\032\034google/api/annotations.proto\"" +
      "\362\001\n#VideoClassificationPredictionResult\022" +
      "\n\n\002id\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\014\n\004typ" +
      "e\030\003 \001(\t\0225\n\022time_segment_start\030\004 \001(\0132\031.go" +
      "ogle.protobuf.Duration\0223\n\020time_segment_e" +
      "nd\030\005 \001(\0132\031.google.protobuf.Duration\022/\n\nc" +
      "onfidence\030\006 \001(\0132\033.google.protobuf.FloatV" +
      "alueB\212\003\n=com.google.cloud.aiplatform.v1b" +
      "eta1.schema.predict.predictionB(VideoCla" +
      "ssificationPredictionResultProtoP\001Zcgoog" +
      "le.golang.org/genproto/googleapis/cloud/" +
      "aiplatform/v1beta1/schema/predict/predic" +
      "tion;prediction\252\0029Google.Cloud.AIPlatfor" +
      "m.V1Beta1.Schema.Predict.Prediction\312\0029Go" +
      "ogle\\Cloud\\AIPlatform\\V1beta1\\Schema\\Pre" +
      "dict\\Prediction\352\002?Google::Cloud::AIPlatf" +
      "orm::V1beta1::Schema::Predict::Predictio" +
      "nb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoClassificationPredictionResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoClassificationPredictionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_VideoClassificationPredictionResult_descriptor,
        new java.lang.String[] { "Id", "DisplayName", "Type", "TimeSegmentStart", "TimeSegmentEnd", "Confidence", });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
