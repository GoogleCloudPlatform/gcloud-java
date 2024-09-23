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
// source: google/devtools/containeranalysis/v1beta1/common/common.proto

// Protobuf Java Version: 3.25.4
package io.grafeas.v1beta1.common;

/**
 *
 *
 * <pre>
 * Verifiers (e.g. Kritis implementations) MUST verify signatures
 * with respect to the trust anchors defined in policy (e.g. a Kritis policy).
 * Typically this means that the verifier has been configured with a map from
 * `public_key_id` to public key material (and any required parameters, e.g.
 * signing algorithm).
 *
 * In particular, verification implementations MUST NOT treat the signature
 * `public_key_id` as anything more than a key lookup hint. The `public_key_id`
 * DOES NOT validate or authenticate a public key; it only provides a mechanism
 * for quickly selecting a public key ALREADY CONFIGURED on the verifier through
 * a trusted channel. Verification implementations MUST reject signatures in any
 * of the following circumstances:
 *   * The `public_key_id` is not recognized by the verifier.
 *   * The public key that `public_key_id` refers to does not verify the
 *     signature with respect to the payload.
 *
 * The `signature` contents SHOULD NOT be "attached" (where the payload is
 * included with the serialized `signature` bytes). Verifiers MUST ignore any
 * "attached" payload and only verify signatures with respect to explicitly
 * provided payload (e.g. a `payload` field on the proto message that holds
 * this Signature, or the canonical serialization of the proto message that
 * holds this signature).
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.Signature}
 */
