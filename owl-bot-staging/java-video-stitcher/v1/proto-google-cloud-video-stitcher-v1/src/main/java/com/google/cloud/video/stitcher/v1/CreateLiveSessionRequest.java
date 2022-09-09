// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Request message for VideoStitcherService.createLiveSession.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.CreateLiveSessionRequest}
 */
public final class CreateLiveSessionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.CreateLiveSessionRequest)
    CreateLiveSessionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateLiveSessionRequest.newBuilder() to construct.
  private CreateLiveSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateLiveSessionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateLiveSessionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateLiveSessionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.video.stitcher.v1.LiveSession.Builder subBuilder = null;
            if (liveSession_ != null) {
              subBuilder = liveSession_.toBuilder();
            }
            liveSession_ = input.readMessage(com.google.cloud.video.stitcher.v1.LiveSession.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(liveSession_);
              liveSession_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateLiveSessionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateLiveSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest.class, com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The project and location in which the live session should be created,
   * in the form of `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The project and location in which the live session should be created,
   * in the form of `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIVE_SESSION_FIELD_NUMBER = 2;
  private com.google.cloud.video.stitcher.v1.LiveSession liveSession_;
  /**
   * <pre>
   * Required. Parameters for creating a live session.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the liveSession field is set.
   */
  @java.lang.Override
  public boolean hasLiveSession() {
    return liveSession_ != null;
  }
  /**
   * <pre>
   * Required. Parameters for creating a live session.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The liveSession.
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.LiveSession getLiveSession() {
    return liveSession_ == null ? com.google.cloud.video.stitcher.v1.LiveSession.getDefaultInstance() : liveSession_;
  }
  /**
   * <pre>
   * Required. Parameters for creating a live session.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.LiveSessionOrBuilder getLiveSessionOrBuilder() {
    return getLiveSession();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (liveSession_ != null) {
      output.writeMessage(2, getLiveSession());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (liveSession_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLiveSession());
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest other = (com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasLiveSession() != other.hasLiveSession()) return false;
    if (hasLiveSession()) {
      if (!getLiveSession()
          .equals(other.getLiveSession())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasLiveSession()) {
      hash = (37 * hash) + LIVE_SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getLiveSession().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest prototype) {
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
   * Request message for VideoStitcherService.createLiveSession.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.CreateLiveSessionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.CreateLiveSessionRequest)
      com.google.cloud.video.stitcher.v1.CreateLiveSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateLiveSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateLiveSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest.class, com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (liveSessionBuilder_ == null) {
        liveSession_ = null;
      } else {
        liveSession_ = null;
        liveSessionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto.internal_static_google_cloud_video_stitcher_v1_CreateLiveSessionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest build() {
      com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest buildPartial() {
      com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest result = new com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest(this);
      result.parent_ = parent_;
      if (liveSessionBuilder_ == null) {
        result.liveSession_ = liveSession_;
      } else {
        result.liveSession_ = liveSessionBuilder_.build();
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
      if (other instanceof com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest other) {
      if (other == com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasLiveSession()) {
        mergeLiveSession(other.getLiveSession());
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
      com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The project and location in which the live session should be created,
     * in the form of `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The project and location in which the live session should be created,
     * in the form of `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The project and location in which the live session should be created,
     * in the form of `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The project and location in which the live session should be created,
     * in the form of `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The project and location in which the live session should be created,
     * in the form of `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.video.stitcher.v1.LiveSession liveSession_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.LiveSession, com.google.cloud.video.stitcher.v1.LiveSession.Builder, com.google.cloud.video.stitcher.v1.LiveSessionOrBuilder> liveSessionBuilder_;
    /**
     * <pre>
     * Required. Parameters for creating a live session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the liveSession field is set.
     */
    public boolean hasLiveSession() {
      return liveSessionBuilder_ != null || liveSession_ != null;
    }
    /**
     * <pre>
     * Required. Parameters for creating a live session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The liveSession.
     */
    public com.google.cloud.video.stitcher.v1.LiveSession getLiveSession() {
      if (liveSessionBuilder_ == null) {
        return liveSession_ == null ? com.google.cloud.video.stitcher.v1.LiveSession.getDefaultInstance() : liveSession_;
      } else {
        return liveSessionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Parameters for creating a live session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setLiveSession(com.google.cloud.video.stitcher.v1.LiveSession value) {
      if (liveSessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        liveSession_ = value;
        onChanged();
      } else {
        liveSessionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Parameters for creating a live session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setLiveSession(
        com.google.cloud.video.stitcher.v1.LiveSession.Builder builderForValue) {
      if (liveSessionBuilder_ == null) {
        liveSession_ = builderForValue.build();
        onChanged();
      } else {
        liveSessionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Parameters for creating a live session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeLiveSession(com.google.cloud.video.stitcher.v1.LiveSession value) {
      if (liveSessionBuilder_ == null) {
        if (liveSession_ != null) {
          liveSession_ =
            com.google.cloud.video.stitcher.v1.LiveSession.newBuilder(liveSession_).mergeFrom(value).buildPartial();
        } else {
          liveSession_ = value;
        }
        onChanged();
      } else {
        liveSessionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Parameters for creating a live session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearLiveSession() {
      if (liveSessionBuilder_ == null) {
        liveSession_ = null;
        onChanged();
      } else {
        liveSession_ = null;
        liveSessionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Parameters for creating a live session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.video.stitcher.v1.LiveSession.Builder getLiveSessionBuilder() {
      
      onChanged();
      return getLiveSessionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Parameters for creating a live session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.video.stitcher.v1.LiveSessionOrBuilder getLiveSessionOrBuilder() {
      if (liveSessionBuilder_ != null) {
        return liveSessionBuilder_.getMessageOrBuilder();
      } else {
        return liveSession_ == null ?
            com.google.cloud.video.stitcher.v1.LiveSession.getDefaultInstance() : liveSession_;
      }
    }
    /**
     * <pre>
     * Required. Parameters for creating a live session.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.LiveSession live_session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.LiveSession, com.google.cloud.video.stitcher.v1.LiveSession.Builder, com.google.cloud.video.stitcher.v1.LiveSessionOrBuilder> 
        getLiveSessionFieldBuilder() {
      if (liveSessionBuilder_ == null) {
        liveSessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.LiveSession, com.google.cloud.video.stitcher.v1.LiveSession.Builder, com.google.cloud.video.stitcher.v1.LiveSessionOrBuilder>(
                getLiveSession(),
                getParentForChildren(),
                isClean());
        liveSession_ = null;
      }
      return liveSessionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.CreateLiveSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.CreateLiveSessionRequest)
  private static final com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest();
  }

  public static com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateLiveSessionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateLiveSessionRequest>() {
    @java.lang.Override
    public CreateLiveSessionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateLiveSessionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateLiveSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateLiveSessionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.CreateLiveSessionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

