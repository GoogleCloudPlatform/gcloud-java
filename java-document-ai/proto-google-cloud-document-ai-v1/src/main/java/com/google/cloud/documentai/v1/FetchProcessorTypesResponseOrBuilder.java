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
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

public interface FetchProcessorTypesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.FetchProcessorTypesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
   */
  java.util.List<com.google.cloud.documentai.v1.ProcessorType> getProcessorTypesList();
  /**
   *
   *
   * <pre>
   * The list of processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
   */
  com.google.cloud.documentai.v1.ProcessorType getProcessorTypes(int index);
  /**
   *
   *
   * <pre>
   * The list of processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
   */
  int getProcessorTypesCount();
  /**
   *
   *
   * <pre>
   * The list of processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1.ProcessorTypeOrBuilder>
      getProcessorTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
   */
  com.google.cloud.documentai.v1.ProcessorTypeOrBuilder getProcessorTypesOrBuilder(int index);
}
