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
// source: google/cloud/aiplatform/v1beta1/encryption_spec.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Represents a customer-managed encryption key spec that can be applied to
 * a top-level resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.EncryptionSpec}
 */
public final class EncryptionSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.EncryptionSpec)
    EncryptionSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EncryptionSpec.newBuilder() to construct.
  private EncryptionSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EncryptionSpec() {
    kmsKeyName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EncryptionSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto
        .internal_static_google_cloud_aiplatform_v1beta1_EncryptionSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto
        .internal_static_google_cloud_aiplatform_v1beta1_EncryptionSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.EncryptionSpec.class,
            com.google.cloud.aiplatform.v1beta1.EncryptionSpec.Builder.class);
  }

  public static final int KMS_KEY_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object kmsKeyName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The Cloud KMS resource identifier of the customer managed
   * encryption key used to protect a resource. Has the form:
   * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
   * The key needs to be in the same region as where the compute resource is
   * created.
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The Cloud KMS resource identifier of the customer managed
   * encryption key used to protect a resource. Has the form:
   * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
   * The key needs to be in the same region as where the compute resource is
   * created.
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKeyName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kmsKeyName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKeyName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kmsKeyName_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.EncryptionSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.EncryptionSpec other =
        (com.google.cloud.aiplatform.v1beta1.EncryptionSpec) obj;

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
    hash = (37 * hash) + KMS_KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKmsKeyName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.EncryptionSpec prototype) {
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
   * Represents a customer-managed encryption key spec that can be applied to
   * a top-level resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.EncryptionSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.EncryptionSpec)
      com.google.cloud.aiplatform.v1beta1.EncryptionSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto
          .internal_static_google_cloud_aiplatform_v1beta1_EncryptionSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto
          .internal_static_google_cloud_aiplatform_v1beta1_EncryptionSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.EncryptionSpec.class,
              com.google.cloud.aiplatform.v1beta1.EncryptionSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.EncryptionSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      kmsKeyName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto
          .internal_static_google_cloud_aiplatform_v1beta1_EncryptionSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.EncryptionSpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.EncryptionSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.EncryptionSpec build() {
      com.google.cloud.aiplatform.v1beta1.EncryptionSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.EncryptionSpec buildPartial() {
      com.google.cloud.aiplatform.v1beta1.EncryptionSpec result =
          new com.google.cloud.aiplatform.v1beta1.EncryptionSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.EncryptionSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.EncryptionSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.EncryptionSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.EncryptionSpec other) {
      if (other == com.google.cloud.aiplatform.v1beta1.EncryptionSpec.getDefaultInstance())
        return this;
      if (!other.getKmsKeyName().isEmpty()) {
        kmsKeyName_ = other.kmsKeyName_;
        bitField0_ |= 0x00000001;
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
                kmsKeyName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object kmsKeyName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The Cloud KMS resource identifier of the customer managed
     * encryption key used to protect a resource. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * The key needs to be in the same region as where the compute resource is
     * created.
     * </pre>
     *
     * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The Cloud KMS resource identifier of the customer managed
     * encryption key used to protect a resource. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * The key needs to be in the same region as where the compute resource is
     * created.
     * </pre>
     *
     * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The Cloud KMS resource identifier of the customer managed
     * encryption key used to protect a resource. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * The key needs to be in the same region as where the compute resource is
     * created.
     * </pre>
     *
     * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The kmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kmsKeyName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Cloud KMS resource identifier of the customer managed
     * encryption key used to protect a resource. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * The key needs to be in the same region as where the compute resource is
     * created.
     * </pre>
     *
     * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKmsKeyName() {
      kmsKeyName_ = getDefaultInstance().getKmsKeyName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Cloud KMS resource identifier of the customer managed
     * encryption key used to protect a resource. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * The key needs to be in the same region as where the compute resource is
     * created.
     * </pre>
     *
     * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.EncryptionSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.EncryptionSpec)
  private static final com.google.cloud.aiplatform.v1beta1.EncryptionSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.EncryptionSpec();
  }

  public static com.google.cloud.aiplatform.v1beta1.EncryptionSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptionSpec> PARSER =
      new com.google.protobuf.AbstractParser<EncryptionSpec>() {
        @java.lang.Override
        public EncryptionSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<EncryptionSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptionSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.EncryptionSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
