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
// source: google/cloud/discoveryengine/v1/user_event.proto

package com.google.cloud.discoveryengine.v1;

/**
 *
 *
 * <pre>
 * Detailed search information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1.SearchInfo}
 */
public final class SearchInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1.SearchInfo)
    SearchInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchInfo.newBuilder() to construct.
  private SearchInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchInfo() {
    searchQuery_ = "";
    orderBy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1.UserEventProto
        .internal_static_google_cloud_discoveryengine_v1_SearchInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1.UserEventProto
        .internal_static_google_cloud_discoveryengine_v1_SearchInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1.SearchInfo.class,
            com.google.cloud.discoveryengine.v1.SearchInfo.Builder.class);
  }

  private int bitField0_;
  public static final int SEARCH_QUERY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object searchQuery_ = "";
  /**
   *
   *
   * <pre>
   * The user's search query.
   *
   * See
   * [SearchRequest.query][google.cloud.discoveryengine.v1.SearchRequest.query]
   * for definition.
   *
   * The value must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * At least one of
   * [search_query][google.cloud.discoveryengine.v1.SearchInfo.search_query] or
   * [PageInfo.page_category][google.cloud.discoveryengine.v1.PageInfo.page_category]
   * is required for `search` events. Other event types should not set this
   * field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string search_query = 1;</code>
   *
   * @return The searchQuery.
   */
  @java.lang.Override
  public java.lang.String getSearchQuery() {
    java.lang.Object ref = searchQuery_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      searchQuery_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The user's search query.
   *
   * See
   * [SearchRequest.query][google.cloud.discoveryengine.v1.SearchRequest.query]
   * for definition.
   *
   * The value must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * At least one of
   * [search_query][google.cloud.discoveryengine.v1.SearchInfo.search_query] or
   * [PageInfo.page_category][google.cloud.discoveryengine.v1.PageInfo.page_category]
   * is required for `search` events. Other event types should not set this
   * field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string search_query = 1;</code>
   *
   * @return The bytes for searchQuery.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSearchQueryBytes() {
    java.lang.Object ref = searchQuery_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      searchQuery_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDER_BY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object orderBy_ = "";
  /**
   *
   *
   * <pre>
   * The order in which products are returned, if applicable.
   *
   * See
   * [SearchRequest.order_by][google.cloud.discoveryengine.v1.SearchRequest.order_by]
   * for definition and syntax.
   *
   * The value must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string order_by = 2;</code>
   *
   * @return The orderBy.
   */
  @java.lang.Override
  public java.lang.String getOrderBy() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderBy_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The order in which products are returned, if applicable.
   *
   * See
   * [SearchRequest.order_by][google.cloud.discoveryengine.v1.SearchRequest.order_by]
   * for definition and syntax.
   *
   * The value must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string order_by = 2;</code>
   *
   * @return The bytes for orderBy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOrderByBytes() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      orderBy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OFFSET_FIELD_NUMBER = 3;
  private int offset_ = 0;
  /**
   *
   *
   * <pre>
   * An integer that specifies the current offset for pagination (the 0-indexed
   * starting location, amongst the products deemed by the API as relevant).
   *
   * See
   * [SearchRequest.offset][google.cloud.discoveryengine.v1.SearchRequest.offset]
   * for definition.
   *
   * If this field is negative, an `INVALID_ARGUMENT` is returned.
   *
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>optional int32 offset = 3;</code>
   *
   * @return Whether the offset field is set.
   */
  @java.lang.Override
  public boolean hasOffset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * An integer that specifies the current offset for pagination (the 0-indexed
   * starting location, amongst the products deemed by the API as relevant).
   *
   * See
   * [SearchRequest.offset][google.cloud.discoveryengine.v1.SearchRequest.offset]
   * for definition.
   *
   * If this field is negative, an `INVALID_ARGUMENT` is returned.
   *
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>optional int32 offset = 3;</code>
   *
   * @return The offset.
   */
  @java.lang.Override
  public int getOffset() {
    return offset_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(searchQuery_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, searchQuery_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderBy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orderBy_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(3, offset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(searchQuery_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, searchQuery_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderBy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orderBy_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, offset_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1.SearchInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1.SearchInfo other =
        (com.google.cloud.discoveryengine.v1.SearchInfo) obj;

    if (!getSearchQuery().equals(other.getSearchQuery())) return false;
    if (!getOrderBy().equals(other.getOrderBy())) return false;
    if (hasOffset() != other.hasOffset()) return false;
    if (hasOffset()) {
      if (getOffset() != other.getOffset()) return false;
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
    hash = (37 * hash) + SEARCH_QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getSearchQuery().hashCode();
    hash = (37 * hash) + ORDER_BY_FIELD_NUMBER;
    hash = (53 * hash) + getOrderBy().hashCode();
    if (hasOffset()) {
      hash = (37 * hash) + OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getOffset();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.discoveryengine.v1.SearchInfo prototype) {
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
   * Detailed search information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1.SearchInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1.SearchInfo)
      com.google.cloud.discoveryengine.v1.SearchInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1.UserEventProto
          .internal_static_google_cloud_discoveryengine_v1_SearchInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1.UserEventProto
          .internal_static_google_cloud_discoveryengine_v1_SearchInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1.SearchInfo.class,
              com.google.cloud.discoveryengine.v1.SearchInfo.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1.SearchInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      searchQuery_ = "";
      orderBy_ = "";
      offset_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1.UserEventProto
          .internal_static_google_cloud_discoveryengine_v1_SearchInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.SearchInfo getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1.SearchInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.SearchInfo build() {
      com.google.cloud.discoveryengine.v1.SearchInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.SearchInfo buildPartial() {
      com.google.cloud.discoveryengine.v1.SearchInfo result =
          new com.google.cloud.discoveryengine.v1.SearchInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1.SearchInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.searchQuery_ = searchQuery_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.orderBy_ = orderBy_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.offset_ = offset_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1.SearchInfo) {
        return mergeFrom((com.google.cloud.discoveryengine.v1.SearchInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1.SearchInfo other) {
      if (other == com.google.cloud.discoveryengine.v1.SearchInfo.getDefaultInstance()) return this;
      if (!other.getSearchQuery().isEmpty()) {
        searchQuery_ = other.searchQuery_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOrderBy().isEmpty()) {
        orderBy_ = other.orderBy_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasOffset()) {
        setOffset(other.getOffset());
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
                searchQuery_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                orderBy_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                offset_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object searchQuery_ = "";
    /**
     *
     *
     * <pre>
     * The user's search query.
     *
     * See
     * [SearchRequest.query][google.cloud.discoveryengine.v1.SearchRequest.query]
     * for definition.
     *
     * The value must be a UTF-8 encoded string with a length limit of 5,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * At least one of
     * [search_query][google.cloud.discoveryengine.v1.SearchInfo.search_query] or
     * [PageInfo.page_category][google.cloud.discoveryengine.v1.PageInfo.page_category]
     * is required for `search` events. Other event types should not set this
     * field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string search_query = 1;</code>
     *
     * @return The searchQuery.
     */
    public java.lang.String getSearchQuery() {
      java.lang.Object ref = searchQuery_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        searchQuery_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The user's search query.
     *
     * See
     * [SearchRequest.query][google.cloud.discoveryengine.v1.SearchRequest.query]
     * for definition.
     *
     * The value must be a UTF-8 encoded string with a length limit of 5,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * At least one of
     * [search_query][google.cloud.discoveryengine.v1.SearchInfo.search_query] or
     * [PageInfo.page_category][google.cloud.discoveryengine.v1.PageInfo.page_category]
     * is required for `search` events. Other event types should not set this
     * field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string search_query = 1;</code>
     *
     * @return The bytes for searchQuery.
     */
    public com.google.protobuf.ByteString getSearchQueryBytes() {
      java.lang.Object ref = searchQuery_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        searchQuery_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The user's search query.
     *
     * See
     * [SearchRequest.query][google.cloud.discoveryengine.v1.SearchRequest.query]
     * for definition.
     *
     * The value must be a UTF-8 encoded string with a length limit of 5,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * At least one of
     * [search_query][google.cloud.discoveryengine.v1.SearchInfo.search_query] or
     * [PageInfo.page_category][google.cloud.discoveryengine.v1.PageInfo.page_category]
     * is required for `search` events. Other event types should not set this
     * field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string search_query = 1;</code>
     *
     * @param value The searchQuery to set.
     * @return This builder for chaining.
     */
    public Builder setSearchQuery(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      searchQuery_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user's search query.
     *
     * See
     * [SearchRequest.query][google.cloud.discoveryengine.v1.SearchRequest.query]
     * for definition.
     *
     * The value must be a UTF-8 encoded string with a length limit of 5,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * At least one of
     * [search_query][google.cloud.discoveryengine.v1.SearchInfo.search_query] or
     * [PageInfo.page_category][google.cloud.discoveryengine.v1.PageInfo.page_category]
     * is required for `search` events. Other event types should not set this
     * field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string search_query = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSearchQuery() {
      searchQuery_ = getDefaultInstance().getSearchQuery();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user's search query.
     *
     * See
     * [SearchRequest.query][google.cloud.discoveryengine.v1.SearchRequest.query]
     * for definition.
     *
     * The value must be a UTF-8 encoded string with a length limit of 5,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * At least one of
     * [search_query][google.cloud.discoveryengine.v1.SearchInfo.search_query] or
     * [PageInfo.page_category][google.cloud.discoveryengine.v1.PageInfo.page_category]
     * is required for `search` events. Other event types should not set this
     * field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string search_query = 1;</code>
     *
     * @param value The bytes for searchQuery to set.
     * @return This builder for chaining.
     */
    public Builder setSearchQueryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      searchQuery_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object orderBy_ = "";
    /**
     *
     *
     * <pre>
     * The order in which products are returned, if applicable.
     *
     * See
     * [SearchRequest.order_by][google.cloud.discoveryengine.v1.SearchRequest.order_by]
     * for definition and syntax.
     *
     * The value must be a UTF-8 encoded string with a length limit of 1,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * This can only be set for `search` events. Other event types should not set
     * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string order_by = 2;</code>
     *
     * @return The orderBy.
     */
    public java.lang.String getOrderBy() {
      java.lang.Object ref = orderBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The order in which products are returned, if applicable.
     *
     * See
     * [SearchRequest.order_by][google.cloud.discoveryengine.v1.SearchRequest.order_by]
     * for definition and syntax.
     *
     * The value must be a UTF-8 encoded string with a length limit of 1,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * This can only be set for `search` events. Other event types should not set
     * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string order_by = 2;</code>
     *
     * @return The bytes for orderBy.
     */
    public com.google.protobuf.ByteString getOrderByBytes() {
      java.lang.Object ref = orderBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        orderBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The order in which products are returned, if applicable.
     *
     * See
     * [SearchRequest.order_by][google.cloud.discoveryengine.v1.SearchRequest.order_by]
     * for definition and syntax.
     *
     * The value must be a UTF-8 encoded string with a length limit of 1,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * This can only be set for `search` events. Other event types should not set
     * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string order_by = 2;</code>
     *
     * @param value The orderBy to set.
     * @return This builder for chaining.
     */
    public Builder setOrderBy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      orderBy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The order in which products are returned, if applicable.
     *
     * See
     * [SearchRequest.order_by][google.cloud.discoveryengine.v1.SearchRequest.order_by]
     * for definition and syntax.
     *
     * The value must be a UTF-8 encoded string with a length limit of 1,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * This can only be set for `search` events. Other event types should not set
     * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string order_by = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOrderBy() {
      orderBy_ = getDefaultInstance().getOrderBy();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The order in which products are returned, if applicable.
     *
     * See
     * [SearchRequest.order_by][google.cloud.discoveryengine.v1.SearchRequest.order_by]
     * for definition and syntax.
     *
     * The value must be a UTF-8 encoded string with a length limit of 1,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * This can only be set for `search` events. Other event types should not set
     * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string order_by = 2;</code>
     *
     * @param value The bytes for orderBy to set.
     * @return This builder for chaining.
     */
    public Builder setOrderByBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      orderBy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int offset_;
    /**
     *
     *
     * <pre>
     * An integer that specifies the current offset for pagination (the 0-indexed
     * starting location, amongst the products deemed by the API as relevant).
     *
     * See
     * [SearchRequest.offset][google.cloud.discoveryengine.v1.SearchRequest.offset]
     * for definition.
     *
     * If this field is negative, an `INVALID_ARGUMENT` is returned.
     *
     * This can only be set for `search` events. Other event types should not set
     * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>optional int32 offset = 3;</code>
     *
     * @return Whether the offset field is set.
     */
    @java.lang.Override
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * An integer that specifies the current offset for pagination (the 0-indexed
     * starting location, amongst the products deemed by the API as relevant).
     *
     * See
     * [SearchRequest.offset][google.cloud.discoveryengine.v1.SearchRequest.offset]
     * for definition.
     *
     * If this field is negative, an `INVALID_ARGUMENT` is returned.
     *
     * This can only be set for `search` events. Other event types should not set
     * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>optional int32 offset = 3;</code>
     *
     * @return The offset.
     */
    @java.lang.Override
    public int getOffset() {
      return offset_;
    }
    /**
     *
     *
     * <pre>
     * An integer that specifies the current offset for pagination (the 0-indexed
     * starting location, amongst the products deemed by the API as relevant).
     *
     * See
     * [SearchRequest.offset][google.cloud.discoveryengine.v1.SearchRequest.offset]
     * for definition.
     *
     * If this field is negative, an `INVALID_ARGUMENT` is returned.
     *
     * This can only be set for `search` events. Other event types should not set
     * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>optional int32 offset = 3;</code>
     *
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(int value) {

      offset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An integer that specifies the current offset for pagination (the 0-indexed
     * starting location, amongst the products deemed by the API as relevant).
     *
     * See
     * [SearchRequest.offset][google.cloud.discoveryengine.v1.SearchRequest.offset]
     * for definition.
     *
     * If this field is negative, an `INVALID_ARGUMENT` is returned.
     *
     * This can only be set for `search` events. Other event types should not set
     * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>optional int32 offset = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000004);
      offset_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1.SearchInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1.SearchInfo)
  private static final com.google.cloud.discoveryengine.v1.SearchInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1.SearchInfo();
  }

  public static com.google.cloud.discoveryengine.v1.SearchInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchInfo> PARSER =
      new com.google.protobuf.AbstractParser<SearchInfo>() {
        @java.lang.Override
        public SearchInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.SearchInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
