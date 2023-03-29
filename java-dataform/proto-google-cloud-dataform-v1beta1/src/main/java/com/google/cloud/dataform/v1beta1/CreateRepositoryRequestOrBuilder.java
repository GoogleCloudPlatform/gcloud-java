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
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

public interface CreateRepositoryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.CreateRepositoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The location in which to create the repository. Must be in the format
   * `projects/&#42;&#47;locations/&#42;`.
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
   * Required. The location in which to create the repository. Must be in the format
   * `projects/&#42;&#47;locations/&#42;`.
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
   * Required. The repository to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the repository field is set.
   */
  boolean hasRepository();
  /**
   *
   *
   * <pre>
   * Required. The repository to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The repository.
   */
  com.google.cloud.dataform.v1beta1.Repository getRepository();
  /**
   *
   *
   * <pre>
   * Required. The repository to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataform.v1beta1.RepositoryOrBuilder getRepositoryOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the repository, which will become the final component of
   * the repository's resource name.
   * </pre>
   *
   * <code>string repository_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The repositoryId.
   */
  java.lang.String getRepositoryId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the repository, which will become the final component of
   * the repository's resource name.
   * </pre>
   *
   * <code>string repository_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for repositoryId.
   */
  com.google.protobuf.ByteString getRepositoryIdBytes();
}
