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
// source: google/cloud/dialogflow/v2/conversation_event.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

public final class ConversationEventProto {
  private ConversationEventProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ConversationEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ConversationEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/dialogflow/v2/conversatio"
          + "n_event.proto\022\032google.cloud.dialogflow.v"
          + "2\032,google/cloud/dialogflow/v2/participan"
          + "t.proto\032\027google/rpc/status.proto\"\201\003\n\021Con"
          + "versationEvent\022\024\n\014conversation\030\001 \001(\t\022@\n\004"
          + "type\030\002 \001(\01622.google.cloud.dialogflow.v2."
          + "ConversationEvent.Type\022(\n\014error_status\030\003"
          + " \001(\0132\022.google.rpc.Status\022B\n\023new_message_"
          + "payload\030\004 \001(\0132#.google.cloud.dialogflow."
          + "v2.MessageH\000\"\232\001\n\004Type\022\024\n\020TYPE_UNSPECIFIE"
          + "D\020\000\022\030\n\024CONVERSATION_STARTED\020\001\022\031\n\025CONVERS"
          + "ATION_FINISHED\020\002\022\035\n\031HUMAN_INTERVENTION_N"
          + "EEDED\020\003\022\017\n\013NEW_MESSAGE\020\005\022\027\n\023UNRECOVERABL"
          + "E_ERROR\020\004B\t\n\007payloadB\237\001\n\036com.google.clou"
          + "d.dialogflow.v2B\026ConversationEventProtoP"
          + "\001Z>cloud.google.com/go/dialogflow/apiv2/"
          + "dialogflowpb;dialogflowpb\370\001\001\242\002\002DF\252\002\032Goog"
          + "le.Cloud.Dialogflow.V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.dialogflow.v2.ParticipantProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_ConversationEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_ConversationEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ConversationEvent_descriptor,
            new java.lang.String[] {
              "Conversation", "Type", "ErrorStatus", "NewMessagePayload", "Payload",
            });
    com.google.cloud.dialogflow.v2.ParticipantProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
