/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1/feature.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.v1;

/**
 *
 *
 * <pre>
 * MembershipFeatureSpec contains configuration information for a single
 * Membership.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1.MembershipFeatureSpec}
 */
public final class MembershipFeatureSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1.MembershipFeatureSpec)
    MembershipFeatureSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MembershipFeatureSpec.newBuilder() to construct.
  private MembershipFeatureSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MembershipFeatureSpec() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MembershipFeatureSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1.FeatureProto
        .internal_static_google_cloud_gkehub_v1_MembershipFeatureSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1.FeatureProto
        .internal_static_google_cloud_gkehub_v1_MembershipFeatureSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1.MembershipFeatureSpec.class,
            com.google.cloud.gkehub.v1.MembershipFeatureSpec.Builder.class);
  }

  private int featureSpecCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object featureSpec_;

  public enum FeatureSpecCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONFIGMANAGEMENT(106),
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
        case 106:
          return CONFIGMANAGEMENT;
        case 0:
          return FEATURESPEC_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public FeatureSpecCase getFeatureSpecCase() {
    return FeatureSpecCase.forNumber(featureSpecCase_);
  }

  public static final int CONFIGMANAGEMENT_FIELD_NUMBER = 106;
  /**
   *
   *
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
   *
   * @return Whether the configmanagement field is set.
   */
  @java.lang.Override
  public boolean hasConfigmanagement() {
    return featureSpecCase_ == 106;
  }
  /**
   *
   *
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
   *
   * @return The configmanagement.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.MembershipSpec getConfigmanagement() {
    if (featureSpecCase_ == 106) {
      return (com.google.cloud.gkehub.configmanagement.v1.MembershipSpec) featureSpec_;
    }
    return com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.MembershipSpecOrBuilder
      getConfigmanagementOrBuilder() {
    if (featureSpecCase_ == 106) {
      return (com.google.cloud.gkehub.configmanagement.v1.MembershipSpec) featureSpec_;
    }
    return com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.getDefaultInstance();
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
    if (featureSpecCase_ == 106) {
      output.writeMessage(
          106, (com.google.cloud.gkehub.configmanagement.v1.MembershipSpec) featureSpec_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (featureSpecCase_ == 106) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              106, (com.google.cloud.gkehub.configmanagement.v1.MembershipSpec) featureSpec_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1.MembershipFeatureSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1.MembershipFeatureSpec other =
        (com.google.cloud.gkehub.v1.MembershipFeatureSpec) obj;

    if (!getFeatureSpecCase().equals(other.getFeatureSpecCase())) return false;
    switch (featureSpecCase_) {
      case 106:
        if (!getConfigmanagement().equals(other.getConfigmanagement())) return false;
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
      case 106:
        hash = (37 * hash) + CONFIGMANAGEMENT_FIELD_NUMBER;
        hash = (53 * hash) + getConfigmanagement().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkehub.v1.MembershipFeatureSpec prototype) {
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
   * MembershipFeatureSpec contains configuration information for a single
   * Membership.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1.MembershipFeatureSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1.MembershipFeatureSpec)
      com.google.cloud.gkehub.v1.MembershipFeatureSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_MembershipFeatureSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_MembershipFeatureSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1.MembershipFeatureSpec.class,
              com.google.cloud.gkehub.v1.MembershipFeatureSpec.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1.MembershipFeatureSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (configmanagementBuilder_ != null) {
        configmanagementBuilder_.clear();
      }
      featureSpecCase_ = 0;
      featureSpec_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_MembershipFeatureSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.MembershipFeatureSpec getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1.MembershipFeatureSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.MembershipFeatureSpec build() {
      com.google.cloud.gkehub.v1.MembershipFeatureSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.MembershipFeatureSpec buildPartial() {
      com.google.cloud.gkehub.v1.MembershipFeatureSpec result =
          new com.google.cloud.gkehub.v1.MembershipFeatureSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1.MembershipFeatureSpec result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.gkehub.v1.MembershipFeatureSpec result) {
      result.featureSpecCase_ = featureSpecCase_;
      result.featureSpec_ = this.featureSpec_;
      if (featureSpecCase_ == 106 && configmanagementBuilder_ != null) {
        result.featureSpec_ = configmanagementBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.gkehub.v1.MembershipFeatureSpec) {
        return mergeFrom((com.google.cloud.gkehub.v1.MembershipFeatureSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1.MembershipFeatureSpec other) {
      if (other == com.google.cloud.gkehub.v1.MembershipFeatureSpec.getDefaultInstance())
        return this;
      switch (other.getFeatureSpecCase()) {
        case CONFIGMANAGEMENT:
          {
            mergeConfigmanagement(other.getConfigmanagement());
            break;
          }
        case FEATURESPEC_NOT_SET:
          {
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
            case 850:
              {
                input.readMessage(
                    getConfigmanagementFieldBuilder().getBuilder(), extensionRegistry);
                featureSpecCase_ = 106;
                break;
              } // case 850
            default:
              {
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

    public FeatureSpecCase getFeatureSpecCase() {
      return FeatureSpecCase.forNumber(featureSpecCase_);
    }

    public Builder clearFeatureSpec() {
      featureSpecCase_ = 0;
      featureSpec_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1.MembershipSpec,
            com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.Builder,
            com.google.cloud.gkehub.configmanagement.v1.MembershipSpecOrBuilder>
        configmanagementBuilder_;
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
     *
     * @return Whether the configmanagement field is set.
     */
    @java.lang.Override
    public boolean hasConfigmanagement() {
      return featureSpecCase_ == 106;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
     *
     * @return The configmanagement.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.MembershipSpec getConfigmanagement() {
      if (configmanagementBuilder_ == null) {
        if (featureSpecCase_ == 106) {
          return (com.google.cloud.gkehub.configmanagement.v1.MembershipSpec) featureSpec_;
        }
        return com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.getDefaultInstance();
      } else {
        if (featureSpecCase_ == 106) {
          return configmanagementBuilder_.getMessage();
        }
        return com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
     */
    public Builder setConfigmanagement(
        com.google.cloud.gkehub.configmanagement.v1.MembershipSpec value) {
      if (configmanagementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featureSpec_ = value;
        onChanged();
      } else {
        configmanagementBuilder_.setMessage(value);
      }
      featureSpecCase_ = 106;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
     */
    public Builder setConfigmanagement(
        com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.Builder builderForValue) {
      if (configmanagementBuilder_ == null) {
        featureSpec_ = builderForValue.build();
        onChanged();
      } else {
        configmanagementBuilder_.setMessage(builderForValue.build());
      }
      featureSpecCase_ = 106;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
     */
    public Builder mergeConfigmanagement(
        com.google.cloud.gkehub.configmanagement.v1.MembershipSpec value) {
      if (configmanagementBuilder_ == null) {
        if (featureSpecCase_ == 106
            && featureSpec_
                != com.google.cloud.gkehub.configmanagement.v1.MembershipSpec
                    .getDefaultInstance()) {
          featureSpec_ =
              com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.newBuilder(
                      (com.google.cloud.gkehub.configmanagement.v1.MembershipSpec) featureSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          featureSpec_ = value;
        }
        onChanged();
      } else {
        if (featureSpecCase_ == 106) {
          configmanagementBuilder_.mergeFrom(value);
        } else {
          configmanagementBuilder_.setMessage(value);
        }
      }
      featureSpecCase_ = 106;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
     */
    public Builder clearConfigmanagement() {
      if (configmanagementBuilder_ == null) {
        if (featureSpecCase_ == 106) {
          featureSpecCase_ = 0;
          featureSpec_ = null;
          onChanged();
        }
      } else {
        if (featureSpecCase_ == 106) {
          featureSpecCase_ = 0;
          featureSpec_ = null;
        }
        configmanagementBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.Builder
        getConfigmanagementBuilder() {
      return getConfigmanagementFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.MembershipSpecOrBuilder
        getConfigmanagementOrBuilder() {
      if ((featureSpecCase_ == 106) && (configmanagementBuilder_ != null)) {
        return configmanagementBuilder_.getMessageOrBuilder();
      } else {
        if (featureSpecCase_ == 106) {
          return (com.google.cloud.gkehub.configmanagement.v1.MembershipSpec) featureSpec_;
        }
        return com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1.MembershipSpec,
            com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.Builder,
            com.google.cloud.gkehub.configmanagement.v1.MembershipSpecOrBuilder>
        getConfigmanagementFieldBuilder() {
      if (configmanagementBuilder_ == null) {
        if (!(featureSpecCase_ == 106)) {
          featureSpec_ =
              com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.getDefaultInstance();
        }
        configmanagementBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.configmanagement.v1.MembershipSpec,
                com.google.cloud.gkehub.configmanagement.v1.MembershipSpec.Builder,
                com.google.cloud.gkehub.configmanagement.v1.MembershipSpecOrBuilder>(
                (com.google.cloud.gkehub.configmanagement.v1.MembershipSpec) featureSpec_,
                getParentForChildren(),
                isClean());
        featureSpec_ = null;
      }
      featureSpecCase_ = 106;
      onChanged();
      return configmanagementBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1.MembershipFeatureSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.MembershipFeatureSpec)
  private static final com.google.cloud.gkehub.v1.MembershipFeatureSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1.MembershipFeatureSpec();
  }

  public static com.google.cloud.gkehub.v1.MembershipFeatureSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MembershipFeatureSpec> PARSER =
      new com.google.protobuf.AbstractParser<MembershipFeatureSpec>() {
        @java.lang.Override
        public MembershipFeatureSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<MembershipFeatureSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MembershipFeatureSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1.MembershipFeatureSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
