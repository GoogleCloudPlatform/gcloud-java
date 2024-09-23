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
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

// Protobuf Java Version: 3.25.4
package io.grafeas.v1beta1.pkg;

/**
 *
 *
 * <pre>
 * This represents a particular package that is distributed over various
 * channels. E.g., glibc (aka libc6) is distributed by many, at various
 * versions.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.package.Package}
 */
public final class Package extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.package.Package)
    PackageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Package.newBuilder() to construct.
  private Package(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Package() {
    name_ = "";
    distribution_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Package();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.pkg.PackageOuterClass
        .internal_static_grafeas_v1beta1_package_Package_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.pkg.PackageOuterClass
        .internal_static_grafeas_v1beta1_package_Package_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.pkg.Package.class, io.grafeas.v1beta1.pkg.Package.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Immutable. The name of the package.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Immutable. The name of the package.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISTRIBUTION_FIELD_NUMBER = 10;

  @SuppressWarnings("serial")
  private java.util.List<io.grafeas.v1beta1.pkg.Distribution> distribution_;
  /**
   *
   *
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
   */
  @java.lang.Override
  public java.util.List<io.grafeas.v1beta1.pkg.Distribution> getDistributionList() {
    return distribution_;
  }
  /**
   *
   *
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grafeas.v1beta1.pkg.DistributionOrBuilder>
      getDistributionOrBuilderList() {
    return distribution_;
  }
  /**
   *
   *
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
   */
  @java.lang.Override
  public int getDistributionCount() {
    return distribution_.size();
  }
  /**
   *
   *
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
   */
  @java.lang.Override
  public io.grafeas.v1beta1.pkg.Distribution getDistribution(int index) {
    return distribution_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
   */
  @java.lang.Override
  public io.grafeas.v1beta1.pkg.DistributionOrBuilder getDistributionOrBuilder(int index) {
    return distribution_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < distribution_.size(); i++) {
      output.writeMessage(10, distribution_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < distribution_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(10, distribution_.get(i));
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
    if (!(obj instanceof io.grafeas.v1beta1.pkg.Package)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.pkg.Package other = (io.grafeas.v1beta1.pkg.Package) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDistributionList().equals(other.getDistributionList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getDistributionCount() > 0) {
      hash = (37 * hash) + DISTRIBUTION_FIELD_NUMBER;
      hash = (53 * hash) + getDistributionList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.pkg.Package parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.pkg.Package parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Package parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.pkg.Package parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Package parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.pkg.Package parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Package parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.pkg.Package parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Package parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.pkg.Package parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Package parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.pkg.Package parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.pkg.Package prototype) {
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
   * This represents a particular package that is distributed over various
   * channels. E.g., glibc (aka libc6) is distributed by many, at various
   * versions.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.package.Package}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.package.Package)
      io.grafeas.v1beta1.pkg.PackageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass
          .internal_static_grafeas_v1beta1_package_Package_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass
          .internal_static_grafeas_v1beta1_package_Package_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.pkg.Package.class, io.grafeas.v1beta1.pkg.Package.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.pkg.Package.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      if (distributionBuilder_ == null) {
        distribution_ = java.util.Collections.emptyList();
      } else {
        distribution_ = null;
        distributionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass
          .internal_static_grafeas_v1beta1_package_Package_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Package getDefaultInstanceForType() {
      return io.grafeas.v1beta1.pkg.Package.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Package build() {
      io.grafeas.v1beta1.pkg.Package result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Package buildPartial() {
      io.grafeas.v1beta1.pkg.Package result = new io.grafeas.v1beta1.pkg.Package(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.grafeas.v1beta1.pkg.Package result) {
      if (distributionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          distribution_ = java.util.Collections.unmodifiableList(distribution_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.distribution_ = distribution_;
      } else {
        result.distribution_ = distributionBuilder_.build();
      }
    }

    private void buildPartial0(io.grafeas.v1beta1.pkg.Package result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
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
      if (other instanceof io.grafeas.v1beta1.pkg.Package) {
        return mergeFrom((io.grafeas.v1beta1.pkg.Package) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.pkg.Package other) {
      if (other == io.grafeas.v1beta1.pkg.Package.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (distributionBuilder_ == null) {
        if (!other.distribution_.isEmpty()) {
          if (distribution_.isEmpty()) {
            distribution_ = other.distribution_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDistributionIsMutable();
            distribution_.addAll(other.distribution_);
          }
          onChanged();
        }
      } else {
        if (!other.distribution_.isEmpty()) {
          if (distributionBuilder_.isEmpty()) {
            distributionBuilder_.dispose();
            distributionBuilder_ = null;
            distribution_ = other.distribution_;
            bitField0_ = (bitField0_ & ~0x00000002);
            distributionBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDistributionFieldBuilder()
                    : null;
          } else {
            distributionBuilder_.addAllMessages(other.distribution_);
          }
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
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 82:
              {
                io.grafeas.v1beta1.pkg.Distribution m =
                    input.readMessage(
                        io.grafeas.v1beta1.pkg.Distribution.parser(), extensionRegistry);
                if (distributionBuilder_ == null) {
                  ensureDistributionIsMutable();
                  distribution_.add(m);
                } else {
                  distributionBuilder_.addMessage(m);
                }
                break;
              } // case 82
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

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the package.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the package.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the package.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the package.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the package.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<io.grafeas.v1beta1.pkg.Distribution> distribution_ =
        java.util.Collections.emptyList();

    private void ensureDistributionIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        distribution_ = new java.util.ArrayList<io.grafeas.v1beta1.pkg.Distribution>(distribution_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1beta1.pkg.Distribution,
            io.grafeas.v1beta1.pkg.Distribution.Builder,
            io.grafeas.v1beta1.pkg.DistributionOrBuilder>
        distributionBuilder_;

    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public java.util.List<io.grafeas.v1beta1.pkg.Distribution> getDistributionList() {
      if (distributionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(distribution_);
      } else {
        return distributionBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public int getDistributionCount() {
      if (distributionBuilder_ == null) {
        return distribution_.size();
      } else {
        return distributionBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public io.grafeas.v1beta1.pkg.Distribution getDistribution(int index) {
      if (distributionBuilder_ == null) {
        return distribution_.get(index);
      } else {
        return distributionBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public Builder setDistribution(int index, io.grafeas.v1beta1.pkg.Distribution value) {
      if (distributionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDistributionIsMutable();
        distribution_.set(index, value);
        onChanged();
      } else {
        distributionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public Builder setDistribution(
        int index, io.grafeas.v1beta1.pkg.Distribution.Builder builderForValue) {
      if (distributionBuilder_ == null) {
        ensureDistributionIsMutable();
        distribution_.set(index, builderForValue.build());
        onChanged();
      } else {
        distributionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public Builder addDistribution(io.grafeas.v1beta1.pkg.Distribution value) {
      if (distributionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDistributionIsMutable();
        distribution_.add(value);
        onChanged();
      } else {
        distributionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public Builder addDistribution(int index, io.grafeas.v1beta1.pkg.Distribution value) {
      if (distributionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDistributionIsMutable();
        distribution_.add(index, value);
        onChanged();
      } else {
        distributionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public Builder addDistribution(io.grafeas.v1beta1.pkg.Distribution.Builder builderForValue) {
      if (distributionBuilder_ == null) {
        ensureDistributionIsMutable();
        distribution_.add(builderForValue.build());
        onChanged();
      } else {
        distributionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public Builder addDistribution(
        int index, io.grafeas.v1beta1.pkg.Distribution.Builder builderForValue) {
      if (distributionBuilder_ == null) {
        ensureDistributionIsMutable();
        distribution_.add(index, builderForValue.build());
        onChanged();
      } else {
        distributionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public Builder addAllDistribution(
        java.lang.Iterable<? extends io.grafeas.v1beta1.pkg.Distribution> values) {
      if (distributionBuilder_ == null) {
        ensureDistributionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, distribution_);
        onChanged();
      } else {
        distributionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public Builder clearDistribution() {
      if (distributionBuilder_ == null) {
        distribution_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        distributionBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public Builder removeDistribution(int index) {
      if (distributionBuilder_ == null) {
        ensureDistributionIsMutable();
        distribution_.remove(index);
        onChanged();
      } else {
        distributionBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public io.grafeas.v1beta1.pkg.Distribution.Builder getDistributionBuilder(int index) {
      return getDistributionFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public io.grafeas.v1beta1.pkg.DistributionOrBuilder getDistributionOrBuilder(int index) {
      if (distributionBuilder_ == null) {
        return distribution_.get(index);
      } else {
        return distributionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public java.util.List<? extends io.grafeas.v1beta1.pkg.DistributionOrBuilder>
        getDistributionOrBuilderList() {
      if (distributionBuilder_ != null) {
        return distributionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(distribution_);
      }
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public io.grafeas.v1beta1.pkg.Distribution.Builder addDistributionBuilder() {
      return getDistributionFieldBuilder()
          .addBuilder(io.grafeas.v1beta1.pkg.Distribution.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public io.grafeas.v1beta1.pkg.Distribution.Builder addDistributionBuilder(int index) {
      return getDistributionFieldBuilder()
          .addBuilder(index, io.grafeas.v1beta1.pkg.Distribution.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    public java.util.List<io.grafeas.v1beta1.pkg.Distribution.Builder>
        getDistributionBuilderList() {
      return getDistributionFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1beta1.pkg.Distribution,
            io.grafeas.v1beta1.pkg.Distribution.Builder,
            io.grafeas.v1beta1.pkg.DistributionOrBuilder>
        getDistributionFieldBuilder() {
      if (distributionBuilder_ == null) {
        distributionBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                io.grafeas.v1beta1.pkg.Distribution,
                io.grafeas.v1beta1.pkg.Distribution.Builder,
                io.grafeas.v1beta1.pkg.DistributionOrBuilder>(
                distribution_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        distribution_ = null;
      }
      return distributionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.package.Package)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Package)
  private static final io.grafeas.v1beta1.pkg.Package DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.pkg.Package();
  }

  public static io.grafeas.v1beta1.pkg.Package getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Package> PARSER =
      new com.google.protobuf.AbstractParser<Package>() {
        @java.lang.Override
        public Package parsePartialFrom(
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

  public static com.google.protobuf.Parser<Package> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Package> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.pkg.Package getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
