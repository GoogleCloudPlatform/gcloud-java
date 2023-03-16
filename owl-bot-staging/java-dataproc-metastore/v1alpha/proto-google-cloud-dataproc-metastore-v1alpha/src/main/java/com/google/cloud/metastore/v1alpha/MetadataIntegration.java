// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1alpha/metastore.proto

package com.google.cloud.metastore.v1alpha;

/**
 * <pre>
 * Specifies how metastore metadata should be integrated with external services.
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1alpha.MetadataIntegration}
 */
public final class MetadataIntegration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1alpha.MetadataIntegration)
    MetadataIntegrationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetadataIntegration.newBuilder() to construct.
  private MetadataIntegration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetadataIntegration() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MetadataIntegration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_MetadataIntegration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_MetadataIntegration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1alpha.MetadataIntegration.class, com.google.cloud.metastore.v1alpha.MetadataIntegration.Builder.class);
  }

  public static final int DATA_CATALOG_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.metastore.v1alpha.DataCatalogConfig dataCatalogConfig_;
  /**
   * <pre>
   * The integration config for the Data Catalog service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
   * @return Whether the dataCatalogConfig field is set.
   */
  @java.lang.Override
  public boolean hasDataCatalogConfig() {
    return dataCatalogConfig_ != null;
  }
  /**
   * <pre>
   * The integration config for the Data Catalog service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
   * @return The dataCatalogConfig.
   */
  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.DataCatalogConfig getDataCatalogConfig() {
    return dataCatalogConfig_ == null ? com.google.cloud.metastore.v1alpha.DataCatalogConfig.getDefaultInstance() : dataCatalogConfig_;
  }
  /**
   * <pre>
   * The integration config for the Data Catalog service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.DataCatalogConfigOrBuilder getDataCatalogConfigOrBuilder() {
    return dataCatalogConfig_ == null ? com.google.cloud.metastore.v1alpha.DataCatalogConfig.getDefaultInstance() : dataCatalogConfig_;
  }

  public static final int DATAPLEX_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.metastore.v1alpha.DataplexConfig dataplexConfig_;
  /**
   * <pre>
   * The integration config for the Dataplex service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
   * @return Whether the dataplexConfig field is set.
   */
  @java.lang.Override
  public boolean hasDataplexConfig() {
    return dataplexConfig_ != null;
  }
  /**
   * <pre>
   * The integration config for the Dataplex service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
   * @return The dataplexConfig.
   */
  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.DataplexConfig getDataplexConfig() {
    return dataplexConfig_ == null ? com.google.cloud.metastore.v1alpha.DataplexConfig.getDefaultInstance() : dataplexConfig_;
  }
  /**
   * <pre>
   * The integration config for the Dataplex service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.DataplexConfigOrBuilder getDataplexConfigOrBuilder() {
    return dataplexConfig_ == null ? com.google.cloud.metastore.v1alpha.DataplexConfig.getDefaultInstance() : dataplexConfig_;
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
    if (dataCatalogConfig_ != null) {
      output.writeMessage(1, getDataCatalogConfig());
    }
    if (dataplexConfig_ != null) {
      output.writeMessage(2, getDataplexConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataCatalogConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDataCatalogConfig());
    }
    if (dataplexConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDataplexConfig());
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
    if (!(obj instanceof com.google.cloud.metastore.v1alpha.MetadataIntegration)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1alpha.MetadataIntegration other = (com.google.cloud.metastore.v1alpha.MetadataIntegration) obj;

    if (hasDataCatalogConfig() != other.hasDataCatalogConfig()) return false;
    if (hasDataCatalogConfig()) {
      if (!getDataCatalogConfig()
          .equals(other.getDataCatalogConfig())) return false;
    }
    if (hasDataplexConfig() != other.hasDataplexConfig()) return false;
    if (hasDataplexConfig()) {
      if (!getDataplexConfig()
          .equals(other.getDataplexConfig())) return false;
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
    if (hasDataCatalogConfig()) {
      hash = (37 * hash) + DATA_CATALOG_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getDataCatalogConfig().hashCode();
    }
    if (hasDataplexConfig()) {
      hash = (37 * hash) + DATAPLEX_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getDataplexConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1alpha.MetadataIntegration parseFrom(
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
  public static Builder newBuilder(com.google.cloud.metastore.v1alpha.MetadataIntegration prototype) {
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
   * Specifies how metastore metadata should be integrated with external services.
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1alpha.MetadataIntegration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1alpha.MetadataIntegration)
      com.google.cloud.metastore.v1alpha.MetadataIntegrationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_MetadataIntegration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_MetadataIntegration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1alpha.MetadataIntegration.class, com.google.cloud.metastore.v1alpha.MetadataIntegration.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1alpha.MetadataIntegration.newBuilder()
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
      dataCatalogConfig_ = null;
      if (dataCatalogConfigBuilder_ != null) {
        dataCatalogConfigBuilder_.dispose();
        dataCatalogConfigBuilder_ = null;
      }
      dataplexConfig_ = null;
      if (dataplexConfigBuilder_ != null) {
        dataplexConfigBuilder_.dispose();
        dataplexConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto.internal_static_google_cloud_metastore_v1alpha_MetadataIntegration_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.MetadataIntegration getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1alpha.MetadataIntegration.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.MetadataIntegration build() {
      com.google.cloud.metastore.v1alpha.MetadataIntegration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.MetadataIntegration buildPartial() {
      com.google.cloud.metastore.v1alpha.MetadataIntegration result = new com.google.cloud.metastore.v1alpha.MetadataIntegration(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.metastore.v1alpha.MetadataIntegration result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataCatalogConfig_ = dataCatalogConfigBuilder_ == null
            ? dataCatalogConfig_
            : dataCatalogConfigBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataplexConfig_ = dataplexConfigBuilder_ == null
            ? dataplexConfig_
            : dataplexConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.metastore.v1alpha.MetadataIntegration) {
        return mergeFrom((com.google.cloud.metastore.v1alpha.MetadataIntegration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1alpha.MetadataIntegration other) {
      if (other == com.google.cloud.metastore.v1alpha.MetadataIntegration.getDefaultInstance()) return this;
      if (other.hasDataCatalogConfig()) {
        mergeDataCatalogConfig(other.getDataCatalogConfig());
      }
      if (other.hasDataplexConfig()) {
        mergeDataplexConfig(other.getDataplexConfig());
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
                  getDataCatalogConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDataplexConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private com.google.cloud.metastore.v1alpha.DataCatalogConfig dataCatalogConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.metastore.v1alpha.DataCatalogConfig, com.google.cloud.metastore.v1alpha.DataCatalogConfig.Builder, com.google.cloud.metastore.v1alpha.DataCatalogConfigOrBuilder> dataCatalogConfigBuilder_;
    /**
     * <pre>
     * The integration config for the Data Catalog service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
     * @return Whether the dataCatalogConfig field is set.
     */
    public boolean hasDataCatalogConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The integration config for the Data Catalog service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
     * @return The dataCatalogConfig.
     */
    public com.google.cloud.metastore.v1alpha.DataCatalogConfig getDataCatalogConfig() {
      if (dataCatalogConfigBuilder_ == null) {
        return dataCatalogConfig_ == null ? com.google.cloud.metastore.v1alpha.DataCatalogConfig.getDefaultInstance() : dataCatalogConfig_;
      } else {
        return dataCatalogConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The integration config for the Data Catalog service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
     */
    public Builder setDataCatalogConfig(com.google.cloud.metastore.v1alpha.DataCatalogConfig value) {
      if (dataCatalogConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataCatalogConfig_ = value;
      } else {
        dataCatalogConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The integration config for the Data Catalog service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
     */
    public Builder setDataCatalogConfig(
        com.google.cloud.metastore.v1alpha.DataCatalogConfig.Builder builderForValue) {
      if (dataCatalogConfigBuilder_ == null) {
        dataCatalogConfig_ = builderForValue.build();
      } else {
        dataCatalogConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The integration config for the Data Catalog service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
     */
    public Builder mergeDataCatalogConfig(com.google.cloud.metastore.v1alpha.DataCatalogConfig value) {
      if (dataCatalogConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dataCatalogConfig_ != null &&
          dataCatalogConfig_ != com.google.cloud.metastore.v1alpha.DataCatalogConfig.getDefaultInstance()) {
          getDataCatalogConfigBuilder().mergeFrom(value);
        } else {
          dataCatalogConfig_ = value;
        }
      } else {
        dataCatalogConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The integration config for the Data Catalog service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
     */
    public Builder clearDataCatalogConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataCatalogConfig_ = null;
      if (dataCatalogConfigBuilder_ != null) {
        dataCatalogConfigBuilder_.dispose();
        dataCatalogConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The integration config for the Data Catalog service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
     */
    public com.google.cloud.metastore.v1alpha.DataCatalogConfig.Builder getDataCatalogConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataCatalogConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The integration config for the Data Catalog service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
     */
    public com.google.cloud.metastore.v1alpha.DataCatalogConfigOrBuilder getDataCatalogConfigOrBuilder() {
      if (dataCatalogConfigBuilder_ != null) {
        return dataCatalogConfigBuilder_.getMessageOrBuilder();
      } else {
        return dataCatalogConfig_ == null ?
            com.google.cloud.metastore.v1alpha.DataCatalogConfig.getDefaultInstance() : dataCatalogConfig_;
      }
    }
    /**
     * <pre>
     * The integration config for the Data Catalog service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.metastore.v1alpha.DataCatalogConfig, com.google.cloud.metastore.v1alpha.DataCatalogConfig.Builder, com.google.cloud.metastore.v1alpha.DataCatalogConfigOrBuilder> 
        getDataCatalogConfigFieldBuilder() {
      if (dataCatalogConfigBuilder_ == null) {
        dataCatalogConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.metastore.v1alpha.DataCatalogConfig, com.google.cloud.metastore.v1alpha.DataCatalogConfig.Builder, com.google.cloud.metastore.v1alpha.DataCatalogConfigOrBuilder>(
                getDataCatalogConfig(),
                getParentForChildren(),
                isClean());
        dataCatalogConfig_ = null;
      }
      return dataCatalogConfigBuilder_;
    }

    private com.google.cloud.metastore.v1alpha.DataplexConfig dataplexConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.metastore.v1alpha.DataplexConfig, com.google.cloud.metastore.v1alpha.DataplexConfig.Builder, com.google.cloud.metastore.v1alpha.DataplexConfigOrBuilder> dataplexConfigBuilder_;
    /**
     * <pre>
     * The integration config for the Dataplex service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
     * @return Whether the dataplexConfig field is set.
     */
    public boolean hasDataplexConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The integration config for the Dataplex service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
     * @return The dataplexConfig.
     */
    public com.google.cloud.metastore.v1alpha.DataplexConfig getDataplexConfig() {
      if (dataplexConfigBuilder_ == null) {
        return dataplexConfig_ == null ? com.google.cloud.metastore.v1alpha.DataplexConfig.getDefaultInstance() : dataplexConfig_;
      } else {
        return dataplexConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The integration config for the Dataplex service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
     */
    public Builder setDataplexConfig(com.google.cloud.metastore.v1alpha.DataplexConfig value) {
      if (dataplexConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataplexConfig_ = value;
      } else {
        dataplexConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The integration config for the Dataplex service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
     */
    public Builder setDataplexConfig(
        com.google.cloud.metastore.v1alpha.DataplexConfig.Builder builderForValue) {
      if (dataplexConfigBuilder_ == null) {
        dataplexConfig_ = builderForValue.build();
      } else {
        dataplexConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The integration config for the Dataplex service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
     */
    public Builder mergeDataplexConfig(com.google.cloud.metastore.v1alpha.DataplexConfig value) {
      if (dataplexConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          dataplexConfig_ != null &&
          dataplexConfig_ != com.google.cloud.metastore.v1alpha.DataplexConfig.getDefaultInstance()) {
          getDataplexConfigBuilder().mergeFrom(value);
        } else {
          dataplexConfig_ = value;
        }
      } else {
        dataplexConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The integration config for the Dataplex service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
     */
    public Builder clearDataplexConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataplexConfig_ = null;
      if (dataplexConfigBuilder_ != null) {
        dataplexConfigBuilder_.dispose();
        dataplexConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The integration config for the Dataplex service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
     */
    public com.google.cloud.metastore.v1alpha.DataplexConfig.Builder getDataplexConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDataplexConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The integration config for the Dataplex service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
     */
    public com.google.cloud.metastore.v1alpha.DataplexConfigOrBuilder getDataplexConfigOrBuilder() {
      if (dataplexConfigBuilder_ != null) {
        return dataplexConfigBuilder_.getMessageOrBuilder();
      } else {
        return dataplexConfig_ == null ?
            com.google.cloud.metastore.v1alpha.DataplexConfig.getDefaultInstance() : dataplexConfig_;
      }
    }
    /**
     * <pre>
     * The integration config for the Dataplex service.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.metastore.v1alpha.DataplexConfig, com.google.cloud.metastore.v1alpha.DataplexConfig.Builder, com.google.cloud.metastore.v1alpha.DataplexConfigOrBuilder> 
        getDataplexConfigFieldBuilder() {
      if (dataplexConfigBuilder_ == null) {
        dataplexConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.metastore.v1alpha.DataplexConfig, com.google.cloud.metastore.v1alpha.DataplexConfig.Builder, com.google.cloud.metastore.v1alpha.DataplexConfigOrBuilder>(
                getDataplexConfig(),
                getParentForChildren(),
                isClean());
        dataplexConfig_ = null;
      }
      return dataplexConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1alpha.MetadataIntegration)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1alpha.MetadataIntegration)
  private static final com.google.cloud.metastore.v1alpha.MetadataIntegration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1alpha.MetadataIntegration();
  }

  public static com.google.cloud.metastore.v1alpha.MetadataIntegration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetadataIntegration>
      PARSER = new com.google.protobuf.AbstractParser<MetadataIntegration>() {
    @java.lang.Override
    public MetadataIntegration parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetadataIntegration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetadataIntegration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.MetadataIntegration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

