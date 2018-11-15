// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1beta1;

public interface ListSourcesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.ListSourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the parent of sources to list. Its format should be
   * "organizations/[organization_id]".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent of sources to list. Its format should be
   * "organizations/[organization_id]".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The value returned by the last `ListSourcesResponse`; indicates
   * that this is a continuation of a prior `ListSources` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value returned by the last `ListSourcesResponse`; indicates
   * that this is a continuation of a prior `ListSources` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The maximum number of results to return in a single response. Default is
   * 10, minimum is 1, maximum is 1000.
   * </pre>
   *
   * <code>int32 page_size = 7;</code>
   */
  int getPageSize();
}
