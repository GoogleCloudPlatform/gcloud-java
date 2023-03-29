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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Represents the result of executing an action.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.ActionOutput}
 */
public final class ActionOutput extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.ActionOutput)
    ActionOutputOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ActionOutput.newBuilder() to construct.
  private ActionOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ActionOutput() {
    actionId_ = "";
    actionState_ = 0;
    outputMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ActionOutput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_ActionOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_ActionOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.ActionOutput.class,
            com.google.cloud.contentwarehouse.v1.ActionOutput.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Represents execution state of the action.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.contentwarehouse.v1.ActionOutput.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>UNKNOWN = 0;</code> */
    UNKNOWN(0),
    /**
     *
     *
     * <pre>
     * State indicating action executed successfully.
     * </pre>
     *
     * <code>ACTION_SUCCEEDED = 1;</code>
     */
    ACTION_SUCCEEDED(1),
    /**
     *
     *
     * <pre>
     * State indicating action failed.
     * </pre>
     *
     * <code>ACTION_FAILED = 2;</code>
     */
    ACTION_FAILED(2),
    /**
     *
     *
     * <pre>
     * State indicating action timed out.
     * </pre>
     *
     * <code>ACTION_TIMED_OUT = 3;</code>
     */
    ACTION_TIMED_OUT(3),
    /**
     *
     *
     * <pre>
     * State indicating action is pending.
     * </pre>
     *
     * <code>ACTION_PENDING = 4;</code>
     */
    ACTION_PENDING(4),
    UNRECOGNIZED(-1),
    ;

    /** <code>UNKNOWN = 0;</code> */
    public static final int UNKNOWN_VALUE = 0;
    /**
     *
     *
     * <pre>
     * State indicating action executed successfully.
     * </pre>
     *
     * <code>ACTION_SUCCEEDED = 1;</code>
     */
    public static final int ACTION_SUCCEEDED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * State indicating action failed.
     * </pre>
     *
     * <code>ACTION_FAILED = 2;</code>
     */
    public static final int ACTION_FAILED_VALUE = 2;
    /**
     *
     *
     * <pre>
     * State indicating action timed out.
     * </pre>
     *
     * <code>ACTION_TIMED_OUT = 3;</code>
     */
    public static final int ACTION_TIMED_OUT_VALUE = 3;
    /**
     *
     *
     * <pre>
     * State indicating action is pending.
     * </pre>
     *
     * <code>ACTION_PENDING = 4;</code>
     */
    public static final int ACTION_PENDING_VALUE = 4;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return UNKNOWN;
        case 1:
          return ACTION_SUCCEEDED;
        case 2:
          return ACTION_FAILED;
        case 3:
          return ACTION_TIMED_OUT;
        case 4:
          return ACTION_PENDING;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.ActionOutput.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.contentwarehouse.v1.ActionOutput.State)
  }

  public static final int ACTION_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object actionId_ = "";
  /**
   *
   *
   * <pre>
   * ID of the action.
   * </pre>
   *
   * <code>string action_id = 1;</code>
   *
   * @return The actionId.
   */
  @java.lang.Override
  public java.lang.String getActionId() {
    java.lang.Object ref = actionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actionId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * ID of the action.
   * </pre>
   *
   * <code>string action_id = 1;</code>
   *
   * @return The bytes for actionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getActionIdBytes() {
    java.lang.Object ref = actionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      actionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_STATE_FIELD_NUMBER = 2;
  private int actionState_ = 0;
  /**
   *
   *
   * <pre>
   * State of an action.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ActionOutput.State action_state = 2;</code>
   *
   * @return The enum numeric value on the wire for actionState.
   */
  @java.lang.Override
  public int getActionStateValue() {
    return actionState_;
  }
  /**
   *
   *
   * <pre>
   * State of an action.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ActionOutput.State action_state = 2;</code>
   *
   * @return The actionState.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ActionOutput.State getActionState() {
    com.google.cloud.contentwarehouse.v1.ActionOutput.State result =
        com.google.cloud.contentwarehouse.v1.ActionOutput.State.forNumber(actionState_);
    return result == null
        ? com.google.cloud.contentwarehouse.v1.ActionOutput.State.UNRECOGNIZED
        : result;
  }

  public static final int OUTPUT_MESSAGE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object outputMessage_ = "";
  /**
   *
   *
   * <pre>
   * Action execution output message.
   * </pre>
   *
   * <code>string output_message = 3;</code>
   *
   * @return The outputMessage.
   */
  @java.lang.Override
  public java.lang.String getOutputMessage() {
    java.lang.Object ref = outputMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputMessage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Action execution output message.
   * </pre>
   *
   * <code>string output_message = 3;</code>
   *
   * @return The bytes for outputMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOutputMessageBytes() {
    java.lang.Object ref = outputMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      outputMessage_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, actionId_);
    }
    if (actionState_
        != com.google.cloud.contentwarehouse.v1.ActionOutput.State.UNKNOWN.getNumber()) {
      output.writeEnum(2, actionState_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, outputMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, actionId_);
    }
    if (actionState_
        != com.google.cloud.contentwarehouse.v1.ActionOutput.State.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, actionState_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, outputMessage_);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.ActionOutput)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.ActionOutput other =
        (com.google.cloud.contentwarehouse.v1.ActionOutput) obj;

    if (!getActionId().equals(other.getActionId())) return false;
    if (actionState_ != other.actionState_) return false;
    if (!getOutputMessage().equals(other.getOutputMessage())) return false;
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
    hash = (53 * hash) + getActionId().hashCode();
    hash = (37 * hash) + ACTION_STATE_FIELD_NUMBER;
    hash = (53 * hash) + actionState_;
    hash = (37 * hash) + OUTPUT_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getOutputMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.ActionOutput prototype) {
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
   * Represents the result of executing an action.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.ActionOutput}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.ActionOutput)
      com.google.cloud.contentwarehouse.v1.ActionOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_ActionOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_ActionOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.ActionOutput.class,
              com.google.cloud.contentwarehouse.v1.ActionOutput.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.ActionOutput.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      actionId_ = "";
      actionState_ = 0;
      outputMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_ActionOutput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ActionOutput getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.ActionOutput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ActionOutput build() {
      com.google.cloud.contentwarehouse.v1.ActionOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ActionOutput buildPartial() {
      com.google.cloud.contentwarehouse.v1.ActionOutput result =
          new com.google.cloud.contentwarehouse.v1.ActionOutput(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.ActionOutput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.actionId_ = actionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.actionState_ = actionState_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.outputMessage_ = outputMessage_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.ActionOutput) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.ActionOutput) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.ActionOutput other) {
      if (other == com.google.cloud.contentwarehouse.v1.ActionOutput.getDefaultInstance())
        return this;
      if (!other.getActionId().isEmpty()) {
        actionId_ = other.actionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.actionState_ != 0) {
        setActionStateValue(other.getActionStateValue());
      }
      if (!other.getOutputMessage().isEmpty()) {
        outputMessage_ = other.outputMessage_;
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
            case 10:
              {
                actionId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                actionState_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                outputMessage_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object actionId_ = "";
    /**
     *
     *
     * <pre>
     * ID of the action.
     * </pre>
     *
     * <code>string action_id = 1;</code>
     *
     * @return The actionId.
     */
    public java.lang.String getActionId() {
      java.lang.Object ref = actionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the action.
     * </pre>
     *
     * <code>string action_id = 1;</code>
     *
     * @return The bytes for actionId.
     */
    public com.google.protobuf.ByteString getActionIdBytes() {
      java.lang.Object ref = actionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        actionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the action.
     * </pre>
     *
     * <code>string action_id = 1;</code>
     *
     * @param value The actionId to set.
     * @return This builder for chaining.
     */
    public Builder setActionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      actionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the action.
     * </pre>
     *
     * <code>string action_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearActionId() {
      actionId_ = getDefaultInstance().getActionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the action.
     * </pre>
     *
     * <code>string action_id = 1;</code>
     *
     * @param value The bytes for actionId to set.
     * @return This builder for chaining.
     */
    public Builder setActionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      actionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int actionState_ = 0;
    /**
     *
     *
     * <pre>
     * State of an action.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ActionOutput.State action_state = 2;</code>
     *
     * @return The enum numeric value on the wire for actionState.
     */
    @java.lang.Override
    public int getActionStateValue() {
      return actionState_;
    }
    /**
     *
     *
     * <pre>
     * State of an action.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ActionOutput.State action_state = 2;</code>
     *
     * @param value The enum numeric value on the wire for actionState to set.
     * @return This builder for chaining.
     */
    public Builder setActionStateValue(int value) {
      actionState_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * State of an action.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ActionOutput.State action_state = 2;</code>
     *
     * @return The actionState.
     */
    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ActionOutput.State getActionState() {
      com.google.cloud.contentwarehouse.v1.ActionOutput.State result =
          com.google.cloud.contentwarehouse.v1.ActionOutput.State.forNumber(actionState_);
      return result == null
          ? com.google.cloud.contentwarehouse.v1.ActionOutput.State.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * State of an action.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ActionOutput.State action_state = 2;</code>
     *
     * @param value The actionState to set.
     * @return This builder for chaining.
     */
    public Builder setActionState(com.google.cloud.contentwarehouse.v1.ActionOutput.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      actionState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * State of an action.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.ActionOutput.State action_state = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearActionState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      actionState_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object outputMessage_ = "";
    /**
     *
     *
     * <pre>
     * Action execution output message.
     * </pre>
     *
     * <code>string output_message = 3;</code>
     *
     * @return The outputMessage.
     */
    public java.lang.String getOutputMessage() {
      java.lang.Object ref = outputMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Action execution output message.
     * </pre>
     *
     * <code>string output_message = 3;</code>
     *
     * @return The bytes for outputMessage.
     */
    public com.google.protobuf.ByteString getOutputMessageBytes() {
      java.lang.Object ref = outputMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        outputMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Action execution output message.
     * </pre>
     *
     * <code>string output_message = 3;</code>
     *
     * @param value The outputMessage to set.
     * @return This builder for chaining.
     */
    public Builder setOutputMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      outputMessage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Action execution output message.
     * </pre>
     *
     * <code>string output_message = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOutputMessage() {
      outputMessage_ = getDefaultInstance().getOutputMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Action execution output message.
     * </pre>
     *
     * <code>string output_message = 3;</code>
     *
     * @param value The bytes for outputMessage to set.
     * @return This builder for chaining.
     */
    public Builder setOutputMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      outputMessage_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.ActionOutput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.ActionOutput)
  private static final com.google.cloud.contentwarehouse.v1.ActionOutput DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.ActionOutput();
  }

  public static com.google.cloud.contentwarehouse.v1.ActionOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActionOutput> PARSER =
      new com.google.protobuf.AbstractParser<ActionOutput>() {
        @java.lang.Override
        public ActionOutput parsePartialFrom(
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

  public static com.google.protobuf.Parser<ActionOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActionOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ActionOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
