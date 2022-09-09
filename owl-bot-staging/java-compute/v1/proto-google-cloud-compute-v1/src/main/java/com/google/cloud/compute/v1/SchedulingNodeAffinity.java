// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Node Affinity: the configuration of desired nodes onto which this Instance could be scheduled.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SchedulingNodeAffinity}
 */
public final class SchedulingNodeAffinity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SchedulingNodeAffinity)
    SchedulingNodeAffinityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SchedulingNodeAffinity.newBuilder() to construct.
  private SchedulingNodeAffinity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SchedulingNodeAffinity() {
    key_ = "";
    operator_ = "";
    values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SchedulingNodeAffinity();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SchedulingNodeAffinity(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 848634: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            key_ = s;
            break;
          }
          case 290538786: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            operator_ = s;
            break;
          }
          case 1999431954: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              values_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            values_.add(s);
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
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        values_ = values_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SchedulingNodeAffinity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SchedulingNodeAffinity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SchedulingNodeAffinity.class, com.google.cloud.compute.v1.SchedulingNodeAffinity.Builder.class);
  }

  /**
   * <pre>
   * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.SchedulingNodeAffinity.Operator}
   */
  public enum Operator
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_OPERATOR = 0;</code>
     */
    UNDEFINED_OPERATOR(0),
    /**
     * <pre>
     * Requires Compute Engine to seek for matched nodes.
     * </pre>
     *
     * <code>IN = 2341;</code>
     */
    IN(2341),
    /**
     * <pre>
     * Requires Compute Engine to avoid certain nodes.
     * </pre>
     *
     * <code>NOT_IN = 161144369;</code>
     */
    NOT_IN(161144369),
    /**
     * <code>OPERATOR_UNSPECIFIED = 128892924;</code>
     */
    OPERATOR_UNSPECIFIED(128892924),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_OPERATOR = 0;</code>
     */
    public static final int UNDEFINED_OPERATOR_VALUE = 0;
    /**
     * <pre>
     * Requires Compute Engine to seek for matched nodes.
     * </pre>
     *
     * <code>IN = 2341;</code>
     */
    public static final int IN_VALUE = 2341;
    /**
     * <pre>
     * Requires Compute Engine to avoid certain nodes.
     * </pre>
     *
     * <code>NOT_IN = 161144369;</code>
     */
    public static final int NOT_IN_VALUE = 161144369;
    /**
     * <code>OPERATOR_UNSPECIFIED = 128892924;</code>
     */
    public static final int OPERATOR_UNSPECIFIED_VALUE = 128892924;


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
    public static Operator valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Operator forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_OPERATOR;
        case 2341: return IN;
        case 161144369: return NOT_IN;
        case 128892924: return OPERATOR_UNSPECIFIED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operator>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operator> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operator>() {
            public Operator findValueByNumber(int number) {
              return Operator.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.SchedulingNodeAffinity.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operator[] VALUES = values();

    public static Operator valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Operator(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.SchedulingNodeAffinity.Operator)
  }

  private int bitField0_;
  public static final int KEY_FIELD_NUMBER = 106079;
  private volatile java.lang.Object key_;
  /**
   * <pre>
   * Corresponds to the label key of Node resource.
   * </pre>
   *
   * <code>optional string key = 106079;</code>
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Corresponds to the label key of Node resource.
   * </pre>
   *
   * <code>optional string key = 106079;</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Corresponds to the label key of Node resource.
   * </pre>
   *
   * <code>optional string key = 106079;</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATOR_FIELD_NUMBER = 36317348;
  private volatile java.lang.Object operator_;
  /**
   * <pre>
   * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
   * Check the Operator enum for the list of possible values.
   * </pre>
   *
   * <code>optional string operator = 36317348;</code>
   * @return Whether the operator field is set.
   */
  @java.lang.Override
  public boolean hasOperator() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
   * Check the Operator enum for the list of possible values.
   * </pre>
   *
   * <code>optional string operator = 36317348;</code>
   * @return The operator.
   */
  @java.lang.Override
  public java.lang.String getOperator() {
    java.lang.Object ref = operator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operator_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
   * Check the Operator enum for the list of possible values.
   * </pre>
   *
   * <code>optional string operator = 36317348;</code>
   * @return The bytes for operator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOperatorBytes() {
    java.lang.Object ref = operator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUES_FIELD_NUMBER = 249928994;
  private com.google.protobuf.LazyStringList values_;
  /**
   * <pre>
   * Corresponds to the label values of Node resource.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   * @return A list containing the values.
   */
  public com.google.protobuf.ProtocolStringList
      getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * Corresponds to the label values of Node resource.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * Corresponds to the label values of Node resource.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public java.lang.String getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * Corresponds to the label values of Node resource.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  public com.google.protobuf.ByteString
      getValuesBytes(int index) {
    return values_.getByteString(index);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 106079, key_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 36317348, operator_);
    }
    for (int i = 0; i < values_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 249928994, values_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(106079, key_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(36317348, operator_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += computeStringSizeNoTag(values_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getValuesList().size();
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
    if (!(obj instanceof com.google.cloud.compute.v1.SchedulingNodeAffinity)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SchedulingNodeAffinity other = (com.google.cloud.compute.v1.SchedulingNodeAffinity) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
    }
    if (hasOperator() != other.hasOperator()) return false;
    if (hasOperator()) {
      if (!getOperator()
          .equals(other.getOperator())) return false;
    }
    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    if (hasOperator()) {
      hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
      hash = (53 * hash) + getOperator().hashCode();
    }
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SchedulingNodeAffinity parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.SchedulingNodeAffinity prototype) {
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
   * Node Affinity: the configuration of desired nodes onto which this Instance could be scheduled.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SchedulingNodeAffinity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SchedulingNodeAffinity)
      com.google.cloud.compute.v1.SchedulingNodeAffinityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SchedulingNodeAffinity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SchedulingNodeAffinity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SchedulingNodeAffinity.class, com.google.cloud.compute.v1.SchedulingNodeAffinity.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SchedulingNodeAffinity.newBuilder()
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
      key_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      operator_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SchedulingNodeAffinity_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SchedulingNodeAffinity getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SchedulingNodeAffinity.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SchedulingNodeAffinity build() {
      com.google.cloud.compute.v1.SchedulingNodeAffinity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SchedulingNodeAffinity buildPartial() {
      com.google.cloud.compute.v1.SchedulingNodeAffinity result = new com.google.cloud.compute.v1.SchedulingNodeAffinity(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.key_ = key_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.operator_ = operator_;
      if (((bitField0_ & 0x00000004) != 0)) {
        values_ = values_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.values_ = values_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.SchedulingNodeAffinity) {
        return mergeFrom((com.google.cloud.compute.v1.SchedulingNodeAffinity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SchedulingNodeAffinity other) {
      if (other == com.google.cloud.compute.v1.SchedulingNodeAffinity.getDefaultInstance()) return this;
      if (other.hasKey()) {
        bitField0_ |= 0x00000001;
        key_ = other.key_;
        onChanged();
      }
      if (other.hasOperator()) {
        bitField0_ |= 0x00000002;
        operator_ = other.operator_;
        onChanged();
      }
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
        }
        onChanged();
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
      com.google.cloud.compute.v1.SchedulingNodeAffinity parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.SchedulingNodeAffinity) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object key_ = "";
    /**
     * <pre>
     * Corresponds to the label key of Node resource.
     * </pre>
     *
     * <code>optional string key = 106079;</code>
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Corresponds to the label key of Node resource.
     * </pre>
     *
     * <code>optional string key = 106079;</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Corresponds to the label key of Node resource.
     * </pre>
     *
     * <code>optional string key = 106079;</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Corresponds to the label key of Node resource.
     * </pre>
     *
     * <code>optional string key = 106079;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to the label key of Node resource.
     * </pre>
     *
     * <code>optional string key = 106079;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to the label key of Node resource.
     * </pre>
     *
     * <code>optional string key = 106079;</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      key_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object operator_ = "";
    /**
     * <pre>
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * Check the Operator enum for the list of possible values.
     * </pre>
     *
     * <code>optional string operator = 36317348;</code>
     * @return Whether the operator field is set.
     */
    public boolean hasOperator() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * Check the Operator enum for the list of possible values.
     * </pre>
     *
     * <code>optional string operator = 36317348;</code>
     * @return The operator.
     */
    public java.lang.String getOperator() {
      java.lang.Object ref = operator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * Check the Operator enum for the list of possible values.
     * </pre>
     *
     * <code>optional string operator = 36317348;</code>
     * @return The bytes for operator.
     */
    public com.google.protobuf.ByteString
        getOperatorBytes() {
      java.lang.Object ref = operator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * Check the Operator enum for the list of possible values.
     * </pre>
     *
     * <code>optional string operator = 36317348;</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      operator_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * Check the Operator enum for the list of possible values.
     * </pre>
     *
     * <code>optional string operator = 36317348;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      bitField0_ = (bitField0_ & ~0x00000002);
      operator_ = getDefaultInstance().getOperator();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * Check the Operator enum for the list of possible values.
     * </pre>
     *
     * <code>optional string operator = 36317348;</code>
     * @param value The bytes for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      operator_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        values_ = new com.google.protobuf.LazyStringArrayList(values_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Corresponds to the label values of Node resource.
     * </pre>
     *
     * <code>repeated string values = 249928994;</code>
     * @return A list containing the values.
     */
    public com.google.protobuf.ProtocolStringList
        getValuesList() {
      return values_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Corresponds to the label values of Node resource.
     * </pre>
     *
     * <code>repeated string values = 249928994;</code>
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <pre>
     * Corresponds to the label values of Node resource.
     * </pre>
     *
     * <code>repeated string values = 249928994;</code>
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public java.lang.String getValues(int index) {
      return values_.get(index);
    }
    /**
     * <pre>
     * Corresponds to the label values of Node resource.
     * </pre>
     *
     * <code>repeated string values = 249928994;</code>
     * @param index The index of the value to return.
     * @return The bytes of the values at the given index.
     */
    public com.google.protobuf.ByteString
        getValuesBytes(int index) {
      return values_.getByteString(index);
    }
    /**
     * <pre>
     * Corresponds to the label values of Node resource.
     * </pre>
     *
     * <code>repeated string values = 249928994;</code>
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValuesIsMutable();
      values_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to the label values of Node resource.
     * </pre>
     *
     * <code>repeated string values = 249928994;</code>
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValuesIsMutable();
      values_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to the label values of Node resource.
     * </pre>
     *
     * <code>repeated string values = 249928994;</code>
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(
        java.lang.Iterable<java.lang.String> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, values_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to the label values of Node resource.
     * </pre>
     *
     * <code>repeated string values = 249928994;</code>
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to the label values of Node resource.
     * </pre>
     *
     * <code>repeated string values = 249928994;</code>
     * @param value The bytes of the values to add.
     * @return This builder for chaining.
     */
    public Builder addValuesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureValuesIsMutable();
      values_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SchedulingNodeAffinity)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SchedulingNodeAffinity)
  private static final com.google.cloud.compute.v1.SchedulingNodeAffinity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SchedulingNodeAffinity();
  }

  public static com.google.cloud.compute.v1.SchedulingNodeAffinity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SchedulingNodeAffinity>
      PARSER = new com.google.protobuf.AbstractParser<SchedulingNodeAffinity>() {
    @java.lang.Override
    public SchedulingNodeAffinity parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SchedulingNodeAffinity(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SchedulingNodeAffinity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SchedulingNodeAffinity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SchedulingNodeAffinity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

