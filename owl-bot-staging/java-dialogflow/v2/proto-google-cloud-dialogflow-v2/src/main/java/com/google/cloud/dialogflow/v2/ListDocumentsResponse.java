// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/document.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * Response message for
 * [Documents.ListDocuments][google.cloud.dialogflow.v2.Documents.ListDocuments].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ListDocumentsResponse}
 */
public final class ListDocumentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ListDocumentsResponse)
    ListDocumentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDocumentsResponse.newBuilder() to construct.
  private ListDocumentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDocumentsResponse() {
    documents_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDocumentsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.DocumentProto.internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.DocumentProto.internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ListDocumentsResponse.class, com.google.cloud.dialogflow.v2.ListDocumentsResponse.Builder.class);
  }

  public static final int DOCUMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.v2.Document> documents_;
  /**
   * <pre>
   * The list of documents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2.Document> getDocumentsList() {
    return documents_;
  }
  /**
   * <pre>
   * The list of documents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2.DocumentOrBuilder> 
      getDocumentsOrBuilderList() {
    return documents_;
  }
  /**
   * <pre>
   * The list of documents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
   */
  @java.lang.Override
  public int getDocumentsCount() {
    return documents_.size();
  }
  /**
   * <pre>
   * The list of documents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Document getDocuments(int index) {
    return documents_.get(index);
  }
  /**
   * <pre>
   * The list of documents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.DocumentOrBuilder getDocumentsOrBuilder(
      int index) {
    return documents_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
    for (int i = 0; i < documents_.size(); i++) {
      output.writeMessage(1, documents_.get(i));
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
    for (int i = 0; i < documents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, documents_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ListDocumentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ListDocumentsResponse other = (com.google.cloud.dialogflow.v2.ListDocumentsResponse) obj;

    if (!getDocumentsList()
        .equals(other.getDocumentsList())) return false;
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
    if (getDocumentsCount() > 0) {
      hash = (37 * hash) + DOCUMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getDocumentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.ListDocumentsResponse prototype) {
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
   * Response message for
   * [Documents.ListDocuments][google.cloud.dialogflow.v2.Documents.ListDocuments].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ListDocumentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ListDocumentsResponse)
      com.google.cloud.dialogflow.v2.ListDocumentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.DocumentProto.internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.DocumentProto.internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ListDocumentsResponse.class, com.google.cloud.dialogflow.v2.ListDocumentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.ListDocumentsResponse.newBuilder()
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
      if (documentsBuilder_ == null) {
        documents_ = java.util.Collections.emptyList();
      } else {
        documents_ = null;
        documentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.DocumentProto.internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListDocumentsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ListDocumentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListDocumentsResponse build() {
      com.google.cloud.dialogflow.v2.ListDocumentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListDocumentsResponse buildPartial() {
      com.google.cloud.dialogflow.v2.ListDocumentsResponse result = new com.google.cloud.dialogflow.v2.ListDocumentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.v2.ListDocumentsResponse result) {
      if (documentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          documents_ = java.util.Collections.unmodifiableList(documents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.documents_ = documents_;
      } else {
        result.documents_ = documentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.ListDocumentsResponse result) {
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
      if (other instanceof com.google.cloud.dialogflow.v2.ListDocumentsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2.ListDocumentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.ListDocumentsResponse other) {
      if (other == com.google.cloud.dialogflow.v2.ListDocumentsResponse.getDefaultInstance()) return this;
      if (documentsBuilder_ == null) {
        if (!other.documents_.isEmpty()) {
          if (documents_.isEmpty()) {
            documents_ = other.documents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDocumentsIsMutable();
            documents_.addAll(other.documents_);
          }
          onChanged();
        }
      } else {
        if (!other.documents_.isEmpty()) {
          if (documentsBuilder_.isEmpty()) {
            documentsBuilder_.dispose();
            documentsBuilder_ = null;
            documents_ = other.documents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            documentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDocumentsFieldBuilder() : null;
          } else {
            documentsBuilder_.addAllMessages(other.documents_);
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
              com.google.cloud.dialogflow.v2.Document m =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2.Document.parser(),
                      extensionRegistry);
              if (documentsBuilder_ == null) {
                ensureDocumentsIsMutable();
                documents_.add(m);
              } else {
                documentsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dialogflow.v2.Document> documents_ =
      java.util.Collections.emptyList();
    private void ensureDocumentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        documents_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2.Document>(documents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2.Document, com.google.cloud.dialogflow.v2.Document.Builder, com.google.cloud.dialogflow.v2.DocumentOrBuilder> documentsBuilder_;

    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.Document> getDocumentsList() {
      if (documentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(documents_);
      } else {
        return documentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public int getDocumentsCount() {
      if (documentsBuilder_ == null) {
        return documents_.size();
      } else {
        return documentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.Document getDocuments(int index) {
      if (documentsBuilder_ == null) {
        return documents_.get(index);
      } else {
        return documentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public Builder setDocuments(
        int index, com.google.cloud.dialogflow.v2.Document value) {
      if (documentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentsIsMutable();
        documents_.set(index, value);
        onChanged();
      } else {
        documentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public Builder setDocuments(
        int index, com.google.cloud.dialogflow.v2.Document.Builder builderForValue) {
      if (documentsBuilder_ == null) {
        ensureDocumentsIsMutable();
        documents_.set(index, builderForValue.build());
        onChanged();
      } else {
        documentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public Builder addDocuments(com.google.cloud.dialogflow.v2.Document value) {
      if (documentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentsIsMutable();
        documents_.add(value);
        onChanged();
      } else {
        documentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public Builder addDocuments(
        int index, com.google.cloud.dialogflow.v2.Document value) {
      if (documentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentsIsMutable();
        documents_.add(index, value);
        onChanged();
      } else {
        documentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public Builder addDocuments(
        com.google.cloud.dialogflow.v2.Document.Builder builderForValue) {
      if (documentsBuilder_ == null) {
        ensureDocumentsIsMutable();
        documents_.add(builderForValue.build());
        onChanged();
      } else {
        documentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public Builder addDocuments(
        int index, com.google.cloud.dialogflow.v2.Document.Builder builderForValue) {
      if (documentsBuilder_ == null) {
        ensureDocumentsIsMutable();
        documents_.add(index, builderForValue.build());
        onChanged();
      } else {
        documentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public Builder addAllDocuments(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2.Document> values) {
      if (documentsBuilder_ == null) {
        ensureDocumentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, documents_);
        onChanged();
      } else {
        documentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public Builder clearDocuments() {
      if (documentsBuilder_ == null) {
        documents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        documentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public Builder removeDocuments(int index) {
      if (documentsBuilder_ == null) {
        ensureDocumentsIsMutable();
        documents_.remove(index);
        onChanged();
      } else {
        documentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.Document.Builder getDocumentsBuilder(
        int index) {
      return getDocumentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.DocumentOrBuilder getDocumentsOrBuilder(
        int index) {
      if (documentsBuilder_ == null) {
        return documents_.get(index);  } else {
        return documentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2.DocumentOrBuilder> 
         getDocumentsOrBuilderList() {
      if (documentsBuilder_ != null) {
        return documentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(documents_);
      }
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.Document.Builder addDocumentsBuilder() {
      return getDocumentsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.v2.Document.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.Document.Builder addDocumentsBuilder(
        int index) {
      return getDocumentsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.v2.Document.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of documents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Document documents = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.Document.Builder> 
         getDocumentsBuilderList() {
      return getDocumentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2.Document, com.google.cloud.dialogflow.v2.Document.Builder, com.google.cloud.dialogflow.v2.DocumentOrBuilder> 
        getDocumentsFieldBuilder() {
      if (documentsBuilder_ == null) {
        documentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.Document, com.google.cloud.dialogflow.v2.Document.Builder, com.google.cloud.dialogflow.v2.DocumentOrBuilder>(
                documents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        documents_ = null;
      }
      return documentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ListDocumentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ListDocumentsResponse)
  private static final com.google.cloud.dialogflow.v2.ListDocumentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ListDocumentsResponse();
  }

  public static com.google.cloud.dialogflow.v2.ListDocumentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDocumentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDocumentsResponse>() {
    @java.lang.Override
    public ListDocumentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDocumentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDocumentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ListDocumentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

