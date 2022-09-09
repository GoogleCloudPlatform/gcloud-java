// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface CreateInstancesRegionInstanceGroupManagerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.CreateInstancesRegionInstanceGroupManagerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the managed instance group. It should conform to RFC1035.
   * </pre>
   *
   * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceGroupManager.
   */
  java.lang.String getInstanceGroupManager();
  /**
   * <pre>
   * The name of the managed instance group. It should conform to RFC1035.
   * </pre>
   *
   * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceGroupManager.
   */
  com.google.protobuf.ByteString
      getInstanceGroupManagerBytes();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * The name of the region where the managed instance group is located. It should conform to RFC1035.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "region"];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * The name of the region where the managed instance group is located. It should conform to RFC1035.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "region"];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest region_instance_group_managers_create_instances_request_resource = 359014280 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the regionInstanceGroupManagersCreateInstancesRequestResource field is set.
   */
  boolean hasRegionInstanceGroupManagersCreateInstancesRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest region_instance_group_managers_create_instances_request_resource = 359014280 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The regionInstanceGroupManagersCreateInstancesRequestResource.
   */
  com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest getRegionInstanceGroupManagersCreateInstancesRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest region_instance_group_managers_create_instances_request_resource = 359014280 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequestOrBuilder getRegionInstanceGroupManagersCreateInstancesRequestResourceOrBuilder();

  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return Whether the requestId field is set.
   */
  boolean hasRequestId();
  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
