// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/companions.proto

package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Metadata for companion ads.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.CompanionAds}
 */
public final class CompanionAds extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.CompanionAds)
    CompanionAdsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompanionAds.newBuilder() to construct.
  private CompanionAds(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompanionAds() {
    displayRequirement_ = 0;
    companions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompanionAds();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompanionAds(
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
          case 8: {
            int rawValue = input.readEnum();

            displayRequirement_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              companions_ = new java.util.ArrayList<com.google.cloud.video.stitcher.v1.Companion>();
              mutable_bitField0_ |= 0x00000001;
            }
            companions_.add(
                input.readMessage(com.google.cloud.video.stitcher.v1.Companion.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        companions_ = java.util.Collections.unmodifiableList(companions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.CompanionsProto.internal_static_google_cloud_video_stitcher_v1_CompanionAds_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.CompanionsProto.internal_static_google_cloud_video_stitcher_v1_CompanionAds_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.CompanionAds.class, com.google.cloud.video.stitcher.v1.CompanionAds.Builder.class);
  }

  /**
   * <pre>
   * Indicates how many of the companions should be displayed with the ad.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement}
   */
  public enum DisplayRequirement
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Required companions are not specified. The default is ALL.
     * </pre>
     *
     * <code>DISPLAY_REQUIREMENT_UNSPECIFIED = 0;</code>
     */
    DISPLAY_REQUIREMENT_UNSPECIFIED(0),
    /**
     * <pre>
     * All companions are required to be displayed.
     * </pre>
     *
     * <code>ALL = 1;</code>
     */
    ALL(1),
    /**
     * <pre>
     * At least one of companions needs to be displayed.
     * </pre>
     *
     * <code>ANY = 2;</code>
     */
    ANY(2),
    /**
     * <pre>
     * All companions are optional for display.
     * </pre>
     *
     * <code>NONE = 3;</code>
     */
    NONE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Required companions are not specified. The default is ALL.
     * </pre>
     *
     * <code>DISPLAY_REQUIREMENT_UNSPECIFIED = 0;</code>
     */
    public static final int DISPLAY_REQUIREMENT_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * All companions are required to be displayed.
     * </pre>
     *
     * <code>ALL = 1;</code>
     */
    public static final int ALL_VALUE = 1;
    /**
     * <pre>
     * At least one of companions needs to be displayed.
     * </pre>
     *
     * <code>ANY = 2;</code>
     */
    public static final int ANY_VALUE = 2;
    /**
     * <pre>
     * All companions are optional for display.
     * </pre>
     *
     * <code>NONE = 3;</code>
     */
    public static final int NONE_VALUE = 3;


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
    public static DisplayRequirement valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DisplayRequirement forNumber(int value) {
      switch (value) {
        case 0: return DISPLAY_REQUIREMENT_UNSPECIFIED;
        case 1: return ALL;
        case 2: return ANY;
        case 3: return NONE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DisplayRequirement>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DisplayRequirement> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DisplayRequirement>() {
            public DisplayRequirement findValueByNumber(int number) {
              return DisplayRequirement.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.CompanionAds.getDescriptor().getEnumTypes().get(0);
    }

    private static final DisplayRequirement[] VALUES = values();

    public static DisplayRequirement valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DisplayRequirement(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement)
  }

  public static final int DISPLAY_REQUIREMENT_FIELD_NUMBER = 1;
  private int displayRequirement_;
  /**
   * <pre>
   * Indicates how many of the companions should be displayed with the ad.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement display_requirement = 1;</code>
   * @return The enum numeric value on the wire for displayRequirement.
   */
  @java.lang.Override public int getDisplayRequirementValue() {
    return displayRequirement_;
  }
  /**
   * <pre>
   * Indicates how many of the companions should be displayed with the ad.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement display_requirement = 1;</code>
   * @return The displayRequirement.
   */
  @java.lang.Override public com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement getDisplayRequirement() {
    @SuppressWarnings("deprecation")
    com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement result = com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement.valueOf(displayRequirement_);
    return result == null ? com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement.UNRECOGNIZED : result;
  }

  public static final int COMPANIONS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.video.stitcher.v1.Companion> companions_;
  /**
   * <pre>
   * List of companion ads.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.video.stitcher.v1.Companion> getCompanionsList() {
    return companions_;
  }
  /**
   * <pre>
   * List of companion ads.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.video.stitcher.v1.CompanionOrBuilder> 
      getCompanionsOrBuilderList() {
    return companions_;
  }
  /**
   * <pre>
   * List of companion ads.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
   */
  @java.lang.Override
  public int getCompanionsCount() {
    return companions_.size();
  }
  /**
   * <pre>
   * List of companion ads.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.Companion getCompanions(int index) {
    return companions_.get(index);
  }
  /**
   * <pre>
   * List of companion ads.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.CompanionOrBuilder getCompanionsOrBuilder(
      int index) {
    return companions_.get(index);
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
    if (displayRequirement_ != com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement.DISPLAY_REQUIREMENT_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, displayRequirement_);
    }
    for (int i = 0; i < companions_.size(); i++) {
      output.writeMessage(2, companions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (displayRequirement_ != com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement.DISPLAY_REQUIREMENT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, displayRequirement_);
    }
    for (int i = 0; i < companions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, companions_.get(i));
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.CompanionAds)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.CompanionAds other = (com.google.cloud.video.stitcher.v1.CompanionAds) obj;

    if (displayRequirement_ != other.displayRequirement_) return false;
    if (!getCompanionsList()
        .equals(other.getCompanionsList())) return false;
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
    hash = (37 * hash) + DISPLAY_REQUIREMENT_FIELD_NUMBER;
    hash = (53 * hash) + displayRequirement_;
    if (getCompanionsCount() > 0) {
      hash = (37 * hash) + COMPANIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCompanionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.CompanionAds parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.CompanionAds parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.CompanionAds prototype) {
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
   * Metadata for companion ads.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.CompanionAds}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.CompanionAds)
      com.google.cloud.video.stitcher.v1.CompanionAdsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.CompanionsProto.internal_static_google_cloud_video_stitcher_v1_CompanionAds_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.CompanionsProto.internal_static_google_cloud_video_stitcher_v1_CompanionAds_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.CompanionAds.class, com.google.cloud.video.stitcher.v1.CompanionAds.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.CompanionAds.newBuilder()
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
        getCompanionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      displayRequirement_ = 0;

      if (companionsBuilder_ == null) {
        companions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        companionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.CompanionsProto.internal_static_google_cloud_video_stitcher_v1_CompanionAds_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CompanionAds getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.CompanionAds.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CompanionAds build() {
      com.google.cloud.video.stitcher.v1.CompanionAds result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CompanionAds buildPartial() {
      com.google.cloud.video.stitcher.v1.CompanionAds result = new com.google.cloud.video.stitcher.v1.CompanionAds(this);
      int from_bitField0_ = bitField0_;
      result.displayRequirement_ = displayRequirement_;
      if (companionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          companions_ = java.util.Collections.unmodifiableList(companions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.companions_ = companions_;
      } else {
        result.companions_ = companionsBuilder_.build();
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
      if (other instanceof com.google.cloud.video.stitcher.v1.CompanionAds) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.CompanionAds)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.CompanionAds other) {
      if (other == com.google.cloud.video.stitcher.v1.CompanionAds.getDefaultInstance()) return this;
      if (other.displayRequirement_ != 0) {
        setDisplayRequirementValue(other.getDisplayRequirementValue());
      }
      if (companionsBuilder_ == null) {
        if (!other.companions_.isEmpty()) {
          if (companions_.isEmpty()) {
            companions_ = other.companions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCompanionsIsMutable();
            companions_.addAll(other.companions_);
          }
          onChanged();
        }
      } else {
        if (!other.companions_.isEmpty()) {
          if (companionsBuilder_.isEmpty()) {
            companionsBuilder_.dispose();
            companionsBuilder_ = null;
            companions_ = other.companions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            companionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCompanionsFieldBuilder() : null;
          } else {
            companionsBuilder_.addAllMessages(other.companions_);
          }
        }
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
      com.google.cloud.video.stitcher.v1.CompanionAds parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.video.stitcher.v1.CompanionAds) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int displayRequirement_ = 0;
    /**
     * <pre>
     * Indicates how many of the companions should be displayed with the ad.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement display_requirement = 1;</code>
     * @return The enum numeric value on the wire for displayRequirement.
     */
    @java.lang.Override public int getDisplayRequirementValue() {
      return displayRequirement_;
    }
    /**
     * <pre>
     * Indicates how many of the companions should be displayed with the ad.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement display_requirement = 1;</code>
     * @param value The enum numeric value on the wire for displayRequirement to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayRequirementValue(int value) {
      
      displayRequirement_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates how many of the companions should be displayed with the ad.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement display_requirement = 1;</code>
     * @return The displayRequirement.
     */
    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement getDisplayRequirement() {
      @SuppressWarnings("deprecation")
      com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement result = com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement.valueOf(displayRequirement_);
      return result == null ? com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Indicates how many of the companions should be displayed with the ad.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement display_requirement = 1;</code>
     * @param value The displayRequirement to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayRequirement(com.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      displayRequirement_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates how many of the companions should be displayed with the ad.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.CompanionAds.DisplayRequirement display_requirement = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayRequirement() {
      
      displayRequirement_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.video.stitcher.v1.Companion> companions_ =
      java.util.Collections.emptyList();
    private void ensureCompanionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        companions_ = new java.util.ArrayList<com.google.cloud.video.stitcher.v1.Companion>(companions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.Companion, com.google.cloud.video.stitcher.v1.Companion.Builder, com.google.cloud.video.stitcher.v1.CompanionOrBuilder> companionsBuilder_;

    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.Companion> getCompanionsList() {
      if (companionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(companions_);
      } else {
        return companionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public int getCompanionsCount() {
      if (companionsBuilder_ == null) {
        return companions_.size();
      } else {
        return companionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.Companion getCompanions(int index) {
      if (companionsBuilder_ == null) {
        return companions_.get(index);
      } else {
        return companionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public Builder setCompanions(
        int index, com.google.cloud.video.stitcher.v1.Companion value) {
      if (companionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompanionsIsMutable();
        companions_.set(index, value);
        onChanged();
      } else {
        companionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public Builder setCompanions(
        int index, com.google.cloud.video.stitcher.v1.Companion.Builder builderForValue) {
      if (companionsBuilder_ == null) {
        ensureCompanionsIsMutable();
        companions_.set(index, builderForValue.build());
        onChanged();
      } else {
        companionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public Builder addCompanions(com.google.cloud.video.stitcher.v1.Companion value) {
      if (companionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompanionsIsMutable();
        companions_.add(value);
        onChanged();
      } else {
        companionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public Builder addCompanions(
        int index, com.google.cloud.video.stitcher.v1.Companion value) {
      if (companionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompanionsIsMutable();
        companions_.add(index, value);
        onChanged();
      } else {
        companionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public Builder addCompanions(
        com.google.cloud.video.stitcher.v1.Companion.Builder builderForValue) {
      if (companionsBuilder_ == null) {
        ensureCompanionsIsMutable();
        companions_.add(builderForValue.build());
        onChanged();
      } else {
        companionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public Builder addCompanions(
        int index, com.google.cloud.video.stitcher.v1.Companion.Builder builderForValue) {
      if (companionsBuilder_ == null) {
        ensureCompanionsIsMutable();
        companions_.add(index, builderForValue.build());
        onChanged();
      } else {
        companionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public Builder addAllCompanions(
        java.lang.Iterable<? extends com.google.cloud.video.stitcher.v1.Companion> values) {
      if (companionsBuilder_ == null) {
        ensureCompanionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, companions_);
        onChanged();
      } else {
        companionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public Builder clearCompanions() {
      if (companionsBuilder_ == null) {
        companions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        companionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public Builder removeCompanions(int index) {
      if (companionsBuilder_ == null) {
        ensureCompanionsIsMutable();
        companions_.remove(index);
        onChanged();
      } else {
        companionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.Companion.Builder getCompanionsBuilder(
        int index) {
      return getCompanionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.CompanionOrBuilder getCompanionsOrBuilder(
        int index) {
      if (companionsBuilder_ == null) {
        return companions_.get(index);  } else {
        return companionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.video.stitcher.v1.CompanionOrBuilder> 
         getCompanionsOrBuilderList() {
      if (companionsBuilder_ != null) {
        return companionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(companions_);
      }
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.Companion.Builder addCompanionsBuilder() {
      return getCompanionsFieldBuilder().addBuilder(
          com.google.cloud.video.stitcher.v1.Companion.getDefaultInstance());
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.Companion.Builder addCompanionsBuilder(
        int index) {
      return getCompanionsFieldBuilder().addBuilder(
          index, com.google.cloud.video.stitcher.v1.Companion.getDefaultInstance());
    }
    /**
     * <pre>
     * List of companion ads.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.Companion companions = 2;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.Companion.Builder> 
         getCompanionsBuilderList() {
      return getCompanionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.video.stitcher.v1.Companion, com.google.cloud.video.stitcher.v1.Companion.Builder, com.google.cloud.video.stitcher.v1.CompanionOrBuilder> 
        getCompanionsFieldBuilder() {
      if (companionsBuilder_ == null) {
        companionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.Companion, com.google.cloud.video.stitcher.v1.Companion.Builder, com.google.cloud.video.stitcher.v1.CompanionOrBuilder>(
                companions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        companions_ = null;
      }
      return companionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.CompanionAds)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.CompanionAds)
  private static final com.google.cloud.video.stitcher.v1.CompanionAds DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.CompanionAds();
  }

  public static com.google.cloud.video.stitcher.v1.CompanionAds getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompanionAds>
      PARSER = new com.google.protobuf.AbstractParser<CompanionAds>() {
    @java.lang.Override
    public CompanionAds parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompanionAds(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompanionAds> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompanionAds> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.CompanionAds getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

