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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ProjectsEnableXpnResourceRequest}
 */
public final class ProjectsEnableXpnResourceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ProjectsEnableXpnResourceRequest)
    ProjectsEnableXpnResourceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProjectsEnableXpnResourceRequest.newBuilder() to construct.
  private ProjectsEnableXpnResourceRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProjectsEnableXpnResourceRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProjectsEnableXpnResourceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ProjectsEnableXpnResourceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ProjectsEnableXpnResourceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest.class,
            com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest.Builder.class);
  }

  private int bitField0_;
  public static final int XPN_RESOURCE_FIELD_NUMBER = 133384631;
  private com.google.cloud.compute.v1.XpnResourceId xpnResource_;
  /**
   *
   *
   * <pre>
   * Service resource (a.k.a service project) ID.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
   *
   * @return Whether the xpnResource field is set.
   */
  @java.lang.Override
  public boolean hasXpnResource() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Service resource (a.k.a service project) ID.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
   *
   * @return The xpnResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.XpnResourceId getXpnResource() {
    return xpnResource_ == null
        ? com.google.cloud.compute.v1.XpnResourceId.getDefaultInstance()
        : xpnResource_;
  }
  /**
   *
   *
   * <pre>
   * Service resource (a.k.a service project) ID.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.XpnResourceIdOrBuilder getXpnResourceOrBuilder() {
    return xpnResource_ == null
        ? com.google.cloud.compute.v1.XpnResourceId.getDefaultInstance()
        : xpnResource_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(133384631, getXpnResource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(133384631, getXpnResource());
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
    if (!(obj instanceof com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest other =
        (com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest) obj;

    if (hasXpnResource() != other.hasXpnResource()) return false;
    if (hasXpnResource()) {
      if (!getXpnResource().equals(other.getXpnResource())) return false;
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
    if (hasXpnResource()) {
      hash = (37 * hash) + XPN_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getXpnResource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest parseFrom(
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
      com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.ProjectsEnableXpnResourceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ProjectsEnableXpnResourceRequest)
      com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsEnableXpnResourceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsEnableXpnResourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest.class,
              com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getXpnResourceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      xpnResource_ = null;
      if (xpnResourceBuilder_ != null) {
        xpnResourceBuilder_.dispose();
        xpnResourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsEnableXpnResourceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest build() {
      com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest buildPartial() {
      com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest result =
          new com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.xpnResource_ =
            xpnResourceBuilder_ == null ? xpnResource_ : xpnResourceBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest) {
        return mergeFrom((com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest other) {
      if (other
          == com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest.getDefaultInstance())
        return this;
      if (other.hasXpnResource()) {
        mergeXpnResource(other.getXpnResource());
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
            case 1067077050:
              {
                input.readMessage(getXpnResourceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 1067077050
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

    private com.google.cloud.compute.v1.XpnResourceId xpnResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.XpnResourceId,
            com.google.cloud.compute.v1.XpnResourceId.Builder,
            com.google.cloud.compute.v1.XpnResourceIdOrBuilder>
        xpnResourceBuilder_;
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     *
     * @return Whether the xpnResource field is set.
     */
    public boolean hasXpnResource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     *
     * @return The xpnResource.
     */
    public com.google.cloud.compute.v1.XpnResourceId getXpnResource() {
      if (xpnResourceBuilder_ == null) {
        return xpnResource_ == null
            ? com.google.cloud.compute.v1.XpnResourceId.getDefaultInstance()
            : xpnResource_;
      } else {
        return xpnResourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public Builder setXpnResource(com.google.cloud.compute.v1.XpnResourceId value) {
      if (xpnResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        xpnResource_ = value;
      } else {
        xpnResourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public Builder setXpnResource(
        com.google.cloud.compute.v1.XpnResourceId.Builder builderForValue) {
      if (xpnResourceBuilder_ == null) {
        xpnResource_ = builderForValue.build();
      } else {
        xpnResourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public Builder mergeXpnResource(com.google.cloud.compute.v1.XpnResourceId value) {
      if (xpnResourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && xpnResource_ != null
            && xpnResource_ != com.google.cloud.compute.v1.XpnResourceId.getDefaultInstance()) {
          getXpnResourceBuilder().mergeFrom(value);
        } else {
          xpnResource_ = value;
        }
      } else {
        xpnResourceBuilder_.mergeFrom(value);
      }
      if (xpnResource_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public Builder clearXpnResource() {
      bitField0_ = (bitField0_ & ~0x00000001);
      xpnResource_ = null;
      if (xpnResourceBuilder_ != null) {
        xpnResourceBuilder_.dispose();
        xpnResourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public com.google.cloud.compute.v1.XpnResourceId.Builder getXpnResourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getXpnResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public com.google.cloud.compute.v1.XpnResourceIdOrBuilder getXpnResourceOrBuilder() {
      if (xpnResourceBuilder_ != null) {
        return xpnResourceBuilder_.getMessageOrBuilder();
      } else {
        return xpnResource_ == null
            ? com.google.cloud.compute.v1.XpnResourceId.getDefaultInstance()
            : xpnResource_;
      }
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.XpnResourceId,
            com.google.cloud.compute.v1.XpnResourceId.Builder,
            com.google.cloud.compute.v1.XpnResourceIdOrBuilder>
        getXpnResourceFieldBuilder() {
      if (xpnResourceBuilder_ == null) {
        xpnResourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.XpnResourceId,
                com.google.cloud.compute.v1.XpnResourceId.Builder,
                com.google.cloud.compute.v1.XpnResourceIdOrBuilder>(
                getXpnResource(), getParentForChildren(), isClean());
        xpnResource_ = null;
      }
      return xpnResourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ProjectsEnableXpnResourceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ProjectsEnableXpnResourceRequest)
  private static final com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest();
  }

  public static com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectsEnableXpnResourceRequest> PARSER =
      new com.google.protobuf.AbstractParser<ProjectsEnableXpnResourceRequest>() {
        @java.lang.Override
        public ProjectsEnableXpnResourceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProjectsEnableXpnResourceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectsEnableXpnResourceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
