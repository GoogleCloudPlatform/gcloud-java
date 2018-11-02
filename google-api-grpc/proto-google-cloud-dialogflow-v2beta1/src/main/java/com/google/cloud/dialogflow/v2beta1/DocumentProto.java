// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/document.proto

package com.google.cloud.dialogflow.v2beta1;

public final class DocumentProto {
  private DocumentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_Document_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/dialogflow/v2beta1/docume" +
      "nt.proto\022\037google.cloud.dialogflow.v2beta" +
      "1\032\034google/api/annotations.proto\032#google/" +
      "longrunning/operations.proto\032\033google/pro" +
      "tobuf/empty.proto\032 google/protobuf/field" +
      "_mask.proto\"\224\002\n\010Document\022\014\n\004name\030\001 \001(\t\022\024" +
      "\n\014display_name\030\002 \001(\t\022\021\n\tmime_type\030\003 \001(\t\022" +
      "P\n\017knowledge_types\030\004 \003(\01627.google.cloud." +
      "dialogflow.v2beta1.Document.KnowledgeTyp" +
      "e\022\025\n\013content_uri\030\005 \001(\tH\000\022\021\n\007content\030\006 \001(" +
      "\tH\000\"K\n\rKnowledgeType\022\036\n\032KNOWLEDGE_TYPE_U" +
      "NSPECIFIED\020\000\022\007\n\003FAQ\020\001\022\021\n\rEXTRACTIVE_QA\020\002" +
      "B\010\n\006source\"M\n\024ListDocumentsRequest\022\016\n\006pa" +
      "rent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_to" +
      "ken\030\003 \001(\t\"n\n\025ListDocumentsResponse\022<\n\tdo" +
      "cuments\030\001 \003(\0132).google.cloud.dialogflow." +
      "v2beta1.Document\022\027\n\017next_page_token\030\002 \001(" +
      "\t\"\"\n\022GetDocumentRequest\022\014\n\004name\030\001 \001(\t\"d\n" +
      "\025CreateDocumentRequest\022\016\n\006parent\030\001 \001(\t\022;" +
      "\n\010document\030\002 \001(\0132).google.cloud.dialogfl" +
      "ow.v2beta1.Document\"%\n\025DeleteDocumentReq" +
      "uest\022\014\n\004name\030\001 \001(\t\"\262\001\n\032KnowledgeOperatio" +
      "nMetadata\022P\n\005state\030\001 \001(\0162A.google.cloud." +
      "dialogflow.v2beta1.KnowledgeOperationMet" +
      "adata.State\"B\n\005State\022\025\n\021STATE_UNSPECIFIE" +
      "D\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\010\n\004DONE\020\0032" +
      "\361\007\n\tDocuments\022\201\002\n\rListDocuments\0225.google" +
      ".cloud.dialogflow.v2beta1.ListDocumentsR" +
      "equest\0326.google.cloud.dialogflow.v2beta1" +
      ".ListDocumentsResponse\"\200\001\202\323\344\223\002z\0227/v2beta" +
      "1/{parent=projects/*/knowledgeBases/*}/d" +
      "ocumentsZ?\022=/v2beta1/{parent=projects/*/" +
      "agent/knowledgeBases/*}/documents\022\360\001\n\013Ge" +
      "tDocument\0223.google.cloud.dialogflow.v2be" +
      "ta1.GetDocumentRequest\032).google.cloud.di" +
      "alogflow.v2beta1.Document\"\200\001\202\323\344\223\002z\0227/v2b" +
      "eta1/{name=projects/*/knowledgeBases/*/d" +
      "ocuments/*}Z?\022=/v2beta1/{name=projects/*" +
      "/agent/knowledgeBases/*/documents/*}\022\377\001\n" +
      "\016CreateDocument\0226.google.cloud.dialogflo" +
      "w.v2beta1.CreateDocumentRequest\032\035.google" +
      ".longrunning.Operation\"\225\001\202\323\344\223\002\216\001\"7/v2bet" +
      "a1/{parent=projects/*/knowledgeBases/*}/" +
      "documents:\010documentZI\"=/v2beta1/{parent=" +
      "projects/*/agent/knowledgeBases/*}/docum" +
      "ents:\010document\022\352\001\n\016DeleteDocument\0226.goog" +
      "le.cloud.dialogflow.v2beta1.DeleteDocume" +
      "ntRequest\032\035.google.longrunning.Operation" +
      "\"\200\001\202\323\344\223\002z*7/v2beta1/{name=projects/*/kno" +
      "wledgeBases/*/documents/*}Z?*=/v2beta1/{" +
      "name=projects/*/agent/knowledgeBases/*/d" +
      "ocuments/*}B\253\001\n#com.google.cloud.dialogf" +
      "low.v2beta1B\rDocumentProtoP\001ZIgoogle.gol" +
      "ang.org/genproto/googleapis/cloud/dialog" +
      "flow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google" +
      ".Cloud.Dialogflow.V2beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_dialogflow_v2beta1_Document_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_Document_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "MimeType", "KnowledgeTypes", "ContentUri", "Content", "Source", });
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_descriptor,
        new java.lang.String[] { "Documents", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_descriptor,
        new java.lang.String[] { "Parent", "Document", });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor,
        new java.lang.String[] { "State", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
