// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

/**
 * <pre>
 * The long running operation metadata for review document method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.ReviewDocumentOperationMetadata}
 */
public final class ReviewDocumentOperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.ReviewDocumentOperationMetadata)
    ReviewDocumentOperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReviewDocumentOperationMetadata.newBuilder() to construct.
  private ReviewDocumentOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReviewDocumentOperationMetadata() {
    questionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReviewDocumentOperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ReviewDocumentOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ReviewDocumentOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata.class, com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata.Builder.class);
  }

  public static final int COMMON_METADATA_FIELD_NUMBER = 5;
  private com.google.cloud.documentai.v1.CommonOperationMetadata commonMetadata_;
  /**
   * <pre>
   * The basic metadata of the long running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
   * @return Whether the commonMetadata field is set.
   */
  @java.lang.Override
  public boolean hasCommonMetadata() {
    return commonMetadata_ != null;
  }
  /**
   * <pre>
   * The basic metadata of the long running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
   * @return The commonMetadata.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.CommonOperationMetadata getCommonMetadata() {
    return commonMetadata_ == null ? com.google.cloud.documentai.v1.CommonOperationMetadata.getDefaultInstance() : commonMetadata_;
  }
  /**
   * <pre>
   * The basic metadata of the long running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.CommonOperationMetadataOrBuilder getCommonMetadataOrBuilder() {
    return commonMetadata_ == null ? com.google.cloud.documentai.v1.CommonOperationMetadata.getDefaultInstance() : commonMetadata_;
  }

  public static final int QUESTION_ID_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object questionId_ = "";
  /**
   * <pre>
   * The Crowd Compute question ID.
   * </pre>
   *
   * <code>string question_id = 6;</code>
   * @return The questionId.
   */
  @java.lang.Override
  public java.lang.String getQuestionId() {
    java.lang.Object ref = questionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      questionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Crowd Compute question ID.
   * </pre>
   *
   * <code>string question_id = 6;</code>
   * @return The bytes for questionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQuestionIdBytes() {
    java.lang.Object ref = questionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      questionId_ = b;
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
    if (commonMetadata_ != null) {
      output.writeMessage(5, getCommonMetadata());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(questionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, questionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commonMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getCommonMetadata());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(questionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, questionId_);
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
    if (!(obj instanceof com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata other = (com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata) obj;

    if (hasCommonMetadata() != other.hasCommonMetadata()) return false;
    if (hasCommonMetadata()) {
      if (!getCommonMetadata()
          .equals(other.getCommonMetadata())) return false;
    }
    if (!getQuestionId()
        .equals(other.getQuestionId())) return false;
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
    if (hasCommonMetadata()) {
      hash = (37 * hash) + COMMON_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getCommonMetadata().hashCode();
    }
    hash = (37 * hash) + QUESTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQuestionId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata prototype) {
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
   * The long running operation metadata for review document method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.ReviewDocumentOperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.ReviewDocumentOperationMetadata)
      com.google.cloud.documentai.v1.ReviewDocumentOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ReviewDocumentOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ReviewDocumentOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata.class, com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata.newBuilder()
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
      commonMetadata_ = null;
      if (commonMetadataBuilder_ != null) {
        commonMetadataBuilder_.dispose();
        commonMetadataBuilder_ = null;
      }
      questionId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ReviewDocumentOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata build() {
      com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata buildPartial() {
      com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata result = new com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.commonMetadata_ = commonMetadataBuilder_ == null
            ? commonMetadata_
            : commonMetadataBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.questionId_ = questionId_;
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
      if (other instanceof com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata) {
        return mergeFrom((com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata other) {
      if (other == com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata.getDefaultInstance()) return this;
      if (other.hasCommonMetadata()) {
        mergeCommonMetadata(other.getCommonMetadata());
      }
      if (!other.getQuestionId().isEmpty()) {
        questionId_ = other.questionId_;
        bitField0_ |= 0x00000002;
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
            case 42: {
              input.readMessage(
                  getCommonMetadataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 42
            case 50: {
              questionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 50
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

    private com.google.cloud.documentai.v1.CommonOperationMetadata commonMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.documentai.v1.CommonOperationMetadata, com.google.cloud.documentai.v1.CommonOperationMetadata.Builder, com.google.cloud.documentai.v1.CommonOperationMetadataOrBuilder> commonMetadataBuilder_;
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     * @return Whether the commonMetadata field is set.
     */
    public boolean hasCommonMetadata() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     * @return The commonMetadata.
     */
    public com.google.cloud.documentai.v1.CommonOperationMetadata getCommonMetadata() {
      if (commonMetadataBuilder_ == null) {
        return commonMetadata_ == null ? com.google.cloud.documentai.v1.CommonOperationMetadata.getDefaultInstance() : commonMetadata_;
      } else {
        return commonMetadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public Builder setCommonMetadata(com.google.cloud.documentai.v1.CommonOperationMetadata value) {
      if (commonMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonMetadata_ = value;
      } else {
        commonMetadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public Builder setCommonMetadata(
        com.google.cloud.documentai.v1.CommonOperationMetadata.Builder builderForValue) {
      if (commonMetadataBuilder_ == null) {
        commonMetadata_ = builderForValue.build();
      } else {
        commonMetadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public Builder mergeCommonMetadata(com.google.cloud.documentai.v1.CommonOperationMetadata value) {
      if (commonMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          commonMetadata_ != null &&
          commonMetadata_ != com.google.cloud.documentai.v1.CommonOperationMetadata.getDefaultInstance()) {
          getCommonMetadataBuilder().mergeFrom(value);
        } else {
          commonMetadata_ = value;
        }
      } else {
        commonMetadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public Builder clearCommonMetadata() {
      bitField0_ = (bitField0_ & ~0x00000001);
      commonMetadata_ = null;
      if (commonMetadataBuilder_ != null) {
        commonMetadataBuilder_.dispose();
        commonMetadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public com.google.cloud.documentai.v1.CommonOperationMetadata.Builder getCommonMetadataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCommonMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public com.google.cloud.documentai.v1.CommonOperationMetadataOrBuilder getCommonMetadataOrBuilder() {
      if (commonMetadataBuilder_ != null) {
        return commonMetadataBuilder_.getMessageOrBuilder();
      } else {
        return commonMetadata_ == null ?
            com.google.cloud.documentai.v1.CommonOperationMetadata.getDefaultInstance() : commonMetadata_;
      }
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.documentai.v1.CommonOperationMetadata, com.google.cloud.documentai.v1.CommonOperationMetadata.Builder, com.google.cloud.documentai.v1.CommonOperationMetadataOrBuilder> 
        getCommonMetadataFieldBuilder() {
      if (commonMetadataBuilder_ == null) {
        commonMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1.CommonOperationMetadata, com.google.cloud.documentai.v1.CommonOperationMetadata.Builder, com.google.cloud.documentai.v1.CommonOperationMetadataOrBuilder>(
                getCommonMetadata(),
                getParentForChildren(),
                isClean());
        commonMetadata_ = null;
      }
      return commonMetadataBuilder_;
    }

    private java.lang.Object questionId_ = "";
    /**
     * <pre>
     * The Crowd Compute question ID.
     * </pre>
     *
     * <code>string question_id = 6;</code>
     * @return The questionId.
     */
    public java.lang.String getQuestionId() {
      java.lang.Object ref = questionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        questionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Crowd Compute question ID.
     * </pre>
     *
     * <code>string question_id = 6;</code>
     * @return The bytes for questionId.
     */
    public com.google.protobuf.ByteString
        getQuestionIdBytes() {
      java.lang.Object ref = questionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        questionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Crowd Compute question ID.
     * </pre>
     *
     * <code>string question_id = 6;</code>
     * @param value The questionId to set.
     * @return This builder for chaining.
     */
    public Builder setQuestionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      questionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Crowd Compute question ID.
     * </pre>
     *
     * <code>string question_id = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestionId() {
      questionId_ = getDefaultInstance().getQuestionId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Crowd Compute question ID.
     * </pre>
     *
     * <code>string question_id = 6;</code>
     * @param value The bytes for questionId to set.
     * @return This builder for chaining.
     */
    public Builder setQuestionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      questionId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.ReviewDocumentOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.ReviewDocumentOperationMetadata)
  private static final com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata();
  }

  public static com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReviewDocumentOperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<ReviewDocumentOperationMetadata>() {
    @java.lang.Override
    public ReviewDocumentOperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReviewDocumentOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReviewDocumentOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.ReviewDocumentOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

