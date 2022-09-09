// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 * <pre>
 * Request to approve or reject a pending build.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.ApproveBuildRequest}
 */
public final class ApproveBuildRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.ApproveBuildRequest)
    ApproveBuildRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApproveBuildRequest.newBuilder() to construct.
  private ApproveBuildRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApproveBuildRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApproveBuildRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApproveBuildRequest(
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

            name_ = s;
            break;
          }
          case 18: {
            com.google.cloudbuild.v1.ApprovalResult.Builder subBuilder = null;
            if (approvalResult_ != null) {
              subBuilder = approvalResult_.toBuilder();
            }
            approvalResult_ = input.readMessage(com.google.cloudbuild.v1.ApprovalResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(approvalResult_);
              approvalResult_ = subBuilder.buildPartial();
            }

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
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_ApproveBuildRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_ApproveBuildRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.ApproveBuildRequest.class, com.google.cloudbuild.v1.ApproveBuildRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. Name of the target build.
   * For example: "projects/{$project_id}/builds/{$build_id}"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Name of the target build.
   * For example: "projects/{$project_id}/builds/{$build_id}"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPROVAL_RESULT_FIELD_NUMBER = 2;
  private com.google.cloudbuild.v1.ApprovalResult approvalResult_;
  /**
   * <pre>
   * Approval decision and metadata.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
   * @return Whether the approvalResult field is set.
   */
  @java.lang.Override
  public boolean hasApprovalResult() {
    return approvalResult_ != null;
  }
  /**
   * <pre>
   * Approval decision and metadata.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
   * @return The approvalResult.
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.ApprovalResult getApprovalResult() {
    return approvalResult_ == null ? com.google.cloudbuild.v1.ApprovalResult.getDefaultInstance() : approvalResult_;
  }
  /**
   * <pre>
   * Approval decision and metadata.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.ApprovalResultOrBuilder getApprovalResultOrBuilder() {
    return getApprovalResult();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (approvalResult_ != null) {
      output.writeMessage(2, getApprovalResult());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (approvalResult_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getApprovalResult());
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
    if (!(obj instanceof com.google.cloudbuild.v1.ApproveBuildRequest)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.ApproveBuildRequest other = (com.google.cloudbuild.v1.ApproveBuildRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasApprovalResult() != other.hasApprovalResult()) return false;
    if (hasApprovalResult()) {
      if (!getApprovalResult()
          .equals(other.getApprovalResult())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasApprovalResult()) {
      hash = (37 * hash) + APPROVAL_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getApprovalResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.ApproveBuildRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.ApproveBuildRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloudbuild.v1.ApproveBuildRequest prototype) {
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
   * Request to approve or reject a pending build.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.ApproveBuildRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.ApproveBuildRequest)
      com.google.cloudbuild.v1.ApproveBuildRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_ApproveBuildRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_ApproveBuildRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.ApproveBuildRequest.class, com.google.cloudbuild.v1.ApproveBuildRequest.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.ApproveBuildRequest.newBuilder()
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
      name_ = "";

      if (approvalResultBuilder_ == null) {
        approvalResult_ = null;
      } else {
        approvalResult_ = null;
        approvalResultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_ApproveBuildRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ApproveBuildRequest getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.ApproveBuildRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ApproveBuildRequest build() {
      com.google.cloudbuild.v1.ApproveBuildRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ApproveBuildRequest buildPartial() {
      com.google.cloudbuild.v1.ApproveBuildRequest result = new com.google.cloudbuild.v1.ApproveBuildRequest(this);
      result.name_ = name_;
      if (approvalResultBuilder_ == null) {
        result.approvalResult_ = approvalResult_;
      } else {
        result.approvalResult_ = approvalResultBuilder_.build();
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
      if (other instanceof com.google.cloudbuild.v1.ApproveBuildRequest) {
        return mergeFrom((com.google.cloudbuild.v1.ApproveBuildRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.ApproveBuildRequest other) {
      if (other == com.google.cloudbuild.v1.ApproveBuildRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasApprovalResult()) {
        mergeApprovalResult(other.getApprovalResult());
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
      com.google.cloudbuild.v1.ApproveBuildRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloudbuild.v1.ApproveBuildRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. Name of the target build.
     * For example: "projects/{$project_id}/builds/{$build_id}"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of the target build.
     * For example: "projects/{$project_id}/builds/{$build_id}"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of the target build.
     * For example: "projects/{$project_id}/builds/{$build_id}"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of the target build.
     * For example: "projects/{$project_id}/builds/{$build_id}"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of the target build.
     * For example: "projects/{$project_id}/builds/{$build_id}"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloudbuild.v1.ApprovalResult approvalResult_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloudbuild.v1.ApprovalResult, com.google.cloudbuild.v1.ApprovalResult.Builder, com.google.cloudbuild.v1.ApprovalResultOrBuilder> approvalResultBuilder_;
    /**
     * <pre>
     * Approval decision and metadata.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
     * @return Whether the approvalResult field is set.
     */
    public boolean hasApprovalResult() {
      return approvalResultBuilder_ != null || approvalResult_ != null;
    }
    /**
     * <pre>
     * Approval decision and metadata.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
     * @return The approvalResult.
     */
    public com.google.cloudbuild.v1.ApprovalResult getApprovalResult() {
      if (approvalResultBuilder_ == null) {
        return approvalResult_ == null ? com.google.cloudbuild.v1.ApprovalResult.getDefaultInstance() : approvalResult_;
      } else {
        return approvalResultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Approval decision and metadata.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
     */
    public Builder setApprovalResult(com.google.cloudbuild.v1.ApprovalResult value) {
      if (approvalResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        approvalResult_ = value;
        onChanged();
      } else {
        approvalResultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Approval decision and metadata.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
     */
    public Builder setApprovalResult(
        com.google.cloudbuild.v1.ApprovalResult.Builder builderForValue) {
      if (approvalResultBuilder_ == null) {
        approvalResult_ = builderForValue.build();
        onChanged();
      } else {
        approvalResultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Approval decision and metadata.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
     */
    public Builder mergeApprovalResult(com.google.cloudbuild.v1.ApprovalResult value) {
      if (approvalResultBuilder_ == null) {
        if (approvalResult_ != null) {
          approvalResult_ =
            com.google.cloudbuild.v1.ApprovalResult.newBuilder(approvalResult_).mergeFrom(value).buildPartial();
        } else {
          approvalResult_ = value;
        }
        onChanged();
      } else {
        approvalResultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Approval decision and metadata.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
     */
    public Builder clearApprovalResult() {
      if (approvalResultBuilder_ == null) {
        approvalResult_ = null;
        onChanged();
      } else {
        approvalResult_ = null;
        approvalResultBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Approval decision and metadata.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
     */
    public com.google.cloudbuild.v1.ApprovalResult.Builder getApprovalResultBuilder() {
      
      onChanged();
      return getApprovalResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Approval decision and metadata.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
     */
    public com.google.cloudbuild.v1.ApprovalResultOrBuilder getApprovalResultOrBuilder() {
      if (approvalResultBuilder_ != null) {
        return approvalResultBuilder_.getMessageOrBuilder();
      } else {
        return approvalResult_ == null ?
            com.google.cloudbuild.v1.ApprovalResult.getDefaultInstance() : approvalResult_;
      }
    }
    /**
     * <pre>
     * Approval decision and metadata.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloudbuild.v1.ApprovalResult, com.google.cloudbuild.v1.ApprovalResult.Builder, com.google.cloudbuild.v1.ApprovalResultOrBuilder> 
        getApprovalResultFieldBuilder() {
      if (approvalResultBuilder_ == null) {
        approvalResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.ApprovalResult, com.google.cloudbuild.v1.ApprovalResult.Builder, com.google.cloudbuild.v1.ApprovalResultOrBuilder>(
                getApprovalResult(),
                getParentForChildren(),
                isClean());
        approvalResult_ = null;
      }
      return approvalResultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.ApproveBuildRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.ApproveBuildRequest)
  private static final com.google.cloudbuild.v1.ApproveBuildRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.ApproveBuildRequest();
  }

  public static com.google.cloudbuild.v1.ApproveBuildRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApproveBuildRequest>
      PARSER = new com.google.protobuf.AbstractParser<ApproveBuildRequest>() {
    @java.lang.Override
    public ApproveBuildRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApproveBuildRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApproveBuildRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApproveBuildRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.ApproveBuildRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

