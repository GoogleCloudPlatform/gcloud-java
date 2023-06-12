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
// source: google/appengine/v1/domain_mapping.proto

package com.google.appengine.v1;

public final class DomainMappingProto {
  private DomainMappingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_DomainMapping_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_DomainMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_SslSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_SslSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_ResourceRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ResourceRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/appengine/v1/domain_mapping.pro"
          + "to\022\023google.appengine.v1\"\240\001\n\rDomainMappin"
          + "g\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\0226\n\014ssl_setti"
          + "ngs\030\003 \001(\0132 .google.appengine.v1.SslSetti"
          + "ngs\022=\n\020resource_records\030\004 \003(\0132#.google.a"
          + "ppengine.v1.ResourceRecord\"\363\001\n\013SslSettin"
          + "gs\022\026\n\016certificate_id\030\001 \001(\t\022O\n\023ssl_manage"
          + "ment_type\030\003 \001(\01622.google.appengine.v1.Ss"
          + "lSettings.SslManagementType\022&\n\036pending_m"
          + "anaged_certificate_id\030\004 \001(\t\"S\n\021SslManage"
          + "mentType\022#\n\037SSL_MANAGEMENT_TYPE_UNSPECIF"
          + "IED\020\000\022\r\n\tAUTOMATIC\020\001\022\n\n\006MANUAL\020\002\"\263\001\n\016Res"
          + "ourceRecord\022\014\n\004name\030\001 \001(\t\022\016\n\006rrdata\030\002 \001("
          + "\t\022<\n\004type\030\003 \001(\0162..google.appengine.v1.Re"
          + "sourceRecord.RecordType\"E\n\nRecordType\022\033\n"
          + "\027RECORD_TYPE_UNSPECIFIED\020\000\022\005\n\001A\020\001\022\010\n\004AAA"
          + "A\020\002\022\t\n\005CNAME\020\003B\303\001\n\027com.google.appengine."
          + "v1B\022DomainMappingProtoP\001Z;cloud.google.c"
          + "om/go/appengine/apiv1/appenginepb;appeng"
          + "inepb\252\002\031Google.Cloud.AppEngine.V1\312\002\031Goog"
          + "le\\Cloud\\AppEngine\\V1\352\002\034Google::Cloud::A"
          + "ppEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_appengine_v1_DomainMapping_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_DomainMapping_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_DomainMapping_descriptor,
            new java.lang.String[] {
              "Name", "Id", "SslSettings", "ResourceRecords",
            });
    internal_static_google_appengine_v1_SslSettings_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1_SslSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_SslSettings_descriptor,
            new java.lang.String[] {
              "CertificateId", "SslManagementType", "PendingManagedCertificateId",
            });
    internal_static_google_appengine_v1_ResourceRecord_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_appengine_v1_ResourceRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_ResourceRecord_descriptor,
            new java.lang.String[] {
              "Name", "Rrdata", "Type",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
