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
 * Results of de-identifying a ContentItem.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DeidentifyContentResponse}
 */
public final class DeidentifyContentResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DeidentifyContentResponse)
    DeidentifyContentResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeidentifyContentResponse.newBuilder() to construct.
  private DeidentifyContentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeidentifyContentResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeidentifyContentResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DeidentifyContentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DeidentifyContentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DeidentifyContentResponse.class,
            com.google.privacy.dlp.v2.DeidentifyContentResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ITEM_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.ContentItem item_;
  /**
   *
   *
   * <pre>
   * The de-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   *
   * @return Whether the item field is set.
   */
  @java.lang.Override
  public boolean hasItem() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The de-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   *
   * @return The item.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.ContentItem getItem() {
    return item_ == null ? com.google.privacy.dlp.v2.ContentItem.getDefaultInstance() : item_;
  }
  /**
   *
   *
   * <pre>
   * The de-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.ContentItemOrBuilder getItemOrBuilder() {
    return item_ == null ? com.google.privacy.dlp.v2.ContentItem.getDefaultInstance() : item_;
  }

  public static final int OVERVIEW_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.TransformationOverview overview_;
  /**
   *
   *
   * <pre>
   * An overview of the changes that were made on the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
   *
   * @return Whether the overview field is set.
   */
  @java.lang.Override
  public boolean hasOverview() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * An overview of the changes that were made on the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
   *
   * @return The overview.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.TransformationOverview getOverview() {
    return overview_ == null
        ? com.google.privacy.dlp.v2.TransformationOverview.getDefaultInstance()
        : overview_;
  }
  /**
   *
   *
   * <pre>
   * An overview of the changes that were made on the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.TransformationOverviewOrBuilder getOverviewOrBuilder() {
    return overview_ == null
        ? com.google.privacy.dlp.v2.TransformationOverview.getDefaultInstance()
        : overview_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getItem());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getOverview());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getItem());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getOverview());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.DeidentifyContentResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DeidentifyContentResponse other =
        (com.google.privacy.dlp.v2.DeidentifyContentResponse) obj;

    if (hasItem() != other.hasItem()) return false;
    if (hasItem()) {
      if (!getItem().equals(other.getItem())) return false;
    }
    if (hasOverview() != other.hasOverview()) return false;
    if (hasOverview()) {
      if (!getOverview().equals(other.getOverview())) return false;
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
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    if (hasOverview()) {
      hash = (37 * hash) + OVERVIEW_FIELD_NUMBER;
      hash = (53 * hash) + getOverview().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.DeidentifyContentResponse prototype) {
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
   * Results of de-identifying a ContentItem.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DeidentifyContentResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DeidentifyContentResponse)
      com.google.privacy.dlp.v2.DeidentifyContentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DeidentifyContentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DeidentifyContentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DeidentifyContentResponse.class,
              com.google.privacy.dlp.v2.DeidentifyContentResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DeidentifyContentResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getItemFieldBuilder();
        getOverviewFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      item_ = null;
      if (itemBuilder_ != null) {
        itemBuilder_.dispose();
        itemBuilder_ = null;
      }
      overview_ = null;
      if (overviewBuilder_ != null) {
        overviewBuilder_.dispose();
        overviewBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DeidentifyContentResponse_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DeidentifyContentResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DeidentifyContentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DeidentifyContentResponse build() {
      com.google.privacy.dlp.v2.DeidentifyContentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DeidentifyContentResponse buildPartial() {
      com.google.privacy.dlp.v2.DeidentifyContentResponse result =
          new com.google.privacy.dlp.v2.DeidentifyContentResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.DeidentifyContentResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.item_ = itemBuilder_ == null ? item_ : itemBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.overview_ = overviewBuilder_ == null ? overview_ : overviewBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.privacy.dlp.v2.DeidentifyContentResponse) {
        return mergeFrom((com.google.privacy.dlp.v2.DeidentifyContentResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DeidentifyContentResponse other) {
      if (other == com.google.privacy.dlp.v2.DeidentifyContentResponse.getDefaultInstance())
        return this;
      if (other.hasItem()) {
        mergeItem(other.getItem());
      }
      if (other.hasOverview()) {
        mergeOverview(other.getOverview());
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
                input.readMessage(getItemFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getOverviewFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.privacy.dlp.v2.ContentItem item_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.ContentItem,
            com.google.privacy.dlp.v2.ContentItem.Builder,
            com.google.privacy.dlp.v2.ContentItemOrBuilder>
        itemBuilder_;
    /**
     *
     *
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     *
     * @return Whether the item field is set.
     */
    public boolean hasItem() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     *
     * @return The item.
     */
    public com.google.privacy.dlp.v2.ContentItem getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? com.google.privacy.dlp.v2.ContentItem.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public Builder setItem(com.google.privacy.dlp.v2.ContentItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
      } else {
        itemBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public Builder setItem(com.google.privacy.dlp.v2.ContentItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public Builder mergeItem(com.google.privacy.dlp.v2.ContentItem value) {
      if (itemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && item_ != null
            && item_ != com.google.privacy.dlp.v2.ContentItem.getDefaultInstance()) {
          getItemBuilder().mergeFrom(value);
        } else {
          item_ = value;
        }
      } else {
        itemBuilder_.mergeFrom(value);
      }
      if (item_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public Builder clearItem() {
      bitField0_ = (bitField0_ & ~0x00000001);
      item_ = null;
      if (itemBuilder_ != null) {
        itemBuilder_.dispose();
        itemBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public com.google.privacy.dlp.v2.ContentItem.Builder getItemBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public com.google.privacy.dlp.v2.ContentItemOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ? com.google.privacy.dlp.v2.ContentItem.getDefaultInstance() : item_;
      }
    }
    /**
     *
     *
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.ContentItem,
            com.google.privacy.dlp.v2.ContentItem.Builder,
            com.google.privacy.dlp.v2.ContentItemOrBuilder>
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.ContentItem,
                com.google.privacy.dlp.v2.ContentItem.Builder,
                com.google.privacy.dlp.v2.ContentItemOrBuilder>(
                getItem(), getParentForChildren(), isClean());
        item_ = null;
      }
      return itemBuilder_;
    }

    private com.google.privacy.dlp.v2.TransformationOverview overview_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.TransformationOverview,
            com.google.privacy.dlp.v2.TransformationOverview.Builder,
            com.google.privacy.dlp.v2.TransformationOverviewOrBuilder>
        overviewBuilder_;
    /**
     *
     *
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
     *
     * @return Whether the overview field is set.
     */
    public boolean hasOverview() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
     *
     * @return The overview.
     */
    public com.google.privacy.dlp.v2.TransformationOverview getOverview() {
      if (overviewBuilder_ == null) {
        return overview_ == null
            ? com.google.privacy.dlp.v2.TransformationOverview.getDefaultInstance()
            : overview_;
      } else {
        return overviewBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
     */
    public Builder setOverview(com.google.privacy.dlp.v2.TransformationOverview value) {
      if (overviewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        overview_ = value;
      } else {
        overviewBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
     */
    public Builder setOverview(
        com.google.privacy.dlp.v2.TransformationOverview.Builder builderForValue) {
      if (overviewBuilder_ == null) {
        overview_ = builderForValue.build();
      } else {
        overviewBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
     */
    public Builder mergeOverview(com.google.privacy.dlp.v2.TransformationOverview value) {
      if (overviewBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && overview_ != null
            && overview_ != com.google.privacy.dlp.v2.TransformationOverview.getDefaultInstance()) {
          getOverviewBuilder().mergeFrom(value);
        } else {
          overview_ = value;
        }
      } else {
        overviewBuilder_.mergeFrom(value);
      }
      if (overview_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
     */
    public Builder clearOverview() {
      bitField0_ = (bitField0_ & ~0x00000002);
      overview_ = null;
      if (overviewBuilder_ != null) {
        overviewBuilder_.dispose();
        overviewBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
     */
    public com.google.privacy.dlp.v2.TransformationOverview.Builder getOverviewBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOverviewFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
     */
    public com.google.privacy.dlp.v2.TransformationOverviewOrBuilder getOverviewOrBuilder() {
      if (overviewBuilder_ != null) {
        return overviewBuilder_.getMessageOrBuilder();
      } else {
        return overview_ == null
            ? com.google.privacy.dlp.v2.TransformationOverview.getDefaultInstance()
            : overview_;
      }
    }
    /**
     *
     *
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.TransformationOverview,
            com.google.privacy.dlp.v2.TransformationOverview.Builder,
            com.google.privacy.dlp.v2.TransformationOverviewOrBuilder>
        getOverviewFieldBuilder() {
      if (overviewBuilder_ == null) {
        overviewBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.TransformationOverview,
                com.google.privacy.dlp.v2.TransformationOverview.Builder,
                com.google.privacy.dlp.v2.TransformationOverviewOrBuilder>(
                getOverview(), getParentForChildren(), isClean());
        overview_ = null;
      }
      return overviewBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DeidentifyContentResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DeidentifyContentResponse)
  private static final com.google.privacy.dlp.v2.DeidentifyContentResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DeidentifyContentResponse();
  }

  public static com.google.privacy.dlp.v2.DeidentifyContentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeidentifyContentResponse> PARSER =
      new com.google.protobuf.AbstractParser<DeidentifyContentResponse>() {
        @java.lang.Override
        public DeidentifyContentResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeidentifyContentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeidentifyContentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DeidentifyContentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
