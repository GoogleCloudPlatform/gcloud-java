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
// source: google/cloud/cloudcontrolspartner/v1beta/core.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.cloudcontrolspartner.v1beta;

public final class CoreProto {
  private CoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/cloudcontrolspartner/v1be"
          + "ta/core.proto\022(google.cloud.cloudcontrol"
          + "spartner.v1beta\032\034google/api/annotations."
          + "proto\032\027google/api/client.proto\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\032Ggoogle/cloud/cloudcontrolspa"
          + "rtner/v1beta/access_approval_requests.pr"
          + "oto\032Agoogle/cloud/cloudcontrolspartner/v"
          + "1beta/customer_workloads.proto\0328google/c"
          + "loud/cloudcontrolspartner/v1beta/custome"
          + "rs.proto\032>google/cloud/cloudcontrolspart"
          + "ner/v1beta/ekm_connections.proto\032Bgoogle"
          + "/cloud/cloudcontrolspartner/v1beta/partn"
          + "er_permissions.proto\0327google/cloud/cloud"
          + "controlspartner/v1beta/partners.proto\032\033g"
          + "oogle/protobuf/empty.proto\032\037google/proto"
          + "buf/timestamp.proto\"\200\002\n\021OperationMetadat"
          + "a\0224\n\013create_time\030\001 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 \001"
          + "(\tB\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016status_mes"
          + "sage\030\005 \001(\tB\003\340A\003\022#\n\026requested_cancellatio"
          + "n\030\006 \001(\010B\003\340A\003\022\030\n\013api_version\030\007 \001(\tB\003\340A\0032\323"
          + "\024\n\030CloudControlsPartnerCore\022\322\001\n\013GetWorkl"
          + "oad\022<.google.cloud.cloudcontrolspartner."
          + "v1beta.GetWorkloadRequest\0322.google.cloud"
          + ".cloudcontrolspartner.v1beta.Workload\"Q\332"
          + "A\004name\202\323\344\223\002D\022B/v1beta/{name=organization"
          + "s/*/locations/*/customers/*/workloads/*}"
          + "\022\345\001\n\rListWorkloads\022>.google.cloud.cloudc"
          + "ontrolspartner.v1beta.ListWorkloadsReque"
          + "st\032?.google.cloud.cloudcontrolspartner.v"
          + "1beta.ListWorkloadsResponse\"S\332A\006parent\202\323"
          + "\344\223\002D\022B/v1beta/{parent=organizations/*/lo"
          + "cations/*/customers/*}/workloads\022\306\001\n\013Get"
          + "Customer\022<.google.cloud.cloudcontrolspar"
          + "tner.v1beta.GetCustomerRequest\0322.google."
          + "cloud.cloudcontrolspartner.v1beta.Custom"
          + "er\"E\332A\004name\202\323\344\223\0028\0226/v1beta/{name=organiz"
          + "ations/*/locations/*/customers/*}\022\331\001\n\rLi"
          + "stCustomers\022>.google.cloud.cloudcontrols"
          + "partner.v1beta.ListCustomersRequest\032?.go"
          + "ogle.cloud.cloudcontrolspartner.v1beta.L"
          + "istCustomersResponse\"G\332A\006parent\202\323\344\223\0028\0226/"
          + "v1beta/{parent=organizations/*/locations"
          + "/*}/customers\022\363\001\n\021GetEkmConnections\022B.go"
          + "ogle.cloud.cloudcontrolspartner.v1beta.G"
          + "etEkmConnectionsRequest\0328.google.cloud.c"
          + "loudcontrolspartner.v1beta.EkmConnection"
          + "s\"`\332A\004name\202\323\344\223\002S\022Q/v1beta/{name=organiza"
          + "tions/*/locations/*/customers/*/workload"
          + "s/*/ekmConnections}\022\203\002\n\025GetPartnerPermis"
          + "sions\022F.google.cloud.cloudcontrolspartne"
          + "r.v1beta.GetPartnerPermissionsRequest\032<."
          + "google.cloud.cloudcontrolspartner.v1beta"
          + ".PartnerPermissions\"d\332A\004name\202\323\344\223\002W\022U/v1b"
          + "eta/{name=organizations/*/locations/*/cu"
          + "stomers/*/workloads/*/partnerPermissions"
          + "}\022\250\002\n\032ListAccessApprovalRequests\022K.googl"
          + "e.cloud.cloudcontrolspartner.v1beta.List"
          + "AccessApprovalRequestsRequest\032L.google.c"
          + "loud.cloudcontrolspartner.v1beta.ListAcc"
          + "essApprovalRequestsResponse\"o\210\002\001\332A\006paren"
          + "t\202\323\344\223\002]\022[/v1beta/{parent=organizations/*"
          + "/locations/*/customers/*/workloads/*}/ac"
          + "cessApprovalRequests\022\277\001\n\nGetPartner\022;.go"
          + "ogle.cloud.cloudcontrolspartner.v1beta.G"
          + "etPartnerRequest\0321.google.cloud.cloudcon"
          + "trolspartner.v1beta.Partner\"A\332A\004name\202\323\344\223"
          + "\0024\0222/v1beta/{name=organizations/*/locati"
          + "ons/*/partner}\022\355\001\n\016CreateCustomer\022?.goog"
          + "le.cloud.cloudcontrolspartner.v1beta.Cre"
          + "ateCustomerRequest\0322.google.cloud.cloudc"
          + "ontrolspartner.v1beta.Customer\"f\332A\033paren"
          + "t,customer,customer_id\202\323\344\223\002B\"6/v1beta/{p"
          + "arent=organizations/*/locations/*}/custo"
          + "mers:\010customer\022\357\001\n\016UpdateCustomer\022?.goog"
          + "le.cloud.cloudcontrolspartner.v1beta.Upd"
          + "ateCustomerRequest\0322.google.cloud.cloudc"
          + "ontrolspartner.v1beta.Customer\"h\332A\024custo"
          + "mer,update_mask\202\323\344\223\002K2?/v1beta/{customer"
          + ".name=organizations/*/locations/*/custom"
          + "ers/*}:\010customer\022\260\001\n\016DeleteCustomer\022?.go"
          + "ogle.cloud.cloudcontrolspartner.v1beta.D"
          + "eleteCustomerRequest\032\026.google.protobuf.E"
          + "mpty\"E\332A\004name\202\323\344\223\0028*6/v1beta/{name=organ"
          + "izations/*/locations/*/customers/*}\032W\312A#"
          + "cloudcontrolspartner.googleapis.com\322A.ht"
          + "tps://www.googleapis.com/auth/cloud-plat"
          + "formB\221\003\n,com.google.cloud.cloudcontrolsp"
          + "artner.v1betaB\tCoreProtoP\001Z`cloud.google"
          + ".com/go/cloudcontrolspartner/apiv1beta/c"
          + "loudcontrolspartnerpb;cloudcontrolspartn"
          + "erpb\252\002(Google.Cloud.CloudControlsPartner"
          + ".V1Beta\312\002(Google\\Cloud\\CloudControlsPart"
          + "ner\\V1beta\352\002+Google::Cloud::CloudControl"
          + "sPartner::V1beta\352Am\n8cloudcontrolspartne"
          + "r.googleapis.com/OrganizationLocation\0221o"
          + "rganizations/{organization}/locations/{l"
          + "ocation}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.cloudcontrolspartner.v1beta.AccessApprovalRequestsProto
                  .getDescriptor(),
              com.google.cloud.cloudcontrolspartner.v1beta.CustomerWorkloadsProto.getDescriptor(),
              com.google.cloud.cloudcontrolspartner.v1beta.CustomersProto.getDescriptor(),
              com.google.cloud.cloudcontrolspartner.v1beta.EkmConnectionsProto.getDescriptor(),
              com.google.cloud.cloudcontrolspartner.v1beta.PartnerPermissionsProto.getDescriptor(),
              com.google.cloud.cloudcontrolspartner.v1beta.PartnersProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_OperationMetadata_descriptor,
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
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.cloudcontrolspartner.v1beta.AccessApprovalRequestsProto.getDescriptor();
    com.google.cloud.cloudcontrolspartner.v1beta.CustomerWorkloadsProto.getDescriptor();
    com.google.cloud.cloudcontrolspartner.v1beta.CustomersProto.getDescriptor();
    com.google.cloud.cloudcontrolspartner.v1beta.EkmConnectionsProto.getDescriptor();
    com.google.cloud.cloudcontrolspartner.v1beta.PartnerPermissionsProto.getDescriptor();
    com.google.cloud.cloudcontrolspartner.v1beta.PartnersProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
