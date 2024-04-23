/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataform.v1alpha2;

/**
 *
 *
 * <pre>
 * `PullGitCommits` request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1alpha2.PullGitCommitsRequest}
 */
public final class PullGitCommitsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1alpha2.PullGitCommitsRequest)
    PullGitCommitsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PullGitCommitsRequest.newBuilder() to construct.
  private PullGitCommitsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PullGitCommitsRequest() {
    name_ = "";
    remoteBranch_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PullGitCommitsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataform.v1alpha2.DataformProto
        .internal_static_google_cloud_dataform_v1alpha2_PullGitCommitsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1alpha2.DataformProto
        .internal_static_google_cloud_dataform_v1alpha2_PullGitCommitsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest.class,
            com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REMOTE_BRANCH_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object remoteBranch_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The name of the branch in the Git remote from which to pull commits.
   * If left unset, the repository's default branch name will be used.
   * </pre>
   *
   * <code>string remote_branch = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The remoteBranch.
   */
  @java.lang.Override
  public java.lang.String getRemoteBranch() {
    java.lang.Object ref = remoteBranch_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remoteBranch_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The name of the branch in the Git remote from which to pull commits.
   * If left unset, the repository's default branch name will be used.
   * </pre>
   *
   * <code>string remote_branch = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for remoteBranch.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRemoteBranchBytes() {
    java.lang.Object ref = remoteBranch_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      remoteBranch_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHOR_FIELD_NUMBER = 3;
  private com.google.cloud.dataform.v1alpha2.CommitAuthor author_;
  /**
   *
   *
   * <pre>
   * Required. The author of any merge commit which may be created as a result of merging
   * fetched Git commits into this workspace.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the author field is set.
   */
  @java.lang.Override
  public boolean hasAuthor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The author of any merge commit which may be created as a result of merging
   * fetched Git commits into this workspace.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The author.
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1alpha2.CommitAuthor getAuthor() {
    return author_ == null
        ? com.google.cloud.dataform.v1alpha2.CommitAuthor.getDefaultInstance()
        : author_;
  }
  /**
   *
   *
   * <pre>
   * Required. The author of any merge commit which may be created as a result of merging
   * fetched Git commits into this workspace.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1alpha2.CommitAuthorOrBuilder getAuthorOrBuilder() {
    return author_ == null
        ? com.google.cloud.dataform.v1alpha2.CommitAuthor.getDefaultInstance()
        : author_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remoteBranch_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, remoteBranch_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getAuthor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remoteBranch_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, remoteBranch_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getAuthor());
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
    if (!(obj instanceof com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest other =
        (com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getRemoteBranch().equals(other.getRemoteBranch())) return false;
    if (hasAuthor() != other.hasAuthor()) return false;
    if (hasAuthor()) {
      if (!getAuthor().equals(other.getAuthor())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + REMOTE_BRANCH_FIELD_NUMBER;
    hash = (53 * hash) + getRemoteBranch().hashCode();
    if (hasAuthor()) {
      hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
      hash = (53 * hash) + getAuthor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest prototype) {
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
   * `PullGitCommits` request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1alpha2.PullGitCommitsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1alpha2.PullGitCommitsRequest)
      com.google.cloud.dataform.v1alpha2.PullGitCommitsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataform.v1alpha2.DataformProto
          .internal_static_google_cloud_dataform_v1alpha2_PullGitCommitsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1alpha2.DataformProto
          .internal_static_google_cloud_dataform_v1alpha2_PullGitCommitsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest.class,
              com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAuthorFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      remoteBranch_ = "";
      author_ = null;
      if (authorBuilder_ != null) {
        authorBuilder_.dispose();
        authorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataform.v1alpha2.DataformProto
          .internal_static_google_cloud_dataform_v1alpha2_PullGitCommitsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest build() {
      com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest buildPartial() {
      com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest result =
          new com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.remoteBranch_ = remoteBranch_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.author_ = authorBuilder_ == null ? author_ : authorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest) {
        return mergeFrom((com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest other) {
      if (other == com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRemoteBranch().isEmpty()) {
        remoteBranch_ = other.remoteBranch_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasAuthor()) {
        mergeAuthor(other.getAuthor());
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
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                remoteBranch_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getAuthorFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object remoteBranch_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The name of the branch in the Git remote from which to pull commits.
     * If left unset, the repository's default branch name will be used.
     * </pre>
     *
     * <code>string remote_branch = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The remoteBranch.
     */
    public java.lang.String getRemoteBranch() {
      java.lang.Object ref = remoteBranch_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remoteBranch_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The name of the branch in the Git remote from which to pull commits.
     * If left unset, the repository's default branch name will be used.
     * </pre>
     *
     * <code>string remote_branch = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for remoteBranch.
     */
    public com.google.protobuf.ByteString getRemoteBranchBytes() {
      java.lang.Object ref = remoteBranch_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        remoteBranch_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The name of the branch in the Git remote from which to pull commits.
     * If left unset, the repository's default branch name will be used.
     * </pre>
     *
     * <code>string remote_branch = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The remoteBranch to set.
     * @return This builder for chaining.
     */
    public Builder setRemoteBranch(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      remoteBranch_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The name of the branch in the Git remote from which to pull commits.
     * If left unset, the repository's default branch name will be used.
     * </pre>
     *
     * <code>string remote_branch = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRemoteBranch() {
      remoteBranch_ = getDefaultInstance().getRemoteBranch();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The name of the branch in the Git remote from which to pull commits.
     * If left unset, the repository's default branch name will be used.
     * </pre>
     *
     * <code>string remote_branch = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for remoteBranch to set.
     * @return This builder for chaining.
     */
    public Builder setRemoteBranchBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      remoteBranch_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.dataform.v1alpha2.CommitAuthor author_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1alpha2.CommitAuthor,
            com.google.cloud.dataform.v1alpha2.CommitAuthor.Builder,
            com.google.cloud.dataform.v1alpha2.CommitAuthorOrBuilder>
        authorBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The author of any merge commit which may be created as a result of merging
     * fetched Git commits into this workspace.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the author field is set.
     */
    public boolean hasAuthor() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The author of any merge commit which may be created as a result of merging
     * fetched Git commits into this workspace.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The author.
     */
    public com.google.cloud.dataform.v1alpha2.CommitAuthor getAuthor() {
      if (authorBuilder_ == null) {
        return author_ == null
            ? com.google.cloud.dataform.v1alpha2.CommitAuthor.getDefaultInstance()
            : author_;
      } else {
        return authorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The author of any merge commit which may be created as a result of merging
     * fetched Git commits into this workspace.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAuthor(com.google.cloud.dataform.v1alpha2.CommitAuthor value) {
      if (authorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        author_ = value;
      } else {
        authorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The author of any merge commit which may be created as a result of merging
     * fetched Git commits into this workspace.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAuthor(
        com.google.cloud.dataform.v1alpha2.CommitAuthor.Builder builderForValue) {
      if (authorBuilder_ == null) {
        author_ = builderForValue.build();
      } else {
        authorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The author of any merge commit which may be created as a result of merging
     * fetched Git commits into this workspace.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAuthor(com.google.cloud.dataform.v1alpha2.CommitAuthor value) {
      if (authorBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && author_ != null
            && author_ != com.google.cloud.dataform.v1alpha2.CommitAuthor.getDefaultInstance()) {
          getAuthorBuilder().mergeFrom(value);
        } else {
          author_ = value;
        }
      } else {
        authorBuilder_.mergeFrom(value);
      }
      if (author_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The author of any merge commit which may be created as a result of merging
     * fetched Git commits into this workspace.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAuthor() {
      bitField0_ = (bitField0_ & ~0x00000004);
      author_ = null;
      if (authorBuilder_ != null) {
        authorBuilder_.dispose();
        authorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The author of any merge commit which may be created as a result of merging
     * fetched Git commits into this workspace.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataform.v1alpha2.CommitAuthor.Builder getAuthorBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAuthorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The author of any merge commit which may be created as a result of merging
     * fetched Git commits into this workspace.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataform.v1alpha2.CommitAuthorOrBuilder getAuthorOrBuilder() {
      if (authorBuilder_ != null) {
        return authorBuilder_.getMessageOrBuilder();
      } else {
        return author_ == null
            ? com.google.cloud.dataform.v1alpha2.CommitAuthor.getDefaultInstance()
            : author_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The author of any merge commit which may be created as a result of merging
     * fetched Git commits into this workspace.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1alpha2.CommitAuthor author = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1alpha2.CommitAuthor,
            com.google.cloud.dataform.v1alpha2.CommitAuthor.Builder,
            com.google.cloud.dataform.v1alpha2.CommitAuthorOrBuilder>
        getAuthorFieldBuilder() {
      if (authorBuilder_ == null) {
        authorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataform.v1alpha2.CommitAuthor,
                com.google.cloud.dataform.v1alpha2.CommitAuthor.Builder,
                com.google.cloud.dataform.v1alpha2.CommitAuthorOrBuilder>(
                getAuthor(), getParentForChildren(), isClean());
        author_ = null;
      }
      return authorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1alpha2.PullGitCommitsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1alpha2.PullGitCommitsRequest)
  private static final com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest();
  }

  public static com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PullGitCommitsRequest> PARSER =
      new com.google.protobuf.AbstractParser<PullGitCommitsRequest>() {
        @java.lang.Override
        public PullGitCommitsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PullGitCommitsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PullGitCommitsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
