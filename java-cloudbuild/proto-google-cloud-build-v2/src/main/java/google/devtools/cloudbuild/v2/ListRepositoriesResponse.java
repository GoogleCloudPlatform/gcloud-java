/*
 * Copyright 2020 Google LLC
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
// source: google/devtools/cloudbuild/v2/repositories.proto

package google.devtools.cloudbuild.v2;

/**
 *
 *
 * <pre>
 * Message for response to listing Repositories.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v2.ListRepositoriesResponse}
 */
public final class ListRepositoriesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v2.ListRepositoriesResponse)
    ListRepositoriesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListRepositoriesResponse.newBuilder() to construct.
  private ListRepositoriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListRepositoriesResponse() {
    repositories_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListRepositoriesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return google.devtools.cloudbuild.v2.RepositoryManagerProto
        .internal_static_google_devtools_cloudbuild_v2_ListRepositoriesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return google.devtools.cloudbuild.v2.RepositoryManagerProto
        .internal_static_google_devtools_cloudbuild_v2_ListRepositoriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            google.devtools.cloudbuild.v2.ListRepositoriesResponse.class,
            google.devtools.cloudbuild.v2.ListRepositoriesResponse.Builder.class);
  }

  public static final int REPOSITORIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<google.devtools.cloudbuild.v2.Repository> repositories_;
  /**
   *
   *
   * <pre>
   * The list of Repositories.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  @java.lang.Override
  public java.util.List<google.devtools.cloudbuild.v2.Repository> getRepositoriesList() {
    return repositories_;
  }
  /**
   *
   *
   * <pre>
   * The list of Repositories.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends google.devtools.cloudbuild.v2.RepositoryOrBuilder>
      getRepositoriesOrBuilderList() {
    return repositories_;
  }
  /**
   *
   *
   * <pre>
   * The list of Repositories.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  @java.lang.Override
  public int getRepositoriesCount() {
    return repositories_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of Repositories.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  @java.lang.Override
  public google.devtools.cloudbuild.v2.Repository getRepositories(int index) {
    return repositories_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of Repositories.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  @java.lang.Override
  public google.devtools.cloudbuild.v2.RepositoryOrBuilder getRepositoriesOrBuilder(int index) {
    return repositories_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
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
   * A token identifying a page of results the server should return.
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
    for (int i = 0; i < repositories_.size(); i++) {
      output.writeMessage(1, repositories_.get(i));
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
    for (int i = 0; i < repositories_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, repositories_.get(i));
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
    if (!(obj instanceof google.devtools.cloudbuild.v2.ListRepositoriesResponse)) {
      return super.equals(obj);
    }
    google.devtools.cloudbuild.v2.ListRepositoriesResponse other =
        (google.devtools.cloudbuild.v2.ListRepositoriesResponse) obj;

    if (!getRepositoriesList().equals(other.getRepositoriesList())) return false;
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
    if (getRepositoriesCount() > 0) {
      hash = (37 * hash) + REPOSITORIES_FIELD_NUMBER;
      hash = (53 * hash) + getRepositoriesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse parseFrom(
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
      google.devtools.cloudbuild.v2.ListRepositoriesResponse prototype) {
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
   * Message for response to listing Repositories.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v2.ListRepositoriesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v2.ListRepositoriesResponse)
      google.devtools.cloudbuild.v2.ListRepositoriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_ListRepositoriesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_ListRepositoriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.devtools.cloudbuild.v2.ListRepositoriesResponse.class,
              google.devtools.cloudbuild.v2.ListRepositoriesResponse.Builder.class);
    }

    // Construct using google.devtools.cloudbuild.v2.ListRepositoriesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (repositoriesBuilder_ == null) {
        repositories_ = java.util.Collections.emptyList();
      } else {
        repositories_ = null;
        repositoriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_ListRepositoriesResponse_descriptor;
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.ListRepositoriesResponse getDefaultInstanceForType() {
      return google.devtools.cloudbuild.v2.ListRepositoriesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.ListRepositoriesResponse build() {
      google.devtools.cloudbuild.v2.ListRepositoriesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.ListRepositoriesResponse buildPartial() {
      google.devtools.cloudbuild.v2.ListRepositoriesResponse result =
          new google.devtools.cloudbuild.v2.ListRepositoriesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        google.devtools.cloudbuild.v2.ListRepositoriesResponse result) {
      if (repositoriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          repositories_ = java.util.Collections.unmodifiableList(repositories_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.repositories_ = repositories_;
      } else {
        result.repositories_ = repositoriesBuilder_.build();
      }
    }

    private void buildPartial0(google.devtools.cloudbuild.v2.ListRepositoriesResponse result) {
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
      if (other instanceof google.devtools.cloudbuild.v2.ListRepositoriesResponse) {
        return mergeFrom((google.devtools.cloudbuild.v2.ListRepositoriesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(google.devtools.cloudbuild.v2.ListRepositoriesResponse other) {
      if (other == google.devtools.cloudbuild.v2.ListRepositoriesResponse.getDefaultInstance())
        return this;
      if (repositoriesBuilder_ == null) {
        if (!other.repositories_.isEmpty()) {
          if (repositories_.isEmpty()) {
            repositories_ = other.repositories_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRepositoriesIsMutable();
            repositories_.addAll(other.repositories_);
          }
          onChanged();
        }
      } else {
        if (!other.repositories_.isEmpty()) {
          if (repositoriesBuilder_.isEmpty()) {
            repositoriesBuilder_.dispose();
            repositoriesBuilder_ = null;
            repositories_ = other.repositories_;
            bitField0_ = (bitField0_ & ~0x00000001);
            repositoriesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRepositoriesFieldBuilder()
                    : null;
          } else {
            repositoriesBuilder_.addAllMessages(other.repositories_);
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
                google.devtools.cloudbuild.v2.Repository m =
                    input.readMessage(
                        google.devtools.cloudbuild.v2.Repository.parser(), extensionRegistry);
                if (repositoriesBuilder_ == null) {
                  ensureRepositoriesIsMutable();
                  repositories_.add(m);
                } else {
                  repositoriesBuilder_.addMessage(m);
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

    private java.util.List<google.devtools.cloudbuild.v2.Repository> repositories_ =
        java.util.Collections.emptyList();

    private void ensureRepositoriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        repositories_ =
            new java.util.ArrayList<google.devtools.cloudbuild.v2.Repository>(repositories_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            google.devtools.cloudbuild.v2.Repository,
            google.devtools.cloudbuild.v2.Repository.Builder,
            google.devtools.cloudbuild.v2.RepositoryOrBuilder>
        repositoriesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public java.util.List<google.devtools.cloudbuild.v2.Repository> getRepositoriesList() {
      if (repositoriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(repositories_);
      } else {
        return repositoriesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public int getRepositoriesCount() {
      if (repositoriesBuilder_ == null) {
        return repositories_.size();
      } else {
        return repositoriesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public google.devtools.cloudbuild.v2.Repository getRepositories(int index) {
      if (repositoriesBuilder_ == null) {
        return repositories_.get(index);
      } else {
        return repositoriesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder setRepositories(int index, google.devtools.cloudbuild.v2.Repository value) {
      if (repositoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRepositoriesIsMutable();
        repositories_.set(index, value);
        onChanged();
      } else {
        repositoriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder setRepositories(
        int index, google.devtools.cloudbuild.v2.Repository.Builder builderForValue) {
      if (repositoriesBuilder_ == null) {
        ensureRepositoriesIsMutable();
        repositories_.set(index, builderForValue.build());
        onChanged();
      } else {
        repositoriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder addRepositories(google.devtools.cloudbuild.v2.Repository value) {
      if (repositoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRepositoriesIsMutable();
        repositories_.add(value);
        onChanged();
      } else {
        repositoriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder addRepositories(int index, google.devtools.cloudbuild.v2.Repository value) {
      if (repositoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRepositoriesIsMutable();
        repositories_.add(index, value);
        onChanged();
      } else {
        repositoriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder addRepositories(
        google.devtools.cloudbuild.v2.Repository.Builder builderForValue) {
      if (repositoriesBuilder_ == null) {
        ensureRepositoriesIsMutable();
        repositories_.add(builderForValue.build());
        onChanged();
      } else {
        repositoriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder addRepositories(
        int index, google.devtools.cloudbuild.v2.Repository.Builder builderForValue) {
      if (repositoriesBuilder_ == null) {
        ensureRepositoriesIsMutable();
        repositories_.add(index, builderForValue.build());
        onChanged();
      } else {
        repositoriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder addAllRepositories(
        java.lang.Iterable<? extends google.devtools.cloudbuild.v2.Repository> values) {
      if (repositoriesBuilder_ == null) {
        ensureRepositoriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, repositories_);
        onChanged();
      } else {
        repositoriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder clearRepositories() {
      if (repositoriesBuilder_ == null) {
        repositories_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        repositoriesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder removeRepositories(int index) {
      if (repositoriesBuilder_ == null) {
        ensureRepositoriesIsMutable();
        repositories_.remove(index);
        onChanged();
      } else {
        repositoriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public google.devtools.cloudbuild.v2.Repository.Builder getRepositoriesBuilder(int index) {
      return getRepositoriesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public google.devtools.cloudbuild.v2.RepositoryOrBuilder getRepositoriesOrBuilder(int index) {
      if (repositoriesBuilder_ == null) {
        return repositories_.get(index);
      } else {
        return repositoriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public java.util.List<? extends google.devtools.cloudbuild.v2.RepositoryOrBuilder>
        getRepositoriesOrBuilderList() {
      if (repositoriesBuilder_ != null) {
        return repositoriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(repositories_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public google.devtools.cloudbuild.v2.Repository.Builder addRepositoriesBuilder() {
      return getRepositoriesFieldBuilder()
          .addBuilder(google.devtools.cloudbuild.v2.Repository.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public google.devtools.cloudbuild.v2.Repository.Builder addRepositoriesBuilder(int index) {
      return getRepositoriesFieldBuilder()
          .addBuilder(index, google.devtools.cloudbuild.v2.Repository.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Repositories.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public java.util.List<google.devtools.cloudbuild.v2.Repository.Builder>
        getRepositoriesBuilderList() {
      return getRepositoriesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            google.devtools.cloudbuild.v2.Repository,
            google.devtools.cloudbuild.v2.Repository.Builder,
            google.devtools.cloudbuild.v2.RepositoryOrBuilder>
        getRepositoriesFieldBuilder() {
      if (repositoriesBuilder_ == null) {
        repositoriesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                google.devtools.cloudbuild.v2.Repository,
                google.devtools.cloudbuild.v2.Repository.Builder,
                google.devtools.cloudbuild.v2.RepositoryOrBuilder>(
                repositories_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        repositories_ = null;
      }
      return repositoriesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token identifying a page of results the server should return.
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
     * A token identifying a page of results the server should return.
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
     * A token identifying a page of results the server should return.
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
     * A token identifying a page of results the server should return.
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
     * A token identifying a page of results the server should return.
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v2.ListRepositoriesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v2.ListRepositoriesResponse)
  private static final google.devtools.cloudbuild.v2.ListRepositoriesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new google.devtools.cloudbuild.v2.ListRepositoriesResponse();
  }

  public static google.devtools.cloudbuild.v2.ListRepositoriesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRepositoriesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListRepositoriesResponse>() {
        @java.lang.Override
        public ListRepositoriesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRepositoriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRepositoriesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public google.devtools.cloudbuild.v2.ListRepositoriesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
