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
// source: google/cloud/retail/v2beta/serving_config_service.proto

package com.google.cloud.retail.v2beta;

/**
 *
 *
 * <pre>
 * Request for UpdateServingConfig method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.UpdateServingConfigRequest}
 */
public final class UpdateServingConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.UpdateServingConfigRequest)
    UpdateServingConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateServingConfigRequest.newBuilder() to construct.
  private UpdateServingConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateServingConfigRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateServingConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateServingConfigRequest(
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
          case 10:
            {
              com.google.cloud.retail.v2beta.ServingConfig.Builder subBuilder = null;
              if (servingConfig_ != null) {
                subBuilder = servingConfig_.toBuilder();
              }
              servingConfig_ =
                  input.readMessage(
                      com.google.cloud.retail.v2beta.ServingConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(servingConfig_);
                servingConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2beta.ServingConfigServiceProto
        .internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.ServingConfigServiceProto
        .internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.UpdateServingConfigRequest.class,
            com.google.cloud.retail.v2beta.UpdateServingConfigRequest.Builder.class);
  }

  public static final int SERVING_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.retail.v2beta.ServingConfig servingConfig_;
  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the servingConfig field is set.
   */
  @java.lang.Override
  public boolean hasServingConfig() {
    return servingConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The servingConfig.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.ServingConfig getServingConfig() {
    return servingConfig_ == null
        ? com.google.cloud.retail.v2beta.ServingConfig.getDefaultInstance()
        : servingConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.ServingConfigOrBuilder getServingConfigOrBuilder() {
    return getServingConfig();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
   * following are NOT supported:
   * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
   * If not set, all supported fields are updated.
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
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
   * following are NOT supported:
   * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
   * If not set, all supported fields are updated.
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
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
   * following are NOT supported:
   * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (servingConfig_ != null) {
      output.writeMessage(1, getServingConfig());
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
    if (servingConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getServingConfig());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.UpdateServingConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.UpdateServingConfigRequest other =
        (com.google.cloud.retail.v2beta.UpdateServingConfigRequest) obj;

    if (hasServingConfig() != other.hasServingConfig()) return false;
    if (hasServingConfig()) {
      if (!getServingConfig().equals(other.getServingConfig())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasServingConfig()) {
      hash = (37 * hash) + SERVING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getServingConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest parseFrom(
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
      com.google.cloud.retail.v2beta.UpdateServingConfigRequest prototype) {
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
   * Request for UpdateServingConfig method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.UpdateServingConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.UpdateServingConfigRequest)
      com.google.cloud.retail.v2beta.UpdateServingConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2beta.ServingConfigServiceProto
          .internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.ServingConfigServiceProto
          .internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.UpdateServingConfigRequest.class,
              com.google.cloud.retail.v2beta.UpdateServingConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.UpdateServingConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (servingConfigBuilder_ == null) {
        servingConfig_ = null;
      } else {
        servingConfig_ = null;
        servingConfigBuilder_ = null;
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
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2beta.ServingConfigServiceProto
          .internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.UpdateServingConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.UpdateServingConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.UpdateServingConfigRequest build() {
      com.google.cloud.retail.v2beta.UpdateServingConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.UpdateServingConfigRequest buildPartial() {
      com.google.cloud.retail.v2beta.UpdateServingConfigRequest result =
          new com.google.cloud.retail.v2beta.UpdateServingConfigRequest(this);
      if (servingConfigBuilder_ == null) {
        result.servingConfig_ = servingConfig_;
      } else {
        result.servingConfig_ = servingConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.retail.v2beta.UpdateServingConfigRequest) {
        return mergeFrom((com.google.cloud.retail.v2beta.UpdateServingConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.UpdateServingConfigRequest other) {
      if (other == com.google.cloud.retail.v2beta.UpdateServingConfigRequest.getDefaultInstance())
        return this;
      if (other.hasServingConfig()) {
        mergeServingConfig(other.getServingConfig());
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
      com.google.cloud.retail.v2beta.UpdateServingConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.retail.v2beta.UpdateServingConfigRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.retail.v2beta.ServingConfig servingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2beta.ServingConfig,
            com.google.cloud.retail.v2beta.ServingConfig.Builder,
            com.google.cloud.retail.v2beta.ServingConfigOrBuilder>
        servingConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the servingConfig field is set.
     */
    public boolean hasServingConfig() {
      return servingConfigBuilder_ != null || servingConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The servingConfig.
     */
    public com.google.cloud.retail.v2beta.ServingConfig getServingConfig() {
      if (servingConfigBuilder_ == null) {
        return servingConfig_ == null
            ? com.google.cloud.retail.v2beta.ServingConfig.getDefaultInstance()
            : servingConfig_;
      } else {
        return servingConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setServingConfig(com.google.cloud.retail.v2beta.ServingConfig value) {
      if (servingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        servingConfig_ = value;
        onChanged();
      } else {
        servingConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setServingConfig(
        com.google.cloud.retail.v2beta.ServingConfig.Builder builderForValue) {
      if (servingConfigBuilder_ == null) {
        servingConfig_ = builderForValue.build();
        onChanged();
      } else {
        servingConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeServingConfig(com.google.cloud.retail.v2beta.ServingConfig value) {
      if (servingConfigBuilder_ == null) {
        if (servingConfig_ != null) {
          servingConfig_ =
              com.google.cloud.retail.v2beta.ServingConfig.newBuilder(servingConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          servingConfig_ = value;
        }
        onChanged();
      } else {
        servingConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearServingConfig() {
      if (servingConfigBuilder_ == null) {
        servingConfig_ = null;
        onChanged();
      } else {
        servingConfig_ = null;
        servingConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2beta.ServingConfig.Builder getServingConfigBuilder() {

      onChanged();
      return getServingConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2beta.ServingConfigOrBuilder getServingConfigOrBuilder() {
      if (servingConfigBuilder_ != null) {
        return servingConfigBuilder_.getMessageOrBuilder();
      } else {
        return servingConfig_ == null
            ? com.google.cloud.retail.v2beta.ServingConfig.getDefaultInstance()
            : servingConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2beta.ServingConfig,
            com.google.cloud.retail.v2beta.ServingConfig.Builder,
            com.google.cloud.retail.v2beta.ServingConfigOrBuilder>
        getServingConfigFieldBuilder() {
      if (servingConfigBuilder_ == null) {
        servingConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.retail.v2beta.ServingConfig,
                com.google.cloud.retail.v2beta.ServingConfig.Builder,
                com.google.cloud.retail.v2beta.ServingConfigOrBuilder>(
                getServingConfig(), getParentForChildren(), isClean());
        servingConfig_ = null;
      }
      return servingConfigBuilder_;
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
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
     * following are NOT supported:
     * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
     * following are NOT supported:
     * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
     * If not set, all supported fields are updated.
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
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
     * following are NOT supported:
     * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
     * If not set, all supported fields are updated.
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
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
     * following are NOT supported:
     * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
     * following are NOT supported:
     * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
     * following are NOT supported:
     * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
     * following are NOT supported:
     * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
     * following are NOT supported:
     * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
     * If not set, all supported fields are updated.
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
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
     * following are NOT supported:
     * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
     * If not set, all supported fields are updated.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.UpdateServingConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.UpdateServingConfigRequest)
  private static final com.google.cloud.retail.v2beta.UpdateServingConfigRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.UpdateServingConfigRequest();
  }

  public static com.google.cloud.retail.v2beta.UpdateServingConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateServingConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateServingConfigRequest>() {
        @java.lang.Override
        public UpdateServingConfigRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateServingConfigRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateServingConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateServingConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.UpdateServingConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
