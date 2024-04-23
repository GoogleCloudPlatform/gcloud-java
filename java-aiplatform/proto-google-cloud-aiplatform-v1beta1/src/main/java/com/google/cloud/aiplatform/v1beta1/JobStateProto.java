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
// source: google/cloud/aiplatform/v1beta1/job_state.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public final class JobStateProto {
  private JobStateProto() {}

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
      "\n/google/cloud/aiplatform/v1beta1/job_st"
          + "ate.proto\022\037google.cloud.aiplatform.v1bet"
          + "a1*\263\002\n\010JobState\022\031\n\025JOB_STATE_UNSPECIFIED"
          + "\020\000\022\024\n\020JOB_STATE_QUEUED\020\001\022\025\n\021JOB_STATE_PE"
          + "NDING\020\002\022\025\n\021JOB_STATE_RUNNING\020\003\022\027\n\023JOB_ST"
          + "ATE_SUCCEEDED\020\004\022\024\n\020JOB_STATE_FAILED\020\005\022\030\n"
          + "\024JOB_STATE_CANCELLING\020\006\022\027\n\023JOB_STATE_CAN"
          + "CELLED\020\007\022\024\n\020JOB_STATE_PAUSED\020\010\022\025\n\021JOB_ST"
          + "ATE_EXPIRED\020\t\022\026\n\022JOB_STATE_UPDATING\020\n\022!\n"
          + "\035JOB_STATE_PARTIALLY_SUCCEEDED\020\013B\344\001\n#com"
          + ".google.cloud.aiplatform.v1beta1B\rJobSta"
          + "teProtoP\001ZCcloud.google.com/go/aiplatfor"
          + "m/apiv1beta1/aiplatformpb;aiplatformpb\252\002"
          + "\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Googl"
          + "e\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::Clo"
          + "ud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
