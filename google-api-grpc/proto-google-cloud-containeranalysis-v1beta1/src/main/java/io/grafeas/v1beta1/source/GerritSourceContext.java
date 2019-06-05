// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

package io.grafeas.v1beta1.source;

/**
 *
 *
 * <pre>
 * A SourceContext referring to a Gerrit project.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.source.GerritSourceContext}
 */
public final class GerritSourceContext extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.source.GerritSourceContext)
    GerritSourceContextOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GerritSourceContext.newBuilder() to construct.
  private GerritSourceContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GerritSourceContext() {
    hostUri_ = "";
    gerritProject_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GerritSourceContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GerritSourceContext(
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

              hostUri_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              gerritProject_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              revisionCase_ = 3;
              revision_ = s;
              break;
            }
          case 34:
            {
              io.grafeas.v1beta1.source.AliasContext.Builder subBuilder = null;
              if (revisionCase_ == 4) {
                subBuilder = ((io.grafeas.v1beta1.source.AliasContext) revision_).toBuilder();
              }
              revision_ =
                  input.readMessage(
                      io.grafeas.v1beta1.source.AliasContext.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((io.grafeas.v1beta1.source.AliasContext) revision_);
                revision_ = subBuilder.buildPartial();
              }
              revisionCase_ = 4;
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
        .internal_static_grafeas_v1beta1_source_GerritSourceContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.source.Source
        .internal_static_grafeas_v1beta1_source_GerritSourceContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.source.GerritSourceContext.class,
            io.grafeas.v1beta1.source.GerritSourceContext.Builder.class);
  }

  private int revisionCase_ = 0;
  private java.lang.Object revision_;

  public enum RevisionCase implements com.google.protobuf.Internal.EnumLite {
    REVISION_ID(3),
    ALIAS_CONTEXT(4),
    REVISION_NOT_SET(0);
    private final int value;

    private RevisionCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static RevisionCase valueOf(int value) {
      return forNumber(value);
    }

    public static RevisionCase forNumber(int value) {
      switch (value) {
        case 3:
          return REVISION_ID;
        case 4:
          return ALIAS_CONTEXT;
        case 0:
          return REVISION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public RevisionCase getRevisionCase() {
    return RevisionCase.forNumber(revisionCase_);
  }

  public static final int HOST_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object hostUri_;
  /**
   *
   *
   * <pre>
   * The URI of a running Gerrit instance.
   * </pre>
   *
   * <code>string host_uri = 1;</code>
   */
  public java.lang.String getHostUri() {
    java.lang.Object ref = hostUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URI of a running Gerrit instance.
   * </pre>
   *
   * <code>string host_uri = 1;</code>
   */
  public com.google.protobuf.ByteString getHostUriBytes() {
    java.lang.Object ref = hostUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      hostUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GERRIT_PROJECT_FIELD_NUMBER = 2;
  private volatile java.lang.Object gerritProject_;
  /**
   *
   *
   * <pre>
   * The full project name within the host. Projects may be nested, so
   * "project/subproject" is a valid project name. The "repo name" is the
   * hostURI/project.
   * </pre>
   *
   * <code>string gerrit_project = 2;</code>
   */
  public java.lang.String getGerritProject() {
    java.lang.Object ref = gerritProject_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gerritProject_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The full project name within the host. Projects may be nested, so
   * "project/subproject" is a valid project name. The "repo name" is the
   * hostURI/project.
   * </pre>
   *
   * <code>string gerrit_project = 2;</code>
   */
  public com.google.protobuf.ByteString getGerritProjectBytes() {
    java.lang.Object ref = gerritProject_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gerritProject_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REVISION_ID_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * A revision (commit) ID.
   * </pre>
   *
   * <code>string revision_id = 3;</code>
   */
  public java.lang.String getRevisionId() {
    java.lang.Object ref = "";
    if (revisionCase_ == 3) {
      ref = revision_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (revisionCase_ == 3) {
        revision_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A revision (commit) ID.
   * </pre>
   *
   * <code>string revision_id = 3;</code>
   */
  public com.google.protobuf.ByteString getRevisionIdBytes() {
    java.lang.Object ref = "";
    if (revisionCase_ == 3) {
      ref = revision_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (revisionCase_ == 3) {
        revision_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALIAS_CONTEXT_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
   */
  public boolean hasAliasContext() {
    return revisionCase_ == 4;
  }
  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
   */
  public io.grafeas.v1beta1.source.AliasContext getAliasContext() {
    if (revisionCase_ == 4) {
      return (io.grafeas.v1beta1.source.AliasContext) revision_;
    }
    return io.grafeas.v1beta1.source.AliasContext.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
   */
  public io.grafeas.v1beta1.source.AliasContextOrBuilder getAliasContextOrBuilder() {
    if (revisionCase_ == 4) {
      return (io.grafeas.v1beta1.source.AliasContext) revision_;
    }
    return io.grafeas.v1beta1.source.AliasContext.getDefaultInstance();
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
    if (!getHostUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hostUri_);
    }
    if (!getGerritProjectBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gerritProject_);
    }
    if (revisionCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, revision_);
    }
    if (revisionCase_ == 4) {
      output.writeMessage(4, (io.grafeas.v1beta1.source.AliasContext) revision_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHostUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hostUri_);
    }
    if (!getGerritProjectBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gerritProject_);
    }
    if (revisionCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, revision_);
    }
    if (revisionCase_ == 4) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              4, (io.grafeas.v1beta1.source.AliasContext) revision_);
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
    if (!(obj instanceof io.grafeas.v1beta1.source.GerritSourceContext)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.source.GerritSourceContext other =
        (io.grafeas.v1beta1.source.GerritSourceContext) obj;

    if (!getHostUri().equals(other.getHostUri())) return false;
    if (!getGerritProject().equals(other.getGerritProject())) return false;
    if (!getRevisionCase().equals(other.getRevisionCase())) return false;
    switch (revisionCase_) {
      case 3:
        if (!getRevisionId().equals(other.getRevisionId())) return false;
        break;
      case 4:
        if (!getAliasContext().equals(other.getAliasContext())) return false;
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
    hash = (37 * hash) + HOST_URI_FIELD_NUMBER;
    hash = (53 * hash) + getHostUri().hashCode();
    hash = (37 * hash) + GERRIT_PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getGerritProject().hashCode();
    switch (revisionCase_) {
      case 3:
        hash = (37 * hash) + REVISION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getRevisionId().hashCode();
        break;
      case 4:
        hash = (37 * hash) + ALIAS_CONTEXT_FIELD_NUMBER;
        hash = (53 * hash) + getAliasContext().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.source.GerritSourceContext prototype) {
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
   * A SourceContext referring to a Gerrit project.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.source.GerritSourceContext}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.source.GerritSourceContext)
      io.grafeas.v1beta1.source.GerritSourceContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_GerritSourceContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_GerritSourceContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.source.GerritSourceContext.class,
              io.grafeas.v1beta1.source.GerritSourceContext.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.source.GerritSourceContext.newBuilder()
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
      hostUri_ = "";

      gerritProject_ = "";

      revisionCase_ = 0;
      revision_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_GerritSourceContext_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.GerritSourceContext getDefaultInstanceForType() {
      return io.grafeas.v1beta1.source.GerritSourceContext.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.GerritSourceContext build() {
      io.grafeas.v1beta1.source.GerritSourceContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.GerritSourceContext buildPartial() {
      io.grafeas.v1beta1.source.GerritSourceContext result =
          new io.grafeas.v1beta1.source.GerritSourceContext(this);
      result.hostUri_ = hostUri_;
      result.gerritProject_ = gerritProject_;
      if (revisionCase_ == 3) {
        result.revision_ = revision_;
      }
      if (revisionCase_ == 4) {
        if (aliasContextBuilder_ == null) {
          result.revision_ = revision_;
        } else {
          result.revision_ = aliasContextBuilder_.build();
        }
      }
      result.revisionCase_ = revisionCase_;
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
      if (other instanceof io.grafeas.v1beta1.source.GerritSourceContext) {
        return mergeFrom((io.grafeas.v1beta1.source.GerritSourceContext) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.source.GerritSourceContext other) {
      if (other == io.grafeas.v1beta1.source.GerritSourceContext.getDefaultInstance()) return this;
      if (!other.getHostUri().isEmpty()) {
        hostUri_ = other.hostUri_;
        onChanged();
      }
      if (!other.getGerritProject().isEmpty()) {
        gerritProject_ = other.gerritProject_;
        onChanged();
      }
      switch (other.getRevisionCase()) {
        case REVISION_ID:
          {
            revisionCase_ = 3;
            revision_ = other.revision_;
            onChanged();
            break;
          }
        case ALIAS_CONTEXT:
          {
            mergeAliasContext(other.getAliasContext());
            break;
          }
        case REVISION_NOT_SET:
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
      io.grafeas.v1beta1.source.GerritSourceContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.source.GerritSourceContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int revisionCase_ = 0;
    private java.lang.Object revision_;

    public RevisionCase getRevisionCase() {
      return RevisionCase.forNumber(revisionCase_);
    }

    public Builder clearRevision() {
      revisionCase_ = 0;
      revision_ = null;
      onChanged();
      return this;
    }

    private java.lang.Object hostUri_ = "";
    /**
     *
     *
     * <pre>
     * The URI of a running Gerrit instance.
     * </pre>
     *
     * <code>string host_uri = 1;</code>
     */
    public java.lang.String getHostUri() {
      java.lang.Object ref = hostUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URI of a running Gerrit instance.
     * </pre>
     *
     * <code>string host_uri = 1;</code>
     */
    public com.google.protobuf.ByteString getHostUriBytes() {
      java.lang.Object ref = hostUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        hostUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URI of a running Gerrit instance.
     * </pre>
     *
     * <code>string host_uri = 1;</code>
     */
    public Builder setHostUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      hostUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URI of a running Gerrit instance.
     * </pre>
     *
     * <code>string host_uri = 1;</code>
     */
    public Builder clearHostUri() {

      hostUri_ = getDefaultInstance().getHostUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URI of a running Gerrit instance.
     * </pre>
     *
     * <code>string host_uri = 1;</code>
     */
    public Builder setHostUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      hostUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gerritProject_ = "";
    /**
     *
     *
     * <pre>
     * The full project name within the host. Projects may be nested, so
     * "project/subproject" is a valid project name. The "repo name" is the
     * hostURI/project.
     * </pre>
     *
     * <code>string gerrit_project = 2;</code>
     */
    public java.lang.String getGerritProject() {
      java.lang.Object ref = gerritProject_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gerritProject_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The full project name within the host. Projects may be nested, so
     * "project/subproject" is a valid project name. The "repo name" is the
     * hostURI/project.
     * </pre>
     *
     * <code>string gerrit_project = 2;</code>
     */
    public com.google.protobuf.ByteString getGerritProjectBytes() {
      java.lang.Object ref = gerritProject_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gerritProject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The full project name within the host. Projects may be nested, so
     * "project/subproject" is a valid project name. The "repo name" is the
     * hostURI/project.
     * </pre>
     *
     * <code>string gerrit_project = 2;</code>
     */
    public Builder setGerritProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      gerritProject_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The full project name within the host. Projects may be nested, so
     * "project/subproject" is a valid project name. The "repo name" is the
     * hostURI/project.
     * </pre>
     *
     * <code>string gerrit_project = 2;</code>
     */
    public Builder clearGerritProject() {

      gerritProject_ = getDefaultInstance().getGerritProject();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The full project name within the host. Projects may be nested, so
     * "project/subproject" is a valid project name. The "repo name" is the
     * hostURI/project.
     * </pre>
     *
     * <code>string gerrit_project = 2;</code>
     */
    public Builder setGerritProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      gerritProject_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A revision (commit) ID.
     * </pre>
     *
     * <code>string revision_id = 3;</code>
     */
    public java.lang.String getRevisionId() {
      java.lang.Object ref = "";
      if (revisionCase_ == 3) {
        ref = revision_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (revisionCase_ == 3) {
          revision_ = s;
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
     * A revision (commit) ID.
     * </pre>
     *
     * <code>string revision_id = 3;</code>
     */
    public com.google.protobuf.ByteString getRevisionIdBytes() {
      java.lang.Object ref = "";
      if (revisionCase_ == 3) {
        ref = revision_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (revisionCase_ == 3) {
          revision_ = b;
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
     * A revision (commit) ID.
     * </pre>
     *
     * <code>string revision_id = 3;</code>
     */
    public Builder setRevisionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      revisionCase_ = 3;
      revision_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A revision (commit) ID.
     * </pre>
     *
     * <code>string revision_id = 3;</code>
     */
    public Builder clearRevisionId() {
      if (revisionCase_ == 3) {
        revisionCase_ = 0;
        revision_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A revision (commit) ID.
     * </pre>
     *
     * <code>string revision_id = 3;</code>
     */
    public Builder setRevisionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      revisionCase_ = 3;
      revision_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.source.AliasContext,
            io.grafeas.v1beta1.source.AliasContext.Builder,
            io.grafeas.v1beta1.source.AliasContextOrBuilder>
        aliasContextBuilder_;
    /**
     *
     *
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     */
    public boolean hasAliasContext() {
      return revisionCase_ == 4;
    }
    /**
     *
     *
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     */
    public io.grafeas.v1beta1.source.AliasContext getAliasContext() {
      if (aliasContextBuilder_ == null) {
        if (revisionCase_ == 4) {
          return (io.grafeas.v1beta1.source.AliasContext) revision_;
        }
        return io.grafeas.v1beta1.source.AliasContext.getDefaultInstance();
      } else {
        if (revisionCase_ == 4) {
          return aliasContextBuilder_.getMessage();
        }
        return io.grafeas.v1beta1.source.AliasContext.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     */
    public Builder setAliasContext(io.grafeas.v1beta1.source.AliasContext value) {
      if (aliasContextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        revision_ = value;
        onChanged();
      } else {
        aliasContextBuilder_.setMessage(value);
      }
      revisionCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     */
    public Builder setAliasContext(io.grafeas.v1beta1.source.AliasContext.Builder builderForValue) {
      if (aliasContextBuilder_ == null) {
        revision_ = builderForValue.build();
        onChanged();
      } else {
        aliasContextBuilder_.setMessage(builderForValue.build());
      }
      revisionCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     */
    public Builder mergeAliasContext(io.grafeas.v1beta1.source.AliasContext value) {
      if (aliasContextBuilder_ == null) {
        if (revisionCase_ == 4
            && revision_ != io.grafeas.v1beta1.source.AliasContext.getDefaultInstance()) {
          revision_ =
              io.grafeas.v1beta1.source.AliasContext.newBuilder(
                      (io.grafeas.v1beta1.source.AliasContext) revision_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          revision_ = value;
        }
        onChanged();
      } else {
        if (revisionCase_ == 4) {
          aliasContextBuilder_.mergeFrom(value);
        }
        aliasContextBuilder_.setMessage(value);
      }
      revisionCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     */
    public Builder clearAliasContext() {
      if (aliasContextBuilder_ == null) {
        if (revisionCase_ == 4) {
          revisionCase_ = 0;
          revision_ = null;
          onChanged();
        }
      } else {
        if (revisionCase_ == 4) {
          revisionCase_ = 0;
          revision_ = null;
        }
        aliasContextBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     */
    public io.grafeas.v1beta1.source.AliasContext.Builder getAliasContextBuilder() {
      return getAliasContextFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     */
    public io.grafeas.v1beta1.source.AliasContextOrBuilder getAliasContextOrBuilder() {
      if ((revisionCase_ == 4) && (aliasContextBuilder_ != null)) {
        return aliasContextBuilder_.getMessageOrBuilder();
      } else {
        if (revisionCase_ == 4) {
          return (io.grafeas.v1beta1.source.AliasContext) revision_;
        }
        return io.grafeas.v1beta1.source.AliasContext.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.source.AliasContext,
            io.grafeas.v1beta1.source.AliasContext.Builder,
            io.grafeas.v1beta1.source.AliasContextOrBuilder>
        getAliasContextFieldBuilder() {
      if (aliasContextBuilder_ == null) {
        if (!(revisionCase_ == 4)) {
          revision_ = io.grafeas.v1beta1.source.AliasContext.getDefaultInstance();
        }
        aliasContextBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1beta1.source.AliasContext,
                io.grafeas.v1beta1.source.AliasContext.Builder,
                io.grafeas.v1beta1.source.AliasContextOrBuilder>(
                (io.grafeas.v1beta1.source.AliasContext) revision_,
                getParentForChildren(),
                isClean());
        revision_ = null;
      }
      revisionCase_ = 4;
      onChanged();
      ;
      return aliasContextBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.source.GerritSourceContext)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.source.GerritSourceContext)
  private static final io.grafeas.v1beta1.source.GerritSourceContext DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.source.GerritSourceContext();
  }

  public static io.grafeas.v1beta1.source.GerritSourceContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GerritSourceContext> PARSER =
      new com.google.protobuf.AbstractParser<GerritSourceContext>() {
        @java.lang.Override
        public GerritSourceContext parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GerritSourceContext(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GerritSourceContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GerritSourceContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.source.GerritSourceContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
