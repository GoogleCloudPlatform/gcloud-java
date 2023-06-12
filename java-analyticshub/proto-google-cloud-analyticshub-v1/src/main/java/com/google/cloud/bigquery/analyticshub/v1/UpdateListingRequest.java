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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

package com.google.cloud.bigquery.analyticshub.v1;

/**
 *
 *
 * <pre>
 * Message for updating a Listing.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.UpdateListingRequest}
 */
public final class UpdateListingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.analyticshub.v1.UpdateListingRequest)
    UpdateListingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateListingRequest.newBuilder() to construct.
  private UpdateListingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateListingRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateListingRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
        .internal_static_google_cloud_bigquery_analyticshub_v1_UpdateListingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
        .internal_static_google_cloud_bigquery_analyticshub_v1_UpdateListingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest.class,
            com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Field mask specifies the fields to update in the listing resource. The
   * fields specified in the `updateMask` are relative to the resource and are
   * not a full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Field mask specifies the fields to update in the listing resource. The
   * fields specified in the `updateMask` are relative to the resource and are
   * not a full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Field mask specifies the fields to update in the listing resource. The
   * fields specified in the `updateMask` are relative to the resource and are
   * not a full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int LISTING_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.analyticshub.v1.Listing listing_;
  /**
   *
   *
   * <pre>
   * Required. The listing to update.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the listing field is set.
   */
  @java.lang.Override
  public boolean hasListing() {
    return listing_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The listing to update.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The listing.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.Listing getListing() {
    return listing_ == null
        ? com.google.cloud.bigquery.analyticshub.v1.Listing.getDefaultInstance()
        : listing_;
  }
  /**
   *
   *
   * <pre>
   * Required. The listing to update.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder getListingOrBuilder() {
    return listing_ == null
        ? com.google.cloud.bigquery.analyticshub.v1.Listing.getDefaultInstance()
        : listing_;
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (listing_ != null) {
      output.writeMessage(2, getListing());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateMask());
    }
    if (listing_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getListing());
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
    if (!(obj instanceof com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest other =
        (com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasListing() != other.hasListing()) return false;
    if (hasListing()) {
      if (!getListing().equals(other.getListing())) return false;
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasListing()) {
      hash = (37 * hash) + LISTING_FIELD_NUMBER;
      hash = (53 * hash) + getListing().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest parseFrom(
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
      com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest prototype) {
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
   * Message for updating a Listing.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.UpdateListingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.analyticshub.v1.UpdateListingRequest)
      com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_UpdateListingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_UpdateListingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest.class,
              com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      listing_ = null;
      if (listingBuilder_ != null) {
        listingBuilder_.dispose();
        listingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_UpdateListingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest build() {
      com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest buildPartial() {
      com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest result =
          new com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.listing_ = listingBuilder_ == null ? listing_ : listingBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest) {
        return mergeFrom((com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest other) {
      if (other
          == com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasListing()) {
        mergeListing(other.getListing());
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
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getListingFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Field mask specifies the fields to update in the listing resource. The
     * fields specified in the `updateMask` are relative to the resource and are
     * not a full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask specifies the fields to update in the listing resource. The
     * fields specified in the `updateMask` are relative to the resource and are
     * not a full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask specifies the fields to update in the listing resource. The
     * fields specified in the `updateMask` are relative to the resource and are
     * not a full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask specifies the fields to update in the listing resource. The
     * fields specified in the `updateMask` are relative to the resource and are
     * not a full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask specifies the fields to update in the listing resource. The
     * fields specified in the `updateMask` are relative to the resource and are
     * not a full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask specifies the fields to update in the listing resource. The
     * fields specified in the `updateMask` are relative to the resource and are
     * not a full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask specifies the fields to update in the listing resource. The
     * fields specified in the `updateMask` are relative to the resource and are
     * not a full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask specifies the fields to update in the listing resource. The
     * fields specified in the `updateMask` are relative to the resource and are
     * not a full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask specifies the fields to update in the listing resource. The
     * fields specified in the `updateMask` are relative to the resource and are
     * not a full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.cloud.bigquery.analyticshub.v1.Listing listing_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.analyticshub.v1.Listing,
            com.google.cloud.bigquery.analyticshub.v1.Listing.Builder,
            com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder>
        listingBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The listing to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the listing field is set.
     */
    public boolean hasListing() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The listing.
     */
    public com.google.cloud.bigquery.analyticshub.v1.Listing getListing() {
      if (listingBuilder_ == null) {
        return listing_ == null
            ? com.google.cloud.bigquery.analyticshub.v1.Listing.getDefaultInstance()
            : listing_;
      } else {
        return listingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setListing(com.google.cloud.bigquery.analyticshub.v1.Listing value) {
      if (listingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        listing_ = value;
      } else {
        listingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setListing(
        com.google.cloud.bigquery.analyticshub.v1.Listing.Builder builderForValue) {
      if (listingBuilder_ == null) {
        listing_ = builderForValue.build();
      } else {
        listingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeListing(com.google.cloud.bigquery.analyticshub.v1.Listing value) {
      if (listingBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && listing_ != null
            && listing_ != com.google.cloud.bigquery.analyticshub.v1.Listing.getDefaultInstance()) {
          getListingBuilder().mergeFrom(value);
        } else {
          listing_ = value;
        }
      } else {
        listingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearListing() {
      bitField0_ = (bitField0_ & ~0x00000002);
      listing_ = null;
      if (listingBuilder_ != null) {
        listingBuilder_.dispose();
        listingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.analyticshub.v1.Listing.Builder getListingBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getListingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder getListingOrBuilder() {
      if (listingBuilder_ != null) {
        return listingBuilder_.getMessageOrBuilder();
      } else {
        return listing_ == null
            ? com.google.cloud.bigquery.analyticshub.v1.Listing.getDefaultInstance()
            : listing_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.analyticshub.v1.Listing,
            com.google.cloud.bigquery.analyticshub.v1.Listing.Builder,
            com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder>
        getListingFieldBuilder() {
      if (listingBuilder_ == null) {
        listingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.analyticshub.v1.Listing,
                com.google.cloud.bigquery.analyticshub.v1.Listing.Builder,
                com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder>(
                getListing(), getParentForChildren(), isClean());
        listing_ = null;
      }
      return listingBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.analyticshub.v1.UpdateListingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.analyticshub.v1.UpdateListingRequest)
  private static final com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest();
  }

  public static com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateListingRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateListingRequest>() {
        @java.lang.Override
        public UpdateListingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateListingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateListingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
