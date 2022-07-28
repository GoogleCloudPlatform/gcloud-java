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
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

/**
 *
 *
 * <pre>
 * The status of human review on a processed document.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.HumanReviewStatus}
 */
public final class HumanReviewStatus extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.HumanReviewStatus)
    HumanReviewStatusOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HumanReviewStatus.newBuilder() to construct.
  private HumanReviewStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HumanReviewStatus() {
    state_ = 0;
    stateMessage_ = "";
    humanReviewOperation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HumanReviewStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private HumanReviewStatus(
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
          case 8:
            {
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              stateMessage_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              humanReviewOperation_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_HumanReviewStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_HumanReviewStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.HumanReviewStatus.class,
            com.google.cloud.documentai.v1.HumanReviewStatus.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The final state of human review on a processed document.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.documentai.v1.HumanReviewStatus.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Human review state is unspecified. Most likely due to an internal error.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Human review is skipped for the document. This can happen because human
     * review is not enabled on the processor or the processing request has
     * been set to skip this document.
     * </pre>
     *
     * <code>SKIPPED = 1;</code>
     */
    SKIPPED(1),
    /**
     *
     *
     * <pre>
     * Human review validation is triggered and passed, so no review is needed.
     * </pre>
     *
     * <code>VALIDATION_PASSED = 2;</code>
     */
    VALIDATION_PASSED(2),
    /**
     *
     *
     * <pre>
     * Human review validation is triggered and the document is under review.
     * </pre>
     *
     * <code>IN_PROGRESS = 3;</code>
     */
    IN_PROGRESS(3),
    /**
     *
     *
     * <pre>
     * Some error happened during triggering human review, see the
     * [state_message] for details.
     * </pre>
     *
     * <code>ERROR = 4;</code>
     */
    ERROR(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Human review state is unspecified. Most likely due to an internal error.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Human review is skipped for the document. This can happen because human
     * review is not enabled on the processor or the processing request has
     * been set to skip this document.
     * </pre>
     *
     * <code>SKIPPED = 1;</code>
     */
    public static final int SKIPPED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Human review validation is triggered and passed, so no review is needed.
     * </pre>
     *
     * <code>VALIDATION_PASSED = 2;</code>
     */
    public static final int VALIDATION_PASSED_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Human review validation is triggered and the document is under review.
     * </pre>
     *
     * <code>IN_PROGRESS = 3;</code>
     */
    public static final int IN_PROGRESS_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Some error happened during triggering human review, see the
     * [state_message] for details.
     * </pre>
     *
     * <code>ERROR = 4;</code>
     */
    public static final int ERROR_VALUE = 4;

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
          return STATE_UNSPECIFIED;
        case 1:
          return SKIPPED;
        case 2:
          return VALIDATION_PASSED;
        case 3:
          return IN_PROGRESS;
        case 4:
          return ERROR;
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
      return com.google.cloud.documentai.v1.HumanReviewStatus.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:google.cloud.documentai.v1.HumanReviewStatus.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_;
  /**
   *
   *
   * <pre>
   * The state of human review on the processing request.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.HumanReviewStatus.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * The state of human review on the processing request.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.HumanReviewStatus.State state = 1;</code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.HumanReviewStatus.State getState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.documentai.v1.HumanReviewStatus.State result =
        com.google.cloud.documentai.v1.HumanReviewStatus.State.valueOf(state_);
    return result == null
        ? com.google.cloud.documentai.v1.HumanReviewStatus.State.UNRECOGNIZED
        : result;
  }

  public static final int STATE_MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object stateMessage_;
  /**
   *
   *
   * <pre>
   * A message providing more details about the human review state.
   * </pre>
   *
   * <code>string state_message = 2;</code>
   *
   * @return The stateMessage.
   */
  @java.lang.Override
  public java.lang.String getStateMessage() {
    java.lang.Object ref = stateMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stateMessage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A message providing more details about the human review state.
   * </pre>
   *
   * <code>string state_message = 2;</code>
   *
   * @return The bytes for stateMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStateMessageBytes() {
    java.lang.Object ref = stateMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      stateMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HUMAN_REVIEW_OPERATION_FIELD_NUMBER = 3;
  private volatile java.lang.Object humanReviewOperation_;
  /**
   *
   *
   * <pre>
   * The name of the operation triggered by the processed document. This field
   * is populated only when the [state] is [HUMAN_REVIEW_IN_PROGRESS]. It has
   * the same response type and metadata as the long running operation returned
   * by [ReviewDocument] method.
   * </pre>
   *
   * <code>string human_review_operation = 3;</code>
   *
   * @return The humanReviewOperation.
   */
  @java.lang.Override
  public java.lang.String getHumanReviewOperation() {
    java.lang.Object ref = humanReviewOperation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      humanReviewOperation_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the operation triggered by the processed document. This field
   * is populated only when the [state] is [HUMAN_REVIEW_IN_PROGRESS]. It has
   * the same response type and metadata as the long running operation returned
   * by [ReviewDocument] method.
   * </pre>
   *
   * <code>string human_review_operation = 3;</code>
   *
   * @return The bytes for humanReviewOperation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHumanReviewOperationBytes() {
    java.lang.Object ref = humanReviewOperation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      humanReviewOperation_ = b;
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
    if (state_
        != com.google.cloud.documentai.v1.HumanReviewStatus.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stateMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stateMessage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(humanReviewOperation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, humanReviewOperation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_
        != com.google.cloud.documentai.v1.HumanReviewStatus.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stateMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stateMessage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(humanReviewOperation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, humanReviewOperation_);
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
    if (!(obj instanceof com.google.cloud.documentai.v1.HumanReviewStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.HumanReviewStatus other =
        (com.google.cloud.documentai.v1.HumanReviewStatus) obj;

    if (state_ != other.state_) return false;
    if (!getStateMessage().equals(other.getStateMessage())) return false;
    if (!getHumanReviewOperation().equals(other.getHumanReviewOperation())) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + STATE_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getStateMessage().hashCode();
    hash = (37 * hash) + HUMAN_REVIEW_OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + getHumanReviewOperation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus parseFrom(
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

  public static Builder newBuilder(com.google.cloud.documentai.v1.HumanReviewStatus prototype) {
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
   * The status of human review on a processed document.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.HumanReviewStatus}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.HumanReviewStatus)
      com.google.cloud.documentai.v1.HumanReviewStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_HumanReviewStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_HumanReviewStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.HumanReviewStatus.class,
              com.google.cloud.documentai.v1.HumanReviewStatus.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.HumanReviewStatus.newBuilder()
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
      state_ = 0;

      stateMessage_ = "";

      humanReviewOperation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_HumanReviewStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.HumanReviewStatus getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.HumanReviewStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.HumanReviewStatus build() {
      com.google.cloud.documentai.v1.HumanReviewStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.HumanReviewStatus buildPartial() {
      com.google.cloud.documentai.v1.HumanReviewStatus result =
          new com.google.cloud.documentai.v1.HumanReviewStatus(this);
      result.state_ = state_;
      result.stateMessage_ = stateMessage_;
      result.humanReviewOperation_ = humanReviewOperation_;
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
      if (other instanceof com.google.cloud.documentai.v1.HumanReviewStatus) {
        return mergeFrom((com.google.cloud.documentai.v1.HumanReviewStatus) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.HumanReviewStatus other) {
      if (other == com.google.cloud.documentai.v1.HumanReviewStatus.getDefaultInstance())
        return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (!other.getStateMessage().isEmpty()) {
        stateMessage_ = other.stateMessage_;
        onChanged();
      }
      if (!other.getHumanReviewOperation().isEmpty()) {
        humanReviewOperation_ = other.humanReviewOperation_;
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
      com.google.cloud.documentai.v1.HumanReviewStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.documentai.v1.HumanReviewStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * The state of human review on the processing request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus.State state = 1;</code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * The state of human review on the processing request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus.State state = 1;</code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {

      state_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The state of human review on the processing request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus.State state = 1;</code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.documentai.v1.HumanReviewStatus.State getState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.documentai.v1.HumanReviewStatus.State result =
          com.google.cloud.documentai.v1.HumanReviewStatus.State.valueOf(state_);
      return result == null
          ? com.google.cloud.documentai.v1.HumanReviewStatus.State.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The state of human review on the processing request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus.State state = 1;</code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.documentai.v1.HumanReviewStatus.State value) {
      if (value == null) {
        throw new NullPointerException();
      }

      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The state of human review on the processing request.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.HumanReviewStatus.State state = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {

      state_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object stateMessage_ = "";
    /**
     *
     *
     * <pre>
     * A message providing more details about the human review state.
     * </pre>
     *
     * <code>string state_message = 2;</code>
     *
     * @return The stateMessage.
     */
    public java.lang.String getStateMessage() {
      java.lang.Object ref = stateMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stateMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A message providing more details about the human review state.
     * </pre>
     *
     * <code>string state_message = 2;</code>
     *
     * @return The bytes for stateMessage.
     */
    public com.google.protobuf.ByteString getStateMessageBytes() {
      java.lang.Object ref = stateMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        stateMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A message providing more details about the human review state.
     * </pre>
     *
     * <code>string state_message = 2;</code>
     *
     * @param value The stateMessage to set.
     * @return This builder for chaining.
     */
    public Builder setStateMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      stateMessage_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A message providing more details about the human review state.
     * </pre>
     *
     * <code>string state_message = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStateMessage() {

      stateMessage_ = getDefaultInstance().getStateMessage();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A message providing more details about the human review state.
     * </pre>
     *
     * <code>string state_message = 2;</code>
     *
     * @param value The bytes for stateMessage to set.
     * @return This builder for chaining.
     */
    public Builder setStateMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      stateMessage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object humanReviewOperation_ = "";
    /**
     *
     *
     * <pre>
     * The name of the operation triggered by the processed document. This field
     * is populated only when the [state] is [HUMAN_REVIEW_IN_PROGRESS]. It has
     * the same response type and metadata as the long running operation returned
     * by [ReviewDocument] method.
     * </pre>
     *
     * <code>string human_review_operation = 3;</code>
     *
     * @return The humanReviewOperation.
     */
    public java.lang.String getHumanReviewOperation() {
      java.lang.Object ref = humanReviewOperation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        humanReviewOperation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the operation triggered by the processed document. This field
     * is populated only when the [state] is [HUMAN_REVIEW_IN_PROGRESS]. It has
     * the same response type and metadata as the long running operation returned
     * by [ReviewDocument] method.
     * </pre>
     *
     * <code>string human_review_operation = 3;</code>
     *
     * @return The bytes for humanReviewOperation.
     */
    public com.google.protobuf.ByteString getHumanReviewOperationBytes() {
      java.lang.Object ref = humanReviewOperation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        humanReviewOperation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the operation triggered by the processed document. This field
     * is populated only when the [state] is [HUMAN_REVIEW_IN_PROGRESS]. It has
     * the same response type and metadata as the long running operation returned
     * by [ReviewDocument] method.
     * </pre>
     *
     * <code>string human_review_operation = 3;</code>
     *
     * @param value The humanReviewOperation to set.
     * @return This builder for chaining.
     */
    public Builder setHumanReviewOperation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      humanReviewOperation_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the operation triggered by the processed document. This field
     * is populated only when the [state] is [HUMAN_REVIEW_IN_PROGRESS]. It has
     * the same response type and metadata as the long running operation returned
     * by [ReviewDocument] method.
     * </pre>
     *
     * <code>string human_review_operation = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHumanReviewOperation() {

      humanReviewOperation_ = getDefaultInstance().getHumanReviewOperation();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the operation triggered by the processed document. This field
     * is populated only when the [state] is [HUMAN_REVIEW_IN_PROGRESS]. It has
     * the same response type and metadata as the long running operation returned
     * by [ReviewDocument] method.
     * </pre>
     *
     * <code>string human_review_operation = 3;</code>
     *
     * @param value The bytes for humanReviewOperation to set.
     * @return This builder for chaining.
     */
    public Builder setHumanReviewOperationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      humanReviewOperation_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.HumanReviewStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.HumanReviewStatus)
  private static final com.google.cloud.documentai.v1.HumanReviewStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.HumanReviewStatus();
  }

  public static com.google.cloud.documentai.v1.HumanReviewStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HumanReviewStatus> PARSER =
      new com.google.protobuf.AbstractParser<HumanReviewStatus>() {
        @java.lang.Override
        public HumanReviewStatus parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new HumanReviewStatus(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<HumanReviewStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HumanReviewStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.HumanReviewStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
