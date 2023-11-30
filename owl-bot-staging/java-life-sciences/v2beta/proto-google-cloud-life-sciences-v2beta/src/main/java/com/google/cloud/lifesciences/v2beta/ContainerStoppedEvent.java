// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

/**
 * <pre>
 * An event generated when a container exits.
 * </pre>
 *
 * Protobuf type {@code google.cloud.lifesciences.v2beta.ContainerStoppedEvent}
 */
public final class ContainerStoppedEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.lifesciences.v2beta.ContainerStoppedEvent)
    ContainerStoppedEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContainerStoppedEvent.newBuilder() to construct.
  private ContainerStoppedEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContainerStoppedEvent() {
    stderr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContainerStoppedEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ContainerStoppedEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ContainerStoppedEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent.class, com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent.Builder.class);
  }

  public static final int ACTION_ID_FIELD_NUMBER = 1;
  private int actionId_ = 0;
  /**
   * <pre>
   * The numeric ID of the action that started this container.
   * </pre>
   *
   * <code>int32 action_id = 1;</code>
   * @return The actionId.
   */
  @java.lang.Override
  public int getActionId() {
    return actionId_;
  }

  public static final int EXIT_STATUS_FIELD_NUMBER = 2;
  private int exitStatus_ = 0;
  /**
   * <pre>
   * The exit status of the container.
   * </pre>
   *
   * <code>int32 exit_status = 2;</code>
   * @return The exitStatus.
   */
  @java.lang.Override
  public int getExitStatus() {
    return exitStatus_;
  }

  public static final int STDERR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object stderr_ = "";
  /**
   * <pre>
   * The tail end of any content written to standard error by the container.
   * If the content emits large amounts of debugging noise or contains
   * sensitive information, you can prevent the content from being printed by
   * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.
   *
   * Note that only a small amount of the end of the stream is captured here.
   * The entire stream is stored in the `/google/logs` directory mounted into
   * each action, and can be copied off the machine as described elsewhere.
   * </pre>
   *
   * <code>string stderr = 3;</code>
   * @return The stderr.
   */
  @java.lang.Override
  public java.lang.String getStderr() {
    java.lang.Object ref = stderr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stderr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The tail end of any content written to standard error by the container.
   * If the content emits large amounts of debugging noise or contains
   * sensitive information, you can prevent the content from being printed by
   * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.
   *
   * Note that only a small amount of the end of the stream is captured here.
   * The entire stream is stored in the `/google/logs` directory mounted into
   * each action, and can be copied off the machine as described elsewhere.
   * </pre>
   *
   * <code>string stderr = 3;</code>
   * @return The bytes for stderr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStderrBytes() {
    java.lang.Object ref = stderr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stderr_ = b;
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
    if (actionId_ != 0) {
      output.writeInt32(1, actionId_);
    }
    if (exitStatus_ != 0) {
      output.writeInt32(2, exitStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stderr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, stderr_);
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
    if (exitStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, exitStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stderr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, stderr_);
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
    if (!(obj instanceof com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent)) {
      return super.equals(obj);
    }
    com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent other = (com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent) obj;

    if (getActionId()
        != other.getActionId()) return false;
    if (getExitStatus()
        != other.getExitStatus()) return false;
    if (!getStderr()
        .equals(other.getStderr())) return false;
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
    hash = (37 * hash) + EXIT_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getExitStatus();
    hash = (37 * hash) + STDERR_FIELD_NUMBER;
    hash = (53 * hash) + getStderr().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent parseFrom(
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
  public static Builder newBuilder(com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent prototype) {
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
   * An event generated when a container exits.
   * </pre>
   *
   * Protobuf type {@code google.cloud.lifesciences.v2beta.ContainerStoppedEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.lifesciences.v2beta.ContainerStoppedEvent)
      com.google.cloud.lifesciences.v2beta.ContainerStoppedEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ContainerStoppedEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ContainerStoppedEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent.class, com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent.Builder.class);
    }

    // Construct using com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent.newBuilder()
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
      exitStatus_ = 0;
      stderr_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ContainerStoppedEvent_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent getDefaultInstanceForType() {
      return com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent build() {
      com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent buildPartial() {
      com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent result = new com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.actionId_ = actionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.exitStatus_ = exitStatus_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.stderr_ = stderr_;
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
      if (other instanceof com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent) {
        return mergeFrom((com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent other) {
      if (other == com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent.getDefaultInstance()) return this;
      if (other.getActionId() != 0) {
        setActionId(other.getActionId());
      }
      if (other.getExitStatus() != 0) {
        setExitStatus(other.getExitStatus());
      }
      if (!other.getStderr().isEmpty()) {
        stderr_ = other.stderr_;
        bitField0_ |= 0x00000004;
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
            case 8: {
              actionId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              exitStatus_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              stderr_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
     * The numeric ID of the action that started this container.
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
     * The numeric ID of the action that started this container.
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
     * The numeric ID of the action that started this container.
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

    private int exitStatus_ ;
    /**
     * <pre>
     * The exit status of the container.
     * </pre>
     *
     * <code>int32 exit_status = 2;</code>
     * @return The exitStatus.
     */
    @java.lang.Override
    public int getExitStatus() {
      return exitStatus_;
    }
    /**
     * <pre>
     * The exit status of the container.
     * </pre>
     *
     * <code>int32 exit_status = 2;</code>
     * @param value The exitStatus to set.
     * @return This builder for chaining.
     */
    public Builder setExitStatus(int value) {

      exitStatus_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The exit status of the container.
     * </pre>
     *
     * <code>int32 exit_status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExitStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      exitStatus_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object stderr_ = "";
    /**
     * <pre>
     * The tail end of any content written to standard error by the container.
     * If the content emits large amounts of debugging noise or contains
     * sensitive information, you can prevent the content from being printed by
     * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.
     *
     * Note that only a small amount of the end of the stream is captured here.
     * The entire stream is stored in the `/google/logs` directory mounted into
     * each action, and can be copied off the machine as described elsewhere.
     * </pre>
     *
     * <code>string stderr = 3;</code>
     * @return The stderr.
     */
    public java.lang.String getStderr() {
      java.lang.Object ref = stderr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stderr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The tail end of any content written to standard error by the container.
     * If the content emits large amounts of debugging noise or contains
     * sensitive information, you can prevent the content from being printed by
     * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.
     *
     * Note that only a small amount of the end of the stream is captured here.
     * The entire stream is stored in the `/google/logs` directory mounted into
     * each action, and can be copied off the machine as described elsewhere.
     * </pre>
     *
     * <code>string stderr = 3;</code>
     * @return The bytes for stderr.
     */
    public com.google.protobuf.ByteString
        getStderrBytes() {
      java.lang.Object ref = stderr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stderr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The tail end of any content written to standard error by the container.
     * If the content emits large amounts of debugging noise or contains
     * sensitive information, you can prevent the content from being printed by
     * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.
     *
     * Note that only a small amount of the end of the stream is captured here.
     * The entire stream is stored in the `/google/logs` directory mounted into
     * each action, and can be copied off the machine as described elsewhere.
     * </pre>
     *
     * <code>string stderr = 3;</code>
     * @param value The stderr to set.
     * @return This builder for chaining.
     */
    public Builder setStderr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      stderr_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The tail end of any content written to standard error by the container.
     * If the content emits large amounts of debugging noise or contains
     * sensitive information, you can prevent the content from being printed by
     * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.
     *
     * Note that only a small amount of the end of the stream is captured here.
     * The entire stream is stored in the `/google/logs` directory mounted into
     * each action, and can be copied off the machine as described elsewhere.
     * </pre>
     *
     * <code>string stderr = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStderr() {
      stderr_ = getDefaultInstance().getStderr();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The tail end of any content written to standard error by the container.
     * If the content emits large amounts of debugging noise or contains
     * sensitive information, you can prevent the content from being printed by
     * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.
     *
     * Note that only a small amount of the end of the stream is captured here.
     * The entire stream is stored in the `/google/logs` directory mounted into
     * each action, and can be copied off the machine as described elsewhere.
     * </pre>
     *
     * <code>string stderr = 3;</code>
     * @param value The bytes for stderr to set.
     * @return This builder for chaining.
     */
    public Builder setStderrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      stderr_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.lifesciences.v2beta.ContainerStoppedEvent)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.lifesciences.v2beta.ContainerStoppedEvent)
  private static final com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent();
  }

  public static com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContainerStoppedEvent>
      PARSER = new com.google.protobuf.AbstractParser<ContainerStoppedEvent>() {
    @java.lang.Override
    public ContainerStoppedEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContainerStoppedEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContainerStoppedEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

