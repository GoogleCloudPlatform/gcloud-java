// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/instance.proto

package com.google.bigtable.admin.v2;

public interface AppProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.AppProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (`OutputOnly`)
   * The unique name of the app profile. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/appProfiles/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * (`OutputOnly`)
   * The unique name of the app profile. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/appProfiles/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Strongly validated etag for optimistic concurrency control. Preserve the
   * value returned from `GetAppProfile` when calling `UpdateAppProfile` to
   * fail the request if there has been a modification in the mean time. The
   * `update_mask` of the request need not include `etag` for this protection
   * to apply.
   * See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and
   * [RFC 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more
   * details.
   * </pre>
   *
   * <code>string etag = 2;</code>
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Strongly validated etag for optimistic concurrency control. Preserve the
   * value returned from `GetAppProfile` when calling `UpdateAppProfile` to
   * fail the request if there has been a modification in the mean time. The
   * `update_mask` of the request need not include `etag` for this protection
   * to apply.
   * See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and
   * [RFC 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more
   * details.
   * </pre>
   *
   * <code>string etag = 2;</code>
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * Optional long form description of the use case for this AppProfile.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional long form description of the use case for this AppProfile.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Use a multi-cluster routing policy that may pick any cluster.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.MultiClusterRoutingUseAny multi_cluster_routing_use_any = 5;</code>
   */
  boolean hasMultiClusterRoutingUseAny();
  /**
   * <pre>
   * Use a multi-cluster routing policy that may pick any cluster.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.MultiClusterRoutingUseAny multi_cluster_routing_use_any = 5;</code>
   */
  com.google.bigtable.admin.v2.AppProfile.MultiClusterRoutingUseAny getMultiClusterRoutingUseAny();
  /**
   * <pre>
   * Use a multi-cluster routing policy that may pick any cluster.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.MultiClusterRoutingUseAny multi_cluster_routing_use_any = 5;</code>
   */
  com.google.bigtable.admin.v2.AppProfile.MultiClusterRoutingUseAnyOrBuilder getMultiClusterRoutingUseAnyOrBuilder();

  /**
   * <pre>
   * Use a single-cluster routing policy.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.SingleClusterRouting single_cluster_routing = 6;</code>
   */
  boolean hasSingleClusterRouting();
  /**
   * <pre>
   * Use a single-cluster routing policy.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.SingleClusterRouting single_cluster_routing = 6;</code>
   */
  com.google.bigtable.admin.v2.AppProfile.SingleClusterRouting getSingleClusterRouting();
  /**
   * <pre>
   * Use a single-cluster routing policy.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.SingleClusterRouting single_cluster_routing = 6;</code>
   */
  com.google.bigtable.admin.v2.AppProfile.SingleClusterRoutingOrBuilder getSingleClusterRoutingOrBuilder();

  public com.google.bigtable.admin.v2.AppProfile.RoutingPolicyCase getRoutingPolicyCase();
}
