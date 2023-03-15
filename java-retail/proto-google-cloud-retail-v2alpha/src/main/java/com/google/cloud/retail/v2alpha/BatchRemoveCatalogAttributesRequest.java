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
// source: google/cloud/retail/v2alpha/catalog_service.proto

package com.google.cloud.retail.v2alpha;

/**
 *
 *
 * <pre>
 * Request for
 * [CatalogService.BatchRemoveCatalogAttributes][google.cloud.retail.v2alpha.CatalogService.BatchRemoveCatalogAttributes]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest}
 */
public final class BatchRemoveCatalogAttributesRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest)
    BatchRemoveCatalogAttributesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchRemoveCatalogAttributesRequest.newBuilder() to construct.
  private BatchRemoveCatalogAttributesRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchRemoveCatalogAttributesRequest() {
    attributesConfig_ = "";
    attributeKeys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchRemoveCatalogAttributesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2alpha.CatalogServiceProto
        .internal_static_google_cloud_retail_v2alpha_BatchRemoveCatalogAttributesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.CatalogServiceProto
        .internal_static_google_cloud_retail_v2alpha_BatchRemoveCatalogAttributesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest.class,
            com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest.Builder.class);
  }

  public static final int ATTRIBUTES_CONFIG_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object attributesConfig_ = "";
  /**
   *
   *
   * <pre>
   * Required. The attributes config resource shared by all catalog attributes
   * being deleted. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>
   * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The attributesConfig.
   */
  @java.lang.Override
  public java.lang.String getAttributesConfig() {
    java.lang.Object ref = attributesConfig_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attributesConfig_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The attributes config resource shared by all catalog attributes
   * being deleted. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>
   * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for attributesConfig.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAttributesConfigBytes() {
    java.lang.Object ref = attributesConfig_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      attributesConfig_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTRIBUTE_KEYS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList attributeKeys_;
  /**
   *
   *
   * <pre>
   * Required. The attribute name keys of the
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
   * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the attributeKeys.
   */
  public com.google.protobuf.ProtocolStringList getAttributeKeysList() {
    return attributeKeys_;
  }
  /**
   *
   *
   * <pre>
   * Required. The attribute name keys of the
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
   * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of attributeKeys.
   */
  public int getAttributeKeysCount() {
    return attributeKeys_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The attribute name keys of the
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
   * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The attributeKeys at the given index.
   */
  public java.lang.String getAttributeKeys(int index) {
    return attributeKeys_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The attribute name keys of the
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
   * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the attributeKeys at the given index.
   */
  public com.google.protobuf.ByteString getAttributeKeysBytes(int index) {
    return attributeKeys_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attributesConfig_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, attributesConfig_);
    }
    for (int i = 0; i < attributeKeys_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, attributeKeys_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attributesConfig_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, attributesConfig_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < attributeKeys_.size(); i++) {
        dataSize += computeStringSizeNoTag(attributeKeys_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAttributeKeysList().size();
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
    if (!(obj instanceof com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest other =
        (com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest) obj;

    if (!getAttributesConfig().equals(other.getAttributesConfig())) return false;
    if (!getAttributeKeysList().equals(other.getAttributeKeysList())) return false;
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
    hash = (37 * hash) + ATTRIBUTES_CONFIG_FIELD_NUMBER;
    hash = (53 * hash) + getAttributesConfig().hashCode();
    if (getAttributeKeysCount() > 0) {
      hash = (37 * hash) + ATTRIBUTE_KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getAttributeKeysList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest parseFrom(
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
      com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest prototype) {
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
   * Request for
   * [CatalogService.BatchRemoveCatalogAttributes][google.cloud.retail.v2alpha.CatalogService.BatchRemoveCatalogAttributes]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest)
      com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2alpha.CatalogServiceProto
          .internal_static_google_cloud_retail_v2alpha_BatchRemoveCatalogAttributesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.CatalogServiceProto
          .internal_static_google_cloud_retail_v2alpha_BatchRemoveCatalogAttributesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest.class,
              com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      attributesConfig_ = "";
      attributeKeys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2alpha.CatalogServiceProto
          .internal_static_google_cloud_retail_v2alpha_BatchRemoveCatalogAttributesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest build() {
      com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest buildPartial() {
      com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest result =
          new com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        attributeKeys_ = attributeKeys_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.attributeKeys_ = attributeKeys_;
    }

    private void buildPartial0(
        com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attributesConfig_ = attributesConfig_;
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
      if (other instanceof com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest) {
        return mergeFrom(
            (com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest other) {
      if (other
          == com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest
              .getDefaultInstance()) return this;
      if (!other.getAttributesConfig().isEmpty()) {
        attributesConfig_ = other.attributesConfig_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.attributeKeys_.isEmpty()) {
        if (attributeKeys_.isEmpty()) {
          attributeKeys_ = other.attributeKeys_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureAttributeKeysIsMutable();
          attributeKeys_.addAll(other.attributeKeys_);
        }
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
                attributesConfig_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureAttributeKeysIsMutable();
                attributeKeys_.add(s);
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

    private java.lang.Object attributesConfig_ = "";
    /**
     *
     *
     * <pre>
     * Required. The attributes config resource shared by all catalog attributes
     * being deleted. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
     * </pre>
     *
     * <code>
     * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The attributesConfig.
     */
    public java.lang.String getAttributesConfig() {
      java.lang.Object ref = attributesConfig_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attributesConfig_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The attributes config resource shared by all catalog attributes
     * being deleted. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
     * </pre>
     *
     * <code>
     * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for attributesConfig.
     */
    public com.google.protobuf.ByteString getAttributesConfigBytes() {
      java.lang.Object ref = attributesConfig_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        attributesConfig_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The attributes config resource shared by all catalog attributes
     * being deleted. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
     * </pre>
     *
     * <code>
     * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The attributesConfig to set.
     * @return This builder for chaining.
     */
    public Builder setAttributesConfig(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      attributesConfig_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The attributes config resource shared by all catalog attributes
     * being deleted. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
     * </pre>
     *
     * <code>
     * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAttributesConfig() {
      attributesConfig_ = getDefaultInstance().getAttributesConfig();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The attributes config resource shared by all catalog attributes
     * being deleted. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
     * </pre>
     *
     * <code>
     * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for attributesConfig to set.
     * @return This builder for chaining.
     */
    public Builder setAttributesConfigBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      attributesConfig_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList attributeKeys_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureAttributeKeysIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        attributeKeys_ = new com.google.protobuf.LazyStringArrayList(attributeKeys_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The attribute name keys of the
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
     * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
     * </pre>
     *
     * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return A list containing the attributeKeys.
     */
    public com.google.protobuf.ProtocolStringList getAttributeKeysList() {
      return attributeKeys_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Required. The attribute name keys of the
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
     * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
     * </pre>
     *
     * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The count of attributeKeys.
     */
    public int getAttributeKeysCount() {
      return attributeKeys_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The attribute name keys of the
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
     * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
     * </pre>
     *
     * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the element to return.
     * @return The attributeKeys at the given index.
     */
    public java.lang.String getAttributeKeys(int index) {
      return attributeKeys_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The attribute name keys of the
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
     * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
     * </pre>
     *
     * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the attributeKeys at the given index.
     */
    public com.google.protobuf.ByteString getAttributeKeysBytes(int index) {
      return attributeKeys_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The attribute name keys of the
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
     * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
     * </pre>
     *
     * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index to set the value at.
     * @param value The attributeKeys to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeKeys(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAttributeKeysIsMutable();
      attributeKeys_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The attribute name keys of the
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
     * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
     * </pre>
     *
     * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The attributeKeys to add.
     * @return This builder for chaining.
     */
    public Builder addAttributeKeys(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAttributeKeysIsMutable();
      attributeKeys_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The attribute name keys of the
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
     * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
     * </pre>
     *
     * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param values The attributeKeys to add.
     * @return This builder for chaining.
     */
    public Builder addAllAttributeKeys(java.lang.Iterable<java.lang.String> values) {
      ensureAttributeKeysIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, attributeKeys_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The attribute name keys of the
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
     * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
     * </pre>
     *
     * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAttributeKeys() {
      attributeKeys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The attribute name keys of the
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
     * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
     * </pre>
     *
     * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes of the attributeKeys to add.
     * @return This builder for chaining.
     */
    public Builder addAttributeKeysBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAttributeKeysIsMutable();
      attributeKeys_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest)
  private static final com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest();
  }

  public static com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchRemoveCatalogAttributesRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchRemoveCatalogAttributesRequest>() {
        @java.lang.Override
        public BatchRemoveCatalogAttributesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchRemoveCatalogAttributesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchRemoveCatalogAttributesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
