// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/import.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface InputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Inline source for the input content for Catalog items.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.CatalogInlineSource catalog_inline_source = 1;</code>
   * @return Whether the catalogInlineSource field is set.
   */
  boolean hasCatalogInlineSource();
  /**
   * <pre>
   * The Inline source for the input content for Catalog items.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.CatalogInlineSource catalog_inline_source = 1;</code>
   * @return The catalogInlineSource.
   */
  com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource getCatalogInlineSource();
  /**
   * <pre>
   * The Inline source for the input content for Catalog items.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.CatalogInlineSource catalog_inline_source = 1;</code>
   */
  com.google.cloud.recommendationengine.v1beta1.CatalogInlineSourceOrBuilder getCatalogInlineSourceOrBuilder();

  /**
   * <pre>
   * Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.GcsSource gcs_source = 2;</code>
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   * <pre>
   * Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.GcsSource gcs_source = 2;</code>
   * @return The gcsSource.
   */
  com.google.cloud.recommendationengine.v1beta1.GcsSource getGcsSource();
  /**
   * <pre>
   * Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.GcsSource gcs_source = 2;</code>
   */
  com.google.cloud.recommendationengine.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   * <pre>
   * The Inline source for the input content for UserEvents.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.UserEventInlineSource user_event_inline_source = 3;</code>
   * @return Whether the userEventInlineSource field is set.
   */
  boolean hasUserEventInlineSource();
  /**
   * <pre>
   * The Inline source for the input content for UserEvents.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.UserEventInlineSource user_event_inline_source = 3;</code>
   * @return The userEventInlineSource.
   */
  com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource getUserEventInlineSource();
  /**
   * <pre>
   * The Inline source for the input content for UserEvents.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.UserEventInlineSource user_event_inline_source = 3;</code>
   */
  com.google.cloud.recommendationengine.v1beta1.UserEventInlineSourceOrBuilder getUserEventInlineSourceOrBuilder();

  public com.google.cloud.recommendationengine.v1beta1.InputConfig.SourceCase getSourceCase();
}
