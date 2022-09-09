// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/messages.proto

package com.google.dataflow.v1beta3;

/**
 * <pre>
 * A particular message pertaining to a Dataflow job.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.JobMessage}
 */
public final class JobMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.JobMessage)
    JobMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobMessage.newBuilder() to construct.
  private JobMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobMessage() {
    id_ = "";
    messageText_ = "";
    messageImportance_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JobMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobMessage(
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

            id_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (time_ != null) {
              subBuilder = time_.toBuilder();
            }
            time_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(time_);
              time_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            messageText_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            messageImportance_ = rawValue;
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
    return com.google.dataflow.v1beta3.MessagesProto.internal_static_google_dataflow_v1beta3_JobMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.MessagesProto.internal_static_google_dataflow_v1beta3_JobMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.JobMessage.class, com.google.dataflow.v1beta3.JobMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp time_;
  /**
   * <pre>
   * The timestamp of the message.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   * @return Whether the time field is set.
   */
  @java.lang.Override
  public boolean hasTime() {
    return time_ != null;
  }
  /**
   * <pre>
   * The timestamp of the message.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   * @return The time.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTime() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }
  /**
   * <pre>
   * The timestamp of the message.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
    return getTime();
  }

  public static final int MESSAGE_TEXT_FIELD_NUMBER = 3;
  private volatile java.lang.Object messageText_;
  /**
   * <pre>
   * The text of the message.
   * </pre>
   *
   * <code>string message_text = 3;</code>
   * @return The messageText.
   */
  @java.lang.Override
  public java.lang.String getMessageText() {
    java.lang.Object ref = messageText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The text of the message.
   * </pre>
   *
   * <code>string message_text = 3;</code>
   * @return The bytes for messageText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageTextBytes() {
    java.lang.Object ref = messageText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_IMPORTANCE_FIELD_NUMBER = 4;
  private int messageImportance_;
  /**
   * <pre>
   * Importance level of the message.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.JobMessageImportance message_importance = 4;</code>
   * @return The enum numeric value on the wire for messageImportance.
   */
  @java.lang.Override public int getMessageImportanceValue() {
    return messageImportance_;
  }
  /**
   * <pre>
   * Importance level of the message.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.JobMessageImportance message_importance = 4;</code>
   * @return The messageImportance.
   */
  @java.lang.Override public com.google.dataflow.v1beta3.JobMessageImportance getMessageImportance() {
    @SuppressWarnings("deprecation")
    com.google.dataflow.v1beta3.JobMessageImportance result = com.google.dataflow.v1beta3.JobMessageImportance.valueOf(messageImportance_);
    return result == null ? com.google.dataflow.v1beta3.JobMessageImportance.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (time_ != null) {
      output.writeMessage(2, getTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, messageText_);
    }
    if (messageImportance_ != com.google.dataflow.v1beta3.JobMessageImportance.JOB_MESSAGE_IMPORTANCE_UNKNOWN.getNumber()) {
      output.writeEnum(4, messageImportance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (time_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, messageText_);
    }
    if (messageImportance_ != com.google.dataflow.v1beta3.JobMessageImportance.JOB_MESSAGE_IMPORTANCE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, messageImportance_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.JobMessage)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.JobMessage other = (com.google.dataflow.v1beta3.JobMessage) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (hasTime() != other.hasTime()) return false;
    if (hasTime()) {
      if (!getTime()
          .equals(other.getTime())) return false;
    }
    if (!getMessageText()
        .equals(other.getMessageText())) return false;
    if (messageImportance_ != other.messageImportance_) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    hash = (37 * hash) + MESSAGE_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getMessageText().hashCode();
    hash = (37 * hash) + MESSAGE_IMPORTANCE_FIELD_NUMBER;
    hash = (53 * hash) + messageImportance_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.JobMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.JobMessage parseFrom(
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
  public static Builder newBuilder(com.google.dataflow.v1beta3.JobMessage prototype) {
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
   * A particular message pertaining to a Dataflow job.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.JobMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.JobMessage)
      com.google.dataflow.v1beta3.JobMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.dataflow.v1beta3.MessagesProto.internal_static_google_dataflow_v1beta3_JobMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.MessagesProto.internal_static_google_dataflow_v1beta3_JobMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.JobMessage.class, com.google.dataflow.v1beta3.JobMessage.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.JobMessage.newBuilder()
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
      id_ = "";

      if (timeBuilder_ == null) {
        time_ = null;
      } else {
        time_ = null;
        timeBuilder_ = null;
      }
      messageText_ = "";

      messageImportance_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.dataflow.v1beta3.MessagesProto.internal_static_google_dataflow_v1beta3_JobMessage_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.JobMessage getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.JobMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.JobMessage build() {
      com.google.dataflow.v1beta3.JobMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.JobMessage buildPartial() {
      com.google.dataflow.v1beta3.JobMessage result = new com.google.dataflow.v1beta3.JobMessage(this);
      result.id_ = id_;
      if (timeBuilder_ == null) {
        result.time_ = time_;
      } else {
        result.time_ = timeBuilder_.build();
      }
      result.messageText_ = messageText_;
      result.messageImportance_ = messageImportance_;
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
      if (other instanceof com.google.dataflow.v1beta3.JobMessage) {
        return mergeFrom((com.google.dataflow.v1beta3.JobMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.JobMessage other) {
      if (other == com.google.dataflow.v1beta3.JobMessage.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.hasTime()) {
        mergeTime(other.getTime());
      }
      if (!other.getMessageText().isEmpty()) {
        messageText_ = other.messageText_;
        onChanged();
      }
      if (other.messageImportance_ != 0) {
        setMessageImportanceValue(other.getMessageImportanceValue());
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
      com.google.dataflow.v1beta3.JobMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.dataflow.v1beta3.JobMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecated.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp time_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
    /**
     * <pre>
     * The timestamp of the message.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     * @return Whether the time field is set.
     */
    public boolean hasTime() {
      return timeBuilder_ != null || time_ != null;
    }
    /**
     * <pre>
     * The timestamp of the message.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     * @return The time.
     */
    public com.google.protobuf.Timestamp getTime() {
      if (timeBuilder_ == null) {
        return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      } else {
        return timeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The timestamp of the message.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public Builder setTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
        onChanged();
      } else {
        timeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The timestamp of the message.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public Builder setTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
        onChanged();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The timestamp of the message.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public Builder mergeTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (time_ != null) {
          time_ =
            com.google.protobuf.Timestamp.newBuilder(time_).mergeFrom(value).buildPartial();
        } else {
          time_ = value;
        }
        onChanged();
      } else {
        timeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The timestamp of the message.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public Builder clearTime() {
      if (timeBuilder_ == null) {
        time_ = null;
        onChanged();
      } else {
        time_ = null;
        timeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The timestamp of the message.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
      
      onChanged();
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The timestamp of the message.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
      if (timeBuilder_ != null) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        return time_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      }
    }
    /**
     * <pre>
     * The timestamp of the message.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
    }

    private java.lang.Object messageText_ = "";
    /**
     * <pre>
     * The text of the message.
     * </pre>
     *
     * <code>string message_text = 3;</code>
     * @return The messageText.
     */
    public java.lang.String getMessageText() {
      java.lang.Object ref = messageText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The text of the message.
     * </pre>
     *
     * <code>string message_text = 3;</code>
     * @return The bytes for messageText.
     */
    public com.google.protobuf.ByteString
        getMessageTextBytes() {
      java.lang.Object ref = messageText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The text of the message.
     * </pre>
     *
     * <code>string message_text = 3;</code>
     * @param value The messageText to set.
     * @return This builder for chaining.
     */
    public Builder setMessageText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageText_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The text of the message.
     * </pre>
     *
     * <code>string message_text = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageText() {
      
      messageText_ = getDefaultInstance().getMessageText();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The text of the message.
     * </pre>
     *
     * <code>string message_text = 3;</code>
     * @param value The bytes for messageText to set.
     * @return This builder for chaining.
     */
    public Builder setMessageTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageText_ = value;
      onChanged();
      return this;
    }

    private int messageImportance_ = 0;
    /**
     * <pre>
     * Importance level of the message.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobMessageImportance message_importance = 4;</code>
     * @return The enum numeric value on the wire for messageImportance.
     */
    @java.lang.Override public int getMessageImportanceValue() {
      return messageImportance_;
    }
    /**
     * <pre>
     * Importance level of the message.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobMessageImportance message_importance = 4;</code>
     * @param value The enum numeric value on the wire for messageImportance to set.
     * @return This builder for chaining.
     */
    public Builder setMessageImportanceValue(int value) {
      
      messageImportance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Importance level of the message.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobMessageImportance message_importance = 4;</code>
     * @return The messageImportance.
     */
    @java.lang.Override
    public com.google.dataflow.v1beta3.JobMessageImportance getMessageImportance() {
      @SuppressWarnings("deprecation")
      com.google.dataflow.v1beta3.JobMessageImportance result = com.google.dataflow.v1beta3.JobMessageImportance.valueOf(messageImportance_);
      return result == null ? com.google.dataflow.v1beta3.JobMessageImportance.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Importance level of the message.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobMessageImportance message_importance = 4;</code>
     * @param value The messageImportance to set.
     * @return This builder for chaining.
     */
    public Builder setMessageImportance(com.google.dataflow.v1beta3.JobMessageImportance value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      messageImportance_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Importance level of the message.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobMessageImportance message_importance = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageImportance() {
      
      messageImportance_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.JobMessage)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.JobMessage)
  private static final com.google.dataflow.v1beta3.JobMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.JobMessage();
  }

  public static com.google.dataflow.v1beta3.JobMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobMessage>
      PARSER = new com.google.protobuf.AbstractParser<JobMessage>() {
    @java.lang.Override
    public JobMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.JobMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

