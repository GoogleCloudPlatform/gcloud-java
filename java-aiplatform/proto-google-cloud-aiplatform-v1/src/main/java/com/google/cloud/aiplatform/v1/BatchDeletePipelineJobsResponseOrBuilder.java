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
// source: google/cloud/aiplatform/v1/pipeline_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface BatchDeletePipelineJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.BatchDeletePipelineJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * PipelineJobs deleted.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.PipelineJob pipeline_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.PipelineJob> getPipelineJobsList();
  /**
   *
   *
   * <pre>
   * PipelineJobs deleted.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.PipelineJob pipeline_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.PipelineJob getPipelineJobs(int index);
  /**
   *
   *
   * <pre>
   * PipelineJobs deleted.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.PipelineJob pipeline_jobs = 1;</code>
   */
  int getPipelineJobsCount();
  /**
   *
   *
   * <pre>
   * PipelineJobs deleted.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.PipelineJob pipeline_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.PipelineJobOrBuilder>
      getPipelineJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * PipelineJobs deleted.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.PipelineJob pipeline_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.PipelineJobOrBuilder getPipelineJobsOrBuilder(int index);
}
