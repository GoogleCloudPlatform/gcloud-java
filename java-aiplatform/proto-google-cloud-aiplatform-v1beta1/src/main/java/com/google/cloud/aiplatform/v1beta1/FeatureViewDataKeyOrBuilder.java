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
// source: google/cloud/aiplatform/v1beta1/feature_online_store_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface FeatureViewDataKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FeatureViewDataKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * String key to use for lookup.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   *
   *
   * <pre>
   * String key to use for lookup.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * String key to use for lookup.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * The actual Entity ID will be composed from this struct. This should match
   * with the way ID is defined in the FeatureView spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureViewDataKey.CompositeKey composite_key = 2;
   * </code>
   *
   * @return Whether the compositeKey field is set.
   */
  boolean hasCompositeKey();
  /**
   *
   *
   * <pre>
   * The actual Entity ID will be composed from this struct. This should match
   * with the way ID is defined in the FeatureView spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureViewDataKey.CompositeKey composite_key = 2;
   * </code>
   *
   * @return The compositeKey.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDataKey.CompositeKey getCompositeKey();
  /**
   *
   *
   * <pre>
   * The actual Entity ID will be composed from this struct. This should match
   * with the way ID is defined in the FeatureView spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureViewDataKey.CompositeKey composite_key = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDataKey.CompositeKeyOrBuilder
      getCompositeKeyOrBuilder();

  com.google.cloud.aiplatform.v1beta1.FeatureViewDataKey.KeyOneofCase getKeyOneofCase();
}
