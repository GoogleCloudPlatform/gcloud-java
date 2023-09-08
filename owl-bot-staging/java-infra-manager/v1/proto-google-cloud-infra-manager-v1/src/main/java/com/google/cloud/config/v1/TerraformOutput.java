// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/config/v1/config.proto

package com.google.cloud.config.v1;

/**
 * <pre>
 * Describes a Terraform output.
 * </pre>
 *
 * Protobuf type {@code google.cloud.config.v1.TerraformOutput}
 */
public final class TerraformOutput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.config.v1.TerraformOutput)
    TerraformOutputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TerraformOutput.newBuilder() to construct.
  private TerraformOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TerraformOutput() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TerraformOutput();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_TerraformOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_TerraformOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.config.v1.TerraformOutput.class, com.google.cloud.config.v1.TerraformOutput.Builder.class);
  }

  public static final int SENSITIVE_FIELD_NUMBER = 1;
  private boolean sensitive_ = false;
  /**
   * <pre>
   * Identifies whether Terraform has set this output as a potential
   * sensitive value.
   * </pre>
   *
   * <code>bool sensitive = 1;</code>
   * @return The sensitive.
   */
  @java.lang.Override
  public boolean getSensitive() {
    return sensitive_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.Value value_;
  /**
   * <pre>
   * Value of output.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 2;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * Value of output.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.Value getValue() {
    return value_ == null ? com.google.protobuf.Value.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * Value of output.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.ValueOrBuilder getValueOrBuilder() {
    return value_ == null ? com.google.protobuf.Value.getDefaultInstance() : value_;
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
    if (sensitive_ != false) {
      output.writeBool(1, sensitive_);
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sensitive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, sensitive_);
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
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
    if (!(obj instanceof com.google.cloud.config.v1.TerraformOutput)) {
      return super.equals(obj);
    }
    com.google.cloud.config.v1.TerraformOutput other = (com.google.cloud.config.v1.TerraformOutput) obj;

    if (getSensitive()
        != other.getSensitive()) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
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
    hash = (37 * hash) + SENSITIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSensitive());
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.config.v1.TerraformOutput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.config.v1.TerraformOutput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.config.v1.TerraformOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.config.v1.TerraformOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.config.v1.TerraformOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.config.v1.TerraformOutput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.config.v1.TerraformOutput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.config.v1.TerraformOutput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.config.v1.TerraformOutput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.config.v1.TerraformOutput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.config.v1.TerraformOutput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.config.v1.TerraformOutput parseFrom(
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
  public static Builder newBuilder(com.google.cloud.config.v1.TerraformOutput prototype) {
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
   * Describes a Terraform output.
   * </pre>
   *
   * Protobuf type {@code google.cloud.config.v1.TerraformOutput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.config.v1.TerraformOutput)
      com.google.cloud.config.v1.TerraformOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_TerraformOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_TerraformOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.config.v1.TerraformOutput.class, com.google.cloud.config.v1.TerraformOutput.Builder.class);
    }

    // Construct using com.google.cloud.config.v1.TerraformOutput.newBuilder()
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
      sensitive_ = false;
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_TerraformOutput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.config.v1.TerraformOutput getDefaultInstanceForType() {
      return com.google.cloud.config.v1.TerraformOutput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.config.v1.TerraformOutput build() {
      com.google.cloud.config.v1.TerraformOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.config.v1.TerraformOutput buildPartial() {
      com.google.cloud.config.v1.TerraformOutput result = new com.google.cloud.config.v1.TerraformOutput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.config.v1.TerraformOutput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sensitive_ = sensitive_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = valueBuilder_ == null
            ? value_
            : valueBuilder_.build();
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
      if (other instanceof com.google.cloud.config.v1.TerraformOutput) {
        return mergeFrom((com.google.cloud.config.v1.TerraformOutput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.config.v1.TerraformOutput other) {
      if (other == com.google.cloud.config.v1.TerraformOutput.getDefaultInstance()) return this;
      if (other.getSensitive() != false) {
        setSensitive(other.getSensitive());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
            case 8: {
              sensitive_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getValueFieldBuilder().getBuilder(),
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

    private boolean sensitive_ ;
    /**
     * <pre>
     * Identifies whether Terraform has set this output as a potential
     * sensitive value.
     * </pre>
     *
     * <code>bool sensitive = 1;</code>
     * @return The sensitive.
     */
    @java.lang.Override
    public boolean getSensitive() {
      return sensitive_;
    }
    /**
     * <pre>
     * Identifies whether Terraform has set this output as a potential
     * sensitive value.
     * </pre>
     *
     * <code>bool sensitive = 1;</code>
     * @param value The sensitive to set.
     * @return This builder for chaining.
     */
    public Builder setSensitive(boolean value) {

      sensitive_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifies whether Terraform has set this output as a potential
     * sensitive value.
     * </pre>
     *
     * <code>bool sensitive = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSensitive() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sensitive_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Value value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> valueBuilder_;
    /**
     * <pre>
     * Value of output.
     * </pre>
     *
     * <code>.google.protobuf.Value value = 2;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Value of output.
     * </pre>
     *
     * <code>.google.protobuf.Value value = 2;</code>
     * @return The value.
     */
    public com.google.protobuf.Value getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.protobuf.Value.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value of output.
     * </pre>
     *
     * <code>.google.protobuf.Value value = 2;</code>
     */
    public Builder setValue(com.google.protobuf.Value value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of output.
     * </pre>
     *
     * <code>.google.protobuf.Value value = 2;</code>
     */
    public Builder setValue(
        com.google.protobuf.Value.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of output.
     * </pre>
     *
     * <code>.google.protobuf.Value value = 2;</code>
     */
    public Builder mergeValue(com.google.protobuf.Value value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          value_ != null &&
          value_ != com.google.protobuf.Value.getDefaultInstance()) {
          getValueBuilder().mergeFrom(value);
        } else {
          value_ = value;
        }
      } else {
        valueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of output.
     * </pre>
     *
     * <code>.google.protobuf.Value value = 2;</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of output.
     * </pre>
     *
     * <code>.google.protobuf.Value value = 2;</code>
     */
    public com.google.protobuf.Value.Builder getValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value of output.
     * </pre>
     *
     * <code>.google.protobuf.Value value = 2;</code>
     */
    public com.google.protobuf.ValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.google.protobuf.Value.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * Value of output.
     * </pre>
     *
     * <code>.google.protobuf.Value value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.config.v1.TerraformOutput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.config.v1.TerraformOutput)
  private static final com.google.cloud.config.v1.TerraformOutput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.config.v1.TerraformOutput();
  }

  public static com.google.cloud.config.v1.TerraformOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TerraformOutput>
      PARSER = new com.google.protobuf.AbstractParser<TerraformOutput>() {
    @java.lang.Override
    public TerraformOutput parsePartialFrom(
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

  public static com.google.protobuf.Parser<TerraformOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TerraformOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.config.v1.TerraformOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

