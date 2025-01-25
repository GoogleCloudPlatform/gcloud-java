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
// source: google/cloud/aiplatform/v1beta1/feature_registry_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public final class FeatureRegistryServiceProto {
  private FeatureRegistryServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetFeatureGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetFeatureGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureGroupsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureGroupsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteFeatureGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteFeatureGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetFeatureMonitorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetFeatureMonitorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureMonitorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureMonitorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteFeatureMonitorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteFeatureMonitorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureGroupOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureGroupOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateRegistryFeatureOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateRegistryFeatureOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureMonitorOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureMonitorOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetFeatureMonitorJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetFeatureMonitorJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorJobsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/aiplatform/v1beta1/featur"
          + "e_registry_service.proto\022\037google.cloud.a"
          + "iplatform.v1beta1\032\034google/api/annotation"
          + "s.proto\032\027google/api/client.proto\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\032-google/cloud/aiplatform/v1"
          + "beta1/feature.proto\0323google/cloud/aiplat"
          + "form/v1beta1/feature_group.proto\0325google"
          + "/cloud/aiplatform/v1beta1/feature_monito"
          + "r.proto\0329google/cloud/aiplatform/v1beta1"
          + "/feature_monitor_job.proto\032:google/cloud"
          + "/aiplatform/v1beta1/featurestore_service"
          + ".proto\032/google/cloud/aiplatform/v1beta1/"
          + "operation.proto\032#google/longrunning/oper"
          + "ations.proto\032\033google/protobuf/empty.prot"
          + "o\032 google/protobuf/field_mask.proto\"\305\001\n\031"
          + "CreateFeatureGroupRequest\022>\n\006parent\030\001 \001("
          + "\tB.\340A\002\372A(\022&aiplatform.googleapis.com/Fea"
          + "tureGroup\022I\n\rfeature_group\030\002 \001(\0132-.googl"
          + "e.cloud.aiplatform.v1beta1.FeatureGroupB"
          + "\003\340A\002\022\035\n\020feature_group_id\030\003 \001(\tB\003\340A\002\"V\n\026G"
          + "etFeatureGroupRequest\022<\n\004name\030\001 \001(\tB.\340A\002"
          + "\372A(\n&aiplatform.googleapis.com/FeatureGr"
          + "oup\"\243\001\n\030ListFeatureGroupsRequest\022>\n\006pare"
          + "nt\030\001 \001(\tB.\340A\002\372A(\022&aiplatform.googleapis."
          + "com/FeatureGroup\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage"
          + "_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\022\020\n\010order"
          + "_by\030\005 \001(\t\"{\n\031ListFeatureGroupsResponse\022E"
          + "\n\016feature_groups\030\001 \003(\0132-.google.cloud.ai"
          + "platform.v1beta1.FeatureGroup\022\027\n\017next_pa"
          + "ge_token\030\002 \001(\t\"\227\001\n\031UpdateFeatureGroupReq"
          + "uest\022I\n\rfeature_group\030\001 \001(\0132-.google.clo"
          + "ud.aiplatform.v1beta1.FeatureGroupB\003\340A\002\022"
          + "/\n\013update_mask\030\002 \001(\0132\032.google.protobuf.F"
          + "ieldMask\"h\n\031DeleteFeatureGroupRequest\022<\n"
          + "\004name\030\001 \001(\tB.\340A\002\372A(\n&aiplatform.googleap"
          + "is.com/FeatureGroup\022\r\n\005force\030\002 \001(\010\"\317\001\n\033C"
          + "reateFeatureMonitorRequest\022@\n\006parent\030\001 \001"
          + "(\tB0\340A\002\372A*\022(aiplatform.googleapis.com/Fe"
          + "atureMonitor\022M\n\017feature_monitor\030\002 \001(\0132/."
          + "google.cloud.aiplatform.v1beta1.FeatureM"
          + "onitorB\003\340A\002\022\037\n\022feature_monitor_id\030\003 \001(\tB"
          + "\003\340A\002\"Z\n\030GetFeatureMonitorRequest\022>\n\004name"
          + "\030\001 \001(\tB0\340A\002\372A*\n(aiplatform.googleapis.co"
          + "m/FeatureMonitor\"\273\001\n\032ListFeatureMonitors"
          + "Request\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\022(aiplatf"
          + "orm.googleapis.com/FeatureMonitor\022\023\n\006fil"
          + "ter\030\002 \001(\tB\003\340A\001\022\026\n\tpage_size\030\003 \001(\005B\003\340A\001\022\027"
          + "\n\npage_token\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001("
          + "\tB\003\340A\001\"\242\001\n\033UpdateFeatureMonitorRequest\022M"
          + "\n\017feature_monitor\030\001 \001(\0132/.google.cloud.a"
          + "iplatform.v1beta1.FeatureMonitorB\003\340A\002\0224\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.Fie"
          + "ldMaskB\003\340A\001\"]\n\033DeleteFeatureMonitorReque"
          + "st\022>\n\004name\030\001 \001(\tB0\340A\002\372A*\n(aiplatform.goo"
          + "gleapis.com/FeatureMonitor\"\201\001\n\033ListFeatu"
          + "reMonitorsResponse\022I\n\020feature_monitors\030\001"
          + " \003(\0132/.google.cloud.aiplatform.v1beta1.F"
          + "eatureMonitor\022\027\n\017next_page_token\030\002 \001(\t\"z"
          + "\n#CreateFeatureGroupOperationMetadata\022S\n"
          + "\020generic_metadata\030\001 \001(\01329.google.cloud.a"
          + "iplatform.v1beta1.GenericOperationMetada"
          + "ta\"z\n#UpdateFeatureGroupOperationMetadat"
          + "a\022S\n\020generic_metadata\030\001 \001(\01329.google.clo"
          + "ud.aiplatform.v1beta1.GenericOperationMe"
          + "tadata\"}\n&CreateRegistryFeatureOperation"
          + "Metadata\022S\n\020generic_metadata\030\001 \001(\01329.goo"
          + "gle.cloud.aiplatform.v1beta1.GenericOper"
          + "ationMetadata\"u\n\036UpdateFeatureOperationM"
          + "etadata\022S\n\020generic_metadata\030\001 \001(\01329.goog"
          + "le.cloud.aiplatform.v1beta1.GenericOpera"
          + "tionMetadata\"|\n%CreateFeatureMonitorOper"
          + "ationMetadata\022S\n\020generic_metadata\030\001 \001(\0132"
          + "9.google.cloud.aiplatform.v1beta1.Generi"
          + "cOperationMetadata\"|\n%UpdateFeatureMonit"
          + "orOperationMetadata\022S\n\020generic_metadata\030"
          + "\001 \001(\01329.google.cloud.aiplatform.v1beta1."
          + "GenericOperationMetadata\"\343\001\n\036CreateFeatu"
          + "reMonitorJobRequest\022C\n\006parent\030\001 \001(\tB3\340A\002"
          + "\372A-\022+aiplatform.googleapis.com/FeatureMo"
          + "nitorJob\022T\n\023feature_monitor_job\030\002 \001(\01322."
          + "google.cloud.aiplatform.v1beta1.FeatureM"
          + "onitorJobB\003\340A\002\022&\n\026feature_monitor_job_id"
          + "\030\003 \001(\003B\006\340A\001\340A\003\"`\n\033GetFeatureMonitorJobRe"
          + "quest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+aiplatform."
          + "googleapis.com/FeatureMonitorJob\"\301\001\n\035Lis"
          + "tFeatureMonitorJobsRequest\022C\n\006parent\030\001 \001"
          + "(\tB3\340A\002\372A-\022+aiplatform.googleapis.com/Fe"
          + "atureMonitorJob\022\023\n\006filter\030\002 \001(\tB\003\340A\001\022\026\n\t"
          + "page_size\030\003 \001(\005B\003\340A\001\022\027\n\npage_token\030\004 \001(\t"
          + "B\003\340A\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\"\213\001\n\036ListFea"
          + "tureMonitorJobsResponse\022P\n\024feature_monit"
          + "or_jobs\030\001 \003(\01322.google.cloud.aiplatform."
          + "v1beta1.FeatureMonitorJob\022\027\n\017next_page_t"
          + "oken\030\002 \001(\t2\373&\n\026FeatureRegistryService\022\235\002"
          + "\n\022CreateFeatureGroup\022:.google.cloud.aipl"
          + "atform.v1beta1.CreateFeatureGroupRequest"
          + "\032\035.google.longrunning.Operation\"\253\001\312A3\n\014F"
          + "eatureGroup\022#CreateFeatureGroupOperation"
          + "Metadata\332A%parent,feature_group,feature_"
          + "group_id\202\323\344\223\002G\"6/v1beta1/{parent=project"
          + "s/*/locations/*}/featureGroups:\rfeature_"
          + "group\022\300\001\n\017GetFeatureGroup\0227.google.cloud"
          + ".aiplatform.v1beta1.GetFeatureGroupReque"
          + "st\032-.google.cloud.aiplatform.v1beta1.Fea"
          + "tureGroup\"E\332A\004name\202\323\344\223\0028\0226/v1beta1/{name"
          + "=projects/*/locations/*/featureGroups/*}"
          + "\022\323\001\n\021ListFeatureGroups\0229.google.cloud.ai"
          + "platform.v1beta1.ListFeatureGroupsReques"
          + "t\032:.google.cloud.aiplatform.v1beta1.List"
          + "FeatureGroupsResponse\"G\332A\006parent\202\323\344\223\0028\0226"
          + "/v1beta1/{parent=projects/*/locations/*}"
          + "/featureGroups\022\237\002\n\022UpdateFeatureGroup\022:."
          + "google.cloud.aiplatform.v1beta1.UpdateFe"
          + "atureGroupRequest\032\035.google.longrunning.O"
          + "peration\"\255\001\312A3\n\014FeatureGroup\022#UpdateFeat"
          + "ureGroupOperationMetadata\332A\031feature_grou"
          + "p,update_mask\202\323\344\223\002U2D/v1beta1/{feature_g"
          + "roup.name=projects/*/locations/*/feature"
          + "Groups/*}:\rfeature_group\022\357\001\n\022DeleteFeatu"
          + "reGroup\022:.google.cloud.aiplatform.v1beta"
          + "1.DeleteFeatureGroupRequest\032\035.google.lon"
          + "grunning.Operation\"~\312A0\n\025google.protobuf"
          + ".Empty\022\027DeleteOperationMetadata\332A\nname,f"
          + "orce\202\323\344\223\0028*6/v1beta1/{name=projects/*/lo"
          + "cations/*/featureGroups/*}\022\202\002\n\rCreateFea"
          + "ture\0225.google.cloud.aiplatform.v1beta1.C"
          + "reateFeatureRequest\032\035.google.longrunning"
          + ".Operation\"\232\001\312A)\n\007Feature\022\036CreateFeature"
          + "OperationMetadata\332A\031parent,feature,featu"
          + "re_id\202\323\344\223\002L\"A/v1beta1/{parent=projects/*"
          + "/locations/*/featureGroups/*}/features:\007"
          + "feature\022\244\002\n\023BatchCreateFeatures\022;.google"
          + ".cloud.aiplatform.v1beta1.BatchCreateFea"
          + "turesRequest\032\035.google.longrunning.Operat"
          + "ion\"\260\001\312AC\n\033BatchCreateFeaturesResponse\022$"
          + "BatchCreateFeaturesOperationMetadata\332A\017p"
          + "arent,requests\202\323\344\223\002R\"M/v1beta1/{parent=p"
          + "rojects/*/locations/*/featureGroups/*}/f"
          + "eatures:batchCreate:\001*\022\274\001\n\nGetFeature\0222."
          + "google.cloud.aiplatform.v1beta1.GetFeatu"
          + "reRequest\032(.google.cloud.aiplatform.v1be"
          + "ta1.Feature\"P\332A\004name\202\323\344\223\002C\022A/v1beta1/{na"
          + "me=projects/*/locations/*/featureGroups/"
          + "*/features/*}\022\317\001\n\014ListFeatures\0224.google."
          + "cloud.aiplatform.v1beta1.ListFeaturesReq"
          + "uest\0325.google.cloud.aiplatform.v1beta1.L"
          + "istFeaturesResponse\"R\332A\006parent\202\323\344\223\002C\022A/v"
          + "1beta1/{parent=projects/*/locations/*/fe"
          + "atureGroups/*}/features\022\204\002\n\rUpdateFeatur"
          + "e\0225.google.cloud.aiplatform.v1beta1.Upda"
          + "teFeatureRequest\032\035.google.longrunning.Op"
          + "eration\"\234\001\312A)\n\007Feature\022\036UpdateFeatureOpe"
          + "rationMetadata\332A\023feature,update_mask\202\323\344\223"
          + "\002T2I/v1beta1/{feature.name=projects/*/lo"
          + "cations/*/featureGroups/*/features/*}:\007f"
          + "eature\022\353\001\n\rDeleteFeature\0225.google.cloud."
          + "aiplatform.v1beta1.DeleteFeatureRequest\032"
          + "\035.google.longrunning.Operation\"\203\001\312A0\n\025go"
          + "ogle.protobuf.Empty\022\027DeleteOperationMeta"
          + "data\332A\004name\202\323\344\223\002C*A/v1beta1/{name=projec"
          + "ts/*/locations/*/featureGroups/*/feature"
          + "s/*}\022\275\002\n\024CreateFeatureMonitor\022<.google.c"
          + "loud.aiplatform.v1beta1.CreateFeatureMon"
          + "itorRequest\032\035.google.longrunning.Operati"
          + "on\"\307\001\312A7\n\016FeatureMonitor\022%CreateFeatureM"
          + "onitorOperationMetadata\332A)parent,feature"
          + "_monitor,feature_monitor_id\202\323\344\223\002[\"H/v1be"
          + "ta1/{parent=projects/*/locations/*/featu"
          + "reGroups/*}/featureMonitors:\017feature_mon"
          + "itor\022\330\001\n\021GetFeatureMonitor\0229.google.clou"
          + "d.aiplatform.v1beta1.GetFeatureMonitorRe"
          + "quest\032/.google.cloud.aiplatform.v1beta1."
          + "FeatureMonitor\"W\332A\004name\202\323\344\223\002J\022H/v1beta1/"
          + "{name=projects/*/locations/*/featureGrou"
          + "ps/*/featureMonitors/*}\022\353\001\n\023ListFeatureM"
          + "onitors\022;.google.cloud.aiplatform.v1beta"
          + "1.ListFeatureMonitorsRequest\032<.google.cl"
          + "oud.aiplatform.v1beta1.ListFeatureMonito"
          + "rsResponse\"Y\332A\006parent\202\323\344\223\002J\022H/v1beta1/{p"
          + "arent=projects/*/locations/*/featureGrou"
          + "ps/*}/featureMonitors\022\277\002\n\024UpdateFeatureM"
          + "onitor\022<.google.cloud.aiplatform.v1beta1"
          + ".UpdateFeatureMonitorRequest\032\035.google.lo"
          + "ngrunning.Operation\"\311\001\312A7\n\016FeatureMonito"
          + "r\022%UpdateFeatureMonitorOperationMetadata"
          + "\332A\033feature_monitor,update_mask\202\323\344\223\002k2X/v"
          + "1beta1/{feature_monitor.name=projects/*/"
          + "locations/*/featureGroups/*/featureMonit"
          + "ors/*}:\017feature_monitor\022\200\002\n\024DeleteFeatur"
          + "eMonitor\022<.google.cloud.aiplatform.v1bet"
          + "a1.DeleteFeatureMonitorRequest\032\035.google."
          + "longrunning.Operation\"\212\001\312A0\n\025google.prot"
          + "obuf.Empty\022\027DeleteOperationMetadata\332A\004na"
          + "me\202\323\344\223\002J*H/v1beta1/{name=projects/*/loca"
          + "tions/*/featureGroups/*/featureMonitors/"
          + "*}\022\277\002\n\027CreateFeatureMonitorJob\022?.google."
          + "cloud.aiplatform.v1beta1.CreateFeatureMo"
          + "nitorJobRequest\0322.google.cloud.aiplatfor"
          + "m.v1beta1.FeatureMonitorJob\"\256\001\332A1parent,"
          + "feature_monitor_job,feature_monitor_job_"
          + "id\202\323\344\223\002t\"]/v1beta1/{parent=projects/*/lo"
          + "cations/*/featureGroups/*/featureMonitor"
          + "s/*}/featureMonitorJobs:\023feature_monitor"
          + "_job\022\366\001\n\024GetFeatureMonitorJob\022<.google.c"
          + "loud.aiplatform.v1beta1.GetFeatureMonito"
          + "rJobRequest\0322.google.cloud.aiplatform.v1"
          + "beta1.FeatureMonitorJob\"l\332A\004name\202\323\344\223\002_\022]"
          + "/v1beta1/{name=projects/*/locations/*/fe"
          + "atureGroups/*/featureMonitors/*/featureM"
          + "onitorJobs/*}\022\211\002\n\026ListFeatureMonitorJobs"
          + "\022>.google.cloud.aiplatform.v1beta1.ListF"
          + "eatureMonitorJobsRequest\032?.google.cloud."
          + "aiplatform.v1beta1.ListFeatureMonitorJob"
          + "sResponse\"n\332A\006parent\202\323\344\223\002_\022]/v1beta1/{pa"
          + "rent=projects/*/locations/*/featureGroup"
          + "s/*/featureMonitors/*}/featureMonitorJob"
          + "s\032M\312A\031aiplatform.googleapis.com\322A.https:"
          + "//www.googleapis.com/auth/cloud-platform"
          + "B\362\001\n#com.google.cloud.aiplatform.v1beta1"
          + "B\033FeatureRegistryServiceProtoP\001ZCcloud.g"
          + "oogle.com/go/aiplatform/apiv1beta1/aipla"
          + "tformpb;aiplatformpb\252\002\037Google.Cloud.AIPl"
          + "atform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform"
          + "\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1"
          + "beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeatureProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeatureGroupProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeatureMonitorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeatureMonitorJobProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FeatureGroup", "FeatureGroupId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetFeatureGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_GetFeatureGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetFeatureGroupRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureGroupsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureGroupsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListFeatureGroupsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "OrderBy",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureGroupsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureGroupsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListFeatureGroupsResponse_descriptor,
            new java.lang.String[] {
              "FeatureGroups", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureGroupRequest_descriptor,
            new java.lang.String[] {
              "FeatureGroup", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteFeatureGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteFeatureGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteFeatureGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FeatureMonitor", "FeatureMonitorId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetFeatureMonitorRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_GetFeatureMonitorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetFeatureMonitorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "OrderBy",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureMonitorRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureMonitorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureMonitorRequest_descriptor,
            new java.lang.String[] {
              "FeatureMonitor", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteFeatureMonitorRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteFeatureMonitorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteFeatureMonitorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorsResponse_descriptor,
            new java.lang.String[] {
              "FeatureMonitors", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureGroupOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureGroupOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureGroupOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateRegistryFeatureOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1beta1_CreateRegistryFeatureOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateRegistryFeatureOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureMonitorOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureMonitorOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateFeatureMonitorOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureMonitorJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FeatureMonitorJob", "FeatureMonitorJobId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetFeatureMonitorJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_aiplatform_v1beta1_GetFeatureMonitorJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetFeatureMonitorJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "OrderBy",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(21);
    internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListFeatureMonitorJobsResponse_descriptor,
            new java.lang.String[] {
              "FeatureMonitorJobs", "NextPageToken",
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
    com.google.cloud.aiplatform.v1beta1.FeatureProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeatureGroupProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeatureMonitorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeatureMonitorJobProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
