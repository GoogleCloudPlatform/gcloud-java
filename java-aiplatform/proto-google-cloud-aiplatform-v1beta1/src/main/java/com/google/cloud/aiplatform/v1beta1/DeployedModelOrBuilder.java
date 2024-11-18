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
// source: google/cloud/aiplatform/v1beta1/endpoint.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface DeployedModelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DeployedModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A description of resources that are dedicated to the DeployedModel, and
   * that need a higher degree of manual configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 7;</code>
   *
   * @return Whether the dedicatedResources field is set.
   */
  boolean hasDedicatedResources();
  /**
   *
   *
   * <pre>
   * A description of resources that are dedicated to the DeployedModel, and
   * that need a higher degree of manual configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 7;</code>
   *
   * @return The dedicatedResources.
   */
  com.google.cloud.aiplatform.v1beta1.DedicatedResources getDedicatedResources();
  /**
   *
   *
   * <pre>
   * A description of resources that are dedicated to the DeployedModel, and
   * that need a higher degree of manual configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DedicatedResources dedicated_resources = 7;</code>
   */
  com.google.cloud.aiplatform.v1beta1.DedicatedResourcesOrBuilder getDedicatedResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * A description of resources that to large degree are decided by Vertex
   * AI, and require only a modest additional configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AutomaticResources automatic_resources = 8;</code>
   *
   * @return Whether the automaticResources field is set.
   */
  boolean hasAutomaticResources();
  /**
   *
   *
   * <pre>
   * A description of resources that to large degree are decided by Vertex
   * AI, and require only a modest additional configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AutomaticResources automatic_resources = 8;</code>
   *
   * @return The automaticResources.
   */
  com.google.cloud.aiplatform.v1beta1.AutomaticResources getAutomaticResources();
  /**
   *
   *
   * <pre>
   * A description of resources that to large degree are decided by Vertex
   * AI, and require only a modest additional configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AutomaticResources automatic_resources = 8;</code>
   */
  com.google.cloud.aiplatform.v1beta1.AutomaticResourcesOrBuilder getAutomaticResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource name of the shared DeploymentResourcePool to deploy on.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string shared_resources = 17 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the sharedResources field is set.
   */
  boolean hasSharedResources();
  /**
   *
   *
   * <pre>
   * The resource name of the shared DeploymentResourcePool to deploy on.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string shared_resources = 17 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The sharedResources.
   */
  java.lang.String getSharedResources();
  /**
   *
   *
   * <pre>
   * The resource name of the shared DeploymentResourcePool to deploy on.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string shared_resources = 17 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for sharedResources.
   */
  com.google.protobuf.ByteString getSharedResourcesBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The ID of the DeployedModel. If not provided upon deployment,
   * Vertex AI will generate a value for this ID.
   *
   * This value should be 1-10 characters, and valid characters are `/[0-9]/`.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Immutable. The ID of the DeployedModel. If not provided upon deployment,
   * Vertex AI will generate a value for this ID.
   *
   * This value should be 1-10 characters, and valid characters are `/[0-9]/`.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Model that this is the deployment of.
   * Note that the Model may be in a different location than the DeployedModel's
   * Endpoint.
   *
   * The resource name may contain version id or version alias to specify the
   * version.
   *  Example: `projects/{project}/locations/{location}/models/{model}&#64;2`
   *              or
   *            `projects/{project}/locations/{location}/models/{model}&#64;golden`
   * if no version is specified, the default version will be deployed.
   * </pre>
   *
   * <code>
   * string model = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Model that this is the deployment of.
   * Note that the Model may be in a different location than the DeployedModel's
   * Endpoint.
   *
   * The resource name may contain version id or version alias to specify the
   * version.
   *  Example: `projects/{project}/locations/{location}/models/{model}&#64;2`
   *              or
   *            `projects/{project}/locations/{location}/models/{model}&#64;golden`
   * if no version is specified, the default version will be deployed.
   * </pre>
   *
   * <code>
   * string model = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Output only. The version ID of the model that is deployed.
   * </pre>
   *
   * <code>string model_version_id = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The modelVersionId.
   */
  java.lang.String getModelVersionId();
  /**
   *
   *
   * <pre>
   * Output only. The version ID of the model that is deployed.
   * </pre>
   *
   * <code>string model_version_id = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for modelVersionId.
   */
  com.google.protobuf.ByteString getModelVersionIdBytes();

  /**
   *
   *
   * <pre>
   * The display name of the DeployedModel. If not provided upon creation,
   * the Model's display_name is used.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the DeployedModel. If not provided upon creation,
   * the Model's display_name is used.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the DeployedModel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the DeployedModel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the DeployedModel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Explanation configuration for this DeployedModel.
   *
   * When deploying a Model using
   * [EndpointService.DeployModel][google.cloud.aiplatform.v1beta1.EndpointService.DeployModel],
   * this value overrides the value of
   * [Model.explanation_spec][google.cloud.aiplatform.v1beta1.Model.explanation_spec].
   * All fields of
   * [explanation_spec][google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec]
   * are optional in the request. If a field of
   * [explanation_spec][google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec]
   * is not populated, the value of the same field of
   * [Model.explanation_spec][google.cloud.aiplatform.v1beta1.Model.explanation_spec]
   * is inherited. If the corresponding
   * [Model.explanation_spec][google.cloud.aiplatform.v1beta1.Model.explanation_spec]
   * is not populated, all fields of the
   * [explanation_spec][google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec]
   * will be used for the explanation configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationSpec explanation_spec = 9;</code>
   *
   * @return Whether the explanationSpec field is set.
   */
  boolean hasExplanationSpec();
  /**
   *
   *
   * <pre>
   * Explanation configuration for this DeployedModel.
   *
   * When deploying a Model using
   * [EndpointService.DeployModel][google.cloud.aiplatform.v1beta1.EndpointService.DeployModel],
   * this value overrides the value of
   * [Model.explanation_spec][google.cloud.aiplatform.v1beta1.Model.explanation_spec].
   * All fields of
   * [explanation_spec][google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec]
   * are optional in the request. If a field of
   * [explanation_spec][google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec]
   * is not populated, the value of the same field of
   * [Model.explanation_spec][google.cloud.aiplatform.v1beta1.Model.explanation_spec]
   * is inherited. If the corresponding
   * [Model.explanation_spec][google.cloud.aiplatform.v1beta1.Model.explanation_spec]
   * is not populated, all fields of the
   * [explanation_spec][google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec]
   * will be used for the explanation configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationSpec explanation_spec = 9;</code>
   *
   * @return The explanationSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationSpec getExplanationSpec();
  /**
   *
   *
   * <pre>
   * Explanation configuration for this DeployedModel.
   *
   * When deploying a Model using
   * [EndpointService.DeployModel][google.cloud.aiplatform.v1beta1.EndpointService.DeployModel],
   * this value overrides the value of
   * [Model.explanation_spec][google.cloud.aiplatform.v1beta1.Model.explanation_spec].
   * All fields of
   * [explanation_spec][google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec]
   * are optional in the request. If a field of
   * [explanation_spec][google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec]
   * is not populated, the value of the same field of
   * [Model.explanation_spec][google.cloud.aiplatform.v1beta1.Model.explanation_spec]
   * is inherited. If the corresponding
   * [Model.explanation_spec][google.cloud.aiplatform.v1beta1.Model.explanation_spec]
   * is not populated, all fields of the
   * [explanation_spec][google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec]
   * will be used for the explanation configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationSpec explanation_spec = 9;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationSpecOrBuilder getExplanationSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * If true, deploy the model without explainable feature, regardless the
   * existence of
   * [Model.explanation_spec][google.cloud.aiplatform.v1beta1.Model.explanation_spec]
   * or
   * [explanation_spec][google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec].
   * </pre>
   *
   * <code>bool disable_explanations = 19;</code>
   *
   * @return The disableExplanations.
   */
  boolean getDisableExplanations();

  /**
   *
   *
   * <pre>
   * The service account that the DeployedModel's container runs as. Specify the
   * email address of the service account. If this service account is not
   * specified, the container runs as a service account that doesn't have access
   * to the resource project.
   *
   * Users deploying the Model must have the `iam.serviceAccounts.actAs`
   * permission on this service account.
   * </pre>
   *
   * <code>string service_account = 11;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * The service account that the DeployedModel's container runs as. Specify the
   * email address of the service account. If this service account is not
   * specified, the container runs as a service account that doesn't have access
   * to the resource project.
   *
   * Users deploying the Model must have the `iam.serviceAccounts.actAs`
   * permission on this service account.
   * </pre>
   *
   * <code>string service_account = 11;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * If true, the container of the DeployedModel instances will send `stderr`
   * and `stdout` streams to Cloud Logging.
   *
   * Only supported for custom-trained Models and AutoML Tabular Models.
   * </pre>
   *
   * <code>bool enable_container_logging = 12;</code>
   *
   * @return The enableContainerLogging.
   */
  boolean getEnableContainerLogging();

  /**
   *
   *
   * <pre>
   * If true, online prediction access logs are sent to Cloud
   * Logging.
   * These logs are like standard server access logs, containing
   * information like timestamp and latency for each prediction request.
   *
   * Note that logs may incur a cost, especially if your project
   * receives prediction requests at a high queries per second rate (QPS).
   * Estimate your costs before enabling this option.
   * </pre>
   *
   * <code>bool enable_access_logging = 13;</code>
   *
   * @return The enableAccessLogging.
   */
  boolean getEnableAccessLogging();

  /**
   *
   *
   * <pre>
   * Output only. Provide paths for users to send predict/explain/health
   * requests directly to the deployed model services running on Cloud via
   * private services access. This field is populated if
   * [network][google.cloud.aiplatform.v1beta1.Endpoint.network] is configured.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PrivateEndpoints private_endpoints = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the privateEndpoints field is set.
   */
  boolean hasPrivateEndpoints();
  /**
   *
   *
   * <pre>
   * Output only. Provide paths for users to send predict/explain/health
   * requests directly to the deployed model services running on Cloud via
   * private services access. This field is populated if
   * [network][google.cloud.aiplatform.v1beta1.Endpoint.network] is configured.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PrivateEndpoints private_endpoints = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The privateEndpoints.
   */
  com.google.cloud.aiplatform.v1beta1.PrivateEndpoints getPrivateEndpoints();
  /**
   *
   *
   * <pre>
   * Output only. Provide paths for users to send predict/explain/health
   * requests directly to the deployed model services running on Cloud via
   * private services access. This field is populated if
   * [network][google.cloud.aiplatform.v1beta1.Endpoint.network] is configured.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PrivateEndpoints private_endpoints = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PrivateEndpointsOrBuilder getPrivateEndpointsOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for faster model deployment.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FasterDeploymentConfig faster_deployment_config = 23;
   * </code>
   *
   * @return Whether the fasterDeploymentConfig field is set.
   */
  boolean hasFasterDeploymentConfig();
  /**
   *
   *
   * <pre>
   * Configuration for faster model deployment.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FasterDeploymentConfig faster_deployment_config = 23;
   * </code>
   *
   * @return The fasterDeploymentConfig.
   */
  com.google.cloud.aiplatform.v1beta1.FasterDeploymentConfig getFasterDeploymentConfig();
  /**
   *
   *
   * <pre>
   * Configuration for faster model deployment.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FasterDeploymentConfig faster_deployment_config = 23;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FasterDeploymentConfigOrBuilder
      getFasterDeploymentConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * System labels to apply to Model Garden deployments.
   * System labels are managed by Google for internal use only.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_labels = 28;</code>
   */
  int getSystemLabelsCount();
  /**
   *
   *
   * <pre>
   * System labels to apply to Model Garden deployments.
   * System labels are managed by Google for internal use only.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_labels = 28;</code>
   */
  boolean containsSystemLabels(java.lang.String key);
  /** Use {@link #getSystemLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getSystemLabels();
  /**
   *
   *
   * <pre>
   * System labels to apply to Model Garden deployments.
   * System labels are managed by Google for internal use only.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_labels = 28;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getSystemLabelsMap();
  /**
   *
   *
   * <pre>
   * System labels to apply to Model Garden deployments.
   * System labels are managed by Google for internal use only.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_labels = 28;</code>
   */
  /* nullable */
  java.lang.String getSystemLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * System labels to apply to Model Garden deployments.
   * System labels are managed by Google for internal use only.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_labels = 28;</code>
   */
  java.lang.String getSystemLabelsOrThrow(java.lang.String key);

  com.google.cloud.aiplatform.v1beta1.DeployedModel.PredictionResourcesCase
      getPredictionResourcesCase();
}
