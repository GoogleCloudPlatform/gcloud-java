// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

package io.grafeas.v1beta1.pkg;

/**
 * <pre>
 * This represents how a particular software package may be installed on a
 * system.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.package.Installation}
 */
public  final class Installation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.package.Installation)
    InstallationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Installation.newBuilder() to construct.
  private Installation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Installation() {
    name_ = "";
    location_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Installation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              location_ = new java.util.ArrayList<io.grafeas.v1beta1.pkg.Location>();
              mutable_bitField0_ |= 0x00000002;
            }
            location_.add(
                input.readMessage(io.grafeas.v1beta1.pkg.Location.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        location_ = java.util.Collections.unmodifiableList(location_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1beta1.pkg.PackageOuterClass.internal_static_grafeas_v1beta1_package_Installation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.pkg.PackageOuterClass.internal_static_grafeas_v1beta1_package_Installation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.pkg.Installation.class, io.grafeas.v1beta1.pkg.Installation.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Output only. The name of the installed package.
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
   * Output only. The name of the installed package.
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

  public static final int LOCATION_FIELD_NUMBER = 2;
  private java.util.List<io.grafeas.v1beta1.pkg.Location> location_;
  /**
   * <pre>
   * All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
   */
  public java.util.List<io.grafeas.v1beta1.pkg.Location> getLocationList() {
    return location_;
  }
  /**
   * <pre>
   * All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
   */
  public java.util.List<? extends io.grafeas.v1beta1.pkg.LocationOrBuilder> 
      getLocationOrBuilderList() {
    return location_;
  }
  /**
   * <pre>
   * All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
   */
  public int getLocationCount() {
    return location_.size();
  }
  /**
   * <pre>
   * All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
   */
  public io.grafeas.v1beta1.pkg.Location getLocation(int index) {
    return location_.get(index);
  }
  /**
   * <pre>
   * All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
   */
  public io.grafeas.v1beta1.pkg.LocationOrBuilder getLocationOrBuilder(
      int index) {
    return location_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < location_.size(); i++) {
      output.writeMessage(2, location_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < location_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, location_.get(i));
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
    if (!(obj instanceof io.grafeas.v1beta1.pkg.Installation)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.pkg.Installation other = (io.grafeas.v1beta1.pkg.Installation) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getLocationList()
        .equals(other.getLocationList());
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
    if (getLocationCount() > 0) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocationList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.pkg.Installation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.pkg.Installation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grafeas.v1beta1.pkg.Installation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * This represents how a particular software package may be installed on a
   * system.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.package.Installation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.package.Installation)
      io.grafeas.v1beta1.pkg.InstallationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass.internal_static_grafeas_v1beta1_package_Installation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass.internal_static_grafeas_v1beta1_package_Installation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.pkg.Installation.class, io.grafeas.v1beta1.pkg.Installation.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.pkg.Installation.newBuilder()
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
        getLocationFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      if (locationBuilder_ == null) {
        location_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        locationBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass.internal_static_grafeas_v1beta1_package_Installation_descriptor;
    }

    public io.grafeas.v1beta1.pkg.Installation getDefaultInstanceForType() {
      return io.grafeas.v1beta1.pkg.Installation.getDefaultInstance();
    }

    public io.grafeas.v1beta1.pkg.Installation build() {
      io.grafeas.v1beta1.pkg.Installation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grafeas.v1beta1.pkg.Installation buildPartial() {
      io.grafeas.v1beta1.pkg.Installation result = new io.grafeas.v1beta1.pkg.Installation(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (locationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          location_ = java.util.Collections.unmodifiableList(location_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.pkg.Installation) {
        return mergeFrom((io.grafeas.v1beta1.pkg.Installation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.pkg.Installation other) {
      if (other == io.grafeas.v1beta1.pkg.Installation.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (locationBuilder_ == null) {
        if (!other.location_.isEmpty()) {
          if (location_.isEmpty()) {
            location_ = other.location_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLocationIsMutable();
            location_.addAll(other.location_);
          }
          onChanged();
        }
      } else {
        if (!other.location_.isEmpty()) {
          if (locationBuilder_.isEmpty()) {
            locationBuilder_.dispose();
            locationBuilder_ = null;
            location_ = other.location_;
            bitField0_ = (bitField0_ & ~0x00000002);
            locationBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLocationFieldBuilder() : null;
          } else {
            locationBuilder_.addAllMessages(other.location_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grafeas.v1beta1.pkg.Installation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.pkg.Installation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Output only. The name of the installed package.
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
     * Output only. The name of the installed package.
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
     * Output only. The name of the installed package.
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
     * Output only. The name of the installed package.
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
     * Output only. The name of the installed package.
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

    private java.util.List<io.grafeas.v1beta1.pkg.Location> location_ =
      java.util.Collections.emptyList();
    private void ensureLocationIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        location_ = new java.util.ArrayList<io.grafeas.v1beta1.pkg.Location>(location_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grafeas.v1beta1.pkg.Location, io.grafeas.v1beta1.pkg.Location.Builder, io.grafeas.v1beta1.pkg.LocationOrBuilder> locationBuilder_;

    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public java.util.List<io.grafeas.v1beta1.pkg.Location> getLocationList() {
      if (locationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(location_);
      } else {
        return locationBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public int getLocationCount() {
      if (locationBuilder_ == null) {
        return location_.size();
      } else {
        return locationBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public io.grafeas.v1beta1.pkg.Location getLocation(int index) {
      if (locationBuilder_ == null) {
        return location_.get(index);
      } else {
        return locationBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public Builder setLocation(
        int index, io.grafeas.v1beta1.pkg.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationIsMutable();
        location_.set(index, value);
        onChanged();
      } else {
        locationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public Builder setLocation(
        int index, io.grafeas.v1beta1.pkg.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        ensureLocationIsMutable();
        location_.set(index, builderForValue.build());
        onChanged();
      } else {
        locationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public Builder addLocation(io.grafeas.v1beta1.pkg.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationIsMutable();
        location_.add(value);
        onChanged();
      } else {
        locationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public Builder addLocation(
        int index, io.grafeas.v1beta1.pkg.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationIsMutable();
        location_.add(index, value);
        onChanged();
      } else {
        locationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public Builder addLocation(
        io.grafeas.v1beta1.pkg.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        ensureLocationIsMutable();
        location_.add(builderForValue.build());
        onChanged();
      } else {
        locationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public Builder addLocation(
        int index, io.grafeas.v1beta1.pkg.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        ensureLocationIsMutable();
        location_.add(index, builderForValue.build());
        onChanged();
      } else {
        locationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public Builder addAllLocation(
        java.lang.Iterable<? extends io.grafeas.v1beta1.pkg.Location> values) {
      if (locationBuilder_ == null) {
        ensureLocationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, location_);
        onChanged();
      } else {
        locationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        locationBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public Builder removeLocation(int index) {
      if (locationBuilder_ == null) {
        ensureLocationIsMutable();
        location_.remove(index);
        onChanged();
      } else {
        locationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public io.grafeas.v1beta1.pkg.Location.Builder getLocationBuilder(
        int index) {
      return getLocationFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public io.grafeas.v1beta1.pkg.LocationOrBuilder getLocationOrBuilder(
        int index) {
      if (locationBuilder_ == null) {
        return location_.get(index);  } else {
        return locationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public java.util.List<? extends io.grafeas.v1beta1.pkg.LocationOrBuilder> 
         getLocationOrBuilderList() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(location_);
      }
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public io.grafeas.v1beta1.pkg.Location.Builder addLocationBuilder() {
      return getLocationFieldBuilder().addBuilder(
          io.grafeas.v1beta1.pkg.Location.getDefaultInstance());
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public io.grafeas.v1beta1.pkg.Location.Builder addLocationBuilder(
        int index) {
      return getLocationFieldBuilder().addBuilder(
          index, io.grafeas.v1beta1.pkg.Location.getDefaultInstance());
    }
    /**
     * <pre>
     * All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.package.Location location = 2;</code>
     */
    public java.util.List<io.grafeas.v1beta1.pkg.Location.Builder> 
         getLocationBuilderList() {
      return getLocationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grafeas.v1beta1.pkg.Location, io.grafeas.v1beta1.pkg.Location.Builder, io.grafeas.v1beta1.pkg.LocationOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1beta1.pkg.Location, io.grafeas.v1beta1.pkg.Location.Builder, io.grafeas.v1beta1.pkg.LocationOrBuilder>(
                location_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.package.Installation)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Installation)
  private static final io.grafeas.v1beta1.pkg.Installation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.pkg.Installation();
  }

  public static io.grafeas.v1beta1.pkg.Installation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Installation>
      PARSER = new com.google.protobuf.AbstractParser<Installation>() {
    public Installation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Installation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Installation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Installation> getParserForType() {
    return PARSER;
  }

  public io.grafeas.v1beta1.pkg.Installation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

