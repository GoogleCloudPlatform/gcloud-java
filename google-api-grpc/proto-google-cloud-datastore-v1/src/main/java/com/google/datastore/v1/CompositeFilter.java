// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/query.proto

package com.google.datastore.v1;

/**
 * <pre>
 * A filter that merges multiple other filters using the given operator.
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.CompositeFilter}
 */
public  final class CompositeFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.CompositeFilter)
    CompositeFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompositeFilter.newBuilder() to construct.
  private CompositeFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompositeFilter() {
    op_ = 0;
    filters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompositeFilter(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            op_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              filters_ = new java.util.ArrayList<com.google.datastore.v1.Filter>();
              mutable_bitField0_ |= 0x00000002;
            }
            filters_.add(
                input.readMessage(com.google.datastore.v1.Filter.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        filters_ = java.util.Collections.unmodifiableList(filters_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_CompositeFilter_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_CompositeFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.CompositeFilter.class, com.google.datastore.v1.CompositeFilter.Builder.class);
  }

  /**
   * <pre>
   * A composite filter operator.
   * </pre>
   *
   * Protobuf enum {@code google.datastore.v1.CompositeFilter.Operator}
   */
  public enum Operator
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified. This value must not be used.
     * </pre>
     *
     * <code>OPERATOR_UNSPECIFIED = 0;</code>
     */
    OPERATOR_UNSPECIFIED(0),
    /**
     * <pre>
     * The results are required to satisfy each of the combined filters.
     * </pre>
     *
     * <code>AND = 1;</code>
     */
    AND(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified. This value must not be used.
     * </pre>
     *
     * <code>OPERATOR_UNSPECIFIED = 0;</code>
     */
    public static final int OPERATOR_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The results are required to satisfy each of the combined filters.
     * </pre>
     *
     * <code>AND = 1;</code>
     */
    public static final int AND_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operator valueOf(int value) {
      return forNumber(value);
    }

    public static Operator forNumber(int value) {
      switch (value) {
        case 0: return OPERATOR_UNSPECIFIED;
        case 1: return AND;
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
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.datastore.v1.CompositeFilter.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:google.datastore.v1.CompositeFilter.Operator)
  }

  private int bitField0_;
  public static final int OP_FIELD_NUMBER = 1;
  private int op_;
  /**
   * <pre>
   * The operator for combining multiple filters.
   * </pre>
   *
   * <code>.google.datastore.v1.CompositeFilter.Operator op = 1;</code>
   */
  public int getOpValue() {
    return op_;
  }
  /**
   * <pre>
   * The operator for combining multiple filters.
   * </pre>
   *
   * <code>.google.datastore.v1.CompositeFilter.Operator op = 1;</code>
   */
  public com.google.datastore.v1.CompositeFilter.Operator getOp() {
    com.google.datastore.v1.CompositeFilter.Operator result = com.google.datastore.v1.CompositeFilter.Operator.valueOf(op_);
    return result == null ? com.google.datastore.v1.CompositeFilter.Operator.UNRECOGNIZED : result;
  }

  public static final int FILTERS_FIELD_NUMBER = 2;
  private java.util.List<com.google.datastore.v1.Filter> filters_;
  /**
   * <pre>
   * The list of filters to combine.
   * Must contain at least one filter.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
   */
  public java.util.List<com.google.datastore.v1.Filter> getFiltersList() {
    return filters_;
  }
  /**
   * <pre>
   * The list of filters to combine.
   * Must contain at least one filter.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
   */
  public java.util.List<? extends com.google.datastore.v1.FilterOrBuilder> 
      getFiltersOrBuilderList() {
    return filters_;
  }
  /**
   * <pre>
   * The list of filters to combine.
   * Must contain at least one filter.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
   */
  public int getFiltersCount() {
    return filters_.size();
  }
  /**
   * <pre>
   * The list of filters to combine.
   * Must contain at least one filter.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
   */
  public com.google.datastore.v1.Filter getFilters(int index) {
    return filters_.get(index);
  }
  /**
   * <pre>
   * The list of filters to combine.
   * Must contain at least one filter.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
   */
  public com.google.datastore.v1.FilterOrBuilder getFiltersOrBuilder(
      int index) {
    return filters_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (op_ != com.google.datastore.v1.CompositeFilter.Operator.OPERATOR_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, op_);
    }
    for (int i = 0; i < filters_.size(); i++) {
      output.writeMessage(2, filters_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (op_ != com.google.datastore.v1.CompositeFilter.Operator.OPERATOR_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, op_);
    }
    for (int i = 0; i < filters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, filters_.get(i));
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
    if (!(obj instanceof com.google.datastore.v1.CompositeFilter)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.CompositeFilter other = (com.google.datastore.v1.CompositeFilter) obj;

    boolean result = true;
    result = result && op_ == other.op_;
    result = result && getFiltersList()
        .equals(other.getFiltersList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OP_FIELD_NUMBER;
    hash = (53 * hash) + op_;
    if (getFiltersCount() > 0) {
      hash = (37 * hash) + FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getFiltersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.CompositeFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.CompositeFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.CompositeFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.CompositeFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.CompositeFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.CompositeFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.CompositeFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.CompositeFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.CompositeFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.CompositeFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.CompositeFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.CompositeFilter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.datastore.v1.CompositeFilter prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * A filter that merges multiple other filters using the given operator.
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.CompositeFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.CompositeFilter)
      com.google.datastore.v1.CompositeFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_CompositeFilter_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_CompositeFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.CompositeFilter.class, com.google.datastore.v1.CompositeFilter.Builder.class);
    }

    // Construct using com.google.datastore.v1.CompositeFilter.newBuilder()
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
        getFiltersFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      op_ = 0;

      if (filtersBuilder_ == null) {
        filters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        filtersBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_CompositeFilter_descriptor;
    }

    public com.google.datastore.v1.CompositeFilter getDefaultInstanceForType() {
      return com.google.datastore.v1.CompositeFilter.getDefaultInstance();
    }

    public com.google.datastore.v1.CompositeFilter build() {
      com.google.datastore.v1.CompositeFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.datastore.v1.CompositeFilter buildPartial() {
      com.google.datastore.v1.CompositeFilter result = new com.google.datastore.v1.CompositeFilter(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.op_ = op_;
      if (filtersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          filters_ = java.util.Collections.unmodifiableList(filters_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.filters_ = filters_;
      } else {
        result.filters_ = filtersBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.datastore.v1.CompositeFilter) {
        return mergeFrom((com.google.datastore.v1.CompositeFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.CompositeFilter other) {
      if (other == com.google.datastore.v1.CompositeFilter.getDefaultInstance()) return this;
      if (other.op_ != 0) {
        setOpValue(other.getOpValue());
      }
      if (filtersBuilder_ == null) {
        if (!other.filters_.isEmpty()) {
          if (filters_.isEmpty()) {
            filters_ = other.filters_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFiltersIsMutable();
            filters_.addAll(other.filters_);
          }
          onChanged();
        }
      } else {
        if (!other.filters_.isEmpty()) {
          if (filtersBuilder_.isEmpty()) {
            filtersBuilder_.dispose();
            filtersBuilder_ = null;
            filters_ = other.filters_;
            bitField0_ = (bitField0_ & ~0x00000002);
            filtersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFiltersFieldBuilder() : null;
          } else {
            filtersBuilder_.addAllMessages(other.filters_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.datastore.v1.CompositeFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.CompositeFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int op_ = 0;
    /**
     * <pre>
     * The operator for combining multiple filters.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter.Operator op = 1;</code>
     */
    public int getOpValue() {
      return op_;
    }
    /**
     * <pre>
     * The operator for combining multiple filters.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter.Operator op = 1;</code>
     */
    public Builder setOpValue(int value) {
      op_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operator for combining multiple filters.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter.Operator op = 1;</code>
     */
    public com.google.datastore.v1.CompositeFilter.Operator getOp() {
      com.google.datastore.v1.CompositeFilter.Operator result = com.google.datastore.v1.CompositeFilter.Operator.valueOf(op_);
      return result == null ? com.google.datastore.v1.CompositeFilter.Operator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The operator for combining multiple filters.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter.Operator op = 1;</code>
     */
    public Builder setOp(com.google.datastore.v1.CompositeFilter.Operator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      op_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operator for combining multiple filters.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter.Operator op = 1;</code>
     */
    public Builder clearOp() {
      
      op_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.datastore.v1.Filter> filters_ =
      java.util.Collections.emptyList();
    private void ensureFiltersIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        filters_ = new java.util.ArrayList<com.google.datastore.v1.Filter>(filters_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.datastore.v1.Filter, com.google.datastore.v1.Filter.Builder, com.google.datastore.v1.FilterOrBuilder> filtersBuilder_;

    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public java.util.List<com.google.datastore.v1.Filter> getFiltersList() {
      if (filtersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(filters_);
      } else {
        return filtersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public int getFiltersCount() {
      if (filtersBuilder_ == null) {
        return filters_.size();
      } else {
        return filtersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public com.google.datastore.v1.Filter getFilters(int index) {
      if (filtersBuilder_ == null) {
        return filters_.get(index);
      } else {
        return filtersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public Builder setFilters(
        int index, com.google.datastore.v1.Filter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.set(index, value);
        onChanged();
      } else {
        filtersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public Builder setFilters(
        int index, com.google.datastore.v1.Filter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.set(index, builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public Builder addFilters(com.google.datastore.v1.Filter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.add(value);
        onChanged();
      } else {
        filtersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public Builder addFilters(
        int index, com.google.datastore.v1.Filter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.add(index, value);
        onChanged();
      } else {
        filtersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public Builder addFilters(
        com.google.datastore.v1.Filter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.add(builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public Builder addFilters(
        int index, com.google.datastore.v1.Filter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.add(index, builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public Builder addAllFilters(
        java.lang.Iterable<? extends com.google.datastore.v1.Filter> values) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, filters_);
        onChanged();
      } else {
        filtersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public Builder clearFilters() {
      if (filtersBuilder_ == null) {
        filters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        filtersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public Builder removeFilters(int index) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.remove(index);
        onChanged();
      } else {
        filtersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public com.google.datastore.v1.Filter.Builder getFiltersBuilder(
        int index) {
      return getFiltersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public com.google.datastore.v1.FilterOrBuilder getFiltersOrBuilder(
        int index) {
      if (filtersBuilder_ == null) {
        return filters_.get(index);  } else {
        return filtersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public java.util.List<? extends com.google.datastore.v1.FilterOrBuilder> 
         getFiltersOrBuilderList() {
      if (filtersBuilder_ != null) {
        return filtersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(filters_);
      }
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public com.google.datastore.v1.Filter.Builder addFiltersBuilder() {
      return getFiltersFieldBuilder().addBuilder(
          com.google.datastore.v1.Filter.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public com.google.datastore.v1.Filter.Builder addFiltersBuilder(
        int index) {
      return getFiltersFieldBuilder().addBuilder(
          index, com.google.datastore.v1.Filter.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of filters to combine.
     * Must contain at least one filter.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Filter filters = 2;</code>
     */
    public java.util.List<com.google.datastore.v1.Filter.Builder> 
         getFiltersBuilderList() {
      return getFiltersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.datastore.v1.Filter, com.google.datastore.v1.Filter.Builder, com.google.datastore.v1.FilterOrBuilder> 
        getFiltersFieldBuilder() {
      if (filtersBuilder_ == null) {
        filtersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.datastore.v1.Filter, com.google.datastore.v1.Filter.Builder, com.google.datastore.v1.FilterOrBuilder>(
                filters_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        filters_ = null;
      }
      return filtersBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.datastore.v1.CompositeFilter)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.CompositeFilter)
  private static final com.google.datastore.v1.CompositeFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.CompositeFilter();
  }

  public static com.google.datastore.v1.CompositeFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompositeFilter>
      PARSER = new com.google.protobuf.AbstractParser<CompositeFilter>() {
    public CompositeFilter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CompositeFilter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompositeFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompositeFilter> getParserForType() {
    return PARSER;
  }

  public com.google.datastore.v1.CompositeFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

