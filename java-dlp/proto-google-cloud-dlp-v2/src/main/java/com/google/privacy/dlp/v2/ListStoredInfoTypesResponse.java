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

// Protobuf Java Version: 3.25.2
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Response message for ListStoredInfoTypes.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ListStoredInfoTypesResponse}
 */
public final class ListStoredInfoTypesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ListStoredInfoTypesResponse)
    ListStoredInfoTypesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListStoredInfoTypesResponse.newBuilder() to construct.
  private ListStoredInfoTypesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListStoredInfoTypesResponse() {
    storedInfoTypes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListStoredInfoTypesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ListStoredInfoTypesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ListStoredInfoTypesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ListStoredInfoTypesResponse.class,
            com.google.privacy.dlp.v2.ListStoredInfoTypesResponse.Builder.class);
  }

  public static final int STORED_INFO_TYPES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.privacy.dlp.v2.StoredInfoType> storedInfoTypes_;
  /**
   *
   *
   * <pre>
   * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.privacy.dlp.v2.StoredInfoType> getStoredInfoTypesList() {
    return storedInfoTypes_;
  }
  /**
   *
   *
   * <pre>
   * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.privacy.dlp.v2.StoredInfoTypeOrBuilder>
      getStoredInfoTypesOrBuilderList() {
    return storedInfoTypes_;
  }
  /**
   *
   *
   * <pre>
   * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
   */
  @java.lang.Override
  public int getStoredInfoTypesCount() {
    return storedInfoTypes_.size();
  }
  /**
   *
   *
   * <pre>
   * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.StoredInfoType getStoredInfoTypes(int index) {
    return storedInfoTypes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.StoredInfoTypeOrBuilder getStoredInfoTypesOrBuilder(int index) {
    return storedInfoTypes_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * If the next page is available then the next page token to be used
   * in the following ListStoredInfoTypes request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If the next page is available then the next page token to be used
   * in the following ListStoredInfoTypes request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < storedInfoTypes_.size(); i++) {
      output.writeMessage(1, storedInfoTypes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < storedInfoTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, storedInfoTypes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ListStoredInfoTypesResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ListStoredInfoTypesResponse other =
        (com.google.privacy.dlp.v2.ListStoredInfoTypesResponse) obj;

    if (!getStoredInfoTypesList().equals(other.getStoredInfoTypesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getStoredInfoTypesCount() > 0) {
      hash = (37 * hash) + STORED_INFO_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getStoredInfoTypesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse parseFrom(
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
      com.google.privacy.dlp.v2.ListStoredInfoTypesResponse prototype) {
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
   * Response message for ListStoredInfoTypes.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ListStoredInfoTypesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ListStoredInfoTypesResponse)
      com.google.privacy.dlp.v2.ListStoredInfoTypesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ListStoredInfoTypesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ListStoredInfoTypesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ListStoredInfoTypesResponse.class,
              com.google.privacy.dlp.v2.ListStoredInfoTypesResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ListStoredInfoTypesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (storedInfoTypesBuilder_ == null) {
        storedInfoTypes_ = java.util.Collections.emptyList();
      } else {
        storedInfoTypes_ = null;
        storedInfoTypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ListStoredInfoTypesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListStoredInfoTypesResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ListStoredInfoTypesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListStoredInfoTypesResponse build() {
      com.google.privacy.dlp.v2.ListStoredInfoTypesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListStoredInfoTypesResponse buildPartial() {
      com.google.privacy.dlp.v2.ListStoredInfoTypesResponse result =
          new com.google.privacy.dlp.v2.ListStoredInfoTypesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.privacy.dlp.v2.ListStoredInfoTypesResponse result) {
      if (storedInfoTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          storedInfoTypes_ = java.util.Collections.unmodifiableList(storedInfoTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.storedInfoTypes_ = storedInfoTypes_;
      } else {
        result.storedInfoTypes_ = storedInfoTypesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.privacy.dlp.v2.ListStoredInfoTypesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.privacy.dlp.v2.ListStoredInfoTypesResponse) {
        return mergeFrom((com.google.privacy.dlp.v2.ListStoredInfoTypesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ListStoredInfoTypesResponse other) {
      if (other == com.google.privacy.dlp.v2.ListStoredInfoTypesResponse.getDefaultInstance())
        return this;
      if (storedInfoTypesBuilder_ == null) {
        if (!other.storedInfoTypes_.isEmpty()) {
          if (storedInfoTypes_.isEmpty()) {
            storedInfoTypes_ = other.storedInfoTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStoredInfoTypesIsMutable();
            storedInfoTypes_.addAll(other.storedInfoTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.storedInfoTypes_.isEmpty()) {
          if (storedInfoTypesBuilder_.isEmpty()) {
            storedInfoTypesBuilder_.dispose();
            storedInfoTypesBuilder_ = null;
            storedInfoTypes_ = other.storedInfoTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            storedInfoTypesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getStoredInfoTypesFieldBuilder()
                    : null;
          } else {
            storedInfoTypesBuilder_.addAllMessages(other.storedInfoTypes_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
                com.google.privacy.dlp.v2.StoredInfoType m =
                    input.readMessage(
                        com.google.privacy.dlp.v2.StoredInfoType.parser(), extensionRegistry);
                if (storedInfoTypesBuilder_ == null) {
                  ensureStoredInfoTypesIsMutable();
                  storedInfoTypes_.add(m);
                } else {
                  storedInfoTypesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.privacy.dlp.v2.StoredInfoType> storedInfoTypes_ =
        java.util.Collections.emptyList();

    private void ensureStoredInfoTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        storedInfoTypes_ =
            new java.util.ArrayList<com.google.privacy.dlp.v2.StoredInfoType>(storedInfoTypes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.StoredInfoType,
            com.google.privacy.dlp.v2.StoredInfoType.Builder,
            com.google.privacy.dlp.v2.StoredInfoTypeOrBuilder>
        storedInfoTypesBuilder_;

    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.StoredInfoType> getStoredInfoTypesList() {
      if (storedInfoTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(storedInfoTypes_);
      } else {
        return storedInfoTypesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public int getStoredInfoTypesCount() {
      if (storedInfoTypesBuilder_ == null) {
        return storedInfoTypes_.size();
      } else {
        return storedInfoTypesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoType getStoredInfoTypes(int index) {
      if (storedInfoTypesBuilder_ == null) {
        return storedInfoTypes_.get(index);
      } else {
        return storedInfoTypesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public Builder setStoredInfoTypes(int index, com.google.privacy.dlp.v2.StoredInfoType value) {
      if (storedInfoTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStoredInfoTypesIsMutable();
        storedInfoTypes_.set(index, value);
        onChanged();
      } else {
        storedInfoTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public Builder setStoredInfoTypes(
        int index, com.google.privacy.dlp.v2.StoredInfoType.Builder builderForValue) {
      if (storedInfoTypesBuilder_ == null) {
        ensureStoredInfoTypesIsMutable();
        storedInfoTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        storedInfoTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public Builder addStoredInfoTypes(com.google.privacy.dlp.v2.StoredInfoType value) {
      if (storedInfoTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStoredInfoTypesIsMutable();
        storedInfoTypes_.add(value);
        onChanged();
      } else {
        storedInfoTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public Builder addStoredInfoTypes(int index, com.google.privacy.dlp.v2.StoredInfoType value) {
      if (storedInfoTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStoredInfoTypesIsMutable();
        storedInfoTypes_.add(index, value);
        onChanged();
      } else {
        storedInfoTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public Builder addStoredInfoTypes(
        com.google.privacy.dlp.v2.StoredInfoType.Builder builderForValue) {
      if (storedInfoTypesBuilder_ == null) {
        ensureStoredInfoTypesIsMutable();
        storedInfoTypes_.add(builderForValue.build());
        onChanged();
      } else {
        storedInfoTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public Builder addStoredInfoTypes(
        int index, com.google.privacy.dlp.v2.StoredInfoType.Builder builderForValue) {
      if (storedInfoTypesBuilder_ == null) {
        ensureStoredInfoTypesIsMutable();
        storedInfoTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        storedInfoTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public Builder addAllStoredInfoTypes(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2.StoredInfoType> values) {
      if (storedInfoTypesBuilder_ == null) {
        ensureStoredInfoTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, storedInfoTypes_);
        onChanged();
      } else {
        storedInfoTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public Builder clearStoredInfoTypes() {
      if (storedInfoTypesBuilder_ == null) {
        storedInfoTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        storedInfoTypesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public Builder removeStoredInfoTypes(int index) {
      if (storedInfoTypesBuilder_ == null) {
        ensureStoredInfoTypesIsMutable();
        storedInfoTypes_.remove(index);
        onChanged();
      } else {
        storedInfoTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoType.Builder getStoredInfoTypesBuilder(int index) {
      return getStoredInfoTypesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoTypeOrBuilder getStoredInfoTypesOrBuilder(
        int index) {
      if (storedInfoTypesBuilder_ == null) {
        return storedInfoTypes_.get(index);
      } else {
        return storedInfoTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2.StoredInfoTypeOrBuilder>
        getStoredInfoTypesOrBuilderList() {
      if (storedInfoTypesBuilder_ != null) {
        return storedInfoTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(storedInfoTypes_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoType.Builder addStoredInfoTypesBuilder() {
      return getStoredInfoTypesFieldBuilder()
          .addBuilder(com.google.privacy.dlp.v2.StoredInfoType.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoType.Builder addStoredInfoTypesBuilder(int index) {
      return getStoredInfoTypesFieldBuilder()
          .addBuilder(index, com.google.privacy.dlp.v2.StoredInfoType.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.StoredInfoType stored_info_types = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.StoredInfoType.Builder>
        getStoredInfoTypesBuilderList() {
      return getStoredInfoTypesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.StoredInfoType,
            com.google.privacy.dlp.v2.StoredInfoType.Builder,
            com.google.privacy.dlp.v2.StoredInfoTypeOrBuilder>
        getStoredInfoTypesFieldBuilder() {
      if (storedInfoTypesBuilder_ == null) {
        storedInfoTypesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.privacy.dlp.v2.StoredInfoType,
                com.google.privacy.dlp.v2.StoredInfoType.Builder,
                com.google.privacy.dlp.v2.StoredInfoTypeOrBuilder>(
                storedInfoTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        storedInfoTypes_ = null;
      }
      return storedInfoTypesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If the next page is available then the next page token to be used
     * in the following ListStoredInfoTypes request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If the next page is available then the next page token to be used
     * in the following ListStoredInfoTypes request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If the next page is available then the next page token to be used
     * in the following ListStoredInfoTypes request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If the next page is available then the next page token to be used
     * in the following ListStoredInfoTypes request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If the next page is available then the next page token to be used
     * in the following ListStoredInfoTypes request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ListStoredInfoTypesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ListStoredInfoTypesResponse)
  private static final com.google.privacy.dlp.v2.ListStoredInfoTypesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ListStoredInfoTypesResponse();
  }

  public static com.google.privacy.dlp.v2.ListStoredInfoTypesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListStoredInfoTypesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListStoredInfoTypesResponse>() {
        @java.lang.Override
        public ListStoredInfoTypesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListStoredInfoTypesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListStoredInfoTypesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ListStoredInfoTypesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
