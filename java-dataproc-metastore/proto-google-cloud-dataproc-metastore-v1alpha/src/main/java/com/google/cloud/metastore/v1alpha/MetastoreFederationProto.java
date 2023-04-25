/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/metastore/v1alpha/metastore_federation.proto

package com.google.cloud.metastore.v1alpha;

public final class MetastoreFederationProto {
  private MetastoreFederationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1alpha_Federation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1alpha_Federation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1alpha_Federation_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1alpha_Federation_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1alpha_Federation_BackendMetastoresEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1alpha_Federation_BackendMetastoresEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1alpha_BackendMetastore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1alpha_BackendMetastore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1alpha_ListFederationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1alpha_ListFederationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1alpha_ListFederationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1alpha_ListFederationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1alpha_GetFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1alpha_GetFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1alpha_CreateFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1alpha_CreateFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1alpha_UpdateFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1alpha_UpdateFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1alpha_DeleteFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1alpha_DeleteFederationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/metastore/v1alpha/metasto"
          + "re_federation.proto\022\036google.cloud.metast"
          + "ore.v1alpha\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032.google/cloud/metastore/v1alpha/m"
          + "etastore.proto\032#google/longrunning/opera"
          + "tions.proto\032\033google/protobuf/empty.proto"
          + "\032 google/protobuf/field_mask.proto\032\037goog"
          + "le/protobuf/timestamp.proto\"\277\006\n\nFederati"
          + "on\022\021\n\004name\030\001 \001(\tB\003\340A\005\0224\n\013create_time\030\002 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013u"
          + "pdate_time\030\003 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022F\n\006labels\030\004 \003(\01326.google.cloud"
          + ".metastore.v1alpha.Federation.LabelsEntr"
          + "y\022\024\n\007version\030\005 \001(\tB\003\340A\005\022]\n\022backend_metas"
          + "tores\030\006 \003(\0132A.google.cloud.metastore.v1a"
          + "lpha.Federation.BackendMetastoresEntry\022\031"
          + "\n\014endpoint_uri\030\007 \001(\tB\003\340A\003\022D\n\005state\030\010 \001(\016"
          + "20.google.cloud.metastore.v1alpha.Federa"
          + "tion.StateB\003\340A\003\022\032\n\rstate_message\030\t \001(\tB\003"
          + "\340A\003\022\020\n\003uid\030\n \001(\tB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032j\n\026BackendM"
          + "etastoresEntry\022\013\n\003key\030\001 \001(\005\022?\n\005value\030\002 \001"
          + "(\01320.google.cloud.metastore.v1alpha.Back"
          + "endMetastore:\0028\001\"_\n\005State\022\025\n\021STATE_UNSPE"
          + "CIFIED\020\000\022\014\n\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010UP"
          + "DATING\020\003\022\014\n\010DELETING\020\004\022\t\n\005ERROR\020\005:j\352Ag\n#"
          + "metastore.googleapis.com/Federation\022@pro"
          + "jects/{project}/locations/{location}/fed"
          + "erations/{federation}\"\335\001\n\020BackendMetasto"
          + "re\022\014\n\004name\030\001 \001(\t\022V\n\016metastore_type\030\002 \001(\016"
          + "2>.google.cloud.metastore.v1alpha.Backen"
          + "dMetastore.MetastoreType\"c\n\rMetastoreTyp"
          + "e\022\036\n\032METASTORE_TYPE_UNSPECIFIED\020\000\022\014\n\010DAT"
          + "APLEX\020\001\022\014\n\010BIGQUERY\020\002\022\026\n\022DATAPROC_METAST"
          + "ORE\020\003\"\262\001\n\026ListFederationsRequest\022;\n\006pare"
          + "nt\030\001 \001(\tB+\340A\002\372A%\022#metastore.googleapis.c"
          + "om/Federation\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n"
          + "\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003"
          + "\340A\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\"\210\001\n\027ListFeder"
          + "ationsResponse\022?\n\013federations\030\001 \003(\0132*.go"
          + "ogle.cloud.metastore.v1alpha.Federation\022"
          + "\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachable\030"
          + "\003 \003(\t\"Q\n\024GetFederationRequest\0229\n\004name\030\001 "
          + "\001(\tB+\340A\002\372A%\n#metastore.googleapis.com/Fe"
          + "deration\"\320\001\n\027CreateFederationRequest\022;\n\006"
          + "parent\030\001 \001(\tB+\340A\002\372A%\022#metastore.googleap"
          + "is.com/Federation\022\032\n\rfederation_id\030\002 \001(\t"
          + "B\003\340A\002\022C\n\nfederation\030\003 \001(\0132*.google.cloud"
          + ".metastore.v1alpha.FederationB\003\340A\002\022\027\n\nre"
          + "quest_id\030\004 \001(\tB\003\340A\001\"\255\001\n\027UpdateFederation"
          + "Request\0224\n\013update_mask\030\001 \001(\0132\032.google.pr"
          + "otobuf.FieldMaskB\003\340A\002\022C\n\nfederation\030\002 \001("
          + "\0132*.google.cloud.metastore.v1alpha.Feder"
          + "ationB\003\340A\002\022\027\n\nrequest_id\030\003 \001(\tB\003\340A\001\"m\n\027D"
          + "eleteFederationRequest\0229\n\004name\030\001 \001(\tB+\340A"
          + "\002\372A%\n#metastore.googleapis.com/Federatio"
          + "n\022\027\n\nrequest_id\030\002 \001(\tB\003\340A\0012\247\n\n\033DataprocM"
          + "etastoreFederation\022\311\001\n\017ListFederations\0226"
          + ".google.cloud.metastore.v1alpha.ListFede"
          + "rationsRequest\0327.google.cloud.metastore."
          + "v1alpha.ListFederationsResponse\"E\202\323\344\223\0026\022"
          + "4/v1alpha/{parent=projects/*/locations/*"
          + "}/federations\332A\006parent\022\266\001\n\rGetFederation"
          + "\0224.google.cloud.metastore.v1alpha.GetFed"
          + "erationRequest\032*.google.cloud.metastore."
          + "v1alpha.Federation\"C\202\323\344\223\0026\0224/v1alpha/{na"
          + "me=projects/*/locations/*/federations/*}"
          + "\332A\004name\022\230\002\n\020CreateFederation\0227.google.cl"
          + "oud.metastore.v1alpha.CreateFederationRe"
          + "quest\032\035.google.longrunning.Operation\"\253\001\202"
          + "\323\344\223\002B\"4/v1alpha/{parent=projects/*/locat"
          + "ions/*}/federations:\nfederation\332A\037parent"
          + ",federation,federation_id\312A>\n\nFederation"
          + "\0220google.cloud.metastore.v1alpha.Operati"
          + "onMetadata\022\232\002\n\020UpdateFederation\0227.google"
          + ".cloud.metastore.v1alpha.UpdateFederatio"
          + "nRequest\032\035.google.longrunning.Operation\""
          + "\255\001\202\323\344\223\002M2?/v1alpha/{federation.name=proj"
          + "ects/*/locations/*/federations/*}:\nfeder"
          + "ation\332A\026federation,update_mask\312A>\n\nFeder"
          + "ation\0220google.cloud.metastore.v1alpha.Op"
          + "erationMetadata\022\374\001\n\020DeleteFederation\0227.g"
          + "oogle.cloud.metastore.v1alpha.DeleteFede"
          + "rationRequest\032\035.google.longrunning.Opera"
          + "tion\"\217\001\202\323\344\223\0026*4/v1alpha/{name=projects/*"
          + "/locations/*/federations/*}\332A\004name\312AI\n\025g"
          + "oogle.protobuf.Empty\0220google.cloud.metas"
          + "tore.v1alpha.OperationMetadata\032L\312A\030metas"
          + "tore.googleapis.com\322A.https://www.google"
          + "apis.com/auth/cloud-platformB\202\001\n\"com.goo"
          + "gle.cloud.metastore.v1alphaB\030MetastoreFe"
          + "derationProtoP\001Z@cloud.google.com/go/met"
          + "astore/apiv1alpha/metastorepb;metastorep"
          + "bb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.metastore.v1alpha.MetastoreProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_metastore_v1alpha_Federation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_metastore_v1alpha_Federation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1alpha_Federation_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Version",
              "BackendMetastores",
              "EndpointUri",
              "State",
              "StateMessage",
              "Uid",
            });
    internal_static_google_cloud_metastore_v1alpha_Federation_LabelsEntry_descriptor =
        internal_static_google_cloud_metastore_v1alpha_Federation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_metastore_v1alpha_Federation_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1alpha_Federation_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_metastore_v1alpha_Federation_BackendMetastoresEntry_descriptor =
        internal_static_google_cloud_metastore_v1alpha_Federation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_metastore_v1alpha_Federation_BackendMetastoresEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1alpha_Federation_BackendMetastoresEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_metastore_v1alpha_BackendMetastore_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_metastore_v1alpha_BackendMetastore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1alpha_BackendMetastore_descriptor,
            new java.lang.String[] {
              "Name", "MetastoreType",
            });
    internal_static_google_cloud_metastore_v1alpha_ListFederationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_metastore_v1alpha_ListFederationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1alpha_ListFederationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_metastore_v1alpha_ListFederationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_metastore_v1alpha_ListFederationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1alpha_ListFederationsResponse_descriptor,
            new java.lang.String[] {
              "Federations", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_metastore_v1alpha_GetFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_metastore_v1alpha_GetFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1alpha_GetFederationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_metastore_v1alpha_CreateFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_metastore_v1alpha_CreateFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1alpha_CreateFederationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FederationId", "Federation", "RequestId",
            });
    internal_static_google_cloud_metastore_v1alpha_UpdateFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_metastore_v1alpha_UpdateFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1alpha_UpdateFederationRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Federation", "RequestId",
            });
    internal_static_google_cloud_metastore_v1alpha_DeleteFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_metastore_v1alpha_DeleteFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1alpha_DeleteFederationRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
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
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.metastore.v1alpha.MetastoreProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
