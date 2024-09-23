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
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

// Protobuf Java Version: 3.25.4
package io.grafeas.v1beta1.source;

/**
 *
 *
 * <pre>
 * An alias to a repo revision.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.source.AliasContext}
 */
public final class AliasContext extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.source.AliasContext)
    AliasContextOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AliasContext.newBuilder() to construct.
  private AliasContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AliasContext() {
    kind_ = 0;
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AliasContext();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.source.Source
        .internal_static_grafeas_v1beta1_source_AliasContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.source.Source
        .internal_static_grafeas_v1beta1_source_AliasContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.source.AliasContext.class,
            io.grafeas.v1beta1.source.AliasContext.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The type of an alias.
   * </pre>
   *
   * Protobuf enum {@code grafeas.v1beta1.source.AliasContext.Kind}
   */
  public enum Kind implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unknown.
     * </pre>
     *
     * <code>KIND_UNSPECIFIED = 0;</code>
     */
    KIND_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Git tag.
     * </pre>
     *
     * <code>FIXED = 1;</code>
     */
    FIXED(1),
    /**
     *
     *
     * <pre>
     * Git branch.
     * </pre>
     *
     * <code>MOVABLE = 2;</code>
     */
    MOVABLE(2),
    /**
     *
     *
     * <pre>
     * Used to specify non-standard aliases. For example, if a Git repo has a
     * ref named "refs/foo/bar".
     * </pre>
     *
     * <code>OTHER = 4;</code>
     */
    OTHER(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unknown.
     * </pre>
     *
     * <code>KIND_UNSPECIFIED = 0;</code>
     */
    public static final int KIND_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Git tag.
     * </pre>
     *
     * <code>FIXED = 1;</code>
     */
    public static final int FIXED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Git branch.
     * </pre>
     *
     * <code>MOVABLE = 2;</code>
     */
    public static final int MOVABLE_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Used to specify non-standard aliases. For example, if a Git repo has a
     * ref named "refs/foo/bar".
     * </pre>
     *
     * <code>OTHER = 4;</code>
     */
    public static final int OTHER_VALUE = 4;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Kind valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Kind forNumber(int value) {
      switch (value) {
        case 0:
          return KIND_UNSPECIFIED;
        case 1:
          return FIXED;
        case 2:
          return MOVABLE;
        case 4:
          return OTHER;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Kind> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Kind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
          public Kind findValueByNumber(int number) {
            return Kind.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return io.grafeas.v1beta1.source.AliasContext.getDescriptor().getEnumTypes().get(0);
    }

    private static final Kind[] VALUES = values();

    public static Kind valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Kind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:grafeas.v1beta1.source.AliasContext.Kind)
  }

  public static final int KIND_FIELD_NUMBER = 1;
  private int kind_ = 0;
  /**
   *
   *
   * <pre>
   * The alias kind.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext.Kind kind = 1;</code>
   *
   * @return The enum numeric value on the wire for kind.
   */
  @java.lang.Override
  public int getKindValue() {
    return kind_;
  }
  /**
   *
   *
   * <pre>
   * The alias kind.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext.Kind kind = 1;</code>
   *
   * @return The kind.
   */
  @java.lang.Override
  public io.grafeas.v1beta1.source.AliasContext.Kind getKind() {
    io.grafeas.v1beta1.source.AliasContext.Kind result =
        io.grafeas.v1beta1.source.AliasContext.Kind.forNumber(kind_);
    return result == null ? io.grafeas.v1beta1.source.AliasContext.Kind.UNRECOGNIZED : result;
  }

  public static final int NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * The alias name.
   * </pre>
   *
   * <code>string name = 2;</code>
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
   * The alias name.
   * </pre>
   *
   * <code>string name = 2;</code>
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
    if (kind_ != io.grafeas.v1beta1.source.AliasContext.Kind.KIND_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, kind_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kind_ != io.grafeas.v1beta1.source.AliasContext.Kind.KIND_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, kind_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
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
    if (!(obj instanceof io.grafeas.v1beta1.source.AliasContext)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.source.AliasContext other = (io.grafeas.v1beta1.source.AliasContext) obj;

    if (kind_ != other.kind_) return false;
    if (!getName().equals(other.getName())) return false;
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
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + kind_;
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.source.AliasContext parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.AliasContext parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.source.AliasContext prototype) {
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
   * An alias to a repo revision.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.source.AliasContext}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.source.AliasContext)
      io.grafeas.v1beta1.source.AliasContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_AliasContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_AliasContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.source.AliasContext.class,
              io.grafeas.v1beta1.source.AliasContext.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.source.AliasContext.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      kind_ = 0;
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_AliasContext_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.AliasContext getDefaultInstanceForType() {
      return io.grafeas.v1beta1.source.AliasContext.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.AliasContext build() {
      io.grafeas.v1beta1.source.AliasContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.AliasContext buildPartial() {
      io.grafeas.v1beta1.source.AliasContext result =
          new io.grafeas.v1beta1.source.AliasContext(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1beta1.source.AliasContext result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
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
      if (other instanceof io.grafeas.v1beta1.source.AliasContext) {
        return mergeFrom((io.grafeas.v1beta1.source.AliasContext) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.source.AliasContext other) {
      if (other == io.grafeas.v1beta1.source.AliasContext.getDefaultInstance()) return this;
      if (other.kind_ != 0) {
        setKindValue(other.getKindValue());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 8:
              {
                kind_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private int kind_ = 0;
    /**
     *
     *
     * <pre>
     * The alias kind.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext.Kind kind = 1;</code>
     *
     * @return The enum numeric value on the wire for kind.
     */
    @java.lang.Override
    public int getKindValue() {
      return kind_;
    }
    /**
     *
     *
     * <pre>
     * The alias kind.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext.Kind kind = 1;</code>
     *
     * @param value The enum numeric value on the wire for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindValue(int value) {
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The alias kind.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext.Kind kind = 1;</code>
     *
     * @return The kind.
     */
    @java.lang.Override
    public io.grafeas.v1beta1.source.AliasContext.Kind getKind() {
      io.grafeas.v1beta1.source.AliasContext.Kind result =
          io.grafeas.v1beta1.source.AliasContext.Kind.forNumber(kind_);
      return result == null ? io.grafeas.v1beta1.source.AliasContext.Kind.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The alias kind.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext.Kind kind = 1;</code>
     *
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(io.grafeas.v1beta1.source.AliasContext.Kind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The alias kind.
     * </pre>
     *
     * <code>.grafeas.v1beta1.source.AliasContext.Kind kind = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The alias name.
     * </pre>
     *
     * <code>string name = 2;</code>
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
     * The alias name.
     * </pre>
     *
     * <code>string name = 2;</code>
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
     * The alias name.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The alias name.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The alias name.
     * </pre>
     *
     * <code>string name = 2;</code>
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
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.source.AliasContext)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.source.AliasContext)
  private static final io.grafeas.v1beta1.source.AliasContext DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.source.AliasContext();
  }

  public static io.grafeas.v1beta1.source.AliasContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AliasContext> PARSER =
      new com.google.protobuf.AbstractParser<AliasContext>() {
        @java.lang.Override
        public AliasContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<AliasContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AliasContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.source.AliasContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
