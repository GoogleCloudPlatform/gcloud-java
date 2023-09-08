// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/script/type/docs/docs_addon_manifest.proto

package com.google.apps.script.type.docs;

/**
 * <pre>
 * Docs add-on manifest.
 * </pre>
 *
 * Protobuf type {@code google.apps.script.type.docs.DocsAddOnManifest}
 */
public final class DocsAddOnManifest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.apps.script.type.docs.DocsAddOnManifest)
    DocsAddOnManifestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DocsAddOnManifest.newBuilder() to construct.
  private DocsAddOnManifest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocsAddOnManifest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DocsAddOnManifest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.apps.script.type.docs.DocsAddOnManifestProto.internal_static_google_apps_script_type_docs_DocsAddOnManifest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.script.type.docs.DocsAddOnManifestProto.internal_static_google_apps_script_type_docs_DocsAddOnManifest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.script.type.docs.DocsAddOnManifest.class, com.google.apps.script.type.docs.DocsAddOnManifest.Builder.class);
  }

  public static final int HOMEPAGE_TRIGGER_FIELD_NUMBER = 1;
  private com.google.apps.script.type.HomepageExtensionPoint homepageTrigger_;
  /**
   * <pre>
   * If present, this overrides the configuration from
   * `addOns.common.homepageTrigger`.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
   * @return Whether the homepageTrigger field is set.
   */
  @java.lang.Override
  public boolean hasHomepageTrigger() {
    return homepageTrigger_ != null;
  }
  /**
   * <pre>
   * If present, this overrides the configuration from
   * `addOns.common.homepageTrigger`.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
   * @return The homepageTrigger.
   */
  @java.lang.Override
  public com.google.apps.script.type.HomepageExtensionPoint getHomepageTrigger() {
    return homepageTrigger_ == null ? com.google.apps.script.type.HomepageExtensionPoint.getDefaultInstance() : homepageTrigger_;
  }
  /**
   * <pre>
   * If present, this overrides the configuration from
   * `addOns.common.homepageTrigger`.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
   */
  @java.lang.Override
  public com.google.apps.script.type.HomepageExtensionPointOrBuilder getHomepageTriggerOrBuilder() {
    return homepageTrigger_ == null ? com.google.apps.script.type.HomepageExtensionPoint.getDefaultInstance() : homepageTrigger_;
  }

  public static final int ON_FILE_SCOPE_GRANTED_TRIGGER_FIELD_NUMBER = 2;
  private com.google.apps.script.type.docs.DocsExtensionPoint onFileScopeGrantedTrigger_;
  /**
   * <pre>
   * Endpoint to execute when file scope authorization is granted
   * for this document/user pair.
   * </pre>
   *
   * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
   * @return Whether the onFileScopeGrantedTrigger field is set.
   */
  @java.lang.Override
  public boolean hasOnFileScopeGrantedTrigger() {
    return onFileScopeGrantedTrigger_ != null;
  }
  /**
   * <pre>
   * Endpoint to execute when file scope authorization is granted
   * for this document/user pair.
   * </pre>
   *
   * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
   * @return The onFileScopeGrantedTrigger.
   */
  @java.lang.Override
  public com.google.apps.script.type.docs.DocsExtensionPoint getOnFileScopeGrantedTrigger() {
    return onFileScopeGrantedTrigger_ == null ? com.google.apps.script.type.docs.DocsExtensionPoint.getDefaultInstance() : onFileScopeGrantedTrigger_;
  }
  /**
   * <pre>
   * Endpoint to execute when file scope authorization is granted
   * for this document/user pair.
   * </pre>
   *
   * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
   */
  @java.lang.Override
  public com.google.apps.script.type.docs.DocsExtensionPointOrBuilder getOnFileScopeGrantedTriggerOrBuilder() {
    return onFileScopeGrantedTrigger_ == null ? com.google.apps.script.type.docs.DocsExtensionPoint.getDefaultInstance() : onFileScopeGrantedTrigger_;
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
    if (homepageTrigger_ != null) {
      output.writeMessage(1, getHomepageTrigger());
    }
    if (onFileScopeGrantedTrigger_ != null) {
      output.writeMessage(2, getOnFileScopeGrantedTrigger());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (homepageTrigger_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHomepageTrigger());
    }
    if (onFileScopeGrantedTrigger_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOnFileScopeGrantedTrigger());
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
    if (!(obj instanceof com.google.apps.script.type.docs.DocsAddOnManifest)) {
      return super.equals(obj);
    }
    com.google.apps.script.type.docs.DocsAddOnManifest other = (com.google.apps.script.type.docs.DocsAddOnManifest) obj;

    if (hasHomepageTrigger() != other.hasHomepageTrigger()) return false;
    if (hasHomepageTrigger()) {
      if (!getHomepageTrigger()
          .equals(other.getHomepageTrigger())) return false;
    }
    if (hasOnFileScopeGrantedTrigger() != other.hasOnFileScopeGrantedTrigger()) return false;
    if (hasOnFileScopeGrantedTrigger()) {
      if (!getOnFileScopeGrantedTrigger()
          .equals(other.getOnFileScopeGrantedTrigger())) return false;
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
    if (hasHomepageTrigger()) {
      hash = (37 * hash) + HOMEPAGE_TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getHomepageTrigger().hashCode();
    }
    if (hasOnFileScopeGrantedTrigger()) {
      hash = (37 * hash) + ON_FILE_SCOPE_GRANTED_TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getOnFileScopeGrantedTrigger().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.script.type.docs.DocsAddOnManifest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.script.type.docs.DocsAddOnManifest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.script.type.docs.DocsAddOnManifest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.script.type.docs.DocsAddOnManifest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.script.type.docs.DocsAddOnManifest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.script.type.docs.DocsAddOnManifest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.script.type.docs.DocsAddOnManifest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.script.type.docs.DocsAddOnManifest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.docs.DocsAddOnManifest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.docs.DocsAddOnManifest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.script.type.docs.DocsAddOnManifest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.script.type.docs.DocsAddOnManifest parseFrom(
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
  public static Builder newBuilder(com.google.apps.script.type.docs.DocsAddOnManifest prototype) {
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
   * Docs add-on manifest.
   * </pre>
   *
   * Protobuf type {@code google.apps.script.type.docs.DocsAddOnManifest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.apps.script.type.docs.DocsAddOnManifest)
      com.google.apps.script.type.docs.DocsAddOnManifestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.apps.script.type.docs.DocsAddOnManifestProto.internal_static_google_apps_script_type_docs_DocsAddOnManifest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.script.type.docs.DocsAddOnManifestProto.internal_static_google_apps_script_type_docs_DocsAddOnManifest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.script.type.docs.DocsAddOnManifest.class, com.google.apps.script.type.docs.DocsAddOnManifest.Builder.class);
    }

    // Construct using com.google.apps.script.type.docs.DocsAddOnManifest.newBuilder()
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
      homepageTrigger_ = null;
      if (homepageTriggerBuilder_ != null) {
        homepageTriggerBuilder_.dispose();
        homepageTriggerBuilder_ = null;
      }
      onFileScopeGrantedTrigger_ = null;
      if (onFileScopeGrantedTriggerBuilder_ != null) {
        onFileScopeGrantedTriggerBuilder_.dispose();
        onFileScopeGrantedTriggerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.apps.script.type.docs.DocsAddOnManifestProto.internal_static_google_apps_script_type_docs_DocsAddOnManifest_descriptor;
    }

    @java.lang.Override
    public com.google.apps.script.type.docs.DocsAddOnManifest getDefaultInstanceForType() {
      return com.google.apps.script.type.docs.DocsAddOnManifest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.script.type.docs.DocsAddOnManifest build() {
      com.google.apps.script.type.docs.DocsAddOnManifest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.script.type.docs.DocsAddOnManifest buildPartial() {
      com.google.apps.script.type.docs.DocsAddOnManifest result = new com.google.apps.script.type.docs.DocsAddOnManifest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.script.type.docs.DocsAddOnManifest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.homepageTrigger_ = homepageTriggerBuilder_ == null
            ? homepageTrigger_
            : homepageTriggerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.onFileScopeGrantedTrigger_ = onFileScopeGrantedTriggerBuilder_ == null
            ? onFileScopeGrantedTrigger_
            : onFileScopeGrantedTriggerBuilder_.build();
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
      if (other instanceof com.google.apps.script.type.docs.DocsAddOnManifest) {
        return mergeFrom((com.google.apps.script.type.docs.DocsAddOnManifest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.script.type.docs.DocsAddOnManifest other) {
      if (other == com.google.apps.script.type.docs.DocsAddOnManifest.getDefaultInstance()) return this;
      if (other.hasHomepageTrigger()) {
        mergeHomepageTrigger(other.getHomepageTrigger());
      }
      if (other.hasOnFileScopeGrantedTrigger()) {
        mergeOnFileScopeGrantedTrigger(other.getOnFileScopeGrantedTrigger());
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
            case 10: {
              input.readMessage(
                  getHomepageTriggerFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getOnFileScopeGrantedTriggerFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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
    private int bitField0_;

    private com.google.apps.script.type.HomepageExtensionPoint homepageTrigger_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.script.type.HomepageExtensionPoint, com.google.apps.script.type.HomepageExtensionPoint.Builder, com.google.apps.script.type.HomepageExtensionPointOrBuilder> homepageTriggerBuilder_;
    /**
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
     * @return Whether the homepageTrigger field is set.
     */
    public boolean hasHomepageTrigger() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
     * @return The homepageTrigger.
     */
    public com.google.apps.script.type.HomepageExtensionPoint getHomepageTrigger() {
      if (homepageTriggerBuilder_ == null) {
        return homepageTrigger_ == null ? com.google.apps.script.type.HomepageExtensionPoint.getDefaultInstance() : homepageTrigger_;
      } else {
        return homepageTriggerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
     */
    public Builder setHomepageTrigger(com.google.apps.script.type.HomepageExtensionPoint value) {
      if (homepageTriggerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        homepageTrigger_ = value;
      } else {
        homepageTriggerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
     */
    public Builder setHomepageTrigger(
        com.google.apps.script.type.HomepageExtensionPoint.Builder builderForValue) {
      if (homepageTriggerBuilder_ == null) {
        homepageTrigger_ = builderForValue.build();
      } else {
        homepageTriggerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
     */
    public Builder mergeHomepageTrigger(com.google.apps.script.type.HomepageExtensionPoint value) {
      if (homepageTriggerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          homepageTrigger_ != null &&
          homepageTrigger_ != com.google.apps.script.type.HomepageExtensionPoint.getDefaultInstance()) {
          getHomepageTriggerBuilder().mergeFrom(value);
        } else {
          homepageTrigger_ = value;
        }
      } else {
        homepageTriggerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
     */
    public Builder clearHomepageTrigger() {
      bitField0_ = (bitField0_ & ~0x00000001);
      homepageTrigger_ = null;
      if (homepageTriggerBuilder_ != null) {
        homepageTriggerBuilder_.dispose();
        homepageTriggerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
     */
    public com.google.apps.script.type.HomepageExtensionPoint.Builder getHomepageTriggerBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHomepageTriggerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
     */
    public com.google.apps.script.type.HomepageExtensionPointOrBuilder getHomepageTriggerOrBuilder() {
      if (homepageTriggerBuilder_ != null) {
        return homepageTriggerBuilder_.getMessageOrBuilder();
      } else {
        return homepageTrigger_ == null ?
            com.google.apps.script.type.HomepageExtensionPoint.getDefaultInstance() : homepageTrigger_;
      }
    }
    /**
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.script.type.HomepageExtensionPoint, com.google.apps.script.type.HomepageExtensionPoint.Builder, com.google.apps.script.type.HomepageExtensionPointOrBuilder> 
        getHomepageTriggerFieldBuilder() {
      if (homepageTriggerBuilder_ == null) {
        homepageTriggerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.script.type.HomepageExtensionPoint, com.google.apps.script.type.HomepageExtensionPoint.Builder, com.google.apps.script.type.HomepageExtensionPointOrBuilder>(
                getHomepageTrigger(),
                getParentForChildren(),
                isClean());
        homepageTrigger_ = null;
      }
      return homepageTriggerBuilder_;
    }

    private com.google.apps.script.type.docs.DocsExtensionPoint onFileScopeGrantedTrigger_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.script.type.docs.DocsExtensionPoint, com.google.apps.script.type.docs.DocsExtensionPoint.Builder, com.google.apps.script.type.docs.DocsExtensionPointOrBuilder> onFileScopeGrantedTriggerBuilder_;
    /**
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
     * @return Whether the onFileScopeGrantedTrigger field is set.
     */
    public boolean hasOnFileScopeGrantedTrigger() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
     * @return The onFileScopeGrantedTrigger.
     */
    public com.google.apps.script.type.docs.DocsExtensionPoint getOnFileScopeGrantedTrigger() {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        return onFileScopeGrantedTrigger_ == null ? com.google.apps.script.type.docs.DocsExtensionPoint.getDefaultInstance() : onFileScopeGrantedTrigger_;
      } else {
        return onFileScopeGrantedTriggerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
     */
    public Builder setOnFileScopeGrantedTrigger(com.google.apps.script.type.docs.DocsExtensionPoint value) {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        onFileScopeGrantedTrigger_ = value;
      } else {
        onFileScopeGrantedTriggerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
     */
    public Builder setOnFileScopeGrantedTrigger(
        com.google.apps.script.type.docs.DocsExtensionPoint.Builder builderForValue) {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        onFileScopeGrantedTrigger_ = builderForValue.build();
      } else {
        onFileScopeGrantedTriggerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
     */
    public Builder mergeOnFileScopeGrantedTrigger(com.google.apps.script.type.docs.DocsExtensionPoint value) {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          onFileScopeGrantedTrigger_ != null &&
          onFileScopeGrantedTrigger_ != com.google.apps.script.type.docs.DocsExtensionPoint.getDefaultInstance()) {
          getOnFileScopeGrantedTriggerBuilder().mergeFrom(value);
        } else {
          onFileScopeGrantedTrigger_ = value;
        }
      } else {
        onFileScopeGrantedTriggerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
     */
    public Builder clearOnFileScopeGrantedTrigger() {
      bitField0_ = (bitField0_ & ~0x00000002);
      onFileScopeGrantedTrigger_ = null;
      if (onFileScopeGrantedTriggerBuilder_ != null) {
        onFileScopeGrantedTriggerBuilder_.dispose();
        onFileScopeGrantedTriggerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
     */
    public com.google.apps.script.type.docs.DocsExtensionPoint.Builder getOnFileScopeGrantedTriggerBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOnFileScopeGrantedTriggerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
     */
    public com.google.apps.script.type.docs.DocsExtensionPointOrBuilder getOnFileScopeGrantedTriggerOrBuilder() {
      if (onFileScopeGrantedTriggerBuilder_ != null) {
        return onFileScopeGrantedTriggerBuilder_.getMessageOrBuilder();
      } else {
        return onFileScopeGrantedTrigger_ == null ?
            com.google.apps.script.type.docs.DocsExtensionPoint.getDefaultInstance() : onFileScopeGrantedTrigger_;
      }
    }
    /**
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.docs.DocsExtensionPoint on_file_scope_granted_trigger = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.script.type.docs.DocsExtensionPoint, com.google.apps.script.type.docs.DocsExtensionPoint.Builder, com.google.apps.script.type.docs.DocsExtensionPointOrBuilder> 
        getOnFileScopeGrantedTriggerFieldBuilder() {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        onFileScopeGrantedTriggerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.script.type.docs.DocsExtensionPoint, com.google.apps.script.type.docs.DocsExtensionPoint.Builder, com.google.apps.script.type.docs.DocsExtensionPointOrBuilder>(
                getOnFileScopeGrantedTrigger(),
                getParentForChildren(),
                isClean());
        onFileScopeGrantedTrigger_ = null;
      }
      return onFileScopeGrantedTriggerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.apps.script.type.docs.DocsAddOnManifest)
  }

  // @@protoc_insertion_point(class_scope:google.apps.script.type.docs.DocsAddOnManifest)
  private static final com.google.apps.script.type.docs.DocsAddOnManifest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.apps.script.type.docs.DocsAddOnManifest();
  }

  public static com.google.apps.script.type.docs.DocsAddOnManifest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocsAddOnManifest>
      PARSER = new com.google.protobuf.AbstractParser<DocsAddOnManifest>() {
    @java.lang.Override
    public DocsAddOnManifest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocsAddOnManifest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocsAddOnManifest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.script.type.docs.DocsAddOnManifest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

