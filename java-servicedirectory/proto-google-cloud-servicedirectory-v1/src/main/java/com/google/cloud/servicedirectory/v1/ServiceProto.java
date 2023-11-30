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
// source: google/cloud/servicedirectory/v1/service.proto

package com.google.cloud.servicedirectory.v1;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1_Service_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/servicedirectory/v1/servi"
          + "ce.proto\022 google.cloud.servicedirectory."
          + "v1\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\032/google/cloud/ser"
          + "vicedirectory/v1/endpoint.proto\"\201\003\n\007Serv"
          + "ice\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022U\n\013annotations\030\004"
          + " \003(\0132:.google.cloud.servicedirectory.v1."
          + "Service.AnnotationsEntryB\004\342A\001\001\022C\n\tendpoi"
          + "nts\030\003 \003(\0132*.google.cloud.servicedirector"
          + "y.v1.EndpointB\004\342A\001\003\022\021\n\003uid\030\007 \001(\tB\004\342A\001\003\0322"
          + "\n\020AnnotationsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001:\177\352A|\n\'servicedirectory.google"
          + "apis.com/Service\022Qprojects/{project}/loc"
          + "ations/{location}/namespaces/{namespace}"
          + "/services/{service}B\367\001\n$com.google.cloud"
          + ".servicedirectory.v1B\014ServiceProtoP\001ZPcl"
          + "oud.google.com/go/servicedirectory/apiv1"
          + "/servicedirectorypb;servicedirectorypb\370\001"
          + "\001\252\002 Google.Cloud.ServiceDirectory.V1\312\002 G"
          + "oogle\\Cloud\\ServiceDirectory\\V1\352\002#Google"
          + "::Cloud::ServiceDirectory::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.servicedirectory.v1.EndpointProto.getDescriptor(),
            });
    internal_static_google_cloud_servicedirectory_v1_Service_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1_Service_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1_Service_descriptor,
            new java.lang.String[] {
              "Name", "Annotations", "Endpoints", "Uid",
            });
    internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_descriptor =
        internal_static_google_cloud_servicedirectory_v1_Service_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.servicedirectory.v1.EndpointProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
