// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/common.proto

package com.google.cloud.retail.v2alpha;

public interface UserInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.UserInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Highly recommended for logged-in users. Unique identifier for logged-in
   * user, such as a user name. Don't set for anonymous users.
   *
   * Always use a hashed value for this ID.
   *
   * Don't set the field to the same fixed ID for different users. This mixes
   * the event history of those users together, which results in degraded
   * model quality.
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * Highly recommended for logged-in users. Unique identifier for logged-in
   * user, such as a user name. Don't set for anonymous users.
   *
   * Always use a hashed value for this ID.
   *
   * Don't set the field to the same fixed ID for different users. This mixes
   * the event history of those users together, which results in degraded
   * model quality.
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The end user's IP address. This field is used to extract location
   * information for personalization.
   *
   * This field must be either an IPv4 address (e.g. "104.133.9.80") or an IPv6
   * address (e.g. "2001:0db8:85a3:0000:0000:8a2e:0370:7334"). Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * This should not be set when:
   *
   * * setting
   * [SearchRequest.user_info][google.cloud.retail.v2alpha.SearchRequest.user_info].
   * * using the JavaScript tag in
   * [UserEventService.CollectUserEvent][google.cloud.retail.v2alpha.UserEventService.CollectUserEvent]
   * or if
   * [direct_user_request][google.cloud.retail.v2alpha.UserInfo.direct_user_request]
   * is set.
   * </pre>
   *
   * <code>string ip_address = 2;</code>
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   * <pre>
   * The end user's IP address. This field is used to extract location
   * information for personalization.
   *
   * This field must be either an IPv4 address (e.g. "104.133.9.80") or an IPv6
   * address (e.g. "2001:0db8:85a3:0000:0000:8a2e:0370:7334"). Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * This should not be set when:
   *
   * * setting
   * [SearchRequest.user_info][google.cloud.retail.v2alpha.SearchRequest.user_info].
   * * using the JavaScript tag in
   * [UserEventService.CollectUserEvent][google.cloud.retail.v2alpha.UserEventService.CollectUserEvent]
   * or if
   * [direct_user_request][google.cloud.retail.v2alpha.UserInfo.direct_user_request]
   * is set.
   * </pre>
   *
   * <code>string ip_address = 2;</code>
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString
      getIpAddressBytes();

  /**
   * <pre>
   * User agent as included in the HTTP header. Required for getting
   * [SearchResponse.sponsored_results][google.cloud.retail.v2alpha.SearchResponse.sponsored_results].
   *
   * The field must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   *
   * This should not be set when using the client side event reporting with
   * GTM or JavaScript tag in
   * [UserEventService.CollectUserEvent][google.cloud.retail.v2alpha.UserEventService.CollectUserEvent]
   * or if
   * [direct_user_request][google.cloud.retail.v2alpha.UserInfo.direct_user_request]
   * is set.
   * </pre>
   *
   * <code>string user_agent = 3;</code>
   * @return The userAgent.
   */
  java.lang.String getUserAgent();
  /**
   * <pre>
   * User agent as included in the HTTP header. Required for getting
   * [SearchResponse.sponsored_results][google.cloud.retail.v2alpha.SearchResponse.sponsored_results].
   *
   * The field must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   *
   * This should not be set when using the client side event reporting with
   * GTM or JavaScript tag in
   * [UserEventService.CollectUserEvent][google.cloud.retail.v2alpha.UserEventService.CollectUserEvent]
   * or if
   * [direct_user_request][google.cloud.retail.v2alpha.UserInfo.direct_user_request]
   * is set.
   * </pre>
   *
   * <code>string user_agent = 3;</code>
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString
      getUserAgentBytes();

  /**
   * <pre>
   * True if the request is made directly from the end user, in which case the
   * [ip_address][google.cloud.retail.v2alpha.UserInfo.ip_address] and
   * [user_agent][google.cloud.retail.v2alpha.UserInfo.user_agent] can be
   * populated from the HTTP request. This flag should be set only if the API
   * request is made directly from the end user such as a mobile app (and not if
   * a gateway or a server is processing and pushing the user events).
   *
   * This should not be set when using the JavaScript tag in
   * [UserEventService.CollectUserEvent][google.cloud.retail.v2alpha.UserEventService.CollectUserEvent].
   * </pre>
   *
   * <code>bool direct_user_request = 4;</code>
   * @return The directUserRequest.
   */
  boolean getDirectUserRequest();
}
