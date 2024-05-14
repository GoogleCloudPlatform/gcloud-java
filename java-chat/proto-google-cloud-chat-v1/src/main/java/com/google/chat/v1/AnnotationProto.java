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
// source: google/chat/v1/annotation.proto

// Protobuf Java Version: 3.25.3
package com.google.chat.v1;

public final class AnnotationProto {
  private AnnotationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_Annotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_Annotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_UserMentionMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_UserMentionMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_SlashCommandMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_SlashCommandMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_RichLinkMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_RichLinkMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_DriveLinkData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_DriveLinkData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/chat/v1/annotation.proto\022\016googl"
          + "e.chat.v1\032\031google/api/resource.proto\032\037go"
          + "ogle/chat/v1/attachment.proto\032\031google/ch"
          + "at/v1/user.proto\"\274\002\n\nAnnotation\022,\n\004type\030"
          + "\001 \001(\0162\036.google.chat.v1.AnnotationType\022\030\n"
          + "\013start_index\030\002 \001(\005H\001\210\001\001\022\016\n\006length\030\003 \001(\005\022"
          + ";\n\014user_mention\030\004 \001(\0132#.google.chat.v1.U"
          + "serMentionMetadataH\000\022=\n\rslash_command\030\005 "
          + "\001(\0132$.google.chat.v1.SlashCommandMetadat"
          + "aH\000\022>\n\022rich_link_metadata\030\006 \001(\0132 .google"
          + ".chat.v1.RichLinkMetadataH\000B\n\n\010metadataB"
          + "\016\n\014_start_index\"\245\001\n\023UserMentionMetadata\022"
          + "\"\n\004user\030\001 \001(\0132\024.google.chat.v1.User\0226\n\004t"
          + "ype\030\002 \001(\0162(.google.chat.v1.UserMentionMe"
          + "tadata.Type\"2\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020"
          + "\000\022\007\n\003ADD\020\001\022\013\n\007MENTION\020\002\"\350\001\n\024SlashCommand"
          + "Metadata\022!\n\003bot\030\001 \001(\0132\024.google.chat.v1.U"
          + "ser\0227\n\004type\030\002 \001(\0162).google.chat.v1.Slash"
          + "CommandMetadata.Type\022\024\n\014command_name\030\003 \001"
          + "(\t\022\022\n\ncommand_id\030\004 \001(\003\022\027\n\017triggers_dialo"
          + "g\030\005 \001(\010\"1\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\007\n"
          + "\003ADD\020\001\022\n\n\006INVOKE\020\002\"\350\001\n\020RichLinkMetadata\022"
          + "\013\n\003uri\030\001 \001(\t\022E\n\016rich_link_type\030\002 \001(\0162-.g"
          + "oogle.chat.v1.RichLinkMetadata.RichLinkT"
          + "ype\0228\n\017drive_link_data\030\003 \001(\0132\035.google.ch"
          + "at.v1.DriveLinkDataH\000\">\n\014RichLinkType\022\036\n"
          + "\032RICH_LINK_TYPE_UNSPECIFIED\020\000\022\016\n\nDRIVE_F"
          + "ILE\020\001B\006\n\004data\"X\n\rDriveLinkData\0224\n\016drive_"
          + "data_ref\030\001 \001(\0132\034.google.chat.v1.DriveDat"
          + "aRef\022\021\n\tmime_type\030\002 \001(\t*e\n\016AnnotationTyp"
          + "e\022\037\n\033ANNOTATION_TYPE_UNSPECIFIED\020\000\022\020\n\014US"
          + "ER_MENTION\020\001\022\021\n\rSLASH_COMMAND\020\002\022\r\n\tRICH_"
          + "LINK\020\003B\250\001\n\022com.google.chat.v1B\017Annotatio"
          + "nProtoP\001Z,cloud.google.com/go/chat/apiv1"
          + "/chatpb;chatpb\242\002\013DYNAPIProto\252\002\023Google.Ap"
          + "ps.Chat.V1\312\002\023Google\\Apps\\Chat\\V1\352\002\026Googl"
          + "e::Apps::Chat::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.chat.v1.AttachmentProto.getDescriptor(),
              com.google.chat.v1.UserProto.getDescriptor(),
            });
    internal_static_google_chat_v1_Annotation_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_chat_v1_Annotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_Annotation_descriptor,
            new java.lang.String[] {
              "Type",
              "StartIndex",
              "Length",
              "UserMention",
              "SlashCommand",
              "RichLinkMetadata",
              "Metadata",
            });
    internal_static_google_chat_v1_UserMentionMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_chat_v1_UserMentionMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_UserMentionMetadata_descriptor,
            new java.lang.String[] {
              "User", "Type",
            });
    internal_static_google_chat_v1_SlashCommandMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_chat_v1_SlashCommandMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_SlashCommandMetadata_descriptor,
            new java.lang.String[] {
              "Bot", "Type", "CommandName", "CommandId", "TriggersDialog",
            });
    internal_static_google_chat_v1_RichLinkMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_chat_v1_RichLinkMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_RichLinkMetadata_descriptor,
            new java.lang.String[] {
              "Uri", "RichLinkType", "DriveLinkData", "Data",
            });
    internal_static_google_chat_v1_DriveLinkData_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_chat_v1_DriveLinkData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_DriveLinkData_descriptor,
            new java.lang.String[] {
              "DriveDataRef", "MimeType",
            });
    com.google.api.ResourceProto.getDescriptor();
    com.google.chat.v1.AttachmentProto.getDescriptor();
    com.google.chat.v1.UserProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
