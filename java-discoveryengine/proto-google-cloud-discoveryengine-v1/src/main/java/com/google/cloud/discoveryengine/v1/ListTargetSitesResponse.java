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
// source: google/cloud/discoveryengine/v1/site_search_engine_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [SiteSearchEngineService.ListTargetSites][google.cloud.discoveryengine.v1.SiteSearchEngineService.ListTargetSites]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1.ListTargetSitesResponse}
 */
public final class ListTargetSitesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1.ListTargetSitesResponse)
    ListTargetSitesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListTargetSitesResponse.newBuilder() to construct.
  private ListTargetSitesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListTargetSitesResponse() {
    targetSites_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListTargetSitesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1_ListTargetSitesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1_ListTargetSitesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1.ListTargetSitesResponse.class,
            com.google.cloud.discoveryengine.v1.ListTargetSitesResponse.Builder.class);
  }

  public static final int TARGET_SITES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.discoveryengine.v1.TargetSite> targetSites_;
  /**
   *
   *
   * <pre>
   * List of TargetSites.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.discoveryengine.v1.TargetSite> getTargetSitesList() {
    return targetSites_;
  }
  /**
   *
   *
   * <pre>
   * List of TargetSites.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>
      getTargetSitesOrBuilderList() {
    return targetSites_;
  }
  /**
   *
   *
   * <pre>
   * List of TargetSites.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
   */
  @java.lang.Override
  public int getTargetSitesCount() {
    return targetSites_.size();
  }
  /**
   *
   *
   * <pre>
   * List of TargetSites.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.TargetSite getTargetSites(int index) {
    return targetSites_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of TargetSites.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder getTargetSitesOrBuilder(
      int index) {
    return targetSites_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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

  public static final int TOTAL_SIZE_FIELD_NUMBER = 3;
  private int totalSize_ = 0;
  /**
   *
   *
   * <pre>
   * The total number of items matching the request.
   * This will always be populated in the response.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  @java.lang.Override
  public int getTotalSize() {
    return totalSize_;
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
    for (int i = 0; i < targetSites_.size(); i++) {
      output.writeMessage(1, targetSites_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      output.writeInt32(3, totalSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < targetSites_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, targetSites_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, totalSize_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1.ListTargetSitesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1.ListTargetSitesResponse other =
        (com.google.cloud.discoveryengine.v1.ListTargetSitesResponse) obj;

    if (!getTargetSitesList().equals(other.getTargetSitesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (getTotalSize() != other.getTotalSize()) return false;
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
    if (getTargetSitesCount() > 0) {
      hash = (37 * hash) + TARGET_SITES_FIELD_NUMBER;
      hash = (53 * hash) + getTargetSitesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse parseFrom(
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
      com.google.cloud.discoveryengine.v1.ListTargetSitesResponse prototype) {
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
   * [SiteSearchEngineService.ListTargetSites][google.cloud.discoveryengine.v1.SiteSearchEngineService.ListTargetSites]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1.ListTargetSitesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1.ListTargetSitesResponse)
      com.google.cloud.discoveryengine.v1.ListTargetSitesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_ListTargetSitesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_ListTargetSitesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1.ListTargetSitesResponse.class,
              com.google.cloud.discoveryengine.v1.ListTargetSitesResponse.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1.ListTargetSitesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (targetSitesBuilder_ == null) {
        targetSites_ = java.util.Collections.emptyList();
      } else {
        targetSites_ = null;
        targetSitesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      totalSize_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_ListTargetSitesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ListTargetSitesResponse getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1.ListTargetSitesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ListTargetSitesResponse build() {
      com.google.cloud.discoveryengine.v1.ListTargetSitesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ListTargetSitesResponse buildPartial() {
      com.google.cloud.discoveryengine.v1.ListTargetSitesResponse result =
          new com.google.cloud.discoveryengine.v1.ListTargetSitesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.discoveryengine.v1.ListTargetSitesResponse result) {
      if (targetSitesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          targetSites_ = java.util.Collections.unmodifiableList(targetSites_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.targetSites_ = targetSites_;
      } else {
        result.targetSites_ = targetSitesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1.ListTargetSitesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.totalSize_ = totalSize_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1.ListTargetSitesResponse) {
        return mergeFrom((com.google.cloud.discoveryengine.v1.ListTargetSitesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1.ListTargetSitesResponse other) {
      if (other == com.google.cloud.discoveryengine.v1.ListTargetSitesResponse.getDefaultInstance())
        return this;
      if (targetSitesBuilder_ == null) {
        if (!other.targetSites_.isEmpty()) {
          if (targetSites_.isEmpty()) {
            targetSites_ = other.targetSites_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTargetSitesIsMutable();
            targetSites_.addAll(other.targetSites_);
          }
          onChanged();
        }
      } else {
        if (!other.targetSites_.isEmpty()) {
          if (targetSitesBuilder_.isEmpty()) {
            targetSitesBuilder_.dispose();
            targetSitesBuilder_ = null;
            targetSites_ = other.targetSites_;
            bitField0_ = (bitField0_ & ~0x00000001);
            targetSitesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTargetSitesFieldBuilder()
                    : null;
          } else {
            targetSitesBuilder_.addAllMessages(other.targetSites_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getTotalSize() != 0) {
        setTotalSize(other.getTotalSize());
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
                com.google.cloud.discoveryengine.v1.TargetSite m =
                    input.readMessage(
                        com.google.cloud.discoveryengine.v1.TargetSite.parser(), extensionRegistry);
                if (targetSitesBuilder_ == null) {
                  ensureTargetSitesIsMutable();
                  targetSites_.add(m);
                } else {
                  targetSitesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                totalSize_ = input.readInt32();
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

    private java.util.List<com.google.cloud.discoveryengine.v1.TargetSite> targetSites_ =
        java.util.Collections.emptyList();

    private void ensureTargetSitesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        targetSites_ =
            new java.util.ArrayList<com.google.cloud.discoveryengine.v1.TargetSite>(targetSites_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.discoveryengine.v1.TargetSite,
            com.google.cloud.discoveryengine.v1.TargetSite.Builder,
            com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>
        targetSitesBuilder_;

    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public java.util.List<com.google.cloud.discoveryengine.v1.TargetSite> getTargetSitesList() {
      if (targetSitesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(targetSites_);
      } else {
        return targetSitesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public int getTargetSitesCount() {
      if (targetSitesBuilder_ == null) {
        return targetSites_.size();
      } else {
        return targetSitesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSite getTargetSites(int index) {
      if (targetSitesBuilder_ == null) {
        return targetSites_.get(index);
      } else {
        return targetSitesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder setTargetSites(int index, com.google.cloud.discoveryengine.v1.TargetSite value) {
      if (targetSitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetSitesIsMutable();
        targetSites_.set(index, value);
        onChanged();
      } else {
        targetSitesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder setTargetSites(
        int index, com.google.cloud.discoveryengine.v1.TargetSite.Builder builderForValue) {
      if (targetSitesBuilder_ == null) {
        ensureTargetSitesIsMutable();
        targetSites_.set(index, builderForValue.build());
        onChanged();
      } else {
        targetSitesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder addTargetSites(com.google.cloud.discoveryengine.v1.TargetSite value) {
      if (targetSitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetSitesIsMutable();
        targetSites_.add(value);
        onChanged();
      } else {
        targetSitesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder addTargetSites(int index, com.google.cloud.discoveryengine.v1.TargetSite value) {
      if (targetSitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetSitesIsMutable();
        targetSites_.add(index, value);
        onChanged();
      } else {
        targetSitesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder addTargetSites(
        com.google.cloud.discoveryengine.v1.TargetSite.Builder builderForValue) {
      if (targetSitesBuilder_ == null) {
        ensureTargetSitesIsMutable();
        targetSites_.add(builderForValue.build());
        onChanged();
      } else {
        targetSitesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder addTargetSites(
        int index, com.google.cloud.discoveryengine.v1.TargetSite.Builder builderForValue) {
      if (targetSitesBuilder_ == null) {
        ensureTargetSitesIsMutable();
        targetSites_.add(index, builderForValue.build());
        onChanged();
      } else {
        targetSitesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder addAllTargetSites(
        java.lang.Iterable<? extends com.google.cloud.discoveryengine.v1.TargetSite> values) {
      if (targetSitesBuilder_ == null) {
        ensureTargetSitesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, targetSites_);
        onChanged();
      } else {
        targetSitesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder clearTargetSites() {
      if (targetSitesBuilder_ == null) {
        targetSites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        targetSitesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder removeTargetSites(int index) {
      if (targetSitesBuilder_ == null) {
        ensureTargetSitesIsMutable();
        targetSites_.remove(index);
        onChanged();
      } else {
        targetSitesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSite.Builder getTargetSitesBuilder(int index) {
      return getTargetSitesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder getTargetSitesOrBuilder(
        int index) {
      if (targetSitesBuilder_ == null) {
        return targetSites_.get(index);
      } else {
        return targetSitesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>
        getTargetSitesOrBuilderList() {
      if (targetSitesBuilder_ != null) {
        return targetSitesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(targetSites_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSite.Builder addTargetSitesBuilder() {
      return getTargetSitesFieldBuilder()
          .addBuilder(com.google.cloud.discoveryengine.v1.TargetSite.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSite.Builder addTargetSitesBuilder(int index) {
      return getTargetSitesFieldBuilder()
          .addBuilder(index, com.google.cloud.discoveryengine.v1.TargetSite.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of TargetSites.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public java.util.List<com.google.cloud.discoveryengine.v1.TargetSite.Builder>
        getTargetSitesBuilderList() {
      return getTargetSitesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.discoveryengine.v1.TargetSite,
            com.google.cloud.discoveryengine.v1.TargetSite.Builder,
            com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>
        getTargetSitesFieldBuilder() {
      if (targetSitesBuilder_ == null) {
        targetSitesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.discoveryengine.v1.TargetSite,
                com.google.cloud.discoveryengine.v1.TargetSite.Builder,
                com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>(
                targetSites_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        targetSites_ = null;
      }
      return targetSitesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    private int totalSize_;
    /**
     *
     *
     * <pre>
     * The total number of items matching the request.
     * This will always be populated in the response.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     *
     * @return The totalSize.
     */
    @java.lang.Override
    public int getTotalSize() {
      return totalSize_;
    }
    /**
     *
     *
     * <pre>
     * The total number of items matching the request.
     * This will always be populated in the response.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     *
     * @param value The totalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSize(int value) {

      totalSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total number of items matching the request.
     * This will always be populated in the response.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTotalSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      totalSize_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1.ListTargetSitesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1.ListTargetSitesResponse)
  private static final com.google.cloud.discoveryengine.v1.ListTargetSitesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1.ListTargetSitesResponse();
  }

  public static com.google.cloud.discoveryengine.v1.ListTargetSitesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTargetSitesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListTargetSitesResponse>() {
        @java.lang.Override
        public ListTargetSitesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTargetSitesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTargetSitesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.ListTargetSitesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
