// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/aws_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface CreateAwsClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.CreateAwsClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent location where this
   * [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resource will be
   * created.
   *
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent location where this
   * [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resource will be
   * created.
   *
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The specification of the
   * [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] to create.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsCluster aws_cluster = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the awsCluster field is set.
   */
  boolean hasAwsCluster();
  /**
   * <pre>
   * Required. The specification of the
   * [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] to create.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsCluster aws_cluster = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The awsCluster.
   */
  com.google.cloud.gkemulticloud.v1.AwsCluster getAwsCluster();
  /**
   * <pre>
   * Required. The specification of the
   * [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] to create.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsCluster aws_cluster = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder getAwsClusterOrBuilder();

  /**
   * <pre>
   * Required. A client provided ID the resource. Must be unique within the
   * parent resource.
   *
   * The provided ID will be part of the
   * [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resource name
   * formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/awsClusters/&lt;cluster-id&gt;`.
   *
   * Valid characters are `/[a-z][0-9]-/`. Cannot be longer than 63 characters.
   * </pre>
   *
   * <code>string aws_cluster_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The awsClusterId.
   */
  java.lang.String getAwsClusterId();
  /**
   * <pre>
   * Required. A client provided ID the resource. Must be unique within the
   * parent resource.
   *
   * The provided ID will be part of the
   * [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resource name
   * formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/awsClusters/&lt;cluster-id&gt;`.
   *
   * Valid characters are `/[a-z][0-9]-/`. Cannot be longer than 63 characters.
   * </pre>
   *
   * <code>string aws_cluster_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for awsClusterId.
   */
  com.google.protobuf.ByteString
      getAwsClusterIdBytes();

  /**
   * <pre>
   * If set, only validate the request, but do not actually create the cluster.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
