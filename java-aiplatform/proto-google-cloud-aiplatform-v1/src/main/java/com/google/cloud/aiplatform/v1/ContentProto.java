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
// source: google/cloud/aiplatform/v1/content.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.aiplatform.v1;

public final class ContentProto {
  private ContentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Content_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Content_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Part_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Part_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Blob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Blob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FileData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FileData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_VideoMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_VideoMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GenerationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GenerationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_AutoRoutingMode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_AutoRoutingMode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_ManualRoutingMode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_ManualRoutingMode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SafetySetting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SafetySetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SafetyRating_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SafetyRating_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CitationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CitationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Citation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Citation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Candidate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Candidate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Segment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Segment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GroundingChunk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GroundingChunk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GroundingChunk_Web_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GroundingChunk_Web_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GroundingChunk_RetrievedContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GroundingChunk_RetrievedContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GroundingSupport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GroundingSupport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GroundingMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GroundingMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SearchEntryPoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SearchEntryPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/aiplatform/v1/content.pro"
          + "to\022\032google.cloud.aiplatform.v1\032\037google/a"
          + "pi/field_behavior.proto\032(google/cloud/ai"
          + "platform/v1/openapi.proto\032%google/cloud/"
          + "aiplatform/v1/tool.proto\032\036google/protobu"
          + "f/duration.proto\032\026google/type/date.proto"
          + "\"R\n\007Content\022\021\n\004role\030\001 \001(\tB\003\340A\001\0224\n\005parts\030"
          + "\002 \003(\0132 .google.cloud.aiplatform.v1.PartB"
          + "\003\340A\002\"\217\003\n\004Part\022\023\n\004text\030\001 \001(\tB\003\340A\001H\000\022<\n\013in"
          + "line_data\030\002 \001(\0132 .google.cloud.aiplatfor"
          + "m.v1.BlobB\003\340A\001H\000\022>\n\tfile_data\030\003 \001(\0132$.go"
          + "ogle.cloud.aiplatform.v1.FileDataB\003\340A\001H\000"
          + "\022F\n\rfunction_call\030\005 \001(\0132(.google.cloud.a"
          + "iplatform.v1.FunctionCallB\003\340A\001H\000\022N\n\021func"
          + "tion_response\030\006 \001(\0132,.google.cloud.aipla"
          + "tform.v1.FunctionResponseB\003\340A\001H\000\022H\n\016vide"
          + "o_metadata\030\004 \001(\0132).google.cloud.aiplatfo"
          + "rm.v1.VideoMetadataB\003\340A\001H\001B\006\n\004dataB\n\n\010me"
          + "tadata\"1\n\004Blob\022\026\n\tmime_type\030\001 \001(\tB\003\340A\002\022\021"
          + "\n\004data\030\002 \001(\014B\003\340A\002\"9\n\010FileData\022\026\n\tmime_ty"
          + "pe\030\001 \001(\tB\003\340A\002\022\025\n\010file_uri\030\002 \001(\tB\003\340A\002\"y\n\r"
          + "VideoMetadata\0224\n\014start_offset\030\001 \001(\0132\031.go"
          + "ogle.protobuf.DurationB\003\340A\001\0222\n\nend_offse"
          + "t\030\002 \001(\0132\031.google.protobuf.DurationB\003\340A\001\""
          + "\335\t\n\020GenerationConfig\022\035\n\013temperature\030\001 \001("
          + "\002B\003\340A\001H\000\210\001\001\022\027\n\005top_p\030\002 \001(\002B\003\340A\001H\001\210\001\001\022\027\n\005"
          + "top_k\030\003 \001(\002B\003\340A\001H\002\210\001\001\022!\n\017candidate_count"
          + "\030\004 \001(\005B\003\340A\001H\003\210\001\001\022#\n\021max_output_tokens\030\005 "
          + "\001(\005B\003\340A\001H\004\210\001\001\022\033\n\016stop_sequences\030\006 \003(\tB\003\340"
          + "A\001\022\"\n\020presence_penalty\030\010 \001(\002B\003\340A\001H\005\210\001\001\022#"
          + "\n\021frequency_penalty\030\t \001(\002B\003\340A\001H\006\210\001\001\022\026\n\004s"
          + "eed\030\014 \001(\005B\003\340A\001H\007\210\001\001\022\037\n\022response_mime_typ"
          + "e\030\r \001(\tB\003\340A\001\022E\n\017response_schema\030\020 \001(\0132\"."
          + "google.cloud.aiplatform.v1.SchemaB\003\340A\001H\010"
          + "\210\001\001\022\\\n\016routing_config\030\021 \001(\0132:.google.clo"
          + "ud.aiplatform.v1.GenerationConfig.Routin"
          + "gConfigB\003\340A\001H\t\210\001\001\032\302\004\n\rRoutingConfig\022_\n\ta"
          + "uto_mode\030\001 \001(\0132J.google.cloud.aiplatform"
          + ".v1.GenerationConfig.RoutingConfig.AutoR"
          + "outingModeH\000\022c\n\013manual_mode\030\002 \001(\0132L.goog"
          + "le.cloud.aiplatform.v1.GenerationConfig."
          + "RoutingConfig.ManualRoutingModeH\000\032\233\002\n\017Au"
          + "toRoutingMode\022\210\001\n\030model_routing_preferen"
          + "ce\030\001 \001(\0162a.google.cloud.aiplatform.v1.Ge"
          + "nerationConfig.RoutingConfig.AutoRouting"
          + "Mode.ModelRoutingPreferenceH\000\210\001\001\"`\n\026Mode"
          + "lRoutingPreference\022\013\n\007UNKNOWN\020\000\022\026\n\022PRIOR"
          + "ITIZE_QUALITY\020\001\022\014\n\010BALANCED\020\002\022\023\n\017PRIORIT"
          + "IZE_COST\020\003B\033\n\031_model_routing_preference\032"
          + ";\n\021ManualRoutingMode\022\027\n\nmodel_name\030\001 \001(\t"
          + "H\000\210\001\001B\r\n\013_model_nameB\020\n\016routing_configB\016"
          + "\n\014_temperatureB\010\n\006_top_pB\010\n\006_top_kB\022\n\020_c"
          + "andidate_countB\024\n\022_max_output_tokensB\023\n\021"
          + "_presence_penaltyB\024\n\022_frequency_penaltyB"
          + "\007\n\005_seedB\022\n\020_response_schemaB\021\n\017_routing"
          + "_config\"\353\003\n\rSafetySetting\022?\n\010category\030\001 "
          + "\001(\0162(.google.cloud.aiplatform.v1.HarmCat"
          + "egoryB\003\340A\002\022T\n\tthreshold\030\002 \001(\0162<.google.c"
          + "loud.aiplatform.v1.SafetySetting.HarmBlo"
          + "ckThresholdB\003\340A\002\022N\n\006method\030\004 \001(\01629.googl"
          + "e.cloud.aiplatform.v1.SafetySetting.Harm"
          + "BlockMethodB\003\340A\001\"\235\001\n\022HarmBlockThreshold\022"
          + "$\n HARM_BLOCK_THRESHOLD_UNSPECIFIED\020\000\022\027\n"
          + "\023BLOCK_LOW_AND_ABOVE\020\001\022\032\n\026BLOCK_MEDIUM_A"
          + "ND_ABOVE\020\002\022\023\n\017BLOCK_ONLY_HIGH\020\003\022\016\n\nBLOCK"
          + "_NONE\020\004\022\007\n\003OFF\020\005\"S\n\017HarmBlockMethod\022!\n\035H"
          + "ARM_BLOCK_METHOD_UNSPECIFIED\020\000\022\014\n\010SEVERI"
          + "TY\020\001\022\017\n\013PROBABILITY\020\002\"\277\004\n\014SafetyRating\022?"
          + "\n\010category\030\001 \001(\0162(.google.cloud.aiplatfo"
          + "rm.v1.HarmCategoryB\003\340A\003\022R\n\013probability\030\002"
          + " \001(\01628.google.cloud.aiplatform.v1.Safety"
          + "Rating.HarmProbabilityB\003\340A\003\022\036\n\021probabili"
          + "ty_score\030\005 \001(\002B\003\340A\003\022L\n\010severity\030\006 \001(\01625."
          + "google.cloud.aiplatform.v1.SafetyRating."
          + "HarmSeverityB\003\340A\003\022\033\n\016severity_score\030\007 \001("
          + "\002B\003\340A\003\022\024\n\007blocked\030\003 \001(\010B\003\340A\003\"b\n\017HarmProb"
          + "ability\022 \n\034HARM_PROBABILITY_UNSPECIFIED\020"
          + "\000\022\016\n\nNEGLIGIBLE\020\001\022\007\n\003LOW\020\002\022\n\n\006MEDIUM\020\003\022\010"
          + "\n\004HIGH\020\004\"\224\001\n\014HarmSeverity\022\035\n\031HARM_SEVERI"
          + "TY_UNSPECIFIED\020\000\022\034\n\030HARM_SEVERITY_NEGLIG"
          + "IBLE\020\001\022\025\n\021HARM_SEVERITY_LOW\020\002\022\030\n\024HARM_SE"
          + "VERITY_MEDIUM\020\003\022\026\n\022HARM_SEVERITY_HIGH\020\004\""
          + "P\n\020CitationMetadata\022<\n\tcitations\030\001 \003(\0132$"
          + ".google.cloud.aiplatform.v1.CitationB\003\340A"
          + "\003\"\252\001\n\010Citation\022\030\n\013start_index\030\001 \001(\005B\003\340A\003"
          + "\022\026\n\tend_index\030\002 \001(\005B\003\340A\003\022\020\n\003uri\030\003 \001(\tB\003\340"
          + "A\003\022\022\n\005title\030\004 \001(\tB\003\340A\003\022\024\n\007license\030\005 \001(\tB"
          + "\003\340A\003\0220\n\020publication_date\030\006 \001(\0132\021.google."
          + "type.DateB\003\340A\003\"\262\005\n\tCandidate\022\022\n\005index\030\001 "
          + "\001(\005B\003\340A\003\0229\n\007content\030\002 \001(\0132#.google.cloud"
          + ".aiplatform.v1.ContentB\003\340A\003\022\022\n\005score\030\010 \001"
          + "(\001B\003\340A\003\022\031\n\014avg_logprobs\030\t \001(\001B\003\340A\003\022N\n\rfi"
          + "nish_reason\030\003 \001(\01622.google.cloud.aiplatf"
          + "orm.v1.Candidate.FinishReasonB\003\340A\003\022E\n\016sa"
          + "fety_ratings\030\004 \003(\0132(.google.cloud.aiplat"
          + "form.v1.SafetyRatingB\003\340A\003\022 \n\016finish_mess"
          + "age\030\005 \001(\tB\003\340A\003H\000\210\001\001\022L\n\021citation_metadata"
          + "\030\006 \001(\0132,.google.cloud.aiplatform.v1.Cita"
          + "tionMetadataB\003\340A\003\022N\n\022grounding_metadata\030"
          + "\007 \001(\0132-.google.cloud.aiplatform.v1.Groun"
          + "dingMetadataB\003\340A\003\"\274\001\n\014FinishReason\022\035\n\031FI"
          + "NISH_REASON_UNSPECIFIED\020\000\022\010\n\004STOP\020\001\022\016\n\nM"
          + "AX_TOKENS\020\002\022\n\n\006SAFETY\020\003\022\016\n\nRECITATION\020\004\022"
          + "\t\n\005OTHER\020\005\022\r\n\tBLOCKLIST\020\006\022\026\n\022PROHIBITED_"
          + "CONTENT\020\007\022\010\n\004SPII\020\010\022\033\n\027MALFORMED_FUNCTIO"
          + "N_CALL\020\tB\021\n\017_finish_message\"g\n\007Segment\022\027"
          + "\n\npart_index\030\001 \001(\005B\003\340A\003\022\030\n\013start_index\030\002"
          + " \001(\005B\003\340A\003\022\026\n\tend_index\030\003 \001(\005B\003\340A\003\022\021\n\004tex"
          + "t\030\004 \001(\tB\003\340A\003\"\302\002\n\016GroundingChunk\022=\n\003web\030\001"
          + " \001(\0132..google.cloud.aiplatform.v1.Ground"
          + "ingChunk.WebH\000\022X\n\021retrieved_context\030\002 \001("
          + "\0132;.google.cloud.aiplatform.v1.Grounding"
          + "Chunk.RetrievedContextH\000\032=\n\003Web\022\020\n\003uri\030\001"
          + " \001(\tH\000\210\001\001\022\022\n\005title\030\002 \001(\tH\001\210\001\001B\006\n\004_uriB\010\n"
          + "\006_title\032J\n\020RetrievedContext\022\020\n\003uri\030\001 \001(\t"
          + "H\000\210\001\001\022\022\n\005title\030\002 \001(\tH\001\210\001\001B\006\n\004_uriB\010\n\006_ti"
          + "tleB\014\n\nchunk_type\"\225\001\n\020GroundingSupport\0229"
          + "\n\007segment\030\001 \001(\0132#.google.cloud.aiplatfor"
          + "m.v1.SegmentH\000\210\001\001\022\037\n\027grounding_chunk_ind"
          + "ices\030\002 \003(\005\022\031\n\021confidence_scores\030\003 \003(\002B\n\n"
          + "\010_segment\"\264\002\n\021GroundingMetadata\022\037\n\022web_s"
          + "earch_queries\030\001 \003(\tB\003\340A\001\022R\n\022search_entry"
          + "_point\030\004 \001(\0132,.google.cloud.aiplatform.v"
          + "1.SearchEntryPointB\003\340A\001H\000\210\001\001\022D\n\020groundin"
          + "g_chunks\030\005 \003(\0132*.google.cloud.aiplatform"
          + ".v1.GroundingChunk\022M\n\022grounding_supports"
          + "\030\006 \003(\0132,.google.cloud.aiplatform.v1.Grou"
          + "ndingSupportB\003\340A\001B\025\n\023_search_entry_point"
          + "\"H\n\020SearchEntryPoint\022\035\n\020rendered_content"
          + "\030\001 \001(\tB\003\340A\001\022\025\n\010sdk_blob\030\002 \001(\014B\003\340A\001*\264\001\n\014H"
          + "armCategory\022\035\n\031HARM_CATEGORY_UNSPECIFIED"
          + "\020\000\022\035\n\031HARM_CATEGORY_HATE_SPEECH\020\001\022#\n\037HAR"
          + "M_CATEGORY_DANGEROUS_CONTENT\020\002\022\034\n\030HARM_C"
          + "ATEGORY_HARASSMENT\020\003\022#\n\037HARM_CATEGORY_SE"
          + "XUALLY_EXPLICIT\020\004B\312\001\n\036com.google.cloud.a"
          + "iplatform.v1B\014ContentProtoP\001Z>cloud.goog"
          + "le.com/go/aiplatform/apiv1/aiplatformpb;"
          + "aiplatformpb\252\002\032Google.Cloud.AIPlatform.V"
          + "1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google:"
          + ":Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OpenApiProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ToolProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Content_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Content_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Content_descriptor,
            new java.lang.String[] {
              "Role", "Parts",
            });
    internal_static_google_cloud_aiplatform_v1_Part_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Part_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Part_descriptor,
            new java.lang.String[] {
              "Text",
              "InlineData",
              "FileData",
              "FunctionCall",
              "FunctionResponse",
              "VideoMetadata",
              "Data",
              "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1_Blob_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_Blob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Blob_descriptor,
            new java.lang.String[] {
              "MimeType", "Data",
            });
    internal_static_google_cloud_aiplatform_v1_FileData_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_FileData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FileData_descriptor,
            new java.lang.String[] {
              "MimeType", "FileUri",
            });
    internal_static_google_cloud_aiplatform_v1_VideoMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_VideoMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_VideoMetadata_descriptor,
            new java.lang.String[] {
              "StartOffset", "EndOffset",
            });
    internal_static_google_cloud_aiplatform_v1_GenerationConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_GenerationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GenerationConfig_descriptor,
            new java.lang.String[] {
              "Temperature",
              "TopP",
              "TopK",
              "CandidateCount",
              "MaxOutputTokens",
              "StopSequences",
              "PresencePenalty",
              "FrequencyPenalty",
              "Seed",
              "ResponseMimeType",
              "ResponseSchema",
              "RoutingConfig",
            });
    internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_GenerationConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_descriptor,
            new java.lang.String[] {
              "AutoMode", "ManualMode", "RoutingConfig",
            });
    internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_AutoRoutingMode_descriptor =
        internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_AutoRoutingMode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_AutoRoutingMode_descriptor,
            new java.lang.String[] {
              "ModelRoutingPreference",
            });
    internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_ManualRoutingMode_descriptor =
        internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_ManualRoutingMode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GenerationConfig_RoutingConfig_ManualRoutingMode_descriptor,
            new java.lang.String[] {
              "ModelName",
            });
    internal_static_google_cloud_aiplatform_v1_SafetySetting_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_SafetySetting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SafetySetting_descriptor,
            new java.lang.String[] {
              "Category", "Threshold", "Method",
            });
    internal_static_google_cloud_aiplatform_v1_SafetyRating_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_SafetyRating_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SafetyRating_descriptor,
            new java.lang.String[] {
              "Category", "Probability", "ProbabilityScore", "Severity", "SeverityScore", "Blocked",
            });
    internal_static_google_cloud_aiplatform_v1_CitationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_CitationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CitationMetadata_descriptor,
            new java.lang.String[] {
              "Citations",
            });
    internal_static_google_cloud_aiplatform_v1_Citation_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_Citation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Citation_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex", "Uri", "Title", "License", "PublicationDate",
            });
    internal_static_google_cloud_aiplatform_v1_Candidate_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_Candidate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Candidate_descriptor,
            new java.lang.String[] {
              "Index",
              "Content",
              "Score",
              "AvgLogprobs",
              "FinishReason",
              "SafetyRatings",
              "FinishMessage",
              "CitationMetadata",
              "GroundingMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_Segment_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1_Segment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Segment_descriptor,
            new java.lang.String[] {
              "PartIndex", "StartIndex", "EndIndex", "Text",
            });
    internal_static_google_cloud_aiplatform_v1_GroundingChunk_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1_GroundingChunk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GroundingChunk_descriptor,
            new java.lang.String[] {
              "Web", "RetrievedContext", "ChunkType",
            });
    internal_static_google_cloud_aiplatform_v1_GroundingChunk_Web_descriptor =
        internal_static_google_cloud_aiplatform_v1_GroundingChunk_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_GroundingChunk_Web_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GroundingChunk_Web_descriptor,
            new java.lang.String[] {
              "Uri", "Title",
            });
    internal_static_google_cloud_aiplatform_v1_GroundingChunk_RetrievedContext_descriptor =
        internal_static_google_cloud_aiplatform_v1_GroundingChunk_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_GroundingChunk_RetrievedContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GroundingChunk_RetrievedContext_descriptor,
            new java.lang.String[] {
              "Uri", "Title",
            });
    internal_static_google_cloud_aiplatform_v1_GroundingSupport_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1_GroundingSupport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GroundingSupport_descriptor,
            new java.lang.String[] {
              "Segment", "GroundingChunkIndices", "ConfidenceScores",
            });
    internal_static_google_cloud_aiplatform_v1_GroundingMetadata_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1_GroundingMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GroundingMetadata_descriptor,
            new java.lang.String[] {
              "WebSearchQueries", "SearchEntryPoint", "GroundingChunks", "GroundingSupports",
            });
    internal_static_google_cloud_aiplatform_v1_SearchEntryPoint_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1_SearchEntryPoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SearchEntryPoint_descriptor,
            new java.lang.String[] {
              "RenderedContent", "SdkBlob",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OpenApiProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ToolProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
