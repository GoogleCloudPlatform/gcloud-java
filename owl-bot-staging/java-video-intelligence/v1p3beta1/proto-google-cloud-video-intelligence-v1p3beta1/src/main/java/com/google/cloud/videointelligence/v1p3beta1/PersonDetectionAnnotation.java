// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

/**
 * <pre>
 * Person detection annotation per video.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation}
 */
public final class PersonDetectionAnnotation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation)
    PersonDetectionAnnotationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonDetectionAnnotation.newBuilder() to construct.
  private PersonDetectionAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonDetectionAnnotation() {
    tracks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PersonDetectionAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersonDetectionAnnotation(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tracks_ = new java.util.ArrayList<com.google.cloud.videointelligence.v1p3beta1.Track>();
              mutable_bitField0_ |= 0x00000001;
            }
            tracks_.add(
                input.readMessage(com.google.cloud.videointelligence.v1p3beta1.Track.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        tracks_ = java.util.Collections.unmodifiableList(tracks_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_PersonDetectionAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_PersonDetectionAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation.class, com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation.Builder.class);
  }

  public static final int TRACKS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track> tracks_;
  /**
   * <pre>
   * The detected tracks of a person.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track> getTracksList() {
    return tracks_;
  }
  /**
   * <pre>
   * The detected tracks of a person.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder> 
      getTracksOrBuilderList() {
    return tracks_;
  }
  /**
   * <pre>
   * The detected tracks of a person.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
   */
  @java.lang.Override
  public int getTracksCount() {
    return tracks_.size();
  }
  /**
   * <pre>
   * The detected tracks of a person.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.Track getTracks(int index) {
    return tracks_.get(index);
  }
  /**
   * <pre>
   * The detected tracks of a person.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder getTracksOrBuilder(
      int index) {
    return tracks_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < tracks_.size(); i++) {
      output.writeMessage(1, tracks_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tracks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tracks_.get(i));
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation other = (com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation) obj;

    if (!getTracksList()
        .equals(other.getTracksList())) return false;
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
    if (getTracksCount() > 0) {
      hash = (37 * hash) + TRACKS_FIELD_NUMBER;
      hash = (53 * hash) + getTracksList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Person detection annotation per video.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation)
      com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_PersonDetectionAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_PersonDetectionAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation.class, com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTracksFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tracksBuilder_ == null) {
        tracks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tracksBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_PersonDetectionAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation build() {
      com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation buildPartial() {
      com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation result = new com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation(this);
      int from_bitField0_ = bitField0_;
      if (tracksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tracks_ = java.util.Collections.unmodifiableList(tracks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tracks_ = tracks_;
      } else {
        result.tracks_ = tracksBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation) {
        return mergeFrom((com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation other) {
      if (other == com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation.getDefaultInstance()) return this;
      if (tracksBuilder_ == null) {
        if (!other.tracks_.isEmpty()) {
          if (tracks_.isEmpty()) {
            tracks_ = other.tracks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTracksIsMutable();
            tracks_.addAll(other.tracks_);
          }
          onChanged();
        }
      } else {
        if (!other.tracks_.isEmpty()) {
          if (tracksBuilder_.isEmpty()) {
            tracksBuilder_.dispose();
            tracksBuilder_ = null;
            tracks_ = other.tracks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tracksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTracksFieldBuilder() : null;
          } else {
            tracksBuilder_.addAllMessages(other.tracks_);
          }
        }
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
      com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track> tracks_ =
      java.util.Collections.emptyList();
    private void ensureTracksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tracks_ = new java.util.ArrayList<com.google.cloud.videointelligence.v1p3beta1.Track>(tracks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.videointelligence.v1p3beta1.Track, com.google.cloud.videointelligence.v1p3beta1.Track.Builder, com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder> tracksBuilder_;

    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track> getTracksList() {
      if (tracksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tracks_);
      } else {
        return tracksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public int getTracksCount() {
      if (tracksBuilder_ == null) {
        return tracks_.size();
      } else {
        return tracksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.Track getTracks(int index) {
      if (tracksBuilder_ == null) {
        return tracks_.get(index);
      } else {
        return tracksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public Builder setTracks(
        int index, com.google.cloud.videointelligence.v1p3beta1.Track value) {
      if (tracksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracksIsMutable();
        tracks_.set(index, value);
        onChanged();
      } else {
        tracksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public Builder setTracks(
        int index, com.google.cloud.videointelligence.v1p3beta1.Track.Builder builderForValue) {
      if (tracksBuilder_ == null) {
        ensureTracksIsMutable();
        tracks_.set(index, builderForValue.build());
        onChanged();
      } else {
        tracksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public Builder addTracks(com.google.cloud.videointelligence.v1p3beta1.Track value) {
      if (tracksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracksIsMutable();
        tracks_.add(value);
        onChanged();
      } else {
        tracksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public Builder addTracks(
        int index, com.google.cloud.videointelligence.v1p3beta1.Track value) {
      if (tracksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracksIsMutable();
        tracks_.add(index, value);
        onChanged();
      } else {
        tracksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public Builder addTracks(
        com.google.cloud.videointelligence.v1p3beta1.Track.Builder builderForValue) {
      if (tracksBuilder_ == null) {
        ensureTracksIsMutable();
        tracks_.add(builderForValue.build());
        onChanged();
      } else {
        tracksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public Builder addTracks(
        int index, com.google.cloud.videointelligence.v1p3beta1.Track.Builder builderForValue) {
      if (tracksBuilder_ == null) {
        ensureTracksIsMutable();
        tracks_.add(index, builderForValue.build());
        onChanged();
      } else {
        tracksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public Builder addAllTracks(
        java.lang.Iterable<? extends com.google.cloud.videointelligence.v1p3beta1.Track> values) {
      if (tracksBuilder_ == null) {
        ensureTracksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tracks_);
        onChanged();
      } else {
        tracksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public Builder clearTracks() {
      if (tracksBuilder_ == null) {
        tracks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tracksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public Builder removeTracks(int index) {
      if (tracksBuilder_ == null) {
        ensureTracksIsMutable();
        tracks_.remove(index);
        onChanged();
      } else {
        tracksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.Track.Builder getTracksBuilder(
        int index) {
      return getTracksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder getTracksOrBuilder(
        int index) {
      if (tracksBuilder_ == null) {
        return tracks_.get(index);  } else {
        return tracksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder> 
         getTracksOrBuilderList() {
      if (tracksBuilder_ != null) {
        return tracksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tracks_);
      }
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.Track.Builder addTracksBuilder() {
      return getTracksFieldBuilder().addBuilder(
          com.google.cloud.videointelligence.v1p3beta1.Track.getDefaultInstance());
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.Track.Builder addTracksBuilder(
        int index) {
      return getTracksFieldBuilder().addBuilder(
          index, com.google.cloud.videointelligence.v1p3beta1.Track.getDefaultInstance());
    }
    /**
     * <pre>
     * The detected tracks of a person.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 1;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track.Builder> 
         getTracksBuilderList() {
      return getTracksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.videointelligence.v1p3beta1.Track, com.google.cloud.videointelligence.v1p3beta1.Track.Builder, com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder> 
        getTracksFieldBuilder() {
      if (tracksBuilder_ == null) {
        tracksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1p3beta1.Track, com.google.cloud.videointelligence.v1p3beta1.Track.Builder, com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder>(
                tracks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tracks_ = null;
      }
      return tracksBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation)
  private static final com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation();
  }

  public static com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonDetectionAnnotation>
      PARSER = new com.google.protobuf.AbstractParser<PersonDetectionAnnotation>() {
    @java.lang.Override
    public PersonDetectionAnnotation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PersonDetectionAnnotation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersonDetectionAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonDetectionAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

