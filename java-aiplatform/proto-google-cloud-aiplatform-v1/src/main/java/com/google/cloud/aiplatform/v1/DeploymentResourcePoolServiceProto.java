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
// source: google/cloud/aiplatform/v1/deployment_resource_pool_service.proto

package com.google.cloud.aiplatform.v1;

public final class DeploymentResourcePoolServiceProto {
  private DeploymentResourcePoolServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/aiplatform/v1/deployment_"
          + "resource_pool_service.proto\022\032google.clou"
          + "d.aiplatform.v1\032\034google/api/annotations."
          + "proto\032\027google/api/client.proto\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\0323google/cloud/aiplatform/v1/d"
          + "eployed_model_ref.proto\0329google/cloud/ai"
          + "platform/v1/deployment_resource_pool.pro"
          + "to\032)google/cloud/aiplatform/v1/endpoint."
          + "proto\032*google/cloud/aiplatform/v1/operat"
          + "ion.proto\032#google/longrunning/operations"
          + ".proto\032\033google/protobuf/empty.proto\032 goo"
          + "gle/protobuf/field_mask.proto\"\345\001\n#Create"
          + "DeploymentResourcePoolRequest\0229\n\006parent\030"
          + "\001 \001(\tB)\340A\002\372A#\n!locations.googleapis.com/"
          + "Location\022Y\n\030deployment_resource_pool\030\002 \001"
          + "(\01322.google.cloud.aiplatform.v1.Deployme"
          + "ntResourcePoolB\003\340A\002\022(\n\033deployment_resour"
          + "ce_pool_id\030\003 \001(\tB\003\340A\002\"\177\n-CreateDeploymen"
          + "tResourcePoolOperationMetadata\022N\n\020generi"
          + "c_metadata\030\001 \001(\01324.google.cloud.aiplatfo"
          + "rm.v1.GenericOperationMetadata\"j\n GetDep"
          + "loymentResourcePoolRequest\022F\n\004name\030\001 \001(\t"
          + "B8\340A\002\372A2\n0aiplatform.googleapis.com/Depl"
          + "oymentResourcePool\"\206\001\n\"ListDeploymentRes"
          + "ourcePoolsRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A"
          + "#\022!locations.googleapis.com/Location\022\021\n\t"
          + "page_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\225\001\n#"
          + "ListDeploymentResourcePoolsResponse\022U\n\031d"
          + "eployment_resource_pools\030\001 \003(\01322.google."
          + "cloud.aiplatform.v1.DeploymentResourcePo"
          + "ol\022\027\n\017next_page_token\030\002 \001(\t\"\266\001\n#UpdateDe"
          + "ploymentResourcePoolRequest\022Y\n\030deploymen"
          + "t_resource_pool\030\001 \001(\01322.google.cloud.aip"
          + "latform.v1.DeploymentResourcePoolB\003\340A\002\0224"
          + "\n\013update_mask\030\002 \001(\0132\032.google.protobuf.Fi"
          + "eldMaskB\003\340A\002\"\177\n-UpdateDeploymentResource"
          + "PoolOperationMetadata\022N\n\020generic_metadat"
          + "a\030\001 \001(\01324.google.cloud.aiplatform.v1.Gen"
          + "ericOperationMetadata\"m\n#DeleteDeploymen"
          + "tResourcePoolRequest\022F\n\004name\030\001 \001(\tB8\340A\002\372"
          + "A2\n0aiplatform.googleapis.com/Deployment"
          + "ResourcePool\"j\n\032QueryDeployedModelsReque"
          + "st\022%\n\030deployment_resource_pool\030\001 \001(\tB\003\340A"
          + "\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t"
          + "\"\213\002\n\033QueryDeployedModelsResponse\022F\n\017depl"
          + "oyed_models\030\001 \003(\0132).google.cloud.aiplatf"
          + "orm.v1.DeployedModelB\002\030\001\022\027\n\017next_page_to"
          + "ken\030\002 \001(\t\022I\n\023deployed_model_refs\030\003 \003(\0132,"
          + ".google.cloud.aiplatform.v1.DeployedMode"
          + "lRef\022\"\n\032total_deployed_model_count\030\004 \001(\005"
          + "\022\034\n\024total_endpoint_count\030\005 \001(\0052\210\016\n\035Deplo"
          + "ymentResourcePoolService\022\317\002\n\034CreateDeplo"
          + "ymentResourcePool\022?.google.cloud.aiplatf"
          + "orm.v1.CreateDeploymentResourcePoolReque"
          + "st\032\035.google.longrunning.Operation\"\316\001\312AG\n"
          + "\026DeploymentResourcePool\022-CreateDeploymen"
          + "tResourcePoolOperationMetadata\332A;parent,"
          + "deployment_resource_pool,deployment_reso"
          + "urce_pool_id\202\323\344\223\002@\";/v1/{parent=projects"
          + "/*/locations/*}/deploymentResourcePools:"
          + "\001*\022\331\001\n\031GetDeploymentResourcePool\022<.googl"
          + "e.cloud.aiplatform.v1.GetDeploymentResou"
          + "rcePoolRequest\0322.google.cloud.aiplatform"
          + ".v1.DeploymentResourcePool\"J\332A\004name\202\323\344\223\002"
          + "=\022;/v1/{name=projects/*/locations/*/depl"
          + "oymentResourcePools/*}\022\354\001\n\033ListDeploymen"
          + "tResourcePools\022>.google.cloud.aiplatform"
          + ".v1.ListDeploymentResourcePoolsRequest\032?"
          + ".google.cloud.aiplatform.v1.ListDeployme"
          + "ntResourcePoolsResponse\"L\332A\006parent\202\323\344\223\002="
          + "\022;/v1/{parent=projects/*/locations/*}/de"
          + "ploymentResourcePools\022\350\002\n\034UpdateDeployme"
          + "ntResourcePool\022?.google.cloud.aiplatform"
          + ".v1.UpdateDeploymentResourcePoolRequest\032"
          + "\035.google.longrunning.Operation\"\347\001\312AG\n\026De"
          + "ploymentResourcePool\022-UpdateDeploymentRe"
          + "sourcePoolOperationMetadata\332A$deployment"
          + "_resource_pool,update_mask\202\323\344\223\002p2T/v1/{d"
          + "eployment_resource_pool.name=projects/*/"
          + "locations/*/deploymentResourcePools/*}:\030"
          + "deployment_resource_pool\022\375\001\n\034DeleteDeplo"
          + "ymentResourcePool\022?.google.cloud.aiplatf"
          + "orm.v1.DeleteDeploymentResourcePoolReque"
          + "st\032\035.google.longrunning.Operation\"}\312A0\n\025"
          + "google.protobuf.Empty\022\027DeleteOperationMe"
          + "tadata\332A\004name\202\323\344\223\002=*;/v1/{name=projects/"
          + "*/locations/*/deploymentResourcePools/*}"
          + "\022\217\002\n\023QueryDeployedModels\0226.google.cloud."
          + "aiplatform.v1.QueryDeployedModelsRequest"
          + "\0327.google.cloud.aiplatform.v1.QueryDeplo"
          + "yedModelsResponse\"\206\001\332A\030deployment_resour"
          + "ce_pool\202\323\344\223\002e\022c/v1/{deployment_resource_"
          + "pool=projects/*/locations/*/deploymentRe"
          + "sourcePools/*}:queryDeployedModels\032M\312A\031a"
          + "iplatform.googleapis.com\322A.https://www.g"
          + "oogleapis.com/auth/cloud-platformB\340\001\n\036co"
          + "m.google.cloud.aiplatform.v1B\"Deployment"
          + "ResourcePoolServiceProtoP\001Z>cloud.google"
          + ".com/go/aiplatform/apiv1/aiplatformpb;ai"
          + "platformpb\252\002\032Google.Cloud.AIPlatform.V1\312"
          + "\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::C"
          + "loud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.DeployedModelNameProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.DeploymentResourcePoolProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EndpointProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DeploymentResourcePool", "DeploymentResourcePoolId",
            });
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor,
            new java.lang.String[] {
              "DeploymentResourcePools", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolRequest_descriptor,
            new java.lang.String[] {
              "DeploymentResourcePool", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_descriptor,
            new java.lang.String[] {
              "DeploymentResourcePool", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_descriptor,
            new java.lang.String[] {
              "DeployedModels",
              "NextPageToken",
              "DeployedModelRefs",
              "TotalDeployedModelCount",
              "TotalEndpointCount",
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
    com.google.cloud.aiplatform.v1.DeployedModelNameProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DeploymentResourcePoolProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
