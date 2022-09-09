// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/evaluation_job.proto

package com.google.cloud.datalabeling.v1beta1;

public final class EvaluationJobOuterClass {
  private EvaluationJobOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_BigqueryImportKeysEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_BigqueryImportKeysEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_Attempt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/datalabeling/v1beta1/eval" +
      "uation_job.proto\022!google.cloud.datalabel" +
      "ing.v1beta1\032\031google/api/resource.proto\032/" +
      "google/cloud/datalabeling/v1beta1/datase" +
      "t.proto\0322google/cloud/datalabeling/v1bet" +
      "a1/evaluation.proto\032?google/cloud/datala" +
      "beling/v1beta1/human_annotation_config.p" +
      "roto\032\037google/protobuf/timestamp.proto\032\027g" +
      "oogle/rpc/status.proto\"\342\004\n\rEvaluationJob" +
      "\022\014\n\004name\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022E\n\005s" +
      "tate\030\003 \001(\01626.google.cloud.datalabeling.v" +
      "1beta1.EvaluationJob.State\022\020\n\010schedule\030\004" +
      " \001(\t\022\025\n\rmodel_version\030\005 \001(\t\022U\n\025evaluatio" +
      "n_job_config\030\006 \001(\01326.google.cloud.datala" +
      "beling.v1beta1.EvaluationJobConfig\022\033\n\023an" +
      "notation_spec_set\030\007 \001(\t\022\"\n\032label_missing" +
      "_ground_truth\030\010 \001(\010\022<\n\010attempts\030\t \003(\0132*." +
      "google.cloud.datalabeling.v1beta1.Attemp" +
      "t\022/\n\013create_time\030\n \001(\0132\032.google.protobuf" +
      ".Timestamp\"S\n\005State\022\025\n\021STATE_UNSPECIFIED" +
      "\020\000\022\r\n\tSCHEDULED\020\001\022\013\n\007RUNNING\020\002\022\n\n\006PAUSED" +
      "\020\003\022\013\n\007STOPPED\020\004:b\352A_\n)datalabeling.googl" +
      "eapis.com/EvaluationJob\0222projects/{proje" +
      "ct}/evaluationJobs/{evaluation_job}\"\215\007\n\023" +
      "EvaluationJobConfig\022c\n\033image_classificat" +
      "ion_config\030\004 \001(\0132<.google.cloud.datalabe" +
      "ling.v1beta1.ImageClassificationConfigH\000" +
      "\022U\n\024bounding_poly_config\030\005 \001(\01325.google." +
      "cloud.datalabeling.v1beta1.BoundingPolyC" +
      "onfigH\000\022a\n\032text_classification_config\030\010 " +
      "\001(\0132;.google.cloud.datalabeling.v1beta1." +
      "TextClassificationConfigH\000\022D\n\014input_conf" +
      "ig\030\001 \001(\0132..google.cloud.datalabeling.v1b" +
      "eta1.InputConfig\022N\n\021evaluation_config\030\002 " +
      "\001(\01323.google.cloud.datalabeling.v1beta1." +
      "EvaluationConfig\022Y\n\027human_annotation_con" +
      "fig\030\003 \001(\01328.google.cloud.datalabeling.v1" +
      "beta1.HumanAnnotationConfig\022l\n\024bigquery_" +
      "import_keys\030\t \003(\0132N.google.cloud.datalab" +
      "eling.v1beta1.EvaluationJobConfig.Bigque" +
      "ryImportKeysEntry\022\025\n\rexample_count\030\n \001(\005" +
      "\022!\n\031example_sample_percentage\030\013 \001(\001\022`\n\033e" +
      "valuation_job_alert_config\030\r \001(\0132;.googl" +
      "e.cloud.datalabeling.v1beta1.EvaluationJ" +
      "obAlertConfig\0329\n\027BigqueryImportKeysEntry" +
      "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B!\n\037huma" +
      "n_annotation_request_config\"X\n\030Evaluatio" +
      "nJobAlertConfig\022\r\n\005email\030\001 \001(\t\022-\n%min_ac" +
      "ceptable_mean_average_precision\030\002 \001(\001\"i\n" +
      "\007Attempt\0220\n\014attempt_time\030\001 \001(\0132\032.google." +
      "protobuf.Timestamp\022,\n\020partial_failures\030\002" +
      " \003(\0132\022.google.rpc.StatusB\347\001\n%com.google." +
      "cloud.datalabeling.v1beta1P\001ZMgoogle.gol" +
      "ang.org/genproto/googleapis/cloud/datala" +
      "beling/v1beta1;datalabeling\252\002!Google.Clo" +
      "ud.DataLabeling.V1Beta1\312\002!Google\\Cloud\\D" +
      "ataLabeling\\V1beta1\352\002$Google::Cloud::Dat" +
      "aLabeling::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.datalabeling.v1beta1.DatasetOuterClass.getDescriptor(),
          com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.getDescriptor(),
          com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datalabeling_v1beta1_EvaluationJob_descriptor,
        new java.lang.String[] { "Name", "Description", "State", "Schedule", "ModelVersion", "EvaluationJobConfig", "AnnotationSpecSet", "LabelMissingGroundTruth", "Attempts", "CreateTime", });
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_descriptor,
        new java.lang.String[] { "ImageClassificationConfig", "BoundingPolyConfig", "TextClassificationConfig", "InputConfig", "EvaluationConfig", "HumanAnnotationConfig", "BigqueryImportKeys", "ExampleCount", "ExampleSamplePercentage", "EvaluationJobAlertConfig", "HumanAnnotationRequestConfig", });
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_BigqueryImportKeysEntry_descriptor =
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_BigqueryImportKeysEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_BigqueryImportKeysEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_descriptor,
        new java.lang.String[] { "Email", "MinAcceptableMeanAveragePrecision", });
    internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datalabeling_v1beta1_Attempt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor,
        new java.lang.String[] { "AttemptTime", "PartialFailures", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.DatasetOuterClass.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
