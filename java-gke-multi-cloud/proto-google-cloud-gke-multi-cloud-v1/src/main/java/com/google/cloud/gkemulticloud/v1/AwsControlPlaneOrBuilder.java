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
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkemulticloud.v1;

public interface AwsControlPlaneOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AwsControlPlane)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Kubernetes version to run on control plane replicas
   * (e.g. `1.19.10-gke.1000`).
   *
   * You can list all supported versions on a given Google Cloud region by
   * calling
   * [GetAwsServerConfig][google.cloud.gkemulticloud.v1.AwsClusters.GetAwsServerConfig].
   * </pre>
   *
   * <code>string version = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Required. The Kubernetes version to run on control plane replicas
   * (e.g. `1.19.10-gke.1000`).
   *
   * You can list all supported versions on a given Google Cloud region by
   * calling
   * [GetAwsServerConfig][google.cloud.gkemulticloud.v1.AwsClusters.GetAwsServerConfig].
   * </pre>
   *
   * <code>string version = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The AWS instance type.
   *
   * When unspecified, it uses a default based on the cluster's version.
   * </pre>
   *
   * <code>string instance_type = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The instanceType.
   */
  java.lang.String getInstanceType();
  /**
   *
   *
   * <pre>
   * Optional. The AWS instance type.
   *
   * When unspecified, it uses a default based on the cluster's version.
   * </pre>
   *
   * <code>string instance_type = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for instanceType.
   */
  com.google.protobuf.ByteString getInstanceTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. SSH configuration for how to access the underlying control plane
   * machines.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsSshConfig ssh_config = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sshConfig field is set.
   */
  boolean hasSshConfig();
  /**
   *
   *
   * <pre>
   * Optional. SSH configuration for how to access the underlying control plane
   * machines.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsSshConfig ssh_config = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sshConfig.
   */
  com.google.cloud.gkemulticloud.v1.AwsSshConfig getSshConfig();
  /**
   *
   *
   * <pre>
   * Optional. SSH configuration for how to access the underlying control plane
   * machines.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsSshConfig ssh_config = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsSshConfigOrBuilder getSshConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of subnets where control plane replicas will run.
   * A replica will be provisioned on each subnet and up to three values
   * can be provided.
   * Each subnet must be in a different AWS Availability Zone (AZ).
   * </pre>
   *
   * <code>repeated string subnet_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the subnetIds.
   */
  java.util.List<java.lang.String> getSubnetIdsList();
  /**
   *
   *
   * <pre>
   * Required. The list of subnets where control plane replicas will run.
   * A replica will be provisioned on each subnet and up to three values
   * can be provided.
   * Each subnet must be in a different AWS Availability Zone (AZ).
   * </pre>
   *
   * <code>repeated string subnet_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of subnetIds.
   */
  int getSubnetIdsCount();
  /**
   *
   *
   * <pre>
   * Required. The list of subnets where control plane replicas will run.
   * A replica will be provisioned on each subnet and up to three values
   * can be provided.
   * Each subnet must be in a different AWS Availability Zone (AZ).
   * </pre>
   *
   * <code>repeated string subnet_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The subnetIds at the given index.
   */
  java.lang.String getSubnetIds(int index);
  /**
   *
   *
   * <pre>
   * Required. The list of subnets where control plane replicas will run.
   * A replica will be provisioned on each subnet and up to three values
   * can be provided.
   * Each subnet must be in a different AWS Availability Zone (AZ).
   * </pre>
   *
   * <code>repeated string subnet_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the subnetIds at the given index.
   */
  com.google.protobuf.ByteString getSubnetIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The IDs of additional security groups to add to control plane
   * replicas. The Anthos Multi-Cloud API will automatically create and manage
   * security groups with the minimum rules needed for a functioning cluster.
   * </pre>
   *
   * <code>repeated string security_group_ids = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the securityGroupIds.
   */
  java.util.List<java.lang.String> getSecurityGroupIdsList();
  /**
   *
   *
   * <pre>
   * Optional. The IDs of additional security groups to add to control plane
   * replicas. The Anthos Multi-Cloud API will automatically create and manage
   * security groups with the minimum rules needed for a functioning cluster.
   * </pre>
   *
   * <code>repeated string security_group_ids = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of securityGroupIds.
   */
  int getSecurityGroupIdsCount();
  /**
   *
   *
   * <pre>
   * Optional. The IDs of additional security groups to add to control plane
   * replicas. The Anthos Multi-Cloud API will automatically create and manage
   * security groups with the minimum rules needed for a functioning cluster.
   * </pre>
   *
   * <code>repeated string security_group_ids = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The securityGroupIds at the given index.
   */
  java.lang.String getSecurityGroupIds(int index);
  /**
   *
   *
   * <pre>
   * Optional. The IDs of additional security groups to add to control plane
   * replicas. The Anthos Multi-Cloud API will automatically create and manage
   * security groups with the minimum rules needed for a functioning cluster.
   * </pre>
   *
   * <code>repeated string security_group_ids = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the securityGroupIds at the given index.
   */
  com.google.protobuf.ByteString getSecurityGroupIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. The name or ARN of the AWS IAM instance profile to assign to each
   * control plane replica.
   * </pre>
   *
   * <code>string iam_instance_profile = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The iamInstanceProfile.
   */
  java.lang.String getIamInstanceProfile();
  /**
   *
   *
   * <pre>
   * Required. The name or ARN of the AWS IAM instance profile to assign to each
   * control plane replica.
   * </pre>
   *
   * <code>string iam_instance_profile = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for iamInstanceProfile.
   */
  com.google.protobuf.ByteString getIamInstanceProfileBytes();

  /**
   *
   *
   * <pre>
   * Optional. Configuration related to the root volume provisioned for each
   * control plane replica.
   *
   * Volumes will be provisioned in the availability zone associated
   * with the corresponding subnet.
   *
   * When unspecified, it defaults to 32 GiB with the GP2 volume type.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsVolumeTemplate root_volume = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the rootVolume field is set.
   */
  boolean hasRootVolume();
  /**
   *
   *
   * <pre>
   * Optional. Configuration related to the root volume provisioned for each
   * control plane replica.
   *
   * Volumes will be provisioned in the availability zone associated
   * with the corresponding subnet.
   *
   * When unspecified, it defaults to 32 GiB with the GP2 volume type.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsVolumeTemplate root_volume = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The rootVolume.
   */
  com.google.cloud.gkemulticloud.v1.AwsVolumeTemplate getRootVolume();
  /**
   *
   *
   * <pre>
   * Optional. Configuration related to the root volume provisioned for each
   * control plane replica.
   *
   * Volumes will be provisioned in the availability zone associated
   * with the corresponding subnet.
   *
   * When unspecified, it defaults to 32 GiB with the GP2 volume type.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsVolumeTemplate root_volume = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsVolumeTemplateOrBuilder getRootVolumeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configuration related to the main volume provisioned for each
   * control plane replica.
   * The main volume is in charge of storing all of the cluster's etcd state.
   *
   * Volumes will be provisioned in the availability zone associated
   * with the corresponding subnet.
   *
   * When unspecified, it defaults to 8 GiB with the GP2 volume type.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsVolumeTemplate main_volume = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the mainVolume field is set.
   */
  boolean hasMainVolume();
  /**
   *
   *
   * <pre>
   * Optional. Configuration related to the main volume provisioned for each
   * control plane replica.
   * The main volume is in charge of storing all of the cluster's etcd state.
   *
   * Volumes will be provisioned in the availability zone associated
   * with the corresponding subnet.
   *
   * When unspecified, it defaults to 8 GiB with the GP2 volume type.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsVolumeTemplate main_volume = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The mainVolume.
   */
  com.google.cloud.gkemulticloud.v1.AwsVolumeTemplate getMainVolume();
  /**
   *
   *
   * <pre>
   * Optional. Configuration related to the main volume provisioned for each
   * control plane replica.
   * The main volume is in charge of storing all of the cluster's etcd state.
   *
   * Volumes will be provisioned in the availability zone associated
   * with the corresponding subnet.
   *
   * When unspecified, it defaults to 8 GiB with the GP2 volume type.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsVolumeTemplate main_volume = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsVolumeTemplateOrBuilder getMainVolumeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsDatabaseEncryption database_encryption = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the databaseEncryption field is set.
   */
  boolean hasDatabaseEncryption();
  /**
   *
   *
   * <pre>
   * Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsDatabaseEncryption database_encryption = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The databaseEncryption.
   */
  com.google.cloud.gkemulticloud.v1.AwsDatabaseEncryption getDatabaseEncryption();
  /**
   *
   *
   * <pre>
   * Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsDatabaseEncryption database_encryption = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsDatabaseEncryptionOrBuilder getDatabaseEncryptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A set of AWS resource tags to propagate to all underlying managed
   * AWS resources.
   *
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * Optional. A set of AWS resource tags to propagate to all underlying managed
   * AWS resources.
   *
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsTags(java.lang.String key);
  /** Use {@link #getTagsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getTags();
  /**
   *
   *
   * <pre>
   * Optional. A set of AWS resource tags to propagate to all underlying managed
   * AWS resources.
   *
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getTagsMap();
  /**
   *
   *
   * <pre>
   * Optional. A set of AWS resource tags to propagate to all underlying managed
   * AWS resources.
   *
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. A set of AWS resource tags to propagate to all underlying managed
   * AWS resources.
   *
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getTagsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Authentication configuration for management of AWS resources.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsServicesAuthentication aws_services_authentication = 12 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the awsServicesAuthentication field is set.
   */
  boolean hasAwsServicesAuthentication();
  /**
   *
   *
   * <pre>
   * Required. Authentication configuration for management of AWS resources.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsServicesAuthentication aws_services_authentication = 12 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The awsServicesAuthentication.
   */
  com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication getAwsServicesAuthentication();
  /**
   *
   *
   * <pre>
   * Required. Authentication configuration for management of AWS resources.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsServicesAuthentication aws_services_authentication = 12 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsServicesAuthenticationOrBuilder
      getAwsServicesAuthenticationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsProxyConfig proxy_config = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the proxyConfig field is set.
   */
  boolean hasProxyConfig();
  /**
   *
   *
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsProxyConfig proxy_config = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The proxyConfig.
   */
  com.google.cloud.gkemulticloud.v1.AwsProxyConfig getProxyConfig();
  /**
   *
   *
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsProxyConfig proxy_config = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsProxyConfigOrBuilder getProxyConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Config encryption for user data.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsConfigEncryption config_encryption = 17 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the configEncryption field is set.
   */
  boolean hasConfigEncryption();
  /**
   *
   *
   * <pre>
   * Required. Config encryption for user data.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsConfigEncryption config_encryption = 17 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The configEncryption.
   */
  com.google.cloud.gkemulticloud.v1.AwsConfigEncryption getConfigEncryption();
  /**
   *
   *
   * <pre>
   * Required. Config encryption for user data.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsConfigEncryption config_encryption = 17 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsConfigEncryptionOrBuilder getConfigEncryptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The placement to use on control plane instances.
   * When unspecified, the VPC's default tenancy will be used.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsInstancePlacement instance_placement = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the instancePlacement field is set.
   */
  boolean hasInstancePlacement();
  /**
   *
   *
   * <pre>
   * Optional. The placement to use on control plane instances.
   * When unspecified, the VPC's default tenancy will be used.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsInstancePlacement instance_placement = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The instancePlacement.
   */
  com.google.cloud.gkemulticloud.v1.AwsInstancePlacement getInstancePlacement();
  /**
   *
   *
   * <pre>
   * Optional. The placement to use on control plane instances.
   * When unspecified, the VPC's default tenancy will be used.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsInstancePlacement instance_placement = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsInstancePlacementOrBuilder getInstancePlacementOrBuilder();
}
