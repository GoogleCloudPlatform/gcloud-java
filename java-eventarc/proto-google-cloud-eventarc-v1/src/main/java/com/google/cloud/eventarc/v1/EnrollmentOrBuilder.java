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
// source: google/cloud/eventarc/v1/enrollment.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.eventarc.v1;

public interface EnrollmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.Enrollment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Resource name of the form
   * projects/{project}/locations/{location}/enrollments/{enrollment}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Resource name of the form
   * projects/{project}/locations/{location}/enrollments/{enrollment}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server assigned unique identifier for the channel. The value
   * is a UUID4 string and guaranteed to remain unchanged until the resource is
   * deleted.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Server assigned unique identifier for the channel. The value
   * is a UUID4 string and guaranteed to remain unchanged until the resource is
   * deleted.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. This checksum is computed by the server based on the value of
   * other fields, and might be sent only on update and delete requests to
   * ensure that the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. This checksum is computed by the server based on the value of
   * other fields, and might be sent only on update and delete requests to
   * ensure that the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Resource labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Resource labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Resource labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Resource labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Resource labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Resource annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Optional. Resource annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Optional. Resource annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Optional. Resource annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Resource annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Resource display name.
   * </pre>
   *
   * <code>string display_name = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. Resource display name.
   * </pre>
   *
   * <code>string display_name = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. A CEL expression identifying which messages this enrollment
   * applies to.
   * </pre>
   *
   * <code>string cel_match = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The celMatch.
   */
  java.lang.String getCelMatch();
  /**
   *
   *
   * <pre>
   * Required. A CEL expression identifying which messages this enrollment
   * applies to.
   * </pre>
   *
   * <code>string cel_match = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for celMatch.
   */
  com.google.protobuf.ByteString getCelMatchBytes();

  /**
   *
   *
   * <pre>
   * Required. Resource name of the message bus identifying the source of the
   * messages. It matches the form
   * projects/{project}/locations/{location}/messageBuses/{messageBus}.
   * </pre>
   *
   * <code>
   * string message_bus = 10 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The messageBus.
   */
  java.lang.String getMessageBus();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the message bus identifying the source of the
   * messages. It matches the form
   * projects/{project}/locations/{location}/messageBuses/{messageBus}.
   * </pre>
   *
   * <code>
   * string message_bus = 10 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for messageBus.
   */
  com.google.protobuf.ByteString getMessageBusBytes();

  /**
   *
   *
   * <pre>
   * Required. Destination is the Pipeline that the Enrollment is delivering to.
   * It must point to the full resource name of a Pipeline. Format:
   * "projects/{PROJECT_ID}/locations/{region}/pipelines/{PIPELINE_ID)"
   * </pre>
   *
   * <code>string destination = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The destination.
   */
  java.lang.String getDestination();
  /**
   *
   *
   * <pre>
   * Required. Destination is the Pipeline that the Enrollment is delivering to.
   * It must point to the full resource name of a Pipeline. Format:
   * "projects/{PROJECT_ID}/locations/{region}/pipelines/{PIPELINE_ID)"
   * </pre>
   *
   * <code>string destination = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for destination.
   */
  com.google.protobuf.ByteString getDestinationBytes();
}
