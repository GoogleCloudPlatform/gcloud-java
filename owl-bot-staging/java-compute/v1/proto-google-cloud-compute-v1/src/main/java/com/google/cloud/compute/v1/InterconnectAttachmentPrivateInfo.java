// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Information for an interconnect attachment when this belongs to an interconnect of type DEDICATED.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectAttachmentPrivateInfo}
 */
public final class InterconnectAttachmentPrivateInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectAttachmentPrivateInfo)
    InterconnectAttachmentPrivateInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InterconnectAttachmentPrivateInfo.newBuilder() to construct.
  private InterconnectAttachmentPrivateInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InterconnectAttachmentPrivateInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InterconnectAttachmentPrivateInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InterconnectAttachmentPrivateInfo(
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
          case -2120399360: {
            bitField0_ |= 0x00000001;
            tag8021Q_ = input.readUInt32();
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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectAttachmentPrivateInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectAttachmentPrivateInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo.class, com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo.Builder.class);
  }

  private int bitField0_;
  public static final int TAG8021Q_FIELD_NUMBER = 271820992;
  private int tag8021Q_;
  /**
   * <pre>
   * [Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
   * </pre>
   *
   * <code>optional uint32 tag8021q = 271820992;</code>
   * @return Whether the tag8021q field is set.
   */
  @java.lang.Override
  public boolean hasTag8021Q() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * [Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
   * </pre>
   *
   * <code>optional uint32 tag8021q = 271820992;</code>
   * @return The tag8021q.
   */
  @java.lang.Override
  public int getTag8021Q() {
    return tag8021Q_;
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
      output.writeUInt32(271820992, tag8021Q_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(271820992, tag8021Q_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo other = (com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo) obj;

    if (hasTag8021Q() != other.hasTag8021Q()) return false;
    if (hasTag8021Q()) {
      if (getTag8021Q()
          != other.getTag8021Q()) return false;
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
    if (hasTag8021Q()) {
      hash = (37 * hash) + TAG8021Q_FIELD_NUMBER;
      hash = (53 * hash) + getTag8021Q();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo prototype) {
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
   * Information for an interconnect attachment when this belongs to an interconnect of type DEDICATED.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectAttachmentPrivateInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectAttachmentPrivateInfo)
      com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectAttachmentPrivateInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectAttachmentPrivateInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo.class, com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo.newBuilder()
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
      tag8021Q_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectAttachmentPrivateInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo build() {
      com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo buildPartial() {
      com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo result = new com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tag8021Q_ = tag8021Q_;
        to_bitField0_ |= 0x00000001;
      }
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
      if (other instanceof com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo) {
        return mergeFrom((com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo other) {
      if (other == com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo.getDefaultInstance()) return this;
      if (other.hasTag8021Q()) {
        setTag8021Q(other.getTag8021Q());
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
      com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int tag8021Q_ ;
    /**
     * <pre>
     * [Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
     * </pre>
     *
     * <code>optional uint32 tag8021q = 271820992;</code>
     * @return Whether the tag8021q field is set.
     */
    @java.lang.Override
    public boolean hasTag8021Q() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * [Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
     * </pre>
     *
     * <code>optional uint32 tag8021q = 271820992;</code>
     * @return The tag8021q.
     */
    @java.lang.Override
    public int getTag8021Q() {
      return tag8021Q_;
    }
    /**
     * <pre>
     * [Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
     * </pre>
     *
     * <code>optional uint32 tag8021q = 271820992;</code>
     * @param value The tag8021q to set.
     * @return This builder for chaining.
     */
    public Builder setTag8021Q(int value) {
      bitField0_ |= 0x00000001;
      tag8021Q_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
     * </pre>
     *
     * <code>optional uint32 tag8021q = 271820992;</code>
     * @return This builder for chaining.
     */
    public Builder clearTag8021Q() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tag8021Q_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectAttachmentPrivateInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectAttachmentPrivateInfo)
  private static final com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo();
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectAttachmentPrivateInfo>
      PARSER = new com.google.protobuf.AbstractParser<InterconnectAttachmentPrivateInfo>() {
    @java.lang.Override
    public InterconnectAttachmentPrivateInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InterconnectAttachmentPrivateInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InterconnectAttachmentPrivateInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectAttachmentPrivateInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

