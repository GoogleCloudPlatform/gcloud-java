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
// source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto

package com.google.cloud.securitycenter.settings.v1beta1;

public interface BatchCalculateEffectiveSettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.settings.v1beta1.BatchCalculateEffectiveSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the organization shared by all of the
   * settings being retrieved.
   * Format:
   *  * `organizations/{organization}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the organization shared by all of the
   * settings being retrieved.
   * Format:
   *  * `organizations/{organization}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The requests specifying the effective settings to retrieve.
   * A maximum of 1000 effective settings can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequest requests = 2;
   * </code>
   */
  java.util.List<com.google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequest>
      getRequestsList();
  /**
   *
   *
   * <pre>
   * The requests specifying the effective settings to retrieve.
   * A maximum of 1000 effective settings can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequest requests = 2;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequest getRequests(
      int index);
  /**
   *
   *
   * <pre>
   * The requests specifying the effective settings to retrieve.
   * A maximum of 1000 effective settings can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequest requests = 2;
   * </code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * The requests specifying the effective settings to retrieve.
   * A maximum of 1000 effective settings can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequest requests = 2;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.securitycenter.settings.v1beta1
                  .CalculateEffectiveSettingsRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The requests specifying the effective settings to retrieve.
   * A maximum of 1000 effective settings can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequest requests = 2;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequestOrBuilder
      getRequestsOrBuilder(int index);
}
