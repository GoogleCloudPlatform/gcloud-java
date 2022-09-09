// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/apt_artifact.proto

package com.google.devtools.artifactregistry.v1beta2;

/**
 * <pre>
 * The request to import new apt artifacts.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest}
 */
public final class ImportAptArtifactsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest)
    ImportAptArtifactsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportAptArtifactsRequest.newBuilder() to construct.
  private ImportAptArtifactsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportAptArtifactsRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportAptArtifactsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImportAptArtifactsRequest(
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

            parent_ = s;
            break;
          }
          case 18: {
            com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.Builder subBuilder = null;
            if (sourceCase_ == 2) {
              subBuilder = ((com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource) source_).toBuilder();
            }
            source_ =
                input.readMessage(com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource) source_);
              source_ = subBuilder.buildPartial();
            }
            sourceCase_ = 2;
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
    return com.google.devtools.artifactregistry.v1beta2.AptArtifactProto.internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1beta2.AptArtifactProto.internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest.class, com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;
  public enum SourceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_SOURCE(2),
    SOURCE_NOT_SET(0);
    private final int value;
    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 2: return GCS_SOURCE;
        case 0: return SOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase
  getSourceCase() {
    return SourceCase.forNumber(
        sourceCase_);
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Google Cloud Storage location where input content is located.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
   * @return Whether the gcsSource field is set.
   */
  @java.lang.Override
  public boolean hasGcsSource() {
    return sourceCase_ == 2;
  }
  /**
   * <pre>
   * Google Cloud Storage location where input content is located.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
   * @return The gcsSource.
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource getGcsSource() {
    if (sourceCase_ == 2) {
       return (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource) source_;
    }
    return com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.getDefaultInstance();
  }
  /**
   * <pre>
   * Google Cloud Storage location where input content is located.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSourceOrBuilder getGcsSourceOrBuilder() {
    if (sourceCase_ == 2) {
       return (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource) source_;
    }
    return com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.getDefaultInstance();
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The name of the parent resource where the artifacts will be imported.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the parent resource where the artifacts will be imported.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (sourceCase_ == 2) {
      output.writeMessage(2, (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource) source_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (sourceCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource) source_);
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest other = (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 2:
        if (!getGcsSource()
            .equals(other.getGcsSource())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    switch (sourceCase_) {
      case 2:
        hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getGcsSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest prototype) {
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
   * The request to import new apt artifacts.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest)
      com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.artifactregistry.v1beta2.AptArtifactProto.internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1beta2.AptArtifactProto.internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest.class, com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest.newBuilder()
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
      parent_ = "";

      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1beta2.AptArtifactProto.internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest build() {
      com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest buildPartial() {
      com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest result = new com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest(this);
      if (sourceCase_ == 2) {
        if (gcsSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = gcsSourceBuilder_.build();
        }
      }
      result.parent_ = parent_;
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest) {
        return mergeFrom((com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest other) {
      if (other == com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      switch (other.getSourceCase()) {
        case GCS_SOURCE: {
          mergeGcsSource(other.getGcsSource());
          break;
        }
        case SOURCE_NOT_SET: {
          break;
        }
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
      com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int sourceCase_ = 0;
    private java.lang.Object source_;
    public SourceCase
        getSourceCase() {
      return SourceCase.forNumber(
          sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource, com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.Builder, com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSourceOrBuilder> gcsSourceBuilder_;
    /**
     * <pre>
     * Google Cloud Storage location where input content is located.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
     * @return Whether the gcsSource field is set.
     */
    @java.lang.Override
    public boolean hasGcsSource() {
      return sourceCase_ == 2;
    }
    /**
     * <pre>
     * Google Cloud Storage location where input content is located.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
     * @return The gcsSource.
     */
    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 2) {
          return (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource) source_;
        }
        return com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 2) {
          return gcsSourceBuilder_.getMessage();
        }
        return com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Google Cloud Storage location where input content is located.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
     */
    public Builder setGcsSource(com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage location where input content is located.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
     */
    public Builder setGcsSource(
        com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage location where input content is located.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
     */
    public Builder mergeGcsSource(com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 2 &&
            source_ != com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.getDefaultInstance()) {
          source_ = com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.newBuilder((com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 2) {
          gcsSourceBuilder_.mergeFrom(value);
        } else {
          gcsSourceBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage location where input content is located.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
        }
        gcsSourceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage location where input content is located.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.Builder getGcsSourceBuilder() {
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Google Cloud Storage location where input content is located.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
     */
    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSourceOrBuilder getGcsSourceOrBuilder() {
      if ((sourceCase_ == 2) && (gcsSourceBuilder_ != null)) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 2) {
          return (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource) source_;
        }
        return com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Google Cloud Storage location where input content is located.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource, com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.Builder, com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSourceOrBuilder> 
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        if (!(sourceCase_ == 2)) {
          source_ = com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.getDefaultInstance();
        }
        gcsSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource, com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource.Builder, com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSourceOrBuilder>(
                (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 2;
      onChanged();;
      return gcsSourceBuilder_;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The name of the parent resource where the artifacts will be imported.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the parent resource where the artifacts will be imported.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the parent resource where the artifacts will be imported.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the parent resource where the artifacts will be imported.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the parent resource where the artifacts will be imported.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest)
  private static final com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest();
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportAptArtifactsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImportAptArtifactsRequest>() {
    @java.lang.Override
    public ImportAptArtifactsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImportAptArtifactsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImportAptArtifactsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportAptArtifactsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

