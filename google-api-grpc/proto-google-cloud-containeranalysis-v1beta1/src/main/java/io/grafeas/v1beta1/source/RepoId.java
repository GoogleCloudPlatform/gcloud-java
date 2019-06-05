// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

package io.grafeas.v1beta1.source;

/**
 *
 *
 * <pre>
 * A unique identifier for a Cloud Repo.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.source.RepoId}
 */
public final class RepoId extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.source.RepoId)
    RepoIdOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RepoId.newBuilder() to construct.
  private RepoId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RepoId() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RepoId();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RepoId(
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
              io.grafeas.v1beta1.source.ProjectRepoId.Builder subBuilder = null;
              if (idCase_ == 1) {
                subBuilder = ((io.grafeas.v1beta1.source.ProjectRepoId) id_).toBuilder();
              }
              id_ =
                  input.readMessage(
                      io.grafeas.v1beta1.source.ProjectRepoId.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((io.grafeas.v1beta1.source.ProjectRepoId) id_);
                id_ = subBuilder.buildPartial();
              }
              idCase_ = 1;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              idCase_ = 2;
              id_ = s;
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
    return io.grafeas.v1beta1.source.Source
        .internal_static_grafeas_v1beta1_source_RepoId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.source.Source
        .internal_static_grafeas_v1beta1_source_RepoId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.source.RepoId.class, io.grafeas.v1beta1.source.RepoId.Builder.class);
  }

  private int idCase_ = 0;
  private java.lang.Object id_;

  public enum IdCase implements com.google.protobuf.Internal.EnumLite {
    PROJECT_REPO_ID(1),
    UID(2),
    ID_NOT_SET(0);
    private final int value;

    private IdCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static IdCase valueOf(int value) {
      return forNumber(value);
    }

    public static IdCase forNumber(int value) {
      switch (value) {
        case 1:
          return PROJECT_REPO_ID;
        case 2:
          return UID;
        case 0:
          return ID_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public IdCase getIdCase() {
    return IdCase.forNumber(idCase_);
  }

  public static final int PROJECT_REPO_ID_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * A combination of a project ID and a repo name.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
   */
  public boolean hasProjectRepoId() {
    return idCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * A combination of a project ID and a repo name.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
   */
  public io.grafeas.v1beta1.source.ProjectRepoId getProjectRepoId() {
    if (idCase_ == 1) {
      return (io.grafeas.v1beta1.source.ProjectRepoId) id_;
    }
    return io.grafeas.v1beta1.source.ProjectRepoId.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A combination of a project ID and a repo name.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
   */
  public io.grafeas.v1beta1.source.ProjectRepoIdOrBuilder getProjectRepoIdOrBuilder() {
    if (idCase_ == 1) {
      return (io.grafeas.v1beta1.source.ProjectRepoId) id_;
    }
    return io.grafeas.v1beta1.source.ProjectRepoId.getDefaultInstance();
  }

  public static final int UID_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * A server-assigned, globally unique identifier.
   * </pre>
   *
   * <code>string uid = 2;</code>
   */
  public java.lang.String getUid() {
    java.lang.Object ref = "";
    if (idCase_ == 2) {
      ref = id_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (idCase_ == 2) {
        id_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A server-assigned, globally unique identifier.
   * </pre>
   *
   * <code>string uid = 2;</code>
   */
  public com.google.protobuf.ByteString getUidBytes() {
    java.lang.Object ref = "";
    if (idCase_ == 2) {
      ref = id_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (idCase_ == 2) {
        id_ = b;
      }
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
    if (idCase_ == 1) {
      output.writeMessage(1, (io.grafeas.v1beta1.source.ProjectRepoId) id_);
    }
    if (idCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (io.grafeas.v1beta1.source.ProjectRepoId) id_);
    }
    if (idCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
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
    if (!(obj instanceof io.grafeas.v1beta1.source.RepoId)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.source.RepoId other = (io.grafeas.v1beta1.source.RepoId) obj;

    if (!getIdCase().equals(other.getIdCase())) return false;
    switch (idCase_) {
      case 1:
        if (!getProjectRepoId().equals(other.getProjectRepoId())) return false;
        break;
      case 2:
        if (!getUid().equals(other.getUid())) return false;
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
    switch (idCase_) {
      case 1:
        hash = (37 * hash) + PROJECT_REPO_ID_FIELD_NUMBER;
        hash = (53 * hash) + getProjectRepoId().hashCode();
        break;
      case 2:
        hash = (37 * hash) + UID_FIELD_NUMBER;
        hash = (53 * hash) + getUid().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.source.RepoId parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.RepoId parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.RepoId parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.RepoId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.RepoId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.RepoId parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.RepoId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.RepoId parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.RepoId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.RepoId parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.RepoId parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.RepoId parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.source.RepoId prototype) {
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
   * A unique identifier for a Cloud Repo.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.source.RepoId}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.source.RepoId)
      io.grafeas.v1beta1.source.RepoIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_RepoId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_RepoId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.source.RepoId.class,
              io.grafeas.v1beta1.source.RepoId.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.source.RepoId.newBuilder()
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
      idCase_ = 0;
      id_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_RepoId_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.RepoId getDefaultInstanceForType() {
      return io.grafeas.v1beta1.source.RepoId.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.RepoId build() {
      io.grafeas.v1beta1.source.RepoId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.RepoId buildPartial() {
      io.grafeas.v1beta1.source.RepoId result = new io.grafeas.v1beta1.source.RepoId(this);
      if (idCase_ == 1) {
        if (projectRepoIdBuilder_ == null) {
          result.id_ = id_;
        } else {
          result.id_ = projectRepoIdBuilder_.build();
        }
      }
      if (idCase_ == 2) {
        result.id_ = id_;
      }
      result.idCase_ = idCase_;
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
      if (other instanceof io.grafeas.v1beta1.source.RepoId) {
        return mergeFrom((io.grafeas.v1beta1.source.RepoId) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.source.RepoId other) {
      if (other == io.grafeas.v1beta1.source.RepoId.getDefaultInstance()) return this;
      switch (other.getIdCase()) {
        case PROJECT_REPO_ID:
          {
            mergeProjectRepoId(other.getProjectRepoId());
            break;
          }
        case UID:
          {
            idCase_ = 2;
            id_ = other.id_;
            onChanged();
            break;
          }
        case ID_NOT_SET:
          {
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
      io.grafeas.v1beta1.source.RepoId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.source.RepoId) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int idCase_ = 0;
    private java.lang.Object id_;

    public IdCase getIdCase() {
      return IdCase.forNumber(idCase_);
    }

    public Builder clearId() {
      idCase_ = 0;
      id_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.source.ProjectRepoId,
            io.grafeas.v1beta1.source.ProjectRepoId.Builder,
            io.grafeas.v1beta1.source.ProjectRepoIdOrBuilder>
        projectRepoIdBuilder_;
    /**
     *
     *
     * <pre>
     * A combination of a project ID and a repo name.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     */
    public boolean hasProjectRepoId() {
      return idCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * A combination of a project ID and a repo name.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     */
    public io.grafeas.v1beta1.source.ProjectRepoId getProjectRepoId() {
      if (projectRepoIdBuilder_ == null) {
        if (idCase_ == 1) {
          return (io.grafeas.v1beta1.source.ProjectRepoId) id_;
        }
        return io.grafeas.v1beta1.source.ProjectRepoId.getDefaultInstance();
      } else {
        if (idCase_ == 1) {
          return projectRepoIdBuilder_.getMessage();
        }
        return io.grafeas.v1beta1.source.ProjectRepoId.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A combination of a project ID and a repo name.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     */
    public Builder setProjectRepoId(io.grafeas.v1beta1.source.ProjectRepoId value) {
      if (projectRepoIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        projectRepoIdBuilder_.setMessage(value);
      }
      idCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A combination of a project ID and a repo name.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     */
    public Builder setProjectRepoId(
        io.grafeas.v1beta1.source.ProjectRepoId.Builder builderForValue) {
      if (projectRepoIdBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        projectRepoIdBuilder_.setMessage(builderForValue.build());
      }
      idCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A combination of a project ID and a repo name.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     */
    public Builder mergeProjectRepoId(io.grafeas.v1beta1.source.ProjectRepoId value) {
      if (projectRepoIdBuilder_ == null) {
        if (idCase_ == 1 && id_ != io.grafeas.v1beta1.source.ProjectRepoId.getDefaultInstance()) {
          id_ =
              io.grafeas.v1beta1.source.ProjectRepoId.newBuilder(
                      (io.grafeas.v1beta1.source.ProjectRepoId) id_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        if (idCase_ == 1) {
          projectRepoIdBuilder_.mergeFrom(value);
        }
        projectRepoIdBuilder_.setMessage(value);
      }
      idCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A combination of a project ID and a repo name.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     */
    public Builder clearProjectRepoId() {
      if (projectRepoIdBuilder_ == null) {
        if (idCase_ == 1) {
          idCase_ = 0;
          id_ = null;
          onChanged();
        }
      } else {
        if (idCase_ == 1) {
          idCase_ = 0;
          id_ = null;
        }
        projectRepoIdBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A combination of a project ID and a repo name.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     */
    public io.grafeas.v1beta1.source.ProjectRepoId.Builder getProjectRepoIdBuilder() {
      return getProjectRepoIdFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A combination of a project ID and a repo name.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     */
    public io.grafeas.v1beta1.source.ProjectRepoIdOrBuilder getProjectRepoIdOrBuilder() {
      if ((idCase_ == 1) && (projectRepoIdBuilder_ != null)) {
        return projectRepoIdBuilder_.getMessageOrBuilder();
      } else {
        if (idCase_ == 1) {
          return (io.grafeas.v1beta1.source.ProjectRepoId) id_;
        }
        return io.grafeas.v1beta1.source.ProjectRepoId.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A combination of a project ID and a repo name.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.source.ProjectRepoId,
            io.grafeas.v1beta1.source.ProjectRepoId.Builder,
            io.grafeas.v1beta1.source.ProjectRepoIdOrBuilder>
        getProjectRepoIdFieldBuilder() {
      if (projectRepoIdBuilder_ == null) {
        if (!(idCase_ == 1)) {
          id_ = io.grafeas.v1beta1.source.ProjectRepoId.getDefaultInstance();
        }
        projectRepoIdBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1beta1.source.ProjectRepoId,
                io.grafeas.v1beta1.source.ProjectRepoId.Builder,
                io.grafeas.v1beta1.source.ProjectRepoIdOrBuilder>(
                (io.grafeas.v1beta1.source.ProjectRepoId) id_, getParentForChildren(), isClean());
        id_ = null;
      }
      idCase_ = 1;
      onChanged();
      ;
      return projectRepoIdBuilder_;
    }

    /**
     *
     *
     * <pre>
     * A server-assigned, globally unique identifier.
     * </pre>
     *
     * <code>string uid = 2;</code>
     */
    public java.lang.String getUid() {
      java.lang.Object ref = "";
      if (idCase_ == 2) {
        ref = id_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (idCase_ == 2) {
          id_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A server-assigned, globally unique identifier.
     * </pre>
     *
     * <code>string uid = 2;</code>
     */
    public com.google.protobuf.ByteString getUidBytes() {
      java.lang.Object ref = "";
      if (idCase_ == 2) {
        ref = id_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (idCase_ == 2) {
          id_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A server-assigned, globally unique identifier.
     * </pre>
     *
     * <code>string uid = 2;</code>
     */
    public Builder setUid(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      idCase_ = 2;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A server-assigned, globally unique identifier.
     * </pre>
     *
     * <code>string uid = 2;</code>
     */
    public Builder clearUid() {
      if (idCase_ == 2) {
        idCase_ = 0;
        id_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A server-assigned, globally unique identifier.
     * </pre>
     *
     * <code>string uid = 2;</code>
     */
    public Builder setUidBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      idCase_ = 2;
      id_ = value;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.source.RepoId)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.source.RepoId)
  private static final io.grafeas.v1beta1.source.RepoId DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.source.RepoId();
  }

  public static io.grafeas.v1beta1.source.RepoId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepoId> PARSER =
      new com.google.protobuf.AbstractParser<RepoId>() {
        @java.lang.Override
        public RepoId parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RepoId(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RepoId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepoId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.source.RepoId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
