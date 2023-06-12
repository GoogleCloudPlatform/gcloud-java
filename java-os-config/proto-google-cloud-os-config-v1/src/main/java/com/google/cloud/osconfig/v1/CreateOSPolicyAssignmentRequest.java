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
// source: google/cloud/osconfig/v1/os_policy_assignments.proto

package com.google.cloud.osconfig.v1;

/**
 *
 *
 * <pre>
 * A request message to create an OS policy assignment
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest}
 */
public final class CreateOSPolicyAssignmentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest)
    CreateOSPolicyAssignmentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateOSPolicyAssignmentRequest.newBuilder() to construct.
  private CreateOSPolicyAssignmentRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateOSPolicyAssignmentRequest() {
    parent_ = "";
    osPolicyAssignmentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateOSPolicyAssignmentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto
        .internal_static_google_cloud_osconfig_v1_CreateOSPolicyAssignmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto
        .internal_static_google_cloud_osconfig_v1_CreateOSPolicyAssignmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest.class,
            com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource name in the form:
   * projects/{project}/locations/{location}
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
   * Required. The parent resource name in the form:
   * projects/{project}/locations/{location}
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

  public static final int OS_POLICY_ASSIGNMENT_FIELD_NUMBER = 2;
  private com.google.cloud.osconfig.v1.OSPolicyAssignment osPolicyAssignment_;
  /**
   *
   *
   * <pre>
   * Required. The OS policy assignment to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the osPolicyAssignment field is set.
   */
  @java.lang.Override
  public boolean hasOsPolicyAssignment() {
    return osPolicyAssignment_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The OS policy assignment to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The osPolicyAssignment.
   */
  @java.lang.Override
  public com.google.cloud.osconfig.v1.OSPolicyAssignment getOsPolicyAssignment() {
    return osPolicyAssignment_ == null
        ? com.google.cloud.osconfig.v1.OSPolicyAssignment.getDefaultInstance()
        : osPolicyAssignment_;
  }
  /**
   *
   *
   * <pre>
   * Required. The OS policy assignment to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder getOsPolicyAssignmentOrBuilder() {
    return osPolicyAssignment_ == null
        ? com.google.cloud.osconfig.v1.OSPolicyAssignment.getDefaultInstance()
        : osPolicyAssignment_;
  }

  public static final int OS_POLICY_ASSIGNMENT_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object osPolicyAssignmentId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The logical name of the OS policy assignment in the project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-63 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the project.
   * </pre>
   *
   * <code>string os_policy_assignment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The osPolicyAssignmentId.
   */
  @java.lang.Override
  public java.lang.String getOsPolicyAssignmentId() {
    java.lang.Object ref = osPolicyAssignmentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      osPolicyAssignmentId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The logical name of the OS policy assignment in the project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-63 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the project.
   * </pre>
   *
   * <code>string os_policy_assignment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for osPolicyAssignmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOsPolicyAssignmentIdBytes() {
    java.lang.Object ref = osPolicyAssignmentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      osPolicyAssignmentId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (osPolicyAssignment_ != null) {
      output.writeMessage(2, getOsPolicyAssignment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(osPolicyAssignmentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, osPolicyAssignmentId_);
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
    if (osPolicyAssignment_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getOsPolicyAssignment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(osPolicyAssignmentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, osPolicyAssignmentId_);
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
    if (!(obj instanceof com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest other =
        (com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasOsPolicyAssignment() != other.hasOsPolicyAssignment()) return false;
    if (hasOsPolicyAssignment()) {
      if (!getOsPolicyAssignment().equals(other.getOsPolicyAssignment())) return false;
    }
    if (!getOsPolicyAssignmentId().equals(other.getOsPolicyAssignmentId())) return false;
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
    if (hasOsPolicyAssignment()) {
      hash = (37 * hash) + OS_POLICY_ASSIGNMENT_FIELD_NUMBER;
      hash = (53 * hash) + getOsPolicyAssignment().hashCode();
    }
    hash = (37 * hash) + OS_POLICY_ASSIGNMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOsPolicyAssignmentId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest parseFrom(
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
      com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest prototype) {
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
   * A request message to create an OS policy assignment
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest)
      com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto
          .internal_static_google_cloud_osconfig_v1_CreateOSPolicyAssignmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto
          .internal_static_google_cloud_osconfig_v1_CreateOSPolicyAssignmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest.class,
              com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest.Builder.class);
    }

    // Construct using com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      osPolicyAssignment_ = null;
      if (osPolicyAssignmentBuilder_ != null) {
        osPolicyAssignmentBuilder_.dispose();
        osPolicyAssignmentBuilder_ = null;
      }
      osPolicyAssignmentId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto
          .internal_static_google_cloud_osconfig_v1_CreateOSPolicyAssignmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest
        getDefaultInstanceForType() {
      return com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest build() {
      com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest buildPartial() {
      com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest result =
          new com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.osPolicyAssignment_ =
            osPolicyAssignmentBuilder_ == null
                ? osPolicyAssignment_
                : osPolicyAssignmentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.osPolicyAssignmentId_ = osPolicyAssignmentId_;
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
      if (other instanceof com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest) {
        return mergeFrom((com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest other) {
      if (other
          == com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasOsPolicyAssignment()) {
        mergeOsPolicyAssignment(other.getOsPolicyAssignment());
      }
      if (!other.getOsPolicyAssignmentId().isEmpty()) {
        osPolicyAssignmentId_ = other.osPolicyAssignmentId_;
        bitField0_ |= 0x00000004;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getOsPolicyAssignmentFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                osPolicyAssignmentId_ = input.readStringRequireUtf8();
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
     * Required. The parent resource name in the form:
     * projects/{project}/locations/{location}
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
     * Required. The parent resource name in the form:
     * projects/{project}/locations/{location}
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
     * Required. The parent resource name in the form:
     * projects/{project}/locations/{location}
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
     * Required. The parent resource name in the form:
     * projects/{project}/locations/{location}
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
     * Required. The parent resource name in the form:
     * projects/{project}/locations/{location}
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

    private com.google.cloud.osconfig.v1.OSPolicyAssignment osPolicyAssignment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.osconfig.v1.OSPolicyAssignment,
            com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder,
            com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder>
        osPolicyAssignmentBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The OS policy assignment to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the osPolicyAssignment field is set.
     */
    public boolean hasOsPolicyAssignment() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The OS policy assignment to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The osPolicyAssignment.
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignment getOsPolicyAssignment() {
      if (osPolicyAssignmentBuilder_ == null) {
        return osPolicyAssignment_ == null
            ? com.google.cloud.osconfig.v1.OSPolicyAssignment.getDefaultInstance()
            : osPolicyAssignment_;
      } else {
        return osPolicyAssignmentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The OS policy assignment to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setOsPolicyAssignment(com.google.cloud.osconfig.v1.OSPolicyAssignment value) {
      if (osPolicyAssignmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        osPolicyAssignment_ = value;
      } else {
        osPolicyAssignmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The OS policy assignment to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setOsPolicyAssignment(
        com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder builderForValue) {
      if (osPolicyAssignmentBuilder_ == null) {
        osPolicyAssignment_ = builderForValue.build();
      } else {
        osPolicyAssignmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The OS policy assignment to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeOsPolicyAssignment(com.google.cloud.osconfig.v1.OSPolicyAssignment value) {
      if (osPolicyAssignmentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && osPolicyAssignment_ != null
            && osPolicyAssignment_
                != com.google.cloud.osconfig.v1.OSPolicyAssignment.getDefaultInstance()) {
          getOsPolicyAssignmentBuilder().mergeFrom(value);
        } else {
          osPolicyAssignment_ = value;
        }
      } else {
        osPolicyAssignmentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The OS policy assignment to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearOsPolicyAssignment() {
      bitField0_ = (bitField0_ & ~0x00000002);
      osPolicyAssignment_ = null;
      if (osPolicyAssignmentBuilder_ != null) {
        osPolicyAssignmentBuilder_.dispose();
        osPolicyAssignmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The OS policy assignment to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder getOsPolicyAssignmentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOsPolicyAssignmentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The OS policy assignment to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder
        getOsPolicyAssignmentOrBuilder() {
      if (osPolicyAssignmentBuilder_ != null) {
        return osPolicyAssignmentBuilder_.getMessageOrBuilder();
      } else {
        return osPolicyAssignment_ == null
            ? com.google.cloud.osconfig.v1.OSPolicyAssignment.getDefaultInstance()
            : osPolicyAssignment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The OS policy assignment to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.osconfig.v1.OSPolicyAssignment,
            com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder,
            com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder>
        getOsPolicyAssignmentFieldBuilder() {
      if (osPolicyAssignmentBuilder_ == null) {
        osPolicyAssignmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.osconfig.v1.OSPolicyAssignment,
                com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder,
                com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder>(
                getOsPolicyAssignment(), getParentForChildren(), isClean());
        osPolicyAssignment_ = null;
      }
      return osPolicyAssignmentBuilder_;
    }

    private java.lang.Object osPolicyAssignmentId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The logical name of the OS policy assignment in the project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * </pre>
     *
     * <code>string os_policy_assignment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The osPolicyAssignmentId.
     */
    public java.lang.String getOsPolicyAssignmentId() {
      java.lang.Object ref = osPolicyAssignmentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        osPolicyAssignmentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The logical name of the OS policy assignment in the project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * </pre>
     *
     * <code>string os_policy_assignment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for osPolicyAssignmentId.
     */
    public com.google.protobuf.ByteString getOsPolicyAssignmentIdBytes() {
      java.lang.Object ref = osPolicyAssignmentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        osPolicyAssignmentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The logical name of the OS policy assignment in the project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * </pre>
     *
     * <code>string os_policy_assignment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The osPolicyAssignmentId to set.
     * @return This builder for chaining.
     */
    public Builder setOsPolicyAssignmentId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      osPolicyAssignmentId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The logical name of the OS policy assignment in the project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * </pre>
     *
     * <code>string os_policy_assignment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOsPolicyAssignmentId() {
      osPolicyAssignmentId_ = getDefaultInstance().getOsPolicyAssignmentId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The logical name of the OS policy assignment in the project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * </pre>
     *
     * <code>string os_policy_assignment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for osPolicyAssignmentId to set.
     * @return This builder for chaining.
     */
    public Builder setOsPolicyAssignmentIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      osPolicyAssignmentId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest)
  private static final com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest();
  }

  public static com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateOSPolicyAssignmentRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateOSPolicyAssignmentRequest>() {
        @java.lang.Override
        public CreateOSPolicyAssignmentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateOSPolicyAssignmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateOSPolicyAssignmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
