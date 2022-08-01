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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Configuration related to config data encryption.
 * Azure VM bootstrap secret is envelope encrypted with the provided key vault
 * key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AzureConfigEncryption}
 */
public final class AzureConfigEncryption extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AzureConfigEncryption)
    AzureConfigEncryptionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AzureConfigEncryption.newBuilder() to construct.
  private AzureConfigEncryption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AzureConfigEncryption() {
    keyId_ = "";
    publicKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AzureConfigEncryption();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AzureConfigEncryption(
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
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              keyId_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              publicKey_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AzureConfigEncryption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AzureConfigEncryption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AzureConfigEncryption.class,
            com.google.cloud.gkemulticloud.v1.AzureConfigEncryption.Builder.class);
  }

  public static final int KEY_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object keyId_;
  /**
   *
   *
   * <pre>
   * Required. The ARM ID of the Azure Key Vault key to encrypt / decrypt config data.
   * For example:
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;`
   * </pre>
   *
   * <code>string key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The keyId.
   */
  @java.lang.Override
  public java.lang.String getKeyId() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ARM ID of the Azure Key Vault key to encrypt / decrypt config data.
   * For example:
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;`
   * </pre>
   *
   * <code>string key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for keyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyIdBytes() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
  private volatile java.lang.Object publicKey_;
  /**
   *
   *
   * <pre>
   * Optional. RSA key of the Azure Key Vault public key to use for encrypting the data.
   * This key must be formatted as a PEM-encoded SubjectPublicKeyInfo (RFC 5280)
   * in ASN.1 DER form. The string must be comprised of a single PEM block of
   * type "PUBLIC KEY".
   * </pre>
   *
   * <code>string public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The publicKey.
   */
  @java.lang.Override
  public java.lang.String getPublicKey() {
    java.lang.Object ref = publicKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publicKey_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. RSA key of the Azure Key Vault public key to use for encrypting the data.
   * This key must be formatted as a PEM-encoded SubjectPublicKeyInfo (RFC 5280)
   * in ASN.1 DER form. The string must be comprised of a single PEM block of
   * type "PUBLIC KEY".
   * </pre>
   *
   * <code>string public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for publicKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPublicKeyBytes() {
    java.lang.Object ref = publicKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      publicKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, publicKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, publicKey_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AzureConfigEncryption)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AzureConfigEncryption other =
        (com.google.cloud.gkemulticloud.v1.AzureConfigEncryption) obj;

    if (!getKeyId().equals(other.getKeyId())) return false;
    if (!getPublicKey().equals(other.getPublicKey())) return false;
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
    hash = (37 * hash) + KEY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getKeyId().hashCode();
    hash = (37 * hash) + PUBLIC_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPublicKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parseFrom(
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
      com.google.cloud.gkemulticloud.v1.AzureConfigEncryption prototype) {
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
   * Configuration related to config data encryption.
   * Azure VM bootstrap secret is envelope encrypted with the provided key vault
   * key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AzureConfigEncryption}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AzureConfigEncryption)
      com.google.cloud.gkemulticloud.v1.AzureConfigEncryptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureConfigEncryption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureConfigEncryption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AzureConfigEncryption.class,
              com.google.cloud.gkemulticloud.v1.AzureConfigEncryption.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AzureConfigEncryption.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      keyId_ = "";

      publicKey_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureConfigEncryption_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureConfigEncryption getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AzureConfigEncryption.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureConfigEncryption build() {
      com.google.cloud.gkemulticloud.v1.AzureConfigEncryption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureConfigEncryption buildPartial() {
      com.google.cloud.gkemulticloud.v1.AzureConfigEncryption result =
          new com.google.cloud.gkemulticloud.v1.AzureConfigEncryption(this);
      result.keyId_ = keyId_;
      result.publicKey_ = publicKey_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AzureConfigEncryption) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AzureConfigEncryption) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AzureConfigEncryption other) {
      if (other == com.google.cloud.gkemulticloud.v1.AzureConfigEncryption.getDefaultInstance())
        return this;
      if (!other.getKeyId().isEmpty()) {
        keyId_ = other.keyId_;
        onChanged();
      }
      if (!other.getPublicKey().isEmpty()) {
        publicKey_ = other.publicKey_;
        onChanged();
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
      com.google.cloud.gkemulticloud.v1.AzureConfigEncryption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gkemulticloud.v1.AzureConfigEncryption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object keyId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ARM ID of the Azure Key Vault key to encrypt / decrypt config data.
     * For example:
     * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;`
     * </pre>
     *
     * <code>string key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The keyId.
     */
    public java.lang.String getKeyId() {
      java.lang.Object ref = keyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ARM ID of the Azure Key Vault key to encrypt / decrypt config data.
     * For example:
     * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;`
     * </pre>
     *
     * <code>string key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for keyId.
     */
    public com.google.protobuf.ByteString getKeyIdBytes() {
      java.lang.Object ref = keyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ARM ID of the Azure Key Vault key to encrypt / decrypt config data.
     * For example:
     * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;`
     * </pre>
     *
     * <code>string key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      keyId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ARM ID of the Azure Key Vault key to encrypt / decrypt config data.
     * For example:
     * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;`
     * </pre>
     *
     * <code>string key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeyId() {

      keyId_ = getDefaultInstance().getKeyId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ARM ID of the Azure Key Vault key to encrypt / decrypt config data.
     * For example:
     * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;`
     * </pre>
     *
     * <code>string key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      keyId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object publicKey_ = "";
    /**
     *
     *
     * <pre>
     * Optional. RSA key of the Azure Key Vault public key to use for encrypting the data.
     * This key must be formatted as a PEM-encoded SubjectPublicKeyInfo (RFC 5280)
     * in ASN.1 DER form. The string must be comprised of a single PEM block of
     * type "PUBLIC KEY".
     * </pre>
     *
     * <code>string public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The publicKey.
     */
    public java.lang.String getPublicKey() {
      java.lang.Object ref = publicKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publicKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. RSA key of the Azure Key Vault public key to use for encrypting the data.
     * This key must be formatted as a PEM-encoded SubjectPublicKeyInfo (RFC 5280)
     * in ASN.1 DER form. The string must be comprised of a single PEM block of
     * type "PUBLIC KEY".
     * </pre>
     *
     * <code>string public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for publicKey.
     */
    public com.google.protobuf.ByteString getPublicKeyBytes() {
      java.lang.Object ref = publicKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        publicKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. RSA key of the Azure Key Vault public key to use for encrypting the data.
     * This key must be formatted as a PEM-encoded SubjectPublicKeyInfo (RFC 5280)
     * in ASN.1 DER form. The string must be comprised of a single PEM block of
     * type "PUBLIC KEY".
     * </pre>
     *
     * <code>string public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The publicKey to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      publicKey_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. RSA key of the Azure Key Vault public key to use for encrypting the data.
     * This key must be formatted as a PEM-encoded SubjectPublicKeyInfo (RFC 5280)
     * in ASN.1 DER form. The string must be comprised of a single PEM block of
     * type "PUBLIC KEY".
     * </pre>
     *
     * <code>string public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPublicKey() {

      publicKey_ = getDefaultInstance().getPublicKey();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. RSA key of the Azure Key Vault public key to use for encrypting the data.
     * This key must be formatted as a PEM-encoded SubjectPublicKeyInfo (RFC 5280)
     * in ASN.1 DER form. The string must be comprised of a single PEM block of
     * type "PUBLIC KEY".
     * </pre>
     *
     * <code>string public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for publicKey to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      publicKey_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AzureConfigEncryption)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AzureConfigEncryption)
  private static final com.google.cloud.gkemulticloud.v1.AzureConfigEncryption DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AzureConfigEncryption();
  }

  public static com.google.cloud.gkemulticloud.v1.AzureConfigEncryption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AzureConfigEncryption> PARSER =
      new com.google.protobuf.AbstractParser<AzureConfigEncryption>() {
        @java.lang.Override
        public AzureConfigEncryption parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AzureConfigEncryption(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AzureConfigEncryption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AzureConfigEncryption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureConfigEncryption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
