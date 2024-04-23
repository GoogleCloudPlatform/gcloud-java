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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.3
package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * Response containing existing `WorkerPools`.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.ListWorkerPoolsResponse}
 */
public final class ListWorkerPoolsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.ListWorkerPoolsResponse)
    ListWorkerPoolsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListWorkerPoolsResponse.newBuilder() to construct.
  private ListWorkerPoolsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListWorkerPoolsResponse() {
    workerPools_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListWorkerPoolsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_ListWorkerPoolsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_ListWorkerPoolsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.ListWorkerPoolsResponse.class,
            com.google.cloudbuild.v1.ListWorkerPoolsResponse.Builder.class);
  }

  public static final int WORKER_POOLS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloudbuild.v1.WorkerPool> workerPools_;
  /**
   *
   *
   * <pre>
   * `WorkerPools` for the specified project.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloudbuild.v1.WorkerPool> getWorkerPoolsList() {
    return workerPools_;
  }
  /**
   *
   *
   * <pre>
   * `WorkerPools` for the specified project.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloudbuild.v1.WorkerPoolOrBuilder>
      getWorkerPoolsOrBuilderList() {
    return workerPools_;
  }
  /**
   *
   *
   * <pre>
   * `WorkerPools` for the specified project.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
   */
  @java.lang.Override
  public int getWorkerPoolsCount() {
    return workerPools_.size();
  }
  /**
   *
   *
   * <pre>
   * `WorkerPools` for the specified project.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.WorkerPool getWorkerPools(int index) {
    return workerPools_.get(index);
  }
  /**
   *
   *
   * <pre>
   * `WorkerPools` for the specified project.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.WorkerPoolOrBuilder getWorkerPoolsOrBuilder(int index) {
    return workerPools_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Continuation token used to page through large result sets. Provide this
   * value in a subsequent ListWorkerPoolsRequest to return the next page of
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Continuation token used to page through large result sets. Provide this
   * value in a subsequent ListWorkerPoolsRequest to return the next page of
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < workerPools_.size(); i++) {
      output.writeMessage(1, workerPools_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < workerPools_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, workerPools_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloudbuild.v1.ListWorkerPoolsResponse)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.ListWorkerPoolsResponse other =
        (com.google.cloudbuild.v1.ListWorkerPoolsResponse) obj;

    if (!getWorkerPoolsList().equals(other.getWorkerPoolsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getWorkerPoolsCount() > 0) {
      hash = (37 * hash) + WORKER_POOLS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkerPoolsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.ListWorkerPoolsResponse prototype) {
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
   * Response containing existing `WorkerPools`.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.ListWorkerPoolsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.ListWorkerPoolsResponse)
      com.google.cloudbuild.v1.ListWorkerPoolsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_ListWorkerPoolsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_ListWorkerPoolsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.ListWorkerPoolsResponse.class,
              com.google.cloudbuild.v1.ListWorkerPoolsResponse.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.ListWorkerPoolsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (workerPoolsBuilder_ == null) {
        workerPools_ = java.util.Collections.emptyList();
      } else {
        workerPools_ = null;
        workerPoolsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_ListWorkerPoolsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ListWorkerPoolsResponse getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.ListWorkerPoolsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ListWorkerPoolsResponse build() {
      com.google.cloudbuild.v1.ListWorkerPoolsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ListWorkerPoolsResponse buildPartial() {
      com.google.cloudbuild.v1.ListWorkerPoolsResponse result =
          new com.google.cloudbuild.v1.ListWorkerPoolsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloudbuild.v1.ListWorkerPoolsResponse result) {
      if (workerPoolsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          workerPools_ = java.util.Collections.unmodifiableList(workerPools_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.workerPools_ = workerPools_;
      } else {
        result.workerPools_ = workerPoolsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloudbuild.v1.ListWorkerPoolsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
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
      if (other instanceof com.google.cloudbuild.v1.ListWorkerPoolsResponse) {
        return mergeFrom((com.google.cloudbuild.v1.ListWorkerPoolsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.ListWorkerPoolsResponse other) {
      if (other == com.google.cloudbuild.v1.ListWorkerPoolsResponse.getDefaultInstance())
        return this;
      if (workerPoolsBuilder_ == null) {
        if (!other.workerPools_.isEmpty()) {
          if (workerPools_.isEmpty()) {
            workerPools_ = other.workerPools_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWorkerPoolsIsMutable();
            workerPools_.addAll(other.workerPools_);
          }
          onChanged();
        }
      } else {
        if (!other.workerPools_.isEmpty()) {
          if (workerPoolsBuilder_.isEmpty()) {
            workerPoolsBuilder_.dispose();
            workerPoolsBuilder_ = null;
            workerPools_ = other.workerPools_;
            bitField0_ = (bitField0_ & ~0x00000001);
            workerPoolsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getWorkerPoolsFieldBuilder()
                    : null;
          } else {
            workerPoolsBuilder_.addAllMessages(other.workerPools_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
            case 10:
              {
                com.google.cloudbuild.v1.WorkerPool m =
                    input.readMessage(
                        com.google.cloudbuild.v1.WorkerPool.parser(), extensionRegistry);
                if (workerPoolsBuilder_ == null) {
                  ensureWorkerPoolsIsMutable();
                  workerPools_.add(m);
                } else {
                  workerPoolsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.util.List<com.google.cloudbuild.v1.WorkerPool> workerPools_ =
        java.util.Collections.emptyList();

    private void ensureWorkerPoolsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        workerPools_ = new java.util.ArrayList<com.google.cloudbuild.v1.WorkerPool>(workerPools_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloudbuild.v1.WorkerPool,
            com.google.cloudbuild.v1.WorkerPool.Builder,
            com.google.cloudbuild.v1.WorkerPoolOrBuilder>
        workerPoolsBuilder_;

    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public java.util.List<com.google.cloudbuild.v1.WorkerPool> getWorkerPoolsList() {
      if (workerPoolsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(workerPools_);
      } else {
        return workerPoolsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public int getWorkerPoolsCount() {
      if (workerPoolsBuilder_ == null) {
        return workerPools_.size();
      } else {
        return workerPoolsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public com.google.cloudbuild.v1.WorkerPool getWorkerPools(int index) {
      if (workerPoolsBuilder_ == null) {
        return workerPools_.get(index);
      } else {
        return workerPoolsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public Builder setWorkerPools(int index, com.google.cloudbuild.v1.WorkerPool value) {
      if (workerPoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkerPoolsIsMutable();
        workerPools_.set(index, value);
        onChanged();
      } else {
        workerPoolsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public Builder setWorkerPools(
        int index, com.google.cloudbuild.v1.WorkerPool.Builder builderForValue) {
      if (workerPoolsBuilder_ == null) {
        ensureWorkerPoolsIsMutable();
        workerPools_.set(index, builderForValue.build());
        onChanged();
      } else {
        workerPoolsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public Builder addWorkerPools(com.google.cloudbuild.v1.WorkerPool value) {
      if (workerPoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkerPoolsIsMutable();
        workerPools_.add(value);
        onChanged();
      } else {
        workerPoolsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public Builder addWorkerPools(int index, com.google.cloudbuild.v1.WorkerPool value) {
      if (workerPoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkerPoolsIsMutable();
        workerPools_.add(index, value);
        onChanged();
      } else {
        workerPoolsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public Builder addWorkerPools(com.google.cloudbuild.v1.WorkerPool.Builder builderForValue) {
      if (workerPoolsBuilder_ == null) {
        ensureWorkerPoolsIsMutable();
        workerPools_.add(builderForValue.build());
        onChanged();
      } else {
        workerPoolsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public Builder addWorkerPools(
        int index, com.google.cloudbuild.v1.WorkerPool.Builder builderForValue) {
      if (workerPoolsBuilder_ == null) {
        ensureWorkerPoolsIsMutable();
        workerPools_.add(index, builderForValue.build());
        onChanged();
      } else {
        workerPoolsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public Builder addAllWorkerPools(
        java.lang.Iterable<? extends com.google.cloudbuild.v1.WorkerPool> values) {
      if (workerPoolsBuilder_ == null) {
        ensureWorkerPoolsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, workerPools_);
        onChanged();
      } else {
        workerPoolsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public Builder clearWorkerPools() {
      if (workerPoolsBuilder_ == null) {
        workerPools_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        workerPoolsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public Builder removeWorkerPools(int index) {
      if (workerPoolsBuilder_ == null) {
        ensureWorkerPoolsIsMutable();
        workerPools_.remove(index);
        onChanged();
      } else {
        workerPoolsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public com.google.cloudbuild.v1.WorkerPool.Builder getWorkerPoolsBuilder(int index) {
      return getWorkerPoolsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public com.google.cloudbuild.v1.WorkerPoolOrBuilder getWorkerPoolsOrBuilder(int index) {
      if (workerPoolsBuilder_ == null) {
        return workerPools_.get(index);
      } else {
        return workerPoolsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public java.util.List<? extends com.google.cloudbuild.v1.WorkerPoolOrBuilder>
        getWorkerPoolsOrBuilderList() {
      if (workerPoolsBuilder_ != null) {
        return workerPoolsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(workerPools_);
      }
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public com.google.cloudbuild.v1.WorkerPool.Builder addWorkerPoolsBuilder() {
      return getWorkerPoolsFieldBuilder()
          .addBuilder(com.google.cloudbuild.v1.WorkerPool.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public com.google.cloudbuild.v1.WorkerPool.Builder addWorkerPoolsBuilder(int index) {
      return getWorkerPoolsFieldBuilder()
          .addBuilder(index, com.google.cloudbuild.v1.WorkerPool.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * `WorkerPools` for the specified project.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
     */
    public java.util.List<com.google.cloudbuild.v1.WorkerPool.Builder> getWorkerPoolsBuilderList() {
      return getWorkerPoolsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloudbuild.v1.WorkerPool,
            com.google.cloudbuild.v1.WorkerPool.Builder,
            com.google.cloudbuild.v1.WorkerPoolOrBuilder>
        getWorkerPoolsFieldBuilder() {
      if (workerPoolsBuilder_ == null) {
        workerPoolsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloudbuild.v1.WorkerPool,
                com.google.cloudbuild.v1.WorkerPool.Builder,
                com.google.cloudbuild.v1.WorkerPoolOrBuilder>(
                workerPools_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        workerPools_ = null;
      }
      return workerPoolsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Continuation token used to page through large result sets. Provide this
     * value in a subsequent ListWorkerPoolsRequest to return the next page of
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Continuation token used to page through large result sets. Provide this
     * value in a subsequent ListWorkerPoolsRequest to return the next page of
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Continuation token used to page through large result sets. Provide this
     * value in a subsequent ListWorkerPoolsRequest to return the next page of
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Continuation token used to page through large result sets. Provide this
     * value in a subsequent ListWorkerPoolsRequest to return the next page of
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Continuation token used to page through large result sets. Provide this
     * value in a subsequent ListWorkerPoolsRequest to return the next page of
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.ListWorkerPoolsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.ListWorkerPoolsResponse)
  private static final com.google.cloudbuild.v1.ListWorkerPoolsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.ListWorkerPoolsResponse();
  }

  public static com.google.cloudbuild.v1.ListWorkerPoolsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListWorkerPoolsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListWorkerPoolsResponse>() {
        @java.lang.Override
        public ListWorkerPoolsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListWorkerPoolsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListWorkerPoolsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.ListWorkerPoolsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
