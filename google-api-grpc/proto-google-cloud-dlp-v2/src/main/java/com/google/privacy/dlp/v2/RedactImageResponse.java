// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Results of redacting an image.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.RedactImageResponse}
 */
public final class RedactImageResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.RedactImageResponse)
    RedactImageResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RedactImageResponse.newBuilder() to construct.
  private RedactImageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RedactImageResponse() {
    redactedImage_ = com.google.protobuf.ByteString.EMPTY;
    extractedText_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RedactImageResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              redactedImage_ = input.readBytes();
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              extractedText_ = s;
              break;
            }
          case 26:
            {
              com.google.privacy.dlp.v2.InspectResult.Builder subBuilder = null;
              if (inspectResult_ != null) {
                subBuilder = inspectResult_.toBuilder();
              }
              inspectResult_ =
                  input.readMessage(
                      com.google.privacy.dlp.v2.InspectResult.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(inspectResult_);
                inspectResult_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
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
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_RedactImageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_RedactImageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.RedactImageResponse.class,
            com.google.privacy.dlp.v2.RedactImageResponse.Builder.class);
  }

  public static final int REDACTED_IMAGE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString redactedImage_;
  /**
   *
   *
   * <pre>
   * The redacted image. The type will be the same as the original image.
   * </pre>
   *
   * <code>bytes redacted_image = 1;</code>
   */
  public com.google.protobuf.ByteString getRedactedImage() {
    return redactedImage_;
  }

  public static final int EXTRACTED_TEXT_FIELD_NUMBER = 2;
  private volatile java.lang.Object extractedText_;
  /**
   *
   *
   * <pre>
   * If an image was being inspected and the InspectConfig's include_quote was
   * set to true, then this field will include all text, if any, that was found
   * in the image.
   * </pre>
   *
   * <code>string extracted_text = 2;</code>
   */
  public java.lang.String getExtractedText() {
    java.lang.Object ref = extractedText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extractedText_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If an image was being inspected and the InspectConfig's include_quote was
   * set to true, then this field will include all text, if any, that was found
   * in the image.
   * </pre>
   *
   * <code>string extracted_text = 2;</code>
   */
  public com.google.protobuf.ByteString getExtractedTextBytes() {
    java.lang.Object ref = extractedText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      extractedText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSPECT_RESULT_FIELD_NUMBER = 3;
  private com.google.privacy.dlp.v2.InspectResult inspectResult_;
  /**
   *
   *
   * <pre>
   * The findings. Populated when include_findings in the request is true.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
   */
  public boolean hasInspectResult() {
    return inspectResult_ != null;
  }
  /**
   *
   *
   * <pre>
   * The findings. Populated when include_findings in the request is true.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
   */
  public com.google.privacy.dlp.v2.InspectResult getInspectResult() {
    return inspectResult_ == null
        ? com.google.privacy.dlp.v2.InspectResult.getDefaultInstance()
        : inspectResult_;
  }
  /**
   *
   *
   * <pre>
   * The findings. Populated when include_findings in the request is true.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
   */
  public com.google.privacy.dlp.v2.InspectResultOrBuilder getInspectResultOrBuilder() {
    return getInspectResult();
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
    if (!redactedImage_.isEmpty()) {
      output.writeBytes(1, redactedImage_);
    }
    if (!getExtractedTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, extractedText_);
    }
    if (inspectResult_ != null) {
      output.writeMessage(3, getInspectResult());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!redactedImage_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, redactedImage_);
    }
    if (!getExtractedTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, extractedText_);
    }
    if (inspectResult_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getInspectResult());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.RedactImageResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.RedactImageResponse other =
        (com.google.privacy.dlp.v2.RedactImageResponse) obj;

    boolean result = true;
    result = result && getRedactedImage().equals(other.getRedactedImage());
    result = result && getExtractedText().equals(other.getExtractedText());
    result = result && (hasInspectResult() == other.hasInspectResult());
    if (hasInspectResult()) {
      result = result && getInspectResult().equals(other.getInspectResult());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REDACTED_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getRedactedImage().hashCode();
    hash = (37 * hash) + EXTRACTED_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getExtractedText().hashCode();
    if (hasInspectResult()) {
      hash = (37 * hash) + INSPECT_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getInspectResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.RedactImageResponse prototype) {
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
   * Results of redacting an image.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.RedactImageResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.RedactImageResponse)
      com.google.privacy.dlp.v2.RedactImageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_RedactImageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_RedactImageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.RedactImageResponse.class,
              com.google.privacy.dlp.v2.RedactImageResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.RedactImageResponse.newBuilder()
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
      redactedImage_ = com.google.protobuf.ByteString.EMPTY;

      extractedText_ = "";

      if (inspectResultBuilder_ == null) {
        inspectResult_ = null;
      } else {
        inspectResult_ = null;
        inspectResultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_RedactImageResponse_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RedactImageResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.RedactImageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RedactImageResponse build() {
      com.google.privacy.dlp.v2.RedactImageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RedactImageResponse buildPartial() {
      com.google.privacy.dlp.v2.RedactImageResponse result =
          new com.google.privacy.dlp.v2.RedactImageResponse(this);
      result.redactedImage_ = redactedImage_;
      result.extractedText_ = extractedText_;
      if (inspectResultBuilder_ == null) {
        result.inspectResult_ = inspectResult_;
      } else {
        result.inspectResult_ = inspectResultBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2.RedactImageResponse) {
        return mergeFrom((com.google.privacy.dlp.v2.RedactImageResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.RedactImageResponse other) {
      if (other == com.google.privacy.dlp.v2.RedactImageResponse.getDefaultInstance()) return this;
      if (other.getRedactedImage() != com.google.protobuf.ByteString.EMPTY) {
        setRedactedImage(other.getRedactedImage());
      }
      if (!other.getExtractedText().isEmpty()) {
        extractedText_ = other.extractedText_;
        onChanged();
      }
      if (other.hasInspectResult()) {
        mergeInspectResult(other.getInspectResult());
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
      com.google.privacy.dlp.v2.RedactImageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.RedactImageResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString redactedImage_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The redacted image. The type will be the same as the original image.
     * </pre>
     *
     * <code>bytes redacted_image = 1;</code>
     */
    public com.google.protobuf.ByteString getRedactedImage() {
      return redactedImage_;
    }
    /**
     *
     *
     * <pre>
     * The redacted image. The type will be the same as the original image.
     * </pre>
     *
     * <code>bytes redacted_image = 1;</code>
     */
    public Builder setRedactedImage(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      redactedImage_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The redacted image. The type will be the same as the original image.
     * </pre>
     *
     * <code>bytes redacted_image = 1;</code>
     */
    public Builder clearRedactedImage() {

      redactedImage_ = getDefaultInstance().getRedactedImage();
      onChanged();
      return this;
    }

    private java.lang.Object extractedText_ = "";
    /**
     *
     *
     * <pre>
     * If an image was being inspected and the InspectConfig's include_quote was
     * set to true, then this field will include all text, if any, that was found
     * in the image.
     * </pre>
     *
     * <code>string extracted_text = 2;</code>
     */
    public java.lang.String getExtractedText() {
      java.lang.Object ref = extractedText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extractedText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If an image was being inspected and the InspectConfig's include_quote was
     * set to true, then this field will include all text, if any, that was found
     * in the image.
     * </pre>
     *
     * <code>string extracted_text = 2;</code>
     */
    public com.google.protobuf.ByteString getExtractedTextBytes() {
      java.lang.Object ref = extractedText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        extractedText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If an image was being inspected and the InspectConfig's include_quote was
     * set to true, then this field will include all text, if any, that was found
     * in the image.
     * </pre>
     *
     * <code>string extracted_text = 2;</code>
     */
    public Builder setExtractedText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      extractedText_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If an image was being inspected and the InspectConfig's include_quote was
     * set to true, then this field will include all text, if any, that was found
     * in the image.
     * </pre>
     *
     * <code>string extracted_text = 2;</code>
     */
    public Builder clearExtractedText() {

      extractedText_ = getDefaultInstance().getExtractedText();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If an image was being inspected and the InspectConfig's include_quote was
     * set to true, then this field will include all text, if any, that was found
     * in the image.
     * </pre>
     *
     * <code>string extracted_text = 2;</code>
     */
    public Builder setExtractedTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      extractedText_ = value;
      onChanged();
      return this;
    }

    private com.google.privacy.dlp.v2.InspectResult inspectResult_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.InspectResult,
            com.google.privacy.dlp.v2.InspectResult.Builder,
            com.google.privacy.dlp.v2.InspectResultOrBuilder>
        inspectResultBuilder_;
    /**
     *
     *
     * <pre>
     * The findings. Populated when include_findings in the request is true.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
     */
    public boolean hasInspectResult() {
      return inspectResultBuilder_ != null || inspectResult_ != null;
    }
    /**
     *
     *
     * <pre>
     * The findings. Populated when include_findings in the request is true.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
     */
    public com.google.privacy.dlp.v2.InspectResult getInspectResult() {
      if (inspectResultBuilder_ == null) {
        return inspectResult_ == null
            ? com.google.privacy.dlp.v2.InspectResult.getDefaultInstance()
            : inspectResult_;
      } else {
        return inspectResultBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The findings. Populated when include_findings in the request is true.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
     */
    public Builder setInspectResult(com.google.privacy.dlp.v2.InspectResult value) {
      if (inspectResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inspectResult_ = value;
        onChanged();
      } else {
        inspectResultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The findings. Populated when include_findings in the request is true.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
     */
    public Builder setInspectResult(
        com.google.privacy.dlp.v2.InspectResult.Builder builderForValue) {
      if (inspectResultBuilder_ == null) {
        inspectResult_ = builderForValue.build();
        onChanged();
      } else {
        inspectResultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The findings. Populated when include_findings in the request is true.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
     */
    public Builder mergeInspectResult(com.google.privacy.dlp.v2.InspectResult value) {
      if (inspectResultBuilder_ == null) {
        if (inspectResult_ != null) {
          inspectResult_ =
              com.google.privacy.dlp.v2.InspectResult.newBuilder(inspectResult_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          inspectResult_ = value;
        }
        onChanged();
      } else {
        inspectResultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The findings. Populated when include_findings in the request is true.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
     */
    public Builder clearInspectResult() {
      if (inspectResultBuilder_ == null) {
        inspectResult_ = null;
        onChanged();
      } else {
        inspectResult_ = null;
        inspectResultBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The findings. Populated when include_findings in the request is true.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
     */
    public com.google.privacy.dlp.v2.InspectResult.Builder getInspectResultBuilder() {

      onChanged();
      return getInspectResultFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The findings. Populated when include_findings in the request is true.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
     */
    public com.google.privacy.dlp.v2.InspectResultOrBuilder getInspectResultOrBuilder() {
      if (inspectResultBuilder_ != null) {
        return inspectResultBuilder_.getMessageOrBuilder();
      } else {
        return inspectResult_ == null
            ? com.google.privacy.dlp.v2.InspectResult.getDefaultInstance()
            : inspectResult_;
      }
    }
    /**
     *
     *
     * <pre>
     * The findings. Populated when include_findings in the request is true.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.InspectResult,
            com.google.privacy.dlp.v2.InspectResult.Builder,
            com.google.privacy.dlp.v2.InspectResultOrBuilder>
        getInspectResultFieldBuilder() {
      if (inspectResultBuilder_ == null) {
        inspectResultBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.InspectResult,
                com.google.privacy.dlp.v2.InspectResult.Builder,
                com.google.privacy.dlp.v2.InspectResultOrBuilder>(
                getInspectResult(), getParentForChildren(), isClean());
        inspectResult_ = null;
      }
      return inspectResultBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.RedactImageResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.RedactImageResponse)
  private static final com.google.privacy.dlp.v2.RedactImageResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.RedactImageResponse();
  }

  public static com.google.privacy.dlp.v2.RedactImageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RedactImageResponse> PARSER =
      new com.google.protobuf.AbstractParser<RedactImageResponse>() {
        @java.lang.Override
        public RedactImageResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RedactImageResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RedactImageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RedactImageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.RedactImageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
