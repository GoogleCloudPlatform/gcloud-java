// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/io.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * The Container Registry location for the container image.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ContainerRegistryDestination}
 */
public final class ContainerRegistryDestination extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ContainerRegistryDestination)
    ContainerRegistryDestinationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContainerRegistryDestination.newBuilder() to construct.
  private ContainerRegistryDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContainerRegistryDestination() {
    outputUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContainerRegistryDestination();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_ContainerRegistryDestination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_ContainerRegistryDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination.class, com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination.Builder.class);
  }

  public static final int OUTPUT_URI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object outputUri_ = "";
  /**
   * <pre>
   * Required. Container Registry URI of a container image.
   * Only Google Container Registry and Artifact Registry are supported now.
   * Accepted forms:
   *
   * *  Google Container Registry path. For example:
   *    `gcr.io/projectId/imageName:tag`.
   *
   * *  Artifact Registry path. For example:
   *    `us-central1-docker.pkg.dev/projectId/repoName/imageName:tag`.
   *
   * If a tag is not specified, "latest" will be used as the default tag.
   * </pre>
   *
   * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputUri.
   */
  @java.lang.Override
  public java.lang.String getOutputUri() {
    java.lang.Object ref = outputUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Container Registry URI of a container image.
   * Only Google Container Registry and Artifact Registry are supported now.
   * Accepted forms:
   *
   * *  Google Container Registry path. For example:
   *    `gcr.io/projectId/imageName:tag`.
   *
   * *  Artifact Registry path. For example:
   *    `us-central1-docker.pkg.dev/projectId/repoName/imageName:tag`.
   *
   * If a tag is not specified, "latest" will be used as the default tag.
   * </pre>
   *
   * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for outputUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutputUriBytes() {
    java.lang.Object ref = outputUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outputUri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, outputUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, outputUri_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination other = (com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination) obj;

    if (!getOutputUri()
        .equals(other.getOutputUri())) return false;
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
    hash = (37 * hash) + OUTPUT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getOutputUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination prototype) {
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
   * The Container Registry location for the container image.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ContainerRegistryDestination}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ContainerRegistryDestination)
      com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_ContainerRegistryDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_ContainerRegistryDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination.class, com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination.newBuilder()
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
      outputUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_ContainerRegistryDestination_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination build() {
      com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination result = new com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.outputUri_ = outputUri_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination.getDefaultInstance()) return this;
      if (!other.getOutputUri().isEmpty()) {
        outputUri_ = other.outputUri_;
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
              outputUri_ = input.readStringRequireUtf8();
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

    private java.lang.Object outputUri_ = "";
    /**
     * <pre>
     * Required. Container Registry URI of a container image.
     * Only Google Container Registry and Artifact Registry are supported now.
     * Accepted forms:
     *
     * *  Google Container Registry path. For example:
     *    `gcr.io/projectId/imageName:tag`.
     *
     * *  Artifact Registry path. For example:
     *    `us-central1-docker.pkg.dev/projectId/repoName/imageName:tag`.
     *
     * If a tag is not specified, "latest" will be used as the default tag.
     * </pre>
     *
     * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The outputUri.
     */
    public java.lang.String getOutputUri() {
      java.lang.Object ref = outputUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Container Registry URI of a container image.
     * Only Google Container Registry and Artifact Registry are supported now.
     * Accepted forms:
     *
     * *  Google Container Registry path. For example:
     *    `gcr.io/projectId/imageName:tag`.
     *
     * *  Artifact Registry path. For example:
     *    `us-central1-docker.pkg.dev/projectId/repoName/imageName:tag`.
     *
     * If a tag is not specified, "latest" will be used as the default tag.
     * </pre>
     *
     * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for outputUri.
     */
    public com.google.protobuf.ByteString
        getOutputUriBytes() {
      java.lang.Object ref = outputUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Container Registry URI of a container image.
     * Only Google Container Registry and Artifact Registry are supported now.
     * Accepted forms:
     *
     * *  Google Container Registry path. For example:
     *    `gcr.io/projectId/imageName:tag`.
     *
     * *  Artifact Registry path. For example:
     *    `us-central1-docker.pkg.dev/projectId/repoName/imageName:tag`.
     *
     * If a tag is not specified, "latest" will be used as the default tag.
     * </pre>
     *
     * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The outputUri to set.
     * @return This builder for chaining.
     */
    public Builder setOutputUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      outputUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Container Registry URI of a container image.
     * Only Google Container Registry and Artifact Registry are supported now.
     * Accepted forms:
     *
     * *  Google Container Registry path. For example:
     *    `gcr.io/projectId/imageName:tag`.
     *
     * *  Artifact Registry path. For example:
     *    `us-central1-docker.pkg.dev/projectId/repoName/imageName:tag`.
     *
     * If a tag is not specified, "latest" will be used as the default tag.
     * </pre>
     *
     * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearOutputUri() {
      outputUri_ = getDefaultInstance().getOutputUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Container Registry URI of a container image.
     * Only Google Container Registry and Artifact Registry are supported now.
     * Accepted forms:
     *
     * *  Google Container Registry path. For example:
     *    `gcr.io/projectId/imageName:tag`.
     *
     * *  Artifact Registry path. For example:
     *    `us-central1-docker.pkg.dev/projectId/repoName/imageName:tag`.
     *
     * If a tag is not specified, "latest" will be used as the default tag.
     * </pre>
     *
     * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for outputUri to set.
     * @return This builder for chaining.
     */
    public Builder setOutputUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      outputUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ContainerRegistryDestination)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ContainerRegistryDestination)
  private static final com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination();
  }

  public static com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContainerRegistryDestination>
      PARSER = new com.google.protobuf.AbstractParser<ContainerRegistryDestination>() {
    @java.lang.Override
    public ContainerRegistryDestination parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContainerRegistryDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContainerRegistryDestination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

