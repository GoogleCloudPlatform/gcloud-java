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
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.clouderrorreporting.v1beta1;

public interface SourceLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.SourceLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The source code filename, which can include a truncated relative
   * path, or a full path from a production machine.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   *
   * @return The filePath.
   */
  java.lang.String getFilePath();
  /**
   *
   *
   * <pre>
   * The source code filename, which can include a truncated relative
   * path, or a full path from a production machine.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   *
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString getFilePathBytes();

  /**
   *
   *
   * <pre>
   * 1-based. 0 indicates that the line number is unknown.
   * </pre>
   *
   * <code>int32 line_number = 2;</code>
   *
   * @return The lineNumber.
   */
  int getLineNumber();

  /**
   *
   *
   * <pre>
   * Human-readable name of a function or method.
   * The value can include optional context like the class or package name.
   * For example, `my.package.MyClass.method` in case of Java.
   * </pre>
   *
   * <code>string function_name = 4;</code>
   *
   * @return The functionName.
   */
  java.lang.String getFunctionName();
  /**
   *
   *
   * <pre>
   * Human-readable name of a function or method.
   * The value can include optional context like the class or package name.
   * For example, `my.package.MyClass.method` in case of Java.
   * </pre>
   *
   * <code>string function_name = 4;</code>
   *
   * @return The bytes for functionName.
   */
  com.google.protobuf.ByteString getFunctionNameBytes();
}
