// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/domains/v1beta1/domains.proto

package com.google.cloud.domains.v1beta1;

/**
 * <pre>
 * Response for the `RetrieveTransferParameters` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.domains.v1beta1.RetrieveTransferParametersResponse}
 */
public final class RetrieveTransferParametersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.domains.v1beta1.RetrieveTransferParametersResponse)
    RetrieveTransferParametersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RetrieveTransferParametersResponse.newBuilder() to construct.
  private RetrieveTransferParametersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RetrieveTransferParametersResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RetrieveTransferParametersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.domains.v1beta1.DomainsProto.internal_static_google_cloud_domains_v1beta1_RetrieveTransferParametersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.domains.v1beta1.DomainsProto.internal_static_google_cloud_domains_v1beta1_RetrieveTransferParametersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse.class, com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse.Builder.class);
  }

  public static final int TRANSFER_PARAMETERS_FIELD_NUMBER = 1;
  private com.google.cloud.domains.v1beta1.TransferParameters transferParameters_;
  /**
   * <pre>
   * Parameters to use when calling the `TransferDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
   * @return Whether the transferParameters field is set.
   */
  @java.lang.Override
  public boolean hasTransferParameters() {
    return transferParameters_ != null;
  }
  /**
   * <pre>
   * Parameters to use when calling the `TransferDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
   * @return The transferParameters.
   */
  @java.lang.Override
  public com.google.cloud.domains.v1beta1.TransferParameters getTransferParameters() {
    return transferParameters_ == null ? com.google.cloud.domains.v1beta1.TransferParameters.getDefaultInstance() : transferParameters_;
  }
  /**
   * <pre>
   * Parameters to use when calling the `TransferDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.domains.v1beta1.TransferParametersOrBuilder getTransferParametersOrBuilder() {
    return transferParameters_ == null ? com.google.cloud.domains.v1beta1.TransferParameters.getDefaultInstance() : transferParameters_;
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
    if (transferParameters_ != null) {
      output.writeMessage(1, getTransferParameters());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transferParameters_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTransferParameters());
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
    if (!(obj instanceof com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse other = (com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse) obj;

    if (hasTransferParameters() != other.hasTransferParameters()) return false;
    if (hasTransferParameters()) {
      if (!getTransferParameters()
          .equals(other.getTransferParameters())) return false;
    }
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
    if (hasTransferParameters()) {
      hash = (37 * hash) + TRANSFER_PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getTransferParameters().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse prototype) {
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
   * Response for the `RetrieveTransferParameters` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.domains.v1beta1.RetrieveTransferParametersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.domains.v1beta1.RetrieveTransferParametersResponse)
      com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.domains.v1beta1.DomainsProto.internal_static_google_cloud_domains_v1beta1_RetrieveTransferParametersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.domains.v1beta1.DomainsProto.internal_static_google_cloud_domains_v1beta1_RetrieveTransferParametersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse.class, com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse.Builder.class);
    }

    // Construct using com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse.newBuilder()
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
      transferParameters_ = null;
      if (transferParametersBuilder_ != null) {
        transferParametersBuilder_.dispose();
        transferParametersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.domains.v1beta1.DomainsProto.internal_static_google_cloud_domains_v1beta1_RetrieveTransferParametersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse getDefaultInstanceForType() {
      return com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse build() {
      com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse buildPartial() {
      com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse result = new com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.transferParameters_ = transferParametersBuilder_ == null
            ? transferParameters_
            : transferParametersBuilder_.build();
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
      if (other instanceof com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse) {
        return mergeFrom((com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse other) {
      if (other == com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse.getDefaultInstance()) return this;
      if (other.hasTransferParameters()) {
        mergeTransferParameters(other.getTransferParameters());
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
              input.readMessage(
                  getTransferParametersFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.cloud.domains.v1beta1.TransferParameters transferParameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.domains.v1beta1.TransferParameters, com.google.cloud.domains.v1beta1.TransferParameters.Builder, com.google.cloud.domains.v1beta1.TransferParametersOrBuilder> transferParametersBuilder_;
    /**
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
     * @return Whether the transferParameters field is set.
     */
    public boolean hasTransferParameters() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
     * @return The transferParameters.
     */
    public com.google.cloud.domains.v1beta1.TransferParameters getTransferParameters() {
      if (transferParametersBuilder_ == null) {
        return transferParameters_ == null ? com.google.cloud.domains.v1beta1.TransferParameters.getDefaultInstance() : transferParameters_;
      } else {
        return transferParametersBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
     */
    public Builder setTransferParameters(com.google.cloud.domains.v1beta1.TransferParameters value) {
      if (transferParametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transferParameters_ = value;
      } else {
        transferParametersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
     */
    public Builder setTransferParameters(
        com.google.cloud.domains.v1beta1.TransferParameters.Builder builderForValue) {
      if (transferParametersBuilder_ == null) {
        transferParameters_ = builderForValue.build();
      } else {
        transferParametersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
     */
    public Builder mergeTransferParameters(com.google.cloud.domains.v1beta1.TransferParameters value) {
      if (transferParametersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          transferParameters_ != null &&
          transferParameters_ != com.google.cloud.domains.v1beta1.TransferParameters.getDefaultInstance()) {
          getTransferParametersBuilder().mergeFrom(value);
        } else {
          transferParameters_ = value;
        }
      } else {
        transferParametersBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
     */
    public Builder clearTransferParameters() {
      bitField0_ = (bitField0_ & ~0x00000001);
      transferParameters_ = null;
      if (transferParametersBuilder_ != null) {
        transferParametersBuilder_.dispose();
        transferParametersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
     */
    public com.google.cloud.domains.v1beta1.TransferParameters.Builder getTransferParametersBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTransferParametersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
     */
    public com.google.cloud.domains.v1beta1.TransferParametersOrBuilder getTransferParametersOrBuilder() {
      if (transferParametersBuilder_ != null) {
        return transferParametersBuilder_.getMessageOrBuilder();
      } else {
        return transferParameters_ == null ?
            com.google.cloud.domains.v1beta1.TransferParameters.getDefaultInstance() : transferParameters_;
      }
    }
    /**
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferParameters transfer_parameters = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.domains.v1beta1.TransferParameters, com.google.cloud.domains.v1beta1.TransferParameters.Builder, com.google.cloud.domains.v1beta1.TransferParametersOrBuilder> 
        getTransferParametersFieldBuilder() {
      if (transferParametersBuilder_ == null) {
        transferParametersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.domains.v1beta1.TransferParameters, com.google.cloud.domains.v1beta1.TransferParameters.Builder, com.google.cloud.domains.v1beta1.TransferParametersOrBuilder>(
                getTransferParameters(),
                getParentForChildren(),
                isClean());
        transferParameters_ = null;
      }
      return transferParametersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.domains.v1beta1.RetrieveTransferParametersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.domains.v1beta1.RetrieveTransferParametersResponse)
  private static final com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse();
  }

  public static com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetrieveTransferParametersResponse>
      PARSER = new com.google.protobuf.AbstractParser<RetrieveTransferParametersResponse>() {
    @java.lang.Override
    public RetrieveTransferParametersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RetrieveTransferParametersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetrieveTransferParametersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

