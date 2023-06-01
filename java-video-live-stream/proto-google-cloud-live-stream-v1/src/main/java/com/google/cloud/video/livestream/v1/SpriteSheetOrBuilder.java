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
// source: google/cloud/video/livestream/v1/outputs.proto

package com.google.cloud.video.livestream.v1;

public interface SpriteSheetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.SpriteSheet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Format type. The default is `jpeg`.
   *
   * Supported formats:
   *
   * - `jpeg`
   * </pre>
   *
   * <code>string format = 1;</code>
   *
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   *
   *
   * <pre>
   * Format type. The default is `jpeg`.
   *
   * Supported formats:
   *
   * - `jpeg`
   * </pre>
   *
   * <code>string format = 1;</code>
   *
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString getFormatBytes();

  /**
   *
   *
   * <pre>
   * Required. File name prefix for the generated sprite sheets. If multiple
   * sprite sheets are added to the channel, each must have a unique file
   * prefix.
   * Each sprite sheet has an incremental 10-digit zero-padded suffix starting
   * from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
   * </pre>
   *
   * <code>string file_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filePrefix.
   */
  java.lang.String getFilePrefix();
  /**
   *
   *
   * <pre>
   * Required. File name prefix for the generated sprite sheets. If multiple
   * sprite sheets are added to the channel, each must have a unique file
   * prefix.
   * Each sprite sheet has an incremental 10-digit zero-padded suffix starting
   * from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
   * </pre>
   *
   * <code>string file_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filePrefix.
   */
  com.google.protobuf.ByteString getFilePrefixBytes();

  /**
   *
   *
   * <pre>
   * Required. The width of the sprite in pixels. Must be an even integer.
   * </pre>
   *
   * <code>int32 sprite_width_pixels = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The spriteWidthPixels.
   */
  int getSpriteWidthPixels();

  /**
   *
   *
   * <pre>
   * Required. The height of the sprite in pixels. Must be an even integer.
   * </pre>
   *
   * <code>int32 sprite_height_pixels = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The spriteHeightPixels.
   */
  int getSpriteHeightPixels();

  /**
   *
   *
   * <pre>
   * The maximum number of sprites per row in a sprite sheet. Valid range is
   * [1, 10] and the default value is 1.
   * </pre>
   *
   * <code>int32 column_count = 5;</code>
   *
   * @return The columnCount.
   */
  int getColumnCount();

  /**
   *
   *
   * <pre>
   * The maximum number of rows per sprite sheet. When the sprite sheet is full,
   * a new sprite sheet is created. Valid range is [1, 10] and the default value
   * is 1.
   * </pre>
   *
   * <code>int32 row_count = 6;</code>
   *
   * @return The rowCount.
   */
  int getRowCount();

  /**
   *
   *
   * <pre>
   * Create sprites at regular intervals. Valid range is [1 second, 1 hour] and
   * the default value is `10s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 7;</code>
   *
   * @return Whether the interval field is set.
   */
  boolean hasInterval();
  /**
   *
   *
   * <pre>
   * Create sprites at regular intervals. Valid range is [1 second, 1 hour] and
   * the default value is `10s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 7;</code>
   *
   * @return The interval.
   */
  com.google.protobuf.Duration getInterval();
  /**
   *
   *
   * <pre>
   * Create sprites at regular intervals. Valid range is [1 second, 1 hour] and
   * the default value is `10s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getIntervalOrBuilder();

  /**
   *
   *
   * <pre>
   * The quality of the generated sprite sheet. Enter a value between 1
   * and 100, where 1 is the lowest quality and 100 is the highest quality.
   * The default is 100. A high quality value corresponds to a low image data
   * compression ratio.
   * </pre>
   *
   * <code>int32 quality = 8;</code>
   *
   * @return The quality.
   */
  int getQuality();
}
