// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

/**
 * <pre>
 * Single /etc/hosts entry.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.HostsEntry}
 */
public final class HostsEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.HostsEntry)
    HostsEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HostsEntry.newBuilder() to construct.
  private HostsEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HostsEntry() {
    ip_ = "";
    hostNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HostsEntry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto.internal_static_google_cloud_migrationcenter_v1_HostsEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto.internal_static_google_cloud_migrationcenter_v1_HostsEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.HostsEntry.class, com.google.cloud.migrationcenter.v1.HostsEntry.Builder.class);
  }

  public static final int IP_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ip_ = "";
  /**
   * <pre>
   * IP (raw, IPv4/6 agnostic).
   * </pre>
   *
   * <code>string ip = 1;</code>
   * @return The ip.
   */
  @java.lang.Override
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * IP (raw, IPv4/6 agnostic).
   * </pre>
   *
   * <code>string ip = 1;</code>
   * @return The bytes for ip.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOST_NAMES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList hostNames_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * List of host names / aliases.
   * </pre>
   *
   * <code>repeated string host_names = 2;</code>
   * @return A list containing the hostNames.
   */
  public com.google.protobuf.ProtocolStringList
      getHostNamesList() {
    return hostNames_;
  }
  /**
   * <pre>
   * List of host names / aliases.
   * </pre>
   *
   * <code>repeated string host_names = 2;</code>
   * @return The count of hostNames.
   */
  public int getHostNamesCount() {
    return hostNames_.size();
  }
  /**
   * <pre>
   * List of host names / aliases.
   * </pre>
   *
   * <code>repeated string host_names = 2;</code>
   * @param index The index of the element to return.
   * @return The hostNames at the given index.
   */
  public java.lang.String getHostNames(int index) {
    return hostNames_.get(index);
  }
  /**
   * <pre>
   * List of host names / aliases.
   * </pre>
   *
   * <code>repeated string host_names = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the hostNames at the given index.
   */
  public com.google.protobuf.ByteString
      getHostNamesBytes(int index) {
    return hostNames_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ip_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ip_);
    }
    for (int i = 0; i < hostNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hostNames_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ip_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ip_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < hostNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(hostNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getHostNamesList().size();
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.HostsEntry)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.HostsEntry other = (com.google.cloud.migrationcenter.v1.HostsEntry) obj;

    if (!getIp()
        .equals(other.getIp())) return false;
    if (!getHostNamesList()
        .equals(other.getHostNamesList())) return false;
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
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    if (getHostNamesCount() > 0) {
      hash = (37 * hash) + HOST_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getHostNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.HostsEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.migrationcenter.v1.HostsEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.migrationcenter.v1.HostsEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.migrationcenter.v1.HostsEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.migrationcenter.v1.HostsEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.migrationcenter.v1.HostsEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.migrationcenter.v1.HostsEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.migrationcenter.v1.HostsEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.HostsEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.HostsEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.migrationcenter.v1.HostsEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.migrationcenter.v1.HostsEntry parseFrom(
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
  public static Builder newBuilder(com.google.cloud.migrationcenter.v1.HostsEntry prototype) {
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
   * Single /etc/hosts entry.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.HostsEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.HostsEntry)
      com.google.cloud.migrationcenter.v1.HostsEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto.internal_static_google_cloud_migrationcenter_v1_HostsEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto.internal_static_google_cloud_migrationcenter_v1_HostsEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.HostsEntry.class, com.google.cloud.migrationcenter.v1.HostsEntry.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.HostsEntry.newBuilder()
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
      ip_ = "";
      hostNames_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto.internal_static_google_cloud_migrationcenter_v1_HostsEntry_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.HostsEntry getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.HostsEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.HostsEntry build() {
      com.google.cloud.migrationcenter.v1.HostsEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.HostsEntry buildPartial() {
      com.google.cloud.migrationcenter.v1.HostsEntry result = new com.google.cloud.migrationcenter.v1.HostsEntry(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.migrationcenter.v1.HostsEntry result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ip_ = ip_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        hostNames_.makeImmutable();
        result.hostNames_ = hostNames_;
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
      if (other instanceof com.google.cloud.migrationcenter.v1.HostsEntry) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.HostsEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.migrationcenter.v1.HostsEntry other) {
      if (other == com.google.cloud.migrationcenter.v1.HostsEntry.getDefaultInstance()) return this;
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.hostNames_.isEmpty()) {
        if (hostNames_.isEmpty()) {
          hostNames_ = other.hostNames_;
          bitField0_ |= 0x00000002;
        } else {
          ensureHostNamesIsMutable();
          hostNames_.addAll(other.hostNames_);
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
              ip_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureHostNamesIsMutable();
              hostNames_.add(s);
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

    private java.lang.Object ip_ = "";
    /**
     * <pre>
     * IP (raw, IPv4/6 agnostic).
     * </pre>
     *
     * <code>string ip = 1;</code>
     * @return The ip.
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * IP (raw, IPv4/6 agnostic).
     * </pre>
     *
     * <code>string ip = 1;</code>
     * @return The bytes for ip.
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * IP (raw, IPv4/6 agnostic).
     * </pre>
     *
     * <code>string ip = 1;</code>
     * @param value The ip to set.
     * @return This builder for chaining.
     */
    public Builder setIp(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ip_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP (raw, IPv4/6 agnostic).
     * </pre>
     *
     * <code>string ip = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIp() {
      ip_ = getDefaultInstance().getIp();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP (raw, IPv4/6 agnostic).
     * </pre>
     *
     * <code>string ip = 1;</code>
     * @param value The bytes for ip to set.
     * @return This builder for chaining.
     */
    public Builder setIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ip_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList hostNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureHostNamesIsMutable() {
      if (!hostNames_.isModifiable()) {
        hostNames_ = new com.google.protobuf.LazyStringArrayList(hostNames_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * List of host names / aliases.
     * </pre>
     *
     * <code>repeated string host_names = 2;</code>
     * @return A list containing the hostNames.
     */
    public com.google.protobuf.ProtocolStringList
        getHostNamesList() {
      hostNames_.makeImmutable();
      return hostNames_;
    }
    /**
     * <pre>
     * List of host names / aliases.
     * </pre>
     *
     * <code>repeated string host_names = 2;</code>
     * @return The count of hostNames.
     */
    public int getHostNamesCount() {
      return hostNames_.size();
    }
    /**
     * <pre>
     * List of host names / aliases.
     * </pre>
     *
     * <code>repeated string host_names = 2;</code>
     * @param index The index of the element to return.
     * @return The hostNames at the given index.
     */
    public java.lang.String getHostNames(int index) {
      return hostNames_.get(index);
    }
    /**
     * <pre>
     * List of host names / aliases.
     * </pre>
     *
     * <code>repeated string host_names = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the hostNames at the given index.
     */
    public com.google.protobuf.ByteString
        getHostNamesBytes(int index) {
      return hostNames_.getByteString(index);
    }
    /**
     * <pre>
     * List of host names / aliases.
     * </pre>
     *
     * <code>repeated string host_names = 2;</code>
     * @param index The index to set the value at.
     * @param value The hostNames to set.
     * @return This builder for chaining.
     */
    public Builder setHostNames(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureHostNamesIsMutable();
      hostNames_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of host names / aliases.
     * </pre>
     *
     * <code>repeated string host_names = 2;</code>
     * @param value The hostNames to add.
     * @return This builder for chaining.
     */
    public Builder addHostNames(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureHostNamesIsMutable();
      hostNames_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of host names / aliases.
     * </pre>
     *
     * <code>repeated string host_names = 2;</code>
     * @param values The hostNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllHostNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureHostNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, hostNames_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of host names / aliases.
     * </pre>
     *
     * <code>repeated string host_names = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostNames() {
      hostNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of host names / aliases.
     * </pre>
     *
     * <code>repeated string host_names = 2;</code>
     * @param value The bytes of the hostNames to add.
     * @return This builder for chaining.
     */
    public Builder addHostNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureHostNamesIsMutable();
      hostNames_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.HostsEntry)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.HostsEntry)
  private static final com.google.cloud.migrationcenter.v1.HostsEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.HostsEntry();
  }

  public static com.google.cloud.migrationcenter.v1.HostsEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HostsEntry>
      PARSER = new com.google.protobuf.AbstractParser<HostsEntry>() {
    @java.lang.Override
    public HostsEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<HostsEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HostsEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.HostsEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

