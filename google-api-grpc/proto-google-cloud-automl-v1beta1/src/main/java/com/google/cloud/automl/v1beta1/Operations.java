// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/operations.proto

package com.google.cloud.automl.v1beta1;

public final class Operations {
  private Operations() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_DeleteOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_DeleteOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_DeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_DeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_UndeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_UndeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_CreateModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_CreateModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ImportDataOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ImportDataOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_ExportDataOutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_ExportDataOutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_BatchPredictOutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_BatchPredictOutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_ExportModelOutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_ExportModelOutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_ExportEvaluatedExamplesOutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_ExportEvaluatedExamplesOutputInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/automl/v1beta1/operations"
          + ".proto\022\033google.cloud.automl.v1beta1\032$goo"
          + "gle/cloud/automl/v1beta1/io.proto\032\'googl"
          + "e/cloud/automl/v1beta1/model.proto\0322goog"
          + "le/cloud/automl/v1beta1/model_evaluation"
          + ".proto\032\033google/protobuf/empty.proto\032\037goo"
          + "gle/protobuf/timestamp.proto\032\027google/rpc"
          + "/status.proto\032\034google/api/annotations.pr"
          + "oto\"\213\010\n\021OperationMetadata\022N\n\016delete_deta"
          + "ils\030\010 \001(\01324.google.cloud.automl.v1beta1."
          + "DeleteOperationMetadataH\000\022Y\n\024deploy_mode"
          + "l_details\030\030 \001(\01329.google.cloud.automl.v1"
          + "beta1.DeployModelOperationMetadataH\000\022]\n\026"
          + "undeploy_model_details\030\031 \001(\0132;.google.cl"
          + "oud.automl.v1beta1.UndeployModelOperatio"
          + "nMetadataH\000\022Y\n\024create_model_details\030\n \001("
          + "\01329.google.cloud.automl.v1beta1.CreateMo"
          + "delOperationMetadataH\000\022W\n\023import_data_de"
          + "tails\030\017 \001(\01328.google.cloud.automl.v1beta"
          + "1.ImportDataOperationMetadataH\000\022[\n\025batch"
          + "_predict_details\030\020 \001(\0132:.google.cloud.au"
          + "toml.v1beta1.BatchPredictOperationMetada"
          + "taH\000\022W\n\023export_data_details\030\025 \001(\01328.goog"
          + "le.cloud.automl.v1beta1.ExportDataOperat"
          + "ionMetadataH\000\022Y\n\024export_model_details\030\026 "
          + "\001(\01329.google.cloud.automl.v1beta1.Export"
          + "ModelOperationMetadataH\000\022r\n!export_evalu"
          + "ated_examples_details\030\032 \001(\0132E.google.clo"
          + "ud.automl.v1beta1.ExportEvaluatedExample"
          + "sOperationMetadataH\000\022\030\n\020progress_percent"
          + "\030\r \001(\005\022,\n\020partial_failures\030\002 \003(\0132\022.googl"
          + "e.rpc.Status\022/\n\013create_time\030\003 \001(\0132\032.goog"
          + "le.protobuf.Timestamp\022/\n\013update_time\030\004 \001"
          + "(\0132\032.google.protobuf.TimestampB\t\n\007detail"
          + "s\"\031\n\027DeleteOperationMetadata\"\036\n\034DeployMo"
          + "delOperationMetadata\" \n\036UndeployModelOpe"
          + "rationMetadata\"\036\n\034CreateModelOperationMe"
          + "tadata\"\035\n\033ImportDataOperationMetadata\"\357\001"
          + "\n\033ExportDataOperationMetadata\022b\n\013output_"
          + "info\030\001 \001(\0132M.google.cloud.automl.v1beta1"
          + ".ExportDataOperationMetadata.ExportDataO"
          + "utputInfo\032l\n\024ExportDataOutputInfo\022\036\n\024gcs"
          + "_output_directory\030\001 \001(\tH\000\022!\n\027bigquery_ou"
          + "tput_dataset\030\002 \001(\tH\000B\021\n\017output_location\""
          + "\303\002\n\035BatchPredictOperationMetadata\022J\n\014inp"
          + "ut_config\030\001 \001(\01324.google.cloud.automl.v1"
          + "beta1.BatchPredictInputConfig\022f\n\013output_"
          + "info\030\002 \001(\0132Q.google.cloud.automl.v1beta1"
          + ".BatchPredictOperationMetadata.BatchPred"
          + "ictOutputInfo\032n\n\026BatchPredictOutputInfo\022"
          + "\036\n\024gcs_output_directory\030\001 \001(\tH\000\022!\n\027bigqu"
          + "ery_output_dataset\030\002 \001(\tH\000B\021\n\017output_loc"
          + "ation\"\273\001\n\034ExportModelOperationMetadata\022d"
          + "\n\013output_info\030\002 \001(\0132O.google.cloud.autom"
          + "l.v1beta1.ExportModelOperationMetadata.E"
          + "xportModelOutputInfo\0325\n\025ExportModelOutpu"
          + "tInfo\022\034\n\024gcs_output_directory\030\001 \001(\t\"\356\001\n("
          + "ExportEvaluatedExamplesOperationMetadata"
          + "\022|\n\013output_info\030\002 \001(\0132g.google.cloud.aut"
          + "oml.v1beta1.ExportEvaluatedExamplesOpera"
          + "tionMetadata.ExportEvaluatedExamplesOutp"
          + "utInfo\032D\n!ExportEvaluatedExamplesOutputI"
          + "nfo\022\037\n\027bigquery_output_dataset\030\002 \001(\tB\245\001\n"
          + "\037com.google.cloud.automl.v1beta1P\001ZAgoog"
          + "le.golang.org/genproto/googleapis/cloud/"
          + "automl/v1beta1;automl\312\002\033Google\\Cloud\\Aut"
          + "oMl\\V1beta1\352\002\036Google::Cloud::AutoML::V1b"
          + "eta1b\006proto3"
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
          com.google.cloud.automl.v1beta1.Io.getDescriptor(),
          com.google.cloud.automl.v1beta1.ModelOuterClass.getDescriptor(),
          com.google.cloud.automl.v1beta1.ModelEvaluationOuterClass.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1beta1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "DeleteDetails",
              "DeployModelDetails",
              "UndeployModelDetails",
              "CreateModelDetails",
              "ImportDataDetails",
              "BatchPredictDetails",
              "ExportDataDetails",
              "ExportModelDetails",
              "ExportEvaluatedExamplesDetails",
              "ProgressPercent",
              "PartialFailures",
              "CreateTime",
              "UpdateTime",
              "Details",
            });
    internal_static_google_cloud_automl_v1beta1_DeleteOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_DeleteOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_DeleteOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_DeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_DeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_DeployModelOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_UndeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_UndeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_UndeployModelOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_CreateModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1beta1_CreateModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_CreateModelOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_ImportDataOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1beta1_ImportDataOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ImportDataOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_descriptor,
            new java.lang.String[] {
              "OutputInfo",
            });
    internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_ExportDataOutputInfo_descriptor =
        internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_ExportDataOutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ExportDataOperationMetadata_ExportDataOutputInfo_descriptor,
            new java.lang.String[] {
              "GcsOutputDirectory", "BigqueryOutputDataset", "OutputLocation",
            });
    internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_descriptor,
            new java.lang.String[] {
              "InputConfig", "OutputInfo",
            });
    internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_BatchPredictOutputInfo_descriptor =
        internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_BatchPredictOutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_BatchPredictOperationMetadata_BatchPredictOutputInfo_descriptor,
            new java.lang.String[] {
              "GcsOutputDirectory", "BigqueryOutputDataset", "OutputLocation",
            });
    internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "OutputInfo",
            });
    internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_ExportModelOutputInfo_descriptor =
        internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_ExportModelOutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ExportModelOperationMetadata_ExportModelOutputInfo_descriptor,
            new java.lang.String[] {
              "GcsOutputDirectory",
            });
    internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_descriptor,
            new java.lang.String[] {
              "OutputInfo",
            });
    internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_ExportEvaluatedExamplesOutputInfo_descriptor =
        internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_ExportEvaluatedExamplesOutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOperationMetadata_ExportEvaluatedExamplesOutputInfo_descriptor,
            new java.lang.String[] {
              "BigqueryOutputDataset",
            });
    com.google.cloud.automl.v1beta1.Io.getDescriptor();
    com.google.cloud.automl.v1beta1.ModelOuterClass.getDescriptor();
    com.google.cloud.automl.v1beta1.ModelEvaluationOuterClass.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
