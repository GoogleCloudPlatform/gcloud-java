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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

public interface UpdateAccessLevelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The updated [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
   * correctness of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] is a
   * precondition for creation.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the accessLevel field is set.
   */
  boolean hasAccessLevel();
  /**
   *
   *
   * <pre>
   * Required. The updated [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
   * correctness of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] is a
   * precondition for creation.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The accessLevel.
   */
  com.google.identity.accesscontextmanager.v1.AccessLevel getAccessLevel();
  /**
   *
   *
   * <pre>
   * Required. The updated [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
   * correctness of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] is a
   * precondition for creation.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder getAccessLevelOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Mask to control which fields get updated. Must be non-empty.
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
   * Required. Mask to control which fields get updated. Must be non-empty.
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
   * Required. Mask to control which fields get updated. Must be non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
