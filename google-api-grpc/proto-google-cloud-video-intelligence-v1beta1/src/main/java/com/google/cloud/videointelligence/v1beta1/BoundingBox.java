// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

/**
 *
 *
 * <pre>
 * Bounding box.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1beta1.BoundingBox}
 */
public final class BoundingBox extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1beta1.BoundingBox)
    BoundingBoxOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BoundingBox.newBuilder() to construct.
  private BoundingBox(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BoundingBox() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BoundingBox(
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
              left_ = input.readInt32();
              break;
            }
          case 16:
            {
              right_ = input.readInt32();
              break;
            }
          case 24:
            {
              bottom_ = input.readInt32();
              break;
            }
          case 32:
            {
              top_ = input.readInt32();
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
    return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1beta1_BoundingBox_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1beta1_BoundingBox_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1beta1.BoundingBox.class,
            com.google.cloud.videointelligence.v1beta1.BoundingBox.Builder.class);
  }

  public static final int LEFT_FIELD_NUMBER = 1;
  private int left_;
  /**
   *
   *
   * <pre>
   * Left X coordinate.
   * </pre>
   *
   * <code>int32 left = 1;</code>
   */
  public int getLeft() {
    return left_;
  }

  public static final int RIGHT_FIELD_NUMBER = 2;
  private int right_;
  /**
   *
   *
   * <pre>
   * Right X coordinate.
   * </pre>
   *
   * <code>int32 right = 2;</code>
   */
  public int getRight() {
    return right_;
  }

  public static final int BOTTOM_FIELD_NUMBER = 3;
  private int bottom_;
  /**
   *
   *
   * <pre>
   * Bottom Y coordinate.
   * </pre>
   *
   * <code>int32 bottom = 3;</code>
   */
  public int getBottom() {
    return bottom_;
  }

  public static final int TOP_FIELD_NUMBER = 4;
  private int top_;
  /**
   *
   *
   * <pre>
   * Top Y coordinate.
   * </pre>
   *
   * <code>int32 top = 4;</code>
   */
  public int getTop() {
    return top_;
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
    if (left_ != 0) {
      output.writeInt32(1, left_);
    }
    if (right_ != 0) {
      output.writeInt32(2, right_);
    }
    if (bottom_ != 0) {
      output.writeInt32(3, bottom_);
    }
    if (top_ != 0) {
      output.writeInt32(4, top_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (left_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, left_);
    }
    if (right_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, right_);
    }
    if (bottom_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, bottom_);
    }
    if (top_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, top_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1beta1.BoundingBox)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1beta1.BoundingBox other =
        (com.google.cloud.videointelligence.v1beta1.BoundingBox) obj;

    if (getLeft() != other.getLeft()) return false;
    if (getRight() != other.getRight()) return false;
    if (getBottom() != other.getBottom()) return false;
    if (getTop() != other.getTop()) return false;
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
    hash = (37 * hash) + LEFT_FIELD_NUMBER;
    hash = (53 * hash) + getLeft();
    hash = (37 * hash) + RIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getRight();
    hash = (37 * hash) + BOTTOM_FIELD_NUMBER;
    hash = (53 * hash) + getBottom();
    hash = (37 * hash) + TOP_FIELD_NUMBER;
    hash = (53 * hash) + getTop();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox parseFrom(
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
      com.google.cloud.videointelligence.v1beta1.BoundingBox prototype) {
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
   * Bounding box.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1beta1.BoundingBox}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1beta1.BoundingBox)
      com.google.cloud.videointelligence.v1beta1.BoundingBoxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta1_BoundingBox_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta1_BoundingBox_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1beta1.BoundingBox.class,
              com.google.cloud.videointelligence.v1beta1.BoundingBox.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1beta1.BoundingBox.newBuilder()
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
      left_ = 0;

      right_ = 0;

      bottom_ = 0;

      top_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta1_BoundingBox_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta1.BoundingBox getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1beta1.BoundingBox.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta1.BoundingBox build() {
      com.google.cloud.videointelligence.v1beta1.BoundingBox result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta1.BoundingBox buildPartial() {
      com.google.cloud.videointelligence.v1beta1.BoundingBox result =
          new com.google.cloud.videointelligence.v1beta1.BoundingBox(this);
      result.left_ = left_;
      result.right_ = right_;
      result.bottom_ = bottom_;
      result.top_ = top_;
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
      if (other instanceof com.google.cloud.videointelligence.v1beta1.BoundingBox) {
        return mergeFrom((com.google.cloud.videointelligence.v1beta1.BoundingBox) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1beta1.BoundingBox other) {
      if (other == com.google.cloud.videointelligence.v1beta1.BoundingBox.getDefaultInstance())
        return this;
      if (other.getLeft() != 0) {
        setLeft(other.getLeft());
      }
      if (other.getRight() != 0) {
        setRight(other.getRight());
      }
      if (other.getBottom() != 0) {
        setBottom(other.getBottom());
      }
      if (other.getTop() != 0) {
        setTop(other.getTop());
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
      com.google.cloud.videointelligence.v1beta1.BoundingBox parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.videointelligence.v1beta1.BoundingBox) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int left_;
    /**
     *
     *
     * <pre>
     * Left X coordinate.
     * </pre>
     *
     * <code>int32 left = 1;</code>
     */
    public int getLeft() {
      return left_;
    }
    /**
     *
     *
     * <pre>
     * Left X coordinate.
     * </pre>
     *
     * <code>int32 left = 1;</code>
     */
    public Builder setLeft(int value) {

      left_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Left X coordinate.
     * </pre>
     *
     * <code>int32 left = 1;</code>
     */
    public Builder clearLeft() {

      left_ = 0;
      onChanged();
      return this;
    }

    private int right_;
    /**
     *
     *
     * <pre>
     * Right X coordinate.
     * </pre>
     *
     * <code>int32 right = 2;</code>
     */
    public int getRight() {
      return right_;
    }
    /**
     *
     *
     * <pre>
     * Right X coordinate.
     * </pre>
     *
     * <code>int32 right = 2;</code>
     */
    public Builder setRight(int value) {

      right_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Right X coordinate.
     * </pre>
     *
     * <code>int32 right = 2;</code>
     */
    public Builder clearRight() {

      right_ = 0;
      onChanged();
      return this;
    }

    private int bottom_;
    /**
     *
     *
     * <pre>
     * Bottom Y coordinate.
     * </pre>
     *
     * <code>int32 bottom = 3;</code>
     */
    public int getBottom() {
      return bottom_;
    }
    /**
     *
     *
     * <pre>
     * Bottom Y coordinate.
     * </pre>
     *
     * <code>int32 bottom = 3;</code>
     */
    public Builder setBottom(int value) {

      bottom_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Bottom Y coordinate.
     * </pre>
     *
     * <code>int32 bottom = 3;</code>
     */
    public Builder clearBottom() {

      bottom_ = 0;
      onChanged();
      return this;
    }

    private int top_;
    /**
     *
     *
     * <pre>
     * Top Y coordinate.
     * </pre>
     *
     * <code>int32 top = 4;</code>
     */
    public int getTop() {
      return top_;
    }
    /**
     *
     *
     * <pre>
     * Top Y coordinate.
     * </pre>
     *
     * <code>int32 top = 4;</code>
     */
    public Builder setTop(int value) {

      top_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Top Y coordinate.
     * </pre>
     *
     * <code>int32 top = 4;</code>
     */
    public Builder clearTop() {

      top_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1beta1.BoundingBox)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1beta1.BoundingBox)
  private static final com.google.cloud.videointelligence.v1beta1.BoundingBox DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1beta1.BoundingBox();
  }

  public static com.google.cloud.videointelligence.v1beta1.BoundingBox getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BoundingBox> PARSER =
      new com.google.protobuf.AbstractParser<BoundingBox>() {
        @java.lang.Override
        public BoundingBox parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BoundingBox(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BoundingBox> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BoundingBox> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1beta1.BoundingBox getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
