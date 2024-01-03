/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/discoveryengine/v1alpha/site_search_engine.proto

package com.google.cloud.discoveryengine.v1alpha;

/**
 *
 *
 * <pre>
 * Verification information for target sites in advanced site search.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1alpha.SiteVerificationInfo}
 */
public final class SiteVerificationInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1alpha.SiteVerificationInfo)
    SiteVerificationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SiteVerificationInfo.newBuilder() to construct.
  private SiteVerificationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SiteVerificationInfo() {
    siteVerificationState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SiteVerificationInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1alpha.SiteSearchEngineProto
        .internal_static_google_cloud_discoveryengine_v1alpha_SiteVerificationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1alpha.SiteSearchEngineProto
        .internal_static_google_cloud_discoveryengine_v1alpha_SiteVerificationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.class,
            com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Site verification state.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState}
   */
  public enum SiteVerificationState implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Defaults to VERIFIED.
     * </pre>
     *
     * <code>SITE_VERIFICATION_STATE_UNSPECIFIED = 0;</code>
     */
    SITE_VERIFICATION_STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Site ownership verified.
     * </pre>
     *
     * <code>VERIFIED = 1;</code>
     */
    VERIFIED(1),
    /**
     *
     *
     * <pre>
     * Site ownership pending verification or verification failed.
     * </pre>
     *
     * <code>UNVERIFIED = 2;</code>
     */
    UNVERIFIED(2),
    /**
     *
     *
     * <pre>
     * Site exempt from verification, e.g. a public website that opens to all.
     * </pre>
     *
     * <code>EXEMPTED = 3;</code>
     */
    EXEMPTED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Defaults to VERIFIED.
     * </pre>
     *
     * <code>SITE_VERIFICATION_STATE_UNSPECIFIED = 0;</code>
     */
    public static final int SITE_VERIFICATION_STATE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Site ownership verified.
     * </pre>
     *
     * <code>VERIFIED = 1;</code>
     */
    public static final int VERIFIED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Site ownership pending verification or verification failed.
     * </pre>
     *
     * <code>UNVERIFIED = 2;</code>
     */
    public static final int UNVERIFIED_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Site exempt from verification, e.g. a public website that opens to all.
     * </pre>
     *
     * <code>EXEMPTED = 3;</code>
     */
    public static final int EXEMPTED_VALUE = 3;

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
    public static SiteVerificationState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SiteVerificationState forNumber(int value) {
      switch (value) {
        case 0:
          return SITE_VERIFICATION_STATE_UNSPECIFIED;
        case 1:
          return VERIFIED;
        case 2:
          return UNVERIFIED;
        case 3:
          return EXEMPTED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SiteVerificationState>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<SiteVerificationState>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<SiteVerificationState>() {
              public SiteVerificationState findValueByNumber(int number) {
                return SiteVerificationState.forNumber(number);
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
      return com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final SiteVerificationState[] VALUES = values();

    public static SiteVerificationState valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SiteVerificationState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState)
  }

  public static final int SITE_VERIFICATION_STATE_FIELD_NUMBER = 1;
  private int siteVerificationState_ = 0;
  /**
   *
   *
   * <pre>
   * Site verification state indicating the ownership and validity.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState site_verification_state = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for siteVerificationState.
   */
  @java.lang.Override
  public int getSiteVerificationStateValue() {
    return siteVerificationState_;
  }
  /**
   *
   *
   * <pre>
   * Site verification state indicating the ownership and validity.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState site_verification_state = 1;
   * </code>
   *
   * @return The siteVerificationState.
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState
      getSiteVerificationState() {
    com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState result =
        com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState
            .forNumber(siteVerificationState_);
    return result == null
        ? com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState
            .UNRECOGNIZED
        : result;
  }

  public static final int VERIFY_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp verifyTime_;
  /**
   *
   *
   * <pre>
   * Latest site verification time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   *
   * @return Whether the verifyTime field is set.
   */
  @java.lang.Override
  public boolean hasVerifyTime() {
    return verifyTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Latest site verification time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   *
   * @return The verifyTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getVerifyTime() {
    return verifyTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : verifyTime_;
  }
  /**
   *
   *
   * <pre>
   * Latest site verification time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getVerifyTimeOrBuilder() {
    return verifyTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : verifyTime_;
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
    if (siteVerificationState_
        != com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState
            .SITE_VERIFICATION_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, siteVerificationState_);
    }
    if (verifyTime_ != null) {
      output.writeMessage(2, getVerifyTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (siteVerificationState_
        != com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState
            .SITE_VERIFICATION_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, siteVerificationState_);
    }
    if (verifyTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getVerifyTime());
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo other =
        (com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo) obj;

    if (siteVerificationState_ != other.siteVerificationState_) return false;
    if (hasVerifyTime() != other.hasVerifyTime()) return false;
    if (hasVerifyTime()) {
      if (!getVerifyTime().equals(other.getVerifyTime())) return false;
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
    hash = (37 * hash) + SITE_VERIFICATION_STATE_FIELD_NUMBER;
    hash = (53 * hash) + siteVerificationState_;
    if (hasVerifyTime()) {
      hash = (37 * hash) + VERIFY_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getVerifyTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo parseFrom(
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
      com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo prototype) {
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
   * Verification information for target sites in advanced site search.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1alpha.SiteVerificationInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1alpha.SiteVerificationInfo)
      com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1alpha.SiteSearchEngineProto
          .internal_static_google_cloud_discoveryengine_v1alpha_SiteVerificationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1alpha.SiteSearchEngineProto
          .internal_static_google_cloud_discoveryengine_v1alpha_SiteVerificationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.class,
              com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      siteVerificationState_ = 0;
      verifyTime_ = null;
      if (verifyTimeBuilder_ != null) {
        verifyTimeBuilder_.dispose();
        verifyTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1alpha.SiteSearchEngineProto
          .internal_static_google_cloud_discoveryengine_v1alpha_SiteVerificationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo
        getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo build() {
      com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo buildPartial() {
      com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo result =
          new com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.siteVerificationState_ = siteVerificationState_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.verifyTime_ = verifyTimeBuilder_ == null ? verifyTime_ : verifyTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo) {
        return mergeFrom((com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo other) {
      if (other
          == com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.getDefaultInstance())
        return this;
      if (other.siteVerificationState_ != 0) {
        setSiteVerificationStateValue(other.getSiteVerificationStateValue());
      }
      if (other.hasVerifyTime()) {
        mergeVerifyTime(other.getVerifyTime());
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
            case 8:
              {
                siteVerificationState_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getVerifyTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private int siteVerificationState_ = 0;
    /**
     *
     *
     * <pre>
     * Site verification state indicating the ownership and validity.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState site_verification_state = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for siteVerificationState.
     */
    @java.lang.Override
    public int getSiteVerificationStateValue() {
      return siteVerificationState_;
    }
    /**
     *
     *
     * <pre>
     * Site verification state indicating the ownership and validity.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState site_verification_state = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for siteVerificationState to set.
     * @return This builder for chaining.
     */
    public Builder setSiteVerificationStateValue(int value) {
      siteVerificationState_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Site verification state indicating the ownership and validity.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState site_verification_state = 1;
     * </code>
     *
     * @return The siteVerificationState.
     */
    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState
        getSiteVerificationState() {
      com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState result =
          com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState
              .forNumber(siteVerificationState_);
      return result == null
          ? com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState
              .UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Site verification state indicating the ownership and validity.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState site_verification_state = 1;
     * </code>
     *
     * @param value The siteVerificationState to set.
     * @return This builder for chaining.
     */
    public Builder setSiteVerificationState(
        com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      siteVerificationState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Site verification state indicating the ownership and validity.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState site_verification_state = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSiteVerificationState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      siteVerificationState_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp verifyTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        verifyTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Latest site verification time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp verify_time = 2;</code>
     *
     * @return Whether the verifyTime field is set.
     */
    public boolean hasVerifyTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Latest site verification time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp verify_time = 2;</code>
     *
     * @return The verifyTime.
     */
    public com.google.protobuf.Timestamp getVerifyTime() {
      if (verifyTimeBuilder_ == null) {
        return verifyTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : verifyTime_;
      } else {
        return verifyTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Latest site verification time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp verify_time = 2;</code>
     */
    public Builder setVerifyTime(com.google.protobuf.Timestamp value) {
      if (verifyTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        verifyTime_ = value;
      } else {
        verifyTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Latest site verification time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp verify_time = 2;</code>
     */
    public Builder setVerifyTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (verifyTimeBuilder_ == null) {
        verifyTime_ = builderForValue.build();
      } else {
        verifyTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Latest site verification time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp verify_time = 2;</code>
     */
    public Builder mergeVerifyTime(com.google.protobuf.Timestamp value) {
      if (verifyTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && verifyTime_ != null
            && verifyTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getVerifyTimeBuilder().mergeFrom(value);
        } else {
          verifyTime_ = value;
        }
      } else {
        verifyTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Latest site verification time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp verify_time = 2;</code>
     */
    public Builder clearVerifyTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      verifyTime_ = null;
      if (verifyTimeBuilder_ != null) {
        verifyTimeBuilder_.dispose();
        verifyTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Latest site verification time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp verify_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getVerifyTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getVerifyTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Latest site verification time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp verify_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getVerifyTimeOrBuilder() {
      if (verifyTimeBuilder_ != null) {
        return verifyTimeBuilder_.getMessageOrBuilder();
      } else {
        return verifyTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : verifyTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Latest site verification time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp verify_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getVerifyTimeFieldBuilder() {
      if (verifyTimeBuilder_ == null) {
        verifyTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getVerifyTime(), getParentForChildren(), isClean());
        verifyTime_ = null;
      }
      return verifyTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1alpha.SiteVerificationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1alpha.SiteVerificationInfo)
  private static final com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo();
  }

  public static com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SiteVerificationInfo> PARSER =
      new com.google.protobuf.AbstractParser<SiteVerificationInfo>() {
        @java.lang.Override
        public SiteVerificationInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<SiteVerificationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SiteVerificationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
