// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/containeranalysis.proto

package com.google.containeranalysis.v1beta1;

/**
 *
 *
 * <pre>
 * Response for listing scan configurations.
 * </pre>
 *
 * Protobuf type {@code google.devtools.containeranalysis.v1beta1.ListScanConfigsResponse}
 */
public final class ListScanConfigsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.containeranalysis.v1beta1.ListScanConfigsResponse)
    ListScanConfigsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListScanConfigsResponse.newBuilder() to construct.
  private ListScanConfigsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListScanConfigsResponse() {
    scanConfigs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListScanConfigsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListScanConfigsResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                scanConfigs_ =
                    new java.util.ArrayList<com.google.containeranalysis.v1beta1.ScanConfig>();
                mutable_bitField0_ |= 0x00000001;
              }
              scanConfigs_.add(
                  input.readMessage(
                      com.google.containeranalysis.v1beta1.ScanConfig.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        scanConfigs_ = java.util.Collections.unmodifiableList(scanConfigs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.containeranalysis.v1beta1.Containeranalysis
        .internal_static_google_devtools_containeranalysis_v1beta1_ListScanConfigsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.containeranalysis.v1beta1.Containeranalysis
        .internal_static_google_devtools_containeranalysis_v1beta1_ListScanConfigsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.containeranalysis.v1beta1.ListScanConfigsResponse.class,
            com.google.containeranalysis.v1beta1.ListScanConfigsResponse.Builder.class);
  }

  public static final int SCAN_CONFIGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.containeranalysis.v1beta1.ScanConfig> scanConfigs_;
  /**
   *
   *
   * <pre>
   * The scan configurations requested.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
   */
  public java.util.List<com.google.containeranalysis.v1beta1.ScanConfig> getScanConfigsList() {
    return scanConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The scan configurations requested.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
   */
  public java.util.List<? extends com.google.containeranalysis.v1beta1.ScanConfigOrBuilder>
      getScanConfigsOrBuilderList() {
    return scanConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The scan configurations requested.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
   */
  public int getScanConfigsCount() {
    return scanConfigs_.size();
  }
  /**
   *
   *
   * <pre>
   * The scan configurations requested.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
   */
  public com.google.containeranalysis.v1beta1.ScanConfig getScanConfigs(int index) {
    return scanConfigs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The scan configurations requested.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
   */
  public com.google.containeranalysis.v1beta1.ScanConfigOrBuilder getScanConfigsOrBuilder(
      int index) {
    return scanConfigs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * The next pagination token in the list response. It should be used as
   * `page_token` for the following request. An empty value means no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The next pagination token in the list response. It should be used as
   * `page_token` for the following request. An empty value means no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < scanConfigs_.size(); i++) {
      output.writeMessage(1, scanConfigs_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < scanConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, scanConfigs_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.containeranalysis.v1beta1.ListScanConfigsResponse)) {
      return super.equals(obj);
    }
    com.google.containeranalysis.v1beta1.ListScanConfigsResponse other =
        (com.google.containeranalysis.v1beta1.ListScanConfigsResponse) obj;

    if (!getScanConfigsList().equals(other.getScanConfigsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getScanConfigsCount() > 0) {
      hash = (37 * hash) + SCAN_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getScanConfigsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.containeranalysis.v1beta1.ListScanConfigsResponse prototype) {
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
   * Response for listing scan configurations.
   * </pre>
   *
   * Protobuf type {@code google.devtools.containeranalysis.v1beta1.ListScanConfigsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.containeranalysis.v1beta1.ListScanConfigsResponse)
      com.google.containeranalysis.v1beta1.ListScanConfigsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.containeranalysis.v1beta1.Containeranalysis
          .internal_static_google_devtools_containeranalysis_v1beta1_ListScanConfigsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.containeranalysis.v1beta1.Containeranalysis
          .internal_static_google_devtools_containeranalysis_v1beta1_ListScanConfigsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.containeranalysis.v1beta1.ListScanConfigsResponse.class,
              com.google.containeranalysis.v1beta1.ListScanConfigsResponse.Builder.class);
    }

    // Construct using com.google.containeranalysis.v1beta1.ListScanConfigsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getScanConfigsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (scanConfigsBuilder_ == null) {
        scanConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        scanConfigsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.containeranalysis.v1beta1.Containeranalysis
          .internal_static_google_devtools_containeranalysis_v1beta1_ListScanConfigsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.containeranalysis.v1beta1.ListScanConfigsResponse
        getDefaultInstanceForType() {
      return com.google.containeranalysis.v1beta1.ListScanConfigsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.containeranalysis.v1beta1.ListScanConfigsResponse build() {
      com.google.containeranalysis.v1beta1.ListScanConfigsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.containeranalysis.v1beta1.ListScanConfigsResponse buildPartial() {
      com.google.containeranalysis.v1beta1.ListScanConfigsResponse result =
          new com.google.containeranalysis.v1beta1.ListScanConfigsResponse(this);
      int from_bitField0_ = bitField0_;
      if (scanConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          scanConfigs_ = java.util.Collections.unmodifiableList(scanConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.scanConfigs_ = scanConfigs_;
      } else {
        result.scanConfigs_ = scanConfigsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.containeranalysis.v1beta1.ListScanConfigsResponse) {
        return mergeFrom((com.google.containeranalysis.v1beta1.ListScanConfigsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.containeranalysis.v1beta1.ListScanConfigsResponse other) {
      if (other
          == com.google.containeranalysis.v1beta1.ListScanConfigsResponse.getDefaultInstance())
        return this;
      if (scanConfigsBuilder_ == null) {
        if (!other.scanConfigs_.isEmpty()) {
          if (scanConfigs_.isEmpty()) {
            scanConfigs_ = other.scanConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureScanConfigsIsMutable();
            scanConfigs_.addAll(other.scanConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.scanConfigs_.isEmpty()) {
          if (scanConfigsBuilder_.isEmpty()) {
            scanConfigsBuilder_.dispose();
            scanConfigsBuilder_ = null;
            scanConfigs_ = other.scanConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            scanConfigsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getScanConfigsFieldBuilder()
                    : null;
          } else {
            scanConfigsBuilder_.addAllMessages(other.scanConfigs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.containeranalysis.v1beta1.ListScanConfigsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.containeranalysis.v1beta1.ListScanConfigsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.containeranalysis.v1beta1.ScanConfig> scanConfigs_ =
        java.util.Collections.emptyList();

    private void ensureScanConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        scanConfigs_ =
            new java.util.ArrayList<com.google.containeranalysis.v1beta1.ScanConfig>(scanConfigs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.containeranalysis.v1beta1.ScanConfig,
            com.google.containeranalysis.v1beta1.ScanConfig.Builder,
            com.google.containeranalysis.v1beta1.ScanConfigOrBuilder>
        scanConfigsBuilder_;

    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public java.util.List<com.google.containeranalysis.v1beta1.ScanConfig> getScanConfigsList() {
      if (scanConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(scanConfigs_);
      } else {
        return scanConfigsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public int getScanConfigsCount() {
      if (scanConfigsBuilder_ == null) {
        return scanConfigs_.size();
      } else {
        return scanConfigsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public com.google.containeranalysis.v1beta1.ScanConfig getScanConfigs(int index) {
      if (scanConfigsBuilder_ == null) {
        return scanConfigs_.get(index);
      } else {
        return scanConfigsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public Builder setScanConfigs(
        int index, com.google.containeranalysis.v1beta1.ScanConfig value) {
      if (scanConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScanConfigsIsMutable();
        scanConfigs_.set(index, value);
        onChanged();
      } else {
        scanConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public Builder setScanConfigs(
        int index, com.google.containeranalysis.v1beta1.ScanConfig.Builder builderForValue) {
      if (scanConfigsBuilder_ == null) {
        ensureScanConfigsIsMutable();
        scanConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        scanConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public Builder addScanConfigs(com.google.containeranalysis.v1beta1.ScanConfig value) {
      if (scanConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScanConfigsIsMutable();
        scanConfigs_.add(value);
        onChanged();
      } else {
        scanConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public Builder addScanConfigs(
        int index, com.google.containeranalysis.v1beta1.ScanConfig value) {
      if (scanConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScanConfigsIsMutable();
        scanConfigs_.add(index, value);
        onChanged();
      } else {
        scanConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public Builder addScanConfigs(
        com.google.containeranalysis.v1beta1.ScanConfig.Builder builderForValue) {
      if (scanConfigsBuilder_ == null) {
        ensureScanConfigsIsMutable();
        scanConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        scanConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public Builder addScanConfigs(
        int index, com.google.containeranalysis.v1beta1.ScanConfig.Builder builderForValue) {
      if (scanConfigsBuilder_ == null) {
        ensureScanConfigsIsMutable();
        scanConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        scanConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public Builder addAllScanConfigs(
        java.lang.Iterable<? extends com.google.containeranalysis.v1beta1.ScanConfig> values) {
      if (scanConfigsBuilder_ == null) {
        ensureScanConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, scanConfigs_);
        onChanged();
      } else {
        scanConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public Builder clearScanConfigs() {
      if (scanConfigsBuilder_ == null) {
        scanConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        scanConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public Builder removeScanConfigs(int index) {
      if (scanConfigsBuilder_ == null) {
        ensureScanConfigsIsMutable();
        scanConfigs_.remove(index);
        onChanged();
      } else {
        scanConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public com.google.containeranalysis.v1beta1.ScanConfig.Builder getScanConfigsBuilder(
        int index) {
      return getScanConfigsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public com.google.containeranalysis.v1beta1.ScanConfigOrBuilder getScanConfigsOrBuilder(
        int index) {
      if (scanConfigsBuilder_ == null) {
        return scanConfigs_.get(index);
      } else {
        return scanConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public java.util.List<? extends com.google.containeranalysis.v1beta1.ScanConfigOrBuilder>
        getScanConfigsOrBuilderList() {
      if (scanConfigsBuilder_ != null) {
        return scanConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(scanConfigs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public com.google.containeranalysis.v1beta1.ScanConfig.Builder addScanConfigsBuilder() {
      return getScanConfigsFieldBuilder()
          .addBuilder(com.google.containeranalysis.v1beta1.ScanConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public com.google.containeranalysis.v1beta1.ScanConfig.Builder addScanConfigsBuilder(
        int index) {
      return getScanConfigsFieldBuilder()
          .addBuilder(index, com.google.containeranalysis.v1beta1.ScanConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The scan configurations requested.
     * </pre>
     *
     * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
     */
    public java.util.List<com.google.containeranalysis.v1beta1.ScanConfig.Builder>
        getScanConfigsBuilderList() {
      return getScanConfigsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.containeranalysis.v1beta1.ScanConfig,
            com.google.containeranalysis.v1beta1.ScanConfig.Builder,
            com.google.containeranalysis.v1beta1.ScanConfigOrBuilder>
        getScanConfigsFieldBuilder() {
      if (scanConfigsBuilder_ == null) {
        scanConfigsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.containeranalysis.v1beta1.ScanConfig,
                com.google.containeranalysis.v1beta1.ScanConfig.Builder,
                com.google.containeranalysis.v1beta1.ScanConfigOrBuilder>(
                scanConfigs_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        scanConfigs_ = null;
      }
      return scanConfigsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The next pagination token in the list response. It should be used as
     * `page_token` for the following request. An empty value means no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The next pagination token in the list response. It should be used as
     * `page_token` for the following request. An empty value means no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The next pagination token in the list response. It should be used as
     * `page_token` for the following request. An empty value means no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The next pagination token in the list response. It should be used as
     * `page_token` for the following request. An empty value means no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The next pagination token in the list response. It should be used as
     * `page_token` for the following request. An empty value means no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.containeranalysis.v1beta1.ListScanConfigsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.containeranalysis.v1beta1.ListScanConfigsResponse)
  private static final com.google.containeranalysis.v1beta1.ListScanConfigsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.containeranalysis.v1beta1.ListScanConfigsResponse();
  }

  public static com.google.containeranalysis.v1beta1.ListScanConfigsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListScanConfigsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListScanConfigsResponse>() {
        @java.lang.Override
        public ListScanConfigsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListScanConfigsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListScanConfigsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListScanConfigsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.containeranalysis.v1beta1.ListScanConfigsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
