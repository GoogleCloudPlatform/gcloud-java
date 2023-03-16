// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1alpha/metastore.proto

package com.google.cloud.metastore.v1alpha;

/**
 * <pre>
 * Request message for
 * [DataprocMetastore.QueryMetadata][google.cloud.metastore.v1alpha.DataprocMetastore.QueryMetadata].
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1alpha.QueryMetadataRequest}
 */
public final class QueryMetadataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1alpha.QueryMetadataRequest)
    QueryMetadataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryMetadataRequest.newBuilder() to construct.
  private QueryMetadataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryMetadataRequest() {
    service_ = "";
    query_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryMetadataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_QueryMetadataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_QueryMetadataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1alpha.QueryMetadataRequest.class, com.google.cloud.metastore.v1alpha.QueryMetadataRequest.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object service_ = "";
  /**
   * <pre>
   * Required. The relative resource name of the metastore service to query
   * metadata, in the following format:
   * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The relative resource name of the metastore service to query
   * metadata, in the following format:
   * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object query_ = "";
  /**
   * <pre>
   * Required. A read-only SQL query to execute against the metadata database.
   * The query cannot change or mutate the data.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The query.
   */
  @java.lang.Override
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. A read-only SQL query to execute against the metadata database.
   * The query cannot change or mutate the data.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for query.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      query_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, query_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, query_);
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
    if (!(obj instanceof com.google.cloud.metastore.v1alpha.QueryMetadataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1alpha.QueryMetadataRequest other = (com.google.cloud.metastore.v1alpha.QueryMetadataRequest) obj;

    if (!getService()
        .equals(other.getService())) return false;
    if (!getQuery()
        .equals(other.getQuery())) return false;
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
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.metastore.v1alpha.QueryMetadataRequest prototype) {
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
   * [DataprocMetastore.QueryMetadata][google.cloud.metastore.v1alpha.DataprocMetastore.QueryMetadata].
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1alpha.QueryMetadataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1alpha.QueryMetadataRequest)
      com.google.cloud.metastore.v1alpha.QueryMetadataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_QueryMetadataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_QueryMetadataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1alpha.QueryMetadataRequest.class, com.google.cloud.metastore.v1alpha.QueryMetadataRequest.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1alpha.QueryMetadataRequest.newBuilder()
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
      service_ = "";
      query_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_QueryMetadataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.QueryMetadataRequest getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1alpha.QueryMetadataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.QueryMetadataRequest build() {
      com.google.cloud.metastore.v1alpha.QueryMetadataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.QueryMetadataRequest buildPartial() {
      com.google.cloud.metastore.v1alpha.QueryMetadataRequest result = new com.google.cloud.metastore.v1alpha.QueryMetadataRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.metastore.v1alpha.QueryMetadataRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.service_ = service_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.query_ = query_;
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
      if (other instanceof com.google.cloud.metastore.v1alpha.QueryMetadataRequest) {
        return mergeFrom((com.google.cloud.metastore.v1alpha.QueryMetadataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1alpha.QueryMetadataRequest other) {
      if (other == com.google.cloud.metastore.v1alpha.QueryMetadataRequest.getDefaultInstance()) return this;
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
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
              service_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              query_ = input.readStringRequireUtf8();
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

    private java.lang.Object service_ = "";
    /**
     * <pre>
     * Required. The relative resource name of the metastore service to query
     * metadata, in the following format:
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The relative resource name of the metastore service to query
     * metadata, in the following format:
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The relative resource name of the metastore service to query
     * metadata, in the following format:
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      service_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The relative resource name of the metastore service to query
     * metadata, in the following format:
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearService() {
      service_ = getDefaultInstance().getService();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The relative resource name of the metastore service to query
     * metadata, in the following format:
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      service_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object query_ = "";
    /**
     * <pre>
     * Required. A read-only SQL query to execute against the metadata database.
     * The query cannot change or mutate the data.
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The query.
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. A read-only SQL query to execute against the metadata database.
     * The query cannot change or mutate the data.
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for query.
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. A read-only SQL query to execute against the metadata database.
     * The query cannot change or mutate the data.
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      query_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A read-only SQL query to execute against the metadata database.
     * The query cannot change or mutate the data.
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuery() {
      query_ = getDefaultInstance().getQuery();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A read-only SQL query to execute against the metadata database.
     * The query cannot change or mutate the data.
     * </pre>
     *
     * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      query_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1alpha.QueryMetadataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1alpha.QueryMetadataRequest)
  private static final com.google.cloud.metastore.v1alpha.QueryMetadataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1alpha.QueryMetadataRequest();
  }

  public static com.google.cloud.metastore.v1alpha.QueryMetadataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryMetadataRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryMetadataRequest>() {
    @java.lang.Override
    public QueryMetadataRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryMetadataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryMetadataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.QueryMetadataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

