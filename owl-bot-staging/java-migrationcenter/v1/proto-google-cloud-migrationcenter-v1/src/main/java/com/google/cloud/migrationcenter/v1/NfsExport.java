// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

/**
 * <pre>
 * NFS export.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.NfsExport}
 */
public final class NfsExport extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.NfsExport)
    NfsExportOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NfsExport.newBuilder() to construct.
  private NfsExport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NfsExport() {
    exportDirectory_ = "";
    hosts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NfsExport();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto.internal_static_google_cloud_migrationcenter_v1_NfsExport_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto.internal_static_google_cloud_migrationcenter_v1_NfsExport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.NfsExport.class, com.google.cloud.migrationcenter.v1.NfsExport.Builder.class);
  }

  public static final int EXPORT_DIRECTORY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object exportDirectory_ = "";
  /**
   * <pre>
   * The directory being exported.
   * </pre>
   *
   * <code>string export_directory = 1;</code>
   * @return The exportDirectory.
   */
  @java.lang.Override
  public java.lang.String getExportDirectory() {
    java.lang.Object ref = exportDirectory_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exportDirectory_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The directory being exported.
   * </pre>
   *
   * <code>string export_directory = 1;</code>
   * @return The bytes for exportDirectory.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExportDirectoryBytes() {
    java.lang.Object ref = exportDirectory_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      exportDirectory_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOSTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList hosts_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The hosts or networks to which the export is being shared.
   * </pre>
   *
   * <code>repeated string hosts = 2;</code>
   * @return A list containing the hosts.
   */
  public com.google.protobuf.ProtocolStringList
      getHostsList() {
    return hosts_;
  }
  /**
   * <pre>
   * The hosts or networks to which the export is being shared.
   * </pre>
   *
   * <code>repeated string hosts = 2;</code>
   * @return The count of hosts.
   */
  public int getHostsCount() {
    return hosts_.size();
  }
  /**
   * <pre>
   * The hosts or networks to which the export is being shared.
   * </pre>
   *
   * <code>repeated string hosts = 2;</code>
   * @param index The index of the element to return.
   * @return The hosts at the given index.
   */
  public java.lang.String getHosts(int index) {
    return hosts_.get(index);
  }
  /**
   * <pre>
   * The hosts or networks to which the export is being shared.
   * </pre>
   *
   * <code>repeated string hosts = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the hosts at the given index.
   */
  public com.google.protobuf.ByteString
      getHostsBytes(int index) {
    return hosts_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exportDirectory_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, exportDirectory_);
    }
    for (int i = 0; i < hosts_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hosts_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exportDirectory_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, exportDirectory_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < hosts_.size(); i++) {
        dataSize += computeStringSizeNoTag(hosts_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getHostsList().size();
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.NfsExport)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.NfsExport other = (com.google.cloud.migrationcenter.v1.NfsExport) obj;

    if (!getExportDirectory()
        .equals(other.getExportDirectory())) return false;
    if (!getHostsList()
        .equals(other.getHostsList())) return false;
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
    hash = (37 * hash) + EXPORT_DIRECTORY_FIELD_NUMBER;
    hash = (53 * hash) + getExportDirectory().hashCode();
    if (getHostsCount() > 0) {
      hash = (37 * hash) + HOSTS_FIELD_NUMBER;
      hash = (53 * hash) + getHostsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.NfsExport parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.migrationcenter.v1.NfsExport parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.migrationcenter.v1.NfsExport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.migrationcenter.v1.NfsExport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.migrationcenter.v1.NfsExport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.migrationcenter.v1.NfsExport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.migrationcenter.v1.NfsExport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.migrationcenter.v1.NfsExport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.NfsExport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.NfsExport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.migrationcenter.v1.NfsExport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.migrationcenter.v1.NfsExport parseFrom(
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
  public static Builder newBuilder(com.google.cloud.migrationcenter.v1.NfsExport prototype) {
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
   * NFS export.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.NfsExport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.NfsExport)
      com.google.cloud.migrationcenter.v1.NfsExportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto.internal_static_google_cloud_migrationcenter_v1_NfsExport_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto.internal_static_google_cloud_migrationcenter_v1_NfsExport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.NfsExport.class, com.google.cloud.migrationcenter.v1.NfsExport.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.NfsExport.newBuilder()
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
      exportDirectory_ = "";
      hosts_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto.internal_static_google_cloud_migrationcenter_v1_NfsExport_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.NfsExport getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.NfsExport.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.NfsExport build() {
      com.google.cloud.migrationcenter.v1.NfsExport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.NfsExport buildPartial() {
      com.google.cloud.migrationcenter.v1.NfsExport result = new com.google.cloud.migrationcenter.v1.NfsExport(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.migrationcenter.v1.NfsExport result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.exportDirectory_ = exportDirectory_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        hosts_.makeImmutable();
        result.hosts_ = hosts_;
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
      if (other instanceof com.google.cloud.migrationcenter.v1.NfsExport) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.NfsExport)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.migrationcenter.v1.NfsExport other) {
      if (other == com.google.cloud.migrationcenter.v1.NfsExport.getDefaultInstance()) return this;
      if (!other.getExportDirectory().isEmpty()) {
        exportDirectory_ = other.exportDirectory_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.hosts_.isEmpty()) {
        if (hosts_.isEmpty()) {
          hosts_ = other.hosts_;
          bitField0_ |= 0x00000002;
        } else {
          ensureHostsIsMutable();
          hosts_.addAll(other.hosts_);
        }
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
            case 10: {
              exportDirectory_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureHostsIsMutable();
              hosts_.add(s);
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

    private java.lang.Object exportDirectory_ = "";
    /**
     * <pre>
     * The directory being exported.
     * </pre>
     *
     * <code>string export_directory = 1;</code>
     * @return The exportDirectory.
     */
    public java.lang.String getExportDirectory() {
      java.lang.Object ref = exportDirectory_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exportDirectory_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The directory being exported.
     * </pre>
     *
     * <code>string export_directory = 1;</code>
     * @return The bytes for exportDirectory.
     */
    public com.google.protobuf.ByteString
        getExportDirectoryBytes() {
      java.lang.Object ref = exportDirectory_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exportDirectory_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The directory being exported.
     * </pre>
     *
     * <code>string export_directory = 1;</code>
     * @param value The exportDirectory to set.
     * @return This builder for chaining.
     */
    public Builder setExportDirectory(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      exportDirectory_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The directory being exported.
     * </pre>
     *
     * <code>string export_directory = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearExportDirectory() {
      exportDirectory_ = getDefaultInstance().getExportDirectory();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The directory being exported.
     * </pre>
     *
     * <code>string export_directory = 1;</code>
     * @param value The bytes for exportDirectory to set.
     * @return This builder for chaining.
     */
    public Builder setExportDirectoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      exportDirectory_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList hosts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureHostsIsMutable() {
      if (!hosts_.isModifiable()) {
        hosts_ = new com.google.protobuf.LazyStringArrayList(hosts_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * The hosts or networks to which the export is being shared.
     * </pre>
     *
     * <code>repeated string hosts = 2;</code>
     * @return A list containing the hosts.
     */
    public com.google.protobuf.ProtocolStringList
        getHostsList() {
      hosts_.makeImmutable();
      return hosts_;
    }
    /**
     * <pre>
     * The hosts or networks to which the export is being shared.
     * </pre>
     *
     * <code>repeated string hosts = 2;</code>
     * @return The count of hosts.
     */
    public int getHostsCount() {
      return hosts_.size();
    }
    /**
     * <pre>
     * The hosts or networks to which the export is being shared.
     * </pre>
     *
     * <code>repeated string hosts = 2;</code>
     * @param index The index of the element to return.
     * @return The hosts at the given index.
     */
    public java.lang.String getHosts(int index) {
      return hosts_.get(index);
    }
    /**
     * <pre>
     * The hosts or networks to which the export is being shared.
     * </pre>
     *
     * <code>repeated string hosts = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the hosts at the given index.
     */
    public com.google.protobuf.ByteString
        getHostsBytes(int index) {
      return hosts_.getByteString(index);
    }
    /**
     * <pre>
     * The hosts or networks to which the export is being shared.
     * </pre>
     *
     * <code>repeated string hosts = 2;</code>
     * @param index The index to set the value at.
     * @param value The hosts to set.
     * @return This builder for chaining.
     */
    public Builder setHosts(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureHostsIsMutable();
      hosts_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The hosts or networks to which the export is being shared.
     * </pre>
     *
     * <code>repeated string hosts = 2;</code>
     * @param value The hosts to add.
     * @return This builder for chaining.
     */
    public Builder addHosts(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureHostsIsMutable();
      hosts_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The hosts or networks to which the export is being shared.
     * </pre>
     *
     * <code>repeated string hosts = 2;</code>
     * @param values The hosts to add.
     * @return This builder for chaining.
     */
    public Builder addAllHosts(
        java.lang.Iterable<java.lang.String> values) {
      ensureHostsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, hosts_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The hosts or networks to which the export is being shared.
     * </pre>
     *
     * <code>repeated string hosts = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHosts() {
      hosts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The hosts or networks to which the export is being shared.
     * </pre>
     *
     * <code>repeated string hosts = 2;</code>
     * @param value The bytes of the hosts to add.
     * @return This builder for chaining.
     */
    public Builder addHostsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureHostsIsMutable();
      hosts_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.NfsExport)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.NfsExport)
  private static final com.google.cloud.migrationcenter.v1.NfsExport DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.NfsExport();
  }

  public static com.google.cloud.migrationcenter.v1.NfsExport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NfsExport>
      PARSER = new com.google.protobuf.AbstractParser<NfsExport>() {
    @java.lang.Override
    public NfsExport parsePartialFrom(
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

  public static com.google.protobuf.Parser<NfsExport> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NfsExport> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.NfsExport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

