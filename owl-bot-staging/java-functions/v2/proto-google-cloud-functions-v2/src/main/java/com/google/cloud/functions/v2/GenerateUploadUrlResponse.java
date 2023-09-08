// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2/functions.proto

package com.google.cloud.functions.v2;

/**
 * <pre>
 * Response of `GenerateSourceUploadUrl` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v2.GenerateUploadUrlResponse}
 */
public final class GenerateUploadUrlResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v2.GenerateUploadUrlResponse)
    GenerateUploadUrlResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateUploadUrlResponse.newBuilder() to construct.
  private GenerateUploadUrlResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateUploadUrlResponse() {
    uploadUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateUploadUrlResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.functions.v2.FunctionsProto.internal_static_google_cloud_functions_v2_GenerateUploadUrlResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v2.FunctionsProto.internal_static_google_cloud_functions_v2_GenerateUploadUrlResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v2.GenerateUploadUrlResponse.class, com.google.cloud.functions.v2.GenerateUploadUrlResponse.Builder.class);
  }

  public static final int UPLOAD_URL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uploadUrl_ = "";
  /**
   * <pre>
   * The generated Google Cloud Storage signed URL that should be used for a
   * function source code upload. The uploaded file should be a zip archive
   * which contains a function.
   * </pre>
   *
   * <code>string upload_url = 1;</code>
   * @return The uploadUrl.
   */
  @java.lang.Override
  public java.lang.String getUploadUrl() {
    java.lang.Object ref = uploadUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uploadUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The generated Google Cloud Storage signed URL that should be used for a
   * function source code upload. The uploaded file should be a zip archive
   * which contains a function.
   * </pre>
   *
   * <code>string upload_url = 1;</code>
   * @return The bytes for uploadUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUploadUrlBytes() {
    java.lang.Object ref = uploadUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uploadUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STORAGE_SOURCE_FIELD_NUMBER = 2;
  private com.google.cloud.functions.v2.StorageSource storageSource_;
  /**
   * <pre>
   * The location of the source code in the upload bucket.
   *
   * Once the archive is uploaded using the `upload_url` use this field to
   * set the `function.build_config.source.storage_source`
   * during CreateFunction and UpdateFunction.
   *
   * Generation defaults to 0, as Cloud Storage provides a new generation only
   * upon uploading a new object or version of an object.
   * </pre>
   *
   * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
   * @return Whether the storageSource field is set.
   */
  @java.lang.Override
  public boolean hasStorageSource() {
    return storageSource_ != null;
  }
  /**
   * <pre>
   * The location of the source code in the upload bucket.
   *
   * Once the archive is uploaded using the `upload_url` use this field to
   * set the `function.build_config.source.storage_source`
   * during CreateFunction and UpdateFunction.
   *
   * Generation defaults to 0, as Cloud Storage provides a new generation only
   * upon uploading a new object or version of an object.
   * </pre>
   *
   * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
   * @return The storageSource.
   */
  @java.lang.Override
  public com.google.cloud.functions.v2.StorageSource getStorageSource() {
    return storageSource_ == null ? com.google.cloud.functions.v2.StorageSource.getDefaultInstance() : storageSource_;
  }
  /**
   * <pre>
   * The location of the source code in the upload bucket.
   *
   * Once the archive is uploaded using the `upload_url` use this field to
   * set the `function.build_config.source.storage_source`
   * during CreateFunction and UpdateFunction.
   *
   * Generation defaults to 0, as Cloud Storage provides a new generation only
   * upon uploading a new object or version of an object.
   * </pre>
   *
   * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.functions.v2.StorageSourceOrBuilder getStorageSourceOrBuilder() {
    return storageSource_ == null ? com.google.cloud.functions.v2.StorageSource.getDefaultInstance() : storageSource_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uploadUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uploadUrl_);
    }
    if (storageSource_ != null) {
      output.writeMessage(2, getStorageSource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uploadUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uploadUrl_);
    }
    if (storageSource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStorageSource());
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
    if (!(obj instanceof com.google.cloud.functions.v2.GenerateUploadUrlResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v2.GenerateUploadUrlResponse other = (com.google.cloud.functions.v2.GenerateUploadUrlResponse) obj;

    if (!getUploadUrl()
        .equals(other.getUploadUrl())) return false;
    if (hasStorageSource() != other.hasStorageSource()) return false;
    if (hasStorageSource()) {
      if (!getStorageSource()
          .equals(other.getStorageSource())) return false;
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
    hash = (37 * hash) + UPLOAD_URL_FIELD_NUMBER;
    hash = (53 * hash) + getUploadUrl().hashCode();
    if (hasStorageSource()) {
      hash = (37 * hash) + STORAGE_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getStorageSource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.functions.v2.GenerateUploadUrlResponse prototype) {
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
   * Response of `GenerateSourceUploadUrl` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v2.GenerateUploadUrlResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v2.GenerateUploadUrlResponse)
      com.google.cloud.functions.v2.GenerateUploadUrlResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.functions.v2.FunctionsProto.internal_static_google_cloud_functions_v2_GenerateUploadUrlResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v2.FunctionsProto.internal_static_google_cloud_functions_v2_GenerateUploadUrlResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v2.GenerateUploadUrlResponse.class, com.google.cloud.functions.v2.GenerateUploadUrlResponse.Builder.class);
    }

    // Construct using com.google.cloud.functions.v2.GenerateUploadUrlResponse.newBuilder()
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
      uploadUrl_ = "";
      storageSource_ = null;
      if (storageSourceBuilder_ != null) {
        storageSourceBuilder_.dispose();
        storageSourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.functions.v2.FunctionsProto.internal_static_google_cloud_functions_v2_GenerateUploadUrlResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2.GenerateUploadUrlResponse getDefaultInstanceForType() {
      return com.google.cloud.functions.v2.GenerateUploadUrlResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v2.GenerateUploadUrlResponse build() {
      com.google.cloud.functions.v2.GenerateUploadUrlResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2.GenerateUploadUrlResponse buildPartial() {
      com.google.cloud.functions.v2.GenerateUploadUrlResponse result = new com.google.cloud.functions.v2.GenerateUploadUrlResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.functions.v2.GenerateUploadUrlResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uploadUrl_ = uploadUrl_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.storageSource_ = storageSourceBuilder_ == null
            ? storageSource_
            : storageSourceBuilder_.build();
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
      if (other instanceof com.google.cloud.functions.v2.GenerateUploadUrlResponse) {
        return mergeFrom((com.google.cloud.functions.v2.GenerateUploadUrlResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v2.GenerateUploadUrlResponse other) {
      if (other == com.google.cloud.functions.v2.GenerateUploadUrlResponse.getDefaultInstance()) return this;
      if (!other.getUploadUrl().isEmpty()) {
        uploadUrl_ = other.uploadUrl_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasStorageSource()) {
        mergeStorageSource(other.getStorageSource());
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
              uploadUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getStorageSourceFieldBuilder().getBuilder(),
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

    private java.lang.Object uploadUrl_ = "";
    /**
     * <pre>
     * The generated Google Cloud Storage signed URL that should be used for a
     * function source code upload. The uploaded file should be a zip archive
     * which contains a function.
     * </pre>
     *
     * <code>string upload_url = 1;</code>
     * @return The uploadUrl.
     */
    public java.lang.String getUploadUrl() {
      java.lang.Object ref = uploadUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uploadUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The generated Google Cloud Storage signed URL that should be used for a
     * function source code upload. The uploaded file should be a zip archive
     * which contains a function.
     * </pre>
     *
     * <code>string upload_url = 1;</code>
     * @return The bytes for uploadUrl.
     */
    public com.google.protobuf.ByteString
        getUploadUrlBytes() {
      java.lang.Object ref = uploadUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uploadUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The generated Google Cloud Storage signed URL that should be used for a
     * function source code upload. The uploaded file should be a zip archive
     * which contains a function.
     * </pre>
     *
     * <code>string upload_url = 1;</code>
     * @param value The uploadUrl to set.
     * @return This builder for chaining.
     */
    public Builder setUploadUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uploadUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The generated Google Cloud Storage signed URL that should be used for a
     * function source code upload. The uploaded file should be a zip archive
     * which contains a function.
     * </pre>
     *
     * <code>string upload_url = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUploadUrl() {
      uploadUrl_ = getDefaultInstance().getUploadUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The generated Google Cloud Storage signed URL that should be used for a
     * function source code upload. The uploaded file should be a zip archive
     * which contains a function.
     * </pre>
     *
     * <code>string upload_url = 1;</code>
     * @param value The bytes for uploadUrl to set.
     * @return This builder for chaining.
     */
    public Builder setUploadUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uploadUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.functions.v2.StorageSource storageSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.functions.v2.StorageSource, com.google.cloud.functions.v2.StorageSource.Builder, com.google.cloud.functions.v2.StorageSourceOrBuilder> storageSourceBuilder_;
    /**
     * <pre>
     * The location of the source code in the upload bucket.
     *
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     *
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
     * @return Whether the storageSource field is set.
     */
    public boolean hasStorageSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The location of the source code in the upload bucket.
     *
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     *
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
     * @return The storageSource.
     */
    public com.google.cloud.functions.v2.StorageSource getStorageSource() {
      if (storageSourceBuilder_ == null) {
        return storageSource_ == null ? com.google.cloud.functions.v2.StorageSource.getDefaultInstance() : storageSource_;
      } else {
        return storageSourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The location of the source code in the upload bucket.
     *
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     *
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
     */
    public Builder setStorageSource(com.google.cloud.functions.v2.StorageSource value) {
      if (storageSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        storageSource_ = value;
      } else {
        storageSourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location of the source code in the upload bucket.
     *
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     *
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
     */
    public Builder setStorageSource(
        com.google.cloud.functions.v2.StorageSource.Builder builderForValue) {
      if (storageSourceBuilder_ == null) {
        storageSource_ = builderForValue.build();
      } else {
        storageSourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location of the source code in the upload bucket.
     *
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     *
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
     */
    public Builder mergeStorageSource(com.google.cloud.functions.v2.StorageSource value) {
      if (storageSourceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          storageSource_ != null &&
          storageSource_ != com.google.cloud.functions.v2.StorageSource.getDefaultInstance()) {
          getStorageSourceBuilder().mergeFrom(value);
        } else {
          storageSource_ = value;
        }
      } else {
        storageSourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location of the source code in the upload bucket.
     *
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     *
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
     */
    public Builder clearStorageSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      storageSource_ = null;
      if (storageSourceBuilder_ != null) {
        storageSourceBuilder_.dispose();
        storageSourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location of the source code in the upload bucket.
     *
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     *
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
     */
    public com.google.cloud.functions.v2.StorageSource.Builder getStorageSourceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStorageSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The location of the source code in the upload bucket.
     *
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     *
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
     */
    public com.google.cloud.functions.v2.StorageSourceOrBuilder getStorageSourceOrBuilder() {
      if (storageSourceBuilder_ != null) {
        return storageSourceBuilder_.getMessageOrBuilder();
      } else {
        return storageSource_ == null ?
            com.google.cloud.functions.v2.StorageSource.getDefaultInstance() : storageSource_;
      }
    }
    /**
     * <pre>
     * The location of the source code in the upload bucket.
     *
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     *
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.StorageSource storage_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.functions.v2.StorageSource, com.google.cloud.functions.v2.StorageSource.Builder, com.google.cloud.functions.v2.StorageSourceOrBuilder> 
        getStorageSourceFieldBuilder() {
      if (storageSourceBuilder_ == null) {
        storageSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v2.StorageSource, com.google.cloud.functions.v2.StorageSource.Builder, com.google.cloud.functions.v2.StorageSourceOrBuilder>(
                getStorageSource(),
                getParentForChildren(),
                isClean());
        storageSource_ = null;
      }
      return storageSourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v2.GenerateUploadUrlResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v2.GenerateUploadUrlResponse)
  private static final com.google.cloud.functions.v2.GenerateUploadUrlResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v2.GenerateUploadUrlResponse();
  }

  public static com.google.cloud.functions.v2.GenerateUploadUrlResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateUploadUrlResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateUploadUrlResponse>() {
    @java.lang.Override
    public GenerateUploadUrlResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateUploadUrlResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateUploadUrlResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v2.GenerateUploadUrlResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

