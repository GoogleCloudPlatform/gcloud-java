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
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

/**
 *
 *
 * <pre>
 * Video frame level annotations for object detection and tracking. This field
 * stores per frame location, time offset, and confidence.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1.ObjectTrackingFrame}
 */
public final class ObjectTrackingFrame extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1.ObjectTrackingFrame)
    ObjectTrackingFrameOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ObjectTrackingFrame.newBuilder() to construct.
  private ObjectTrackingFrame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ObjectTrackingFrame() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ObjectTrackingFrame();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_ObjectTrackingFrame_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_ObjectTrackingFrame_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1.ObjectTrackingFrame.class,
            com.google.cloud.videointelligence.v1.ObjectTrackingFrame.Builder.class);
  }

  public static final int NORMALIZED_BOUNDING_BOX_FIELD_NUMBER = 1;
  private com.google.cloud.videointelligence.v1.NormalizedBoundingBox normalizedBoundingBox_;
  /**
   *
   *
   * <pre>
   * The normalized bounding box location of this object track for the frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
   * </code>
   *
   * @return Whether the normalizedBoundingBox field is set.
   */
  @java.lang.Override
  public boolean hasNormalizedBoundingBox() {
    return normalizedBoundingBox_ != null;
  }
  /**
   *
   *
   * <pre>
   * The normalized bounding box location of this object track for the frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
   * </code>
   *
   * @return The normalizedBoundingBox.
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1.NormalizedBoundingBox getNormalizedBoundingBox() {
    return normalizedBoundingBox_ == null
        ? com.google.cloud.videointelligence.v1.NormalizedBoundingBox.getDefaultInstance()
        : normalizedBoundingBox_;
  }
  /**
   *
   *
   * <pre>
   * The normalized bounding box location of this object track for the frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder
      getNormalizedBoundingBoxOrBuilder() {
    return normalizedBoundingBox_ == null
        ? com.google.cloud.videointelligence.v1.NormalizedBoundingBox.getDefaultInstance()
        : normalizedBoundingBox_;
  }

  public static final int TIME_OFFSET_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration timeOffset_;
  /**
   *
   *
   * <pre>
   * The timestamp of the frame in microseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
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
   * The timestamp of the frame in microseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
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
   * The timestamp of the frame in microseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
    return timeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeOffset_;
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
    if (normalizedBoundingBox_ != null) {
      output.writeMessage(1, getNormalizedBoundingBox());
    }
    if (timeOffset_ != null) {
      output.writeMessage(2, getTimeOffset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (normalizedBoundingBox_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getNormalizedBoundingBox());
    }
    if (timeOffset_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTimeOffset());
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1.ObjectTrackingFrame)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1.ObjectTrackingFrame other =
        (com.google.cloud.videointelligence.v1.ObjectTrackingFrame) obj;

    if (hasNormalizedBoundingBox() != other.hasNormalizedBoundingBox()) return false;
    if (hasNormalizedBoundingBox()) {
      if (!getNormalizedBoundingBox().equals(other.getNormalizedBoundingBox())) return false;
    }
    if (hasTimeOffset() != other.hasTimeOffset()) return false;
    if (hasTimeOffset()) {
      if (!getTimeOffset().equals(other.getTimeOffset())) return false;
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
    if (hasNormalizedBoundingBox()) {
      hash = (37 * hash) + NORMALIZED_BOUNDING_BOX_FIELD_NUMBER;
      hash = (53 * hash) + getNormalizedBoundingBox().hashCode();
    }
    if (hasTimeOffset()) {
      hash = (37 * hash) + TIME_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getTimeOffset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame parseFrom(
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
      com.google.cloud.videointelligence.v1.ObjectTrackingFrame prototype) {
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
   * Video frame level annotations for object detection and tracking. This field
   * stores per frame location, time offset, and confidence.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1.ObjectTrackingFrame}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1.ObjectTrackingFrame)
      com.google.cloud.videointelligence.v1.ObjectTrackingFrameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_ObjectTrackingFrame_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_ObjectTrackingFrame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1.ObjectTrackingFrame.class,
              com.google.cloud.videointelligence.v1.ObjectTrackingFrame.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1.ObjectTrackingFrame.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      normalizedBoundingBox_ = null;
      if (normalizedBoundingBoxBuilder_ != null) {
        normalizedBoundingBoxBuilder_.dispose();
        normalizedBoundingBoxBuilder_ = null;
      }
      timeOffset_ = null;
      if (timeOffsetBuilder_ != null) {
        timeOffsetBuilder_.dispose();
        timeOffsetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_ObjectTrackingFrame_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.ObjectTrackingFrame getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1.ObjectTrackingFrame.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.ObjectTrackingFrame build() {
      com.google.cloud.videointelligence.v1.ObjectTrackingFrame result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.ObjectTrackingFrame buildPartial() {
      com.google.cloud.videointelligence.v1.ObjectTrackingFrame result =
          new com.google.cloud.videointelligence.v1.ObjectTrackingFrame(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.videointelligence.v1.ObjectTrackingFrame result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.normalizedBoundingBox_ =
            normalizedBoundingBoxBuilder_ == null
                ? normalizedBoundingBox_
                : normalizedBoundingBoxBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeOffset_ = timeOffsetBuilder_ == null ? timeOffset_ : timeOffsetBuilder_.build();
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
      if (other instanceof com.google.cloud.videointelligence.v1.ObjectTrackingFrame) {
        return mergeFrom((com.google.cloud.videointelligence.v1.ObjectTrackingFrame) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1.ObjectTrackingFrame other) {
      if (other == com.google.cloud.videointelligence.v1.ObjectTrackingFrame.getDefaultInstance())
        return this;
      if (other.hasNormalizedBoundingBox()) {
        mergeNormalizedBoundingBox(other.getNormalizedBoundingBox());
      }
      if (other.hasTimeOffset()) {
        mergeTimeOffset(other.getTimeOffset());
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
                input.readMessage(
                    getNormalizedBoundingBoxFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getTimeOffsetFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.videointelligence.v1.NormalizedBoundingBox normalizedBoundingBox_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1.NormalizedBoundingBox,
            com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder,
            com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder>
        normalizedBoundingBoxBuilder_;
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     *
     * @return Whether the normalizedBoundingBox field is set.
     */
    public boolean hasNormalizedBoundingBox() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     *
     * @return The normalizedBoundingBox.
     */
    public com.google.cloud.videointelligence.v1.NormalizedBoundingBox getNormalizedBoundingBox() {
      if (normalizedBoundingBoxBuilder_ == null) {
        return normalizedBoundingBox_ == null
            ? com.google.cloud.videointelligence.v1.NormalizedBoundingBox.getDefaultInstance()
            : normalizedBoundingBox_;
      } else {
        return normalizedBoundingBoxBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public Builder setNormalizedBoundingBox(
        com.google.cloud.videointelligence.v1.NormalizedBoundingBox value) {
      if (normalizedBoundingBoxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        normalizedBoundingBox_ = value;
      } else {
        normalizedBoundingBoxBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public Builder setNormalizedBoundingBox(
        com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder builderForValue) {
      if (normalizedBoundingBoxBuilder_ == null) {
        normalizedBoundingBox_ = builderForValue.build();
      } else {
        normalizedBoundingBoxBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public Builder mergeNormalizedBoundingBox(
        com.google.cloud.videointelligence.v1.NormalizedBoundingBox value) {
      if (normalizedBoundingBoxBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && normalizedBoundingBox_ != null
            && normalizedBoundingBox_
                != com.google.cloud.videointelligence.v1.NormalizedBoundingBox
                    .getDefaultInstance()) {
          getNormalizedBoundingBoxBuilder().mergeFrom(value);
        } else {
          normalizedBoundingBox_ = value;
        }
      } else {
        normalizedBoundingBoxBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public Builder clearNormalizedBoundingBox() {
      bitField0_ = (bitField0_ & ~0x00000001);
      normalizedBoundingBox_ = null;
      if (normalizedBoundingBoxBuilder_ != null) {
        normalizedBoundingBoxBuilder_.dispose();
        normalizedBoundingBoxBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder
        getNormalizedBoundingBoxBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNormalizedBoundingBoxFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder
        getNormalizedBoundingBoxOrBuilder() {
      if (normalizedBoundingBoxBuilder_ != null) {
        return normalizedBoundingBoxBuilder_.getMessageOrBuilder();
      } else {
        return normalizedBoundingBox_ == null
            ? com.google.cloud.videointelligence.v1.NormalizedBoundingBox.getDefaultInstance()
            : normalizedBoundingBox_;
      }
    }
    /**
     *
     *
     * <pre>
     * The normalized bounding box location of this object track for the frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1.NormalizedBoundingBox,
            com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder,
            com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder>
        getNormalizedBoundingBoxFieldBuilder() {
      if (normalizedBoundingBoxBuilder_ == null) {
        normalizedBoundingBoxBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.videointelligence.v1.NormalizedBoundingBox,
                com.google.cloud.videointelligence.v1.NormalizedBoundingBox.Builder,
                com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder>(
                getNormalizedBoundingBox(), getParentForChildren(), isClean());
        normalizedBoundingBox_ = null;
      }
      return normalizedBoundingBoxBuilder_;
    }

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
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     *
     * @return Whether the timeOffset field is set.
     */
    public boolean hasTimeOffset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
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
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration.Builder builderForValue) {
      if (timeOffsetBuilder_ == null) {
        timeOffset_ = builderForValue.build();
      } else {
        timeOffsetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder mergeTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && timeOffset_ != null
            && timeOffset_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getTimeOffsetBuilder().mergeFrom(value);
        } else {
          timeOffset_ = value;
        }
      } else {
        timeOffsetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder clearTimeOffset() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getTimeOffsetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTimeOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
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
     * The timestamp of the frame in microseconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1.ObjectTrackingFrame)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1.ObjectTrackingFrame)
  private static final com.google.cloud.videointelligence.v1.ObjectTrackingFrame DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1.ObjectTrackingFrame();
  }

  public static com.google.cloud.videointelligence.v1.ObjectTrackingFrame getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectTrackingFrame> PARSER =
      new com.google.protobuf.AbstractParser<ObjectTrackingFrame>() {
        @java.lang.Override
        public ObjectTrackingFrame parsePartialFrom(
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

  public static com.google.protobuf.Parser<ObjectTrackingFrame> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectTrackingFrame> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1.ObjectTrackingFrame getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
