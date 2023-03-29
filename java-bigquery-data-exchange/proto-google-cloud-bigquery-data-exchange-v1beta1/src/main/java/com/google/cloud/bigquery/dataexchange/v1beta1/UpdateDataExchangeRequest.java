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
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

package com.google.cloud.bigquery.dataexchange.v1beta1;

/**
 *
 *
 * <pre>
 * Message for updating a data exchange.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest}
 */
public final class UpdateDataExchangeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest)
    UpdateDataExchangeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateDataExchangeRequest.newBuilder() to construct.
  private UpdateDataExchangeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateDataExchangeRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateDataExchangeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
        .internal_static_google_cloud_bigquery_dataexchange_v1beta1_UpdateDataExchangeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
        .internal_static_google_cloud_bigquery_dataexchange_v1beta1_UpdateDataExchangeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest.class,
            com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Field mask specifies the fields to update in the data exchange
   * resource. The fields specified in the
   * `updateMask` are relative to the resource and are not a full request.
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
   * Required. Field mask specifies the fields to update in the data exchange
   * resource. The fields specified in the
   * `updateMask` are relative to the resource and are not a full request.
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
   * Required. Field mask specifies the fields to update in the data exchange
   * resource. The fields specified in the
   * `updateMask` are relative to the resource and are not a full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int DATA_EXCHANGE_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange dataExchange_;
  /**
   *
   *
   * <pre>
   * Required. The data exchange to update.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataExchange field is set.
   */
  @java.lang.Override
  public boolean hasDataExchange() {
    return dataExchange_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The data exchange to update.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataExchange.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange getDataExchange() {
    return dataExchange_ == null
        ? com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.getDefaultInstance()
        : dataExchange_;
  }
  /**
   *
   *
   * <pre>
   * Required. The data exchange to update.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder
      getDataExchangeOrBuilder() {
    return dataExchange_ == null
        ? com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.getDefaultInstance()
        : dataExchange_;
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
    if (dataExchange_ != null) {
      output.writeMessage(2, getDataExchange());
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
    if (dataExchange_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDataExchange());
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
        instanceof com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest other =
        (com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasDataExchange() != other.hasDataExchange()) return false;
    if (hasDataExchange()) {
      if (!getDataExchange().equals(other.getDataExchange())) return false;
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
    if (hasDataExchange()) {
      hash = (37 * hash) + DATA_EXCHANGE_FIELD_NUMBER;
      hash = (53 * hash) + getDataExchange().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest parseFrom(
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
      com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest prototype) {
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
   * Message for updating a data exchange.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest)
      com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_UpdateDataExchangeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_UpdateDataExchangeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest.class,
              com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest.newBuilder()
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
      dataExchange_ = null;
      if (dataExchangeBuilder_ != null) {
        dataExchangeBuilder_.dispose();
        dataExchangeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_UpdateDataExchangeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest build() {
      com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest buildPartial() {
      com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest result =
          new com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataExchange_ =
            dataExchangeBuilder_ == null ? dataExchange_ : dataExchangeBuilder_.build();
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
      if (other
          instanceof com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest other) {
      if (other
          == com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest
              .getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasDataExchange()) {
        mergeDataExchange(other.getDataExchange());
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
                input.readMessage(getDataExchangeFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. Field mask specifies the fields to update in the data exchange
     * resource. The fields specified in the
     * `updateMask` are relative to the resource and are not a full request.
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
     * Required. Field mask specifies the fields to update in the data exchange
     * resource. The fields specified in the
     * `updateMask` are relative to the resource and are not a full request.
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
     * Required. Field mask specifies the fields to update in the data exchange
     * resource. The fields specified in the
     * `updateMask` are relative to the resource and are not a full request.
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
     * Required. Field mask specifies the fields to update in the data exchange
     * resource. The fields specified in the
     * `updateMask` are relative to the resource and are not a full request.
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
     * Required. Field mask specifies the fields to update in the data exchange
     * resource. The fields specified in the
     * `updateMask` are relative to the resource and are not a full request.
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
     * Required. Field mask specifies the fields to update in the data exchange
     * resource. The fields specified in the
     * `updateMask` are relative to the resource and are not a full request.
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
     * Required. Field mask specifies the fields to update in the data exchange
     * resource. The fields specified in the
     * `updateMask` are relative to the resource and are not a full request.
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
     * Required. Field mask specifies the fields to update in the data exchange
     * resource. The fields specified in the
     * `updateMask` are relative to the resource and are not a full request.
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
     * Required. Field mask specifies the fields to update in the data exchange
     * resource. The fields specified in the
     * `updateMask` are relative to the resource and are not a full request.
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

    private com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange dataExchange_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange,
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder,
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder>
        dataExchangeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The data exchange to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the dataExchange field is set.
     */
    public boolean hasDataExchange() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The data exchange to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dataExchange.
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange getDataExchange() {
      if (dataExchangeBuilder_ == null) {
        return dataExchange_ == null
            ? com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.getDefaultInstance()
            : dataExchange_;
      } else {
        return dataExchangeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The data exchange to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataExchange(
        com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange value) {
      if (dataExchangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataExchange_ = value;
      } else {
        dataExchangeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The data exchange to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataExchange(
        com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder builderForValue) {
      if (dataExchangeBuilder_ == null) {
        dataExchange_ = builderForValue.build();
      } else {
        dataExchangeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The data exchange to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDataExchange(
        com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange value) {
      if (dataExchangeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && dataExchange_ != null
            && dataExchange_
                != com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange
                    .getDefaultInstance()) {
          getDataExchangeBuilder().mergeFrom(value);
        } else {
          dataExchange_ = value;
        }
      } else {
        dataExchangeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The data exchange to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDataExchange() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataExchange_ = null;
      if (dataExchangeBuilder_ != null) {
        dataExchangeBuilder_.dispose();
        dataExchangeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The data exchange to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder
        getDataExchangeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDataExchangeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The data exchange to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder
        getDataExchangeOrBuilder() {
      if (dataExchangeBuilder_ != null) {
        return dataExchangeBuilder_.getMessageOrBuilder();
      } else {
        return dataExchange_ == null
            ? com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.getDefaultInstance()
            : dataExchange_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The data exchange to update.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange,
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder,
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder>
        getDataExchangeFieldBuilder() {
      if (dataExchangeBuilder_ == null) {
        dataExchangeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange,
                com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder,
                com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder>(
                getDataExchange(), getParentForChildren(), isClean());
        dataExchange_ = null;
      }
      return dataExchangeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest)
  private static final com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest();
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDataExchangeRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateDataExchangeRequest>() {
        @java.lang.Override
        public UpdateDataExchangeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDataExchangeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDataExchangeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.UpdateDataExchangeRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
