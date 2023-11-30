// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/places/v1/attribution.proto

package com.google.maps.places.v1;

public interface AuthorAttributionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.AuthorAttribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Name of the author of the [Photo][google.maps.places.v1.Photo]
   * or [Review][google.maps.places.v1.Review].
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Output only. Name of the author of the [Photo][google.maps.places.v1.Photo]
   * or [Review][google.maps.places.v1.Review].
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. URI of the author of the [Photo][google.maps.places.v1.Photo]
   * or [Review][google.maps.places.v1.Review].
   * </pre>
   *
   * <code>string uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Output only. URI of the author of the [Photo][google.maps.places.v1.Photo]
   * or [Review][google.maps.places.v1.Review].
   * </pre>
   *
   * <code>string uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * Output only. Profile photo URI of the author of the
   * [Photo][google.maps.places.v1.Photo] or
   * [Review][google.maps.places.v1.Review].
   * </pre>
   *
   * <code>string photo_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The photoUri.
   */
  java.lang.String getPhotoUri();
  /**
   * <pre>
   * Output only. Profile photo URI of the author of the
   * [Photo][google.maps.places.v1.Photo] or
   * [Review][google.maps.places.v1.Review].
   * </pre>
   *
   * <code>string photo_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for photoUri.
   */
  com.google.protobuf.ByteString
      getPhotoUriBytes();
}
