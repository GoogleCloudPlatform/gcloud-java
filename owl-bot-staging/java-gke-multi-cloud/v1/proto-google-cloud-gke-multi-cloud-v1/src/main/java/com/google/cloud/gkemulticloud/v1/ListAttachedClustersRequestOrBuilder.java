// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/attached_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface ListAttachedClustersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.ListAttachedClustersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent location which owns this collection of
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resources.
   *
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud Platform resource names.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent location which owns this collection of
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resources.
   *
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud Platform resource names.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of items to return.
   *
   * If not specified, a default value of 50 will be used by the service.
   * Regardless of the pageSize value, the response can include a partial list
   * and a caller should only rely on response's
   * [nextPageToken][google.cloud.gkemulticloud.v1.ListAttachedClustersResponse.next_page_token]
   * to determine if there are more instances left to be queried.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The `nextPageToken` value returned from a previous
   * [attachedClusters.list][google.cloud.gkemulticloud.v1.AttachedClusters.ListAttachedClusters]
   * request, if any.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The `nextPageToken` value returned from a previous
   * [attachedClusters.list][google.cloud.gkemulticloud.v1.AttachedClusters.ListAttachedClusters]
   * request, if any.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
