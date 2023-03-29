/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/contentwarehouse/v1/document_service_request.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Request Option for processing Cloud AI Document in CW Document.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.CloudAIDocumentOption}
 */
public final class CloudAIDocumentOption extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.CloudAIDocumentOption)
    CloudAIDocumentOptionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CloudAIDocumentOption.newBuilder() to construct.
  private CloudAIDocumentOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CloudAIDocumentOption() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CloudAIDocumentOption();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
        .internal_static_google_cloud_contentwarehouse_v1_CloudAIDocumentOption_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetCustomizedEntitiesPropertiesConversions();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
        .internal_static_google_cloud_contentwarehouse_v1_CloudAIDocumentOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption.class,
            com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption.Builder.class);
  }

  public static final int ENABLE_ENTITIES_CONVERSIONS_FIELD_NUMBER = 1;
  private boolean enableEntitiesConversions_ = false;
  /**
   *
   *
   * <pre>
   * Whether to convert all the entities to properties.
   * </pre>
   *
   * <code>bool enable_entities_conversions = 1;</code>
   *
   * @return The enableEntitiesConversions.
   */
  @java.lang.Override
  public boolean getEnableEntitiesConversions() {
    return enableEntitiesConversions_;
  }

  public static final int CUSTOMIZED_ENTITIES_PROPERTIES_CONVERSIONS_FIELD_NUMBER = 2;

  private static final class CustomizedEntitiesPropertiesConversionsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
                .internal_static_google_cloud_contentwarehouse_v1_CloudAIDocumentOption_CustomizedEntitiesPropertiesConversionsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      customizedEntitiesPropertiesConversions_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetCustomizedEntitiesPropertiesConversions() {
    if (customizedEntitiesPropertiesConversions_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CustomizedEntitiesPropertiesConversionsDefaultEntryHolder.defaultEntry);
    }
    return customizedEntitiesPropertiesConversions_;
  }

  public int getCustomizedEntitiesPropertiesConversionsCount() {
    return internalGetCustomizedEntitiesPropertiesConversions().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * If set, only selected entities will be converted to properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
   */
  @java.lang.Override
  public boolean containsCustomizedEntitiesPropertiesConversions(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetCustomizedEntitiesPropertiesConversions().getMap().containsKey(key);
  }
  /** Use {@link #getCustomizedEntitiesPropertiesConversionsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String>
      getCustomizedEntitiesPropertiesConversions() {
    return getCustomizedEntitiesPropertiesConversionsMap();
  }
  /**
   *
   *
   * <pre>
   * If set, only selected entities will be converted to properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String>
      getCustomizedEntitiesPropertiesConversionsMap() {
    return internalGetCustomizedEntitiesPropertiesConversions().getMap();
  }
  /**
   *
   *
   * <pre>
   * If set, only selected entities will be converted to properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getCustomizedEntitiesPropertiesConversionsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetCustomizedEntitiesPropertiesConversions().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * If set, only selected entities will be converted to properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getCustomizedEntitiesPropertiesConversionsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetCustomizedEntitiesPropertiesConversions().getMap();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (enableEntitiesConversions_ != false) {
      output.writeBool(1, enableEntitiesConversions_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output,
        internalGetCustomizedEntitiesPropertiesConversions(),
        CustomizedEntitiesPropertiesConversionsDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableEntitiesConversions_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enableEntitiesConversions_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetCustomizedEntitiesPropertiesConversions().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
          customizedEntitiesPropertiesConversions__ =
              CustomizedEntitiesPropertiesConversionsDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, customizedEntitiesPropertiesConversions__);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption other =
        (com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption) obj;

    if (getEnableEntitiesConversions() != other.getEnableEntitiesConversions()) return false;
    if (!internalGetCustomizedEntitiesPropertiesConversions()
        .equals(other.internalGetCustomizedEntitiesPropertiesConversions())) return false;
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
    hash = (37 * hash) + ENABLE_ENTITIES_CONVERSIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableEntitiesConversions());
    if (!internalGetCustomizedEntitiesPropertiesConversions().getMap().isEmpty()) {
      hash = (37 * hash) + CUSTOMIZED_ENTITIES_PROPERTIES_CONVERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCustomizedEntitiesPropertiesConversions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption prototype) {
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
   * Request Option for processing Cloud AI Document in CW Document.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.CloudAIDocumentOption}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.CloudAIDocumentOption)
      com.google.cloud.contentwarehouse.v1.CloudAIDocumentOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
          .internal_static_google_cloud_contentwarehouse_v1_CloudAIDocumentOption_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetCustomizedEntitiesPropertiesConversions();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableCustomizedEntitiesPropertiesConversions();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
          .internal_static_google_cloud_contentwarehouse_v1_CloudAIDocumentOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption.class,
              com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enableEntitiesConversions_ = false;
      internalGetMutableCustomizedEntitiesPropertiesConversions().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentServiceRequestProto
          .internal_static_google_cloud_contentwarehouse_v1_CloudAIDocumentOption_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption build() {
      com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption buildPartial() {
      com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption result =
          new com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableEntitiesConversions_ = enableEntitiesConversions_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.customizedEntitiesPropertiesConversions_ =
            internalGetCustomizedEntitiesPropertiesConversions();
        result.customizedEntitiesPropertiesConversions_.makeImmutable();
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption other) {
      if (other == com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption.getDefaultInstance())
        return this;
      if (other.getEnableEntitiesConversions() != false) {
        setEnableEntitiesConversions(other.getEnableEntitiesConversions());
      }
      internalGetMutableCustomizedEntitiesPropertiesConversions()
          .mergeFrom(other.internalGetCustomizedEntitiesPropertiesConversions());
      bitField0_ |= 0x00000002;
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
                enableEntitiesConversions_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
                    customizedEntitiesPropertiesConversions__ =
                        input.readMessage(
                            CustomizedEntitiesPropertiesConversionsDefaultEntryHolder.defaultEntry
                                .getParserForType(),
                            extensionRegistry);
                internalGetMutableCustomizedEntitiesPropertiesConversions()
                    .getMutableMap()
                    .put(
                        customizedEntitiesPropertiesConversions__.getKey(),
                        customizedEntitiesPropertiesConversions__.getValue());
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

    private boolean enableEntitiesConversions_;
    /**
     *
     *
     * <pre>
     * Whether to convert all the entities to properties.
     * </pre>
     *
     * <code>bool enable_entities_conversions = 1;</code>
     *
     * @return The enableEntitiesConversions.
     */
    @java.lang.Override
    public boolean getEnableEntitiesConversions() {
      return enableEntitiesConversions_;
    }
    /**
     *
     *
     * <pre>
     * Whether to convert all the entities to properties.
     * </pre>
     *
     * <code>bool enable_entities_conversions = 1;</code>
     *
     * @param value The enableEntitiesConversions to set.
     * @return This builder for chaining.
     */
    public Builder setEnableEntitiesConversions(boolean value) {

      enableEntitiesConversions_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to convert all the entities to properties.
     * </pre>
     *
     * <code>bool enable_entities_conversions = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableEntitiesConversions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableEntitiesConversions_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        customizedEntitiesPropertiesConversions_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetCustomizedEntitiesPropertiesConversions() {
      if (customizedEntitiesPropertiesConversions_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CustomizedEntitiesPropertiesConversionsDefaultEntryHolder.defaultEntry);
      }
      return customizedEntitiesPropertiesConversions_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableCustomizedEntitiesPropertiesConversions() {
      if (customizedEntitiesPropertiesConversions_ == null) {
        customizedEntitiesPropertiesConversions_ =
            com.google.protobuf.MapField.newMapField(
                CustomizedEntitiesPropertiesConversionsDefaultEntryHolder.defaultEntry);
      }
      if (!customizedEntitiesPropertiesConversions_.isMutable()) {
        customizedEntitiesPropertiesConversions_ = customizedEntitiesPropertiesConversions_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return customizedEntitiesPropertiesConversions_;
    }

    public int getCustomizedEntitiesPropertiesConversionsCount() {
      return internalGetCustomizedEntitiesPropertiesConversions().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * If set, only selected entities will be converted to properties.
     * </pre>
     *
     * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
     */
    @java.lang.Override
    public boolean containsCustomizedEntitiesPropertiesConversions(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetCustomizedEntitiesPropertiesConversions().getMap().containsKey(key);
    }
    /** Use {@link #getCustomizedEntitiesPropertiesConversionsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getCustomizedEntitiesPropertiesConversions() {
      return getCustomizedEntitiesPropertiesConversionsMap();
    }
    /**
     *
     *
     * <pre>
     * If set, only selected entities will be converted to properties.
     * </pre>
     *
     * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String>
        getCustomizedEntitiesPropertiesConversionsMap() {
      return internalGetCustomizedEntitiesPropertiesConversions().getMap();
    }
    /**
     *
     *
     * <pre>
     * If set, only selected entities will be converted to properties.
     * </pre>
     *
     * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getCustomizedEntitiesPropertiesConversionsOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetCustomizedEntitiesPropertiesConversions().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * If set, only selected entities will be converted to properties.
     * </pre>
     *
     * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getCustomizedEntitiesPropertiesConversionsOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetCustomizedEntitiesPropertiesConversions().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearCustomizedEntitiesPropertiesConversions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableCustomizedEntitiesPropertiesConversions().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, only selected entities will be converted to properties.
     * </pre>
     *
     * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
     */
    public Builder removeCustomizedEntitiesPropertiesConversions(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableCustomizedEntitiesPropertiesConversions().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableCustomizedEntitiesPropertiesConversions() {
      bitField0_ |= 0x00000002;
      return internalGetMutableCustomizedEntitiesPropertiesConversions().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * If set, only selected entities will be converted to properties.
     * </pre>
     *
     * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
     */
    public Builder putCustomizedEntitiesPropertiesConversions(
        java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableCustomizedEntitiesPropertiesConversions().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, only selected entities will be converted to properties.
     * </pre>
     *
     * <code>map&lt;string, string&gt; customized_entities_properties_conversions = 2;</code>
     */
    public Builder putAllCustomizedEntitiesPropertiesConversions(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableCustomizedEntitiesPropertiesConversions().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.CloudAIDocumentOption)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.CloudAIDocumentOption)
  private static final com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption();
  }

  public static com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudAIDocumentOption> PARSER =
      new com.google.protobuf.AbstractParser<CloudAIDocumentOption>() {
        @java.lang.Override
        public CloudAIDocumentOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudAIDocumentOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudAIDocumentOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.CloudAIDocumentOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
