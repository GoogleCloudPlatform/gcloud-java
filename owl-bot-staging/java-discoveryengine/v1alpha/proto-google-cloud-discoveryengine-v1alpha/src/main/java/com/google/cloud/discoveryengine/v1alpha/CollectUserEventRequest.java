// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1alpha/user_event_service.proto

package com.google.cloud.discoveryengine.v1alpha;

/**
 * <pre>
 * Request message for CollectUserEvent method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1alpha.CollectUserEventRequest}
 */
public final class CollectUserEventRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1alpha.CollectUserEventRequest)
    CollectUserEventRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CollectUserEventRequest.newBuilder() to construct.
  private CollectUserEventRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CollectUserEventRequest() {
    parent_ = "";
    userEvent_ = "";
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CollectUserEventRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.discoveryengine.v1alpha.UserEventServiceProto.internal_static_google_cloud_discoveryengine_v1alpha_CollectUserEventRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1alpha.UserEventServiceProto.internal_static_google_cloud_discoveryengine_v1alpha_CollectUserEventRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest.class, com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent DataStore resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
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
   * Required. The parent DataStore resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
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

  public static final int USER_EVENT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userEvent_ = "";
  /**
   * <pre>
   * Required. URL encoded UserEvent proto with a length limit of 2,000,000
   * characters.
   * </pre>
   *
   * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The userEvent.
   */
  @java.lang.Override
  public java.lang.String getUserEvent() {
    java.lang.Object ref = userEvent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userEvent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. URL encoded UserEvent proto with a length limit of 2,000,000
   * characters.
   * </pre>
   *
   * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for userEvent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserEventBytes() {
    java.lang.Object ref = userEvent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userEvent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <pre>
   * The URL including cgi-parameters but excluding the hash fragment with a
   * length limit of 5,000 characters. This is often more useful than the
   * referer URL, because many browsers only send the domain for third-party
   * requests.
   * </pre>
   *
   * <code>optional string uri = 3;</code>
   * @return Whether the uri field is set.
   */
  @java.lang.Override
  public boolean hasUri() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The URL including cgi-parameters but excluding the hash fragment with a
   * length limit of 5,000 characters. This is often more useful than the
   * referer URL, because many browsers only send the domain for third-party
   * requests.
   * </pre>
   *
   * <code>optional string uri = 3;</code>
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The URL including cgi-parameters but excluding the hash fragment with a
   * length limit of 5,000 characters. This is often more useful than the
   * referer URL, because many browsers only send the domain for third-party
   * requests.
   * </pre>
   *
   * <code>optional string uri = 3;</code>
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ETS_FIELD_NUMBER = 4;
  private long ets_ = 0L;
  /**
   * <pre>
   * The event timestamp in milliseconds. This prevents browser caching of
   * otherwise identical get requests. The name is abbreviated to reduce the
   * payload bytes.
   * </pre>
   *
   * <code>optional int64 ets = 4;</code>
   * @return Whether the ets field is set.
   */
  @java.lang.Override
  public boolean hasEts() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The event timestamp in milliseconds. This prevents browser caching of
   * otherwise identical get requests. The name is abbreviated to reduce the
   * payload bytes.
   * </pre>
   *
   * <code>optional int64 ets = 4;</code>
   * @return The ets.
   */
  @java.lang.Override
  public long getEts() {
    return ets_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userEvent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userEvent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uri_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(4, ets_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userEvent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userEvent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uri_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, ets_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest other = (com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getUserEvent()
        .equals(other.getUserEvent())) return false;
    if (hasUri() != other.hasUri()) return false;
    if (hasUri()) {
      if (!getUri()
          .equals(other.getUri())) return false;
    }
    if (hasEts() != other.hasEts()) return false;
    if (hasEts()) {
      if (getEts()
          != other.getEts()) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + USER_EVENT_FIELD_NUMBER;
    hash = (53 * hash) + getUserEvent().hashCode();
    if (hasUri()) {
      hash = (37 * hash) + URI_FIELD_NUMBER;
      hash = (53 * hash) + getUri().hashCode();
    }
    if (hasEts()) {
      hash = (37 * hash) + ETS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEts());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest prototype) {
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
   * Request message for CollectUserEvent method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1alpha.CollectUserEventRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1alpha.CollectUserEventRequest)
      com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.discoveryengine.v1alpha.UserEventServiceProto.internal_static_google_cloud_discoveryengine_v1alpha_CollectUserEventRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1alpha.UserEventServiceProto.internal_static_google_cloud_discoveryengine_v1alpha_CollectUserEventRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest.class, com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest.newBuilder()
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
      userEvent_ = "";
      uri_ = "";
      ets_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1alpha.UserEventServiceProto.internal_static_google_cloud_discoveryengine_v1alpha_CollectUserEventRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest build() {
      com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest buildPartial() {
      com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest result = new com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userEvent_ = userEvent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.uri_ = uri_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.ets_ = ets_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest) {
        return mergeFrom((com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest other) {
      if (other == com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUserEvent().isEmpty()) {
        userEvent_ = other.userEvent_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasUri()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasEts()) {
        setEts(other.getEts());
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
              userEvent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              uri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              ets_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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
     * Required. The parent DataStore resource name, such as
     * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
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
     * Required. The parent DataStore resource name, such as
     * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
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
     * Required. The parent DataStore resource name, such as
     * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
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
     * Required. The parent DataStore resource name, such as
     * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
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
     * Required. The parent DataStore resource name, such as
     * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
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

    private java.lang.Object userEvent_ = "";
    /**
     * <pre>
     * Required. URL encoded UserEvent proto with a length limit of 2,000,000
     * characters.
     * </pre>
     *
     * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The userEvent.
     */
    public java.lang.String getUserEvent() {
      java.lang.Object ref = userEvent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userEvent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. URL encoded UserEvent proto with a length limit of 2,000,000
     * characters.
     * </pre>
     *
     * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for userEvent.
     */
    public com.google.protobuf.ByteString
        getUserEventBytes() {
      java.lang.Object ref = userEvent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userEvent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. URL encoded UserEvent proto with a length limit of 2,000,000
     * characters.
     * </pre>
     *
     * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The userEvent to set.
     * @return This builder for chaining.
     */
    public Builder setUserEvent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userEvent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. URL encoded UserEvent proto with a length limit of 2,000,000
     * characters.
     * </pre>
     *
     * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserEvent() {
      userEvent_ = getDefaultInstance().getUserEvent();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. URL encoded UserEvent proto with a length limit of 2,000,000
     * characters.
     * </pre>
     *
     * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for userEvent to set.
     * @return This builder for chaining.
     */
    public Builder setUserEventBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userEvent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * The URL including cgi-parameters but excluding the hash fragment with a
     * length limit of 5,000 characters. This is often more useful than the
     * referer URL, because many browsers only send the domain for third-party
     * requests.
     * </pre>
     *
     * <code>optional string uri = 3;</code>
     * @return Whether the uri field is set.
     */
    public boolean hasUri() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The URL including cgi-parameters but excluding the hash fragment with a
     * length limit of 5,000 characters. This is often more useful than the
     * referer URL, because many browsers only send the domain for third-party
     * requests.
     * </pre>
     *
     * <code>optional string uri = 3;</code>
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URL including cgi-parameters but excluding the hash fragment with a
     * length limit of 5,000 characters. This is often more useful than the
     * referer URL, because many browsers only send the domain for third-party
     * requests.
     * </pre>
     *
     * <code>optional string uri = 3;</code>
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URL including cgi-parameters but excluding the hash fragment with a
     * length limit of 5,000 characters. This is often more useful than the
     * referer URL, because many browsers only send the domain for third-party
     * requests.
     * </pre>
     *
     * <code>optional string uri = 3;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL including cgi-parameters but excluding the hash fragment with a
     * length limit of 5,000 characters. This is often more useful than the
     * referer URL, because many browsers only send the domain for third-party
     * requests.
     * </pre>
     *
     * <code>optional string uri = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL including cgi-parameters but excluding the hash fragment with a
     * length limit of 5,000 characters. This is often more useful than the
     * referer URL, because many browsers only send the domain for third-party
     * requests.
     * </pre>
     *
     * <code>optional string uri = 3;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long ets_ ;
    /**
     * <pre>
     * The event timestamp in milliseconds. This prevents browser caching of
     * otherwise identical get requests. The name is abbreviated to reduce the
     * payload bytes.
     * </pre>
     *
     * <code>optional int64 ets = 4;</code>
     * @return Whether the ets field is set.
     */
    @java.lang.Override
    public boolean hasEts() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The event timestamp in milliseconds. This prevents browser caching of
     * otherwise identical get requests. The name is abbreviated to reduce the
     * payload bytes.
     * </pre>
     *
     * <code>optional int64 ets = 4;</code>
     * @return The ets.
     */
    @java.lang.Override
    public long getEts() {
      return ets_;
    }
    /**
     * <pre>
     * The event timestamp in milliseconds. This prevents browser caching of
     * otherwise identical get requests. The name is abbreviated to reduce the
     * payload bytes.
     * </pre>
     *
     * <code>optional int64 ets = 4;</code>
     * @param value The ets to set.
     * @return This builder for chaining.
     */
    public Builder setEts(long value) {

      ets_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The event timestamp in milliseconds. This prevents browser caching of
     * otherwise identical get requests. The name is abbreviated to reduce the
     * payload bytes.
     * </pre>
     *
     * <code>optional int64 ets = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEts() {
      bitField0_ = (bitField0_ & ~0x00000008);
      ets_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1alpha.CollectUserEventRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1alpha.CollectUserEventRequest)
  private static final com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest();
  }

  public static com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CollectUserEventRequest>
      PARSER = new com.google.protobuf.AbstractParser<CollectUserEventRequest>() {
    @java.lang.Override
    public CollectUserEventRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CollectUserEventRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CollectUserEventRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.CollectUserEventRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

