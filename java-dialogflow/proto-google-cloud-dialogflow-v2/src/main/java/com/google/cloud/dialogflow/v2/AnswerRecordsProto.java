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
// source: google/cloud/dialogflow/v2/answer_record.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

public final class AnswerRecordsProto {
  private AnswerRecordsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AnswerRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AnswerRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateAnswerRecordRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateAnswerRecordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AnswerFeedback_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AnswerFeedback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_SummarizationFeedback_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_SummarizationFeedback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_KnowledgeSearchFeedback_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_KnowledgeSearchFeedback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/dialogflow/v2/answer_reco"
          + "rd.proto\022\032google.cloud.dialogflow.v2\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032,google/"
          + "cloud/dialogflow/v2/participant.proto\032 g"
          + "oogle/protobuf/field_mask.proto\032\037google/"
          + "protobuf/timestamp.proto\"\361\002\n\014AnswerRecor"
          + "d\022\014\n\004name\030\001 \001(\t\022H\n\017answer_feedback\030\002 \001(\013"
          + "2*.google.cloud.dialogflow.v2.AnswerFeed"
          + "backB\003\340A\002\022W\n\026agent_assistant_record\030\004 \001("
          + "\01320.google.cloud.dialogflow.v2.AgentAssi"
          + "stantRecordB\003\340A\003H\000:\245\001\352A\241\001\n&dialogflow.go"
          + "ogleapis.com/AnswerRecord\0220projects/{pro"
          + "ject}/answerRecords/{answer_record}\022Epro"
          + "jects/{project}/locations/{location}/ans"
          + "werRecords/{answer_record}B\010\n\006record\"\242\001\n"
          + "\030ListAnswerRecordsRequest\022>\n\006parent\030\001 \001("
          + "\tB.\340A\002\372A(\022&dialogflow.googleapis.com/Ans"
          + "werRecord\022\025\n\006filter\030\002 \001(\tB\005\030\001\340A\001\022\026\n\tpage"
          + "_size\030\003 \001(\005B\003\340A\001\022\027\n\npage_token\030\004 \001(\tB\003\340A"
          + "\001\"v\n\031ListAnswerRecordsResponse\022@\n\016answer"
          + "_records\030\001 \003(\0132(.google.cloud.dialogflow"
          + ".v2.AnswerRecord\022\027\n\017next_page_token\030\002 \001("
          + "\t\"\227\001\n\031UpdateAnswerRecordRequest\022D\n\ranswe"
          + "r_record\030\001 \001(\0132(.google.cloud.dialogflow"
          + ".v2.AnswerRecordB\003\340A\002\0224\n\013update_mask\030\002 \001"
          + "(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"\322\003\n\016"
          + "AnswerFeedback\022V\n\021correctness_level\030\001 \001("
          + "\0162;.google.cloud.dialogflow.v2.AnswerFee"
          + "dback.CorrectnessLevel\022]\n\037agent_assistan"
          + "t_detail_feedback\030\002 \001(\01322.google.cloud.d"
          + "ialogflow.v2.AgentAssistantFeedbackH\000\022\017\n"
          + "\007clicked\030\003 \001(\010\022.\n\nclick_time\030\005 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\022\021\n\tdisplayed\030\004 \001("
          + "\010\0220\n\014display_time\030\006 \001(\0132\032.google.protobu"
          + "f.Timestamp\"p\n\020CorrectnessLevel\022!\n\035CORRE"
          + "CTNESS_LEVEL_UNSPECIFIED\020\000\022\017\n\013NOT_CORREC"
          + "T\020\001\022\025\n\021PARTIALLY_CORRECT\020\002\022\021\n\rFULLY_CORR"
          + "ECT\020\003B\021\n\017detail_feedback\"\222\010\n\026AgentAssist"
          + "antFeedback\022a\n\020answer_relevance\030\001 \001(\0162B."
          + "google.cloud.dialogflow.v2.AgentAssistan"
          + "tFeedback.AnswerRelevanceB\003\340A\001\022i\n\024docume"
          + "nt_correctness\030\002 \001(\0162F.google.cloud.dial"
          + "ogflow.v2.AgentAssistantFeedback.Documen"
          + "tCorrectnessB\003\340A\001\022g\n\023document_efficiency"
          + "\030\003 \001(\0162E.google.cloud.dialogflow.v2.Agen"
          + "tAssistantFeedback.DocumentEfficiencyB\003\340"
          + "A\001\022m\n\026summarization_feedback\030\004 \001(\0132H.goo"
          + "gle.cloud.dialogflow.v2.AgentAssistantFe"
          + "edback.SummarizationFeedbackB\003\340A\001\022r\n\031kno"
          + "wledge_search_feedback\030\005 \001(\0132J.google.cl"
          + "oud.dialogflow.v2.AgentAssistantFeedback"
          + ".KnowledgeSearchFeedbackB\003\340A\001\032\216\001\n\025Summar"
          + "izationFeedback\022.\n\nstart_time\030\001 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022/\n\013submit_time\030\002"
          + " \001(\0132\032.google.protobuf.Timestamp\022\024\n\014summ"
          + "ary_text\030\003 \001(\t\032F\n\027KnowledgeSearchFeedbac"
          + "k\022\025\n\ranswer_copied\030\001 \001(\010\022\024\n\014clicked_uris"
          + "\030\002 \003(\t\"Q\n\017AnswerRelevance\022 \n\034ANSWER_RELE"
          + "VANCE_UNSPECIFIED\020\000\022\016\n\nIRRELEVANT\020\001\022\014\n\010R"
          + "ELEVANT\020\002\"W\n\023DocumentCorrectness\022$\n DOCU"
          + "MENT_CORRECTNESS_UNSPECIFIED\020\000\022\r\n\tINCORR"
          + "ECT\020\001\022\013\n\007CORRECT\020\002\"Y\n\022DocumentEfficiency"
          + "\022#\n\037DOCUMENT_EFFICIENCY_UNSPECIFIED\020\000\022\017\n"
          + "\013INEFFICIENT\020\001\022\r\n\tEFFICIENT\020\002\"\224\002\n\024AgentA"
          + "ssistantRecord\022S\n\031article_suggestion_ans"
          + "wer\030\005 \001(\0132).google.cloud.dialogflow.v2.A"
          + "rticleAnswerB\003\340A\003H\000\022@\n\nfaq_answer\030\006 \001(\0132"
          + "%.google.cloud.dialogflow.v2.FaqAnswerB\003"
          + "\340A\003H\000\022[\n\030dialogflow_assist_answer\030\007 \001(\0132"
          + "2.google.cloud.dialogflow.v2.DialogflowA"
          + "ssistAnswerB\003\340A\003H\000B\010\n\006answer2\255\005\n\rAnswerR"
          + "ecords\022\355\001\n\021ListAnswerRecords\0224.google.cl"
          + "oud.dialogflow.v2.ListAnswerRecordsReque"
          + "st\0325.google.cloud.dialogflow.v2.ListAnsw"
          + "erRecordsResponse\"k\332A\006parent\202\323\344\223\002\\\022%/v2/"
          + "{parent=projects/*}/answerRecordsZ3\0221/v2"
          + "/{parent=projects/*/locations/*}/answerR"
          + "ecords\022\261\002\n\022UpdateAnswerRecord\0225.google.c"
          + "loud.dialogflow.v2.UpdateAnswerRecordReq"
          + "uest\032(.google.cloud.dialogflow.v2.Answer"
          + "Record\"\271\001\332A\031answer_record,update_mask\202\323\344"
          + "\223\002\226\00123/v2/{answer_record.name=projects/*"
          + "/answerRecords/*}:\ranswer_recordZP2?/v2/"
          + "{answer_record.name=projects/*/locations"
          + "/*/answerRecords/*}:\ranswer_record\032x\312A\031d"
          + "ialogflow.googleapis.com\322AYhttps://www.g"
          + "oogleapis.com/auth/cloud-platform,https:"
          + "//www.googleapis.com/auth/dialogflowB\233\001\n"
          + "\036com.google.cloud.dialogflow.v2B\022AnswerR"
          + "ecordsProtoP\001Z>cloud.google.com/go/dialo"
          + "gflow/apiv2/dialogflowpb;dialogflowpb\370\001\001"
          + "\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.ParticipantProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_AnswerRecord_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_AnswerRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AnswerRecord_descriptor,
            new java.lang.String[] {
              "Name", "AnswerFeedback", "AgentAssistantRecord", "Record",
            });
    internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_descriptor,
            new java.lang.String[] {
              "AnswerRecords", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateAnswerRecordRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_UpdateAnswerRecordRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateAnswerRecordRequest_descriptor,
            new java.lang.String[] {
              "AnswerRecord", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_AnswerFeedback_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_AnswerFeedback_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AnswerFeedback_descriptor,
            new java.lang.String[] {
              "CorrectnessLevel",
              "AgentAssistantDetailFeedback",
              "Clicked",
              "ClickTime",
              "Displayed",
              "DisplayTime",
              "DetailFeedback",
            });
    internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_descriptor,
            new java.lang.String[] {
              "AnswerRelevance",
              "DocumentCorrectness",
              "DocumentEfficiency",
              "SummarizationFeedback",
              "KnowledgeSearchFeedback",
            });
    internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_SummarizationFeedback_descriptor =
        internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_SummarizationFeedback_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_SummarizationFeedback_descriptor,
            new java.lang.String[] {
              "StartTime", "SubmitTime", "SummaryText",
            });
    internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_KnowledgeSearchFeedback_descriptor =
        internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_KnowledgeSearchFeedback_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_KnowledgeSearchFeedback_descriptor,
            new java.lang.String[] {
              "AnswerCopied", "ClickedUris",
            });
    internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_descriptor,
            new java.lang.String[] {
              "ArticleSuggestionAnswer", "FaqAnswer", "DialogflowAssistAnswer", "Answer",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2.ParticipantProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
