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
// source: google/cloud/aiplatform/v1beta1/model_monitoring_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ListModelMonitorsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListModelMonitorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of ModelMonitor in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitor model_monitors = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelMonitor> getModelMonitorsList();
  /**
   *
   *
   * <pre>
   * List of ModelMonitor in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitor model_monitors = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitor getModelMonitors(int index);
  /**
   *
   *
   * <pre>
   * List of ModelMonitor in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitor model_monitors = 1;</code>
   */
  int getModelMonitorsCount();
  /**
   *
   *
   * <pre>
   * List of ModelMonitor in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitor model_monitors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelMonitorOrBuilder>
      getModelMonitorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of ModelMonitor in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitor model_monitors = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitorOrBuilder getModelMonitorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListModelMonitorsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelMonitorsRequest.page_token]
   * to obtain that page.
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
   * A token to retrieve the next page of results.
   * Pass to
   * [ListModelMonitorsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelMonitorsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
