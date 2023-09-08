// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta1/document_understanding.proto

package com.google.cloud.documentai.v1beta1;

/**
 * <pre>
 * A hint for a table bounding box on the page for table parsing.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta1.TableBoundHint}
 */
public final class TableBoundHint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta1.TableBoundHint)
    TableBoundHintOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TableBoundHint.newBuilder() to construct.
  private TableBoundHint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TableBoundHint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TableBoundHint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_TableBoundHint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_TableBoundHint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta1.TableBoundHint.class, com.google.cloud.documentai.v1beta1.TableBoundHint.Builder.class);
  }

  public static final int PAGE_NUMBER_FIELD_NUMBER = 1;
  private int pageNumber_ = 0;
  /**
   * <pre>
   * Optional. Page number for multi-paged inputs this hint applies to. If not
   * provided, this hint will apply to all pages by default. This value is
   * 1-based.
   * </pre>
   *
   * <code>int32 page_number = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageNumber.
   */
  @java.lang.Override
  public int getPageNumber() {
    return pageNumber_;
  }

  public static final int BOUNDING_BOX_FIELD_NUMBER = 2;
  private com.google.cloud.documentai.v1beta1.BoundingPoly boundingBox_;
  /**
   * <pre>
   * Bounding box hint for a table on this page. The coordinates must be
   * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
   * @return Whether the boundingBox field is set.
   */
  @java.lang.Override
  public boolean hasBoundingBox() {
    return boundingBox_ != null;
  }
  /**
   * <pre>
   * Bounding box hint for a table on this page. The coordinates must be
   * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
   * @return The boundingBox.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.BoundingPoly getBoundingBox() {
    return boundingBox_ == null ? com.google.cloud.documentai.v1beta1.BoundingPoly.getDefaultInstance() : boundingBox_;
  }
  /**
   * <pre>
   * Bounding box hint for a table on this page. The coordinates must be
   * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.BoundingPolyOrBuilder getBoundingBoxOrBuilder() {
    return boundingBox_ == null ? com.google.cloud.documentai.v1beta1.BoundingPoly.getDefaultInstance() : boundingBox_;
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
    if (pageNumber_ != 0) {
      output.writeInt32(1, pageNumber_);
    }
    if (boundingBox_ != null) {
      output.writeMessage(2, getBoundingBox());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pageNumber_);
    }
    if (boundingBox_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBoundingBox());
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta1.TableBoundHint)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta1.TableBoundHint other = (com.google.cloud.documentai.v1beta1.TableBoundHint) obj;

    if (getPageNumber()
        != other.getPageNumber()) return false;
    if (hasBoundingBox() != other.hasBoundingBox()) return false;
    if (hasBoundingBox()) {
      if (!getBoundingBox()
          .equals(other.getBoundingBox())) return false;
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
    hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPageNumber();
    if (hasBoundingBox()) {
      hash = (37 * hash) + BOUNDING_BOX_FIELD_NUMBER;
      hash = (53 * hash) + getBoundingBox().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta1.TableBoundHint parseFrom(
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
  public static Builder newBuilder(com.google.cloud.documentai.v1beta1.TableBoundHint prototype) {
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
   * A hint for a table bounding box on the page for table parsing.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta1.TableBoundHint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta1.TableBoundHint)
      com.google.cloud.documentai.v1beta1.TableBoundHintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_TableBoundHint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_TableBoundHint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta1.TableBoundHint.class, com.google.cloud.documentai.v1beta1.TableBoundHint.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta1.TableBoundHint.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pageNumber_ = 0;
      boundingBox_ = null;
      if (boundingBoxBuilder_ != null) {
        boundingBoxBuilder_.dispose();
        boundingBoxBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_TableBoundHint_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.TableBoundHint getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta1.TableBoundHint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.TableBoundHint build() {
      com.google.cloud.documentai.v1beta1.TableBoundHint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.TableBoundHint buildPartial() {
      com.google.cloud.documentai.v1beta1.TableBoundHint result = new com.google.cloud.documentai.v1beta1.TableBoundHint(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.documentai.v1beta1.TableBoundHint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageNumber_ = pageNumber_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.boundingBox_ = boundingBoxBuilder_ == null
            ? boundingBox_
            : boundingBoxBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.documentai.v1beta1.TableBoundHint) {
        return mergeFrom((com.google.cloud.documentai.v1beta1.TableBoundHint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta1.TableBoundHint other) {
      if (other == com.google.cloud.documentai.v1beta1.TableBoundHint.getDefaultInstance()) return this;
      if (other.getPageNumber() != 0) {
        setPageNumber(other.getPageNumber());
      }
      if (other.hasBoundingBox()) {
        mergeBoundingBox(other.getBoundingBox());
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
            case 8: {
              pageNumber_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getBoundingBoxFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
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

    private int pageNumber_ ;
    /**
     * <pre>
     * Optional. Page number for multi-paged inputs this hint applies to. If not
     * provided, this hint will apply to all pages by default. This value is
     * 1-based.
     * </pre>
     *
     * <code>int32 page_number = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The pageNumber.
     */
    @java.lang.Override
    public int getPageNumber() {
      return pageNumber_;
    }
    /**
     * <pre>
     * Optional. Page number for multi-paged inputs this hint applies to. If not
     * provided, this hint will apply to all pages by default. This value is
     * 1-based.
     * </pre>
     *
     * <code>int32 page_number = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The pageNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPageNumber(int value) {

      pageNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Page number for multi-paged inputs this hint applies to. If not
     * provided, this hint will apply to all pages by default. This value is
     * 1-based.
     * </pre>
     *
     * <code>int32 page_number = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNumber() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageNumber_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.documentai.v1beta1.BoundingPoly boundingBox_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.documentai.v1beta1.BoundingPoly, com.google.cloud.documentai.v1beta1.BoundingPoly.Builder, com.google.cloud.documentai.v1beta1.BoundingPolyOrBuilder> boundingBoxBuilder_;
    /**
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
     * @return Whether the boundingBox field is set.
     */
    public boolean hasBoundingBox() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
     * @return The boundingBox.
     */
    public com.google.cloud.documentai.v1beta1.BoundingPoly getBoundingBox() {
      if (boundingBoxBuilder_ == null) {
        return boundingBox_ == null ? com.google.cloud.documentai.v1beta1.BoundingPoly.getDefaultInstance() : boundingBox_;
      } else {
        return boundingBoxBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
     */
    public Builder setBoundingBox(com.google.cloud.documentai.v1beta1.BoundingPoly value) {
      if (boundingBoxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        boundingBox_ = value;
      } else {
        boundingBoxBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
     */
    public Builder setBoundingBox(
        com.google.cloud.documentai.v1beta1.BoundingPoly.Builder builderForValue) {
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = builderForValue.build();
      } else {
        boundingBoxBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
     */
    public Builder mergeBoundingBox(com.google.cloud.documentai.v1beta1.BoundingPoly value) {
      if (boundingBoxBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          boundingBox_ != null &&
          boundingBox_ != com.google.cloud.documentai.v1beta1.BoundingPoly.getDefaultInstance()) {
          getBoundingBoxBuilder().mergeFrom(value);
        } else {
          boundingBox_ = value;
        }
      } else {
        boundingBoxBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
     */
    public Builder clearBoundingBox() {
      bitField0_ = (bitField0_ & ~0x00000002);
      boundingBox_ = null;
      if (boundingBoxBuilder_ != null) {
        boundingBoxBuilder_.dispose();
        boundingBoxBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
     */
    public com.google.cloud.documentai.v1beta1.BoundingPoly.Builder getBoundingBoxBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBoundingBoxFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
     */
    public com.google.cloud.documentai.v1beta1.BoundingPolyOrBuilder getBoundingBoxOrBuilder() {
      if (boundingBoxBuilder_ != null) {
        return boundingBoxBuilder_.getMessageOrBuilder();
      } else {
        return boundingBox_ == null ?
            com.google.cloud.documentai.v1beta1.BoundingPoly.getDefaultInstance() : boundingBox_;
      }
    }
    /**
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta1.BoundingPoly bounding_box = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.documentai.v1beta1.BoundingPoly, com.google.cloud.documentai.v1beta1.BoundingPoly.Builder, com.google.cloud.documentai.v1beta1.BoundingPolyOrBuilder> 
        getBoundingBoxFieldBuilder() {
      if (boundingBoxBuilder_ == null) {
        boundingBoxBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta1.BoundingPoly, com.google.cloud.documentai.v1beta1.BoundingPoly.Builder, com.google.cloud.documentai.v1beta1.BoundingPolyOrBuilder>(
                getBoundingBox(),
                getParentForChildren(),
                isClean());
        boundingBox_ = null;
      }
      return boundingBoxBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta1.TableBoundHint)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta1.TableBoundHint)
  private static final com.google.cloud.documentai.v1beta1.TableBoundHint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta1.TableBoundHint();
  }

  public static com.google.cloud.documentai.v1beta1.TableBoundHint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableBoundHint>
      PARSER = new com.google.protobuf.AbstractParser<TableBoundHint>() {
    @java.lang.Override
    public TableBoundHint parsePartialFrom(
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

  public static com.google.protobuf.Parser<TableBoundHint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableBoundHint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.TableBoundHint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

