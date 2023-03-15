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
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

/**
 *
 *
 * <pre>
 * Information on speech adaptation use in results
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1.SpeechAdaptationInfo}
 */
public final class SpeechAdaptationInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1.SpeechAdaptationInfo)
    SpeechAdaptationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SpeechAdaptationInfo.newBuilder() to construct.
  private SpeechAdaptationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SpeechAdaptationInfo() {
    timeoutMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SpeechAdaptationInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v1.SpeechProto
        .internal_static_google_cloud_speech_v1_SpeechAdaptationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1.SpeechProto
        .internal_static_google_cloud_speech_v1_SpeechAdaptationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1.SpeechAdaptationInfo.class,
            com.google.cloud.speech.v1.SpeechAdaptationInfo.Builder.class);
  }

  public static final int ADAPTATION_TIMEOUT_FIELD_NUMBER = 1;
  private boolean adaptationTimeout_ = false;
  /**
   *
   *
   * <pre>
   * Whether there was a timeout when applying speech adaptation. If true,
   * adaptation had no effect in the response transcript.
   * </pre>
   *
   * <code>bool adaptation_timeout = 1;</code>
   *
   * @return The adaptationTimeout.
   */
  @java.lang.Override
  public boolean getAdaptationTimeout() {
    return adaptationTimeout_;
  }

  public static final int TIMEOUT_MESSAGE_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object timeoutMessage_ = "";
  /**
   *
   *
   * <pre>
   * If set, returns a message specifying which part of the speech adaptation
   * request timed out.
   * </pre>
   *
   * <code>string timeout_message = 4;</code>
   *
   * @return The timeoutMessage.
   */
  @java.lang.Override
  public java.lang.String getTimeoutMessage() {
    java.lang.Object ref = timeoutMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timeoutMessage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If set, returns a message specifying which part of the speech adaptation
   * request timed out.
   * </pre>
   *
   * <code>string timeout_message = 4;</code>
   *
   * @return The bytes for timeoutMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTimeoutMessageBytes() {
    java.lang.Object ref = timeoutMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      timeoutMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (adaptationTimeout_ != false) {
      output.writeBool(1, adaptationTimeout_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeoutMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, timeoutMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adaptationTimeout_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, adaptationTimeout_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeoutMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, timeoutMessage_);
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
    if (!(obj instanceof com.google.cloud.speech.v1.SpeechAdaptationInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1.SpeechAdaptationInfo other =
        (com.google.cloud.speech.v1.SpeechAdaptationInfo) obj;

    if (getAdaptationTimeout() != other.getAdaptationTimeout()) return false;
    if (!getTimeoutMessage().equals(other.getTimeoutMessage())) return false;
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
    hash = (37 * hash) + ADAPTATION_TIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAdaptationTimeout());
    hash = (37 * hash) + TIMEOUT_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getTimeoutMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.speech.v1.SpeechAdaptationInfo prototype) {
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
   * Information on speech adaptation use in results
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1.SpeechAdaptationInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1.SpeechAdaptationInfo)
      com.google.cloud.speech.v1.SpeechAdaptationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_SpeechAdaptationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_SpeechAdaptationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1.SpeechAdaptationInfo.class,
              com.google.cloud.speech.v1.SpeechAdaptationInfo.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1.SpeechAdaptationInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      adaptationTimeout_ = false;
      timeoutMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_SpeechAdaptationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.SpeechAdaptationInfo getDefaultInstanceForType() {
      return com.google.cloud.speech.v1.SpeechAdaptationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.SpeechAdaptationInfo build() {
      com.google.cloud.speech.v1.SpeechAdaptationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.SpeechAdaptationInfo buildPartial() {
      com.google.cloud.speech.v1.SpeechAdaptationInfo result =
          new com.google.cloud.speech.v1.SpeechAdaptationInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v1.SpeechAdaptationInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.adaptationTimeout_ = adaptationTimeout_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeoutMessage_ = timeoutMessage_;
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
      if (other instanceof com.google.cloud.speech.v1.SpeechAdaptationInfo) {
        return mergeFrom((com.google.cloud.speech.v1.SpeechAdaptationInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1.SpeechAdaptationInfo other) {
      if (other == com.google.cloud.speech.v1.SpeechAdaptationInfo.getDefaultInstance())
        return this;
      if (other.getAdaptationTimeout() != false) {
        setAdaptationTimeout(other.getAdaptationTimeout());
      }
      if (!other.getTimeoutMessage().isEmpty()) {
        timeoutMessage_ = other.timeoutMessage_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                adaptationTimeout_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 34:
              {
                timeoutMessage_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 34
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

    private boolean adaptationTimeout_;
    /**
     *
     *
     * <pre>
     * Whether there was a timeout when applying speech adaptation. If true,
     * adaptation had no effect in the response transcript.
     * </pre>
     *
     * <code>bool adaptation_timeout = 1;</code>
     *
     * @return The adaptationTimeout.
     */
    @java.lang.Override
    public boolean getAdaptationTimeout() {
      return adaptationTimeout_;
    }
    /**
     *
     *
     * <pre>
     * Whether there was a timeout when applying speech adaptation. If true,
     * adaptation had no effect in the response transcript.
     * </pre>
     *
     * <code>bool adaptation_timeout = 1;</code>
     *
     * @param value The adaptationTimeout to set.
     * @return This builder for chaining.
     */
    public Builder setAdaptationTimeout(boolean value) {

      adaptationTimeout_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether there was a timeout when applying speech adaptation. If true,
     * adaptation had no effect in the response transcript.
     * </pre>
     *
     * <code>bool adaptation_timeout = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAdaptationTimeout() {
      bitField0_ = (bitField0_ & ~0x00000001);
      adaptationTimeout_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object timeoutMessage_ = "";
    /**
     *
     *
     * <pre>
     * If set, returns a message specifying which part of the speech adaptation
     * request timed out.
     * </pre>
     *
     * <code>string timeout_message = 4;</code>
     *
     * @return The timeoutMessage.
     */
    public java.lang.String getTimeoutMessage() {
      java.lang.Object ref = timeoutMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeoutMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If set, returns a message specifying which part of the speech adaptation
     * request timed out.
     * </pre>
     *
     * <code>string timeout_message = 4;</code>
     *
     * @return The bytes for timeoutMessage.
     */
    public com.google.protobuf.ByteString getTimeoutMessageBytes() {
      java.lang.Object ref = timeoutMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        timeoutMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If set, returns a message specifying which part of the speech adaptation
     * request timed out.
     * </pre>
     *
     * <code>string timeout_message = 4;</code>
     *
     * @param value The timeoutMessage to set.
     * @return This builder for chaining.
     */
    public Builder setTimeoutMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      timeoutMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, returns a message specifying which part of the speech adaptation
     * request timed out.
     * </pre>
     *
     * <code>string timeout_message = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimeoutMessage() {
      timeoutMessage_ = getDefaultInstance().getTimeoutMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, returns a message specifying which part of the speech adaptation
     * request timed out.
     * </pre>
     *
     * <code>string timeout_message = 4;</code>
     *
     * @param value The bytes for timeoutMessage to set.
     * @return This builder for chaining.
     */
    public Builder setTimeoutMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      timeoutMessage_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1.SpeechAdaptationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1.SpeechAdaptationInfo)
  private static final com.google.cloud.speech.v1.SpeechAdaptationInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1.SpeechAdaptationInfo();
  }

  public static com.google.cloud.speech.v1.SpeechAdaptationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeechAdaptationInfo> PARSER =
      new com.google.protobuf.AbstractParser<SpeechAdaptationInfo>() {
        @java.lang.Override
        public SpeechAdaptationInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<SpeechAdaptationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechAdaptationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1.SpeechAdaptationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
