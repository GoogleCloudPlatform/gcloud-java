// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1beta1/cloud_redis.proto

package com.google.cloud.redis.v1beta1;

/**
 * <pre>
 * Request for [CreateInstance][google.cloud.redis.v1beta1.CloudRedis.CreateInstance].
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.v1beta1.CreateInstanceRequest}
 */
public final class CreateInstanceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.v1beta1.CreateInstanceRequest)
    CreateInstanceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateInstanceRequest.newBuilder() to construct.
  private CreateInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateInstanceRequest() {
    parent_ = "";
    instanceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateInstanceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.internal_static_google_cloud_redis_v1beta1_CreateInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.internal_static_google_cloud_redis_v1beta1_CreateInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.v1beta1.CreateInstanceRequest.class, com.google.cloud.redis.v1beta1.CreateInstanceRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The resource name of the instance location using the form:
   *     `projects/{project_id}/locations/{location_id}`
   * where `location_id` refers to a GCP region.
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
   * Required. The resource name of the instance location using the form:
   *     `projects/{project_id}/locations/{location_id}`
   * where `location_id` refers to a GCP region.
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

  public static final int INSTANCE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object instanceId_ = "";
  /**
   * <pre>
   * Required. The logical name of the Redis instance in the customer project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-40 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the customer project / location
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceId.
   */
  @java.lang.Override
  public java.lang.String getInstanceId() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The logical name of the Redis instance in the customer project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-40 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the customer project / location
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstanceIdBytes() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCE_FIELD_NUMBER = 3;
  private com.google.cloud.redis.v1beta1.Instance instance_;
  /**
   * <pre>
   * Required. A Redis [Instance] resource
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the instance field is set.
   */
  @java.lang.Override
  public boolean hasInstance() {
    return instance_ != null;
  }
  /**
   * <pre>
   * Required. A Redis [Instance] resource
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instance.
   */
  @java.lang.Override
  public com.google.cloud.redis.v1beta1.Instance getInstance() {
    return instance_ == null ? com.google.cloud.redis.v1beta1.Instance.getDefaultInstance() : instance_;
  }
  /**
   * <pre>
   * Required. A Redis [Instance] resource
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.redis.v1beta1.InstanceOrBuilder getInstanceOrBuilder() {
    return instance_ == null ? com.google.cloud.redis.v1beta1.Instance.getDefaultInstance() : instance_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instanceId_);
    }
    if (instance_ != null) {
      output.writeMessage(3, getInstance());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instanceId_);
    }
    if (instance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getInstance());
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
    if (!(obj instanceof com.google.cloud.redis.v1beta1.CreateInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.v1beta1.CreateInstanceRequest other = (com.google.cloud.redis.v1beta1.CreateInstanceRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getInstanceId()
        .equals(other.getInstanceId())) return false;
    if (hasInstance() != other.hasInstance()) return false;
    if (hasInstance()) {
      if (!getInstance()
          .equals(other.getInstance())) return false;
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
    hash = (37 * hash) + INSTANCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceId().hashCode();
    if (hasInstance()) {
      hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getInstance().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.redis.v1beta1.CreateInstanceRequest prototype) {
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
   * Request for [CreateInstance][google.cloud.redis.v1beta1.CloudRedis.CreateInstance].
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.v1beta1.CreateInstanceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.v1beta1.CreateInstanceRequest)
      com.google.cloud.redis.v1beta1.CreateInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.internal_static_google_cloud_redis_v1beta1_CreateInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.internal_static_google_cloud_redis_v1beta1_CreateInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.v1beta1.CreateInstanceRequest.class, com.google.cloud.redis.v1beta1.CreateInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.redis.v1beta1.CreateInstanceRequest.newBuilder()
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
      instanceId_ = "";
      instance_ = null;
      if (instanceBuilder_ != null) {
        instanceBuilder_.dispose();
        instanceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.internal_static_google_cloud_redis_v1beta1_CreateInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.CreateInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.redis.v1beta1.CreateInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.CreateInstanceRequest build() {
      com.google.cloud.redis.v1beta1.CreateInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.CreateInstanceRequest buildPartial() {
      com.google.cloud.redis.v1beta1.CreateInstanceRequest result = new com.google.cloud.redis.v1beta1.CreateInstanceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.redis.v1beta1.CreateInstanceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.instanceId_ = instanceId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.instance_ = instanceBuilder_ == null
            ? instance_
            : instanceBuilder_.build();
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
      if (other instanceof com.google.cloud.redis.v1beta1.CreateInstanceRequest) {
        return mergeFrom((com.google.cloud.redis.v1beta1.CreateInstanceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.v1beta1.CreateInstanceRequest other) {
      if (other == com.google.cloud.redis.v1beta1.CreateInstanceRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getInstanceId().isEmpty()) {
        instanceId_ = other.instanceId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasInstance()) {
        mergeInstance(other.getInstance());
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
              instanceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getInstanceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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
     * Required. The resource name of the instance location using the form:
     *     `projects/{project_id}/locations/{location_id}`
     * where `location_id` refers to a GCP region.
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
     * Required. The resource name of the instance location using the form:
     *     `projects/{project_id}/locations/{location_id}`
     * where `location_id` refers to a GCP region.
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
     * Required. The resource name of the instance location using the form:
     *     `projects/{project_id}/locations/{location_id}`
     * where `location_id` refers to a GCP region.
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
     * Required. The resource name of the instance location using the form:
     *     `projects/{project_id}/locations/{location_id}`
     * where `location_id` refers to a GCP region.
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
     * Required. The resource name of the instance location using the form:
     *     `projects/{project_id}/locations/{location_id}`
     * where `location_id` refers to a GCP region.
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

    private java.lang.Object instanceId_ = "";
    /**
     * <pre>
     * Required. The logical name of the Redis instance in the customer project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project / location
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The instanceId.
     */
    public java.lang.String getInstanceId() {
      java.lang.Object ref = instanceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The logical name of the Redis instance in the customer project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project / location
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for instanceId.
     */
    public com.google.protobuf.ByteString
        getInstanceIdBytes() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The logical name of the Redis instance in the customer project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project / location
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The instanceId to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      instanceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The logical name of the Redis instance in the customer project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project / location
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearInstanceId() {
      instanceId_ = getDefaultInstance().getInstanceId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The logical name of the Redis instance in the customer project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project / location
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for instanceId to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      instanceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.redis.v1beta1.Instance instance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.redis.v1beta1.Instance, com.google.cloud.redis.v1beta1.Instance.Builder, com.google.cloud.redis.v1beta1.InstanceOrBuilder> instanceBuilder_;
    /**
     * <pre>
     * Required. A Redis [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the instance field is set.
     */
    public boolean hasInstance() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. A Redis [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The instance.
     */
    public com.google.cloud.redis.v1beta1.Instance getInstance() {
      if (instanceBuilder_ == null) {
        return instance_ == null ? com.google.cloud.redis.v1beta1.Instance.getDefaultInstance() : instance_;
      } else {
        return instanceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A Redis [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInstance(com.google.cloud.redis.v1beta1.Instance value) {
      if (instanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        instance_ = value;
      } else {
        instanceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A Redis [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInstance(
        com.google.cloud.redis.v1beta1.Instance.Builder builderForValue) {
      if (instanceBuilder_ == null) {
        instance_ = builderForValue.build();
      } else {
        instanceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A Redis [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeInstance(com.google.cloud.redis.v1beta1.Instance value) {
      if (instanceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          instance_ != null &&
          instance_ != com.google.cloud.redis.v1beta1.Instance.getDefaultInstance()) {
          getInstanceBuilder().mergeFrom(value);
        } else {
          instance_ = value;
        }
      } else {
        instanceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A Redis [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearInstance() {
      bitField0_ = (bitField0_ & ~0x00000004);
      instance_ = null;
      if (instanceBuilder_ != null) {
        instanceBuilder_.dispose();
        instanceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A Redis [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.redis.v1beta1.Instance.Builder getInstanceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getInstanceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A Redis [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.redis.v1beta1.InstanceOrBuilder getInstanceOrBuilder() {
      if (instanceBuilder_ != null) {
        return instanceBuilder_.getMessageOrBuilder();
      } else {
        return instance_ == null ?
            com.google.cloud.redis.v1beta1.Instance.getDefaultInstance() : instance_;
      }
    }
    /**
     * <pre>
     * Required. A Redis [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.redis.v1beta1.Instance, com.google.cloud.redis.v1beta1.Instance.Builder, com.google.cloud.redis.v1beta1.InstanceOrBuilder> 
        getInstanceFieldBuilder() {
      if (instanceBuilder_ == null) {
        instanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.v1beta1.Instance, com.google.cloud.redis.v1beta1.Instance.Builder, com.google.cloud.redis.v1beta1.InstanceOrBuilder>(
                getInstance(),
                getParentForChildren(),
                isClean());
        instance_ = null;
      }
      return instanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.redis.v1beta1.CreateInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.v1beta1.CreateInstanceRequest)
  private static final com.google.cloud.redis.v1beta1.CreateInstanceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.v1beta1.CreateInstanceRequest();
  }

  public static com.google.cloud.redis.v1beta1.CreateInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateInstanceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateInstanceRequest>() {
    @java.lang.Override
    public CreateInstanceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.v1beta1.CreateInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

