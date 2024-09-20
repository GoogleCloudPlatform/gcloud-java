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
// source: google/cloud/aiplatform/v1beta1/persistent_resource_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface UpdatePersistentResourceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The PersistentResource to update.
   *
   * The PersistentResource's `name` field is used to identify the
   * PersistentResource to update. Format:
   * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the persistentResource field is set.
   */
  boolean hasPersistentResource();
  /**
   *
   *
   * <pre>
   * Required. The PersistentResource to update.
   *
   * The PersistentResource's `name` field is used to identify the
   * PersistentResource to update. Format:
   * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The persistentResource.
   */
  com.google.cloud.aiplatform.v1beta1.PersistentResource getPersistentResource();
  /**
   *
   *
   * <pre>
   * Required. The PersistentResource to update.
   *
   * The PersistentResource's `name` field is used to identify the
   * PersistentResource to update. Format:
   * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder getPersistentResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Specify the fields to be overwritten in the PersistentResource by
   * the update method.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Specify the fields to be overwritten in the PersistentResource by
   * the update method.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Specify the fields to be overwritten in the PersistentResource by
   * the update method.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
