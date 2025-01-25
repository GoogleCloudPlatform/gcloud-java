/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/redis/cluster/v1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.redis.cluster.v1;

/**
 *
 *
 * <pre>
 * Zone distribution config for allocation of cluster resources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.cluster.v1.ZoneDistributionConfig}
 */
public final class ZoneDistributionConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.cluster.v1.ZoneDistributionConfig)
    ZoneDistributionConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ZoneDistributionConfig.newBuilder() to construct.
  private ZoneDistributionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ZoneDistributionConfig() {
    mode_ = 0;
    zone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ZoneDistributionConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.redis.cluster.v1.CloudRedisClusterProto
        .internal_static_google_cloud_redis_cluster_v1_ZoneDistributionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.cluster.v1.CloudRedisClusterProto
        .internal_static_google_cloud_redis_cluster_v1_ZoneDistributionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.class,
            com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Defines various modes of zone distribution.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode}
   */
  public enum ZoneDistributionMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not Set. Default: MULTI_ZONE
     * </pre>
     *
     * <code>ZONE_DISTRIBUTION_MODE_UNSPECIFIED = 0;</code>
     */
    ZONE_DISTRIBUTION_MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Distribute all resources across 3 zones picked at random, within the
     * region.
     * </pre>
     *
     * <code>MULTI_ZONE = 1;</code>
     */
    MULTI_ZONE(1),
    /**
     *
     *
     * <pre>
     * Distribute all resources in a single zone. The zone field must be
     * specified, when this mode is selected.
     * </pre>
     *
     * <code>SINGLE_ZONE = 2;</code>
     */
    SINGLE_ZONE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not Set. Default: MULTI_ZONE
     * </pre>
     *
     * <code>ZONE_DISTRIBUTION_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int ZONE_DISTRIBUTION_MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Distribute all resources across 3 zones picked at random, within the
     * region.
     * </pre>
     *
     * <code>MULTI_ZONE = 1;</code>
     */
    public static final int MULTI_ZONE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Distribute all resources in a single zone. The zone field must be
     * specified, when this mode is selected.
     * </pre>
     *
     * <code>SINGLE_ZONE = 2;</code>
     */
    public static final int SINGLE_ZONE_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ZoneDistributionMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ZoneDistributionMode forNumber(int value) {
      switch (value) {
        case 0:
          return ZONE_DISTRIBUTION_MODE_UNSPECIFIED;
        case 1:
          return MULTI_ZONE;
        case 2:
          return SINGLE_ZONE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ZoneDistributionMode>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ZoneDistributionMode>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ZoneDistributionMode>() {
              public ZoneDistributionMode findValueByNumber(int number) {
                return ZoneDistributionMode.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ZoneDistributionMode[] VALUES = values();

    public static ZoneDistributionMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ZoneDistributionMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode)
  }

  public static final int MODE_FIELD_NUMBER = 1;
  private int mode_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The mode of zone distribution. Defaults to MULTI_ZONE, when not
   * specified.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode mode = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  @java.lang.Override
  public int getModeValue() {
    return mode_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The mode of zone distribution. Defaults to MULTI_ZONE, when not
   * specified.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode mode = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The mode.
   */
  @java.lang.Override
  public com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode getMode() {
    com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode result =
        com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode.forNumber(
            mode_);
    return result == null
        ? com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode.UNRECOGNIZED
        : result;
  }

  public static final int ZONE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object zone_ = "";
  /**
   *
   *
   * <pre>
   * Optional. When SINGLE ZONE distribution is selected, zone field would be
   * used to allocate all resources in that zone. This is not applicable to
   * MULTI_ZONE, and would be ignored for MULTI_ZONE clusters.
   * </pre>
   *
   * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The zone.
   */
  @java.lang.Override
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. When SINGLE ZONE distribution is selected, zone field would be
   * used to allocate all resources in that zone. This is not applicable to
   * MULTI_ZONE, and would be ignored for MULTI_ZONE clusters.
   * </pre>
   *
   * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for zone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      zone_ = b;
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
    if (mode_
        != com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode
            .ZONE_DISTRIBUTION_MODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, mode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mode_
        != com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode
            .ZONE_DISTRIBUTION_MODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, mode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
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
    if (!(obj instanceof com.google.cloud.redis.cluster.v1.ZoneDistributionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.cluster.v1.ZoneDistributionConfig other =
        (com.google.cloud.redis.cluster.v1.ZoneDistributionConfig) obj;

    if (mode_ != other.mode_) return false;
    if (!getZone().equals(other.getZone())) return false;
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
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig parseFrom(
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
      com.google.cloud.redis.cluster.v1.ZoneDistributionConfig prototype) {
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
   * Zone distribution config for allocation of cluster resources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.cluster.v1.ZoneDistributionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.cluster.v1.ZoneDistributionConfig)
      com.google.cloud.redis.cluster.v1.ZoneDistributionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.redis.cluster.v1.CloudRedisClusterProto
          .internal_static_google_cloud_redis_cluster_v1_ZoneDistributionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.cluster.v1.CloudRedisClusterProto
          .internal_static_google_cloud_redis_cluster_v1_ZoneDistributionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.class,
              com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.Builder.class);
    }

    // Construct using com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      mode_ = 0;
      zone_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.redis.cluster.v1.CloudRedisClusterProto
          .internal_static_google_cloud_redis_cluster_v1_ZoneDistributionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.cluster.v1.ZoneDistributionConfig getDefaultInstanceForType() {
      return com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.cluster.v1.ZoneDistributionConfig build() {
      com.google.cloud.redis.cluster.v1.ZoneDistributionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.cluster.v1.ZoneDistributionConfig buildPartial() {
      com.google.cloud.redis.cluster.v1.ZoneDistributionConfig result =
          new com.google.cloud.redis.cluster.v1.ZoneDistributionConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.redis.cluster.v1.ZoneDistributionConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mode_ = mode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.zone_ = zone_;
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
      if (other instanceof com.google.cloud.redis.cluster.v1.ZoneDistributionConfig) {
        return mergeFrom((com.google.cloud.redis.cluster.v1.ZoneDistributionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.cluster.v1.ZoneDistributionConfig other) {
      if (other == com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.getDefaultInstance())
        return this;
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        bitField0_ |= 0x00000002;
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
            case 8:
              {
                mode_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                zone_ = input.readStringRequireUtf8();
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

    private int mode_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. The mode of zone distribution. Defaults to MULTI_ZONE, when not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode mode = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for mode.
     */
    @java.lang.Override
    public int getModeValue() {
      return mode_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The mode of zone distribution. Defaults to MULTI_ZONE, when not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode mode = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeValue(int value) {
      mode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The mode of zone distribution. Defaults to MULTI_ZONE, when not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode mode = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The mode.
     */
    @java.lang.Override
    public com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode getMode() {
      com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode result =
          com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode.forNumber(
              mode_);
      return result == null
          ? com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode
              .UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. The mode of zone distribution. Defaults to MULTI_ZONE, when not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode mode = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(
        com.google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The mode of zone distribution. Defaults to MULTI_ZONE, when not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.cluster.v1.ZoneDistributionConfig.ZoneDistributionMode mode = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     *
     *
     * <pre>
     * Optional. When SINGLE ZONE distribution is selected, zone field would be
     * used to allocate all resources in that zone. This is not applicable to
     * MULTI_ZONE, and would be ignored for MULTI_ZONE clusters.
     * </pre>
     *
     * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The zone.
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. When SINGLE ZONE distribution is selected, zone field would be
     * used to allocate all resources in that zone. This is not applicable to
     * MULTI_ZONE, and would be ignored for MULTI_ZONE clusters.
     * </pre>
     *
     * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for zone.
     */
    public com.google.protobuf.ByteString getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. When SINGLE ZONE distribution is selected, zone field would be
     * used to allocate all resources in that zone. This is not applicable to
     * MULTI_ZONE, and would be ignored for MULTI_ZONE clusters.
     * </pre>
     *
     * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    public Builder setZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      zone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. When SINGLE ZONE distribution is selected, zone field would be
     * used to allocate all resources in that zone. This is not applicable to
     * MULTI_ZONE, and would be ignored for MULTI_ZONE clusters.
     * </pre>
     *
     * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearZone() {
      zone_ = getDefaultInstance().getZone();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. When SINGLE ZONE distribution is selected, zone field would be
     * used to allocate all resources in that zone. This is not applicable to
     * MULTI_ZONE, and would be ignored for MULTI_ZONE clusters.
     * </pre>
     *
     * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    public Builder setZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      zone_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.redis.cluster.v1.ZoneDistributionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.cluster.v1.ZoneDistributionConfig)
  private static final com.google.cloud.redis.cluster.v1.ZoneDistributionConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.cluster.v1.ZoneDistributionConfig();
  }

  public static com.google.cloud.redis.cluster.v1.ZoneDistributionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ZoneDistributionConfig> PARSER =
      new com.google.protobuf.AbstractParser<ZoneDistributionConfig>() {
        @java.lang.Override
        public ZoneDistributionConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ZoneDistributionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ZoneDistributionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.cluster.v1.ZoneDistributionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
