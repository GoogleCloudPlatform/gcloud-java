/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/enterpriseknowledgegraph/v1/service.proto

package com.google.cloud.enterpriseknowledgegraph.v1;

/**
 *
 *
 * <pre>
 * Request message for CreateEntityReconciliationJob.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest}
 */
public final class CreateEntityReconciliationJobRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest)
    CreateEntityReconciliationJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateEntityReconciliationJobRequest.newBuilder() to construct.
  private CreateEntityReconciliationJobRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateEntityReconciliationJobRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateEntityReconciliationJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto
        .internal_static_google_cloud_enterpriseknowledgegraph_v1_CreateEntityReconciliationJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto
        .internal_static_google_cloud_enterpriseknowledgegraph_v1_CreateEntityReconciliationJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest.class,
            com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
                .Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the
   * EntityReconciliationJob in. Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the
   * EntityReconciliationJob in. Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_RECONCILIATION_JOB_FIELD_NUMBER = 2;
  private com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob
      entityReconciliationJob_;
  /**
   *
   *
   * <pre>
   * Required. The EntityReconciliationJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entityReconciliationJob field is set.
   */
  @java.lang.Override
  public boolean hasEntityReconciliationJob() {
    return entityReconciliationJob_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The EntityReconciliationJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entityReconciliationJob.
   */
  @java.lang.Override
  public com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob
      getEntityReconciliationJob() {
    return entityReconciliationJob_ == null
        ? com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob.getDefaultInstance()
        : entityReconciliationJob_;
  }
  /**
   *
   *
   * <pre>
   * Required. The EntityReconciliationJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJobOrBuilder
      getEntityReconciliationJobOrBuilder() {
    return entityReconciliationJob_ == null
        ? com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob.getDefaultInstance()
        : entityReconciliationJob_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (entityReconciliationJob_ != null) {
      output.writeMessage(2, getEntityReconciliationJob());
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
    if (entityReconciliationJob_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEntityReconciliationJob());
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
    if (!(obj
        instanceof
        com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest other =
        (com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasEntityReconciliationJob() != other.hasEntityReconciliationJob()) return false;
    if (hasEntityReconciliationJob()) {
      if (!getEntityReconciliationJob().equals(other.getEntityReconciliationJob())) return false;
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
    if (hasEntityReconciliationJob()) {
      hash = (37 * hash) + ENTITY_RECONCILIATION_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getEntityReconciliationJob().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      parseFrom(
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
      com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest prototype) {
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
   * Request message for CreateEntityReconciliationJob.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest)
      com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto
          .internal_static_google_cloud_enterpriseknowledgegraph_v1_CreateEntityReconciliationJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto
          .internal_static_google_cloud_enterpriseknowledgegraph_v1_CreateEntityReconciliationJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
                  .class,
              com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
                  .Builder.class);
    }

    // Construct using
    // com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      entityReconciliationJob_ = null;
      if (entityReconciliationJobBuilder_ != null) {
        entityReconciliationJobBuilder_.dispose();
        entityReconciliationJobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto
          .internal_static_google_cloud_enterpriseknowledgegraph_v1_CreateEntityReconciliationJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
        getDefaultInstanceForType() {
      return com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
        build() {
      com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
        buildPartial() {
      com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest result =
          new com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest(
              this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entityReconciliationJob_ =
            entityReconciliationJobBuilder_ == null
                ? entityReconciliationJob_
                : entityReconciliationJobBuilder_.build();
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
      if (other
          instanceof
          com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest) {
        return mergeFrom(
            (com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest other) {
      if (other
          == com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEntityReconciliationJob()) {
        mergeEntityReconciliationJob(other.getEntityReconciliationJob());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getEntityReconciliationJobFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the
     * EntityReconciliationJob in. Format:
     * `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the
     * EntityReconciliationJob in. Format:
     * `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the
     * EntityReconciliationJob in. Format:
     * `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the
     * EntityReconciliationJob in. Format:
     * `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the
     * EntityReconciliationJob in. Format:
     * `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob
        entityReconciliationJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob,
            com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob.Builder,
            com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJobOrBuilder>
        entityReconciliationJobBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The EntityReconciliationJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the entityReconciliationJob field is set.
     */
    public boolean hasEntityReconciliationJob() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The EntityReconciliationJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The entityReconciliationJob.
     */
    public com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob
        getEntityReconciliationJob() {
      if (entityReconciliationJobBuilder_ == null) {
        return entityReconciliationJob_ == null
            ? com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob
                .getDefaultInstance()
            : entityReconciliationJob_;
      } else {
        return entityReconciliationJobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The EntityReconciliationJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntityReconciliationJob(
        com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob value) {
      if (entityReconciliationJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entityReconciliationJob_ = value;
      } else {
        entityReconciliationJobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The EntityReconciliationJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntityReconciliationJob(
        com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob.Builder
            builderForValue) {
      if (entityReconciliationJobBuilder_ == null) {
        entityReconciliationJob_ = builderForValue.build();
      } else {
        entityReconciliationJobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The EntityReconciliationJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEntityReconciliationJob(
        com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob value) {
      if (entityReconciliationJobBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && entityReconciliationJob_ != null
            && entityReconciliationJob_
                != com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob
                    .getDefaultInstance()) {
          getEntityReconciliationJobBuilder().mergeFrom(value);
        } else {
          entityReconciliationJob_ = value;
        }
      } else {
        entityReconciliationJobBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The EntityReconciliationJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEntityReconciliationJob() {
      bitField0_ = (bitField0_ & ~0x00000002);
      entityReconciliationJob_ = null;
      if (entityReconciliationJobBuilder_ != null) {
        entityReconciliationJobBuilder_.dispose();
        entityReconciliationJobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The EntityReconciliationJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob.Builder
        getEntityReconciliationJobBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEntityReconciliationJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The EntityReconciliationJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJobOrBuilder
        getEntityReconciliationJobOrBuilder() {
      if (entityReconciliationJobBuilder_ != null) {
        return entityReconciliationJobBuilder_.getMessageOrBuilder();
      } else {
        return entityReconciliationJob_ == null
            ? com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob
                .getDefaultInstance()
            : entityReconciliationJob_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The EntityReconciliationJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob,
            com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob.Builder,
            com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJobOrBuilder>
        getEntityReconciliationJobFieldBuilder() {
      if (entityReconciliationJobBuilder_ == null) {
        entityReconciliationJobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob,
                com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob.Builder,
                com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJobOrBuilder>(
                getEntityReconciliationJob(), getParentForChildren(), isClean());
        entityReconciliationJob_ = null;
      }
      return entityReconciliationJobBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest)
  private static final com.google.cloud.enterpriseknowledgegraph.v1
          .CreateEntityReconciliationJobRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest();
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEntityReconciliationJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateEntityReconciliationJobRequest>() {
        @java.lang.Override
        public CreateEntityReconciliationJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEntityReconciliationJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEntityReconciliationJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
