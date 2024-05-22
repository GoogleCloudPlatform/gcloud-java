/*
 * Copyright 2024 Google LLC
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
// source: google/maps/places/v1/content_block.proto

// Protobuf Java Version: 3.25.3
package com.google.maps.places.v1;

public interface ContentBlockOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.ContentBlock)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The topic of the content, for example "overview" or "restaurant".
   * </pre>
   *
   * <code>string topic = 1;</code>
   *
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   *
   *
   * <pre>
   * The topic of the content, for example "overview" or "restaurant".
   * </pre>
   *
   * <code>string topic = 1;</code>
   *
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString getTopicBytes();

  /**
   *
   *
   * <pre>
   * Content related to the topic.
   * </pre>
   *
   * <code>.google.type.LocalizedText content = 2;</code>
   *
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   *
   *
   * <pre>
   * Content related to the topic.
   * </pre>
   *
   * <code>.google.type.LocalizedText content = 2;</code>
   *
   * @return The content.
   */
  com.google.type.LocalizedText getContent();
  /**
   *
   *
   * <pre>
   * Content related to the topic.
   * </pre>
   *
   * <code>.google.type.LocalizedText content = 2;</code>
   */
  com.google.type.LocalizedTextOrBuilder getContentOrBuilder();

  /**
   *
   *
   * <pre>
   * Experimental: See
   * https://developers.google.com/maps/documentation/places/web-service/experimental/places-generative
   * for more details.
   *
   * References that are related to this block of content.
   * </pre>
   *
   * <code>.google.maps.places.v1.References references = 3;</code>
   *
   * @return Whether the references field is set.
   */
  boolean hasReferences();
  /**
   *
   *
   * <pre>
   * Experimental: See
   * https://developers.google.com/maps/documentation/places/web-service/experimental/places-generative
   * for more details.
   *
   * References that are related to this block of content.
   * </pre>
   *
   * <code>.google.maps.places.v1.References references = 3;</code>
   *
   * @return The references.
   */
  com.google.maps.places.v1.References getReferences();
  /**
   *
   *
   * <pre>
   * Experimental: See
   * https://developers.google.com/maps/documentation/places/web-service/experimental/places-generative
   * for more details.
   *
   * References that are related to this block of content.
   * </pre>
   *
   * <code>.google.maps.places.v1.References references = 3;</code>
   */
  com.google.maps.places.v1.ReferencesOrBuilder getReferencesOrBuilder();
}
