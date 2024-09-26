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
// source: google/cloud/dialogflow/v2/generator.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The parameters of inference.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.InferenceParameter}
 */
public final class InferenceParameter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.InferenceParameter)
    InferenceParameterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InferenceParameter.newBuilder() to construct.
  private InferenceParameter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InferenceParameter() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InferenceParameter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.GeneratorProto
        .internal_static_google_cloud_dialogflow_v2_InferenceParameter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.GeneratorProto
        .internal_static_google_cloud_dialogflow_v2_InferenceParameter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.InferenceParameter.class,
            com.google.cloud.dialogflow.v2.InferenceParameter.Builder.class);
  }

  private int bitField0_;
  public static final int MAX_OUTPUT_TOKENS_FIELD_NUMBER = 1;
  private int maxOutputTokens_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Maximum number of the output tokens for the generator.
   * </pre>
   *
   * <code>optional int32 max_output_tokens = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the maxOutputTokens field is set.
   */
  @java.lang.Override
  public boolean hasMaxOutputTokens() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Maximum number of the output tokens for the generator.
   * </pre>
   *
   * <code>optional int32 max_output_tokens = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxOutputTokens.
   */
  @java.lang.Override
  public int getMaxOutputTokens() {
    return maxOutputTokens_;
  }

  public static final int TEMPERATURE_FIELD_NUMBER = 2;
  private double temperature_ = 0D;
  /**
   *
   *
   * <pre>
   * Optional. Controls the randomness of LLM predictions.
   * Low temperature = less random. High temperature = more random.
   * If unset (or 0), uses a default value of 0.
   * </pre>
   *
   * <code>optional double temperature = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the temperature field is set.
   */
  @java.lang.Override
  public boolean hasTemperature() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Controls the randomness of LLM predictions.
   * Low temperature = less random. High temperature = more random.
   * If unset (or 0), uses a default value of 0.
   * </pre>
   *
   * <code>optional double temperature = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The temperature.
   */
  @java.lang.Override
  public double getTemperature() {
    return temperature_;
  }

  public static final int TOP_K_FIELD_NUMBER = 3;
  private int topK_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Top-k changes how the model selects tokens for output. A top-k of
   * 1 means the selected token is the most probable among all tokens in the
   * model's vocabulary (also called greedy decoding), while a top-k of 3 means
   * that the next token is selected from among the 3 most probable tokens
   * (using temperature). For each token selection step, the top K tokens with
   * the highest probabilities are sampled. Then tokens are further filtered
   * based on topP with the final token selected using temperature sampling.
   * Specify a lower value for less random responses and a higher value for more
   * random responses. Acceptable value is [1, 40], default to 40.
   * </pre>
   *
   * <code>optional int32 top_k = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the topK field is set.
   */
  @java.lang.Override
  public boolean hasTopK() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Top-k changes how the model selects tokens for output. A top-k of
   * 1 means the selected token is the most probable among all tokens in the
   * model's vocabulary (also called greedy decoding), while a top-k of 3 means
   * that the next token is selected from among the 3 most probable tokens
   * (using temperature). For each token selection step, the top K tokens with
   * the highest probabilities are sampled. Then tokens are further filtered
   * based on topP with the final token selected using temperature sampling.
   * Specify a lower value for less random responses and a higher value for more
   * random responses. Acceptable value is [1, 40], default to 40.
   * </pre>
   *
   * <code>optional int32 top_k = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The topK.
   */
  @java.lang.Override
  public int getTopK() {
    return topK_;
  }

  public static final int TOP_P_FIELD_NUMBER = 4;
  private double topP_ = 0D;
  /**
   *
   *
   * <pre>
   * Optional. Top-p changes how the model selects tokens for output. Tokens are
   * selected from most K (see topK parameter) probable to least until the sum
   * of their probabilities equals the top-p value. For example, if tokens A, B,
   * and C have a probability of 0.3, 0.2, and 0.1 and the top-p value is 0.5,
   * then the model will select either A or B as the next token (using
   * temperature) and doesn't consider C. The default top-p value is 0.95.
   * Specify a lower value for less random responses and a higher value for more
   * random responses. Acceptable value is [0.0, 1.0], default to 0.95.
   * </pre>
   *
   * <code>optional double top_p = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the topP field is set.
   */
  @java.lang.Override
  public boolean hasTopP() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Top-p changes how the model selects tokens for output. Tokens are
   * selected from most K (see topK parameter) probable to least until the sum
   * of their probabilities equals the top-p value. For example, if tokens A, B,
   * and C have a probability of 0.3, 0.2, and 0.1 and the top-p value is 0.5,
   * then the model will select either A or B as the next token (using
   * temperature) and doesn't consider C. The default top-p value is 0.95.
   * Specify a lower value for less random responses and a higher value for more
   * random responses. Acceptable value is [0.0, 1.0], default to 0.95.
   * </pre>
   *
   * <code>optional double top_p = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The topP.
   */
  @java.lang.Override
  public double getTopP() {
    return topP_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, maxOutputTokens_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(2, temperature_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, topK_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeDouble(4, topP_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, maxOutputTokens_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, temperature_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, topK_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(4, topP_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.InferenceParameter)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.InferenceParameter other =
        (com.google.cloud.dialogflow.v2.InferenceParameter) obj;

    if (hasMaxOutputTokens() != other.hasMaxOutputTokens()) return false;
    if (hasMaxOutputTokens()) {
      if (getMaxOutputTokens() != other.getMaxOutputTokens()) return false;
    }
    if (hasTemperature() != other.hasTemperature()) return false;
    if (hasTemperature()) {
      if (java.lang.Double.doubleToLongBits(getTemperature())
          != java.lang.Double.doubleToLongBits(other.getTemperature())) return false;
    }
    if (hasTopK() != other.hasTopK()) return false;
    if (hasTopK()) {
      if (getTopK() != other.getTopK()) return false;
    }
    if (hasTopP() != other.hasTopP()) return false;
    if (hasTopP()) {
      if (java.lang.Double.doubleToLongBits(getTopP())
          != java.lang.Double.doubleToLongBits(other.getTopP())) return false;
    }
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
    if (hasMaxOutputTokens()) {
      hash = (37 * hash) + MAX_OUTPUT_TOKENS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxOutputTokens();
    }
    if (hasTemperature()) {
      hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getTemperature()));
    }
    if (hasTopK()) {
      hash = (37 * hash) + TOP_K_FIELD_NUMBER;
      hash = (53 * hash) + getTopK();
    }
    if (hasTopP()) {
      hash = (37 * hash) + TOP_P_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getTopP()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.InferenceParameter prototype) {
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
   * The parameters of inference.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.InferenceParameter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.InferenceParameter)
      com.google.cloud.dialogflow.v2.InferenceParameterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.GeneratorProto
          .internal_static_google_cloud_dialogflow_v2_InferenceParameter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.GeneratorProto
          .internal_static_google_cloud_dialogflow_v2_InferenceParameter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.InferenceParameter.class,
              com.google.cloud.dialogflow.v2.InferenceParameter.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.InferenceParameter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maxOutputTokens_ = 0;
      temperature_ = 0D;
      topK_ = 0;
      topP_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.GeneratorProto
          .internal_static_google_cloud_dialogflow_v2_InferenceParameter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.InferenceParameter getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.InferenceParameter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.InferenceParameter build() {
      com.google.cloud.dialogflow.v2.InferenceParameter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.InferenceParameter buildPartial() {
      com.google.cloud.dialogflow.v2.InferenceParameter result =
          new com.google.cloud.dialogflow.v2.InferenceParameter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.InferenceParameter result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxOutputTokens_ = maxOutputTokens_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.temperature_ = temperature_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.topK_ = topK_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.topP_ = topP_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.InferenceParameter) {
        return mergeFrom((com.google.cloud.dialogflow.v2.InferenceParameter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.InferenceParameter other) {
      if (other == com.google.cloud.dialogflow.v2.InferenceParameter.getDefaultInstance())
        return this;
      if (other.hasMaxOutputTokens()) {
        setMaxOutputTokens(other.getMaxOutputTokens());
      }
      if (other.hasTemperature()) {
        setTemperature(other.getTemperature());
      }
      if (other.hasTopK()) {
        setTopK(other.getTopK());
      }
      if (other.hasTopP()) {
        setTopP(other.getTopP());
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
            case 8:
              {
                maxOutputTokens_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 17:
              {
                temperature_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
            case 24:
              {
                topK_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 33:
              {
                topP_ = input.readDouble();
                bitField0_ |= 0x00000008;
                break;
              } // case 33
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

    private int maxOutputTokens_;
    /**
     *
     *
     * <pre>
     * Optional. Maximum number of the output tokens for the generator.
     * </pre>
     *
     * <code>optional int32 max_output_tokens = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the maxOutputTokens field is set.
     */
    @java.lang.Override
    public boolean hasMaxOutputTokens() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Maximum number of the output tokens for the generator.
     * </pre>
     *
     * <code>optional int32 max_output_tokens = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The maxOutputTokens.
     */
    @java.lang.Override
    public int getMaxOutputTokens() {
      return maxOutputTokens_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Maximum number of the output tokens for the generator.
     * </pre>
     *
     * <code>optional int32 max_output_tokens = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The maxOutputTokens to set.
     * @return This builder for chaining.
     */
    public Builder setMaxOutputTokens(int value) {

      maxOutputTokens_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Maximum number of the output tokens for the generator.
     * </pre>
     *
     * <code>optional int32 max_output_tokens = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxOutputTokens() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxOutputTokens_ = 0;
      onChanged();
      return this;
    }

    private double temperature_;
    /**
     *
     *
     * <pre>
     * Optional. Controls the randomness of LLM predictions.
     * Low temperature = less random. High temperature = more random.
     * If unset (or 0), uses a default value of 0.
     * </pre>
     *
     * <code>optional double temperature = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the temperature field is set.
     */
    @java.lang.Override
    public boolean hasTemperature() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Controls the randomness of LLM predictions.
     * Low temperature = less random. High temperature = more random.
     * If unset (or 0), uses a default value of 0.
     * </pre>
     *
     * <code>optional double temperature = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The temperature.
     */
    @java.lang.Override
    public double getTemperature() {
      return temperature_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Controls the randomness of LLM predictions.
     * Low temperature = less random. High temperature = more random.
     * If unset (or 0), uses a default value of 0.
     * </pre>
     *
     * <code>optional double temperature = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The temperature to set.
     * @return This builder for chaining.
     */
    public Builder setTemperature(double value) {

      temperature_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Controls the randomness of LLM predictions.
     * Low temperature = less random. High temperature = more random.
     * If unset (or 0), uses a default value of 0.
     * </pre>
     *
     * <code>optional double temperature = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTemperature() {
      bitField0_ = (bitField0_ & ~0x00000002);
      temperature_ = 0D;
      onChanged();
      return this;
    }

    private int topK_;
    /**
     *
     *
     * <pre>
     * Optional. Top-k changes how the model selects tokens for output. A top-k of
     * 1 means the selected token is the most probable among all tokens in the
     * model's vocabulary (also called greedy decoding), while a top-k of 3 means
     * that the next token is selected from among the 3 most probable tokens
     * (using temperature). For each token selection step, the top K tokens with
     * the highest probabilities are sampled. Then tokens are further filtered
     * based on topP with the final token selected using temperature sampling.
     * Specify a lower value for less random responses and a higher value for more
     * random responses. Acceptable value is [1, 40], default to 40.
     * </pre>
     *
     * <code>optional int32 top_k = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the topK field is set.
     */
    @java.lang.Override
    public boolean hasTopK() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Top-k changes how the model selects tokens for output. A top-k of
     * 1 means the selected token is the most probable among all tokens in the
     * model's vocabulary (also called greedy decoding), while a top-k of 3 means
     * that the next token is selected from among the 3 most probable tokens
     * (using temperature). For each token selection step, the top K tokens with
     * the highest probabilities are sampled. Then tokens are further filtered
     * based on topP with the final token selected using temperature sampling.
     * Specify a lower value for less random responses and a higher value for more
     * random responses. Acceptable value is [1, 40], default to 40.
     * </pre>
     *
     * <code>optional int32 top_k = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The topK.
     */
    @java.lang.Override
    public int getTopK() {
      return topK_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Top-k changes how the model selects tokens for output. A top-k of
     * 1 means the selected token is the most probable among all tokens in the
     * model's vocabulary (also called greedy decoding), while a top-k of 3 means
     * that the next token is selected from among the 3 most probable tokens
     * (using temperature). For each token selection step, the top K tokens with
     * the highest probabilities are sampled. Then tokens are further filtered
     * based on topP with the final token selected using temperature sampling.
     * Specify a lower value for less random responses and a higher value for more
     * random responses. Acceptable value is [1, 40], default to 40.
     * </pre>
     *
     * <code>optional int32 top_k = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The topK to set.
     * @return This builder for chaining.
     */
    public Builder setTopK(int value) {

      topK_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Top-k changes how the model selects tokens for output. A top-k of
     * 1 means the selected token is the most probable among all tokens in the
     * model's vocabulary (also called greedy decoding), while a top-k of 3 means
     * that the next token is selected from among the 3 most probable tokens
     * (using temperature). For each token selection step, the top K tokens with
     * the highest probabilities are sampled. Then tokens are further filtered
     * based on topP with the final token selected using temperature sampling.
     * Specify a lower value for less random responses and a higher value for more
     * random responses. Acceptable value is [1, 40], default to 40.
     * </pre>
     *
     * <code>optional int32 top_k = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTopK() {
      bitField0_ = (bitField0_ & ~0x00000004);
      topK_ = 0;
      onChanged();
      return this;
    }

    private double topP_;
    /**
     *
     *
     * <pre>
     * Optional. Top-p changes how the model selects tokens for output. Tokens are
     * selected from most K (see topK parameter) probable to least until the sum
     * of their probabilities equals the top-p value. For example, if tokens A, B,
     * and C have a probability of 0.3, 0.2, and 0.1 and the top-p value is 0.5,
     * then the model will select either A or B as the next token (using
     * temperature) and doesn't consider C. The default top-p value is 0.95.
     * Specify a lower value for less random responses and a higher value for more
     * random responses. Acceptable value is [0.0, 1.0], default to 0.95.
     * </pre>
     *
     * <code>optional double top_p = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the topP field is set.
     */
    @java.lang.Override
    public boolean hasTopP() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Top-p changes how the model selects tokens for output. Tokens are
     * selected from most K (see topK parameter) probable to least until the sum
     * of their probabilities equals the top-p value. For example, if tokens A, B,
     * and C have a probability of 0.3, 0.2, and 0.1 and the top-p value is 0.5,
     * then the model will select either A or B as the next token (using
     * temperature) and doesn't consider C. The default top-p value is 0.95.
     * Specify a lower value for less random responses and a higher value for more
     * random responses. Acceptable value is [0.0, 1.0], default to 0.95.
     * </pre>
     *
     * <code>optional double top_p = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The topP.
     */
    @java.lang.Override
    public double getTopP() {
      return topP_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Top-p changes how the model selects tokens for output. Tokens are
     * selected from most K (see topK parameter) probable to least until the sum
     * of their probabilities equals the top-p value. For example, if tokens A, B,
     * and C have a probability of 0.3, 0.2, and 0.1 and the top-p value is 0.5,
     * then the model will select either A or B as the next token (using
     * temperature) and doesn't consider C. The default top-p value is 0.95.
     * Specify a lower value for less random responses and a higher value for more
     * random responses. Acceptable value is [0.0, 1.0], default to 0.95.
     * </pre>
     *
     * <code>optional double top_p = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The topP to set.
     * @return This builder for chaining.
     */
    public Builder setTopP(double value) {

      topP_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Top-p changes how the model selects tokens for output. Tokens are
     * selected from most K (see topK parameter) probable to least until the sum
     * of their probabilities equals the top-p value. For example, if tokens A, B,
     * and C have a probability of 0.3, 0.2, and 0.1 and the top-p value is 0.5,
     * then the model will select either A or B as the next token (using
     * temperature) and doesn't consider C. The default top-p value is 0.95.
     * Specify a lower value for less random responses and a higher value for more
     * random responses. Acceptable value is [0.0, 1.0], default to 0.95.
     * </pre>
     *
     * <code>optional double top_p = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTopP() {
      bitField0_ = (bitField0_ & ~0x00000008);
      topP_ = 0D;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.InferenceParameter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.InferenceParameter)
  private static final com.google.cloud.dialogflow.v2.InferenceParameter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.InferenceParameter();
  }

  public static com.google.cloud.dialogflow.v2.InferenceParameter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InferenceParameter> PARSER =
      new com.google.protobuf.AbstractParser<InferenceParameter>() {
        @java.lang.Override
        public InferenceParameter parsePartialFrom(
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

  public static com.google.protobuf.Parser<InferenceParameter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InferenceParameter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.InferenceParameter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
