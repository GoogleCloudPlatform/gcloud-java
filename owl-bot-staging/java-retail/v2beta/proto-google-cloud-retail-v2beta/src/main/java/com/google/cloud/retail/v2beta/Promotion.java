// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/promotion.proto

package com.google.cloud.retail.v2beta;

/**
 * <pre>
 * Promotion information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.Promotion}
 */
public final class Promotion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.Promotion)
    PromotionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Promotion.newBuilder() to construct.
  private Promotion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Promotion() {
    promotionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Promotion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Promotion(
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

            promotionId_ = s;
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
    return com.google.cloud.retail.v2beta.PromotionProto.internal_static_google_cloud_retail_v2beta_Promotion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.PromotionProto.internal_static_google_cloud_retail_v2beta_Promotion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.Promotion.class, com.google.cloud.retail.v2beta.Promotion.Builder.class);
  }

  public static final int PROMOTION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object promotionId_;
  /**
   * <pre>
   * ID of the promotion. For example, "free gift".
   * The value must be a UTF-8 encoded string with a length limit of 128
   * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
   * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * Google Merchant Center property
   * [promotion](https://support.google.com/merchants/answer/7050148).
   * </pre>
   *
   * <code>string promotion_id = 1;</code>
   * @return The promotionId.
   */
  @java.lang.Override
  public java.lang.String getPromotionId() {
    java.lang.Object ref = promotionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      promotionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ID of the promotion. For example, "free gift".
   * The value must be a UTF-8 encoded string with a length limit of 128
   * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
   * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * Google Merchant Center property
   * [promotion](https://support.google.com/merchants/answer/7050148).
   * </pre>
   *
   * <code>string promotion_id = 1;</code>
   * @return The bytes for promotionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPromotionIdBytes() {
    java.lang.Object ref = promotionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      promotionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(promotionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, promotionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(promotionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, promotionId_);
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.Promotion)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.Promotion other = (com.google.cloud.retail.v2beta.Promotion) obj;

    if (!getPromotionId()
        .equals(other.getPromotionId())) return false;
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
    hash = (37 * hash) + PROMOTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPromotionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.Promotion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.Promotion parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2beta.Promotion prototype) {
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
   * Promotion information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.Promotion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.Promotion)
      com.google.cloud.retail.v2beta.PromotionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2beta.PromotionProto.internal_static_google_cloud_retail_v2beta_Promotion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.PromotionProto.internal_static_google_cloud_retail_v2beta_Promotion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.Promotion.class, com.google.cloud.retail.v2beta.Promotion.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.Promotion.newBuilder()
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
      promotionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2beta.PromotionProto.internal_static_google_cloud_retail_v2beta_Promotion_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.Promotion getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.Promotion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.Promotion build() {
      com.google.cloud.retail.v2beta.Promotion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.Promotion buildPartial() {
      com.google.cloud.retail.v2beta.Promotion result = new com.google.cloud.retail.v2beta.Promotion(this);
      result.promotionId_ = promotionId_;
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
      if (other instanceof com.google.cloud.retail.v2beta.Promotion) {
        return mergeFrom((com.google.cloud.retail.v2beta.Promotion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.Promotion other) {
      if (other == com.google.cloud.retail.v2beta.Promotion.getDefaultInstance()) return this;
      if (!other.getPromotionId().isEmpty()) {
        promotionId_ = other.promotionId_;
        onChanged();
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
      com.google.cloud.retail.v2beta.Promotion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.retail.v2beta.Promotion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object promotionId_ = "";
    /**
     * <pre>
     * ID of the promotion. For example, "free gift".
     * The value must be a UTF-8 encoded string with a length limit of 128
     * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
     * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * Google Merchant Center property
     * [promotion](https://support.google.com/merchants/answer/7050148).
     * </pre>
     *
     * <code>string promotion_id = 1;</code>
     * @return The promotionId.
     */
    public java.lang.String getPromotionId() {
      java.lang.Object ref = promotionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        promotionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ID of the promotion. For example, "free gift".
     * The value must be a UTF-8 encoded string with a length limit of 128
     * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
     * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * Google Merchant Center property
     * [promotion](https://support.google.com/merchants/answer/7050148).
     * </pre>
     *
     * <code>string promotion_id = 1;</code>
     * @return The bytes for promotionId.
     */
    public com.google.protobuf.ByteString
        getPromotionIdBytes() {
      java.lang.Object ref = promotionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        promotionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ID of the promotion. For example, "free gift".
     * The value must be a UTF-8 encoded string with a length limit of 128
     * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
     * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * Google Merchant Center property
     * [promotion](https://support.google.com/merchants/answer/7050148).
     * </pre>
     *
     * <code>string promotion_id = 1;</code>
     * @param value The promotionId to set.
     * @return This builder for chaining.
     */
    public Builder setPromotionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      promotionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the promotion. For example, "free gift".
     * The value must be a UTF-8 encoded string with a length limit of 128
     * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
     * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * Google Merchant Center property
     * [promotion](https://support.google.com/merchants/answer/7050148).
     * </pre>
     *
     * <code>string promotion_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPromotionId() {
      
      promotionId_ = getDefaultInstance().getPromotionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the promotion. For example, "free gift".
     * The value must be a UTF-8 encoded string with a length limit of 128
     * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
     * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * Google Merchant Center property
     * [promotion](https://support.google.com/merchants/answer/7050148).
     * </pre>
     *
     * <code>string promotion_id = 1;</code>
     * @param value The bytes for promotionId to set.
     * @return This builder for chaining.
     */
    public Builder setPromotionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      promotionId_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.Promotion)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.Promotion)
  private static final com.google.cloud.retail.v2beta.Promotion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.Promotion();
  }

  public static com.google.cloud.retail.v2beta.Promotion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Promotion>
      PARSER = new com.google.protobuf.AbstractParser<Promotion>() {
    @java.lang.Override
    public Promotion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Promotion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Promotion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Promotion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.Promotion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

