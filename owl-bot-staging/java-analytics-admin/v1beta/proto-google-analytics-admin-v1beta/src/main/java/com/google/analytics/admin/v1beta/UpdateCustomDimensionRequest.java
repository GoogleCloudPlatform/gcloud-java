// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

/**
 * <pre>
 * Request message for UpdateCustomDimension RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.UpdateCustomDimensionRequest}
 */
public final class UpdateCustomDimensionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.UpdateCustomDimensionRequest)
    UpdateCustomDimensionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateCustomDimensionRequest.newBuilder() to construct.
  private UpdateCustomDimensionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCustomDimensionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateCustomDimensionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateCustomDimensionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.analytics.admin.v1beta.CustomDimension.Builder subBuilder = null;
            if (customDimension_ != null) {
              subBuilder = customDimension_.toBuilder();
            }
            customDimension_ = input.readMessage(com.google.analytics.admin.v1beta.CustomDimension.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(customDimension_);
              customDimension_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_UpdateCustomDimensionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_UpdateCustomDimensionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest.class, com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest.Builder.class);
  }

  public static final int CUSTOM_DIMENSION_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1beta.CustomDimension customDimension_;
  /**
   * <pre>
   * The CustomDimension to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
   * @return Whether the customDimension field is set.
   */
  @java.lang.Override
  public boolean hasCustomDimension() {
    return customDimension_ != null;
  }
  /**
   * <pre>
   * The CustomDimension to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
   * @return The customDimension.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.CustomDimension getCustomDimension() {
    return customDimension_ == null ? com.google.analytics.admin.v1beta.CustomDimension.getDefaultInstance() : customDimension_;
  }
  /**
   * <pre>
   * The CustomDimension to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.CustomDimensionOrBuilder getCustomDimensionOrBuilder() {
    return getCustomDimension();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be updated.
   * To replace the entire entity, use one path with the string "*" to match
   * all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be updated.
   * To replace the entire entity, use one path with the string "*" to match
   * all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be updated.
   * To replace the entire entity, use one path with the string "*" to match
   * all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (customDimension_ != null) {
      output.writeMessage(1, getCustomDimension());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customDimension_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCustomDimension());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest other = (com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest) obj;

    if (hasCustomDimension() != other.hasCustomDimension()) return false;
    if (hasCustomDimension()) {
      if (!getCustomDimension()
          .equals(other.getCustomDimension())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCustomDimension()) {
      hash = (37 * hash) + CUSTOM_DIMENSION_FIELD_NUMBER;
      hash = (53 * hash) + getCustomDimension().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest prototype) {
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
   * Request message for UpdateCustomDimension RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.UpdateCustomDimensionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.UpdateCustomDimensionRequest)
      com.google.analytics.admin.v1beta.UpdateCustomDimensionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_UpdateCustomDimensionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_UpdateCustomDimensionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest.class, com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (customDimensionBuilder_ == null) {
        customDimension_ = null;
      } else {
        customDimension_ = null;
        customDimensionBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_UpdateCustomDimensionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest build() {
      com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest buildPartial() {
      com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest result = new com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest(this);
      if (customDimensionBuilder_ == null) {
        result.customDimension_ = customDimension_;
      } else {
        result.customDimension_ = customDimensionBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest) {
        return mergeFrom((com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest other) {
      if (other == com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest.getDefaultInstance()) return this;
      if (other.hasCustomDimension()) {
        mergeCustomDimension(other.getCustomDimension());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.analytics.admin.v1beta.CustomDimension customDimension_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1beta.CustomDimension, com.google.analytics.admin.v1beta.CustomDimension.Builder, com.google.analytics.admin.v1beta.CustomDimensionOrBuilder> customDimensionBuilder_;
    /**
     * <pre>
     * The CustomDimension to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
     * @return Whether the customDimension field is set.
     */
    public boolean hasCustomDimension() {
      return customDimensionBuilder_ != null || customDimension_ != null;
    }
    /**
     * <pre>
     * The CustomDimension to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
     * @return The customDimension.
     */
    public com.google.analytics.admin.v1beta.CustomDimension getCustomDimension() {
      if (customDimensionBuilder_ == null) {
        return customDimension_ == null ? com.google.analytics.admin.v1beta.CustomDimension.getDefaultInstance() : customDimension_;
      } else {
        return customDimensionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The CustomDimension to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
     */
    public Builder setCustomDimension(com.google.analytics.admin.v1beta.CustomDimension value) {
      if (customDimensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customDimension_ = value;
        onChanged();
      } else {
        customDimensionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The CustomDimension to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
     */
    public Builder setCustomDimension(
        com.google.analytics.admin.v1beta.CustomDimension.Builder builderForValue) {
      if (customDimensionBuilder_ == null) {
        customDimension_ = builderForValue.build();
        onChanged();
      } else {
        customDimensionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The CustomDimension to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
     */
    public Builder mergeCustomDimension(com.google.analytics.admin.v1beta.CustomDimension value) {
      if (customDimensionBuilder_ == null) {
        if (customDimension_ != null) {
          customDimension_ =
            com.google.analytics.admin.v1beta.CustomDimension.newBuilder(customDimension_).mergeFrom(value).buildPartial();
        } else {
          customDimension_ = value;
        }
        onChanged();
      } else {
        customDimensionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The CustomDimension to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
     */
    public Builder clearCustomDimension() {
      if (customDimensionBuilder_ == null) {
        customDimension_ = null;
        onChanged();
      } else {
        customDimension_ = null;
        customDimensionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The CustomDimension to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
     */
    public com.google.analytics.admin.v1beta.CustomDimension.Builder getCustomDimensionBuilder() {
      
      onChanged();
      return getCustomDimensionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The CustomDimension to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
     */
    public com.google.analytics.admin.v1beta.CustomDimensionOrBuilder getCustomDimensionOrBuilder() {
      if (customDimensionBuilder_ != null) {
        return customDimensionBuilder_.getMessageOrBuilder();
      } else {
        return customDimension_ == null ?
            com.google.analytics.admin.v1beta.CustomDimension.getDefaultInstance() : customDimension_;
      }
    }
    /**
     * <pre>
     * The CustomDimension to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.CustomDimension custom_dimension = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1beta.CustomDimension, com.google.analytics.admin.v1beta.CustomDimension.Builder, com.google.analytics.admin.v1beta.CustomDimensionOrBuilder> 
        getCustomDimensionFieldBuilder() {
      if (customDimensionBuilder_ == null) {
        customDimensionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1beta.CustomDimension, com.google.analytics.admin.v1beta.CustomDimension.Builder, com.google.analytics.admin.v1beta.CustomDimensionOrBuilder>(
                getCustomDimension(),
                getParentForChildren(),
                isClean());
        customDimension_ = null;
      }
      return customDimensionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.UpdateCustomDimensionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.UpdateCustomDimensionRequest)
  private static final com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest();
  }

  public static com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCustomDimensionRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCustomDimensionRequest>() {
    @java.lang.Override
    public UpdateCustomDimensionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateCustomDimensionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateCustomDimensionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCustomDimensionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.UpdateCustomDimensionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

