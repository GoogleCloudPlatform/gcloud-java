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
// source: google/cloud/eventarc/v1/trigger.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.eventarc.v1;

public interface StateConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.StateCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The canonical code of the condition.
   * </pre>
   *
   * <code>.google.rpc.Code code = 1;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * The canonical code of the condition.
   * </pre>
   *
   * <code>.google.rpc.Code code = 1;</code>
   *
   * @return The code.
   */
  com.google.rpc.Code getCode();

  /**
   *
   *
   * <pre>
   * Human-readable message.
   * </pre>
   *
   * <code>string message = 2;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * Human-readable message.
   * </pre>
   *
   * <code>string message = 2;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();
}
