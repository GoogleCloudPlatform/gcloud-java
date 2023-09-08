// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_service.proto

package com.google.cloud.documentai.v1beta3;

/**
 * <pre>
 * Range of pages present in a document.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta3.DocumentPageRange}
 */
public final class DocumentPageRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta3.DocumentPageRange)
    DocumentPageRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DocumentPageRange.newBuilder() to construct.
  private DocumentPageRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentPageRange() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DocumentPageRange();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1beta3.DocumentAiDocumentService.internal_static_google_cloud_documentai_v1beta3_DocumentPageRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta3.DocumentAiDocumentService.internal_static_google_cloud_documentai_v1beta3_DocumentPageRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta3.DocumentPageRange.class, com.google.cloud.documentai.v1beta3.DocumentPageRange.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private int start_ = 0;
  /**
   * <pre>
   * First page number (one-based index) to be returned.
   * </pre>
   *
   * <code>int32 start = 1;</code>
   * @return The start.
   */
  @java.lang.Override
  public int getStart() {
    return start_;
  }

  public static final int END_FIELD_NUMBER = 2;
  private int end_ = 0;
  /**
   * <pre>
   * Last page number (one-based index) to be returned.
   * </pre>
   *
   * <code>int32 end = 2;</code>
   * @return The end.
   */
  @java.lang.Override
  public int getEnd() {
    return end_;
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
    if (start_ != 0) {
      output.writeInt32(1, start_);
    }
    if (end_ != 0) {
      output.writeInt32(2, end_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (start_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, start_);
    }
    if (end_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, end_);
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta3.DocumentPageRange)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta3.DocumentPageRange other = (com.google.cloud.documentai.v1beta3.DocumentPageRange) obj;

    if (getStart()
        != other.getStart()) return false;
    if (getEnd()
        != other.getEnd()) return false;
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
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart();
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + getEnd();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.DocumentPageRange parseFrom(
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
  public static Builder newBuilder(com.google.cloud.documentai.v1beta3.DocumentPageRange prototype) {
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
   * Range of pages present in a document.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta3.DocumentPageRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta3.DocumentPageRange)
      com.google.cloud.documentai.v1beta3.DocumentPageRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1beta3.DocumentAiDocumentService.internal_static_google_cloud_documentai_v1beta3_DocumentPageRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta3.DocumentAiDocumentService.internal_static_google_cloud_documentai_v1beta3_DocumentPageRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta3.DocumentPageRange.class, com.google.cloud.documentai.v1beta3.DocumentPageRange.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta3.DocumentPageRange.newBuilder()
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
      start_ = 0;
      end_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1beta3.DocumentAiDocumentService.internal_static_google_cloud_documentai_v1beta3_DocumentPageRange_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.DocumentPageRange getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta3.DocumentPageRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.DocumentPageRange build() {
      com.google.cloud.documentai.v1beta3.DocumentPageRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.DocumentPageRange buildPartial() {
      com.google.cloud.documentai.v1beta3.DocumentPageRange result = new com.google.cloud.documentai.v1beta3.DocumentPageRange(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.documentai.v1beta3.DocumentPageRange result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.start_ = start_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.end_ = end_;
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
      if (other instanceof com.google.cloud.documentai.v1beta3.DocumentPageRange) {
        return mergeFrom((com.google.cloud.documentai.v1beta3.DocumentPageRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta3.DocumentPageRange other) {
      if (other == com.google.cloud.documentai.v1beta3.DocumentPageRange.getDefaultInstance()) return this;
      if (other.getStart() != 0) {
        setStart(other.getStart());
      }
      if (other.getEnd() != 0) {
        setEnd(other.getEnd());
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
              start_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              end_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int start_ ;
    /**
     * <pre>
     * First page number (one-based index) to be returned.
     * </pre>
     *
     * <code>int32 start = 1;</code>
     * @return The start.
     */
    @java.lang.Override
    public int getStart() {
      return start_;
    }
    /**
     * <pre>
     * First page number (one-based index) to be returned.
     * </pre>
     *
     * <code>int32 start = 1;</code>
     * @param value The start to set.
     * @return This builder for chaining.
     */
    public Builder setStart(int value) {

      start_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * First page number (one-based index) to be returned.
     * </pre>
     *
     * <code>int32 start = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStart() {
      bitField0_ = (bitField0_ & ~0x00000001);
      start_ = 0;
      onChanged();
      return this;
    }

    private int end_ ;
    /**
     * <pre>
     * Last page number (one-based index) to be returned.
     * </pre>
     *
     * <code>int32 end = 2;</code>
     * @return The end.
     */
    @java.lang.Override
    public int getEnd() {
      return end_;
    }
    /**
     * <pre>
     * Last page number (one-based index) to be returned.
     * </pre>
     *
     * <code>int32 end = 2;</code>
     * @param value The end to set.
     * @return This builder for chaining.
     */
    public Builder setEnd(int value) {

      end_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Last page number (one-based index) to be returned.
     * </pre>
     *
     * <code>int32 end = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnd() {
      bitField0_ = (bitField0_ & ~0x00000002);
      end_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta3.DocumentPageRange)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.DocumentPageRange)
  private static final com.google.cloud.documentai.v1beta3.DocumentPageRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta3.DocumentPageRange();
  }

  public static com.google.cloud.documentai.v1beta3.DocumentPageRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentPageRange>
      PARSER = new com.google.protobuf.AbstractParser<DocumentPageRange>() {
    @java.lang.Override
    public DocumentPageRange parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocumentPageRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentPageRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.DocumentPageRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

