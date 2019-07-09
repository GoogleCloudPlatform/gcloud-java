// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/dataset.proto

package com.google.cloud.automl.v1beta1;

public final class DatasetOuterClass {
  private DatasetOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_Dataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_Dataset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/automl/v1beta1/dataset.pr"
          + "oto\022\033google.cloud.automl.v1beta1\032\'google"
          + "/cloud/automl/v1beta1/image.proto\032(googl"
          + "e/cloud/automl/v1beta1/tables.proto\032&goo"
          + "gle/cloud/automl/v1beta1/text.proto\032-goo"
          + "gle/cloud/automl/v1beta1/translation.pro"
          + "to\032\'google/cloud/automl/v1beta1/video.pr"
          + "oto\032\037google/protobuf/timestamp.proto\032\034go"
          + "ogle/api/annotations.proto\"\356\010\n\007Dataset\022_"
          + "\n\034translation_dataset_metadata\030\027 \001(\01327.g"
          + "oogle.cloud.automl.v1beta1.TranslationDa"
          + "tasetMetadataH\000\022p\n%image_classification_"
          + "dataset_metadata\030\030 \001(\0132?.google.cloud.au"
          + "toml.v1beta1.ImageClassificationDatasetM"
          + "etadataH\000\022n\n$text_classification_dataset"
          + "_metadata\030\031 \001(\0132>.google.cloud.automl.v1"
          + "beta1.TextClassificationDatasetMetadataH"
          + "\000\022s\n\'image_object_detection_dataset_meta"
          + "data\030\032 \001(\0132@.google.cloud.automl.v1beta1"
          + ".ImageObjectDetectionDatasetMetadataH\000\022p"
          + "\n%video_classification_dataset_metadata\030"
          + "\037 \001(\0132?.google.cloud.automl.v1beta1.Vide"
          + "oClassificationDatasetMetadataH\000\022q\n&vide"
          + "o_object_tracking_dataset_metadata\030\035 \001(\013"
          + "2?.google.cloud.automl.v1beta1.VideoObje"
          + "ctTrackingDatasetMetadataH\000\022f\n text_extr"
          + "action_dataset_metadata\030\034 \001(\0132:.google.c"
          + "loud.automl.v1beta1.TextExtractionDatase"
          + "tMetadataH\000\022d\n\037text_sentiment_dataset_me"
          + "tadata\030\036 \001(\01329.google.cloud.automl.v1bet"
          + "a1.TextSentimentDatasetMetadataH\000\022U\n\027tab"
          + "les_dataset_metadata\030! \001(\01322.google.clou"
          + "d.automl.v1beta1.TablesDatasetMetadataH\000"
          + "\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013"
          + "description\030\003 \001(\t\022\025\n\rexample_count\030\025 \001(\005"
          + "\022/\n\013create_time\030\016 \001(\0132\032.google.protobuf."
          + "Timestamp\022\014\n\004etag\030\021 \001(\tB\022\n\020dataset_metad"
          + "ataB\245\001\n\037com.google.cloud.automl.v1beta1P"
          + "\001ZAgoogle.golang.org/genproto/googleapis"
          + "/cloud/automl/v1beta1;automl\312\002\033Google\\Cl"
          + "oud\\AutoMl\\V1beta1\352\002\036Google::Cloud::Auto"
          + "ML::V1beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.automl.v1beta1.ImageProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.Tables.getDescriptor(),
          com.google.cloud.automl.v1beta1.TextProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.VideoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1beta1_Dataset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_Dataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_Dataset_descriptor,
            new java.lang.String[] {
              "TranslationDatasetMetadata",
              "ImageClassificationDatasetMetadata",
              "TextClassificationDatasetMetadata",
              "ImageObjectDetectionDatasetMetadata",
              "VideoClassificationDatasetMetadata",
              "VideoObjectTrackingDatasetMetadata",
              "TextExtractionDatasetMetadata",
              "TextSentimentDatasetMetadata",
              "TablesDatasetMetadata",
              "Name",
              "DisplayName",
              "Description",
              "ExampleCount",
              "CreateTime",
              "Etag",
              "DatasetMetadata",
            });
    com.google.cloud.automl.v1beta1.ImageProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Tables.getDescriptor();
    com.google.cloud.automl.v1beta1.TextProto.getDescriptor();
    com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor();
    com.google.cloud.automl.v1beta1.VideoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
