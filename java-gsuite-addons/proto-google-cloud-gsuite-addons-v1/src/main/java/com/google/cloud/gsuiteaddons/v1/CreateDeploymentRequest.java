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
// source: google/cloud/gsuiteaddons/v1/gsuiteaddons.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gsuiteaddons.v1;

/**
 *
 *
 * <pre>
 * Request message to create a deployment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gsuiteaddons.v1.CreateDeploymentRequest}
 */
public final class CreateDeploymentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gsuiteaddons.v1.CreateDeploymentRequest)
    CreateDeploymentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateDeploymentRequest.newBuilder() to construct.
  private CreateDeploymentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDeploymentRequest() {
    parent_ = "";
    deploymentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDeploymentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
        .internal_static_google_cloud_gsuiteaddons_v1_CreateDeploymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
        .internal_static_google_cloud_gsuiteaddons_v1_CreateDeploymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest.class,
            com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Name of the project in which to create the deployment.
   *
   * Example: `projects/my_project`.
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
   * Required. Name of the project in which to create the deployment.
   *
   * Example: `projects/my_project`.
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

  public static final int DEPLOYMENT_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object deploymentId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The id to use for this deployment.  The full name of the created
   * resource will be `projects/&lt;project_number&gt;/deployments/&lt;deployment_id&gt;`.
   * </pre>
   *
   * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The deploymentId.
   */
  @java.lang.Override
  public java.lang.String getDeploymentId() {
    java.lang.Object ref = deploymentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deploymentId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The id to use for this deployment.  The full name of the created
   * resource will be `projects/&lt;project_number&gt;/deployments/&lt;deployment_id&gt;`.
   * </pre>
   *
   * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for deploymentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeploymentIdBytes() {
    java.lang.Object ref = deploymentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deploymentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPLOYMENT_FIELD_NUMBER = 3;
  private com.google.cloud.gsuiteaddons.v1.Deployment deployment_;
  /**
   *
   *
   * <pre>
   * Required. The deployment to create (deployment.name cannot be set).
   * </pre>
   *
   * <code>
   * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deployment field is set.
   */
  @java.lang.Override
  public boolean hasDeployment() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The deployment to create (deployment.name cannot be set).
   * </pre>
   *
   * <code>
   * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deployment.
   */
  @java.lang.Override
  public com.google.cloud.gsuiteaddons.v1.Deployment getDeployment() {
    return deployment_ == null
        ? com.google.cloud.gsuiteaddons.v1.Deployment.getDefaultInstance()
        : deployment_;
  }
  /**
   *
   *
   * <pre>
   * Required. The deployment to create (deployment.name cannot be set).
   * </pre>
   *
   * <code>
   * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gsuiteaddons.v1.DeploymentOrBuilder getDeploymentOrBuilder() {
    return deployment_ == null
        ? com.google.cloud.gsuiteaddons.v1.Deployment.getDefaultInstance()
        : deployment_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deploymentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deploymentId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getDeployment());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deploymentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deploymentId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getDeployment());
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
    if (!(obj instanceof com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest other =
        (com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getDeploymentId().equals(other.getDeploymentId())) return false;
    if (hasDeployment() != other.hasDeployment()) return false;
    if (hasDeployment()) {
      if (!getDeployment().equals(other.getDeployment())) return false;
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
    hash = (37 * hash) + DEPLOYMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeploymentId().hashCode();
    if (hasDeployment()) {
      hash = (37 * hash) + DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDeployment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest parseFrom(
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
      com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest prototype) {
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
   * Request message to create a deployment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gsuiteaddons.v1.CreateDeploymentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gsuiteaddons.v1.CreateDeploymentRequest)
      com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
          .internal_static_google_cloud_gsuiteaddons_v1_CreateDeploymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
          .internal_static_google_cloud_gsuiteaddons_v1_CreateDeploymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest.class,
              com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest.Builder.class);
    }

    // Construct using com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDeploymentFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      deploymentId_ = "";
      deployment_ = null;
      if (deploymentBuilder_ != null) {
        deploymentBuilder_.dispose();
        deploymentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
          .internal_static_google_cloud_gsuiteaddons_v1_CreateDeploymentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest getDefaultInstanceForType() {
      return com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest build() {
      com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest buildPartial() {
      com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest result =
          new com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deploymentId_ = deploymentId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.deployment_ = deploymentBuilder_ == null ? deployment_ : deploymentBuilder_.build();
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
      if (other instanceof com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest) {
        return mergeFrom((com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest other) {
      if (other == com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDeploymentId().isEmpty()) {
        deploymentId_ = other.deploymentId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasDeployment()) {
        mergeDeployment(other.getDeployment());
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
                deploymentId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getDeploymentFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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
     * Required. Name of the project in which to create the deployment.
     *
     * Example: `projects/my_project`.
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
     * Required. Name of the project in which to create the deployment.
     *
     * Example: `projects/my_project`.
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
     * Required. Name of the project in which to create the deployment.
     *
     * Example: `projects/my_project`.
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
     * Required. Name of the project in which to create the deployment.
     *
     * Example: `projects/my_project`.
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
     * Required. Name of the project in which to create the deployment.
     *
     * Example: `projects/my_project`.
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

    private java.lang.Object deploymentId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The id to use for this deployment.  The full name of the created
     * resource will be `projects/&lt;project_number&gt;/deployments/&lt;deployment_id&gt;`.
     * </pre>
     *
     * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The deploymentId.
     */
    public java.lang.String getDeploymentId() {
      java.lang.Object ref = deploymentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deploymentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The id to use for this deployment.  The full name of the created
     * resource will be `projects/&lt;project_number&gt;/deployments/&lt;deployment_id&gt;`.
     * </pre>
     *
     * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for deploymentId.
     */
    public com.google.protobuf.ByteString getDeploymentIdBytes() {
      java.lang.Object ref = deploymentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deploymentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The id to use for this deployment.  The full name of the created
     * resource will be `projects/&lt;project_number&gt;/deployments/&lt;deployment_id&gt;`.
     * </pre>
     *
     * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The deploymentId to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      deploymentId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The id to use for this deployment.  The full name of the created
     * resource will be `projects/&lt;project_number&gt;/deployments/&lt;deployment_id&gt;`.
     * </pre>
     *
     * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeploymentId() {
      deploymentId_ = getDefaultInstance().getDeploymentId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The id to use for this deployment.  The full name of the created
     * resource will be `projects/&lt;project_number&gt;/deployments/&lt;deployment_id&gt;`.
     * </pre>
     *
     * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for deploymentId to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      deploymentId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.gsuiteaddons.v1.Deployment deployment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gsuiteaddons.v1.Deployment,
            com.google.cloud.gsuiteaddons.v1.Deployment.Builder,
            com.google.cloud.gsuiteaddons.v1.DeploymentOrBuilder>
        deploymentBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The deployment to create (deployment.name cannot be set).
     * </pre>
     *
     * <code>
     * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the deployment field is set.
     */
    public boolean hasDeployment() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The deployment to create (deployment.name cannot be set).
     * </pre>
     *
     * <code>
     * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The deployment.
     */
    public com.google.cloud.gsuiteaddons.v1.Deployment getDeployment() {
      if (deploymentBuilder_ == null) {
        return deployment_ == null
            ? com.google.cloud.gsuiteaddons.v1.Deployment.getDefaultInstance()
            : deployment_;
      } else {
        return deploymentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The deployment to create (deployment.name cannot be set).
     * </pre>
     *
     * <code>
     * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDeployment(com.google.cloud.gsuiteaddons.v1.Deployment value) {
      if (deploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deployment_ = value;
      } else {
        deploymentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The deployment to create (deployment.name cannot be set).
     * </pre>
     *
     * <code>
     * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDeployment(
        com.google.cloud.gsuiteaddons.v1.Deployment.Builder builderForValue) {
      if (deploymentBuilder_ == null) {
        deployment_ = builderForValue.build();
      } else {
        deploymentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The deployment to create (deployment.name cannot be set).
     * </pre>
     *
     * <code>
     * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDeployment(com.google.cloud.gsuiteaddons.v1.Deployment value) {
      if (deploymentBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && deployment_ != null
            && deployment_ != com.google.cloud.gsuiteaddons.v1.Deployment.getDefaultInstance()) {
          getDeploymentBuilder().mergeFrom(value);
        } else {
          deployment_ = value;
        }
      } else {
        deploymentBuilder_.mergeFrom(value);
      }
      if (deployment_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The deployment to create (deployment.name cannot be set).
     * </pre>
     *
     * <code>
     * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDeployment() {
      bitField0_ = (bitField0_ & ~0x00000004);
      deployment_ = null;
      if (deploymentBuilder_ != null) {
        deploymentBuilder_.dispose();
        deploymentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The deployment to create (deployment.name cannot be set).
     * </pre>
     *
     * <code>
     * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gsuiteaddons.v1.Deployment.Builder getDeploymentBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDeploymentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The deployment to create (deployment.name cannot be set).
     * </pre>
     *
     * <code>
     * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gsuiteaddons.v1.DeploymentOrBuilder getDeploymentOrBuilder() {
      if (deploymentBuilder_ != null) {
        return deploymentBuilder_.getMessageOrBuilder();
      } else {
        return deployment_ == null
            ? com.google.cloud.gsuiteaddons.v1.Deployment.getDefaultInstance()
            : deployment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The deployment to create (deployment.name cannot be set).
     * </pre>
     *
     * <code>
     * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gsuiteaddons.v1.Deployment,
            com.google.cloud.gsuiteaddons.v1.Deployment.Builder,
            com.google.cloud.gsuiteaddons.v1.DeploymentOrBuilder>
        getDeploymentFieldBuilder() {
      if (deploymentBuilder_ == null) {
        deploymentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gsuiteaddons.v1.Deployment,
                com.google.cloud.gsuiteaddons.v1.Deployment.Builder,
                com.google.cloud.gsuiteaddons.v1.DeploymentOrBuilder>(
                getDeployment(), getParentForChildren(), isClean());
        deployment_ = null;
      }
      return deploymentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gsuiteaddons.v1.CreateDeploymentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gsuiteaddons.v1.CreateDeploymentRequest)
  private static final com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest();
  }

  public static com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDeploymentRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDeploymentRequest>() {
        @java.lang.Override
        public CreateDeploymentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDeploymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDeploymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
