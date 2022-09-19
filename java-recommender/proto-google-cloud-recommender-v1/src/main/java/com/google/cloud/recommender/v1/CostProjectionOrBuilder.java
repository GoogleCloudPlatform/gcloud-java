/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/recommender/v1/recommendation.proto

package com.google.cloud.recommender.v1;

public interface CostProjectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1.CostProjection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An approximate projection on amount saved or amount incurred. Negative cost
   * units indicate cost savings and positive cost units indicate increase.
   * See google.type.Money documentation for positive/negative units.
   * A user's permissions may affect whether the cost is computed using list
   * prices or custom contract prices.
   * </pre>
   *
   * <code>.google.type.Money cost = 1;</code>
   *
   * @return Whether the cost field is set.
   */
  boolean hasCost();
  /**
   *
   *
   * <pre>
   * An approximate projection on amount saved or amount incurred. Negative cost
   * units indicate cost savings and positive cost units indicate increase.
   * See google.type.Money documentation for positive/negative units.
   * A user's permissions may affect whether the cost is computed using list
   * prices or custom contract prices.
   * </pre>
   *
   * <code>.google.type.Money cost = 1;</code>
   *
   * @return The cost.
   */
  com.google.type.Money getCost();
  /**
   *
   *
   * <pre>
   * An approximate projection on amount saved or amount incurred. Negative cost
   * units indicate cost savings and positive cost units indicate increase.
   * See google.type.Money documentation for positive/negative units.
   * A user's permissions may affect whether the cost is computed using list
   * prices or custom contract prices.
   * </pre>
   *
   * <code>.google.type.Money cost = 1;</code>
   */
  com.google.type.MoneyOrBuilder getCostOrBuilder();

  /**
   *
   *
   * <pre>
   * Duration for which this cost applies.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   *
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   *
   *
   * <pre>
   * Duration for which this cost applies.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   *
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   *
   *
   * <pre>
   * Duration for which this cost applies.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();
}
