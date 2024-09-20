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
// source: google/cloud/aiplatform/v1/explanation.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Preset configuration for example-based explanations
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.Presets}
 */
public final class Presets extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.Presets)
    PresetsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Presets.newBuilder() to construct.
  private Presets(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Presets() {
    query_ = 0;
    modality_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Presets();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1_Presets_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1_Presets_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.Presets.class,
            com.google.cloud.aiplatform.v1.Presets.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for query speed-precision trade-off
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1.Presets.Query}
   */
  public enum Query implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * More precise neighbors as a trade-off against slower response.
     * </pre>
     *
     * <code>PRECISE = 0;</code>
     */
    PRECISE(0),
    /**
     *
     *
     * <pre>
     * Faster response as a trade-off against less precise neighbors.
     * </pre>
     *
     * <code>FAST = 1;</code>
     */
    FAST(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * More precise neighbors as a trade-off against slower response.
     * </pre>
     *
     * <code>PRECISE = 0;</code>
     */
    public static final int PRECISE_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Faster response as a trade-off against less precise neighbors.
     * </pre>
     *
     * <code>FAST = 1;</code>
     */
    public static final int FAST_VALUE = 1;

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
    public static Query valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Query forNumber(int value) {
      switch (value) {
        case 0:
          return PRECISE;
        case 1:
          return FAST;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Query> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Query> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Query>() {
          public Query findValueByNumber(int number) {
            return Query.forNumber(number);
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
      return com.google.cloud.aiplatform.v1.Presets.getDescriptor().getEnumTypes().get(0);
    }

    private static final Query[] VALUES = values();

    public static Query valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Query(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.Presets.Query)
  }

  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for different modalities
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1.Presets.Modality}
   */
  public enum Modality implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Should not be set. Added as a recommended best practice for enums
     * </pre>
     *
     * <code>MODALITY_UNSPECIFIED = 0;</code>
     */
    MODALITY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * IMAGE modality
     * </pre>
     *
     * <code>IMAGE = 1;</code>
     */
    IMAGE(1),
    /**
     *
     *
     * <pre>
     * TEXT modality
     * </pre>
     *
     * <code>TEXT = 2;</code>
     */
    TEXT(2),
    /**
     *
     *
     * <pre>
     * TABULAR modality
     * </pre>
     *
     * <code>TABULAR = 3;</code>
     */
    TABULAR(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Should not be set. Added as a recommended best practice for enums
     * </pre>
     *
     * <code>MODALITY_UNSPECIFIED = 0;</code>
     */
    public static final int MODALITY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * IMAGE modality
     * </pre>
     *
     * <code>IMAGE = 1;</code>
     */
    public static final int IMAGE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * TEXT modality
     * </pre>
     *
     * <code>TEXT = 2;</code>
     */
    public static final int TEXT_VALUE = 2;
    /**
     *
     *
     * <pre>
     * TABULAR modality
     * </pre>
     *
     * <code>TABULAR = 3;</code>
     */
    public static final int TABULAR_VALUE = 3;

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
    public static Modality valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Modality forNumber(int value) {
      switch (value) {
        case 0:
          return MODALITY_UNSPECIFIED;
        case 1:
          return IMAGE;
        case 2:
          return TEXT;
        case 3:
          return TABULAR;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Modality> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Modality> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Modality>() {
          public Modality findValueByNumber(int number) {
            return Modality.forNumber(number);
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
      return com.google.cloud.aiplatform.v1.Presets.getDescriptor().getEnumTypes().get(1);
    }

    private static final Modality[] VALUES = values();

    public static Modality valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Modality(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.Presets.Modality)
  }

  private int bitField0_;
  public static final int QUERY_FIELD_NUMBER = 1;
  private int query_ = 0;
  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for speed-precision trade-off when
   * querying for examples. If omitted, defaults to `PRECISE`.
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1.Presets.Query query = 1;</code>
   *
   * @return Whether the query field is set.
   */
  @java.lang.Override
  public boolean hasQuery() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for speed-precision trade-off when
   * querying for examples. If omitted, defaults to `PRECISE`.
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1.Presets.Query query = 1;</code>
   *
   * @return The enum numeric value on the wire for query.
   */
  @java.lang.Override
  public int getQueryValue() {
    return query_;
  }
  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for speed-precision trade-off when
   * querying for examples. If omitted, defaults to `PRECISE`.
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1.Presets.Query query = 1;</code>
   *
   * @return The query.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Presets.Query getQuery() {
    com.google.cloud.aiplatform.v1.Presets.Query result =
        com.google.cloud.aiplatform.v1.Presets.Query.forNumber(query_);
    return result == null ? com.google.cloud.aiplatform.v1.Presets.Query.UNRECOGNIZED : result;
  }

  public static final int MODALITY_FIELD_NUMBER = 2;
  private int modality_ = 0;
  /**
   *
   *
   * <pre>
   * The modality of the uploaded model, which automatically configures the
   * distance measurement and feature normalization for the underlying example
   * index and queries. If your model does not precisely fit one of these types,
   * it is okay to choose the closest type.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Presets.Modality modality = 2;</code>
   *
   * @return The enum numeric value on the wire for modality.
   */
  @java.lang.Override
  public int getModalityValue() {
    return modality_;
  }
  /**
   *
   *
   * <pre>
   * The modality of the uploaded model, which automatically configures the
   * distance measurement and feature normalization for the underlying example
   * index and queries. If your model does not precisely fit one of these types,
   * it is okay to choose the closest type.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Presets.Modality modality = 2;</code>
   *
   * @return The modality.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Presets.Modality getModality() {
    com.google.cloud.aiplatform.v1.Presets.Modality result =
        com.google.cloud.aiplatform.v1.Presets.Modality.forNumber(modality_);
    return result == null ? com.google.cloud.aiplatform.v1.Presets.Modality.UNRECOGNIZED : result;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, query_);
    }
    if (modality_
        != com.google.cloud.aiplatform.v1.Presets.Modality.MODALITY_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, modality_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, query_);
    }
    if (modality_
        != com.google.cloud.aiplatform.v1.Presets.Modality.MODALITY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, modality_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.Presets)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.Presets other = (com.google.cloud.aiplatform.v1.Presets) obj;

    if (hasQuery() != other.hasQuery()) return false;
    if (hasQuery()) {
      if (query_ != other.query_) return false;
    }
    if (modality_ != other.modality_) return false;
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
    if (hasQuery()) {
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + query_;
    }
    hash = (37 * hash) + MODALITY_FIELD_NUMBER;
    hash = (53 * hash) + modality_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.Presets parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Presets parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.Presets prototype) {
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
   * Preset configuration for example-based explanations
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.Presets}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.Presets)
      com.google.cloud.aiplatform.v1.PresetsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1_Presets_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1_Presets_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.Presets.class,
              com.google.cloud.aiplatform.v1.Presets.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.Presets.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      query_ = 0;
      modality_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1_Presets_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Presets getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.Presets.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Presets build() {
      com.google.cloud.aiplatform.v1.Presets result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Presets buildPartial() {
      com.google.cloud.aiplatform.v1.Presets result =
          new com.google.cloud.aiplatform.v1.Presets(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.Presets result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.query_ = query_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.modality_ = modality_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.Presets) {
        return mergeFrom((com.google.cloud.aiplatform.v1.Presets) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.Presets other) {
      if (other == com.google.cloud.aiplatform.v1.Presets.getDefaultInstance()) return this;
      if (other.hasQuery()) {
        setQuery(other.getQuery());
      }
      if (other.modality_ != 0) {
        setModalityValue(other.getModalityValue());
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
                query_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                modality_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int query_ = 0;
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for speed-precision trade-off when
     * querying for examples. If omitted, defaults to `PRECISE`.
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1.Presets.Query query = 1;</code>
     *
     * @return Whether the query field is set.
     */
    @java.lang.Override
    public boolean hasQuery() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for speed-precision trade-off when
     * querying for examples. If omitted, defaults to `PRECISE`.
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1.Presets.Query query = 1;</code>
     *
     * @return The enum numeric value on the wire for query.
     */
    @java.lang.Override
    public int getQueryValue() {
      return query_;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for speed-precision trade-off when
     * querying for examples. If omitted, defaults to `PRECISE`.
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1.Presets.Query query = 1;</code>
     *
     * @param value The enum numeric value on the wire for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryValue(int value) {
      query_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for speed-precision trade-off when
     * querying for examples. If omitted, defaults to `PRECISE`.
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1.Presets.Query query = 1;</code>
     *
     * @return The query.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Presets.Query getQuery() {
      com.google.cloud.aiplatform.v1.Presets.Query result =
          com.google.cloud.aiplatform.v1.Presets.Query.forNumber(query_);
      return result == null ? com.google.cloud.aiplatform.v1.Presets.Query.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for speed-precision trade-off when
     * querying for examples. If omitted, defaults to `PRECISE`.
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1.Presets.Query query = 1;</code>
     *
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(com.google.cloud.aiplatform.v1.Presets.Query value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      query_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for speed-precision trade-off when
     * querying for examples. If omitted, defaults to `PRECISE`.
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1.Presets.Query query = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearQuery() {
      bitField0_ = (bitField0_ & ~0x00000001);
      query_ = 0;
      onChanged();
      return this;
    }

    private int modality_ = 0;
    /**
     *
     *
     * <pre>
     * The modality of the uploaded model, which automatically configures the
     * distance measurement and feature normalization for the underlying example
     * index and queries. If your model does not precisely fit one of these types,
     * it is okay to choose the closest type.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Presets.Modality modality = 2;</code>
     *
     * @return The enum numeric value on the wire for modality.
     */
    @java.lang.Override
    public int getModalityValue() {
      return modality_;
    }
    /**
     *
     *
     * <pre>
     * The modality of the uploaded model, which automatically configures the
     * distance measurement and feature normalization for the underlying example
     * index and queries. If your model does not precisely fit one of these types,
     * it is okay to choose the closest type.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Presets.Modality modality = 2;</code>
     *
     * @param value The enum numeric value on the wire for modality to set.
     * @return This builder for chaining.
     */
    public Builder setModalityValue(int value) {
      modality_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The modality of the uploaded model, which automatically configures the
     * distance measurement and feature normalization for the underlying example
     * index and queries. If your model does not precisely fit one of these types,
     * it is okay to choose the closest type.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Presets.Modality modality = 2;</code>
     *
     * @return The modality.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Presets.Modality getModality() {
      com.google.cloud.aiplatform.v1.Presets.Modality result =
          com.google.cloud.aiplatform.v1.Presets.Modality.forNumber(modality_);
      return result == null ? com.google.cloud.aiplatform.v1.Presets.Modality.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The modality of the uploaded model, which automatically configures the
     * distance measurement and feature normalization for the underlying example
     * index and queries. If your model does not precisely fit one of these types,
     * it is okay to choose the closest type.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Presets.Modality modality = 2;</code>
     *
     * @param value The modality to set.
     * @return This builder for chaining.
     */
    public Builder setModality(com.google.cloud.aiplatform.v1.Presets.Modality value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      modality_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The modality of the uploaded model, which automatically configures the
     * distance measurement and feature normalization for the underlying example
     * index and queries. If your model does not precisely fit one of these types,
     * it is okay to choose the closest type.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Presets.Modality modality = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModality() {
      bitField0_ = (bitField0_ & ~0x00000002);
      modality_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.Presets)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.Presets)
  private static final com.google.cloud.aiplatform.v1.Presets DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.Presets();
  }

  public static com.google.cloud.aiplatform.v1.Presets getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Presets> PARSER =
      new com.google.protobuf.AbstractParser<Presets>() {
        @java.lang.Override
        public Presets parsePartialFrom(
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

  public static com.google.protobuf.Parser<Presets> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Presets> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Presets getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
