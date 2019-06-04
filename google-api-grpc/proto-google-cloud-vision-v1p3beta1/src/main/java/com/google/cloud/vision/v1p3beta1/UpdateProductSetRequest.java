// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

package com.google.cloud.vision.v1p3beta1;

/**
 *
 *
 * <pre>
 * Request message for the `UpdateProductSet` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p3beta1.UpdateProductSetRequest}
 */
public final class UpdateProductSetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p3beta1.UpdateProductSetRequest)
    UpdateProductSetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateProductSetRequest.newBuilder() to construct.
  private UpdateProductSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateProductSetRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateProductSetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateProductSetRequest(
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
          case 10:
            {
              com.google.cloud.vision.v1p3beta1.ProductSet.Builder subBuilder = null;
              if (productSet_ != null) {
                subBuilder = productSet_.toBuilder();
              }
              productSet_ =
                  input.readMessage(
                      com.google.cloud.vision.v1p3beta1.ProductSet.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(productSet_);
                productSet_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p3beta1_UpdateProductSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p3beta1_UpdateProductSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest.class,
            com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest.Builder.class);
  }

  public static final int PRODUCT_SET_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1p3beta1.ProductSet productSet_;
  /**
   *
   *
   * <pre>
   * The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
   */
  public boolean hasProductSet() {
    return productSet_ != null;
  }
  /**
   *
   *
   * <pre>
   * The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
   */
  public com.google.cloud.vision.v1p3beta1.ProductSet getProductSet() {
    return productSet_ == null
        ? com.google.cloud.vision.v1p3beta1.ProductSet.getDefaultInstance()
        : productSet_;
  }
  /**
   *
   *
   * <pre>
   * The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
   */
  public com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder getProductSetOrBuilder() {
    return getProductSet();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (productSet_ != null) {
      output.writeMessage(1, getProductSet());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (productSet_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getProductSet());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest other =
        (com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest) obj;

    if (hasProductSet() != other.hasProductSet()) return false;
    if (hasProductSet()) {
      if (!getProductSet().equals(other.getProductSet())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasProductSet()) {
      hash = (37 * hash) + PRODUCT_SET_FIELD_NUMBER;
      hash = (53 * hash) + getProductSet().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parseFrom(
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
      com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest prototype) {
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
   * Request message for the `UpdateProductSet` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p3beta1.UpdateProductSetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p3beta1.UpdateProductSetRequest)
      com.google.cloud.vision.v1p3beta1.UpdateProductSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_UpdateProductSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_UpdateProductSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest.class,
              com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productSetBuilder_ == null) {
        productSet_ = null;
      } else {
        productSet_ = null;
        productSetBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_UpdateProductSetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest build() {
      com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest buildPartial() {
      com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest result =
          new com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest(this);
      if (productSetBuilder_ == null) {
        result.productSet_ = productSet_;
      } else {
        result.productSet_ = productSetBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest) {
        return mergeFrom((com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest other) {
      if (other == com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest.getDefaultInstance())
        return this;
      if (other.hasProductSet()) {
        mergeProductSet(other.getProductSet());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.vision.v1p3beta1.ProductSet productSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.ProductSet,
            com.google.cloud.vision.v1p3beta1.ProductSet.Builder,
            com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>
        productSetBuilder_;
    /**
     *
     *
     * <pre>
     * The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
     */
    public boolean hasProductSet() {
      return productSetBuilder_ != null || productSet_ != null;
    }
    /**
     *
     *
     * <pre>
     * The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ProductSet getProductSet() {
      if (productSetBuilder_ == null) {
        return productSet_ == null
            ? com.google.cloud.vision.v1p3beta1.ProductSet.getDefaultInstance()
            : productSet_;
      } else {
        return productSetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
     */
    public Builder setProductSet(com.google.cloud.vision.v1p3beta1.ProductSet value) {
      if (productSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        productSet_ = value;
        onChanged();
      } else {
        productSetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
     */
    public Builder setProductSet(
        com.google.cloud.vision.v1p3beta1.ProductSet.Builder builderForValue) {
      if (productSetBuilder_ == null) {
        productSet_ = builderForValue.build();
        onChanged();
      } else {
        productSetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
     */
    public Builder mergeProductSet(com.google.cloud.vision.v1p3beta1.ProductSet value) {
      if (productSetBuilder_ == null) {
        if (productSet_ != null) {
          productSet_ =
              com.google.cloud.vision.v1p3beta1.ProductSet.newBuilder(productSet_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          productSet_ = value;
        }
        onChanged();
      } else {
        productSetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
     */
    public Builder clearProductSet() {
      if (productSetBuilder_ == null) {
        productSet_ = null;
        onChanged();
      } else {
        productSet_ = null;
        productSetBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ProductSet.Builder getProductSetBuilder() {

      onChanged();
      return getProductSetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder getProductSetOrBuilder() {
      if (productSetBuilder_ != null) {
        return productSetBuilder_.getMessageOrBuilder();
      } else {
        return productSet_ == null
            ? com.google.cloud.vision.v1p3beta1.ProductSet.getDefaultInstance()
            : productSet_;
      }
    }
    /**
     *
     *
     * <pre>
     * The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.ProductSet product_set = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.ProductSet,
            com.google.cloud.vision.v1p3beta1.ProductSet.Builder,
            com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>
        getProductSetFieldBuilder() {
      if (productSetBuilder_ == null) {
        productSetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1p3beta1.ProductSet,
                com.google.cloud.vision.v1p3beta1.ProductSet.Builder,
                com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>(
                getProductSet(), getParentForChildren(), isClean());
        productSet_ = null;
      }
      return productSetBuilder_;
    }

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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p3beta1.UpdateProductSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p3beta1.UpdateProductSetRequest)
  private static final com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest();
  }

  public static com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateProductSetRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateProductSetRequest>() {
        @java.lang.Override
        public UpdateProductSetRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateProductSetRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateProductSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateProductSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
