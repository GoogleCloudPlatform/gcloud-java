/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/batch/v1alpha/volume.proto

package com.google.cloud.batch.v1alpha;

/**
 *
 *
 * <pre>
 * Represents an NFS volume.
 * </pre>
 *
 * Protobuf type {@code google.cloud.batch.v1alpha.NFS}
 */
public final class NFS extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.batch.v1alpha.NFS)
    NFSOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NFS.newBuilder() to construct.
  private NFS(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NFS() {
    server_ = "";
    remotePath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NFS();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.batch.v1alpha.VolumeProto
        .internal_static_google_cloud_batch_v1alpha_NFS_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.batch.v1alpha.VolumeProto
        .internal_static_google_cloud_batch_v1alpha_NFS_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.batch.v1alpha.NFS.class,
            com.google.cloud.batch.v1alpha.NFS.Builder.class);
  }

  public static final int SERVER_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object server_ = "";
  /**
   *
   *
   * <pre>
   * The IP address of the NFS.
   * </pre>
   *
   * <code>string server = 1;</code>
   *
   * @return The server.
   */
  @java.lang.Override
  public java.lang.String getServer() {
    java.lang.Object ref = server_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      server_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The IP address of the NFS.
   * </pre>
   *
   * <code>string server = 1;</code>
   *
   * @return The bytes for server.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServerBytes() {
    java.lang.Object ref = server_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      server_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REMOTE_PATH_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object remotePath_ = "";
  /**
   *
   *
   * <pre>
   * Remote source path exported from the NFS, e.g., "/share".
   * </pre>
   *
   * <code>string remote_path = 2;</code>
   *
   * @return The remotePath.
   */
  @java.lang.Override
  public java.lang.String getRemotePath() {
    java.lang.Object ref = remotePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remotePath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Remote source path exported from the NFS, e.g., "/share".
   * </pre>
   *
   * <code>string remote_path = 2;</code>
   *
   * @return The bytes for remotePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRemotePathBytes() {
    java.lang.Object ref = remotePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      remotePath_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(server_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, server_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remotePath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, remotePath_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(server_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, server_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remotePath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, remotePath_);
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
    if (!(obj instanceof com.google.cloud.batch.v1alpha.NFS)) {
      return super.equals(obj);
    }
    com.google.cloud.batch.v1alpha.NFS other = (com.google.cloud.batch.v1alpha.NFS) obj;

    if (!getServer().equals(other.getServer())) return false;
    if (!getRemotePath().equals(other.getRemotePath())) return false;
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
    hash = (37 * hash) + SERVER_FIELD_NUMBER;
    hash = (53 * hash) + getServer().hashCode();
    hash = (37 * hash) + REMOTE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getRemotePath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.batch.v1alpha.NFS parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1alpha.NFS parseFrom(
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

  public static Builder newBuilder(com.google.cloud.batch.v1alpha.NFS prototype) {
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
   * Represents an NFS volume.
   * </pre>
   *
   * Protobuf type {@code google.cloud.batch.v1alpha.NFS}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.batch.v1alpha.NFS)
      com.google.cloud.batch.v1alpha.NFSOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.batch.v1alpha.VolumeProto
          .internal_static_google_cloud_batch_v1alpha_NFS_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.batch.v1alpha.VolumeProto
          .internal_static_google_cloud_batch_v1alpha_NFS_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.batch.v1alpha.NFS.class,
              com.google.cloud.batch.v1alpha.NFS.Builder.class);
    }

    // Construct using com.google.cloud.batch.v1alpha.NFS.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      server_ = "";
      remotePath_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.batch.v1alpha.VolumeProto
          .internal_static_google_cloud_batch_v1alpha_NFS_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.NFS getDefaultInstanceForType() {
      return com.google.cloud.batch.v1alpha.NFS.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.NFS build() {
      com.google.cloud.batch.v1alpha.NFS result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.NFS buildPartial() {
      com.google.cloud.batch.v1alpha.NFS result = new com.google.cloud.batch.v1alpha.NFS(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.batch.v1alpha.NFS result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.server_ = server_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.remotePath_ = remotePath_;
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
      if (other instanceof com.google.cloud.batch.v1alpha.NFS) {
        return mergeFrom((com.google.cloud.batch.v1alpha.NFS) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.batch.v1alpha.NFS other) {
      if (other == com.google.cloud.batch.v1alpha.NFS.getDefaultInstance()) return this;
      if (!other.getServer().isEmpty()) {
        server_ = other.server_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRemotePath().isEmpty()) {
        remotePath_ = other.remotePath_;
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
                server_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                remotePath_ = input.readStringRequireUtf8();
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

    private java.lang.Object server_ = "";
    /**
     *
     *
     * <pre>
     * The IP address of the NFS.
     * </pre>
     *
     * <code>string server = 1;</code>
     *
     * @return The server.
     */
    public java.lang.String getServer() {
      java.lang.Object ref = server_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        server_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP address of the NFS.
     * </pre>
     *
     * <code>string server = 1;</code>
     *
     * @return The bytes for server.
     */
    public com.google.protobuf.ByteString getServerBytes() {
      java.lang.Object ref = server_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        server_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP address of the NFS.
     * </pre>
     *
     * <code>string server = 1;</code>
     *
     * @param value The server to set.
     * @return This builder for chaining.
     */
    public Builder setServer(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      server_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP address of the NFS.
     * </pre>
     *
     * <code>string server = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServer() {
      server_ = getDefaultInstance().getServer();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP address of the NFS.
     * </pre>
     *
     * <code>string server = 1;</code>
     *
     * @param value The bytes for server to set.
     * @return This builder for chaining.
     */
    public Builder setServerBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      server_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object remotePath_ = "";
    /**
     *
     *
     * <pre>
     * Remote source path exported from the NFS, e.g., "/share".
     * </pre>
     *
     * <code>string remote_path = 2;</code>
     *
     * @return The remotePath.
     */
    public java.lang.String getRemotePath() {
      java.lang.Object ref = remotePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remotePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Remote source path exported from the NFS, e.g., "/share".
     * </pre>
     *
     * <code>string remote_path = 2;</code>
     *
     * @return The bytes for remotePath.
     */
    public com.google.protobuf.ByteString getRemotePathBytes() {
      java.lang.Object ref = remotePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        remotePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Remote source path exported from the NFS, e.g., "/share".
     * </pre>
     *
     * <code>string remote_path = 2;</code>
     *
     * @param value The remotePath to set.
     * @return This builder for chaining.
     */
    public Builder setRemotePath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      remotePath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Remote source path exported from the NFS, e.g., "/share".
     * </pre>
     *
     * <code>string remote_path = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRemotePath() {
      remotePath_ = getDefaultInstance().getRemotePath();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Remote source path exported from the NFS, e.g., "/share".
     * </pre>
     *
     * <code>string remote_path = 2;</code>
     *
     * @param value The bytes for remotePath to set.
     * @return This builder for chaining.
     */
    public Builder setRemotePathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      remotePath_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.batch.v1alpha.NFS)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.batch.v1alpha.NFS)
  private static final com.google.cloud.batch.v1alpha.NFS DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.batch.v1alpha.NFS();
  }

  public static com.google.cloud.batch.v1alpha.NFS getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NFS> PARSER =
      new com.google.protobuf.AbstractParser<NFS>() {
        @java.lang.Override
        public NFS parsePartialFrom(
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

  public static com.google.protobuf.Parser<NFS> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NFS> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.batch.v1alpha.NFS getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
