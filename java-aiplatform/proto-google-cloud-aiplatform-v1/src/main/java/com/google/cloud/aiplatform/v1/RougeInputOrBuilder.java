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
// source: google/cloud/aiplatform/v1/evaluation_service.proto

package com.google.cloud.aiplatform.v1;

public interface RougeInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.RougeInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Spec for rouge score metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the metricSpec field is set.
   */
  boolean hasMetricSpec();
  /**
   *
   *
   * <pre>
   * Required. Spec for rouge score metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The metricSpec.
   */
  com.google.cloud.aiplatform.v1.RougeSpec getMetricSpec();
  /**
   *
   *
   * <pre>
   * Required. Spec for rouge score metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.RougeSpecOrBuilder getMetricSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Repeated rouge instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.RougeInstance> getInstancesList();
  /**
   *
   *
   * <pre>
   * Required. Repeated rouge instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.RougeInstance getInstances(int index);
  /**
   *
   *
   * <pre>
   * Required. Repeated rouge instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getInstancesCount();
  /**
   *
   *
   * <pre>
   * Required. Repeated rouge instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.RougeInstanceOrBuilder>
      getInstancesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Repeated rouge instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.RougeInstanceOrBuilder getInstancesOrBuilder(int index);
}
