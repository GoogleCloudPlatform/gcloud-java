// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/index_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Runtime operation information for [IndexService.UpdateIndex][google.cloud.aiplatform.v1beta1.IndexService.UpdateIndex].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata}
 */
public final class UpdateIndexOperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata)
    UpdateIndexOperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateIndexOperationMetadata.newBuilder() to construct.
  private UpdateIndexOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateIndexOperationMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateIndexOperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateIndexOperationMetadata(
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
          case 10: {
            com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder subBuilder = null;
            if (genericMetadata_ != null) {
              subBuilder = genericMetadata_.toBuilder();
            }
            genericMetadata_ = input.readMessage(com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(genericMetadata_);
              genericMetadata_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.Builder subBuilder = null;
            if (nearestNeighborSearchOperationMetadata_ != null) {
              subBuilder = nearestNeighborSearchOperationMetadata_.toBuilder();
            }
            nearestNeighborSearchOperationMetadata_ = input.readMessage(com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nearestNeighborSearchOperationMetadata_);
              nearestNeighborSearchOperationMetadata_ = subBuilder.buildPartial();
            }

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
    return com.google.cloud.aiplatform.v1beta1.IndexServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.IndexServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata.class, com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata.Builder.class);
  }

  public static final int GENERIC_METADATA_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata genericMetadata_;
  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return Whether the genericMetadata field is set.
   */
  @java.lang.Override
  public boolean hasGenericMetadata() {
    return genericMetadata_ != null;
  }
  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return The genericMetadata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata getGenericMetadata() {
    return genericMetadata_ == null ? com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.getDefaultInstance() : genericMetadata_;
  }
  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder() {
    return getGenericMetadata();
  }

  public static final int NEAREST_NEIGHBOR_SEARCH_OPERATION_METADATA_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearestNeighborSearchOperationMetadata_;
  /**
   * <pre>
   * The operation metadata with regard to Matching Engine Index operation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
   * @return Whether the nearestNeighborSearchOperationMetadata field is set.
   */
  @java.lang.Override
  public boolean hasNearestNeighborSearchOperationMetadata() {
    return nearestNeighborSearchOperationMetadata_ != null;
  }
  /**
   * <pre>
   * The operation metadata with regard to Matching Engine Index operation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
   * @return The nearestNeighborSearchOperationMetadata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata getNearestNeighborSearchOperationMetadata() {
    return nearestNeighborSearchOperationMetadata_ == null ? com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.getDefaultInstance() : nearestNeighborSearchOperationMetadata_;
  }
  /**
   * <pre>
   * The operation metadata with regard to Matching Engine Index operation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadataOrBuilder getNearestNeighborSearchOperationMetadataOrBuilder() {
    return getNearestNeighborSearchOperationMetadata();
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
    if (genericMetadata_ != null) {
      output.writeMessage(1, getGenericMetadata());
    }
    if (nearestNeighborSearchOperationMetadata_ != null) {
      output.writeMessage(2, getNearestNeighborSearchOperationMetadata());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (genericMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGenericMetadata());
    }
    if (nearestNeighborSearchOperationMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNearestNeighborSearchOperationMetadata());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata other = (com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata) obj;

    if (hasGenericMetadata() != other.hasGenericMetadata()) return false;
    if (hasGenericMetadata()) {
      if (!getGenericMetadata()
          .equals(other.getGenericMetadata())) return false;
    }
    if (hasNearestNeighborSearchOperationMetadata() != other.hasNearestNeighborSearchOperationMetadata()) return false;
    if (hasNearestNeighborSearchOperationMetadata()) {
      if (!getNearestNeighborSearchOperationMetadata()
          .equals(other.getNearestNeighborSearchOperationMetadata())) return false;
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
    if (hasGenericMetadata()) {
      hash = (37 * hash) + GENERIC_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getGenericMetadata().hashCode();
    }
    if (hasNearestNeighborSearchOperationMetadata()) {
      hash = (37 * hash) + NEAREST_NEIGHBOR_SEARCH_OPERATION_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getNearestNeighborSearchOperationMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata prototype) {
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
   * Runtime operation information for [IndexService.UpdateIndex][google.cloud.aiplatform.v1beta1.IndexService.UpdateIndex].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata)
      com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.IndexServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.IndexServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata.class, com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata.newBuilder()
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
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = null;
      } else {
        genericMetadata_ = null;
        genericMetadataBuilder_ = null;
      }
      if (nearestNeighborSearchOperationMetadataBuilder_ == null) {
        nearestNeighborSearchOperationMetadata_ = null;
      } else {
        nearestNeighborSearchOperationMetadata_ = null;
        nearestNeighborSearchOperationMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.IndexServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata build() {
      com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata result = new com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata(this);
      if (genericMetadataBuilder_ == null) {
        result.genericMetadata_ = genericMetadata_;
      } else {
        result.genericMetadata_ = genericMetadataBuilder_.build();
      }
      if (nearestNeighborSearchOperationMetadataBuilder_ == null) {
        result.nearestNeighborSearchOperationMetadata_ = nearestNeighborSearchOperationMetadata_;
      } else {
        result.nearestNeighborSearchOperationMetadata_ = nearestNeighborSearchOperationMetadataBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata other) {
      if (other == com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata.getDefaultInstance()) return this;
      if (other.hasGenericMetadata()) {
        mergeGenericMetadata(other.getGenericMetadata());
      }
      if (other.hasNearestNeighborSearchOperationMetadata()) {
        mergeNearestNeighborSearchOperationMetadata(other.getNearestNeighborSearchOperationMetadata());
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
      com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata genericMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata, com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder, com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder> genericMetadataBuilder_;
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     * @return Whether the genericMetadata field is set.
     */
    public boolean hasGenericMetadata() {
      return genericMetadataBuilder_ != null || genericMetadata_ != null;
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     * @return The genericMetadata.
     */
    public com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata getGenericMetadata() {
      if (genericMetadataBuilder_ == null) {
        return genericMetadata_ == null ? com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.getDefaultInstance() : genericMetadata_;
      } else {
        return genericMetadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder setGenericMetadata(com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata value) {
      if (genericMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        genericMetadata_ = value;
        onChanged();
      } else {
        genericMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder setGenericMetadata(
        com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder builderForValue) {
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = builderForValue.build();
        onChanged();
      } else {
        genericMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder mergeGenericMetadata(com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata value) {
      if (genericMetadataBuilder_ == null) {
        if (genericMetadata_ != null) {
          genericMetadata_ =
            com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.newBuilder(genericMetadata_).mergeFrom(value).buildPartial();
        } else {
          genericMetadata_ = value;
        }
        onChanged();
      } else {
        genericMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder clearGenericMetadata() {
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = null;
        onChanged();
      } else {
        genericMetadata_ = null;
        genericMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder getGenericMetadataBuilder() {
      
      onChanged();
      return getGenericMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder() {
      if (genericMetadataBuilder_ != null) {
        return genericMetadataBuilder_.getMessageOrBuilder();
      } else {
        return genericMetadata_ == null ?
            com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.getDefaultInstance() : genericMetadata_;
      }
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata, com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder, com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder> 
        getGenericMetadataFieldBuilder() {
      if (genericMetadataBuilder_ == null) {
        genericMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata, com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata.Builder, com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder>(
                getGenericMetadata(),
                getParentForChildren(),
                isClean());
        genericMetadata_ = null;
      }
      return genericMetadataBuilder_;
    }

    private com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearestNeighborSearchOperationMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata, com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.Builder, com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadataOrBuilder> nearestNeighborSearchOperationMetadataBuilder_;
    /**
     * <pre>
     * The operation metadata with regard to Matching Engine Index operation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
     * @return Whether the nearestNeighborSearchOperationMetadata field is set.
     */
    public boolean hasNearestNeighborSearchOperationMetadata() {
      return nearestNeighborSearchOperationMetadataBuilder_ != null || nearestNeighborSearchOperationMetadata_ != null;
    }
    /**
     * <pre>
     * The operation metadata with regard to Matching Engine Index operation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
     * @return The nearestNeighborSearchOperationMetadata.
     */
    public com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata getNearestNeighborSearchOperationMetadata() {
      if (nearestNeighborSearchOperationMetadataBuilder_ == null) {
        return nearestNeighborSearchOperationMetadata_ == null ? com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.getDefaultInstance() : nearestNeighborSearchOperationMetadata_;
      } else {
        return nearestNeighborSearchOperationMetadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The operation metadata with regard to Matching Engine Index operation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
     */
    public Builder setNearestNeighborSearchOperationMetadata(com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata value) {
      if (nearestNeighborSearchOperationMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nearestNeighborSearchOperationMetadata_ = value;
        onChanged();
      } else {
        nearestNeighborSearchOperationMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operation metadata with regard to Matching Engine Index operation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
     */
    public Builder setNearestNeighborSearchOperationMetadata(
        com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.Builder builderForValue) {
      if (nearestNeighborSearchOperationMetadataBuilder_ == null) {
        nearestNeighborSearchOperationMetadata_ = builderForValue.build();
        onChanged();
      } else {
        nearestNeighborSearchOperationMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The operation metadata with regard to Matching Engine Index operation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
     */
    public Builder mergeNearestNeighborSearchOperationMetadata(com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata value) {
      if (nearestNeighborSearchOperationMetadataBuilder_ == null) {
        if (nearestNeighborSearchOperationMetadata_ != null) {
          nearestNeighborSearchOperationMetadata_ =
            com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.newBuilder(nearestNeighborSearchOperationMetadata_).mergeFrom(value).buildPartial();
        } else {
          nearestNeighborSearchOperationMetadata_ = value;
        }
        onChanged();
      } else {
        nearestNeighborSearchOperationMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operation metadata with regard to Matching Engine Index operation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
     */
    public Builder clearNearestNeighborSearchOperationMetadata() {
      if (nearestNeighborSearchOperationMetadataBuilder_ == null) {
        nearestNeighborSearchOperationMetadata_ = null;
        onChanged();
      } else {
        nearestNeighborSearchOperationMetadata_ = null;
        nearestNeighborSearchOperationMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The operation metadata with regard to Matching Engine Index operation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.Builder getNearestNeighborSearchOperationMetadataBuilder() {
      
      onChanged();
      return getNearestNeighborSearchOperationMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The operation metadata with regard to Matching Engine Index operation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadataOrBuilder getNearestNeighborSearchOperationMetadataOrBuilder() {
      if (nearestNeighborSearchOperationMetadataBuilder_ != null) {
        return nearestNeighborSearchOperationMetadataBuilder_.getMessageOrBuilder();
      } else {
        return nearestNeighborSearchOperationMetadata_ == null ?
            com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.getDefaultInstance() : nearestNeighborSearchOperationMetadata_;
      }
    }
    /**
     * <pre>
     * The operation metadata with regard to Matching Engine Index operation.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata, com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.Builder, com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadataOrBuilder> 
        getNearestNeighborSearchOperationMetadataFieldBuilder() {
      if (nearestNeighborSearchOperationMetadataBuilder_ == null) {
        nearestNeighborSearchOperationMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata, com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.Builder, com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadataOrBuilder>(
                getNearestNeighborSearchOperationMetadata(),
                getParentForChildren(),
                isClean());
        nearestNeighborSearchOperationMetadata_ = null;
      }
      return nearestNeighborSearchOperationMetadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata)
  private static final com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata();
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateIndexOperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<UpdateIndexOperationMetadata>() {
    @java.lang.Override
    public UpdateIndexOperationMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateIndexOperationMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateIndexOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateIndexOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

