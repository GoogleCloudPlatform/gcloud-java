// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/enterpriseknowledgegraph/v1/service.proto

package com.google.cloud.enterpriseknowledgegraph.v1;

/**
 * <pre>
 * Request message for
 * [EnterpriseKnowledgeGraphService.Lookup][google.cloud.enterpriseknowledgegraph.v1.EnterpriseKnowledgeGraphService.Lookup].
 * </pre>
 *
 * Protobuf type {@code google.cloud.enterpriseknowledgegraph.v1.LookupRequest}
 */
public final class LookupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.enterpriseknowledgegraph.v1.LookupRequest)
    LookupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LookupRequest.newBuilder() to construct.
  private LookupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LookupRequest() {
    parent_ = "";
    ids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    languages_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LookupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto.internal_static_google_cloud_enterpriseknowledgegraph_v1_LookupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto.internal_static_google_cloud_enterpriseknowledgegraph_v1_LookupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest.class, com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The name of the Entity's parent resource.
   * Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the Entity's parent resource.
   * Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList ids_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Required. The list of entity ids to be used for lookup.
   * </pre>
   *
   * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the ids.
   */
  public com.google.protobuf.ProtocolStringList
      getIdsList() {
    return ids_;
  }
  /**
   * <pre>
   * Required. The list of entity ids to be used for lookup.
   * </pre>
   *
   * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of ids.
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <pre>
   * Required. The list of entity ids to be used for lookup.
   * </pre>
   *
   * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  public java.lang.String getIds(int index) {
    return ids_.get(index);
  }
  /**
   * <pre>
   * Required. The list of entity ids to be used for lookup.
   * </pre>
   *
   * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  public com.google.protobuf.ByteString
      getIdsBytes(int index) {
    return ids_.getByteString(index);
  }

  public static final int LANGUAGES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList languages_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The list of language codes (defined in ISO 693) to run the query with,
   * e.g. 'en'.
   * </pre>
   *
   * <code>repeated string languages = 3;</code>
   * @return A list containing the languages.
   */
  public com.google.protobuf.ProtocolStringList
      getLanguagesList() {
    return languages_;
  }
  /**
   * <pre>
   * The list of language codes (defined in ISO 693) to run the query with,
   * e.g. 'en'.
   * </pre>
   *
   * <code>repeated string languages = 3;</code>
   * @return The count of languages.
   */
  public int getLanguagesCount() {
    return languages_.size();
  }
  /**
   * <pre>
   * The list of language codes (defined in ISO 693) to run the query with,
   * e.g. 'en'.
   * </pre>
   *
   * <code>repeated string languages = 3;</code>
   * @param index The index of the element to return.
   * @return The languages at the given index.
   */
  public java.lang.String getLanguages(int index) {
    return languages_.get(index);
  }
  /**
   * <pre>
   * The list of language codes (defined in ISO 693) to run the query with,
   * e.g. 'en'.
   * </pre>
   *
   * <code>repeated string languages = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languages at the given index.
   */
  public com.google.protobuf.ByteString
      getLanguagesBytes(int index) {
    return languages_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < ids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ids_.getRaw(i));
    }
    for (int i = 0; i < languages_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, languages_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += computeStringSizeNoTag(ids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIdsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < languages_.size(); i++) {
        dataSize += computeStringSizeNoTag(languages_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLanguagesList().size();
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
    if (!(obj instanceof com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest other = (com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getIdsList()
        .equals(other.getIdsList())) return false;
    if (!getLanguagesList()
        .equals(other.getLanguagesList())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (getIdsCount() > 0) {
      hash = (37 * hash) + IDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdsList().hashCode();
    }
    if (getLanguagesCount() > 0) {
      hash = (37 * hash) + LANGUAGES_FIELD_NUMBER;
      hash = (53 * hash) + getLanguagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest prototype) {
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
   * Request message for
   * [EnterpriseKnowledgeGraphService.Lookup][google.cloud.enterpriseknowledgegraph.v1.EnterpriseKnowledgeGraphService.Lookup].
   * </pre>
   *
   * Protobuf type {@code google.cloud.enterpriseknowledgegraph.v1.LookupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.enterpriseknowledgegraph.v1.LookupRequest)
      com.google.cloud.enterpriseknowledgegraph.v1.LookupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto.internal_static_google_cloud_enterpriseknowledgegraph_v1_LookupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto.internal_static_google_cloud_enterpriseknowledgegraph_v1_LookupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest.class, com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest.Builder.class);
    }

    // Construct using com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest.newBuilder()
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
      parent_ = "";
      ids_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      languages_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto.internal_static_google_cloud_enterpriseknowledgegraph_v1_LookupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest getDefaultInstanceForType() {
      return com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest build() {
      com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest buildPartial() {
      com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest result = new com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        ids_.makeImmutable();
        result.ids_ = ids_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        languages_.makeImmutable();
        result.languages_ = languages_;
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
      if (other instanceof com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest) {
        return mergeFrom((com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest other) {
      if (other == com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.ids_.isEmpty()) {
        if (ids_.isEmpty()) {
          ids_ = other.ids_;
          bitField0_ |= 0x00000002;
        } else {
          ensureIdsIsMutable();
          ids_.addAll(other.ids_);
        }
        onChanged();
      }
      if (!other.languages_.isEmpty()) {
        if (languages_.isEmpty()) {
          languages_ = other.languages_;
          bitField0_ |= 0x00000004;
        } else {
          ensureLanguagesIsMutable();
          languages_.addAll(other.languages_);
        }
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureIdsIsMutable();
              ids_.add(s);
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureLanguagesIsMutable();
              languages_.add(s);
              break;
            } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The name of the Entity's parent resource.
     * Format:
     * `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the Entity's parent resource.
     * Format:
     * `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the Entity's parent resource.
     * Format:
     * `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the Entity's parent resource.
     * Format:
     * `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the Entity's parent resource.
     * Format:
     * `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList ids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureIdsIsMutable() {
      if (!ids_.isModifiable()) {
        ids_ = new com.google.protobuf.LazyStringArrayList(ids_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Required. The list of entity ids to be used for lookup.
     * </pre>
     *
     * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the ids.
     */
    public com.google.protobuf.ProtocolStringList
        getIdsList() {
      ids_.makeImmutable();
      return ids_;
    }
    /**
     * <pre>
     * Required. The list of entity ids to be used for lookup.
     * </pre>
     *
     * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of ids.
     */
    public int getIdsCount() {
      return ids_.size();
    }
    /**
     * <pre>
     * Required. The list of entity ids to be used for lookup.
     * </pre>
     *
     * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The ids at the given index.
     */
    public java.lang.String getIds(int index) {
      return ids_.get(index);
    }
    /**
     * <pre>
     * Required. The list of entity ids to be used for lookup.
     * </pre>
     *
     * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the ids at the given index.
     */
    public com.google.protobuf.ByteString
        getIdsBytes(int index) {
      return ids_.getByteString(index);
    }
    /**
     * <pre>
     * Required. The list of entity ids to be used for lookup.
     * </pre>
     *
     * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The ids to set.
     * @return This builder for chaining.
     */
    public Builder setIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureIdsIsMutable();
      ids_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of entity ids to be used for lookup.
     * </pre>
     *
     * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The ids to add.
     * @return This builder for chaining.
     */
    public Builder addIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureIdsIsMutable();
      ids_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of entity ids to be used for lookup.
     * </pre>
     *
     * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The ids to add.
     * @return This builder for chaining.
     */
    public Builder addAllIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ids_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of entity ids to be used for lookup.
     * </pre>
     *
     * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearIds() {
      ids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of entity ids to be used for lookup.
     * </pre>
     *
     * <code>repeated string ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the ids to add.
     * @return This builder for chaining.
     */
    public Builder addIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureIdsIsMutable();
      ids_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList languages_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureLanguagesIsMutable() {
      if (!languages_.isModifiable()) {
        languages_ = new com.google.protobuf.LazyStringArrayList(languages_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * The list of language codes (defined in ISO 693) to run the query with,
     * e.g. 'en'.
     * </pre>
     *
     * <code>repeated string languages = 3;</code>
     * @return A list containing the languages.
     */
    public com.google.protobuf.ProtocolStringList
        getLanguagesList() {
      languages_.makeImmutable();
      return languages_;
    }
    /**
     * <pre>
     * The list of language codes (defined in ISO 693) to run the query with,
     * e.g. 'en'.
     * </pre>
     *
     * <code>repeated string languages = 3;</code>
     * @return The count of languages.
     */
    public int getLanguagesCount() {
      return languages_.size();
    }
    /**
     * <pre>
     * The list of language codes (defined in ISO 693) to run the query with,
     * e.g. 'en'.
     * </pre>
     *
     * <code>repeated string languages = 3;</code>
     * @param index The index of the element to return.
     * @return The languages at the given index.
     */
    public java.lang.String getLanguages(int index) {
      return languages_.get(index);
    }
    /**
     * <pre>
     * The list of language codes (defined in ISO 693) to run the query with,
     * e.g. 'en'.
     * </pre>
     *
     * <code>repeated string languages = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the languages at the given index.
     */
    public com.google.protobuf.ByteString
        getLanguagesBytes(int index) {
      return languages_.getByteString(index);
    }
    /**
     * <pre>
     * The list of language codes (defined in ISO 693) to run the query with,
     * e.g. 'en'.
     * </pre>
     *
     * <code>repeated string languages = 3;</code>
     * @param index The index to set the value at.
     * @param value The languages to set.
     * @return This builder for chaining.
     */
    public Builder setLanguages(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureLanguagesIsMutable();
      languages_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of language codes (defined in ISO 693) to run the query with,
     * e.g. 'en'.
     * </pre>
     *
     * <code>repeated string languages = 3;</code>
     * @param value The languages to add.
     * @return This builder for chaining.
     */
    public Builder addLanguages(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureLanguagesIsMutable();
      languages_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of language codes (defined in ISO 693) to run the query with,
     * e.g. 'en'.
     * </pre>
     *
     * <code>repeated string languages = 3;</code>
     * @param values The languages to add.
     * @return This builder for chaining.
     */
    public Builder addAllLanguages(
        java.lang.Iterable<java.lang.String> values) {
      ensureLanguagesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, languages_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of language codes (defined in ISO 693) to run the query with,
     * e.g. 'en'.
     * </pre>
     *
     * <code>repeated string languages = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguages() {
      languages_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of language codes (defined in ISO 693) to run the query with,
     * e.g. 'en'.
     * </pre>
     *
     * <code>repeated string languages = 3;</code>
     * @param value The bytes of the languages to add.
     * @return This builder for chaining.
     */
    public Builder addLanguagesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureLanguagesIsMutable();
      languages_.add(value);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.enterpriseknowledgegraph.v1.LookupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.enterpriseknowledgegraph.v1.LookupRequest)
  private static final com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest();
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LookupRequest>
      PARSER = new com.google.protobuf.AbstractParser<LookupRequest>() {
    @java.lang.Override
    public LookupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<LookupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LookupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.enterpriseknowledgegraph.v1.LookupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

