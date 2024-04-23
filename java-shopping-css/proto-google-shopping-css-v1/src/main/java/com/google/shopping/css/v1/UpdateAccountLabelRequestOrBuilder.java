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
// source: google/shopping/css/v1/accounts_labels.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.css.v1;

public interface UpdateAccountLabelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.css.v1.UpdateAccountLabelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The updated label. All fields must be provided.
   * </pre>
   *
   * <code>
   * .google.shopping.css.v1.AccountLabel account_label = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the accountLabel field is set.
   */
  boolean hasAccountLabel();
  /**
   *
   *
   * <pre>
   * Required. The updated label. All fields must be provided.
   * </pre>
   *
   * <code>
   * .google.shopping.css.v1.AccountLabel account_label = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The accountLabel.
   */
  com.google.shopping.css.v1.AccountLabel getAccountLabel();
  /**
   *
   *
   * <pre>
   * Required. The updated label. All fields must be provided.
   * </pre>
   *
   * <code>
   * .google.shopping.css.v1.AccountLabel account_label = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.css.v1.AccountLabelOrBuilder getAccountLabelOrBuilder();
}
