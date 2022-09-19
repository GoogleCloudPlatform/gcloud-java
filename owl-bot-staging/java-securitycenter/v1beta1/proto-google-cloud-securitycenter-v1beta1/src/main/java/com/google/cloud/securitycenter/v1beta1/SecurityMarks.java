// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/security_marks.proto

package com.google.cloud.securitycenter.v1beta1;

/**
 * <pre>
 * User specified security marks that are attached to the parent Security
 * Command Center resource. Security marks are scoped within a Security Command
 * Center organization -- they can be modified and viewed by all users who have
 * proper permissions on the organization.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1beta1.SecurityMarks}
 */
public final class SecurityMarks extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1beta1.SecurityMarks)
    SecurityMarksOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityMarks.newBuilder() to construct.
  private SecurityMarks(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityMarks() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecurityMarks();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SecurityMarks(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              marks_ = com.google.protobuf.MapField.newMapField(
                  MarksDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            marks__ = input.readMessage(
                MarksDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            marks_.getMutableMap().put(
                marks__.getKey(), marks__.getValue());
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
    return com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetMarks();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1beta1.SecurityMarks.class, com.google.cloud.securitycenter.v1beta1.SecurityMarks.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The relative resource name of the SecurityMarks. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Examples:
   * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
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
   * The relative resource name of the SecurityMarks. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Examples:
   * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
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

  public static final int MARKS_FIELD_NUMBER = 2;
  private static final class MarksDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_MarksEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> marks_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetMarks() {
    if (marks_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MarksDefaultEntryHolder.defaultEntry);
    }
    return marks_;
  }

  public int getMarksCount() {
    return internalGetMarks().getMap().size();
  }
  /**
   * <pre>
   * Mutable user specified security marks belonging to the parent resource.
   * Constraints are as follows:
   *   * Keys and values are treated as case insensitive
   *   * Keys must be between 1 - 256 characters (inclusive)
   *   * Keys must be letters, numbers, underscores, or dashes
   *   * Values have leading and trailing whitespace trimmed, remaining
   *     characters must be between 1 - 4096 characters (inclusive)
   * </pre>
   *
   * <code>map&lt;string, string&gt; marks = 2;</code>
   */

  @java.lang.Override
  public boolean containsMarks(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetMarks().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMarksMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMarks() {
    return getMarksMap();
  }
  /**
   * <pre>
   * Mutable user specified security marks belonging to the parent resource.
   * Constraints are as follows:
   *   * Keys and values are treated as case insensitive
   *   * Keys must be between 1 - 256 characters (inclusive)
   *   * Keys must be letters, numbers, underscores, or dashes
   *   * Values have leading and trailing whitespace trimmed, remaining
   *     characters must be between 1 - 4096 characters (inclusive)
   * </pre>
   *
   * <code>map&lt;string, string&gt; marks = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getMarksMap() {
    return internalGetMarks().getMap();
  }
  /**
   * <pre>
   * Mutable user specified security marks belonging to the parent resource.
   * Constraints are as follows:
   *   * Keys and values are treated as case insensitive
   *   * Keys must be between 1 - 256 characters (inclusive)
   *   * Keys must be letters, numbers, underscores, or dashes
   *   * Values have leading and trailing whitespace trimmed, remaining
   *     characters must be between 1 - 4096 characters (inclusive)
   * </pre>
   *
   * <code>map&lt;string, string&gt; marks = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getMarksOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMarks().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Mutable user specified security marks belonging to the parent resource.
   * Constraints are as follows:
   *   * Keys and values are treated as case insensitive
   *   * Keys must be between 1 - 256 characters (inclusive)
   *   * Keys must be letters, numbers, underscores, or dashes
   *   * Values have leading and trailing whitespace trimmed, remaining
   *     characters must be between 1 - 4096 characters (inclusive)
   * </pre>
   *
   * <code>map&lt;string, string&gt; marks = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getMarksOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMarks().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMarks(),
        MarksDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetMarks().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      marks__ = MarksDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, marks__);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1beta1.SecurityMarks)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1beta1.SecurityMarks other = (com.google.cloud.securitycenter.v1beta1.SecurityMarks) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!internalGetMarks().equals(
        other.internalGetMarks())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (!internalGetMarks().getMap().isEmpty()) {
      hash = (37 * hash) + MARKS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMarks().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks parseFrom(
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
  public static Builder newBuilder(com.google.cloud.securitycenter.v1beta1.SecurityMarks prototype) {
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
   * User specified security marks that are attached to the parent Security
   * Command Center resource. Security marks are scoped within a Security Command
   * Center organization -- they can be modified and viewed by all users who have
   * proper permissions on the organization.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1beta1.SecurityMarks}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1beta1.SecurityMarks)
      com.google.cloud.securitycenter.v1beta1.SecurityMarksOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMarks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableMarks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1beta1.SecurityMarks.class, com.google.cloud.securitycenter.v1beta1.SecurityMarks.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1beta1.SecurityMarks.newBuilder()
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

      internalGetMutableMarks().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.internal_static_google_cloud_securitycenter_v1beta1_SecurityMarks_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.SecurityMarks getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1beta1.SecurityMarks.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.SecurityMarks build() {
      com.google.cloud.securitycenter.v1beta1.SecurityMarks result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.SecurityMarks buildPartial() {
      com.google.cloud.securitycenter.v1beta1.SecurityMarks result = new com.google.cloud.securitycenter.v1beta1.SecurityMarks(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.marks_ = internalGetMarks();
      result.marks_.makeImmutable();
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
      if (other instanceof com.google.cloud.securitycenter.v1beta1.SecurityMarks) {
        return mergeFrom((com.google.cloud.securitycenter.v1beta1.SecurityMarks)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1beta1.SecurityMarks other) {
      if (other == com.google.cloud.securitycenter.v1beta1.SecurityMarks.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      internalGetMutableMarks().mergeFrom(
          other.internalGetMarks());
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
      com.google.cloud.securitycenter.v1beta1.SecurityMarks parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.securitycenter.v1beta1.SecurityMarks) e.getUnfinishedMessage();
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
     * The relative resource name of the SecurityMarks. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Examples:
     * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
     * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
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
     * The relative resource name of the SecurityMarks. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Examples:
     * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
     * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
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
     * The relative resource name of the SecurityMarks. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Examples:
     * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
     * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
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
     * The relative resource name of the SecurityMarks. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Examples:
     * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
     * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The relative resource name of the SecurityMarks. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Examples:
     * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
     * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> marks_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMarks() {
      if (marks_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MarksDefaultEntryHolder.defaultEntry);
      }
      return marks_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableMarks() {
      onChanged();;
      if (marks_ == null) {
        marks_ = com.google.protobuf.MapField.newMapField(
            MarksDefaultEntryHolder.defaultEntry);
      }
      if (!marks_.isMutable()) {
        marks_ = marks_.copy();
      }
      return marks_;
    }

    public int getMarksCount() {
      return internalGetMarks().getMap().size();
    }
    /**
     * <pre>
     * Mutable user specified security marks belonging to the parent resource.
     * Constraints are as follows:
     *   * Keys and values are treated as case insensitive
     *   * Keys must be between 1 - 256 characters (inclusive)
     *   * Keys must be letters, numbers, underscores, or dashes
     *   * Values have leading and trailing whitespace trimmed, remaining
     *     characters must be between 1 - 4096 characters (inclusive)
     * </pre>
     *
     * <code>map&lt;string, string&gt; marks = 2;</code>
     */

    @java.lang.Override
    public boolean containsMarks(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetMarks().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMarksMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMarks() {
      return getMarksMap();
    }
    /**
     * <pre>
     * Mutable user specified security marks belonging to the parent resource.
     * Constraints are as follows:
     *   * Keys and values are treated as case insensitive
     *   * Keys must be between 1 - 256 characters (inclusive)
     *   * Keys must be letters, numbers, underscores, or dashes
     *   * Values have leading and trailing whitespace trimmed, remaining
     *     characters must be between 1 - 4096 characters (inclusive)
     * </pre>
     *
     * <code>map&lt;string, string&gt; marks = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getMarksMap() {
      return internalGetMarks().getMap();
    }
    /**
     * <pre>
     * Mutable user specified security marks belonging to the parent resource.
     * Constraints are as follows:
     *   * Keys and values are treated as case insensitive
     *   * Keys must be between 1 - 256 characters (inclusive)
     *   * Keys must be letters, numbers, underscores, or dashes
     *   * Values have leading and trailing whitespace trimmed, remaining
     *     characters must be between 1 - 4096 characters (inclusive)
     * </pre>
     *
     * <code>map&lt;string, string&gt; marks = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getMarksOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMarks().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Mutable user specified security marks belonging to the parent resource.
     * Constraints are as follows:
     *   * Keys and values are treated as case insensitive
     *   * Keys must be between 1 - 256 characters (inclusive)
     *   * Keys must be letters, numbers, underscores, or dashes
     *   * Values have leading and trailing whitespace trimmed, remaining
     *     characters must be between 1 - 4096 characters (inclusive)
     * </pre>
     *
     * <code>map&lt;string, string&gt; marks = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getMarksOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMarks().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMarks() {
      internalGetMutableMarks().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Mutable user specified security marks belonging to the parent resource.
     * Constraints are as follows:
     *   * Keys and values are treated as case insensitive
     *   * Keys must be between 1 - 256 characters (inclusive)
     *   * Keys must be letters, numbers, underscores, or dashes
     *   * Values have leading and trailing whitespace trimmed, remaining
     *     characters must be between 1 - 4096 characters (inclusive)
     * </pre>
     *
     * <code>map&lt;string, string&gt; marks = 2;</code>
     */

    public Builder removeMarks(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableMarks().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableMarks() {
      return internalGetMutableMarks().getMutableMap();
    }
    /**
     * <pre>
     * Mutable user specified security marks belonging to the parent resource.
     * Constraints are as follows:
     *   * Keys and values are treated as case insensitive
     *   * Keys must be between 1 - 256 characters (inclusive)
     *   * Keys must be letters, numbers, underscores, or dashes
     *   * Values have leading and trailing whitespace trimmed, remaining
     *     characters must be between 1 - 4096 characters (inclusive)
     * </pre>
     *
     * <code>map&lt;string, string&gt; marks = 2;</code>
     */
    public Builder putMarks(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableMarks().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Mutable user specified security marks belonging to the parent resource.
     * Constraints are as follows:
     *   * Keys and values are treated as case insensitive
     *   * Keys must be between 1 - 256 characters (inclusive)
     *   * Keys must be letters, numbers, underscores, or dashes
     *   * Values have leading and trailing whitespace trimmed, remaining
     *     characters must be between 1 - 4096 characters (inclusive)
     * </pre>
     *
     * <code>map&lt;string, string&gt; marks = 2;</code>
     */

    public Builder putAllMarks(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMarks().getMutableMap()
          .putAll(values);
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1beta1.SecurityMarks)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1beta1.SecurityMarks)
  private static final com.google.cloud.securitycenter.v1beta1.SecurityMarks DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1beta1.SecurityMarks();
  }

  public static com.google.cloud.securitycenter.v1beta1.SecurityMarks getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityMarks>
      PARSER = new com.google.protobuf.AbstractParser<SecurityMarks>() {
    @java.lang.Override
    public SecurityMarks parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SecurityMarks(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SecurityMarks> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityMarks> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1beta1.SecurityMarks getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

