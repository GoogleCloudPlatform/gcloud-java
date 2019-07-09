// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * Request message for [KeyManagementService.CreateImportJob][google.cloud.kms.v1.KeyManagementService.CreateImportJob].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.CreateImportJobRequest}
 */
public final class CreateImportJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.CreateImportJobRequest)
    CreateImportJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateImportJobRequest.newBuilder() to construct.
  private CreateImportJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateImportJobRequest() {
    parent_ = "";
    importJobId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateImportJobRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              importJobId_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.kms.v1.ImportJob.Builder subBuilder = null;
              if (importJob_ != null) {
                subBuilder = importJob_.toBuilder();
              }
              importJob_ =
                  input.readMessage(com.google.cloud.kms.v1.ImportJob.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(importJob_);
                importJob_ = subBuilder.buildPartial();
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
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_CreateImportJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_CreateImportJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.CreateImportJobRequest.class,
            com.google.cloud.kms.v1.CreateImportJobRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the [KeyRing][google.cloud.kms.v1.KeyRing] associated with the
   * [ImportJobs][google.cloud.kms.v1.ImportJob].
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the [KeyRing][google.cloud.kms.v1.KeyRing] associated with the
   * [ImportJobs][google.cloud.kms.v1.ImportJob].
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMPORT_JOB_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object importJobId_;
  /**
   *
   *
   * <pre>
   * Required. It must be unique within a KeyRing and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string import_job_id = 2;</code>
   */
  public java.lang.String getImportJobId() {
    java.lang.Object ref = importJobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      importJobId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. It must be unique within a KeyRing and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string import_job_id = 2;</code>
   */
  public com.google.protobuf.ByteString getImportJobIdBytes() {
    java.lang.Object ref = importJobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      importJobId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMPORT_JOB_FIELD_NUMBER = 3;
  private com.google.cloud.kms.v1.ImportJob importJob_;
  /**
   *
   *
   * <pre>
   * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
   */
  public boolean hasImportJob() {
    return importJob_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
   */
  public com.google.cloud.kms.v1.ImportJob getImportJob() {
    return importJob_ == null ? com.google.cloud.kms.v1.ImportJob.getDefaultInstance() : importJob_;
  }
  /**
   *
   *
   * <pre>
   * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
   */
  public com.google.cloud.kms.v1.ImportJobOrBuilder getImportJobOrBuilder() {
    return getImportJob();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getImportJobIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, importJobId_);
    }
    if (importJob_ != null) {
      output.writeMessage(3, getImportJob());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getImportJobIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, importJobId_);
    }
    if (importJob_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getImportJob());
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
    if (!(obj instanceof com.google.cloud.kms.v1.CreateImportJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.CreateImportJobRequest other =
        (com.google.cloud.kms.v1.CreateImportJobRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getImportJobId().equals(other.getImportJobId())) return false;
    if (hasImportJob() != other.hasImportJob()) return false;
    if (hasImportJob()) {
      if (!getImportJob().equals(other.getImportJob())) return false;
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
    hash = (37 * hash) + IMPORT_JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getImportJobId().hashCode();
    if (hasImportJob()) {
      hash = (37 * hash) + IMPORT_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getImportJob().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.kms.v1.CreateImportJobRequest prototype) {
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
   * Request message for [KeyManagementService.CreateImportJob][google.cloud.kms.v1.KeyManagementService.CreateImportJob].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.CreateImportJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.CreateImportJobRequest)
      com.google.cloud.kms.v1.CreateImportJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_CreateImportJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_CreateImportJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.CreateImportJobRequest.class,
              com.google.cloud.kms.v1.CreateImportJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.CreateImportJobRequest.newBuilder()
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
      parent_ = "";

      importJobId_ = "";

      if (importJobBuilder_ == null) {
        importJob_ = null;
      } else {
        importJob_ = null;
        importJobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_CreateImportJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateImportJobRequest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.CreateImportJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateImportJobRequest build() {
      com.google.cloud.kms.v1.CreateImportJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateImportJobRequest buildPartial() {
      com.google.cloud.kms.v1.CreateImportJobRequest result =
          new com.google.cloud.kms.v1.CreateImportJobRequest(this);
      result.parent_ = parent_;
      result.importJobId_ = importJobId_;
      if (importJobBuilder_ == null) {
        result.importJob_ = importJob_;
      } else {
        result.importJob_ = importJobBuilder_.build();
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
      if (other instanceof com.google.cloud.kms.v1.CreateImportJobRequest) {
        return mergeFrom((com.google.cloud.kms.v1.CreateImportJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.CreateImportJobRequest other) {
      if (other == com.google.cloud.kms.v1.CreateImportJobRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getImportJobId().isEmpty()) {
        importJobId_ = other.importJobId_;
        onChanged();
      }
      if (other.hasImportJob()) {
        mergeImportJob(other.getImportJob());
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
      com.google.cloud.kms.v1.CreateImportJobRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.CreateImportJobRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the [KeyRing][google.cloud.kms.v1.KeyRing] associated with the
     * [ImportJobs][google.cloud.kms.v1.ImportJob].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the [KeyRing][google.cloud.kms.v1.KeyRing] associated with the
     * [ImportJobs][google.cloud.kms.v1.ImportJob].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the [KeyRing][google.cloud.kms.v1.KeyRing] associated with the
     * [ImportJobs][google.cloud.kms.v1.ImportJob].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the [KeyRing][google.cloud.kms.v1.KeyRing] associated with the
     * [ImportJobs][google.cloud.kms.v1.ImportJob].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the [KeyRing][google.cloud.kms.v1.KeyRing] associated with the
     * [ImportJobs][google.cloud.kms.v1.ImportJob].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object importJobId_ = "";
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a KeyRing and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string import_job_id = 2;</code>
     */
    public java.lang.String getImportJobId() {
      java.lang.Object ref = importJobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        importJobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a KeyRing and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string import_job_id = 2;</code>
     */
    public com.google.protobuf.ByteString getImportJobIdBytes() {
      java.lang.Object ref = importJobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        importJobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a KeyRing and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string import_job_id = 2;</code>
     */
    public Builder setImportJobId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      importJobId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a KeyRing and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string import_job_id = 2;</code>
     */
    public Builder clearImportJobId() {

      importJobId_ = getDefaultInstance().getImportJobId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a KeyRing and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string import_job_id = 2;</code>
     */
    public Builder setImportJobIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      importJobId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.kms.v1.ImportJob importJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.ImportJob,
            com.google.cloud.kms.v1.ImportJob.Builder,
            com.google.cloud.kms.v1.ImportJobOrBuilder>
        importJobBuilder_;
    /**
     *
     *
     * <pre>
     * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
     */
    public boolean hasImportJob() {
      return importJobBuilder_ != null || importJob_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
     */
    public com.google.cloud.kms.v1.ImportJob getImportJob() {
      if (importJobBuilder_ == null) {
        return importJob_ == null
            ? com.google.cloud.kms.v1.ImportJob.getDefaultInstance()
            : importJob_;
      } else {
        return importJobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
     */
    public Builder setImportJob(com.google.cloud.kms.v1.ImportJob value) {
      if (importJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        importJob_ = value;
        onChanged();
      } else {
        importJobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
     */
    public Builder setImportJob(com.google.cloud.kms.v1.ImportJob.Builder builderForValue) {
      if (importJobBuilder_ == null) {
        importJob_ = builderForValue.build();
        onChanged();
      } else {
        importJobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
     */
    public Builder mergeImportJob(com.google.cloud.kms.v1.ImportJob value) {
      if (importJobBuilder_ == null) {
        if (importJob_ != null) {
          importJob_ =
              com.google.cloud.kms.v1.ImportJob.newBuilder(importJob_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          importJob_ = value;
        }
        onChanged();
      } else {
        importJobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
     */
    public Builder clearImportJob() {
      if (importJobBuilder_ == null) {
        importJob_ = null;
        onChanged();
      } else {
        importJob_ = null;
        importJobBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
     */
    public com.google.cloud.kms.v1.ImportJob.Builder getImportJobBuilder() {

      onChanged();
      return getImportJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
     */
    public com.google.cloud.kms.v1.ImportJobOrBuilder getImportJobOrBuilder() {
      if (importJobBuilder_ != null) {
        return importJobBuilder_.getMessageOrBuilder();
      } else {
        return importJob_ == null
            ? com.google.cloud.kms.v1.ImportJob.getDefaultInstance()
            : importJob_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ImportJob import_job = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.ImportJob,
            com.google.cloud.kms.v1.ImportJob.Builder,
            com.google.cloud.kms.v1.ImportJobOrBuilder>
        getImportJobFieldBuilder() {
      if (importJobBuilder_ == null) {
        importJobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.kms.v1.ImportJob,
                com.google.cloud.kms.v1.ImportJob.Builder,
                com.google.cloud.kms.v1.ImportJobOrBuilder>(
                getImportJob(), getParentForChildren(), isClean());
        importJob_ = null;
      }
      return importJobBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.CreateImportJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.CreateImportJobRequest)
  private static final com.google.cloud.kms.v1.CreateImportJobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.CreateImportJobRequest();
  }

  public static com.google.cloud.kms.v1.CreateImportJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateImportJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateImportJobRequest>() {
        @java.lang.Override
        public CreateImportJobRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateImportJobRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateImportJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateImportJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.CreateImportJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
