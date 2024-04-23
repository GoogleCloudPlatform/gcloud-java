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
// source: google/cloud/discoveryengine/v1/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Interval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Interval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_CustomAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_CustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_UserInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_UserInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/discoveryengine/v1/common"
          + ".proto\022\037google.cloud.discoveryengine.v1\032"
          + "\031google/api/resource.proto\"x\n\010Interval\022\021"
          + "\n\007minimum\030\001 \001(\001H\000\022\033\n\021exclusive_minimum\030\002"
          + " \001(\001H\000\022\021\n\007maximum\030\003 \001(\001H\001\022\033\n\021exclusive_m"
          + "aximum\030\004 \001(\001H\001B\005\n\003minB\005\n\003max\"0\n\017CustomAt"
          + "tribute\022\014\n\004text\030\001 \003(\t\022\017\n\007numbers\030\002 \003(\001\"/"
          + "\n\010UserInfo\022\017\n\007user_id\030\001 \001(\t\022\022\n\nuser_agen"
          + "t\030\002 \001(\t*b\n\020IndustryVertical\022!\n\035INDUSTRY_"
          + "VERTICAL_UNSPECIFIED\020\000\022\013\n\007GENERIC\020\001\022\t\n\005M"
          + "EDIA\020\002\022\023\n\017HEALTHCARE_FHIR\020\007*\244\001\n\014Solution"
          + "Type\022\035\n\031SOLUTION_TYPE_UNSPECIFIED\020\000\022 \n\034S"
          + "OLUTION_TYPE_RECOMMENDATION\020\001\022\030\n\024SOLUTIO"
          + "N_TYPE_SEARCH\020\002\022\026\n\022SOLUTION_TYPE_CHAT\020\003\022"
          + "!\n\035SOLUTION_TYPE_GENERATIVE_CHAT\020\004*_\n\nSe"
          + "archTier\022\033\n\027SEARCH_TIER_UNSPECIFIED\020\000\022\030\n"
          + "\024SEARCH_TIER_STANDARD\020\001\022\032\n\026SEARCH_TIER_E"
          + "NTERPRISE\020\002*C\n\013SearchAddOn\022\035\n\031SEARCH_ADD"
          + "_ON_UNSPECIFIED\020\000\022\025\n\021SEARCH_ADD_ON_LLM\020\001"
          + "B\324\010\n#com.google.cloud.discoveryengine.v1"
          + "B\013CommonProtoP\001ZMcloud.google.com/go/dis"
          + "coveryengine/apiv1/discoveryenginepb;dis"
          + "coveryenginepb\242\002\017DISCOVERYENGINE\252\002\037Googl"
          + "e.Cloud.DiscoveryEngine.V1\312\002\037Google\\Clou"
          + "d\\DiscoveryEngine\\V1\352\002\"Google::Cloud::Di"
          + "scoveryEngine::V1\352A\346\001\n%discoveryengine.g"
          + "oogleapis.com/Branch\022Qprojects/{project}"
          + "/locations/{location}/dataStores/{data_s"
          + "tore}/branches/{branch}\022jprojects/{proje"
          + "ct}/locations/{location}/collections/{co"
          + "llection}/dataStores/{data_store}/branch"
          + "es/{branch}\352Am\n)discoveryengine.googleap"
          + "is.com/Collection\022@projects/{project}/lo"
          + "cations/{location}/collections/{collecti"
          + "on}\352A\374\002\n,discoveryengine.googleapis.com/"
          + "ServingConfig\022_projects/{project}/locati"
          + "ons/{location}/dataStores/{data_store}/s"
          + "ervingConfigs/{serving_config}\022xprojects"
          + "/{project}/locations/{location}/collecti"
          + "ons/{collection}/dataStores/{data_store}"
          + "/servingConfigs/{serving_config}\022qprojec"
          + "ts/{project}/locations/{location}/collec"
          + "tions/{collection}/engines/{engine}/serv"
          + "ingConfigs/{serving_config}\352Ay\n#healthca"
          + "re.googleapis.com/FhirStore\022Rprojects/{p"
          + "roject}/locations/{location}/datasets/{d"
          + "ataset}/fhirStores/{fhir_store}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_Interval_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Interval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Interval_descriptor,
            new java.lang.String[] {
              "Minimum", "ExclusiveMinimum", "Maximum", "ExclusiveMaximum", "Min", "Max",
            });
    internal_static_google_cloud_discoveryengine_v1_CustomAttribute_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_CustomAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_CustomAttribute_descriptor,
            new java.lang.String[] {
              "Text", "Numbers",
            });
    internal_static_google_cloud_discoveryengine_v1_UserInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_UserInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_UserInfo_descriptor,
            new java.lang.String[] {
              "UserId", "UserAgent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
