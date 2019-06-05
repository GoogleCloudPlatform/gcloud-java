// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/operations.proto

package com.google.cloud.dataproc.v1beta2;

/**
 *
 *
 * <pre>
 * The status of the operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1beta2.ClusterOperationStatus}
 */
public final class ClusterOperationStatus extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1beta2.ClusterOperationStatus)
    ClusterOperationStatusOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ClusterOperationStatus.newBuilder() to construct.
  private ClusterOperationStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ClusterOperationStatus() {
    state_ = 0;
    innerState_ = "";
    details_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ClusterOperationStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ClusterOperationStatus(
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

              innerState_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              details_ = s;
              break;
            }
          case 34:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (stateStartTime_ != null) {
                subBuilder = stateStartTime_.toBuilder();
              }
              stateStartTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(stateStartTime_);
                stateStartTime_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.dataproc.v1beta2.OperationsProto
        .internal_static_google_cloud_dataproc_v1beta2_ClusterOperationStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1beta2.OperationsProto
        .internal_static_google_cloud_dataproc_v1beta2_ClusterOperationStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.class,
            com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The operation state.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dataproc.v1beta2.ClusterOperationStatus.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unused.
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     *
     *
     * <pre>
     * The operation has been created.
     * </pre>
     *
     * <code>PENDING = 1;</code>
     */
    PENDING(1),
    /**
     *
     *
     * <pre>
     * The operation is running.
     * </pre>
     *
     * <code>RUNNING = 2;</code>
     */
    RUNNING(2),
    /**
     *
     *
     * <pre>
     * The operation is done; either cancelled or completed.
     * </pre>
     *
     * <code>DONE = 3;</code>
     */
    DONE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unused.
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The operation has been created.
     * </pre>
     *
     * <code>PENDING = 1;</code>
     */
    public static final int PENDING_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The operation is running.
     * </pre>
     *
     * <code>RUNNING = 2;</code>
     */
    public static final int RUNNING_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The operation is done; either cancelled or completed.
     * </pre>
     *
     * <code>DONE = 3;</code>
     */
    public static final int DONE_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return UNKNOWN;
        case 1:
          return PENDING;
        case 2:
          return RUNNING;
        case 3:
          return DONE;
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
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.getDescriptor()
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

    // @@protoc_insertion_point(enum_scope:google.cloud.dataproc.v1beta2.ClusterOperationStatus.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_;
  /**
   *
   *
   * <pre>
   * Output only. A message containing the operation state.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State state = 1;</code>
   */
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * Output only. A message containing the operation state.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State state = 1;</code>
   */
  public com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State getState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State result =
        com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State.valueOf(state_);
    return result == null
        ? com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State.UNRECOGNIZED
        : result;
  }

  public static final int INNER_STATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object innerState_;
  /**
   *
   *
   * <pre>
   * Output only. A message containing the detailed operation state.
   * </pre>
   *
   * <code>string inner_state = 2;</code>
   */
  public java.lang.String getInnerState() {
    java.lang.Object ref = innerState_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      innerState_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. A message containing the detailed operation state.
   * </pre>
   *
   * <code>string inner_state = 2;</code>
   */
  public com.google.protobuf.ByteString getInnerStateBytes() {
    java.lang.Object ref = innerState_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      innerState_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DETAILS_FIELD_NUMBER = 3;
  private volatile java.lang.Object details_;
  /**
   *
   *
   * <pre>
   * Output only. A message containing any operation metadata details.
   * </pre>
   *
   * <code>string details = 3;</code>
   */
  public java.lang.String getDetails() {
    java.lang.Object ref = details_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      details_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. A message containing any operation metadata details.
   * </pre>
   *
   * <code>string details = 3;</code>
   */
  public com.google.protobuf.ByteString getDetailsBytes() {
    java.lang.Object ref = details_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      details_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_START_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp stateStartTime_;
  /**
   *
   *
   * <pre>
   * Output only. The time this state was entered.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
   */
  public boolean hasStateStartTime() {
    return stateStartTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. The time this state was entered.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
   */
  public com.google.protobuf.Timestamp getStateStartTime() {
    return stateStartTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : stateStartTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The time this state was entered.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getStateStartTimeOrBuilder() {
    return getStateStartTime();
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
        != com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State.UNKNOWN.getNumber()) {
      output.writeEnum(1, state_);
    }
    if (!getInnerStateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, innerState_);
    }
    if (!getDetailsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, details_);
    }
    if (stateStartTime_ != null) {
      output.writeMessage(4, getStateStartTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_
        != com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, state_);
    }
    if (!getInnerStateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, innerState_);
    }
    if (!getDetailsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, details_);
    }
    if (stateStartTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getStateStartTime());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1beta2.ClusterOperationStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1beta2.ClusterOperationStatus other =
        (com.google.cloud.dataproc.v1beta2.ClusterOperationStatus) obj;

    if (state_ != other.state_) return false;
    if (!getInnerState().equals(other.getInnerState())) return false;
    if (!getDetails().equals(other.getDetails())) return false;
    if (hasStateStartTime() != other.hasStateStartTime()) return false;
    if (hasStateStartTime()) {
      if (!getStateStartTime().equals(other.getStateStartTime())) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + INNER_STATE_FIELD_NUMBER;
    hash = (53 * hash) + getInnerState().hashCode();
    hash = (37 * hash) + DETAILS_FIELD_NUMBER;
    hash = (53 * hash) + getDetails().hashCode();
    if (hasStateStartTime()) {
      hash = (37 * hash) + STATE_START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStateStartTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parseFrom(
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
      com.google.cloud.dataproc.v1beta2.ClusterOperationStatus prototype) {
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
   * The status of the operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1beta2.ClusterOperationStatus}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1beta2.ClusterOperationStatus)
      com.google.cloud.dataproc.v1beta2.ClusterOperationStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.OperationsProto
          .internal_static_google_cloud_dataproc_v1beta2_ClusterOperationStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1beta2.OperationsProto
          .internal_static_google_cloud_dataproc_v1beta2_ClusterOperationStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.class,
              com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.newBuilder()
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

      innerState_ = "";

      details_ = "";

      if (stateStartTimeBuilder_ == null) {
        stateStartTime_ = null;
      } else {
        stateStartTime_ = null;
        stateStartTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1beta2.OperationsProto
          .internal_static_google_cloud_dataproc_v1beta2_ClusterOperationStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.ClusterOperationStatus getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.ClusterOperationStatus build() {
      com.google.cloud.dataproc.v1beta2.ClusterOperationStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.ClusterOperationStatus buildPartial() {
      com.google.cloud.dataproc.v1beta2.ClusterOperationStatus result =
          new com.google.cloud.dataproc.v1beta2.ClusterOperationStatus(this);
      result.state_ = state_;
      result.innerState_ = innerState_;
      result.details_ = details_;
      if (stateStartTimeBuilder_ == null) {
        result.stateStartTime_ = stateStartTime_;
      } else {
        result.stateStartTime_ = stateStartTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1beta2.ClusterOperationStatus) {
        return mergeFrom((com.google.cloud.dataproc.v1beta2.ClusterOperationStatus) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1beta2.ClusterOperationStatus other) {
      if (other == com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.getDefaultInstance())
        return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (!other.getInnerState().isEmpty()) {
        innerState_ = other.innerState_;
        onChanged();
      }
      if (!other.getDetails().isEmpty()) {
        details_ = other.details_;
        onChanged();
      }
      if (other.hasStateStartTime()) {
        mergeStateStartTime(other.getStateStartTime());
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
      com.google.cloud.dataproc.v1beta2.ClusterOperationStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataproc.v1beta2.ClusterOperationStatus) e.getUnfinishedMessage();
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
     * Output only. A message containing the operation state.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State state = 1;</code>
     */
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * Output only. A message containing the operation state.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State state = 1;</code>
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
     * Output only. A message containing the operation state.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State state = 1;</code>
     */
    public com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State getState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State result =
          com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State.valueOf(state_);
      return result == null
          ? com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. A message containing the operation state.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State state = 1;</code>
     */
    public Builder setState(com.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State value) {
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
     * Output only. A message containing the operation state.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterOperationStatus.State state = 1;</code>
     */
    public Builder clearState() {

      state_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object innerState_ = "";
    /**
     *
     *
     * <pre>
     * Output only. A message containing the detailed operation state.
     * </pre>
     *
     * <code>string inner_state = 2;</code>
     */
    public java.lang.String getInnerState() {
      java.lang.Object ref = innerState_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        innerState_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. A message containing the detailed operation state.
     * </pre>
     *
     * <code>string inner_state = 2;</code>
     */
    public com.google.protobuf.ByteString getInnerStateBytes() {
      java.lang.Object ref = innerState_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        innerState_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. A message containing the detailed operation state.
     * </pre>
     *
     * <code>string inner_state = 2;</code>
     */
    public Builder setInnerState(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      innerState_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A message containing the detailed operation state.
     * </pre>
     *
     * <code>string inner_state = 2;</code>
     */
    public Builder clearInnerState() {

      innerState_ = getDefaultInstance().getInnerState();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A message containing the detailed operation state.
     * </pre>
     *
     * <code>string inner_state = 2;</code>
     */
    public Builder setInnerStateBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      innerState_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object details_ = "";
    /**
     *
     *
     * <pre>
     * Output only. A message containing any operation metadata details.
     * </pre>
     *
     * <code>string details = 3;</code>
     */
    public java.lang.String getDetails() {
      java.lang.Object ref = details_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        details_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. A message containing any operation metadata details.
     * </pre>
     *
     * <code>string details = 3;</code>
     */
    public com.google.protobuf.ByteString getDetailsBytes() {
      java.lang.Object ref = details_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        details_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. A message containing any operation metadata details.
     * </pre>
     *
     * <code>string details = 3;</code>
     */
    public Builder setDetails(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      details_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A message containing any operation metadata details.
     * </pre>
     *
     * <code>string details = 3;</code>
     */
    public Builder clearDetails() {

      details_ = getDefaultInstance().getDetails();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A message containing any operation metadata details.
     * </pre>
     *
     * <code>string details = 3;</code>
     */
    public Builder setDetailsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      details_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp stateStartTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        stateStartTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The time this state was entered.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
     */
    public boolean hasStateStartTime() {
      return stateStartTimeBuilder_ != null || stateStartTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only. The time this state was entered.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
     */
    public com.google.protobuf.Timestamp getStateStartTime() {
      if (stateStartTimeBuilder_ == null) {
        return stateStartTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : stateStartTime_;
      } else {
        return stateStartTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The time this state was entered.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
     */
    public Builder setStateStartTime(com.google.protobuf.Timestamp value) {
      if (stateStartTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stateStartTime_ = value;
        onChanged();
      } else {
        stateStartTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The time this state was entered.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
     */
    public Builder setStateStartTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (stateStartTimeBuilder_ == null) {
        stateStartTime_ = builderForValue.build();
        onChanged();
      } else {
        stateStartTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The time this state was entered.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
     */
    public Builder mergeStateStartTime(com.google.protobuf.Timestamp value) {
      if (stateStartTimeBuilder_ == null) {
        if (stateStartTime_ != null) {
          stateStartTime_ =
              com.google.protobuf.Timestamp.newBuilder(stateStartTime_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          stateStartTime_ = value;
        }
        onChanged();
      } else {
        stateStartTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The time this state was entered.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
     */
    public Builder clearStateStartTime() {
      if (stateStartTimeBuilder_ == null) {
        stateStartTime_ = null;
        onChanged();
      } else {
        stateStartTime_ = null;
        stateStartTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The time this state was entered.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStateStartTimeBuilder() {

      onChanged();
      return getStateStartTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The time this state was entered.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStateStartTimeOrBuilder() {
      if (stateStartTimeBuilder_ != null) {
        return stateStartTimeBuilder_.getMessageOrBuilder();
      } else {
        return stateStartTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : stateStartTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The time this state was entered.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp state_start_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getStateStartTimeFieldBuilder() {
      if (stateStartTimeBuilder_ == null) {
        stateStartTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getStateStartTime(), getParentForChildren(), isClean());
        stateStartTime_ = null;
      }
      return stateStartTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1beta2.ClusterOperationStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1beta2.ClusterOperationStatus)
  private static final com.google.cloud.dataproc.v1beta2.ClusterOperationStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1beta2.ClusterOperationStatus();
  }

  public static com.google.cloud.dataproc.v1beta2.ClusterOperationStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterOperationStatus> PARSER =
      new com.google.protobuf.AbstractParser<ClusterOperationStatus>() {
        @java.lang.Override
        public ClusterOperationStatus parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ClusterOperationStatus(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ClusterOperationStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterOperationStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1beta2.ClusterOperationStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
