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
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * SurgeSettings contains the parameters for Surge update.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.SurgeSettings}
 */
public final class SurgeSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.SurgeSettings)
    SurgeSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SurgeSettings.newBuilder() to construct.
  private SurgeSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SurgeSettings() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SurgeSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_SurgeSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_SurgeSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.SurgeSettings.class,
            com.google.cloud.gkemulticloud.v1.SurgeSettings.Builder.class);
  }

  public static final int MAX_SURGE_FIELD_NUMBER = 1;
  private int maxSurge_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The maximum number of nodes that can be created beyond the
   * current size of the node pool during the update process.
   * </pre>
   *
   * <code>int32 max_surge = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxSurge.
   */
  @java.lang.Override
  public int getMaxSurge() {
    return maxSurge_;
  }

  public static final int MAX_UNAVAILABLE_FIELD_NUMBER = 2;
  private int maxUnavailable_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The maximum number of nodes that can be simultaneously
   * unavailable during the update process. A node is considered unavailable if
   * its status is not Ready.
   * </pre>
   *
   * <code>int32 max_unavailable = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxUnavailable.
   */
  @java.lang.Override
  public int getMaxUnavailable() {
    return maxUnavailable_;
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
    if (maxSurge_ != 0) {
      output.writeInt32(1, maxSurge_);
    }
    if (maxUnavailable_ != 0) {
      output.writeInt32(2, maxUnavailable_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxSurge_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, maxSurge_);
    }
    if (maxUnavailable_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxUnavailable_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.SurgeSettings)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.SurgeSettings other =
        (com.google.cloud.gkemulticloud.v1.SurgeSettings) obj;

    if (getMaxSurge() != other.getMaxSurge()) return false;
    if (getMaxUnavailable() != other.getMaxUnavailable()) return false;
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
    hash = (37 * hash) + MAX_SURGE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxSurge();
    hash = (37 * hash) + MAX_UNAVAILABLE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxUnavailable();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.SurgeSettings prototype) {
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
   * SurgeSettings contains the parameters for Surge update.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.SurgeSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.SurgeSettings)
      com.google.cloud.gkemulticloud.v1.SurgeSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_SurgeSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_SurgeSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.SurgeSettings.class,
              com.google.cloud.gkemulticloud.v1.SurgeSettings.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.SurgeSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maxSurge_ = 0;
      maxUnavailable_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_SurgeSettings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.SurgeSettings getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.SurgeSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.SurgeSettings build() {
      com.google.cloud.gkemulticloud.v1.SurgeSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.SurgeSettings buildPartial() {
      com.google.cloud.gkemulticloud.v1.SurgeSettings result =
          new com.google.cloud.gkemulticloud.v1.SurgeSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.SurgeSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxSurge_ = maxSurge_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxUnavailable_ = maxUnavailable_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.SurgeSettings) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.SurgeSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.SurgeSettings other) {
      if (other == com.google.cloud.gkemulticloud.v1.SurgeSettings.getDefaultInstance())
        return this;
      if (other.getMaxSurge() != 0) {
        setMaxSurge(other.getMaxSurge());
      }
      if (other.getMaxUnavailable() != 0) {
        setMaxUnavailable(other.getMaxUnavailable());
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
            case 8:
              {
                maxSurge_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                maxUnavailable_ = input.readInt32();
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

    private int maxSurge_;
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of nodes that can be created beyond the
     * current size of the node pool during the update process.
     * </pre>
     *
     * <code>int32 max_surge = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The maxSurge.
     */
    @java.lang.Override
    public int getMaxSurge() {
      return maxSurge_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of nodes that can be created beyond the
     * current size of the node pool during the update process.
     * </pre>
     *
     * <code>int32 max_surge = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The maxSurge to set.
     * @return This builder for chaining.
     */
    public Builder setMaxSurge(int value) {

      maxSurge_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of nodes that can be created beyond the
     * current size of the node pool during the update process.
     * </pre>
     *
     * <code>int32 max_surge = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxSurge() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxSurge_ = 0;
      onChanged();
      return this;
    }

    private int maxUnavailable_;
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of nodes that can be simultaneously
     * unavailable during the update process. A node is considered unavailable if
     * its status is not Ready.
     * </pre>
     *
     * <code>int32 max_unavailable = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The maxUnavailable.
     */
    @java.lang.Override
    public int getMaxUnavailable() {
      return maxUnavailable_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of nodes that can be simultaneously
     * unavailable during the update process. A node is considered unavailable if
     * its status is not Ready.
     * </pre>
     *
     * <code>int32 max_unavailable = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The maxUnavailable to set.
     * @return This builder for chaining.
     */
    public Builder setMaxUnavailable(int value) {

      maxUnavailable_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of nodes that can be simultaneously
     * unavailable during the update process. A node is considered unavailable if
     * its status is not Ready.
     * </pre>
     *
     * <code>int32 max_unavailable = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxUnavailable() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxUnavailable_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.SurgeSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.SurgeSettings)
  private static final com.google.cloud.gkemulticloud.v1.SurgeSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.SurgeSettings();
  }

  public static com.google.cloud.gkemulticloud.v1.SurgeSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SurgeSettings> PARSER =
      new com.google.protobuf.AbstractParser<SurgeSettings>() {
        @java.lang.Override
        public SurgeSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<SurgeSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SurgeSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.SurgeSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
