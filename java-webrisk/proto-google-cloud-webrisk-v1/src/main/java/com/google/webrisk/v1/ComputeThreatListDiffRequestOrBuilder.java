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
// source: google/cloud/webrisk/v1/webrisk.proto

package com.google.webrisk.v1;

public interface ComputeThreatListDiffRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.ComputeThreatListDiffRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The threat list to update. Only a single ThreatType should be
   * specified per request. If you want to handle multiple ThreatTypes, you must
   * make one request per ThreatType.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1.ThreatType threat_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for threatType.
   */
  int getThreatTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The threat list to update. Only a single ThreatType should be
   * specified per request. If you want to handle multiple ThreatTypes, you must
   * make one request per ThreatType.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1.ThreatType threat_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The threatType.
   */
  com.google.webrisk.v1.ThreatType getThreatType();

  /**
   *
   *
   * <pre>
   * The current version token of the client for the requested list (the
   * client version that was received from the last successful diff).
   * If the client does not have a version token (this is the first time calling
   * ComputeThreatListDiff), this may be left empty and a full database
   * snapshot will be returned.
   * </pre>
   *
   * <code>bytes version_token = 2;</code>
   *
   * @return The versionToken.
   */
  com.google.protobuf.ByteString getVersionToken();

  /**
   *
   *
   * <pre>
   * Required. The constraints associated with this request.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1.ComputeThreatListDiffRequest.Constraints constraints = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the constraints field is set.
   */
  boolean hasConstraints();
  /**
   *
   *
   * <pre>
   * Required. The constraints associated with this request.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1.ComputeThreatListDiffRequest.Constraints constraints = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The constraints.
   */
  com.google.webrisk.v1.ComputeThreatListDiffRequest.Constraints getConstraints();
  /**
   *
   *
   * <pre>
   * Required. The constraints associated with this request.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1.ComputeThreatListDiffRequest.Constraints constraints = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.webrisk.v1.ComputeThreatListDiffRequest.ConstraintsOrBuilder getConstraintsOrBuilder();
}
