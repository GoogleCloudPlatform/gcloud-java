// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/control_service.proto

package com.google.cloud.retail.v2beta;

public interface ListControlsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.ListControlsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The catalog resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The catalog resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. Maximum number of results to return. If unspecified, defaults
   * to 50. Max allowed value is 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. A page token, received from a previous `ListControls` call.
   * Provide this to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A page token, received from a previous `ListControls` call.
   * Provide this to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. A filter to apply on the list results. Supported features:
   *
   * * List all the products under the parent branch if
   * [filter][google.cloud.retail.v2beta.ListControlsRequest.filter] is unset.
   * * List controls that are used in a single ServingConfig:
   *     'serving_config = "boosted_home_page_cvr"'
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. A filter to apply on the list results. Supported features:
   *
   * * List all the products under the parent branch if
   * [filter][google.cloud.retail.v2beta.ListControlsRequest.filter] is unset.
   * * List controls that are used in a single ServingConfig:
   *     'serving_config = "boosted_home_page_cvr"'
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
