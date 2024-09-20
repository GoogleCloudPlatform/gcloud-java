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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Results for tool parameter key match metric.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults}
 */
public final class ToolParameterKeyMatchResults extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults)
    ToolParameterKeyMatchResultsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ToolParameterKeyMatchResults.newBuilder() to construct.
  private ToolParameterKeyMatchResults(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ToolParameterKeyMatchResults() {
    toolParameterKeyMatchMetricValues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ToolParameterKeyMatchResults();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ToolParameterKeyMatchResults_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ToolParameterKeyMatchResults_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults.class,
            com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults.Builder.class);
  }

  public static final int TOOL_PARAMETER_KEY_MATCH_METRIC_VALUES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue>
      toolParameterKeyMatchMetricValues_;
  /**
   *
   *
   * <pre>
   * Output only. Tool parameter key match metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue>
      getToolParameterKeyMatchMetricValuesList() {
    return toolParameterKeyMatchMetricValues_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool parameter key match metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValueOrBuilder>
      getToolParameterKeyMatchMetricValuesOrBuilderList() {
    return toolParameterKeyMatchMetricValues_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool parameter key match metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public int getToolParameterKeyMatchMetricValuesCount() {
    return toolParameterKeyMatchMetricValues_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool parameter key match metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue
      getToolParameterKeyMatchMetricValues(int index) {
    return toolParameterKeyMatchMetricValues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool parameter key match metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValueOrBuilder
      getToolParameterKeyMatchMetricValuesOrBuilder(int index) {
    return toolParameterKeyMatchMetricValues_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < toolParameterKeyMatchMetricValues_.size(); i++) {
      output.writeMessage(1, toolParameterKeyMatchMetricValues_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < toolParameterKeyMatchMetricValues_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, toolParameterKeyMatchMetricValues_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults other =
        (com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults) obj;

    if (!getToolParameterKeyMatchMetricValuesList()
        .equals(other.getToolParameterKeyMatchMetricValuesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getToolParameterKeyMatchMetricValuesCount() > 0) {
      hash = (37 * hash) + TOOL_PARAMETER_KEY_MATCH_METRIC_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getToolParameterKeyMatchMetricValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Results for tool parameter key match metric.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults)
      com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ToolParameterKeyMatchResults_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ToolParameterKeyMatchResults_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults.class,
              com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        toolParameterKeyMatchMetricValues_ = java.util.Collections.emptyList();
      } else {
        toolParameterKeyMatchMetricValues_ = null;
        toolParameterKeyMatchMetricValuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ToolParameterKeyMatchResults_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults build() {
      com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults result =
          new com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults result) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          toolParameterKeyMatchMetricValues_ =
              java.util.Collections.unmodifiableList(toolParameterKeyMatchMetricValues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.toolParameterKeyMatchMetricValues_ = toolParameterKeyMatchMetricValues_;
      } else {
        result.toolParameterKeyMatchMetricValues_ =
            toolParameterKeyMatchMetricValuesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults.getDefaultInstance())
        return this;
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        if (!other.toolParameterKeyMatchMetricValues_.isEmpty()) {
          if (toolParameterKeyMatchMetricValues_.isEmpty()) {
            toolParameterKeyMatchMetricValues_ = other.toolParameterKeyMatchMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureToolParameterKeyMatchMetricValuesIsMutable();
            toolParameterKeyMatchMetricValues_.addAll(other.toolParameterKeyMatchMetricValues_);
          }
          onChanged();
        }
      } else {
        if (!other.toolParameterKeyMatchMetricValues_.isEmpty()) {
          if (toolParameterKeyMatchMetricValuesBuilder_.isEmpty()) {
            toolParameterKeyMatchMetricValuesBuilder_.dispose();
            toolParameterKeyMatchMetricValuesBuilder_ = null;
            toolParameterKeyMatchMetricValues_ = other.toolParameterKeyMatchMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            toolParameterKeyMatchMetricValuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getToolParameterKeyMatchMetricValuesFieldBuilder()
                    : null;
          } else {
            toolParameterKeyMatchMetricValuesBuilder_.addAllMessages(
                other.toolParameterKeyMatchMetricValues_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue
                            .parser(),
                        extensionRegistry);
                if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
                  ensureToolParameterKeyMatchMetricValuesIsMutable();
                  toolParameterKeyMatchMetricValues_.add(m);
                } else {
                  toolParameterKeyMatchMetricValuesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue>
        toolParameterKeyMatchMetricValues_ = java.util.Collections.emptyList();

    private void ensureToolParameterKeyMatchMetricValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        toolParameterKeyMatchMetricValues_ =
            new java.util.ArrayList<
                com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue>(
                toolParameterKeyMatchMetricValues_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue,
            com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue.Builder,
            com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValueOrBuilder>
        toolParameterKeyMatchMetricValuesBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue>
        getToolParameterKeyMatchMetricValuesList() {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(toolParameterKeyMatchMetricValues_);
      } else {
        return toolParameterKeyMatchMetricValuesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getToolParameterKeyMatchMetricValuesCount() {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        return toolParameterKeyMatchMetricValues_.size();
      } else {
        return toolParameterKeyMatchMetricValuesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue
        getToolParameterKeyMatchMetricValues(int index) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        return toolParameterKeyMatchMetricValues_.get(index);
      } else {
        return toolParameterKeyMatchMetricValuesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setToolParameterKeyMatchMetricValues(
        int index, com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue value) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToolParameterKeyMatchMetricValuesIsMutable();
        toolParameterKeyMatchMetricValues_.set(index, value);
        onChanged();
      } else {
        toolParameterKeyMatchMetricValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setToolParameterKeyMatchMetricValues(
        int index,
        com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue.Builder
            builderForValue) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        ensureToolParameterKeyMatchMetricValuesIsMutable();
        toolParameterKeyMatchMetricValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        toolParameterKeyMatchMetricValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolParameterKeyMatchMetricValues(
        com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue value) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToolParameterKeyMatchMetricValuesIsMutable();
        toolParameterKeyMatchMetricValues_.add(value);
        onChanged();
      } else {
        toolParameterKeyMatchMetricValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolParameterKeyMatchMetricValues(
        int index, com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue value) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToolParameterKeyMatchMetricValuesIsMutable();
        toolParameterKeyMatchMetricValues_.add(index, value);
        onChanged();
      } else {
        toolParameterKeyMatchMetricValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolParameterKeyMatchMetricValues(
        com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue.Builder
            builderForValue) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        ensureToolParameterKeyMatchMetricValuesIsMutable();
        toolParameterKeyMatchMetricValues_.add(builderForValue.build());
        onChanged();
      } else {
        toolParameterKeyMatchMetricValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolParameterKeyMatchMetricValues(
        int index,
        com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue.Builder
            builderForValue) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        ensureToolParameterKeyMatchMetricValuesIsMutable();
        toolParameterKeyMatchMetricValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        toolParameterKeyMatchMetricValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAllToolParameterKeyMatchMetricValues(
        java.lang.Iterable<
                ? extends com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue>
            values) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        ensureToolParameterKeyMatchMetricValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, toolParameterKeyMatchMetricValues_);
        onChanged();
      } else {
        toolParameterKeyMatchMetricValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearToolParameterKeyMatchMetricValues() {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        toolParameterKeyMatchMetricValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        toolParameterKeyMatchMetricValuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeToolParameterKeyMatchMetricValues(int index) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        ensureToolParameterKeyMatchMetricValuesIsMutable();
        toolParameterKeyMatchMetricValues_.remove(index);
        onChanged();
      } else {
        toolParameterKeyMatchMetricValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue.Builder
        getToolParameterKeyMatchMetricValuesBuilder(int index) {
      return getToolParameterKeyMatchMetricValuesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValueOrBuilder
        getToolParameterKeyMatchMetricValuesOrBuilder(int index) {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        return toolParameterKeyMatchMetricValues_.get(index);
      } else {
        return toolParameterKeyMatchMetricValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValueOrBuilder>
        getToolParameterKeyMatchMetricValuesOrBuilderList() {
      if (toolParameterKeyMatchMetricValuesBuilder_ != null) {
        return toolParameterKeyMatchMetricValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(toolParameterKeyMatchMetricValues_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue.Builder
        addToolParameterKeyMatchMetricValuesBuilder() {
      return getToolParameterKeyMatchMetricValuesFieldBuilder()
          .addBuilder(
              com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue
                  .getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue.Builder
        addToolParameterKeyMatchMetricValuesBuilder(int index) {
      return getToolParameterKeyMatchMetricValuesFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue
                  .getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue tool_parameter_key_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<
            com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue.Builder>
        getToolParameterKeyMatchMetricValuesBuilderList() {
      return getToolParameterKeyMatchMetricValuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue,
            com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue.Builder,
            com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValueOrBuilder>
        getToolParameterKeyMatchMetricValuesFieldBuilder() {
      if (toolParameterKeyMatchMetricValuesBuilder_ == null) {
        toolParameterKeyMatchMetricValuesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue,
                com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValue.Builder,
                com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchMetricValueOrBuilder>(
                toolParameterKeyMatchMetricValues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        toolParameterKeyMatchMetricValues_ = null;
      }
      return toolParameterKeyMatchMetricValuesBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults)
  private static final com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults();
  }

  public static com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ToolParameterKeyMatchResults> PARSER =
      new com.google.protobuf.AbstractParser<ToolParameterKeyMatchResults>() {
        @java.lang.Override
        public ToolParameterKeyMatchResults parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ToolParameterKeyMatchResults> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ToolParameterKeyMatchResults> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchResults
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
