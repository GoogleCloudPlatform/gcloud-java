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
// source: google/cloud/gkebackup/v1/common.proto

package com.google.cloud.gkebackup.v1;

public interface NamespacesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.Namespaces)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of Kubernetes Namespaces
   * </pre>
   *
   * <code>repeated string namespaces = 1;</code>
   *
   * @return A list containing the namespaces.
   */
  java.util.List<java.lang.String> getNamespacesList();
  /**
   *
   *
   * <pre>
   * A list of Kubernetes Namespaces
   * </pre>
   *
   * <code>repeated string namespaces = 1;</code>
   *
   * @return The count of namespaces.
   */
  int getNamespacesCount();
  /**
   *
   *
   * <pre>
   * A list of Kubernetes Namespaces
   * </pre>
   *
   * <code>repeated string namespaces = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The namespaces at the given index.
   */
  java.lang.String getNamespaces(int index);
  /**
   *
   *
   * <pre>
   * A list of Kubernetes Namespaces
   * </pre>
   *
   * <code>repeated string namespaces = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the namespaces at the given index.
   */
  com.google.protobuf.ByteString getNamespacesBytes(int index);
}
