// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

/**
 *
 *
 * <pre>
 * *Optional* Config to enable speaker diarization.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig}
 */
public final class SpeakerDiarizationConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig)
    SpeakerDiarizationConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SpeakerDiarizationConfig.newBuilder() to construct.
  private SpeakerDiarizationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SpeakerDiarizationConfig() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SpeakerDiarizationConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              enableSpeakerDiarization_ = input.readBool();
              break;
            }
          case 16:
            {
              minSpeakerCount_ = input.readInt32();
              break;
            }
          case 24:
            {
              maxSpeakerCount_ = input.readInt32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v1p1beta1.SpeechProto
        .internal_static_google_cloud_speech_v1p1beta1_SpeakerDiarizationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1p1beta1.SpeechProto
        .internal_static_google_cloud_speech_v1p1beta1_SpeakerDiarizationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig.class,
            com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig.Builder.class);
  }

  public static final int ENABLE_SPEAKER_DIARIZATION_FIELD_NUMBER = 1;
  private boolean enableSpeakerDiarization_;
  /**
   *
   *
   * <pre>
   * *Optional* If 'true', enables speaker detection for each recognized word in
   * the top alternative of the recognition result using a speaker_tag provided
   * in the WordInfo.
   * </pre>
   *
   * <code>bool enable_speaker_diarization = 1;</code>
   */
  public boolean getEnableSpeakerDiarization() {
    return enableSpeakerDiarization_;
  }

  public static final int MIN_SPEAKER_COUNT_FIELD_NUMBER = 2;
  private int minSpeakerCount_;
  /**
   *
   *
   * <pre>
   * *Optional*
   * Minimum number of speakers in the conversation. This range gives you more
   * flexibility by allowing the system to automatically determine the correct
   * number of speakers. If not set, the default value is 2.
   * </pre>
   *
   * <code>int32 min_speaker_count = 2;</code>
   */
  public int getMinSpeakerCount() {
    return minSpeakerCount_;
  }

  public static final int MAX_SPEAKER_COUNT_FIELD_NUMBER = 3;
  private int maxSpeakerCount_;
  /**
   *
   *
   * <pre>
   * *Optional*
   * Maximum number of speakers in the conversation. This range gives you more
   * flexibility by allowing the system to automatically determine the correct
   * number of speakers. If not set, the default value is 6.
   * </pre>
   *
   * <code>int32 max_speaker_count = 3;</code>
   */
  public int getMaxSpeakerCount() {
    return maxSpeakerCount_;
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
    if (enableSpeakerDiarization_ != false) {
      output.writeBool(1, enableSpeakerDiarization_);
    }
    if (minSpeakerCount_ != 0) {
      output.writeInt32(2, minSpeakerCount_);
    }
    if (maxSpeakerCount_ != 0) {
      output.writeInt32(3, maxSpeakerCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableSpeakerDiarization_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enableSpeakerDiarization_);
    }
    if (minSpeakerCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, minSpeakerCount_);
    }
    if (maxSpeakerCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, maxSpeakerCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig other =
        (com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig) obj;

    if (getEnableSpeakerDiarization() != other.getEnableSpeakerDiarization()) return false;
    if (getMinSpeakerCount() != other.getMinSpeakerCount()) return false;
    if (getMaxSpeakerCount() != other.getMaxSpeakerCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ENABLE_SPEAKER_DIARIZATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableSpeakerDiarization());
    hash = (37 * hash) + MIN_SPEAKER_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMinSpeakerCount();
    hash = (37 * hash) + MAX_SPEAKER_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxSpeakerCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parseFrom(
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
      com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig prototype) {
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
   * *Optional* Config to enable speaker diarization.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig)
      com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_SpeakerDiarizationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_SpeakerDiarizationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig.class,
              com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      enableSpeakerDiarization_ = false;

      minSpeakerCount_ = 0;

      maxSpeakerCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_SpeakerDiarizationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig getDefaultInstanceForType() {
      return com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig build() {
      com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig buildPartial() {
      com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig result =
          new com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig(this);
      result.enableSpeakerDiarization_ = enableSpeakerDiarization_;
      result.minSpeakerCount_ = minSpeakerCount_;
      result.maxSpeakerCount_ = maxSpeakerCount_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig) {
        return mergeFrom((com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig other) {
      if (other == com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig.getDefaultInstance())
        return this;
      if (other.getEnableSpeakerDiarization() != false) {
        setEnableSpeakerDiarization(other.getEnableSpeakerDiarization());
      }
      if (other.getMinSpeakerCount() != 0) {
        setMinSpeakerCount(other.getMinSpeakerCount());
      }
      if (other.getMaxSpeakerCount() != 0) {
        setMaxSpeakerCount(other.getMaxSpeakerCount());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableSpeakerDiarization_;
    /**
     *
     *
     * <pre>
     * *Optional* If 'true', enables speaker detection for each recognized word in
     * the top alternative of the recognition result using a speaker_tag provided
     * in the WordInfo.
     * </pre>
     *
     * <code>bool enable_speaker_diarization = 1;</code>
     */
    public boolean getEnableSpeakerDiarization() {
      return enableSpeakerDiarization_;
    }
    /**
     *
     *
     * <pre>
     * *Optional* If 'true', enables speaker detection for each recognized word in
     * the top alternative of the recognition result using a speaker_tag provided
     * in the WordInfo.
     * </pre>
     *
     * <code>bool enable_speaker_diarization = 1;</code>
     */
    public Builder setEnableSpeakerDiarization(boolean value) {

      enableSpeakerDiarization_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * *Optional* If 'true', enables speaker detection for each recognized word in
     * the top alternative of the recognition result using a speaker_tag provided
     * in the WordInfo.
     * </pre>
     *
     * <code>bool enable_speaker_diarization = 1;</code>
     */
    public Builder clearEnableSpeakerDiarization() {

      enableSpeakerDiarization_ = false;
      onChanged();
      return this;
    }

    private int minSpeakerCount_;
    /**
     *
     *
     * <pre>
     * *Optional*
     * Minimum number of speakers in the conversation. This range gives you more
     * flexibility by allowing the system to automatically determine the correct
     * number of speakers. If not set, the default value is 2.
     * </pre>
     *
     * <code>int32 min_speaker_count = 2;</code>
     */
    public int getMinSpeakerCount() {
      return minSpeakerCount_;
    }
    /**
     *
     *
     * <pre>
     * *Optional*
     * Minimum number of speakers in the conversation. This range gives you more
     * flexibility by allowing the system to automatically determine the correct
     * number of speakers. If not set, the default value is 2.
     * </pre>
     *
     * <code>int32 min_speaker_count = 2;</code>
     */
    public Builder setMinSpeakerCount(int value) {

      minSpeakerCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * *Optional*
     * Minimum number of speakers in the conversation. This range gives you more
     * flexibility by allowing the system to automatically determine the correct
     * number of speakers. If not set, the default value is 2.
     * </pre>
     *
     * <code>int32 min_speaker_count = 2;</code>
     */
    public Builder clearMinSpeakerCount() {

      minSpeakerCount_ = 0;
      onChanged();
      return this;
    }

    private int maxSpeakerCount_;
    /**
     *
     *
     * <pre>
     * *Optional*
     * Maximum number of speakers in the conversation. This range gives you more
     * flexibility by allowing the system to automatically determine the correct
     * number of speakers. If not set, the default value is 6.
     * </pre>
     *
     * <code>int32 max_speaker_count = 3;</code>
     */
    public int getMaxSpeakerCount() {
      return maxSpeakerCount_;
    }
    /**
     *
     *
     * <pre>
     * *Optional*
     * Maximum number of speakers in the conversation. This range gives you more
     * flexibility by allowing the system to automatically determine the correct
     * number of speakers. If not set, the default value is 6.
     * </pre>
     *
     * <code>int32 max_speaker_count = 3;</code>
     */
    public Builder setMaxSpeakerCount(int value) {

      maxSpeakerCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * *Optional*
     * Maximum number of speakers in the conversation. This range gives you more
     * flexibility by allowing the system to automatically determine the correct
     * number of speakers. If not set, the default value is 6.
     * </pre>
     *
     * <code>int32 max_speaker_count = 3;</code>
     */
    public Builder clearMaxSpeakerCount() {

      maxSpeakerCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig)
  private static final com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig();
  }

  public static com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeakerDiarizationConfig> PARSER =
      new com.google.protobuf.AbstractParser<SpeakerDiarizationConfig>() {
        @java.lang.Override
        public SpeakerDiarizationConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SpeakerDiarizationConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SpeakerDiarizationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeakerDiarizationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
