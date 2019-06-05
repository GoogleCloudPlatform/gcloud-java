// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/build/build.proto

package io.grafeas.v1beta1.build;

/**
 *
 *
 * <pre>
 * Note holding the version of the provider's builder and the signature of the
 * provenance message in linked BuildDetails.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.build.Build}
 */
public final class Build extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.build.Build)
    BuildOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Build.newBuilder() to construct.
  private Build(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Build() {
    builderVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Build();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Build(
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
              java.lang.String s = input.readStringRequireUtf8();

              builderVersion_ = s;
              break;
            }
          case 18:
            {
              io.grafeas.v1beta1.build.BuildSignature.Builder subBuilder = null;
              if (signature_ != null) {
                subBuilder = signature_.toBuilder();
              }
              signature_ =
                  input.readMessage(
                      io.grafeas.v1beta1.build.BuildSignature.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(signature_);
                signature_ = subBuilder.buildPartial();
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
    return io.grafeas.v1beta1.build.BuildOuterClass
        .internal_static_grafeas_v1beta1_build_Build_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.build.BuildOuterClass
        .internal_static_grafeas_v1beta1_build_Build_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.build.Build.class, io.grafeas.v1beta1.build.Build.Builder.class);
  }

  public static final int BUILDER_VERSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object builderVersion_;
  /**
   *
   *
   * <pre>
   * Version of the builder which produced this Note.
   * </pre>
   *
   * <code>string builder_version = 1;</code>
   */
  public java.lang.String getBuilderVersion() {
    java.lang.Object ref = builderVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      builderVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Version of the builder which produced this Note.
   * </pre>
   *
   * <code>string builder_version = 1;</code>
   */
  public com.google.protobuf.ByteString getBuilderVersionBytes() {
    java.lang.Object ref = builderVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      builderVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  private io.grafeas.v1beta1.build.BuildSignature signature_;
  /**
   *
   *
   * <pre>
   * Signature of the build in Occurrences pointing to the Note containing this
   * `BuilderDetails`.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
   */
  public boolean hasSignature() {
    return signature_ != null;
  }
  /**
   *
   *
   * <pre>
   * Signature of the build in Occurrences pointing to the Note containing this
   * `BuilderDetails`.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
   */
  public io.grafeas.v1beta1.build.BuildSignature getSignature() {
    return signature_ == null
        ? io.grafeas.v1beta1.build.BuildSignature.getDefaultInstance()
        : signature_;
  }
  /**
   *
   *
   * <pre>
   * Signature of the build in Occurrences pointing to the Note containing this
   * `BuilderDetails`.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
   */
  public io.grafeas.v1beta1.build.BuildSignatureOrBuilder getSignatureOrBuilder() {
    return getSignature();
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
    if (!getBuilderVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, builderVersion_);
    }
    if (signature_ != null) {
      output.writeMessage(2, getSignature());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBuilderVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, builderVersion_);
    }
    if (signature_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSignature());
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
    if (!(obj instanceof io.grafeas.v1beta1.build.Build)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.build.Build other = (io.grafeas.v1beta1.build.Build) obj;

    if (!getBuilderVersion().equals(other.getBuilderVersion())) return false;
    if (hasSignature() != other.hasSignature()) return false;
    if (hasSignature()) {
      if (!getSignature().equals(other.getSignature())) return false;
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
    hash = (37 * hash) + BUILDER_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getBuilderVersion().hashCode();
    if (hasSignature()) {
      hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
      hash = (53 * hash) + getSignature().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.build.Build parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.build.Build parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.build.Build parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.build.Build parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.build.Build parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.build.Build parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.build.Build parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.build.Build parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.build.Build parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.build.Build parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.build.Build parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.build.Build parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.build.Build prototype) {
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
   * Note holding the version of the provider's builder and the signature of the
   * provenance message in linked BuildDetails.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.build.Build}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.build.Build)
      io.grafeas.v1beta1.build.BuildOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.build.BuildOuterClass
          .internal_static_grafeas_v1beta1_build_Build_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.build.BuildOuterClass
          .internal_static_grafeas_v1beta1_build_Build_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.build.Build.class, io.grafeas.v1beta1.build.Build.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.build.Build.newBuilder()
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
      builderVersion_ = "";

      if (signatureBuilder_ == null) {
        signature_ = null;
      } else {
        signature_ = null;
        signatureBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.build.BuildOuterClass
          .internal_static_grafeas_v1beta1_build_Build_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.build.Build getDefaultInstanceForType() {
      return io.grafeas.v1beta1.build.Build.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.build.Build build() {
      io.grafeas.v1beta1.build.Build result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.build.Build buildPartial() {
      io.grafeas.v1beta1.build.Build result = new io.grafeas.v1beta1.build.Build(this);
      result.builderVersion_ = builderVersion_;
      if (signatureBuilder_ == null) {
        result.signature_ = signature_;
      } else {
        result.signature_ = signatureBuilder_.build();
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
      if (other instanceof io.grafeas.v1beta1.build.Build) {
        return mergeFrom((io.grafeas.v1beta1.build.Build) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.build.Build other) {
      if (other == io.grafeas.v1beta1.build.Build.getDefaultInstance()) return this;
      if (!other.getBuilderVersion().isEmpty()) {
        builderVersion_ = other.builderVersion_;
        onChanged();
      }
      if (other.hasSignature()) {
        mergeSignature(other.getSignature());
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
      io.grafeas.v1beta1.build.Build parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.build.Build) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object builderVersion_ = "";
    /**
     *
     *
     * <pre>
     * Version of the builder which produced this Note.
     * </pre>
     *
     * <code>string builder_version = 1;</code>
     */
    public java.lang.String getBuilderVersion() {
      java.lang.Object ref = builderVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        builderVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Version of the builder which produced this Note.
     * </pre>
     *
     * <code>string builder_version = 1;</code>
     */
    public com.google.protobuf.ByteString getBuilderVersionBytes() {
      java.lang.Object ref = builderVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        builderVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Version of the builder which produced this Note.
     * </pre>
     *
     * <code>string builder_version = 1;</code>
     */
    public Builder setBuilderVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      builderVersion_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Version of the builder which produced this Note.
     * </pre>
     *
     * <code>string builder_version = 1;</code>
     */
    public Builder clearBuilderVersion() {

      builderVersion_ = getDefaultInstance().getBuilderVersion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Version of the builder which produced this Note.
     * </pre>
     *
     * <code>string builder_version = 1;</code>
     */
    public Builder setBuilderVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      builderVersion_ = value;
      onChanged();
      return this;
    }

    private io.grafeas.v1beta1.build.BuildSignature signature_;
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.build.BuildSignature,
            io.grafeas.v1beta1.build.BuildSignature.Builder,
            io.grafeas.v1beta1.build.BuildSignatureOrBuilder>
        signatureBuilder_;
    /**
     *
     *
     * <pre>
     * Signature of the build in Occurrences pointing to the Note containing this
     * `BuilderDetails`.
     * </pre>
     *
     * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
     */
    public boolean hasSignature() {
      return signatureBuilder_ != null || signature_ != null;
    }
    /**
     *
     *
     * <pre>
     * Signature of the build in Occurrences pointing to the Note containing this
     * `BuilderDetails`.
     * </pre>
     *
     * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
     */
    public io.grafeas.v1beta1.build.BuildSignature getSignature() {
      if (signatureBuilder_ == null) {
        return signature_ == null
            ? io.grafeas.v1beta1.build.BuildSignature.getDefaultInstance()
            : signature_;
      } else {
        return signatureBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Signature of the build in Occurrences pointing to the Note containing this
     * `BuilderDetails`.
     * </pre>
     *
     * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
     */
    public Builder setSignature(io.grafeas.v1beta1.build.BuildSignature value) {
      if (signatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        signature_ = value;
        onChanged();
      } else {
        signatureBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Signature of the build in Occurrences pointing to the Note containing this
     * `BuilderDetails`.
     * </pre>
     *
     * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
     */
    public Builder setSignature(io.grafeas.v1beta1.build.BuildSignature.Builder builderForValue) {
      if (signatureBuilder_ == null) {
        signature_ = builderForValue.build();
        onChanged();
      } else {
        signatureBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Signature of the build in Occurrences pointing to the Note containing this
     * `BuilderDetails`.
     * </pre>
     *
     * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
     */
    public Builder mergeSignature(io.grafeas.v1beta1.build.BuildSignature value) {
      if (signatureBuilder_ == null) {
        if (signature_ != null) {
          signature_ =
              io.grafeas.v1beta1.build.BuildSignature.newBuilder(signature_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          signature_ = value;
        }
        onChanged();
      } else {
        signatureBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Signature of the build in Occurrences pointing to the Note containing this
     * `BuilderDetails`.
     * </pre>
     *
     * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
     */
    public Builder clearSignature() {
      if (signatureBuilder_ == null) {
        signature_ = null;
        onChanged();
      } else {
        signature_ = null;
        signatureBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Signature of the build in Occurrences pointing to the Note containing this
     * `BuilderDetails`.
     * </pre>
     *
     * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
     */
    public io.grafeas.v1beta1.build.BuildSignature.Builder getSignatureBuilder() {

      onChanged();
      return getSignatureFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Signature of the build in Occurrences pointing to the Note containing this
     * `BuilderDetails`.
     * </pre>
     *
     * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
     */
    public io.grafeas.v1beta1.build.BuildSignatureOrBuilder getSignatureOrBuilder() {
      if (signatureBuilder_ != null) {
        return signatureBuilder_.getMessageOrBuilder();
      } else {
        return signature_ == null
            ? io.grafeas.v1beta1.build.BuildSignature.getDefaultInstance()
            : signature_;
      }
    }
    /**
     *
     *
     * <pre>
     * Signature of the build in Occurrences pointing to the Note containing this
     * `BuilderDetails`.
     * </pre>
     *
     * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.build.BuildSignature,
            io.grafeas.v1beta1.build.BuildSignature.Builder,
            io.grafeas.v1beta1.build.BuildSignatureOrBuilder>
        getSignatureFieldBuilder() {
      if (signatureBuilder_ == null) {
        signatureBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1beta1.build.BuildSignature,
                io.grafeas.v1beta1.build.BuildSignature.Builder,
                io.grafeas.v1beta1.build.BuildSignatureOrBuilder>(
                getSignature(), getParentForChildren(), isClean());
        signature_ = null;
      }
      return signatureBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.build.Build)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.build.Build)
  private static final io.grafeas.v1beta1.build.Build DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.build.Build();
  }

  public static io.grafeas.v1beta1.build.Build getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Build> PARSER =
      new com.google.protobuf.AbstractParser<Build>() {
        @java.lang.Override
        public Build parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Build(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Build> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Build> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.build.Build getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
