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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Response message for ListPurchasableSkus.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ListPurchasableSkusResponse}
 */
public final class ListPurchasableSkusResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ListPurchasableSkusResponse)
    ListPurchasableSkusResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListPurchasableSkusResponse.newBuilder() to construct.
  private ListPurchasableSkusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListPurchasableSkusResponse() {
    purchasableSkus_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListPurchasableSkusResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListPurchasableSkusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListPurchasableSkusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ListPurchasableSkusResponse.class,
            com.google.cloud.channel.v1.ListPurchasableSkusResponse.Builder.class);
  }

  public static final int PURCHASABLE_SKUS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.channel.v1.PurchasableSku> purchasableSkus_;
  /**
   *
   *
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.PurchasableSku> getPurchasableSkusList() {
    return purchasableSkus_;
  }
  /**
   *
   *
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.PurchasableSkuOrBuilder>
      getPurchasableSkusOrBuilderList() {
    return purchasableSkus_;
  }
  /**
   *
   *
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
   */
  @java.lang.Override
  public int getPurchasableSkusCount() {
    return purchasableSkus_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.PurchasableSku getPurchasableSkus(int index) {
    return purchasableSkus_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.PurchasableSkuOrBuilder getPurchasableSkusOrBuilder(
      int index) {
    return purchasableSkus_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
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
   * A token to retrieve the next page of results.
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
    for (int i = 0; i < purchasableSkus_.size(); i++) {
      output.writeMessage(1, purchasableSkus_.get(i));
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
    for (int i = 0; i < purchasableSkus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, purchasableSkus_.get(i));
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
    if (!(obj instanceof com.google.cloud.channel.v1.ListPurchasableSkusResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ListPurchasableSkusResponse other =
        (com.google.cloud.channel.v1.ListPurchasableSkusResponse) obj;

    if (!getPurchasableSkusList().equals(other.getPurchasableSkusList())) return false;
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
    if (getPurchasableSkusCount() > 0) {
      hash = (37 * hash) + PURCHASABLE_SKUS_FIELD_NUMBER;
      hash = (53 * hash) + getPurchasableSkusList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse parseFrom(
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
      com.google.cloud.channel.v1.ListPurchasableSkusResponse prototype) {
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
   * Response message for ListPurchasableSkus.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ListPurchasableSkusResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ListPurchasableSkusResponse)
      com.google.cloud.channel.v1.ListPurchasableSkusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListPurchasableSkusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListPurchasableSkusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ListPurchasableSkusResponse.class,
              com.google.cloud.channel.v1.ListPurchasableSkusResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ListPurchasableSkusResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (purchasableSkusBuilder_ == null) {
        purchasableSkus_ = java.util.Collections.emptyList();
      } else {
        purchasableSkus_ = null;
        purchasableSkusBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListPurchasableSkusResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListPurchasableSkusResponse getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ListPurchasableSkusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListPurchasableSkusResponse build() {
      com.google.cloud.channel.v1.ListPurchasableSkusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListPurchasableSkusResponse buildPartial() {
      com.google.cloud.channel.v1.ListPurchasableSkusResponse result =
          new com.google.cloud.channel.v1.ListPurchasableSkusResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.channel.v1.ListPurchasableSkusResponse result) {
      if (purchasableSkusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          purchasableSkus_ = java.util.Collections.unmodifiableList(purchasableSkus_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.purchasableSkus_ = purchasableSkus_;
      } else {
        result.purchasableSkus_ = purchasableSkusBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.channel.v1.ListPurchasableSkusResponse result) {
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
      if (other instanceof com.google.cloud.channel.v1.ListPurchasableSkusResponse) {
        return mergeFrom((com.google.cloud.channel.v1.ListPurchasableSkusResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ListPurchasableSkusResponse other) {
      if (other == com.google.cloud.channel.v1.ListPurchasableSkusResponse.getDefaultInstance())
        return this;
      if (purchasableSkusBuilder_ == null) {
        if (!other.purchasableSkus_.isEmpty()) {
          if (purchasableSkus_.isEmpty()) {
            purchasableSkus_ = other.purchasableSkus_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePurchasableSkusIsMutable();
            purchasableSkus_.addAll(other.purchasableSkus_);
          }
          onChanged();
        }
      } else {
        if (!other.purchasableSkus_.isEmpty()) {
          if (purchasableSkusBuilder_.isEmpty()) {
            purchasableSkusBuilder_.dispose();
            purchasableSkusBuilder_ = null;
            purchasableSkus_ = other.purchasableSkus_;
            bitField0_ = (bitField0_ & ~0x00000001);
            purchasableSkusBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPurchasableSkusFieldBuilder()
                    : null;
          } else {
            purchasableSkusBuilder_.addAllMessages(other.purchasableSkus_);
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
                com.google.cloud.channel.v1.PurchasableSku m =
                    input.readMessage(
                        com.google.cloud.channel.v1.PurchasableSku.parser(), extensionRegistry);
                if (purchasableSkusBuilder_ == null) {
                  ensurePurchasableSkusIsMutable();
                  purchasableSkus_.add(m);
                } else {
                  purchasableSkusBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.channel.v1.PurchasableSku> purchasableSkus_ =
        java.util.Collections.emptyList();

    private void ensurePurchasableSkusIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        purchasableSkus_ =
            new java.util.ArrayList<com.google.cloud.channel.v1.PurchasableSku>(purchasableSkus_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.PurchasableSku,
            com.google.cloud.channel.v1.PurchasableSku.Builder,
            com.google.cloud.channel.v1.PurchasableSkuOrBuilder>
        purchasableSkusBuilder_;

    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.PurchasableSku> getPurchasableSkusList() {
      if (purchasableSkusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(purchasableSkus_);
      } else {
        return purchasableSkusBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public int getPurchasableSkusCount() {
      if (purchasableSkusBuilder_ == null) {
        return purchasableSkus_.size();
      } else {
        return purchasableSkusBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public com.google.cloud.channel.v1.PurchasableSku getPurchasableSkus(int index) {
      if (purchasableSkusBuilder_ == null) {
        return purchasableSkus_.get(index);
      } else {
        return purchasableSkusBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public Builder setPurchasableSkus(int index, com.google.cloud.channel.v1.PurchasableSku value) {
      if (purchasableSkusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePurchasableSkusIsMutable();
        purchasableSkus_.set(index, value);
        onChanged();
      } else {
        purchasableSkusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public Builder setPurchasableSkus(
        int index, com.google.cloud.channel.v1.PurchasableSku.Builder builderForValue) {
      if (purchasableSkusBuilder_ == null) {
        ensurePurchasableSkusIsMutable();
        purchasableSkus_.set(index, builderForValue.build());
        onChanged();
      } else {
        purchasableSkusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public Builder addPurchasableSkus(com.google.cloud.channel.v1.PurchasableSku value) {
      if (purchasableSkusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePurchasableSkusIsMutable();
        purchasableSkus_.add(value);
        onChanged();
      } else {
        purchasableSkusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public Builder addPurchasableSkus(int index, com.google.cloud.channel.v1.PurchasableSku value) {
      if (purchasableSkusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePurchasableSkusIsMutable();
        purchasableSkus_.add(index, value);
        onChanged();
      } else {
        purchasableSkusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public Builder addPurchasableSkus(
        com.google.cloud.channel.v1.PurchasableSku.Builder builderForValue) {
      if (purchasableSkusBuilder_ == null) {
        ensurePurchasableSkusIsMutable();
        purchasableSkus_.add(builderForValue.build());
        onChanged();
      } else {
        purchasableSkusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public Builder addPurchasableSkus(
        int index, com.google.cloud.channel.v1.PurchasableSku.Builder builderForValue) {
      if (purchasableSkusBuilder_ == null) {
        ensurePurchasableSkusIsMutable();
        purchasableSkus_.add(index, builderForValue.build());
        onChanged();
      } else {
        purchasableSkusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public Builder addAllPurchasableSkus(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.PurchasableSku> values) {
      if (purchasableSkusBuilder_ == null) {
        ensurePurchasableSkusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, purchasableSkus_);
        onChanged();
      } else {
        purchasableSkusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public Builder clearPurchasableSkus() {
      if (purchasableSkusBuilder_ == null) {
        purchasableSkus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        purchasableSkusBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public Builder removePurchasableSkus(int index) {
      if (purchasableSkusBuilder_ == null) {
        ensurePurchasableSkusIsMutable();
        purchasableSkus_.remove(index);
        onChanged();
      } else {
        purchasableSkusBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public com.google.cloud.channel.v1.PurchasableSku.Builder getPurchasableSkusBuilder(int index) {
      return getPurchasableSkusFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public com.google.cloud.channel.v1.PurchasableSkuOrBuilder getPurchasableSkusOrBuilder(
        int index) {
      if (purchasableSkusBuilder_ == null) {
        return purchasableSkus_.get(index);
      } else {
        return purchasableSkusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.PurchasableSkuOrBuilder>
        getPurchasableSkusOrBuilderList() {
      if (purchasableSkusBuilder_ != null) {
        return purchasableSkusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(purchasableSkus_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public com.google.cloud.channel.v1.PurchasableSku.Builder addPurchasableSkusBuilder() {
      return getPurchasableSkusFieldBuilder()
          .addBuilder(com.google.cloud.channel.v1.PurchasableSku.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public com.google.cloud.channel.v1.PurchasableSku.Builder addPurchasableSkusBuilder(int index) {
      return getPurchasableSkusFieldBuilder()
          .addBuilder(index, com.google.cloud.channel.v1.PurchasableSku.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.PurchasableSku purchasable_skus = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.PurchasableSku.Builder>
        getPurchasableSkusBuilderList() {
      return getPurchasableSkusFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.PurchasableSku,
            com.google.cloud.channel.v1.PurchasableSku.Builder,
            com.google.cloud.channel.v1.PurchasableSkuOrBuilder>
        getPurchasableSkusFieldBuilder() {
      if (purchasableSkusBuilder_ == null) {
        purchasableSkusBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.channel.v1.PurchasableSku,
                com.google.cloud.channel.v1.PurchasableSku.Builder,
                com.google.cloud.channel.v1.PurchasableSkuOrBuilder>(
                purchasableSkus_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        purchasableSkus_ = null;
      }
      return purchasableSkusBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
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
     * A token to retrieve the next page of results.
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
     * A token to retrieve the next page of results.
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
     * A token to retrieve the next page of results.
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
     * A token to retrieve the next page of results.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ListPurchasableSkusResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ListPurchasableSkusResponse)
  private static final com.google.cloud.channel.v1.ListPurchasableSkusResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ListPurchasableSkusResponse();
  }

  public static com.google.cloud.channel.v1.ListPurchasableSkusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPurchasableSkusResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListPurchasableSkusResponse>() {
        @java.lang.Override
        public ListPurchasableSkusResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPurchasableSkusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPurchasableSkusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ListPurchasableSkusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
