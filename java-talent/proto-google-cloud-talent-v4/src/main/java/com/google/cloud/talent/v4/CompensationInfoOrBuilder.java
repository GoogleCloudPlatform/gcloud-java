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
// source: google/cloud/talent/v4/common.proto

package com.google.cloud.talent.v4;

public interface CompensationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.CompensationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Job compensation information.
   * At most one entry can be of type
   * [CompensationInfo.CompensationType.BASE][google.cloud.talent.v4.CompensationInfo.CompensationType.BASE], which is
   * referred as **base compensation entry** for the job.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.CompensationInfo.CompensationEntry entries = 1;</code>
   */
  java.util.List<com.google.cloud.talent.v4.CompensationInfo.CompensationEntry> getEntriesList();
  /**
   *
   *
   * <pre>
   * Job compensation information.
   * At most one entry can be of type
   * [CompensationInfo.CompensationType.BASE][google.cloud.talent.v4.CompensationInfo.CompensationType.BASE], which is
   * referred as **base compensation entry** for the job.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.CompensationInfo.CompensationEntry entries = 1;</code>
   */
  com.google.cloud.talent.v4.CompensationInfo.CompensationEntry getEntries(int index);
  /**
   *
   *
   * <pre>
   * Job compensation information.
   * At most one entry can be of type
   * [CompensationInfo.CompensationType.BASE][google.cloud.talent.v4.CompensationInfo.CompensationType.BASE], which is
   * referred as **base compensation entry** for the job.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.CompensationInfo.CompensationEntry entries = 1;</code>
   */
  int getEntriesCount();
  /**
   *
   *
   * <pre>
   * Job compensation information.
   * At most one entry can be of type
   * [CompensationInfo.CompensationType.BASE][google.cloud.talent.v4.CompensationInfo.CompensationType.BASE], which is
   * referred as **base compensation entry** for the job.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.CompensationInfo.CompensationEntry entries = 1;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4.CompensationInfo.CompensationEntryOrBuilder>
      getEntriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Job compensation information.
   * At most one entry can be of type
   * [CompensationInfo.CompensationType.BASE][google.cloud.talent.v4.CompensationInfo.CompensationType.BASE], which is
   * referred as **base compensation entry** for the job.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.CompensationInfo.CompensationEntry entries = 1;</code>
   */
  com.google.cloud.talent.v4.CompensationInfo.CompensationEntryOrBuilder getEntriesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. Annualized base compensation range. Computed as base compensation entry's
   * [CompensationEntry.amount][google.cloud.talent.v4.CompensationInfo.CompensationEntry.amount] times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See [CompensationEntry][google.cloud.talent.v4.CompensationInfo.CompensationEntry] for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4.CompensationInfo.CompensationRange annualized_base_compensation_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the annualizedBaseCompensationRange field is set.
   */
  boolean hasAnnualizedBaseCompensationRange();
  /**
   *
   *
   * <pre>
   * Output only. Annualized base compensation range. Computed as base compensation entry's
   * [CompensationEntry.amount][google.cloud.talent.v4.CompensationInfo.CompensationEntry.amount] times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See [CompensationEntry][google.cloud.talent.v4.CompensationInfo.CompensationEntry] for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4.CompensationInfo.CompensationRange annualized_base_compensation_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The annualizedBaseCompensationRange.
   */
  com.google.cloud.talent.v4.CompensationInfo.CompensationRange
      getAnnualizedBaseCompensationRange();
  /**
   *
   *
   * <pre>
   * Output only. Annualized base compensation range. Computed as base compensation entry's
   * [CompensationEntry.amount][google.cloud.talent.v4.CompensationInfo.CompensationEntry.amount] times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See [CompensationEntry][google.cloud.talent.v4.CompensationInfo.CompensationEntry] for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4.CompensationInfo.CompensationRange annualized_base_compensation_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.talent.v4.CompensationInfo.CompensationRangeOrBuilder
      getAnnualizedBaseCompensationRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Annualized total compensation range. Computed as all compensation entries'
   * [CompensationEntry.amount][google.cloud.talent.v4.CompensationInfo.CompensationEntry.amount] times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See [CompensationEntry][google.cloud.talent.v4.CompensationInfo.CompensationEntry] for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4.CompensationInfo.CompensationRange annualized_total_compensation_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the annualizedTotalCompensationRange field is set.
   */
  boolean hasAnnualizedTotalCompensationRange();
  /**
   *
   *
   * <pre>
   * Output only. Annualized total compensation range. Computed as all compensation entries'
   * [CompensationEntry.amount][google.cloud.talent.v4.CompensationInfo.CompensationEntry.amount] times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See [CompensationEntry][google.cloud.talent.v4.CompensationInfo.CompensationEntry] for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4.CompensationInfo.CompensationRange annualized_total_compensation_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The annualizedTotalCompensationRange.
   */
  com.google.cloud.talent.v4.CompensationInfo.CompensationRange
      getAnnualizedTotalCompensationRange();
  /**
   *
   *
   * <pre>
   * Output only. Annualized total compensation range. Computed as all compensation entries'
   * [CompensationEntry.amount][google.cloud.talent.v4.CompensationInfo.CompensationEntry.amount] times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See [CompensationEntry][google.cloud.talent.v4.CompensationInfo.CompensationEntry] for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4.CompensationInfo.CompensationRange annualized_total_compensation_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.talent.v4.CompensationInfo.CompensationRangeOrBuilder
      getAnnualizedTotalCompensationRangeOrBuilder();
}
