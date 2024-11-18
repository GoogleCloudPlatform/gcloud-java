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
// source: google/cloud/dialogflow/cx/v3/transition_route_group.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public final class TransitionRouteGroupProto {
  private TransitionRouteGroupProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_TransitionRouteGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_TransitionRouteGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetTransitionRouteGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreateTransitionRouteGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateTransitionRouteGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeleteTransitionRouteGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteTransitionRouteGroupRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/dialogflow/cx/v3/transiti"
          + "on_route_group.proto\022\035google.cloud.dialo"
          + "gflow.cx.v3\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032(google/cloud/dialogflow/cx/v3/pa"
          + "ge.proto\032\033google/protobuf/empty.proto\032 g"
          + "oogle/protobuf/field_mask.proto\"\311\003\n\024Tran"
          + "sitionRouteGroup\022\014\n\004name\030\001 \001(\t\022\031\n\014displa"
          + "y_name\030\002 \001(\tB\003\340A\002\022I\n\021transition_routes\030\005"
          + " \003(\0132..google.cloud.dialogflow.cx.v3.Tra"
          + "nsitionRoute:\274\002\352A\270\002\n.dialogflow.googleap"
          + "is.com/TransitionRouteGroup\022rprojects/{p"
          + "roject}/locations/{location}/agents/{age"
          + "nt}/flows/{flow}/transitionRouteGroups/{"
          + "transition_route_group}\022eprojects/{proje"
          + "ct}/locations/{location}/agents/{agent}/"
          + "transitionRouteGroups/{transition_route_"
          + "group}*\025transitionRouteGroups2\024transitio"
          + "nRouteGroup\"\250\001\n ListTransitionRouteGroup"
          + "sRequest\022F\n\006parent\030\001 \001(\tB6\340A\002\372A0\022.dialog"
          + "flow.googleapis.com/TransitionRouteGroup"
          + "\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022"
          + "\025\n\rlanguage_code\030\004 \001(\t\"\222\001\n!ListTransitio"
          + "nRouteGroupsResponse\022T\n\027transition_route"
          + "_groups\030\001 \003(\01323.google.cloud.dialogflow."
          + "cx.v3.TransitionRouteGroup\022\027\n\017next_page_"
          + "token\030\002 \001(\t\"}\n\036GetTransitionRouteGroupRe"
          + "quest\022D\n\004name\030\001 \001(\tB6\340A\002\372A0\n.dialogflow."
          + "googleapis.com/TransitionRouteGroup\022\025\n\rl"
          + "anguage_code\030\002 \001(\t\"\334\001\n!CreateTransitionR"
          + "outeGroupRequest\022F\n\006parent\030\001 \001(\tB6\340A\002\372A0"
          + "\022.dialogflow.googleapis.com/TransitionRo"
          + "uteGroup\022X\n\026transition_route_group\030\002 \001(\013"
          + "23.google.cloud.dialogflow.cx.v3.Transit"
          + "ionRouteGroupB\003\340A\002\022\025\n\rlanguage_code\030\003 \001("
          + "\t\"\305\001\n!UpdateTransitionRouteGroupRequest\022"
          + "X\n\026transition_route_group\030\001 \001(\01323.google"
          + ".cloud.dialogflow.cx.v3.TransitionRouteG"
          + "roupB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.google."
          + "protobuf.FieldMask\022\025\n\rlanguage_code\030\003 \001("
          + "\t\"x\n!DeleteTransitionRouteGroupRequest\022D"
          + "\n\004name\030\001 \001(\tB6\340A\002\372A0\n.dialogflow.googlea"
          + "pis.com/TransitionRouteGroup\022\r\n\005force\030\002 "
          + "\001(\0102\335\016\n\025TransitionRouteGroups\022\303\002\n\031ListTr"
          + "ansitionRouteGroups\022?.google.cloud.dialo"
          + "gflow.cx.v3.ListTransitionRouteGroupsReq"
          + "uest\032@.google.cloud.dialogflow.cx.v3.Lis"
          + "tTransitionRouteGroupsResponse\"\242\001\332A\006pare"
          + "nt\202\323\344\223\002\222\001\022J/v3/{parent=projects/*/locati"
          + "ons/*/agents/*/flows/*}/transitionRouteG"
          + "roupsZD\022B/v3/{parent=projects/*/location"
          + "s/*/agents/*}/transitionRouteGroups\022\260\002\n\027"
          + "GetTransitionRouteGroup\022=.google.cloud.d"
          + "ialogflow.cx.v3.GetTransitionRouteGroupR"
          + "equest\0323.google.cloud.dialogflow.cx.v3.T"
          + "ransitionRouteGroup\"\240\001\332A\004name\202\323\344\223\002\222\001\022J/v"
          + "3/{name=projects/*/locations/*/agents/*/"
          + "flows/*/transitionRouteGroups/*}ZD\022B/v3/"
          + "{name=projects/*/locations/*/agents/*/tr"
          + "ansitionRouteGroups/*}\022\377\002\n\032CreateTransit"
          + "ionRouteGroup\022@.google.cloud.dialogflow."
          + "cx.v3.CreateTransitionRouteGroupRequest\032"
          + "3.google.cloud.dialogflow.cx.v3.Transiti"
          + "onRouteGroup\"\351\001\332A\035parent,transition_rout"
          + "e_group\202\323\344\223\002\302\001\"J/v3/{parent=projects/*/l"
          + "ocations/*/agents/*/flows/*}/transitionR"
          + "outeGroups:\026transition_route_groupZ\\\"B/v"
          + "3/{parent=projects/*/locations/*/agents/"
          + "*}/transitionRouteGroups:\026transition_rou"
          + "te_group\022\262\003\n\032UpdateTransitionRouteGroup\022"
          + "@.google.cloud.dialogflow.cx.v3.UpdateTr"
          + "ansitionRouteGroupRequest\0323.google.cloud"
          + ".dialogflow.cx.v3.TransitionRouteGroup\"\234"
          + "\002\332A\"transition_route_group,update_mask\202\323"
          + "\344\223\002\360\0012a/v3/{transition_route_group.name="
          + "projects/*/locations/*/agents/*/flows/*/"
          + "transitionRouteGroups/*}:\026transition_rou"
          + "te_groupZs2Y/v3/{transition_route_group."
          + "name=projects/*/locations/*/agents/*/tra"
          + "nsitionRouteGroups/*}:\026transition_route_"
          + "group\022\231\002\n\032DeleteTransitionRouteGroup\022@.g"
          + "oogle.cloud.dialogflow.cx.v3.DeleteTrans"
          + "itionRouteGroupRequest\032\026.google.protobuf"
          + ".Empty\"\240\001\332A\004name\202\323\344\223\002\222\001*J/v3/{name=proje"
          + "cts/*/locations/*/agents/*/flows/*/trans"
          + "itionRouteGroups/*}ZD*B/v3/{name=project"
          + "s/*/locations/*/agents/*/transitionRoute"
          + "Groups/*}\032x\312A\031dialogflow.googleapis.com\322"
          + "AYhttps://www.googleapis.com/auth/cloud-"
          + "platform,https://www.googleapis.com/auth"
          + "/dialogflowB\274\001\n!com.google.cloud.dialogf"
          + "low.cx.v3B\031TransitionRouteGroupProtoP\001Z1"
          + "cloud.google.com/go/dialogflow/cx/apiv3/"
          + "cxpb;cxpb\242\002\002DF\252\002\035Google.Cloud.Dialogflow"
          + ".Cx.V3\352\002!Google::Cloud::Dialogflow::CX::"
          + "V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.PageProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_TransitionRouteGroup_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_TransitionRouteGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_TransitionRouteGroup_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "TransitionRoutes",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsResponse_descriptor,
            new java.lang.String[] {
              "TransitionRouteGroups", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetTransitionRouteGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_GetTransitionRouteGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetTransitionRouteGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreateTransitionRouteGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_CreateTransitionRouteGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreateTransitionRouteGroupRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TransitionRouteGroup", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateTransitionRouteGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateTransitionRouteGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateTransitionRouteGroupRequest_descriptor,
            new java.lang.String[] {
              "TransitionRouteGroup", "UpdateMask", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteTransitionRouteGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteTransitionRouteGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeleteTransitionRouteGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.PageProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
