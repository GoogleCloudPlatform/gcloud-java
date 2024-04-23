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
// source: google/cloud/video/livestream/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.livestream.v1;

public interface InputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.Input)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the input, in the form of:
   * `projects/{project}/locations/{location}/inputs/{inputId}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the input, in the form of:
   * `projects/{project}/locations/{location}/inputs/{inputId}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
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
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Source type.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Input.Type type = 5;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Source type.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Input.Type type = 5;</code>
   *
   * @return The type.
   */
  com.google.cloud.video.livestream.v1.Input.Type getType();

  /**
   *
   *
   * <pre>
   * Tier defines the maximum input specification that is accepted by the
   * video pipeline. The billing is charged based on the tier specified here.
   * See [Pricing](https://cloud.google.com/livestream/pricing) for more detail.
   * The default is `HD`.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Input.Tier tier = 14;</code>
   *
   * @return The enum numeric value on the wire for tier.
   */
  int getTierValue();
  /**
   *
   *
   * <pre>
   * Tier defines the maximum input specification that is accepted by the
   * video pipeline. The billing is charged based on the tier specified here.
   * See [Pricing](https://cloud.google.com/livestream/pricing) for more detail.
   * The default is `HD`.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Input.Tier tier = 14;</code>
   *
   * @return The tier.
   */
  com.google.cloud.video.livestream.v1.Input.Tier getTier();

  /**
   *
   *
   * <pre>
   * Output only. URI to push the input stream to.
   * Its format depends on the input
   * [type][google.cloud.video.livestream.v1.Input.type], for example:
   *
   * *  `RTMP_PUSH`: `rtmp://1.2.3.4/live/{STREAM-ID}`
   * *  `SRT_PUSH`: `srt://1.2.3.4:4201?streamid={STREAM-ID}`
   * </pre>
   *
   * <code>string uri = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Output only. URI to push the input stream to.
   * Its format depends on the input
   * [type][google.cloud.video.livestream.v1.Input.type], for example:
   *
   * *  `RTMP_PUSH`: `rtmp://1.2.3.4/live/{STREAM-ID}`
   * *  `SRT_PUSH`: `srt://1.2.3.4:4201?streamid={STREAM-ID}`
   * </pre>
   *
   * <code>string uri = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Preprocessing configurations.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig preprocessing_config = 9;</code>
   *
   * @return Whether the preprocessingConfig field is set.
   */
  boolean hasPreprocessingConfig();
  /**
   *
   *
   * <pre>
   * Preprocessing configurations.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig preprocessing_config = 9;</code>
   *
   * @return The preprocessingConfig.
   */
  com.google.cloud.video.livestream.v1.PreprocessingConfig getPreprocessingConfig();
  /**
   *
   *
   * <pre>
   * Preprocessing configurations.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig preprocessing_config = 9;</code>
   */
  com.google.cloud.video.livestream.v1.PreprocessingConfigOrBuilder
      getPreprocessingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Security rule for access control.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Input.SecurityRule security_rules = 12;</code>
   *
   * @return Whether the securityRules field is set.
   */
  boolean hasSecurityRules();
  /**
   *
   *
   * <pre>
   * Security rule for access control.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Input.SecurityRule security_rules = 12;</code>
   *
   * @return The securityRules.
   */
  com.google.cloud.video.livestream.v1.Input.SecurityRule getSecurityRules();
  /**
   *
   *
   * <pre>
   * Security rule for access control.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Input.SecurityRule security_rules = 12;</code>
   */
  com.google.cloud.video.livestream.v1.Input.SecurityRuleOrBuilder getSecurityRulesOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The information for the input stream. This field will be
   * present only when this input receives the input stream.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.InputStreamProperty input_stream_property = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the inputStreamProperty field is set.
   */
  boolean hasInputStreamProperty();
  /**
   *
   *
   * <pre>
   * Output only. The information for the input stream. This field will be
   * present only when this input receives the input stream.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.InputStreamProperty input_stream_property = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The inputStreamProperty.
   */
  com.google.cloud.video.livestream.v1.InputStreamProperty getInputStreamProperty();
  /**
   *
   *
   * <pre>
   * Output only. The information for the input stream. This field will be
   * present only when this input receives the input stream.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.InputStreamProperty input_stream_property = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.video.livestream.v1.InputStreamPropertyOrBuilder
      getInputStreamPropertyOrBuilder();
}
