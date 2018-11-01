// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/deployment/deployment.proto

package io.grafeas.v1beta1.deployment;

/**
 * <pre>
 * An artifact that can be deployed in some runtime.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.deployment.Deployable}
 */
public  final class Deployable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.deployment.Deployable)
    DeployableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Deployable.newBuilder() to construct.
  private Deployable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Deployable() {
    resourceUri_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Deployable(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              resourceUri_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            resourceUri_.add(s);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        resourceUri_ = resourceUri_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1beta1.deployment.DeploymentOuterClass.internal_static_grafeas_v1beta1_deployment_Deployable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.deployment.DeploymentOuterClass.internal_static_grafeas_v1beta1_deployment_Deployable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.deployment.Deployable.class, io.grafeas.v1beta1.deployment.Deployable.Builder.class);
  }

  public static final int RESOURCE_URI_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList resourceUri_;
  /**
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getResourceUriList() {
    return resourceUri_;
  }
  /**
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   */
  public int getResourceUriCount() {
    return resourceUri_.size();
  }
  /**
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   */
  public java.lang.String getResourceUri(int index) {
    return resourceUri_.get(index);
  }
  /**
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceUriBytes(int index) {
    return resourceUri_.getByteString(index);
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
    for (int i = 0; i < resourceUri_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceUri_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < resourceUri_.size(); i++) {
        dataSize += computeStringSizeNoTag(resourceUri_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getResourceUriList().size();
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
    if (!(obj instanceof io.grafeas.v1beta1.deployment.Deployable)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.deployment.Deployable other = (io.grafeas.v1beta1.deployment.Deployable) obj;

    boolean result = true;
    result = result && getResourceUriList()
        .equals(other.getResourceUriList());
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
    if (getResourceUriCount() > 0) {
      hash = (37 * hash) + RESOURCE_URI_FIELD_NUMBER;
      hash = (53 * hash) + getResourceUriList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
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
  public static Builder newBuilder(io.grafeas.v1beta1.deployment.Deployable prototype) {
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
   * An artifact that can be deployed in some runtime.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.deployment.Deployable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.deployment.Deployable)
      io.grafeas.v1beta1.deployment.DeployableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1beta1.deployment.DeploymentOuterClass.internal_static_grafeas_v1beta1_deployment_Deployable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.deployment.DeploymentOuterClass.internal_static_grafeas_v1beta1_deployment_Deployable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.deployment.Deployable.class, io.grafeas.v1beta1.deployment.Deployable.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.deployment.Deployable.newBuilder()
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
      resourceUri_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1beta1.deployment.DeploymentOuterClass.internal_static_grafeas_v1beta1_deployment_Deployable_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.deployment.Deployable getDefaultInstanceForType() {
      return io.grafeas.v1beta1.deployment.Deployable.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.deployment.Deployable build() {
      io.grafeas.v1beta1.deployment.Deployable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.deployment.Deployable buildPartial() {
      io.grafeas.v1beta1.deployment.Deployable result = new io.grafeas.v1beta1.deployment.Deployable(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        resourceUri_ = resourceUri_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.resourceUri_ = resourceUri_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.deployment.Deployable) {
        return mergeFrom((io.grafeas.v1beta1.deployment.Deployable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.deployment.Deployable other) {
      if (other == io.grafeas.v1beta1.deployment.Deployable.getDefaultInstance()) return this;
      if (!other.resourceUri_.isEmpty()) {
        if (resourceUri_.isEmpty()) {
          resourceUri_ = other.resourceUri_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureResourceUriIsMutable();
          resourceUri_.addAll(other.resourceUri_);
        }
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
      io.grafeas.v1beta1.deployment.Deployable parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.deployment.Deployable) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList resourceUri_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureResourceUriIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        resourceUri_ = new com.google.protobuf.LazyStringArrayList(resourceUri_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getResourceUriList() {
      return resourceUri_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     */
    public int getResourceUriCount() {
      return resourceUri_.size();
    }
    /**
     * <pre>
     * Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     */
    public java.lang.String getResourceUri(int index) {
      return resourceUri_.get(index);
    }
    /**
     * <pre>
     * Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceUriBytes(int index) {
      return resourceUri_.getByteString(index);
    }
    /**
     * <pre>
     * Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     */
    public Builder setResourceUri(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureResourceUriIsMutable();
      resourceUri_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     */
    public Builder addResourceUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureResourceUriIsMutable();
      resourceUri_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     */
    public Builder addAllResourceUri(
        java.lang.Iterable<java.lang.String> values) {
      ensureResourceUriIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, resourceUri_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     */
    public Builder clearResourceUri() {
      resourceUri_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     */
    public Builder addResourceUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureResourceUriIsMutable();
      resourceUri_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.deployment.Deployable)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.deployment.Deployable)
  private static final io.grafeas.v1beta1.deployment.Deployable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.deployment.Deployable();
  }

  public static io.grafeas.v1beta1.deployment.Deployable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Deployable>
      PARSER = new com.google.protobuf.AbstractParser<Deployable>() {
    @java.lang.Override
    public Deployable parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Deployable(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Deployable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Deployable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.deployment.Deployable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

