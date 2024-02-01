// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/migratable_resource.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class MigratableResourceProto {
  private MigratableResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_MlEngineModelVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_MlEngineModelVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/aiplatform/v1beta1/migrat" +
      "able_resource.proto\022\037google.cloud.aiplat" +
      "form.v1beta1\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\032\037google" +
      "/protobuf/timestamp.proto\"\362\t\n\022Migratable" +
      "Resource\022q\n\027ml_engine_model_version\030\001 \001(" +
      "\0132H.google.cloud.aiplatform.v1beta1.Migr" +
      "atableResource.MlEngineModelVersionB\004\342A\001" +
      "\003H\000\022]\n\014automl_model\030\002 \001(\0132?.google.cloud" +
      ".aiplatform.v1beta1.MigratableResource.A" +
      "utomlModelB\004\342A\001\003H\000\022a\n\016automl_dataset\030\003 \001" +
      "(\0132A.google.cloud.aiplatform.v1beta1.Mig" +
      "ratableResource.AutomlDatasetB\004\342A\001\003H\000\022n\n" +
      "\025data_labeling_dataset\030\004 \001(\0132G.google.cl" +
      "oud.aiplatform.v1beta1.MigratableResourc" +
      "e.DataLabelingDatasetB\004\342A\001\003H\000\022;\n\021last_mi" +
      "grate_time\030\005 \001(\0132\032.google.protobuf.Times" +
      "tampB\004\342A\001\003\022:\n\020last_update_time\030\006 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\004\342A\001\003\032Y\n\024MlEngi" +
      "neModelVersion\022\020\n\010endpoint\030\001 \001(\t\022/\n\007vers" +
      "ion\030\002 \001(\tB\036\372A\033\n\031ml.googleapis.com/Versio" +
      "n\032Z\n\013AutomlModel\022/\n\005model\030\001 \001(\tB \372A\035\n\033au" +
      "toml.googleapis.com/Model\022\032\n\022model_displ" +
      "ay_name\030\003 \001(\t\032b\n\rAutomlDataset\0223\n\007datase" +
      "t\030\001 \001(\tB\"\372A\037\n\035automl.googleapis.com/Data" +
      "set\022\034\n\024dataset_display_name\030\004 \001(\t\032\226\003\n\023Da" +
      "taLabelingDataset\0229\n\007dataset\030\001 \001(\tB(\372A%\n" +
      "#datalabeling.googleapis.com/Dataset\022\034\n\024" +
      "dataset_display_name\030\004 \001(\t\022\216\001\n data_labe" +
      "ling_annotated_datasets\030\003 \003(\0132d.google.c" +
      "loud.aiplatform.v1beta1.MigratableResour" +
      "ce.DataLabelingDataset.DataLabelingAnnot" +
      "atedDataset\032\224\001\n\034DataLabelingAnnotatedDat" +
      "aset\022L\n\021annotated_dataset\030\001 \001(\tB1\372A.\n,da" +
      "talabeling.googleapis.com/AnnotatedDatas" +
      "et\022&\n\036annotated_dataset_display_name\030\003 \001" +
      "(\tB\n\n\010resourceB\305\005\n#com.google.cloud.aipl" +
      "atform.v1beta1B\027MigratableResourceProtoP" +
      "\001ZCcloud.google.com/go/aiplatform/apiv1b" +
      "eta1/aiplatformpb;aiplatformpb\252\002\037Google." +
      "Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\" +
      "AIPlatform\\V1beta1\352\002\"Google::Cloud::AIPl" +
      "atform::V1beta1\352AQ\n\031ml.googleapis.com/Ve" +
      "rsion\0224projects/{project}/models/{model}" +
      "/versions/{version}\352AU\n\033automl.googleapi" +
      "s.com/Model\0226projects/{project}/location" +
      "s/{location}/models/{model}\352A[\n\035automl.g" +
      "oogleapis.com/Dataset\022:projects/{project" +
      "}/locations/{location}/datasets/{dataset" +
      "}\352AL\n#datalabeling.googleapis.com/Datase" +
      "t\022%projects/{project}/datasets/{dataset}" +
      "\352A{\n,datalabeling.googleapis.com/Annotat" +
      "edDataset\022Kprojects/{project}/datasets/{" +
      "dataset}/annotatedDatasets/{annotated_da" +
      "taset}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor,
        new java.lang.String[] { "MlEngineModelVersion", "AutomlModel", "AutomlDataset", "DataLabelingDataset", "LastMigrateTime", "LastUpdateTime", "Resource", });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_MlEngineModelVersion_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_MlEngineModelVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_MlEngineModelVersion_descriptor,
        new java.lang.String[] { "Endpoint", "Version", });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlModel_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlModel_descriptor,
        new java.lang.String[] { "Model", "ModelDisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_AutomlDataset_descriptor,
        new java.lang.String[] { "Dataset", "DatasetDisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_descriptor,
        new java.lang.String[] { "Dataset", "DatasetDisplayName", "DataLabelingAnnotatedDatasets", });
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_MigratableResource_DataLabelingDataset_DataLabelingAnnotatedDataset_descriptor,
        new java.lang.String[] { "AnnotatedDataset", "AnnotatedDatasetDisplayName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
