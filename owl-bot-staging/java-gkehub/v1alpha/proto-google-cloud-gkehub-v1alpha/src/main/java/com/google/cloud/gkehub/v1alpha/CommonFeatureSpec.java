// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/feature.proto

package com.google.cloud.gkehub.v1alpha;

/**
 * <pre>
 * CommonFeatureSpec contains Hub-wide configuration information
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1alpha.CommonFeatureSpec}
 */
public final class CommonFeatureSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1alpha.CommonFeatureSpec)
    CommonFeatureSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommonFeatureSpec.newBuilder() to construct.
  private CommonFeatureSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommonFeatureSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommonFeatureSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.v1alpha.FeatureProto.internal_static_google_cloud_gkehub_v1alpha_CommonFeatureSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1alpha.FeatureProto.internal_static_google_cloud_gkehub_v1alpha_CommonFeatureSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1alpha.CommonFeatureSpec.class, com.google.cloud.gkehub.v1alpha.CommonFeatureSpec.Builder.class);
  }

  private int featureSpecCase_ = 0;
  private java.lang.Object featureSpec_;
  public enum FeatureSpecCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MULTICLUSTERINGRESS(102),
    CLOUDAUDITLOGGING(108),
    FEATURESPEC_NOT_SET(0);
    private final int value;
    private FeatureSpecCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FeatureSpecCase valueOf(int value) {
      return forNumber(value);
    }

    public static FeatureSpecCase forNumber(int value) {
      switch (value) {
        case 102: return MULTICLUSTERINGRESS;
        case 108: return CLOUDAUDITLOGGING;
        case 0: return FEATURESPEC_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FeatureSpecCase
  getFeatureSpecCase() {
    return FeatureSpecCase.forNumber(
        featureSpecCase_);
  }

  public static final int MULTICLUSTERINGRESS_FIELD_NUMBER = 102;
  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
   * @return Whether the multiclusteringress field is set.
   */
  @java.lang.Override
  public boolean hasMulticlusteringress() {
    return featureSpecCase_ == 102;
  }
  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
   * @return The multiclusteringress.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec getMulticlusteringress() {
    if (featureSpecCase_ == 102) {
       return (com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec) featureSpec_;
    }
    return com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.getDefaultInstance();
  }
  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpecOrBuilder getMulticlusteringressOrBuilder() {
    if (featureSpecCase_ == 102) {
       return (com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec) featureSpec_;
    }
    return com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.getDefaultInstance();
  }

  public static final int CLOUDAUDITLOGGING_FIELD_NUMBER = 108;
  /**
   * <pre>
   * Cloud Audit Logging-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
   * @return Whether the cloudauditlogging field is set.
   */
  @java.lang.Override
  public boolean hasCloudauditlogging() {
    return featureSpecCase_ == 108;
  }
  /**
   * <pre>
   * Cloud Audit Logging-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
   * @return The cloudauditlogging.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec getCloudauditlogging() {
    if (featureSpecCase_ == 108) {
       return (com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec) featureSpec_;
    }
    return com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.getDefaultInstance();
  }
  /**
   * <pre>
   * Cloud Audit Logging-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpecOrBuilder getCloudauditloggingOrBuilder() {
    if (featureSpecCase_ == 108) {
       return (com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec) featureSpec_;
    }
    return com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.getDefaultInstance();
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
    if (featureSpecCase_ == 102) {
      output.writeMessage(102, (com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec) featureSpec_);
    }
    if (featureSpecCase_ == 108) {
      output.writeMessage(108, (com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec) featureSpec_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (featureSpecCase_ == 102) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(102, (com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec) featureSpec_);
    }
    if (featureSpecCase_ == 108) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(108, (com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec) featureSpec_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1alpha.CommonFeatureSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1alpha.CommonFeatureSpec other = (com.google.cloud.gkehub.v1alpha.CommonFeatureSpec) obj;

    if (!getFeatureSpecCase().equals(other.getFeatureSpecCase())) return false;
    switch (featureSpecCase_) {
      case 102:
        if (!getMulticlusteringress()
            .equals(other.getMulticlusteringress())) return false;
        break;
      case 108:
        if (!getCloudauditlogging()
            .equals(other.getCloudauditlogging())) return false;
        break;
      case 0:
      default:
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
    switch (featureSpecCase_) {
      case 102:
        hash = (37 * hash) + MULTICLUSTERINGRESS_FIELD_NUMBER;
        hash = (53 * hash) + getMulticlusteringress().hashCode();
        break;
      case 108:
        hash = (37 * hash) + CLOUDAUDITLOGGING_FIELD_NUMBER;
        hash = (53 * hash) + getCloudauditlogging().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.v1alpha.CommonFeatureSpec prototype) {
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
   * CommonFeatureSpec contains Hub-wide configuration information
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1alpha.CommonFeatureSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1alpha.CommonFeatureSpec)
      com.google.cloud.gkehub.v1alpha.CommonFeatureSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.v1alpha.FeatureProto.internal_static_google_cloud_gkehub_v1alpha_CommonFeatureSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1alpha.FeatureProto.internal_static_google_cloud_gkehub_v1alpha_CommonFeatureSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1alpha.CommonFeatureSpec.class, com.google.cloud.gkehub.v1alpha.CommonFeatureSpec.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1alpha.CommonFeatureSpec.newBuilder()
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
      if (multiclusteringressBuilder_ != null) {
        multiclusteringressBuilder_.clear();
      }
      if (cloudauditloggingBuilder_ != null) {
        cloudauditloggingBuilder_.clear();
      }
      featureSpecCase_ = 0;
      featureSpec_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.v1alpha.FeatureProto.internal_static_google_cloud_gkehub_v1alpha_CommonFeatureSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha.CommonFeatureSpec getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1alpha.CommonFeatureSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha.CommonFeatureSpec build() {
      com.google.cloud.gkehub.v1alpha.CommonFeatureSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha.CommonFeatureSpec buildPartial() {
      com.google.cloud.gkehub.v1alpha.CommonFeatureSpec result = new com.google.cloud.gkehub.v1alpha.CommonFeatureSpec(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1alpha.CommonFeatureSpec result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.gkehub.v1alpha.CommonFeatureSpec result) {
      result.featureSpecCase_ = featureSpecCase_;
      result.featureSpec_ = this.featureSpec_;
      if (featureSpecCase_ == 102 &&
          multiclusteringressBuilder_ != null) {
        result.featureSpec_ = multiclusteringressBuilder_.build();
      }
      if (featureSpecCase_ == 108 &&
          cloudauditloggingBuilder_ != null) {
        result.featureSpec_ = cloudauditloggingBuilder_.build();
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
      if (other instanceof com.google.cloud.gkehub.v1alpha.CommonFeatureSpec) {
        return mergeFrom((com.google.cloud.gkehub.v1alpha.CommonFeatureSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1alpha.CommonFeatureSpec other) {
      if (other == com.google.cloud.gkehub.v1alpha.CommonFeatureSpec.getDefaultInstance()) return this;
      switch (other.getFeatureSpecCase()) {
        case MULTICLUSTERINGRESS: {
          mergeMulticlusteringress(other.getMulticlusteringress());
          break;
        }
        case CLOUDAUDITLOGGING: {
          mergeCloudauditlogging(other.getCloudauditlogging());
          break;
        }
        case FEATURESPEC_NOT_SET: {
          break;
        }
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
            case 818: {
              input.readMessage(
                  getMulticlusteringressFieldBuilder().getBuilder(),
                  extensionRegistry);
              featureSpecCase_ = 102;
              break;
            } // case 818
            case 866: {
              input.readMessage(
                  getCloudauditloggingFieldBuilder().getBuilder(),
                  extensionRegistry);
              featureSpecCase_ = 108;
              break;
            } // case 866
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
    private int featureSpecCase_ = 0;
    private java.lang.Object featureSpec_;
    public FeatureSpecCase
        getFeatureSpecCase() {
      return FeatureSpecCase.forNumber(
          featureSpecCase_);
    }

    public Builder clearFeatureSpec() {
      featureSpecCase_ = 0;
      featureSpec_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec, com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.Builder, com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpecOrBuilder> multiclusteringressBuilder_;
    /**
     * <pre>
     * Multicluster Ingress-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
     * @return Whether the multiclusteringress field is set.
     */
    @java.lang.Override
    public boolean hasMulticlusteringress() {
      return featureSpecCase_ == 102;
    }
    /**
     * <pre>
     * Multicluster Ingress-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
     * @return The multiclusteringress.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec getMulticlusteringress() {
      if (multiclusteringressBuilder_ == null) {
        if (featureSpecCase_ == 102) {
          return (com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec) featureSpec_;
        }
        return com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.getDefaultInstance();
      } else {
        if (featureSpecCase_ == 102) {
          return multiclusteringressBuilder_.getMessage();
        }
        return com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Multicluster Ingress-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
     */
    public Builder setMulticlusteringress(com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec value) {
      if (multiclusteringressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featureSpec_ = value;
        onChanged();
      } else {
        multiclusteringressBuilder_.setMessage(value);
      }
      featureSpecCase_ = 102;
      return this;
    }
    /**
     * <pre>
     * Multicluster Ingress-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
     */
    public Builder setMulticlusteringress(
        com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.Builder builderForValue) {
      if (multiclusteringressBuilder_ == null) {
        featureSpec_ = builderForValue.build();
        onChanged();
      } else {
        multiclusteringressBuilder_.setMessage(builderForValue.build());
      }
      featureSpecCase_ = 102;
      return this;
    }
    /**
     * <pre>
     * Multicluster Ingress-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
     */
    public Builder mergeMulticlusteringress(com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec value) {
      if (multiclusteringressBuilder_ == null) {
        if (featureSpecCase_ == 102 &&
            featureSpec_ != com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.getDefaultInstance()) {
          featureSpec_ = com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.newBuilder((com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec) featureSpec_)
              .mergeFrom(value).buildPartial();
        } else {
          featureSpec_ = value;
        }
        onChanged();
      } else {
        if (featureSpecCase_ == 102) {
          multiclusteringressBuilder_.mergeFrom(value);
        } else {
          multiclusteringressBuilder_.setMessage(value);
        }
      }
      featureSpecCase_ = 102;
      return this;
    }
    /**
     * <pre>
     * Multicluster Ingress-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
     */
    public Builder clearMulticlusteringress() {
      if (multiclusteringressBuilder_ == null) {
        if (featureSpecCase_ == 102) {
          featureSpecCase_ = 0;
          featureSpec_ = null;
          onChanged();
        }
      } else {
        if (featureSpecCase_ == 102) {
          featureSpecCase_ = 0;
          featureSpec_ = null;
        }
        multiclusteringressBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Multicluster Ingress-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
     */
    public com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.Builder getMulticlusteringressBuilder() {
      return getMulticlusteringressFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Multicluster Ingress-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
     */
    @java.lang.Override
    public com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpecOrBuilder getMulticlusteringressOrBuilder() {
      if ((featureSpecCase_ == 102) && (multiclusteringressBuilder_ != null)) {
        return multiclusteringressBuilder_.getMessageOrBuilder();
      } else {
        if (featureSpecCase_ == 102) {
          return (com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec) featureSpec_;
        }
        return com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Multicluster Ingress-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec, com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.Builder, com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpecOrBuilder> 
        getMulticlusteringressFieldBuilder() {
      if (multiclusteringressBuilder_ == null) {
        if (!(featureSpecCase_ == 102)) {
          featureSpec_ = com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.getDefaultInstance();
        }
        multiclusteringressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec, com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec.Builder, com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpecOrBuilder>(
                (com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec) featureSpec_,
                getParentForChildren(),
                isClean());
        featureSpec_ = null;
      }
      featureSpecCase_ = 102;
      onChanged();
      return multiclusteringressBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec, com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.Builder, com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpecOrBuilder> cloudauditloggingBuilder_;
    /**
     * <pre>
     * Cloud Audit Logging-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
     * @return Whether the cloudauditlogging field is set.
     */
    @java.lang.Override
    public boolean hasCloudauditlogging() {
      return featureSpecCase_ == 108;
    }
    /**
     * <pre>
     * Cloud Audit Logging-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
     * @return The cloudauditlogging.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec getCloudauditlogging() {
      if (cloudauditloggingBuilder_ == null) {
        if (featureSpecCase_ == 108) {
          return (com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec) featureSpec_;
        }
        return com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.getDefaultInstance();
      } else {
        if (featureSpecCase_ == 108) {
          return cloudauditloggingBuilder_.getMessage();
        }
        return com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Cloud Audit Logging-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
     */
    public Builder setCloudauditlogging(com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec value) {
      if (cloudauditloggingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featureSpec_ = value;
        onChanged();
      } else {
        cloudauditloggingBuilder_.setMessage(value);
      }
      featureSpecCase_ = 108;
      return this;
    }
    /**
     * <pre>
     * Cloud Audit Logging-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
     */
    public Builder setCloudauditlogging(
        com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.Builder builderForValue) {
      if (cloudauditloggingBuilder_ == null) {
        featureSpec_ = builderForValue.build();
        onChanged();
      } else {
        cloudauditloggingBuilder_.setMessage(builderForValue.build());
      }
      featureSpecCase_ = 108;
      return this;
    }
    /**
     * <pre>
     * Cloud Audit Logging-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
     */
    public Builder mergeCloudauditlogging(com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec value) {
      if (cloudauditloggingBuilder_ == null) {
        if (featureSpecCase_ == 108 &&
            featureSpec_ != com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.getDefaultInstance()) {
          featureSpec_ = com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.newBuilder((com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec) featureSpec_)
              .mergeFrom(value).buildPartial();
        } else {
          featureSpec_ = value;
        }
        onChanged();
      } else {
        if (featureSpecCase_ == 108) {
          cloudauditloggingBuilder_.mergeFrom(value);
        } else {
          cloudauditloggingBuilder_.setMessage(value);
        }
      }
      featureSpecCase_ = 108;
      return this;
    }
    /**
     * <pre>
     * Cloud Audit Logging-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
     */
    public Builder clearCloudauditlogging() {
      if (cloudauditloggingBuilder_ == null) {
        if (featureSpecCase_ == 108) {
          featureSpecCase_ = 0;
          featureSpec_ = null;
          onChanged();
        }
      } else {
        if (featureSpecCase_ == 108) {
          featureSpecCase_ = 0;
          featureSpec_ = null;
        }
        cloudauditloggingBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Cloud Audit Logging-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
     */
    public com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.Builder getCloudauditloggingBuilder() {
      return getCloudauditloggingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Cloud Audit Logging-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
     */
    @java.lang.Override
    public com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpecOrBuilder getCloudauditloggingOrBuilder() {
      if ((featureSpecCase_ == 108) && (cloudauditloggingBuilder_ != null)) {
        return cloudauditloggingBuilder_.getMessageOrBuilder();
      } else {
        if (featureSpecCase_ == 108) {
          return (com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec) featureSpec_;
        }
        return com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Cloud Audit Logging-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec, com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.Builder, com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpecOrBuilder> 
        getCloudauditloggingFieldBuilder() {
      if (cloudauditloggingBuilder_ == null) {
        if (!(featureSpecCase_ == 108)) {
          featureSpec_ = com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.getDefaultInstance();
        }
        cloudauditloggingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec, com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.Builder, com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpecOrBuilder>(
                (com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec) featureSpec_,
                getParentForChildren(),
                isClean());
        featureSpec_ = null;
      }
      featureSpecCase_ = 108;
      onChanged();
      return cloudauditloggingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1alpha.CommonFeatureSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.CommonFeatureSpec)
  private static final com.google.cloud.gkehub.v1alpha.CommonFeatureSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1alpha.CommonFeatureSpec();
  }

  public static com.google.cloud.gkehub.v1alpha.CommonFeatureSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommonFeatureSpec>
      PARSER = new com.google.protobuf.AbstractParser<CommonFeatureSpec>() {
    @java.lang.Override
    public CommonFeatureSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommonFeatureSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommonFeatureSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1alpha.CommonFeatureSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

