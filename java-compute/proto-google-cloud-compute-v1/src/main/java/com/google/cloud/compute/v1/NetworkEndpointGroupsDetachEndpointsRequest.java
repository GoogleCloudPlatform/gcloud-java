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
 * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest}
 */
public final class NetworkEndpointGroupsDetachEndpointsRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest)
    NetworkEndpointGroupsDetachEndpointsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkEndpointGroupsDetachEndpointsRequest.newBuilder() to construct.
  private NetworkEndpointGroupsDetachEndpointsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkEndpointGroupsDetachEndpointsRequest() {
    networkEndpoints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkEndpointGroupsDetachEndpointsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NetworkEndpointGroupsDetachEndpointsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NetworkEndpointGroupsDetachEndpointsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest.class,
            com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest.Builder.class);
  }

  public static final int NETWORK_ENDPOINTS_FIELD_NUMBER = 149850285;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.NetworkEndpoint> networkEndpoints_;
  /**
   *
   *
   * <pre>
   * The list of network endpoints to be detached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.NetworkEndpoint> getNetworkEndpointsList() {
    return networkEndpoints_;
  }
  /**
   *
   *
   * <pre>
   * The list of network endpoints to be detached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.NetworkEndpointOrBuilder>
      getNetworkEndpointsOrBuilderList() {
    return networkEndpoints_;
  }
  /**
   *
   *
   * <pre>
   * The list of network endpoints to be detached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  @java.lang.Override
  public int getNetworkEndpointsCount() {
    return networkEndpoints_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of network endpoints to be detached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpoint getNetworkEndpoints(int index) {
    return networkEndpoints_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of network endpoints to be detached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpointOrBuilder getNetworkEndpointsOrBuilder(
      int index) {
    return networkEndpoints_.get(index);
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
    for (int i = 0; i < networkEndpoints_.size(); i++) {
      output.writeMessage(149850285, networkEndpoints_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < networkEndpoints_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              149850285, networkEndpoints_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest other =
        (com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest) obj;

    if (!getNetworkEndpointsList().equals(other.getNetworkEndpointsList())) return false;
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
    if (getNetworkEndpointsCount() > 0) {
      hash = (37 * hash) + NETWORK_ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkEndpointsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest parseFrom(
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
      com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest)
      com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkEndpointGroupsDetachEndpointsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkEndpointGroupsDetachEndpointsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest.class,
              com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (networkEndpointsBuilder_ == null) {
        networkEndpoints_ = java.util.Collections.emptyList();
      } else {
        networkEndpoints_ = null;
        networkEndpointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkEndpointGroupsDetachEndpointsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest build() {
      com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest buildPartial() {
      com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest result =
          new com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest result) {
      if (networkEndpointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          networkEndpoints_ = java.util.Collections.unmodifiableList(networkEndpoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.networkEndpoints_ = networkEndpoints_;
      } else {
        result.networkEndpoints_ = networkEndpointsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest result) {
      int from_bitField0_ = bitField0_;
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
      if (other
          instanceof com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest) {
        return mergeFrom(
            (com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest other) {
      if (other
          == com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest
              .getDefaultInstance()) return this;
      if (networkEndpointsBuilder_ == null) {
        if (!other.networkEndpoints_.isEmpty()) {
          if (networkEndpoints_.isEmpty()) {
            networkEndpoints_ = other.networkEndpoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNetworkEndpointsIsMutable();
            networkEndpoints_.addAll(other.networkEndpoints_);
          }
          onChanged();
        }
      } else {
        if (!other.networkEndpoints_.isEmpty()) {
          if (networkEndpointsBuilder_.isEmpty()) {
            networkEndpointsBuilder_.dispose();
            networkEndpointsBuilder_ = null;
            networkEndpoints_ = other.networkEndpoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            networkEndpointsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNetworkEndpointsFieldBuilder()
                    : null;
          } else {
            networkEndpointsBuilder_.addAllMessages(other.networkEndpoints_);
          }
        }
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
            case 1198802282:
              {
                com.google.cloud.compute.v1.NetworkEndpoint m =
                    input.readMessage(
                        com.google.cloud.compute.v1.NetworkEndpoint.parser(), extensionRegistry);
                if (networkEndpointsBuilder_ == null) {
                  ensureNetworkEndpointsIsMutable();
                  networkEndpoints_.add(m);
                } else {
                  networkEndpointsBuilder_.addMessage(m);
                }
                break;
              } // case 1198802282
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

    private java.util.List<com.google.cloud.compute.v1.NetworkEndpoint> networkEndpoints_ =
        java.util.Collections.emptyList();

    private void ensureNetworkEndpointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        networkEndpoints_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.NetworkEndpoint>(networkEndpoints_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.NetworkEndpoint,
            com.google.cloud.compute.v1.NetworkEndpoint.Builder,
            com.google.cloud.compute.v1.NetworkEndpointOrBuilder>
        networkEndpointsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.NetworkEndpoint> getNetworkEndpointsList() {
      if (networkEndpointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(networkEndpoints_);
      } else {
        return networkEndpointsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public int getNetworkEndpointsCount() {
      if (networkEndpointsBuilder_ == null) {
        return networkEndpoints_.size();
      } else {
        return networkEndpointsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public com.google.cloud.compute.v1.NetworkEndpoint getNetworkEndpoints(int index) {
      if (networkEndpointsBuilder_ == null) {
        return networkEndpoints_.get(index);
      } else {
        return networkEndpointsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder setNetworkEndpoints(
        int index, com.google.cloud.compute.v1.NetworkEndpoint value) {
      if (networkEndpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.set(index, value);
        onChanged();
      } else {
        networkEndpointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder setNetworkEndpoints(
        int index, com.google.cloud.compute.v1.NetworkEndpoint.Builder builderForValue) {
      if (networkEndpointsBuilder_ == null) {
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        networkEndpointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder addNetworkEndpoints(com.google.cloud.compute.v1.NetworkEndpoint value) {
      if (networkEndpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.add(value);
        onChanged();
      } else {
        networkEndpointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder addNetworkEndpoints(
        int index, com.google.cloud.compute.v1.NetworkEndpoint value) {
      if (networkEndpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.add(index, value);
        onChanged();
      } else {
        networkEndpointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder addNetworkEndpoints(
        com.google.cloud.compute.v1.NetworkEndpoint.Builder builderForValue) {
      if (networkEndpointsBuilder_ == null) {
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.add(builderForValue.build());
        onChanged();
      } else {
        networkEndpointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder addNetworkEndpoints(
        int index, com.google.cloud.compute.v1.NetworkEndpoint.Builder builderForValue) {
      if (networkEndpointsBuilder_ == null) {
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        networkEndpointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder addAllNetworkEndpoints(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.NetworkEndpoint> values) {
      if (networkEndpointsBuilder_ == null) {
        ensureNetworkEndpointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, networkEndpoints_);
        onChanged();
      } else {
        networkEndpointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder clearNetworkEndpoints() {
      if (networkEndpointsBuilder_ == null) {
        networkEndpoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        networkEndpointsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder removeNetworkEndpoints(int index) {
      if (networkEndpointsBuilder_ == null) {
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.remove(index);
        onChanged();
      } else {
        networkEndpointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public com.google.cloud.compute.v1.NetworkEndpoint.Builder getNetworkEndpointsBuilder(
        int index) {
      return getNetworkEndpointsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public com.google.cloud.compute.v1.NetworkEndpointOrBuilder getNetworkEndpointsOrBuilder(
        int index) {
      if (networkEndpointsBuilder_ == null) {
        return networkEndpoints_.get(index);
      } else {
        return networkEndpointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.NetworkEndpointOrBuilder>
        getNetworkEndpointsOrBuilderList() {
      if (networkEndpointsBuilder_ != null) {
        return networkEndpointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(networkEndpoints_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public com.google.cloud.compute.v1.NetworkEndpoint.Builder addNetworkEndpointsBuilder() {
      return getNetworkEndpointsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.NetworkEndpoint.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public com.google.cloud.compute.v1.NetworkEndpoint.Builder addNetworkEndpointsBuilder(
        int index) {
      return getNetworkEndpointsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.NetworkEndpoint.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of network endpoints to be detached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.NetworkEndpoint.Builder>
        getNetworkEndpointsBuilderList() {
      return getNetworkEndpointsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.NetworkEndpoint,
            com.google.cloud.compute.v1.NetworkEndpoint.Builder,
            com.google.cloud.compute.v1.NetworkEndpointOrBuilder>
        getNetworkEndpointsFieldBuilder() {
      if (networkEndpointsBuilder_ == null) {
        networkEndpointsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.NetworkEndpoint,
                com.google.cloud.compute.v1.NetworkEndpoint.Builder,
                com.google.cloud.compute.v1.NetworkEndpointOrBuilder>(
                networkEndpoints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        networkEndpoints_ = null;
      }
      return networkEndpointsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest)
  private static final com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest();
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkEndpointGroupsDetachEndpointsRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<NetworkEndpointGroupsDetachEndpointsRequest>() {
            @java.lang.Override
            public NetworkEndpointGroupsDetachEndpointsRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<NetworkEndpointGroupsDetachEndpointsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkEndpointGroupsDetachEndpointsRequest>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
