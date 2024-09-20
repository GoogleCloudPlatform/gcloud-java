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
// source: google/cloud/aiplatform/v1/prediction_service.proto

package com.google.cloud.aiplatform.v1;

public interface RawPredictRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.RawPredictRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * The prediction input. Supports HTTP headers and arbitrary data payload.
   *
   * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
   * upper limit on the number of instances it supports per request. When this
   * limit it is exceeded for an AutoML model, the
   * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
   * method returns an error. When this limit is exceeded for a custom-trained
   * model, the behavior varies depending on the model.
   *
   * You can specify the schema for each instance in the
   * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
   * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
   * schema applies when you deploy the `Model` as a `DeployedModel` to an
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
   * method.
   * </pre>
   *
   * <code>.google.api.HttpBody http_body = 2;</code>
   *
   * @return Whether the httpBody field is set.
   */
  boolean hasHttpBody();
  /**
   *
   *
   * <pre>
   * The prediction input. Supports HTTP headers and arbitrary data payload.
   *
   * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
   * upper limit on the number of instances it supports per request. When this
   * limit it is exceeded for an AutoML model, the
   * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
   * method returns an error. When this limit is exceeded for a custom-trained
   * model, the behavior varies depending on the model.
   *
   * You can specify the schema for each instance in the
   * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
   * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
   * schema applies when you deploy the `Model` as a `DeployedModel` to an
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
   * method.
   * </pre>
   *
   * <code>.google.api.HttpBody http_body = 2;</code>
   *
   * @return The httpBody.
   */
  com.google.api.HttpBody getHttpBody();
  /**
   *
   *
   * <pre>
   * The prediction input. Supports HTTP headers and arbitrary data payload.
   *
   * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
   * upper limit on the number of instances it supports per request. When this
   * limit it is exceeded for an AutoML model, the
   * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
   * method returns an error. When this limit is exceeded for a custom-trained
   * model, the behavior varies depending on the model.
   *
   * You can specify the schema for each instance in the
   * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
   * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
   * schema applies when you deploy the `Model` as a `DeployedModel` to an
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
   * method.
   * </pre>
   *
   * <code>.google.api.HttpBody http_body = 2;</code>
   */
  com.google.api.HttpBodyOrBuilder getHttpBodyOrBuilder();
}
