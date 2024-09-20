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
// source: google/cloud/aiplatform/v1/feature_online_store_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [FeatureOnlineStoreService.FetchFeatureValues][google.cloud.aiplatform.v1.FeatureOnlineStoreService.FetchFeatureValues].
 * All the features under the requested feature view will be returned.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.FetchFeatureValuesRequest}
 */
public final class FetchFeatureValuesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.FetchFeatureValuesRequest)
    FetchFeatureValuesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FetchFeatureValuesRequest.newBuilder() to construct.
  private FetchFeatureValuesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FetchFeatureValuesRequest() {
    featureView_ = "";
    dataFormat_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FetchFeatureValuesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto
        .internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto
        .internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest.class,
            com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FEATURE_VIEW_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object featureView_ = "";
  /**
   *
   *
   * <pre>
   * Required. FeatureView resource format
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
   * </pre>
   *
   * <code>
   * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The featureView.
   */
  @java.lang.Override
  public java.lang.String getFeatureView() {
    java.lang.Object ref = featureView_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      featureView_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. FeatureView resource format
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
   * </pre>
   *
   * <code>
   * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for featureView.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFeatureViewBytes() {
    java.lang.Object ref = featureView_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      featureView_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_KEY_FIELD_NUMBER = 6;
  private com.google.cloud.aiplatform.v1.FeatureViewDataKey dataKey_;
  /**
   *
   *
   * <pre>
   * Optional. The request key to fetch feature values for.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the dataKey field is set.
   */
  @java.lang.Override
  public boolean hasDataKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. The request key to fetch feature values for.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataKey.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FeatureViewDataKey getDataKey() {
    return dataKey_ == null
        ? com.google.cloud.aiplatform.v1.FeatureViewDataKey.getDefaultInstance()
        : dataKey_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The request key to fetch feature values for.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FeatureViewDataKeyOrBuilder getDataKeyOrBuilder() {
    return dataKey_ == null
        ? com.google.cloud.aiplatform.v1.FeatureViewDataKey.getDefaultInstance()
        : dataKey_;
  }

  public static final int DATA_FORMAT_FIELD_NUMBER = 7;
  private int dataFormat_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Response data format. If not set,
   * [FeatureViewDataFormat.KEY_VALUE][google.cloud.aiplatform.v1.FeatureViewDataFormat.KEY_VALUE]
   * will be used.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureViewDataFormat data_format = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for dataFormat.
   */
  @java.lang.Override
  public int getDataFormatValue() {
    return dataFormat_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Response data format. If not set,
   * [FeatureViewDataFormat.KEY_VALUE][google.cloud.aiplatform.v1.FeatureViewDataFormat.KEY_VALUE]
   * will be used.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureViewDataFormat data_format = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataFormat.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FeatureViewDataFormat getDataFormat() {
    com.google.cloud.aiplatform.v1.FeatureViewDataFormat result =
        com.google.cloud.aiplatform.v1.FeatureViewDataFormat.forNumber(dataFormat_);
    return result == null
        ? com.google.cloud.aiplatform.v1.FeatureViewDataFormat.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureView_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, featureView_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(6, getDataKey());
    }
    if (dataFormat_
        != com.google.cloud.aiplatform.v1.FeatureViewDataFormat.FEATURE_VIEW_DATA_FORMAT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(7, dataFormat_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureView_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, featureView_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, getDataKey());
    }
    if (dataFormat_
        != com.google.cloud.aiplatform.v1.FeatureViewDataFormat.FEATURE_VIEW_DATA_FORMAT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(7, dataFormat_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest other =
        (com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest) obj;

    if (!getFeatureView().equals(other.getFeatureView())) return false;
    if (hasDataKey() != other.hasDataKey()) return false;
    if (hasDataKey()) {
      if (!getDataKey().equals(other.getDataKey())) return false;
    }
    if (dataFormat_ != other.dataFormat_) return false;
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
    hash = (37 * hash) + FEATURE_VIEW_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureView().hashCode();
    if (hasDataKey()) {
      hash = (37 * hash) + DATA_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getDataKey().hashCode();
    }
    hash = (37 * hash) + DATA_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + dataFormat_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest parseFrom(
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
      com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest prototype) {
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
   * Request message for
   * [FeatureOnlineStoreService.FetchFeatureValues][google.cloud.aiplatform.v1.FeatureOnlineStoreService.FetchFeatureValues].
   * All the features under the requested feature view will be returned.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.FetchFeatureValuesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.FetchFeatureValuesRequest)
      com.google.cloud.aiplatform.v1.FetchFeatureValuesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest.class,
              com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDataKeyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      featureView_ = "";
      dataKey_ = null;
      if (dataKeyBuilder_ != null) {
        dataKeyBuilder_.dispose();
        dataKeyBuilder_ = null;
      }
      dataFormat_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest build() {
      com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest buildPartial() {
      com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest result =
          new com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.featureView_ = featureView_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataKey_ = dataKeyBuilder_ == null ? dataKey_ : dataKeyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dataFormat_ = dataFormat_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest other) {
      if (other == com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest.getDefaultInstance())
        return this;
      if (!other.getFeatureView().isEmpty()) {
        featureView_ = other.featureView_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDataKey()) {
        mergeDataKey(other.getDataKey());
      }
      if (other.dataFormat_ != 0) {
        setDataFormatValue(other.getDataFormatValue());
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
                featureView_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 50:
              {
                input.readMessage(getDataKeyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 50
            case 56:
              {
                dataFormat_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
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

    private java.lang.Object featureView_ = "";
    /**
     *
     *
     * <pre>
     * Required. FeatureView resource format
     * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
     * </pre>
     *
     * <code>
     * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The featureView.
     */
    public java.lang.String getFeatureView() {
      java.lang.Object ref = featureView_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        featureView_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. FeatureView resource format
     * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
     * </pre>
     *
     * <code>
     * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for featureView.
     */
    public com.google.protobuf.ByteString getFeatureViewBytes() {
      java.lang.Object ref = featureView_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        featureView_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. FeatureView resource format
     * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
     * </pre>
     *
     * <code>
     * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The featureView to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureView(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      featureView_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. FeatureView resource format
     * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
     * </pre>
     *
     * <code>
     * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFeatureView() {
      featureView_ = getDefaultInstance().getFeatureView();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. FeatureView resource format
     * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
     * </pre>
     *
     * <code>
     * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for featureView to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureViewBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      featureView_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.FeatureViewDataKey dataKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.FeatureViewDataKey,
            com.google.cloud.aiplatform.v1.FeatureViewDataKey.Builder,
            com.google.cloud.aiplatform.v1.FeatureViewDataKeyOrBuilder>
        dataKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The request key to fetch feature values for.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the dataKey field is set.
     */
    public boolean hasDataKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The request key to fetch feature values for.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The dataKey.
     */
    public com.google.cloud.aiplatform.v1.FeatureViewDataKey getDataKey() {
      if (dataKeyBuilder_ == null) {
        return dataKey_ == null
            ? com.google.cloud.aiplatform.v1.FeatureViewDataKey.getDefaultInstance()
            : dataKey_;
      } else {
        return dataKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The request key to fetch feature values for.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setDataKey(com.google.cloud.aiplatform.v1.FeatureViewDataKey value) {
      if (dataKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataKey_ = value;
      } else {
        dataKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The request key to fetch feature values for.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setDataKey(
        com.google.cloud.aiplatform.v1.FeatureViewDataKey.Builder builderForValue) {
      if (dataKeyBuilder_ == null) {
        dataKey_ = builderForValue.build();
      } else {
        dataKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The request key to fetch feature values for.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeDataKey(com.google.cloud.aiplatform.v1.FeatureViewDataKey value) {
      if (dataKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && dataKey_ != null
            && dataKey_ != com.google.cloud.aiplatform.v1.FeatureViewDataKey.getDefaultInstance()) {
          getDataKeyBuilder().mergeFrom(value);
        } else {
          dataKey_ = value;
        }
      } else {
        dataKeyBuilder_.mergeFrom(value);
      }
      if (dataKey_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The request key to fetch feature values for.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearDataKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataKey_ = null;
      if (dataKeyBuilder_ != null) {
        dataKeyBuilder_.dispose();
        dataKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The request key to fetch feature values for.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.FeatureViewDataKey.Builder getDataKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDataKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The request key to fetch feature values for.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.FeatureViewDataKeyOrBuilder getDataKeyOrBuilder() {
      if (dataKeyBuilder_ != null) {
        return dataKeyBuilder_.getMessageOrBuilder();
      } else {
        return dataKey_ == null
            ? com.google.cloud.aiplatform.v1.FeatureViewDataKey.getDefaultInstance()
            : dataKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The request key to fetch feature values for.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataKey data_key = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.FeatureViewDataKey,
            com.google.cloud.aiplatform.v1.FeatureViewDataKey.Builder,
            com.google.cloud.aiplatform.v1.FeatureViewDataKeyOrBuilder>
        getDataKeyFieldBuilder() {
      if (dataKeyBuilder_ == null) {
        dataKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.FeatureViewDataKey,
                com.google.cloud.aiplatform.v1.FeatureViewDataKey.Builder,
                com.google.cloud.aiplatform.v1.FeatureViewDataKeyOrBuilder>(
                getDataKey(), getParentForChildren(), isClean());
        dataKey_ = null;
      }
      return dataKeyBuilder_;
    }

    private int dataFormat_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Response data format. If not set,
     * [FeatureViewDataFormat.KEY_VALUE][google.cloud.aiplatform.v1.FeatureViewDataFormat.KEY_VALUE]
     * will be used.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataFormat data_format = 7 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for dataFormat.
     */
    @java.lang.Override
    public int getDataFormatValue() {
      return dataFormat_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Response data format. If not set,
     * [FeatureViewDataFormat.KEY_VALUE][google.cloud.aiplatform.v1.FeatureViewDataFormat.KEY_VALUE]
     * will be used.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataFormat data_format = 7 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for dataFormat to set.
     * @return This builder for chaining.
     */
    public Builder setDataFormatValue(int value) {
      dataFormat_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Response data format. If not set,
     * [FeatureViewDataFormat.KEY_VALUE][google.cloud.aiplatform.v1.FeatureViewDataFormat.KEY_VALUE]
     * will be used.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataFormat data_format = 7 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The dataFormat.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FeatureViewDataFormat getDataFormat() {
      com.google.cloud.aiplatform.v1.FeatureViewDataFormat result =
          com.google.cloud.aiplatform.v1.FeatureViewDataFormat.forNumber(dataFormat_);
      return result == null
          ? com.google.cloud.aiplatform.v1.FeatureViewDataFormat.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Response data format. If not set,
     * [FeatureViewDataFormat.KEY_VALUE][google.cloud.aiplatform.v1.FeatureViewDataFormat.KEY_VALUE]
     * will be used.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataFormat data_format = 7 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The dataFormat to set.
     * @return This builder for chaining.
     */
    public Builder setDataFormat(com.google.cloud.aiplatform.v1.FeatureViewDataFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      dataFormat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Response data format. If not set,
     * [FeatureViewDataFormat.KEY_VALUE][google.cloud.aiplatform.v1.FeatureViewDataFormat.KEY_VALUE]
     * will be used.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureViewDataFormat data_format = 7 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataFormat() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dataFormat_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.FetchFeatureValuesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.FetchFeatureValuesRequest)
  private static final com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest();
  }

  public static com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchFeatureValuesRequest> PARSER =
      new com.google.protobuf.AbstractParser<FetchFeatureValuesRequest>() {
        @java.lang.Override
        public FetchFeatureValuesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FetchFeatureValuesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchFeatureValuesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
