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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NodeGroupsDeleteNodesRequest}
 */
public final class NodeGroupsDeleteNodesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NodeGroupsDeleteNodesRequest)
    NodeGroupsDeleteNodesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NodeGroupsDeleteNodesRequest.newBuilder() to construct.
  private NodeGroupsDeleteNodesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NodeGroupsDeleteNodesRequest() {
    nodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NodeGroupsDeleteNodesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NodeGroupsDeleteNodesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NodeGroupsDeleteNodesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest.class,
            com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest.Builder.class);
  }

  public static final int NODES_FIELD_NUMBER = 104993457;
  private com.google.protobuf.LazyStringList nodes_;
  /**
   *
   *
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   *
   * @return A list containing the nodes.
   */
  public com.google.protobuf.ProtocolStringList getNodesList() {
    return nodes_;
  }
  /**
   *
   *
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   *
   * @return The count of nodes.
   */
  public int getNodesCount() {
    return nodes_.size();
  }
  /**
   *
   *
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   *
   * @param index The index of the element to return.
   * @return The nodes at the given index.
   */
  public java.lang.String getNodes(int index) {
    return nodes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the nodes at the given index.
   */
  public com.google.protobuf.ByteString getNodesBytes(int index) {
    return nodes_.getByteString(index);
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
    for (int i = 0; i < nodes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 104993457, nodes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < nodes_.size(); i++) {
        dataSize += computeStringSizeNoTag(nodes_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getNodesList().size();
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
    if (!(obj instanceof com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest other =
        (com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest) obj;

    if (!getNodesList().equals(other.getNodesList())) return false;
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
    if (getNodesCount() > 0) {
      hash = (37 * hash) + NODES_FIELD_NUMBER;
      hash = (53 * hash) + getNodesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest parseFrom(
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
      com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.NodeGroupsDeleteNodesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NodeGroupsDeleteNodesRequest)
      com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NodeGroupsDeleteNodesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NodeGroupsDeleteNodesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest.class,
              com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      nodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NodeGroupsDeleteNodesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest build() {
      com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest buildPartial() {
      com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest result =
          new com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        nodes_ = nodes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.nodes_ = nodes_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest) {
        return mergeFrom((com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest other) {
      if (other == com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest.getDefaultInstance())
        return this;
      if (!other.nodes_.isEmpty()) {
        if (nodes_.isEmpty()) {
          nodes_ = other.nodes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNodesIsMutable();
          nodes_.addAll(other.nodes_);
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
            case 839947658:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureNodesIsMutable();
                nodes_.add(s);
                break;
              } // case 839947658
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

    private com.google.protobuf.LazyStringList nodes_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureNodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodes_ = new com.google.protobuf.LazyStringArrayList(nodes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Names of the nodes to delete.
     * </pre>
     *
     * <code>repeated string nodes = 104993457;</code>
     *
     * @return A list containing the nodes.
     */
    public com.google.protobuf.ProtocolStringList getNodesList() {
      return nodes_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Names of the nodes to delete.
     * </pre>
     *
     * <code>repeated string nodes = 104993457;</code>
     *
     * @return The count of nodes.
     */
    public int getNodesCount() {
      return nodes_.size();
    }
    /**
     *
     *
     * <pre>
     * Names of the nodes to delete.
     * </pre>
     *
     * <code>repeated string nodes = 104993457;</code>
     *
     * @param index The index of the element to return.
     * @return The nodes at the given index.
     */
    public java.lang.String getNodes(int index) {
      return nodes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Names of the nodes to delete.
     * </pre>
     *
     * <code>repeated string nodes = 104993457;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the nodes at the given index.
     */
    public com.google.protobuf.ByteString getNodesBytes(int index) {
      return nodes_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Names of the nodes to delete.
     * </pre>
     *
     * <code>repeated string nodes = 104993457;</code>
     *
     * @param index The index to set the value at.
     * @param value The nodes to set.
     * @return This builder for chaining.
     */
    public Builder setNodes(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNodesIsMutable();
      nodes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of the nodes to delete.
     * </pre>
     *
     * <code>repeated string nodes = 104993457;</code>
     *
     * @param value The nodes to add.
     * @return This builder for chaining.
     */
    public Builder addNodes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNodesIsMutable();
      nodes_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of the nodes to delete.
     * </pre>
     *
     * <code>repeated string nodes = 104993457;</code>
     *
     * @param values The nodes to add.
     * @return This builder for chaining.
     */
    public Builder addAllNodes(java.lang.Iterable<java.lang.String> values) {
      ensureNodesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nodes_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of the nodes to delete.
     * </pre>
     *
     * <code>repeated string nodes = 104993457;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNodes() {
      nodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of the nodes to delete.
     * </pre>
     *
     * <code>repeated string nodes = 104993457;</code>
     *
     * @param value The bytes of the nodes to add.
     * @return This builder for chaining.
     */
    public Builder addNodesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureNodesIsMutable();
      nodes_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NodeGroupsDeleteNodesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NodeGroupsDeleteNodesRequest)
  private static final com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest();
  }

  public static com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeGroupsDeleteNodesRequest> PARSER =
      new com.google.protobuf.AbstractParser<NodeGroupsDeleteNodesRequest>() {
        @java.lang.Override
        public NodeGroupsDeleteNodesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodeGroupsDeleteNodesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeGroupsDeleteNodesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
