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
// source: google/cloud/servicedirectory/v1/endpoint.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.servicedirectory.v1;

public final class EndpointProto {
  private EndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1_Endpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1_Endpoint_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_Endpoint_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/servicedirectory/v1/endpo"
          + "int.proto\022 google.cloud.servicedirectory"
          + ".v1\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\"\276\003\n\010Endpoint\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\005\022\024\n\007address\030\002 \001(\tB\003\340A\001\022\021\n"
          + "\004port\030\003 \001(\005B\003\340A\001\022U\n\013annotations\030\005 \003(\0132;."
          + "google.cloud.servicedirectory.v1.Endpoin"
          + "t.AnnotationsEntryB\003\340A\001\022@\n\007network\030\010 \001(\t"
          + "B/\340A\005\372A)\n\'servicedirectory.googleapis.co"
          + "m/Network\022\020\n\003uid\030\t \001(\tB\003\340A\003\0322\n\020Annotatio"
          + "nsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:"
          + "\226\001\352A\222\001\n(servicedirectory.googleapis.com/"
          + "Endpoint\022fprojects/{project}/locations/{"
          + "location}/namespaces/{namespace}/service"
          + "s/{service}/endpoints/{endpoint}B\331\002\n$com"
          + ".google.cloud.servicedirectory.v1B\rEndpo"
          + "intProtoP\001ZPcloud.google.com/go/serviced"
          + "irectory/apiv1/servicedirectorypb;servic"
          + "edirectorypb\252\002 Google.Cloud.ServiceDirec"
          + "tory.V1\312\002 Google\\Cloud\\ServiceDirectory\\"
          + "V1\352\002#Google::Cloud::ServiceDirectory::V1"
          + "\352Aa\n\'servicedirectory.googleapis.com/Net"
          + "work\0226projects/{project}/locations/globa"
          + "l/networks/{network}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_servicedirectory_v1_Endpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1_Endpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1_Endpoint_descriptor,
            new java.lang.String[] {
              "Name", "Address", "Port", "Annotations", "Network", "Uid",
            });
    internal_static_google_cloud_servicedirectory_v1_Endpoint_AnnotationsEntry_descriptor =
        internal_static_google_cloud_servicedirectory_v1_Endpoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_servicedirectory_v1_Endpoint_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1_Endpoint_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
