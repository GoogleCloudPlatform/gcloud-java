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
// source: google/cloud/memcache/v1/cloud_memcache.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.memcache.v1;

/**
 *
 *
 * <pre>
 * Request for [ApplyParameters][google.cloud.memcache.v1.CloudMemcache.ApplyParameters].
 * </pre>
 *
 * Protobuf type {@code google.cloud.memcache.v1.ApplyParametersRequest}
 */
public final class ApplyParametersRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.memcache.v1.ApplyParametersRequest)
    ApplyParametersRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ApplyParametersRequest.newBuilder() to construct.
  private ApplyParametersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApplyParametersRequest() {
    name_ = "";
    nodeIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ApplyParametersRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.memcache.v1.CloudMemcacheProto
        .internal_static_google_cloud_memcache_v1_ApplyParametersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.memcache.v1.CloudMemcacheProto
        .internal_static_google_cloud_memcache_v1_ApplyParametersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.memcache.v1.ApplyParametersRequest.class,
            com.google.cloud.memcache.v1.ApplyParametersRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Resource name of the Memcached instance for which parameter group updates
   * should be applied.
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
   * Required. Resource name of the Memcached instance for which parameter group updates
   * should be applied.
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

  public static final int NODE_IDS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList nodeIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Nodes to which the instance-level parameter group is applied.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   *
   * @return A list containing the nodeIds.
   */
  public com.google.protobuf.ProtocolStringList getNodeIdsList() {
    return nodeIds_;
  }
  /**
   *
   *
   * <pre>
   * Nodes to which the instance-level parameter group is applied.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   *
   * @return The count of nodeIds.
   */
  public int getNodeIdsCount() {
    return nodeIds_.size();
  }
  /**
   *
   *
   * <pre>
   * Nodes to which the instance-level parameter group is applied.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The nodeIds at the given index.
   */
  public java.lang.String getNodeIds(int index) {
    return nodeIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Nodes to which the instance-level parameter group is applied.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the nodeIds at the given index.
   */
  public com.google.protobuf.ByteString getNodeIdsBytes(int index) {
    return nodeIds_.getByteString(index);
  }

  public static final int APPLY_ALL_FIELD_NUMBER = 3;
  private boolean applyAll_ = false;
  /**
   *
   *
   * <pre>
   * Whether to apply instance-level parameter group to all nodes. If set to
   * true, users are restricted from specifying individual nodes, and
   * `ApplyParameters` updates all nodes within the instance.
   * </pre>
   *
   * <code>bool apply_all = 3;</code>
   *
   * @return The applyAll.
   */
  @java.lang.Override
  public boolean getApplyAll() {
    return applyAll_;
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
    for (int i = 0; i < nodeIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nodeIds_.getRaw(i));
    }
    if (applyAll_ != false) {
      output.writeBool(3, applyAll_);
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
    {
      int dataSize = 0;
      for (int i = 0; i < nodeIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(nodeIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNodeIdsList().size();
    }
    if (applyAll_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, applyAll_);
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
    if (!(obj instanceof com.google.cloud.memcache.v1.ApplyParametersRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.memcache.v1.ApplyParametersRequest other =
        (com.google.cloud.memcache.v1.ApplyParametersRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getNodeIdsList().equals(other.getNodeIdsList())) return false;
    if (getApplyAll() != other.getApplyAll()) return false;
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
    if (getNodeIdsCount() > 0) {
      hash = (37 * hash) + NODE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getNodeIdsList().hashCode();
    }
    hash = (37 * hash) + APPLY_ALL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getApplyAll());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.memcache.v1.ApplyParametersRequest prototype) {
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
   * Request for [ApplyParameters][google.cloud.memcache.v1.CloudMemcache.ApplyParameters].
   * </pre>
   *
   * Protobuf type {@code google.cloud.memcache.v1.ApplyParametersRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.memcache.v1.ApplyParametersRequest)
      com.google.cloud.memcache.v1.ApplyParametersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.memcache.v1.CloudMemcacheProto
          .internal_static_google_cloud_memcache_v1_ApplyParametersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.memcache.v1.CloudMemcacheProto
          .internal_static_google_cloud_memcache_v1_ApplyParametersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.memcache.v1.ApplyParametersRequest.class,
              com.google.cloud.memcache.v1.ApplyParametersRequest.Builder.class);
    }

    // Construct using com.google.cloud.memcache.v1.ApplyParametersRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      nodeIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      applyAll_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.memcache.v1.CloudMemcacheProto
          .internal_static_google_cloud_memcache_v1_ApplyParametersRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1.ApplyParametersRequest getDefaultInstanceForType() {
      return com.google.cloud.memcache.v1.ApplyParametersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1.ApplyParametersRequest build() {
      com.google.cloud.memcache.v1.ApplyParametersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1.ApplyParametersRequest buildPartial() {
      com.google.cloud.memcache.v1.ApplyParametersRequest result =
          new com.google.cloud.memcache.v1.ApplyParametersRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.memcache.v1.ApplyParametersRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        nodeIds_.makeImmutable();
        result.nodeIds_ = nodeIds_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.applyAll_ = applyAll_;
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
      if (other instanceof com.google.cloud.memcache.v1.ApplyParametersRequest) {
        return mergeFrom((com.google.cloud.memcache.v1.ApplyParametersRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.memcache.v1.ApplyParametersRequest other) {
      if (other == com.google.cloud.memcache.v1.ApplyParametersRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.nodeIds_.isEmpty()) {
        if (nodeIds_.isEmpty()) {
          nodeIds_ = other.nodeIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureNodeIdsIsMutable();
          nodeIds_.addAll(other.nodeIds_);
        }
        onChanged();
      }
      if (other.getApplyAll() != false) {
        setApplyAll(other.getApplyAll());
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureNodeIdsIsMutable();
                nodeIds_.add(s);
                break;
              } // case 18
            case 24:
              {
                applyAll_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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
     * Required. Resource name of the Memcached instance for which parameter group updates
     * should be applied.
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
     * Required. Resource name of the Memcached instance for which parameter group updates
     * should be applied.
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
     * Required. Resource name of the Memcached instance for which parameter group updates
     * should be applied.
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
     * Required. Resource name of the Memcached instance for which parameter group updates
     * should be applied.
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
     * Required. Resource name of the Memcached instance for which parameter group updates
     * should be applied.
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

    private com.google.protobuf.LazyStringArrayList nodeIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureNodeIdsIsMutable() {
      if (!nodeIds_.isModifiable()) {
        nodeIds_ = new com.google.protobuf.LazyStringArrayList(nodeIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Nodes to which the instance-level parameter group is applied.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @return A list containing the nodeIds.
     */
    public com.google.protobuf.ProtocolStringList getNodeIdsList() {
      nodeIds_.makeImmutable();
      return nodeIds_;
    }
    /**
     *
     *
     * <pre>
     * Nodes to which the instance-level parameter group is applied.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @return The count of nodeIds.
     */
    public int getNodeIdsCount() {
      return nodeIds_.size();
    }
    /**
     *
     *
     * <pre>
     * Nodes to which the instance-level parameter group is applied.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The nodeIds at the given index.
     */
    public java.lang.String getNodeIds(int index) {
      return nodeIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Nodes to which the instance-level parameter group is applied.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the nodeIds at the given index.
     */
    public com.google.protobuf.ByteString getNodeIdsBytes(int index) {
      return nodeIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Nodes to which the instance-level parameter group is applied.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The nodeIds to set.
     * @return This builder for chaining.
     */
    public Builder setNodeIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNodeIdsIsMutable();
      nodeIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Nodes to which the instance-level parameter group is applied.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param value The nodeIds to add.
     * @return This builder for chaining.
     */
    public Builder addNodeIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNodeIdsIsMutable();
      nodeIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Nodes to which the instance-level parameter group is applied.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param values The nodeIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllNodeIds(java.lang.Iterable<java.lang.String> values) {
      ensureNodeIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nodeIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Nodes to which the instance-level parameter group is applied.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNodeIds() {
      nodeIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Nodes to which the instance-level parameter group is applied.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param value The bytes of the nodeIds to add.
     * @return This builder for chaining.
     */
    public Builder addNodeIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureNodeIdsIsMutable();
      nodeIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean applyAll_;
    /**
     *
     *
     * <pre>
     * Whether to apply instance-level parameter group to all nodes. If set to
     * true, users are restricted from specifying individual nodes, and
     * `ApplyParameters` updates all nodes within the instance.
     * </pre>
     *
     * <code>bool apply_all = 3;</code>
     *
     * @return The applyAll.
     */
    @java.lang.Override
    public boolean getApplyAll() {
      return applyAll_;
    }
    /**
     *
     *
     * <pre>
     * Whether to apply instance-level parameter group to all nodes. If set to
     * true, users are restricted from specifying individual nodes, and
     * `ApplyParameters` updates all nodes within the instance.
     * </pre>
     *
     * <code>bool apply_all = 3;</code>
     *
     * @param value The applyAll to set.
     * @return This builder for chaining.
     */
    public Builder setApplyAll(boolean value) {

      applyAll_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to apply instance-level parameter group to all nodes. If set to
     * true, users are restricted from specifying individual nodes, and
     * `ApplyParameters` updates all nodes within the instance.
     * </pre>
     *
     * <code>bool apply_all = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearApplyAll() {
      bitField0_ = (bitField0_ & ~0x00000004);
      applyAll_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.memcache.v1.ApplyParametersRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.memcache.v1.ApplyParametersRequest)
  private static final com.google.cloud.memcache.v1.ApplyParametersRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.memcache.v1.ApplyParametersRequest();
  }

  public static com.google.cloud.memcache.v1.ApplyParametersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplyParametersRequest> PARSER =
      new com.google.protobuf.AbstractParser<ApplyParametersRequest>() {
        @java.lang.Override
        public ApplyParametersRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ApplyParametersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplyParametersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.memcache.v1.ApplyParametersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
