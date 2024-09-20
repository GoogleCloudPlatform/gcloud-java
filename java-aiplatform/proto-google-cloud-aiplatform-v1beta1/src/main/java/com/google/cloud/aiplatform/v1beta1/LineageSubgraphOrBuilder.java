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
// source: google/cloud/aiplatform/v1beta1/lineage_subgraph.proto

package com.google.cloud.aiplatform.v1beta1;

public interface LineageSubgraphOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.LineageSubgraph)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Artifact nodes in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Artifact artifacts = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Artifact> getArtifactsList();
  /**
   *
   *
   * <pre>
   * The Artifact nodes in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Artifact artifacts = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.Artifact getArtifacts(int index);
  /**
   *
   *
   * <pre>
   * The Artifact nodes in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Artifact artifacts = 1;</code>
   */
  int getArtifactsCount();
  /**
   *
   *
   * <pre>
   * The Artifact nodes in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Artifact artifacts = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ArtifactOrBuilder>
      getArtifactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Artifact nodes in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Artifact artifacts = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ArtifactOrBuilder getArtifactsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The Execution nodes in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Execution executions = 2;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Execution> getExecutionsList();
  /**
   *
   *
   * <pre>
   * The Execution nodes in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Execution executions = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.Execution getExecutions(int index);
  /**
   *
   *
   * <pre>
   * The Execution nodes in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Execution executions = 2;</code>
   */
  int getExecutionsCount();
  /**
   *
   *
   * <pre>
   * The Execution nodes in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Execution executions = 2;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ExecutionOrBuilder>
      getExecutionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Execution nodes in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Execution executions = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExecutionOrBuilder getExecutionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The Event edges between Artifacts and Executions in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 3;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Event> getEventsList();
  /**
   *
   *
   * <pre>
   * The Event edges between Artifacts and Executions in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.Event getEvents(int index);
  /**
   *
   *
   * <pre>
   * The Event edges between Artifacts and Executions in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 3;</code>
   */
  int getEventsCount();
  /**
   *
   *
   * <pre>
   * The Event edges between Artifacts and Executions in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 3;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.EventOrBuilder>
      getEventsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Event edges between Artifacts and Executions in the subgraph.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Event events = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EventOrBuilder getEventsOrBuilder(int index);
}
