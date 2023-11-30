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
// source: google/devtools/cloudtrace/v1/trace.proto

package com.google.devtools.cloudtrace.v1;

public interface ListTracesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v1.ListTracesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of trace records as specified by the view parameter.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  java.util.List<com.google.devtools.cloudtrace.v1.Trace> getTracesList();
  /**
   *
   *
   * <pre>
   * List of trace records as specified by the view parameter.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  com.google.devtools.cloudtrace.v1.Trace getTraces(int index);
  /**
   *
   *
   * <pre>
   * List of trace records as specified by the view parameter.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  int getTracesCount();
  /**
   *
   *
   * <pre>
   * List of trace records as specified by the view parameter.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  java.util.List<? extends com.google.devtools.cloudtrace.v1.TraceOrBuilder>
      getTracesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of trace records as specified by the view parameter.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  com.google.devtools.cloudtrace.v1.TraceOrBuilder getTracesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If defined, indicates that there are more traces that match the request
   * and that this value should be passed to the next request to continue
   * retrieving additional traces.
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
   * If defined, indicates that there are more traces that match the request
   * and that this value should be passed to the next request to continue
   * retrieving additional traces.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
