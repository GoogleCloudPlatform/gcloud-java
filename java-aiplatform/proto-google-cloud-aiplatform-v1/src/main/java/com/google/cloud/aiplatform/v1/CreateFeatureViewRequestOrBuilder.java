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
// source: google/cloud/aiplatform/v1/feature_online_store_admin_service.proto

package com.google.cloud.aiplatform.v1;

public interface CreateFeatureViewRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CreateFeatureViewRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the FeatureOnlineStore to create
   * FeatureViews. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the FeatureOnlineStore to create
   * FeatureViews. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The FeatureView to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureView feature_view = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the featureView field is set.
   */
  boolean hasFeatureView();
  /**
   *
   *
   * <pre>
   * Required. The FeatureView to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureView feature_view = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The featureView.
   */
  com.google.cloud.aiplatform.v1.FeatureView getFeatureView();
  /**
   *
   *
   * <pre>
   * Required. The FeatureView to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureView feature_view = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.FeatureViewOrBuilder getFeatureViewOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the FeatureView, which will become the final
   * component of the FeatureView's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within a FeatureOnlineStore.
   * </pre>
   *
   * <code>string feature_view_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The featureViewId.
   */
  java.lang.String getFeatureViewId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the FeatureView, which will become the final
   * component of the FeatureView's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within a FeatureOnlineStore.
   * </pre>
   *
   * <code>string feature_view_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for featureViewId.
   */
  com.google.protobuf.ByteString getFeatureViewIdBytes();

  /**
   *
   *
   * <pre>
   * Immutable. If set to true, one on demand sync will be run immediately,
   * regardless whether the
   * [FeatureView.sync_config][google.cloud.aiplatform.v1.FeatureView.sync_config]
   * is configured or not.
   * </pre>
   *
   * <code>bool run_sync_immediately = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The runSyncImmediately.
   */
  boolean getRunSyncImmediately();
}
