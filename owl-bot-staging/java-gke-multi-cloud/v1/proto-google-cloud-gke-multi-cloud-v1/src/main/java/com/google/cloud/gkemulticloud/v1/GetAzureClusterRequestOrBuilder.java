// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/azure_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface GetAzureClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.GetAzureClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the
   * [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resource to
   * describe.
   *
   * `AzureCluster` names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/azureClusters/&lt;cluster-id&gt;`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud Platform resource names.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the
   * [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resource to
   * describe.
   *
   * `AzureCluster` names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/azureClusters/&lt;cluster-id&gt;`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud Platform resource names.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
