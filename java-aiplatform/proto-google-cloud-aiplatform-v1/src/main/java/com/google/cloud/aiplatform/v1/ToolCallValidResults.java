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
 * Results for tool call valid metric.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ToolCallValidResults}
 */
public final class ToolCallValidResults extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ToolCallValidResults)
    ToolCallValidResultsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ToolCallValidResults.newBuilder() to construct.
  private ToolCallValidResults(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ToolCallValidResults() {
    toolCallValidMetricValues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ToolCallValidResults();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1_ToolCallValidResults_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1_ToolCallValidResults_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ToolCallValidResults.class,
            com.google.cloud.aiplatform.v1.ToolCallValidResults.Builder.class);
  }

  public static final int TOOL_CALL_VALID_METRIC_VALUES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.ToolCallValidMetricValue>
      toolCallValidMetricValues_;
  /**
   *
   *
   * <pre>
   * Output only. Tool call valid metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.ToolCallValidMetricValue>
      getToolCallValidMetricValuesList() {
    return toolCallValidMetricValues_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool call valid metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.ToolCallValidMetricValueOrBuilder>
      getToolCallValidMetricValuesOrBuilderList() {
    return toolCallValidMetricValues_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool call valid metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public int getToolCallValidMetricValuesCount() {
    return toolCallValidMetricValues_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool call valid metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ToolCallValidMetricValue getToolCallValidMetricValues(
      int index) {
    return toolCallValidMetricValues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. Tool call valid metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ToolCallValidMetricValueOrBuilder
      getToolCallValidMetricValuesOrBuilder(int index) {
    return toolCallValidMetricValues_.get(index);
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
    for (int i = 0; i < toolCallValidMetricValues_.size(); i++) {
      output.writeMessage(1, toolCallValidMetricValues_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < toolCallValidMetricValues_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, toolCallValidMetricValues_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ToolCallValidResults)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ToolCallValidResults other =
        (com.google.cloud.aiplatform.v1.ToolCallValidResults) obj;

    if (!getToolCallValidMetricValuesList().equals(other.getToolCallValidMetricValuesList()))
      return false;
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
    if (getToolCallValidMetricValuesCount() > 0) {
      hash = (37 * hash) + TOOL_CALL_VALID_METRIC_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getToolCallValidMetricValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ToolCallValidResults prototype) {
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
   * Results for tool call valid metric.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ToolCallValidResults}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ToolCallValidResults)
      com.google.cloud.aiplatform.v1.ToolCallValidResultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_ToolCallValidResults_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_ToolCallValidResults_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ToolCallValidResults.class,
              com.google.cloud.aiplatform.v1.ToolCallValidResults.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ToolCallValidResults.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (toolCallValidMetricValuesBuilder_ == null) {
        toolCallValidMetricValues_ = java.util.Collections.emptyList();
      } else {
        toolCallValidMetricValues_ = null;
        toolCallValidMetricValuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_ToolCallValidResults_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ToolCallValidResults getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ToolCallValidResults.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ToolCallValidResults build() {
      com.google.cloud.aiplatform.v1.ToolCallValidResults result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ToolCallValidResults buildPartial() {
      com.google.cloud.aiplatform.v1.ToolCallValidResults result =
          new com.google.cloud.aiplatform.v1.ToolCallValidResults(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1.ToolCallValidResults result) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          toolCallValidMetricValues_ =
              java.util.Collections.unmodifiableList(toolCallValidMetricValues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.toolCallValidMetricValues_ = toolCallValidMetricValues_;
      } else {
        result.toolCallValidMetricValues_ = toolCallValidMetricValuesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ToolCallValidResults result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1.ToolCallValidResults) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ToolCallValidResults) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ToolCallValidResults other) {
      if (other == com.google.cloud.aiplatform.v1.ToolCallValidResults.getDefaultInstance())
        return this;
      if (toolCallValidMetricValuesBuilder_ == null) {
        if (!other.toolCallValidMetricValues_.isEmpty()) {
          if (toolCallValidMetricValues_.isEmpty()) {
            toolCallValidMetricValues_ = other.toolCallValidMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureToolCallValidMetricValuesIsMutable();
            toolCallValidMetricValues_.addAll(other.toolCallValidMetricValues_);
          }
          onChanged();
        }
      } else {
        if (!other.toolCallValidMetricValues_.isEmpty()) {
          if (toolCallValidMetricValuesBuilder_.isEmpty()) {
            toolCallValidMetricValuesBuilder_.dispose();
            toolCallValidMetricValuesBuilder_ = null;
            toolCallValidMetricValues_ = other.toolCallValidMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            toolCallValidMetricValuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getToolCallValidMetricValuesFieldBuilder()
                    : null;
          } else {
            toolCallValidMetricValuesBuilder_.addAllMessages(other.toolCallValidMetricValues_);
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
                com.google.cloud.aiplatform.v1.ToolCallValidMetricValue m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.parser(),
                        extensionRegistry);
                if (toolCallValidMetricValuesBuilder_ == null) {
                  ensureToolCallValidMetricValuesIsMutable();
                  toolCallValidMetricValues_.add(m);
                } else {
                  toolCallValidMetricValuesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1.ToolCallValidMetricValue>
        toolCallValidMetricValues_ = java.util.Collections.emptyList();

    private void ensureToolCallValidMetricValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        toolCallValidMetricValues_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1.ToolCallValidMetricValue>(
                toolCallValidMetricValues_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ToolCallValidMetricValue,
            com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.Builder,
            com.google.cloud.aiplatform.v1.ToolCallValidMetricValueOrBuilder>
        toolCallValidMetricValuesBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.ToolCallValidMetricValue>
        getToolCallValidMetricValuesList() {
      if (toolCallValidMetricValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(toolCallValidMetricValues_);
      } else {
        return toolCallValidMetricValuesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getToolCallValidMetricValuesCount() {
      if (toolCallValidMetricValuesBuilder_ == null) {
        return toolCallValidMetricValues_.size();
      } else {
        return toolCallValidMetricValuesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ToolCallValidMetricValue getToolCallValidMetricValues(
        int index) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        return toolCallValidMetricValues_.get(index);
      } else {
        return toolCallValidMetricValuesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setToolCallValidMetricValues(
        int index, com.google.cloud.aiplatform.v1.ToolCallValidMetricValue value) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToolCallValidMetricValuesIsMutable();
        toolCallValidMetricValues_.set(index, value);
        onChanged();
      } else {
        toolCallValidMetricValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setToolCallValidMetricValues(
        int index,
        com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.Builder builderForValue) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        ensureToolCallValidMetricValuesIsMutable();
        toolCallValidMetricValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        toolCallValidMetricValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolCallValidMetricValues(
        com.google.cloud.aiplatform.v1.ToolCallValidMetricValue value) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToolCallValidMetricValuesIsMutable();
        toolCallValidMetricValues_.add(value);
        onChanged();
      } else {
        toolCallValidMetricValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolCallValidMetricValues(
        int index, com.google.cloud.aiplatform.v1.ToolCallValidMetricValue value) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToolCallValidMetricValuesIsMutable();
        toolCallValidMetricValues_.add(index, value);
        onChanged();
      } else {
        toolCallValidMetricValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolCallValidMetricValues(
        com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.Builder builderForValue) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        ensureToolCallValidMetricValuesIsMutable();
        toolCallValidMetricValues_.add(builderForValue.build());
        onChanged();
      } else {
        toolCallValidMetricValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addToolCallValidMetricValues(
        int index,
        com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.Builder builderForValue) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        ensureToolCallValidMetricValuesIsMutable();
        toolCallValidMetricValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        toolCallValidMetricValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAllToolCallValidMetricValues(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.ToolCallValidMetricValue>
            values) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        ensureToolCallValidMetricValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, toolCallValidMetricValues_);
        onChanged();
      } else {
        toolCallValidMetricValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearToolCallValidMetricValues() {
      if (toolCallValidMetricValuesBuilder_ == null) {
        toolCallValidMetricValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        toolCallValidMetricValuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeToolCallValidMetricValues(int index) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        ensureToolCallValidMetricValuesIsMutable();
        toolCallValidMetricValues_.remove(index);
        onChanged();
      } else {
        toolCallValidMetricValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.Builder
        getToolCallValidMetricValuesBuilder(int index) {
      return getToolCallValidMetricValuesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ToolCallValidMetricValueOrBuilder
        getToolCallValidMetricValuesOrBuilder(int index) {
      if (toolCallValidMetricValuesBuilder_ == null) {
        return toolCallValidMetricValues_.get(index);
      } else {
        return toolCallValidMetricValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.aiplatform.v1.ToolCallValidMetricValueOrBuilder>
        getToolCallValidMetricValuesOrBuilderList() {
      if (toolCallValidMetricValuesBuilder_ != null) {
        return toolCallValidMetricValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(toolCallValidMetricValues_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.Builder
        addToolCallValidMetricValuesBuilder() {
      return getToolCallValidMetricValuesFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.Builder
        addToolCallValidMetricValuesBuilder(int index) {
      return getToolCallValidMetricValuesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. Tool call valid metric values.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1.ToolCallValidMetricValue tool_call_valid_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.Builder>
        getToolCallValidMetricValuesBuilderList() {
      return getToolCallValidMetricValuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ToolCallValidMetricValue,
            com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.Builder,
            com.google.cloud.aiplatform.v1.ToolCallValidMetricValueOrBuilder>
        getToolCallValidMetricValuesFieldBuilder() {
      if (toolCallValidMetricValuesBuilder_ == null) {
        toolCallValidMetricValuesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.ToolCallValidMetricValue,
                com.google.cloud.aiplatform.v1.ToolCallValidMetricValue.Builder,
                com.google.cloud.aiplatform.v1.ToolCallValidMetricValueOrBuilder>(
                toolCallValidMetricValues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        toolCallValidMetricValues_ = null;
      }
      return toolCallValidMetricValuesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ToolCallValidResults)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ToolCallValidResults)
  private static final com.google.cloud.aiplatform.v1.ToolCallValidResults DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ToolCallValidResults();
  }

  public static com.google.cloud.aiplatform.v1.ToolCallValidResults getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ToolCallValidResults> PARSER =
      new com.google.protobuf.AbstractParser<ToolCallValidResults>() {
        @java.lang.Override
        public ToolCallValidResults parsePartialFrom(
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

  public static com.google.protobuf.Parser<ToolCallValidResults> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ToolCallValidResults> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ToolCallValidResults getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
