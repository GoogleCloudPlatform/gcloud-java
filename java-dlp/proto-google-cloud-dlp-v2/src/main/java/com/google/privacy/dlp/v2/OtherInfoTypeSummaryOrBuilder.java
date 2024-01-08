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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface OtherInfoTypeSummaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.OtherInfoTypeSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The other infoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   *
   * @return Whether the infoType field is set.
   */
  boolean hasInfoType();
  /**
   *
   *
   * <pre>
   * The other infoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   *
   * @return The infoType.
   */
  com.google.privacy.dlp.v2.InfoType getInfoType();
  /**
   *
   *
   * <pre>
   * The other infoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Approximate percentage of non-null rows that contained data detected by
   * this infotype.
   * </pre>
   *
   * <code>int32 estimated_prevalence = 2;</code>
   *
   * @return The estimatedPrevalence.
   */
  int getEstimatedPrevalence();

  /**
   *
   *
   * <pre>
   * Whether this infoType was excluded from sensitivity and risk analysis due
   * to factors such as low prevalence (subject to change).
   * </pre>
   *
   * <code>bool excluded_from_analysis = 3;</code>
   *
   * @return The excludedFromAnalysis.
   */
  boolean getExcludedFromAnalysis();
}
