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
// source: google/cloud/shell/v1/cloudshell.proto

package com.google.cloud.shell.v1;

public final class CloudShellProto {
  private CloudShellProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_Environment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_GetEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_GetEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_CreateEnvironmentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_CreateEnvironmentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_DeleteEnvironmentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_DeleteEnvironmentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_StartEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_StartEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_AuthorizeEnvironmentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_AuthorizeEnvironmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_AuthorizeEnvironmentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_AuthorizeEnvironmentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_StartEnvironmentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_StartEnvironmentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_StartEnvironmentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_StartEnvironmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_AddPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_AddPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_AddPublicKeyResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_AddPublicKeyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_AddPublicKeyMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_AddPublicKeyMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_RemovePublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_RemovePublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_RemovePublicKeyResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_RemovePublicKeyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_RemovePublicKeyMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_RemovePublicKeyMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_shell_v1_CloudShellErrorDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_shell_v1_CloudShellErrorDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/shell/v1/cloudshell.proto"
          + "\022\025google.cloud.shell.v1\032\034google/api/anno"
          + "tations.proto\032\027google/api/client.proto\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032#google/longrunning/o"
          + "perations.proto\032\037google/protobuf/timesta"
          + "mp.proto\"\272\003\n\013Environment\022\022\n\004name\030\001 \001(\tB\004"
          + "\342A\001\005\022\020\n\002id\030\002 \001(\tB\004\342A\001\003\022\033\n\014docker_image\030\003"
          + " \001(\tB\005\342A\002\002\005\022=\n\005state\030\004 \001(\0162(.google.clou"
          + "d.shell.v1.Environment.StateB\004\342A\001\003\022\026\n\010we"
          + "b_host\030\014 \001(\tB\004\342A\001\003\022\032\n\014ssh_username\030\005 \001(\t"
          + "B\004\342A\001\003\022\026\n\010ssh_host\030\006 \001(\tB\004\342A\001\003\022\026\n\010ssh_po"
          + "rt\030\007 \001(\005B\004\342A\001\003\022\031\n\013public_keys\030\010 \003(\tB\004\342A\001"
          + "\003\"U\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\r\n\tSUS"
          + "PENDED\020\001\022\013\n\007PENDING\020\002\022\013\n\007RUNNING\020\003\022\014\n\010DE"
          + "LETING\020\004:S\352AP\n%cloudshell.googleapis.com"
          + "/Environment\022\'users/{user}/environments/"
          + "{environment}\"U\n\025GetEnvironmentRequest\022<"
          + "\n\004name\030\001 \001(\tB.\342A\001\002\372A\'\n%cloudshell.google"
          + "apis.com/Environment\"\033\n\031CreateEnvironmen"
          + "tMetadata\"\033\n\031DeleteEnvironmentMetadata\"R"
          + "\n\027StartEnvironmentRequest\022\014\n\004name\030\001 \001(\t\022"
          + "\024\n\014access_token\030\002 \001(\t\022\023\n\013public_keys\030\003 \003"
          + "(\t\"\204\001\n\033AuthorizeEnvironmentRequest\022\014\n\004na"
          + "me\030\001 \001(\t\022\024\n\014access_token\030\002 \001(\t\022\020\n\010id_tok"
          + "en\030\004 \001(\t\022/\n\013expire_time\030\003 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\"\036\n\034AuthorizeEnvironmen"
          + "tResponse\"\036\n\034AuthorizeEnvironmentMetadat"
          + "a\"\322\001\n\030StartEnvironmentMetadata\022D\n\005state\030"
          + "\001 \001(\01625.google.cloud.shell.v1.StartEnvir"
          + "onmentMetadata.State\"p\n\005State\022\025\n\021STATE_U"
          + "NSPECIFIED\020\000\022\014\n\010STARTING\020\001\022\024\n\020UNARCHIVIN"
          + "G_DISK\020\002\022\036\n\032AWAITING_COMPUTE_RESOURCES\020\004"
          + "\022\014\n\010FINISHED\020\003\"S\n\030StartEnvironmentRespon"
          + "se\0227\n\013environment\030\001 \001(\0132\".google.cloud.s"
          + "hell.v1.Environment\"7\n\023AddPublicKeyReque"
          + "st\022\023\n\013environment\030\001 \001(\t\022\013\n\003key\030\002 \001(\t\"#\n\024"
          + "AddPublicKeyResponse\022\013\n\003key\030\001 \001(\t\"\026\n\024Add"
          + "PublicKeyMetadata\":\n\026RemovePublicKeyRequ"
          + "est\022\023\n\013environment\030\001 \001(\t\022\013\n\003key\030\002 \001(\t\"\031\n"
          + "\027RemovePublicKeyResponse\"\031\n\027RemovePublic"
          + "KeyMetadata\"\236\002\n\026CloudShellErrorDetails\022O"
          + "\n\004code\030\001 \001(\0162A.google.cloud.shell.v1.Clo"
          + "udShellErrorDetails.CloudShellErrorCode\""
          + "\262\001\n\023CloudShellErrorCode\022&\n\"CLOUD_SHELL_E"
          + "RROR_CODE_UNSPECIFIED\020\000\022\025\n\021IMAGE_UNAVAIL"
          + "ABLE\020\001\022\030\n\024CLOUD_SHELL_DISABLED\020\002\022\021\n\rTOS_"
          + "VIOLATION\020\004\022\022\n\016QUOTA_EXCEEDED\020\005\022\033\n\027ENVIR"
          + "ONMENT_UNAVAILABLE\020\0062\324\010\n\021CloudShellServi"
          + "ce\022\224\001\n\016GetEnvironment\022,.google.cloud.she"
          + "ll.v1.GetEnvironmentRequest\032\".google.clo"
          + "ud.shell.v1.Environment\"0\332A\004name\202\323\344\223\002#\022!"
          + "/v1/{name=users/*/environments/*}\022\314\001\n\020St"
          + "artEnvironment\022..google.cloud.shell.v1.S"
          + "tartEnvironmentRequest\032\035.google.longrunn"
          + "ing.Operation\"i\312A4\n\030StartEnvironmentResp"
          + "onse\022\030StartEnvironmentMetadata\202\323\344\223\002,\"\'/v"
          + "1/{name=users/*/environments/*}:start:\001*"
          + "\022\340\001\n\024AuthorizeEnvironment\0222.google.cloud"
          + ".shell.v1.AuthorizeEnvironmentRequest\032\035."
          + "google.longrunning.Operation\"u\312A<\n\034Autho"
          + "rizeEnvironmentResponse\022\034AuthorizeEnviro"
          + "nmentMetadata\202\323\344\223\0020\"+/v1/{name=users/*/e"
          + "nvironments/*}:authorize:\001*\022\312\001\n\014AddPubli"
          + "cKey\022*.google.cloud.shell.v1.AddPublicKe"
          + "yRequest\032\035.google.longrunning.Operation\""
          + "o\312A,\n\024AddPublicKeyResponse\022\024AddPublicKey"
          + "Metadata\202\323\344\223\002:\"5/v1/{environment=users/*"
          + "/environments/*}:addPublicKey:\001*\022\331\001\n\017Rem"
          + "ovePublicKey\022-.google.cloud.shell.v1.Rem"
          + "ovePublicKeyRequest\032\035.google.longrunning"
          + ".Operation\"x\312A2\n\027RemovePublicKeyResponse"
          + "\022\027RemovePublicKeyMetadata\202\323\344\223\002=\"8/v1/{en"
          + "vironment=users/*/environments/*}:remove"
          + "PublicKey:\001*\032M\312A\031cloudshell.googleapis.c"
          + "om\322A.https://www.googleapis.com/auth/clo"
          + "ud-platformB_\n\031com.google.cloud.shell.v1"
          + "B\017CloudShellProtoP\001Z/cloud.google.com/go"
          + "/shell/apiv1/shellpb;shellpbb\006proto3"
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
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_shell_v1_Environment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_shell_v1_Environment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_Environment_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "DockerImage",
              "State",
              "WebHost",
              "SshUsername",
              "SshHost",
              "SshPort",
              "PublicKeys",
            });
    internal_static_google_cloud_shell_v1_GetEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_shell_v1_GetEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_GetEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_shell_v1_CreateEnvironmentMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_shell_v1_CreateEnvironmentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_CreateEnvironmentMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_shell_v1_DeleteEnvironmentMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_shell_v1_DeleteEnvironmentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_DeleteEnvironmentMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_shell_v1_StartEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_shell_v1_StartEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_StartEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Name", "AccessToken", "PublicKeys",
            });
    internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Name", "AccessToken", "IdToken", "ExpireTime",
            });
    internal_static_google_cloud_shell_v1_AuthorizeEnvironmentResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_shell_v1_AuthorizeEnvironmentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_AuthorizeEnvironmentResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_shell_v1_AuthorizeEnvironmentMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_shell_v1_AuthorizeEnvironmentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_AuthorizeEnvironmentMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_shell_v1_StartEnvironmentMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_shell_v1_StartEnvironmentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_StartEnvironmentMetadata_descriptor,
            new java.lang.String[] {
              "State",
            });
    internal_static_google_cloud_shell_v1_StartEnvironmentResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_shell_v1_StartEnvironmentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_StartEnvironmentResponse_descriptor,
            new java.lang.String[] {
              "Environment",
            });
    internal_static_google_cloud_shell_v1_AddPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_shell_v1_AddPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_AddPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Environment", "Key",
            });
    internal_static_google_cloud_shell_v1_AddPublicKeyResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_shell_v1_AddPublicKeyResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_AddPublicKeyResponse_descriptor,
            new java.lang.String[] {
              "Key",
            });
    internal_static_google_cloud_shell_v1_AddPublicKeyMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_shell_v1_AddPublicKeyMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_AddPublicKeyMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_shell_v1_RemovePublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_shell_v1_RemovePublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_RemovePublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Environment", "Key",
            });
    internal_static_google_cloud_shell_v1_RemovePublicKeyResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_shell_v1_RemovePublicKeyResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_RemovePublicKeyResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_shell_v1_RemovePublicKeyMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_shell_v1_RemovePublicKeyMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_RemovePublicKeyMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_shell_v1_CloudShellErrorDetails_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_shell_v1_CloudShellErrorDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_shell_v1_CloudShellErrorDetails_descriptor,
            new java.lang.String[] {
              "Code",
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
