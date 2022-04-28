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
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * A [Digest][google.cloud.kms.v1.Digest] holds a cryptographic message digest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.Digest}
 */
public final class Digest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.Digest)
    DigestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Digest.newBuilder() to construct.
  private Digest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Digest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Digest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Digest(
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
          case 10:
            {
              digest_ = input.readBytes();
              digestCase_ = 1;
              break;
            }
          case 18:
            {
              digest_ = input.readBytes();
              digestCase_ = 2;
              break;
            }
          case 26:
            {
              digest_ = input.readBytes();
              digestCase_ = 3;
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
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_Digest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_Digest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.Digest.class, com.google.cloud.kms.v1.Digest.Builder.class);
  }

  private int digestCase_ = 0;
  private java.lang.Object digest_;

  public enum DigestCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SHA256(1),
    SHA384(2),
    SHA512(3),
    DIGEST_NOT_SET(0);
    private final int value;

    private DigestCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DigestCase valueOf(int value) {
      return forNumber(value);
    }

    public static DigestCase forNumber(int value) {
      switch (value) {
        case 1:
          return SHA256;
        case 2:
          return SHA384;
        case 3:
          return SHA512;
        case 0:
          return DIGEST_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DigestCase getDigestCase() {
    return DigestCase.forNumber(digestCase_);
  }

  public static final int SHA256_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * A message digest produced with the SHA-256 algorithm.
   * </pre>
   *
   * <code>bytes sha256 = 1;</code>
   *
   * @return Whether the sha256 field is set.
   */
  @java.lang.Override
  public boolean hasSha256() {
    return digestCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * A message digest produced with the SHA-256 algorithm.
   * </pre>
   *
   * <code>bytes sha256 = 1;</code>
   *
   * @return The sha256.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSha256() {
    if (digestCase_ == 1) {
      return (com.google.protobuf.ByteString) digest_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int SHA384_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * A message digest produced with the SHA-384 algorithm.
   * </pre>
   *
   * <code>bytes sha384 = 2;</code>
   *
   * @return Whether the sha384 field is set.
   */
  @java.lang.Override
  public boolean hasSha384() {
    return digestCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * A message digest produced with the SHA-384 algorithm.
   * </pre>
   *
   * <code>bytes sha384 = 2;</code>
   *
   * @return The sha384.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSha384() {
    if (digestCase_ == 2) {
      return (com.google.protobuf.ByteString) digest_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int SHA512_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * A message digest produced with the SHA-512 algorithm.
   * </pre>
   *
   * <code>bytes sha512 = 3;</code>
   *
   * @return Whether the sha512 field is set.
   */
  @java.lang.Override
  public boolean hasSha512() {
    return digestCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * A message digest produced with the SHA-512 algorithm.
   * </pre>
   *
   * <code>bytes sha512 = 3;</code>
   *
   * @return The sha512.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSha512() {
    if (digestCase_ == 3) {
      return (com.google.protobuf.ByteString) digest_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (digestCase_ == 1) {
      output.writeBytes(1, (com.google.protobuf.ByteString) digest_);
    }
    if (digestCase_ == 2) {
      output.writeBytes(2, (com.google.protobuf.ByteString) digest_);
    }
    if (digestCase_ == 3) {
      output.writeBytes(3, (com.google.protobuf.ByteString) digest_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (digestCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              1, (com.google.protobuf.ByteString) digest_);
    }
    if (digestCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              2, (com.google.protobuf.ByteString) digest_);
    }
    if (digestCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              3, (com.google.protobuf.ByteString) digest_);
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
    if (!(obj instanceof com.google.cloud.kms.v1.Digest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.Digest other = (com.google.cloud.kms.v1.Digest) obj;

    if (!getDigestCase().equals(other.getDigestCase())) return false;
    switch (digestCase_) {
      case 1:
        if (!getSha256().equals(other.getSha256())) return false;
        break;
      case 2:
        if (!getSha384().equals(other.getSha384())) return false;
        break;
      case 3:
        if (!getSha512().equals(other.getSha512())) return false;
        break;
      case 0:
      default:
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
    switch (digestCase_) {
      case 1:
        hash = (37 * hash) + SHA256_FIELD_NUMBER;
        hash = (53 * hash) + getSha256().hashCode();
        break;
      case 2:
        hash = (37 * hash) + SHA384_FIELD_NUMBER;
        hash = (53 * hash) + getSha384().hashCode();
        break;
      case 3:
        hash = (37 * hash) + SHA512_FIELD_NUMBER;
        hash = (53 * hash) + getSha512().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.Digest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.Digest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.Digest parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.Digest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.Digest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.Digest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.Digest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.Digest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.Digest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.Digest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.Digest parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.Digest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.kms.v1.Digest prototype) {
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
   * A [Digest][google.cloud.kms.v1.Digest] holds a cryptographic message digest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.Digest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.Digest)
      com.google.cloud.kms.v1.DigestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_Digest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_Digest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.Digest.class, com.google.cloud.kms.v1.Digest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.Digest.newBuilder()
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
      digestCase_ = 0;
      digest_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_Digest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.Digest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.Digest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.Digest build() {
      com.google.cloud.kms.v1.Digest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.Digest buildPartial() {
      com.google.cloud.kms.v1.Digest result = new com.google.cloud.kms.v1.Digest(this);
      if (digestCase_ == 1) {
        result.digest_ = digest_;
      }
      if (digestCase_ == 2) {
        result.digest_ = digest_;
      }
      if (digestCase_ == 3) {
        result.digest_ = digest_;
      }
      result.digestCase_ = digestCase_;
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
      if (other instanceof com.google.cloud.kms.v1.Digest) {
        return mergeFrom((com.google.cloud.kms.v1.Digest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.Digest other) {
      if (other == com.google.cloud.kms.v1.Digest.getDefaultInstance()) return this;
      switch (other.getDigestCase()) {
        case SHA256:
          {
            setSha256(other.getSha256());
            break;
          }
        case SHA384:
          {
            setSha384(other.getSha384());
            break;
          }
        case SHA512:
          {
            setSha512(other.getSha512());
            break;
          }
        case DIGEST_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.kms.v1.Digest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.Digest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int digestCase_ = 0;
    private java.lang.Object digest_;

    public DigestCase getDigestCase() {
      return DigestCase.forNumber(digestCase_);
    }

    public Builder clearDigest() {
      digestCase_ = 0;
      digest_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-256 algorithm.
     * </pre>
     *
     * <code>bytes sha256 = 1;</code>
     *
     * @return Whether the sha256 field is set.
     */
    public boolean hasSha256() {
      return digestCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-256 algorithm.
     * </pre>
     *
     * <code>bytes sha256 = 1;</code>
     *
     * @return The sha256.
     */
    public com.google.protobuf.ByteString getSha256() {
      if (digestCase_ == 1) {
        return (com.google.protobuf.ByteString) digest_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-256 algorithm.
     * </pre>
     *
     * <code>bytes sha256 = 1;</code>
     *
     * @param value The sha256 to set.
     * @return This builder for chaining.
     */
    public Builder setSha256(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      digestCase_ = 1;
      digest_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-256 algorithm.
     * </pre>
     *
     * <code>bytes sha256 = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSha256() {
      if (digestCase_ == 1) {
        digestCase_ = 0;
        digest_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-384 algorithm.
     * </pre>
     *
     * <code>bytes sha384 = 2;</code>
     *
     * @return Whether the sha384 field is set.
     */
    public boolean hasSha384() {
      return digestCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-384 algorithm.
     * </pre>
     *
     * <code>bytes sha384 = 2;</code>
     *
     * @return The sha384.
     */
    public com.google.protobuf.ByteString getSha384() {
      if (digestCase_ == 2) {
        return (com.google.protobuf.ByteString) digest_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-384 algorithm.
     * </pre>
     *
     * <code>bytes sha384 = 2;</code>
     *
     * @param value The sha384 to set.
     * @return This builder for chaining.
     */
    public Builder setSha384(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      digestCase_ = 2;
      digest_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-384 algorithm.
     * </pre>
     *
     * <code>bytes sha384 = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSha384() {
      if (digestCase_ == 2) {
        digestCase_ = 0;
        digest_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-512 algorithm.
     * </pre>
     *
     * <code>bytes sha512 = 3;</code>
     *
     * @return Whether the sha512 field is set.
     */
    public boolean hasSha512() {
      return digestCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-512 algorithm.
     * </pre>
     *
     * <code>bytes sha512 = 3;</code>
     *
     * @return The sha512.
     */
    public com.google.protobuf.ByteString getSha512() {
      if (digestCase_ == 3) {
        return (com.google.protobuf.ByteString) digest_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-512 algorithm.
     * </pre>
     *
     * <code>bytes sha512 = 3;</code>
     *
     * @param value The sha512 to set.
     * @return This builder for chaining.
     */
    public Builder setSha512(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      digestCase_ = 3;
      digest_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A message digest produced with the SHA-512 algorithm.
     * </pre>
     *
     * <code>bytes sha512 = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSha512() {
      if (digestCase_ == 3) {
        digestCase_ = 0;
        digest_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.Digest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.Digest)
  private static final com.google.cloud.kms.v1.Digest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.Digest();
  }

  public static com.google.cloud.kms.v1.Digest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Digest> PARSER =
      new com.google.protobuf.AbstractParser<Digest>() {
        @java.lang.Override
        public Digest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Digest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Digest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Digest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.Digest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
