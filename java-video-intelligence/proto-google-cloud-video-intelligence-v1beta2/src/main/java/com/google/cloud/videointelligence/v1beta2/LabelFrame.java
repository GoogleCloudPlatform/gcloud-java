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
// source: google/cloud/videointelligence/v1beta2/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta2;

/**
 *
 *
 * <pre>
 * Video frame level annotation results for label detection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1beta2.LabelFrame}
 */
public final class LabelFrame extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1beta2.LabelFrame)
    LabelFrameOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LabelFrame.newBuilder() to construct.
  private LabelFrame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LabelFrame() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LabelFrame();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1beta2_LabelFrame_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1beta2_LabelFrame_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1beta2.LabelFrame.class,
            com.google.cloud.videointelligence.v1beta2.LabelFrame.Builder.class);
  }

  public static final int TIME_OFFSET_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration timeOffset_;
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   *
   * @return Whether the timeOffset field is set.
   */
  @java.lang.Override
  public boolean hasTimeOffset() {
    return timeOffset_ != null;
  }
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   *
   * @return The timeOffset.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTimeOffset() {
    return timeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeOffset_;
  }
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
    return timeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeOffset_;
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private float confidence_ = 0F;
  /**
   *
   *
   * <pre>
   * Confidence that the label is accurate. Range: [0, 1].
   * </pre>
   *
   * <code>float confidence = 2;</code>
   *
   * @return The confidence.
   */
  @java.lang.Override
  public float getConfidence() {
    return confidence_;
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
    if (timeOffset_ != null) {
      output.writeMessage(1, getTimeOffset());
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      output.writeFloat(2, confidence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeOffset_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTimeOffset());
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, confidence_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1beta2.LabelFrame)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1beta2.LabelFrame other =
        (com.google.cloud.videointelligence.v1beta2.LabelFrame) obj;

    if (hasTimeOffset() != other.hasTimeOffset()) return false;
    if (hasTimeOffset()) {
      if (!getTimeOffset().equals(other.getTimeOffset())) return false;
    }
    if (java.lang.Float.floatToIntBits(getConfidence())
        != java.lang.Float.floatToIntBits(other.getConfidence())) return false;
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
    if (hasTimeOffset()) {
      hash = (37 * hash) + TIME_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getTimeOffset().hashCode();
    }
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame parseFrom(
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
      com.google.cloud.videointelligence.v1beta2.LabelFrame prototype) {
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
   * Video frame level annotation results for label detection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1beta2.LabelFrame}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1beta2.LabelFrame)
      com.google.cloud.videointelligence.v1beta2.LabelFrameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta2_LabelFrame_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta2_LabelFrame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1beta2.LabelFrame.class,
              com.google.cloud.videointelligence.v1beta2.LabelFrame.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1beta2.LabelFrame.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      timeOffset_ = null;
      if (timeOffsetBuilder_ != null) {
        timeOffsetBuilder_.dispose();
        timeOffsetBuilder_ = null;
      }
      confidence_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta2_LabelFrame_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.LabelFrame getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1beta2.LabelFrame.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.LabelFrame build() {
      com.google.cloud.videointelligence.v1beta2.LabelFrame result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.LabelFrame buildPartial() {
      com.google.cloud.videointelligence.v1beta2.LabelFrame result =
          new com.google.cloud.videointelligence.v1beta2.LabelFrame(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.videointelligence.v1beta2.LabelFrame result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeOffset_ = timeOffsetBuilder_ == null ? timeOffset_ : timeOffsetBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.confidence_ = confidence_;
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
      if (other instanceof com.google.cloud.videointelligence.v1beta2.LabelFrame) {
        return mergeFrom((com.google.cloud.videointelligence.v1beta2.LabelFrame) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1beta2.LabelFrame other) {
      if (other == com.google.cloud.videointelligence.v1beta2.LabelFrame.getDefaultInstance())
        return this;
      if (other.hasTimeOffset()) {
        mergeTimeOffset(other.getTimeOffset());
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
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
                input.readMessage(getTimeOffsetFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 21:
              {
                confidence_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
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

    private com.google.protobuf.Duration timeOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        timeOffsetBuilder_;
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     *
     * @return Whether the timeOffset field is set.
     */
    public boolean hasTimeOffset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     *
     * @return The timeOffset.
     */
    public com.google.protobuf.Duration getTimeOffset() {
      if (timeOffsetBuilder_ == null) {
        return timeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : timeOffset_;
      } else {
        return timeOffsetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeOffset_ = value;
      } else {
        timeOffsetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration.Builder builderForValue) {
      if (timeOffsetBuilder_ == null) {
        timeOffset_ = builderForValue.build();
      } else {
        timeOffsetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public Builder mergeTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && timeOffset_ != null
            && timeOffset_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getTimeOffsetBuilder().mergeFrom(value);
        } else {
          timeOffset_ = value;
        }
      } else {
        timeOffsetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public Builder clearTimeOffset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timeOffset_ = null;
      if (timeOffsetBuilder_ != null) {
        timeOffsetBuilder_.dispose();
        timeOffsetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getTimeOffsetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimeOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
      if (timeOffsetBuilder_ != null) {
        return timeOffsetBuilder_.getMessageOrBuilder();
      } else {
        return timeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : timeOffset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTimeOffsetFieldBuilder() {
      if (timeOffsetBuilder_ == null) {
        timeOffsetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getTimeOffset(), getParentForChildren(), isClean());
        timeOffset_ = null;
      }
      return timeOffsetBuilder_;
    }

    private float confidence_;
    /**
     *
     *
     * <pre>
     * Confidence that the label is accurate. Range: [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     *
     * @return The confidence.
     */
    @java.lang.Override
    public float getConfidence() {
      return confidence_;
    }
    /**
     *
     *
     * <pre>
     * Confidence that the label is accurate. Range: [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     *
     * @param value The confidence to set.
     * @return This builder for chaining.
     */
    public Builder setConfidence(float value) {

      confidence_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Confidence that the label is accurate. Range: [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConfidence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      confidence_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1beta2.LabelFrame)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1beta2.LabelFrame)
  private static final com.google.cloud.videointelligence.v1beta2.LabelFrame DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1beta2.LabelFrame();
  }

  public static com.google.cloud.videointelligence.v1beta2.LabelFrame getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelFrame> PARSER =
      new com.google.protobuf.AbstractParser<LabelFrame>() {
        @java.lang.Override
        public LabelFrame parsePartialFrom(
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

  public static com.google.protobuf.Parser<LabelFrame> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelFrame> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1beta2.LabelFrame getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
