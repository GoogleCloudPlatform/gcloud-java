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
          + "controlspartner/v1beta/partners.proto\032\037g"
          + "oogle/protobuf/timestamp.proto\"\200\002\n\021Opera"
          + "tionMetadata\0224\n\013create_time\030\001 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\0221\n\010end_time\030\002"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006target\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n"
          + "\016status_message\030\005 \001(\tB\003\340A\003\022#\n\026requested_"
          + "cancellation\030\006 \001(\010B\003\340A\003\022\030\n\013api_version\030\007"
          + " \001(\tB\003\340A\0032\276\017\n\030CloudControlsPartnerCore\022\322"
          + "\001\n\013GetWorkload\022<.google.cloud.cloudcontr"
          + "olspartner.v1beta.GetWorkloadRequest\0322.g"
          + "oogle.cloud.cloudcontrolspartner.v1beta."
          + "Workload\"Q\332A\004name\202\323\344\223\002D\022B/v1beta/{name=o"
          + "rganizations/*/locations/*/customers/*/w"
          + "orkloads/*}\022\345\001\n\rListWorkloads\022>.google.c"
          + "loud.cloudcontrolspartner.v1beta.ListWor"
          + "kloadsRequest\032?.google.cloud.cloudcontro"
          + "lspartner.v1beta.ListWorkloadsResponse\"S"
          + "\332A\006parent\202\323\344\223\002D\022B/v1beta/{parent=organiz"
          + "ations/*/locations/*/customers/*}/worklo"
          + "ads\022\306\001\n\013GetCustomer\022<.google.cloud.cloud"
          + "controlspartner.v1beta.GetCustomerReques"
          + "t\0322.google.cloud.cloudcontrolspartner.v1"
          + "beta.Customer\"E\332A\004name\202\323\344\223\0028\0226/v1beta/{n"
          + "ame=organizations/*/locations/*/customer"
          + "s/*}\022\331\001\n\rListCustomers\022>.google.cloud.cl"
          + "oudcontrolspartner.v1beta.ListCustomersR"
          + "equest\032?.google.cloud.cloudcontrolspartn"
          + "er.v1beta.ListCustomersResponse\"G\332A\006pare"
          + "nt\202\323\344\223\0028\0226/v1beta/{parent=organizations/"
          + "*/locations/*}/customers\022\363\001\n\021GetEkmConne"
          + "ctions\022B.google.cloud.cloudcontrolspartn"
          + "er.v1beta.GetEkmConnectionsRequest\0328.goo"
          + "gle.cloud.cloudcontrolspartner.v1beta.Ek"
          + "mConnections\"`\332A\004name\202\323\344\223\002S\022Q/v1beta/{na"
          + "me=organizations/*/locations/*/customers"
          + "/*/workloads/*/ekmConnections}\022\203\002\n\025GetPa"
          + "rtnerPermissions\022F.google.cloud.cloudcon"
          + "trolspartner.v1beta.GetPartnerPermission"
          + "sRequest\032<.google.cloud.cloudcontrolspar"
          + "tner.v1beta.PartnerPermissions\"d\332A\004name\202"
          + "\323\344\223\002W\022U/v1beta/{name=organizations/*/loc"
          + "ations/*/customers/*/workloads/*/partner"
          + "Permissions}\022\250\002\n\032ListAccessApprovalReque"
          + "sts\022K.google.cloud.cloudcontrolspartner."
          + "v1beta.ListAccessApprovalRequestsRequest"
          + "\032L.google.cloud.cloudcontrolspartner.v1b"
          + "eta.ListAccessApprovalRequestsResponse\"o"
          + "\210\002\001\332A\006parent\202\323\344\223\002]\022[/v1beta/{parent=orga"
          + "nizations/*/locations/*/customers/*/work"
          + "loads/*}/accessApprovalRequests\022\277\001\n\nGetP"
          + "artner\022;.google.cloud.cloudcontrolspartn"
          + "er.v1beta.GetPartnerRequest\0321.google.clo"
          + "ud.cloudcontrolspartner.v1beta.Partner\"A"
          + "\332A\004name\202\323\344\223\0024\0222/v1beta/{name=organizatio"
          + "ns/*/locations/*/partner}\032W\312A#cloudcontr"
          + "olspartner.googleapis.com\322A.https://www."
          + "googleapis.com/auth/cloud-platformB\221\003\n,c"
          + "om.google.cloud.cloudcontrolspartner.v1b"
          + "etaB\tCoreProtoP\001Z`cloud.google.com/go/cl"
          + "oudcontrolspartner/apiv1beta/cloudcontro"
          + "lspartnerpb;cloudcontrolspartnerpb\252\002(Goo"
          + "gle.Cloud.CloudControlsPartner.V1Beta\312\002("
          + "Google\\Cloud\\CloudControlsPartner\\V1beta"
          + "\352\002+Google::Cloud::CloudControlsPartner::"
          + "V1beta\352Am\n8cloudcontrolspartner.googleap"
          + "is.com/OrganizationLocation\0221organizatio"
          + "ns/{organization}/locations/{location}b\006"
          + "proto3"
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
