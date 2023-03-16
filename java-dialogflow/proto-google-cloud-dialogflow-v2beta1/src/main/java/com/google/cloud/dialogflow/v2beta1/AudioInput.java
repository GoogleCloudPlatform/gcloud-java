/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * Represents the natural language speech audio to be processed.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.AudioInput}
 */
public final class AudioInput extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.AudioInput)
    AudioInputOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AudioInput.newBuilder() to construct.
  private AudioInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AudioInput() {
    audio_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AudioInput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2beta1_AudioInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2beta1_AudioInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.AudioInput.class,
            com.google.cloud.dialogflow.v2beta1.AudioInput.Builder.class);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2beta1.InputAudioConfig config_;
  /**
   *
   *
   * <pre>
   * Required. Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
   *
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
   *
   * @return The config.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.InputAudioConfig getConfig() {
    return config_ == null
        ? com.google.cloud.dialogflow.v2beta1.InputAudioConfig.getDefaultInstance()
        : config_;
  }
  /**
   *
   *
   * <pre>
   * Required. Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.InputAudioConfigOrBuilder getConfigOrBuilder() {
    return config_ == null
        ? com.google.cloud.dialogflow.v2beta1.InputAudioConfig.getDefaultInstance()
        : config_;
  }

  public static final int AUDIO_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString audio_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Required. The natural language speech audio to be processed.
   * A single request can contain up to 1 minute of speech audio data.
   * The transcribed text cannot contain more than 256 bytes for virtual agent
   * interactions.
   * </pre>
   *
   * <code>bytes audio = 2;</code>
   *
   * @return The audio.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAudio() {
    return audio_;
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
    if (config_ != null) {
      output.writeMessage(1, getConfig());
    }
    if (!audio_.isEmpty()) {
      output.writeBytes(2, audio_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getConfig());
    }
    if (!audio_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, audio_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.AudioInput)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.AudioInput other =
        (com.google.cloud.dialogflow.v2beta1.AudioInput) obj;

    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig().equals(other.getConfig())) return false;
    }
    if (!getAudio().equals(other.getAudio())) return false;
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
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (37 * hash) + AUDIO_FIELD_NUMBER;
    hash = (53 * hash) + getAudio().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.AudioInput prototype) {
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
   * Represents the natural language speech audio to be processed.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.AudioInput}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.AudioInput)
      com.google.cloud.dialogflow.v2beta1.AudioInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_AudioInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_AudioInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.AudioInput.class,
              com.google.cloud.dialogflow.v2beta1.AudioInput.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.AudioInput.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      audio_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_AudioInput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.AudioInput getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.AudioInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.AudioInput build() {
      com.google.cloud.dialogflow.v2beta1.AudioInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.AudioInput buildPartial() {
      com.google.cloud.dialogflow.v2beta1.AudioInput result =
          new com.google.cloud.dialogflow.v2beta1.AudioInput(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.AudioInput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.config_ = configBuilder_ == null ? config_ : configBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.audio_ = audio_;
      }
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.AudioInput) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.AudioInput) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.AudioInput other) {
      if (other == com.google.cloud.dialogflow.v2beta1.AudioInput.getDefaultInstance()) return this;
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      if (other.getAudio() != com.google.protobuf.ByteString.EMPTY) {
        setAudio(other.getAudio());
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
                input.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                audio_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.cloud.dialogflow.v2beta1.InputAudioConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.InputAudioConfig,
            com.google.cloud.dialogflow.v2beta1.InputAudioConfig.Builder,
            com.google.cloud.dialogflow.v2beta1.InputAudioConfigOrBuilder>
        configBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Instructs the speech recognizer how to process the speech audio.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
     *
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Instructs the speech recognizer how to process the speech audio.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
     *
     * @return The config.
     */
    public com.google.cloud.dialogflow.v2beta1.InputAudioConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null
            ? com.google.cloud.dialogflow.v2beta1.InputAudioConfig.getDefaultInstance()
            : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Instructs the speech recognizer how to process the speech audio.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
     */
    public Builder setConfig(com.google.cloud.dialogflow.v2beta1.InputAudioConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
      } else {
        configBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Instructs the speech recognizer how to process the speech audio.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
     */
    public Builder setConfig(
        com.google.cloud.dialogflow.v2beta1.InputAudioConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Instructs the speech recognizer how to process the speech audio.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
     */
    public Builder mergeConfig(com.google.cloud.dialogflow.v2beta1.InputAudioConfig value) {
      if (configBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && config_ != null
            && config_
                != com.google.cloud.dialogflow.v2beta1.InputAudioConfig.getDefaultInstance()) {
          getConfigBuilder().mergeFrom(value);
        } else {
          config_ = value;
        }
      } else {
        configBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Instructs the speech recognizer how to process the speech audio.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
     */
    public Builder clearConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Instructs the speech recognizer how to process the speech audio.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.InputAudioConfig.Builder getConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Instructs the speech recognizer how to process the speech audio.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.InputAudioConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null
            ? com.google.cloud.dialogflow.v2beta1.InputAudioConfig.getDefaultInstance()
            : config_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Instructs the speech recognizer how to process the speech audio.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.InputAudioConfig,
            com.google.cloud.dialogflow.v2beta1.InputAudioConfig.Builder,
            com.google.cloud.dialogflow.v2beta1.InputAudioConfigOrBuilder>
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2beta1.InputAudioConfig,
                com.google.cloud.dialogflow.v2beta1.InputAudioConfig.Builder,
                com.google.cloud.dialogflow.v2beta1.InputAudioConfigOrBuilder>(
                getConfig(), getParentForChildren(), isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private com.google.protobuf.ByteString audio_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Required. The natural language speech audio to be processed.
     * A single request can contain up to 1 minute of speech audio data.
     * The transcribed text cannot contain more than 256 bytes for virtual agent
     * interactions.
     * </pre>
     *
     * <code>bytes audio = 2;</code>
     *
     * @return The audio.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAudio() {
      return audio_;
    }
    /**
     *
     *
     * <pre>
     * Required. The natural language speech audio to be processed.
     * A single request can contain up to 1 minute of speech audio data.
     * The transcribed text cannot contain more than 256 bytes for virtual agent
     * interactions.
     * </pre>
     *
     * <code>bytes audio = 2;</code>
     *
     * @param value The audio to set.
     * @return This builder for chaining.
     */
    public Builder setAudio(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      audio_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The natural language speech audio to be processed.
     * A single request can contain up to 1 minute of speech audio data.
     * The transcribed text cannot contain more than 256 bytes for virtual agent
     * interactions.
     * </pre>
     *
     * <code>bytes audio = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAudio() {
      bitField0_ = (bitField0_ & ~0x00000002);
      audio_ = getDefaultInstance().getAudio();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.AudioInput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.AudioInput)
  private static final com.google.cloud.dialogflow.v2beta1.AudioInput DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.AudioInput();
  }

  public static com.google.cloud.dialogflow.v2beta1.AudioInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudioInput> PARSER =
      new com.google.protobuf.AbstractParser<AudioInput>() {
        @java.lang.Override
        public AudioInput parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudioInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudioInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.AudioInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
