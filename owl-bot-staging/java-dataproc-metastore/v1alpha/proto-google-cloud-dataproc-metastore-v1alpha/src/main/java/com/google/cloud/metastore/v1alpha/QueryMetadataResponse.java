// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1alpha/metastore.proto

package com.google.cloud.metastore.v1alpha;

/**
 * <pre>
 * Response message for
 * [DataprocMetastore.QueryMetadata][google.cloud.metastore.v1alpha.DataprocMetastore.QueryMetadata].
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1alpha.QueryMetadataResponse}
 */
public final class QueryMetadataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1alpha.QueryMetadataResponse)
    QueryMetadataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryMetadataResponse.newBuilder() to construct.
  private QueryMetadataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryMetadataResponse() {
    resultManifestUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryMetadataResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_QueryMetadataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_QueryMetadataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1alpha.QueryMetadataResponse.class, com.google.cloud.metastore.v1alpha.QueryMetadataResponse.Builder.class);
  }

  public static final int RESULT_MANIFEST_URI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resultManifestUri_ = "";
  /**
   * <pre>
   * The manifest URI  is link to a JSON instance in Cloud Storage.
   * This instance manifests immediately along with QueryMetadataResponse. The
   * content of the URI is not retriable until the long-running operation query
   * against the metadata finishes.
   * </pre>
   *
   * <code>string result_manifest_uri = 1;</code>
   * @return The resultManifestUri.
   */
  @java.lang.Override
  public java.lang.String getResultManifestUri() {
    java.lang.Object ref = resultManifestUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resultManifestUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The manifest URI  is link to a JSON instance in Cloud Storage.
   * This instance manifests immediately along with QueryMetadataResponse. The
   * content of the URI is not retriable until the long-running operation query
   * against the metadata finishes.
   * </pre>
   *
   * <code>string result_manifest_uri = 1;</code>
   * @return The bytes for resultManifestUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResultManifestUriBytes() {
    java.lang.Object ref = resultManifestUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resultManifestUri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resultManifestUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resultManifestUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resultManifestUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resultManifestUri_);
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
    if (!(obj instanceof com.google.cloud.metastore.v1alpha.QueryMetadataResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1alpha.QueryMetadataResponse other = (com.google.cloud.metastore.v1alpha.QueryMetadataResponse) obj;

    if (!getResultManifestUri()
        .equals(other.getResultManifestUri())) return false;
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
    hash = (37 * hash) + RESULT_MANIFEST_URI_FIELD_NUMBER;
    hash = (53 * hash) + getResultManifestUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.metastore.v1alpha.QueryMetadataResponse prototype) {
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
   * Response message for
   * [DataprocMetastore.QueryMetadata][google.cloud.metastore.v1alpha.DataprocMetastore.QueryMetadata].
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1alpha.QueryMetadataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1alpha.QueryMetadataResponse)
      com.google.cloud.metastore.v1alpha.QueryMetadataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_QueryMetadataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_QueryMetadataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1alpha.QueryMetadataResponse.class, com.google.cloud.metastore.v1alpha.QueryMetadataResponse.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1alpha.QueryMetadataResponse.newBuilder()
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
      resultManifestUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_QueryMetadataResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.QueryMetadataResponse getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1alpha.QueryMetadataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.QueryMetadataResponse build() {
      com.google.cloud.metastore.v1alpha.QueryMetadataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.QueryMetadataResponse buildPartial() {
      com.google.cloud.metastore.v1alpha.QueryMetadataResponse result = new com.google.cloud.metastore.v1alpha.QueryMetadataResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.metastore.v1alpha.QueryMetadataResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resultManifestUri_ = resultManifestUri_;
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
      if (other instanceof com.google.cloud.metastore.v1alpha.QueryMetadataResponse) {
        return mergeFrom((com.google.cloud.metastore.v1alpha.QueryMetadataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1alpha.QueryMetadataResponse other) {
      if (other == com.google.cloud.metastore.v1alpha.QueryMetadataResponse.getDefaultInstance()) return this;
      if (!other.getResultManifestUri().isEmpty()) {
        resultManifestUri_ = other.resultManifestUri_;
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
              resultManifestUri_ = input.readStringRequireUtf8();
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

    private java.lang.Object resultManifestUri_ = "";
    /**
     * <pre>
     * The manifest URI  is link to a JSON instance in Cloud Storage.
     * This instance manifests immediately along with QueryMetadataResponse. The
     * content of the URI is not retriable until the long-running operation query
     * against the metadata finishes.
     * </pre>
     *
     * <code>string result_manifest_uri = 1;</code>
     * @return The resultManifestUri.
     */
    public java.lang.String getResultManifestUri() {
      java.lang.Object ref = resultManifestUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultManifestUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The manifest URI  is link to a JSON instance in Cloud Storage.
     * This instance manifests immediately along with QueryMetadataResponse. The
     * content of the URI is not retriable until the long-running operation query
     * against the metadata finishes.
     * </pre>
     *
     * <code>string result_manifest_uri = 1;</code>
     * @return The bytes for resultManifestUri.
     */
    public com.google.protobuf.ByteString
        getResultManifestUriBytes() {
      java.lang.Object ref = resultManifestUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultManifestUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The manifest URI  is link to a JSON instance in Cloud Storage.
     * This instance manifests immediately along with QueryMetadataResponse. The
     * content of the URI is not retriable until the long-running operation query
     * against the metadata finishes.
     * </pre>
     *
     * <code>string result_manifest_uri = 1;</code>
     * @param value The resultManifestUri to set.
     * @return This builder for chaining.
     */
    public Builder setResultManifestUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resultManifestUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The manifest URI  is link to a JSON instance in Cloud Storage.
     * This instance manifests immediately along with QueryMetadataResponse. The
     * content of the URI is not retriable until the long-running operation query
     * against the metadata finishes.
     * </pre>
     *
     * <code>string result_manifest_uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResultManifestUri() {
      resultManifestUri_ = getDefaultInstance().getResultManifestUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The manifest URI  is link to a JSON instance in Cloud Storage.
     * This instance manifests immediately along with QueryMetadataResponse. The
     * content of the URI is not retriable until the long-running operation query
     * against the metadata finishes.
     * </pre>
     *
     * <code>string result_manifest_uri = 1;</code>
     * @param value The bytes for resultManifestUri to set.
     * @return This builder for chaining.
     */
    public Builder setResultManifestUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resultManifestUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1alpha.QueryMetadataResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1alpha.QueryMetadataResponse)
  private static final com.google.cloud.metastore.v1alpha.QueryMetadataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1alpha.QueryMetadataResponse();
  }

  public static com.google.cloud.metastore.v1alpha.QueryMetadataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryMetadataResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryMetadataResponse>() {
    @java.lang.Override
    public QueryMetadataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryMetadataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryMetadataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.QueryMetadataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

