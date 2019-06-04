// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

/**
 *
 *
 * <pre>
 * The desired input location and metadata.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.InputConfig}
 */
public final class InputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.InputConfig)
    InputConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InputConfig.newBuilder() to construct.
  private InputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InputConfig() {
    content_ = com.google.protobuf.ByteString.EMPTY;
    mimeType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InputConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InputConfig(
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
              com.google.cloud.vision.v1.GcsSource.Builder subBuilder = null;
              if (gcsSource_ != null) {
                subBuilder = gcsSource_.toBuilder();
              }
              gcsSource_ =
                  input.readMessage(
                      com.google.cloud.vision.v1.GcsSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gcsSource_);
                gcsSource_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              mimeType_ = s;
              break;
            }
          case 26:
            {
              content_ = input.readBytes();
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
    return com.google.cloud.vision.v1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1_InputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1_InputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.InputConfig.class,
            com.google.cloud.vision.v1.InputConfig.Builder.class);
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1.GcsSource gcsSource_;
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
   */
  public boolean hasGcsSource() {
    return gcsSource_ != null;
  }
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
   */
  public com.google.cloud.vision.v1.GcsSource getGcsSource() {
    return gcsSource_ == null
        ? com.google.cloud.vision.v1.GcsSource.getDefaultInstance()
        : gcsSource_;
  }
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
   */
  public com.google.cloud.vision.v1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    return getGcsSource();
  }

  public static final int CONTENT_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString content_;
  /**
   *
   *
   * <pre>
   * File content, represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   * Currently, this field only works for BatchAnnotateFiles requests. It does
   * not work for AsyncBatchAnnotateFiles requests.
   * </pre>
   *
   * <code>bytes content = 3;</code>
   */
  public com.google.protobuf.ByteString getContent() {
    return content_;
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object mimeType_;
  /**
   *
   *
   * <pre>
   * The type of the file. Currently only "application/pdf", "image/tiff" and
   * "image/gif" are supported. Wildcards are not supported.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   */
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The type of the file. Currently only "application/pdf", "image/tiff" and
   * "image/gif" are supported. Wildcards are not supported.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   */
  public com.google.protobuf.ByteString getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mimeType_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (gcsSource_ != null) {
      output.writeMessage(1, getGcsSource());
    }
    if (!getMimeTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mimeType_);
    }
    if (!content_.isEmpty()) {
      output.writeBytes(3, content_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gcsSource_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGcsSource());
    }
    if (!getMimeTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mimeType_);
    }
    if (!content_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, content_);
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
    if (!(obj instanceof com.google.cloud.vision.v1.InputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.InputConfig other = (com.google.cloud.vision.v1.InputConfig) obj;

    if (hasGcsSource() != other.hasGcsSource()) return false;
    if (hasGcsSource()) {
      if (!getGcsSource().equals(other.getGcsSource())) return false;
    }
    if (!getContent().equals(other.getContent())) return false;
    if (!getMimeType().equals(other.getMimeType())) return false;
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
    if (hasGcsSource()) {
      hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getGcsSource().hashCode();
    }
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.InputConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.InputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.InputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.InputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.InputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.InputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.InputConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.InputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.InputConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.InputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.InputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.InputConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vision.v1.InputConfig prototype) {
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
   * The desired input location and metadata.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.InputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.InputConfig)
      com.google.cloud.vision.v1.InputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_InputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_InputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.InputConfig.class,
              com.google.cloud.vision.v1.InputConfig.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.InputConfig.newBuilder()
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
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = null;
      } else {
        gcsSource_ = null;
        gcsSourceBuilder_ = null;
      }
      content_ = com.google.protobuf.ByteString.EMPTY;

      mimeType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_InputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.InputConfig getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.InputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.InputConfig build() {
      com.google.cloud.vision.v1.InputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.InputConfig buildPartial() {
      com.google.cloud.vision.v1.InputConfig result =
          new com.google.cloud.vision.v1.InputConfig(this);
      if (gcsSourceBuilder_ == null) {
        result.gcsSource_ = gcsSource_;
      } else {
        result.gcsSource_ = gcsSourceBuilder_.build();
      }
      result.content_ = content_;
      result.mimeType_ = mimeType_;
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
      if (other instanceof com.google.cloud.vision.v1.InputConfig) {
        return mergeFrom((com.google.cloud.vision.v1.InputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.InputConfig other) {
      if (other == com.google.cloud.vision.v1.InputConfig.getDefaultInstance()) return this;
      if (other.hasGcsSource()) {
        mergeGcsSource(other.getGcsSource());
      }
      if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
        setContent(other.getContent());
      }
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
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
      com.google.cloud.vision.v1.InputConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1.InputConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.vision.v1.GcsSource gcsSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.GcsSource,
            com.google.cloud.vision.v1.GcsSource.Builder,
            com.google.cloud.vision.v1.GcsSourceOrBuilder>
        gcsSourceBuilder_;
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
     */
    public boolean hasGcsSource() {
      return gcsSourceBuilder_ != null || gcsSource_ != null;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.vision.v1.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        return gcsSource_ == null
            ? com.google.cloud.vision.v1.GcsSource.getDefaultInstance()
            : gcsSource_;
      } else {
        return gcsSourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.vision.v1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcsSource_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.vision.v1.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder mergeGcsSource(com.google.cloud.vision.v1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (gcsSource_ != null) {
          gcsSource_ =
              com.google.cloud.vision.v1.GcsSource.newBuilder(gcsSource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          gcsSource_ = value;
        }
        onChanged();
      } else {
        gcsSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = null;
        onChanged();
      } else {
        gcsSource_ = null;
        gcsSourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.vision.v1.GcsSource.Builder getGcsSourceBuilder() {

      onChanged();
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.vision.v1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if (gcsSourceBuilder_ != null) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        return gcsSource_ == null
            ? com.google.cloud.vision.v1.GcsSource.getDefaultInstance()
            : gcsSource_;
      }
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.GcsSource,
            com.google.cloud.vision.v1.GcsSource.Builder,
            com.google.cloud.vision.v1.GcsSourceOrBuilder>
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        gcsSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1.GcsSource,
                com.google.cloud.vision.v1.GcsSource.Builder,
                com.google.cloud.vision.v1.GcsSourceOrBuilder>(
                getGcsSource(), getParentForChildren(), isClean());
        gcsSource_ = null;
      }
      return gcsSourceBuilder_;
    }

    private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * File content, represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * Currently, this field only works for BatchAnnotateFiles requests. It does
     * not work for AsyncBatchAnnotateFiles requests.
     * </pre>
     *
     * <code>bytes content = 3;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }
    /**
     *
     *
     * <pre>
     * File content, represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * Currently, this field only works for BatchAnnotateFiles requests. It does
     * not work for AsyncBatchAnnotateFiles requests.
     * </pre>
     *
     * <code>bytes content = 3;</code>
     */
    public Builder setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      content_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * File content, represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * Currently, this field only works for BatchAnnotateFiles requests. It does
     * not work for AsyncBatchAnnotateFiles requests.
     * </pre>
     *
     * <code>bytes content = 3;</code>
     */
    public Builder clearContent() {

      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     *
     *
     * <pre>
     * The type of the file. Currently only "application/pdf", "image/tiff" and
     * "image/gif" are supported. Wildcards are not supported.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The type of the file. Currently only "application/pdf", "image/tiff" and
     * "image/gif" are supported. Wildcards are not supported.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     */
    public com.google.protobuf.ByteString getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The type of the file. Currently only "application/pdf", "image/tiff" and
     * "image/gif" are supported. Wildcards are not supported.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     */
    public Builder setMimeType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      mimeType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of the file. Currently only "application/pdf", "image/tiff" and
     * "image/gif" are supported. Wildcards are not supported.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     */
    public Builder clearMimeType() {

      mimeType_ = getDefaultInstance().getMimeType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of the file. Currently only "application/pdf", "image/tiff" and
     * "image/gif" are supported. Wildcards are not supported.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     */
    public Builder setMimeTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      mimeType_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.InputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.InputConfig)
  private static final com.google.cloud.vision.v1.InputConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.InputConfig();
  }

  public static com.google.cloud.vision.v1.InputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InputConfig> PARSER =
      new com.google.protobuf.AbstractParser<InputConfig>() {
        @java.lang.Override
        public InputConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InputConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1.InputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
