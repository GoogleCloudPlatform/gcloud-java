// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * The response message for listing DLP jobs.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ListDlpJobsResponse}
 */
public final class ListDlpJobsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ListDlpJobsResponse)
    ListDlpJobsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDlpJobsResponse.newBuilder() to construct.
  private ListDlpJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDlpJobsResponse() {
    jobs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDlpJobsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListDlpJobsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              jobs_ = new java.util.ArrayList<com.google.privacy.dlp.v2.DlpJob>();
              mutable_bitField0_ |= 0x00000001;
            }
            jobs_.add(
                input.readMessage(com.google.privacy.dlp.v2.DlpJob.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        jobs_ = java.util.Collections.unmodifiableList(jobs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListDlpJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListDlpJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ListDlpJobsResponse.class, com.google.privacy.dlp.v2.ListDlpJobsResponse.Builder.class);
  }

  public static final int JOBS_FIELD_NUMBER = 1;
  private java.util.List<com.google.privacy.dlp.v2.DlpJob> jobs_;
  /**
   * <pre>
   * A list of DlpJobs that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.privacy.dlp.v2.DlpJob> getJobsList() {
    return jobs_;
  }
  /**
   * <pre>
   * A list of DlpJobs that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.privacy.dlp.v2.DlpJobOrBuilder> 
      getJobsOrBuilderList() {
    return jobs_;
  }
  /**
   * <pre>
   * A list of DlpJobs that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
   */
  @java.lang.Override
  public int getJobsCount() {
    return jobs_.size();
  }
  /**
   * <pre>
   * A list of DlpJobs that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DlpJob getJobs(int index) {
    return jobs_.get(index);
  }
  /**
   * <pre>
   * A list of DlpJobs that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DlpJobOrBuilder getJobsOrBuilder(
      int index) {
    return jobs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < jobs_.size(); i++) {
      output.writeMessage(1, jobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, jobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ListDlpJobsResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ListDlpJobsResponse other = (com.google.privacy.dlp.v2.ListDlpJobsResponse) obj;

    if (!getJobsList()
        .equals(other.getJobsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getJobsCount() > 0) {
      hash = (37 * hash) + JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getJobsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ListDlpJobsResponse parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.ListDlpJobsResponse prototype) {
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
   * The response message for listing DLP jobs.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ListDlpJobsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ListDlpJobsResponse)
      com.google.privacy.dlp.v2.ListDlpJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListDlpJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListDlpJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ListDlpJobsResponse.class, com.google.privacy.dlp.v2.ListDlpJobsResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ListDlpJobsResponse.newBuilder()
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
        getJobsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        jobsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListDlpJobsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListDlpJobsResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ListDlpJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListDlpJobsResponse build() {
      com.google.privacy.dlp.v2.ListDlpJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListDlpJobsResponse buildPartial() {
      com.google.privacy.dlp.v2.ListDlpJobsResponse result = new com.google.privacy.dlp.v2.ListDlpJobsResponse(this);
      int from_bitField0_ = bitField0_;
      if (jobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          jobs_ = java.util.Collections.unmodifiableList(jobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jobs_ = jobs_;
      } else {
        result.jobs_ = jobsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.privacy.dlp.v2.ListDlpJobsResponse) {
        return mergeFrom((com.google.privacy.dlp.v2.ListDlpJobsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ListDlpJobsResponse other) {
      if (other == com.google.privacy.dlp.v2.ListDlpJobsResponse.getDefaultInstance()) return this;
      if (jobsBuilder_ == null) {
        if (!other.jobs_.isEmpty()) {
          if (jobs_.isEmpty()) {
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJobsIsMutable();
            jobs_.addAll(other.jobs_);
          }
          onChanged();
        }
      } else {
        if (!other.jobs_.isEmpty()) {
          if (jobsBuilder_.isEmpty()) {
            jobsBuilder_.dispose();
            jobsBuilder_ = null;
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jobsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJobsFieldBuilder() : null;
          } else {
            jobsBuilder_.addAllMessages(other.jobs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.privacy.dlp.v2.ListDlpJobsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.ListDlpJobsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.privacy.dlp.v2.DlpJob> jobs_ =
      java.util.Collections.emptyList();
    private void ensureJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jobs_ = new java.util.ArrayList<com.google.privacy.dlp.v2.DlpJob>(jobs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2.DlpJob, com.google.privacy.dlp.v2.DlpJob.Builder, com.google.privacy.dlp.v2.DlpJobOrBuilder> jobsBuilder_;

    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.DlpJob> getJobsList() {
      if (jobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobs_);
      } else {
        return jobsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public int getJobsCount() {
      if (jobsBuilder_ == null) {
        return jobs_.size();
      } else {
        return jobsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public com.google.privacy.dlp.v2.DlpJob getJobs(int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);
      } else {
        return jobsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public Builder setJobs(
        int index, com.google.privacy.dlp.v2.DlpJob value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.set(index, value);
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public Builder setJobs(
        int index, com.google.privacy.dlp.v2.DlpJob.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public Builder addJobs(com.google.privacy.dlp.v2.DlpJob value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public Builder addJobs(
        int index, com.google.privacy.dlp.v2.DlpJob value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(index, value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public Builder addJobs(
        com.google.privacy.dlp.v2.DlpJob.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public Builder addJobs(
        int index, com.google.privacy.dlp.v2.DlpJob.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public Builder addAllJobs(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2.DlpJob> values) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobs_);
        onChanged();
      } else {
        jobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public Builder clearJobs() {
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jobsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public Builder removeJobs(int index) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.remove(index);
        onChanged();
      } else {
        jobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public com.google.privacy.dlp.v2.DlpJob.Builder getJobsBuilder(
        int index) {
      return getJobsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public com.google.privacy.dlp.v2.DlpJobOrBuilder getJobsOrBuilder(
        int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);  } else {
        return jobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2.DlpJobOrBuilder> 
         getJobsOrBuilderList() {
      if (jobsBuilder_ != null) {
        return jobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobs_);
      }
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public com.google.privacy.dlp.v2.DlpJob.Builder addJobsBuilder() {
      return getJobsFieldBuilder().addBuilder(
          com.google.privacy.dlp.v2.DlpJob.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public com.google.privacy.dlp.v2.DlpJob.Builder addJobsBuilder(
        int index) {
      return getJobsFieldBuilder().addBuilder(
          index, com.google.privacy.dlp.v2.DlpJob.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of DlpJobs that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DlpJob jobs = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.DlpJob.Builder> 
         getJobsBuilderList() {
      return getJobsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2.DlpJob, com.google.privacy.dlp.v2.DlpJob.Builder, com.google.privacy.dlp.v2.DlpJobOrBuilder> 
        getJobsFieldBuilder() {
      if (jobsBuilder_ == null) {
        jobsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.DlpJob, com.google.privacy.dlp.v2.DlpJob.Builder, com.google.privacy.dlp.v2.DlpJobOrBuilder>(
                jobs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        jobs_ = null;
      }
      return jobsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ListDlpJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ListDlpJobsResponse)
  private static final com.google.privacy.dlp.v2.ListDlpJobsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ListDlpJobsResponse();
  }

  public static com.google.privacy.dlp.v2.ListDlpJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDlpJobsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDlpJobsResponse>() {
    @java.lang.Override
    public ListDlpJobsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListDlpJobsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListDlpJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDlpJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ListDlpJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

