/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/gkehub/v1/feature.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.v1;

/**
 *
 *
 * <pre>
 * MembershipFeatureState contains Feature status information for a single
 * Membership.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1.MembershipFeatureState}
 */
public final class MembershipFeatureState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1.MembershipFeatureState)
    MembershipFeatureStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MembershipFeatureState.newBuilder() to construct.
  private MembershipFeatureState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MembershipFeatureState() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MembershipFeatureState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1.FeatureProto
        .internal_static_google_cloud_gkehub_v1_MembershipFeatureState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1.FeatureProto
        .internal_static_google_cloud_gkehub_v1_MembershipFeatureState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1.MembershipFeatureState.class,
            com.google.cloud.gkehub.v1.MembershipFeatureState.Builder.class);
  }

  private int bitField0_;
  private int featureStateCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object featureState_;

  public enum FeatureStateCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONFIGMANAGEMENT(106),
    FEATURESTATE_NOT_SET(0);
    private final int value;

    private FeatureStateCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FeatureStateCase valueOf(int value) {
      return forNumber(value);
    }

    public static FeatureStateCase forNumber(int value) {
      switch (value) {
        case 106:
          return CONFIGMANAGEMENT;
        case 0:
          return FEATURESTATE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public FeatureStateCase getFeatureStateCase() {
    return FeatureStateCase.forNumber(featureStateCase_);
  }

  public static final int CONFIGMANAGEMENT_FIELD_NUMBER = 106;
  /**
   *
   *
   * <pre>
   * Config Management-specific state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
   *
   * @return Whether the configmanagement field is set.
   */
  @java.lang.Override
  public boolean hasConfigmanagement() {
    return featureStateCase_ == 106;
  }
  /**
   *
   *
   * <pre>
   * Config Management-specific state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
   *
   * @return The configmanagement.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.MembershipState getConfigmanagement() {
    if (featureStateCase_ == 106) {
      return (com.google.cloud.gkehub.configmanagement.v1.MembershipState) featureState_;
    }
    return com.google.cloud.gkehub.configmanagement.v1.MembershipState.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Config Management-specific state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.MembershipStateOrBuilder
      getConfigmanagementOrBuilder() {
    if (featureStateCase_ == 106) {
      return (com.google.cloud.gkehub.configmanagement.v1.MembershipState) featureState_;
    }
    return com.google.cloud.gkehub.configmanagement.v1.MembershipState.getDefaultInstance();
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private com.google.cloud.gkehub.v1.FeatureState state_;
  /**
   *
   *
   * <pre>
   * The high-level state of this Feature for a single membership.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
   *
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The high-level state of this Feature for a single membership.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1.FeatureState getState() {
    return state_ == null ? com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance() : state_;
  }
  /**
   *
   *
   * <pre>
   * The high-level state of this Feature for a single membership.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1.FeatureStateOrBuilder getStateOrBuilder() {
    return state_ == null ? com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance() : state_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getState());
    }
    if (featureStateCase_ == 106) {
      output.writeMessage(
          106, (com.google.cloud.gkehub.configmanagement.v1.MembershipState) featureState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getState());
    }
    if (featureStateCase_ == 106) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              106, (com.google.cloud.gkehub.configmanagement.v1.MembershipState) featureState_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1.MembershipFeatureState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1.MembershipFeatureState other =
        (com.google.cloud.gkehub.v1.MembershipFeatureState) obj;

    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (!getState().equals(other.getState())) return false;
    }
    if (!getFeatureStateCase().equals(other.getFeatureStateCase())) return false;
    switch (featureStateCase_) {
      case 106:
        if (!getConfigmanagement().equals(other.getConfigmanagement())) return false;
        break;
      case 0:
      default:
    }
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
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    switch (featureStateCase_) {
      case 106:
        hash = (37 * hash) + CONFIGMANAGEMENT_FIELD_NUMBER;
        hash = (53 * hash) + getConfigmanagement().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkehub.v1.MembershipFeatureState prototype) {
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
   * MembershipFeatureState contains Feature status information for a single
   * Membership.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1.MembershipFeatureState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1.MembershipFeatureState)
      com.google.cloud.gkehub.v1.MembershipFeatureStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_MembershipFeatureState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_MembershipFeatureState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1.MembershipFeatureState.class,
              com.google.cloud.gkehub.v1.MembershipFeatureState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1.MembershipFeatureState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getStateFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (configmanagementBuilder_ != null) {
        configmanagementBuilder_.clear();
      }
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      featureStateCase_ = 0;
      featureState_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_MembershipFeatureState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.MembershipFeatureState getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1.MembershipFeatureState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.MembershipFeatureState build() {
      com.google.cloud.gkehub.v1.MembershipFeatureState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.MembershipFeatureState buildPartial() {
      com.google.cloud.gkehub.v1.MembershipFeatureState result =
          new com.google.cloud.gkehub.v1.MembershipFeatureState(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1.MembershipFeatureState result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = stateBuilder_ == null ? state_ : stateBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.gkehub.v1.MembershipFeatureState result) {
      result.featureStateCase_ = featureStateCase_;
      result.featureState_ = this.featureState_;
      if (featureStateCase_ == 106 && configmanagementBuilder_ != null) {
        result.featureState_ = configmanagementBuilder_.build();
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
      if (other instanceof com.google.cloud.gkehub.v1.MembershipFeatureState) {
        return mergeFrom((com.google.cloud.gkehub.v1.MembershipFeatureState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1.MembershipFeatureState other) {
      if (other == com.google.cloud.gkehub.v1.MembershipFeatureState.getDefaultInstance())
        return this;
      if (other.hasState()) {
        mergeState(other.getState());
      }
      switch (other.getFeatureStateCase()) {
        case CONFIGMANAGEMENT:
          {
            mergeConfigmanagement(other.getConfigmanagement());
            break;
          }
        case FEATURESTATE_NOT_SET:
          {
            break;
          }
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
                input.readMessage(getStateFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 10
            case 850:
              {
                input.readMessage(
                    getConfigmanagementFieldBuilder().getBuilder(), extensionRegistry);
                featureStateCase_ = 106;
                break;
              } // case 850
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

    private int featureStateCase_ = 0;
    private java.lang.Object featureState_;

    public FeatureStateCase getFeatureStateCase() {
      return FeatureStateCase.forNumber(featureStateCase_);
    }

    public Builder clearFeatureState() {
      featureStateCase_ = 0;
      featureState_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1.MembershipState,
            com.google.cloud.gkehub.configmanagement.v1.MembershipState.Builder,
            com.google.cloud.gkehub.configmanagement.v1.MembershipStateOrBuilder>
        configmanagementBuilder_;
    /**
     *
     *
     * <pre>
     * Config Management-specific state.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
     *
     * @return Whether the configmanagement field is set.
     */
    @java.lang.Override
    public boolean hasConfigmanagement() {
      return featureStateCase_ == 106;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific state.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
     *
     * @return The configmanagement.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.MembershipState getConfigmanagement() {
      if (configmanagementBuilder_ == null) {
        if (featureStateCase_ == 106) {
          return (com.google.cloud.gkehub.configmanagement.v1.MembershipState) featureState_;
        }
        return com.google.cloud.gkehub.configmanagement.v1.MembershipState.getDefaultInstance();
      } else {
        if (featureStateCase_ == 106) {
          return configmanagementBuilder_.getMessage();
        }
        return com.google.cloud.gkehub.configmanagement.v1.MembershipState.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific state.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
     */
    public Builder setConfigmanagement(
        com.google.cloud.gkehub.configmanagement.v1.MembershipState value) {
      if (configmanagementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featureState_ = value;
        onChanged();
      } else {
        configmanagementBuilder_.setMessage(value);
      }
      featureStateCase_ = 106;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific state.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
     */
    public Builder setConfigmanagement(
        com.google.cloud.gkehub.configmanagement.v1.MembershipState.Builder builderForValue) {
      if (configmanagementBuilder_ == null) {
        featureState_ = builderForValue.build();
        onChanged();
      } else {
        configmanagementBuilder_.setMessage(builderForValue.build());
      }
      featureStateCase_ = 106;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific state.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
     */
    public Builder mergeConfigmanagement(
        com.google.cloud.gkehub.configmanagement.v1.MembershipState value) {
      if (configmanagementBuilder_ == null) {
        if (featureStateCase_ == 106
            && featureState_
                != com.google.cloud.gkehub.configmanagement.v1.MembershipState
                    .getDefaultInstance()) {
          featureState_ =
              com.google.cloud.gkehub.configmanagement.v1.MembershipState.newBuilder(
                      (com.google.cloud.gkehub.configmanagement.v1.MembershipState) featureState_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          featureState_ = value;
        }
        onChanged();
      } else {
        if (featureStateCase_ == 106) {
          configmanagementBuilder_.mergeFrom(value);
        } else {
          configmanagementBuilder_.setMessage(value);
        }
      }
      featureStateCase_ = 106;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific state.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
     */
    public Builder clearConfigmanagement() {
      if (configmanagementBuilder_ == null) {
        if (featureStateCase_ == 106) {
          featureStateCase_ = 0;
          featureState_ = null;
          onChanged();
        }
      } else {
        if (featureStateCase_ == 106) {
          featureStateCase_ = 0;
          featureState_ = null;
        }
        configmanagementBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific state.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1.MembershipState.Builder
        getConfigmanagementBuilder() {
      return getConfigmanagementFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific state.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.MembershipStateOrBuilder
        getConfigmanagementOrBuilder() {
      if ((featureStateCase_ == 106) && (configmanagementBuilder_ != null)) {
        return configmanagementBuilder_.getMessageOrBuilder();
      } else {
        if (featureStateCase_ == 106) {
          return (com.google.cloud.gkehub.configmanagement.v1.MembershipState) featureState_;
        }
        return com.google.cloud.gkehub.configmanagement.v1.MembershipState.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific state.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1.MembershipState,
            com.google.cloud.gkehub.configmanagement.v1.MembershipState.Builder,
            com.google.cloud.gkehub.configmanagement.v1.MembershipStateOrBuilder>
        getConfigmanagementFieldBuilder() {
      if (configmanagementBuilder_ == null) {
        if (!(featureStateCase_ == 106)) {
          featureState_ =
              com.google.cloud.gkehub.configmanagement.v1.MembershipState.getDefaultInstance();
        }
        configmanagementBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.configmanagement.v1.MembershipState,
                com.google.cloud.gkehub.configmanagement.v1.MembershipState.Builder,
                com.google.cloud.gkehub.configmanagement.v1.MembershipStateOrBuilder>(
                (com.google.cloud.gkehub.configmanagement.v1.MembershipState) featureState_,
                getParentForChildren(),
                isClean());
        featureState_ = null;
      }
      featureStateCase_ = 106;
      onChanged();
      return configmanagementBuilder_;
    }

    private com.google.cloud.gkehub.v1.FeatureState state_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.v1.FeatureState,
            com.google.cloud.gkehub.v1.FeatureState.Builder,
            com.google.cloud.gkehub.v1.FeatureStateOrBuilder>
        stateBuilder_;
    /**
     *
     *
     * <pre>
     * The high-level state of this Feature for a single membership.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
     *
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The high-level state of this Feature for a single membership.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
     *
     * @return The state.
     */
    public com.google.cloud.gkehub.v1.FeatureState getState() {
      if (stateBuilder_ == null) {
        return state_ == null
            ? com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance()
            : state_;
      } else {
        return stateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The high-level state of this Feature for a single membership.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
     */
    public Builder setState(com.google.cloud.gkehub.v1.FeatureState value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        state_ = value;
      } else {
        stateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The high-level state of this Feature for a single membership.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
     */
    public Builder setState(com.google.cloud.gkehub.v1.FeatureState.Builder builderForValue) {
      if (stateBuilder_ == null) {
        state_ = builderForValue.build();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The high-level state of this Feature for a single membership.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
     */
    public Builder mergeState(com.google.cloud.gkehub.v1.FeatureState value) {
      if (stateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && state_ != null
            && state_ != com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance()) {
          getStateBuilder().mergeFrom(value);
        } else {
          state_ = value;
        }
      } else {
        stateBuilder_.mergeFrom(value);
      }
      if (state_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The high-level state of this Feature for a single membership.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The high-level state of this Feature for a single membership.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
     */
    public com.google.cloud.gkehub.v1.FeatureState.Builder getStateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The high-level state of this Feature for a single membership.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
     */
    public com.google.cloud.gkehub.v1.FeatureStateOrBuilder getStateOrBuilder() {
      if (stateBuilder_ != null) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        return state_ == null
            ? com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance()
            : state_;
      }
    }
    /**
     *
     *
     * <pre>
     * The high-level state of this Feature for a single membership.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.v1.FeatureState,
            com.google.cloud.gkehub.v1.FeatureState.Builder,
            com.google.cloud.gkehub.v1.FeatureStateOrBuilder>
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        stateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.v1.FeatureState,
                com.google.cloud.gkehub.v1.FeatureState.Builder,
                com.google.cloud.gkehub.v1.FeatureStateOrBuilder>(
                getState(), getParentForChildren(), isClean());
        state_ = null;
      }
      return stateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1.MembershipFeatureState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.MembershipFeatureState)
  private static final com.google.cloud.gkehub.v1.MembershipFeatureState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1.MembershipFeatureState();
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MembershipFeatureState> PARSER =
      new com.google.protobuf.AbstractParser<MembershipFeatureState>() {
        @java.lang.Override
        public MembershipFeatureState parsePartialFrom(
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

  public static com.google.protobuf.Parser<MembershipFeatureState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MembershipFeatureState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1.MembershipFeatureState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
