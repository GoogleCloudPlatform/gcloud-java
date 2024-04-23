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
// source: google/cloud/functions/v1/functions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.functions.v1;

/**
 *
 *
 * <pre>
 * Request of `GenerateSourceUploadUrl` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v1.GenerateUploadUrlRequest}
 */
public final class GenerateUploadUrlRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v1.GenerateUploadUrlRequest)
    GenerateUploadUrlRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateUploadUrlRequest.newBuilder() to construct.
  private GenerateUploadUrlRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateUploadUrlRequest() {
    parent_ = "";
    kmsKeyName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateUploadUrlRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.functions.v1.FunctionsProto
        .internal_static_google_cloud_functions_v1_GenerateUploadUrlRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v1.FunctionsProto
        .internal_static_google_cloud_functions_v1_GenerateUploadUrlRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v1.GenerateUploadUrlRequest.class,
            com.google.cloud.functions.v1.GenerateUploadUrlRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * The project and location in which the Google Cloud Storage signed URL
   * should be generated, specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The project and location in which the Google Cloud Storage signed URL
   * should be generated, specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KMS_KEY_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object kmsKeyName_ = "";
  /**
   *
   *
   * <pre>
   * Resource name of a KMS crypto key (managed by the user) used to
   * encrypt/decrypt function source code objects in intermediate Cloud Storage
   * buckets. When you generate an upload url and upload your source code, it
   * gets copied to an intermediate Cloud Storage bucket. The source code is
   * then copied to a versioned directory in the sources bucket in the consumer
   * project during the function deployment.
   *
   * It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   *
   * The Google Cloud Functions service account
   * (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
   * granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter
   * (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
   * Key/KeyRing/Project/Organization (least access preferred). GCF will
   * delegate access to the Google Storage service account in the internal
   * project.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The kmsKeyName.
   */
  @java.lang.Override
  public java.lang.String getKmsKeyName() {
    java.lang.Object ref = kmsKeyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kmsKeyName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of a KMS crypto key (managed by the user) used to
   * encrypt/decrypt function source code objects in intermediate Cloud Storage
   * buckets. When you generate an upload url and upload your source code, it
   * gets copied to an intermediate Cloud Storage bucket. The source code is
   * then copied to a versioned directory in the sources bucket in the consumer
   * project during the function deployment.
   *
   * It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   *
   * The Google Cloud Functions service account
   * (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
   * granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter
   * (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
   * Key/KeyRing/Project/Organization (least access preferred). GCF will
   * delegate access to the Google Storage service account in the internal
   * project.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for kmsKeyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKmsKeyNameBytes() {
    java.lang.Object ref = kmsKeyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kmsKeyName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKeyName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kmsKeyName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKeyName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kmsKeyName_);
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
    if (!(obj instanceof com.google.cloud.functions.v1.GenerateUploadUrlRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v1.GenerateUploadUrlRequest other =
        (com.google.cloud.functions.v1.GenerateUploadUrlRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getKmsKeyName().equals(other.getKmsKeyName())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + KMS_KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKmsKeyName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest parseFrom(
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
      com.google.cloud.functions.v1.GenerateUploadUrlRequest prototype) {
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
   * Request of `GenerateSourceUploadUrl` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v1.GenerateUploadUrlRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v1.GenerateUploadUrlRequest)
      com.google.cloud.functions.v1.GenerateUploadUrlRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.functions.v1.FunctionsProto
          .internal_static_google_cloud_functions_v1_GenerateUploadUrlRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v1.FunctionsProto
          .internal_static_google_cloud_functions_v1_GenerateUploadUrlRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v1.GenerateUploadUrlRequest.class,
              com.google.cloud.functions.v1.GenerateUploadUrlRequest.Builder.class);
    }

    // Construct using com.google.cloud.functions.v1.GenerateUploadUrlRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      kmsKeyName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.functions.v1.FunctionsProto
          .internal_static_google_cloud_functions_v1_GenerateUploadUrlRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.GenerateUploadUrlRequest getDefaultInstanceForType() {
      return com.google.cloud.functions.v1.GenerateUploadUrlRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.GenerateUploadUrlRequest build() {
      com.google.cloud.functions.v1.GenerateUploadUrlRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.GenerateUploadUrlRequest buildPartial() {
      com.google.cloud.functions.v1.GenerateUploadUrlRequest result =
          new com.google.cloud.functions.v1.GenerateUploadUrlRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.functions.v1.GenerateUploadUrlRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.kmsKeyName_ = kmsKeyName_;
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
      if (other instanceof com.google.cloud.functions.v1.GenerateUploadUrlRequest) {
        return mergeFrom((com.google.cloud.functions.v1.GenerateUploadUrlRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v1.GenerateUploadUrlRequest other) {
      if (other == com.google.cloud.functions.v1.GenerateUploadUrlRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getKmsKeyName().isEmpty()) {
        kmsKeyName_ = other.kmsKeyName_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                kmsKeyName_ = input.readStringRequireUtf8();
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * The project and location in which the Google Cloud Storage signed URL
     * should be generated, specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The project and location in which the Google Cloud Storage signed URL
     * should be generated, specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The project and location in which the Google Cloud Storage signed URL
     * should be generated, specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The project and location in which the Google Cloud Storage signed URL
     * should be generated, specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The project and location in which the Google Cloud Storage signed URL
     * should be generated, specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object kmsKeyName_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of a KMS crypto key (managed by the user) used to
     * encrypt/decrypt function source code objects in intermediate Cloud Storage
     * buckets. When you generate an upload url and upload your source code, it
     * gets copied to an intermediate Cloud Storage bucket. The source code is
     * then copied to a versioned directory in the sources bucket in the consumer
     * project during the function deployment.
     *
     * It must match the pattern
     * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
     *
     * The Google Cloud Functions service account
     * (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
     * granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter
     * (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
     * Key/KeyRing/Project/Organization (least access preferred). GCF will
     * delegate access to the Google Storage service account in the internal
     * project.
     * </pre>
     *
     * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The kmsKeyName.
     */
    public java.lang.String getKmsKeyName() {
      java.lang.Object ref = kmsKeyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kmsKeyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of a KMS crypto key (managed by the user) used to
     * encrypt/decrypt function source code objects in intermediate Cloud Storage
     * buckets. When you generate an upload url and upload your source code, it
     * gets copied to an intermediate Cloud Storage bucket. The source code is
     * then copied to a versioned directory in the sources bucket in the consumer
     * project during the function deployment.
     *
     * It must match the pattern
     * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
     *
     * The Google Cloud Functions service account
     * (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
     * granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter
     * (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
     * Key/KeyRing/Project/Organization (least access preferred). GCF will
     * delegate access to the Google Storage service account in the internal
     * project.
     * </pre>
     *
     * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for kmsKeyName.
     */
    public com.google.protobuf.ByteString getKmsKeyNameBytes() {
      java.lang.Object ref = kmsKeyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kmsKeyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of a KMS crypto key (managed by the user) used to
     * encrypt/decrypt function source code objects in intermediate Cloud Storage
     * buckets. When you generate an upload url and upload your source code, it
     * gets copied to an intermediate Cloud Storage bucket. The source code is
     * then copied to a versioned directory in the sources bucket in the consumer
     * project during the function deployment.
     *
     * It must match the pattern
     * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
     *
     * The Google Cloud Functions service account
     * (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
     * granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter
     * (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
     * Key/KeyRing/Project/Organization (least access preferred). GCF will
     * delegate access to the Google Storage service account in the internal
     * project.
     * </pre>
     *
     * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The kmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kmsKeyName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of a KMS crypto key (managed by the user) used to
     * encrypt/decrypt function source code objects in intermediate Cloud Storage
     * buckets. When you generate an upload url and upload your source code, it
     * gets copied to an intermediate Cloud Storage bucket. The source code is
     * then copied to a versioned directory in the sources bucket in the consumer
     * project during the function deployment.
     *
     * It must match the pattern
     * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
     *
     * The Google Cloud Functions service account
     * (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
     * granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter
     * (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
     * Key/KeyRing/Project/Organization (least access preferred). GCF will
     * delegate access to the Google Storage service account in the internal
     * project.
     * </pre>
     *
     * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKmsKeyName() {
      kmsKeyName_ = getDefaultInstance().getKmsKeyName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of a KMS crypto key (managed by the user) used to
     * encrypt/decrypt function source code objects in intermediate Cloud Storage
     * buckets. When you generate an upload url and upload your source code, it
     * gets copied to an intermediate Cloud Storage bucket. The source code is
     * then copied to a versioned directory in the sources bucket in the consumer
     * project during the function deployment.
     *
     * It must match the pattern
     * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
     *
     * The Google Cloud Functions service account
     * (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
     * granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter
     * (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
     * Key/KeyRing/Project/Organization (least access preferred). GCF will
     * delegate access to the Google Storage service account in the internal
     * project.
     * </pre>
     *
     * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for kmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      kmsKeyName_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v1.GenerateUploadUrlRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v1.GenerateUploadUrlRequest)
  private static final com.google.cloud.functions.v1.GenerateUploadUrlRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v1.GenerateUploadUrlRequest();
  }

  public static com.google.cloud.functions.v1.GenerateUploadUrlRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateUploadUrlRequest> PARSER =
      new com.google.protobuf.AbstractParser<GenerateUploadUrlRequest>() {
        @java.lang.Override
        public GenerateUploadUrlRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateUploadUrlRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateUploadUrlRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v1.GenerateUploadUrlRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
