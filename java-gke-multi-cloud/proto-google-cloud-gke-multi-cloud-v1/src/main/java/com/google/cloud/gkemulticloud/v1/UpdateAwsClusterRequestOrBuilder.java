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
// source: google/cloud/gkemulticloud/v1/aws_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface UpdateAwsClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.UpdateAwsClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster]
   * resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsCluster aws_cluster = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the awsCluster field is set.
   */
  boolean hasAwsCluster();
  /**
   *
   *
   * <pre>
   * Required. The [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster]
   * resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsCluster aws_cluster = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The awsCluster.
   */
  com.google.cloud.gkemulticloud.v1.AwsCluster getAwsCluster();
  /**
   *
   *
   * <pre>
   * Required. The [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster]
   * resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsCluster aws_cluster = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder getAwsClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * If set, only validate the request, but do not actually update the cluster.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field can only include these
   * fields from [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster]:
   *
   *  *   `description`.
   *  *   `annotations`.
   *  *   `control_plane.version`.
   *  *   `authorization.admin_users`.
   *  *   `authorization.admin_groups`.
   *  *   `binary_authorization.evaluation_mode`.
   *  *   `control_plane.aws_services_authentication.role_arn`.
   *  *   `control_plane.aws_services_authentication.role_session_name`.
   *  *   `control_plane.config_encryption.kms_key_arn`.
   *  *   `control_plane.instance_type`.
   *  *   `control_plane.security_group_ids`.
   *  *   `control_plane.proxy_config`.
   *  *   `control_plane.proxy_config.secret_arn`.
   *  *   `control_plane.proxy_config.secret_version`.
   *  *   `control_plane.root_volume.size_gib`.
   *  *   `control_plane.root_volume.volume_type`.
   *  *   `control_plane.root_volume.iops`.
   *  *   `control_plane.root_volume.throughput`.
   *  *   `control_plane.root_volume.kms_key_arn`.
   *  *   `control_plane.ssh_config`.
   *  *   `control_plane.ssh_config.ec2_key_pair`.
   *  *   `control_plane.instance_placement.tenancy`.
   *  *   `control_plane.iam_instance_profile`.
   *  *   `logging_config.component_config.enable_components`.
   *  *   `control_plane.tags`.
   *  *   `monitoring_config.managed_prometheus_config.enabled`.
   *  *   `networking.per_node_pool_sg_rules_disabled`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field can only include these
   * fields from [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster]:
   *
   *  *   `description`.
   *  *   `annotations`.
   *  *   `control_plane.version`.
   *  *   `authorization.admin_users`.
   *  *   `authorization.admin_groups`.
   *  *   `binary_authorization.evaluation_mode`.
   *  *   `control_plane.aws_services_authentication.role_arn`.
   *  *   `control_plane.aws_services_authentication.role_session_name`.
   *  *   `control_plane.config_encryption.kms_key_arn`.
   *  *   `control_plane.instance_type`.
   *  *   `control_plane.security_group_ids`.
   *  *   `control_plane.proxy_config`.
   *  *   `control_plane.proxy_config.secret_arn`.
   *  *   `control_plane.proxy_config.secret_version`.
   *  *   `control_plane.root_volume.size_gib`.
   *  *   `control_plane.root_volume.volume_type`.
   *  *   `control_plane.root_volume.iops`.
   *  *   `control_plane.root_volume.throughput`.
   *  *   `control_plane.root_volume.kms_key_arn`.
   *  *   `control_plane.ssh_config`.
   *  *   `control_plane.ssh_config.ec2_key_pair`.
   *  *   `control_plane.instance_placement.tenancy`.
   *  *   `control_plane.iam_instance_profile`.
   *  *   `logging_config.component_config.enable_components`.
   *  *   `control_plane.tags`.
   *  *   `monitoring_config.managed_prometheus_config.enabled`.
   *  *   `networking.per_node_pool_sg_rules_disabled`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field can only include these
   * fields from [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster]:
   *
   *  *   `description`.
   *  *   `annotations`.
   *  *   `control_plane.version`.
   *  *   `authorization.admin_users`.
   *  *   `authorization.admin_groups`.
   *  *   `binary_authorization.evaluation_mode`.
   *  *   `control_plane.aws_services_authentication.role_arn`.
   *  *   `control_plane.aws_services_authentication.role_session_name`.
   *  *   `control_plane.config_encryption.kms_key_arn`.
   *  *   `control_plane.instance_type`.
   *  *   `control_plane.security_group_ids`.
   *  *   `control_plane.proxy_config`.
   *  *   `control_plane.proxy_config.secret_arn`.
   *  *   `control_plane.proxy_config.secret_version`.
   *  *   `control_plane.root_volume.size_gib`.
   *  *   `control_plane.root_volume.volume_type`.
   *  *   `control_plane.root_volume.iops`.
   *  *   `control_plane.root_volume.throughput`.
   *  *   `control_plane.root_volume.kms_key_arn`.
   *  *   `control_plane.ssh_config`.
   *  *   `control_plane.ssh_config.ec2_key_pair`.
   *  *   `control_plane.instance_placement.tenancy`.
   *  *   `control_plane.iam_instance_profile`.
   *  *   `logging_config.component_config.enable_components`.
   *  *   `control_plane.tags`.
   *  *   `monitoring_config.managed_prometheus_config.enabled`.
   *  *   `networking.per_node_pool_sg_rules_disabled`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
