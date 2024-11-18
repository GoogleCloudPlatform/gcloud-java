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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface CommitmentResourceStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.CommitmentResourceStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Indicates the end time of customer's eligibility to send custom term requests in RFC3339 text format. Term extension requests that (not the end time in the request) after this time will be rejected.
   * </pre>
   *
   * <code>optional string custom_term_eligibility_end_timestamp = 363976187;</code>
   *
   * @return Whether the customTermEligibilityEndTimestamp field is set.
   */
  boolean hasCustomTermEligibilityEndTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Indicates the end time of customer's eligibility to send custom term requests in RFC3339 text format. Term extension requests that (not the end time in the request) after this time will be rejected.
   * </pre>
   *
   * <code>optional string custom_term_eligibility_end_timestamp = 363976187;</code>
   *
   * @return The customTermEligibilityEndTimestamp.
   */
  java.lang.String getCustomTermEligibilityEndTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Indicates the end time of customer's eligibility to send custom term requests in RFC3339 text format. Term extension requests that (not the end time in the request) after this time will be rejected.
   * </pre>
   *
   * <code>optional string custom_term_eligibility_end_timestamp = 363976187;</code>
   *
   * @return The bytes for customTermEligibilityEndTimestamp.
   */
  com.google.protobuf.ByteString getCustomTermEligibilityEndTimestampBytes();
}
