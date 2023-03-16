// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta/feature.proto

package com.google.cloud.gkehub.v1beta;

/**
 * <pre>
 * FeatureResourceState describes the state of a Feature *resource* in the
 * GkeHub API. See `FeatureState` for the "running state" of the Feature in the
 * Hub and across Memberships.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1beta.FeatureResourceState}
 */
public final class FeatureResourceState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1beta.FeatureResourceState)
    FeatureResourceStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeatureResourceState.newBuilder() to construct.
  private FeatureResourceState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeatureResourceState() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeatureResourceState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.v1beta.FeatureProto.internal_static_google_cloud_gkehub_v1beta_FeatureResourceState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1beta.FeatureProto.internal_static_google_cloud_gkehub_v1beta_FeatureResourceState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1beta.FeatureResourceState.class, com.google.cloud.gkehub.v1beta.FeatureResourceState.Builder.class);
  }

  /**
   * <pre>
   * State describes the lifecycle status of a Feature.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.gkehub.v1beta.FeatureResourceState.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * State is unknown or not set.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     * <pre>
     * The Feature is being enabled, and the Feature resource is being created.
     * Once complete, the corresponding Feature will be enabled in this Hub.
     * </pre>
     *
     * <code>ENABLING = 1;</code>
     */
    ENABLING(1),
    /**
     * <pre>
     * The Feature is enabled in this Hub, and the Feature resource is fully
     * available.
     * </pre>
     *
     * <code>ACTIVE = 2;</code>
     */
    ACTIVE(2),
    /**
     * <pre>
     * The Feature is being disabled in this Hub, and the Feature resource
     * is being deleted.
     * </pre>
     *
     * <code>DISABLING = 3;</code>
     */
    DISABLING(3),
    /**
     * <pre>
     * The Feature resource is being updated.
     * </pre>
     *
     * <code>UPDATING = 4;</code>
     */
    UPDATING(4),
    /**
     * <pre>
     * The Feature resource is being updated by the Hub Service.
     * </pre>
     *
     * <code>SERVICE_UPDATING = 5;</code>
     */
    SERVICE_UPDATING(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * State is unknown or not set.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The Feature is being enabled, and the Feature resource is being created.
     * Once complete, the corresponding Feature will be enabled in this Hub.
     * </pre>
     *
     * <code>ENABLING = 1;</code>
     */
    public static final int ENABLING_VALUE = 1;
    /**
     * <pre>
     * The Feature is enabled in this Hub, and the Feature resource is fully
     * available.
     * </pre>
     *
     * <code>ACTIVE = 2;</code>
     */
    public static final int ACTIVE_VALUE = 2;
    /**
     * <pre>
     * The Feature is being disabled in this Hub, and the Feature resource
     * is being deleted.
     * </pre>
     *
     * <code>DISABLING = 3;</code>
     */
    public static final int DISABLING_VALUE = 3;
    /**
     * <pre>
     * The Feature resource is being updated.
     * </pre>
     *
     * <code>UPDATING = 4;</code>
     */
    public static final int UPDATING_VALUE = 4;
    /**
     * <pre>
     * The Feature resource is being updated by the Hub Service.
     * </pre>
     *
     * <code>SERVICE_UPDATING = 5;</code>
     */
    public static final int SERVICE_UPDATING_VALUE = 5;


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
        case 0: return STATE_UNSPECIFIED;
        case 1: return ENABLING;
        case 2: return ACTIVE;
        case 3: return DISABLING;
        case 4: return UPDATING;
        case 5: return SERVICE_UPDATING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.gkehub.v1beta.FeatureResourceState.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
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

    // @@protoc_insertion_point(enum_scope:google.cloud.gkehub.v1beta.FeatureResourceState.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_ = 0;
  /**
   * <pre>
   * The current state of the Feature resource in the Hub API.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1beta.FeatureResourceState.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * The current state of the Feature resource in the Hub API.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1beta.FeatureResourceState.State state = 1;</code>
   * @return The state.
   */
  @java.lang.Override public com.google.cloud.gkehub.v1beta.FeatureResourceState.State getState() {
    com.google.cloud.gkehub.v1beta.FeatureResourceState.State result = com.google.cloud.gkehub.v1beta.FeatureResourceState.State.forNumber(state_);
    return result == null ? com.google.cloud.gkehub.v1beta.FeatureResourceState.State.UNRECOGNIZED : result;
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
    if (state_ != com.google.cloud.gkehub.v1beta.FeatureResourceState.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, state_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != com.google.cloud.gkehub.v1beta.FeatureResourceState.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1beta.FeatureResourceState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1beta.FeatureResourceState other = (com.google.cloud.gkehub.v1beta.FeatureResourceState) obj;

    if (state_ != other.state_) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta.FeatureResourceState parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.v1beta.FeatureResourceState prototype) {
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
   * FeatureResourceState describes the state of a Feature *resource* in the
   * GkeHub API. See `FeatureState` for the "running state" of the Feature in the
   * Hub and across Memberships.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1beta.FeatureResourceState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1beta.FeatureResourceState)
      com.google.cloud.gkehub.v1beta.FeatureResourceStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.v1beta.FeatureProto.internal_static_google_cloud_gkehub_v1beta_FeatureResourceState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1beta.FeatureProto.internal_static_google_cloud_gkehub_v1beta_FeatureResourceState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1beta.FeatureResourceState.class, com.google.cloud.gkehub.v1beta.FeatureResourceState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1beta.FeatureResourceState.newBuilder()
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
      state_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.v1beta.FeatureProto.internal_static_google_cloud_gkehub_v1beta_FeatureResourceState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta.FeatureResourceState getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1beta.FeatureResourceState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta.FeatureResourceState build() {
      com.google.cloud.gkehub.v1beta.FeatureResourceState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta.FeatureResourceState buildPartial() {
      com.google.cloud.gkehub.v1beta.FeatureResourceState result = new com.google.cloud.gkehub.v1beta.FeatureResourceState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1beta.FeatureResourceState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
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
      if (other instanceof com.google.cloud.gkehub.v1beta.FeatureResourceState) {
        return mergeFrom((com.google.cloud.gkehub.v1beta.FeatureResourceState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1beta.FeatureResourceState other) {
      if (other == com.google.cloud.gkehub.v1beta.FeatureResourceState.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
              state_ = input.readEnum();
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

    private int state_ = 0;
    /**
     * <pre>
     * The current state of the Feature resource in the Hub API.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1beta.FeatureResourceState.State state = 1;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * The current state of the Feature resource in the Hub API.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1beta.FeatureResourceState.State state = 1;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The current state of the Feature resource in the Hub API.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1beta.FeatureResourceState.State state = 1;</code>
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.v1beta.FeatureResourceState.State getState() {
      com.google.cloud.gkehub.v1beta.FeatureResourceState.State result = com.google.cloud.gkehub.v1beta.FeatureResourceState.State.forNumber(state_);
      return result == null ? com.google.cloud.gkehub.v1beta.FeatureResourceState.State.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The current state of the Feature resource in the Hub API.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1beta.FeatureResourceState.State state = 1;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.gkehub.v1beta.FeatureResourceState.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The current state of the Feature resource in the Hub API.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1beta.FeatureResourceState.State state = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1beta.FeatureResourceState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1beta.FeatureResourceState)
  private static final com.google.cloud.gkehub.v1beta.FeatureResourceState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1beta.FeatureResourceState();
  }

  public static com.google.cloud.gkehub.v1beta.FeatureResourceState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureResourceState>
      PARSER = new com.google.protobuf.AbstractParser<FeatureResourceState>() {
    @java.lang.Override
    public FeatureResourceState parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureResourceState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureResourceState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1beta.FeatureResourceState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

