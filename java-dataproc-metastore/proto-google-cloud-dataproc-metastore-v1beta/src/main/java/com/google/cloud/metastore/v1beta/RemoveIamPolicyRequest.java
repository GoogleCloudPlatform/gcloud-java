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
// source: google/cloud/metastore/v1beta/metastore.proto

package com.google.cloud.metastore.v1beta;

/**
 *
 *
 * <pre>
 * Request message for
 * [DataprocMetastore.RemoveIamPolicy][google.cloud.metastore.v1beta.DataprocMetastore.RemoveIamPolicy].
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1beta.RemoveIamPolicyRequest}
 */
public final class RemoveIamPolicyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1beta.RemoveIamPolicyRequest)
    RemoveIamPolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RemoveIamPolicyRequest.newBuilder() to construct.
  private RemoveIamPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RemoveIamPolicyRequest() {
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RemoveIamPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.metastore.v1beta.MetastoreProto
        .internal_static_google_cloud_metastore_v1beta_RemoveIamPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1beta.MetastoreProto
        .internal_static_google_cloud_metastore_v1beta_RemoveIamPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest.class,
            com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resource_ = "";
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the dataplane resource to remove
   * IAM policy, in the following form:
   * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}`
   * or
   * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}/tables/{table_id}`.
   * </pre>
   *
   * <code>
   * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the dataplane resource to remove
   * IAM policy, in the following form:
   * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}`
   * or
   * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}/tables/{table_id}`.
   * </pre>
   *
   * <code>
   * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASYNCHRONOUS_FIELD_NUMBER = 2;
  private boolean asynchronous_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Removes IAM policy attached to database or table asynchronously
   * when it is set. The default is false.
   * </pre>
   *
   * <code>bool asynchronous = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The asynchronous.
   */
  @java.lang.Override
  public boolean getAsynchronous() {
    return asynchronous_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resource_);
    }
    if (asynchronous_ != false) {
      output.writeBool(2, asynchronous_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resource_);
    }
    if (asynchronous_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, asynchronous_);
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
    if (!(obj instanceof com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest other =
        (com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest) obj;

    if (!getResource().equals(other.getResource())) return false;
    if (getAsynchronous() != other.getAsynchronous()) return false;
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
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (37 * hash) + ASYNCHRONOUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAsynchronous());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest parseFrom(
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
      com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest prototype) {
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
   * Request message for
   * [DataprocMetastore.RemoveIamPolicy][google.cloud.metastore.v1beta.DataprocMetastore.RemoveIamPolicy].
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1beta.RemoveIamPolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1beta.RemoveIamPolicyRequest)
      com.google.cloud.metastore.v1beta.RemoveIamPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.metastore.v1beta.MetastoreProto
          .internal_static_google_cloud_metastore_v1beta_RemoveIamPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1beta.MetastoreProto
          .internal_static_google_cloud_metastore_v1beta_RemoveIamPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest.class,
              com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resource_ = "";
      asynchronous_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.metastore.v1beta.MetastoreProto
          .internal_static_google_cloud_metastore_v1beta_RemoveIamPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest build() {
      com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest buildPartial() {
      com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest result =
          new com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resource_ = resource_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.asynchronous_ = asynchronous_;
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
      if (other instanceof com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest) {
        return mergeFrom((com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest other) {
      if (other == com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest.getDefaultInstance())
        return this;
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAsynchronous() != false) {
        setAsynchronous(other.getAsynchronous());
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
                resource_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                asynchronous_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the dataplane resource to remove
     * IAM policy, in the following form:
     * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}`
     * or
     * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}/tables/{table_id}`.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the dataplane resource to remove
     * IAM policy, in the following form:
     * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}`
     * or
     * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}/tables/{table_id}`.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the dataplane resource to remove
     * IAM policy, in the following form:
     * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}`
     * or
     * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}/tables/{table_id}`.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resource_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the dataplane resource to remove
     * IAM policy, in the following form:
     * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}`
     * or
     * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}/tables/{table_id}`.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {
      resource_ = getDefaultInstance().getResource();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the dataplane resource to remove
     * IAM policy, in the following form:
     * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}`
     * or
     * `projects/{project_id}/locations/{location_id}/services/{service_id}/databases/{database_id}/tables/{table_id}`.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resource_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean asynchronous_;
    /**
     *
     *
     * <pre>
     * Optional. Removes IAM policy attached to database or table asynchronously
     * when it is set. The default is false.
     * </pre>
     *
     * <code>bool asynchronous = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The asynchronous.
     */
    @java.lang.Override
    public boolean getAsynchronous() {
      return asynchronous_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Removes IAM policy attached to database or table asynchronously
     * when it is set. The default is false.
     * </pre>
     *
     * <code>bool asynchronous = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The asynchronous to set.
     * @return This builder for chaining.
     */
    public Builder setAsynchronous(boolean value) {

      asynchronous_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Removes IAM policy attached to database or table asynchronously
     * when it is set. The default is false.
     * </pre>
     *
     * <code>bool asynchronous = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAsynchronous() {
      bitField0_ = (bitField0_ & ~0x00000002);
      asynchronous_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1beta.RemoveIamPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1beta.RemoveIamPolicyRequest)
  private static final com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest();
  }

  public static com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveIamPolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<RemoveIamPolicyRequest>() {
        @java.lang.Override
        public RemoveIamPolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveIamPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveIamPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1beta.RemoveIamPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
