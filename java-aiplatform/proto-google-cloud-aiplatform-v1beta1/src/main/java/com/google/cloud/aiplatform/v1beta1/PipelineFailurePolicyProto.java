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
// source: google/cloud/aiplatform/v1beta1/pipeline_failure_policy.proto

package com.google.cloud.aiplatform.v1beta1;

public final class PipelineFailurePolicyProto {
  private PipelineFailurePolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/aiplatform/v1beta1/pipeli"
          + "ne_failure_policy.proto\022\037google.cloud.ai"
          + "platform.v1beta1*\216\001\n\025PipelineFailurePoli"
          + "cy\022\'\n#PIPELINE_FAILURE_POLICY_UNSPECIFIE"
          + "D\020\000\022%\n!PIPELINE_FAILURE_POLICY_FAIL_SLOW"
          + "\020\001\022%\n!PIPELINE_FAILURE_POLICY_FAIL_FAST\020"
          + "\002B\361\001\n#com.google.cloud.aiplatform.v1beta"
          + "1B\032PipelineFailurePolicyProtoP\001ZCcloud.g"
          + "oogle.com/go/aiplatform/apiv1beta1/aipla"
          + "tformpb;aiplatformpb\252\002\037Google.Cloud.AIPl"
          + "atform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform"
          + "\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1"
          + "beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
