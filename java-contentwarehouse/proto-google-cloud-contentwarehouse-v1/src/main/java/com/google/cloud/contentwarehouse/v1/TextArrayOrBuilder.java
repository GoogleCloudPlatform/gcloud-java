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
// source: google/cloud/contentwarehouse/v1/document.proto

package com.google.cloud.contentwarehouse.v1;

public interface TextArrayOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.TextArray)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of text values.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @return A list containing the values.
   */
  java.util.List<java.lang.String> getValuesList();
  /**
   *
   *
   * <pre>
   * List of text values.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @return The count of values.
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * List of text values.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   *
   *
   * <pre>
   * List of text values.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString getValuesBytes(int index);
}
