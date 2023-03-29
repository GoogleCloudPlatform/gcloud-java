/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [CloudChannelService.ListEntitlements][google.cloud.channel.v1.CloudChannelService.ListEntitlements].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ListEntitlementsResponse}
 */
public final class ListEntitlementsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ListEntitlementsResponse)
    ListEntitlementsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListEntitlementsResponse.newBuilder() to construct.
  private ListEntitlementsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListEntitlementsResponse() {
    entitlements_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListEntitlementsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListEntitlementsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListEntitlementsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ListEntitlementsResponse.class,
            com.google.cloud.channel.v1.ListEntitlementsResponse.Builder.class);
  }

  public static final int ENTITLEMENTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.channel.v1.Entitlement> entitlements_;
  /**
   *
   *
   * <pre>
   * The reseller customer's entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.Entitlement> getEntitlementsList() {
    return entitlements_;
  }
  /**
   *
   *
   * <pre>
   * The reseller customer's entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.EntitlementOrBuilder>
      getEntitlementsOrBuilderList() {
    return entitlements_;
  }
  /**
   *
   *
   * <pre>
   * The reseller customer's entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
   */
  @java.lang.Override
  public int getEntitlementsCount() {
    return entitlements_.size();
  }
  /**
   *
   *
   * <pre>
   * The reseller customer's entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.Entitlement getEntitlements(int index) {
    return entitlements_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The reseller customer's entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.EntitlementOrBuilder getEntitlementsOrBuilder(int index) {
    return entitlements_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to list the next page of results.
   * Pass to
   * [ListEntitlementsRequest.page_token][google.cloud.channel.v1.ListEntitlementsRequest.page_token]
   * to obtain that page.
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
   * A token to list the next page of results.
   * Pass to
   * [ListEntitlementsRequest.page_token][google.cloud.channel.v1.ListEntitlementsRequest.page_token]
   * to obtain that page.
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
    for (int i = 0; i < entitlements_.size(); i++) {
      output.writeMessage(1, entitlements_.get(i));
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
    for (int i = 0; i < entitlements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, entitlements_.get(i));
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
    if (!(obj instanceof com.google.cloud.channel.v1.ListEntitlementsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ListEntitlementsResponse other =
        (com.google.cloud.channel.v1.ListEntitlementsResponse) obj;

    if (!getEntitlementsList().equals(other.getEntitlementsList())) return false;
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
    if (getEntitlementsCount() > 0) {
      hash = (37 * hash) + ENTITLEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEntitlementsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.ListEntitlementsResponse prototype) {
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
   * Response message for
   * [CloudChannelService.ListEntitlements][google.cloud.channel.v1.CloudChannelService.ListEntitlements].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ListEntitlementsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ListEntitlementsResponse)
      com.google.cloud.channel.v1.ListEntitlementsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListEntitlementsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListEntitlementsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ListEntitlementsResponse.class,
              com.google.cloud.channel.v1.ListEntitlementsResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ListEntitlementsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (entitlementsBuilder_ == null) {
        entitlements_ = java.util.Collections.emptyList();
      } else {
        entitlements_ = null;
        entitlementsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListEntitlementsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListEntitlementsResponse getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ListEntitlementsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListEntitlementsResponse build() {
      com.google.cloud.channel.v1.ListEntitlementsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListEntitlementsResponse buildPartial() {
      com.google.cloud.channel.v1.ListEntitlementsResponse result =
          new com.google.cloud.channel.v1.ListEntitlementsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.channel.v1.ListEntitlementsResponse result) {
      if (entitlementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entitlements_ = java.util.Collections.unmodifiableList(entitlements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entitlements_ = entitlements_;
      } else {
        result.entitlements_ = entitlementsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.channel.v1.ListEntitlementsResponse result) {
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
      if (other instanceof com.google.cloud.channel.v1.ListEntitlementsResponse) {
        return mergeFrom((com.google.cloud.channel.v1.ListEntitlementsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ListEntitlementsResponse other) {
      if (other == com.google.cloud.channel.v1.ListEntitlementsResponse.getDefaultInstance())
        return this;
      if (entitlementsBuilder_ == null) {
        if (!other.entitlements_.isEmpty()) {
          if (entitlements_.isEmpty()) {
            entitlements_ = other.entitlements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntitlementsIsMutable();
            entitlements_.addAll(other.entitlements_);
          }
          onChanged();
        }
      } else {
        if (!other.entitlements_.isEmpty()) {
          if (entitlementsBuilder_.isEmpty()) {
            entitlementsBuilder_.dispose();
            entitlementsBuilder_ = null;
            entitlements_ = other.entitlements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entitlementsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEntitlementsFieldBuilder()
                    : null;
          } else {
            entitlementsBuilder_.addAllMessages(other.entitlements_);
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
                com.google.cloud.channel.v1.Entitlement m =
                    input.readMessage(
                        com.google.cloud.channel.v1.Entitlement.parser(), extensionRegistry);
                if (entitlementsBuilder_ == null) {
                  ensureEntitlementsIsMutable();
                  entitlements_.add(m);
                } else {
                  entitlementsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.channel.v1.Entitlement> entitlements_ =
        java.util.Collections.emptyList();

    private void ensureEntitlementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entitlements_ =
            new java.util.ArrayList<com.google.cloud.channel.v1.Entitlement>(entitlements_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.Entitlement,
            com.google.cloud.channel.v1.Entitlement.Builder,
            com.google.cloud.channel.v1.EntitlementOrBuilder>
        entitlementsBuilder_;

    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.Entitlement> getEntitlementsList() {
      if (entitlementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entitlements_);
      } else {
        return entitlementsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public int getEntitlementsCount() {
      if (entitlementsBuilder_ == null) {
        return entitlements_.size();
      } else {
        return entitlementsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public com.google.cloud.channel.v1.Entitlement getEntitlements(int index) {
      if (entitlementsBuilder_ == null) {
        return entitlements_.get(index);
      } else {
        return entitlementsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public Builder setEntitlements(int index, com.google.cloud.channel.v1.Entitlement value) {
      if (entitlementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitlementsIsMutable();
        entitlements_.set(index, value);
        onChanged();
      } else {
        entitlementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public Builder setEntitlements(
        int index, com.google.cloud.channel.v1.Entitlement.Builder builderForValue) {
      if (entitlementsBuilder_ == null) {
        ensureEntitlementsIsMutable();
        entitlements_.set(index, builderForValue.build());
        onChanged();
      } else {
        entitlementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public Builder addEntitlements(com.google.cloud.channel.v1.Entitlement value) {
      if (entitlementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitlementsIsMutable();
        entitlements_.add(value);
        onChanged();
      } else {
        entitlementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public Builder addEntitlements(int index, com.google.cloud.channel.v1.Entitlement value) {
      if (entitlementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitlementsIsMutable();
        entitlements_.add(index, value);
        onChanged();
      } else {
        entitlementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public Builder addEntitlements(
        com.google.cloud.channel.v1.Entitlement.Builder builderForValue) {
      if (entitlementsBuilder_ == null) {
        ensureEntitlementsIsMutable();
        entitlements_.add(builderForValue.build());
        onChanged();
      } else {
        entitlementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public Builder addEntitlements(
        int index, com.google.cloud.channel.v1.Entitlement.Builder builderForValue) {
      if (entitlementsBuilder_ == null) {
        ensureEntitlementsIsMutable();
        entitlements_.add(index, builderForValue.build());
        onChanged();
      } else {
        entitlementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public Builder addAllEntitlements(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.Entitlement> values) {
      if (entitlementsBuilder_ == null) {
        ensureEntitlementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entitlements_);
        onChanged();
      } else {
        entitlementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public Builder clearEntitlements() {
      if (entitlementsBuilder_ == null) {
        entitlements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entitlementsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public Builder removeEntitlements(int index) {
      if (entitlementsBuilder_ == null) {
        ensureEntitlementsIsMutable();
        entitlements_.remove(index);
        onChanged();
      } else {
        entitlementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public com.google.cloud.channel.v1.Entitlement.Builder getEntitlementsBuilder(int index) {
      return getEntitlementsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public com.google.cloud.channel.v1.EntitlementOrBuilder getEntitlementsOrBuilder(int index) {
      if (entitlementsBuilder_ == null) {
        return entitlements_.get(index);
      } else {
        return entitlementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.EntitlementOrBuilder>
        getEntitlementsOrBuilderList() {
      if (entitlementsBuilder_ != null) {
        return entitlementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entitlements_);
      }
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public com.google.cloud.channel.v1.Entitlement.Builder addEntitlementsBuilder() {
      return getEntitlementsFieldBuilder()
          .addBuilder(com.google.cloud.channel.v1.Entitlement.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public com.google.cloud.channel.v1.Entitlement.Builder addEntitlementsBuilder(int index) {
      return getEntitlementsFieldBuilder()
          .addBuilder(index, com.google.cloud.channel.v1.Entitlement.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The reseller customer's entitlements.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.Entitlement.Builder>
        getEntitlementsBuilderList() {
      return getEntitlementsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.Entitlement,
            com.google.cloud.channel.v1.Entitlement.Builder,
            com.google.cloud.channel.v1.EntitlementOrBuilder>
        getEntitlementsFieldBuilder() {
      if (entitlementsBuilder_ == null) {
        entitlementsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.channel.v1.Entitlement,
                com.google.cloud.channel.v1.Entitlement.Builder,
                com.google.cloud.channel.v1.EntitlementOrBuilder>(
                entitlements_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        entitlements_ = null;
      }
      return entitlementsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to list the next page of results.
     * Pass to
     * [ListEntitlementsRequest.page_token][google.cloud.channel.v1.ListEntitlementsRequest.page_token]
     * to obtain that page.
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
     * A token to list the next page of results.
     * Pass to
     * [ListEntitlementsRequest.page_token][google.cloud.channel.v1.ListEntitlementsRequest.page_token]
     * to obtain that page.
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
     * A token to list the next page of results.
     * Pass to
     * [ListEntitlementsRequest.page_token][google.cloud.channel.v1.ListEntitlementsRequest.page_token]
     * to obtain that page.
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
     * A token to list the next page of results.
     * Pass to
     * [ListEntitlementsRequest.page_token][google.cloud.channel.v1.ListEntitlementsRequest.page_token]
     * to obtain that page.
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
     * A token to list the next page of results.
     * Pass to
     * [ListEntitlementsRequest.page_token][google.cloud.channel.v1.ListEntitlementsRequest.page_token]
     * to obtain that page.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ListEntitlementsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ListEntitlementsResponse)
  private static final com.google.cloud.channel.v1.ListEntitlementsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ListEntitlementsResponse();
  }

  public static com.google.cloud.channel.v1.ListEntitlementsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEntitlementsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListEntitlementsResponse>() {
        @java.lang.Override
        public ListEntitlementsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListEntitlementsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEntitlementsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ListEntitlementsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
