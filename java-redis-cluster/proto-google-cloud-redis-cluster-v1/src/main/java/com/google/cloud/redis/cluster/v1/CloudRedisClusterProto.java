/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/redis/cluster/v1/cloud_redis_cluster.proto

package com.google.cloud.redis.cluster.v1;

public final class CloudRedisClusterProto {
  private CloudRedisClusterProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_CreateClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_CreateClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_ListClustersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_ListClustersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_ListClustersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_ListClustersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_UpdateClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_UpdateClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_GetClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_GetClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_DeleteClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_DeleteClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_Cluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_Cluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_UpdateInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_UpdateInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_PscConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_PscConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_DiscoveryEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_DiscoveryEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_PscConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_PscConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/redis/cluster/v1/cloud_re"
          + "dis_cluster.proto\022\035google.cloud.redis.cl"
          + "uster.v1\032\034google/api/annotations.proto\032\027"
          + "google/api/client.proto\032\037google/api/fiel"
          + "d_behavior.proto\032\031google/api/resource.pr"
          + "oto\032#google/longrunning/operations.proto"
          + "\032\031google/protobuf/any.proto\032\033google/prot"
          + "obuf/empty.proto\032 google/protobuf/field_"
          + "mask.proto\032\037google/protobuf/timestamp.pr"
          + "oto\"\277\001\n\024CreateClusterRequest\022:\n\006parent\030\001"
          + " \001(\tB*\342A\001\002\372A#\n!locations.googleapis.com/"
          + "Location\022\030\n\ncluster_id\030\002 \001(\tB\004\342A\001\002\022=\n\007cl"
          + "uster\030\003 \001(\0132&.google.cloud.redis.cluster"
          + ".v1.ClusterB\004\342A\001\002\022\022\n\nrequest_id\030\004 \001(\t\"x\n"
          + "\023ListClustersRequest\022:\n\006parent\030\001 \001(\tB*\342A"
          + "\001\002\372A#\n!locations.googleapis.com/Location"
          + "\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\""
          + "~\n\024ListClustersResponse\0228\n\010clusters\030\001 \003("
          + "\0132&.google.cloud.redis.cluster.v1.Cluste"
          + "r\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachabl"
          + "e\030\003 \003(\t\"\240\001\n\024UpdateClusterRequest\0225\n\013upda"
          + "te_mask\030\001 \001(\0132\032.google.protobuf.FieldMas"
          + "kB\004\342A\001\002\022=\n\007cluster\030\002 \001(\0132&.google.cloud."
          + "redis.cluster.v1.ClusterB\004\342A\001\002\022\022\n\nreques"
          + "t_id\030\003 \001(\t\"H\n\021GetClusterRequest\0223\n\004name\030"
          + "\001 \001(\tB%\342A\001\002\372A\036\n\034redis.googleapis.com/Clu"
          + "ster\"_\n\024DeleteClusterRequest\0223\n\004name\030\001 \001"
          + "(\tB%\342A\001\002\372A\036\n\034redis.googleapis.com/Cluste"
          + "r\022\022\n\nrequest_id\030\002 \001(\t\"\274\t\n\007Cluster\022\022\n\004nam"
          + "e\030\001 \001(\tB\004\342A\001\002\0225\n\013create_time\030\003 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\004\342A\001\003\022A\n\005state\030\004 "
          + "\001(\0162,.google.cloud.redis.cluster.v1.Clus"
          + "ter.StateB\004\342A\001\003\022\021\n\003uid\030\005 \001(\tB\004\342A\001\003\022 \n\rre"
          + "plica_count\030\010 \001(\005B\004\342A\001\001H\000\210\001\001\022R\n\022authoriz"
          + "ation_mode\030\013 \001(\01620.google.cloud.redis.cl"
          + "uster.v1.AuthorizationModeB\004\342A\001\001\022[\n\027tran"
          + "sit_encryption_mode\030\014 \001(\01624.google.cloud"
          + ".redis.cluster.v1.TransitEncryptionModeB"
          + "\004\342A\001\001\022\032\n\007size_gb\030\r \001(\005B\004\342A\001\003H\001\210\001\001\022\036\n\013sha"
          + "rd_count\030\016 \001(\005B\004\342A\001\002H\002\210\001\001\022C\n\013psc_configs"
          + "\030\017 \003(\0132(.google.cloud.redis.cluster.v1.P"
          + "scConfigB\004\342A\001\002\022S\n\023discovery_endpoints\030\020 "
          + "\003(\01320.google.cloud.redis.cluster.v1.Disc"
          + "overyEndpointB\004\342A\001\003\022K\n\017psc_connections\030\021"
          + " \003(\0132,.google.cloud.redis.cluster.v1.Psc"
          + "ConnectionB\004\342A\001\003\022J\n\nstate_info\030\022 \001(\01320.g"
          + "oogle.cloud.redis.cluster.v1.Cluster.Sta"
          + "teInfoB\004\342A\001\003\032\352\001\n\tStateInfo\022R\n\013update_inf"
          + "o\030\001 \001(\0132;.google.cloud.redis.cluster.v1."
          + "Cluster.StateInfo.UpdateInfoH\000\032\200\001\n\nUpdat"
          + "eInfo\022\037\n\022target_shard_count\030\001 \001(\005H\000\210\001\001\022!"
          + "\n\024target_replica_count\030\002 \001(\005H\001\210\001\001B\025\n\023_ta"
          + "rget_shard_countB\027\n\025_target_replica_coun"
          + "tB\006\n\004info\"T\n\005State\022\025\n\021STATE_UNSPECIFIED\020"
          + "\000\022\014\n\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010UPDATING\020"
          + "\003\022\014\n\010DELETING\020\004:]\352AZ\n\034redis.googleapis.c"
          + "om/Cluster\022:projects/{project}/locations"
          + "/{location}/clusters/{cluster}B\020\n\016_repli"
          + "ca_countB\n\n\010_size_gbB\016\n\014_shard_count\"\"\n\t"
          + "PscConfig\022\025\n\007network\030\002 \001(\tB\004\342A\001\002\"\202\001\n\021Dis"
          + "coveryEndpoint\022\025\n\007address\030\001 \001(\tB\004\342A\001\003\022\022\n"
          + "\004port\030\002 \001(\005B\004\342A\001\003\022B\n\npsc_config\030\003 \001(\0132(."
          + "google.cloud.redis.cluster.v1.PscConfigB"
          + "\004\342A\001\003\"\221\001\n\rPscConnection\022\037\n\021psc_connectio"
          + "n_id\030\001 \001(\tB\004\342A\001\003\022\025\n\007address\030\002 \001(\tB\004\342A\001\003\022"
          + "\035\n\017forwarding_rule\030\003 \001(\tB\004\342A\001\003\022\030\n\nprojec"
          + "t_id\030\004 \001(\tB\004\342A\001\003\022\017\n\007network\030\005 \001(\t\"\207\002\n\021Op"
          + "erationMetadata\0225\n\013create_time\030\001 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\004\342A\001\003\0222\n\010end_ti"
          + "me\030\002 \001(\0132\032.google.protobuf.TimestampB\004\342A"
          + "\001\003\022\024\n\006target\030\003 \001(\tB\004\342A\001\003\022\022\n\004verb\030\004 \001(\tB\004"
          + "\342A\001\003\022\034\n\016status_message\030\005 \001(\tB\004\342A\001\003\022$\n\026re"
          + "quested_cancellation\030\006 \001(\010B\004\342A\001\003\022\031\n\013api_"
          + "version\030\007 \001(\tB\004\342A\001\003*^\n\021AuthorizationMode"
          + "\022\031\n\025AUTH_MODE_UNSPECIFIED\020\000\022\026\n\022AUTH_MODE"
          + "_IAM_AUTH\020\001\022\026\n\022AUTH_MODE_DISABLED\020\002*\231\001\n\025"
          + "TransitEncryptionMode\022\'\n#TRANSIT_ENCRYPT"
          + "ION_MODE_UNSPECIFIED\020\000\022$\n TRANSIT_ENCRYP"
          + "TION_MODE_DISABLED\020\001\0221\n-TRANSIT_ENCRYPTI"
          + "ON_MODE_SERVER_AUTHENTICATION\020\0022\324\010\n\021Clou"
          + "dRedisCluster\022\266\001\n\014ListClusters\0222.google."
          + "cloud.redis.cluster.v1.ListClustersReque"
          + "st\0323.google.cloud.redis.cluster.v1.ListC"
          + "lustersResponse\"=\332A\006parent\202\323\344\223\002.\022,/v1/{p"
          + "arent=projects/*/locations/*}/clusters\022\243"
          + "\001\n\nGetCluster\0220.google.cloud.redis.clust"
          + "er.v1.GetClusterRequest\032&.google.cloud.r"
          + "edis.cluster.v1.Cluster\";\332A\004name\202\323\344\223\002.\022,"
          + "/v1/{name=projects/*/locations/*/cluster"
          + "s/*}\022\341\001\n\rUpdateCluster\0223.google.cloud.re"
          + "dis.cluster.v1.UpdateClusterRequest\032\035.go"
          + "ogle.longrunning.Operation\"|\312A\036\n\007Cluster"
          + "\022\023google.protobuf.Any\332A\023cluster,update_m"
          + "ask\202\323\344\223\002?24/v1/{cluster.name=projects/*/"
          + "locations/*/clusters/*}:\007cluster\022\317\001\n\rDel"
          + "eteCluster\0223.google.cloud.redis.cluster."
          + "v1.DeleteClusterRequest\032\035.google.longrun"
          + "ning.Operation\"j\312A,\n\025google.protobuf.Emp"
          + "ty\022\023google.protobuf.Any\332A\004name\202\323\344\223\002.*,/v"
          + "1/{name=projects/*/locations/*/clusters/"
          + "*}\022\337\001\n\rCreateCluster\0223.google.cloud.redi"
          + "s.cluster.v1.CreateClusterRequest\032\035.goog"
          + "le.longrunning.Operation\"z\312A\036\n\007Cluster\022\023"
          + "google.protobuf.Any\332A\031parent,cluster,clu"
          + "ster_id\202\323\344\223\0027\",/v1/{parent=projects/*/lo"
          + "cations/*}/clusters:\007cluster\032H\312A\024redis.g"
          + "oogleapis.com\322A.https://www.googleapis.c"
          + "om/auth/cloud-platformB\236\001\n!com.google.cl"
          + "oud.redis.cluster.v1B\026CloudRedisClusterP"
          + "rotoP\001Z;cloud.google.com/go/redis/cluste"
          + "r/apiv1/clusterpb;clusterpb\352\002!Google::Cl"
          + "oud::Redis::Cluster::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_redis_cluster_v1_CreateClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_redis_cluster_v1_CreateClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_CreateClusterRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ClusterId", "Cluster", "RequestId",
            });
    internal_static_google_cloud_redis_cluster_v1_ListClustersRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_redis_cluster_v1_ListClustersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_ListClustersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_redis_cluster_v1_ListClustersResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_redis_cluster_v1_ListClustersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_ListClustersResponse_descriptor,
            new java.lang.String[] {
              "Clusters", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_redis_cluster_v1_UpdateClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_redis_cluster_v1_UpdateClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_UpdateClusterRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Cluster", "RequestId",
            });
    internal_static_google_cloud_redis_cluster_v1_GetClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_redis_cluster_v1_GetClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_GetClusterRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_redis_cluster_v1_DeleteClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_redis_cluster_v1_DeleteClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_DeleteClusterRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_redis_cluster_v1_Cluster_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_redis_cluster_v1_Cluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_Cluster_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "State",
              "Uid",
              "ReplicaCount",
              "AuthorizationMode",
              "TransitEncryptionMode",
              "SizeGb",
              "ShardCount",
              "PscConfigs",
              "DiscoveryEndpoints",
              "PscConnections",
              "StateInfo",
              "ReplicaCount",
              "SizeGb",
              "ShardCount",
            });
    internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_descriptor =
        internal_static_google_cloud_redis_cluster_v1_Cluster_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_descriptor,
            new java.lang.String[] {
              "UpdateInfo", "Info",
            });
    internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_UpdateInfo_descriptor =
        internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_UpdateInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_Cluster_StateInfo_UpdateInfo_descriptor,
            new java.lang.String[] {
              "TargetShardCount", "TargetReplicaCount", "TargetShardCount", "TargetReplicaCount",
            });
    internal_static_google_cloud_redis_cluster_v1_PscConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_redis_cluster_v1_PscConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_PscConfig_descriptor,
            new java.lang.String[] {
              "Network",
            });
    internal_static_google_cloud_redis_cluster_v1_DiscoveryEndpoint_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_redis_cluster_v1_DiscoveryEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_DiscoveryEndpoint_descriptor,
            new java.lang.String[] {
              "Address", "Port", "PscConfig",
            });
    internal_static_google_cloud_redis_cluster_v1_PscConnection_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_redis_cluster_v1_PscConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_PscConnection_descriptor,
            new java.lang.String[] {
              "PscConnectionId", "Address", "ForwardingRule", "ProjectId", "Network",
            });
    internal_static_google_cloud_redis_cluster_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_redis_cluster_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
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
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
