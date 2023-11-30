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
// source: google/cloud/run/v2/job.proto

package com.google.cloud.run.v2;

public interface ListJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.ListJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resulting list of Jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Job jobs = 1;</code>
   */
  java.util.List<com.google.cloud.run.v2.Job> getJobsList();
  /**
   *
   *
   * <pre>
   * The resulting list of Jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Job jobs = 1;</code>
   */
  com.google.cloud.run.v2.Job getJobs(int index);
  /**
   *
   *
   * <pre>
   * The resulting list of Jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Job jobs = 1;</code>
   */
  int getJobsCount();
  /**
   *
   *
   * <pre>
   * The resulting list of Jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Job jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.run.v2.JobOrBuilder> getJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The resulting list of Jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Job jobs = 1;</code>
   */
  com.google.cloud.run.v2.JobOrBuilder getJobsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token indicating there are more items than page_size. Use it in the next
   * ListJobs request to continue.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token indicating there are more items than page_size. Use it in the next
   * ListJobs request to continue.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
