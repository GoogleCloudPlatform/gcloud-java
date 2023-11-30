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
// source: google/cloud/vision/v1p3beta1/geometry.proto

package com.google.cloud.vision.v1p3beta1;

public interface PositionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.Position)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * X coordinate.
   * </pre>
   *
   * <code>float x = 1;</code>
   *
   * @return The x.
   */
  float getX();

  /**
   *
   *
   * <pre>
   * Y coordinate.
   * </pre>
   *
   * <code>float y = 2;</code>
   *
   * @return The y.
   */
  float getY();

  /**
   *
   *
   * <pre>
   * Z coordinate (or depth).
   * </pre>
   *
   * <code>float z = 3;</code>
   *
   * @return The z.
   */
  float getZ();
}
