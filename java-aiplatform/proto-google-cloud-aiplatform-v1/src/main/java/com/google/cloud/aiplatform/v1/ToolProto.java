/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public final class ToolProto {
  private ToolProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Tool_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Tool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionCall_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Retrieval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Retrieval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_VertexRagStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_VertexRagStore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_VertexRagStore_RagResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_VertexRagStore_RagResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_VertexAISearch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_VertexAISearch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DynamicRetrievalConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DynamicRetrievalConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ToolConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ToolConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionCallingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionCallingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_Filter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_Filter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/aiplatform/v1/tool.proto\022"
          + "\032google.cloud.aiplatform.v1\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032(google/cloud/aiplatform/v1/open"
          + "api.proto\032\034google/protobuf/struct.proto\""
          + "\363\001\n\004Tool\022S\n\025function_declarations\030\001 \003(\0132"
          + "/.google.cloud.aiplatform.v1.FunctionDec"
          + "larationB\003\340A\001\022=\n\tretrieval\030\002 \001(\0132%.googl"
          + "e.cloud.aiplatform.v1.RetrievalB\003\340A\001\022W\n\027"
          + "google_search_retrieval\030\003 \001(\01321.google.c"
          + "loud.aiplatform.v1.GoogleSearchRetrieval"
          + "B\003\340A\001\"\272\001\n\023FunctionDeclaration\022\021\n\004name\030\001 "
          + "\001(\tB\003\340A\002\022\030\n\013description\030\002 \001(\tB\003\340A\001\022;\n\npa"
          + "rameters\030\003 \001(\0132\".google.cloud.aiplatform"
          + ".v1.SchemaB\003\340A\001\0229\n\010response\030\004 \001(\0132\".goog"
          + "le.cloud.aiplatform.v1.SchemaB\003\340A\001\"M\n\014Fu"
          + "nctionCall\022\021\n\004name\030\001 \001(\tB\003\340A\002\022*\n\004args\030\002 "
          + "\001(\0132\027.google.protobuf.StructB\003\340A\001\"U\n\020Fun"
          + "ctionResponse\022\021\n\004name\030\001 \001(\tB\003\340A\002\022.\n\010resp"
          + "onse\030\002 \001(\0132\027.google.protobuf.StructB\003\340A\002"
          + "\"\311\001\n\tRetrieval\022F\n\020vertex_ai_search\030\002 \001(\013"
          + "2*.google.cloud.aiplatform.v1.VertexAISe"
          + "archH\000\022F\n\020vertex_rag_store\030\004 \001(\0132*.googl"
          + "e.cloud.aiplatform.v1.VertexRagStoreH\000\022\""
          + "\n\023disable_attribution\030\003 \001(\010B\005\030\001\340A\001B\010\n\006so"
          + "urce\"\252\003\n\016VertexRagStore\022R\n\rrag_resources"
          + "\030\004 \003(\01326.google.cloud.aiplatform.v1.Vert"
          + "exRagStore.RagResourceB\003\340A\001\022$\n\020similarit"
          + "y_top_k\030\002 \001(\005B\005\030\001\340A\001H\000\210\001\001\022-\n\031vector_dist"
          + "ance_threshold\030\003 \001(\001B\005\030\001\340A\001H\001\210\001\001\022Q\n\024rag_"
          + "retrieval_config\030\006 \001(\0132..google.cloud.ai"
          + "platform.v1.RagRetrievalConfigB\003\340A\001\032i\n\013R"
          + "agResource\022?\n\nrag_corpus\030\001 \001(\tB+\340A\001\372A%\n#"
          + "aiplatform.googleapis.com/RagCorpus\022\031\n\014r"
          + "ag_file_ids\030\002 \003(\tB\003\340A\001B\023\n\021_similarity_to"
          + "p_kB\034\n\032_vector_distance_threshold\"(\n\016Ver"
          + "texAISearch\022\026\n\tdatastore\030\001 \001(\tB\003\340A\002\"m\n\025G"
          + "oogleSearchRetrieval\022T\n\030dynamic_retrieva"
          + "l_config\030\002 \001(\01322.google.cloud.aiplatform"
          + ".v1.DynamicRetrievalConfig\"\312\001\n\026DynamicRe"
          + "trievalConfig\022E\n\004mode\030\001 \001(\01627.google.clo"
          + "ud.aiplatform.v1.DynamicRetrievalConfig."
          + "Mode\022#\n\021dynamic_threshold\030\002 \001(\002B\003\340A\001H\000\210\001"
          + "\001\".\n\004Mode\022\024\n\020MODE_UNSPECIFIED\020\000\022\020\n\014MODE_"
          + "DYNAMIC\020\001B\024\n\022_dynamic_threshold\"e\n\nToolC"
          + "onfig\022W\n\027function_calling_config\030\001 \001(\01321"
          + ".google.cloud.aiplatform.v1.FunctionCall"
          + "ingConfigB\003\340A\001\"\302\001\n\025FunctionCallingConfig"
          + "\022I\n\004mode\030\001 \001(\01626.google.cloud.aiplatform"
          + ".v1.FunctionCallingConfig.ModeB\003\340A\001\022#\n\026a"
          + "llowed_function_names\030\002 \003(\tB\003\340A\001\"9\n\004Mode"
          + "\022\024\n\020MODE_UNSPECIFIED\020\000\022\010\n\004AUTO\020\001\022\007\n\003ANY\020"
          + "\002\022\010\n\004NONE\020\003\"\212\002\n\022RagRetrievalConfig\022\022\n\005to"
          + "p_k\030\001 \001(\005B\003\340A\001\022J\n\006filter\030\003 \001(\01325.google."
          + "cloud.aiplatform.v1.RagRetrievalConfig.F"
          + "ilterB\003\340A\001\032\223\001\n\006Filter\022(\n\031vector_distance"
          + "_threshold\030\003 \001(\001B\003\340A\001H\000\022*\n\033vector_simila"
          + "rity_threshold\030\004 \001(\001B\003\340A\001H\000\022\034\n\017metadata_"
          + "filter\030\002 \001(\tB\003\340A\001B\025\n\023vector_db_threshold"
          + "B\307\001\n\036com.google.cloud.aiplatform.v1B\tToo"
          + "lProtoP\001Z>cloud.google.com/go/aiplatform"
          + "/apiv1/aiplatformpb;aiplatformpb\252\002\032Googl"
          + "e.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIP"
          + "latform\\V1\352\002\035Google::Cloud::AIPlatform::"
          + "V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OpenApiProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Tool_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Tool_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Tool_descriptor,
            new java.lang.String[] {
              "FunctionDeclarations", "Retrieval", "GoogleSearchRetrieval",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_descriptor,
            new java.lang.String[] {
              "Name", "Description", "Parameters", "Response",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_FunctionCall_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor,
            new java.lang.String[] {
              "Name", "Args",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_FunctionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionResponse_descriptor,
            new java.lang.String[] {
              "Name", "Response",
            });
    internal_static_google_cloud_aiplatform_v1_Retrieval_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_Retrieval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Retrieval_descriptor,
            new java.lang.String[] {
              "VertexAiSearch", "VertexRagStore", "DisableAttribution", "Source",
            });
    internal_static_google_cloud_aiplatform_v1_VertexRagStore_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_VertexRagStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_VertexRagStore_descriptor,
            new java.lang.String[] {
              "RagResources", "SimilarityTopK", "VectorDistanceThreshold", "RagRetrievalConfig",
            });
    internal_static_google_cloud_aiplatform_v1_VertexRagStore_RagResource_descriptor =
        internal_static_google_cloud_aiplatform_v1_VertexRagStore_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_VertexRagStore_RagResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_VertexRagStore_RagResource_descriptor,
            new java.lang.String[] {
              "RagCorpus", "RagFileIds",
            });
    internal_static_google_cloud_aiplatform_v1_VertexAISearch_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_VertexAISearch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_VertexAISearch_descriptor,
            new java.lang.String[] {
              "Datastore",
            });
    internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_descriptor,
            new java.lang.String[] {
              "DynamicRetrievalConfig",
            });
    internal_static_google_cloud_aiplatform_v1_DynamicRetrievalConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_DynamicRetrievalConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DynamicRetrievalConfig_descriptor,
            new java.lang.String[] {
              "Mode", "DynamicThreshold",
            });
    internal_static_google_cloud_aiplatform_v1_ToolConfig_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_ToolConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ToolConfig_descriptor,
            new java.lang.String[] {
              "FunctionCallingConfig",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionCallingConfig_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_FunctionCallingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionCallingConfig_descriptor,
            new java.lang.String[] {
              "Mode", "AllowedFunctionNames",
            });
    internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_descriptor,
            new java.lang.String[] {
              "TopK", "Filter",
            });
    internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_Filter_descriptor =
        internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_Filter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RagRetrievalConfig_Filter_descriptor,
            new java.lang.String[] {
              "VectorDistanceThreshold",
              "VectorSimilarityThreshold",
              "MetadataFilter",
              "VectorDbThreshold",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OpenApiProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
