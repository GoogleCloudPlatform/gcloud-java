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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.2
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Snapshot of the configurations used to generate the profile.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DataProfileConfigSnapshot}
 */
public final class DataProfileConfigSnapshot extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DataProfileConfigSnapshot)
    DataProfileConfigSnapshotOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataProfileConfigSnapshot.newBuilder() to construct.
  private DataProfileConfigSnapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataProfileConfigSnapshot() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataProfileConfigSnapshot();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DataProfileConfigSnapshot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DataProfileConfigSnapshot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DataProfileConfigSnapshot.class,
            com.google.privacy.dlp.v2.DataProfileConfigSnapshot.Builder.class);
  }

  private int bitField0_;
  public static final int INSPECT_CONFIG_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.InspectConfig inspectConfig_;
  /**
   *
   *
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   *
   * @return Whether the inspectConfig field is set.
   */
  @java.lang.Override
  public boolean hasInspectConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   *
   * @return The inspectConfig.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InspectConfig getInspectConfig() {
    return inspectConfig_ == null
        ? com.google.privacy.dlp.v2.InspectConfig.getDefaultInstance()
        : inspectConfig_;
  }
  /**
   *
   *
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder() {
    return inspectConfig_ == null
        ? com.google.privacy.dlp.v2.InspectConfig.getDefaultInstance()
        : inspectConfig_;
  }

  public static final int DATA_PROFILE_JOB_FIELD_NUMBER = 3;
  private com.google.privacy.dlp.v2.DataProfileJobConfig dataProfileJob_;
  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
   *
   * @return Whether the dataProfileJob field is set.
   */
  @java.lang.Override
  public boolean hasDataProfileJob() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
   *
   * @return The dataProfileJob.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DataProfileJobConfig getDataProfileJob() {
    return dataProfileJob_ == null
        ? com.google.privacy.dlp.v2.DataProfileJobConfig.getDefaultInstance()
        : dataProfileJob_;
  }
  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder getDataProfileJobOrBuilder() {
    return dataProfileJob_ == null
        ? com.google.privacy.dlp.v2.DataProfileJobConfig.getDefaultInstance()
        : dataProfileJob_;
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
      output.writeMessage(2, getInspectConfig());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getDataProfileJob());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getInspectConfig());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getDataProfileJob());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.DataProfileConfigSnapshot)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DataProfileConfigSnapshot other =
        (com.google.privacy.dlp.v2.DataProfileConfigSnapshot) obj;

    if (hasInspectConfig() != other.hasInspectConfig()) return false;
    if (hasInspectConfig()) {
      if (!getInspectConfig().equals(other.getInspectConfig())) return false;
    }
    if (hasDataProfileJob() != other.hasDataProfileJob()) return false;
    if (hasDataProfileJob()) {
      if (!getDataProfileJob().equals(other.getDataProfileJob())) return false;
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
    if (hasInspectConfig()) {
      hash = (37 * hash) + INSPECT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInspectConfig().hashCode();
    }
    if (hasDataProfileJob()) {
      hash = (37 * hash) + DATA_PROFILE_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getDataProfileJob().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.DataProfileConfigSnapshot prototype) {
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
   * Snapshot of the configurations used to generate the profile.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DataProfileConfigSnapshot}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DataProfileConfigSnapshot)
      com.google.privacy.dlp.v2.DataProfileConfigSnapshotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DataProfileConfigSnapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DataProfileConfigSnapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DataProfileConfigSnapshot.class,
              com.google.privacy.dlp.v2.DataProfileConfigSnapshot.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DataProfileConfigSnapshot.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getInspectConfigFieldBuilder();
        getDataProfileJobFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      inspectConfig_ = null;
      if (inspectConfigBuilder_ != null) {
        inspectConfigBuilder_.dispose();
        inspectConfigBuilder_ = null;
      }
      dataProfileJob_ = null;
      if (dataProfileJobBuilder_ != null) {
        dataProfileJobBuilder_.dispose();
        dataProfileJobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DataProfileConfigSnapshot_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileConfigSnapshot getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DataProfileConfigSnapshot.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileConfigSnapshot build() {
      com.google.privacy.dlp.v2.DataProfileConfigSnapshot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileConfigSnapshot buildPartial() {
      com.google.privacy.dlp.v2.DataProfileConfigSnapshot result =
          new com.google.privacy.dlp.v2.DataProfileConfigSnapshot(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.DataProfileConfigSnapshot result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inspectConfig_ =
            inspectConfigBuilder_ == null ? inspectConfig_ : inspectConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataProfileJob_ =
            dataProfileJobBuilder_ == null ? dataProfileJob_ : dataProfileJobBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.privacy.dlp.v2.DataProfileConfigSnapshot) {
        return mergeFrom((com.google.privacy.dlp.v2.DataProfileConfigSnapshot) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DataProfileConfigSnapshot other) {
      if (other == com.google.privacy.dlp.v2.DataProfileConfigSnapshot.getDefaultInstance())
        return this;
      if (other.hasInspectConfig()) {
        mergeInspectConfig(other.getInspectConfig());
      }
      if (other.hasDataProfileJob()) {
        mergeDataProfileJob(other.getDataProfileJob());
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
            case 18:
              {
                input.readMessage(getInspectConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getDataProfileJobFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 26
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

    private com.google.privacy.dlp.v2.InspectConfig inspectConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.InspectConfig,
            com.google.privacy.dlp.v2.InspectConfig.Builder,
            com.google.privacy.dlp.v2.InspectConfigOrBuilder>
        inspectConfigBuilder_;
    /**
     *
     *
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     *
     * @return Whether the inspectConfig field is set.
     */
    public boolean hasInspectConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     *
     * @return The inspectConfig.
     */
    public com.google.privacy.dlp.v2.InspectConfig getInspectConfig() {
      if (inspectConfigBuilder_ == null) {
        return inspectConfig_ == null
            ? com.google.privacy.dlp.v2.InspectConfig.getDefaultInstance()
            : inspectConfig_;
      } else {
        return inspectConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public Builder setInspectConfig(com.google.privacy.dlp.v2.InspectConfig value) {
      if (inspectConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inspectConfig_ = value;
      } else {
        inspectConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public Builder setInspectConfig(
        com.google.privacy.dlp.v2.InspectConfig.Builder builderForValue) {
      if (inspectConfigBuilder_ == null) {
        inspectConfig_ = builderForValue.build();
      } else {
        inspectConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public Builder mergeInspectConfig(com.google.privacy.dlp.v2.InspectConfig value) {
      if (inspectConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && inspectConfig_ != null
            && inspectConfig_ != com.google.privacy.dlp.v2.InspectConfig.getDefaultInstance()) {
          getInspectConfigBuilder().mergeFrom(value);
        } else {
          inspectConfig_ = value;
        }
      } else {
        inspectConfigBuilder_.mergeFrom(value);
      }
      if (inspectConfig_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public Builder clearInspectConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      inspectConfig_ = null;
      if (inspectConfigBuilder_ != null) {
        inspectConfigBuilder_.dispose();
        inspectConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public com.google.privacy.dlp.v2.InspectConfig.Builder getInspectConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInspectConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder() {
      if (inspectConfigBuilder_ != null) {
        return inspectConfigBuilder_.getMessageOrBuilder();
      } else {
        return inspectConfig_ == null
            ? com.google.privacy.dlp.v2.InspectConfig.getDefaultInstance()
            : inspectConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.InspectConfig,
            com.google.privacy.dlp.v2.InspectConfig.Builder,
            com.google.privacy.dlp.v2.InspectConfigOrBuilder>
        getInspectConfigFieldBuilder() {
      if (inspectConfigBuilder_ == null) {
        inspectConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.InspectConfig,
                com.google.privacy.dlp.v2.InspectConfig.Builder,
                com.google.privacy.dlp.v2.InspectConfigOrBuilder>(
                getInspectConfig(), getParentForChildren(), isClean());
        inspectConfig_ = null;
      }
      return inspectConfigBuilder_;
    }

    private com.google.privacy.dlp.v2.DataProfileJobConfig dataProfileJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DataProfileJobConfig,
            com.google.privacy.dlp.v2.DataProfileJobConfig.Builder,
            com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder>
        dataProfileJobBuilder_;
    /**
     *
     *
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     *
     * @return Whether the dataProfileJob field is set.
     */
    public boolean hasDataProfileJob() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     *
     * @return The dataProfileJob.
     */
    public com.google.privacy.dlp.v2.DataProfileJobConfig getDataProfileJob() {
      if (dataProfileJobBuilder_ == null) {
        return dataProfileJob_ == null
            ? com.google.privacy.dlp.v2.DataProfileJobConfig.getDefaultInstance()
            : dataProfileJob_;
      } else {
        return dataProfileJobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public Builder setDataProfileJob(com.google.privacy.dlp.v2.DataProfileJobConfig value) {
      if (dataProfileJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataProfileJob_ = value;
      } else {
        dataProfileJobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public Builder setDataProfileJob(
        com.google.privacy.dlp.v2.DataProfileJobConfig.Builder builderForValue) {
      if (dataProfileJobBuilder_ == null) {
        dataProfileJob_ = builderForValue.build();
      } else {
        dataProfileJobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public Builder mergeDataProfileJob(com.google.privacy.dlp.v2.DataProfileJobConfig value) {
      if (dataProfileJobBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && dataProfileJob_ != null
            && dataProfileJob_
                != com.google.privacy.dlp.v2.DataProfileJobConfig.getDefaultInstance()) {
          getDataProfileJobBuilder().mergeFrom(value);
        } else {
          dataProfileJob_ = value;
        }
      } else {
        dataProfileJobBuilder_.mergeFrom(value);
      }
      if (dataProfileJob_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public Builder clearDataProfileJob() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataProfileJob_ = null;
      if (dataProfileJobBuilder_ != null) {
        dataProfileJobBuilder_.dispose();
        dataProfileJobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public com.google.privacy.dlp.v2.DataProfileJobConfig.Builder getDataProfileJobBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDataProfileJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder getDataProfileJobOrBuilder() {
      if (dataProfileJobBuilder_ != null) {
        return dataProfileJobBuilder_.getMessageOrBuilder();
      } else {
        return dataProfileJob_ == null
            ? com.google.privacy.dlp.v2.DataProfileJobConfig.getDefaultInstance()
            : dataProfileJob_;
      }
    }
    /**
     *
     *
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DataProfileJobConfig,
            com.google.privacy.dlp.v2.DataProfileJobConfig.Builder,
            com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder>
        getDataProfileJobFieldBuilder() {
      if (dataProfileJobBuilder_ == null) {
        dataProfileJobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.DataProfileJobConfig,
                com.google.privacy.dlp.v2.DataProfileJobConfig.Builder,
                com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder>(
                getDataProfileJob(), getParentForChildren(), isClean());
        dataProfileJob_ = null;
      }
      return dataProfileJobBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DataProfileConfigSnapshot)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DataProfileConfigSnapshot)
  private static final com.google.privacy.dlp.v2.DataProfileConfigSnapshot DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DataProfileConfigSnapshot();
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataProfileConfigSnapshot> PARSER =
      new com.google.protobuf.AbstractParser<DataProfileConfigSnapshot>() {
        @java.lang.Override
        public DataProfileConfigSnapshot parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataProfileConfigSnapshot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataProfileConfigSnapshot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DataProfileConfigSnapshot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
