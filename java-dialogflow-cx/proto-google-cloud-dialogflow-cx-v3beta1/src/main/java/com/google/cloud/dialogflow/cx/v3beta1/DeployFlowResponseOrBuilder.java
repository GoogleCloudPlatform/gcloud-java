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
// source: google/cloud/dialogflow/cx/v3beta1/environment.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public interface DeployFlowResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.DeployFlowResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The updated environment where the flow is deployed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Environment environment = 1;</code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   *
   *
   * <pre>
   * The updated environment where the flow is deployed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Environment environment = 1;</code>
   *
   * @return The environment.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Environment getEnvironment();
  /**
   *
   *
   * <pre>
   * The updated environment where the flow is deployed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Environment environment = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.EnvironmentOrBuilder getEnvironmentOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the flow version deployment.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/
   * environments/&lt;Environment ID&gt;/deployments/&lt;Deployment ID&gt;`.
   * </pre>
   *
   * <code>string deployment = 2;</code>
   *
   * @return The deployment.
   */
  java.lang.String getDeployment();
  /**
   *
   *
   * <pre>
   * The name of the flow version deployment.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/
   * environments/&lt;Environment ID&gt;/deployments/&lt;Deployment ID&gt;`.
   * </pre>
   *
   * <code>string deployment = 2;</code>
   *
   * @return The bytes for deployment.
   */
  com.google.protobuf.ByteString getDeploymentBytes();
}
