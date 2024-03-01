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
// source: google/cloud/gkemulticloud/v1/common_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkemulticloud.v1;

public interface LoggingComponentConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.LoggingComponentConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The components to be enabled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.LoggingComponentConfig.Component enable_components = 1;
   * </code>
   *
   * @return A list containing the enableComponents.
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.Component>
      getEnableComponentsList();
  /**
   *
   *
   * <pre>
   * The components to be enabled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.LoggingComponentConfig.Component enable_components = 1;
   * </code>
   *
   * @return The count of enableComponents.
   */
  int getEnableComponentsCount();
  /**
   *
   *
   * <pre>
   * The components to be enabled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.LoggingComponentConfig.Component enable_components = 1;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The enableComponents at the given index.
   */
  com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.Component getEnableComponents(int index);
  /**
   *
   *
   * <pre>
   * The components to be enabled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.LoggingComponentConfig.Component enable_components = 1;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for enableComponents.
   */
  java.util.List<java.lang.Integer> getEnableComponentsValueList();
  /**
   *
   *
   * <pre>
   * The components to be enabled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.LoggingComponentConfig.Component enable_components = 1;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of enableComponents at the given index.
   */
  int getEnableComponentsValue(int index);
}
