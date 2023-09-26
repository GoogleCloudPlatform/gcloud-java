// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1alpha/os_policy_assignments.proto

package com.google.cloud.osconfig.v1alpha;

/**
 * <pre>
 * A request message to update an OS policy assignment
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest}
 */
public final class UpdateOSPolicyAssignmentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest)
    UpdateOSPolicyAssignmentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateOSPolicyAssignmentRequest.newBuilder() to construct.
  private UpdateOSPolicyAssignmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateOSPolicyAssignmentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateOSPolicyAssignmentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.osconfig.v1alpha.OsPolicyAssignmentsProto.internal_static_google_cloud_osconfig_v1alpha_UpdateOSPolicyAssignmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.v1alpha.OsPolicyAssignmentsProto.internal_static_google_cloud_osconfig_v1alpha_UpdateOSPolicyAssignmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest.class, com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest.Builder.class);
  }

  public static final int OS_POLICY_ASSIGNMENT_FIELD_NUMBER = 1;
  private com.google.cloud.osconfig.v1alpha.OSPolicyAssignment osPolicyAssignment_;
  /**
   * <pre>
   * Required. The updated OS policy assignment.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the osPolicyAssignment field is set.
   */
  @java.lang.Override
  public boolean hasOsPolicyAssignment() {
    return osPolicyAssignment_ != null;
  }
  /**
   * <pre>
   * Required. The updated OS policy assignment.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The osPolicyAssignment.
   */
  @java.lang.Override
  public com.google.cloud.osconfig.v1alpha.OSPolicyAssignment getOsPolicyAssignment() {
    return osPolicyAssignment_ == null ? com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.getDefaultInstance() : osPolicyAssignment_;
  }
  /**
   * <pre>
   * Required. The updated OS policy assignment.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentOrBuilder getOsPolicyAssignmentOrBuilder() {
    return osPolicyAssignment_ == null ? com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.getDefaultInstance() : osPolicyAssignment_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Optional. Field mask that controls which fields of the assignment should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Optional. Field mask that controls which fields of the assignment should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Optional. Field mask that controls which fields of the assignment should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (osPolicyAssignment_ != null) {
      output.writeMessage(1, getOsPolicyAssignment());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (osPolicyAssignment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOsPolicyAssignment());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest other = (com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest) obj;

    if (hasOsPolicyAssignment() != other.hasOsPolicyAssignment()) return false;
    if (hasOsPolicyAssignment()) {
      if (!getOsPolicyAssignment()
          .equals(other.getOsPolicyAssignment())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasOsPolicyAssignment()) {
      hash = (37 * hash) + OS_POLICY_ASSIGNMENT_FIELD_NUMBER;
      hash = (53 * hash) + getOsPolicyAssignment().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A request message to update an OS policy assignment
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest)
      com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.osconfig.v1alpha.OsPolicyAssignmentsProto.internal_static_google_cloud_osconfig_v1alpha_UpdateOSPolicyAssignmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.v1alpha.OsPolicyAssignmentsProto.internal_static_google_cloud_osconfig_v1alpha_UpdateOSPolicyAssignmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest.class, com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest.Builder.class);
    }

    // Construct using com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      osPolicyAssignment_ = null;
      if (osPolicyAssignmentBuilder_ != null) {
        osPolicyAssignmentBuilder_.dispose();
        osPolicyAssignmentBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.osconfig.v1alpha.OsPolicyAssignmentsProto.internal_static_google_cloud_osconfig_v1alpha_UpdateOSPolicyAssignmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest getDefaultInstanceForType() {
      return com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest build() {
      com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest buildPartial() {
      com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest result = new com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.osPolicyAssignment_ = osPolicyAssignmentBuilder_ == null
            ? osPolicyAssignment_
            : osPolicyAssignmentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest) {
        return mergeFrom((com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest other) {
      if (other == com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest.getDefaultInstance()) return this;
      if (other.hasOsPolicyAssignment()) {
        mergeOsPolicyAssignment(other.getOsPolicyAssignment());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
            case 10: {
              input.readMessage(
                  getOsPolicyAssignmentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
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

    private com.google.cloud.osconfig.v1alpha.OSPolicyAssignment osPolicyAssignment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.osconfig.v1alpha.OSPolicyAssignment, com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.Builder, com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentOrBuilder> osPolicyAssignmentBuilder_;
    /**
     * <pre>
     * Required. The updated OS policy assignment.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the osPolicyAssignment field is set.
     */
    public boolean hasOsPolicyAssignment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The updated OS policy assignment.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The osPolicyAssignment.
     */
    public com.google.cloud.osconfig.v1alpha.OSPolicyAssignment getOsPolicyAssignment() {
      if (osPolicyAssignmentBuilder_ == null) {
        return osPolicyAssignment_ == null ? com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.getDefaultInstance() : osPolicyAssignment_;
      } else {
        return osPolicyAssignmentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The updated OS policy assignment.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOsPolicyAssignment(com.google.cloud.osconfig.v1alpha.OSPolicyAssignment value) {
      if (osPolicyAssignmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        osPolicyAssignment_ = value;
      } else {
        osPolicyAssignmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The updated OS policy assignment.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOsPolicyAssignment(
        com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.Builder builderForValue) {
      if (osPolicyAssignmentBuilder_ == null) {
        osPolicyAssignment_ = builderForValue.build();
      } else {
        osPolicyAssignmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The updated OS policy assignment.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeOsPolicyAssignment(com.google.cloud.osconfig.v1alpha.OSPolicyAssignment value) {
      if (osPolicyAssignmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          osPolicyAssignment_ != null &&
          osPolicyAssignment_ != com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.getDefaultInstance()) {
          getOsPolicyAssignmentBuilder().mergeFrom(value);
        } else {
          osPolicyAssignment_ = value;
        }
      } else {
        osPolicyAssignmentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The updated OS policy assignment.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearOsPolicyAssignment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      osPolicyAssignment_ = null;
      if (osPolicyAssignmentBuilder_ != null) {
        osPolicyAssignmentBuilder_.dispose();
        osPolicyAssignmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The updated OS policy assignment.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.Builder getOsPolicyAssignmentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOsPolicyAssignmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The updated OS policy assignment.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentOrBuilder getOsPolicyAssignmentOrBuilder() {
      if (osPolicyAssignmentBuilder_ != null) {
        return osPolicyAssignmentBuilder_.getMessageOrBuilder();
      } else {
        return osPolicyAssignment_ == null ?
            com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.getDefaultInstance() : osPolicyAssignment_;
      }
    }
    /**
     * <pre>
     * Required. The updated OS policy assignment.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.osconfig.v1alpha.OSPolicyAssignment, com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.Builder, com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentOrBuilder> 
        getOsPolicyAssignmentFieldBuilder() {
      if (osPolicyAssignmentBuilder_ == null) {
        osPolicyAssignmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.osconfig.v1alpha.OSPolicyAssignment, com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.Builder, com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentOrBuilder>(
                getOsPolicyAssignment(),
                getParentForChildren(),
                isClean());
        osPolicyAssignment_ = null;
      }
      return osPolicyAssignmentBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Optional. Field mask that controls which fields of the assignment should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Optional. Field mask that controls which fields of the assignment should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Field mask that controls which fields of the assignment should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Field mask that controls which fields of the assignment should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Field mask that controls which fields of the assignment should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Field mask that controls which fields of the assignment should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Field mask that controls which fields of the assignment should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Field mask that controls which fields of the assignment should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Optional. Field mask that controls which fields of the assignment should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest)
  private static final com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest();
  }

  public static com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateOSPolicyAssignmentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateOSPolicyAssignmentRequest>() {
    @java.lang.Override
    public UpdateOSPolicyAssignmentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateOSPolicyAssignmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateOSPolicyAssignmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

