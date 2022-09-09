// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/eventarc.proto

package com.google.cloud.eventarc.v1;

/**
 * <pre>
 * The request message for the CreateChannelConnection method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.eventarc.v1.CreateChannelConnectionRequest}
 */
public final class CreateChannelConnectionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.eventarc.v1.CreateChannelConnectionRequest)
    CreateChannelConnectionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateChannelConnectionRequest.newBuilder() to construct.
  private CreateChannelConnectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateChannelConnectionRequest() {
    parent_ = "";
    channelConnectionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateChannelConnectionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateChannelConnectionRequest(
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
            com.google.cloud.eventarc.v1.ChannelConnection.Builder subBuilder = null;
            if (channelConnection_ != null) {
              subBuilder = channelConnection_.toBuilder();
            }
            channelConnection_ = input.readMessage(com.google.cloud.eventarc.v1.ChannelConnection.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(channelConnection_);
              channelConnection_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            channelConnectionId_ = s;
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
    return com.google.cloud.eventarc.v1.EventarcProto.internal_static_google_cloud_eventarc_v1_CreateChannelConnectionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.eventarc.v1.EventarcProto.internal_static_google_cloud_eventarc_v1_CreateChannelConnectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.eventarc.v1.CreateChannelConnectionRequest.class, com.google.cloud.eventarc.v1.CreateChannelConnectionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The parent collection in which to add this channel connection.
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
   * Required. The parent collection in which to add this channel connection.
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

  public static final int CHANNEL_CONNECTION_FIELD_NUMBER = 2;
  private com.google.cloud.eventarc.v1.ChannelConnection channelConnection_;
  /**
   * <pre>
   * Required. Channel connection to create.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the channelConnection field is set.
   */
  @java.lang.Override
  public boolean hasChannelConnection() {
    return channelConnection_ != null;
  }
  /**
   * <pre>
   * Required. Channel connection to create.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The channelConnection.
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.ChannelConnection getChannelConnection() {
    return channelConnection_ == null ? com.google.cloud.eventarc.v1.ChannelConnection.getDefaultInstance() : channelConnection_;
  }
  /**
   * <pre>
   * Required. Channel connection to create.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.ChannelConnectionOrBuilder getChannelConnectionOrBuilder() {
    return getChannelConnection();
  }

  public static final int CHANNEL_CONNECTION_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object channelConnectionId_;
  /**
   * <pre>
   * Required. The user-provided ID to be assigned to the channel connection.
   * </pre>
   *
   * <code>string channel_connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The channelConnectionId.
   */
  @java.lang.Override
  public java.lang.String getChannelConnectionId() {
    java.lang.Object ref = channelConnectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channelConnectionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The user-provided ID to be assigned to the channel connection.
   * </pre>
   *
   * <code>string channel_connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for channelConnectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChannelConnectionIdBytes() {
    java.lang.Object ref = channelConnectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channelConnectionId_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (channelConnection_ != null) {
      output.writeMessage(2, getChannelConnection());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelConnectionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, channelConnectionId_);
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
    if (channelConnection_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChannelConnection());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelConnectionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, channelConnectionId_);
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
    if (!(obj instanceof com.google.cloud.eventarc.v1.CreateChannelConnectionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.eventarc.v1.CreateChannelConnectionRequest other = (com.google.cloud.eventarc.v1.CreateChannelConnectionRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasChannelConnection() != other.hasChannelConnection()) return false;
    if (hasChannelConnection()) {
      if (!getChannelConnection()
          .equals(other.getChannelConnection())) return false;
    }
    if (!getChannelConnectionId()
        .equals(other.getChannelConnectionId())) return false;
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
    if (hasChannelConnection()) {
      hash = (37 * hash) + CHANNEL_CONNECTION_FIELD_NUMBER;
      hash = (53 * hash) + getChannelConnection().hashCode();
    }
    hash = (37 * hash) + CHANNEL_CONNECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChannelConnectionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.eventarc.v1.CreateChannelConnectionRequest prototype) {
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
   * The request message for the CreateChannelConnection method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.eventarc.v1.CreateChannelConnectionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.eventarc.v1.CreateChannelConnectionRequest)
      com.google.cloud.eventarc.v1.CreateChannelConnectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.eventarc.v1.EventarcProto.internal_static_google_cloud_eventarc_v1_CreateChannelConnectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.eventarc.v1.EventarcProto.internal_static_google_cloud_eventarc_v1_CreateChannelConnectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.eventarc.v1.CreateChannelConnectionRequest.class, com.google.cloud.eventarc.v1.CreateChannelConnectionRequest.Builder.class);
    }

    // Construct using com.google.cloud.eventarc.v1.CreateChannelConnectionRequest.newBuilder()
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

      if (channelConnectionBuilder_ == null) {
        channelConnection_ = null;
      } else {
        channelConnection_ = null;
        channelConnectionBuilder_ = null;
      }
      channelConnectionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.eventarc.v1.EventarcProto.internal_static_google_cloud_eventarc_v1_CreateChannelConnectionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CreateChannelConnectionRequest getDefaultInstanceForType() {
      return com.google.cloud.eventarc.v1.CreateChannelConnectionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CreateChannelConnectionRequest build() {
      com.google.cloud.eventarc.v1.CreateChannelConnectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CreateChannelConnectionRequest buildPartial() {
      com.google.cloud.eventarc.v1.CreateChannelConnectionRequest result = new com.google.cloud.eventarc.v1.CreateChannelConnectionRequest(this);
      result.parent_ = parent_;
      if (channelConnectionBuilder_ == null) {
        result.channelConnection_ = channelConnection_;
      } else {
        result.channelConnection_ = channelConnectionBuilder_.build();
      }
      result.channelConnectionId_ = channelConnectionId_;
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
      if (other instanceof com.google.cloud.eventarc.v1.CreateChannelConnectionRequest) {
        return mergeFrom((com.google.cloud.eventarc.v1.CreateChannelConnectionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.eventarc.v1.CreateChannelConnectionRequest other) {
      if (other == com.google.cloud.eventarc.v1.CreateChannelConnectionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasChannelConnection()) {
        mergeChannelConnection(other.getChannelConnection());
      }
      if (!other.getChannelConnectionId().isEmpty()) {
        channelConnectionId_ = other.channelConnectionId_;
        onChanged();
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
      com.google.cloud.eventarc.v1.CreateChannelConnectionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.eventarc.v1.CreateChannelConnectionRequest) e.getUnfinishedMessage();
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
     * Required. The parent collection in which to add this channel connection.
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
     * Required. The parent collection in which to add this channel connection.
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
     * Required. The parent collection in which to add this channel connection.
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
     * Required. The parent collection in which to add this channel connection.
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
     * Required. The parent collection in which to add this channel connection.
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

    private com.google.cloud.eventarc.v1.ChannelConnection channelConnection_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.eventarc.v1.ChannelConnection, com.google.cloud.eventarc.v1.ChannelConnection.Builder, com.google.cloud.eventarc.v1.ChannelConnectionOrBuilder> channelConnectionBuilder_;
    /**
     * <pre>
     * Required. Channel connection to create.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the channelConnection field is set.
     */
    public boolean hasChannelConnection() {
      return channelConnectionBuilder_ != null || channelConnection_ != null;
    }
    /**
     * <pre>
     * Required. Channel connection to create.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The channelConnection.
     */
    public com.google.cloud.eventarc.v1.ChannelConnection getChannelConnection() {
      if (channelConnectionBuilder_ == null) {
        return channelConnection_ == null ? com.google.cloud.eventarc.v1.ChannelConnection.getDefaultInstance() : channelConnection_;
      } else {
        return channelConnectionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Channel connection to create.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setChannelConnection(com.google.cloud.eventarc.v1.ChannelConnection value) {
      if (channelConnectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        channelConnection_ = value;
        onChanged();
      } else {
        channelConnectionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Channel connection to create.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setChannelConnection(
        com.google.cloud.eventarc.v1.ChannelConnection.Builder builderForValue) {
      if (channelConnectionBuilder_ == null) {
        channelConnection_ = builderForValue.build();
        onChanged();
      } else {
        channelConnectionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Channel connection to create.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeChannelConnection(com.google.cloud.eventarc.v1.ChannelConnection value) {
      if (channelConnectionBuilder_ == null) {
        if (channelConnection_ != null) {
          channelConnection_ =
            com.google.cloud.eventarc.v1.ChannelConnection.newBuilder(channelConnection_).mergeFrom(value).buildPartial();
        } else {
          channelConnection_ = value;
        }
        onChanged();
      } else {
        channelConnectionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Channel connection to create.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearChannelConnection() {
      if (channelConnectionBuilder_ == null) {
        channelConnection_ = null;
        onChanged();
      } else {
        channelConnection_ = null;
        channelConnectionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Channel connection to create.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.eventarc.v1.ChannelConnection.Builder getChannelConnectionBuilder() {
      
      onChanged();
      return getChannelConnectionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Channel connection to create.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.eventarc.v1.ChannelConnectionOrBuilder getChannelConnectionOrBuilder() {
      if (channelConnectionBuilder_ != null) {
        return channelConnectionBuilder_.getMessageOrBuilder();
      } else {
        return channelConnection_ == null ?
            com.google.cloud.eventarc.v1.ChannelConnection.getDefaultInstance() : channelConnection_;
      }
    }
    /**
     * <pre>
     * Required. Channel connection to create.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.eventarc.v1.ChannelConnection, com.google.cloud.eventarc.v1.ChannelConnection.Builder, com.google.cloud.eventarc.v1.ChannelConnectionOrBuilder> 
        getChannelConnectionFieldBuilder() {
      if (channelConnectionBuilder_ == null) {
        channelConnectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.ChannelConnection, com.google.cloud.eventarc.v1.ChannelConnection.Builder, com.google.cloud.eventarc.v1.ChannelConnectionOrBuilder>(
                getChannelConnection(),
                getParentForChildren(),
                isClean());
        channelConnection_ = null;
      }
      return channelConnectionBuilder_;
    }

    private java.lang.Object channelConnectionId_ = "";
    /**
     * <pre>
     * Required. The user-provided ID to be assigned to the channel connection.
     * </pre>
     *
     * <code>string channel_connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The channelConnectionId.
     */
    public java.lang.String getChannelConnectionId() {
      java.lang.Object ref = channelConnectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channelConnectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The user-provided ID to be assigned to the channel connection.
     * </pre>
     *
     * <code>string channel_connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for channelConnectionId.
     */
    public com.google.protobuf.ByteString
        getChannelConnectionIdBytes() {
      java.lang.Object ref = channelConnectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channelConnectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The user-provided ID to be assigned to the channel connection.
     * </pre>
     *
     * <code>string channel_connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The channelConnectionId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelConnectionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      channelConnectionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The user-provided ID to be assigned to the channel connection.
     * </pre>
     *
     * <code>string channel_connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelConnectionId() {
      
      channelConnectionId_ = getDefaultInstance().getChannelConnectionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The user-provided ID to be assigned to the channel connection.
     * </pre>
     *
     * <code>string channel_connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for channelConnectionId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelConnectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      channelConnectionId_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.eventarc.v1.CreateChannelConnectionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.CreateChannelConnectionRequest)
  private static final com.google.cloud.eventarc.v1.CreateChannelConnectionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.eventarc.v1.CreateChannelConnectionRequest();
  }

  public static com.google.cloud.eventarc.v1.CreateChannelConnectionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateChannelConnectionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateChannelConnectionRequest>() {
    @java.lang.Override
    public CreateChannelConnectionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateChannelConnectionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateChannelConnectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateChannelConnectionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.eventarc.v1.CreateChannelConnectionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

