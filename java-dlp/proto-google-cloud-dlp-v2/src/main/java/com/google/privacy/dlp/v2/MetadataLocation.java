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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Metadata Location
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.MetadataLocation}
 */
public final class MetadataLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.MetadataLocation)
    MetadataLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MetadataLocation.newBuilder() to construct.
  private MetadataLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MetadataLocation() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MetadataLocation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_MetadataLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_MetadataLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.MetadataLocation.class,
            com.google.privacy.dlp.v2.MetadataLocation.Builder.class);
  }

  private int labelCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object label_;

  public enum LabelCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STORAGE_LABEL(3),
    LABEL_NOT_SET(0);
    private final int value;

    private LabelCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LabelCase valueOf(int value) {
      return forNumber(value);
    }

    public static LabelCase forNumber(int value) {
      switch (value) {
        case 3:
          return STORAGE_LABEL;
        case 0:
          return LABEL_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public LabelCase getLabelCase() {
    return LabelCase.forNumber(labelCase_);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   *
   *
   * <pre>
   * Type of metadata containing the finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MetadataType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * Type of metadata containing the finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MetadataType type = 1;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.MetadataType getType() {
    com.google.privacy.dlp.v2.MetadataType result =
        com.google.privacy.dlp.v2.MetadataType.forNumber(type_);
    return result == null ? com.google.privacy.dlp.v2.MetadataType.UNRECOGNIZED : result;
  }

  public static final int STORAGE_LABEL_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Storage metadata.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
   *
   * @return Whether the storageLabel field is set.
   */
  @java.lang.Override
  public boolean hasStorageLabel() {
    return labelCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Storage metadata.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
   *
   * @return The storageLabel.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.StorageMetadataLabel getStorageLabel() {
    if (labelCase_ == 3) {
      return (com.google.privacy.dlp.v2.StorageMetadataLabel) label_;
    }
    return com.google.privacy.dlp.v2.StorageMetadataLabel.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Storage metadata.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.StorageMetadataLabelOrBuilder getStorageLabelOrBuilder() {
    if (labelCase_ == 3) {
      return (com.google.privacy.dlp.v2.StorageMetadataLabel) label_;
    }
    return com.google.privacy.dlp.v2.StorageMetadataLabel.getDefaultInstance();
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
    if (type_ != com.google.privacy.dlp.v2.MetadataType.METADATATYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (labelCase_ == 3) {
      output.writeMessage(3, (com.google.privacy.dlp.v2.StorageMetadataLabel) label_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.privacy.dlp.v2.MetadataType.METADATATYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
    }
    if (labelCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.privacy.dlp.v2.StorageMetadataLabel) label_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.MetadataLocation)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.MetadataLocation other =
        (com.google.privacy.dlp.v2.MetadataLocation) obj;

    if (type_ != other.type_) return false;
    if (!getLabelCase().equals(other.getLabelCase())) return false;
    switch (labelCase_) {
      case 3:
        if (!getStorageLabel().equals(other.getStorageLabel())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    switch (labelCase_) {
      case 3:
        hash = (37 * hash) + STORAGE_LABEL_FIELD_NUMBER;
        hash = (53 * hash) + getStorageLabel().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.MetadataLocation parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.MetadataLocation prototype) {
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
   * Metadata Location
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.MetadataLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.MetadataLocation)
      com.google.privacy.dlp.v2.MetadataLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_MetadataLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_MetadataLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.MetadataLocation.class,
              com.google.privacy.dlp.v2.MetadataLocation.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.MetadataLocation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      if (storageLabelBuilder_ != null) {
        storageLabelBuilder_.clear();
      }
      labelCase_ = 0;
      label_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_MetadataLocation_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.MetadataLocation getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.MetadataLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.MetadataLocation build() {
      com.google.privacy.dlp.v2.MetadataLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.MetadataLocation buildPartial() {
      com.google.privacy.dlp.v2.MetadataLocation result =
          new com.google.privacy.dlp.v2.MetadataLocation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.MetadataLocation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
    }

    private void buildPartialOneofs(com.google.privacy.dlp.v2.MetadataLocation result) {
      result.labelCase_ = labelCase_;
      result.label_ = this.label_;
      if (labelCase_ == 3 && storageLabelBuilder_ != null) {
        result.label_ = storageLabelBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.MetadataLocation) {
        return mergeFrom((com.google.privacy.dlp.v2.MetadataLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.MetadataLocation other) {
      if (other == com.google.privacy.dlp.v2.MetadataLocation.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      switch (other.getLabelCase()) {
        case STORAGE_LABEL:
          {
            mergeStorageLabel(other.getStorageLabel());
            break;
          }
        case LABEL_NOT_SET:
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
            case 8:
              {
                type_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 26:
              {
                input.readMessage(getStorageLabelFieldBuilder().getBuilder(), extensionRegistry);
                labelCase_ = 3;
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

    private int labelCase_ = 0;
    private java.lang.Object label_;

    public LabelCase getLabelCase() {
      return LabelCase.forNumber(labelCase_);
    }

    public Builder clearLabel() {
      labelCase_ = 0;
      label_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Type of metadata containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.MetadataType type = 1;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * Type of metadata containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.MetadataType type = 1;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of metadata containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.MetadataType type = 1;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.MetadataType getType() {
      com.google.privacy.dlp.v2.MetadataType result =
          com.google.privacy.dlp.v2.MetadataType.forNumber(type_);
      return result == null ? com.google.privacy.dlp.v2.MetadataType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Type of metadata containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.MetadataType type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.privacy.dlp.v2.MetadataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of metadata containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.MetadataType type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.StorageMetadataLabel,
            com.google.privacy.dlp.v2.StorageMetadataLabel.Builder,
            com.google.privacy.dlp.v2.StorageMetadataLabelOrBuilder>
        storageLabelBuilder_;
    /**
     *
     *
     * <pre>
     * Storage metadata.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
     *
     * @return Whether the storageLabel field is set.
     */
    @java.lang.Override
    public boolean hasStorageLabel() {
      return labelCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Storage metadata.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
     *
     * @return The storageLabel.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.StorageMetadataLabel getStorageLabel() {
      if (storageLabelBuilder_ == null) {
        if (labelCase_ == 3) {
          return (com.google.privacy.dlp.v2.StorageMetadataLabel) label_;
        }
        return com.google.privacy.dlp.v2.StorageMetadataLabel.getDefaultInstance();
      } else {
        if (labelCase_ == 3) {
          return storageLabelBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.StorageMetadataLabel.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Storage metadata.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
     */
    public Builder setStorageLabel(com.google.privacy.dlp.v2.StorageMetadataLabel value) {
      if (storageLabelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        label_ = value;
        onChanged();
      } else {
        storageLabelBuilder_.setMessage(value);
      }
      labelCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Storage metadata.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
     */
    public Builder setStorageLabel(
        com.google.privacy.dlp.v2.StorageMetadataLabel.Builder builderForValue) {
      if (storageLabelBuilder_ == null) {
        label_ = builderForValue.build();
        onChanged();
      } else {
        storageLabelBuilder_.setMessage(builderForValue.build());
      }
      labelCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Storage metadata.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
     */
    public Builder mergeStorageLabel(com.google.privacy.dlp.v2.StorageMetadataLabel value) {
      if (storageLabelBuilder_ == null) {
        if (labelCase_ == 3
            && label_ != com.google.privacy.dlp.v2.StorageMetadataLabel.getDefaultInstance()) {
          label_ =
              com.google.privacy.dlp.v2.StorageMetadataLabel.newBuilder(
                      (com.google.privacy.dlp.v2.StorageMetadataLabel) label_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          label_ = value;
        }
        onChanged();
      } else {
        if (labelCase_ == 3) {
          storageLabelBuilder_.mergeFrom(value);
        } else {
          storageLabelBuilder_.setMessage(value);
        }
      }
      labelCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Storage metadata.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
     */
    public Builder clearStorageLabel() {
      if (storageLabelBuilder_ == null) {
        if (labelCase_ == 3) {
          labelCase_ = 0;
          label_ = null;
          onChanged();
        }
      } else {
        if (labelCase_ == 3) {
          labelCase_ = 0;
          label_ = null;
        }
        storageLabelBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Storage metadata.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
     */
    public com.google.privacy.dlp.v2.StorageMetadataLabel.Builder getStorageLabelBuilder() {
      return getStorageLabelFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Storage metadata.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.StorageMetadataLabelOrBuilder getStorageLabelOrBuilder() {
      if ((labelCase_ == 3) && (storageLabelBuilder_ != null)) {
        return storageLabelBuilder_.getMessageOrBuilder();
      } else {
        if (labelCase_ == 3) {
          return (com.google.privacy.dlp.v2.StorageMetadataLabel) label_;
        }
        return com.google.privacy.dlp.v2.StorageMetadataLabel.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Storage metadata.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.StorageMetadataLabel,
            com.google.privacy.dlp.v2.StorageMetadataLabel.Builder,
            com.google.privacy.dlp.v2.StorageMetadataLabelOrBuilder>
        getStorageLabelFieldBuilder() {
      if (storageLabelBuilder_ == null) {
        if (!(labelCase_ == 3)) {
          label_ = com.google.privacy.dlp.v2.StorageMetadataLabel.getDefaultInstance();
        }
        storageLabelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.StorageMetadataLabel,
                com.google.privacy.dlp.v2.StorageMetadataLabel.Builder,
                com.google.privacy.dlp.v2.StorageMetadataLabelOrBuilder>(
                (com.google.privacy.dlp.v2.StorageMetadataLabel) label_,
                getParentForChildren(),
                isClean());
        label_ = null;
      }
      labelCase_ = 3;
      onChanged();
      return storageLabelBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.MetadataLocation)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.MetadataLocation)
  private static final com.google.privacy.dlp.v2.MetadataLocation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.MetadataLocation();
  }

  public static com.google.privacy.dlp.v2.MetadataLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetadataLocation> PARSER =
      new com.google.protobuf.AbstractParser<MetadataLocation>() {
        @java.lang.Override
        public MetadataLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetadataLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetadataLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.MetadataLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
