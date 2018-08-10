// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/source_context.proto

package com.google.containeranalysis.v1alpha1;

/**
 * <pre>
 * A CloudRepoSourceContext denotes a particular revision in a Google Cloud
 * Source Repo.
 * </pre>
 *
 * Protobuf type {@code google.devtools.containeranalysis.v1alpha1.CloudRepoSourceContext}
 */
public  final class CloudRepoSourceContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.containeranalysis.v1alpha1.CloudRepoSourceContext)
    CloudRepoSourceContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloudRepoSourceContext.newBuilder() to construct.
  private CloudRepoSourceContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloudRepoSourceContext() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CloudRepoSourceContext(
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
            com.google.containeranalysis.v1alpha1.RepoId.Builder subBuilder = null;
            if (repoId_ != null) {
              subBuilder = repoId_.toBuilder();
            }
            repoId_ = input.readMessage(com.google.containeranalysis.v1alpha1.RepoId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(repoId_);
              repoId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            revisionCase_ = 2;
            revision_ = s;
            break;
          }
          case 26: {
            com.google.containeranalysis.v1alpha1.AliasContext.Builder subBuilder = null;
            if (revisionCase_ == 3) {
              subBuilder = ((com.google.containeranalysis.v1alpha1.AliasContext) revision_).toBuilder();
            }
            revision_ =
                input.readMessage(com.google.containeranalysis.v1alpha1.AliasContext.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.containeranalysis.v1alpha1.AliasContext) revision_);
              revision_ = subBuilder.buildPartial();
            }
            revisionCase_ = 3;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.containeranalysis.v1alpha1.SourceContextOuterClass.internal_static_google_devtools_containeranalysis_v1alpha1_CloudRepoSourceContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.containeranalysis.v1alpha1.SourceContextOuterClass.internal_static_google_devtools_containeranalysis_v1alpha1_CloudRepoSourceContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.containeranalysis.v1alpha1.CloudRepoSourceContext.class, com.google.containeranalysis.v1alpha1.CloudRepoSourceContext.Builder.class);
  }

  private int revisionCase_ = 0;
  private java.lang.Object revision_;
  public enum RevisionCase
      implements com.google.protobuf.Internal.EnumLite {
    REVISION_ID(2),
    ALIAS_CONTEXT(3),
    REVISION_NOT_SET(0);
    private final int value;
    private RevisionCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RevisionCase valueOf(int value) {
      return forNumber(value);
    }

    public static RevisionCase forNumber(int value) {
      switch (value) {
        case 2: return REVISION_ID;
        case 3: return ALIAS_CONTEXT;
        case 0: return REVISION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RevisionCase
  getRevisionCase() {
    return RevisionCase.forNumber(
        revisionCase_);
  }

  public static final int REPO_ID_FIELD_NUMBER = 1;
  private com.google.containeranalysis.v1alpha1.RepoId repoId_;
  /**
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
   */
  public boolean hasRepoId() {
    return repoId_ != null;
  }
  /**
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
   */
  public com.google.containeranalysis.v1alpha1.RepoId getRepoId() {
    return repoId_ == null ? com.google.containeranalysis.v1alpha1.RepoId.getDefaultInstance() : repoId_;
  }
  /**
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
   */
  public com.google.containeranalysis.v1alpha1.RepoIdOrBuilder getRepoIdOrBuilder() {
    return getRepoId();
  }

  public static final int REVISION_ID_FIELD_NUMBER = 2;
  /**
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   */
  public java.lang.String getRevisionId() {
    java.lang.Object ref = "";
    if (revisionCase_ == 2) {
      ref = revision_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (revisionCase_ == 2) {
        revision_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRevisionIdBytes() {
    java.lang.Object ref = "";
    if (revisionCase_ == 2) {
      ref = revision_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (revisionCase_ == 2) {
        revision_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALIAS_CONTEXT_FIELD_NUMBER = 3;
  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
   */
  public boolean hasAliasContext() {
    return revisionCase_ == 3;
  }
  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
   */
  public com.google.containeranalysis.v1alpha1.AliasContext getAliasContext() {
    if (revisionCase_ == 3) {
       return (com.google.containeranalysis.v1alpha1.AliasContext) revision_;
    }
    return com.google.containeranalysis.v1alpha1.AliasContext.getDefaultInstance();
  }
  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
   */
  public com.google.containeranalysis.v1alpha1.AliasContextOrBuilder getAliasContextOrBuilder() {
    if (revisionCase_ == 3) {
       return (com.google.containeranalysis.v1alpha1.AliasContext) revision_;
    }
    return com.google.containeranalysis.v1alpha1.AliasContext.getDefaultInstance();
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
    if (repoId_ != null) {
      output.writeMessage(1, getRepoId());
    }
    if (revisionCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, revision_);
    }
    if (revisionCase_ == 3) {
      output.writeMessage(3, (com.google.containeranalysis.v1alpha1.AliasContext) revision_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (repoId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRepoId());
    }
    if (revisionCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, revision_);
    }
    if (revisionCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.containeranalysis.v1alpha1.AliasContext) revision_);
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
    if (!(obj instanceof com.google.containeranalysis.v1alpha1.CloudRepoSourceContext)) {
      return super.equals(obj);
    }
    com.google.containeranalysis.v1alpha1.CloudRepoSourceContext other = (com.google.containeranalysis.v1alpha1.CloudRepoSourceContext) obj;

    boolean result = true;
    result = result && (hasRepoId() == other.hasRepoId());
    if (hasRepoId()) {
      result = result && getRepoId()
          .equals(other.getRepoId());
    }
    result = result && getRevisionCase().equals(
        other.getRevisionCase());
    if (!result) return false;
    switch (revisionCase_) {
      case 2:
        result = result && getRevisionId()
            .equals(other.getRevisionId());
        break;
      case 3:
        result = result && getAliasContext()
            .equals(other.getAliasContext());
        break;
      case 0:
      default:
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
    if (hasRepoId()) {
      hash = (37 * hash) + REPO_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRepoId().hashCode();
    }
    switch (revisionCase_) {
      case 2:
        hash = (37 * hash) + REVISION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getRevisionId().hashCode();
        break;
      case 3:
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

  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parseFrom(
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
  public static Builder newBuilder(com.google.containeranalysis.v1alpha1.CloudRepoSourceContext prototype) {
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
   * A CloudRepoSourceContext denotes a particular revision in a Google Cloud
   * Source Repo.
   * </pre>
   *
   * Protobuf type {@code google.devtools.containeranalysis.v1alpha1.CloudRepoSourceContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.containeranalysis.v1alpha1.CloudRepoSourceContext)
      com.google.containeranalysis.v1alpha1.CloudRepoSourceContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.containeranalysis.v1alpha1.SourceContextOuterClass.internal_static_google_devtools_containeranalysis_v1alpha1_CloudRepoSourceContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.containeranalysis.v1alpha1.SourceContextOuterClass.internal_static_google_devtools_containeranalysis_v1alpha1_CloudRepoSourceContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.containeranalysis.v1alpha1.CloudRepoSourceContext.class, com.google.containeranalysis.v1alpha1.CloudRepoSourceContext.Builder.class);
    }

    // Construct using com.google.containeranalysis.v1alpha1.CloudRepoSourceContext.newBuilder()
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
      if (repoIdBuilder_ == null) {
        repoId_ = null;
      } else {
        repoId_ = null;
        repoIdBuilder_ = null;
      }
      revisionCase_ = 0;
      revision_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.containeranalysis.v1alpha1.SourceContextOuterClass.internal_static_google_devtools_containeranalysis_v1alpha1_CloudRepoSourceContext_descriptor;
    }

    @java.lang.Override
    public com.google.containeranalysis.v1alpha1.CloudRepoSourceContext getDefaultInstanceForType() {
      return com.google.containeranalysis.v1alpha1.CloudRepoSourceContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.containeranalysis.v1alpha1.CloudRepoSourceContext build() {
      com.google.containeranalysis.v1alpha1.CloudRepoSourceContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.containeranalysis.v1alpha1.CloudRepoSourceContext buildPartial() {
      com.google.containeranalysis.v1alpha1.CloudRepoSourceContext result = new com.google.containeranalysis.v1alpha1.CloudRepoSourceContext(this);
      if (repoIdBuilder_ == null) {
        result.repoId_ = repoId_;
      } else {
        result.repoId_ = repoIdBuilder_.build();
      }
      if (revisionCase_ == 2) {
        result.revision_ = revision_;
      }
      if (revisionCase_ == 3) {
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
      if (other instanceof com.google.containeranalysis.v1alpha1.CloudRepoSourceContext) {
        return mergeFrom((com.google.containeranalysis.v1alpha1.CloudRepoSourceContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.containeranalysis.v1alpha1.CloudRepoSourceContext other) {
      if (other == com.google.containeranalysis.v1alpha1.CloudRepoSourceContext.getDefaultInstance()) return this;
      if (other.hasRepoId()) {
        mergeRepoId(other.getRepoId());
      }
      switch (other.getRevisionCase()) {
        case REVISION_ID: {
          revisionCase_ = 2;
          revision_ = other.revision_;
          onChanged();
          break;
        }
        case ALIAS_CONTEXT: {
          mergeAliasContext(other.getAliasContext());
          break;
        }
        case REVISION_NOT_SET: {
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
      com.google.containeranalysis.v1alpha1.CloudRepoSourceContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.containeranalysis.v1alpha1.CloudRepoSourceContext) e.getUnfinishedMessage();
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
    public RevisionCase
        getRevisionCase() {
      return RevisionCase.forNumber(
          revisionCase_);
    }

    public Builder clearRevision() {
      revisionCase_ = 0;
      revision_ = null;
      onChanged();
      return this;
    }


    private com.google.containeranalysis.v1alpha1.RepoId repoId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.containeranalysis.v1alpha1.RepoId, com.google.containeranalysis.v1alpha1.RepoId.Builder, com.google.containeranalysis.v1alpha1.RepoIdOrBuilder> repoIdBuilder_;
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
     */
    public boolean hasRepoId() {
      return repoIdBuilder_ != null || repoId_ != null;
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
     */
    public com.google.containeranalysis.v1alpha1.RepoId getRepoId() {
      if (repoIdBuilder_ == null) {
        return repoId_ == null ? com.google.containeranalysis.v1alpha1.RepoId.getDefaultInstance() : repoId_;
      } else {
        return repoIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
     */
    public Builder setRepoId(com.google.containeranalysis.v1alpha1.RepoId value) {
      if (repoIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        repoId_ = value;
        onChanged();
      } else {
        repoIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
     */
    public Builder setRepoId(
        com.google.containeranalysis.v1alpha1.RepoId.Builder builderForValue) {
      if (repoIdBuilder_ == null) {
        repoId_ = builderForValue.build();
        onChanged();
      } else {
        repoIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
     */
    public Builder mergeRepoId(com.google.containeranalysis.v1alpha1.RepoId value) {
      if (repoIdBuilder_ == null) {
        if (repoId_ != null) {
          repoId_ =
            com.google.containeranalysis.v1alpha1.RepoId.newBuilder(repoId_).mergeFrom(value).buildPartial();
        } else {
          repoId_ = value;
        }
        onChanged();
      } else {
        repoIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
     */
    public Builder clearRepoId() {
      if (repoIdBuilder_ == null) {
        repoId_ = null;
        onChanged();
      } else {
        repoId_ = null;
        repoIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
     */
    public com.google.containeranalysis.v1alpha1.RepoId.Builder getRepoIdBuilder() {
      
      onChanged();
      return getRepoIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
     */
    public com.google.containeranalysis.v1alpha1.RepoIdOrBuilder getRepoIdOrBuilder() {
      if (repoIdBuilder_ != null) {
        return repoIdBuilder_.getMessageOrBuilder();
      } else {
        return repoId_ == null ?
            com.google.containeranalysis.v1alpha1.RepoId.getDefaultInstance() : repoId_;
      }
    }
    /**
     * <pre>
     * The ID of the repo.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.RepoId repo_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.containeranalysis.v1alpha1.RepoId, com.google.containeranalysis.v1alpha1.RepoId.Builder, com.google.containeranalysis.v1alpha1.RepoIdOrBuilder> 
        getRepoIdFieldBuilder() {
      if (repoIdBuilder_ == null) {
        repoIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.containeranalysis.v1alpha1.RepoId, com.google.containeranalysis.v1alpha1.RepoId.Builder, com.google.containeranalysis.v1alpha1.RepoIdOrBuilder>(
                getRepoId(),
                getParentForChildren(),
                isClean());
        repoId_ = null;
      }
      return repoIdBuilder_;
    }

    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public java.lang.String getRevisionId() {
      java.lang.Object ref = "";
      if (revisionCase_ == 2) {
        ref = revision_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (revisionCase_ == 2) {
          revision_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRevisionIdBytes() {
      java.lang.Object ref = "";
      if (revisionCase_ == 2) {
        ref = revision_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (revisionCase_ == 2) {
          revision_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public Builder setRevisionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  revisionCase_ = 2;
      revision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public Builder clearRevisionId() {
      if (revisionCase_ == 2) {
        revisionCase_ = 0;
        revision_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * A revision ID.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public Builder setRevisionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      revisionCase_ = 2;
      revision_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.containeranalysis.v1alpha1.AliasContext, com.google.containeranalysis.v1alpha1.AliasContext.Builder, com.google.containeranalysis.v1alpha1.AliasContextOrBuilder> aliasContextBuilder_;
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
     */
    public boolean hasAliasContext() {
      return revisionCase_ == 3;
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
     */
    public com.google.containeranalysis.v1alpha1.AliasContext getAliasContext() {
      if (aliasContextBuilder_ == null) {
        if (revisionCase_ == 3) {
          return (com.google.containeranalysis.v1alpha1.AliasContext) revision_;
        }
        return com.google.containeranalysis.v1alpha1.AliasContext.getDefaultInstance();
      } else {
        if (revisionCase_ == 3) {
          return aliasContextBuilder_.getMessage();
        }
        return com.google.containeranalysis.v1alpha1.AliasContext.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
     */
    public Builder setAliasContext(com.google.containeranalysis.v1alpha1.AliasContext value) {
      if (aliasContextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        revision_ = value;
        onChanged();
      } else {
        aliasContextBuilder_.setMessage(value);
      }
      revisionCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
     */
    public Builder setAliasContext(
        com.google.containeranalysis.v1alpha1.AliasContext.Builder builderForValue) {
      if (aliasContextBuilder_ == null) {
        revision_ = builderForValue.build();
        onChanged();
      } else {
        aliasContextBuilder_.setMessage(builderForValue.build());
      }
      revisionCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
     */
    public Builder mergeAliasContext(com.google.containeranalysis.v1alpha1.AliasContext value) {
      if (aliasContextBuilder_ == null) {
        if (revisionCase_ == 3 &&
            revision_ != com.google.containeranalysis.v1alpha1.AliasContext.getDefaultInstance()) {
          revision_ = com.google.containeranalysis.v1alpha1.AliasContext.newBuilder((com.google.containeranalysis.v1alpha1.AliasContext) revision_)
              .mergeFrom(value).buildPartial();
        } else {
          revision_ = value;
        }
        onChanged();
      } else {
        if (revisionCase_ == 3) {
          aliasContextBuilder_.mergeFrom(value);
        }
        aliasContextBuilder_.setMessage(value);
      }
      revisionCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
     */
    public Builder clearAliasContext() {
      if (aliasContextBuilder_ == null) {
        if (revisionCase_ == 3) {
          revisionCase_ = 0;
          revision_ = null;
          onChanged();
        }
      } else {
        if (revisionCase_ == 3) {
          revisionCase_ = 0;
          revision_ = null;
        }
        aliasContextBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
     */
    public com.google.containeranalysis.v1alpha1.AliasContext.Builder getAliasContextBuilder() {
      return getAliasContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
     */
    public com.google.containeranalysis.v1alpha1.AliasContextOrBuilder getAliasContextOrBuilder() {
      if ((revisionCase_ == 3) && (aliasContextBuilder_ != null)) {
        return aliasContextBuilder_.getMessageOrBuilder();
      } else {
        if (revisionCase_ == 3) {
          return (com.google.containeranalysis.v1alpha1.AliasContext) revision_;
        }
        return com.google.containeranalysis.v1alpha1.AliasContext.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An alias, which may be a branch or tag.
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.containeranalysis.v1alpha1.AliasContext, com.google.containeranalysis.v1alpha1.AliasContext.Builder, com.google.containeranalysis.v1alpha1.AliasContextOrBuilder> 
        getAliasContextFieldBuilder() {
      if (aliasContextBuilder_ == null) {
        if (!(revisionCase_ == 3)) {
          revision_ = com.google.containeranalysis.v1alpha1.AliasContext.getDefaultInstance();
        }
        aliasContextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.containeranalysis.v1alpha1.AliasContext, com.google.containeranalysis.v1alpha1.AliasContext.Builder, com.google.containeranalysis.v1alpha1.AliasContextOrBuilder>(
                (com.google.containeranalysis.v1alpha1.AliasContext) revision_,
                getParentForChildren(),
                isClean());
        revision_ = null;
      }
      revisionCase_ = 3;
      onChanged();;
      return aliasContextBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.containeranalysis.v1alpha1.CloudRepoSourceContext)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.containeranalysis.v1alpha1.CloudRepoSourceContext)
  private static final com.google.containeranalysis.v1alpha1.CloudRepoSourceContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.containeranalysis.v1alpha1.CloudRepoSourceContext();
  }

  public static com.google.containeranalysis.v1alpha1.CloudRepoSourceContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudRepoSourceContext>
      PARSER = new com.google.protobuf.AbstractParser<CloudRepoSourceContext>() {
    @java.lang.Override
    public CloudRepoSourceContext parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CloudRepoSourceContext(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CloudRepoSourceContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudRepoSourceContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.containeranalysis.v1alpha1.CloudRepoSourceContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

