// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/config/v1/config.proto

package com.google.cloud.config.v1;

/**
 * <pre>
 * A set of files in a Git repository.
 * </pre>
 *
 * Protobuf type {@code google.cloud.config.v1.GitSource}
 */
public final class GitSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.config.v1.GitSource)
    GitSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GitSource.newBuilder() to construct.
  private GitSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GitSource() {
    repo_ = "";
    directory_ = "";
    ref_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GitSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_GitSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_GitSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.config.v1.GitSource.class, com.google.cloud.config.v1.GitSource.Builder.class);
  }

  private int bitField0_;
  public static final int REPO_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object repo_ = "";
  /**
   * <pre>
   * Optional. Repository URL.
   * Example: 'https://github.com/kubernetes/examples.git'
   * </pre>
   *
   * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the repo field is set.
   */
  @java.lang.Override
  public boolean hasRepo() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Optional. Repository URL.
   * Example: 'https://github.com/kubernetes/examples.git'
   * </pre>
   *
   * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The repo.
   */
  @java.lang.Override
  public java.lang.String getRepo() {
    java.lang.Object ref = repo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repo_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Repository URL.
   * Example: 'https://github.com/kubernetes/examples.git'
   * </pre>
   *
   * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for repo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRepoBytes() {
    java.lang.Object ref = repo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      repo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIRECTORY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object directory_ = "";
  /**
   * <pre>
   * Optional. Subdirectory inside the repository.
   * Example: 'staging/my-package'
   * </pre>
   *
   * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the directory field is set.
   */
  @java.lang.Override
  public boolean hasDirectory() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Optional. Subdirectory inside the repository.
   * Example: 'staging/my-package'
   * </pre>
   *
   * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The directory.
   */
  @java.lang.Override
  public java.lang.String getDirectory() {
    java.lang.Object ref = directory_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      directory_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Subdirectory inside the repository.
   * Example: 'staging/my-package'
   * </pre>
   *
   * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for directory.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDirectoryBytes() {
    java.lang.Object ref = directory_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      directory_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REF_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ref_ = "";
  /**
   * <pre>
   * Optional. Git reference (e.g. branch or tag).
   * </pre>
   *
   * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the ref field is set.
   */
  @java.lang.Override
  public boolean hasRef() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Optional. Git reference (e.g. branch or tag).
   * </pre>
   *
   * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The ref.
   */
  @java.lang.Override
  public java.lang.String getRef() {
    java.lang.Object ref = ref_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ref_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Git reference (e.g. branch or tag).
   * </pre>
   *
   * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for ref.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRefBytes() {
    java.lang.Object ref = ref_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ref_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, repo_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, directory_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ref_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, repo_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, directory_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ref_);
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
    if (!(obj instanceof com.google.cloud.config.v1.GitSource)) {
      return super.equals(obj);
    }
    com.google.cloud.config.v1.GitSource other = (com.google.cloud.config.v1.GitSource) obj;

    if (hasRepo() != other.hasRepo()) return false;
    if (hasRepo()) {
      if (!getRepo()
          .equals(other.getRepo())) return false;
    }
    if (hasDirectory() != other.hasDirectory()) return false;
    if (hasDirectory()) {
      if (!getDirectory()
          .equals(other.getDirectory())) return false;
    }
    if (hasRef() != other.hasRef()) return false;
    if (hasRef()) {
      if (!getRef()
          .equals(other.getRef())) return false;
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
    if (hasRepo()) {
      hash = (37 * hash) + REPO_FIELD_NUMBER;
      hash = (53 * hash) + getRepo().hashCode();
    }
    if (hasDirectory()) {
      hash = (37 * hash) + DIRECTORY_FIELD_NUMBER;
      hash = (53 * hash) + getDirectory().hashCode();
    }
    if (hasRef()) {
      hash = (37 * hash) + REF_FIELD_NUMBER;
      hash = (53 * hash) + getRef().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.config.v1.GitSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.config.v1.GitSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.config.v1.GitSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.config.v1.GitSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.config.v1.GitSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.config.v1.GitSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.config.v1.GitSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.config.v1.GitSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.config.v1.GitSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.config.v1.GitSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.config.v1.GitSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.config.v1.GitSource parseFrom(
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
  public static Builder newBuilder(com.google.cloud.config.v1.GitSource prototype) {
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
   * A set of files in a Git repository.
   * </pre>
   *
   * Protobuf type {@code google.cloud.config.v1.GitSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.config.v1.GitSource)
      com.google.cloud.config.v1.GitSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_GitSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_GitSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.config.v1.GitSource.class, com.google.cloud.config.v1.GitSource.Builder.class);
    }

    // Construct using com.google.cloud.config.v1.GitSource.newBuilder()
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
      repo_ = "";
      directory_ = "";
      ref_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_GitSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.config.v1.GitSource getDefaultInstanceForType() {
      return com.google.cloud.config.v1.GitSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.config.v1.GitSource build() {
      com.google.cloud.config.v1.GitSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.config.v1.GitSource buildPartial() {
      com.google.cloud.config.v1.GitSource result = new com.google.cloud.config.v1.GitSource(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.config.v1.GitSource result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.repo_ = repo_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.directory_ = directory_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ref_ = ref_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.config.v1.GitSource) {
        return mergeFrom((com.google.cloud.config.v1.GitSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.config.v1.GitSource other) {
      if (other == com.google.cloud.config.v1.GitSource.getDefaultInstance()) return this;
      if (other.hasRepo()) {
        repo_ = other.repo_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDirectory()) {
        directory_ = other.directory_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasRef()) {
        ref_ = other.ref_;
        bitField0_ |= 0x00000004;
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
              repo_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              directory_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              ref_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object repo_ = "";
    /**
     * <pre>
     * Optional. Repository URL.
     * Example: 'https://github.com/kubernetes/examples.git'
     * </pre>
     *
     * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the repo field is set.
     */
    public boolean hasRepo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Optional. Repository URL.
     * Example: 'https://github.com/kubernetes/examples.git'
     * </pre>
     *
     * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The repo.
     */
    public java.lang.String getRepo() {
      java.lang.Object ref = repo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Repository URL.
     * Example: 'https://github.com/kubernetes/examples.git'
     * </pre>
     *
     * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for repo.
     */
    public com.google.protobuf.ByteString
        getRepoBytes() {
      java.lang.Object ref = repo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        repo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Repository URL.
     * Example: 'https://github.com/kubernetes/examples.git'
     * </pre>
     *
     * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The repo to set.
     * @return This builder for chaining.
     */
    public Builder setRepo(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      repo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Repository URL.
     * Example: 'https://github.com/kubernetes/examples.git'
     * </pre>
     *
     * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearRepo() {
      repo_ = getDefaultInstance().getRepo();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Repository URL.
     * Example: 'https://github.com/kubernetes/examples.git'
     * </pre>
     *
     * <code>optional string repo = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for repo to set.
     * @return This builder for chaining.
     */
    public Builder setRepoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      repo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object directory_ = "";
    /**
     * <pre>
     * Optional. Subdirectory inside the repository.
     * Example: 'staging/my-package'
     * </pre>
     *
     * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the directory field is set.
     */
    public boolean hasDirectory() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Optional. Subdirectory inside the repository.
     * Example: 'staging/my-package'
     * </pre>
     *
     * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The directory.
     */
    public java.lang.String getDirectory() {
      java.lang.Object ref = directory_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        directory_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Subdirectory inside the repository.
     * Example: 'staging/my-package'
     * </pre>
     *
     * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for directory.
     */
    public com.google.protobuf.ByteString
        getDirectoryBytes() {
      java.lang.Object ref = directory_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        directory_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Subdirectory inside the repository.
     * Example: 'staging/my-package'
     * </pre>
     *
     * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The directory to set.
     * @return This builder for chaining.
     */
    public Builder setDirectory(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      directory_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Subdirectory inside the repository.
     * Example: 'staging/my-package'
     * </pre>
     *
     * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearDirectory() {
      directory_ = getDefaultInstance().getDirectory();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Subdirectory inside the repository.
     * Example: 'staging/my-package'
     * </pre>
     *
     * <code>optional string directory = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for directory to set.
     * @return This builder for chaining.
     */
    public Builder setDirectoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      directory_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object ref_ = "";
    /**
     * <pre>
     * Optional. Git reference (e.g. branch or tag).
     * </pre>
     *
     * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the ref field is set.
     */
    public boolean hasRef() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Optional. Git reference (e.g. branch or tag).
     * </pre>
     *
     * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The ref.
     */
    public java.lang.String getRef() {
      java.lang.Object ref = ref_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ref_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Git reference (e.g. branch or tag).
     * </pre>
     *
     * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for ref.
     */
    public com.google.protobuf.ByteString
        getRefBytes() {
      java.lang.Object ref = ref_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ref_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Git reference (e.g. branch or tag).
     * </pre>
     *
     * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The ref to set.
     * @return This builder for chaining.
     */
    public Builder setRef(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ref_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Git reference (e.g. branch or tag).
     * </pre>
     *
     * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearRef() {
      ref_ = getDefaultInstance().getRef();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Git reference (e.g. branch or tag).
     * </pre>
     *
     * <code>optional string ref = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for ref to set.
     * @return This builder for chaining.
     */
    public Builder setRefBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ref_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.config.v1.GitSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.config.v1.GitSource)
  private static final com.google.cloud.config.v1.GitSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.config.v1.GitSource();
  }

  public static com.google.cloud.config.v1.GitSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GitSource>
      PARSER = new com.google.protobuf.AbstractParser<GitSource>() {
    @java.lang.Override
    public GitSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<GitSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GitSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.config.v1.GitSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

