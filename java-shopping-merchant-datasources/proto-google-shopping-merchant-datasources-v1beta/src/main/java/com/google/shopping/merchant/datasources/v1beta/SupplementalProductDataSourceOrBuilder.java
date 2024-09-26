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
// source: google/shopping/merchant/datasources/v1beta/datasourcetypes.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.datasources.v1beta;

public interface SupplementalProductDataSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.datasources.v1beta.SupplementalProductDataSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Immutable. The feed label that is specified on the data source
   * level.
   *
   * Must be less than or equal to 20 uppercase letters (A-Z), numbers (0-9),
   * and dashes (-).
   *
   * See also [migration to feed
   * labels](https://developers.google.com/shopping-content/guides/products/feed-labels).
   *
   * `feedLabel` and `contentLanguage` must be either both set or unset for data
   * sources with product content type.
   * They must be set for data sources with a file input.
   *
   * If set, the data source will only accept products matching this
   * combination. If unset, the data source will accept produts without that
   * restriction.
   * </pre>
   *
   * <code>
   * optional string feed_label = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the feedLabel field is set.
   */
  boolean hasFeedLabel();
  /**
   *
   *
   * <pre>
   * Optional. Immutable. The feed label that is specified on the data source
   * level.
   *
   * Must be less than or equal to 20 uppercase letters (A-Z), numbers (0-9),
   * and dashes (-).
   *
   * See also [migration to feed
   * labels](https://developers.google.com/shopping-content/guides/products/feed-labels).
   *
   * `feedLabel` and `contentLanguage` must be either both set or unset for data
   * sources with product content type.
   * They must be set for data sources with a file input.
   *
   * If set, the data source will only accept products matching this
   * combination. If unset, the data source will accept produts without that
   * restriction.
   * </pre>
   *
   * <code>
   * optional string feed_label = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The feedLabel.
   */
  java.lang.String getFeedLabel();
  /**
   *
   *
   * <pre>
   * Optional. Immutable. The feed label that is specified on the data source
   * level.
   *
   * Must be less than or equal to 20 uppercase letters (A-Z), numbers (0-9),
   * and dashes (-).
   *
   * See also [migration to feed
   * labels](https://developers.google.com/shopping-content/guides/products/feed-labels).
   *
   * `feedLabel` and `contentLanguage` must be either both set or unset for data
   * sources with product content type.
   * They must be set for data sources with a file input.
   *
   * If set, the data source will only accept products matching this
   * combination. If unset, the data source will accept produts without that
   * restriction.
   * </pre>
   *
   * <code>
   * optional string feed_label = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for feedLabel.
   */
  com.google.protobuf.ByteString getFeedLabelBytes();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. The two-letter ISO 639-1 language of the items in the
   * data source.
   *
   * `feedLabel` and `contentLanguage` must be either both set or unset.
   * The fields can only be unset for data sources without file input.
   *
   * If set, the data source will only accept products matching this
   * combination. If unset, the data source will accept produts without that
   * restriction.
   * </pre>
   *
   * <code>
   * optional string content_language = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the contentLanguage field is set.
   */
  boolean hasContentLanguage();
  /**
   *
   *
   * <pre>
   * Optional. Immutable. The two-letter ISO 639-1 language of the items in the
   * data source.
   *
   * `feedLabel` and `contentLanguage` must be either both set or unset.
   * The fields can only be unset for data sources without file input.
   *
   * If set, the data source will only accept products matching this
   * combination. If unset, the data source will accept produts without that
   * restriction.
   * </pre>
   *
   * <code>
   * optional string content_language = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The contentLanguage.
   */
  java.lang.String getContentLanguage();
  /**
   *
   *
   * <pre>
   * Optional. Immutable. The two-letter ISO 639-1 language of the items in the
   * data source.
   *
   * `feedLabel` and `contentLanguage` must be either both set or unset.
   * The fields can only be unset for data sources without file input.
   *
   * If set, the data source will only accept products matching this
   * combination. If unset, the data source will accept produts without that
   * restriction.
   * </pre>
   *
   * <code>
   * optional string content_language = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for contentLanguage.
   */
  com.google.protobuf.ByteString getContentLanguageBytes();

  /**
   *
   *
   * <pre>
   * Output only. The (unordered and deduplicated) list of all primary data
   * sources linked to this data source in either default or custom rules.
   * Supplemental data source cannot be deleted before all links are removed.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.datasources.v1beta.DataSourceReference referencing_primary_data_sources = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.shopping.merchant.datasources.v1beta.DataSourceReference>
      getReferencingPrimaryDataSourcesList();
  /**
   *
   *
   * <pre>
   * Output only. The (unordered and deduplicated) list of all primary data
   * sources linked to this data source in either default or custom rules.
   * Supplemental data source cannot be deleted before all links are removed.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.datasources.v1beta.DataSourceReference referencing_primary_data_sources = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.merchant.datasources.v1beta.DataSourceReference
      getReferencingPrimaryDataSources(int index);
  /**
   *
   *
   * <pre>
   * Output only. The (unordered and deduplicated) list of all primary data
   * sources linked to this data source in either default or custom rules.
   * Supplemental data source cannot be deleted before all links are removed.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.datasources.v1beta.DataSourceReference referencing_primary_data_sources = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getReferencingPrimaryDataSourcesCount();
  /**
   *
   *
   * <pre>
   * Output only. The (unordered and deduplicated) list of all primary data
   * sources linked to this data source in either default or custom rules.
   * Supplemental data source cannot be deleted before all links are removed.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.datasources.v1beta.DataSourceReference referencing_primary_data_sources = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends com.google.shopping.merchant.datasources.v1beta.DataSourceReferenceOrBuilder>
      getReferencingPrimaryDataSourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The (unordered and deduplicated) list of all primary data
   * sources linked to this data source in either default or custom rules.
   * Supplemental data source cannot be deleted before all links are removed.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.datasources.v1beta.DataSourceReference referencing_primary_data_sources = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.merchant.datasources.v1beta.DataSourceReferenceOrBuilder
      getReferencingPrimaryDataSourcesOrBuilder(int index);
}
