// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/query.proto

package com.google.datastore.v1;

/**
 *
 *
 * <pre>
 * A holder for any type of filter.
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.Filter}
 */
public final class Filter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.Filter)
    FilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Filter.newBuilder() to construct.
  private Filter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Filter() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Filter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Filter(
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
              com.google.datastore.v1.CompositeFilter.Builder subBuilder = null;
              if (filterTypeCase_ == 1) {
                subBuilder = ((com.google.datastore.v1.CompositeFilter) filterType_).toBuilder();
              }
              filterType_ =
                  input.readMessage(
                      com.google.datastore.v1.CompositeFilter.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.datastore.v1.CompositeFilter) filterType_);
                filterType_ = subBuilder.buildPartial();
              }
              filterTypeCase_ = 1;
              break;
            }
          case 18:
            {
              com.google.datastore.v1.PropertyFilter.Builder subBuilder = null;
              if (filterTypeCase_ == 2) {
                subBuilder = ((com.google.datastore.v1.PropertyFilter) filterType_).toBuilder();
              }
              filterType_ =
                  input.readMessage(
                      com.google.datastore.v1.PropertyFilter.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.datastore.v1.PropertyFilter) filterType_);
                filterType_ = subBuilder.buildPartial();
              }
              filterTypeCase_ = 2;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_Filter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.QueryProto
        .internal_static_google_datastore_v1_Filter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.Filter.class, com.google.datastore.v1.Filter.Builder.class);
  }

  private int filterTypeCase_ = 0;
  private java.lang.Object filterType_;

  public enum FilterTypeCase implements com.google.protobuf.Internal.EnumLite {
    COMPOSITE_FILTER(1),
    PROPERTY_FILTER(2),
    FILTERTYPE_NOT_SET(0);
    private final int value;

    private FilterTypeCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static FilterTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static FilterTypeCase forNumber(int value) {
      switch (value) {
        case 1:
          return COMPOSITE_FILTER;
        case 2:
          return PROPERTY_FILTER;
        case 0:
          return FILTERTYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public FilterTypeCase getFilterTypeCase() {
    return FilterTypeCase.forNumber(filterTypeCase_);
  }

  public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * A composite filter.
   * </pre>
   *
   * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
   */
  public boolean hasCompositeFilter() {
    return filterTypeCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * A composite filter.
   * </pre>
   *
   * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
   */
  public com.google.datastore.v1.CompositeFilter getCompositeFilter() {
    if (filterTypeCase_ == 1) {
      return (com.google.datastore.v1.CompositeFilter) filterType_;
    }
    return com.google.datastore.v1.CompositeFilter.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A composite filter.
   * </pre>
   *
   * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
   */
  public com.google.datastore.v1.CompositeFilterOrBuilder getCompositeFilterOrBuilder() {
    if (filterTypeCase_ == 1) {
      return (com.google.datastore.v1.CompositeFilter) filterType_;
    }
    return com.google.datastore.v1.CompositeFilter.getDefaultInstance();
  }

  public static final int PROPERTY_FILTER_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * A filter on a property.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
   */
  public boolean hasPropertyFilter() {
    return filterTypeCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * A filter on a property.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
   */
  public com.google.datastore.v1.PropertyFilter getPropertyFilter() {
    if (filterTypeCase_ == 2) {
      return (com.google.datastore.v1.PropertyFilter) filterType_;
    }
    return com.google.datastore.v1.PropertyFilter.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A filter on a property.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
   */
  public com.google.datastore.v1.PropertyFilterOrBuilder getPropertyFilterOrBuilder() {
    if (filterTypeCase_ == 2) {
      return (com.google.datastore.v1.PropertyFilter) filterType_;
    }
    return com.google.datastore.v1.PropertyFilter.getDefaultInstance();
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
    if (filterTypeCase_ == 1) {
      output.writeMessage(1, (com.google.datastore.v1.CompositeFilter) filterType_);
    }
    if (filterTypeCase_ == 2) {
      output.writeMessage(2, (com.google.datastore.v1.PropertyFilter) filterType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filterTypeCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.datastore.v1.CompositeFilter) filterType_);
    }
    if (filterTypeCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.datastore.v1.PropertyFilter) filterType_);
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
    if (!(obj instanceof com.google.datastore.v1.Filter)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.Filter other = (com.google.datastore.v1.Filter) obj;

    if (!getFilterTypeCase().equals(other.getFilterTypeCase())) return false;
    switch (filterTypeCase_) {
      case 1:
        if (!getCompositeFilter().equals(other.getCompositeFilter())) return false;
        break;
      case 2:
        if (!getPropertyFilter().equals(other.getPropertyFilter())) return false;
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
    switch (filterTypeCase_) {
      case 1:
        hash = (37 * hash) + COMPOSITE_FILTER_FIELD_NUMBER;
        hash = (53 * hash) + getCompositeFilter().hashCode();
        break;
      case 2:
        hash = (37 * hash) + PROPERTY_FILTER_FIELD_NUMBER;
        hash = (53 * hash) + getPropertyFilter().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.Filter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.Filter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.Filter parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.Filter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.Filter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.Filter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.Filter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.Filter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.Filter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.Filter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.Filter parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.Filter parseFrom(
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

  public static Builder newBuilder(com.google.datastore.v1.Filter prototype) {
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
   * A holder for any type of filter.
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.Filter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.Filter)
      com.google.datastore.v1.FilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.datastore.v1.QueryProto
          .internal_static_google_datastore_v1_Filter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.QueryProto
          .internal_static_google_datastore_v1_Filter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.Filter.class, com.google.datastore.v1.Filter.Builder.class);
    }

    // Construct using com.google.datastore.v1.Filter.newBuilder()
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
      filterTypeCase_ = 0;
      filterType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.datastore.v1.QueryProto
          .internal_static_google_datastore_v1_Filter_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.Filter getDefaultInstanceForType() {
      return com.google.datastore.v1.Filter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.Filter build() {
      com.google.datastore.v1.Filter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.Filter buildPartial() {
      com.google.datastore.v1.Filter result = new com.google.datastore.v1.Filter(this);
      if (filterTypeCase_ == 1) {
        if (compositeFilterBuilder_ == null) {
          result.filterType_ = filterType_;
        } else {
          result.filterType_ = compositeFilterBuilder_.build();
        }
      }
      if (filterTypeCase_ == 2) {
        if (propertyFilterBuilder_ == null) {
          result.filterType_ = filterType_;
        } else {
          result.filterType_ = propertyFilterBuilder_.build();
        }
      }
      result.filterTypeCase_ = filterTypeCase_;
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
      if (other instanceof com.google.datastore.v1.Filter) {
        return mergeFrom((com.google.datastore.v1.Filter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.Filter other) {
      if (other == com.google.datastore.v1.Filter.getDefaultInstance()) return this;
      switch (other.getFilterTypeCase()) {
        case COMPOSITE_FILTER:
          {
            mergeCompositeFilter(other.getCompositeFilter());
            break;
          }
        case PROPERTY_FILTER:
          {
            mergePropertyFilter(other.getPropertyFilter());
            break;
          }
        case FILTERTYPE_NOT_SET:
          {
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
      com.google.datastore.v1.Filter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.Filter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int filterTypeCase_ = 0;
    private java.lang.Object filterType_;

    public FilterTypeCase getFilterTypeCase() {
      return FilterTypeCase.forNumber(filterTypeCase_);
    }

    public Builder clearFilterType() {
      filterTypeCase_ = 0;
      filterType_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.CompositeFilter,
            com.google.datastore.v1.CompositeFilter.Builder,
            com.google.datastore.v1.CompositeFilterOrBuilder>
        compositeFilterBuilder_;
    /**
     *
     *
     * <pre>
     * A composite filter.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
     */
    public boolean hasCompositeFilter() {
      return filterTypeCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * A composite filter.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
     */
    public com.google.datastore.v1.CompositeFilter getCompositeFilter() {
      if (compositeFilterBuilder_ == null) {
        if (filterTypeCase_ == 1) {
          return (com.google.datastore.v1.CompositeFilter) filterType_;
        }
        return com.google.datastore.v1.CompositeFilter.getDefaultInstance();
      } else {
        if (filterTypeCase_ == 1) {
          return compositeFilterBuilder_.getMessage();
        }
        return com.google.datastore.v1.CompositeFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A composite filter.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
     */
    public Builder setCompositeFilter(com.google.datastore.v1.CompositeFilter value) {
      if (compositeFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filterType_ = value;
        onChanged();
      } else {
        compositeFilterBuilder_.setMessage(value);
      }
      filterTypeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A composite filter.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
     */
    public Builder setCompositeFilter(
        com.google.datastore.v1.CompositeFilter.Builder builderForValue) {
      if (compositeFilterBuilder_ == null) {
        filterType_ = builderForValue.build();
        onChanged();
      } else {
        compositeFilterBuilder_.setMessage(builderForValue.build());
      }
      filterTypeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A composite filter.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
     */
    public Builder mergeCompositeFilter(com.google.datastore.v1.CompositeFilter value) {
      if (compositeFilterBuilder_ == null) {
        if (filterTypeCase_ == 1
            && filterType_ != com.google.datastore.v1.CompositeFilter.getDefaultInstance()) {
          filterType_ =
              com.google.datastore.v1.CompositeFilter.newBuilder(
                      (com.google.datastore.v1.CompositeFilter) filterType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          filterType_ = value;
        }
        onChanged();
      } else {
        if (filterTypeCase_ == 1) {
          compositeFilterBuilder_.mergeFrom(value);
        }
        compositeFilterBuilder_.setMessage(value);
      }
      filterTypeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A composite filter.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
     */
    public Builder clearCompositeFilter() {
      if (compositeFilterBuilder_ == null) {
        if (filterTypeCase_ == 1) {
          filterTypeCase_ = 0;
          filterType_ = null;
          onChanged();
        }
      } else {
        if (filterTypeCase_ == 1) {
          filterTypeCase_ = 0;
          filterType_ = null;
        }
        compositeFilterBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A composite filter.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
     */
    public com.google.datastore.v1.CompositeFilter.Builder getCompositeFilterBuilder() {
      return getCompositeFilterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A composite filter.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
     */
    public com.google.datastore.v1.CompositeFilterOrBuilder getCompositeFilterOrBuilder() {
      if ((filterTypeCase_ == 1) && (compositeFilterBuilder_ != null)) {
        return compositeFilterBuilder_.getMessageOrBuilder();
      } else {
        if (filterTypeCase_ == 1) {
          return (com.google.datastore.v1.CompositeFilter) filterType_;
        }
        return com.google.datastore.v1.CompositeFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A composite filter.
     * </pre>
     *
     * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.CompositeFilter,
            com.google.datastore.v1.CompositeFilter.Builder,
            com.google.datastore.v1.CompositeFilterOrBuilder>
        getCompositeFilterFieldBuilder() {
      if (compositeFilterBuilder_ == null) {
        if (!(filterTypeCase_ == 1)) {
          filterType_ = com.google.datastore.v1.CompositeFilter.getDefaultInstance();
        }
        compositeFilterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.datastore.v1.CompositeFilter,
                com.google.datastore.v1.CompositeFilter.Builder,
                com.google.datastore.v1.CompositeFilterOrBuilder>(
                (com.google.datastore.v1.CompositeFilter) filterType_,
                getParentForChildren(),
                isClean());
        filterType_ = null;
      }
      filterTypeCase_ = 1;
      onChanged();
      ;
      return compositeFilterBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.PropertyFilter,
            com.google.datastore.v1.PropertyFilter.Builder,
            com.google.datastore.v1.PropertyFilterOrBuilder>
        propertyFilterBuilder_;
    /**
     *
     *
     * <pre>
     * A filter on a property.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
     */
    public boolean hasPropertyFilter() {
      return filterTypeCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * A filter on a property.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
     */
    public com.google.datastore.v1.PropertyFilter getPropertyFilter() {
      if (propertyFilterBuilder_ == null) {
        if (filterTypeCase_ == 2) {
          return (com.google.datastore.v1.PropertyFilter) filterType_;
        }
        return com.google.datastore.v1.PropertyFilter.getDefaultInstance();
      } else {
        if (filterTypeCase_ == 2) {
          return propertyFilterBuilder_.getMessage();
        }
        return com.google.datastore.v1.PropertyFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A filter on a property.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
     */
    public Builder setPropertyFilter(com.google.datastore.v1.PropertyFilter value) {
      if (propertyFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filterType_ = value;
        onChanged();
      } else {
        propertyFilterBuilder_.setMessage(value);
      }
      filterTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter on a property.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
     */
    public Builder setPropertyFilter(
        com.google.datastore.v1.PropertyFilter.Builder builderForValue) {
      if (propertyFilterBuilder_ == null) {
        filterType_ = builderForValue.build();
        onChanged();
      } else {
        propertyFilterBuilder_.setMessage(builderForValue.build());
      }
      filterTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter on a property.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
     */
    public Builder mergePropertyFilter(com.google.datastore.v1.PropertyFilter value) {
      if (propertyFilterBuilder_ == null) {
        if (filterTypeCase_ == 2
            && filterType_ != com.google.datastore.v1.PropertyFilter.getDefaultInstance()) {
          filterType_ =
              com.google.datastore.v1.PropertyFilter.newBuilder(
                      (com.google.datastore.v1.PropertyFilter) filterType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          filterType_ = value;
        }
        onChanged();
      } else {
        if (filterTypeCase_ == 2) {
          propertyFilterBuilder_.mergeFrom(value);
        }
        propertyFilterBuilder_.setMessage(value);
      }
      filterTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter on a property.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
     */
    public Builder clearPropertyFilter() {
      if (propertyFilterBuilder_ == null) {
        if (filterTypeCase_ == 2) {
          filterTypeCase_ = 0;
          filterType_ = null;
          onChanged();
        }
      } else {
        if (filterTypeCase_ == 2) {
          filterTypeCase_ = 0;
          filterType_ = null;
        }
        propertyFilterBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter on a property.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
     */
    public com.google.datastore.v1.PropertyFilter.Builder getPropertyFilterBuilder() {
      return getPropertyFilterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A filter on a property.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
     */
    public com.google.datastore.v1.PropertyFilterOrBuilder getPropertyFilterOrBuilder() {
      if ((filterTypeCase_ == 2) && (propertyFilterBuilder_ != null)) {
        return propertyFilterBuilder_.getMessageOrBuilder();
      } else {
        if (filterTypeCase_ == 2) {
          return (com.google.datastore.v1.PropertyFilter) filterType_;
        }
        return com.google.datastore.v1.PropertyFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A filter on a property.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.PropertyFilter,
            com.google.datastore.v1.PropertyFilter.Builder,
            com.google.datastore.v1.PropertyFilterOrBuilder>
        getPropertyFilterFieldBuilder() {
      if (propertyFilterBuilder_ == null) {
        if (!(filterTypeCase_ == 2)) {
          filterType_ = com.google.datastore.v1.PropertyFilter.getDefaultInstance();
        }
        propertyFilterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.datastore.v1.PropertyFilter,
                com.google.datastore.v1.PropertyFilter.Builder,
                com.google.datastore.v1.PropertyFilterOrBuilder>(
                (com.google.datastore.v1.PropertyFilter) filterType_,
                getParentForChildren(),
                isClean());
        filterType_ = null;
      }
      filterTypeCase_ = 2;
      onChanged();
      ;
      return propertyFilterBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.datastore.v1.Filter)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.Filter)
  private static final com.google.datastore.v1.Filter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.Filter();
  }

  public static com.google.datastore.v1.Filter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Filter> PARSER =
      new com.google.protobuf.AbstractParser<Filter>() {
        @java.lang.Override
        public Filter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Filter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Filter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Filter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.Filter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
