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
 * A transient resource used in compute.disks.bulkInsert and compute.regionDisks.bulkInsert. It is only used to process requests and is not persisted.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.BulkInsertDiskResource}
 */
public final class BulkInsertDiskResource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.BulkInsertDiskResource)
    BulkInsertDiskResourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BulkInsertDiskResource.newBuilder() to construct.
  private BulkInsertDiskResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BulkInsertDiskResource() {
    sourceConsistencyGroupPolicy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BulkInsertDiskResource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BulkInsertDiskResource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BulkInsertDiskResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.BulkInsertDiskResource.class,
            com.google.cloud.compute.v1.BulkInsertDiskResource.Builder.class);
  }

  private int bitField0_;
  public static final int SOURCE_CONSISTENCY_GROUP_POLICY_FIELD_NUMBER = 19616093;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceConsistencyGroupPolicy_ = "";
  /**
   *
   *
   * <pre>
   * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full or partial URL, such as: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
   * </pre>
   *
   * <code>optional string source_consistency_group_policy = 19616093;</code>
   *
   * @return Whether the sourceConsistencyGroupPolicy field is set.
   */
  @java.lang.Override
  public boolean hasSourceConsistencyGroupPolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full or partial URL, such as: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
   * </pre>
   *
   * <code>optional string source_consistency_group_policy = 19616093;</code>
   *
   * @return The sourceConsistencyGroupPolicy.
   */
  @java.lang.Override
  public java.lang.String getSourceConsistencyGroupPolicy() {
    java.lang.Object ref = sourceConsistencyGroupPolicy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceConsistencyGroupPolicy_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full or partial URL, such as: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
   * </pre>
   *
   * <code>optional string source_consistency_group_policy = 19616093;</code>
   *
   * @return The bytes for sourceConsistencyGroupPolicy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceConsistencyGroupPolicyBytes() {
    java.lang.Object ref = sourceConsistencyGroupPolicy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sourceConsistencyGroupPolicy_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 19616093, sourceConsistencyGroupPolicy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(
              19616093, sourceConsistencyGroupPolicy_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.BulkInsertDiskResource)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.BulkInsertDiskResource other =
        (com.google.cloud.compute.v1.BulkInsertDiskResource) obj;

    if (hasSourceConsistencyGroupPolicy() != other.hasSourceConsistencyGroupPolicy()) return false;
    if (hasSourceConsistencyGroupPolicy()) {
      if (!getSourceConsistencyGroupPolicy().equals(other.getSourceConsistencyGroupPolicy()))
        return false;
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
    if (hasSourceConsistencyGroupPolicy()) {
      hash = (37 * hash) + SOURCE_CONSISTENCY_GROUP_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getSourceConsistencyGroupPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.BulkInsertDiskResource prototype) {
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
   * A transient resource used in compute.disks.bulkInsert and compute.regionDisks.bulkInsert. It is only used to process requests and is not persisted.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.BulkInsertDiskResource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.BulkInsertDiskResource)
      com.google.cloud.compute.v1.BulkInsertDiskResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BulkInsertDiskResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BulkInsertDiskResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.BulkInsertDiskResource.class,
              com.google.cloud.compute.v1.BulkInsertDiskResource.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.BulkInsertDiskResource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sourceConsistencyGroupPolicy_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BulkInsertDiskResource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BulkInsertDiskResource getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.BulkInsertDiskResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BulkInsertDiskResource build() {
      com.google.cloud.compute.v1.BulkInsertDiskResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BulkInsertDiskResource buildPartial() {
      com.google.cloud.compute.v1.BulkInsertDiskResource result =
          new com.google.cloud.compute.v1.BulkInsertDiskResource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.BulkInsertDiskResource result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceConsistencyGroupPolicy_ = sourceConsistencyGroupPolicy_;
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
      if (other instanceof com.google.cloud.compute.v1.BulkInsertDiskResource) {
        return mergeFrom((com.google.cloud.compute.v1.BulkInsertDiskResource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.BulkInsertDiskResource other) {
      if (other == com.google.cloud.compute.v1.BulkInsertDiskResource.getDefaultInstance())
        return this;
      if (other.hasSourceConsistencyGroupPolicy()) {
        sourceConsistencyGroupPolicy_ = other.sourceConsistencyGroupPolicy_;
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
            case 156928746:
              {
                sourceConsistencyGroupPolicy_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 156928746
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

    private java.lang.Object sourceConsistencyGroupPolicy_ = "";
    /**
     *
     *
     * <pre>
     * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full or partial URL, such as: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string source_consistency_group_policy = 19616093;</code>
     *
     * @return Whether the sourceConsistencyGroupPolicy field is set.
     */
    public boolean hasSourceConsistencyGroupPolicy() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full or partial URL, such as: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string source_consistency_group_policy = 19616093;</code>
     *
     * @return The sourceConsistencyGroupPolicy.
     */
    public java.lang.String getSourceConsistencyGroupPolicy() {
      java.lang.Object ref = sourceConsistencyGroupPolicy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceConsistencyGroupPolicy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full or partial URL, such as: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string source_consistency_group_policy = 19616093;</code>
     *
     * @return The bytes for sourceConsistencyGroupPolicy.
     */
    public com.google.protobuf.ByteString getSourceConsistencyGroupPolicyBytes() {
      java.lang.Object ref = sourceConsistencyGroupPolicy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sourceConsistencyGroupPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full or partial URL, such as: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string source_consistency_group_policy = 19616093;</code>
     *
     * @param value The sourceConsistencyGroupPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setSourceConsistencyGroupPolicy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceConsistencyGroupPolicy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full or partial URL, such as: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string source_consistency_group_policy = 19616093;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceConsistencyGroupPolicy() {
      sourceConsistencyGroupPolicy_ = getDefaultInstance().getSourceConsistencyGroupPolicy();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full or partial URL, such as: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
     * </pre>
     *
     * <code>optional string source_consistency_group_policy = 19616093;</code>
     *
     * @param value The bytes for sourceConsistencyGroupPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setSourceConsistencyGroupPolicyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceConsistencyGroupPolicy_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.BulkInsertDiskResource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.BulkInsertDiskResource)
  private static final com.google.cloud.compute.v1.BulkInsertDiskResource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.BulkInsertDiskResource();
  }

  public static com.google.cloud.compute.v1.BulkInsertDiskResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BulkInsertDiskResource> PARSER =
      new com.google.protobuf.AbstractParser<BulkInsertDiskResource>() {
        @java.lang.Override
        public BulkInsertDiskResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<BulkInsertDiskResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BulkInsertDiskResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.BulkInsertDiskResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
