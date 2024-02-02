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
// source: google/cloud/aiplatform/v1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Safety rating corresponding to the generated content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.SafetyRating}
 */
public final class SafetyRating extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.SafetyRating)
    SafetyRatingOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SafetyRating.newBuilder() to construct.
  private SafetyRating(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SafetyRating() {
    category_ = 0;
    probability_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SafetyRating();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ContentProto
        .internal_static_google_cloud_aiplatform_v1_SafetyRating_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ContentProto
        .internal_static_google_cloud_aiplatform_v1_SafetyRating_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.SafetyRating.class,
            com.google.cloud.aiplatform.v1.SafetyRating.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Harm probability levels in the content.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1.SafetyRating.HarmProbability}
   */
  public enum HarmProbability implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Harm probability unspecified.
     * </pre>
     *
     * <code>HARM_PROBABILITY_UNSPECIFIED = 0;</code>
     */
    HARM_PROBABILITY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Negligible level of harm.
     * </pre>
     *
     * <code>NEGLIGIBLE = 1;</code>
     */
    NEGLIGIBLE(1),
    /**
     *
     *
     * <pre>
     * Low level of harm.
     * </pre>
     *
     * <code>LOW = 2;</code>
     */
    LOW(2),
    /**
     *
     *
     * <pre>
     * Medium level of harm.
     * </pre>
     *
     * <code>MEDIUM = 3;</code>
     */
    MEDIUM(3),
    /**
     *
     *
     * <pre>
     * High level of harm.
     * </pre>
     *
     * <code>HIGH = 4;</code>
     */
    HIGH(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Harm probability unspecified.
     * </pre>
     *
     * <code>HARM_PROBABILITY_UNSPECIFIED = 0;</code>
     */
    public static final int HARM_PROBABILITY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Negligible level of harm.
     * </pre>
     *
     * <code>NEGLIGIBLE = 1;</code>
     */
    public static final int NEGLIGIBLE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Low level of harm.
     * </pre>
     *
     * <code>LOW = 2;</code>
     */
    public static final int LOW_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Medium level of harm.
     * </pre>
     *
     * <code>MEDIUM = 3;</code>
     */
    public static final int MEDIUM_VALUE = 3;
    /**
     *
     *
     * <pre>
     * High level of harm.
     * </pre>
     *
     * <code>HIGH = 4;</code>
     */
    public static final int HIGH_VALUE = 4;

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
    public static HarmProbability valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HarmProbability forNumber(int value) {
      switch (value) {
        case 0:
          return HARM_PROBABILITY_UNSPECIFIED;
        case 1:
          return NEGLIGIBLE;
        case 2:
          return LOW;
        case 3:
          return MEDIUM;
        case 4:
          return HIGH;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HarmProbability> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<HarmProbability>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<HarmProbability>() {
              public HarmProbability findValueByNumber(int number) {
                return HarmProbability.forNumber(number);
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
      return com.google.cloud.aiplatform.v1.SafetyRating.getDescriptor().getEnumTypes().get(0);
    }

    private static final HarmProbability[] VALUES = values();

    public static HarmProbability valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private HarmProbability(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.SafetyRating.HarmProbability)
  }

  public static final int CATEGORY_FIELD_NUMBER = 1;
  private int category_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. Harm category.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for category.
   */
  @java.lang.Override
  public int getCategoryValue() {
    return category_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Harm category.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The category.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.HarmCategory getCategory() {
    com.google.cloud.aiplatform.v1.HarmCategory result =
        com.google.cloud.aiplatform.v1.HarmCategory.forNumber(category_);
    return result == null ? com.google.cloud.aiplatform.v1.HarmCategory.UNRECOGNIZED : result;
  }

  public static final int PROBABILITY_FIELD_NUMBER = 2;
  private int probability_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. Harm probability levels in the content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for probability.
   */
  @java.lang.Override
  public int getProbabilityValue() {
    return probability_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Harm probability levels in the content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The probability.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability getProbability() {
    com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability result =
        com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability.forNumber(probability_);
    return result == null
        ? com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability.UNRECOGNIZED
        : result;
  }

  public static final int BLOCKED_FIELD_NUMBER = 3;
  private boolean blocked_ = false;
  /**
   *
   *
   * <pre>
   * Output only. Indicates whether the content was filtered out because of this
   * rating.
   * </pre>
   *
   * <code>bool blocked = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The blocked.
   */
  @java.lang.Override
  public boolean getBlocked() {
    return blocked_;
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
    if (category_
        != com.google.cloud.aiplatform.v1.HarmCategory.HARM_CATEGORY_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, category_);
    }
    if (probability_
        != com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability.HARM_PROBABILITY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, probability_);
    }
    if (blocked_ != false) {
      output.writeBool(3, blocked_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (category_
        != com.google.cloud.aiplatform.v1.HarmCategory.HARM_CATEGORY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, category_);
    }
    if (probability_
        != com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability.HARM_PROBABILITY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, probability_);
    }
    if (blocked_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, blocked_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.SafetyRating)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.SafetyRating other =
        (com.google.cloud.aiplatform.v1.SafetyRating) obj;

    if (category_ != other.category_) return false;
    if (probability_ != other.probability_) return false;
    if (getBlocked() != other.getBlocked()) return false;
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
    hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
    hash = (53 * hash) + category_;
    hash = (37 * hash) + PROBABILITY_FIELD_NUMBER;
    hash = (53 * hash) + probability_;
    hash = (37 * hash) + BLOCKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getBlocked());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.SafetyRating prototype) {
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
   * Safety rating corresponding to the generated content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.SafetyRating}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.SafetyRating)
      com.google.cloud.aiplatform.v1.SafetyRatingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ContentProto
          .internal_static_google_cloud_aiplatform_v1_SafetyRating_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ContentProto
          .internal_static_google_cloud_aiplatform_v1_SafetyRating_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.SafetyRating.class,
              com.google.cloud.aiplatform.v1.SafetyRating.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.SafetyRating.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      category_ = 0;
      probability_ = 0;
      blocked_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ContentProto
          .internal_static_google_cloud_aiplatform_v1_SafetyRating_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SafetyRating getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.SafetyRating.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SafetyRating build() {
      com.google.cloud.aiplatform.v1.SafetyRating result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SafetyRating buildPartial() {
      com.google.cloud.aiplatform.v1.SafetyRating result =
          new com.google.cloud.aiplatform.v1.SafetyRating(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.SafetyRating result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.category_ = category_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.probability_ = probability_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.blocked_ = blocked_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.SafetyRating) {
        return mergeFrom((com.google.cloud.aiplatform.v1.SafetyRating) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.SafetyRating other) {
      if (other == com.google.cloud.aiplatform.v1.SafetyRating.getDefaultInstance()) return this;
      if (other.category_ != 0) {
        setCategoryValue(other.getCategoryValue());
      }
      if (other.probability_ != 0) {
        setProbabilityValue(other.getProbabilityValue());
      }
      if (other.getBlocked() != false) {
        setBlocked(other.getBlocked());
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
                category_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                probability_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                blocked_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private int category_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. Harm category.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for category.
     */
    @java.lang.Override
    public int getCategoryValue() {
      return category_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Harm category.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for category to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryValue(int value) {
      category_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Harm category.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The category.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.HarmCategory getCategory() {
      com.google.cloud.aiplatform.v1.HarmCategory result =
          com.google.cloud.aiplatform.v1.HarmCategory.forNumber(category_);
      return result == null ? com.google.cloud.aiplatform.v1.HarmCategory.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. Harm category.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The category to set.
     * @return This builder for chaining.
     */
    public Builder setCategory(com.google.cloud.aiplatform.v1.HarmCategory value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      category_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Harm category.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCategory() {
      bitField0_ = (bitField0_ & ~0x00000001);
      category_ = 0;
      onChanged();
      return this;
    }

    private int probability_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. Harm probability levels in the content.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for probability.
     */
    @java.lang.Override
    public int getProbabilityValue() {
      return probability_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Harm probability levels in the content.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for probability to set.
     * @return This builder for chaining.
     */
    public Builder setProbabilityValue(int value) {
      probability_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Harm probability levels in the content.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The probability.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability getProbability() {
      com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability result =
          com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability.forNumber(probability_);
      return result == null
          ? com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. Harm probability levels in the content.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The probability to set.
     * @return This builder for chaining.
     */
    public Builder setProbability(
        com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      probability_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Harm probability levels in the content.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProbability() {
      bitField0_ = (bitField0_ & ~0x00000002);
      probability_ = 0;
      onChanged();
      return this;
    }

    private boolean blocked_;
    /**
     *
     *
     * <pre>
     * Output only. Indicates whether the content was filtered out because of this
     * rating.
     * </pre>
     *
     * <code>bool blocked = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The blocked.
     */
    @java.lang.Override
    public boolean getBlocked() {
      return blocked_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Indicates whether the content was filtered out because of this
     * rating.
     * </pre>
     *
     * <code>bool blocked = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The blocked to set.
     * @return This builder for chaining.
     */
    public Builder setBlocked(boolean value) {

      blocked_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Indicates whether the content was filtered out because of this
     * rating.
     * </pre>
     *
     * <code>bool blocked = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBlocked() {
      bitField0_ = (bitField0_ & ~0x00000004);
      blocked_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.SafetyRating)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.SafetyRating)
  private static final com.google.cloud.aiplatform.v1.SafetyRating DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.SafetyRating();
  }

  public static com.google.cloud.aiplatform.v1.SafetyRating getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SafetyRating> PARSER =
      new com.google.protobuf.AbstractParser<SafetyRating>() {
        @java.lang.Override
        public SafetyRating parsePartialFrom(
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

  public static com.google.protobuf.Parser<SafetyRating> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SafetyRating> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SafetyRating getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
