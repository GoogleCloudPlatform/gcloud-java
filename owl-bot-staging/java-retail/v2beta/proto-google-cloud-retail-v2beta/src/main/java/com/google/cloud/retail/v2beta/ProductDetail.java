// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/user_event.proto

package com.google.cloud.retail.v2beta;

/**
 * <pre>
 * Detailed product information associated with a user event.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.ProductDetail}
 */
public final class ProductDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.ProductDetail)
    ProductDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductDetail.newBuilder() to construct.
  private ProductDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductDetail() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductDetail();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductDetail(
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
            com.google.cloud.retail.v2beta.Product.Builder subBuilder = null;
            if (product_ != null) {
              subBuilder = product_.toBuilder();
            }
            product_ = input.readMessage(com.google.cloud.retail.v2beta.Product.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(product_);
              product_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (quantity_ != null) {
              subBuilder = quantity_.toBuilder();
            }
            quantity_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(quantity_);
              quantity_ = subBuilder.buildPartial();
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
    return com.google.cloud.retail.v2beta.UserEventProto.internal_static_google_cloud_retail_v2beta_ProductDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.UserEventProto.internal_static_google_cloud_retail_v2beta_ProductDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.ProductDetail.class, com.google.cloud.retail.v2beta.ProductDetail.Builder.class);
  }

  public static final int PRODUCT_FIELD_NUMBER = 1;
  private com.google.cloud.retail.v2beta.Product product_;
  /**
   * <pre>
   * Required. [Product][google.cloud.retail.v2beta.Product] information.
   * Required field(s):
   * * [Product.id][google.cloud.retail.v2beta.Product.id]
   * Optional override field(s):
   * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
   * If any supported optional fields are provided, we will treat them as a full
   * override when looking up product information from the catalog. Thus, it is
   * important to ensure that the overriding fields are accurate and
   * complete.
   * All other product fields are ignored and instead populated via catalog
   * lookup after event ingestion.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the product field is set.
   */
  @java.lang.Override
  public boolean hasProduct() {
    return product_ != null;
  }
  /**
   * <pre>
   * Required. [Product][google.cloud.retail.v2beta.Product] information.
   * Required field(s):
   * * [Product.id][google.cloud.retail.v2beta.Product.id]
   * Optional override field(s):
   * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
   * If any supported optional fields are provided, we will treat them as a full
   * override when looking up product information from the catalog. Thus, it is
   * important to ensure that the overriding fields are accurate and
   * complete.
   * All other product fields are ignored and instead populated via catalog
   * lookup after event ingestion.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The product.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.Product getProduct() {
    return product_ == null ? com.google.cloud.retail.v2beta.Product.getDefaultInstance() : product_;
  }
  /**
   * <pre>
   * Required. [Product][google.cloud.retail.v2beta.Product] information.
   * Required field(s):
   * * [Product.id][google.cloud.retail.v2beta.Product.id]
   * Optional override field(s):
   * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
   * If any supported optional fields are provided, we will treat them as a full
   * override when looking up product information from the catalog. Thus, it is
   * important to ensure that the overriding fields are accurate and
   * complete.
   * All other product fields are ignored and instead populated via catalog
   * lookup after event ingestion.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.ProductOrBuilder getProductOrBuilder() {
    return getProduct();
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value quantity_;
  /**
   * <pre>
   * Quantity of the product associated with the user event.
   * For example, this field will be 2 if two products are added to the shopping
   * cart for `purchase-complete` event. Required for `add-to-cart` and
   * `purchase-complete` event types.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value quantity = 2;</code>
   * @return Whether the quantity field is set.
   */
  @java.lang.Override
  public boolean hasQuantity() {
    return quantity_ != null;
  }
  /**
   * <pre>
   * Quantity of the product associated with the user event.
   * For example, this field will be 2 if two products are added to the shopping
   * cart for `purchase-complete` event. Required for `add-to-cart` and
   * `purchase-complete` event types.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value quantity = 2;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getQuantity() {
    return quantity_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : quantity_;
  }
  /**
   * <pre>
   * Quantity of the product associated with the user event.
   * For example, this field will be 2 if two products are added to the shopping
   * cart for `purchase-complete` event. Required for `add-to-cart` and
   * `purchase-complete` event types.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value quantity = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32ValueOrBuilder getQuantityOrBuilder() {
    return getQuantity();
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
    if (product_ != null) {
      output.writeMessage(1, getProduct());
    }
    if (quantity_ != null) {
      output.writeMessage(2, getQuantity());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (product_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProduct());
    }
    if (quantity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQuantity());
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.ProductDetail)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.ProductDetail other = (com.google.cloud.retail.v2beta.ProductDetail) obj;

    if (hasProduct() != other.hasProduct()) return false;
    if (hasProduct()) {
      if (!getProduct()
          .equals(other.getProduct())) return false;
    }
    if (hasQuantity() != other.hasQuantity()) return false;
    if (hasQuantity()) {
      if (!getQuantity()
          .equals(other.getQuantity())) return false;
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
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    if (hasQuantity()) {
      hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
      hash = (53 * hash) + getQuantity().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.ProductDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.ProductDetail parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2beta.ProductDetail prototype) {
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
   * Detailed product information associated with a user event.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.ProductDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.ProductDetail)
      com.google.cloud.retail.v2beta.ProductDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2beta.UserEventProto.internal_static_google_cloud_retail_v2beta_ProductDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.UserEventProto.internal_static_google_cloud_retail_v2beta_ProductDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.ProductDetail.class, com.google.cloud.retail.v2beta.ProductDetail.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.ProductDetail.newBuilder()
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
      if (productBuilder_ == null) {
        product_ = null;
      } else {
        product_ = null;
        productBuilder_ = null;
      }
      if (quantityBuilder_ == null) {
        quantity_ = null;
      } else {
        quantity_ = null;
        quantityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2beta.UserEventProto.internal_static_google_cloud_retail_v2beta_ProductDetail_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.ProductDetail getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.ProductDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.ProductDetail build() {
      com.google.cloud.retail.v2beta.ProductDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.ProductDetail buildPartial() {
      com.google.cloud.retail.v2beta.ProductDetail result = new com.google.cloud.retail.v2beta.ProductDetail(this);
      if (productBuilder_ == null) {
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
      }
      if (quantityBuilder_ == null) {
        result.quantity_ = quantity_;
      } else {
        result.quantity_ = quantityBuilder_.build();
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
      if (other instanceof com.google.cloud.retail.v2beta.ProductDetail) {
        return mergeFrom((com.google.cloud.retail.v2beta.ProductDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.ProductDetail other) {
      if (other == com.google.cloud.retail.v2beta.ProductDetail.getDefaultInstance()) return this;
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
      }
      if (other.hasQuantity()) {
        mergeQuantity(other.getQuantity());
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
      com.google.cloud.retail.v2beta.ProductDetail parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.retail.v2beta.ProductDetail) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.retail.v2beta.Product product_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2beta.Product, com.google.cloud.retail.v2beta.Product.Builder, com.google.cloud.retail.v2beta.ProductOrBuilder> productBuilder_;
    /**
     * <pre>
     * Required. [Product][google.cloud.retail.v2beta.Product] information.
     * Required field(s):
     * * [Product.id][google.cloud.retail.v2beta.Product.id]
     * Optional override field(s):
     * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
     * If any supported optional fields are provided, we will treat them as a full
     * override when looking up product information from the catalog. Thus, it is
     * important to ensure that the overriding fields are accurate and
     * complete.
     * All other product fields are ignored and instead populated via catalog
     * lookup after event ingestion.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the product field is set.
     */
    public boolean hasProduct() {
      return productBuilder_ != null || product_ != null;
    }
    /**
     * <pre>
     * Required. [Product][google.cloud.retail.v2beta.Product] information.
     * Required field(s):
     * * [Product.id][google.cloud.retail.v2beta.Product.id]
     * Optional override field(s):
     * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
     * If any supported optional fields are provided, we will treat them as a full
     * override when looking up product information from the catalog. Thus, it is
     * important to ensure that the overriding fields are accurate and
     * complete.
     * All other product fields are ignored and instead populated via catalog
     * lookup after event ingestion.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The product.
     */
    public com.google.cloud.retail.v2beta.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null ? com.google.cloud.retail.v2beta.Product.getDefaultInstance() : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. [Product][google.cloud.retail.v2beta.Product] information.
     * Required field(s):
     * * [Product.id][google.cloud.retail.v2beta.Product.id]
     * Optional override field(s):
     * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
     * If any supported optional fields are provided, we will treat them as a full
     * override when looking up product information from the catalog. Thus, it is
     * important to ensure that the overriding fields are accurate and
     * complete.
     * All other product fields are ignored and instead populated via catalog
     * lookup after event ingestion.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProduct(com.google.cloud.retail.v2beta.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
        onChanged();
      } else {
        productBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. [Product][google.cloud.retail.v2beta.Product] information.
     * Required field(s):
     * * [Product.id][google.cloud.retail.v2beta.Product.id]
     * Optional override field(s):
     * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
     * If any supported optional fields are provided, we will treat them as a full
     * override when looking up product information from the catalog. Thus, it is
     * important to ensure that the overriding fields are accurate and
     * complete.
     * All other product fields are ignored and instead populated via catalog
     * lookup after event ingestion.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProduct(
        com.google.cloud.retail.v2beta.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
        onChanged();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. [Product][google.cloud.retail.v2beta.Product] information.
     * Required field(s):
     * * [Product.id][google.cloud.retail.v2beta.Product.id]
     * Optional override field(s):
     * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
     * If any supported optional fields are provided, we will treat them as a full
     * override when looking up product information from the catalog. Thus, it is
     * important to ensure that the overriding fields are accurate and
     * complete.
     * All other product fields are ignored and instead populated via catalog
     * lookup after event ingestion.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeProduct(com.google.cloud.retail.v2beta.Product value) {
      if (productBuilder_ == null) {
        if (product_ != null) {
          product_ =
            com.google.cloud.retail.v2beta.Product.newBuilder(product_).mergeFrom(value).buildPartial();
        } else {
          product_ = value;
        }
        onChanged();
      } else {
        productBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. [Product][google.cloud.retail.v2beta.Product] information.
     * Required field(s):
     * * [Product.id][google.cloud.retail.v2beta.Product.id]
     * Optional override field(s):
     * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
     * If any supported optional fields are provided, we will treat them as a full
     * override when looking up product information from the catalog. Thus, it is
     * important to ensure that the overriding fields are accurate and
     * complete.
     * All other product fields are ignored and instead populated via catalog
     * lookup after event ingestion.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = null;
        onChanged();
      } else {
        product_ = null;
        productBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. [Product][google.cloud.retail.v2beta.Product] information.
     * Required field(s):
     * * [Product.id][google.cloud.retail.v2beta.Product.id]
     * Optional override field(s):
     * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
     * If any supported optional fields are provided, we will treat them as a full
     * override when looking up product information from the catalog. Thus, it is
     * important to ensure that the overriding fields are accurate and
     * complete.
     * All other product fields are ignored and instead populated via catalog
     * lookup after event ingestion.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2beta.Product.Builder getProductBuilder() {
      
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. [Product][google.cloud.retail.v2beta.Product] information.
     * Required field(s):
     * * [Product.id][google.cloud.retail.v2beta.Product.id]
     * Optional override field(s):
     * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
     * If any supported optional fields are provided, we will treat them as a full
     * override when looking up product information from the catalog. Thus, it is
     * important to ensure that the overriding fields are accurate and
     * complete.
     * All other product fields are ignored and instead populated via catalog
     * lookup after event ingestion.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2beta.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null ?
            com.google.cloud.retail.v2beta.Product.getDefaultInstance() : product_;
      }
    }
    /**
     * <pre>
     * Required. [Product][google.cloud.retail.v2beta.Product] information.
     * Required field(s):
     * * [Product.id][google.cloud.retail.v2beta.Product.id]
     * Optional override field(s):
     * * [Product.price_info][google.cloud.retail.v2beta.Product.price_info]
     * If any supported optional fields are provided, we will treat them as a full
     * override when looking up product information from the catalog. Thus, it is
     * important to ensure that the overriding fields are accurate and
     * complete.
     * All other product fields are ignored and instead populated via catalog
     * lookup after event ingestion.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2beta.Product, com.google.cloud.retail.v2beta.Product.Builder, com.google.cloud.retail.v2beta.ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2beta.Product, com.google.cloud.retail.v2beta.Product.Builder, com.google.cloud.retail.v2beta.ProductOrBuilder>(
                getProduct(),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
    }

    private com.google.protobuf.Int32Value quantity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> quantityBuilder_;
    /**
     * <pre>
     * Quantity of the product associated with the user event.
     * For example, this field will be 2 if two products are added to the shopping
     * cart for `purchase-complete` event. Required for `add-to-cart` and
     * `purchase-complete` event types.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value quantity = 2;</code>
     * @return Whether the quantity field is set.
     */
    public boolean hasQuantity() {
      return quantityBuilder_ != null || quantity_ != null;
    }
    /**
     * <pre>
     * Quantity of the product associated with the user event.
     * For example, this field will be 2 if two products are added to the shopping
     * cart for `purchase-complete` event. Required for `add-to-cart` and
     * `purchase-complete` event types.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value quantity = 2;</code>
     * @return The quantity.
     */
    public com.google.protobuf.Int32Value getQuantity() {
      if (quantityBuilder_ == null) {
        return quantity_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : quantity_;
      } else {
        return quantityBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Quantity of the product associated with the user event.
     * For example, this field will be 2 if two products are added to the shopping
     * cart for `purchase-complete` event. Required for `add-to-cart` and
     * `purchase-complete` event types.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value quantity = 2;</code>
     */
    public Builder setQuantity(com.google.protobuf.Int32Value value) {
      if (quantityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        quantity_ = value;
        onChanged();
      } else {
        quantityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Quantity of the product associated with the user event.
     * For example, this field will be 2 if two products are added to the shopping
     * cart for `purchase-complete` event. Required for `add-to-cart` and
     * `purchase-complete` event types.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value quantity = 2;</code>
     */
    public Builder setQuantity(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (quantityBuilder_ == null) {
        quantity_ = builderForValue.build();
        onChanged();
      } else {
        quantityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Quantity of the product associated with the user event.
     * For example, this field will be 2 if two products are added to the shopping
     * cart for `purchase-complete` event. Required for `add-to-cart` and
     * `purchase-complete` event types.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value quantity = 2;</code>
     */
    public Builder mergeQuantity(com.google.protobuf.Int32Value value) {
      if (quantityBuilder_ == null) {
        if (quantity_ != null) {
          quantity_ =
            com.google.protobuf.Int32Value.newBuilder(quantity_).mergeFrom(value).buildPartial();
        } else {
          quantity_ = value;
        }
        onChanged();
      } else {
        quantityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Quantity of the product associated with the user event.
     * For example, this field will be 2 if two products are added to the shopping
     * cart for `purchase-complete` event. Required for `add-to-cart` and
     * `purchase-complete` event types.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value quantity = 2;</code>
     */
    public Builder clearQuantity() {
      if (quantityBuilder_ == null) {
        quantity_ = null;
        onChanged();
      } else {
        quantity_ = null;
        quantityBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Quantity of the product associated with the user event.
     * For example, this field will be 2 if two products are added to the shopping
     * cart for `purchase-complete` event. Required for `add-to-cart` and
     * `purchase-complete` event types.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value quantity = 2;</code>
     */
    public com.google.protobuf.Int32Value.Builder getQuantityBuilder() {
      
      onChanged();
      return getQuantityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Quantity of the product associated with the user event.
     * For example, this field will be 2 if two products are added to the shopping
     * cart for `purchase-complete` event. Required for `add-to-cart` and
     * `purchase-complete` event types.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value quantity = 2;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getQuantityOrBuilder() {
      if (quantityBuilder_ != null) {
        return quantityBuilder_.getMessageOrBuilder();
      } else {
        return quantity_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : quantity_;
      }
    }
    /**
     * <pre>
     * Quantity of the product associated with the user event.
     * For example, this field will be 2 if two products are added to the shopping
     * cart for `purchase-complete` event. Required for `add-to-cart` and
     * `purchase-complete` event types.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value quantity = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getQuantityFieldBuilder() {
      if (quantityBuilder_ == null) {
        quantityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getQuantity(),
                getParentForChildren(),
                isClean());
        quantity_ = null;
      }
      return quantityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.ProductDetail)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.ProductDetail)
  private static final com.google.cloud.retail.v2beta.ProductDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.ProductDetail();
  }

  public static com.google.cloud.retail.v2beta.ProductDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductDetail>
      PARSER = new com.google.protobuf.AbstractParser<ProductDetail>() {
    @java.lang.Override
    public ProductDetail parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductDetail(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.ProductDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

