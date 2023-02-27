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
// source: google/cloud/security/privateca/v1/resources.proto

package com.google.cloud.security.privateca.v1;

public interface ObjectIdOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.ObjectId)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parts of an OID path. The most significant parts of the path
   * come first.
   * </pre>
   *
   * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the objectIdPath.
   */
  java.util.List<java.lang.Integer> getObjectIdPathList();
  /**
   *
   *
   * <pre>
   * Required. The parts of an OID path. The most significant parts of the path
   * come first.
   * </pre>
   *
   * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of objectIdPath.
   */
  int getObjectIdPathCount();
  /**
   *
   *
   * <pre>
   * Required. The parts of an OID path. The most significant parts of the path
   * come first.
   * </pre>
   *
   * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The objectIdPath at the given index.
   */
  int getObjectIdPath(int index);
}
