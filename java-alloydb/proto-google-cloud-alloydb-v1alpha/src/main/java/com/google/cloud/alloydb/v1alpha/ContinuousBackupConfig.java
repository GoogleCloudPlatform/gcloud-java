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
// source: google/cloud/alloydb/v1alpha/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.alloydb.v1alpha;

/**
 *
 *
 * <pre>
 * ContinuousBackupConfig describes the continuous backups recovery
 * configurations of a cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.v1alpha.ContinuousBackupConfig}
 */
public final class ContinuousBackupConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.v1alpha.ContinuousBackupConfig)
    ContinuousBackupConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ContinuousBackupConfig.newBuilder() to construct.
  private ContinuousBackupConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ContinuousBackupConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ContinuousBackupConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.v1alpha.ResourcesProto
        .internal_static_google_cloud_alloydb_v1alpha_ContinuousBackupConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.v1alpha.ResourcesProto
        .internal_static_google_cloud_alloydb_v1alpha_ContinuousBackupConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig.class,
            com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;
  /**
   *
   *
   * <pre>
   * Whether ContinuousBackup is enabled.
   * </pre>
   *
   * <code>optional bool enabled = 1;</code>
   *
   * @return Whether the enabled field is set.
   */
  @java.lang.Override
  public boolean hasEnabled() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Whether ContinuousBackup is enabled.
   * </pre>
   *
   * <code>optional bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int RECOVERY_WINDOW_DAYS_FIELD_NUMBER = 4;
  private int recoveryWindowDays_ = 0;
  /**
   *
   *
   * <pre>
   * The number of days that are eligible to restore from using PITR. To support
   * the entire recovery window, backups and logs are retained for one day more
   * than the recovery window. If not set, defaults to 14 days.
   * </pre>
   *
   * <code>int32 recovery_window_days = 4;</code>
   *
   * @return The recoveryWindowDays.
   */
  @java.lang.Override
  public int getRecoveryWindowDays() {
    return recoveryWindowDays_;
  }

  public static final int ENCRYPTION_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.alloydb.v1alpha.EncryptionConfig encryptionConfig_;
  /**
   *
   *
   * <pre>
   * The encryption config can be specified to encrypt the
   * backups with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  @java.lang.Override
  public boolean hasEncryptionConfig() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The encryption config can be specified to encrypt the
   * backups with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
   *
   * @return The encryptionConfig.
   */
  @java.lang.Override
  public com.google.cloud.alloydb.v1alpha.EncryptionConfig getEncryptionConfig() {
    return encryptionConfig_ == null
        ? com.google.cloud.alloydb.v1alpha.EncryptionConfig.getDefaultInstance()
        : encryptionConfig_;
  }
  /**
   *
   *
   * <pre>
   * The encryption config can be specified to encrypt the
   * backups with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.alloydb.v1alpha.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder() {
    return encryptionConfig_ == null
        ? com.google.cloud.alloydb.v1alpha.EncryptionConfig.getDefaultInstance()
        : encryptionConfig_;
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
      output.writeBool(1, enabled_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getEncryptionConfig());
    }
    if (recoveryWindowDays_ != 0) {
      output.writeInt32(4, recoveryWindowDays_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enabled_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getEncryptionConfig());
    }
    if (recoveryWindowDays_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, recoveryWindowDays_);
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
    if (!(obj instanceof com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig other =
        (com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig) obj;

    if (hasEnabled() != other.hasEnabled()) return false;
    if (hasEnabled()) {
      if (getEnabled() != other.getEnabled()) return false;
    }
    if (getRecoveryWindowDays() != other.getRecoveryWindowDays()) return false;
    if (hasEncryptionConfig() != other.hasEncryptionConfig()) return false;
    if (hasEncryptionConfig()) {
      if (!getEncryptionConfig().equals(other.getEncryptionConfig())) return false;
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
    if (hasEnabled()) {
      hash = (37 * hash) + ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    }
    hash = (37 * hash) + RECOVERY_WINDOW_DAYS_FIELD_NUMBER;
    hash = (53 * hash) + getRecoveryWindowDays();
    if (hasEncryptionConfig()) {
      hash = (37 * hash) + ENCRYPTION_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getEncryptionConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig parseFrom(
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
      com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig prototype) {
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
   * ContinuousBackupConfig describes the continuous backups recovery
   * configurations of a cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.v1alpha.ContinuousBackupConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.v1alpha.ContinuousBackupConfig)
      com.google.cloud.alloydb.v1alpha.ContinuousBackupConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.v1alpha.ResourcesProto
          .internal_static_google_cloud_alloydb_v1alpha_ContinuousBackupConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.v1alpha.ResourcesProto
          .internal_static_google_cloud_alloydb_v1alpha_ContinuousBackupConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig.class,
              com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig.Builder.class);
    }

    // Construct using com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEncryptionConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enabled_ = false;
      recoveryWindowDays_ = 0;
      encryptionConfig_ = null;
      if (encryptionConfigBuilder_ != null) {
        encryptionConfigBuilder_.dispose();
        encryptionConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.v1alpha.ResourcesProto
          .internal_static_google_cloud_alloydb_v1alpha_ContinuousBackupConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig getDefaultInstanceForType() {
      return com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig build() {
      com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig buildPartial() {
      com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig result =
          new com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.recoveryWindowDays_ = recoveryWindowDays_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.encryptionConfig_ =
            encryptionConfigBuilder_ == null ? encryptionConfig_ : encryptionConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig) {
        return mergeFrom((com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig other) {
      if (other == com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig.getDefaultInstance())
        return this;
      if (other.hasEnabled()) {
        setEnabled(other.getEnabled());
      }
      if (other.getRecoveryWindowDays() != 0) {
        setRecoveryWindowDays(other.getRecoveryWindowDays());
      }
      if (other.hasEncryptionConfig()) {
        mergeEncryptionConfig(other.getEncryptionConfig());
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
                enabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 26:
              {
                input.readMessage(
                    getEncryptionConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                recoveryWindowDays_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
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

    private boolean enabled_;
    /**
     *
     *
     * <pre>
     * Whether ContinuousBackup is enabled.
     * </pre>
     *
     * <code>optional bool enabled = 1;</code>
     *
     * @return Whether the enabled field is set.
     */
    @java.lang.Override
    public boolean hasEnabled() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Whether ContinuousBackup is enabled.
     * </pre>
     *
     * <code>optional bool enabled = 1;</code>
     *
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     *
     *
     * <pre>
     * Whether ContinuousBackup is enabled.
     * </pre>
     *
     * <code>optional bool enabled = 1;</code>
     *
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether ContinuousBackup is enabled.
     * </pre>
     *
     * <code>optional bool enabled = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private int recoveryWindowDays_;
    /**
     *
     *
     * <pre>
     * The number of days that are eligible to restore from using PITR. To support
     * the entire recovery window, backups and logs are retained for one day more
     * than the recovery window. If not set, defaults to 14 days.
     * </pre>
     *
     * <code>int32 recovery_window_days = 4;</code>
     *
     * @return The recoveryWindowDays.
     */
    @java.lang.Override
    public int getRecoveryWindowDays() {
      return recoveryWindowDays_;
    }
    /**
     *
     *
     * <pre>
     * The number of days that are eligible to restore from using PITR. To support
     * the entire recovery window, backups and logs are retained for one day more
     * than the recovery window. If not set, defaults to 14 days.
     * </pre>
     *
     * <code>int32 recovery_window_days = 4;</code>
     *
     * @param value The recoveryWindowDays to set.
     * @return This builder for chaining.
     */
    public Builder setRecoveryWindowDays(int value) {

      recoveryWindowDays_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of days that are eligible to restore from using PITR. To support
     * the entire recovery window, backups and logs are retained for one day more
     * than the recovery window. If not set, defaults to 14 days.
     * </pre>
     *
     * <code>int32 recovery_window_days = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRecoveryWindowDays() {
      bitField0_ = (bitField0_ & ~0x00000002);
      recoveryWindowDays_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.alloydb.v1alpha.EncryptionConfig encryptionConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.alloydb.v1alpha.EncryptionConfig,
            com.google.cloud.alloydb.v1alpha.EncryptionConfig.Builder,
            com.google.cloud.alloydb.v1alpha.EncryptionConfigOrBuilder>
        encryptionConfigBuilder_;
    /**
     *
     *
     * <pre>
     * The encryption config can be specified to encrypt the
     * backups with a customer-managed encryption key (CMEK). When this field is
     * not specified, the backup will then use default encryption scheme to
     * protect the user data.
     * </pre>
     *
     * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
     *
     * @return Whether the encryptionConfig field is set.
     */
    public boolean hasEncryptionConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The encryption config can be specified to encrypt the
     * backups with a customer-managed encryption key (CMEK). When this field is
     * not specified, the backup will then use default encryption scheme to
     * protect the user data.
     * </pre>
     *
     * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
     *
     * @return The encryptionConfig.
     */
    public com.google.cloud.alloydb.v1alpha.EncryptionConfig getEncryptionConfig() {
      if (encryptionConfigBuilder_ == null) {
        return encryptionConfig_ == null
            ? com.google.cloud.alloydb.v1alpha.EncryptionConfig.getDefaultInstance()
            : encryptionConfig_;
      } else {
        return encryptionConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The encryption config can be specified to encrypt the
     * backups with a customer-managed encryption key (CMEK). When this field is
     * not specified, the backup will then use default encryption scheme to
     * protect the user data.
     * </pre>
     *
     * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
     */
    public Builder setEncryptionConfig(com.google.cloud.alloydb.v1alpha.EncryptionConfig value) {
      if (encryptionConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        encryptionConfig_ = value;
      } else {
        encryptionConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The encryption config can be specified to encrypt the
     * backups with a customer-managed encryption key (CMEK). When this field is
     * not specified, the backup will then use default encryption scheme to
     * protect the user data.
     * </pre>
     *
     * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
     */
    public Builder setEncryptionConfig(
        com.google.cloud.alloydb.v1alpha.EncryptionConfig.Builder builderForValue) {
      if (encryptionConfigBuilder_ == null) {
        encryptionConfig_ = builderForValue.build();
      } else {
        encryptionConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The encryption config can be specified to encrypt the
     * backups with a customer-managed encryption key (CMEK). When this field is
     * not specified, the backup will then use default encryption scheme to
     * protect the user data.
     * </pre>
     *
     * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
     */
    public Builder mergeEncryptionConfig(com.google.cloud.alloydb.v1alpha.EncryptionConfig value) {
      if (encryptionConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && encryptionConfig_ != null
            && encryptionConfig_
                != com.google.cloud.alloydb.v1alpha.EncryptionConfig.getDefaultInstance()) {
          getEncryptionConfigBuilder().mergeFrom(value);
        } else {
          encryptionConfig_ = value;
        }
      } else {
        encryptionConfigBuilder_.mergeFrom(value);
      }
      if (encryptionConfig_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The encryption config can be specified to encrypt the
     * backups with a customer-managed encryption key (CMEK). When this field is
     * not specified, the backup will then use default encryption scheme to
     * protect the user data.
     * </pre>
     *
     * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
     */
    public Builder clearEncryptionConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      encryptionConfig_ = null;
      if (encryptionConfigBuilder_ != null) {
        encryptionConfigBuilder_.dispose();
        encryptionConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The encryption config can be specified to encrypt the
     * backups with a customer-managed encryption key (CMEK). When this field is
     * not specified, the backup will then use default encryption scheme to
     * protect the user data.
     * </pre>
     *
     * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
     */
    public com.google.cloud.alloydb.v1alpha.EncryptionConfig.Builder getEncryptionConfigBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEncryptionConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The encryption config can be specified to encrypt the
     * backups with a customer-managed encryption key (CMEK). When this field is
     * not specified, the backup will then use default encryption scheme to
     * protect the user data.
     * </pre>
     *
     * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
     */
    public com.google.cloud.alloydb.v1alpha.EncryptionConfigOrBuilder
        getEncryptionConfigOrBuilder() {
      if (encryptionConfigBuilder_ != null) {
        return encryptionConfigBuilder_.getMessageOrBuilder();
      } else {
        return encryptionConfig_ == null
            ? com.google.cloud.alloydb.v1alpha.EncryptionConfig.getDefaultInstance()
            : encryptionConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * The encryption config can be specified to encrypt the
     * backups with a customer-managed encryption key (CMEK). When this field is
     * not specified, the backup will then use default encryption scheme to
     * protect the user data.
     * </pre>
     *
     * <code>.google.cloud.alloydb.v1alpha.EncryptionConfig encryption_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.alloydb.v1alpha.EncryptionConfig,
            com.google.cloud.alloydb.v1alpha.EncryptionConfig.Builder,
            com.google.cloud.alloydb.v1alpha.EncryptionConfigOrBuilder>
        getEncryptionConfigFieldBuilder() {
      if (encryptionConfigBuilder_ == null) {
        encryptionConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.alloydb.v1alpha.EncryptionConfig,
                com.google.cloud.alloydb.v1alpha.EncryptionConfig.Builder,
                com.google.cloud.alloydb.v1alpha.EncryptionConfigOrBuilder>(
                getEncryptionConfig(), getParentForChildren(), isClean());
        encryptionConfig_ = null;
      }
      return encryptionConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.v1alpha.ContinuousBackupConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.v1alpha.ContinuousBackupConfig)
  private static final com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig();
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContinuousBackupConfig> PARSER =
      new com.google.protobuf.AbstractParser<ContinuousBackupConfig>() {
        @java.lang.Override
        public ContinuousBackupConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContinuousBackupConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContinuousBackupConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.v1alpha.ContinuousBackupConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
