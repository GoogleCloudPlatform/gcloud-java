// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/value.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Value is the value of the field.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.Value}
 */
public final class Value extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.Value)
    ValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Value.newBuilder() to construct.
  private Value(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Value() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Value();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Value(
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
          case 8: {
            value_ = input.readInt64();
            valueCase_ = 1;
            break;
          }
          case 17: {
            value_ = input.readDouble();
            valueCase_ = 2;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            valueCase_ = 3;
            value_ = s;
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
    return com.google.cloud.aiplatform.v1beta1.ValueProto.internal_static_google_cloud_aiplatform_v1beta1_Value_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ValueProto.internal_static_google_cloud_aiplatform_v1beta1_Value_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.Value.class, com.google.cloud.aiplatform.v1beta1.Value.Builder.class);
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INT_VALUE(1),
    DOUBLE_VALUE(2),
    STRING_VALUE(3),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1: return INT_VALUE;
        case 2: return DOUBLE_VALUE;
        case 3: return STRING_VALUE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int INT_VALUE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * An integer value.
   * </pre>
   *
   * <code>int64 int_value = 1;</code>
   * @return Whether the intValue field is set.
   */
  @java.lang.Override
  public boolean hasIntValue() {
    return valueCase_ == 1;
  }
  /**
   * <pre>
   * An integer value.
   * </pre>
   *
   * <code>int64 int_value = 1;</code>
   * @return The intValue.
   */
  @java.lang.Override
  public long getIntValue() {
    if (valueCase_ == 1) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * A double value.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   * @return Whether the doubleValue field is set.
   */
  @java.lang.Override
  public boolean hasDoubleValue() {
    return valueCase_ == 2;
  }
  /**
   * <pre>
   * A double value.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   * @return The doubleValue.
   */
  @java.lang.Override
  public double getDoubleValue() {
    if (valueCase_ == 2) {
      return (java.lang.Double) value_;
    }
    return 0D;
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * A string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return Whether the stringValue field is set.
   */
  public boolean hasStringValue() {
    return valueCase_ == 3;
  }
  /**
   * <pre>
   * A string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return The stringValue.
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (valueCase_ == 3) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 3) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * A string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return The bytes for stringValue.
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 3) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 3) {
        value_ = b;
      }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (valueCase_ == 1) {
      output.writeInt64(
          1, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 2) {
      output.writeDouble(
          2, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            1, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            2, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.Value)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.Value other = (com.google.cloud.aiplatform.v1beta1.Value) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 1:
        if (getIntValue()
            != other.getIntValue()) return false;
        break;
      case 2:
        if (java.lang.Double.doubleToLongBits(getDoubleValue())
            != java.lang.Double.doubleToLongBits(
                other.getDoubleValue())) return false;
        break;
      case 3:
        if (!getStringValue()
            .equals(other.getStringValue())) return false;
        break;
      case 0:
      default:
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
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIntValue());
        break;
      case 2:
        hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDoubleValue()));
        break;
      case 3:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.Value parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.Value parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.Value prototype) {
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
   * Value is the value of the field.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.Value}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.Value)
      com.google.cloud.aiplatform.v1beta1.ValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ValueProto.internal_static_google_cloud_aiplatform_v1beta1_Value_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ValueProto.internal_static_google_cloud_aiplatform_v1beta1_Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.Value.class, com.google.cloud.aiplatform.v1beta1.Value.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.Value.newBuilder()
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
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ValueProto.internal_static_google_cloud_aiplatform_v1beta1_Value_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Value getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.Value.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Value build() {
      com.google.cloud.aiplatform.v1beta1.Value result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Value buildPartial() {
      com.google.cloud.aiplatform.v1beta1.Value result = new com.google.cloud.aiplatform.v1beta1.Value(this);
      if (valueCase_ == 1) {
        result.value_ = value_;
      }
      if (valueCase_ == 2) {
        result.value_ = value_;
      }
      if (valueCase_ == 3) {
        result.value_ = value_;
      }
      result.valueCase_ = valueCase_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.Value) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.Value)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.Value other) {
      if (other == com.google.cloud.aiplatform.v1beta1.Value.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case INT_VALUE: {
          setIntValue(other.getIntValue());
          break;
        }
        case DOUBLE_VALUE: {
          setDoubleValue(other.getDoubleValue());
          break;
        }
        case STRING_VALUE: {
          valueCase_ = 3;
          value_ = other.value_;
          onChanged();
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
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
      com.google.cloud.aiplatform.v1beta1.Value parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.Value) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * An integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     * @return Whether the intValue field is set.
     */
    public boolean hasIntValue() {
      return valueCase_ == 1;
    }
    /**
     * <pre>
     * An integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     * @return The intValue.
     */
    public long getIntValue() {
      if (valueCase_ == 1) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }
    /**
     * <pre>
     * An integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     * @param value The intValue to set.
     * @return This builder for chaining.
     */
    public Builder setIntValue(long value) {
      valueCase_ = 1;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntValue() {
      if (valueCase_ == 1) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * A double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     * @return Whether the doubleValue field is set.
     */
    public boolean hasDoubleValue() {
      return valueCase_ == 2;
    }
    /**
     * <pre>
     * A double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     * @return The doubleValue.
     */
    public double getDoubleValue() {
      if (valueCase_ == 2) {
        return (java.lang.Double) value_;
      }
      return 0D;
    }
    /**
     * <pre>
     * A double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     * @param value The doubleValue to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleValue(double value) {
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleValue() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * A string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @return Whether the stringValue field is set.
     */
    @java.lang.Override
    public boolean hasStringValue() {
      return valueCase_ == 3;
    }
    /**
     * <pre>
     * A string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @return The stringValue.
     */
    @java.lang.Override
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 3) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 3) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @return The bytes for stringValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 3) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 3) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @param value The stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStringValue() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * A string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @param value The bytes for stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      valueCase_ = 3;
      value_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.Value)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.Value)
  private static final com.google.cloud.aiplatform.v1beta1.Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.Value();
  }

  public static com.google.cloud.aiplatform.v1beta1.Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Value>
      PARSER = new com.google.protobuf.AbstractParser<Value>() {
    @java.lang.Override
    public Value parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Value(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Value> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Value> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Value getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

