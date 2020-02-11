/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/securitycenter/v1p1beta1/run_asset_discovery_response.proto

package com.google.cloud.securitycenter.v1p1beta1;

public final class RunAssetDiscoveryResponseOuterClass {
  private RunAssetDiscoveryResponseOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1p1beta1_RunAssetDiscoveryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_RunAssetDiscoveryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/cloud/securitycenter/v1p1beta1/"
          + "run_asset_discovery_response.proto\022%goog"
          + "le.cloud.securitycenter.v1p1beta1\032\034googl"
          + "e/api/annotations.proto\032\036google/protobuf"
          + "/duration.proto\"\356\001\n\031RunAssetDiscoveryRes"
          + "ponse\022U\n\005state\030\001 \001(\0162F.google.cloud.secu"
          + "ritycenter.v1p1beta1.RunAssetDiscoveryRe"
          + "sponse.State\022+\n\010duration\030\002 \001(\0132\031.google."
          + "protobuf.Duration\"M\n\005State\022\025\n\021STATE_UNSP"
          + "ECIFIED\020\000\022\r\n\tCOMPLETED\020\001\022\016\n\nSUPERSEDED\020\002"
          + "\022\016\n\nTERMINATED\020\003B\375\001\n)com.google.cloud.se"
          + "curitycenter.v1p1beta1P\001ZSgoogle.golang."
          + "org/genproto/googleapis/cloud/securityce"
          + "nter/v1p1beta1;securitycenter\252\002%Google.C"
          + "loud.SecurityCenter.V1P1Beta1\312\002%Google\\C"
          + "loud\\SecurityCenter\\V1p1beta1\352\002(Google::"
          + "Cloud::SecurityCenter::V1p1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1p1beta1_RunAssetDiscoveryResponse_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_RunAssetDiscoveryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1p1beta1_RunAssetDiscoveryResponse_descriptor,
            new java.lang.String[] {
              "State", "Duration",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
