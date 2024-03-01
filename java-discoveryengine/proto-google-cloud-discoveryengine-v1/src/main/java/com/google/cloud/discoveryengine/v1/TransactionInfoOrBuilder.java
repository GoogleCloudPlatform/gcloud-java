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
// source: google/cloud/discoveryengine/v1/user_event.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1;

public interface TransactionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.TransactionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Total non-zero value associated with the transaction. This value
   * may include shipping, tax, or other adjustments to the total value that you
   * want to include.
   * </pre>
   *
   * <code>optional float value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   *
   *
   * <pre>
   * Required. Total non-zero value associated with the transaction. This value
   * may include shipping, tax, or other adjustments to the total value that you
   * want to include.
   * </pre>
   *
   * <code>optional float value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The value.
   */
  float getValue();

  /**
   *
   *
   * <pre>
   * Required. Currency code. Use three-character ISO-4217 code.
   * </pre>
   *
   * <code>string currency = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   *
   *
   * <pre>
   * Required. Currency code. Use three-character ISO-4217 code.
   * </pre>
   *
   * <code>string currency = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString getCurrencyBytes();

  /**
   *
   *
   * <pre>
   * The transaction ID with a length limit of 128 characters.
   * </pre>
   *
   * <code>string transaction_id = 3;</code>
   *
   * @return The transactionId.
   */
  java.lang.String getTransactionId();
  /**
   *
   *
   * <pre>
   * The transaction ID with a length limit of 128 characters.
   * </pre>
   *
   * <code>string transaction_id = 3;</code>
   *
   * @return The bytes for transactionId.
   */
  com.google.protobuf.ByteString getTransactionIdBytes();

  /**
   *
   *
   * <pre>
   * All the taxes associated with the transaction.
   * </pre>
   *
   * <code>optional float tax = 4;</code>
   *
   * @return Whether the tax field is set.
   */
  boolean hasTax();
  /**
   *
   *
   * <pre>
   * All the taxes associated with the transaction.
   * </pre>
   *
   * <code>optional float tax = 4;</code>
   *
   * @return The tax.
   */
  float getTax();

  /**
   *
   *
   * <pre>
   * All the costs associated with the products. These can be manufacturing
   * costs, shipping expenses not borne by the end user, or any other costs,
   * such that:
   *
   * * Profit = [value][google.cloud.discoveryengine.v1.TransactionInfo.value] -
   * [tax][google.cloud.discoveryengine.v1.TransactionInfo.tax] -
   * [cost][google.cloud.discoveryengine.v1.TransactionInfo.cost]
   * </pre>
   *
   * <code>optional float cost = 5;</code>
   *
   * @return Whether the cost field is set.
   */
  boolean hasCost();
  /**
   *
   *
   * <pre>
   * All the costs associated with the products. These can be manufacturing
   * costs, shipping expenses not borne by the end user, or any other costs,
   * such that:
   *
   * * Profit = [value][google.cloud.discoveryengine.v1.TransactionInfo.value] -
   * [tax][google.cloud.discoveryengine.v1.TransactionInfo.tax] -
   * [cost][google.cloud.discoveryengine.v1.TransactionInfo.cost]
   * </pre>
   *
   * <code>optional float cost = 5;</code>
   *
   * @return The cost.
   */
  float getCost();

  /**
   *
   *
   * <pre>
   * The total discount(s) value applied to this transaction.
   * This figure should be excluded from
   * [TransactionInfo.value][google.cloud.discoveryengine.v1.TransactionInfo.value]
   *
   * For example, if a user paid
   * [TransactionInfo.value][google.cloud.discoveryengine.v1.TransactionInfo.value]
   * amount, then nominal (pre-discount) value of the transaction is the sum of
   * [TransactionInfo.value][google.cloud.discoveryengine.v1.TransactionInfo.value]
   * and
   * [TransactionInfo.discount_value][google.cloud.discoveryengine.v1.TransactionInfo.discount_value]
   *
   * This means that profit is calculated the same way, regardless of the
   * discount value, and that
   * [TransactionInfo.discount_value][google.cloud.discoveryengine.v1.TransactionInfo.discount_value]
   * can be larger than
   * [TransactionInfo.value][google.cloud.discoveryengine.v1.TransactionInfo.value]:
   *
   * * Profit = [value][google.cloud.discoveryengine.v1.TransactionInfo.value] -
   * [tax][google.cloud.discoveryengine.v1.TransactionInfo.tax] -
   * [cost][google.cloud.discoveryengine.v1.TransactionInfo.cost]
   * </pre>
   *
   * <code>optional float discount_value = 6;</code>
   *
   * @return Whether the discountValue field is set.
   */
  boolean hasDiscountValue();
  /**
   *
   *
   * <pre>
   * The total discount(s) value applied to this transaction.
   * This figure should be excluded from
   * [TransactionInfo.value][google.cloud.discoveryengine.v1.TransactionInfo.value]
   *
   * For example, if a user paid
   * [TransactionInfo.value][google.cloud.discoveryengine.v1.TransactionInfo.value]
   * amount, then nominal (pre-discount) value of the transaction is the sum of
   * [TransactionInfo.value][google.cloud.discoveryengine.v1.TransactionInfo.value]
   * and
   * [TransactionInfo.discount_value][google.cloud.discoveryengine.v1.TransactionInfo.discount_value]
   *
   * This means that profit is calculated the same way, regardless of the
   * discount value, and that
   * [TransactionInfo.discount_value][google.cloud.discoveryengine.v1.TransactionInfo.discount_value]
   * can be larger than
   * [TransactionInfo.value][google.cloud.discoveryengine.v1.TransactionInfo.value]:
   *
   * * Profit = [value][google.cloud.discoveryengine.v1.TransactionInfo.value] -
   * [tax][google.cloud.discoveryengine.v1.TransactionInfo.tax] -
   * [cost][google.cloud.discoveryengine.v1.TransactionInfo.cost]
   * </pre>
   *
   * <code>optional float discount_value = 6;</code>
   *
   * @return The discountValue.
   */
  float getDiscountValue();
}
