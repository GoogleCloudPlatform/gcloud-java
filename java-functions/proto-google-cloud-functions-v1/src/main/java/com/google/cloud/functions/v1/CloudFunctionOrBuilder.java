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
// source: google/cloud/functions/v1/functions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.functions.v1;

public interface CloudFunctionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.CloudFunction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A user-defined name of the function. Function names must be unique
   * globally and match pattern `projects/&#42;&#47;locations/&#42;&#47;functions/&#42;`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * A user-defined name of the function. Function names must be unique
   * globally and match pattern `projects/&#42;&#47;locations/&#42;&#47;functions/&#42;`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * User-provided description of a function.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User-provided description of a function.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage URL, starting with `gs://`, pointing to the zip
   * archive which contains the function.
   * </pre>
   *
   * <code>string source_archive_url = 3;</code>
   *
   * @return Whether the sourceArchiveUrl field is set.
   */
  boolean hasSourceArchiveUrl();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage URL, starting with `gs://`, pointing to the zip
   * archive which contains the function.
   * </pre>
   *
   * <code>string source_archive_url = 3;</code>
   *
   * @return The sourceArchiveUrl.
   */
  java.lang.String getSourceArchiveUrl();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage URL, starting with `gs://`, pointing to the zip
   * archive which contains the function.
   * </pre>
   *
   * <code>string source_archive_url = 3;</code>
   *
   * @return The bytes for sourceArchiveUrl.
   */
  com.google.protobuf.ByteString getSourceArchiveUrlBytes();

  /**
   *
   *
   * <pre>
   * **Beta Feature**
   *
   * The source repository where a function is hosted.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.SourceRepository source_repository = 4;</code>
   *
   * @return Whether the sourceRepository field is set.
   */
  boolean hasSourceRepository();
  /**
   *
   *
   * <pre>
   * **Beta Feature**
   *
   * The source repository where a function is hosted.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.SourceRepository source_repository = 4;</code>
   *
   * @return The sourceRepository.
   */
  com.google.cloud.functions.v1.SourceRepository getSourceRepository();
  /**
   *
   *
   * <pre>
   * **Beta Feature**
   *
   * The source repository where a function is hosted.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.SourceRepository source_repository = 4;</code>
   */
  com.google.cloud.functions.v1.SourceRepositoryOrBuilder getSourceRepositoryOrBuilder();

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage signed URL used for source uploading, generated
   * by calling [google.cloud.functions.v1.GenerateUploadUrl].
   *
   * The signature is validated on write methods (Create, Update)
   * The signature is stripped from the Function object on read methods (Get,
   * List)
   * </pre>
   *
   * <code>string source_upload_url = 16;</code>
   *
   * @return Whether the sourceUploadUrl field is set.
   */
  boolean hasSourceUploadUrl();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage signed URL used for source uploading, generated
   * by calling [google.cloud.functions.v1.GenerateUploadUrl].
   *
   * The signature is validated on write methods (Create, Update)
   * The signature is stripped from the Function object on read methods (Get,
   * List)
   * </pre>
   *
   * <code>string source_upload_url = 16;</code>
   *
   * @return The sourceUploadUrl.
   */
  java.lang.String getSourceUploadUrl();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage signed URL used for source uploading, generated
   * by calling [google.cloud.functions.v1.GenerateUploadUrl].
   *
   * The signature is validated on write methods (Create, Update)
   * The signature is stripped from the Function object on read methods (Get,
   * List)
   * </pre>
   *
   * <code>string source_upload_url = 16;</code>
   *
   * @return The bytes for sourceUploadUrl.
   */
  com.google.protobuf.ByteString getSourceUploadUrlBytes();

  /**
   *
   *
   * <pre>
   * An HTTPS endpoint type of source that can be triggered via URL.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.HttpsTrigger https_trigger = 5;</code>
   *
   * @return Whether the httpsTrigger field is set.
   */
  boolean hasHttpsTrigger();
  /**
   *
   *
   * <pre>
   * An HTTPS endpoint type of source that can be triggered via URL.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.HttpsTrigger https_trigger = 5;</code>
   *
   * @return The httpsTrigger.
   */
  com.google.cloud.functions.v1.HttpsTrigger getHttpsTrigger();
  /**
   *
   *
   * <pre>
   * An HTTPS endpoint type of source that can be triggered via URL.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.HttpsTrigger https_trigger = 5;</code>
   */
  com.google.cloud.functions.v1.HttpsTriggerOrBuilder getHttpsTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * A source that fires events in response to a condition in another service.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.EventTrigger event_trigger = 6;</code>
   *
   * @return Whether the eventTrigger field is set.
   */
  boolean hasEventTrigger();
  /**
   *
   *
   * <pre>
   * A source that fires events in response to a condition in another service.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.EventTrigger event_trigger = 6;</code>
   *
   * @return The eventTrigger.
   */
  com.google.cloud.functions.v1.EventTrigger getEventTrigger();
  /**
   *
   *
   * <pre>
   * A source that fires events in response to a condition in another service.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.EventTrigger event_trigger = 6;</code>
   */
  com.google.cloud.functions.v1.EventTriggerOrBuilder getEventTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Status of the function deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v1.CloudFunctionStatus status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * Output only. Status of the function deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v1.CloudFunctionStatus status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.cloud.functions.v1.CloudFunctionStatus getStatus();

  /**
   *
   *
   * <pre>
   * The name of the function (as defined in source code) that will be
   * executed. Defaults to the resource name suffix (ID of the function), if not
   * specified.
   * </pre>
   *
   * <code>string entry_point = 8;</code>
   *
   * @return The entryPoint.
   */
  java.lang.String getEntryPoint();
  /**
   *
   *
   * <pre>
   * The name of the function (as defined in source code) that will be
   * executed. Defaults to the resource name suffix (ID of the function), if not
   * specified.
   * </pre>
   *
   * <code>string entry_point = 8;</code>
   *
   * @return The bytes for entryPoint.
   */
  com.google.protobuf.ByteString getEntryPointBytes();

  /**
   *
   *
   * <pre>
   * The runtime in which to run the function. Required when deploying a new
   * function, optional when updating an existing function. For a complete
   * list of possible choices, see the
   * [`gcloud` command
   * reference](https://cloud.google.com/sdk/gcloud/reference/functions/deploy#--runtime).
   * </pre>
   *
   * <code>string runtime = 19;</code>
   *
   * @return The runtime.
   */
  java.lang.String getRuntime();
  /**
   *
   *
   * <pre>
   * The runtime in which to run the function. Required when deploying a new
   * function, optional when updating an existing function. For a complete
   * list of possible choices, see the
   * [`gcloud` command
   * reference](https://cloud.google.com/sdk/gcloud/reference/functions/deploy#--runtime).
   * </pre>
   *
   * <code>string runtime = 19;</code>
   *
   * @return The bytes for runtime.
   */
  com.google.protobuf.ByteString getRuntimeBytes();

  /**
   *
   *
   * <pre>
   * The function execution timeout. Execution is considered failed and
   * can be terminated if the function is not completed at the end of the
   * timeout period. Defaults to 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 9;</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * The function execution timeout. Execution is considered failed and
   * can be terminated if the function is not completed at the end of the
   * timeout period. Defaults to 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 9;</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * The function execution timeout. Execution is considered failed and
   * can be terminated if the function is not completed at the end of the
   * timeout period. Defaults to 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 9;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * The amount of memory in MB available for a function.
   * Defaults to 256MB.
   * </pre>
   *
   * <code>int32 available_memory_mb = 10;</code>
   *
   * @return The availableMemoryMb.
   */
  int getAvailableMemoryMb();

  /**
   *
   *
   * <pre>
   * The email of the function's service account. If empty, defaults to
   * `{project_id}&#64;appspot.gserviceaccount.com`.
   * </pre>
   *
   * <code>string service_account_email = 11;</code>
   *
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * The email of the function's service account. If empty, defaults to
   * `{project_id}&#64;appspot.gserviceaccount.com`.
   * </pre>
   *
   * <code>string service_account_email = 11;</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString getServiceAccountEmailBytes();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a Cloud Function.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a Cloud Function.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a Cloud Function.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The version identifier of the Cloud Function. Each deployment
   * attempt results in a new version of a function being created.
   * </pre>
   *
   * <code>int64 version_id = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The versionId.
   */
  long getVersionId();

  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Environment variables that shall be available during function execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 17;</code>
   */
  int getEnvironmentVariablesCount();
  /**
   *
   *
   * <pre>
   * Environment variables that shall be available during function execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 17;</code>
   */
  boolean containsEnvironmentVariables(java.lang.String key);
  /** Use {@link #getEnvironmentVariablesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getEnvironmentVariables();
  /**
   *
   *
   * <pre>
   * Environment variables that shall be available during function execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 17;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getEnvironmentVariablesMap();
  /**
   *
   *
   * <pre>
   * Environment variables that shall be available during function execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 17;</code>
   */
  /* nullable */
  java.lang.String getEnvironmentVariablesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Environment variables that shall be available during function execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 17;</code>
   */
  java.lang.String getEnvironmentVariablesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Build environment variables that shall be available during build time.
   * </pre>
   *
   * <code>map&lt;string, string&gt; build_environment_variables = 28;</code>
   */
  int getBuildEnvironmentVariablesCount();
  /**
   *
   *
   * <pre>
   * Build environment variables that shall be available during build time.
   * </pre>
   *
   * <code>map&lt;string, string&gt; build_environment_variables = 28;</code>
   */
  boolean containsBuildEnvironmentVariables(java.lang.String key);
  /** Use {@link #getBuildEnvironmentVariablesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getBuildEnvironmentVariables();
  /**
   *
   *
   * <pre>
   * Build environment variables that shall be available during build time.
   * </pre>
   *
   * <code>map&lt;string, string&gt; build_environment_variables = 28;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getBuildEnvironmentVariablesMap();
  /**
   *
   *
   * <pre>
   * Build environment variables that shall be available during build time.
   * </pre>
   *
   * <code>map&lt;string, string&gt; build_environment_variables = 28;</code>
   */
  /* nullable */
  java.lang.String getBuildEnvironmentVariablesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Build environment variables that shall be available during build time.
   * </pre>
   *
   * <code>map&lt;string, string&gt; build_environment_variables = 28;</code>
   */
  java.lang.String getBuildEnvironmentVariablesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Deprecated: use vpc_connector
   * </pre>
   *
   * <code>string network = 18 [deprecated = true];</code>
   *
   * @deprecated google.cloud.functions.v1.CloudFunction.network is deprecated. See
   *     google/cloud/functions/v1/functions.proto;l=355
   * @return The network.
   */
  @java.lang.Deprecated
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Deprecated: use vpc_connector
   * </pre>
   *
   * <code>string network = 18 [deprecated = true];</code>
   *
   * @deprecated google.cloud.functions.v1.CloudFunction.network is deprecated. See
   *     google/cloud/functions/v1/functions.proto;l=355
   * @return The bytes for network.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * The limit on the maximum number of function instances that may coexist at a
   * given time.
   *
   * In some cases, such as rapid traffic surges, Cloud Functions may, for a
   * short period of time, create more instances than the specified max
   * instances limit. If your function cannot tolerate this temporary behavior,
   * you may want to factor in a safety margin and set a lower max instances
   * value than your function can tolerate.
   *
   * See the [Max
   * Instances](https://cloud.google.com/functions/docs/max-instances) Guide for
   * more details.
   * </pre>
   *
   * <code>int32 max_instances = 20;</code>
   *
   * @return The maxInstances.
   */
  int getMaxInstances();

  /**
   *
   *
   * <pre>
   * A lower bound for the number function instances that may coexist at a
   * given time.
   * </pre>
   *
   * <code>int32 min_instances = 32;</code>
   *
   * @return The minInstances.
   */
  int getMinInstances();

  /**
   *
   *
   * <pre>
   * The VPC Network Connector that this cloud function can connect to. It can
   * be either the fully-qualified URI, or the short name of the network
   * connector resource. The format of this field is
   * `projects/&#42;&#47;locations/&#42;&#47;connectors/&#42;`
   *
   * This field is mutually exclusive with `network` field and will eventually
   * replace it.
   *
   * See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for
   * more information on connecting Cloud projects.
   * </pre>
   *
   * <code>string vpc_connector = 22;</code>
   *
   * @return The vpcConnector.
   */
  java.lang.String getVpcConnector();
  /**
   *
   *
   * <pre>
   * The VPC Network Connector that this cloud function can connect to. It can
   * be either the fully-qualified URI, or the short name of the network
   * connector resource. The format of this field is
   * `projects/&#42;&#47;locations/&#42;&#47;connectors/&#42;`
   *
   * This field is mutually exclusive with `network` field and will eventually
   * replace it.
   *
   * See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for
   * more information on connecting Cloud projects.
   * </pre>
   *
   * <code>string vpc_connector = 22;</code>
   *
   * @return The bytes for vpcConnector.
   */
  com.google.protobuf.ByteString getVpcConnectorBytes();

  /**
   *
   *
   * <pre>
   * The egress settings for the connector, controlling what traffic is diverted
   * through it.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v1.CloudFunction.VpcConnectorEgressSettings vpc_connector_egress_settings = 23;
   * </code>
   *
   * @return The enum numeric value on the wire for vpcConnectorEgressSettings.
   */
  int getVpcConnectorEgressSettingsValue();
  /**
   *
   *
   * <pre>
   * The egress settings for the connector, controlling what traffic is diverted
   * through it.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v1.CloudFunction.VpcConnectorEgressSettings vpc_connector_egress_settings = 23;
   * </code>
   *
   * @return The vpcConnectorEgressSettings.
   */
  com.google.cloud.functions.v1.CloudFunction.VpcConnectorEgressSettings
      getVpcConnectorEgressSettings();

  /**
   *
   *
   * <pre>
   * The ingress settings for the function, controlling what traffic can reach
   * it.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction.IngressSettings ingress_settings = 24;</code>
   *
   * @return The enum numeric value on the wire for ingressSettings.
   */
  int getIngressSettingsValue();
  /**
   *
   *
   * <pre>
   * The ingress settings for the function, controlling what traffic can reach
   * it.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction.IngressSettings ingress_settings = 24;</code>
   *
   * @return The ingressSettings.
   */
  com.google.cloud.functions.v1.CloudFunction.IngressSettings getIngressSettings();

  /**
   *
   *
   * <pre>
   * Resource name of a KMS crypto key (managed by the user) used to
   * encrypt/decrypt function resources.
   *
   * It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   *
   * If specified, you must also provide an artifact registry repository using
   * the `docker_repository` field that was created with the same KMS crypto
   * key.
   *
   * The following service accounts need to be granted the role 'Cloud KMS
   * CryptoKey Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)'
   * on the Key/KeyRing/Project/Organization (least access preferred).
   *
   * 1. Google Cloud Functions service account
   *    (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) -
   *    Required to protect the function's image.
   * 2. Google Storage service account
   *    (service-{project_number}&#64;gs-project-accounts.iam.gserviceaccount.com) -
   *    Required to protect the function's source code.
   *    If this service account does not exist, deploying a function without a
   *    KMS key or retrieving the service agent name provisions it. For more
   *    information, see
   *    https://cloud.google.com/storage/docs/projects#service-agents and
   *    https://cloud.google.com/storage/docs/getting-service-agent#gsutil.
   *
   * Google Cloud Functions delegates access to service agents to protect
   * function resources in internal projects that are not accessible by the
   * end user.
   * </pre>
   *
   * <code>string kms_key_name = 25 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * Resource name of a KMS crypto key (managed by the user) used to
   * encrypt/decrypt function resources.
   *
   * It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   *
   * If specified, you must also provide an artifact registry repository using
   * the `docker_repository` field that was created with the same KMS crypto
   * key.
   *
   * The following service accounts need to be granted the role 'Cloud KMS
   * CryptoKey Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)'
   * on the Key/KeyRing/Project/Organization (least access preferred).
   *
   * 1. Google Cloud Functions service account
   *    (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) -
   *    Required to protect the function's image.
   * 2. Google Storage service account
   *    (service-{project_number}&#64;gs-project-accounts.iam.gserviceaccount.com) -
   *    Required to protect the function's source code.
   *    If this service account does not exist, deploying a function without a
   *    KMS key or retrieving the service agent name provisions it. For more
   *    information, see
   *    https://cloud.google.com/storage/docs/projects#service-agents and
   *    https://cloud.google.com/storage/docs/getting-service-agent#gsutil.
   *
   * Google Cloud Functions delegates access to service agents to protect
   * function resources in internal projects that are not accessible by the
   * end user.
   * </pre>
   *
   * <code>string kms_key_name = 25 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();

  /**
   *
   *
   * <pre>
   * Name of the Cloud Build Custom Worker Pool that should be used to build the
   * function. The format of this field is
   * `projects/{project}/locations/{region}/workerPools/{workerPool}` where
   * `{project}` and `{region}` are the project id and region respectively where
   * the worker pool is defined and `{workerPool}` is the short name of the
   * worker pool.
   *
   * If the project id is not the same as the function, then the Cloud
   * Functions Service Agent
   * (`service-&lt;project_number&gt;&#64;gcf-admin-robot.iam.gserviceaccount.com`) must
   * be granted the role Cloud Build Custom Workers Builder
   * (`roles/cloudbuild.customworkers.builder`) in the project.
   * </pre>
   *
   * <code>string build_worker_pool = 26;</code>
   *
   * @return The buildWorkerPool.
   */
  java.lang.String getBuildWorkerPool();
  /**
   *
   *
   * <pre>
   * Name of the Cloud Build Custom Worker Pool that should be used to build the
   * function. The format of this field is
   * `projects/{project}/locations/{region}/workerPools/{workerPool}` where
   * `{project}` and `{region}` are the project id and region respectively where
   * the worker pool is defined and `{workerPool}` is the short name of the
   * worker pool.
   *
   * If the project id is not the same as the function, then the Cloud
   * Functions Service Agent
   * (`service-&lt;project_number&gt;&#64;gcf-admin-robot.iam.gserviceaccount.com`) must
   * be granted the role Cloud Build Custom Workers Builder
   * (`roles/cloudbuild.customworkers.builder`) in the project.
   * </pre>
   *
   * <code>string build_worker_pool = 26;</code>
   *
   * @return The bytes for buildWorkerPool.
   */
  com.google.protobuf.ByteString getBuildWorkerPoolBytes();

  /**
   *
   *
   * <pre>
   * Output only. The Cloud Build ID of the latest successful deployment of the
   * function.
   * </pre>
   *
   * <code>string build_id = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The buildId.
   */
  java.lang.String getBuildId();
  /**
   *
   *
   * <pre>
   * Output only. The Cloud Build ID of the latest successful deployment of the
   * function.
   * </pre>
   *
   * <code>string build_id = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for buildId.
   */
  com.google.protobuf.ByteString getBuildIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The Cloud Build Name of the function deployment.
   * `projects/&lt;project-number&gt;/locations/&lt;region&gt;/builds/&lt;build-id&gt;`.
   * </pre>
   *
   * <code>string build_name = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The buildName.
   */
  java.lang.String getBuildName();
  /**
   *
   *
   * <pre>
   * Output only. The Cloud Build Name of the function deployment.
   * `projects/&lt;project-number&gt;/locations/&lt;region&gt;/builds/&lt;build-id&gt;`.
   * </pre>
   *
   * <code>string build_name = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for buildName.
   */
  com.google.protobuf.ByteString getBuildNameBytes();

  /**
   *
   *
   * <pre>
   * Secret environment variables configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v1.SecretEnvVar secret_environment_variables = 29;
   * </code>
   */
  java.util.List<com.google.cloud.functions.v1.SecretEnvVar> getSecretEnvironmentVariablesList();
  /**
   *
   *
   * <pre>
   * Secret environment variables configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v1.SecretEnvVar secret_environment_variables = 29;
   * </code>
   */
  com.google.cloud.functions.v1.SecretEnvVar getSecretEnvironmentVariables(int index);
  /**
   *
   *
   * <pre>
   * Secret environment variables configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v1.SecretEnvVar secret_environment_variables = 29;
   * </code>
   */
  int getSecretEnvironmentVariablesCount();
  /**
   *
   *
   * <pre>
   * Secret environment variables configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v1.SecretEnvVar secret_environment_variables = 29;
   * </code>
   */
  java.util.List<? extends com.google.cloud.functions.v1.SecretEnvVarOrBuilder>
      getSecretEnvironmentVariablesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Secret environment variables configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v1.SecretEnvVar secret_environment_variables = 29;
   * </code>
   */
  com.google.cloud.functions.v1.SecretEnvVarOrBuilder getSecretEnvironmentVariablesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Secret volumes configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v1.SecretVolume secret_volumes = 30;</code>
   */
  java.util.List<com.google.cloud.functions.v1.SecretVolume> getSecretVolumesList();
  /**
   *
   *
   * <pre>
   * Secret volumes configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v1.SecretVolume secret_volumes = 30;</code>
   */
  com.google.cloud.functions.v1.SecretVolume getSecretVolumes(int index);
  /**
   *
   *
   * <pre>
   * Secret volumes configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v1.SecretVolume secret_volumes = 30;</code>
   */
  int getSecretVolumesCount();
  /**
   *
   *
   * <pre>
   * Secret volumes configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v1.SecretVolume secret_volumes = 30;</code>
   */
  java.util.List<? extends com.google.cloud.functions.v1.SecretVolumeOrBuilder>
      getSecretVolumesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Secret volumes configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v1.SecretVolume secret_volumes = 30;</code>
   */
  com.google.cloud.functions.v1.SecretVolumeOrBuilder getSecretVolumesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Input only. An identifier for Firebase function sources. Disclaimer: This
   * field is only supported for Firebase function deployments.
   * </pre>
   *
   * <code>string source_token = 31 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The sourceToken.
   */
  java.lang.String getSourceToken();
  /**
   *
   *
   * <pre>
   * Input only. An identifier for Firebase function sources. Disclaimer: This
   * field is only supported for Firebase function deployments.
   * </pre>
   *
   * <code>string source_token = 31 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for sourceToken.
   */
  com.google.protobuf.ByteString getSourceTokenBytes();

  /**
   *
   *
   * <pre>
   * User-managed repository created in Artifact Registry to which the
   * function's Docker image will be pushed after it is built by Cloud Build.
   * May optionally be encrypted with a customer-managed encryption key (CMEK).
   * If unspecified and `docker_registry` is not explicitly set to
   * `CONTAINER_REGISTRY`, GCF will create and use a default Artifact Registry
   * repository named 'gcf-artifacts' in the region.
   *
   * It must match the pattern
   * `projects/{project}/locations/{location}/repositories/{repository}`.
   *
   * Cross-project repositories are not supported.
   * Cross-location repositories are not supported.
   * Repository format must be 'DOCKER'.
   * </pre>
   *
   * <code>string docker_repository = 34 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The dockerRepository.
   */
  java.lang.String getDockerRepository();
  /**
   *
   *
   * <pre>
   * User-managed repository created in Artifact Registry to which the
   * function's Docker image will be pushed after it is built by Cloud Build.
   * May optionally be encrypted with a customer-managed encryption key (CMEK).
   * If unspecified and `docker_registry` is not explicitly set to
   * `CONTAINER_REGISTRY`, GCF will create and use a default Artifact Registry
   * repository named 'gcf-artifacts' in the region.
   *
   * It must match the pattern
   * `projects/{project}/locations/{location}/repositories/{repository}`.
   *
   * Cross-project repositories are not supported.
   * Cross-location repositories are not supported.
   * Repository format must be 'DOCKER'.
   * </pre>
   *
   * <code>string docker_repository = 34 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for dockerRepository.
   */
  com.google.protobuf.ByteString getDockerRepositoryBytes();

  /**
   *
   *
   * <pre>
   * Docker Registry to use for this deployment.
   *
   * If unspecified, it defaults to `ARTIFACT_REGISTRY`.
   * If `docker_repository` field is specified, this field should either be left
   * unspecified or set to `ARTIFACT_REGISTRY`.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction.DockerRegistry docker_registry = 35;</code>
   *
   * @return The enum numeric value on the wire for dockerRegistry.
   */
  int getDockerRegistryValue();
  /**
   *
   *
   * <pre>
   * Docker Registry to use for this deployment.
   *
   * If unspecified, it defaults to `ARTIFACT_REGISTRY`.
   * If `docker_repository` field is specified, this field should either be left
   * unspecified or set to `ARTIFACT_REGISTRY`.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction.DockerRegistry docker_registry = 35;</code>
   *
   * @return The dockerRegistry.
   */
  com.google.cloud.functions.v1.CloudFunction.DockerRegistry getDockerRegistry();

  /**
   * <code>
   * .google.cloud.functions.v1.CloudFunction.AutomaticUpdatePolicy automatic_update_policy = 40;
   * </code>
   *
   * @return Whether the automaticUpdatePolicy field is set.
   */
  boolean hasAutomaticUpdatePolicy();
  /**
   * <code>
   * .google.cloud.functions.v1.CloudFunction.AutomaticUpdatePolicy automatic_update_policy = 40;
   * </code>
   *
   * @return The automaticUpdatePolicy.
   */
  com.google.cloud.functions.v1.CloudFunction.AutomaticUpdatePolicy getAutomaticUpdatePolicy();
  /**
   * <code>
   * .google.cloud.functions.v1.CloudFunction.AutomaticUpdatePolicy automatic_update_policy = 40;
   * </code>
   */
  com.google.cloud.functions.v1.CloudFunction.AutomaticUpdatePolicyOrBuilder
      getAutomaticUpdatePolicyOrBuilder();

  /**
   * <code>
   * .google.cloud.functions.v1.CloudFunction.OnDeployUpdatePolicy on_deploy_update_policy = 41;
   * </code>
   *
   * @return Whether the onDeployUpdatePolicy field is set.
   */
  boolean hasOnDeployUpdatePolicy();
  /**
   * <code>
   * .google.cloud.functions.v1.CloudFunction.OnDeployUpdatePolicy on_deploy_update_policy = 41;
   * </code>
   *
   * @return The onDeployUpdatePolicy.
   */
  com.google.cloud.functions.v1.CloudFunction.OnDeployUpdatePolicy getOnDeployUpdatePolicy();
  /**
   * <code>
   * .google.cloud.functions.v1.CloudFunction.OnDeployUpdatePolicy on_deploy_update_policy = 41;
   * </code>
   */
  com.google.cloud.functions.v1.CloudFunction.OnDeployUpdatePolicyOrBuilder
      getOnDeployUpdatePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * A service account the user provides for use with Cloud Build. The format of
   * this field is
   * `projects/{projectId}/serviceAccounts/{serviceAccountEmail}`.
   * </pre>
   *
   * <code>string build_service_account = 43;</code>
   *
   * @return The buildServiceAccount.
   */
  java.lang.String getBuildServiceAccount();
  /**
   *
   *
   * <pre>
   * A service account the user provides for use with Cloud Build. The format of
   * this field is
   * `projects/{projectId}/serviceAccounts/{serviceAccountEmail}`.
   * </pre>
   *
   * <code>string build_service_account = 43;</code>
   *
   * @return The bytes for buildServiceAccount.
   */
  com.google.protobuf.ByteString getBuildServiceAccountBytes();

  com.google.cloud.functions.v1.CloudFunction.SourceCodeCase getSourceCodeCase();

  com.google.cloud.functions.v1.CloudFunction.TriggerCase getTriggerCase();

  com.google.cloud.functions.v1.CloudFunction.RuntimeUpdatePolicyCase getRuntimeUpdatePolicyCase();
}
