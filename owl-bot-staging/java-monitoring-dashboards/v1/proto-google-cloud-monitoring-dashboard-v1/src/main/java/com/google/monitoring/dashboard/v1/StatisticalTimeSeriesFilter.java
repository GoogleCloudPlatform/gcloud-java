// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/common.proto

package com.google.monitoring.dashboard.v1;

/**
 * <pre>
 * A filter that ranks streams based on their statistical relation to other
 * streams in a request.
 * Note: This field is deprecated and completely ignored by the API.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter}
 */
public final class StatisticalTimeSeriesFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter)
    StatisticalTimeSeriesFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatisticalTimeSeriesFilter.newBuilder() to construct.
  private StatisticalTimeSeriesFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatisticalTimeSeriesFilter() {
    rankingMethod_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatisticalTimeSeriesFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.dashboard.v1.CommonProto.internal_static_google_monitoring_dashboard_v1_StatisticalTimeSeriesFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.dashboard.v1.CommonProto.internal_static_google_monitoring_dashboard_v1_StatisticalTimeSeriesFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.class, com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Builder.class);
  }

  /**
   * <pre>
   * The filter methods that can be applied to a stream.
   * </pre>
   *
   * Protobuf enum {@code google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method}
   */
  public enum Method
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not allowed in well-formed requests.
     * </pre>
     *
     * <code>METHOD_UNSPECIFIED = 0;</code>
     */
    METHOD_UNSPECIFIED(0),
    /**
     * <pre>
     * Compute the outlier score of each stream.
     * </pre>
     *
     * <code>METHOD_CLUSTER_OUTLIER = 1;</code>
     */
    METHOD_CLUSTER_OUTLIER(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not allowed in well-formed requests.
     * </pre>
     *
     * <code>METHOD_UNSPECIFIED = 0;</code>
     */
    public static final int METHOD_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Compute the outlier score of each stream.
     * </pre>
     *
     * <code>METHOD_CLUSTER_OUTLIER = 1;</code>
     */
    public static final int METHOD_CLUSTER_OUTLIER_VALUE = 1;


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
    public static Method valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Method forNumber(int value) {
      switch (value) {
        case 0: return METHOD_UNSPECIFIED;
        case 1: return METHOD_CLUSTER_OUTLIER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Method>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Method> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Method>() {
            public Method findValueByNumber(int number) {
              return Method.forNumber(number);
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
      return com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.getDescriptor().getEnumTypes().get(0);
    }

    private static final Method[] VALUES = values();

    public static Method valueOf(
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

    private Method(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method)
  }

  public static final int RANKING_METHOD_FIELD_NUMBER = 1;
  private int rankingMethod_ = 0;
  /**
   * <pre>
   * `rankingMethod` is applied to a set of time series, and then the produced
   * value for each individual time series is used to compare a given time
   * series to others.
   * These are methods that cannot be applied stream-by-stream, but rather
   * require the full context of a request to evaluate time series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;</code>
   * @return The enum numeric value on the wire for rankingMethod.
   */
  @java.lang.Override public int getRankingMethodValue() {
    return rankingMethod_;
  }
  /**
   * <pre>
   * `rankingMethod` is applied to a set of time series, and then the produced
   * value for each individual time series is used to compare a given time
   * series to others.
   * These are methods that cannot be applied stream-by-stream, but rather
   * require the full context of a request to evaluate time series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;</code>
   * @return The rankingMethod.
   */
  @java.lang.Override public com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method getRankingMethod() {
    com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method result = com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method.forNumber(rankingMethod_);
    return result == null ? com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method.UNRECOGNIZED : result;
  }

  public static final int NUM_TIME_SERIES_FIELD_NUMBER = 2;
  private int numTimeSeries_ = 0;
  /**
   * <pre>
   * How many time series to output.
   * </pre>
   *
   * <code>int32 num_time_series = 2;</code>
   * @return The numTimeSeries.
   */
  @java.lang.Override
  public int getNumTimeSeries() {
    return numTimeSeries_;
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
    if (rankingMethod_ != com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method.METHOD_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, rankingMethod_);
    }
    if (numTimeSeries_ != 0) {
      output.writeInt32(2, numTimeSeries_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rankingMethod_ != com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method.METHOD_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, rankingMethod_);
    }
    if (numTimeSeries_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, numTimeSeries_);
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
    if (!(obj instanceof com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter)) {
      return super.equals(obj);
    }
    com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter other = (com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter) obj;

    if (rankingMethod_ != other.rankingMethod_) return false;
    if (getNumTimeSeries()
        != other.getNumTimeSeries()) return false;
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
    hash = (37 * hash) + RANKING_METHOD_FIELD_NUMBER;
    hash = (53 * hash) + rankingMethod_;
    hash = (37 * hash) + NUM_TIME_SERIES_FIELD_NUMBER;
    hash = (53 * hash) + getNumTimeSeries();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter prototype) {
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
   * A filter that ranks streams based on their statistical relation to other
   * streams in a request.
   * Note: This field is deprecated and completely ignored by the API.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter)
      com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.dashboard.v1.CommonProto.internal_static_google_monitoring_dashboard_v1_StatisticalTimeSeriesFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.dashboard.v1.CommonProto.internal_static_google_monitoring_dashboard_v1_StatisticalTimeSeriesFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.class, com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Builder.class);
    }

    // Construct using com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.newBuilder()
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
      rankingMethod_ = 0;
      numTimeSeries_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.dashboard.v1.CommonProto.internal_static_google_monitoring_dashboard_v1_StatisticalTimeSeriesFilter_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter getDefaultInstanceForType() {
      return com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter build() {
      com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter buildPartial() {
      com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter result = new com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rankingMethod_ = rankingMethod_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numTimeSeries_ = numTimeSeries_;
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
      if (other instanceof com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter) {
        return mergeFrom((com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter other) {
      if (other == com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.getDefaultInstance()) return this;
      if (other.rankingMethod_ != 0) {
        setRankingMethodValue(other.getRankingMethodValue());
      }
      if (other.getNumTimeSeries() != 0) {
        setNumTimeSeries(other.getNumTimeSeries());
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
              rankingMethod_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              numTimeSeries_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int rankingMethod_ = 0;
    /**
     * <pre>
     * `rankingMethod` is applied to a set of time series, and then the produced
     * value for each individual time series is used to compare a given time
     * series to others.
     * These are methods that cannot be applied stream-by-stream, but rather
     * require the full context of a request to evaluate time series.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;</code>
     * @return The enum numeric value on the wire for rankingMethod.
     */
    @java.lang.Override public int getRankingMethodValue() {
      return rankingMethod_;
    }
    /**
     * <pre>
     * `rankingMethod` is applied to a set of time series, and then the produced
     * value for each individual time series is used to compare a given time
     * series to others.
     * These are methods that cannot be applied stream-by-stream, but rather
     * require the full context of a request to evaluate time series.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;</code>
     * @param value The enum numeric value on the wire for rankingMethod to set.
     * @return This builder for chaining.
     */
    public Builder setRankingMethodValue(int value) {
      rankingMethod_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `rankingMethod` is applied to a set of time series, and then the produced
     * value for each individual time series is used to compare a given time
     * series to others.
     * These are methods that cannot be applied stream-by-stream, but rather
     * require the full context of a request to evaluate time series.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;</code>
     * @return The rankingMethod.
     */
    @java.lang.Override
    public com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method getRankingMethod() {
      com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method result = com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method.forNumber(rankingMethod_);
      return result == null ? com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * `rankingMethod` is applied to a set of time series, and then the produced
     * value for each individual time series is used to compare a given time
     * series to others.
     * These are methods that cannot be applied stream-by-stream, but rather
     * require the full context of a request to evaluate time series.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;</code>
     * @param value The rankingMethod to set.
     * @return This builder for chaining.
     */
    public Builder setRankingMethod(com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      rankingMethod_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `rankingMethod` is applied to a set of time series, and then the produced
     * value for each individual time series is used to compare a given time
     * series to others.
     * These are methods that cannot be applied stream-by-stream, but rather
     * require the full context of a request to evaluate time series.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRankingMethod() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rankingMethod_ = 0;
      onChanged();
      return this;
    }

    private int numTimeSeries_ ;
    /**
     * <pre>
     * How many time series to output.
     * </pre>
     *
     * <code>int32 num_time_series = 2;</code>
     * @return The numTimeSeries.
     */
    @java.lang.Override
    public int getNumTimeSeries() {
      return numTimeSeries_;
    }
    /**
     * <pre>
     * How many time series to output.
     * </pre>
     *
     * <code>int32 num_time_series = 2;</code>
     * @param value The numTimeSeries to set.
     * @return This builder for chaining.
     */
    public Builder setNumTimeSeries(int value) {

      numTimeSeries_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * How many time series to output.
     * </pre>
     *
     * <code>int32 num_time_series = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumTimeSeries() {
      bitField0_ = (bitField0_ & ~0x00000002);
      numTimeSeries_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter)
  private static final com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter();
  }

  public static com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatisticalTimeSeriesFilter>
      PARSER = new com.google.protobuf.AbstractParser<StatisticalTimeSeriesFilter>() {
    @java.lang.Override
    public StatisticalTimeSeriesFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<StatisticalTimeSeriesFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatisticalTimeSeriesFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

