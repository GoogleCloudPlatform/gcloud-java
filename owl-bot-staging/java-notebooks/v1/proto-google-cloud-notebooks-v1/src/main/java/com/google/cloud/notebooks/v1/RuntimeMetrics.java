// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/runtime.proto

package com.google.cloud.notebooks.v1;

/**
 * <pre>
 * Contains runtime daemon metrics, such as OS and kernels and sessions stats.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.RuntimeMetrics}
 */
public final class RuntimeMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.RuntimeMetrics)
    RuntimeMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RuntimeMetrics.newBuilder() to construct.
  private RuntimeMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RuntimeMetrics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RuntimeMetrics();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.notebooks.v1.RuntimeProto.internal_static_google_cloud_notebooks_v1_RuntimeMetrics_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetSystemMetrics();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.RuntimeProto.internal_static_google_cloud_notebooks_v1_RuntimeMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.RuntimeMetrics.class, com.google.cloud.notebooks.v1.RuntimeMetrics.Builder.class);
  }

  public static final int SYSTEM_METRICS_FIELD_NUMBER = 1;
  private static final class SystemMetricsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.notebooks.v1.RuntimeProto.internal_static_google_cloud_notebooks_v1_RuntimeMetrics_SystemMetricsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> systemMetrics_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetSystemMetrics() {
    if (systemMetrics_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          SystemMetricsDefaultEntryHolder.defaultEntry);
    }
    return systemMetrics_;
  }
  public int getSystemMetricsCount() {
    return internalGetSystemMetrics().getMap().size();
  }
  /**
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public boolean containsSystemMetrics(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetSystemMetrics().getMap().containsKey(key);
  }
  /**
   * Use {@link #getSystemMetricsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getSystemMetrics() {
    return getSystemMetricsMap();
  }
  /**
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getSystemMetricsMap() {
    return internalGetSystemMetrics().getMap();
  }
  /**
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getSystemMetricsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetSystemMetrics().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.lang.String getSystemMetricsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetSystemMetrics().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetSystemMetrics(),
        SystemMetricsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetSystemMetrics().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      systemMetrics__ = SystemMetricsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, systemMetrics__);
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.RuntimeMetrics)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.RuntimeMetrics other = (com.google.cloud.notebooks.v1.RuntimeMetrics) obj;

    if (!internalGetSystemMetrics().equals(
        other.internalGetSystemMetrics())) return false;
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
    if (!internalGetSystemMetrics().getMap().isEmpty()) {
      hash = (37 * hash) + SYSTEM_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSystemMetrics().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.RuntimeMetrics parseFrom(
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
  public static Builder newBuilder(com.google.cloud.notebooks.v1.RuntimeMetrics prototype) {
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
   * Contains runtime daemon metrics, such as OS and kernels and sessions stats.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.RuntimeMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.RuntimeMetrics)
      com.google.cloud.notebooks.v1.RuntimeMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.notebooks.v1.RuntimeProto.internal_static_google_cloud_notebooks_v1_RuntimeMetrics_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetSystemMetrics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableSystemMetrics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.RuntimeProto.internal_static_google_cloud_notebooks_v1_RuntimeMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.RuntimeMetrics.class, com.google.cloud.notebooks.v1.RuntimeMetrics.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.RuntimeMetrics.newBuilder()
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
      internalGetMutableSystemMetrics().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.notebooks.v1.RuntimeProto.internal_static_google_cloud_notebooks_v1_RuntimeMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeMetrics getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.RuntimeMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeMetrics build() {
      com.google.cloud.notebooks.v1.RuntimeMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeMetrics buildPartial() {
      com.google.cloud.notebooks.v1.RuntimeMetrics result = new com.google.cloud.notebooks.v1.RuntimeMetrics(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.notebooks.v1.RuntimeMetrics result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.systemMetrics_ = internalGetSystemMetrics();
        result.systemMetrics_.makeImmutable();
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
      if (other instanceof com.google.cloud.notebooks.v1.RuntimeMetrics) {
        return mergeFrom((com.google.cloud.notebooks.v1.RuntimeMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.RuntimeMetrics other) {
      if (other == com.google.cloud.notebooks.v1.RuntimeMetrics.getDefaultInstance()) return this;
      internalGetMutableSystemMetrics().mergeFrom(
          other.internalGetSystemMetrics());
      bitField0_ |= 0x00000001;
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
            case 10: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              systemMetrics__ = input.readMessage(
                  SystemMetricsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableSystemMetrics().getMutableMap().put(
                  systemMetrics__.getKey(), systemMetrics__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> systemMetrics_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetSystemMetrics() {
      if (systemMetrics_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SystemMetricsDefaultEntryHolder.defaultEntry);
      }
      return systemMetrics_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableSystemMetrics() {
      if (systemMetrics_ == null) {
        systemMetrics_ = com.google.protobuf.MapField.newMapField(
            SystemMetricsDefaultEntryHolder.defaultEntry);
      }
      if (!systemMetrics_.isMutable()) {
        systemMetrics_ = systemMetrics_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return systemMetrics_;
    }
    public int getSystemMetricsCount() {
      return internalGetSystemMetrics().getMap().size();
    }
    /**
     * <pre>
     * Output only. The system metrics.
     * </pre>
     *
     * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    @java.lang.Override
    public boolean containsSystemMetrics(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetSystemMetrics().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSystemMetricsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getSystemMetrics() {
      return getSystemMetricsMap();
    }
    /**
     * <pre>
     * Output only. The system metrics.
     * </pre>
     *
     * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getSystemMetricsMap() {
      return internalGetSystemMetrics().getMap();
    }
    /**
     * <pre>
     * Output only. The system metrics.
     * </pre>
     *
     * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getSystemMetricsOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetSystemMetrics().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Output only. The system metrics.
     * </pre>
     *
     * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    @java.lang.Override
    public java.lang.String getSystemMetricsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetSystemMetrics().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearSystemMetrics() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableSystemMetrics().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Output only. The system metrics.
     * </pre>
     *
     * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder removeSystemMetrics(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableSystemMetrics().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableSystemMetrics() {
      bitField0_ |= 0x00000001;
      return internalGetMutableSystemMetrics().getMutableMap();
    }
    /**
     * <pre>
     * Output only. The system metrics.
     * </pre>
     *
     * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder putSystemMetrics(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableSystemMetrics().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * Output only. The system metrics.
     * </pre>
     *
     * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder putAllSystemMetrics(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableSystemMetrics().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.RuntimeMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.RuntimeMetrics)
  private static final com.google.cloud.notebooks.v1.RuntimeMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.RuntimeMetrics();
  }

  public static com.google.cloud.notebooks.v1.RuntimeMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeMetrics>
      PARSER = new com.google.protobuf.AbstractParser<RuntimeMetrics>() {
    @java.lang.Override
    public RuntimeMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<RuntimeMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.RuntimeMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