public final class Signature extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.Signature)
    SignatureOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Signature.newBuilder() to construct.
  private Signature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Signature() {
    signature_ = com.google.protobuf.ByteString.EMPTY;
    publicKeyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Signature();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.common.Common.internal_static_grafeas_v1beta1_Signature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.common.Common
        .internal_static_grafeas_v1beta1_Signature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.common.Signature.class,
            io.grafeas.v1beta1.common.Signature.Builder.class);
  }

  public static final int SIGNATURE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * The content of the signature, an opaque bytestring.
   * The payload that this signature verifies MUST be unambiguously provided
   * with the Signature during verification. A wrapper message might provide
   * the payload explicitly. Alternatively, a message might have a canonical
   * serialization that can always be unambiguously computed to derive the
   * payload.
   * </pre>
   *
   * <code>bytes signature = 1;</code>
   *
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  public static final int PUBLIC_KEY_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object publicKeyId_ = "";
  /**
   *
   *
   * <pre>
   * The identifier for the public key that verifies this signature.
   *   * The `public_key_id` is required.
   *   * The `public_key_id` MUST be an RFC3986 conformant URI.
   *   * When possible, the `public_key_id` SHOULD be an immutable reference,
   *     such as a cryptographic digest.
   *
   * Examples of valid `public_key_id`s:
   *
   * OpenPGP V4 public key fingerprint:
   *   * "openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA"
   * See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more
   * details on this scheme.
   *
   * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER
   * serialization):
   *   * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
   *   * "nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5"
   * </pre>
   *
   * <code>string public_key_id = 2;</code>
   *
   * @return The publicKeyId.
   */
  @java.lang.Override
  public java.lang.String getPublicKeyId() {
    java.lang.Object ref = publicKeyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publicKeyId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The identifier for the public key that verifies this signature.
   *   * The `public_key_id` is required.
   *   * The `public_key_id` MUST be an RFC3986 conformant URI.
   *   * When possible, the `public_key_id` SHOULD be an immutable reference,
   *     such as a cryptographic digest.
   *
   * Examples of valid `public_key_id`s:
   *
   * OpenPGP V4 public key fingerprint:
   *   * "openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA"
   * See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more
   * details on this scheme.
   *
   * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER
   * serialization):
   *   * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
   *   * "nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5"
   * </pre>
   *
   * <code>string public_key_id = 2;</code>
   *
   * @return The bytes for publicKeyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPublicKeyIdBytes() {
    java.lang.Object ref = publicKeyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      publicKeyId_ = b;
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
    if (!signature_.isEmpty()) {
      output.writeBytes(1, signature_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicKeyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, publicKeyId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, signature_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicKeyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, publicKeyId_);
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
    if (!(obj instanceof io.grafeas.v1beta1.common.Signature)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.common.Signature other = (io.grafeas.v1beta1.common.Signature) obj;

    if (!getSignature().equals(other.getSignature())) return false;
    if (!getPublicKeyId().equals(other.getPublicKeyId())) return false;
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
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (37 * hash) + PUBLIC_KEY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPublicKeyId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.common.Signature parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.common.Signature parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.common.Signature parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.common.Signature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.common.Signature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.common.Signature parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.common.Signature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.common.Signature parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.common.Signature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.common.Signature parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.common.Signature parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.common.Signature parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.common.Signature prototype) {
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
   * Verifiers (e.g. Kritis implementations) MUST verify signatures
   * with respect to the trust anchors defined in policy (e.g. a Kritis policy).
   * Typically this means that the verifier has been configured with a map from
   * `public_key_id` to public key material (and any required parameters, e.g.
   * signing algorithm).
   *
   * In particular, verification implementations MUST NOT treat the signature
   * `public_key_id` as anything more than a key lookup hint. The `public_key_id`
   * DOES NOT validate or authenticate a public key; it only provides a mechanism
   * for quickly selecting a public key ALREADY CONFIGURED on the verifier through
   * a trusted channel. Verification implementations MUST reject signatures in any
   * of the following circumstances:
   *   * The `public_key_id` is not recognized by the verifier.
   *   * The public key that `public_key_id` refers to does not verify the
   *     signature with respect to the payload.
   *
   * The `signature` contents SHOULD NOT be "attached" (where the payload is
   * included with the serialized `signature` bytes). Verifiers MUST ignore any
   * "attached" payload and only verify signatures with respect to explicitly
   * provided payload (e.g. a `payload` field on the proto message that holds
   * this Signature, or the canonical serialization of the proto message that
   * holds this signature).
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.Signature}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.Signature)
      io.grafeas.v1beta1.common.SignatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.common.Common.internal_static_grafeas_v1beta1_Signature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.common.Common
          .internal_static_grafeas_v1beta1_Signature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.common.Signature.class,
              io.grafeas.v1beta1.common.Signature.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.common.Signature.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      signature_ = com.google.protobuf.ByteString.EMPTY;
      publicKeyId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.common.Common.internal_static_grafeas_v1beta1_Signature_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.common.Signature getDefaultInstanceForType() {
      return io.grafeas.v1beta1.common.Signature.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.common.Signature build() {
      io.grafeas.v1beta1.common.Signature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.common.Signature buildPartial() {
      io.grafeas.v1beta1.common.Signature result = new io.grafeas.v1beta1.common.Signature(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1beta1.common.Signature result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.signature_ = signature_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.publicKeyId_ = publicKeyId_;
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
      if (other instanceof io.grafeas.v1beta1.common.Signature) {
        return mergeFrom((io.grafeas.v1beta1.common.Signature) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.common.Signature other) {
      if (other == io.grafeas.v1beta1.common.Signature.getDefaultInstance()) return this;
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      if (!other.getPublicKeyId().isEmpty()) {
        publicKeyId_ = other.publicKeyId_;
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
                signature_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                publicKeyId_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The content of the signature, an opaque bytestring.
     * The payload that this signature verifies MUST be unambiguously provided
     * with the Signature during verification. A wrapper message might provide
     * the payload explicitly. Alternatively, a message might have a canonical
     * serialization that can always be unambiguously computed to derive the
     * payload.
     * </pre>
     *
     * <code>bytes signature = 1;</code>
     *
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     *
     *
     * <pre>
     * The content of the signature, an opaque bytestring.
     * The payload that this signature verifies MUST be unambiguously provided
     * with the Signature during verification. A wrapper message might provide
     * the payload explicitly. Alternatively, a message might have a canonical
     * serialization that can always be unambiguously computed to derive the
     * payload.
     * </pre>
     *
     * <code>bytes signature = 1;</code>
     *
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      signature_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The content of the signature, an opaque bytestring.
     * The payload that this signature verifies MUST be unambiguously provided
     * with the Signature during verification. A wrapper message might provide
     * the payload explicitly. Alternatively, a message might have a canonical
     * serialization that can always be unambiguously computed to derive the
     * payload.
     * </pre>
     *
     * <code>bytes signature = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000001);
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    private java.lang.Object publicKeyId_ = "";
    /**
     *
     *
     * <pre>
     * The identifier for the public key that verifies this signature.
     *   * The `public_key_id` is required.
     *   * The `public_key_id` MUST be an RFC3986 conformant URI.
     *   * When possible, the `public_key_id` SHOULD be an immutable reference,
     *     such as a cryptographic digest.
     *
     * Examples of valid `public_key_id`s:
     *
     * OpenPGP V4 public key fingerprint:
     *   * "openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA"
     * See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more
     * details on this scheme.
     *
     * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER
     * serialization):
     *   * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
     *   * "nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5"
     * </pre>
     *
     * <code>string public_key_id = 2;</code>
     *
     * @return The publicKeyId.
     */
    public java.lang.String getPublicKeyId() {
      java.lang.Object ref = publicKeyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publicKeyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The identifier for the public key that verifies this signature.
     *   * The `public_key_id` is required.
     *   * The `public_key_id` MUST be an RFC3986 conformant URI.
     *   * When possible, the `public_key_id` SHOULD be an immutable reference,
     *     such as a cryptographic digest.
     *
     * Examples of valid `public_key_id`s:
     *
     * OpenPGP V4 public key fingerprint:
     *   * "openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA"
     * See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more
     * details on this scheme.
     *
     * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER
     * serialization):
     *   * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
     *   * "nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5"
     * </pre>
     *
     * <code>string public_key_id = 2;</code>
     *
     * @return The bytes for publicKeyId.
     */
    public com.google.protobuf.ByteString getPublicKeyIdBytes() {
      java.lang.Object ref = publicKeyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        publicKeyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The identifier for the public key that verifies this signature.
     *   * The `public_key_id` is required.
     *   * The `public_key_id` MUST be an RFC3986 conformant URI.
     *   * When possible, the `public_key_id` SHOULD be an immutable reference,
     *     such as a cryptographic digest.
     *
     * Examples of valid `public_key_id`s:
     *
     * OpenPGP V4 public key fingerprint:
     *   * "openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA"
     * See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more
     * details on this scheme.
     *
     * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER
     * serialization):
     *   * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
     *   * "nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5"
     * </pre>
     *
     * <code>string public_key_id = 2;</code>
     *
     * @param value The publicKeyId to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKeyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      publicKeyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The identifier for the public key that verifies this signature.
     *   * The `public_key_id` is required.
     *   * The `public_key_id` MUST be an RFC3986 conformant URI.
     *   * When possible, the `public_key_id` SHOULD be an immutable reference,
     *     such as a cryptographic digest.
     *
     * Examples of valid `public_key_id`s:
     *
     * OpenPGP V4 public key fingerprint:
     *   * "openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA"
     * See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more
     * details on this scheme.
     *
     * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER
     * serialization):
     *   * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
     *   * "nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5"
     * </pre>
     *
     * <code>string public_key_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPublicKeyId() {
      publicKeyId_ = getDefaultInstance().getPublicKeyId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The identifier for the public key that verifies this signature.
     *   * The `public_key_id` is required.
     *   * The `public_key_id` MUST be an RFC3986 conformant URI.
     *   * When possible, the `public_key_id` SHOULD be an immutable reference,
     *     such as a cryptographic digest.
     *
     * Examples of valid `public_key_id`s:
     *
     * OpenPGP V4 public key fingerprint:
     *   * "openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA"
     * See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more
     * details on this scheme.
     *
     * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER
     * serialization):
     *   * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
     *   * "nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5"
     * </pre>
     *
     * <code>string public_key_id = 2;</code>
     *
     * @param value The bytes for publicKeyId to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKeyIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      publicKeyId_ = value;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.Signature)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.Signature)
  private static final io.grafeas.v1beta1.common.Signature DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.common.Signature();
  }

  public static io.grafeas.v1beta1.common.Signature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Signature> PARSER =
      new com.google.protobuf.AbstractParser<Signature>() {
        @java.lang.Override
        public Signature parsePartialFrom(
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

  public static com.google.protobuf.Parser<Signature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Signature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.common.Signature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
