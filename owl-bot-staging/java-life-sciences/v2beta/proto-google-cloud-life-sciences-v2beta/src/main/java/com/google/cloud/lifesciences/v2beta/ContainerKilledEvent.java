// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

/**
 * <pre>
 * An event generated when a container is forcibly terminated by the
 * worker. Currently, this only occurs when the container outlives the
 * timeout specified by the user.
 * </pre>
 *
 * Protobuf type {@code google.cloud.lifesciences.v2beta.ContainerKilledEvent}
 */
public final class ContainerKilledEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.lifesciences.v2beta.ContainerKilledEvent)
    ContainerKilledEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContainerKilledEvent.newBuilder() to construct.
  private ContainerKilledEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContainerKilledEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContainerKilledEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ContainerKilledEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ContainerKilledEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.lifesciences.v2beta.ContainerKilledEvent.class, com.google.cloud.lifesciences.v2beta.ContainerKilledEvent.Builder.class);
  }

  public static final int ACTION_ID_FIELD_NUMBER = 1;
  private int actionId_ = 0;
  /**
   * <pre>
   * The numeric ID of the action that started the container.
   * </pre>
   *
   * <code>int32 action_id = 1;</code>
   * @return The actionId.
   */
  @java.lang.Override
  public int getActionId() {
    return actionId_;
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
    if (actionId_ != 0) {
      output.writeInt32(1, actionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (actionId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, actionId_);
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
    if (!(obj instanceof com.google.cloud.lifesciences.v2beta.ContainerKilledEvent)) {
      return super.equals(obj);
    }
    com.google.cloud.lifesciences.v2beta.ContainerKilledEvent other = (com.google.cloud.lifesciences.v2beta.ContainerKilledEvent) obj;

    if (getActionId()
        != other.getActionId()) return false;
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
    hash = (37 * hash) + ACTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getActionId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent parseFrom(
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
  public static Builder newBuilder(com.google.cloud.lifesciences.v2beta.ContainerKilledEvent prototype) {
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
   * An event generated when a container is forcibly terminated by the
   * worker. Currently, this only occurs when the container outlives the
   * timeout specified by the user.
   * </pre>
   *
   * Protobuf type {@code google.cloud.lifesciences.v2beta.ContainerKilledEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.lifesciences.v2beta.ContainerKilledEvent)
      com.google.cloud.lifesciences.v2beta.ContainerKilledEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ContainerKilledEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ContainerKilledEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.lifesciences.v2beta.ContainerKilledEvent.class, com.google.cloud.lifesciences.v2beta.ContainerKilledEvent.Builder.class);
    }

    // Construct using com.google.cloud.lifesciences.v2beta.ContainerKilledEvent.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      actionId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ContainerKilledEvent_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ContainerKilledEvent getDefaultInstanceForType() {
      return com.google.cloud.lifesciences.v2beta.ContainerKilledEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ContainerKilledEvent build() {
      com.google.cloud.lifesciences.v2beta.ContainerKilledEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ContainerKilledEvent buildPartial() {
      com.google.cloud.lifesciences.v2beta.ContainerKilledEvent result = new com.google.cloud.lifesciences.v2beta.ContainerKilledEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.lifesciences.v2beta.ContainerKilledEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.actionId_ = actionId_;
      }
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
      if (other instanceof com.google.cloud.lifesciences.v2beta.ContainerKilledEvent) {
        return mergeFrom((com.google.cloud.lifesciences.v2beta.ContainerKilledEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.lifesciences.v2beta.ContainerKilledEvent other) {
      if (other == com.google.cloud.lifesciences.v2beta.ContainerKilledEvent.getDefaultInstance()) return this;
      if (other.getActionId() != 0) {
        setActionId(other.getActionId());
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
            case 8: {
              actionId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
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

    private int actionId_ ;
    /**
     * <pre>
     * The numeric ID of the action that started the container.
     * </pre>
     *
     * <code>int32 action_id = 1;</code>
     * @return The actionId.
     */
    @java.lang.Override
    public int getActionId() {
      return actionId_;
    }
    /**
     * <pre>
     * The numeric ID of the action that started the container.
     * </pre>
     *
     * <code>int32 action_id = 1;</code>
     * @param value The actionId to set.
     * @return This builder for chaining.
     */
    public Builder setActionId(int value) {

      actionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The numeric ID of the action that started the container.
     * </pre>
     *
     * <code>int32 action_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearActionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      actionId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.lifesciences.v2beta.ContainerKilledEvent)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.lifesciences.v2beta.ContainerKilledEvent)
  private static final com.google.cloud.lifesciences.v2beta.ContainerKilledEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.lifesciences.v2beta.ContainerKilledEvent();
  }

  public static com.google.cloud.lifesciences.v2beta.ContainerKilledEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContainerKilledEvent>
      PARSER = new com.google.protobuf.AbstractParser<ContainerKilledEvent>() {
    @java.lang.Override
    public ContainerKilledEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContainerKilledEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContainerKilledEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.lifesciences.v2beta.ContainerKilledEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

