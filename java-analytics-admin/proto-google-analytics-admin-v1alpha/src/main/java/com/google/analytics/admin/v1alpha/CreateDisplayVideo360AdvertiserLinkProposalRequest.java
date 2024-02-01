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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for CreateDisplayVideo360AdvertiserLinkProposal RPC.
 * </pre>
 *
 * Protobuf type {@code
 * google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest}
 */
public final class CreateDisplayVideo360AdvertiserLinkProposalRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest)
    CreateDisplayVideo360AdvertiserLinkProposalRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateDisplayVideo360AdvertiserLinkProposalRequest.newBuilder() to construct.
  private CreateDisplayVideo360AdvertiserLinkProposalRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDisplayVideo360AdvertiserLinkProposalRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDisplayVideo360AdvertiserLinkProposalRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateDisplayVideo360AdvertiserLinkProposalRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateDisplayVideo360AdvertiserLinkProposalRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
                .class,
            com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
                .Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal
      displayVideo360AdvertiserLinkProposal_;
  /**
   *
   *
   * <pre>
   * Required. The DisplayVideo360AdvertiserLinkProposal to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the displayVideo360AdvertiserLinkProposal field is set.
   */
  @java.lang.Override
  public boolean hasDisplayVideo360AdvertiserLinkProposal() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The DisplayVideo360AdvertiserLinkProposal to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The displayVideo360AdvertiserLinkProposal.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal
      getDisplayVideo360AdvertiserLinkProposal() {
    return displayVideo360AdvertiserLinkProposal_ == null
        ? com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal
            .getDefaultInstance()
        : displayVideo360AdvertiserLinkProposal_;
  }
  /**
   *
   *
   * <pre>
   * Required. The DisplayVideo360AdvertiserLinkProposal to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposalOrBuilder
      getDisplayVideo360AdvertiserLinkProposalOrBuilder() {
    return displayVideo360AdvertiserLinkProposal_ == null
        ? com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal
            .getDefaultInstance()
        : displayVideo360AdvertiserLinkProposal_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getDisplayVideo360AdvertiserLinkProposal());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getDisplayVideo360AdvertiserLinkProposal());
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
    if (!(obj
        instanceof
        com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest other =
        (com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasDisplayVideo360AdvertiserLinkProposal()
        != other.hasDisplayVideo360AdvertiserLinkProposal()) return false;
    if (hasDisplayVideo360AdvertiserLinkProposal()) {
      if (!getDisplayVideo360AdvertiserLinkProposal()
          .equals(other.getDisplayVideo360AdvertiserLinkProposal())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasDisplayVideo360AdvertiserLinkProposal()) {
      hash = (37 * hash) + DISPLAY_VIDEO_360_ADVERTISER_LINK_PROPOSAL_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayVideo360AdvertiserLinkProposal().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      parseFrom(
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
      com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
          prototype) {
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
   * Request message for CreateDisplayVideo360AdvertiserLinkProposal RPC.
   * </pre>
   *
   * Protobuf type {@code
   * google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest)
      com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateDisplayVideo360AdvertiserLinkProposalRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateDisplayVideo360AdvertiserLinkProposalRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
                  .class,
              com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
                  .Builder.class);
    }

    // Construct using
    // com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDisplayVideo360AdvertiserLinkProposalFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      displayVideo360AdvertiserLinkProposal_ = null;
      if (displayVideo360AdvertiserLinkProposalBuilder_ != null) {
        displayVideo360AdvertiserLinkProposalBuilder_.dispose();
        displayVideo360AdvertiserLinkProposalBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateDisplayVideo360AdvertiserLinkProposalRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
        build() {
      com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
        buildPartial() {
      com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest result =
          new com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest(
              this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
            result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.displayVideo360AdvertiserLinkProposal_ =
            displayVideo360AdvertiserLinkProposalBuilder_ == null
                ? displayVideo360AdvertiserLinkProposal_
                : displayVideo360AdvertiserLinkProposalBuilder_.build();
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
      if (other
          instanceof
          com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest) {
        return mergeFrom(
            (com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
            other) {
      if (other
          == com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDisplayVideo360AdvertiserLinkProposal()) {
        mergeDisplayVideo360AdvertiserLinkProposal(
            other.getDisplayVideo360AdvertiserLinkProposal());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getDisplayVideo360AdvertiserLinkProposalFieldBuilder().getBuilder(),
                    extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal
        displayVideo360AdvertiserLinkProposal_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal,
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal.Builder,
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposalOrBuilder>
        displayVideo360AdvertiserLinkProposalBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The DisplayVideo360AdvertiserLinkProposal to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the displayVideo360AdvertiserLinkProposal field is set.
     */
    public boolean hasDisplayVideo360AdvertiserLinkProposal() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The DisplayVideo360AdvertiserLinkProposal to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The displayVideo360AdvertiserLinkProposal.
     */
    public com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal
        getDisplayVideo360AdvertiserLinkProposal() {
      if (displayVideo360AdvertiserLinkProposalBuilder_ == null) {
        return displayVideo360AdvertiserLinkProposal_ == null
            ? com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal
                .getDefaultInstance()
            : displayVideo360AdvertiserLinkProposal_;
      } else {
        return displayVideo360AdvertiserLinkProposalBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The DisplayVideo360AdvertiserLinkProposal to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDisplayVideo360AdvertiserLinkProposal(
        com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal value) {
      if (displayVideo360AdvertiserLinkProposalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        displayVideo360AdvertiserLinkProposal_ = value;
      } else {
        displayVideo360AdvertiserLinkProposalBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DisplayVideo360AdvertiserLinkProposal to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDisplayVideo360AdvertiserLinkProposal(
        com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal.Builder
            builderForValue) {
      if (displayVideo360AdvertiserLinkProposalBuilder_ == null) {
        displayVideo360AdvertiserLinkProposal_ = builderForValue.build();
      } else {
        displayVideo360AdvertiserLinkProposalBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DisplayVideo360AdvertiserLinkProposal to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDisplayVideo360AdvertiserLinkProposal(
        com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal value) {
      if (displayVideo360AdvertiserLinkProposalBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && displayVideo360AdvertiserLinkProposal_ != null
            && displayVideo360AdvertiserLinkProposal_
                != com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal
                    .getDefaultInstance()) {
          getDisplayVideo360AdvertiserLinkProposalBuilder().mergeFrom(value);
        } else {
          displayVideo360AdvertiserLinkProposal_ = value;
        }
      } else {
        displayVideo360AdvertiserLinkProposalBuilder_.mergeFrom(value);
      }
      if (displayVideo360AdvertiserLinkProposal_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DisplayVideo360AdvertiserLinkProposal to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDisplayVideo360AdvertiserLinkProposal() {
      bitField0_ = (bitField0_ & ~0x00000002);
      displayVideo360AdvertiserLinkProposal_ = null;
      if (displayVideo360AdvertiserLinkProposalBuilder_ != null) {
        displayVideo360AdvertiserLinkProposalBuilder_.dispose();
        displayVideo360AdvertiserLinkProposalBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DisplayVideo360AdvertiserLinkProposal to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal.Builder
        getDisplayVideo360AdvertiserLinkProposalBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDisplayVideo360AdvertiserLinkProposalFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The DisplayVideo360AdvertiserLinkProposal to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposalOrBuilder
        getDisplayVideo360AdvertiserLinkProposalOrBuilder() {
      if (displayVideo360AdvertiserLinkProposalBuilder_ != null) {
        return displayVideo360AdvertiserLinkProposalBuilder_.getMessageOrBuilder();
      } else {
        return displayVideo360AdvertiserLinkProposal_ == null
            ? com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal
                .getDefaultInstance()
            : displayVideo360AdvertiserLinkProposal_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The DisplayVideo360AdvertiserLinkProposal to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal display_video_360_advertiser_link_proposal = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal,
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal.Builder,
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposalOrBuilder>
        getDisplayVideo360AdvertiserLinkProposalFieldBuilder() {
      if (displayVideo360AdvertiserLinkProposalBuilder_ == null) {
        displayVideo360AdvertiserLinkProposalBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal,
                com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposal.Builder,
                com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkProposalOrBuilder>(
                getDisplayVideo360AdvertiserLinkProposal(), getParentForChildren(), isClean());
        displayVideo360AdvertiserLinkProposal_ = null;
      }
      return displayVideo360AdvertiserLinkProposalBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest)
  private static final com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest();
  }

  public static com.google.analytics.admin.v1alpha
          .CreateDisplayVideo360AdvertiserLinkProposalRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<
          CreateDisplayVideo360AdvertiserLinkProposalRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<
              CreateDisplayVideo360AdvertiserLinkProposalRequest>() {
            @java.lang.Override
            public CreateDisplayVideo360AdvertiserLinkProposalRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<CreateDisplayVideo360AdvertiserLinkProposalRequest>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDisplayVideo360AdvertiserLinkProposalRequest>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateDisplayVideo360AdvertiserLinkProposalRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
