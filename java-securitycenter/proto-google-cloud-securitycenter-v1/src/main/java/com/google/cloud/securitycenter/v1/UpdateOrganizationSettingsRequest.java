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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Request message for updating an organization's settings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest}
 */
public final class UpdateOrganizationSettingsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest)
    UpdateOrganizationSettingsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateOrganizationSettingsRequest.newBuilder() to construct.
  private UpdateOrganizationSettingsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateOrganizationSettingsRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateOrganizationSettingsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_UpdateOrganizationSettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_UpdateOrganizationSettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest.class,
            com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest.Builder.class);
  }

  public static final int ORGANIZATION_SETTINGS_FIELD_NUMBER = 1;
  private com.google.cloud.securitycenter.v1.OrganizationSettings organizationSettings_;
  /**
   *
   *
   * <pre>
   * Required. The organization settings resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the organizationSettings field is set.
   */
  @java.lang.Override
  public boolean hasOrganizationSettings() {
    return organizationSettings_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The organization settings resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The organizationSettings.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.OrganizationSettings getOrganizationSettings() {
    return organizationSettings_ == null
        ? com.google.cloud.securitycenter.v1.OrganizationSettings.getDefaultInstance()
        : organizationSettings_;
  }
  /**
   *
   *
   * <pre>
   * Required. The organization settings resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.OrganizationSettingsOrBuilder
      getOrganizationSettingsOrBuilder() {
    return organizationSettings_ == null
        ? com.google.cloud.securitycenter.v1.OrganizationSettings.getDefaultInstance()
        : organizationSettings_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the settings resource.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the settings resource.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the settings resource.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (organizationSettings_ != null) {
      output.writeMessage(1, getOrganizationSettings());
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
    if (organizationSettings_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getOrganizationSettings());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest other =
        (com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest) obj;

    if (hasOrganizationSettings() != other.hasOrganizationSettings()) return false;
    if (hasOrganizationSettings()) {
      if (!getOrganizationSettings().equals(other.getOrganizationSettings())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasOrganizationSettings()) {
      hash = (37 * hash) + ORGANIZATION_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getOrganizationSettings().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest parseFrom(
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
      com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest prototype) {
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
   * Request message for updating an organization's settings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest)
      com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_UpdateOrganizationSettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_UpdateOrganizationSettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest.class,
              com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      organizationSettings_ = null;
      if (organizationSettingsBuilder_ != null) {
        organizationSettingsBuilder_.dispose();
        organizationSettingsBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_UpdateOrganizationSettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest build() {
      com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest buildPartial() {
      com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest result =
          new com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.organizationSettings_ =
            organizationSettingsBuilder_ == null
                ? organizationSettings_
                : organizationSettingsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest) {
        return mergeFrom(
            (com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest other) {
      if (other
          == com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest
              .getDefaultInstance()) return this;
      if (other.hasOrganizationSettings()) {
        mergeOrganizationSettings(other.getOrganizationSettings());
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
            case 10:
              {
                input.readMessage(
                    getOrganizationSettingsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.securitycenter.v1.OrganizationSettings organizationSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.OrganizationSettings,
            com.google.cloud.securitycenter.v1.OrganizationSettings.Builder,
            com.google.cloud.securitycenter.v1.OrganizationSettingsOrBuilder>
        organizationSettingsBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The organization settings resource to update.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the organizationSettings field is set.
     */
    public boolean hasOrganizationSettings() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The organization settings resource to update.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The organizationSettings.
     */
    public com.google.cloud.securitycenter.v1.OrganizationSettings getOrganizationSettings() {
      if (organizationSettingsBuilder_ == null) {
        return organizationSettings_ == null
            ? com.google.cloud.securitycenter.v1.OrganizationSettings.getDefaultInstance()
            : organizationSettings_;
      } else {
        return organizationSettingsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The organization settings resource to update.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setOrganizationSettings(
        com.google.cloud.securitycenter.v1.OrganizationSettings value) {
      if (organizationSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        organizationSettings_ = value;
      } else {
        organizationSettingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The organization settings resource to update.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setOrganizationSettings(
        com.google.cloud.securitycenter.v1.OrganizationSettings.Builder builderForValue) {
      if (organizationSettingsBuilder_ == null) {
        organizationSettings_ = builderForValue.build();
      } else {
        organizationSettingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The organization settings resource to update.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeOrganizationSettings(
        com.google.cloud.securitycenter.v1.OrganizationSettings value) {
      if (organizationSettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && organizationSettings_ != null
            && organizationSettings_
                != com.google.cloud.securitycenter.v1.OrganizationSettings.getDefaultInstance()) {
          getOrganizationSettingsBuilder().mergeFrom(value);
        } else {
          organizationSettings_ = value;
        }
      } else {
        organizationSettingsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The organization settings resource to update.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearOrganizationSettings() {
      bitField0_ = (bitField0_ & ~0x00000001);
      organizationSettings_ = null;
      if (organizationSettingsBuilder_ != null) {
        organizationSettingsBuilder_.dispose();
        organizationSettingsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The organization settings resource to update.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1.OrganizationSettings.Builder
        getOrganizationSettingsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOrganizationSettingsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The organization settings resource to update.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1.OrganizationSettingsOrBuilder
        getOrganizationSettingsOrBuilder() {
      if (organizationSettingsBuilder_ != null) {
        return organizationSettingsBuilder_.getMessageOrBuilder();
      } else {
        return organizationSettings_ == null
            ? com.google.cloud.securitycenter.v1.OrganizationSettings.getDefaultInstance()
            : organizationSettings_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The organization settings resource to update.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.OrganizationSettings,
            com.google.cloud.securitycenter.v1.OrganizationSettings.Builder,
            com.google.cloud.securitycenter.v1.OrganizationSettingsOrBuilder>
        getOrganizationSettingsFieldBuilder() {
      if (organizationSettingsBuilder_ == null) {
        organizationSettingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securitycenter.v1.OrganizationSettings,
                com.google.cloud.securitycenter.v1.OrganizationSettings.Builder,
                com.google.cloud.securitycenter.v1.OrganizationSettingsOrBuilder>(
                getOrganizationSettings(), getParentForChildren(), isClean());
        organizationSettings_ = null;
      }
      return organizationSettingsBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the settings resource.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the settings resource.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the settings resource.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     *
     *
     * <pre>
     * The FieldMask to use when updating the settings resource.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
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
     *
     *
     * <pre>
     * The FieldMask to use when updating the settings resource.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
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
     *
     *
     * <pre>
     * The FieldMask to use when updating the settings resource.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     *
     *
     * <pre>
     * The FieldMask to use when updating the settings resource.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the settings resource.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The FieldMask to use when updating the settings resource.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest)
  private static final com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest();
  }

  public static com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateOrganizationSettingsRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateOrganizationSettingsRequest>() {
        @java.lang.Override
        public UpdateOrganizationSettingsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateOrganizationSettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateOrganizationSettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
