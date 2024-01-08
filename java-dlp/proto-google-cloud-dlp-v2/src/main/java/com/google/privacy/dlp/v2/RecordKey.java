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
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Message for a unique key indicating a record that contains a finding.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.RecordKey}
 */
public final class RecordKey extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.RecordKey)
    RecordKeyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecordKey.newBuilder() to construct.
  private RecordKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecordKey() {
    idValues_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecordKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_RecordKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_RecordKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.RecordKey.class,
            com.google.privacy.dlp.v2.RecordKey.Builder.class);
  }

  private int typeCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object type_;

  public enum TypeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DATASTORE_KEY(2),
    BIG_QUERY_KEY(3),
    TYPE_NOT_SET(0);
    private final int value;

    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 2:
          return DATASTORE_KEY;
        case 3:
          return BIG_QUERY_KEY;
        case 0:
          return TYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase getTypeCase() {
    return TypeCase.forNumber(typeCase_);
  }

  public static final int DATASTORE_KEY_FIELD_NUMBER = 2;
  /**
   * <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code>
   *
   * @return Whether the datastoreKey field is set.
   */
  @java.lang.Override
  public boolean hasDatastoreKey() {
    return typeCase_ == 2;
  }
  /**
   * <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code>
   *
   * @return The datastoreKey.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DatastoreKey getDatastoreKey() {
    if (typeCase_ == 2) {
      return (com.google.privacy.dlp.v2.DatastoreKey) type_;
    }
    return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
  }
  /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DatastoreKeyOrBuilder getDatastoreKeyOrBuilder() {
    if (typeCase_ == 2) {
      return (com.google.privacy.dlp.v2.DatastoreKey) type_;
    }
    return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
  }

  public static final int BIG_QUERY_KEY_FIELD_NUMBER = 3;
  /**
   * <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code>
   *
   * @return Whether the bigQueryKey field is set.
   */
  @java.lang.Override
  public boolean hasBigQueryKey() {
    return typeCase_ == 3;
  }
  /**
   * <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code>
   *
   * @return The bigQueryKey.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryKey getBigQueryKey() {
    if (typeCase_ == 3) {
      return (com.google.privacy.dlp.v2.BigQueryKey) type_;
    }
    return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
  }
  /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryKeyOrBuilder getBigQueryKeyOrBuilder() {
    if (typeCase_ == 3) {
      return (com.google.privacy.dlp.v2.BigQueryKey) type_;
    }
    return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
  }

  public static final int ID_VALUES_FIELD_NUMBER = 5;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList idValues_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of `identifying_fields` specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   *
   * @return A list containing the idValues.
   */
  public com.google.protobuf.ProtocolStringList getIdValuesList() {
    return idValues_;
  }
  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of `identifying_fields` specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   *
   * @return The count of idValues.
   */
  public int getIdValuesCount() {
    return idValues_.size();
  }
  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of `identifying_fields` specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The idValues at the given index.
   */
  public java.lang.String getIdValues(int index) {
    return idValues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of `identifying_fields` specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the idValues at the given index.
   */
  public com.google.protobuf.ByteString getIdValuesBytes(int index) {
    return idValues_.getByteString(index);
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
    if (typeCase_ == 2) {
      output.writeMessage(2, (com.google.privacy.dlp.v2.DatastoreKey) type_);
    }
    if (typeCase_ == 3) {
      output.writeMessage(3, (com.google.privacy.dlp.v2.BigQueryKey) type_);
    }
    for (int i = 0; i < idValues_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, idValues_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.privacy.dlp.v2.DatastoreKey) type_);
    }
    if (typeCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.privacy.dlp.v2.BigQueryKey) type_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < idValues_.size(); i++) {
        dataSize += computeStringSizeNoTag(idValues_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIdValuesList().size();
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
    if (!(obj instanceof com.google.privacy.dlp.v2.RecordKey)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.RecordKey other = (com.google.privacy.dlp.v2.RecordKey) obj;

    if (!getIdValuesList().equals(other.getIdValuesList())) return false;
    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 2:
        if (!getDatastoreKey().equals(other.getDatastoreKey())) return false;
        break;
      case 3:
        if (!getBigQueryKey().equals(other.getBigQueryKey())) return false;
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
    if (getIdValuesCount() > 0) {
      hash = (37 * hash) + ID_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getIdValuesList().hashCode();
    }
    switch (typeCase_) {
      case 2:
        hash = (37 * hash) + DATASTORE_KEY_FIELD_NUMBER;
        hash = (53 * hash) + getDatastoreKey().hashCode();
        break;
      case 3:
        hash = (37 * hash) + BIG_QUERY_KEY_FIELD_NUMBER;
        hash = (53 * hash) + getBigQueryKey().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.RecordKey prototype) {
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
   * Message for a unique key indicating a record that contains a finding.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.RecordKey}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.RecordKey)
      com.google.privacy.dlp.v2.RecordKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_RecordKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_RecordKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.RecordKey.class,
              com.google.privacy.dlp.v2.RecordKey.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.RecordKey.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (datastoreKeyBuilder_ != null) {
        datastoreKeyBuilder_.clear();
      }
      if (bigQueryKeyBuilder_ != null) {
        bigQueryKeyBuilder_.clear();
      }
      idValues_ = com.google.protobuf.LazyStringArrayList.emptyList();
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_RecordKey_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordKey getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.RecordKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordKey build() {
      com.google.privacy.dlp.v2.RecordKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordKey buildPartial() {
      com.google.privacy.dlp.v2.RecordKey result = new com.google.privacy.dlp.v2.RecordKey(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.RecordKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        idValues_.makeImmutable();
        result.idValues_ = idValues_;
      }
    }

    private void buildPartialOneofs(com.google.privacy.dlp.v2.RecordKey result) {
      result.typeCase_ = typeCase_;
      result.type_ = this.type_;
      if (typeCase_ == 2 && datastoreKeyBuilder_ != null) {
        result.type_ = datastoreKeyBuilder_.build();
      }
      if (typeCase_ == 3 && bigQueryKeyBuilder_ != null) {
        result.type_ = bigQueryKeyBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.RecordKey) {
        return mergeFrom((com.google.privacy.dlp.v2.RecordKey) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.RecordKey other) {
      if (other == com.google.privacy.dlp.v2.RecordKey.getDefaultInstance()) return this;
      if (!other.idValues_.isEmpty()) {
        if (idValues_.isEmpty()) {
          idValues_ = other.idValues_;
          bitField0_ |= 0x00000004;
        } else {
          ensureIdValuesIsMutable();
          idValues_.addAll(other.idValues_);
        }
        onChanged();
      }
      switch (other.getTypeCase()) {
        case DATASTORE_KEY:
          {
            mergeDatastoreKey(other.getDatastoreKey());
            break;
          }
        case BIG_QUERY_KEY:
          {
            mergeBigQueryKey(other.getBigQueryKey());
            break;
          }
        case TYPE_NOT_SET:
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
            case 18:
              {
                input.readMessage(getDatastoreKeyFieldBuilder().getBuilder(), extensionRegistry);
                typeCase_ = 2;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getBigQueryKeyFieldBuilder().getBuilder(), extensionRegistry);
                typeCase_ = 3;
                break;
              } // case 26
            case 42:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureIdValuesIsMutable();
                idValues_.add(s);
                break;
              } // case 42
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

    private int typeCase_ = 0;
    private java.lang.Object type_;

    public TypeCase getTypeCase() {
      return TypeCase.forNumber(typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DatastoreKey,
            com.google.privacy.dlp.v2.DatastoreKey.Builder,
            com.google.privacy.dlp.v2.DatastoreKeyOrBuilder>
        datastoreKeyBuilder_;
    /**
     * <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code>
     *
     * @return Whether the datastoreKey field is set.
     */
    @java.lang.Override
    public boolean hasDatastoreKey() {
      return typeCase_ == 2;
    }
    /**
     * <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code>
     *
     * @return The datastoreKey.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.DatastoreKey getDatastoreKey() {
      if (datastoreKeyBuilder_ == null) {
        if (typeCase_ == 2) {
          return (com.google.privacy.dlp.v2.DatastoreKey) type_;
        }
        return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return datastoreKeyBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
      }
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public Builder setDatastoreKey(com.google.privacy.dlp.v2.DatastoreKey value) {
      if (datastoreKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        datastoreKeyBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public Builder setDatastoreKey(com.google.privacy.dlp.v2.DatastoreKey.Builder builderForValue) {
      if (datastoreKeyBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        datastoreKeyBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public Builder mergeDatastoreKey(com.google.privacy.dlp.v2.DatastoreKey value) {
      if (datastoreKeyBuilder_ == null) {
        if (typeCase_ == 2
            && type_ != com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance()) {
          type_ =
              com.google.privacy.dlp.v2.DatastoreKey.newBuilder(
                      (com.google.privacy.dlp.v2.DatastoreKey) type_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          datastoreKeyBuilder_.mergeFrom(value);
        } else {
          datastoreKeyBuilder_.setMessage(value);
        }
      }
      typeCase_ = 2;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public Builder clearDatastoreKey() {
      if (datastoreKeyBuilder_ == null) {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
        }
        datastoreKeyBuilder_.clear();
      }
      return this;
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public com.google.privacy.dlp.v2.DatastoreKey.Builder getDatastoreKeyBuilder() {
      return getDatastoreKeyFieldBuilder().getBuilder();
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    @java.lang.Override
    public com.google.privacy.dlp.v2.DatastoreKeyOrBuilder getDatastoreKeyOrBuilder() {
      if ((typeCase_ == 2) && (datastoreKeyBuilder_ != null)) {
        return datastoreKeyBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (com.google.privacy.dlp.v2.DatastoreKey) type_;
        }
        return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
      }
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DatastoreKey,
            com.google.privacy.dlp.v2.DatastoreKey.Builder,
            com.google.privacy.dlp.v2.DatastoreKeyOrBuilder>
        getDatastoreKeyFieldBuilder() {
      if (datastoreKeyBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
        }
        datastoreKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.DatastoreKey,
                com.google.privacy.dlp.v2.DatastoreKey.Builder,
                com.google.privacy.dlp.v2.DatastoreKeyOrBuilder>(
                (com.google.privacy.dlp.v2.DatastoreKey) type_, getParentForChildren(), isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();
      return datastoreKeyBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryKey,
            com.google.privacy.dlp.v2.BigQueryKey.Builder,
            com.google.privacy.dlp.v2.BigQueryKeyOrBuilder>
        bigQueryKeyBuilder_;
    /**
     * <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code>
     *
     * @return Whether the bigQueryKey field is set.
     */
    @java.lang.Override
    public boolean hasBigQueryKey() {
      return typeCase_ == 3;
    }
    /**
     * <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code>
     *
     * @return The bigQueryKey.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryKey getBigQueryKey() {
      if (bigQueryKeyBuilder_ == null) {
        if (typeCase_ == 3) {
          return (com.google.privacy.dlp.v2.BigQueryKey) type_;
        }
        return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
      } else {
        if (typeCase_ == 3) {
          return bigQueryKeyBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
      }
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public Builder setBigQueryKey(com.google.privacy.dlp.v2.BigQueryKey value) {
      if (bigQueryKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        bigQueryKeyBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public Builder setBigQueryKey(com.google.privacy.dlp.v2.BigQueryKey.Builder builderForValue) {
      if (bigQueryKeyBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        bigQueryKeyBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 3;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public Builder mergeBigQueryKey(com.google.privacy.dlp.v2.BigQueryKey value) {
      if (bigQueryKeyBuilder_ == null) {
        if (typeCase_ == 3 && type_ != com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance()) {
          type_ =
              com.google.privacy.dlp.v2.BigQueryKey.newBuilder(
                      (com.google.privacy.dlp.v2.BigQueryKey) type_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 3) {
          bigQueryKeyBuilder_.mergeFrom(value);
        } else {
          bigQueryKeyBuilder_.setMessage(value);
        }
      }
      typeCase_ = 3;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public Builder clearBigQueryKey() {
      if (bigQueryKeyBuilder_ == null) {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
        }
        bigQueryKeyBuilder_.clear();
      }
      return this;
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public com.google.privacy.dlp.v2.BigQueryKey.Builder getBigQueryKeyBuilder() {
      return getBigQueryKeyFieldBuilder().getBuilder();
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryKeyOrBuilder getBigQueryKeyOrBuilder() {
      if ((typeCase_ == 3) && (bigQueryKeyBuilder_ != null)) {
        return bigQueryKeyBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 3) {
          return (com.google.privacy.dlp.v2.BigQueryKey) type_;
        }
        return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
      }
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryKey,
            com.google.privacy.dlp.v2.BigQueryKey.Builder,
            com.google.privacy.dlp.v2.BigQueryKeyOrBuilder>
        getBigQueryKeyFieldBuilder() {
      if (bigQueryKeyBuilder_ == null) {
        if (!(typeCase_ == 3)) {
          type_ = com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
        }
        bigQueryKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.BigQueryKey,
                com.google.privacy.dlp.v2.BigQueryKey.Builder,
                com.google.privacy.dlp.v2.BigQueryKeyOrBuilder>(
                (com.google.privacy.dlp.v2.BigQueryKey) type_, getParentForChildren(), isClean());
        type_ = null;
      }
      typeCase_ = 3;
      onChanged();
      return bigQueryKeyBuilder_;
    }

    private com.google.protobuf.LazyStringArrayList idValues_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureIdValuesIsMutable() {
      if (!idValues_.isModifiable()) {
        idValues_ = new com.google.protobuf.LazyStringArrayList(idValues_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of `identifying_fields` specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     *
     * @return A list containing the idValues.
     */
    public com.google.protobuf.ProtocolStringList getIdValuesList() {
      idValues_.makeImmutable();
      return idValues_;
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of `identifying_fields` specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     *
     * @return The count of idValues.
     */
    public int getIdValuesCount() {
      return idValues_.size();
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of `identifying_fields` specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     *
     * @param index The index of the element to return.
     * @return The idValues at the given index.
     */
    public java.lang.String getIdValues(int index) {
      return idValues_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of `identifying_fields` specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the idValues at the given index.
     */
    public com.google.protobuf.ByteString getIdValuesBytes(int index) {
      return idValues_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of `identifying_fields` specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     *
     * @param index The index to set the value at.
     * @param value The idValues to set.
     * @return This builder for chaining.
     */
    public Builder setIdValues(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureIdValuesIsMutable();
      idValues_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of `identifying_fields` specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     *
     * @param value The idValues to add.
     * @return This builder for chaining.
     */
    public Builder addIdValues(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureIdValuesIsMutable();
      idValues_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of `identifying_fields` specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     *
     * @param values The idValues to add.
     * @return This builder for chaining.
     */
    public Builder addAllIdValues(java.lang.Iterable<java.lang.String> values) {
      ensureIdValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, idValues_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of `identifying_fields` specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIdValues() {
      idValues_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of `identifying_fields` specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     *
     * @param value The bytes of the idValues to add.
     * @return This builder for chaining.
     */
    public Builder addIdValuesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureIdValuesIsMutable();
      idValues_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.RecordKey)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.RecordKey)
  private static final com.google.privacy.dlp.v2.RecordKey DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.RecordKey();
  }

  public static com.google.privacy.dlp.v2.RecordKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordKey> PARSER =
      new com.google.protobuf.AbstractParser<RecordKey>() {
        @java.lang.Override
        public RecordKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecordKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.RecordKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
