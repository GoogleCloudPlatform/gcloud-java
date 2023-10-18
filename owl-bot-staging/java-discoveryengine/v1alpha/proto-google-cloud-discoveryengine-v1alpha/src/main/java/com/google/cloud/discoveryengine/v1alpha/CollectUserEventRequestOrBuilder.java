// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1alpha/user_event_service.proto

package com.google.cloud.discoveryengine.v1alpha;

public interface CollectUserEventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.CollectUserEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent DataStore resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent DataStore resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. URL encoded UserEvent proto with a length limit of 2,000,000
   * characters.
   * </pre>
   *
   * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The userEvent.
   */
  java.lang.String getUserEvent();
  /**
   * <pre>
   * Required. URL encoded UserEvent proto with a length limit of 2,000,000
   * characters.
   * </pre>
   *
   * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for userEvent.
   */
  com.google.protobuf.ByteString
      getUserEventBytes();

  /**
   * <pre>
   * The URL including cgi-parameters but excluding the hash fragment with a
   * length limit of 5,000 characters. This is often more useful than the
   * referer URL, because many browsers only send the domain for third-party
   * requests.
   * </pre>
   *
   * <code>optional string uri = 3;</code>
   * @return Whether the uri field is set.
   */
  boolean hasUri();
  /**
   * <pre>
   * The URL including cgi-parameters but excluding the hash fragment with a
   * length limit of 5,000 characters. This is often more useful than the
   * referer URL, because many browsers only send the domain for third-party
   * requests.
   * </pre>
   *
   * <code>optional string uri = 3;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * The URL including cgi-parameters but excluding the hash fragment with a
   * length limit of 5,000 characters. This is often more useful than the
   * referer URL, because many browsers only send the domain for third-party
   * requests.
   * </pre>
   *
   * <code>optional string uri = 3;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * The event timestamp in milliseconds. This prevents browser caching of
   * otherwise identical get requests. The name is abbreviated to reduce the
   * payload bytes.
   * </pre>
   *
   * <code>optional int64 ets = 4;</code>
   * @return Whether the ets field is set.
   */
  boolean hasEts();
  /**
   * <pre>
   * The event timestamp in milliseconds. This prevents browser caching of
   * otherwise identical get requests. The name is abbreviated to reduce the
   * payload bytes.
   * </pre>
   *
   * <code>optional int64 ets = 4;</code>
   * @return The ets.
   */
  long getEts();
}
