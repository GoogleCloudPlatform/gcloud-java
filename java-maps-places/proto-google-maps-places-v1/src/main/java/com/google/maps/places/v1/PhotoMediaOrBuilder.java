/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/places/v1/places_service.proto

package com.google.maps.places.v1;

public interface PhotoMediaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.PhotoMedia)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of a photo media in the format:
   * `places/{place_id}/photos/{photo_reference}/media`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of a photo media in the format:
   * `places/{place_id}/photos/{photo_reference}/media`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A short-lived uri that can be used to render the photo.
   * </pre>
   *
   * <code>string photo_uri = 2;</code>
   *
   * @return The photoUri.
   */
  java.lang.String getPhotoUri();
  /**
   *
   *
   * <pre>
   * A short-lived uri that can be used to render the photo.
   * </pre>
   *
   * <code>string photo_uri = 2;</code>
   *
   * @return The bytes for photoUri.
   */
  com.google.protobuf.ByteString getPhotoUriBytes();
}
