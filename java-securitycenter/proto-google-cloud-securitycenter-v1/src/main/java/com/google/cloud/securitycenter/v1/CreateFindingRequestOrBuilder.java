/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface CreateFindingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.CreateFindingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the new finding's parent. Its format should be
   * "organizations/[organization_id]/sources/[source_id]".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Resource name of the new finding's parent. Its format should be
   * "organizations/[organization_id]/sources/[source_id]".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Unique identifier provided by the client within the parent scope.
   * It must be alphanumeric and less than or equal to 32 characters and
   * greater than 0 characters in length.
   * </pre>
   *
   * <code>string finding_id = 2;</code>
   */
  java.lang.String getFindingId();
  /**
   *
   *
   * <pre>
   * Unique identifier provided by the client within the parent scope.
   * It must be alphanumeric and less than or equal to 32 characters and
   * greater than 0 characters in length.
   * </pre>
   *
   * <code>string finding_id = 2;</code>
   */
  com.google.protobuf.ByteString getFindingIdBytes();

  /**
   *
   *
   * <pre>
   * The Finding being created. The name and security_marks will be ignored as
   * they are both output only fields on this resource.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding finding = 3;</code>
   */
  boolean hasFinding();
  /**
   *
   *
   * <pre>
   * The Finding being created. The name and security_marks will be ignored as
   * they are both output only fields on this resource.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding finding = 3;</code>
   */
  com.google.cloud.securitycenter.v1.Finding getFinding();
  /**
   *
   *
   * <pre>
   * The Finding being created. The name and security_marks will be ignored as
   * they are both output only fields on this resource.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding finding = 3;</code>
   */
  com.google.cloud.securitycenter.v1.FindingOrBuilder getFindingOrBuilder();
}
