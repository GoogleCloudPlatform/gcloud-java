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
// source: google/cloud/alloydb/v1alpha/gemini.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1alpha;

/**
 *
 *
 * <pre>
 * Instance level configuration parameters related to the Gemini in Databases
 * add-on.
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.v1alpha.GeminiInstanceConfig}
 */
public final class GeminiInstanceConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.v1alpha.GeminiInstanceConfig)
    GeminiInstanceConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GeminiInstanceConfig.newBuilder() to construct.
  private GeminiInstanceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GeminiInstanceConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GeminiInstanceConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.v1alpha.GeminiProto
        .internal_static_google_cloud_alloydb_v1alpha_GeminiInstanceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.v1alpha.GeminiProto
        .internal_static_google_cloud_alloydb_v1alpha_GeminiInstanceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig.class,
            com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig.Builder.class);
  }

  public static final int ENTITLED_FIELD_NUMBER = 1;
  private boolean entitled_ = false;
  /**
   *
   *
   * <pre>
   * Output only. Whether the Gemini in Databases add-on is enabled for the
   * instance. It will be true only if the add-on has been enabled for the
   * billing account corresponding to the instance. Its status is toggled from
   * the Admin Control Center (ACC) and cannot be toggled using AlloyDB's APIs.
   * </pre>
   *
   * <code>bool entitled = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The entitled.
   */
  @java.lang.Override
  public boolean getEntitled() {
    return entitled_;
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
    if (entitled_ != false) {
      output.writeBool(1, entitled_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entitled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, entitled_);
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
    if (!(obj instanceof com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig other =
        (com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig) obj;

    if (getEntitled() != other.getEntitled()) return false;
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
    hash = (37 * hash) + ENTITLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEntitled());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig parseFrom(
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
      com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig prototype) {
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
   * Instance level configuration parameters related to the Gemini in Databases
   * add-on.
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.v1alpha.GeminiInstanceConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.v1alpha.GeminiInstanceConfig)
      com.google.cloud.alloydb.v1alpha.GeminiInstanceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.v1alpha.GeminiProto
          .internal_static_google_cloud_alloydb_v1alpha_GeminiInstanceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.v1alpha.GeminiProto
          .internal_static_google_cloud_alloydb_v1alpha_GeminiInstanceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig.class,
              com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig.Builder.class);
    }

    // Construct using com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      entitled_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.v1alpha.GeminiProto
          .internal_static_google_cloud_alloydb_v1alpha_GeminiInstanceConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig getDefaultInstanceForType() {
      return com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig build() {
      com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig buildPartial() {
      com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig result =
          new com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entitled_ = entitled_;
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
      if (other instanceof com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig) {
        return mergeFrom((com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig other) {
      if (other == com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig.getDefaultInstance())
        return this;
      if (other.getEntitled() != false) {
        setEntitled(other.getEntitled());
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
                entitled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private boolean entitled_;
    /**
     *
     *
     * <pre>
     * Output only. Whether the Gemini in Databases add-on is enabled for the
     * instance. It will be true only if the add-on has been enabled for the
     * billing account corresponding to the instance. Its status is toggled from
     * the Admin Control Center (ACC) and cannot be toggled using AlloyDB's APIs.
     * </pre>
     *
     * <code>bool entitled = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The entitled.
     */
    @java.lang.Override
    public boolean getEntitled() {
      return entitled_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Whether the Gemini in Databases add-on is enabled for the
     * instance. It will be true only if the add-on has been enabled for the
     * billing account corresponding to the instance. Its status is toggled from
     * the Admin Control Center (ACC) and cannot be toggled using AlloyDB's APIs.
     * </pre>
     *
     * <code>bool entitled = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The entitled to set.
     * @return This builder for chaining.
     */
    public Builder setEntitled(boolean value) {

      entitled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Whether the Gemini in Databases add-on is enabled for the
     * instance. It will be true only if the add-on has been enabled for the
     * billing account corresponding to the instance. Its status is toggled from
     * the Admin Control Center (ACC) and cannot be toggled using AlloyDB's APIs.
     * </pre>
     *
     * <code>bool entitled = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntitled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      entitled_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.v1alpha.GeminiInstanceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.v1alpha.GeminiInstanceConfig)
  private static final com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig();
  }

  public static com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeminiInstanceConfig> PARSER =
      new com.google.protobuf.AbstractParser<GeminiInstanceConfig>() {
        @java.lang.Override
        public GeminiInstanceConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<GeminiInstanceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GeminiInstanceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.v1alpha.GeminiInstanceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
