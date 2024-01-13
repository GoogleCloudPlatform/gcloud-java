// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/config/v1/config.proto

package com.google.cloud.config.v1;

public interface PreviewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.Preview)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The terraform blueprint to preview.
   * </pre>
   *
   * <code>.google.cloud.config.v1.TerraformBlueprint terraform_blueprint = 6;</code>
   * @return Whether the terraformBlueprint field is set.
   */
  boolean hasTerraformBlueprint();
  /**
   * <pre>
   * The terraform blueprint to preview.
   * </pre>
   *
   * <code>.google.cloud.config.v1.TerraformBlueprint terraform_blueprint = 6;</code>
   * @return The terraformBlueprint.
   */
  com.google.cloud.config.v1.TerraformBlueprint getTerraformBlueprint();
  /**
   * <pre>
   * The terraform blueprint to preview.
   * </pre>
   *
   * <code>.google.cloud.config.v1.TerraformBlueprint terraform_blueprint = 6;</code>
   */
  com.google.cloud.config.v1.TerraformBlueprintOrBuilder getTerraformBlueprintOrBuilder();

  /**
   * <pre>
   * Identifier. Resource name of the preview. Resource name can be user
   * provided or server generated ID if unspecified. Format:
   * `projects/{project}/locations/{location}/previews/{preview}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Identifier. Resource name of the preview. Resource name can be user
   * provided or server generated ID if unspecified. Format:
   * `projects/{project}/locations/{location}/previews/{preview}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Time the preview was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Time the preview was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Time the preview was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Optional. User-defined labels for the preview.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. User-defined labels for the preview.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. User-defined labels for the preview.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. User-defined labels for the preview.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. User-defined labels for the preview.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. Current state of the preview.
   * </pre>
   *
   * <code>.google.cloud.config.v1.Preview.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. Current state of the preview.
   * </pre>
   *
   * <code>.google.cloud.config.v1.Preview.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.config.v1.Preview.State getState();

  /**
   * <pre>
   * Optional. Optional deployment reference. If specified, the preview will be
   * performed using the provided deployment's current state and use any
   * relevant fields from the deployment unless explicitly specified in the
   * preview create request.
   * </pre>
   *
   * <code>string deployment = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The deployment.
   */
  java.lang.String getDeployment();
  /**
   * <pre>
   * Optional. Optional deployment reference. If specified, the preview will be
   * performed using the provided deployment's current state and use any
   * relevant fields from the deployment unless explicitly specified in the
   * preview create request.
   * </pre>
   *
   * <code>string deployment = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for deployment.
   */
  com.google.protobuf.ByteString
      getDeploymentBytes();

  /**
   * <pre>
   * Optional. Current mode of preview.
   * </pre>
   *
   * <code>.google.cloud.config.v1.Preview.PreviewMode preview_mode = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for previewMode.
   */
  int getPreviewModeValue();
  /**
   * <pre>
   * Optional. Current mode of preview.
   * </pre>
   *
   * <code>.google.cloud.config.v1.Preview.PreviewMode preview_mode = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The previewMode.
   */
  com.google.cloud.config.v1.Preview.PreviewMode getPreviewMode();

  /**
   * <pre>
   * Optional. Optional service account. If omitted, the deployment resource
   * reference must be provided, and the service account attached to the
   * deployment will be used.
   * </pre>
   *
   * <code>string service_account = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   * <pre>
   * Optional. Optional service account. If omitted, the deployment resource
   * reference must be provided, and the service account attached to the
   * deployment will be used.
   * </pre>
   *
   * <code>string service_account = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString
      getServiceAccountBytes();

  /**
   * <pre>
   * Optional. User-defined location of Cloud Build logs, artifacts, and
   * in Google Cloud Storage.
   * Format: `gs://{bucket}/{folder}`
   * A default bucket will be bootstrapped if the field is not set or empty
   * Default Bucket Format: `gs://&lt;project number&gt;-&lt;region&gt;-blueprint-config`
   * Constraints:
   * - The bucket needs to be in the same project as the deployment
   * - The path cannot be within the path of `gcs_source`
   * If omitted and deployment resource ref provided has artifacts_gcs_bucket
   * defined, that artifact bucket is used.
   * </pre>
   *
   * <code>optional string artifacts_gcs_bucket = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the artifactsGcsBucket field is set.
   */
  boolean hasArtifactsGcsBucket();
  /**
   * <pre>
   * Optional. User-defined location of Cloud Build logs, artifacts, and
   * in Google Cloud Storage.
   * Format: `gs://{bucket}/{folder}`
   * A default bucket will be bootstrapped if the field is not set or empty
   * Default Bucket Format: `gs://&lt;project number&gt;-&lt;region&gt;-blueprint-config`
   * Constraints:
   * - The bucket needs to be in the same project as the deployment
   * - The path cannot be within the path of `gcs_source`
   * If omitted and deployment resource ref provided has artifacts_gcs_bucket
   * defined, that artifact bucket is used.
   * </pre>
   *
   * <code>optional string artifacts_gcs_bucket = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The artifactsGcsBucket.
   */
  java.lang.String getArtifactsGcsBucket();
  /**
   * <pre>
   * Optional. User-defined location of Cloud Build logs, artifacts, and
   * in Google Cloud Storage.
   * Format: `gs://{bucket}/{folder}`
   * A default bucket will be bootstrapped if the field is not set or empty
   * Default Bucket Format: `gs://&lt;project number&gt;-&lt;region&gt;-blueprint-config`
   * Constraints:
   * - The bucket needs to be in the same project as the deployment
   * - The path cannot be within the path of `gcs_source`
   * If omitted and deployment resource ref provided has artifacts_gcs_bucket
   * defined, that artifact bucket is used.
   * </pre>
   *
   * <code>optional string artifacts_gcs_bucket = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for artifactsGcsBucket.
   */
  com.google.protobuf.ByteString
      getArtifactsGcsBucketBytes();

  /**
   * <pre>
   * Optional. The user-specified Worker Pool resource in which the Cloud Build
   * job will execute. Format
   * projects/{project}/locations/{location}/workerPools/{workerPoolId} If this
   * field is unspecified, the default Cloud Build worker pool will be used. If
   * omitted and deployment resource ref provided has worker_pool defined, that
   * worker pool is used.
   * </pre>
   *
   * <code>optional string worker_pool = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the workerPool field is set.
   */
  boolean hasWorkerPool();
  /**
   * <pre>
   * Optional. The user-specified Worker Pool resource in which the Cloud Build
   * job will execute. Format
   * projects/{project}/locations/{location}/workerPools/{workerPoolId} If this
   * field is unspecified, the default Cloud Build worker pool will be used. If
   * omitted and deployment resource ref provided has worker_pool defined, that
   * worker pool is used.
   * </pre>
   *
   * <code>optional string worker_pool = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The workerPool.
   */
  java.lang.String getWorkerPool();
  /**
   * <pre>
   * Optional. The user-specified Worker Pool resource in which the Cloud Build
   * job will execute. Format
   * projects/{project}/locations/{location}/workerPools/{workerPoolId} If this
   * field is unspecified, the default Cloud Build worker pool will be used. If
   * omitted and deployment resource ref provided has worker_pool defined, that
   * worker pool is used.
   * </pre>
   *
   * <code>optional string worker_pool = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for workerPool.
   */
  com.google.protobuf.ByteString
      getWorkerPoolBytes();

  /**
   * <pre>
   * Output only. Code describing any errors that may have occurred.
   * </pre>
   *
   * <code>.google.cloud.config.v1.Preview.ErrorCode error_code = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   * <pre>
   * Output only. Code describing any errors that may have occurred.
   * </pre>
   *
   * <code>.google.cloud.config.v1.Preview.ErrorCode error_code = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The errorCode.
   */
  com.google.cloud.config.v1.Preview.ErrorCode getErrorCode();

  /**
   * <pre>
   * Output only. Additional information regarding the current state.
   * </pre>
   *
   * <code>.google.rpc.Status error_status = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the errorStatus field is set.
   */
  boolean hasErrorStatus();
  /**
   * <pre>
   * Output only. Additional information regarding the current state.
   * </pre>
   *
   * <code>.google.rpc.Status error_status = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The errorStatus.
   */
  com.google.rpc.Status getErrorStatus();
  /**
   * <pre>
   * Output only. Additional information regarding the current state.
   * </pre>
   *
   * <code>.google.rpc.Status error_status = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorStatusOrBuilder();

  /**
   * <pre>
   * Output only. Cloud Build instance UUID associated with this preview.
   * </pre>
   *
   * <code>string build = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The build.
   */
  java.lang.String getBuild();
  /**
   * <pre>
   * Output only. Cloud Build instance UUID associated with this preview.
   * </pre>
   *
   * <code>string build = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for build.
   */
  com.google.protobuf.ByteString
      getBuildBytes();

  /**
   * <pre>
   * Output only. Summary of errors encountered during Terraform preview.
   * It has a size limit of 10, i.e. only top 10 errors will be summarized here.
   * </pre>
   *
   * <code>repeated .google.cloud.config.v1.TerraformError tf_errors = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.config.v1.TerraformError> 
      getTfErrorsList();
  /**
   * <pre>
   * Output only. Summary of errors encountered during Terraform preview.
   * It has a size limit of 10, i.e. only top 10 errors will be summarized here.
   * </pre>
   *
   * <code>repeated .google.cloud.config.v1.TerraformError tf_errors = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.config.v1.TerraformError getTfErrors(int index);
  /**
   * <pre>
   * Output only. Summary of errors encountered during Terraform preview.
   * It has a size limit of 10, i.e. only top 10 errors will be summarized here.
   * </pre>
   *
   * <code>repeated .google.cloud.config.v1.TerraformError tf_errors = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTfErrorsCount();
  /**
   * <pre>
   * Output only. Summary of errors encountered during Terraform preview.
   * It has a size limit of 10, i.e. only top 10 errors will be summarized here.
   * </pre>
   *
   * <code>repeated .google.cloud.config.v1.TerraformError tf_errors = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.config.v1.TerraformErrorOrBuilder> 
      getTfErrorsOrBuilderList();
  /**
   * <pre>
   * Output only. Summary of errors encountered during Terraform preview.
   * It has a size limit of 10, i.e. only top 10 errors will be summarized here.
   * </pre>
   *
   * <code>repeated .google.cloud.config.v1.TerraformError tf_errors = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.config.v1.TerraformErrorOrBuilder getTfErrorsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Link to tf-error.ndjson file, which contains the full list of
   * the errors encountered during a Terraform preview.
   * Format: `gs://{bucket}/{object}`.
   * </pre>
   *
   * <code>string error_logs = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The errorLogs.
   */
  java.lang.String getErrorLogs();
  /**
   * <pre>
   * Output only. Link to tf-error.ndjson file, which contains the full list of
   * the errors encountered during a Terraform preview.
   * Format: `gs://{bucket}/{object}`.
   * </pre>
   *
   * <code>string error_logs = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for errorLogs.
   */
  com.google.protobuf.ByteString
      getErrorLogsBytes();

  /**
   * <pre>
   * Output only. Artifacts from preview.
   * </pre>
   *
   * <code>.google.cloud.config.v1.PreviewArtifacts preview_artifacts = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the previewArtifacts field is set.
   */
  boolean hasPreviewArtifacts();
  /**
   * <pre>
   * Output only. Artifacts from preview.
   * </pre>
   *
   * <code>.google.cloud.config.v1.PreviewArtifacts preview_artifacts = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The previewArtifacts.
   */
  com.google.cloud.config.v1.PreviewArtifacts getPreviewArtifacts();
  /**
   * <pre>
   * Output only. Artifacts from preview.
   * </pre>
   *
   * <code>.google.cloud.config.v1.PreviewArtifacts preview_artifacts = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.config.v1.PreviewArtifactsOrBuilder getPreviewArtifactsOrBuilder();

  /**
   * <pre>
   * Output only. Location of preview logs in `gs://{bucket}/{object}` format.
   * </pre>
   *
   * <code>string logs = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The logs.
   */
  java.lang.String getLogs();
  /**
   * <pre>
   * Output only. Location of preview logs in `gs://{bucket}/{object}` format.
   * </pre>
   *
   * <code>string logs = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for logs.
   */
  com.google.protobuf.ByteString
      getLogsBytes();

  com.google.cloud.config.v1.Preview.BlueprintCase getBlueprintCase();
}
