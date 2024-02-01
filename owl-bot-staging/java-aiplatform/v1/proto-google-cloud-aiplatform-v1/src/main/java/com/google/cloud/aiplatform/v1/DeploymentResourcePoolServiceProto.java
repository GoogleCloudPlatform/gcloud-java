// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/deployment_resource_pool_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class DeploymentResourcePoolServiceProto {
  private DeploymentResourcePoolServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/aiplatform/v1/deployment_" +
      "resource_pool_service.proto\022\032google.clou" +
      "d.aiplatform.v1\032\034google/api/annotations." +
      "proto\032\027google/api/client.proto\032\037google/a" +
      "pi/field_behavior.proto\032\031google/api/reso" +
      "urce.proto\0323google/cloud/aiplatform/v1/d" +
      "eployed_model_ref.proto\0329google/cloud/ai" +
      "platform/v1/deployment_resource_pool.pro" +
      "to\032)google/cloud/aiplatform/v1/endpoint." +
      "proto\032*google/cloud/aiplatform/v1/operat" +
      "ion.proto\032#google/longrunning/operations" +
      ".proto\032\033google/protobuf/empty.proto\"\350\001\n#" +
      "CreateDeploymentResourcePoolRequest\022:\n\006p" +
      "arent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.googleap" +
      "is.com/Location\022Z\n\030deployment_resource_p" +
      "ool\030\002 \001(\01322.google.cloud.aiplatform.v1.D" +
      "eploymentResourcePoolB\004\342A\001\002\022)\n\033deploymen" +
      "t_resource_pool_id\030\003 \001(\tB\004\342A\001\002\"\177\n-Create" +
      "DeploymentResourcePoolOperationMetadata\022" +
      "N\n\020generic_metadata\030\001 \001(\01324.google.cloud" +
      ".aiplatform.v1.GenericOperationMetadata\"" +
      "k\n GetDeploymentResourcePoolRequest\022G\n\004n" +
      "ame\030\001 \001(\tB9\342A\001\002\372A2\n0aiplatform.googleapi" +
      "s.com/DeploymentResourcePool\"\207\001\n\"ListDep" +
      "loymentResourcePoolsRequest\022:\n\006parent\030\001 " +
      "\001(\tB*\342A\001\002\372A#\022!locations.googleapis.com/L" +
      "ocation\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token" +
      "\030\003 \001(\t\"\225\001\n#ListDeploymentResourcePoolsRe" +
      "sponse\022U\n\031deployment_resource_pools\030\001 \003(" +
      "\01322.google.cloud.aiplatform.v1.Deploymen" +
      "tResourcePool\022\027\n\017next_page_token\030\002 \001(\t\"\177" +
      "\n-UpdateDeploymentResourcePoolOperationM" +
      "etadata\022N\n\020generic_metadata\030\001 \001(\01324.goog" +
      "le.cloud.aiplatform.v1.GenericOperationM" +
      "etadata\"n\n#DeleteDeploymentResourcePoolR" +
      "equest\022G\n\004name\030\001 \001(\tB9\342A\001\002\372A2\n0aiplatfor" +
      "m.googleapis.com/DeploymentResourcePool\"" +
      "k\n\032QueryDeployedModelsRequest\022&\n\030deploym" +
      "ent_resource_pool\030\001 \001(\tB\004\342A\001\002\022\021\n\tpage_si" +
      "ze\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\213\002\n\033QueryDe" +
      "ployedModelsResponse\022F\n\017deployed_models\030" +
      "\001 \003(\0132).google.cloud.aiplatform.v1.Deplo" +
      "yedModelB\002\030\001\022\027\n\017next_page_token\030\002 \001(\t\022I\n" +
      "\023deployed_model_refs\030\003 \003(\0132,.google.clou" +
      "d.aiplatform.v1.DeployedModelRef\022\"\n\032tota" +
      "l_deployed_model_count\030\004 \001(\005\022\034\n\024total_en" +
      "dpoint_count\030\005 \001(\0052\235\013\n\035DeploymentResourc" +
      "ePoolService\022\317\002\n\034CreateDeploymentResourc" +
      "ePool\022?.google.cloud.aiplatform.v1.Creat" +
      "eDeploymentResourcePoolRequest\032\035.google." +
      "longrunning.Operation\"\316\001\312AG\n\026DeploymentR" +
      "esourcePool\022-CreateDeploymentResourcePoo" +
      "lOperationMetadata\332A;parent,deployment_r" +
      "esource_pool,deployment_resource_pool_id" +
      "\202\323\344\223\002@\";/v1/{parent=projects/*/locations" +
      "/*}/deploymentResourcePools:\001*\022\331\001\n\031GetDe" +
      "ploymentResourcePool\022<.google.cloud.aipl" +
      "atform.v1.GetDeploymentResourcePoolReque" +
      "st\0322.google.cloud.aiplatform.v1.Deployme" +
      "ntResourcePool\"J\332A\004name\202\323\344\223\002=\022;/v1/{name" +
      "=projects/*/locations/*/deploymentResour" +
      "cePools/*}\022\354\001\n\033ListDeploymentResourcePoo" +
      "ls\022>.google.cloud.aiplatform.v1.ListDepl" +
      "oymentResourcePoolsRequest\032?.google.clou" +
      "d.aiplatform.v1.ListDeploymentResourcePo" +
      "olsResponse\"L\332A\006parent\202\323\344\223\002=\022;/v1/{paren" +
      "t=projects/*/locations/*}/deploymentReso" +
      "urcePools\022\375\001\n\034DeleteDeploymentResourcePo" +
      "ol\022?.google.cloud.aiplatform.v1.DeleteDe" +
      "ploymentResourcePoolRequest\032\035.google.lon" +
      "grunning.Operation\"}\312A0\n\025google.protobuf" +
      ".Empty\022\027DeleteOperationMetadata\332A\004name\202\323" +
      "\344\223\002=*;/v1/{name=projects/*/locations/*/d" +
      "eploymentResourcePools/*}\022\217\002\n\023QueryDeplo" +
      "yedModels\0226.google.cloud.aiplatform.v1.Q" +
      "ueryDeployedModelsRequest\0327.google.cloud" +
      ".aiplatform.v1.QueryDeployedModelsRespon" +
      "se\"\206\001\332A\030deployment_resource_pool\202\323\344\223\002e\022c" +
      "/v1/{deployment_resource_pool=projects/*" +
      "/locations/*/deploymentResourcePools/*}:" +
      "queryDeployedModels\032M\312A\031aiplatform.googl" +
      "eapis.com\322A.https://www.googleapis.com/a" +
      "uth/cloud-platformB\340\001\n\036com.google.cloud." +
      "aiplatform.v1B\"DeploymentResourcePoolSer" +
      "viceProtoP\001Z>cloud.google.com/go/aiplatf" +
      "orm/apiv1/aiplatformpb;aiplatformpb\252\002\032Go" +
      "ogle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\" +
      "AIPlatform\\V1\352\002\035Google::Cloud::AIPlatfor" +
      "m::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
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
        });
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_descriptor,
        new java.lang.String[] { "Parent", "DeploymentResourcePool", "DeploymentResourcePoolId", });
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor,
        new java.lang.String[] { "DeploymentResourcePools", "NextPageToken", });
    internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_descriptor,
        new java.lang.String[] { "DeploymentResourcePool", "PageSize", "PageToken", });
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_descriptor,
        new java.lang.String[] { "DeployedModels", "NextPageToken", "DeployedModelRefs", "TotalDeployedModelCount", "TotalEndpointCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
