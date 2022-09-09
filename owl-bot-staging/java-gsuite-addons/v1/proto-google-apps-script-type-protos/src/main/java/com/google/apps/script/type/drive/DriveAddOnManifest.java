// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/script/type/drive/drive_addon_manifest.proto

package com.google.apps.script.type.drive;

/**
 * <pre>
 * Drive add-on manifest.
 * </pre>
 *
 * Protobuf type {@code google.apps.script.type.drive.DriveAddOnManifest}
 */
public final class DriveAddOnManifest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.apps.script.type.drive.DriveAddOnManifest)
    DriveAddOnManifestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DriveAddOnManifest.newBuilder() to construct.
  private DriveAddOnManifest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DriveAddOnManifest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DriveAddOnManifest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DriveAddOnManifest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.google.apps.script.type.HomepageExtensionPoint.Builder subBuilder = null;
            if (homepageTrigger_ != null) {
              subBuilder = homepageTrigger_.toBuilder();
            }
            homepageTrigger_ = input.readMessage(com.google.apps.script.type.HomepageExtensionPoint.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(homepageTrigger_);
              homepageTrigger_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.apps.script.type.drive.DriveExtensionPoint.Builder subBuilder = null;
            if (onItemsSelectedTrigger_ != null) {
              subBuilder = onItemsSelectedTrigger_.toBuilder();
            }
            onItemsSelectedTrigger_ = input.readMessage(com.google.apps.script.type.drive.DriveExtensionPoint.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(onItemsSelectedTrigger_);
              onItemsSelectedTrigger_ = subBuilder.buildPartial();
            }

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
    return com.google.apps.script.type.drive.DriveAddOnManifestProto.internal_static_google_apps_script_type_drive_DriveAddOnManifest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.script.type.drive.DriveAddOnManifestProto.internal_static_google_apps_script_type_drive_DriveAddOnManifest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.script.type.drive.DriveAddOnManifest.class, com.google.apps.script.type.drive.DriveAddOnManifest.Builder.class);
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
    return getHomepageTrigger();
  }

  public static final int ON_ITEMS_SELECTED_TRIGGER_FIELD_NUMBER = 2;
  private com.google.apps.script.type.drive.DriveExtensionPoint onItemsSelectedTrigger_;
  /**
   * <pre>
   * Corresponds to behvior that should execute when items are selected
   * in relevant Drive view (e.g. the My Drive Doclist).
   * </pre>
   *
   * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
   * @return Whether the onItemsSelectedTrigger field is set.
   */
  @java.lang.Override
  public boolean hasOnItemsSelectedTrigger() {
    return onItemsSelectedTrigger_ != null;
  }
  /**
   * <pre>
   * Corresponds to behvior that should execute when items are selected
   * in relevant Drive view (e.g. the My Drive Doclist).
   * </pre>
   *
   * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
   * @return The onItemsSelectedTrigger.
   */
  @java.lang.Override
  public com.google.apps.script.type.drive.DriveExtensionPoint getOnItemsSelectedTrigger() {
    return onItemsSelectedTrigger_ == null ? com.google.apps.script.type.drive.DriveExtensionPoint.getDefaultInstance() : onItemsSelectedTrigger_;
  }
  /**
   * <pre>
   * Corresponds to behvior that should execute when items are selected
   * in relevant Drive view (e.g. the My Drive Doclist).
   * </pre>
   *
   * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
   */
  @java.lang.Override
  public com.google.apps.script.type.drive.DriveExtensionPointOrBuilder getOnItemsSelectedTriggerOrBuilder() {
    return getOnItemsSelectedTrigger();
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
    if (onItemsSelectedTrigger_ != null) {
      output.writeMessage(2, getOnItemsSelectedTrigger());
    }
    unknownFields.writeTo(output);
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
    if (onItemsSelectedTrigger_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOnItemsSelectedTrigger());
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
    if (!(obj instanceof com.google.apps.script.type.drive.DriveAddOnManifest)) {
      return super.equals(obj);
    }
    com.google.apps.script.type.drive.DriveAddOnManifest other = (com.google.apps.script.type.drive.DriveAddOnManifest) obj;

    if (hasHomepageTrigger() != other.hasHomepageTrigger()) return false;
    if (hasHomepageTrigger()) {
      if (!getHomepageTrigger()
          .equals(other.getHomepageTrigger())) return false;
    }
    if (hasOnItemsSelectedTrigger() != other.hasOnItemsSelectedTrigger()) return false;
    if (hasOnItemsSelectedTrigger()) {
      if (!getOnItemsSelectedTrigger()
          .equals(other.getOnItemsSelectedTrigger())) return false;
    }
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
    if (hasHomepageTrigger()) {
      hash = (37 * hash) + HOMEPAGE_TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getHomepageTrigger().hashCode();
    }
    if (hasOnItemsSelectedTrigger()) {
      hash = (37 * hash) + ON_ITEMS_SELECTED_TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getOnItemsSelectedTrigger().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.script.type.drive.DriveAddOnManifest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.apps.script.type.drive.DriveAddOnManifest parseFrom(
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
  public static Builder newBuilder(com.google.apps.script.type.drive.DriveAddOnManifest prototype) {
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
   * Drive add-on manifest.
   * </pre>
   *
   * Protobuf type {@code google.apps.script.type.drive.DriveAddOnManifest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.apps.script.type.drive.DriveAddOnManifest)
      com.google.apps.script.type.drive.DriveAddOnManifestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.apps.script.type.drive.DriveAddOnManifestProto.internal_static_google_apps_script_type_drive_DriveAddOnManifest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.script.type.drive.DriveAddOnManifestProto.internal_static_google_apps_script_type_drive_DriveAddOnManifest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.script.type.drive.DriveAddOnManifest.class, com.google.apps.script.type.drive.DriveAddOnManifest.Builder.class);
    }

    // Construct using com.google.apps.script.type.drive.DriveAddOnManifest.newBuilder()
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
      if (homepageTriggerBuilder_ == null) {
        homepageTrigger_ = null;
      } else {
        homepageTrigger_ = null;
        homepageTriggerBuilder_ = null;
      }
      if (onItemsSelectedTriggerBuilder_ == null) {
        onItemsSelectedTrigger_ = null;
      } else {
        onItemsSelectedTrigger_ = null;
        onItemsSelectedTriggerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.apps.script.type.drive.DriveAddOnManifestProto.internal_static_google_apps_script_type_drive_DriveAddOnManifest_descriptor;
    }

    @java.lang.Override
    public com.google.apps.script.type.drive.DriveAddOnManifest getDefaultInstanceForType() {
      return com.google.apps.script.type.drive.DriveAddOnManifest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.script.type.drive.DriveAddOnManifest build() {
      com.google.apps.script.type.drive.DriveAddOnManifest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.script.type.drive.DriveAddOnManifest buildPartial() {
      com.google.apps.script.type.drive.DriveAddOnManifest result = new com.google.apps.script.type.drive.DriveAddOnManifest(this);
      if (homepageTriggerBuilder_ == null) {
        result.homepageTrigger_ = homepageTrigger_;
      } else {
        result.homepageTrigger_ = homepageTriggerBuilder_.build();
      }
      if (onItemsSelectedTriggerBuilder_ == null) {
        result.onItemsSelectedTrigger_ = onItemsSelectedTrigger_;
      } else {
        result.onItemsSelectedTrigger_ = onItemsSelectedTriggerBuilder_.build();
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
      if (other instanceof com.google.apps.script.type.drive.DriveAddOnManifest) {
        return mergeFrom((com.google.apps.script.type.drive.DriveAddOnManifest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.script.type.drive.DriveAddOnManifest other) {
      if (other == com.google.apps.script.type.drive.DriveAddOnManifest.getDefaultInstance()) return this;
      if (other.hasHomepageTrigger()) {
        mergeHomepageTrigger(other.getHomepageTrigger());
      }
      if (other.hasOnItemsSelectedTrigger()) {
        mergeOnItemsSelectedTrigger(other.getOnItemsSelectedTrigger());
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
      com.google.apps.script.type.drive.DriveAddOnManifest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.apps.script.type.drive.DriveAddOnManifest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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
      return homepageTriggerBuilder_ != null || homepageTrigger_ != null;
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
        onChanged();
      } else {
        homepageTriggerBuilder_.setMessage(value);
      }

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
        onChanged();
      } else {
        homepageTriggerBuilder_.setMessage(builderForValue.build());
      }

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
        if (homepageTrigger_ != null) {
          homepageTrigger_ =
            com.google.apps.script.type.HomepageExtensionPoint.newBuilder(homepageTrigger_).mergeFrom(value).buildPartial();
        } else {
          homepageTrigger_ = value;
        }
        onChanged();
      } else {
        homepageTriggerBuilder_.mergeFrom(value);
      }

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
      if (homepageTriggerBuilder_ == null) {
        homepageTrigger_ = null;
        onChanged();
      } else {
        homepageTrigger_ = null;
        homepageTriggerBuilder_ = null;
      }

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

    private com.google.apps.script.type.drive.DriveExtensionPoint onItemsSelectedTrigger_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.script.type.drive.DriveExtensionPoint, com.google.apps.script.type.drive.DriveExtensionPoint.Builder, com.google.apps.script.type.drive.DriveExtensionPointOrBuilder> onItemsSelectedTriggerBuilder_;
    /**
     * <pre>
     * Corresponds to behvior that should execute when items are selected
     * in relevant Drive view (e.g. the My Drive Doclist).
     * </pre>
     *
     * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
     * @return Whether the onItemsSelectedTrigger field is set.
     */
    public boolean hasOnItemsSelectedTrigger() {
      return onItemsSelectedTriggerBuilder_ != null || onItemsSelectedTrigger_ != null;
    }
    /**
     * <pre>
     * Corresponds to behvior that should execute when items are selected
     * in relevant Drive view (e.g. the My Drive Doclist).
     * </pre>
     *
     * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
     * @return The onItemsSelectedTrigger.
     */
    public com.google.apps.script.type.drive.DriveExtensionPoint getOnItemsSelectedTrigger() {
      if (onItemsSelectedTriggerBuilder_ == null) {
        return onItemsSelectedTrigger_ == null ? com.google.apps.script.type.drive.DriveExtensionPoint.getDefaultInstance() : onItemsSelectedTrigger_;
      } else {
        return onItemsSelectedTriggerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Corresponds to behvior that should execute when items are selected
     * in relevant Drive view (e.g. the My Drive Doclist).
     * </pre>
     *
     * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
     */
    public Builder setOnItemsSelectedTrigger(com.google.apps.script.type.drive.DriveExtensionPoint value) {
      if (onItemsSelectedTriggerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        onItemsSelectedTrigger_ = value;
        onChanged();
      } else {
        onItemsSelectedTriggerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Corresponds to behvior that should execute when items are selected
     * in relevant Drive view (e.g. the My Drive Doclist).
     * </pre>
     *
     * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
     */
    public Builder setOnItemsSelectedTrigger(
        com.google.apps.script.type.drive.DriveExtensionPoint.Builder builderForValue) {
      if (onItemsSelectedTriggerBuilder_ == null) {
        onItemsSelectedTrigger_ = builderForValue.build();
        onChanged();
      } else {
        onItemsSelectedTriggerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Corresponds to behvior that should execute when items are selected
     * in relevant Drive view (e.g. the My Drive Doclist).
     * </pre>
     *
     * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
     */
    public Builder mergeOnItemsSelectedTrigger(com.google.apps.script.type.drive.DriveExtensionPoint value) {
      if (onItemsSelectedTriggerBuilder_ == null) {
        if (onItemsSelectedTrigger_ != null) {
          onItemsSelectedTrigger_ =
            com.google.apps.script.type.drive.DriveExtensionPoint.newBuilder(onItemsSelectedTrigger_).mergeFrom(value).buildPartial();
        } else {
          onItemsSelectedTrigger_ = value;
        }
        onChanged();
      } else {
        onItemsSelectedTriggerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Corresponds to behvior that should execute when items are selected
     * in relevant Drive view (e.g. the My Drive Doclist).
     * </pre>
     *
     * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
     */
    public Builder clearOnItemsSelectedTrigger() {
      if (onItemsSelectedTriggerBuilder_ == null) {
        onItemsSelectedTrigger_ = null;
        onChanged();
      } else {
        onItemsSelectedTrigger_ = null;
        onItemsSelectedTriggerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Corresponds to behvior that should execute when items are selected
     * in relevant Drive view (e.g. the My Drive Doclist).
     * </pre>
     *
     * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
     */
    public com.google.apps.script.type.drive.DriveExtensionPoint.Builder getOnItemsSelectedTriggerBuilder() {
      
      onChanged();
      return getOnItemsSelectedTriggerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Corresponds to behvior that should execute when items are selected
     * in relevant Drive view (e.g. the My Drive Doclist).
     * </pre>
     *
     * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
     */
    public com.google.apps.script.type.drive.DriveExtensionPointOrBuilder getOnItemsSelectedTriggerOrBuilder() {
      if (onItemsSelectedTriggerBuilder_ != null) {
        return onItemsSelectedTriggerBuilder_.getMessageOrBuilder();
      } else {
        return onItemsSelectedTrigger_ == null ?
            com.google.apps.script.type.drive.DriveExtensionPoint.getDefaultInstance() : onItemsSelectedTrigger_;
      }
    }
    /**
     * <pre>
     * Corresponds to behvior that should execute when items are selected
     * in relevant Drive view (e.g. the My Drive Doclist).
     * </pre>
     *
     * <code>.google.apps.script.type.drive.DriveExtensionPoint on_items_selected_trigger = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.apps.script.type.drive.DriveExtensionPoint, com.google.apps.script.type.drive.DriveExtensionPoint.Builder, com.google.apps.script.type.drive.DriveExtensionPointOrBuilder> 
        getOnItemsSelectedTriggerFieldBuilder() {
      if (onItemsSelectedTriggerBuilder_ == null) {
        onItemsSelectedTriggerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.script.type.drive.DriveExtensionPoint, com.google.apps.script.type.drive.DriveExtensionPoint.Builder, com.google.apps.script.type.drive.DriveExtensionPointOrBuilder>(
                getOnItemsSelectedTrigger(),
                getParentForChildren(),
                isClean());
        onItemsSelectedTrigger_ = null;
      }
      return onItemsSelectedTriggerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.apps.script.type.drive.DriveAddOnManifest)
  }

  // @@protoc_insertion_point(class_scope:google.apps.script.type.drive.DriveAddOnManifest)
  private static final com.google.apps.script.type.drive.DriveAddOnManifest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.apps.script.type.drive.DriveAddOnManifest();
  }

  public static com.google.apps.script.type.drive.DriveAddOnManifest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DriveAddOnManifest>
      PARSER = new com.google.protobuf.AbstractParser<DriveAddOnManifest>() {
    @java.lang.Override
    public DriveAddOnManifest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DriveAddOnManifest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DriveAddOnManifest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DriveAddOnManifest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.script.type.drive.DriveAddOnManifest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

