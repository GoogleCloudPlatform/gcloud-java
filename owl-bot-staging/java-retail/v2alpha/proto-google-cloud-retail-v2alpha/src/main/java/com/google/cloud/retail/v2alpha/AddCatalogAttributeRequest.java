// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/catalog_service.proto

package com.google.cloud.retail.v2alpha;

/**
 * <pre>
 * Request for
 * [CatalogService.AddCatalogAttribute][google.cloud.retail.v2alpha.CatalogService.AddCatalogAttribute]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.AddCatalogAttributeRequest}
 */
public final class AddCatalogAttributeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.AddCatalogAttributeRequest)
    AddCatalogAttributeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddCatalogAttributeRequest.newBuilder() to construct.
  private AddCatalogAttributeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddCatalogAttributeRequest() {
    attributesConfig_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddCatalogAttributeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddCatalogAttributeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            attributesConfig_ = s;
            break;
          }
          case 18: {
            com.google.cloud.retail.v2alpha.CatalogAttribute.Builder subBuilder = null;
            if (catalogAttribute_ != null) {
              subBuilder = catalogAttribute_.toBuilder();
            }
            catalogAttribute_ = input.readMessage(com.google.cloud.retail.v2alpha.CatalogAttribute.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(catalogAttribute_);
              catalogAttribute_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2alpha.CatalogServiceProto.internal_static_google_cloud_retail_v2alpha_AddCatalogAttributeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.CatalogServiceProto.internal_static_google_cloud_retail_v2alpha_AddCatalogAttributeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest.class, com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest.Builder.class);
  }

  public static final int ATTRIBUTES_CONFIG_FIELD_NUMBER = 1;
  private volatile java.lang.Object attributesConfig_;
  /**
   * <pre>
   * Required. Full AttributesConfig resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The attributesConfig.
   */
  @java.lang.Override
  public java.lang.String getAttributesConfig() {
    java.lang.Object ref = attributesConfig_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attributesConfig_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Full AttributesConfig resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for attributesConfig.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAttributesConfigBytes() {
    java.lang.Object ref = attributesConfig_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attributesConfig_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CATALOG_ATTRIBUTE_FIELD_NUMBER = 2;
  private com.google.cloud.retail.v2alpha.CatalogAttribute catalogAttribute_;
  /**
   * <pre>
   * Required. The
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the catalogAttribute field is set.
   */
  @java.lang.Override
  public boolean hasCatalogAttribute() {
    return catalogAttribute_ != null;
  }
  /**
   * <pre>
   * Required. The
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The catalogAttribute.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.CatalogAttribute getCatalogAttribute() {
    return catalogAttribute_ == null ? com.google.cloud.retail.v2alpha.CatalogAttribute.getDefaultInstance() : catalogAttribute_;
  }
  /**
   * <pre>
   * Required. The
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.CatalogAttributeOrBuilder getCatalogAttributeOrBuilder() {
    return getCatalogAttribute();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attributesConfig_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, attributesConfig_);
    }
    if (catalogAttribute_ != null) {
      output.writeMessage(2, getCatalogAttribute());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attributesConfig_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, attributesConfig_);
    }
    if (catalogAttribute_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCatalogAttribute());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest other = (com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest) obj;

    if (!getAttributesConfig()
        .equals(other.getAttributesConfig())) return false;
    if (hasCatalogAttribute() != other.hasCatalogAttribute()) return false;
    if (hasCatalogAttribute()) {
      if (!getCatalogAttribute()
          .equals(other.getCatalogAttribute())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    if (hasCatalogAttribute()) {
      hash = (37 * hash) + CATALOG_ATTRIBUTE_FIELD_NUMBER;
      hash = (53 * hash) + getCatalogAttribute().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request for
   * [CatalogService.AddCatalogAttribute][google.cloud.retail.v2alpha.CatalogService.AddCatalogAttribute]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2alpha.AddCatalogAttributeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.AddCatalogAttributeRequest)
      com.google.cloud.retail.v2alpha.AddCatalogAttributeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2alpha.CatalogServiceProto.internal_static_google_cloud_retail_v2alpha_AddCatalogAttributeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.CatalogServiceProto.internal_static_google_cloud_retail_v2alpha_AddCatalogAttributeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest.class, com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      attributesConfig_ = "";

      if (catalogAttributeBuilder_ == null) {
        catalogAttribute_ = null;
      } else {
        catalogAttribute_ = null;
        catalogAttributeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2alpha.CatalogServiceProto.internal_static_google_cloud_retail_v2alpha_AddCatalogAttributeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest build() {
      com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest buildPartial() {
      com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest result = new com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest(this);
      result.attributesConfig_ = attributesConfig_;
      if (catalogAttributeBuilder_ == null) {
        result.catalogAttribute_ = catalogAttribute_;
      } else {
        result.catalogAttribute_ = catalogAttributeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest) {
        return mergeFrom((com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest other) {
      if (other == com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest.getDefaultInstance()) return this;
      if (!other.getAttributesConfig().isEmpty()) {
        attributesConfig_ = other.attributesConfig_;
        onChanged();
      }
      if (other.hasCatalogAttribute()) {
        mergeCatalogAttribute(other.getCatalogAttribute());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object attributesConfig_ = "";
    /**
     * <pre>
     * Required. Full AttributesConfig resource name. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
     * </pre>
     *
     * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The attributesConfig.
     */
    public java.lang.String getAttributesConfig() {
      java.lang.Object ref = attributesConfig_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attributesConfig_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Full AttributesConfig resource name. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
     * </pre>
     *
     * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for attributesConfig.
     */
    public com.google.protobuf.ByteString
        getAttributesConfigBytes() {
      java.lang.Object ref = attributesConfig_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attributesConfig_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Full AttributesConfig resource name. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
     * </pre>
     *
     * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The attributesConfig to set.
     * @return This builder for chaining.
     */
    public Builder setAttributesConfig(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      attributesConfig_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Full AttributesConfig resource name. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
     * </pre>
     *
     * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributesConfig() {
      
      attributesConfig_ = getDefaultInstance().getAttributesConfig();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Full AttributesConfig resource name. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
     * </pre>
     *
     * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for attributesConfig to set.
     * @return This builder for chaining.
     */
    public Builder setAttributesConfigBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      attributesConfig_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.retail.v2alpha.CatalogAttribute catalogAttribute_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2alpha.CatalogAttribute, com.google.cloud.retail.v2alpha.CatalogAttribute.Builder, com.google.cloud.retail.v2alpha.CatalogAttributeOrBuilder> catalogAttributeBuilder_;
    /**
     * <pre>
     * Required. The
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
     * </pre>
     *
     * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the catalogAttribute field is set.
     */
    public boolean hasCatalogAttribute() {
      return catalogAttributeBuilder_ != null || catalogAttribute_ != null;
    }
    /**
     * <pre>
     * Required. The
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
     * </pre>
     *
     * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The catalogAttribute.
     */
    public com.google.cloud.retail.v2alpha.CatalogAttribute getCatalogAttribute() {
      if (catalogAttributeBuilder_ == null) {
        return catalogAttribute_ == null ? com.google.cloud.retail.v2alpha.CatalogAttribute.getDefaultInstance() : catalogAttribute_;
      } else {
        return catalogAttributeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
     * </pre>
     *
     * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCatalogAttribute(com.google.cloud.retail.v2alpha.CatalogAttribute value) {
      if (catalogAttributeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        catalogAttribute_ = value;
        onChanged();
      } else {
        catalogAttributeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
     * </pre>
     *
     * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCatalogAttribute(
        com.google.cloud.retail.v2alpha.CatalogAttribute.Builder builderForValue) {
      if (catalogAttributeBuilder_ == null) {
        catalogAttribute_ = builderForValue.build();
        onChanged();
      } else {
        catalogAttributeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
     * </pre>
     *
     * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCatalogAttribute(com.google.cloud.retail.v2alpha.CatalogAttribute value) {
      if (catalogAttributeBuilder_ == null) {
        if (catalogAttribute_ != null) {
          catalogAttribute_ =
            com.google.cloud.retail.v2alpha.CatalogAttribute.newBuilder(catalogAttribute_).mergeFrom(value).buildPartial();
        } else {
          catalogAttribute_ = value;
        }
        onChanged();
      } else {
        catalogAttributeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
     * </pre>
     *
     * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCatalogAttribute() {
      if (catalogAttributeBuilder_ == null) {
        catalogAttribute_ = null;
        onChanged();
      } else {
        catalogAttribute_ = null;
        catalogAttributeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
     * </pre>
     *
     * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2alpha.CatalogAttribute.Builder getCatalogAttributeBuilder() {
      
      onChanged();
      return getCatalogAttributeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
     * </pre>
     *
     * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2alpha.CatalogAttributeOrBuilder getCatalogAttributeOrBuilder() {
      if (catalogAttributeBuilder_ != null) {
        return catalogAttributeBuilder_.getMessageOrBuilder();
      } else {
        return catalogAttribute_ == null ?
            com.google.cloud.retail.v2alpha.CatalogAttribute.getDefaultInstance() : catalogAttribute_;
      }
    }
    /**
     * <pre>
     * Required. The
     * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
     * </pre>
     *
     * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2alpha.CatalogAttribute, com.google.cloud.retail.v2alpha.CatalogAttribute.Builder, com.google.cloud.retail.v2alpha.CatalogAttributeOrBuilder> 
        getCatalogAttributeFieldBuilder() {
      if (catalogAttributeBuilder_ == null) {
        catalogAttributeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2alpha.CatalogAttribute, com.google.cloud.retail.v2alpha.CatalogAttribute.Builder, com.google.cloud.retail.v2alpha.CatalogAttributeOrBuilder>(
                getCatalogAttribute(),
                getParentForChildren(),
                isClean());
        catalogAttribute_ = null;
      }
      return catalogAttributeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.AddCatalogAttributeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.AddCatalogAttributeRequest)
  private static final com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest();
  }

  public static com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddCatalogAttributeRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddCatalogAttributeRequest>() {
    @java.lang.Override
    public AddCatalogAttributeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddCatalogAttributeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddCatalogAttributeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddCatalogAttributeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.AddCatalogAttributeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

