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
// source: google/cloud/gkehub/v1beta1/membership.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.v1beta1;

/**
 *
 *
 * <pre>
 * EdgeCluster contains information specific to Google Edge Clusters.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1beta1.EdgeCluster}
 */
public final class EdgeCluster extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1beta1.EdgeCluster)
    EdgeClusterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EdgeCluster.newBuilder() to construct.
  private EdgeCluster(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EdgeCluster() {
    resourceLink_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EdgeCluster();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_EdgeCluster_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_EdgeCluster_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1beta1.EdgeCluster.class,
            com.google.cloud.gkehub.v1beta1.EdgeCluster.Builder.class);
  }

  public static final int RESOURCE_LINK_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceLink_ = "";
  /**
   *
   *
   * <pre>
   * Immutable. Self-link of the GCP resource for the Edge Cluster. For
   * example:
   *
   * //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The resourceLink.
   */
  @java.lang.Override
  public java.lang.String getResourceLink() {
    java.lang.Object ref = resourceLink_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceLink_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. Self-link of the GCP resource for the Edge Cluster. For
   * example:
   *
   * //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for resourceLink.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceLinkBytes() {
    java.lang.Object ref = resourceLink_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceLink_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceLink_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceLink_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceLink_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceLink_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1beta1.EdgeCluster)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1beta1.EdgeCluster other =
        (com.google.cloud.gkehub.v1beta1.EdgeCluster) obj;

    if (!getResourceLink().equals(other.getResourceLink())) return false;
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
    hash = (37 * hash) + RESOURCE_LINK_FIELD_NUMBER;
    hash = (53 * hash) + getResourceLink().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkehub.v1beta1.EdgeCluster prototype) {
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
   * EdgeCluster contains information specific to Google Edge Clusters.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1beta1.EdgeCluster}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1beta1.EdgeCluster)
      com.google.cloud.gkehub.v1beta1.EdgeClusterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_EdgeCluster_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_EdgeCluster_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1beta1.EdgeCluster.class,
              com.google.cloud.gkehub.v1beta1.EdgeCluster.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1beta1.EdgeCluster.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceLink_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_EdgeCluster_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.EdgeCluster getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1beta1.EdgeCluster.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.EdgeCluster build() {
      com.google.cloud.gkehub.v1beta1.EdgeCluster result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.EdgeCluster buildPartial() {
      com.google.cloud.gkehub.v1beta1.EdgeCluster result =
          new com.google.cloud.gkehub.v1beta1.EdgeCluster(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1beta1.EdgeCluster result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceLink_ = resourceLink_;
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
      if (other instanceof com.google.cloud.gkehub.v1beta1.EdgeCluster) {
        return mergeFrom((com.google.cloud.gkehub.v1beta1.EdgeCluster) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1beta1.EdgeCluster other) {
      if (other == com.google.cloud.gkehub.v1beta1.EdgeCluster.getDefaultInstance()) return this;
      if (!other.getResourceLink().isEmpty()) {
        resourceLink_ = other.resourceLink_;
        bitField0_ |= 0x00000001;
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
            case 10:
              {
                resourceLink_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object resourceLink_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. Self-link of the GCP resource for the Edge Cluster. For
     * example:
     *
     * //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The resourceLink.
     */
    public java.lang.String getResourceLink() {
      java.lang.Object ref = resourceLink_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceLink_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Self-link of the GCP resource for the Edge Cluster. For
     * example:
     *
     * //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The bytes for resourceLink.
     */
    public com.google.protobuf.ByteString getResourceLinkBytes() {
      java.lang.Object ref = resourceLink_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Self-link of the GCP resource for the Edge Cluster. For
     * example:
     *
     * //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The resourceLink to set.
     * @return This builder for chaining.
     */
    public Builder setResourceLink(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceLink_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Self-link of the GCP resource for the Edge Cluster. For
     * example:
     *
     * //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceLink() {
      resourceLink_ = getDefaultInstance().getResourceLink();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Self-link of the GCP resource for the Edge Cluster. For
     * example:
     *
     * //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The bytes for resourceLink to set.
     * @return This builder for chaining.
     */
    public Builder setResourceLinkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resourceLink_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1beta1.EdgeCluster)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1beta1.EdgeCluster)
  private static final com.google.cloud.gkehub.v1beta1.EdgeCluster DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1beta1.EdgeCluster();
  }

  public static com.google.cloud.gkehub.v1beta1.EdgeCluster getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EdgeCluster> PARSER =
      new com.google.protobuf.AbstractParser<EdgeCluster>() {
        @java.lang.Override
        public EdgeCluster parsePartialFrom(
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

  public static com.google.protobuf.Parser<EdgeCluster> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EdgeCluster> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.EdgeCluster getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
