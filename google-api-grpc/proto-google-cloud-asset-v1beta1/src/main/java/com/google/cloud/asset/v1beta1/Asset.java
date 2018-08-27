// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1beta1/assets.proto

package com.google.cloud.asset.v1beta1;

/**
 * <pre>
 * Cloud asset. This include all Google Cloud Platform resources, as well as
 * IAM policies and other non-GCP assets.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1beta1.Asset}
 */
public  final class Asset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1beta1.Asset)
    AssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Asset.newBuilder() to construct.
  private Asset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Asset() {
    name_ = "";
    assetType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Asset(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            assetType_ = s;
            break;
          }
          case 26: {
            com.google.cloud.asset.v1beta1.Resource.Builder subBuilder = null;
            if (resource_ != null) {
              subBuilder = resource_.toBuilder();
            }
            resource_ = input.readMessage(com.google.cloud.asset.v1beta1.Resource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resource_);
              resource_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.google.iam.v1.Policy.Builder subBuilder = null;
            if (iamPolicy_ != null) {
              subBuilder = iamPolicy_.toBuilder();
            }
            iamPolicy_ = input.readMessage(com.google.iam.v1.Policy.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(iamPolicy_);
              iamPolicy_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
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
    return com.google.cloud.asset.v1beta1.AssetProto.internal_static_google_cloud_asset_v1beta1_Asset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1beta1.AssetProto.internal_static_google_cloud_asset_v1beta1_Asset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1beta1.Asset.class, com.google.cloud.asset.v1beta1.Asset.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The full name of the asset. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * Example:
   * "//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The full name of the asset. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * Example:
   * "//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object assetType_;
  /**
   * <pre>
   * Type of the asset. Example: "google.compute.disk".
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   */
  public java.lang.String getAssetType() {
    java.lang.Object ref = assetType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Type of the asset. Example: "google.compute.disk".
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAssetTypeBytes() {
    java.lang.Object ref = assetType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 3;
  private com.google.cloud.asset.v1beta1.Resource resource_;
  /**
   * <pre>
   * Representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
   */
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <pre>
   * Representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
   */
  public com.google.cloud.asset.v1beta1.Resource getResource() {
    return resource_ == null ? com.google.cloud.asset.v1beta1.Resource.getDefaultInstance() : resource_;
  }
  /**
   * <pre>
   * Representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
   */
  public com.google.cloud.asset.v1beta1.ResourceOrBuilder getResourceOrBuilder() {
    return getResource();
  }

  public static final int IAM_POLICY_FIELD_NUMBER = 4;
  private com.google.iam.v1.Policy iamPolicy_;
  /**
   * <pre>
   * Representation of the actual IAM policy set on a cloud resource. For each
   * resource, there must be at most one IAM policy set on it.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   */
  public boolean hasIamPolicy() {
    return iamPolicy_ != null;
  }
  /**
   * <pre>
   * Representation of the actual IAM policy set on a cloud resource. For each
   * resource, there must be at most one IAM policy set on it.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   */
  public com.google.iam.v1.Policy getIamPolicy() {
    return iamPolicy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : iamPolicy_;
  }
  /**
   * <pre>
   * Representation of the actual IAM policy set on a cloud resource. For each
   * resource, there must be at most one IAM policy set on it.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   */
  public com.google.iam.v1.PolicyOrBuilder getIamPolicyOrBuilder() {
    return getIamPolicy();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getAssetTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, assetType_);
    }
    if (resource_ != null) {
      output.writeMessage(3, getResource());
    }
    if (iamPolicy_ != null) {
      output.writeMessage(4, getIamPolicy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getAssetTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, assetType_);
    }
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResource());
    }
    if (iamPolicy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getIamPolicy());
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
    if (!(obj instanceof com.google.cloud.asset.v1beta1.Asset)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1beta1.Asset other = (com.google.cloud.asset.v1beta1.Asset) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getAssetType()
        .equals(other.getAssetType());
    result = result && (hasResource() == other.hasResource());
    if (hasResource()) {
      result = result && getResource()
          .equals(other.getResource());
    }
    result = result && (hasIamPolicy() == other.hasIamPolicy());
    if (hasIamPolicy()) {
      result = result && getIamPolicy()
          .equals(other.getIamPolicy());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ASSET_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAssetType().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    if (hasIamPolicy()) {
      hash = (37 * hash) + IAM_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getIamPolicy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1beta1.Asset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1beta1.Asset parseFrom(
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
  public static Builder newBuilder(com.google.cloud.asset.v1beta1.Asset prototype) {
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
   * Cloud asset. This include all Google Cloud Platform resources, as well as
   * IAM policies and other non-GCP assets.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1beta1.Asset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1beta1.Asset)
      com.google.cloud.asset.v1beta1.AssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.asset.v1beta1.AssetProto.internal_static_google_cloud_asset_v1beta1_Asset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1beta1.AssetProto.internal_static_google_cloud_asset_v1beta1_Asset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1beta1.Asset.class, com.google.cloud.asset.v1beta1.Asset.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1beta1.Asset.newBuilder()
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
      name_ = "";

      assetType_ = "";

      if (resourceBuilder_ == null) {
        resource_ = null;
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }
      if (iamPolicyBuilder_ == null) {
        iamPolicy_ = null;
      } else {
        iamPolicy_ = null;
        iamPolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.asset.v1beta1.AssetProto.internal_static_google_cloud_asset_v1beta1_Asset_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1beta1.Asset getDefaultInstanceForType() {
      return com.google.cloud.asset.v1beta1.Asset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1beta1.Asset build() {
      com.google.cloud.asset.v1beta1.Asset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1beta1.Asset buildPartial() {
      com.google.cloud.asset.v1beta1.Asset result = new com.google.cloud.asset.v1beta1.Asset(this);
      result.name_ = name_;
      result.assetType_ = assetType_;
      if (resourceBuilder_ == null) {
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
      }
      if (iamPolicyBuilder_ == null) {
        result.iamPolicy_ = iamPolicy_;
      } else {
        result.iamPolicy_ = iamPolicyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.asset.v1beta1.Asset) {
        return mergeFrom((com.google.cloud.asset.v1beta1.Asset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1beta1.Asset other) {
      if (other == com.google.cloud.asset.v1beta1.Asset.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getAssetType().isEmpty()) {
        assetType_ = other.assetType_;
        onChanged();
      }
      if (other.hasResource()) {
        mergeResource(other.getResource());
      }
      if (other.hasIamPolicy()) {
        mergeIamPolicy(other.getIamPolicy());
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
      com.google.cloud.asset.v1beta1.Asset parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.asset.v1beta1.Asset) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The full name of the asset. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * Example:
     * "//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The full name of the asset. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * Example:
     * "//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The full name of the asset. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * Example:
     * "//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The full name of the asset. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * Example:
     * "//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The full name of the asset. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * Example:
     * "//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object assetType_ = "";
    /**
     * <pre>
     * Type of the asset. Example: "google.compute.disk".
     * </pre>
     *
     * <code>string asset_type = 2;</code>
     */
    public java.lang.String getAssetType() {
      java.lang.Object ref = assetType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Type of the asset. Example: "google.compute.disk".
     * </pre>
     *
     * <code>string asset_type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAssetTypeBytes() {
      java.lang.Object ref = assetType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Type of the asset. Example: "google.compute.disk".
     * </pre>
     *
     * <code>string asset_type = 2;</code>
     */
    public Builder setAssetType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      assetType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the asset. Example: "google.compute.disk".
     * </pre>
     *
     * <code>string asset_type = 2;</code>
     */
    public Builder clearAssetType() {
      
      assetType_ = getDefaultInstance().getAssetType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the asset. Example: "google.compute.disk".
     * </pre>
     *
     * <code>string asset_type = 2;</code>
     */
    public Builder setAssetTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      assetType_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.asset.v1beta1.Resource resource_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1beta1.Resource, com.google.cloud.asset.v1beta1.Resource.Builder, com.google.cloud.asset.v1beta1.ResourceOrBuilder> resourceBuilder_;
    /**
     * <pre>
     * Representation of the resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
     */
    public boolean hasResource() {
      return resourceBuilder_ != null || resource_ != null;
    }
    /**
     * <pre>
     * Representation of the resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
     */
    public com.google.cloud.asset.v1beta1.Resource getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.google.cloud.asset.v1beta1.Resource.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Representation of the resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
     */
    public Builder setResource(com.google.cloud.asset.v1beta1.Resource value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
        onChanged();
      } else {
        resourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Representation of the resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
     */
    public Builder setResource(
        com.google.cloud.asset.v1beta1.Resource.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
        onChanged();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Representation of the resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
     */
    public Builder mergeResource(com.google.cloud.asset.v1beta1.Resource value) {
      if (resourceBuilder_ == null) {
        if (resource_ != null) {
          resource_ =
            com.google.cloud.asset.v1beta1.Resource.newBuilder(resource_).mergeFrom(value).buildPartial();
        } else {
          resource_ = value;
        }
        onChanged();
      } else {
        resourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Representation of the resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        resource_ = null;
        onChanged();
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Representation of the resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
     */
    public com.google.cloud.asset.v1beta1.Resource.Builder getResourceBuilder() {
      
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Representation of the resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
     */
    public com.google.cloud.asset.v1beta1.ResourceOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            com.google.cloud.asset.v1beta1.Resource.getDefaultInstance() : resource_;
      }
    }
    /**
     * <pre>
     * Representation of the resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1beta1.Resource, com.google.cloud.asset.v1beta1.Resource.Builder, com.google.cloud.asset.v1beta1.ResourceOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1beta1.Resource, com.google.cloud.asset.v1beta1.Resource.Builder, com.google.cloud.asset.v1beta1.ResourceOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
    }

    private com.google.iam.v1.Policy iamPolicy_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.iam.v1.Policy, com.google.iam.v1.Policy.Builder, com.google.iam.v1.PolicyOrBuilder> iamPolicyBuilder_;
    /**
     * <pre>
     * Representation of the actual IAM policy set on a cloud resource. For each
     * resource, there must be at most one IAM policy set on it.
     * </pre>
     *
     * <code>.google.iam.v1.Policy iam_policy = 4;</code>
     */
    public boolean hasIamPolicy() {
      return iamPolicyBuilder_ != null || iamPolicy_ != null;
    }
    /**
     * <pre>
     * Representation of the actual IAM policy set on a cloud resource. For each
     * resource, there must be at most one IAM policy set on it.
     * </pre>
     *
     * <code>.google.iam.v1.Policy iam_policy = 4;</code>
     */
    public com.google.iam.v1.Policy getIamPolicy() {
      if (iamPolicyBuilder_ == null) {
        return iamPolicy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : iamPolicy_;
      } else {
        return iamPolicyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Representation of the actual IAM policy set on a cloud resource. For each
     * resource, there must be at most one IAM policy set on it.
     * </pre>
     *
     * <code>.google.iam.v1.Policy iam_policy = 4;</code>
     */
    public Builder setIamPolicy(com.google.iam.v1.Policy value) {
      if (iamPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        iamPolicy_ = value;
        onChanged();
      } else {
        iamPolicyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Representation of the actual IAM policy set on a cloud resource. For each
     * resource, there must be at most one IAM policy set on it.
     * </pre>
     *
     * <code>.google.iam.v1.Policy iam_policy = 4;</code>
     */
    public Builder setIamPolicy(
        com.google.iam.v1.Policy.Builder builderForValue) {
      if (iamPolicyBuilder_ == null) {
        iamPolicy_ = builderForValue.build();
        onChanged();
      } else {
        iamPolicyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Representation of the actual IAM policy set on a cloud resource. For each
     * resource, there must be at most one IAM policy set on it.
     * </pre>
     *
     * <code>.google.iam.v1.Policy iam_policy = 4;</code>
     */
    public Builder mergeIamPolicy(com.google.iam.v1.Policy value) {
      if (iamPolicyBuilder_ == null) {
        if (iamPolicy_ != null) {
          iamPolicy_ =
            com.google.iam.v1.Policy.newBuilder(iamPolicy_).mergeFrom(value).buildPartial();
        } else {
          iamPolicy_ = value;
        }
        onChanged();
      } else {
        iamPolicyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Representation of the actual IAM policy set on a cloud resource. For each
     * resource, there must be at most one IAM policy set on it.
     * </pre>
     *
     * <code>.google.iam.v1.Policy iam_policy = 4;</code>
     */
    public Builder clearIamPolicy() {
      if (iamPolicyBuilder_ == null) {
        iamPolicy_ = null;
        onChanged();
      } else {
        iamPolicy_ = null;
        iamPolicyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Representation of the actual IAM policy set on a cloud resource. For each
     * resource, there must be at most one IAM policy set on it.
     * </pre>
     *
     * <code>.google.iam.v1.Policy iam_policy = 4;</code>
     */
    public com.google.iam.v1.Policy.Builder getIamPolicyBuilder() {
      
      onChanged();
      return getIamPolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Representation of the actual IAM policy set on a cloud resource. For each
     * resource, there must be at most one IAM policy set on it.
     * </pre>
     *
     * <code>.google.iam.v1.Policy iam_policy = 4;</code>
     */
    public com.google.iam.v1.PolicyOrBuilder getIamPolicyOrBuilder() {
      if (iamPolicyBuilder_ != null) {
        return iamPolicyBuilder_.getMessageOrBuilder();
      } else {
        return iamPolicy_ == null ?
            com.google.iam.v1.Policy.getDefaultInstance() : iamPolicy_;
      }
    }
    /**
     * <pre>
     * Representation of the actual IAM policy set on a cloud resource. For each
     * resource, there must be at most one IAM policy set on it.
     * </pre>
     *
     * <code>.google.iam.v1.Policy iam_policy = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.iam.v1.Policy, com.google.iam.v1.Policy.Builder, com.google.iam.v1.PolicyOrBuilder> 
        getIamPolicyFieldBuilder() {
      if (iamPolicyBuilder_ == null) {
        iamPolicyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v1.Policy, com.google.iam.v1.Policy.Builder, com.google.iam.v1.PolicyOrBuilder>(
                getIamPolicy(),
                getParentForChildren(),
                isClean());
        iamPolicy_ = null;
      }
      return iamPolicyBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1beta1.Asset)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1beta1.Asset)
  private static final com.google.cloud.asset.v1beta1.Asset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1beta1.Asset();
  }

  public static com.google.cloud.asset.v1beta1.Asset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Asset>
      PARSER = new com.google.protobuf.AbstractParser<Asset>() {
    @java.lang.Override
    public Asset parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Asset(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Asset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Asset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1beta1.Asset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

