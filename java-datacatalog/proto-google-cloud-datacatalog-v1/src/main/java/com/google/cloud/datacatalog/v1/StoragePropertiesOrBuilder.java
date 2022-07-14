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
// source: google/cloud/datacatalog/v1/data_source.proto

package com.google.cloud.datacatalog.v1;

public interface StoragePropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.StorageProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Patterns to identify a set of files for this fileset.
   * Examples of a valid `file_pattern`:
   *  * `gs://bucket_name/dir/&#42;`: matches all files in the `bucket_name/dir`
   *                              directory
   *  * `gs://bucket_name/dir/&#42;*`: matches all files in the `bucket_name/dir`
   *                               and all subdirectories recursively
   *  * `gs://bucket_name/file*`: matches files prefixed by `file` in
   *                              `bucket_name`
   *  * `gs://bucket_name/??.txt`: matches files with two characters followed by
   *                               `.txt` in `bucket_name`
   *  * `gs://bucket_name/[aeiou].txt`: matches files that contain a single
   *                                    vowel character followed by `.txt` in
   *                                    `bucket_name`
   *  * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ...
   *                                  or `m` followed by `.txt` in `bucket_name`
   *  * `gs://bucket_name/a/&#42;&#47;b`: matches all files in `bucket_name` that match
   *                              the `a/&#42;&#47;b` pattern, such as `a/c/b`, `a/d/b`
   *  * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt`
   * </pre>
   *
   * <code>repeated string file_pattern = 1;</code>
   *
   * @return A list containing the filePattern.
   */
  java.util.List<java.lang.String> getFilePatternList();
  /**
   *
   *
   * <pre>
   * Patterns to identify a set of files for this fileset.
   * Examples of a valid `file_pattern`:
   *  * `gs://bucket_name/dir/&#42;`: matches all files in the `bucket_name/dir`
   *                              directory
   *  * `gs://bucket_name/dir/&#42;*`: matches all files in the `bucket_name/dir`
   *                               and all subdirectories recursively
   *  * `gs://bucket_name/file*`: matches files prefixed by `file` in
   *                              `bucket_name`
   *  * `gs://bucket_name/??.txt`: matches files with two characters followed by
   *                               `.txt` in `bucket_name`
   *  * `gs://bucket_name/[aeiou].txt`: matches files that contain a single
   *                                    vowel character followed by `.txt` in
   *                                    `bucket_name`
   *  * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ...
   *                                  or `m` followed by `.txt` in `bucket_name`
   *  * `gs://bucket_name/a/&#42;&#47;b`: matches all files in `bucket_name` that match
   *                              the `a/&#42;&#47;b` pattern, such as `a/c/b`, `a/d/b`
   *  * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt`
   * </pre>
   *
   * <code>repeated string file_pattern = 1;</code>
   *
   * @return The count of filePattern.
   */
  int getFilePatternCount();
  /**
   *
   *
   * <pre>
   * Patterns to identify a set of files for this fileset.
   * Examples of a valid `file_pattern`:
   *  * `gs://bucket_name/dir/&#42;`: matches all files in the `bucket_name/dir`
   *                              directory
   *  * `gs://bucket_name/dir/&#42;*`: matches all files in the `bucket_name/dir`
   *                               and all subdirectories recursively
   *  * `gs://bucket_name/file*`: matches files prefixed by `file` in
   *                              `bucket_name`
   *  * `gs://bucket_name/??.txt`: matches files with two characters followed by
   *                               `.txt` in `bucket_name`
   *  * `gs://bucket_name/[aeiou].txt`: matches files that contain a single
   *                                    vowel character followed by `.txt` in
   *                                    `bucket_name`
   *  * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ...
   *                                  or `m` followed by `.txt` in `bucket_name`
   *  * `gs://bucket_name/a/&#42;&#47;b`: matches all files in `bucket_name` that match
   *                              the `a/&#42;&#47;b` pattern, such as `a/c/b`, `a/d/b`
   *  * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt`
   * </pre>
   *
   * <code>repeated string file_pattern = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The filePattern at the given index.
   */
  java.lang.String getFilePattern(int index);
  /**
   *
   *
   * <pre>
   * Patterns to identify a set of files for this fileset.
   * Examples of a valid `file_pattern`:
   *  * `gs://bucket_name/dir/&#42;`: matches all files in the `bucket_name/dir`
   *                              directory
   *  * `gs://bucket_name/dir/&#42;*`: matches all files in the `bucket_name/dir`
   *                               and all subdirectories recursively
   *  * `gs://bucket_name/file*`: matches files prefixed by `file` in
   *                              `bucket_name`
   *  * `gs://bucket_name/??.txt`: matches files with two characters followed by
   *                               `.txt` in `bucket_name`
   *  * `gs://bucket_name/[aeiou].txt`: matches files that contain a single
   *                                    vowel character followed by `.txt` in
   *                                    `bucket_name`
   *  * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ...
   *                                  or `m` followed by `.txt` in `bucket_name`
   *  * `gs://bucket_name/a/&#42;&#47;b`: matches all files in `bucket_name` that match
   *                              the `a/&#42;&#47;b` pattern, such as `a/c/b`, `a/d/b`
   *  * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt`
   * </pre>
   *
   * <code>repeated string file_pattern = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the filePattern at the given index.
   */
  com.google.protobuf.ByteString getFilePatternBytes(int index);

  /**
   *
   *
   * <pre>
   * File type in MIME format, for example, `text/plain`.
   * </pre>
   *
   * <code>string file_type = 2;</code>
   *
   * @return The fileType.
   */
  java.lang.String getFileType();
  /**
   *
   *
   * <pre>
   * File type in MIME format, for example, `text/plain`.
   * </pre>
   *
   * <code>string file_type = 2;</code>
   *
   * @return The bytes for fileType.
   */
  com.google.protobuf.ByteString getFileTypeBytes();
}
