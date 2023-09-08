// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/enterpriseknowledgegraph/v1/service.proto

package com.google.cloud.enterpriseknowledgegraph.v1;

/**
 * <pre>
 * Options for connected components.
 * </pre>
 *
 * Protobuf type {@code google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig}
 */
public final class ConnectedComponentsConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig)
    ConnectedComponentsConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConnectedComponentsConfig.newBuilder() to construct.
  private ConnectedComponentsConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConnectedComponentsConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConnectedComponentsConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto.internal_static_google_cloud_enterpriseknowledgegraph_v1_ConnectedComponentsConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto.internal_static_google_cloud_enterpriseknowledgegraph_v1_ConnectedComponentsConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig.class, com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig.Builder.class);
  }

  public static final int WEIGHT_THRESHOLD_FIELD_NUMBER = 1;
  private float weightThreshold_ = 0F;
  /**
   * <pre>
   * Threshold used for connected components. Default value is 0.85.
   * </pre>
   *
   * <code>float weight_threshold = 1;</code>
   * @return The weightThreshold.
   */
  @java.lang.Override
  public float getWeightThreshold() {
    return weightThreshold_;
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
    if (java.lang.Float.floatToRawIntBits(weightThreshold_) != 0) {
      output.writeFloat(1, weightThreshold_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(weightThreshold_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, weightThreshold_);
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
    if (!(obj instanceof com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig other = (com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig) obj;

    if (java.lang.Float.floatToIntBits(getWeightThreshold())
        != java.lang.Float.floatToIntBits(
            other.getWeightThreshold())) return false;
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
    hash = (37 * hash) + WEIGHT_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getWeightThreshold());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig prototype) {
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
   * Options for connected components.
   * </pre>
   *
   * Protobuf type {@code google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig)
      com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto.internal_static_google_cloud_enterpriseknowledgegraph_v1_ConnectedComponentsConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto.internal_static_google_cloud_enterpriseknowledgegraph_v1_ConnectedComponentsConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig.class, com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig.Builder.class);
    }

    // Construct using com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig.newBuilder()
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
      weightThreshold_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto.internal_static_google_cloud_enterpriseknowledgegraph_v1_ConnectedComponentsConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig getDefaultInstanceForType() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig build() {
      com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig buildPartial() {
      com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig result = new com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.weightThreshold_ = weightThreshold_;
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
      if (other instanceof com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig) {
        return mergeFrom((com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig other) {
      if (other == com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig.getDefaultInstance()) return this;
      if (other.getWeightThreshold() != 0F) {
        setWeightThreshold(other.getWeightThreshold());
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
            case 13: {
              weightThreshold_ = input.readFloat();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
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

    private float weightThreshold_ ;
    /**
     * <pre>
     * Threshold used for connected components. Default value is 0.85.
     * </pre>
     *
     * <code>float weight_threshold = 1;</code>
     * @return The weightThreshold.
     */
    @java.lang.Override
    public float getWeightThreshold() {
      return weightThreshold_;
    }
    /**
     * <pre>
     * Threshold used for connected components. Default value is 0.85.
     * </pre>
     *
     * <code>float weight_threshold = 1;</code>
     * @param value The weightThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setWeightThreshold(float value) {

      weightThreshold_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Threshold used for connected components. Default value is 0.85.
     * </pre>
     *
     * <code>float weight_threshold = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeightThreshold() {
      bitField0_ = (bitField0_ & ~0x00000001);
      weightThreshold_ = 0F;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig)
  private static final com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig();
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectedComponentsConfig>
      PARSER = new com.google.protobuf.AbstractParser<ConnectedComponentsConfig>() {
    @java.lang.Override
    public ConnectedComponentsConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConnectedComponentsConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectedComponentsConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

