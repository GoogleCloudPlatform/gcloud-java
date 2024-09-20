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
// source: google/cloud/aiplatform/v1/evaluation_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Results for tool parameter key value match metric.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ToolParameterKVMatchResults}
 */
public final class ToolParameterKVMatchResults extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ToolParameterKVMatchResults)
    ToolParameterKVMatchResultsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ToolParameterKVMatchResults.newBuilder() to construct.
  private ToolParameterKVMatchResults(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ToolParameterKVMatchResults() {
    toolParameterKvMatchMetricValues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ToolParameterKVMatchResults();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1_ToolParameterKVMatchResults_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1_ToolParameterKVMatchResults_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults.class,
            com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults.Builder.class);
  }

  public static final int TOOL_PARAMETER_KV_MATCH_METRIC_VALUES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue>
      toolParameterKvMatchMetricValues_;
  /**
   *
   *
   * <pre>
   * Output only. Tool parameter key value match metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue>
      getToolParameterKvMatchMetricValuesList() {
    return toolParameterKvMatchMetricValues_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool parameter key value match metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValueOrBuilder>
      getToolParameterKvMatchMetricValuesOrBuilderList() {
    return toolParameterKvMatchMetricValues_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool parameter key value match metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public int getToolParameterKvMatchMetricValuesCount() {
    return toolParameterKvMatchMetricValues_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool parameter key value match metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue
      getToolParameterKvMatchMetricValues(int index) {
    return toolParameterKvMatchMetricValues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool parameter key value match metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValueOrBuilder
      getToolParameterKvMatchMetricValuesOrBuilder(int index) {
    return toolParameterKvMatchMetricValues_.get(index);
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
    for (int i = 0; i < toolParameterKvMatchMetricValues_.size(); i++) {
      output.writeMessage(1, toolParameterKvMatchMetricValues_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < toolParameterKvMatchMetricValues_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, toolParameterKvMatchMetricValues_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults other =
        (com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults) obj;

    if (!getToolParameterKvMatchMetricValuesList()
        .equals(other.getToolParameterKvMatchMetricValuesList())) return false;
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
    if (getToolParameterKvMatchMetricValuesCount() > 0) {
      hash = (37 * hash) + TOOL_PARAMETER_KV_MATCH_METRIC_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getToolParameterKvMatchMetricValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults parseFrom(
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
      com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults prototype) {
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
   * Results for tool parameter key value match metric.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ToolParameterKVMatchResults}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ToolParameterKVMatchResults)
      com.google.cloud.aiplatform.v1.ToolParameterKVMatchResultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_ToolParameterKVMatchResults_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_ToolParameterKVMatchResults_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults.class,
              com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        toolParameterKvMatchMetricValues_ = java.util.Collections.emptyList();
      } else {
        toolParameterKvMatchMetricValues_ = null;
        toolParameterKvMatchMetricValuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_ToolParameterKVMatchResults_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults build() {
      com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults buildPartial() {
      com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults result =
          new com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults result) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          toolParameterKvMatchMetricValues_ =
              java.util.Collections.unmodifiableList(toolParameterKvMatchMetricValues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.toolParameterKvMatchMetricValues_ = toolParameterKvMatchMetricValues_;
      } else {
        result.toolParameterKvMatchMetricValues_ = toolParameterKvMatchMetricValuesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults other) {
      if (other == com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults.getDefaultInstance())
        return this;
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        if (!other.toolParameterKvMatchMetricValues_.isEmpty()) {
          if (toolParameterKvMatchMetricValues_.isEmpty()) {
            toolParameterKvMatchMetricValues_ = other.toolParameterKvMatchMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureToolParameterKvMatchMetricValuesIsMutable();
            toolParameterKvMatchMetricValues_.addAll(other.toolParameterKvMatchMetricValues_);
          }
          onChanged();
        }
      } else {
        if (!other.toolParameterKvMatchMetricValues_.isEmpty()) {
          if (toolParameterKvMatchMetricValuesBuilder_.isEmpty()) {
            toolParameterKvMatchMetricValuesBuilder_.dispose();
            toolParameterKvMatchMetricValuesBuilder_ = null;
            toolParameterKvMatchMetricValues_ = other.toolParameterKvMatchMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            toolParameterKvMatchMetricValuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getToolParameterKvMatchMetricValuesFieldBuilder()
                    : null;
          } else {
            toolParameterKvMatchMetricValuesBuilder_.addAllMessages(
                other.toolParameterKvMatchMetricValues_);
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
                com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.parser(),
                        extensionRegistry);
                if (toolParameterKvMatchMetricValuesBuilder_ == null) {
                  ensureToolParameterKvMatchMetricValuesIsMutable();
                  toolParameterKvMatchMetricValues_.add(m);
                } else {
                  toolParameterKvMatchMetricValuesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue>
        toolParameterKvMatchMetricValues_ = java.util.Collections.emptyList();

    private void ensureToolParameterKvMatchMetricValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        toolParameterKvMatchMetricValues_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue>(
                toolParameterKvMatchMetricValues_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue,
            com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.Builder,
            com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValueOrBuilder>
        toolParameterKvMatchMetricValuesBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue>
        getToolParameterKvMatchMetricValuesList() {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(toolParameterKvMatchMetricValues_);
      } else {
        return toolParameterKvMatchMetricValuesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getToolParameterKvMatchMetricValuesCount() {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        return toolParameterKvMatchMetricValues_.size();
      } else {
        return toolParameterKvMatchMetricValuesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue
        getToolParameterKvMatchMetricValues(int index) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        return toolParameterKvMatchMetricValues_.get(index);
      } else {
        return toolParameterKvMatchMetricValuesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setToolParameterKvMatchMetricValues(
        int index, com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue value) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToolParameterKvMatchMetricValuesIsMutable();
        toolParameterKvMatchMetricValues_.set(index, value);
        onChanged();
      } else {
        toolParameterKvMatchMetricValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setToolParameterKvMatchMetricValues(
        int index,
        com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.Builder builderForValue) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        ensureToolParameterKvMatchMetricValuesIsMutable();
        toolParameterKvMatchMetricValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        toolParameterKvMatchMetricValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolParameterKvMatchMetricValues(
        com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue value) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToolParameterKvMatchMetricValuesIsMutable();
        toolParameterKvMatchMetricValues_.add(value);
        onChanged();
      } else {
        toolParameterKvMatchMetricValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolParameterKvMatchMetricValues(
        int index, com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue value) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToolParameterKvMatchMetricValuesIsMutable();
        toolParameterKvMatchMetricValues_.add(index, value);
        onChanged();
      } else {
        toolParameterKvMatchMetricValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolParameterKvMatchMetricValues(
        com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.Builder builderForValue) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        ensureToolParameterKvMatchMetricValuesIsMutable();
        toolParameterKvMatchMetricValues_.add(builderForValue.build());
        onChanged();
      } else {
        toolParameterKvMatchMetricValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolParameterKvMatchMetricValues(
        int index,
        com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.Builder builderForValue) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        ensureToolParameterKvMatchMetricValuesIsMutable();
        toolParameterKvMatchMetricValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        toolParameterKvMatchMetricValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAllToolParameterKvMatchMetricValues(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue>
            values) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        ensureToolParameterKvMatchMetricValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, toolParameterKvMatchMetricValues_);
        onChanged();
      } else {
        toolParameterKvMatchMetricValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearToolParameterKvMatchMetricValues() {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        toolParameterKvMatchMetricValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        toolParameterKvMatchMetricValuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeToolParameterKvMatchMetricValues(int index) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        ensureToolParameterKvMatchMetricValuesIsMutable();
        toolParameterKvMatchMetricValues_.remove(index);
        onChanged();
      } else {
        toolParameterKvMatchMetricValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.Builder
        getToolParameterKvMatchMetricValuesBuilder(int index) {
      return getToolParameterKvMatchMetricValuesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValueOrBuilder
        getToolParameterKvMatchMetricValuesOrBuilder(int index) {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        return toolParameterKvMatchMetricValues_.get(index);
      } else {
        return toolParameterKvMatchMetricValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValueOrBuilder>
        getToolParameterKvMatchMetricValuesOrBuilderList() {
      if (toolParameterKvMatchMetricValuesBuilder_ != null) {
        return toolParameterKvMatchMetricValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(toolParameterKvMatchMetricValues_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.Builder
        addToolParameterKvMatchMetricValuesBuilder() {
      return getToolParameterKvMatchMetricValuesFieldBuilder()
          .addBuilder(
              com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.Builder
        addToolParameterKvMatchMetricValuesBuilder(int index) {
      return getToolParameterKvMatchMetricValuesFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool parameter key value match metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue tool_parameter_kv_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.Builder>
        getToolParameterKvMatchMetricValuesBuilderList() {
      return getToolParameterKvMatchMetricValuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue,
            com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.Builder,
            com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValueOrBuilder>
        getToolParameterKvMatchMetricValuesFieldBuilder() {
      if (toolParameterKvMatchMetricValuesBuilder_ == null) {
        toolParameterKvMatchMetricValuesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue,
                com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValue.Builder,
                com.google.cloud.aiplatform.v1.ToolParameterKVMatchMetricValueOrBuilder>(
                toolParameterKvMatchMetricValues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        toolParameterKvMatchMetricValues_ = null;
      }
      return toolParameterKvMatchMetricValuesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ToolParameterKVMatchResults)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ToolParameterKVMatchResults)
  private static final com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults();
  }

  public static com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ToolParameterKVMatchResults> PARSER =
      new com.google.protobuf.AbstractParser<ToolParameterKVMatchResults>() {
        @java.lang.Override
        public ToolParameterKVMatchResults parsePartialFrom(
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

  public static com.google.protobuf.Parser<ToolParameterKVMatchResults> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ToolParameterKVMatchResults> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ToolParameterKVMatchResults getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
