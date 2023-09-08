// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1/document_io.proto

package com.google.cloud.documentai.v1;

/**
 * <pre>
 * Specifies all documents on Cloud Storage with a common prefix.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.GcsPrefix}
 */
public final class GcsPrefix extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.GcsPrefix)
    GcsPrefixOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcsPrefix.newBuilder() to construct.
  private GcsPrefix(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcsPrefix() {
    gcsUriPrefix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GcsPrefix();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentIoProto.internal_static_google_cloud_documentai_v1_GcsPrefix_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentIoProto.internal_static_google_cloud_documentai_v1_GcsPrefix_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.GcsPrefix.class, com.google.cloud.documentai.v1.GcsPrefix.Builder.class);
  }

  public static final int GCS_URI_PREFIX_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object gcsUriPrefix_ = "";
  /**
   * <pre>
   * The URI prefix.
   * </pre>
   *
   * <code>string gcs_uri_prefix = 1;</code>
   * @return The gcsUriPrefix.
   */
  @java.lang.Override
  public java.lang.String getGcsUriPrefix() {
    java.lang.Object ref = gcsUriPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcsUriPrefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The URI prefix.
   * </pre>
   *
   * <code>string gcs_uri_prefix = 1;</code>
   * @return The bytes for gcsUriPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGcsUriPrefixBytes() {
    java.lang.Object ref = gcsUriPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gcsUriPrefix_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcsUriPrefix_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gcsUriPrefix_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcsUriPrefix_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gcsUriPrefix_);
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
    if (!(obj instanceof com.google.cloud.documentai.v1.GcsPrefix)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.GcsPrefix other = (com.google.cloud.documentai.v1.GcsPrefix) obj;

    if (!getGcsUriPrefix()
        .equals(other.getGcsUriPrefix())) return false;
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
    hash = (37 * hash) + GCS_URI_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getGcsUriPrefix().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.GcsPrefix parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.GcsPrefix parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.GcsPrefix parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.GcsPrefix parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.GcsPrefix parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.GcsPrefix parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.GcsPrefix parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.GcsPrefix parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.GcsPrefix parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.GcsPrefix parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.GcsPrefix parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.GcsPrefix parseFrom(
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
  public static Builder newBuilder(com.google.cloud.documentai.v1.GcsPrefix prototype) {
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
   * Specifies all documents on Cloud Storage with a common prefix.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.GcsPrefix}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.GcsPrefix)
      com.google.cloud.documentai.v1.GcsPrefixOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentIoProto.internal_static_google_cloud_documentai_v1_GcsPrefix_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentIoProto.internal_static_google_cloud_documentai_v1_GcsPrefix_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.GcsPrefix.class, com.google.cloud.documentai.v1.GcsPrefix.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.GcsPrefix.newBuilder()
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
      gcsUriPrefix_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentIoProto.internal_static_google_cloud_documentai_v1_GcsPrefix_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.GcsPrefix getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.GcsPrefix.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.GcsPrefix build() {
      com.google.cloud.documentai.v1.GcsPrefix result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.GcsPrefix buildPartial() {
      com.google.cloud.documentai.v1.GcsPrefix result = new com.google.cloud.documentai.v1.GcsPrefix(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.documentai.v1.GcsPrefix result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gcsUriPrefix_ = gcsUriPrefix_;
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
      if (other instanceof com.google.cloud.documentai.v1.GcsPrefix) {
        return mergeFrom((com.google.cloud.documentai.v1.GcsPrefix)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.GcsPrefix other) {
      if (other == com.google.cloud.documentai.v1.GcsPrefix.getDefaultInstance()) return this;
      if (!other.getGcsUriPrefix().isEmpty()) {
        gcsUriPrefix_ = other.gcsUriPrefix_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              gcsUriPrefix_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object gcsUriPrefix_ = "";
    /**
     * <pre>
     * The URI prefix.
     * </pre>
     *
     * <code>string gcs_uri_prefix = 1;</code>
     * @return The gcsUriPrefix.
     */
    public java.lang.String getGcsUriPrefix() {
      java.lang.Object ref = gcsUriPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcsUriPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URI prefix.
     * </pre>
     *
     * <code>string gcs_uri_prefix = 1;</code>
     * @return The bytes for gcsUriPrefix.
     */
    public com.google.protobuf.ByteString
        getGcsUriPrefixBytes() {
      java.lang.Object ref = gcsUriPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gcsUriPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URI prefix.
     * </pre>
     *
     * <code>string gcs_uri_prefix = 1;</code>
     * @param value The gcsUriPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setGcsUriPrefix(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      gcsUriPrefix_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI prefix.
     * </pre>
     *
     * <code>string gcs_uri_prefix = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGcsUriPrefix() {
      gcsUriPrefix_ = getDefaultInstance().getGcsUriPrefix();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI prefix.
     * </pre>
     *
     * <code>string gcs_uri_prefix = 1;</code>
     * @param value The bytes for gcsUriPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setGcsUriPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      gcsUriPrefix_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.GcsPrefix)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.GcsPrefix)
  private static final com.google.cloud.documentai.v1.GcsPrefix DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.GcsPrefix();
  }

  public static com.google.cloud.documentai.v1.GcsPrefix getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsPrefix>
      PARSER = new com.google.protobuf.AbstractParser<GcsPrefix>() {
    @java.lang.Override
    public GcsPrefix parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcsPrefix> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsPrefix> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.GcsPrefix getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

