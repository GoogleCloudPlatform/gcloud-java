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
// source: google/shopping/merchant/reports/v1beta/reports.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.reports.v1beta;

public interface ProductViewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.reports.v1beta.ProductView)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * REST ID of the product, in the form of
   * `channel~languageCode~feedLabel~offerId`. Merchant API methods that operate
   * on products take this as their `name` parameter.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * REST ID of the product, in the form of
   * `channel~languageCode~feedLabel~offerId`. Merchant API methods that operate
   * on products take this as their `name` parameter.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * REST ID of the product, in the form of
   * `channel~languageCode~feedLabel~offerId`. Merchant API methods that operate
   * on products take this as their `name` parameter.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Channel of the product. Can be `ONLINE` or `LOCAL`.
   * </pre>
   *
   * <code>optional .google.shopping.type.Channel.ChannelEnum channel = 28;</code>
   *
   * @return Whether the channel field is set.
   */
  boolean hasChannel();
  /**
   *
   *
   * <pre>
   * Channel of the product. Can be `ONLINE` or `LOCAL`.
   * </pre>
   *
   * <code>optional .google.shopping.type.Channel.ChannelEnum channel = 28;</code>
   *
   * @return The enum numeric value on the wire for channel.
   */
  int getChannelValue();
  /**
   *
   *
   * <pre>
   * Channel of the product. Can be `ONLINE` or `LOCAL`.
   * </pre>
   *
   * <code>optional .google.shopping.type.Channel.ChannelEnum channel = 28;</code>
   *
   * @return The channel.
   */
  com.google.shopping.type.Channel.ChannelEnum getChannel();

  /**
   *
   *
   * <pre>
   * Language code of the product in BCP 47 format.
   * </pre>
   *
   * <code>optional string language_code = 2;</code>
   *
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   *
   *
   * <pre>
   * Language code of the product in BCP 47 format.
   * </pre>
   *
   * <code>optional string language_code = 2;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Language code of the product in BCP 47 format.
   * </pre>
   *
   * <code>optional string language_code = 2;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Feed label of the product.
   * </pre>
   *
   * <code>optional string feed_label = 3;</code>
   *
   * @return Whether the feedLabel field is set.
   */
  boolean hasFeedLabel();
  /**
   *
   *
   * <pre>
   * Feed label of the product.
   * </pre>
   *
   * <code>optional string feed_label = 3;</code>
   *
   * @return The feedLabel.
   */
  java.lang.String getFeedLabel();
  /**
   *
   *
   * <pre>
   * Feed label of the product.
   * </pre>
   *
   * <code>optional string feed_label = 3;</code>
   *
   * @return The bytes for feedLabel.
   */
  com.google.protobuf.ByteString getFeedLabelBytes();

  /**
   *
   *
   * <pre>
   * Merchant-provided id of the product.
   * </pre>
   *
   * <code>optional string offer_id = 4;</code>
   *
   * @return Whether the offerId field is set.
   */
  boolean hasOfferId();
  /**
   *
   *
   * <pre>
   * Merchant-provided id of the product.
   * </pre>
   *
   * <code>optional string offer_id = 4;</code>
   *
   * @return The offerId.
   */
  java.lang.String getOfferId();
  /**
   *
   *
   * <pre>
   * Merchant-provided id of the product.
   * </pre>
   *
   * <code>optional string offer_id = 4;</code>
   *
   * @return The bytes for offerId.
   */
  com.google.protobuf.ByteString getOfferIdBytes();

  /**
   *
   *
   * <pre>
   * Title of the product.
   * </pre>
   *
   * <code>optional string title = 5;</code>
   *
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   *
   *
   * <pre>
   * Title of the product.
   * </pre>
   *
   * <code>optional string title = 5;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * Title of the product.
   * </pre>
   *
   * <code>optional string title = 5;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Brand of the product.
   * </pre>
   *
   * <code>optional string brand = 6;</code>
   *
   * @return Whether the brand field is set.
   */
  boolean hasBrand();
  /**
   *
   *
   * <pre>
   * Brand of the product.
   * </pre>
   *
   * <code>optional string brand = 6;</code>
   *
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   *
   *
   * <pre>
   * Brand of the product.
   * </pre>
   *
   * <code>optional string brand = 6;</code>
   *
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString getBrandBytes();

  /**
   *
   *
   * <pre>
   * Product category (1st level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l1 = 7;</code>
   *
   * @return Whether the categoryL1 field is set.
   */
  boolean hasCategoryL1();
  /**
   *
   *
   * <pre>
   * Product category (1st level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l1 = 7;</code>
   *
   * @return The categoryL1.
   */
  java.lang.String getCategoryL1();
  /**
   *
   *
   * <pre>
   * Product category (1st level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l1 = 7;</code>
   *
   * @return The bytes for categoryL1.
   */
  com.google.protobuf.ByteString getCategoryL1Bytes();

  /**
   *
   *
   * <pre>
   * Product category (2nd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l2 = 8;</code>
   *
   * @return Whether the categoryL2 field is set.
   */
  boolean hasCategoryL2();
  /**
   *
   *
   * <pre>
   * Product category (2nd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l2 = 8;</code>
   *
   * @return The categoryL2.
   */
  java.lang.String getCategoryL2();
  /**
   *
   *
   * <pre>
   * Product category (2nd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l2 = 8;</code>
   *
   * @return The bytes for categoryL2.
   */
  com.google.protobuf.ByteString getCategoryL2Bytes();

  /**
   *
   *
   * <pre>
   * Product category (3rd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l3 = 9;</code>
   *
   * @return Whether the categoryL3 field is set.
   */
  boolean hasCategoryL3();
  /**
   *
   *
   * <pre>
   * Product category (3rd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l3 = 9;</code>
   *
   * @return The categoryL3.
   */
  java.lang.String getCategoryL3();
  /**
   *
   *
   * <pre>
   * Product category (3rd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l3 = 9;</code>
   *
   * @return The bytes for categoryL3.
   */
  com.google.protobuf.ByteString getCategoryL3Bytes();

  /**
   *
   *
   * <pre>
   * Product category (4th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l4 = 10;</code>
   *
   * @return Whether the categoryL4 field is set.
   */
  boolean hasCategoryL4();
  /**
   *
   *
   * <pre>
   * Product category (4th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l4 = 10;</code>
   *
   * @return The categoryL4.
   */
  java.lang.String getCategoryL4();
  /**
   *
   *
   * <pre>
   * Product category (4th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l4 = 10;</code>
   *
   * @return The bytes for categoryL4.
   */
  com.google.protobuf.ByteString getCategoryL4Bytes();

  /**
   *
   *
   * <pre>
   * Product category (5th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l5 = 11;</code>
   *
   * @return Whether the categoryL5 field is set.
   */
  boolean hasCategoryL5();
  /**
   *
   *
   * <pre>
   * Product category (5th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l5 = 11;</code>
   *
   * @return The categoryL5.
   */
  java.lang.String getCategoryL5();
  /**
   *
   *
   * <pre>
   * Product category (5th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l5 = 11;</code>
   *
   * @return The bytes for categoryL5.
   */
  com.google.protobuf.ByteString getCategoryL5Bytes();

  /**
   *
   *
   * <pre>
   * Product type (1st level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l1 = 12;</code>
   *
   * @return Whether the productTypeL1 field is set.
   */
  boolean hasProductTypeL1();
  /**
   *
   *
   * <pre>
   * Product type (1st level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l1 = 12;</code>
   *
   * @return The productTypeL1.
   */
  java.lang.String getProductTypeL1();
  /**
   *
   *
   * <pre>
   * Product type (1st level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l1 = 12;</code>
   *
   * @return The bytes for productTypeL1.
   */
  com.google.protobuf.ByteString getProductTypeL1Bytes();

  /**
   *
   *
   * <pre>
   * Product type (2nd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l2 = 13;</code>
   *
   * @return Whether the productTypeL2 field is set.
   */
  boolean hasProductTypeL2();
  /**
   *
   *
   * <pre>
   * Product type (2nd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l2 = 13;</code>
   *
   * @return The productTypeL2.
   */
  java.lang.String getProductTypeL2();
  /**
   *
   *
   * <pre>
   * Product type (2nd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l2 = 13;</code>
   *
   * @return The bytes for productTypeL2.
   */
  com.google.protobuf.ByteString getProductTypeL2Bytes();

  /**
   *
   *
   * <pre>
   * Product type (3rd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l3 = 14;</code>
   *
   * @return Whether the productTypeL3 field is set.
   */
  boolean hasProductTypeL3();
  /**
   *
   *
   * <pre>
   * Product type (3rd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l3 = 14;</code>
   *
   * @return The productTypeL3.
   */
  java.lang.String getProductTypeL3();
  /**
   *
   *
   * <pre>
   * Product type (3rd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l3 = 14;</code>
   *
   * @return The bytes for productTypeL3.
   */
  com.google.protobuf.ByteString getProductTypeL3Bytes();

  /**
   *
   *
   * <pre>
   * Product type (4th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l4 = 15;</code>
   *
   * @return Whether the productTypeL4 field is set.
   */
  boolean hasProductTypeL4();
  /**
   *
   *
   * <pre>
   * Product type (4th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l4 = 15;</code>
   *
   * @return The productTypeL4.
   */
  java.lang.String getProductTypeL4();
  /**
   *
   *
   * <pre>
   * Product type (4th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l4 = 15;</code>
   *
   * @return The bytes for productTypeL4.
   */
  com.google.protobuf.ByteString getProductTypeL4Bytes();

  /**
   *
   *
   * <pre>
   * Product type (5th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l5 = 16;</code>
   *
   * @return Whether the productTypeL5 field is set.
   */
  boolean hasProductTypeL5();
  /**
   *
   *
   * <pre>
   * Product type (5th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l5 = 16;</code>
   *
   * @return The productTypeL5.
   */
  java.lang.String getProductTypeL5();
  /**
   *
   *
   * <pre>
   * Product type (5th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l5 = 16;</code>
   *
   * @return The bytes for productTypeL5.
   */
  com.google.protobuf.ByteString getProductTypeL5Bytes();

  /**
   *
   *
   * <pre>
   * Product price. Absent if the information about the price of the product is
   * not available.
   * </pre>
   *
   * <code>.google.shopping.type.Price price = 17;</code>
   *
   * @return Whether the price field is set.
   */
  boolean hasPrice();
  /**
   *
   *
   * <pre>
   * Product price. Absent if the information about the price of the product is
   * not available.
   * </pre>
   *
   * <code>.google.shopping.type.Price price = 17;</code>
   *
   * @return The price.
   */
  com.google.shopping.type.Price getPrice();
  /**
   *
   *
   * <pre>
   * Product price. Absent if the information about the price of the product is
   * not available.
   * </pre>
   *
   * <code>.google.shopping.type.Price price = 17;</code>
   */
  com.google.shopping.type.PriceOrBuilder getPriceOrBuilder();

  /**
   *
   *
   * <pre>
   * [Condition](https://support.google.com/merchants/answer/6324469) of the
   * product.
   * </pre>
   *
   * <code>optional string condition = 18;</code>
   *
   * @return Whether the condition field is set.
   */
  boolean hasCondition();
  /**
   *
   *
   * <pre>
   * [Condition](https://support.google.com/merchants/answer/6324469) of the
   * product.
   * </pre>
   *
   * <code>optional string condition = 18;</code>
   *
   * @return The condition.
   */
  java.lang.String getCondition();
  /**
   *
   *
   * <pre>
   * [Condition](https://support.google.com/merchants/answer/6324469) of the
   * product.
   * </pre>
   *
   * <code>optional string condition = 18;</code>
   *
   * @return The bytes for condition.
   */
  com.google.protobuf.ByteString getConditionBytes();

  /**
   *
   *
   * <pre>
   * [Availability](https://support.google.com/merchants/answer/6324448) of the
   * product.
   * </pre>
   *
   * <code>optional string availability = 19;</code>
   *
   * @return Whether the availability field is set.
   */
  boolean hasAvailability();
  /**
   *
   *
   * <pre>
   * [Availability](https://support.google.com/merchants/answer/6324448) of the
   * product.
   * </pre>
   *
   * <code>optional string availability = 19;</code>
   *
   * @return The availability.
   */
  java.lang.String getAvailability();
  /**
   *
   *
   * <pre>
   * [Availability](https://support.google.com/merchants/answer/6324448) of the
   * product.
   * </pre>
   *
   * <code>optional string availability = 19;</code>
   *
   * @return The bytes for availability.
   */
  com.google.protobuf.ByteString getAvailabilityBytes();

  /**
   *
   *
   * <pre>
   * Normalized [shipping
   * label](https://support.google.com/merchants/answer/6324504) specified in
   * the feed.
   * </pre>
   *
   * <code>optional string shipping_label = 20;</code>
   *
   * @return Whether the shippingLabel field is set.
   */
  boolean hasShippingLabel();
  /**
   *
   *
   * <pre>
   * Normalized [shipping
   * label](https://support.google.com/merchants/answer/6324504) specified in
   * the feed.
   * </pre>
   *
   * <code>optional string shipping_label = 20;</code>
   *
   * @return The shippingLabel.
   */
  java.lang.String getShippingLabel();
  /**
   *
   *
   * <pre>
   * Normalized [shipping
   * label](https://support.google.com/merchants/answer/6324504) specified in
   * the feed.
   * </pre>
   *
   * <code>optional string shipping_label = 20;</code>
   *
   * @return The bytes for shippingLabel.
   */
  com.google.protobuf.ByteString getShippingLabelBytes();

  /**
   *
   *
   * <pre>
   * List of Global Trade Item Numbers (GTINs) of the product.
   * </pre>
   *
   * <code>repeated string gtin = 21;</code>
   *
   * @return A list containing the gtin.
   */
  java.util.List<java.lang.String> getGtinList();
  /**
   *
   *
   * <pre>
   * List of Global Trade Item Numbers (GTINs) of the product.
   * </pre>
   *
   * <code>repeated string gtin = 21;</code>
   *
   * @return The count of gtin.
   */
  int getGtinCount();
  /**
   *
   *
   * <pre>
   * List of Global Trade Item Numbers (GTINs) of the product.
   * </pre>
   *
   * <code>repeated string gtin = 21;</code>
   *
   * @param index The index of the element to return.
   * @return The gtin at the given index.
   */
  java.lang.String getGtin(int index);
  /**
   *
   *
   * <pre>
   * List of Global Trade Item Numbers (GTINs) of the product.
   * </pre>
   *
   * <code>repeated string gtin = 21;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the gtin at the given index.
   */
  com.google.protobuf.ByteString getGtinBytes(int index);

  /**
   *
   *
   * <pre>
   * Item group id provided by the merchant for grouping variants together.
   * </pre>
   *
   * <code>optional string item_group_id = 22;</code>
   *
   * @return Whether the itemGroupId field is set.
   */
  boolean hasItemGroupId();
  /**
   *
   *
   * <pre>
   * Item group id provided by the merchant for grouping variants together.
   * </pre>
   *
   * <code>optional string item_group_id = 22;</code>
   *
   * @return The itemGroupId.
   */
  java.lang.String getItemGroupId();
  /**
   *
   *
   * <pre>
   * Item group id provided by the merchant for grouping variants together.
   * </pre>
   *
   * <code>optional string item_group_id = 22;</code>
   *
   * @return The bytes for itemGroupId.
   */
  com.google.protobuf.ByteString getItemGroupIdBytes();

  /**
   *
   *
   * <pre>
   * Link to the processed image of the product, hosted on the Google
   * infrastructure.
   * </pre>
   *
   * <code>optional string thumbnail_link = 23;</code>
   *
   * @return Whether the thumbnailLink field is set.
   */
  boolean hasThumbnailLink();
  /**
   *
   *
   * <pre>
   * Link to the processed image of the product, hosted on the Google
   * infrastructure.
   * </pre>
   *
   * <code>optional string thumbnail_link = 23;</code>
   *
   * @return The thumbnailLink.
   */
  java.lang.String getThumbnailLink();
  /**
   *
   *
   * <pre>
   * Link to the processed image of the product, hosted on the Google
   * infrastructure.
   * </pre>
   *
   * <code>optional string thumbnail_link = 23;</code>
   *
   * @return The bytes for thumbnailLink.
   */
  com.google.protobuf.ByteString getThumbnailLinkBytes();

  /**
   *
   *
   * <pre>
   * The time the merchant created the product in timestamp seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 24;</code>
   *
   * @return Whether the creationTime field is set.
   */
  boolean hasCreationTime();
  /**
   *
   *
   * <pre>
   * The time the merchant created the product in timestamp seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 24;</code>
   *
   * @return The creationTime.
   */
  com.google.protobuf.Timestamp getCreationTime();
  /**
   *
   *
   * <pre>
   * The time the merchant created the product in timestamp seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 24;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Expiration date for the product, specified on insertion.
   * </pre>
   *
   * <code>.google.type.Date expiration_date = 25;</code>
   *
   * @return Whether the expirationDate field is set.
   */
  boolean hasExpirationDate();
  /**
   *
   *
   * <pre>
   * Expiration date for the product, specified on insertion.
   * </pre>
   *
   * <code>.google.type.Date expiration_date = 25;</code>
   *
   * @return The expirationDate.
   */
  com.google.type.Date getExpirationDate();
  /**
   *
   *
   * <pre>
   * Expiration date for the product, specified on insertion.
   * </pre>
   *
   * <code>.google.type.Date expiration_date = 25;</code>
   */
  com.google.type.DateOrBuilder getExpirationDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Aggregated status.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.ProductView.AggregatedReportingContextStatus aggregated_reporting_context_status = 26;
   * </code>
   *
   * @return Whether the aggregatedReportingContextStatus field is set.
   */
  boolean hasAggregatedReportingContextStatus();
  /**
   *
   *
   * <pre>
   * Aggregated status.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.ProductView.AggregatedReportingContextStatus aggregated_reporting_context_status = 26;
   * </code>
   *
   * @return The enum numeric value on the wire for aggregatedReportingContextStatus.
   */
  int getAggregatedReportingContextStatusValue();
  /**
   *
   *
   * <pre>
   * Aggregated status.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.ProductView.AggregatedReportingContextStatus aggregated_reporting_context_status = 26;
   * </code>
   *
   * @return The aggregatedReportingContextStatus.
   */
  com.google.shopping.merchant.reports.v1beta.ProductView.AggregatedReportingContextStatus
      getAggregatedReportingContextStatus();

  /**
   *
   *
   * <pre>
   * List of item issues for the product.
   *
   * **This field cannot be used for sorting the results.**
   *
   * **Only selected attributes of this field (for example,
   * `item_issues.severity.aggregated_severity`) can be used for filtering the
   * results.**
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reports.v1beta.ProductView.ItemIssue item_issues = 27;
   * </code>
   */
  java.util.List<com.google.shopping.merchant.reports.v1beta.ProductView.ItemIssue>
      getItemIssuesList();
  /**
   *
   *
   * <pre>
   * List of item issues for the product.
   *
   * **This field cannot be used for sorting the results.**
   *
   * **Only selected attributes of this field (for example,
   * `item_issues.severity.aggregated_severity`) can be used for filtering the
   * results.**
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reports.v1beta.ProductView.ItemIssue item_issues = 27;
   * </code>
   */
  com.google.shopping.merchant.reports.v1beta.ProductView.ItemIssue getItemIssues(int index);
  /**
   *
   *
   * <pre>
   * List of item issues for the product.
   *
   * **This field cannot be used for sorting the results.**
   *
   * **Only selected attributes of this field (for example,
   * `item_issues.severity.aggregated_severity`) can be used for filtering the
   * results.**
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reports.v1beta.ProductView.ItemIssue item_issues = 27;
   * </code>
   */
  int getItemIssuesCount();
  /**
   *
   *
   * <pre>
   * List of item issues for the product.
   *
   * **This field cannot be used for sorting the results.**
   *
   * **Only selected attributes of this field (for example,
   * `item_issues.severity.aggregated_severity`) can be used for filtering the
   * results.**
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reports.v1beta.ProductView.ItemIssue item_issues = 27;
   * </code>
   */
  java.util.List<
          ? extends com.google.shopping.merchant.reports.v1beta.ProductView.ItemIssueOrBuilder>
      getItemIssuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of item issues for the product.
   *
   * **This field cannot be used for sorting the results.**
   *
   * **Only selected attributes of this field (for example,
   * `item_issues.severity.aggregated_severity`) can be used for filtering the
   * results.**
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reports.v1beta.ProductView.ItemIssue item_issues = 27;
   * </code>
   */
  com.google.shopping.merchant.reports.v1beta.ProductView.ItemIssueOrBuilder getItemIssuesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Estimated performance potential compared to highest performing products of
   * the merchant.
   * </pre>
   *
   * <code>.google.shopping.merchant.reports.v1beta.ProductView.ClickPotential click_potential = 29;
   * </code>
   *
   * @return The enum numeric value on the wire for clickPotential.
   */
  int getClickPotentialValue();
  /**
   *
   *
   * <pre>
   * Estimated performance potential compared to highest performing products of
   * the merchant.
   * </pre>
   *
   * <code>.google.shopping.merchant.reports.v1beta.ProductView.ClickPotential click_potential = 29;
   * </code>
   *
   * @return The clickPotential.
   */
  com.google.shopping.merchant.reports.v1beta.ProductView.ClickPotential getClickPotential();

  /**
   *
   *
   * <pre>
   * Rank of the product based on its click potential. A product with
   * `click_potential_rank` 1 has the highest click potential among the
   * merchant's products that fulfill the search query conditions.
   * </pre>
   *
   * <code>optional int64 click_potential_rank = 30;</code>
   *
   * @return Whether the clickPotentialRank field is set.
   */
  boolean hasClickPotentialRank();
  /**
   *
   *
   * <pre>
   * Rank of the product based on its click potential. A product with
   * `click_potential_rank` 1 has the highest click potential among the
   * merchant's products that fulfill the search query conditions.
   * </pre>
   *
   * <code>optional int64 click_potential_rank = 30;</code>
   *
   * @return The clickPotentialRank.
   */
  long getClickPotentialRank();
}
