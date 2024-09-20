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
// source: google/cloud/aiplatform/v1beta1/model.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ProbeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Probe)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ExecAction probes the health of a container by executing a command.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Probe.ExecAction exec = 1;</code>
   *
   * @return Whether the exec field is set.
   */
  boolean hasExec();
  /**
   *
   *
   * <pre>
   * ExecAction probes the health of a container by executing a command.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Probe.ExecAction exec = 1;</code>
   *
   * @return The exec.
   */
  com.google.cloud.aiplatform.v1beta1.Probe.ExecAction getExec();
  /**
   *
   *
   * <pre>
   * ExecAction probes the health of a container by executing a command.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Probe.ExecAction exec = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.Probe.ExecActionOrBuilder getExecOrBuilder();

  /**
   *
   *
   * <pre>
   * How often (in seconds) to perform the probe. Default to 10 seconds.
   * Minimum value is 1. Must be less than timeout_seconds.
   *
   * Maps to Kubernetes probe argument 'periodSeconds'.
   * </pre>
   *
   * <code>int32 period_seconds = 2;</code>
   *
   * @return The periodSeconds.
   */
  int getPeriodSeconds();

  /**
   *
   *
   * <pre>
   * Number of seconds after which the probe times out. Defaults to 1 second.
   * Minimum value is 1. Must be greater or equal to period_seconds.
   *
   * Maps to Kubernetes probe argument 'timeoutSeconds'.
   * </pre>
   *
   * <code>int32 timeout_seconds = 3;</code>
   *
   * @return The timeoutSeconds.
   */
  int getTimeoutSeconds();

  com.google.cloud.aiplatform.v1beta1.Probe.ProbeTypeCase getProbeTypeCase();
}
