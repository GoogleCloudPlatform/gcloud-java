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
// source: google/cloud/aiplatform/v1/persistent_resource_service.proto

package com.google.cloud.aiplatform.v1;

public final class PersistentResourceServiceProto {
  private PersistentResourceServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreatePersistentResourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreatePersistentResourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreatePersistentResourceOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreatePersistentResourceOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdatePersistentResourceOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdatePersistentResourceOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RebootPersistentResourceOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RebootPersistentResourceOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetPersistentResourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetPersistentResourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListPersistentResourcesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListPersistentResourcesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListPersistentResourcesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListPersistentResourcesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeletePersistentResourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeletePersistentResourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdatePersistentResourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdatePersistentResourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RebootPersistentResourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RebootPersistentResourceRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/aiplatform/v1/persistent_"
          + "resource_service.proto\022\032google.cloud.aip"
          + "latform.v1\032\034google/api/annotations.proto"
          + "\032\027google/api/client.proto\032\037google/api/fi"
          + "eld_behavior.proto\032\031google/api/resource."
          + "proto\032*google/cloud/aiplatform/v1/operat"
          + "ion.proto\0324google/cloud/aiplatform/v1/pe"
          + "rsistent_resource.proto\032#google/longrunn"
          + "ing/operations.proto\032\033google/protobuf/em"
          + "pty.proto\032 google/protobuf/field_mask.pr"
          + "oto\"\323\001\n\037CreatePersistentResourceRequest\022"
          + "9\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.googl"
          + "eapis.com/Location\022P\n\023persistent_resourc"
          + "e\030\002 \001(\0132..google.cloud.aiplatform.v1.Per"
          + "sistentResourceB\003\340A\002\022#\n\026persistent_resou"
          + "rce_id\030\003 \001(\tB\003\340A\002\"\225\001\n)CreatePersistentRe"
          + "sourceOperationMetadata\022N\n\020generic_metad"
          + "ata\030\001 \001(\01324.google.cloud.aiplatform.v1.G"
          + "enericOperationMetadata\022\030\n\020progress_mess"
          + "age\030\002 \001(\t\"\225\001\n)UpdatePersistentResourceOp"
          + "erationMetadata\022N\n\020generic_metadata\030\001 \001("
          + "\01324.google.cloud.aiplatform.v1.GenericOp"
          + "erationMetadata\022\030\n\020progress_message\030\002 \001("
          + "\t\"\225\001\n)RebootPersistentResourceOperationM"
          + "etadata\022N\n\020generic_metadata\030\001 \001(\01324.goog"
          + "le.cloud.aiplatform.v1.GenericOperationM"
          + "etadata\022\030\n\020progress_message\030\002 \001(\t\"b\n\034Get"
          + "PersistentResourceRequest\022B\n\004name\030\001 \001(\tB"
          + "4\340A\002\372A.\n,aiplatform.googleapis.com/Persi"
          + "stentResource\"\214\001\n\036ListPersistentResource"
          + "sRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locati"
          + "ons.googleapis.com/Location\022\026\n\tpage_size"
          + "\030\003 \001(\005B\003\340A\001\022\027\n\npage_token\030\004 \001(\tB\003\340A\001\"\210\001\n"
          + "\037ListPersistentResourcesResponse\022L\n\024pers"
          + "istent_resources\030\001 \003(\0132..google.cloud.ai"
          + "platform.v1.PersistentResource\022\027\n\017next_p"
          + "age_token\030\002 \001(\t\"e\n\037DeletePersistentResou"
          + "rceRequest\022B\n\004name\030\001 \001(\tB4\340A\002\372A.\n,aiplat"
          + "form.googleapis.com/PersistentResource\"\251"
          + "\001\n\037UpdatePersistentResourceRequest\022P\n\023pe"
          + "rsistent_resource\030\001 \001(\0132..google.cloud.a"
          + "iplatform.v1.PersistentResourceB\003\340A\002\0224\n\013"
          + "update_mask\030\002 \001(\0132\032.google.protobuf.Fiel"
          + "dMaskB\003\340A\002\"e\n\037RebootPersistentResourceRe"
          + "quest\022B\n\004name\030\001 \001(\tB4\340A\002\372A.\n,aiplatform."
          + "googleapis.com/PersistentResource2\245\r\n\031Pe"
          + "rsistentResourceService\022\303\002\n\030CreatePersis"
          + "tentResource\022;.google.cloud.aiplatform.v"
          + "1.CreatePersistentResourceRequest\032\035.goog"
          + "le.longrunning.Operation\"\312\001\312A?\n\022Persiste"
          + "ntResource\022)CreatePersistentResourceOper"
          + "ationMetadata\332A1parent,persistent_resour"
          + "ce,persistent_resource_id\202\323\344\223\002N\"7/v1/{pa"
          + "rent=projects/*/locations/*}/persistentR"
          + "esources:\023persistent_resource\022\311\001\n\025GetPer"
          + "sistentResource\0228.google.cloud.aiplatfor"
          + "m.v1.GetPersistentResourceRequest\032..goog"
          + "le.cloud.aiplatform.v1.PersistentResourc"
          + "e\"F\332A\004name\202\323\344\223\0029\0227/v1/{name=projects/*/l"
          + "ocations/*/persistentResources/*}\022\334\001\n\027Li"
          + "stPersistentResources\022:.google.cloud.aip"
          + "latform.v1.ListPersistentResourcesReques"
          + "t\032;.google.cloud.aiplatform.v1.ListPersi"
          + "stentResourcesResponse\"H\332A\006parent\202\323\344\223\0029\022"
          + "7/v1/{parent=projects/*/locations/*}/per"
          + "sistentResources\022\361\001\n\030DeletePersistentRes"
          + "ource\022;.google.cloud.aiplatform.v1.Delet"
          + "ePersistentResourceRequest\032\035.google.long"
          + "running.Operation\"y\312A0\n\025google.protobuf."
          + "Empty\022\027DeleteOperationMetadata\332A\004name\202\323\344"
          + "\223\0029*7/v1/{name=projects/*/locations/*/pe"
          + "rsistentResources/*}\022\305\002\n\030UpdatePersisten"
          + "tResource\022;.google.cloud.aiplatform.v1.U"
          + "pdatePersistentResourceRequest\032\035.google."
          + "longrunning.Operation\"\314\001\312A?\n\022PersistentR"
          + "esource\022)UpdatePersistentResourceOperati"
          + "onMetadata\332A\037persistent_resource,update_"
          + "mask\202\323\344\223\002b2K/v1/{persistent_resource.nam"
          + "e=projects/*/locations/*/persistentResou"
          + "rces/*}:\023persistent_resource\022\213\002\n\030RebootP"
          + "ersistentResource\022;.google.cloud.aiplatf"
          + "orm.v1.RebootPersistentResourceRequest\032\035"
          + ".google.longrunning.Operation\"\222\001\312A?\n\022Per"
          + "sistentResource\022)RebootPersistentResourc"
          + "eOperationMetadata\332A\004name\202\323\344\223\002C\">/v1/{na"
          + "me=projects/*/locations/*/persistentReso"
          + "urces/*}:reboot:\001*\032M\312A\031aiplatform.google"
          + "apis.com\322A.https://www.googleapis.com/au"
          + "th/cloud-platformB\334\001\n\036com.google.cloud.a"
          + "iplatform.v1B\036PersistentResourceServiceP"
          + "rotoP\001Z>cloud.google.com/go/aiplatform/a"
          + "piv1/aiplatformpb;aiplatformpb\252\002\032Google."
          + "Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPla"
          + "tform\\V1\352\002\035Google::Cloud::AIPlatform::V1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.PersistentResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CreatePersistentResourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreatePersistentResourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreatePersistentResourceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PersistentResource", "PersistentResourceId",
            });
    internal_static_google_cloud_aiplatform_v1_CreatePersistentResourceOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreatePersistentResourceOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreatePersistentResourceOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "ProgressMessage",
            });
    internal_static_google_cloud_aiplatform_v1_UpdatePersistentResourceOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_UpdatePersistentResourceOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdatePersistentResourceOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "ProgressMessage",
            });
    internal_static_google_cloud_aiplatform_v1_RebootPersistentResourceOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_RebootPersistentResourceOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RebootPersistentResourceOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "ProgressMessage",
            });
    internal_static_google_cloud_aiplatform_v1_GetPersistentResourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_GetPersistentResourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetPersistentResourceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListPersistentResourcesRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_ListPersistentResourcesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListPersistentResourcesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1_ListPersistentResourcesResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_ListPersistentResourcesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListPersistentResourcesResponse_descriptor,
            new java.lang.String[] {
              "PersistentResources", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_DeletePersistentResourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_DeletePersistentResourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeletePersistentResourceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_UpdatePersistentResourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_UpdatePersistentResourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdatePersistentResourceRequest_descriptor,
            new java.lang.String[] {
              "PersistentResource", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1_RebootPersistentResourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_RebootPersistentResourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RebootPersistentResourceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PersistentResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
