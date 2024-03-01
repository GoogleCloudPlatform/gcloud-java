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
// source: google/privacy/dlp/v2/storage.proto

// Protobuf Java Version: 3.25.2
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Type of information detected by the API.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.InfoType}
 */
public final class InfoType extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.InfoType)
    InfoTypeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InfoType.newBuilder() to construct.
  private InfoType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InfoType() {
    name_ = "";
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InfoType();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_InfoType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_InfoType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.InfoType.class,
            com.google.privacy.dlp.v2.InfoType.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Name of the information type. Either a name of your choosing when
   * creating a CustomInfoType, or one of the names listed
   * at https://cloud.google.com/dlp/docs/infotypes-reference when specifying
   * a built-in type.  When sending Cloud DLP results to Data Catalog, infoType
   * names should conform to the pattern `[A-Za-z0-9$_-]{1,64}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the information type. Either a name of your choosing when
   * creating a CustomInfoType, or one of the names listed
   * at https://cloud.google.com/dlp/docs/infotypes-reference when specifying
   * a built-in type.  When sending Cloud DLP results to Data Catalog, infoType
   * names should conform to the pattern `[A-Za-z0-9$_-]{1,64}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   *
   *
   * <pre>
   * Optional version name for this InfoType.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional version name for this InfoType.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENSITIVITY_SCORE_FIELD_NUMBER = 3;
  private com.google.privacy.dlp.v2.SensitivityScore sensitivityScore_;
  /**
   *
   *
   * <pre>
   * Optional custom sensitivity for this InfoType.
   * This only applies to data profiling.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
   *
   * @return Whether the sensitivityScore field is set.
   */
  @java.lang.Override
  public boolean hasSensitivityScore() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional custom sensitivity for this InfoType.
   * This only applies to data profiling.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
   *
   * @return The sensitivityScore.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.SensitivityScore getSensitivityScore() {
    return sensitivityScore_ == null
        ? com.google.privacy.dlp.v2.SensitivityScore.getDefaultInstance()
        : sensitivityScore_;
  }
  /**
   *
   *
   * <pre>
   * Optional custom sensitivity for this InfoType.
   * This only applies to data profiling.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.SensitivityScoreOrBuilder getSensitivityScoreOrBuilder() {
    return sensitivityScore_ == null
        ? com.google.privacy.dlp.v2.SensitivityScore.getDefaultInstance()
        : sensitivityScore_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getSensitivityScore());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getSensitivityScore());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.InfoType)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.InfoType other = (com.google.privacy.dlp.v2.InfoType) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getVersion().equals(other.getVersion())) return false;
    if (hasSensitivityScore() != other.hasSensitivityScore()) return false;
    if (hasSensitivityScore()) {
      if (!getSensitivityScore().equals(other.getSensitivityScore())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    if (hasSensitivityScore()) {
      hash = (37 * hash) + SENSITIVITY_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getSensitivityScore().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.InfoType parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.InfoType parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.InfoType parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.InfoType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.InfoType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.InfoType parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.InfoType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.InfoType parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.InfoType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.InfoType parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.InfoType parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.InfoType parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.InfoType prototype) {
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
   * Type of information detected by the API.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.InfoType}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.InfoType)
      com.google.privacy.dlp.v2.InfoTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_InfoType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_InfoType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.InfoType.class,
              com.google.privacy.dlp.v2.InfoType.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.InfoType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSensitivityScoreFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      version_ = "";
      sensitivityScore_ = null;
      if (sensitivityScoreBuilder_ != null) {
        sensitivityScoreBuilder_.dispose();
        sensitivityScoreBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_InfoType_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InfoType getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.InfoType.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InfoType build() {
      com.google.privacy.dlp.v2.InfoType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InfoType buildPartial() {
      com.google.privacy.dlp.v2.InfoType result = new com.google.privacy.dlp.v2.InfoType(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.InfoType result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = version_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sensitivityScore_ =
            sensitivityScoreBuilder_ == null ? sensitivityScore_ : sensitivityScoreBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.privacy.dlp.v2.InfoType) {
        return mergeFrom((com.google.privacy.dlp.v2.InfoType) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.InfoType other) {
      if (other == com.google.privacy.dlp.v2.InfoType.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSensitivityScore()) {
        mergeSensitivityScore(other.getSensitivityScore());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                version_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(
                    getSensitivityScoreFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Name of the information type. Either a name of your choosing when
     * creating a CustomInfoType, or one of the names listed
     * at https://cloud.google.com/dlp/docs/infotypes-reference when specifying
     * a built-in type.  When sending Cloud DLP results to Data Catalog, infoType
     * names should conform to the pattern `[A-Za-z0-9$_-]{1,64}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the information type. Either a name of your choosing when
     * creating a CustomInfoType, or one of the names listed
     * at https://cloud.google.com/dlp/docs/infotypes-reference when specifying
     * a built-in type.  When sending Cloud DLP results to Data Catalog, infoType
     * names should conform to the pattern `[A-Za-z0-9$_-]{1,64}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the information type. Either a name of your choosing when
     * creating a CustomInfoType, or one of the names listed
     * at https://cloud.google.com/dlp/docs/infotypes-reference when specifying
     * a built-in type.  When sending Cloud DLP results to Data Catalog, infoType
     * names should conform to the pattern `[A-Za-z0-9$_-]{1,64}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the information type. Either a name of your choosing when
     * creating a CustomInfoType, or one of the names listed
     * at https://cloud.google.com/dlp/docs/infotypes-reference when specifying
     * a built-in type.  When sending Cloud DLP results to Data Catalog, infoType
     * names should conform to the pattern `[A-Za-z0-9$_-]{1,64}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the information type. Either a name of your choosing when
     * creating a CustomInfoType, or one of the names listed
     * at https://cloud.google.com/dlp/docs/infotypes-reference when specifying
     * a built-in type.  When sending Cloud DLP results to Data Catalog, infoType
     * names should conform to the pattern `[A-Za-z0-9$_-]{1,64}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * Optional version name for this InfoType.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional version name for this InfoType.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional version name for this InfoType.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional version name for this InfoType.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional version name for this InfoType.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.privacy.dlp.v2.SensitivityScore sensitivityScore_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.SensitivityScore,
            com.google.privacy.dlp.v2.SensitivityScore.Builder,
            com.google.privacy.dlp.v2.SensitivityScoreOrBuilder>
        sensitivityScoreBuilder_;
    /**
     *
     *
     * <pre>
     * Optional custom sensitivity for this InfoType.
     * This only applies to data profiling.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
     *
     * @return Whether the sensitivityScore field is set.
     */
    public boolean hasSensitivityScore() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional custom sensitivity for this InfoType.
     * This only applies to data profiling.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
     *
     * @return The sensitivityScore.
     */
    public com.google.privacy.dlp.v2.SensitivityScore getSensitivityScore() {
      if (sensitivityScoreBuilder_ == null) {
        return sensitivityScore_ == null
            ? com.google.privacy.dlp.v2.SensitivityScore.getDefaultInstance()
            : sensitivityScore_;
      } else {
        return sensitivityScoreBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional custom sensitivity for this InfoType.
     * This only applies to data profiling.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
     */
    public Builder setSensitivityScore(com.google.privacy.dlp.v2.SensitivityScore value) {
      if (sensitivityScoreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sensitivityScore_ = value;
      } else {
        sensitivityScoreBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional custom sensitivity for this InfoType.
     * This only applies to data profiling.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
     */
    public Builder setSensitivityScore(
        com.google.privacy.dlp.v2.SensitivityScore.Builder builderForValue) {
      if (sensitivityScoreBuilder_ == null) {
        sensitivityScore_ = builderForValue.build();
      } else {
        sensitivityScoreBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional custom sensitivity for this InfoType.
     * This only applies to data profiling.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
     */
    public Builder mergeSensitivityScore(com.google.privacy.dlp.v2.SensitivityScore value) {
      if (sensitivityScoreBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && sensitivityScore_ != null
            && sensitivityScore_
                != com.google.privacy.dlp.v2.SensitivityScore.getDefaultInstance()) {
          getSensitivityScoreBuilder().mergeFrom(value);
        } else {
          sensitivityScore_ = value;
        }
      } else {
        sensitivityScoreBuilder_.mergeFrom(value);
      }
      if (sensitivityScore_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional custom sensitivity for this InfoType.
     * This only applies to data profiling.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
     */
    public Builder clearSensitivityScore() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sensitivityScore_ = null;
      if (sensitivityScoreBuilder_ != null) {
        sensitivityScoreBuilder_.dispose();
        sensitivityScoreBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional custom sensitivity for this InfoType.
     * This only applies to data profiling.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
     */
    public com.google.privacy.dlp.v2.SensitivityScore.Builder getSensitivityScoreBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSensitivityScoreFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional custom sensitivity for this InfoType.
     * This only applies to data profiling.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
     */
    public com.google.privacy.dlp.v2.SensitivityScoreOrBuilder getSensitivityScoreOrBuilder() {
      if (sensitivityScoreBuilder_ != null) {
        return sensitivityScoreBuilder_.getMessageOrBuilder();
      } else {
        return sensitivityScore_ == null
            ? com.google.privacy.dlp.v2.SensitivityScore.getDefaultInstance()
            : sensitivityScore_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional custom sensitivity for this InfoType.
     * This only applies to data profiling.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.SensitivityScore,
            com.google.privacy.dlp.v2.SensitivityScore.Builder,
            com.google.privacy.dlp.v2.SensitivityScoreOrBuilder>
        getSensitivityScoreFieldBuilder() {
      if (sensitivityScoreBuilder_ == null) {
        sensitivityScoreBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.SensitivityScore,
                com.google.privacy.dlp.v2.SensitivityScore.Builder,
                com.google.privacy.dlp.v2.SensitivityScoreOrBuilder>(
                getSensitivityScore(), getParentForChildren(), isClean());
        sensitivityScore_ = null;
      }
      return sensitivityScoreBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.InfoType)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.InfoType)
  private static final com.google.privacy.dlp.v2.InfoType DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.InfoType();
  }

  public static com.google.privacy.dlp.v2.InfoType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InfoType> PARSER =
      new com.google.protobuf.AbstractParser<InfoType>() {
        @java.lang.Override
        public InfoType parsePartialFrom(
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

  public static com.google.protobuf.Parser<InfoType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InfoType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.InfoType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
