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
// source: google/cloud/aiplatform/v1/feature_registry_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public final class FeatureRegistryServiceProto {
  private FeatureRegistryServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateFeatureGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateFeatureGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetFeatureGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetFeatureGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateFeatureGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateFeatureGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeleteFeatureGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteFeatureGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateFeatureGroupOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateFeatureGroupOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateFeatureGroupOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateFeatureGroupOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateRegistryFeatureOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateRegistryFeatureOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateFeatureOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateFeatureOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/aiplatform/v1/feature_reg"
          + "istry_service.proto\022\032google.cloud.aiplat"
          + "form.v1\032\034google/api/annotations.proto\032\027g"
          + "oogle/api/client.proto\032\037google/api/field"
          + "_behavior.proto\032\031google/api/resource.pro"
          + "to\032(google/cloud/aiplatform/v1/feature.p"
          + "roto\032.google/cloud/aiplatform/v1/feature"
          + "_group.proto\0325google/cloud/aiplatform/v1"
          + "/featurestore_service.proto\032*google/clou"
          + "d/aiplatform/v1/operation.proto\032#google/"
          + "longrunning/operations.proto\032\033google/pro"
          + "tobuf/empty.proto\032 google/protobuf/field"
          + "_mask.proto\"\300\001\n\031CreateFeatureGroupReques"
          + "t\022>\n\006parent\030\001 \001(\tB.\340A\002\372A(\022&aiplatform.go"
          + "ogleapis.com/FeatureGroup\022D\n\rfeature_gro"
          + "up\030\002 \001(\0132(.google.cloud.aiplatform.v1.Fe"
          + "atureGroupB\003\340A\002\022\035\n\020feature_group_id\030\003 \001("
          + "\tB\003\340A\002\"V\n\026GetFeatureGroupRequest\022<\n\004name"
          + "\030\001 \001(\tB.\340A\002\372A(\n&aiplatform.googleapis.co"
          + "m/FeatureGroup\"\243\001\n\030ListFeatureGroupsRequ"
          + "est\022>\n\006parent\030\001 \001(\tB.\340A\002\372A(\022&aiplatform."
          + "googleapis.com/FeatureGroup\022\016\n\006filter\030\002 "
          + "\001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001"
          + "(\t\022\020\n\010order_by\030\005 \001(\t\"v\n\031ListFeatureGroup"
          + "sResponse\022@\n\016feature_groups\030\001 \003(\0132(.goog"
          + "le.cloud.aiplatform.v1.FeatureGroup\022\027\n\017n"
          + "ext_page_token\030\002 \001(\t\"\222\001\n\031UpdateFeatureGr"
          + "oupRequest\022D\n\rfeature_group\030\001 \001(\0132(.goog"
          + "le.cloud.aiplatform.v1.FeatureGroupB\003\340A\002"
          + "\022/\n\013update_mask\030\002 \001(\0132\032.google.protobuf."
          + "FieldMask\"h\n\031DeleteFeatureGroupRequest\022<"
          + "\n\004name\030\001 \001(\tB.\340A\002\372A(\n&aiplatform.googlea"
          + "pis.com/FeatureGroup\022\r\n\005force\030\002 \001(\010\"u\n#C"
          + "reateFeatureGroupOperationMetadata\022N\n\020ge"
          + "neric_metadata\030\001 \001(\01324.google.cloud.aipl"
          + "atform.v1.GenericOperationMetadata\"u\n#Up"
          + "dateFeatureGroupOperationMetadata\022N\n\020gen"
          + "eric_metadata\030\001 \001(\01324.google.cloud.aipla"
          + "tform.v1.GenericOperationMetadata\"x\n&Cre"
          + "ateRegistryFeatureOperationMetadata\022N\n\020g"
          + "eneric_metadata\030\001 \001(\01324.google.cloud.aip"
          + "latform.v1.GenericOperationMetadata\"p\n\036U"
          + "pdateFeatureOperationMetadata\022N\n\020generic"
          + "_metadata\030\001 \001(\01324.google.cloud.aiplatfor"
          + "m.v1.GenericOperationMetadata2\343\024\n\026Featur"
          + "eRegistryService\022\223\002\n\022CreateFeatureGroup\022"
          + "5.google.cloud.aiplatform.v1.CreateFeatu"
          + "reGroupRequest\032\035.google.longrunning.Oper"
          + "ation\"\246\001\312A3\n\014FeatureGroup\022#CreateFeature"
          + "GroupOperationMetadata\332A%parent,feature_"
          + "group,feature_group_id\202\323\344\223\002B\"1/v1/{paren"
          + "t=projects/*/locations/*}/featureGroups:"
          + "\rfeature_group\022\261\001\n\017GetFeatureGroup\0222.goo"
          + "gle.cloud.aiplatform.v1.GetFeatureGroupR"
          + "equest\032(.google.cloud.aiplatform.v1.Feat"
          + "ureGroup\"@\332A\004name\202\323\344\223\0023\0221/v1/{name=proje"
          + "cts/*/locations/*/featureGroups/*}\022\304\001\n\021L"
          + "istFeatureGroups\0224.google.cloud.aiplatfo"
          + "rm.v1.ListFeatureGroupsRequest\0325.google."
          + "cloud.aiplatform.v1.ListFeatureGroupsRes"
          + "ponse\"B\332A\006parent\202\323\344\223\0023\0221/v1/{parent=proj"
          + "ects/*/locations/*}/featureGroups\022\225\002\n\022Up"
          + "dateFeatureGroup\0225.google.cloud.aiplatfo"
          + "rm.v1.UpdateFeatureGroupRequest\032\035.google"
          + ".longrunning.Operation\"\250\001\312A3\n\014FeatureGro"
          + "up\022#UpdateFeatureGroupOperationMetadata\332"
          + "A\031feature_group,update_mask\202\323\344\223\002P2?/v1/{"
          + "feature_group.name=projects/*/locations/"
          + "*/featureGroups/*}:\rfeature_group\022\345\001\n\022De"
          + "leteFeatureGroup\0225.google.cloud.aiplatfo"
          + "rm.v1.DeleteFeatureGroupRequest\032\035.google"
          + ".longrunning.Operation\"y\312A0\n\025google.prot"
          + "obuf.Empty\022\027DeleteOperationMetadata\332A\nna"
          + "me,force\202\323\344\223\0023*1/v1/{name=projects/*/loc"
          + "ations/*/featureGroups/*}\022\370\001\n\rCreateFeat"
          + "ure\0220.google.cloud.aiplatform.v1.CreateF"
          + "eatureRequest\032\035.google.longrunning.Opera"
          + "tion\"\225\001\312A)\n\007Feature\022\036CreateFeatureOperat"
          + "ionMetadata\332A\031parent,feature,feature_id\202"
          + "\323\344\223\002G\"</v1/{parent=projects/*/locations/"
          + "*/featureGroups/*}/features:\007feature\022\232\002\n"
          + "\023BatchCreateFeatures\0226.google.cloud.aipl"
          + "atform.v1.BatchCreateFeaturesRequest\032\035.g"
          + "oogle.longrunning.Operation\"\253\001\312AC\n\033Batch"
          + "CreateFeaturesResponse\022$BatchCreateFeatu"
          + "resOperationMetadata\332A\017parent,requests\202\323"
          + "\344\223\002M\"H/v1/{parent=projects/*/locations/*"
          + "/featureGroups/*}/features:batchCreate:\001"
          + "*\022\255\001\n\nGetFeature\022-.google.cloud.aiplatfo"
          + "rm.v1.GetFeatureRequest\032#.google.cloud.a"
          + "iplatform.v1.Feature\"K\332A\004name\202\323\344\223\002>\022</v1"
          + "/{name=projects/*/locations/*/featureGro"
          + "ups/*/features/*}\022\300\001\n\014ListFeatures\022/.goo"
          + "gle.cloud.aiplatform.v1.ListFeaturesRequ"
          + "est\0320.google.cloud.aiplatform.v1.ListFea"
          + "turesResponse\"M\332A\006parent\202\323\344\223\002>\022</v1/{par"
          + "ent=projects/*/locations/*/featureGroups"
          + "/*}/features\022\372\001\n\rUpdateFeature\0220.google."
          + "cloud.aiplatform.v1.UpdateFeatureRequest"
          + "\032\035.google.longrunning.Operation\"\227\001\312A)\n\007F"
          + "eature\022\036UpdateFeatureOperationMetadata\332A"
          + "\023feature,update_mask\202\323\344\223\002O2D/v1/{feature"
          + ".name=projects/*/locations/*/featureGrou"
          + "ps/*/features/*}:\007feature\022\340\001\n\rDeleteFeat"
          + "ure\0220.google.cloud.aiplatform.v1.DeleteF"
          + "eatureRequest\032\035.google.longrunning.Opera"
          + "tion\"~\312A0\n\025google.protobuf.Empty\022\027Delete"
          + "OperationMetadata\332A\004name\202\323\344\223\002>*</v1/{nam"
          + "e=projects/*/locations/*/featureGroups/*"
          + "/features/*}\032M\312A\031aiplatform.googleapis.c"
          + "om\322A.https://www.googleapis.com/auth/clo"
          + "ud-platformB\331\001\n\036com.google.cloud.aiplatf"
          + "orm.v1B\033FeatureRegistryServiceProtoP\001Z>c"
          + "loud.google.com/go/aiplatform/apiv1/aipl"
          + "atformpb;aiplatformpb\252\002\032Google.Cloud.AIP"
          + "latform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352"
          + "\002\035Google::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.FeatureProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.FeatureGroupProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.FeaturestoreServiceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CreateFeatureGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateFeatureGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateFeatureGroupRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FeatureGroup", "FeatureGroupId",
            });
    internal_static_google_cloud_aiplatform_v1_GetFeatureGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_GetFeatureGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetFeatureGroupRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "OrderBy",
            });
    internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsResponse_descriptor,
            new java.lang.String[] {
              "FeatureGroups", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateFeatureGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_UpdateFeatureGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateFeatureGroupRequest_descriptor,
            new java.lang.String[] {
              "FeatureGroup", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1_DeleteFeatureGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_DeleteFeatureGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeleteFeatureGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_aiplatform_v1_CreateFeatureGroupOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_CreateFeatureGroupOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateFeatureGroupOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateFeatureGroupOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_UpdateFeatureGroupOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateFeatureGroupOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_CreateRegistryFeatureOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_CreateRegistryFeatureOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateRegistryFeatureOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateFeatureOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_UpdateFeatureOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateFeatureOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
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
    com.google.cloud.aiplatform.v1.FeatureProto.getDescriptor();
    com.google.cloud.aiplatform.v1.FeatureGroupProto.getDescriptor();
    com.google.cloud.aiplatform.v1.FeaturestoreServiceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
