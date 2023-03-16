// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/page.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 * <pre>
 * The response message for
 * [Pages.ListPages][google.cloud.dialogflow.cx.v3beta1.Pages.ListPages].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListPagesResponse}
 */
public final class ListPagesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.ListPagesResponse)
    ListPagesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPagesResponse.newBuilder() to construct.
  private ListPagesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPagesResponse() {
    pages_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPagesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.PageProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.PageProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse.Builder.class);
  }

  public static final int PAGES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Page> pages_;
  /**
   * <pre>
   * The list of pages. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Page> getPagesList() {
    return pages_;
  }
  /**
   * <pre>
   * The list of pages. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.PageOrBuilder> 
      getPagesOrBuilderList() {
    return pages_;
  }
  /**
   * <pre>
   * The list of pages. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
   */
  @java.lang.Override
  public int getPagesCount() {
    return pages_.size();
  }
  /**
   * <pre>
   * The list of pages. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.Page getPages(int index) {
    return pages_.get(index);
  }
  /**
   * <pre>
   * The list of pages. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.PageOrBuilder getPagesOrBuilder(
      int index) {
    return pages_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
    for (int i = 0; i < pages_.size(); i++) {
      output.writeMessage(1, pages_.get(i));
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
    for (int i = 0; i < pages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, pages_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse other = (com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse) obj;

    if (!getPagesList()
        .equals(other.getPagesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getPagesCount() > 0) {
      hash = (37 * hash) + PAGES_FIELD_NUMBER;
      hash = (53 * hash) + getPagesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse prototype) {
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
   * The response message for
   * [Pages.ListPages][google.cloud.dialogflow.cx.v3beta1.Pages.ListPages].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListPagesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.ListPagesResponse)
      com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.PageProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.PageProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse.newBuilder()
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
      if (pagesBuilder_ == null) {
        pages_ = java.util.Collections.emptyList();
      } else {
        pages_ = null;
        pagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.PageProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse build() {
      com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse result = new com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse result) {
      if (pagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pages_ = java.util.Collections.unmodifiableList(pages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pages_ = pages_;
      } else {
        result.pages_ = pagesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse result) {
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse.getDefaultInstance()) return this;
      if (pagesBuilder_ == null) {
        if (!other.pages_.isEmpty()) {
          if (pages_.isEmpty()) {
            pages_ = other.pages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePagesIsMutable();
            pages_.addAll(other.pages_);
          }
          onChanged();
        }
      } else {
        if (!other.pages_.isEmpty()) {
          if (pagesBuilder_.isEmpty()) {
            pagesBuilder_.dispose();
            pagesBuilder_ = null;
            pages_ = other.pages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPagesFieldBuilder() : null;
          } else {
            pagesBuilder_.addAllMessages(other.pages_);
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
            case 10: {
              com.google.cloud.dialogflow.cx.v3beta1.Page m =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3beta1.Page.parser(),
                      extensionRegistry);
              if (pagesBuilder_ == null) {
                ensurePagesIsMutable();
                pages_.add(m);
              } else {
                pagesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Page> pages_ =
      java.util.Collections.emptyList();
    private void ensurePagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pages_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3beta1.Page>(pages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.Page, com.google.cloud.dialogflow.cx.v3beta1.Page.Builder, com.google.cloud.dialogflow.cx.v3beta1.PageOrBuilder> pagesBuilder_;

    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Page> getPagesList() {
      if (pagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pages_);
      } else {
        return pagesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public int getPagesCount() {
      if (pagesBuilder_ == null) {
        return pages_.size();
      } else {
        return pagesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Page getPages(int index) {
      if (pagesBuilder_ == null) {
        return pages_.get(index);
      } else {
        return pagesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public Builder setPages(
        int index, com.google.cloud.dialogflow.cx.v3beta1.Page value) {
      if (pagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePagesIsMutable();
        pages_.set(index, value);
        onChanged();
      } else {
        pagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public Builder setPages(
        int index, com.google.cloud.dialogflow.cx.v3beta1.Page.Builder builderForValue) {
      if (pagesBuilder_ == null) {
        ensurePagesIsMutable();
        pages_.set(index, builderForValue.build());
        onChanged();
      } else {
        pagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public Builder addPages(com.google.cloud.dialogflow.cx.v3beta1.Page value) {
      if (pagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePagesIsMutable();
        pages_.add(value);
        onChanged();
      } else {
        pagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public Builder addPages(
        int index, com.google.cloud.dialogflow.cx.v3beta1.Page value) {
      if (pagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePagesIsMutable();
        pages_.add(index, value);
        onChanged();
      } else {
        pagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public Builder addPages(
        com.google.cloud.dialogflow.cx.v3beta1.Page.Builder builderForValue) {
      if (pagesBuilder_ == null) {
        ensurePagesIsMutable();
        pages_.add(builderForValue.build());
        onChanged();
      } else {
        pagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public Builder addPages(
        int index, com.google.cloud.dialogflow.cx.v3beta1.Page.Builder builderForValue) {
      if (pagesBuilder_ == null) {
        ensurePagesIsMutable();
        pages_.add(index, builderForValue.build());
        onChanged();
      } else {
        pagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public Builder addAllPages(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3beta1.Page> values) {
      if (pagesBuilder_ == null) {
        ensurePagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pages_);
        onChanged();
      } else {
        pagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public Builder clearPages() {
      if (pagesBuilder_ == null) {
        pages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public Builder removePages(int index) {
      if (pagesBuilder_ == null) {
        ensurePagesIsMutable();
        pages_.remove(index);
        onChanged();
      } else {
        pagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Page.Builder getPagesBuilder(
        int index) {
      return getPagesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.PageOrBuilder getPagesOrBuilder(
        int index) {
      if (pagesBuilder_ == null) {
        return pages_.get(index);  } else {
        return pagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.PageOrBuilder> 
         getPagesOrBuilderList() {
      if (pagesBuilder_ != null) {
        return pagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pages_);
      }
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Page.Builder addPagesBuilder() {
      return getPagesFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.cx.v3beta1.Page.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Page.Builder addPagesBuilder(
        int index) {
      return getPagesFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.cx.v3beta1.Page.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of pages. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Page.Builder> 
         getPagesBuilderList() {
      return getPagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.Page, com.google.cloud.dialogflow.cx.v3beta1.Page.Builder, com.google.cloud.dialogflow.cx.v3beta1.PageOrBuilder> 
        getPagesFieldBuilder() {
      if (pagesBuilder_ == null) {
        pagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.Page, com.google.cloud.dialogflow.cx.v3beta1.Page.Builder, com.google.cloud.dialogflow.cx.v3beta1.PageOrBuilder>(
                pages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pages_ = null;
      }
      return pagesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.ListPagesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ListPagesResponse)
  private static final com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPagesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPagesResponse>() {
    @java.lang.Override
    public ListPagesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPagesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPagesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ListPagesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

