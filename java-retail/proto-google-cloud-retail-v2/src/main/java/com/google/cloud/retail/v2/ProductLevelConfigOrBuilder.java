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
// source: google/cloud/retail/v2/catalog.proto

package com.google.cloud.retail.v2;

public interface ProductLevelConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.ProductLevelConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of [Product][google.cloud.retail.v2.Product]s allowed to be
   * ingested into the catalog. Acceptable values are:
   *
   * * `primary` (default): You can ingest
   * [Product][google.cloud.retail.v2.Product]s of all types. When
   *   ingesting a [Product][google.cloud.retail.v2.Product], its type will
   *   default to
   *   [Product.Type.PRIMARY][google.cloud.retail.v2.Product.Type.PRIMARY] if
   *   unset.
   * * `variant` (incompatible with Retail Search): You can only
   *   ingest
   *   [Product.Type.VARIANT][google.cloud.retail.v2.Product.Type.VARIANT]
   *   [Product][google.cloud.retail.v2.Product]s. This means
   *   [Product.primary_product_id][google.cloud.retail.v2.Product.primary_product_id]
   *   cannot be empty.
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   *
   * If this field is `variant` and
   * [merchant_center_product_id_field][google.cloud.retail.v2.ProductLevelConfig.merchant_center_product_id_field]
   * is `itemGroupId`, an INVALID_ARGUMENT error is returned.
   *
   * See [Product
   * levels](https://cloud.google.com/retail/docs/catalog#product-levels)
   * for more details.
   * </pre>
   *
   * <code>string ingestion_product_type = 1;</code>
   *
   * @return The ingestionProductType.
   */
  java.lang.String getIngestionProductType();
  /**
   *
   *
   * <pre>
   * The type of [Product][google.cloud.retail.v2.Product]s allowed to be
   * ingested into the catalog. Acceptable values are:
   *
   * * `primary` (default): You can ingest
   * [Product][google.cloud.retail.v2.Product]s of all types. When
   *   ingesting a [Product][google.cloud.retail.v2.Product], its type will
   *   default to
   *   [Product.Type.PRIMARY][google.cloud.retail.v2.Product.Type.PRIMARY] if
   *   unset.
   * * `variant` (incompatible with Retail Search): You can only
   *   ingest
   *   [Product.Type.VARIANT][google.cloud.retail.v2.Product.Type.VARIANT]
   *   [Product][google.cloud.retail.v2.Product]s. This means
   *   [Product.primary_product_id][google.cloud.retail.v2.Product.primary_product_id]
   *   cannot be empty.
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   *
   * If this field is `variant` and
   * [merchant_center_product_id_field][google.cloud.retail.v2.ProductLevelConfig.merchant_center_product_id_field]
   * is `itemGroupId`, an INVALID_ARGUMENT error is returned.
   *
   * See [Product
   * levels](https://cloud.google.com/retail/docs/catalog#product-levels)
   * for more details.
   * </pre>
   *
   * <code>string ingestion_product_type = 1;</code>
   *
   * @return The bytes for ingestionProductType.
   */
  com.google.protobuf.ByteString getIngestionProductTypeBytes();

  /**
   *
   *
   * <pre>
   * Which field of [Merchant Center
   * Product](/bigquery-transfer/docs/merchant-center-products-schema) should be
   * imported as [Product.id][google.cloud.retail.v2.Product.id]. Acceptable
   * values are:
   *
   * * `offerId` (default): Import `offerId` as the product ID.
   * * `itemGroupId`: Import `itemGroupId` as the product ID. Notice that Retail
   *   API will choose one item from the ones with the same `itemGroupId`, and
   *   use it to represent the item group.
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   *
   * If this field is `itemGroupId` and
   * [ingestion_product_type][google.cloud.retail.v2.ProductLevelConfig.ingestion_product_type]
   * is `variant`, an INVALID_ARGUMENT error is returned.
   *
   * See [Product
   * levels](https://cloud.google.com/retail/docs/catalog#product-levels)
   * for more details.
   * </pre>
   *
   * <code>string merchant_center_product_id_field = 2;</code>
   *
   * @return The merchantCenterProductIdField.
   */
  java.lang.String getMerchantCenterProductIdField();
  /**
   *
   *
   * <pre>
   * Which field of [Merchant Center
   * Product](/bigquery-transfer/docs/merchant-center-products-schema) should be
   * imported as [Product.id][google.cloud.retail.v2.Product.id]. Acceptable
   * values are:
   *
   * * `offerId` (default): Import `offerId` as the product ID.
   * * `itemGroupId`: Import `itemGroupId` as the product ID. Notice that Retail
   *   API will choose one item from the ones with the same `itemGroupId`, and
   *   use it to represent the item group.
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   *
   * If this field is `itemGroupId` and
   * [ingestion_product_type][google.cloud.retail.v2.ProductLevelConfig.ingestion_product_type]
   * is `variant`, an INVALID_ARGUMENT error is returned.
   *
   * See [Product
   * levels](https://cloud.google.com/retail/docs/catalog#product-levels)
   * for more details.
   * </pre>
   *
   * <code>string merchant_center_product_id_field = 2;</code>
   *
   * @return The bytes for merchantCenterProductIdField.
   */
  com.google.protobuf.ByteString getMerchantCenterProductIdFieldBytes();
}
